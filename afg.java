/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class afg
/*     */   extends afb
/*     */ {
/*  11 */   private el a = el.a;
/*  12 */   private float b = -1.0F;
/*     */   
/*     */   protected afg(aev<?> ☃, axy axy1) {
/*  15 */     super(☃, axy1);
/*     */   }
/*     */   
/*     */   public float a(el ☃) {
/*  19 */     return a(☃, this.m);
/*     */   }
/*     */   
/*     */   public float a(el ☃, ayc ayc1) {
/*  23 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/*  28 */     return (super.a(☃, bool) && a(new el(this.q, (bD()).b, this.s), ☃) >= 0.0F);
/*     */   }
/*     */   
/*     */   public boolean dr() {
/*  32 */     return !this.bx.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ds() {
/*  37 */     return f(new el(this));
/*     */   }
/*     */   
/*     */   public boolean f(el ☃) {
/*  41 */     if (this.b == -1.0F) {
/*  42 */       return true;
/*     */     }
/*  44 */     return (this.a.n(☃) < (this.b * this.b));
/*     */   }
/*     */   
/*     */   public void a(el ☃, int i) {
/*  48 */     this.a = ☃;
/*  49 */     this.b = i;
/*     */   }
/*     */   
/*     */   public el dt() {
/*  53 */     return this.a;
/*     */   }
/*     */   
/*     */   public float du() {
/*  57 */     return this.b;
/*     */   }
/*     */   
/*     */   public void dv() {
/*  61 */     this.b = -1.0F;
/*     */   }
/*     */   
/*     */   public boolean dw() {
/*  65 */     return (this.b != -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dl() {
/*  70 */     super.dl();
/*     */     
/*  72 */     if (dm() && dn() != null && (dn()).m == this.m) {
/*     */       
/*  74 */       aer ☃ = dn();
/*  75 */       a(new el((int)☃.q, (int)☃.r, (int)☃.s), 5);
/*     */       
/*  77 */       float f = g(☃);
/*     */       
/*  79 */       if (this instanceof afl && ((afl)this).dA()) {
/*  80 */         if (f > 10.0F) {
/*  81 */           a(true, true);
/*     */         }
/*     */         
/*     */         return;
/*     */       } 
/*  86 */       u(f);
/*     */       
/*  88 */       if (f > 10.0F) {
/*  89 */         a(true, true);
/*  90 */         this.by.c(1);
/*  91 */       } else if (f > 6.0F) {
/*     */         
/*  93 */         double d1 = (☃.q - this.q) / f;
/*  94 */         double d2 = (☃.r - this.r) / f;
/*  95 */         double d3 = (☃.s - this.s) / f;
/*     */         
/*  97 */         this.t += d1 * Math.abs(d1) * 0.4D;
/*  98 */         this.u += d2 * Math.abs(d2) * 0.4D;
/*  99 */         this.v += d3 * Math.abs(d3) * 0.4D;
/*     */       } else {
/* 101 */         this.by.d(1);
/* 102 */         float f1 = 2.0F;
/*     */         
/* 104 */         cee cee = (new cee(☃.q - this.q, ☃.r - this.r, ☃.s - this.s)).a().a(Math.max(f - 2.0F, 0.0F));
/* 105 */         t().a(this.q + cee.b, this.r + cee.c, this.s + cee.d, dx());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected double dx() {
/* 111 */     return 1.0D;
/*     */   }
/*     */   
/*     */   protected void u(float ☃) {}
/*     */ }


/* Location:              F:\dw\server.jar!\afg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */