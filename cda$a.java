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
/*    */   extends ccy.a<cda>
/*    */ {
/*    */   protected a() {
/* 50 */     super(new pc("looting_enchant"), cda.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cda cda1, JsonSerializationContext jsonSerializationContext) {
/* 55 */     ☃.add("count", jsonSerializationContext.serialize(cda.a(cda1)));
/* 56 */     if (cda.b(cda1) > 0) {
/* 57 */       ☃.add("limit", jsonSerializationContext.serialize(Integer.valueOf(cda.b(cda1))));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public cda a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 63 */     int i = xj.a(☃, "limit", 0);
/* 64 */     return new cda(arrayOfCdk, xj.<ccu>a(☃, "count", jsonDeserializationContext, ccu.class), i);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cda$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */