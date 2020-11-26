/*     */ import java.time.LocalDate;
/*     */ import java.time.temporal.ChronoField;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class anw
/*     */   extends ang
/*     */ {
/*  65 */   protected static final afm c = (new aft(null, "zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).a("Spawn Reinforcements Chance");
/*  66 */   private static final UUID a = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
/*  67 */   private static final afo b = new afo(a, "Baby speed boost", 0.5D, 1);
/*     */   
/*  69 */   private static final or<Boolean> bC = ou.a((Class)anw.class, ot.i);
/*  70 */   private static final or<Integer> bD = ou.a((Class)anw.class, ot.b);
/*  71 */   private static final or<Boolean> bE = ou.a((Class)anw.class, ot.i);
/*  72 */   private static final or<Boolean> bF = ou.a((Class)anw.class, ot.i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   private final agg bG = new agg(this);
/*     */   private boolean bH;
/*     */   private int bI;
/*     */   private int bJ;
/*     */   private float bK;
/*     */   private float bL;
/*     */   public anw(axy ☃) { this(aev.aJ, ☃); }
/*  86 */   protected void n() { this.by.a(4, new a(this, bct.jG, this, 1.0D, 3)); this.by.a(5, new ahi(this, 1.0D)); this.by.a(8, new ahb(this, (Class)aog.class, 8.0F)); this.by.a(8, new ahq(this)); l(); } protected void l() { this.by.a(2, new aii(this, 1.0D, false)); this.by.a(6, new ahg(this, 1.0D, false)); this.by.a(7, new aih(this, 1.0D)); this.bz.a(1, new ail(this, true, new Class[] { ani.class })); this.bz.a(2, new aio<>(this, aog.class, true)); this.bz.a(3, new aio<>(this, aob.class, false)); this.bz.a(3, new aio<>(this, ajw.class, true)); this.bz.a(5, new aio<>(this, (Class)akk.class, 10, true, false, akk.bC)); } protected void bZ() { super.bZ(); a(ank.b).a(35.0D); a(ank.d).a(0.23000000417232513D); a(ank.f).a(3.0D); a(ank.h).a(2.0D); cz().b(c).a(this.T.nextDouble() * 0.10000000149011612D); } protected void x_() { super.x_(); T().a(bC, Boolean.valueOf(false)); T().a(bD, Integer.valueOf(0)); T().a(bE, Boolean.valueOf(false)); T().a(bF, Boolean.valueOf(false)); } public boolean dG() { return ((Boolean)T().<Boolean>a(bF)).booleanValue(); } public void s(boolean ☃) { T().b(bE, Boolean.valueOf(☃)); } public boolean dH() { return this.bH; } public void t(boolean ☃) { if (dz()) { if (this.bH != ☃) { this.bH = ☃; ((aiv)t()).a(☃); if (☃) { this.by.a(1, this.bG); } else { this.by.a(this.bG); }  }  } else if (this.bH) { this.by.a(this.bG); this.bH = false; }  } protected boolean dz() { return true; } public anw(aev<?> ☃, axy axy1) { super(☃, axy1);
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
/* 588 */     this.bK = -1.0F; a(0.6F, 1.95F); }
/*     */   public boolean y_() { return ((Boolean)T().<Boolean>a(bC)).booleanValue(); }
/*     */   protected int b(aog ☃) { if (y_()) this.b_ = (int)(this.b_ * 2.5F);  return super.b(☃); }
/*     */   public void u(boolean ☃) { T().b(bC, Boolean.valueOf(☃)); if (this.m != null && !this.m.B) { afn afn = a(ank.d); afn.c(b); if (☃) afn.b(b);  }  v(☃); }
/*     */   public void a(or<?> ☃) { if (bC.equals(☃)) v(y_());  super.a(☃); }
/* 593 */   protected boolean dC() { return true; } public void R_() { if (!this.m.B) if (dG()) { this.bJ--; if (this.bJ < 0) dE();  } else if (dC()) { if (a(ww.a)) { this.bI++; if (this.bI >= 600) a(300);  } else { this.bI = -1; }  }   super.R_(); } public void k() { boolean ☃ = (L_() && dq()); if (☃) { ate ate = b(aew.f); if (!ate.a()) { if (ate.e()) { ate.b(ate.g() + this.T.nextInt(2)); if (ate.g() >= ate.h()) { c(ate); a(aew.f, ate.a); }  }  ☃ = false; }  if (☃) f(8);  }  super.k(); } private void a(int ☃) { this.bJ = ☃; T().b(bF, Boolean.valueOf(true)); } protected void dE() { a(new amu(this.m)); this.m.a((aog)null, 1040, new el((int)this.q, (int)this.r, (int)this.s), 0); } protected void a(anw ☃) { if (this.m.B || this.G) return;  ☃.u(this); ☃.a(dj(), dH(), y_(), do()); for (aew aew : aew.values()) { ate ate = b(aew); if (!ate.a()) { ☃.a(aew, ate); ☃.a(aew, c(aew)); }  }  if (O_()) { ☃.b(e()); ☃.m(by()); }  this.m.a(☃); V(); } protected final void a(float ☃, float f1) { boolean bool = (this.bK > 0.0F && this.bL > 0.0F);
/*     */     
/* 595 */     this.bK = ☃;
/* 596 */     this.bL = f1;
/*     */     
/* 598 */     if (!bool)
/* 599 */       v(1.0F);  } protected boolean L_() { return true; } public boolean a(aea ☃, float f) { if (super.a(☃, f)) { afa afa = v(); if (afa == null && ☃.k() instanceof afa) afa = (afa)☃.k();  if (afa != null && this.m.aj() == adi.d && this.T.nextFloat() < a(c).e() && this.m.X().b("doMobSpawning")) { int i = xq.c(this.q); int j = xq.c(this.r); int k = xq.c(this.s); anw anw1 = new anw(this.m); for (int m = 0; m < 50; m++) { int n = i + xq.a(this.T, 7, 40) * xq.a(this.T, -1, 1); int i1 = j + xq.a(this.T, 7, 40) * xq.a(this.T, -1, 1); int i2 = k + xq.a(this.T, 7, 40) * xq.a(this.T, -1, 1); if (this.m.a_(new el(n, i1 - 1, i2)).q() && this.m.C(new el(n, i1, i2)) < 10) { anw1.b(n, i1, i2); if (!this.m.a(n, i1, i2, 7.0D) && this.m.a_(anw1, anw1.bD()) && this.m.c(anw1, anw1.bD()) && !this.m.c(anw1.bD())) { this.m.a(anw1); anw1.e(afa); anw1.a(this.m.h(new el(anw1)), (afj)null, (gy)null); a(c).b(new afo("Zombie reinforcement caller charge", -0.05000000074505806D, 0)); anw1.a(c).b(new afo("Zombie reinforcement callee charge", -0.05000000074505806D, 0)); break; }  }  }  }  return true; }  return false; } public boolean B(aer ☃) { boolean bool = super.B(☃); if (bool) { float f = this.m.h(new el(this)).b(); if (cB().a() && aV() && this.T.nextFloat() < f * 0.3F) ☃.f(2 * (int)f);  }  return bool; } protected wi D() { return wj.lp; } protected wi d(aea ☃) { return wj.lz; } protected wi cs() { return wj.lu; }
/*     */   protected wi dA() { return wj.lF; }
/*     */   protected void a(el ☃, blc blc1) { a(dA(), 0.15F, 1.0F); }
/*     */   public afd cA() { return afd.b; }
/*     */   @Nullable protected pc G() { return ccl.at; }
/* 604 */   protected final void v(float ☃) { super.a(this.bK * ☃, this.bL * ☃); } protected void a(adj ☃) { super.a(☃); if (this.T.nextFloat() < ((this.m.aj() == adi.d) ? 0.05F : 0.01F)) { int i = this.T.nextInt(3); if (i == 0) { a(aew.a, new ate(atf.p)); } else { a(aew.a, new ate(atf.b)); }  }  } public void b(gy ☃) { super.b(☃); if (y_()) ☃.a("IsBaby", true);  ☃.a("CanBreakDoors", dH()); ☃.b("InWaterTime", an() ? this.bI : -1); ☃.b("DrownedConversionTime", dG() ? this.bJ : -1); } public void a(gy ☃) { super.a(☃); if (☃.q("IsBaby")) u(true);  t(☃.q("CanBreakDoors")); this.bI = ☃.h("InWaterTime"); if (☃.c("DrownedConversionTime", 99) && ☃.h("DrownedConversionTime") > -1) a(☃.h("DrownedConversionTime"));  } public void b(afa ☃) { super.b(☃); if ((this.m.aj() == adi.c || this.m.aj() == adi.d) && ☃ instanceof aob) { if (this.m.aj() != adi.d && this.T.nextBoolean()) return;  aob aob = (aob)☃; anx anx = new anx(this.m); anx.u(aob); this.m.e(aob); anx.a(this.m.h(new el(anx)), new b(false), (gy)null); anx.a(aob.dy()); anx.u(aob.y_()); anx.q(aob.do()); if (aob.O_()) { anx.b(aob.e()); anx.m(aob.by()); }  this.m.a(anx); this.m.a((aog)null, 1026, new el(this), 0); }  } public float bF() { float ☃ = 1.74F; if (y_()) ☃ = (float)(☃ - 0.81D);  return ☃; } protected boolean d(ate ☃) { if (☃.b() == atf.aW && y_() && aW()) return false;  return super.d(☃); } @Nullable public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) { afj1 = super.a(☃, afj1, gy1); float f = ☃.d(); p((this.T.nextFloat() < 0.55F * f)); if (afj1 == null) afj1 = new b((this.m.s.nextFloat() < 0.05F));  if (afj1 instanceof b) { b b = (b)afj1; if (b.a) { u(true); if (this.m.s.nextFloat() < 0.05D) { List<ajr> list = (List)this.m.a((Class)ajr.class, bD().c(5.0D, 3.0D, 5.0D), aeu.c); if (!list.isEmpty()) { ajr ajr = list.get(0); ajr.s(true); m(ajr); }  } else if (this.m.s.nextFloat() < 0.05D) { ajr ajr = new ajr(this.m); ajr.b(this.q, this.r, this.s, this.w, 0.0F); ajr.a(☃, (afj)null, (gy)null); ajr.s(true); this.m.a(ajr); m(ajr); }  }  t((dz() && this.T.nextFloat() < f * 0.1F)); a(☃); b(☃); }  if (b(aew.f).a()) { LocalDate localDate = LocalDate.now(); int i = localDate.get(ChronoField.DAY_OF_MONTH); int j = localDate.get(ChronoField.MONTH_OF_YEAR); if (j == 10 && i == 31 && this.T.nextFloat() < 0.25F) { a(aew.f, new ate((this.T.nextFloat() < 0.1F) ? bct.dj : bct.di)); this.bB[aew.f.b()] = 0.0F; }  }  a(f); return afj1; } protected void a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) { p(☃); t((dz() && bool1)); a(this.m.h(new el(this)).d()); u(bool2); q(bool3); } protected void a(float ☃) { a(ank.c).b(new afo("Random spawn bonus", this.T.nextDouble() * 0.05000000074505806D, 0)); double d = this.T.nextDouble() * 1.5D * ☃; if (d > 1.0D) a(ank.b).b(new afo("Random zombie-spawn bonus", d, 2));  if (this.T.nextFloat() < ☃ * 0.05F) { a(c).b(new afo("Leader zombie bonus", this.T.nextDouble() * 0.25D + 0.5D, 0)); a(ank.a).b(new afo("Leader zombie bonus", this.T.nextDouble() * 3.0D + 1.0D, 2)); t(dz()); }  }
/*     */   public class b implements afj {
/*     */     public boolean a;
/*     */     private b(anw ☃, boolean bool) { this.a = bool; } }
/*     */   public void v(boolean ☃) { v(☃ ? 0.5F : 1.0F); }
/* 609 */   public double aI() { return y_() ? 0.0D : -0.45D; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 614 */     super.a(☃);
/*     */     
/* 616 */     if (☃.k() instanceof amt) {
/* 617 */       amt amt = (amt)☃.k();
/* 618 */       if (amt.l() && amt.dC()) {
/* 619 */         amt.dD();
/* 620 */         ate ate = dB();
/* 621 */         if (!ate.a()) {
/* 622 */           a_(ate);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected ate dB() {
/* 629 */     return new ate(atf.dM);
/*     */   }
/*     */   
/*     */   class a extends ahv {
/*     */     a(anw this$0, bcs ☃, afg afg1, double d, int i) {
/* 634 */       super(☃, afg1, d, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(axz ☃, el el1) {
/* 639 */       ☃.a((aog)null, el1, wj.lv, wk.f, 0.5F, 0.9F + anw.b(this.f).nextFloat() * 0.2F);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(axy ☃, el el1) {
/* 644 */       ☃.a((aog)null, el1, wj.ka, wk.e, 0.7F, 0.9F + ☃.s.nextFloat() * 0.2F);
/*     */     }
/*     */ 
/*     */     
/*     */     public double g() {
/* 649 */       return 1.3D;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */