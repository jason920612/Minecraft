/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ 
/*    */ public class zh
/*    */   extends DataFix {
/* 12 */   private static final int[][] a = new int[][] { { 0, 0, 1 }, { -1, 0, 0 }, { 0, 0, -1 }, { 1, 0, 0 } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public zh(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃, boolean bool1, boolean bool2) {
/* 24 */     if ((bool1 || bool2) && !☃.get("Facing").flatMap(Dynamic::getNumberValue).isPresent()) {
/*    */       int i;
/* 26 */       if (☃.get("Direction").flatMap(Dynamic::getNumberValue).isPresent()) {
/* 27 */         i = ☃.getByte("Direction") % a.length;
/* 28 */         int[] arrayOfInt = a[i];
/*    */         
/* 30 */         ☃ = ☃.set("TileX", ☃.createInt(☃.getInt("TileX") + arrayOfInt[0]));
/* 31 */         ☃ = ☃.set("TileY", ☃.createInt(☃.getInt("TileY") + arrayOfInt[1]));
/* 32 */         ☃ = ☃.set("TileZ", ☃.createInt(☃.getInt("TileZ") + arrayOfInt[2]));
/*    */         
/* 34 */         ☃ = ☃.remove("Direction");
/*    */         
/* 36 */         if (bool2 && ☃.get("ItemRotation").flatMap(Dynamic::getNumberValue).isPresent()) {
/* 37 */           ☃ = ☃.set("ItemRotation", ☃.createByte((byte)(☃.getByte("ItemRotation") * 2)));
/*    */         }
/*    */       } else {
/* 40 */         i = ☃.getByte("Dir") % a.length;
/* 41 */         ☃ = ☃.remove("Dir");
/*    */       } 
/* 43 */       ☃ = ☃.set("Facing", ☃.createByte((byte)i));
/*    */     } 
/*    */     
/* 46 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 51 */     Type<?> ☃ = getInputSchema().getChoiceType(aax.o, "Painting");
/* 52 */     OpticFinder<?> opticFinder1 = DSL.namedChoice("Painting", ☃);
/*    */     
/* 54 */     Type<?> type1 = getInputSchema().getChoiceType(aax.o, "ItemFrame");
/* 55 */     OpticFinder<?> opticFinder2 = DSL.namedChoice("ItemFrame", type1);
/*    */     
/* 57 */     Type<?> type2 = getInputSchema().getType(aax.o);
/*    */     
/* 59 */     TypeRewriteRule typeRewriteRule1 = fixTypeEverywhereTyped("EntityPaintingFix", type2, typed -> typed.updateTyped(☃, type, ()));
/*    */ 
/*    */     
/* 62 */     TypeRewriteRule typeRewriteRule2 = fixTypeEverywhereTyped("EntityItemFrameFix", type2, typed -> typed.updateTyped(☃, type, ()));
/*    */ 
/*    */ 
/*    */     
/* 66 */     return TypeRewriteRule.seq(typeRewriteRule1, typeRewriteRule2);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */