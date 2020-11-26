/*     */ import com.google.gson.JsonArray;
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
/*     */ 
/*     */ public class ao
/*     */ {
/*  15 */   public static final ao a = new ao(ap.a, ai.a, ay.a, bb.a, bc.a);
/*  16 */   public static final ao[] b = new ao[0];
/*     */   
/*     */   private final ap c;
/*     */   private final ai d;
/*     */   private final ay e;
/*     */   private final bb f;
/*     */   private final bc g;
/*     */   
/*     */   private ao(ap ☃, ai ai1, ay ay1, bb bb1, bc bc1) {
/*  25 */     this.c = ☃;
/*  26 */     this.d = ai1;
/*  27 */     this.e = ay1;
/*  28 */     this.f = bb1;
/*  29 */     this.g = bc1;
/*     */   }
/*     */   
/*     */   public boolean a(tf ☃, @Nullable aer aer1) {
/*  33 */     if (this == a) {
/*  34 */       return true;
/*     */     }
/*  36 */     if (aer1 == null) {
/*  37 */       return false;
/*     */     }
/*  39 */     if (!this.c.a(aer1.P())) {
/*  40 */       return false;
/*     */     }
/*  42 */     if (!this.d.a(☃.q, ☃.r, ☃.s, aer1.q, aer1.r, aer1.s)) {
/*  43 */       return false;
/*     */     }
/*  45 */     if (!this.e.a(☃.s(), aer1.q, aer1.r, aer1.s)) {
/*  46 */       return false;
/*     */     }
/*  48 */     if (!this.f.a(aer1)) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (!this.g.a(aer1)) {
/*  52 */       return false;
/*     */     }
/*  54 */     return true;
/*     */   }
/*     */   
/*     */   public static ao a(@Nullable JsonElement ☃) {
/*  58 */     if (☃ == null || ☃.isJsonNull()) {
/*  59 */       return a;
/*     */     }
/*     */     
/*  62 */     JsonObject jsonObject = xj.m(☃, "entity");
/*     */     
/*  64 */     ap ap1 = ap.a(jsonObject.get("type"));
/*  65 */     ai ai1 = ai.a(jsonObject.get("distance"));
/*  66 */     ay ay1 = ay.a(jsonObject.get("location"));
/*  67 */     bb bb1 = bb.a(jsonObject.get("effects"));
/*  68 */     bc bc1 = bc.a(jsonObject.get("nbt"));
/*  69 */     return (new a())
/*  70 */       .a(ap1)
/*  71 */       .a(ai1)
/*  72 */       .a(ay1)
/*  73 */       .a(bb1)
/*  74 */       .a(bc1)
/*  75 */       .b();
/*     */   }
/*     */   
/*     */   public static ao[] b(@Nullable JsonElement ☃) {
/*  79 */     if (☃ == null || ☃.isJsonNull()) {
/*  80 */       return b;
/*     */     }
/*  82 */     JsonArray jsonArray = xj.n(☃, "entities");
/*  83 */     ao[] arrayOfAo = new ao[jsonArray.size()];
/*     */     
/*  85 */     for (int i = 0; i < jsonArray.size(); i++) {
/*  86 */       arrayOfAo[i] = a(jsonArray.get(i));
/*     */     }
/*     */     
/*  89 */     return arrayOfAo;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  93 */     if (this == a) {
/*  94 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  97 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  99 */     ☃.add("type", this.c.a());
/* 100 */     ☃.add("distance", this.d.a());
/* 101 */     ☃.add("location", this.e.a());
/* 102 */     ☃.add("effects", this.f.b());
/* 103 */     ☃.add("nbt", this.g.a());
/*     */     
/* 105 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static JsonElement a(ao[] ☃) {
/* 109 */     if (☃ == b) {
/* 110 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 113 */     JsonArray jsonArray = new JsonArray();
/*     */     
/* 115 */     for (int i = 0; i < ☃.length; i++) {
/* 116 */       JsonElement jsonElement = ☃[i].a();
/* 117 */       if (!jsonElement.isJsonNull()) {
/* 118 */         jsonArray.add(jsonElement);
/*     */       }
/*     */     } 
/*     */     
/* 122 */     return (JsonElement)jsonArray;
/*     */   }
/*     */   
/*     */   public static class a {
/* 126 */     private ap a = ap.a;
/* 127 */     private ai b = ai.a;
/* 128 */     private ay c = ay.a;
/* 129 */     private bb d = bb.a;
/* 130 */     private bc e = bc.a;
/*     */     
/*     */     public static a a() {
/* 133 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(aev<?> ☃) {
/* 137 */       this.a = new ap(☃);
/* 138 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ap ☃) {
/* 142 */       this.a = ☃;
/* 143 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ai ☃) {
/* 147 */       this.b = ☃;
/* 148 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ay ☃) {
/* 152 */       this.c = ☃;
/* 153 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bb ☃) {
/* 157 */       this.d = ☃;
/* 158 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bc ☃) {
/* 162 */       this.e = ☃;
/* 163 */       return this;
/*     */     }
/*     */     
/*     */     public ao b() {
/* 167 */       if (this.a == ap.a && this.b == ai.a && this.c == ay.a && this.d == bb.a && this.e == bc.a)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 172 */         return ao.a;
/*     */       }
/*     */       
/* 175 */       return new ao(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */