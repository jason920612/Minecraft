/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSyntaxException;
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
/*    */ public class b
/*    */   extends ccy.a<cdb>
/*    */ {
/*    */   public b() {
/* 50 */     super(new pc("set_attributes"), cdb.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdb cdb1, JsonSerializationContext jsonSerializationContext) {
/* 55 */     JsonArray jsonArray = new JsonArray();
/* 56 */     for (cdb.a a1 : cdb.a(cdb1)) {
/* 57 */       jsonArray.add((JsonElement)a1.a(jsonSerializationContext));
/*    */     }
/* 59 */     ☃.add("modifiers", (JsonElement)jsonArray);
/*    */   }
/*    */ 
/*    */   
/*    */   public cdb a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 64 */     JsonArray jsonArray = xj.u(☃, "modifiers");
/* 65 */     cdb.a[] arrayOfA = new cdb.a[jsonArray.size()];
/* 66 */     int i = 0;
/* 67 */     for (JsonElement jsonElement : jsonArray) {
/* 68 */       arrayOfA[i++] = cdb.a.a(xj.m(jsonElement, "modifier"), jsonDeserializationContext);
/*    */     }
/*    */     
/* 71 */     if (arrayOfA.length == 0) {
/* 72 */       throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
/*    */     }
/* 74 */     return new cdb(arrayOfCdk, arrayOfA);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdb$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */