/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ip
/*     */ {
/*     */   private ip a;
/*     */   private a b;
/*     */   private Boolean c;
/*     */   private Boolean d;
/*     */   private Boolean e;
/*     */   private Boolean f;
/*     */   private Boolean g;
/*     */   private ii h;
/*     */   private il i;
/*     */   private String j;
/*     */   
/*     */   @Nullable
/*     */   public a a() {
/*  33 */     return (this.b == null) ? o().a() : this.b;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  37 */     return (this.c == null) ? o().b() : this.c.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  41 */     return (this.d == null) ? o().c() : this.d.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  45 */     return (this.f == null) ? o().d() : this.f.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  49 */     return (this.e == null) ? o().e() : this.e.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  53 */     return (this.g == null) ? o().f() : this.g.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  57 */     return (this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null && this.j == null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ii h() {
/*  62 */     return (this.h == null) ? o().h() : this.h;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public il i() {
/*  67 */     return (this.i == null) ? o().i() : this.i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String j() {
/*  72 */     return (this.j == null) ? o().j() : this.j;
/*     */   }
/*     */   
/*     */   public ip a(a ☃) {
/*  76 */     this.b = ☃;
/*  77 */     return this;
/*     */   }
/*     */   
/*     */   public ip a(Boolean ☃) {
/*  81 */     this.c = ☃;
/*  82 */     return this;
/*     */   }
/*     */   
/*     */   public ip b(Boolean ☃) {
/*  86 */     this.d = ☃;
/*  87 */     return this;
/*     */   }
/*     */   
/*     */   public ip c(Boolean ☃) {
/*  91 */     this.f = ☃;
/*  92 */     return this;
/*     */   }
/*     */   
/*     */   public ip d(Boolean ☃) {
/*  96 */     this.e = ☃;
/*  97 */     return this;
/*     */   }
/*     */   
/*     */   public ip e(Boolean ☃) {
/* 101 */     this.g = ☃;
/* 102 */     return this;
/*     */   }
/*     */   
/*     */   public ip a(ii ☃) {
/* 106 */     this.h = ☃;
/* 107 */     return this;
/*     */   }
/*     */   
/*     */   public ip a(il ☃) {
/* 111 */     this.i = ☃;
/* 112 */     return this;
/*     */   }
/*     */   
/*     */   public ip a(String ☃) {
/* 116 */     this.j = ☃;
/* 117 */     return this;
/*     */   }
/*     */   
/*     */   public ip a(ip ☃) {
/* 121 */     this.a = ☃;
/* 122 */     return this;
/*     */   }
/*     */   
/*     */   public String k() {
/* 126 */     if (g()) {
/* 127 */       if (this.a != null) {
/* 128 */         return this.a.k();
/*     */       }
/* 130 */       return "";
/*     */     } 
/*     */ 
/*     */     
/* 134 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/* 136 */     if (a() != null) {
/* 137 */       ☃.append(a());
/*     */     }
/*     */     
/* 140 */     if (b()) {
/* 141 */       ☃.append(a.r);
/*     */     }
/* 143 */     if (c()) {
/* 144 */       ☃.append(a.u);
/*     */     }
/* 146 */     if (e()) {
/* 147 */       ☃.append(a.t);
/*     */     }
/* 149 */     if (f()) {
/* 150 */       ☃.append(a.q);
/*     */     }
/* 152 */     if (d()) {
/* 153 */       ☃.append(a.s);
/*     */     }
/*     */     
/* 156 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   private ip o() {
/* 160 */     return (this.a == null) ? k : this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 180 */     return "Style{hasParent=" + ((this.a != null) ? 1 : 0) + ", color=" + this.b + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 187 */       h() + ", hoverEvent=" + 
/* 188 */       i() + ", insertion=" + 
/* 189 */       j() + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 195 */     if (this == ☃) {
/* 196 */       return true;
/*     */     }
/* 198 */     if (☃ instanceof ip) {
/* 199 */       ip ip1 = (ip)☃;
/*     */       
/* 201 */       return (b() == ip1.b() && 
/* 202 */         a() == ip1.a() && 
/* 203 */         c() == ip1.c() && 
/* 204 */         f() == ip1.f() && 
/* 205 */         d() == ip1.d() && 
/* 206 */         e() == ip1.e() && (
/* 207 */         (h() != null) ? h().equals(ip1.h()) : (ip1.h() == null)) && (
/* 208 */         (i() != null) ? i().equals(ip1.i()) : (ip1.i() == null)) && (
/* 209 */         (j() != null) ? j().equals(ip1.j()) : (ip1.j() == null)));
/*     */     } 
/*     */     
/* 212 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 217 */     return Objects.hash(new Object[] { this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j });
/*     */   }
/*     */   
/* 220 */   private static final ip k = new ip() { @Nullable
/* 221 */       public a a() { return null; }
/* 222 */       public boolean b() { return false; }
/* 223 */       public boolean c() { return false; }
/* 224 */       public boolean d() { return false; }
/* 225 */       public boolean e() { return false; }
/* 226 */       public boolean f() { return false; } @Nullable
/* 227 */       public ii h() { return null; } @Nullable
/* 228 */       public il i() { return null; } @Nullable
/* 229 */       public String j() { return null; }
/* 230 */       public ip a(a ☃) { throw new UnsupportedOperationException(); }
/* 231 */       public ip a(Boolean ☃) { throw new UnsupportedOperationException(); }
/* 232 */       public ip b(Boolean ☃) { throw new UnsupportedOperationException(); }
/* 233 */       public ip c(Boolean ☃) { throw new UnsupportedOperationException(); }
/* 234 */       public ip d(Boolean ☃) { throw new UnsupportedOperationException(); }
/* 235 */       public ip e(Boolean ☃) { throw new UnsupportedOperationException(); }
/* 236 */       public ip a(ii ☃) { throw new UnsupportedOperationException(); }
/* 237 */       public ip a(il ☃) { throw new UnsupportedOperationException(); }
/* 238 */       public ip a(ip ☃) { throw new UnsupportedOperationException(); }
/* 239 */       public String toString() { return "Style.ROOT"; }
/* 240 */       public ip m() { return this; } public ip n() {
/* 241 */         return this;
/*     */       } public String k() {
/* 243 */         return "";
/*     */       } }
/*     */   ;
/*     */   public ip m() {
/* 247 */     ip ☃ = new ip();
/* 248 */     ☃.c = this.c;
/* 249 */     ☃.d = this.d;
/* 250 */     ☃.f = this.f;
/* 251 */     ☃.e = this.e;
/* 252 */     ☃.g = this.g;
/* 253 */     ☃.b = this.b;
/* 254 */     ☃.h = this.h;
/* 255 */     ☃.i = this.i;
/* 256 */     ☃.a = this.a;
/* 257 */     ☃.j = this.j;
/* 258 */     return ☃;
/*     */   }
/*     */   
/*     */   public ip n() {
/* 262 */     ip ☃ = new ip();
/*     */     
/* 264 */     ☃.a(Boolean.valueOf(b()));
/* 265 */     ☃.b(Boolean.valueOf(c()));
/* 266 */     ☃.c(Boolean.valueOf(d()));
/* 267 */     ☃.d(Boolean.valueOf(e()));
/* 268 */     ☃.e(Boolean.valueOf(f()));
/* 269 */     ☃.a(a());
/* 270 */     ☃.a(h());
/* 271 */     ☃.a(i());
/* 272 */     ☃.a(j());
/*     */     
/* 274 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ip>, JsonSerializer<ip> {
/*     */     @Nullable
/*     */     public ip a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 281 */       if (☃.isJsonObject()) {
/* 282 */         ip ip = new ip();
/* 283 */         JsonObject jsonObject = ☃.getAsJsonObject();
/* 284 */         if (jsonObject == null) {
/* 285 */           return null;
/*     */         }
/* 287 */         if (jsonObject.has("bold")) {
/* 288 */           ip.a(ip, Boolean.valueOf(jsonObject.get("bold").getAsBoolean()));
/*     */         }
/* 290 */         if (jsonObject.has("italic")) {
/* 291 */           ip.b(ip, Boolean.valueOf(jsonObject.get("italic").getAsBoolean()));
/*     */         }
/* 293 */         if (jsonObject.has("underlined")) {
/* 294 */           ip.c(ip, Boolean.valueOf(jsonObject.get("underlined").getAsBoolean()));
/*     */         }
/* 296 */         if (jsonObject.has("strikethrough")) {
/* 297 */           ip.d(ip, Boolean.valueOf(jsonObject.get("strikethrough").getAsBoolean()));
/*     */         }
/* 299 */         if (jsonObject.has("obfuscated")) {
/* 300 */           ip.e(ip, Boolean.valueOf(jsonObject.get("obfuscated").getAsBoolean()));
/*     */         }
/* 302 */         if (jsonObject.has("color")) {
/* 303 */           ip.a(ip, (a)jsonDeserializationContext.deserialize(jsonObject.get("color"), a.class));
/*     */         }
/* 305 */         if (jsonObject.has("insertion")) {
/* 306 */           ip.a(ip, jsonObject.get("insertion").getAsString());
/*     */         }
/*     */         
/* 309 */         if (jsonObject.has("clickEvent")) {
/* 310 */           JsonObject jsonObject1 = jsonObject.getAsJsonObject("clickEvent");
/* 311 */           if (jsonObject1 != null) {
/* 312 */             JsonPrimitive jsonPrimitive1 = jsonObject1.getAsJsonPrimitive("action");
/* 313 */             ii.a a1 = (jsonPrimitive1 == null) ? null : ii.a.a(jsonPrimitive1.getAsString());
/*     */             
/* 315 */             JsonPrimitive jsonPrimitive2 = jsonObject1.getAsJsonPrimitive("value");
/* 316 */             String str = (jsonPrimitive2 == null) ? null : jsonPrimitive2.getAsString();
/*     */             
/* 318 */             if (a1 != null && str != null && a1.a()) {
/* 319 */               ip.a(ip, new ii(a1, str));
/*     */             }
/*     */           } 
/*     */         } 
/*     */         
/* 324 */         if (jsonObject.has("hoverEvent")) {
/* 325 */           JsonObject jsonObject1 = jsonObject.getAsJsonObject("hoverEvent");
/* 326 */           if (jsonObject1 != null) {
/* 327 */             JsonPrimitive jsonPrimitive = jsonObject1.getAsJsonPrimitive("action");
/* 328 */             il.a a1 = (jsonPrimitive == null) ? null : il.a.a(jsonPrimitive.getAsString());
/*     */             
/* 330 */             ij ij = (ij)jsonDeserializationContext.deserialize(jsonObject1.get("value"), ij.class);
/*     */             
/* 332 */             if (a1 != null && ij != null && a1.a()) {
/* 333 */               ip.a(ip, new il(a1, ij));
/*     */             }
/*     */           } 
/*     */         } 
/*     */         
/* 338 */         return ip;
/*     */       } 
/*     */       
/* 341 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonElement a(ip ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 347 */       if (☃.g()) {
/* 348 */         return null;
/*     */       }
/* 350 */       JsonObject jsonObject = new JsonObject();
/*     */       
/* 352 */       if (ip.b(☃) != null) {
/* 353 */         jsonObject.addProperty("bold", ip.b(☃));
/*     */       }
/* 355 */       if (ip.c(☃) != null) {
/* 356 */         jsonObject.addProperty("italic", ip.c(☃));
/*     */       }
/* 358 */       if (ip.d(☃) != null) {
/* 359 */         jsonObject.addProperty("underlined", ip.d(☃));
/*     */       }
/* 361 */       if (ip.e(☃) != null) {
/* 362 */         jsonObject.addProperty("strikethrough", ip.e(☃));
/*     */       }
/* 364 */       if (ip.f(☃) != null) {
/* 365 */         jsonObject.addProperty("obfuscated", ip.f(☃));
/*     */       }
/* 367 */       if (ip.g(☃) != null) {
/* 368 */         jsonObject.add("color", jsonSerializationContext.serialize(ip.g(☃)));
/*     */       }
/* 370 */       if (ip.h(☃) != null) {
/* 371 */         jsonObject.add("insertion", jsonSerializationContext.serialize(ip.h(☃)));
/*     */       }
/*     */       
/* 374 */       if (ip.i(☃) != null) {
/* 375 */         JsonObject jsonObject1 = new JsonObject();
/* 376 */         jsonObject1.addProperty("action", ip.i(☃).a().b());
/* 377 */         jsonObject1.addProperty("value", ip.i(☃).b());
/* 378 */         jsonObject.add("clickEvent", (JsonElement)jsonObject1);
/*     */       } 
/*     */       
/* 381 */       if (ip.j(☃) != null) {
/* 382 */         JsonObject jsonObject1 = new JsonObject();
/* 383 */         jsonObject1.addProperty("action", ip.j(☃).a().b());
/* 384 */         jsonObject1.add("value", jsonSerializationContext.serialize(ip.j(☃).b()));
/* 385 */         jsonObject.add("hoverEvent", (JsonElement)jsonObject1);
/*     */       } 
/*     */       
/* 388 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */