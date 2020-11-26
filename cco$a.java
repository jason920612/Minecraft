/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ import org.apache.commons.lang3.ArrayUtils;
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
/*    */   implements JsonDeserializer<cco>, JsonSerializer<cco>
/*    */ {
/*    */   public cco a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 74 */     JsonObject jsonObject = xj.m(☃, "loot pool");
/* 75 */     ccp[] arrayOfCcp = xj.<ccp[]>a(jsonObject, "entries", jsonDeserializationContext, (Class)ccp[].class);
/* 76 */     cdk[] arrayOfCdk = xj.<cdk[]>a(jsonObject, "conditions", new cdk[0], jsonDeserializationContext, (Class)cdk[].class);
/* 77 */     ccu ccu1 = xj.<ccu>a(jsonObject, "rolls", jsonDeserializationContext, ccu.class);
/* 78 */     ccu ccu2 = xj.<ccu>a(jsonObject, "bonus_rolls", new ccu(0.0F, 0.0F), jsonDeserializationContext, ccu.class);
/* 79 */     return new cco(arrayOfCcp, arrayOfCdk, ccu1, ccu2);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a(cco ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 84 */     JsonObject jsonObject = new JsonObject();
/* 85 */     jsonObject.add("entries", jsonSerializationContext.serialize(cco.a(☃)));
/* 86 */     jsonObject.add("rolls", jsonSerializationContext.serialize(cco.b(☃)));
/* 87 */     if (cco.c(☃).a() != 0.0F && cco.c(☃).b() != 0.0F) {
/* 88 */       jsonObject.add("bonus_rolls", jsonSerializationContext.serialize(cco.c(☃)));
/*    */     }
/* 90 */     if (!ArrayUtils.isEmpty((Object[])cco.d(☃))) {
/* 91 */       jsonObject.add("conditions", jsonSerializationContext.serialize(cco.d(☃)));
/*    */     }
/*    */     
/* 94 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cco$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */