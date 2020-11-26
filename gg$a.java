/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ class a
/*     */   implements ge
/*     */ {
/*     */   private final pc b;
/*     */   private final ata c;
/*     */   private final int d;
/*     */   private final String e;
/*     */   private final List<String> f;
/*     */   private final Map<Character, avh> g;
/*     */   private final l.a h;
/*     */   private final pc i;
/*     */   
/*     */   public a(gg paramgg, pc ☃, ata ata1, int i, String str, List<String> list, Map<Character, avh> map, l.a a1, pc pc1) {
/* 152 */     this.b = ☃;
/* 153 */     this.c = ata1;
/* 154 */     this.d = i;
/* 155 */     this.e = str;
/* 156 */     this.f = list;
/* 157 */     this.g = map;
/* 158 */     this.h = a1;
/* 159 */     this.i = pc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonObject a() {
/* 164 */     JsonObject ☃ = new JsonObject();
/* 165 */     ☃.addProperty("type", "crafting_shaped");
/*     */     
/* 167 */     if (!this.e.isEmpty()) {
/* 168 */       ☃.addProperty("group", this.e);
/*     */     }
/*     */     
/* 171 */     JsonArray jsonArray = new JsonArray();
/* 172 */     for (String str : this.f) {
/* 173 */       jsonArray.add(str);
/*     */     }
/* 175 */     ☃.add("pattern", (JsonElement)jsonArray);
/*     */     
/* 177 */     JsonObject jsonObject1 = new JsonObject();
/* 178 */     for (Map.Entry<Character, avh> entry : this.g.entrySet()) {
/* 179 */       jsonObject1.add(String.valueOf(entry.getKey()), ((avh)entry.getValue()).c());
/*     */     }
/* 181 */     ☃.add("key", (JsonElement)jsonObject1);
/*     */     
/* 183 */     JsonObject jsonObject2 = new JsonObject();
/* 184 */     jsonObject2.addProperty("item", fc.s.b(this.c).toString());
/* 185 */     if (this.d > 1) {
/* 186 */       jsonObject2.addProperty("count", Integer.valueOf(this.d));
/*     */     }
/* 188 */     ☃.add("result", (JsonElement)jsonObject2);
/*     */     
/* 190 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/* 195 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject c() {
/* 201 */     return this.h.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public pc d() {
/* 207 */     return this.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */