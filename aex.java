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
/*     */ public class aex
/*     */   extends aer
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*  23 */   private int d = 5;
/*     */   private int e;
/*     */   private aog f;
/*     */   private int g;
/*     */   
/*     */   public aex(axy ☃, double d1, double d2, double d3, int i) {
/*  29 */     super(aev.w, ☃);
/*  30 */     a(0.5F, 0.5F);
/*  31 */     b(d1, d2, d3);
/*     */     
/*  33 */     this.w = (float)(Math.random() * 360.0D);
/*     */     
/*  35 */     this.t = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
/*  36 */     this.u = ((float)(Math.random() * 0.2D) * 2.0F);
/*  37 */     this.v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
/*     */     
/*  39 */     this.e = i;
/*     */   }
/*     */   
/*     */   public aex(axy ☃) {
/*  43 */     super(aev.w, ☃);
/*  44 */     a(0.25F, 0.25F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  49 */     return false;
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
/*     */   
/*     */   protected void x_() {}
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
/*     */   public void R_() {
/*  73 */     super.R_();
/*  74 */     if (this.c > 0) {
/*  75 */       this.c--;
/*     */     }
/*  77 */     this.n = this.q;
/*  78 */     this.o = this.r;
/*  79 */     this.p = this.s;
/*     */     
/*  81 */     if (a(ww.a)) {
/*  82 */       k();
/*  83 */     } else if (!aj()) {
/*  84 */       this.u -= 0.029999999329447746D;
/*     */     } 
/*     */     
/*  87 */     if (this.m.b(new el(this)).a(ww.b)) {
/*  88 */       this.u = 0.20000000298023224D;
/*  89 */       this.t = ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/*  90 */       this.v = ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/*  91 */       a(wj.cN, 0.4F, 2.0F + this.T.nextFloat() * 0.4F);
/*     */     } 
/*  93 */     i(this.q, ((bD()).b + (bD()).e) / 2.0D, this.s);
/*     */     
/*  95 */     double ☃ = 8.0D;
/*     */ 
/*     */     
/*  98 */     if (this.g < this.a - 20 + Q() % 100) {
/*  99 */       if (this.f == null || this.f.h(this) > 64.0D) {
/* 100 */         this.f = this.m.a(this, 8.0D);
/*     */       }
/* 102 */       this.g = this.a;
/*     */     } 
/*     */     
/* 105 */     if (this.f != null && this.f.t()) {
/* 106 */       this.f = null;
/*     */     }
/*     */     
/* 109 */     if (this.f != null) {
/* 110 */       double d1 = (this.f.q - this.q) / 8.0D;
/* 111 */       double d2 = (this.f.r + this.f.bF() / 2.0D - this.r) / 8.0D;
/* 112 */       double d3 = (this.f.s - this.s) / 8.0D;
/* 113 */       double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/* 114 */       double d5 = 1.0D - d4;
/* 115 */       if (d5 > 0.0D) {
/* 116 */         d5 *= d5;
/* 117 */         this.t += d1 / d4 * d5 * 0.1D;
/* 118 */         this.u += d2 / d4 * d5 * 0.1D;
/* 119 */         this.v += d3 / d4 * d5 * 0.1D;
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     a(afe.a, this.t, this.u, this.v);
/*     */     
/* 125 */     float f = 0.98F;
/* 126 */     if (this.A) {
/* 127 */       f = this.m.a_(new el(xq.c(this.q), xq.c((bD()).b) - 1, xq.c(this.s))).c().n() * 0.98F;
/*     */     }
/*     */     
/* 130 */     this.t *= f;
/* 131 */     this.u *= 0.9800000190734863D;
/* 132 */     this.v *= f;
/*     */     
/* 134 */     if (this.A) {
/* 135 */       this.u *= -0.8999999761581421D;
/*     */     }
/*     */     
/* 138 */     this.a++;
/*     */     
/* 140 */     this.b++;
/* 141 */     if (this.b >= 6000) {
/* 142 */       V();
/*     */     }
/*     */   }
/*     */   
/*     */   private void k() {
/* 147 */     this.u += 5.000000237487257E-4D;
/* 148 */     this.u = Math.min(this.u, 0.05999999865889549D);
/* 149 */     this.t *= 0.9900000095367432D;
/* 150 */     this.v *= 0.9900000095367432D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void au() {}
/*     */ 
/*     */   
/*     */   protected void g(int ☃) {
/* 159 */     a(aea.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 164 */     if (b(☃)) {
/* 165 */       return false;
/*     */     }
/* 167 */     aA();
/* 168 */     this.d = (int)(this.d - f);
/* 169 */     if (this.d <= 0) {
/* 170 */       V();
/*     */     }
/* 172 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 177 */     ☃.a("Health", (short)this.d);
/* 178 */     ☃.a("Age", (short)this.b);
/* 179 */     ☃.a("Value", (short)this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 184 */     this.d = ☃.g("Health");
/* 185 */     this.b = ☃.g("Age");
/* 186 */     this.e = ☃.g("Value");
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 191 */     if (this.m.B) {
/*     */       return;
/*     */     }
/*     */     
/* 195 */     if (this.c == 0 && ☃.bJ == 0) {
/* 196 */       ☃.bJ = 2;
/* 197 */       ☃.a(this, 1);
/* 198 */       ate ate = awg.b(awi.G, ☃);
/* 199 */       if (!ate.a() && ate.f()) {
/* 200 */         int i = Math.min(c(this.e), ate.g());
/* 201 */         this.e -= b(i);
/* 202 */         ate.b(ate.g() - i);
/*     */       } 
/* 204 */       if (this.e > 0) {
/* 205 */         ☃.d(this.e);
/*     */       }
/* 207 */       V();
/*     */     } 
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 212 */     return ☃ / 2;
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/* 216 */     return ☃ * 2;
/*     */   }
/*     */   
/*     */   public int f() {
/* 220 */     return this.e;
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
/*     */   public static int a(int ☃) {
/* 258 */     if (☃ >= 2477)
/* 259 */       return 2477; 
/* 260 */     if (☃ >= 1237)
/* 261 */       return 1237; 
/* 262 */     if (☃ >= 617)
/* 263 */       return 617; 
/* 264 */     if (☃ >= 307)
/* 265 */       return 307; 
/* 266 */     if (☃ >= 149)
/* 267 */       return 149; 
/* 268 */     if (☃ >= 73)
/* 269 */       return 73; 
/* 270 */     if (☃ >= 37)
/* 271 */       return 37; 
/* 272 */     if (☃ >= 17)
/* 273 */       return 17; 
/* 274 */     if (☃ >= 7)
/* 275 */       return 7; 
/* 276 */     if (☃ >= 3) {
/* 277 */       return 3;
/*     */     }
/*     */     
/* 280 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bk() {
/* 285 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */