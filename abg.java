/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.List;
/*     */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abg
/*     */   extends DataFix
/*     */ {
/*  27 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abg(Schema ☃, boolean bool) {
/*  33 */     super(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/*  38 */     Type<?> ☃ = getOutputSchema().getType(aax.c);
/*  39 */     Type<?> type1 = ☃.findFieldType("Level");
/*  40 */     Type<?> type2 = type1.findFieldType("TileEntities");
/*  41 */     if (!(type2 instanceof List.ListType)) {
/*  42 */       throw new IllegalStateException("Tile entity type is not a list type.");
/*     */     }
/*  44 */     List.ListType<?> listType = (List.ListType)type2;
/*     */     
/*  46 */     OpticFinder<? extends List<?>> opticFinder = DSL.fieldFinder("TileEntities", (Type)listType);
/*     */     
/*  48 */     Type<?> type3 = getInputSchema().getType(aax.c);
/*     */     
/*  50 */     OpticFinder<?> opticFinder1 = type3.findField("Level");
/*  51 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Sections");
/*  52 */     Type<?> type4 = opticFinder2.type();
/*  53 */     if (!(type4 instanceof List.ListType)) {
/*  54 */       throw new IllegalStateException("Expecting sections to be a list.");
/*     */     }
/*  56 */     Type<?> type5 = ((List.ListType)type4).getElement();
/*  57 */     OpticFinder<?> opticFinder3 = DSL.typeFinder(type5);
/*     */     
/*  59 */     return TypeRewriteRule.seq((new ya(
/*  60 */           getOutputSchema(), "AddTrappedChestFix", aax.j)).makeRule(), 
/*  61 */         fixTypeEverywhereTyped("Trapped Chest fix", type3, typed -> typed.updateTyped(☃, ())));
/*     */   }
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
/*     */ 
/*     */   
/*     */   public static final class a
/*     */     extends aak.b
/*     */   {
/*     */     @Nullable
/*     */     private IntSet f;
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
/*     */     
/*     */     public a(Typed<?> ☃, Schema schema) {
/* 116 */       super(☃, schema);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a() {
/* 121 */       this.f = (IntSet)new IntOpenHashSet();
/*     */       
/* 123 */       for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/* 124 */         Dynamic<?> dynamic = this.c.get(☃);
/* 125 */         String str = dynamic.getString("Name");
/* 126 */         if (Objects.equals(str, "minecraft:trapped_chest")) {
/* 127 */           this.f.add(☃);
/*     */         }
/*     */       } 
/*     */       
/* 131 */       return this.f.isEmpty();
/*     */     }
/*     */     
/*     */     public boolean a(int ☃) {
/* 135 */       return this.f.contains(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\abg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */