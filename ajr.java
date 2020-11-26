/*     */ import javax.annotation.Nullable;
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
/*     */ public class ajr
/*     */   extends ajq
/*     */ {
/*  36 */   private static final avh bK = avh.a(new axx[] { atf.R, atf.bV, atf.bU, atf.eO });
/*     */   
/*     */   public float bC;
/*     */   public float bD;
/*     */   public float bE;
/*     */   public float bG;
/*  42 */   public float bH = 1.0F;
/*     */   public int bI;
/*     */   public boolean bJ;
/*     */   
/*     */   public ajr(axy ☃) {
/*  47 */     super(aev.h, ☃);
/*  48 */     a(0.4F, 0.7F);
/*  49 */     this.bI = this.T.nextInt(6000) + 6000;
/*     */     
/*  51 */     a(cba.g, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  56 */     this.by.a(0, new agm(this));
/*  57 */     this.by.a(1, new aho(this, 1.4D));
/*  58 */     this.by.a(2, new agi(this, 1.0D));
/*  59 */     this.by.a(3, new aic(this, 1.0D, false, bK));
/*  60 */     this.by.a(4, new ags(this, 1.1D));
/*  61 */     this.by.a(5, new aih(this, 1.0D));
/*  62 */     this.by.a(6, new ahb(this, (Class)aog.class, 6.0F));
/*  63 */     this.by.a(7, new ahq(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  68 */     return this.I;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  73 */     super.bZ();
/*     */     
/*  75 */     a(ank.a).a(4.0D);
/*  76 */     a(ank.d).a(0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  81 */     super.k();
/*     */     
/*  83 */     this.bG = this.bC;
/*  84 */     this.bE = this.bD;
/*     */     
/*  86 */     this.bD = (float)(this.bD + (this.A ? -1 : 4) * 0.3D);
/*  87 */     this.bD = xq.a(this.bD, 0.0F, 1.0F);
/*     */     
/*  89 */     if (!this.A && this.bH < 1.0F) {
/*  90 */       this.bH = 1.0F;
/*     */     }
/*  92 */     this.bH = (float)(this.bH * 0.9D);
/*     */     
/*  94 */     if (!this.A && this.u < 0.0D) {
/*  95 */       this.u *= 0.6D;
/*     */     }
/*     */     
/*  98 */     this.bC += this.bH * 2.0F;
/*     */     
/* 100 */     if (!this.m.B && !y_() && !dy() && --this.bI <= 0) {
/* 101 */       a(wj.ay, 1.0F, (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/* 102 */       a(atf.aW);
/* 103 */       this.bI = this.T.nextInt(6000) + 6000;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {}
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 113 */     return wj.aw;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 118 */     return wj.az;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 123 */     return wj.ax;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 128 */     a(wj.aA, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 134 */     return ccl.J;
/*     */   }
/*     */ 
/*     */   
/*     */   public ajr b(aeo ☃) {
/* 139 */     return new ajr(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/* 144 */     return bK.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(aog ☃) {
/* 149 */     if (dy()) {
/* 150 */       return 10;
/*     */     }
/* 152 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 157 */     super.a(☃);
/* 158 */     this.bJ = ☃.q("IsChickenJockey");
/* 159 */     if (☃.e("EggLayTime")) {
/* 160 */       this.bI = ☃.h("EggLayTime");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 166 */     super.b(☃);
/* 167 */     ☃.a("IsChickenJockey", this.bJ);
/* 168 */     ☃.b("EggLayTime", this.bI);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean H() {
/* 173 */     return (dy() && !aX());
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(aer ☃) {
/* 178 */     super.k(☃);
/* 179 */     float f1 = xq.a(this.aQ * 0.017453292F);
/* 180 */     float f2 = xq.b(this.aQ * 0.017453292F);
/* 181 */     float f3 = 0.1F;
/* 182 */     float f4 = 0.0F;
/*     */     
/* 184 */     ☃.b(this.q + (0.1F * f1), this.r + (this.I * 0.5F) + ☃.aI() + 0.0D, this.s - (0.1F * f2));
/* 185 */     if (☃ instanceof afa) {
/* 186 */       ((afa)☃).aQ = this.aQ;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean dy() {
/* 191 */     return this.bJ;
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {
/* 195 */     this.bJ = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */