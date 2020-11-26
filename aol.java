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
/*     */ public abstract class aol
/*     */   extends aer
/*     */ {
/*     */   public afa a;
/*     */   private int e;
/*     */   private int f;
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   
/*     */   protected aol(aev<?> ☃, axy axy1, float f1, float f2) {
/*  27 */     super(☃, axy1);
/*  28 */     a(f1, f2);
/*     */   }
/*     */   
/*     */   public aol(aev<?> ☃, double d1, double d2, double d3, double d4, double d5, double d6, axy axy1, float f1, float f2) {
/*  32 */     this(☃, axy1, f1, f2);
/*     */     
/*  34 */     b(d1, d2, d3, this.w, this.x);
/*  35 */     b(d1, d2, d3);
/*     */     
/*  37 */     double d = xq.a(d4 * d4 + d5 * d5 + d6 * d6);
/*  38 */     this.b = d4 / d * 0.1D;
/*  39 */     this.c = d5 / d * 0.1D;
/*  40 */     this.d = d6 / d * 0.1D;
/*     */   }
/*     */   
/*     */   public aol(aev<?> ☃, afa afa1, double d1, double d2, double d3, axy axy1, float f1, float f2) {
/*  44 */     this(☃, axy1, f1, f2);
/*  45 */     this.a = afa1;
/*     */     
/*  47 */     b(afa1.q, afa1.r, afa1.s, afa1.w, afa1.x);
/*  48 */     b(this.q, this.r, this.s);
/*     */     
/*  50 */     this.t = 0.0D;
/*  51 */     this.u = 0.0D;
/*  52 */     this.v = 0.0D;
/*     */     
/*  54 */     d1 += this.T.nextGaussian() * 0.4D;
/*  55 */     d2 += this.T.nextGaussian() * 0.4D;
/*  56 */     d3 += this.T.nextGaussian() * 0.4D;
/*  57 */     double d = xq.a(d1 * d1 + d2 * d2 + d3 * d3);
/*  58 */     this.b = d1 / d * 0.1D;
/*  59 */     this.c = d2 / d * 0.1D;
/*  60 */     this.d = d3 / d * 0.1D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void x_() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void R_() {
/*  79 */     if (!this.m.B && ((this.a != null && this.a.G) || !this.m.D(new el(this)))) {
/*  80 */       V();
/*     */       
/*     */       return;
/*     */     } 
/*  84 */     super.R_();
/*  85 */     if (f()) {
/*  86 */       f(1);
/*     */     }
/*     */     
/*  89 */     this.f++;
/*     */     
/*  91 */     ceb ☃ = aou.a(this, true, (this.f >= 25), this.a);
/*  92 */     if (☃ != null) {
/*  93 */       a(☃);
/*     */     }
/*     */     
/*  96 */     this.q += this.t;
/*  97 */     this.r += this.u;
/*  98 */     this.s += this.v;
/*     */     
/* 100 */     aou.a(this, 0.2F);
/*     */     
/* 102 */     float f = k();
/* 103 */     if (an()) {
/* 104 */       for (int i = 0; i < 4; i++) {
/* 105 */         float f1 = 0.25F;
/* 106 */         this.m.a(fm.e, this.q - this.t * 0.25D, this.r - this.u * 0.25D, this.s - this.v * 0.25D, this.t, this.u, this.v);
/*     */       } 
/* 108 */       f = 0.8F;
/*     */     } 
/*     */     
/* 111 */     this.t += this.b;
/* 112 */     this.u += this.c;
/* 113 */     this.v += this.d;
/* 114 */     this.t *= f;
/* 115 */     this.u *= f;
/* 116 */     this.v *= f;
/*     */     
/* 118 */     this.m.a(i(), this.q, this.r + 0.5D, this.s, 0.0D, 0.0D, 0.0D);
/*     */     
/* 120 */     b(this.q, this.r, this.s);
/*     */   }
/*     */   
/*     */   protected boolean f() {
/* 124 */     return true;
/*     */   }
/*     */   
/*     */   protected fk i() {
/* 128 */     return fm.M;
/*     */   }
/*     */   
/*     */   protected float k() {
/* 132 */     return 0.95F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(ceb paramceb);
/*     */   
/*     */   public void b(gy ☃) {
/* 139 */     ☃.a("direction", a(new double[] { this.t, this.u, this.v }));
/* 140 */     ☃.a("power", a(new double[] { this.b, this.c, this.d }));
/* 141 */     ☃.b("life", this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 146 */     if (☃.c("power", 9)) {
/* 147 */       he he = ☃.d("power", 6);
/* 148 */       if (he.size() == 3) {
/* 149 */         this.b = he.k(0);
/* 150 */         this.c = he.k(1);
/* 151 */         this.d = he.k(2);
/*     */       } 
/*     */     } 
/*     */     
/* 155 */     this.e = ☃.h("life");
/*     */ 
/*     */ 
/*     */     
/* 159 */     if (☃.c("direction", 9) && ☃.d("direction", 6).size() == 3) {
/* 160 */       he he = ☃.d("direction", 6);
/* 161 */       this.t = he.k(0);
/* 162 */       this.u = he.k(1);
/* 163 */       this.v = he.k(2);
/*     */     } else {
/* 165 */       V();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float aM() {
/* 176 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 181 */     if (b(☃)) {
/* 182 */       return false;
/*     */     }
/* 184 */     aA();
/*     */     
/* 186 */     if (☃.k() != null) {
/* 187 */       cee cee = ☃.k().aN();
/* 188 */       if (cee != null) {
/* 189 */         this.t = cee.b;
/* 190 */         this.u = cee.c;
/* 191 */         this.v = cee.d;
/* 192 */         this.b = this.t * 0.1D;
/* 193 */         this.c = this.u * 0.1D;
/* 194 */         this.d = this.v * 0.1D;
/*     */       } 
/* 196 */       if (☃.k() instanceof afa) {
/* 197 */         this.a = (afa)☃.k();
/*     */       }
/* 199 */       return true;
/*     */     } 
/* 201 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float az() {
/* 206 */     return 1.0F;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */