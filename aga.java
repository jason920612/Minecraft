/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aga
/*     */ {
/*     */   protected final afb a;
/*     */   protected float b;
/*     */   protected float c;
/*     */   protected boolean d;
/*     */   protected double e;
/*     */   protected double f;
/*     */   protected double g;
/*     */   
/*     */   public aga(afb ☃) {
/*  18 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(aer ☃, float f1, float f2) {
/*  22 */     this.e = ☃.q;
/*  23 */     if (☃ instanceof afa) {
/*  24 */       this.f = ☃.r + ☃.bF();
/*     */     } else {
/*  26 */       this.f = ((☃.bD()).b + (☃.bD()).e) / 2.0D;
/*     */     } 
/*  28 */     this.g = ☃.s;
/*  29 */     this.b = f1;
/*  30 */     this.c = f2;
/*  31 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2) {
/*  35 */     this.e = ☃;
/*  36 */     this.f = d1;
/*  37 */     this.g = d2;
/*  38 */     this.b = f1;
/*  39 */     this.c = f2;
/*  40 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void a() {
/*  44 */     this.a.x = 0.0F;
/*     */     
/*  46 */     if (this.d) {
/*  47 */       this.d = false;
/*     */       
/*  49 */       double d1 = this.e - this.a.q;
/*  50 */       double d2 = this.f - this.a.r + this.a.bF();
/*  51 */       double d3 = this.g - this.a.s;
/*  52 */       double d4 = xq.a(d1 * d1 + d3 * d3);
/*     */       
/*  54 */       float f1 = (float)(xq.c(d3, d1) * 57.2957763671875D) - 90.0F;
/*  55 */       float f2 = (float)-(xq.c(d2, d4) * 57.2957763671875D);
/*  56 */       this.a.x = a(this.a.x, f2, this.c);
/*  57 */       this.a.aS = a(this.a.aS, f1, this.b);
/*     */     } else {
/*  59 */       this.a.aS = a(this.a.aS, this.a.aQ, 10.0F);
/*     */     } 
/*     */     
/*  62 */     float ☃ = xq.g(this.a.aS - this.a.aQ);
/*     */     
/*  64 */     if (!this.a.t().p()) {
/*     */       
/*  66 */       if (☃ < -75.0F) {
/*  67 */         this.a.aS = this.a.aQ - 75.0F;
/*     */       }
/*  69 */       if (☃ > 75.0F) {
/*  70 */         this.a.aS = this.a.aQ + 75.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected float a(float ☃, float f1, float f2) {
/*  76 */     float f = xq.g(f1 - ☃);
/*  77 */     if (f > f2) {
/*  78 */       f = f2;
/*     */     }
/*  80 */     if (f < -f2) {
/*  81 */       f = -f2;
/*     */     }
/*  83 */     return ☃ + f;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  87 */     return this.d;
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
/*     */   public double e() {
/*  99 */     return this.e;
/*     */   }
/*     */   
/*     */   public double f() {
/* 103 */     return this.f;
/*     */   }
/*     */   
/*     */   public double g() {
/* 107 */     return this.g;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */