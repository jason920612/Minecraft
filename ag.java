/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ag
/*     */ {
/*  13 */   public static final ag a = a.a().b();
/*     */   
/*     */   private final ba.c b;
/*     */   private final ba.c c;
/*     */   private final ao d;
/*     */   private final Boolean e;
/*     */   private final ah f;
/*     */   
/*     */   public ag() {
/*  22 */     this.b = ba.c.e;
/*  23 */     this.c = ba.c.e;
/*  24 */     this.d = ao.a;
/*  25 */     this.e = null;
/*  26 */     this.f = ah.a;
/*     */   }
/*     */   
/*     */   public ag(ba.c ☃, ba.c c1, ao ao1, @Nullable Boolean bool, ah ah1) {
/*  30 */     this.b = ☃;
/*  31 */     this.c = c1;
/*  32 */     this.d = ao1;
/*  33 */     this.e = bool;
/*  34 */     this.f = ah1;
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, aea aea1, float f1, float f2, boolean bool) {
/*  38 */     if (this == a) {
/*  39 */       return true;
/*     */     }
/*  41 */     if (!this.b.d(f1)) {
/*  42 */       return false;
/*     */     }
/*  44 */     if (!this.c.d(f2)) {
/*  45 */       return false;
/*     */     }
/*  47 */     if (!this.d.a(☃, aea1.k())) {
/*  48 */       return false;
/*     */     }
/*  50 */     if (this.e != null && this.e.booleanValue() != bool) {
/*  51 */       return false;
/*     */     }
/*  53 */     if (!this.f.a(☃, aea1)) {
/*  54 */       return false;
/*     */     }
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public static ag a(@Nullable JsonElement ☃) {
/*  60 */     if (☃ == null || ☃.isJsonNull()) {
/*  61 */       return a;
/*     */     }
/*  63 */     JsonObject jsonObject = xj.m(☃, "damage");
/*  64 */     ba.c c1 = ba.c.a(jsonObject.get("dealt"));
/*  65 */     ba.c c2 = ba.c.a(jsonObject.get("taken"));
/*  66 */     Boolean bool = jsonObject.has("blocked") ? Boolean.valueOf(xj.j(jsonObject, "blocked")) : null;
/*  67 */     ao ao1 = ao.a(jsonObject.get("source_entity"));
/*  68 */     ah ah1 = ah.a(jsonObject.get("type"));
/*  69 */     return new ag(c1, c2, ao1, bool, ah1);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  73 */     if (this == a) {
/*  74 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  77 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  79 */     ☃.add("dealt", this.b.d());
/*  80 */     ☃.add("taken", this.c.d());
/*  81 */     ☃.add("source_entity", this.d.a());
/*  82 */     ☃.add("type", this.f.a());
/*     */     
/*  84 */     if (this.e != null) {
/*  85 */       ☃.addProperty("blocked", this.e);
/*     */     }
/*     */     
/*  88 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*  92 */     private ba.c a = ba.c.e;
/*  93 */     private ba.c b = ba.c.e;
/*  94 */     private ao c = ao.a;
/*     */     private Boolean d;
/*  96 */     private ah e = ah.a;
/*     */     
/*     */     public static a a() {
/*  99 */       return new a();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(Boolean ☃) {
/* 118 */       this.d = ☃;
/* 119 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(ah.a ☃) {
/* 128 */       this.e = ☃.b();
/* 129 */       return this;
/*     */     }
/*     */     
/*     */     public ag b() {
/* 133 */       return new ag(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */