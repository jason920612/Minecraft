/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   implements JsonDeserializer<ip>, JsonSerializer<ip>
/*     */ {
/*     */   @Nullable
/*     */   public ip a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 281 */     if (☃.isJsonObject()) {
/* 282 */       ip ip = new ip();
/* 283 */       JsonObject jsonObject = ☃.getAsJsonObject();
/* 284 */       if (jsonObject == null) {
/* 285 */         return null;
/*     */       }
/* 287 */       if (jsonObject.has("bold")) {
/* 288 */         ip.a(ip, Boolean.valueOf(jsonObject.get("bold").getAsBoolean()));
/*     */       }
/* 290 */       if (jsonObject.has("italic")) {
/* 291 */         ip.b(ip, Boolean.valueOf(jsonObject.get("italic").getAsBoolean()));
/*     */       }
/* 293 */       if (jsonObject.has("underlined")) {
/* 294 */         ip.c(ip, Boolean.valueOf(jsonObject.get("underlined").getAsBoolean()));
/*     */       }
/* 296 */       if (jsonObject.has("strikethrough")) {
/* 297 */         ip.d(ip, Boolean.valueOf(jsonObject.get("strikethrough").getAsBoolean()));
/*     */       }
/* 299 */       if (jsonObject.has("obfuscated")) {
/* 300 */         ip.e(ip, Boolean.valueOf(jsonObject.get("obfuscated").getAsBoolean()));
/*     */       }
/* 302 */       if (jsonObject.has("color")) {
/* 303 */         ip.a(ip, (a)jsonDeserializationContext.deserialize(jsonObject.get("color"), a.class));
/*     */       }
/* 305 */       if (jsonObject.has("insertion")) {
/* 306 */         ip.a(ip, jsonObject.get("insertion").getAsString());
/*     */       }
/*     */       
/* 309 */       if (jsonObject.has("clickEvent")) {
/* 310 */         JsonObject jsonObject1 = jsonObject.getAsJsonObject("clickEvent");
/* 311 */         if (jsonObject1 != null) {
/* 312 */           JsonPrimitive jsonPrimitive1 = jsonObject1.getAsJsonPrimitive("action");
/* 313 */           ii.a a1 = (jsonPrimitive1 == null) ? null : ii.a.a(jsonPrimitive1.getAsString());
/*     */           
/* 315 */           JsonPrimitive jsonPrimitive2 = jsonObject1.getAsJsonPrimitive("value");
/* 316 */           String str = (jsonPrimitive2 == null) ? null : jsonPrimitive2.getAsString();
/*     */           
/* 318 */           if (a1 != null && str != null && a1.a()) {
/* 319 */             ip.a(ip, new ii(a1, str));
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 324 */       if (jsonObject.has("hoverEvent")) {
/* 325 */         JsonObject jsonObject1 = jsonObject.getAsJsonObject("hoverEvent");
/* 326 */         if (jsonObject1 != null) {
/* 327 */           JsonPrimitive jsonPrimitive = jsonObject1.getAsJsonPrimitive("action");
/* 328 */           il.a a1 = (jsonPrimitive == null) ? null : il.a.a(jsonPrimitive.getAsString());
/*     */           
/* 330 */           ij ij = (ij)jsonDeserializationContext.deserialize(jsonObject1.get("value"), ij.class);
/*     */           
/* 332 */           if (a1 != null && ij != null && a1.a()) {
/* 333 */             ip.a(ip, new il(a1, ij));
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 338 */       return ip;
/*     */     } 
/*     */     
/* 341 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonElement a(ip ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 347 */     if (☃.g()) {
/* 348 */       return null;
/*     */     }
/* 350 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 352 */     if (ip.b(☃) != null) {
/* 353 */       jsonObject.addProperty("bold", ip.b(☃));
/*     */     }
/* 355 */     if (ip.c(☃) != null) {
/* 356 */       jsonObject.addProperty("italic", ip.c(☃));
/*     */     }
/* 358 */     if (ip.d(☃) != null) {
/* 359 */       jsonObject.addProperty("underlined", ip.d(☃));
/*     */     }
/* 361 */     if (ip.e(☃) != null) {
/* 362 */       jsonObject.addProperty("strikethrough", ip.e(☃));
/*     */     }
/* 364 */     if (ip.f(☃) != null) {
/* 365 */       jsonObject.addProperty("obfuscated", ip.f(☃));
/*     */     }
/* 367 */     if (ip.g(☃) != null) {
/* 368 */       jsonObject.add("color", jsonSerializationContext.serialize(ip.g(☃)));
/*     */     }
/* 370 */     if (ip.h(☃) != null) {
/* 371 */       jsonObject.add("insertion", jsonSerializationContext.serialize(ip.h(☃)));
/*     */     }
/*     */     
/* 374 */     if (ip.i(☃) != null) {
/* 375 */       JsonObject jsonObject1 = new JsonObject();
/* 376 */       jsonObject1.addProperty("action", ip.i(☃).a().b());
/* 377 */       jsonObject1.addProperty("value", ip.i(☃).b());
/* 378 */       jsonObject.add("clickEvent", (JsonElement)jsonObject1);
/*     */     } 
/*     */     
/* 381 */     if (ip.j(☃) != null) {
/* 382 */       JsonObject jsonObject1 = new JsonObject();
/* 383 */       jsonObject1.addProperty("action", ip.j(☃).a().b());
/* 384 */       jsonObject1.add("value", jsonSerializationContext.serialize(ip.j(☃).b()));
/* 385 */       jsonObject.add("hoverEvent", (JsonElement)jsonObject1);
/*     */     } 
/*     */     
/* 388 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ip$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */