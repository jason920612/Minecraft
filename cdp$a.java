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
/*    */ public class a
/*    */   extends cdk.a<cdp>
/*    */ {
/*    */   protected a() {
/* 34 */     super(new pc("random_chance_with_looting"), cdp.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdp cdp1, JsonSerializationContext jsonSerializationContext) {
/* 39 */     ☃.addProperty("chance", Float.valueOf(cdp.a(cdp1)));
/* 40 */     ☃.addProperty("looting_multiplier", Float.valueOf(cdp.b(cdp1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cdp a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 45 */     return new cdp(xj.l(☃, "chance"), xj.l(☃, "looting_multiplier"));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */