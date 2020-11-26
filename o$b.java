/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
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
/*     */ public class b
/*     */   implements JsonDeserializer<o>
/*     */ {
/*     */   public o a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*     */     br.a a;
/* 126 */     JsonObject jsonObject = xj.m(☃, "rewards");
/* 127 */     int i = xj.a(jsonObject, "experience", 0);
/* 128 */     JsonArray jsonArray1 = xj.a(jsonObject, "loot", new JsonArray());
/* 129 */     pc[] arrayOfPc1 = new pc[jsonArray1.size()];
/* 130 */     for (int j = 0; j < arrayOfPc1.length; j++) {
/* 131 */       arrayOfPc1[j] = new pc(xj.a(jsonArray1.get(j), "loot[" + j + "]"));
/*     */     }
/* 133 */     JsonArray jsonArray2 = xj.a(jsonObject, "recipes", new JsonArray());
/* 134 */     pc[] arrayOfPc2 = new pc[jsonArray2.size()];
/* 135 */     for (int k = 0; k < arrayOfPc2.length; k++) {
/* 136 */       arrayOfPc2[k] = new pc(xj.a(jsonArray2.get(k), "recipes[" + k + "]"));
/*     */     }
/*     */     
/* 139 */     if (jsonObject.has("function")) {
/* 140 */       a = new br.a(new pc(xj.h(jsonObject, "function")));
/*     */     } else {
/* 142 */       a = br.a.a;
/*     */     } 
/* 144 */     return new o(i, arrayOfPc1, arrayOfPc2, a);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\o$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */