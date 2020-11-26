/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class aba
/*    */   extends DataFix
/*    */ {
/*    */   public aba(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 17 */     return writeFixAndRead("SavedDataVillageCropFix", getInputSchema().getType(aax.s), getOutputSchema().getType(aax.s), this::a);
/*    */   }
/*    */   
/*    */   private <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 21 */     return ☃.update("Children", aba::b);
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> b(Dynamic<T> ☃) {
/* 25 */     return ☃.getStream().map(aba::a).map(☃::createList).orElse(☃);
/*    */   }
/*    */   
/*    */   private static Stream<? extends Dynamic<?>> a(Stream<? extends Dynamic<?>> ☃) {
/* 29 */     return ☃.map(☃ -> {
/*    */           String str = ☃.getString("id");
/*    */           return "ViF".equals(str) ? c(☃) : ("ViDF".equals(str) ? d(☃) : ☃);
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> Dynamic<T> c(Dynamic<T> ☃) {
/* 43 */     ☃ = a(☃, "CA");
/* 44 */     return a(☃, "CB");
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> d(Dynamic<T> ☃) {
/* 48 */     ☃ = a(☃, "CA");
/* 49 */     ☃ = a(☃, "CB");
/* 50 */     ☃ = a(☃, "CC");
/* 51 */     return a(☃, "CD");
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃, String str) {
/* 55 */     if (☃.get(str).flatMap(Dynamic::getNumberValue).isPresent()) {
/* 56 */       return ☃.set(str, yp.b(☃.getInt(str) << 4));
/*    */     }
/* 58 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */