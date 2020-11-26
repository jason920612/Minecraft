/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonPrimitive;
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
/*    */ public class a
/*    */   extends cds.a<cdt>
/*    */ {
/*    */   protected a() {
/* 27 */     super(new pc("on_fire"), cdt.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a(cdt ☃, JsonSerializationContext jsonSerializationContext) {
/* 32 */     return (JsonElement)new JsonPrimitive(Boolean.valueOf(cdt.a(☃)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cdt b(JsonElement ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 37 */     return new cdt(xj.c(☃, "on_fire"));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdt$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */