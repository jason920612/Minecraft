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
/*    */ public class a
/*    */   extends ccy.a<cdc>
/*    */ {
/*    */   protected a() {
/* 31 */     super(new pc("set_count"), cdc.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdc cdc1, JsonSerializationContext jsonSerializationContext) {
/* 36 */     ☃.add("count", jsonSerializationContext.serialize(cdc.a(cdc1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cdc a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 41 */     return new cdc(arrayOfCdk, xj.<ccu>a(☃, "count", jsonDeserializationContext, ccu.class));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */