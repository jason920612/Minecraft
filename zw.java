/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class zw
/*    */   extends DataFix {
/*    */   public zw(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 16 */     Type<?> ☃ = getInputSchema().getType(aax.s);
/* 17 */     Type<?> type1 = getOutputSchema().getType(aax.s);
/*    */     
/* 19 */     return writeFixAndRead("IglooMetadataRemovalFix", ☃, type1, zw::a);
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 23 */     boolean bool = ((Boolean)☃.get("Children").flatMap(Dynamic::getStream).map(☃ -> Boolean.valueOf(☃.allMatch(zw::c))).orElse(Boolean.valueOf(false))).booleanValue();
/*    */     
/* 25 */     if (bool) {
/* 26 */       return ☃.set("id", ☃.createString("Igloo")).remove("Children");
/*    */     }
/* 28 */     return ☃.update("Children", zw::b);
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T> Dynamic<T> b(Dynamic<T> ☃) {
/* 33 */     return ☃.getStream().map(☃ -> ☃.filter(())).map(☃::createList).orElse(☃);
/*    */   }
/*    */   
/*    */   private static boolean c(Dynamic<?> ☃) {
/* 37 */     return ☃.getString("id").equals("Iglu");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */