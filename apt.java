/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apt
/*     */ {
/*  21 */   private int a = 20;
/*  22 */   private int e = 20;
/*  23 */   private float b = 5.0F;
/*     */   private float c;
/*     */   
/*     */   public void a(int ☃, float f) {
/*  27 */     this.a = Math.min(☃ + this.a, 20);
/*  28 */     this.b = Math.min(this.b + ☃ * f * 2.0F, this.a);
/*     */   }
/*     */   private int d;
/*     */   public void a(asv ☃, ate ate1) {
/*  32 */     a(☃.e(ate1), ☃.f(ate1));
/*     */   }
/*     */   
/*     */   public void a(aog ☃) {
/*  36 */     adi adi = ☃.m.aj();
/*     */     
/*  38 */     this.e = this.a;
/*     */     
/*  40 */     if (this.c > 4.0F) {
/*  41 */       this.c -= 4.0F;
/*     */       
/*  43 */       if (this.b > 0.0F) {
/*  44 */         this.b = Math.max(this.b - 1.0F, 0.0F);
/*  45 */       } else if (adi != adi.a) {
/*  46 */         this.a = Math.max(this.a - 1, 0);
/*     */       } 
/*     */     } 
/*     */     
/*  50 */     boolean bool = ☃.m.X().b("naturalRegeneration");
/*  51 */     if (bool && this.b > 0.0F && ☃.dx() && this.a >= 20) {
/*  52 */       this.d++;
/*  53 */       if (this.d >= 10) {
/*  54 */         float f = Math.min(this.b, 6.0F);
/*  55 */         ☃.c(f / 6.0F);
/*  56 */         a(f);
/*  57 */         this.d = 0;
/*     */       } 
/*  59 */     } else if (bool && this.a >= 18 && ☃.dx()) {
/*  60 */       this.d++;
/*  61 */       if (this.d >= 80) {
/*  62 */         ☃.c(1.0F);
/*  63 */         a(6.0F);
/*  64 */         this.d = 0;
/*     */       } 
/*  66 */     } else if (this.a <= 0) {
/*  67 */       this.d++;
/*  68 */       if (this.d >= 80) {
/*  69 */         if (☃.cq() > 10.0F || adi == adi.d || (☃.cq() > 1.0F && adi == adi.c)) {
/*  70 */           ☃.a(aea.i, 1.0F);
/*     */         }
/*  72 */         this.d = 0;
/*     */       } 
/*     */     } else {
/*  75 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/*  80 */     if (☃.c("foodLevel", 99)) {
/*  81 */       this.a = ☃.h("foodLevel");
/*  82 */       this.d = ☃.h("foodTickTimer");
/*  83 */       this.b = ☃.j("foodSaturationLevel");
/*  84 */       this.c = ☃.j("foodExhaustionLevel");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/*  89 */     ☃.b("foodLevel", this.a);
/*  90 */     ☃.b("foodTickTimer", this.d);
/*  91 */     ☃.a("foodSaturationLevel", this.b);
/*  92 */     ☃.a("foodExhaustionLevel", this.c);
/*     */   }
/*     */   
/*     */   public int a() {
/*  96 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 104 */     return (this.a < 20);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 108 */     this.c = Math.min(this.c + ☃, 40.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float e() {
/* 116 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 120 */     this.a = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */