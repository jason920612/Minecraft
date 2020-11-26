/*     */ package com.mojang.datafixers;
/*     */ 
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import java.util.BitSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public abstract class DataFix
/*     */ {
/*  17 */   private static final Logger LOGGER = LogManager.getLogger();
/*     */   
/*     */   private final Schema outputSchema;
/*     */   private final boolean changesType;
/*     */   @Nullable
/*     */   private TypeRewriteRule rule;
/*     */   
/*     */   public DataFix(Schema outputSchema, boolean changesType) {
/*  25 */     this.outputSchema = outputSchema;
/*  26 */     this.changesType = changesType;
/*     */   }
/*     */   
/*     */   protected <A> TypeRewriteRule fixTypeEverywhere(String name, Type<A> type, Function<DynamicOps<?>, Function<A, A>> function) {
/*  30 */     return fixTypeEverywhere(name, type, type, function, new BitSet());
/*     */   }
/*     */ 
/*     */   
/*     */   protected <A, B> TypeRewriteRule convertUnchecked(String name, Type<A> type, Type<B> newType) {
/*  35 */     return fixTypeEverywhere(name, type, newType, ops -> Function.identity(), new BitSet());
/*     */   }
/*     */   
/*     */   protected TypeRewriteRule writeAndRead(String name, Type<?> type, Type<?> newType) {
/*  39 */     return writeFixAndRead(name, type, newType, Function.identity());
/*     */   }
/*     */   
/*     */   protected <A, B> TypeRewriteRule writeFixAndRead(String name, Type<A> type, Type<B> newType, Function<Dynamic<?>, Dynamic<?>> fix) {
/*  43 */     return fixTypeEverywhere(name, type, newType, ops -> ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected <A, B> TypeRewriteRule fixTypeEverywhere(String name, Type<A> type, Type<B> newType, Function<DynamicOps<?>, Function<A, B>> function) {
/*  49 */     return fixTypeEverywhere(name, type, newType, function, new BitSet());
/*     */   }
/*     */   
/*     */   protected <A, B> TypeRewriteRule fixTypeEverywhere(String name, Type<A> type, Type<B> newType, Function<DynamicOps<?>, Function<A, B>> function, BitSet bitSet) {
/*  53 */     return fixTypeEverywhere(type, RewriteResult.create(View.create(name, type, newType, new NamedFunctionWrapper<>(name, function)), bitSet));
/*     */   }
/*     */   
/*     */   protected <A> TypeRewriteRule fixTypeEverywhereTyped(String name, Type<A> type, Function<Typed<?>, Typed<?>> function) {
/*  57 */     return fixTypeEverywhereTyped(name, type, function, new BitSet());
/*     */   }
/*     */   
/*     */   protected <A> TypeRewriteRule fixTypeEverywhereTyped(String name, Type<A> type, Function<Typed<?>, Typed<?>> function, BitSet bitSet) {
/*  61 */     return fixTypeEverywhereTyped(name, type, type, function, bitSet);
/*     */   }
/*     */   
/*     */   protected <A, B> TypeRewriteRule fixTypeEverywhereTyped(String name, Type<A> type, Type<B> newType, Function<Typed<?>, Typed<?>> function) {
/*  65 */     return fixTypeEverywhereTyped(name, type, newType, function, new BitSet());
/*     */   }
/*     */   
/*     */   protected <A, B> TypeRewriteRule fixTypeEverywhereTyped(String name, Type<A> type, Type<B> newType, Function<Typed<?>, Typed<?>> function, BitSet bitSet) {
/*  69 */     return fixTypeEverywhere(type, checked(name, type, newType, function, bitSet));
/*     */   }
/*     */ 
/*     */   
/*     */   public static <A, B> RewriteResult<A, B> checked(String name, Type<A> type, Type<B> newType, Function<Typed<?>, Typed<?>> function, BitSet bitSet) {
/*  74 */     return RewriteResult.create(View.create(name, type, newType, new NamedFunctionWrapper<>(name, ops -> ())), bitSet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected <A, B> TypeRewriteRule fixTypeEverywhere(Type<A> type, RewriteResult<A, B> view) {
/*  84 */     return TypeRewriteRule.checkOnce(TypeRewriteRule.everywhere(TypeRewriteRule.ifSame(type, view), DataFixerUpper.OPTIMIZATION_RULE, true, true), this::onFail);
/*     */   }
/*     */   
/*     */   protected void onFail(Type<?> type) {
/*  88 */     LOGGER.info("Not matched: " + this + " " + type);
/*     */   }
/*     */   
/*     */   public final int getVersionKey() {
/*  92 */     return getOutputSchema().getVersionKey();
/*     */   }
/*     */   
/*     */   public TypeRewriteRule getRule() {
/*  96 */     if (this.rule == null) {
/*  97 */       this.rule = makeRule();
/*     */     }
/*  99 */     return this.rule;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Schema getInputSchema() {
/* 105 */     if (this.changesType) {
/* 106 */       return this.outputSchema.getParent();
/*     */     }
/* 108 */     return getOutputSchema();
/*     */   }
/*     */   
/*     */   protected Schema getOutputSchema() {
/* 112 */     return this.outputSchema;
/*     */   }
/*     */   
/*     */   protected abstract TypeRewriteRule makeRule();
/*     */   
/*     */   private static final class NamedFunctionWrapper<A, B> implements Function<DynamicOps<?>, Function<A, B>> { private final String name;
/*     */     
/*     */     public NamedFunctionWrapper(String name, Function<DynamicOps<?>, Function<A, B>> delegate) {
/* 120 */       this.name = name;
/* 121 */       this.delegate = delegate;
/*     */     }
/*     */     private final Function<DynamicOps<?>, Function<A, B>> delegate;
/*     */     
/*     */     public Function<A, B> apply(DynamicOps<?> ops) {
/* 126 */       return this.delegate.apply(ops);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 131 */       if (this == o) {
/* 132 */         return true;
/*     */       }
/* 134 */       if (o == null || getClass() != o.getClass()) {
/* 135 */         return false;
/*     */       }
/* 137 */       NamedFunctionWrapper<?, ?> that = (NamedFunctionWrapper<?, ?>)o;
/* 138 */       return Objects.equals(this.name, that.name);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 143 */       return Objects.hash(new Object[] { this.name });
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\DataFix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */