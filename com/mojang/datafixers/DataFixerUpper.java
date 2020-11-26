/*     */ package com.mojang.datafixers;
/*     */ 
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.functions.PointFreeRule;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntSortedSet;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DataFixerUpper
/*     */   implements DataFixer
/*     */ {
/*     */   public static boolean ERRORS_ARE_FATAL = false;
/*  43 */   private static final Logger LOGGER = LogManager.getLogger();
/*     */   static {
/*  45 */     OPTIMIZATION_RULE = DataFixUtils.<PointFreeRule>make(() -> {
/*     */           PointFreeRule opSimple = PointFreeRule.orElse(PointFreeRule.orElse((PointFreeRule)PointFreeRule.CataFuseSame.INSTANCE, PointFreeRule.orElse((PointFreeRule)PointFreeRule.CataFuseDifferent.INSTANCE, (PointFreeRule)PointFreeRule.LensAppId.INSTANCE)), PointFreeRule.orElse((PointFreeRule)PointFreeRule.LensComp.INSTANCE, PointFreeRule.orElse((PointFreeRule)PointFreeRule.AppNest.INSTANCE, (PointFreeRule)PointFreeRule.LensCompFunc.INSTANCE)));
/*     */           PointFreeRule opLeft = PointFreeRule.many(PointFreeRule.once(PointFreeRule.orElse(opSimple, (PointFreeRule)PointFreeRule.CompAssocLeft.INSTANCE)));
/*     */           PointFreeRule opComp = PointFreeRule.many(PointFreeRule.once(PointFreeRule.orElse((PointFreeRule)PointFreeRule.SortInj.INSTANCE, (PointFreeRule)PointFreeRule.SortProj.INSTANCE)));
/*     */           PointFreeRule opRight = PointFreeRule.many(PointFreeRule.once(PointFreeRule.orElse(opSimple, (PointFreeRule)PointFreeRule.CompAssocRight.INSTANCE)));
/*     */           return PointFreeRule.seq((List)ImmutableList.of((), (), (), (), ()));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static final PointFreeRule OPTIMIZATION_RULE;
/*     */ 
/*     */ 
/*     */   
/*     */   private final Int2ObjectSortedMap<Schema> schemas;
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<DataFix> globalList;
/*     */ 
/*     */   
/*     */   private final IntSortedSet fixerVersions;
/*     */ 
/*     */   
/*  71 */   private final Long2ObjectMap<TypeRewriteRule> rules = Long2ObjectMaps.synchronize((Long2ObjectMap)new Long2ObjectOpenHashMap());
/*     */   
/*     */   protected DataFixerUpper(Int2ObjectSortedMap<Schema> schemas, List<DataFix> globalList, IntSortedSet fixerVersions) {
/*  74 */     this.schemas = schemas;
/*  75 */     this.globalList = globalList;
/*  76 */     this.fixerVersions = fixerVersions;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> Dynamic<T> update(DSL.TypeReference type, Dynamic<T> input, int version, int newVersion) {
/*     */     try {
/*  82 */       if (version < newVersion) {
/*  83 */         Type<?> dataType = getType(type, version);
/*  84 */         Optional<T> read = dataType.readAndWrite(input.getOps(), getType(type, newVersion), getRule(version, newVersion), OPTIMIZATION_RULE, input.getValue());
/*  85 */         if (!read.isPresent()) {
/*  86 */           throw new IllegalStateException("Could not parse for fixing " + dataType);
/*     */         }
/*     */         
/*  89 */         return new Dynamic<>(input.getOps(), read.get());
/*     */       } 
/*  91 */     } catch (Throwable t) {
/*  92 */       LOGGER.error("Something went wrong upgrading!", t);
/*     */     } 
/*  94 */     return input;
/*     */   }
/*     */ 
/*     */   
/*     */   public Schema getSchema(int key) {
/*  99 */     return (Schema)this.schemas.get(getLowestSchemaSameVersion(this.schemas, key));
/*     */   }
/*     */   
/*     */   protected Type<?> getType(DSL.TypeReference type, int version) {
/* 103 */     return getSchema(DataFixUtils.makeKey(version)).getType(type);
/*     */   }
/*     */   
/*     */   protected static int getLowestSchemaSameVersion(Int2ObjectSortedMap<Schema> schemas, int versionKey) {
/* 107 */     if (versionKey < schemas.firstIntKey())
/*     */     {
/* 109 */       return schemas.firstIntKey();
/*     */     }
/* 111 */     return schemas.subMap(0, versionKey + 1).lastIntKey();
/*     */   }
/*     */   
/*     */   private int getLowestFixSameVersion(int versionKey) {
/* 115 */     if (versionKey < this.fixerVersions.firstInt())
/*     */     {
/* 117 */       return this.fixerVersions.firstInt() - 1;
/*     */     }
/* 119 */     return this.fixerVersions.subSet(0, versionKey + 1).lastInt();
/*     */   }
/*     */   
/*     */   protected TypeRewriteRule getRule(int version, int dataVersion) {
/* 123 */     if (version >= dataVersion) {
/* 124 */       return TypeRewriteRule.nop();
/*     */     }
/*     */     
/* 127 */     int expandedVersion = getLowestFixSameVersion(DataFixUtils.makeKey(version));
/* 128 */     int expandedDataVersion = DataFixUtils.makeKey(dataVersion);
/*     */     
/* 130 */     long key = expandedVersion << 32L | expandedDataVersion;
/* 131 */     return (TypeRewriteRule)this.rules.computeIfAbsent(Long.valueOf(key), k -> {
/*     */           List<TypeRewriteRule> rules = Lists.newArrayList();
/*     */           for (DataFix fix : this.globalList) {
/*     */             int fixVersion = fix.getVersionKey();
/*     */             if (fixVersion > expandedVersion && fixVersion <= expandedDataVersion) {
/*     */               TypeRewriteRule fixRule = fix.getRule();
/*     */               if (fixRule == TypeRewriteRule.nop()) {
/*     */                 continue;
/*     */               }
/*     */               rules.add(fixRule);
/*     */             } 
/*     */           } 
/*     */           return TypeRewriteRule.seq(rules);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   protected IntSortedSet fixerVersions() {
/* 149 */     return this.fixerVersions;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\DataFixerUpper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */