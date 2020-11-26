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
/*    */ public class a
/*    */   implements JsonDeserializer<ccy>, JsonSerializer<ccy>
/*    */ {
/*    */   public ccy a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*    */     ccy.a<?> a1;
/* 70 */     JsonObject jsonObject = xj.m(☃, "function");
/* 71 */     pc pc = new pc(xj.h(jsonObject, "function"));
/*    */ 
/*    */     
/*    */     try {
/* 75 */       a1 = ccz.a(pc);
/* 76 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 77 */       throw new JsonSyntaxException("Unknown function '" + pc + "'");
/*    */     } 
/* 79 */     return (ccy)a1.b(jsonObject, jsonDeserializationContext, xj.<cdk[]>a(jsonObject, "conditions", new cdk[0], jsonDeserializationContext, (Class)cdk[].class));
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a(ccy ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 84 */     ccy.a<ccy> a1 = ccz.a(☃);
/* 85 */     JsonObject jsonObject = new JsonObject();
/* 86 */     a1.a(jsonObject, ☃, jsonSerializationContext);
/* 87 */     jsonObject.addProperty("function", a1.a().toString());
/* 88 */     if (☃.b() != null && (☃.b()).length > 0) {
/* 89 */       jsonObject.add("conditions", jsonSerializationContext.serialize(☃.b()));
/*    */     }
/* 91 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */