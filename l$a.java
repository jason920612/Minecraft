/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/*     */   private pc a;
/*     */   private l b;
/*     */   private u c;
/* 141 */   private o d = o.a;
/* 142 */   private Map<String, q> e = Maps.newLinkedHashMap();
/*     */   private String[][] f;
/* 144 */   private w g = w.AND;
/*     */   
/*     */   private a(@Nullable pc ☃, @Nullable u u1, o o1, Map<String, q> map, String[][] arrayOfString) {
/* 147 */     this.a = ☃;
/* 148 */     this.c = u1;
/* 149 */     this.d = o1;
/* 150 */     this.e = map;
/* 151 */     this.f = arrayOfString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a() {
/* 158 */     return new a();
/*     */   }
/*     */   
/*     */   public a a(l ☃) {
/* 162 */     this.b = ☃;
/* 163 */     return this;
/*     */   }
/*     */   
/*     */   public a a(pc ☃) {
/* 167 */     this.a = ☃;
/* 168 */     return this;
/*     */   }
/*     */   
/*     */   public a a(axx ☃, ij ij1, ij ij2, @Nullable pc pc1, v v1, boolean bool1, boolean bool2, boolean bool3) {
/* 172 */     return a(new u(new ate(☃.h()), ij1, ij2, pc1, v1, bool1, bool2, bool3));
/*     */   }
/*     */   
/*     */   public a a(u ☃) {
/* 176 */     this.c = ☃;
/* 177 */     return this;
/*     */   }
/*     */   
/*     */   public a a(o.a ☃) {
/* 181 */     return a(☃.a());
/*     */   }
/*     */   
/*     */   public a a(o ☃) {
/* 185 */     this.d = ☃;
/* 186 */     return this;
/*     */   }
/*     */   
/*     */   public a a(String ☃, t t1) {
/* 190 */     return a(☃, new q(t1));
/*     */   }
/*     */   
/*     */   public a a(String ☃, q q1) {
/* 194 */     if (this.e.containsKey(☃)) {
/* 195 */       throw new IllegalArgumentException("Duplicate criterion " + ☃);
/*     */     }
/* 197 */     this.e.put(☃, q1);
/* 198 */     return this;
/*     */   }
/*     */   
/*     */   public a a(w ☃) {
/* 202 */     this.g = ☃;
/* 203 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(Function<pc, l> ☃) {
/* 212 */     if (this.a == null)
/* 213 */       return true; 
/* 214 */     if (this.b == null) {
/* 215 */       this.b = ☃.apply(this.a);
/*     */     }
/* 217 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   public l b(pc ☃) {
/* 221 */     if (!a(☃ -> null)) {
/* 222 */       throw new IllegalStateException("Tried to build incomplete advancement!");
/*     */     }
/* 224 */     if (this.f == null) {
/* 225 */       this.f = this.g.createRequirements(this.e.keySet());
/*     */     }
/* 227 */     return new l(☃, this.b, this.c, this.d, this.e, this.f);
/*     */   }
/*     */   
/*     */   public l a(Consumer<l> ☃, String str) {
/* 231 */     l l1 = b(new pc(str));
/* 232 */     ☃.accept(l1);
/* 233 */     return l1;
/*     */   }
/*     */   
/*     */   public JsonObject b() {
/* 237 */     if (this.f == null) {
/* 238 */       this.f = this.g.createRequirements(this.e.keySet());
/*     */     }
/*     */     
/* 241 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 243 */     if (this.b != null) {
/* 244 */       ☃.addProperty("parent", this.b.h().toString());
/* 245 */     } else if (this.a != null) {
/* 246 */       ☃.addProperty("parent", this.a.toString());
/*     */     } 
/*     */     
/* 249 */     if (this.c != null) {
/* 250 */       ☃.add("display", this.c.k());
/*     */     }
/*     */     
/* 253 */     ☃.add("rewards", this.d.b());
/*     */     
/* 255 */     JsonObject jsonObject1 = new JsonObject();
/* 256 */     for (Map.Entry<String, q> entry : this.e.entrySet()) {
/* 257 */       jsonObject1.add(entry.getKey(), ((q)entry.getValue()).b());
/*     */     }
/* 259 */     ☃.add("criteria", (JsonElement)jsonObject1);
/*     */     
/* 261 */     JsonArray jsonArray = new JsonArray();
/* 262 */     for (String[] arrayOfString : this.f) {
/* 263 */       JsonArray jsonArray1 = new JsonArray();
/* 264 */       for (String str : arrayOfString) {
/* 265 */         jsonArray1.add(str);
/*     */       }
/* 267 */       jsonArray.add((JsonElement)jsonArray1);
/*     */     } 
/* 269 */     ☃.add("requirements", (JsonElement)jsonArray);
/*     */     
/* 271 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(hy ☃) {
/* 275 */     if (this.a == null) {
/* 276 */       ☃.writeBoolean(false);
/*     */     } else {
/* 278 */       ☃.writeBoolean(true);
/* 279 */       ☃.a(this.a);
/*     */     } 
/* 281 */     if (this.c == null) {
/* 282 */       ☃.writeBoolean(false);
/*     */     } else {
/* 284 */       ☃.writeBoolean(true);
/* 285 */       this.c.a(☃);
/*     */     } 
/* 287 */     q.a(this.e, ☃);
/* 288 */     ☃.d(this.f.length);
/* 289 */     for (String[] arrayOfString : this.f) {
/* 290 */       ☃.d(arrayOfString.length);
/* 291 */       for (String str : arrayOfString) {
/* 292 */         ☃.a(str);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 299 */     return "Task Advancement{parentId=" + this.a + ", display=" + this.c + ", rewards=" + this.d + ", criteria=" + this.e + ", requirements=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 304 */       Arrays.deepToString((Object[])this.f) + '}';
/*     */   }
/*     */ 
/*     */   
/*     */   public static a a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 309 */     pc pc1 = ☃.has("parent") ? new pc(xj.h(☃, "parent")) : null;
/* 310 */     u u1 = ☃.has("display") ? u.a(xj.t(☃, "display"), jsonDeserializationContext) : null;
/* 311 */     o o1 = xj.<o>a(☃, "rewards", o.a, jsonDeserializationContext, o.class);
/* 312 */     Map<String, q> map = q.b(xj.t(☃, "criteria"), jsonDeserializationContext);
/* 313 */     if (map.isEmpty()) {
/* 314 */       throw new JsonSyntaxException("Advancement criteria cannot be empty");
/*     */     }
/* 316 */     JsonArray jsonArray = xj.a(☃, "requirements", new JsonArray());
/* 317 */     String[][] arrayOfString = new String[jsonArray.size()][]; int i;
/* 318 */     for (i = 0; i < jsonArray.size(); i++) {
/* 319 */       JsonArray jsonArray1 = xj.n(jsonArray.get(i), "requirements[" + i + "]");
/* 320 */       arrayOfString[i] = new String[jsonArray1.size()];
/* 321 */       for (int j = 0; j < jsonArray1.size(); j++) {
/* 322 */         arrayOfString[i][j] = xj.a(jsonArray1.get(j), "requirements[" + i + "][" + j + "]");
/*     */       }
/*     */     } 
/* 325 */     if (arrayOfString.length == 0) {
/* 326 */       arrayOfString = new String[map.size()][];
/* 327 */       i = 0;
/* 328 */       for (String str : map.keySet()) {
/* 329 */         (new String[1])[0] = str; arrayOfString[i++] = new String[1];
/*     */       } 
/*     */     } 
/* 332 */     for (String[] arrayOfString1 : arrayOfString) {
/* 333 */       if (arrayOfString1.length == 0 && map.isEmpty()) {
/* 334 */         throw new JsonSyntaxException("Requirement entry cannot be empty");
/*     */       }
/* 336 */       for (String str : arrayOfString1) {
/* 337 */         if (!map.containsKey(str)) {
/* 338 */           throw new JsonSyntaxException("Unknown required criterion '" + str + "'");
/*     */         }
/*     */       } 
/*     */     } 
/* 342 */     for (String str : map.keySet()) {
/* 343 */       boolean bool = false;
/* 344 */       for (String[] arrayOfString1 : arrayOfString) {
/* 345 */         if (ArrayUtils.contains((Object[])arrayOfString1, str)) {
/* 346 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 350 */       if (!bool) {
/* 351 */         throw new JsonSyntaxException("Criterion '" + str + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required.");
/*     */       }
/*     */     } 
/* 354 */     return new a(pc1, u1, o1, map, arrayOfString);
/*     */   }
/*     */   
/*     */   public static a b(hy ☃) {
/* 358 */     pc pc1 = ☃.readBoolean() ? ☃.l() : null;
/* 359 */     u u1 = ☃.readBoolean() ? u.b(☃) : null;
/* 360 */     Map<String, q> map = q.c(☃);
/* 361 */     String[][] arrayOfString = new String[☃.g()][];
/* 362 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 363 */       arrayOfString[i] = new String[☃.g()];
/* 364 */       for (int j = 0; j < (arrayOfString[i]).length; j++) {
/* 365 */         arrayOfString[i][j] = ☃.e(32767);
/*     */       }
/*     */     } 
/* 368 */     return new a(pc1, u1, o.a, map, arrayOfString);
/*     */   }
/*     */   
/*     */   public Map<String, q> c() {
/* 372 */     return this.e;
/*     */   }
/*     */   
/*     */   private a() {}
/*     */ }


/* Location:              F:\dw\server.jar!\l$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */