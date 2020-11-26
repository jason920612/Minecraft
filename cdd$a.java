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
/*    */ public class a
/*    */   extends ccy.a<cdd>
/*    */ {
/*    */   protected a() {
/* 41 */     super(new pc("set_damage"), cdd.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdd cdd1, JsonSerializationContext jsonSerializationContext) {
/* 46 */     ☃.add("damage", jsonSerializationContext.serialize(cdd.a(cdd1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cdd a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 51 */     return new cdd(arrayOfCdk, xj.<ccu>a(☃, "damage", jsonDeserializationContext, ccu.class));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdd$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */