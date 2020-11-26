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
/*     */ public class apq
/*     */   extends aph
/*     */ {
/*  25 */   private int a = -1;
/*     */   
/*     */   public apq(axy ☃) {
/*  28 */     super(aev.T, ☃);
/*     */   }
/*     */   
/*     */   public apq(axy ☃, double d1, double d2, double d3) {
/*  32 */     super(aev.T, ☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public aph.a v() {
/*  37 */     return aph.a.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc z() {
/*  42 */     return bct.cb.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  47 */     super.R_();
/*     */     
/*  49 */     if (this.a > 0) {
/*  50 */       this.a--;
/*  51 */       this.m.a(fm.M, this.q, this.r + 0.5D, this.s, 0.0D, 0.0D, 0.0D);
/*  52 */     } else if (this.a == 0) {
/*  53 */       c(this.t * this.t + this.v * this.v);
/*     */     } 
/*     */     
/*  56 */     if (this.B) {
/*  57 */       double ☃ = this.t * this.t + this.v * this.v;
/*     */       
/*  59 */       if (☃ >= 0.009999999776482582D) {
/*  60 */         c(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/*  67 */     aer aer = ☃.j();
/*  68 */     if (aer instanceof aok) {
/*  69 */       aok aok = (aok)aer;
/*  70 */       if (aok.aV()) {
/*  71 */         c(aok.t * aok.t + aok.u * aok.u + aok.v * aok.v);
/*     */       }
/*     */     } 
/*  74 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/*  79 */     double d = this.t * this.t + this.v * this.v;
/*     */     
/*  81 */     if (☃.p() || ☃.d() || d >= 0.009999999776482582D) {
/*  82 */       if (this.a < 0) {
/*  83 */         f();
/*  84 */         this.a = this.T.nextInt(20) + this.T.nextInt(20);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*  89 */     super.a(☃);
/*     */     
/*  91 */     if (!☃.d() && this.m.X().b("doEntityDrops")) {
/*  92 */       a(bct.cb);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(double ☃) {
/*  97 */     if (!this.m.B) {
/*  98 */       double d = Math.sqrt(☃);
/*  99 */       if (d > 5.0D) {
/* 100 */         d = 5.0D;
/*     */       }
/* 102 */       this.m.a(this, this.q, this.r, this.s, (float)(4.0D + this.T.nextDouble() * 1.5D * d), true);
/* 103 */       V();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {
/* 109 */     if (☃ >= 3.0F) {
/* 110 */       float f = ☃ / 10.0F;
/* 111 */       c((f * f));
/*     */     } 
/*     */     
/* 114 */     super.c(☃, f1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/* 119 */     if (bool && this.a < 0) {
/* 120 */       f();
/*     */     }
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
/*     */   public void f() {
/* 134 */     this.a = 80;
/*     */     
/* 136 */     if (!this.m.B) {
/* 137 */       this.m.a(this, (byte)10);
/* 138 */       if (!ai()) {
/* 139 */         this.m.a((aog)null, this.q, this.r, this.s, wj.jF, wk.e, 1.0F, 1.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k() {
/* 149 */     return (this.a > -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(axr ☃, axk axk1, el el1, blc blc1, byw byw1, float f) {
/* 154 */     if (k() && (blc1.a(wv.z) || axk1.a_(el1.a()).a(wv.z))) {
/* 155 */       return 0.0F;
/*     */     }
/*     */     
/* 158 */     return super.a(☃, axk1, el1, blc1, byw1, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axr ☃, axk axk1, el el1, blc blc1, float f) {
/* 163 */     if (k() && (blc1.a(wv.z) || axk1.a_(el1.a()).a(wv.z))) {
/* 164 */       return false;
/*     */     }
/*     */     
/* 167 */     return super.a(☃, axk1, el1, blc1, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 172 */     super.a(☃);
/* 173 */     if (☃.c("TNTFuse", 99)) {
/* 174 */       this.a = ☃.h("TNTFuse");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 180 */     super.b(☃);
/* 181 */     ☃.b("TNTFuse", this.a);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */