/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ur
/*    */   implements up<uq>
/*    */ {
/*    */   public uq b(JsonObject ☃) {
/* 12 */     ij ij = ij.a.a(☃.get("description"));
/* 13 */     if (ij == null) {
/* 14 */       throw new JsonParseException("Invalid/missing description!");
/*    */     }
/* 16 */     int i = xj.n(☃, "pack_format");
/* 17 */     return new uq(ij, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 22 */     return "pack";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar\\ur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */