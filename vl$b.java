/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.lang.reflect.Type;
/*     */ import java.text.ParseException;
/*     */ import java.util.Date;
/*     */ import java.util.UUID;
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
/*     */ class b
/*     */   implements JsonDeserializer<vl.a>, JsonSerializer<vl.a>
/*     */ {
/*     */   private b(vl paramvl) {}
/*     */   
/*     */   public JsonElement a(vl.a ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 228 */     JsonObject jsonObject = new JsonObject();
/* 229 */     jsonObject.addProperty("name", ☃.a().getName());
/* 230 */     UUID uUID = ☃.a().getId();
/* 231 */     jsonObject.addProperty("uuid", (uUID == null) ? "" : uUID.toString());
/* 232 */     jsonObject.addProperty("expiresOn", vl.a.format(☃.b()));
/* 233 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ 
/*     */   
/*     */   public vl.a a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 238 */     if (☃.isJsonObject()) {
/* 239 */       UUID uUID; JsonObject jsonObject = ☃.getAsJsonObject();
/* 240 */       JsonElement jsonElement1 = jsonObject.get("name");
/* 241 */       JsonElement jsonElement2 = jsonObject.get("uuid");
/* 242 */       JsonElement jsonElement3 = jsonObject.get("expiresOn");
/* 243 */       if (jsonElement1 == null || jsonElement2 == null) {
/* 244 */         return null;
/*     */       }
/* 246 */       String str1 = jsonElement2.getAsString();
/* 247 */       String str2 = jsonElement1.getAsString();
/* 248 */       Date date = null;
/* 249 */       if (jsonElement3 != null) {
/*     */         try {
/* 251 */           date = vl.a.parse(jsonElement3.getAsString());
/* 252 */         } catch (ParseException parseException) {
/* 253 */           date = null;
/*     */         } 
/*     */       }
/* 256 */       if (str2 == null || str1 == null) {
/* 257 */         return null;
/*     */       }
/*     */       
/*     */       try {
/* 261 */         uUID = UUID.fromString(str1);
/* 262 */       } catch (Throwable throwable) {
/* 263 */         return null;
/*     */       } 
/* 265 */       return new vl.a(this.a, new GameProfile(uUID, str2), date, null);
/*     */     } 
/* 267 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vl$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */