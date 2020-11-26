/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParseException;
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
/*    */ final class null
/*    */   implements JsonDeserializer<ij>
/*    */ {
/*    */   public ij a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 30 */     if (☃.isJsonPrimitive())
/*    */     {
/* 32 */       return new iq(☃.getAsString()); } 
/* 33 */     if (☃.isJsonArray()) {
/*    */       
/* 35 */       JsonArray jsonArray = ☃.getAsJsonArray();
/* 36 */       ij ij = null;
/*    */       
/* 38 */       for (JsonElement jsonElement : jsonArray) {
/* 39 */         ij ij1 = a(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
/* 40 */         if (ij == null) {
/* 41 */           ij = ij1; continue;
/*    */         } 
/* 43 */         ij.a(ij1);
/*    */       } 
/*    */ 
/*    */       
/* 47 */       return ij;
/*    */     } 
/* 49 */     throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ym$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */