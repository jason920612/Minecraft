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
/*     */ public class ah
/*     */ {
/*  13 */   public static final ah a = a.a().b();
/*     */   
/*     */   private final Boolean b;
/*     */   private final Boolean c;
/*     */   private final Boolean d;
/*     */   private final Boolean e;
/*     */   private final Boolean f;
/*     */   private final Boolean g;
/*     */   private final Boolean h;
/*     */   private final ao i;
/*     */   private final ao j;
/*     */   
/*     */   public ah(@Nullable Boolean ☃, @Nullable Boolean bool1, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, ao ao1, ao ao2) {
/*  26 */     this.b = ☃;
/*  27 */     this.c = bool1;
/*  28 */     this.d = bool2;
/*  29 */     this.e = bool3;
/*  30 */     this.f = bool4;
/*  31 */     this.g = bool5;
/*  32 */     this.h = bool6;
/*  33 */     this.i = ao1;
/*  34 */     this.j = ao2;
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, aea aea1) {
/*  38 */     if (this == a) {
/*  39 */       return true;
/*     */     }
/*  41 */     if (this.b != null && this.b.booleanValue() != aea1.b()) {
/*  42 */       return false;
/*     */     }
/*  44 */     if (this.c != null && this.c.booleanValue() != aea1.d()) {
/*  45 */       return false;
/*     */     }
/*  47 */     if (this.d != null && this.d.booleanValue() != aea1.f()) {
/*  48 */       return false;
/*     */     }
/*  50 */     if (this.e != null && this.e.booleanValue() != aea1.h()) {
/*  51 */       return false;
/*     */     }
/*  53 */     if (this.f != null && this.f.booleanValue() != aea1.i()) {
/*  54 */       return false;
/*     */     }
/*  56 */     if (this.g != null && this.g.booleanValue() != aea1.p()) {
/*  57 */       return false;
/*     */     }
/*  59 */     if (this.h != null && this.h.booleanValue() != aea1.t()) {
/*  60 */       return false;
/*     */     }
/*  62 */     if (!this.i.a(☃, aea1.j())) {
/*  63 */       return false;
/*     */     }
/*  65 */     if (!this.j.a(☃, aea1.k())) {
/*  66 */       return false;
/*     */     }
/*  68 */     return true;
/*     */   }
/*     */   
/*     */   public static ah a(@Nullable JsonElement ☃) {
/*  72 */     if (☃ == null || ☃.isJsonNull()) {
/*  73 */       return a;
/*     */     }
/*  75 */     JsonObject jsonObject = xj.m(☃, "damage type");
/*  76 */     Boolean bool1 = a(jsonObject, "is_projectile");
/*  77 */     Boolean bool2 = a(jsonObject, "is_explosion");
/*  78 */     Boolean bool3 = a(jsonObject, "bypasses_armor");
/*  79 */     Boolean bool4 = a(jsonObject, "bypasses_invulnerability");
/*  80 */     Boolean bool5 = a(jsonObject, "bypasses_magic");
/*  81 */     Boolean bool6 = a(jsonObject, "is_fire");
/*  82 */     Boolean bool7 = a(jsonObject, "is_magic");
/*  83 */     ao ao1 = ao.a(jsonObject.get("direct_entity"));
/*  84 */     ao ao2 = ao.a(jsonObject.get("source_entity"));
/*  85 */     return new ah(bool1, bool2, bool3, bool4, bool5, bool6, bool7, ao1, ao2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Boolean a(JsonObject ☃, String str) {
/*  90 */     return ☃.has(str) ? Boolean.valueOf(xj.j(☃, str)) : null;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  94 */     if (this == a) {
/*  95 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  98 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 100 */     a(☃, "is_projectile", this.b);
/* 101 */     a(☃, "is_explosion", this.c);
/* 102 */     a(☃, "bypasses_armor", this.d);
/* 103 */     a(☃, "bypasses_invulnerability", this.e);
/* 104 */     a(☃, "bypasses_magic", this.f);
/* 105 */     a(☃, "is_fire", this.g);
/* 106 */     a(☃, "is_magic", this.h);
/* 107 */     ☃.add("direct_entity", this.i.a());
/* 108 */     ☃.add("source_entity", this.j.a());
/*     */     
/* 110 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   private void a(JsonObject ☃, String str, @Nullable Boolean bool) {
/* 114 */     if (bool != null)
/* 115 */       ☃.addProperty(str, bool); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */   {
/*     */     private Boolean a;
/*     */     private Boolean b;
/*     */     private Boolean c;
/*     */     private Boolean d;
/*     */     private Boolean e;
/*     */     private Boolean f;
/*     */     private Boolean g;
/* 127 */     private ao h = ao.a;
/* 128 */     private ao i = ao.a;
/*     */     
/*     */     public static a a() {
/* 131 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(Boolean ☃) {
/* 135 */       this.a = ☃;
/* 136 */       return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(ao.a ☃) {
/* 175 */       this.h = ☃.b();
/* 176 */       return this;
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
/*     */     public ah b() {
/* 190 */       return new ah(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */