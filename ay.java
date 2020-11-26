/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
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
/*     */ public class ay
/*     */ {
/*  19 */   public static final ay a = new ay(ba.c.e, ba.c.e, ba.c.e, null, null, null);
/*     */   
/*     */   private final ba.c b;
/*     */   private final ba.c c;
/*     */   private final ba.c d;
/*     */   @Nullable
/*     */   private final ayu e;
/*     */   @Nullable
/*     */   private final String f;
/*     */   @Nullable
/*     */   private final bod g;
/*     */   
/*     */   public ay(ba.c ☃, ba.c c1, ba.c c2, @Nullable ayu ayu1, @Nullable String str, @Nullable bod bod1) {
/*  32 */     this.b = ☃;
/*  33 */     this.c = c1;
/*  34 */     this.d = c2;
/*  35 */     this.e = ayu1;
/*  36 */     this.f = str;
/*  37 */     this.g = bod1;
/*     */   }
/*     */   
/*     */   public static ay a(ayu ☃) {
/*  41 */     return new ay(ba.c.e, ba.c.e, ba.c.e, ☃, null, null);
/*     */   }
/*     */   
/*     */   public static ay a(bod ☃) {
/*  45 */     return new ay(ba.c.e, ba.c.e, ba.c.e, null, null, ☃);
/*     */   }
/*     */   
/*     */   public static ay a(String ☃) {
/*  49 */     return new ay(ba.c.e, ba.c.e, ba.c.e, null, ☃, null);
/*     */   }
/*     */   
/*     */   public boolean a(td ☃, double d1, double d2, double d3) {
/*  53 */     return a(☃, (float)d1, (float)d2, (float)d3);
/*     */   }
/*     */   
/*     */   public boolean a(td ☃, float f1, float f2, float f3) {
/*  57 */     if (!this.b.d(f1)) {
/*  58 */       return false;
/*     */     }
/*  60 */     if (!this.c.d(f2)) {
/*  61 */       return false;
/*     */     }
/*  63 */     if (!this.d.d(f3)) {
/*  64 */       return false;
/*     */     }
/*  66 */     if (this.g != null && this.g != ☃.t.q()) {
/*  67 */       return false;
/*     */     }
/*  69 */     el el = new el(f1, f2, f3);
/*  70 */     if (this.e != null && this.e != ☃.d(el)) {
/*  71 */       return false;
/*     */     }
/*  73 */     if (this.f != null && !bqo.a(☃, this.f, el)) {
/*  74 */       return false;
/*     */     }
/*  76 */     return true;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  80 */     if (this == a) {
/*  81 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  84 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  86 */     if (!this.b.c() || !this.c.c() || !this.d.c()) {
/*  87 */       JsonObject jsonObject = new JsonObject();
/*  88 */       jsonObject.add("x", this.b.d());
/*  89 */       jsonObject.add("y", this.c.d());
/*  90 */       jsonObject.add("z", this.d.d());
/*  91 */       ☃.add("position", (JsonElement)jsonObject);
/*     */     } 
/*  93 */     if (this.g != null) {
/*  94 */       ☃.addProperty("dimension", bod.a(this.g).toString());
/*     */     }
/*  96 */     if (this.f != null) {
/*  97 */       ☃.addProperty("feature", this.f);
/*     */     }
/*  99 */     if (this.e != null) {
/* 100 */       ☃.addProperty("biome", fc.m.b(this.e).toString());
/*     */     }
/*     */     
/* 103 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static ay a(@Nullable JsonElement ☃) {
/* 107 */     if (☃ == null || ☃.isJsonNull()) {
/* 108 */       return a;
/*     */     }
/* 110 */     JsonObject jsonObject1 = xj.m(☃, "location");
/* 111 */     JsonObject jsonObject2 = xj.a(jsonObject1, "position", new JsonObject());
/* 112 */     ba.c c1 = ba.c.a(jsonObject2.get("x"));
/* 113 */     ba.c c2 = ba.c.a(jsonObject2.get("y"));
/* 114 */     ba.c c3 = ba.c.a(jsonObject2.get("z"));
/* 115 */     bod bod1 = jsonObject1.has("dimension") ? bod.a(new pc(xj.h(jsonObject1, "dimension"))) : null;
/* 116 */     String str = jsonObject1.has("feature") ? xj.h(jsonObject1, "feature") : null;
/* 117 */     ayu ayu1 = null;
/* 118 */     if (jsonObject1.has("biome")) {
/* 119 */       pc pc = new pc(xj.h(jsonObject1, "biome"));
/* 120 */       ayu1 = fc.m.b(pc);
/* 121 */       if (ayu1 == null) {
/* 122 */         throw new JsonSyntaxException("Unknown biome '" + pc + "'");
/*     */       }
/*     */     } 
/* 125 */     return new ay(c1, c2, c3, ayu1, str, bod1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */