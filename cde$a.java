/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends ccy.a<cde>
/*    */ {
/*    */   public a() {
/* 33 */     super(new pc("set_name"), cde.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cde cde1, JsonSerializationContext jsonSerializationContext) {
/* 38 */     if (cde.a(cde1) != null) {
/* 39 */       ☃.add("name", ij.a.b(cde.a(cde1)));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public cde a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 45 */     ij ij = ij.a.a(☃.get("name"));
/* 46 */     return new cde(arrayOfCdk, ij);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cde$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */