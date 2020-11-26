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
/*     */ public class apn
/*     */   extends aph
/*     */ {
/*  26 */   private static final or<Boolean> c = ou.a((Class)apn.class, ot.i);
/*     */   
/*     */   private int d;
/*     */   public double a;
/*     */   public double b;
/*  31 */   private static final avh e = avh.a(new axx[] { atf.k, atf.l });
/*     */   
/*     */   public apn(axy ☃) {
/*  34 */     super(aev.Q, ☃);
/*     */   }
/*     */   
/*     */   public apn(axy ☃, double d1, double d2, double d3) {
/*  38 */     super(aev.Q, ☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public aph.a v() {
/*  43 */     return aph.a.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  48 */     super.x_();
/*  49 */     this.ab.a(c, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  54 */     super.R_();
/*     */     
/*  56 */     if (this.d > 0) {
/*  57 */       this.d--;
/*     */     }
/*  59 */     if (this.d <= 0) {
/*  60 */       this.a = 0.0D;
/*  61 */       this.b = 0.0D;
/*     */     } 
/*  63 */     o((this.d > 0));
/*     */     
/*  65 */     if (f() && this.T.nextInt(4) == 0) {
/*  66 */       this.m.a(fm.F, this.q, this.r + 0.8D, this.s, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected double p() {
/*  72 */     return 0.2D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/*  77 */     super.a(☃);
/*     */     
/*  79 */     if (!☃.d() && this.m.X().b("doEntityDrops")) {
/*  80 */       a(bct.cr);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(el ☃, blc blc1) {
/*  86 */     super.b(☃, blc1);
/*     */     
/*  88 */     double d = this.a * this.a + this.b * this.b;
/*  89 */     if (d > 1.0E-4D && this.t * this.t + this.v * this.v > 0.001D) {
/*  90 */       d = xq.a(d);
/*  91 */       this.a /= d;
/*  92 */       this.b /= d;
/*     */       
/*  94 */       if (this.a * this.t + this.b * this.v < 0.0D) {
/*  95 */         this.a = 0.0D;
/*  96 */         this.b = 0.0D;
/*     */       } else {
/*  98 */         double d1 = d / p();
/*  99 */         this.a *= d1;
/* 100 */         this.b *= d1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void r() {
/* 107 */     double ☃ = this.a * this.a + this.b * this.b;
/*     */     
/* 109 */     if (☃ > 1.0E-4D) {
/* 110 */       ☃ = xq.a(☃);
/* 111 */       this.a /= ☃;
/* 112 */       this.b /= ☃;
/* 113 */       double d = 1.0D;
/* 114 */       this.t *= 0.800000011920929D;
/* 115 */       this.u *= 0.0D;
/* 116 */       this.v *= 0.800000011920929D;
/* 117 */       this.t += this.a * 1.0D;
/* 118 */       this.v += this.b * 1.0D;
/*     */     } else {
/* 120 */       this.t *= 0.9800000190734863D;
/* 121 */       this.u *= 0.0D;
/* 122 */       this.v *= 0.9800000190734863D;
/*     */     } 
/*     */     
/* 125 */     super.r();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(aog ☃, adk adk1) {
/* 130 */     ate ate = ☃.b(adk1);
/* 131 */     if (e.a(ate) && this.d + 3600 <= 32000) {
/* 132 */       if (!☃.bV.d) {
/* 133 */         ate.g(1);
/*     */       }
/* 135 */       this.d += 3600;
/*     */     } 
/*     */     
/* 138 */     this.a = this.q - ☃.q;
/* 139 */     this.b = this.s - ☃.s;
/*     */     
/* 141 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 146 */     super.b(☃);
/* 147 */     ☃.a("PushX", this.a);
/* 148 */     ☃.a("PushZ", this.b);
/* 149 */     ☃.a("Fuel", (short)this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 154 */     super.a(☃);
/* 155 */     this.a = ☃.k("PushX");
/* 156 */     this.b = ☃.k("PushZ");
/* 157 */     this.d = ☃.g("Fuel");
/*     */   }
/*     */   
/*     */   protected boolean f() {
/* 161 */     return ((Boolean)this.ab.<Boolean>a(c)).booleanValue();
/*     */   }
/*     */   
/*     */   protected void o(boolean ☃) {
/* 165 */     this.ab.b(c, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc z() {
/* 170 */     return bct.cr.p().a(bex.a, eq.c).a(bex.b, Boolean.valueOf(f()));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */