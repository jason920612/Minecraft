/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avt
/*     */   implements avk
/*     */ {
/*     */   private final pc a;
/*     */   private final String b;
/*     */   private final avh c;
/*     */   private final ate d;
/*     */   private final float e;
/*     */   private final int f;
/*     */   
/*     */   public avt(pc ☃, String str, avh avh1, ate ate1, float f, int i) {
/*  25 */     this.a = ☃;
/*  26 */     this.b = str;
/*  27 */     this.c = avh1;
/*  28 */     this.d = ate1;
/*  29 */     this.e = f;
/*  30 */     this.f = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  35 */     return (☃ instanceof bju && this.c.a(☃.a(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  40 */     return this.d.i();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/*  50 */     return avn.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public ez<avh> e() {
/*  55 */     ez<avh> ☃ = ez.a();
/*  56 */     ☃.add(this.c);
/*  57 */     return ☃;
/*     */   }
/*     */   
/*     */   public float g() {
/*  61 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate d() {
/*  66 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int h() {
/*  75 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/*  80 */     return this.a;
/*     */   }
/*     */   
/*     */   public static class a implements avm<avt> { public avt b(pc ☃, JsonObject jsonObject) {
/*     */       avh avh;
/*     */       ate ate;
/*  86 */       String str1 = xj.a(jsonObject, "group", "");
/*     */ 
/*     */       
/*  89 */       if (xj.d(jsonObject, "ingredient")) {
/*  90 */         avh = avh.a((JsonElement)xj.u(jsonObject, "ingredient"));
/*     */       } else {
/*  92 */         avh = avh.a((JsonElement)xj.t(jsonObject, "ingredient"));
/*     */       } 
/*     */ 
/*     */       
/*  96 */       String str2 = xj.h(jsonObject, "result");
/*  97 */       ata ata = fc.s.b(new pc(str2));
/*  98 */       if (ata != null) {
/*  99 */         ate = new ate(ata);
/*     */       } else {
/* 101 */         throw new IllegalStateException(str2 + " did not exist");
/*     */       } 
/* 103 */       float f = xj.a(jsonObject, "experience", 0.0F);
/* 104 */       int i = xj.a(jsonObject, "cookingtime", 200);
/*     */       
/* 106 */       return new avt(☃, str1, avh, ate, f, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public avt b(pc ☃, hy hy1) {
/* 111 */       String str = hy1.e(32767);
/* 112 */       avh avh = avh.b(hy1);
/* 113 */       ate ate = hy1.k();
/* 114 */       float f = hy1.readFloat();
/* 115 */       int i = hy1.g();
/* 116 */       return new avt(☃, str, avh, ate, f, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(hy ☃, avt avt1) {
/* 121 */       ☃.a(avt.a(avt1));
/* 122 */       avt.b(avt1).a(☃);
/* 123 */       ☃.a(avt.c(avt1));
/* 124 */       ☃.writeFloat(avt.d(avt1));
/* 125 */       ☃.d(avt.e(avt1));
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 130 */       return "smelting";
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\avt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */