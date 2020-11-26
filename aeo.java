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
/*     */ public abstract class aeo
/*     */   extends afg
/*     */ {
/*  19 */   private static final or<Boolean> bC = ou.a((Class)aeo.class, ot.i);
/*     */   
/*     */   protected int a;
/*     */   
/*     */   protected int b;
/*     */   
/*     */   protected int c;
/*     */   private float bD;
/*     */   private float bE;
/*     */   
/*     */   protected aeo(aev<?> ☃, axy axy1) {
/*  30 */     super(☃, axy1);
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
/* 170 */     this.bD = -1.0F;
/*     */   }
/*     */   @Nullable public abstract aeo a(aeo paramaeo);
/*     */   public boolean a(aog ☃, adk adk1) { ate ate = ☃.b(adk1); ata ata = ate.b(); if (ata instanceof auc && ((auc)ata).a(ate.n(), P())) { if (!this.m.B) { aeo aeo1 = a(this); if (aeo1 != null) { aeo1.b_(-24000); aeo1.b(this.q, this.r, this.s, 0.0F, 0.0F); this.m.a(aeo1); if (ate.s()) aeo1.b(ate.q());  if (!☃.bV.d) ate.g(1);  }  }  return true; }  return false; }
/*     */   protected void x_() { super.x_(); this.ab.a(bC, Boolean.valueOf(false)); }
/* 175 */   public int i() { if (this.m.B) return ((Boolean)this.ab.<Boolean>a(bC)).booleanValue() ? -1 : 1;  return this.a; } public void a(int ☃, boolean bool) { int i = i(); int j = i; i += ☃ * 20; if (i > 0) { i = 0; if (j < 0) l();  }  int k = i - j; b_(i); if (bool) { this.b += k; if (this.c == 0) this.c = 40;  }  if (i() == 0) b_(this.b);  } public void a(int ☃) { a(☃, false); } public void b_(int ☃) { this.ab.b(bC, Boolean.valueOf((☃ < 0))); this.a = ☃; a(y_()); } protected final void a(float ☃, float f1) { this.bD = ☃;
/* 176 */     this.bE = f1;
/* 177 */     a(1.0F); }
/*     */   public void b(gy ☃) { super.b(☃); ☃.b("Age", i()); ☃.b("ForcedAge", this.b); }
/*     */   public void a(gy ☃) { super.a(☃); b_(☃.h("Age")); this.b = ☃.h("ForcedAge"); }
/*     */   public void a(or<?> ☃) { if (bC.equals(☃)) a(y_());  super.a(☃); }
/* 181 */   public void k() { super.k(); if (this.m.B) { if (this.c > 0) { if (this.c % 4 == 0) this.m.a(fm.z, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H, this.r + 0.5D + (this.T.nextFloat() * this.I), this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H, 0.0D, 0.0D, 0.0D);  this.c--; }  } else { int ☃ = i(); if (☃ < 0) { ☃++; b_(☃); if (☃ == 0) l();  } else if (☃ > 0) { ☃--; b_(☃); }  }  } protected void l() {} public boolean y_() { return (i() < 0); } public void a(boolean ☃) { a(☃ ? 0.5F : 1.0F); } protected final void a(float ☃) { super.a(this.bD * ☃, this.bE * ☃); }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\aeo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */