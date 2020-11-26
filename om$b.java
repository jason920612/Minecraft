/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   implements JsonDeserializer<om>, JsonSerializer<om>
/*     */ {
/*     */   public om a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 170 */     JsonObject jsonObject = xj.m(☃, "status");
/* 171 */     om om = new om();
/*     */     
/* 173 */     if (jsonObject.has("description")) {
/* 174 */       om.a((ij)jsonDeserializationContext.deserialize(jsonObject.get("description"), ij.class));
/*     */     }
/*     */     
/* 177 */     if (jsonObject.has("players")) {
/* 178 */       om.a((om.a)jsonDeserializationContext.deserialize(jsonObject.get("players"), om.a.class));
/*     */     }
/*     */     
/* 181 */     if (jsonObject.has("version")) {
/* 182 */       om.a((om.c)jsonDeserializationContext.deserialize(jsonObject.get("version"), om.c.class));
/*     */     }
/*     */     
/* 185 */     if (jsonObject.has("favicon")) {
/* 186 */       om.a(xj.h(jsonObject, "favicon"));
/*     */     }
/*     */     
/* 189 */     return om;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(om ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 194 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 196 */     if (☃.a() != null) {
/* 197 */       jsonObject.add("description", jsonSerializationContext.serialize(☃.a()));
/*     */     }
/*     */     
/* 200 */     if (☃.b() != null) {
/* 201 */       jsonObject.add("players", jsonSerializationContext.serialize(☃.b()));
/*     */     }
/*     */     
/* 204 */     if (☃.c() != null) {
/* 205 */       jsonObject.add("version", jsonSerializationContext.serialize(☃.c()));
/*     */     }
/*     */     
/* 208 */     if (☃.d() != null) {
/* 209 */       jsonObject.addProperty("favicon", ☃.d());
/*     */     }
/*     */     
/* 212 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\om$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */