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
/*     */ public class amx
/*     */   extends ang
/*     */ {
/*     */   private int a;
/*     */   private boolean b;
/*     */   
/*     */   public amx(axy ☃) {
/*  35 */     super(aev.t, ☃);
/*  36 */     this.b_ = 3;
/*     */     
/*  38 */     a(0.4F, 0.3F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  43 */     this.by.a(1, new agm(this));
/*  44 */     this.by.a(2, new ahe(this, 1.0D, false));
/*  45 */     this.by.a(3, new aih(this, 1.0D));
/*  46 */     this.by.a(7, new ahb(this, (Class)aog.class, 8.0F));
/*  47 */     this.by.a(8, new ahq(this));
/*     */     
/*  49 */     this.bz.a(1, new ail(this, true, new Class[0]));
/*  50 */     this.bz.a(2, new aio<>(this, aog.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  55 */     return 0.1F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  60 */     super.bZ();
/*     */     
/*  62 */     a(ank.a).a(8.0D);
/*  63 */     a(ank.d).a(0.25D);
/*  64 */     a(ank.f).a(2.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  74 */     return wj.ce;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  79 */     return wj.cg;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  84 */     return wj.cf;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/*  89 */     a(wj.ch, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/*  95 */     return ccl.as;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 100 */     super.a(☃);
/* 101 */     this.a = ☃.h("Lifetime");
/* 102 */     this.b = ☃.q("PlayerSpawned");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 107 */     super.b(☃);
/* 108 */     ☃.b("Lifetime", this.a);
/* 109 */     ☃.a("PlayerSpawned", this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void R_() {
/* 115 */     this.aQ = this.w;
/*     */     
/* 117 */     super.R_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(float ☃) {
/* 122 */     this.w = ☃;
/* 123 */     super.k(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public double aI() {
/* 128 */     return 0.1D;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 132 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 136 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 141 */     super.k();
/*     */     
/* 143 */     if (this.m.B) {
/* 144 */       for (int ☃ = 0; ☃ < 2; ☃++) {
/* 145 */         this.m.a(fm.K, this.q + (this.T.nextDouble() - 0.5D) * this.H, this.r + this.T.nextDouble() * this.I, this.s + (this.T.nextDouble() - 0.5D) * this.H, (this.T.nextDouble() - 0.5D) * 2.0D, -this.T.nextDouble(), (this.T.nextDouble() - 0.5D) * 2.0D);
/*     */       }
/*     */     } else {
/* 148 */       if (!dk()) {
/* 149 */         this.a++;
/*     */       }
/*     */       
/* 152 */       if (this.a >= 2400) {
/* 153 */         V();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean K_() {
/* 160 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 165 */     if (super.a(☃, bool)) {
/* 166 */       aog aog = ☃.a(this, 5.0D);
/* 167 */       return (aog == null);
/*     */     } 
/* 169 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 174 */     return afd.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */