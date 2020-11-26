/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ang
/*     */   extends afg
/*     */   implements amy
/*     */ {
/*     */   protected ang(aev<?> ☃, axy axy1) {
/*  19 */     super(☃, axy1);
/*  20 */     this.b_ = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/*  25 */     return wk.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  30 */     cy();
/*  31 */     float ☃ = az();
/*  32 */     if (☃ > 0.5F) {
/*  33 */       this.aY += 2;
/*     */     }
/*  35 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  40 */     super.R_();
/*  41 */     if (!this.m.B && this.m.aj() == adi.a) {
/*  42 */       V();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ad() {
/*  48 */     return wj.ed;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ae() {
/*  53 */     return wj.ec;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/*  58 */     if (b(☃)) {
/*  59 */       return false;
/*     */     }
/*  61 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  66 */     return wj.ea;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  71 */     return wj.dZ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi m(int ☃) {
/*  76 */     if (☃ > 4) {
/*  77 */       return wj.dY;
/*     */     }
/*  79 */     return wj.eb;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(el ☃, ayc ayc1) {
/*  85 */     return 0.5F - ayc1.A(☃);
/*     */   }
/*     */   
/*     */   protected boolean K_() {
/*  89 */     el ☃ = new el(this.q, (bD()).b, this.s);
/*     */     
/*  91 */     if (this.m.a(ayi.a, ☃) > this.T.nextInt(32)) {
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     int i = this.m.Y() ? this.m.d(☃, 10) : this.m.C(☃);
/*  96 */     return (i <= this.T.nextInt(8));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 101 */     return (☃.aj() != adi.a && K_() && super.a(☃, bool));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 106 */     super.bZ();
/*     */     
/* 108 */     cz().b(ank.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean cc() {
/* 113 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c(aog ☃) {
/* 117 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ang.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */