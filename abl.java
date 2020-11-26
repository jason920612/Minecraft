/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ 
/*    */ 
/*    */ public class abl
/*    */   extends Schema
/*    */ {
/*    */   public abl(int ☃, Schema schema) {
/* 10 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   public static String a(String ☃) {
/* 14 */     pc pc = pc.a(☃);
/* 15 */     if (pc != null) {
/* 16 */       return pc.toString();
/*    */     }
/* 18 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public Type<?> getChoiceType(DSL.TypeReference ☃, String str) {
/* 23 */     return super.getChoiceType(☃, a(str));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\abl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */