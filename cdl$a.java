/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.lang.reflect.Type;
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
/*    */   implements JsonDeserializer<cdk>, JsonSerializer<cdk>
/*    */ {
/*    */   public cdk a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*    */     cdk.a<?> a1;
/* 79 */     JsonObject jsonObject = xj.m(☃, "condition");
/* 80 */     pc pc = new pc(xj.h(jsonObject, "condition"));
/*    */ 
/*    */     
/*    */     try {
/* 84 */       a1 = cdl.a(pc);
/* 85 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 86 */       throw new JsonSyntaxException("Unknown condition '" + pc + "'");
/*    */     } 
/* 88 */     return (cdk)a1.b(jsonObject, jsonDeserializationContext);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a(cdk ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 93 */     cdk.a<cdk> a1 = cdl.a(☃);
/* 94 */     JsonObject jsonObject = new JsonObject();
/* 95 */     a1.a(jsonObject, ☃, jsonSerializationContext);
/* 96 */     jsonObject.addProperty("condition", a1.a().toString());
/* 97 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */