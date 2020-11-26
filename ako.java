/*      */ import java.util.List;
/*      */ import java.util.Optional;
/*      */ import java.util.UUID;
/*      */ import java.util.function.Predicate;
/*      */ import javax.annotation.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class ako
/*      */   extends ajq
/*      */   implements adg, afi
/*      */ {
/*      */   private static final Predicate<aer> bM;
/*      */   
/*      */   static {
/*   69 */     bM = (☃ -> (☃ instanceof ako && ((ako)☃).dP()));
/*      */   }
/*   71 */   protected static final afm bC = (new aft(null, "horse.jumpStrength", 0.7D, 0.0D, 2.0D)).a("Jump Strength").a(true);
/*      */   
/*   73 */   private static final or<Byte> bN = ou.a((Class)ako.class, ot.a);
/*   74 */   private static final or<Optional<UUID>> bO = ou.a((Class)ako.class, ot.o);
/*      */   
/*      */   private int bP;
/*      */   
/*      */   private int bQ;
/*      */   
/*      */   private int bR;
/*      */   
/*      */   public int bD;
/*      */   
/*      */   public int bE;
/*      */   
/*      */   protected boolean bG;
/*      */   
/*      */   protected aqk bH;
/*      */   
/*      */   protected int bI;
/*      */   
/*      */   protected float bJ;
/*      */   
/*      */   private boolean bS;
/*      */   
/*      */   private float bT;
/*      */   
/*      */   private float bU;
/*      */   
/*      */   private float bV;
/*      */   
/*      */   private float bW;
/*      */   private float bX;
/*      */   private float bY;
/*      */   protected boolean bK = true;
/*      */   protected int bL;
/*      */   
/*      */   protected ako(aev<?> ☃, axy axy1) {
/*  109 */     super(☃, axy1);
/*      */     
/*  111 */     a(1.3964844F, 1.6F);
/*  112 */     this.Q = 1.0F;
/*      */     
/*  114 */     dR();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void n() {
/*  119 */     this.by.a(1, new aho(this, 1.2D));
/*  120 */     this.by.a(1, new ahy(this, 1.2D));
/*  121 */     this.by.a(2, new agi(this, 1.0D, (Class)ako.class));
/*  122 */     this.by.a(4, new ags(this, 1.0D));
/*  123 */     this.by.a(6, new aih(this, 0.7D));
/*  124 */     this.by.a(7, new ahb(this, (Class)aog.class, 6.0F));
/*  125 */     this.by.a(8, new ahq(this));
/*      */     
/*  127 */     dI();
/*      */   }
/*      */   
/*      */   protected void dI() {
/*  131 */     this.by.a(0, new agm(this));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void x_() {
/*  136 */     super.x_();
/*  137 */     this.ab.a(bN, Byte.valueOf((byte)0));
/*  138 */     this.ab.a(bO, Optional.empty());
/*      */   }
/*      */   
/*      */   protected boolean p(int ☃) {
/*  142 */     return ((((Byte)this.ab.<Byte>a(bN)).byteValue() & ☃) != 0);
/*      */   }
/*      */   
/*      */   protected void d(int ☃, boolean bool) {
/*  146 */     byte b = ((Byte)this.ab.<Byte>a(bN)).byteValue();
/*  147 */     if (bool) {
/*  148 */       this.ab.b(bN, Byte.valueOf((byte)(b | ☃)));
/*      */     } else {
/*  150 */       this.ab.b(bN, Byte.valueOf((byte)(b & (☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean dJ() {
/*  155 */     return p(2);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public UUID dK() {
/*  160 */     return ((Optional<UUID>)this.ab.<Optional<UUID>>a(bO)).orElse(null);
/*      */   }
/*      */   
/*      */   public void b(@Nullable UUID ☃) {
/*  164 */     this.ab.b(bO, Optional.ofNullable(☃));
/*      */   }
/*      */   
/*      */   public float dL() {
/*  168 */     return 0.5F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(boolean ☃) {
/*  173 */     a(☃ ? dL() : 1.0F);
/*      */   }
/*      */   
/*      */   public boolean dM() {
/*  177 */     return this.bG;
/*      */   }
/*      */   
/*      */   public void u(boolean ☃) {
/*  181 */     d(2, ☃);
/*      */   }
/*      */   
/*      */   public void v(boolean ☃) {
/*  185 */     this.bG = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aog ☃) {
/*  190 */     return (super.a(☃) && cA() != afd.b);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void u(float ☃) {
/*  195 */     if (☃ > 6.0F && dN()) {
/*  196 */       y(false);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean dN() {
/*  201 */     return p(16);
/*      */   }
/*      */   
/*      */   public boolean dO() {
/*  205 */     return p(32);
/*      */   }
/*      */   
/*      */   public boolean dP() {
/*  209 */     return p(8);
/*      */   }
/*      */   
/*      */   public void w(boolean ☃) {
/*  213 */     d(8, ☃);
/*      */   }
/*      */   
/*      */   public void x(boolean ☃) {
/*  217 */     d(4, ☃);
/*      */   }
/*      */   
/*      */   public int dQ() {
/*  221 */     return this.bI;
/*      */   }
/*      */   
/*      */   public void q(int ☃) {
/*  225 */     this.bI = ☃;
/*      */   }
/*      */   
/*      */   public int r(int ☃) {
/*  229 */     int i = xq.a(dQ() + ☃, 0, dW());
/*      */     
/*  231 */     q(i);
/*  232 */     return i;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aea ☃, float f) {
/*  237 */     aer aer = ☃.k();
/*  238 */     if (aX() && aer != null && y(aer)) {
/*  239 */       return false;
/*      */     }
/*      */     
/*  242 */     return super.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aC() {
/*  247 */     return !aX();
/*      */   }
/*      */   
/*      */   private void dy() {
/*  251 */     dC();
/*  252 */     if (!ai()) {
/*  253 */       this.m.a((aog)null, this.q, this.r, this.s, wj.dQ, bV(), 1.0F, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(float ☃, float f1) {
/*  259 */     if (☃ > 1.0F) {
/*  260 */       a(wj.dU, 0.4F, 1.0F);
/*      */     }
/*      */     
/*  263 */     int i = xq.f((☃ * 0.5F - 3.0F) * f1);
/*  264 */     if (i <= 0) {
/*      */       return;
/*      */     }
/*      */     
/*  268 */     a(aea.k, i);
/*      */     
/*  270 */     if (aX()) {
/*  271 */       for (aer aer : bQ()) {
/*  272 */         aer.a(aea.k, i);
/*      */       }
/*      */     }
/*      */     
/*  276 */     blc blc = this.m.a_(new el(this.q, this.r - 0.2D - this.y, this.s));
/*  277 */     bcs bcs = blc.c();
/*  278 */     if (!blc.f() && !ai()) {
/*  279 */       bhr bhr = bcs.r();
/*  280 */       this.m.a((aog)null, this.q, this.r, this.s, bhr.d(), bV(), bhr.a() * 0.5F, bhr.b() * 0.75F);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected int dA() {
/*  285 */     return 2;
/*      */   }
/*      */   
/*      */   protected void dR() {
/*  289 */     aqk ☃ = this.bH;
/*  290 */     this.bH = new aqk(N_(), dA());
/*  291 */     this.bH.a(e());
/*  292 */     if (☃ != null) {
/*  293 */       ☃.b((adg)this);
/*      */       
/*  295 */       int i = Math.min(☃.T_(), this.bH.T_());
/*  296 */       for (int j = 0; j < i; j++) {
/*  297 */         ate ate = ☃.a(j);
/*  298 */         if (!ate.a()) {
/*  299 */           this.bH.a(j, ate.i());
/*      */         }
/*      */       } 
/*      */     } 
/*  303 */     this.bH.a((adg)this);
/*  304 */     dS();
/*      */   }
/*      */   
/*      */   protected void dS() {
/*  308 */     if (this.m.B) {
/*      */       return;
/*      */     }
/*      */     
/*  312 */     x((!this.bH.a(0).a() && dU()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ade ☃) {
/*  317 */     boolean bool = dV();
/*  318 */     dS();
/*  319 */     if (this.U > 20 && !bool && dV()) {
/*  320 */       a(wj.dV, 0.5F, 1.0F);
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected ako a(aer ☃, double d) {
/*  326 */     double d1 = Double.MAX_VALUE;
/*      */     
/*  328 */     aer aer1 = null;
/*  329 */     List<aer> list = this.m.a(☃, ☃.bD().b(d, d, d), bM);
/*      */     
/*  331 */     for (aer aer2 : list) {
/*  332 */       double d2 = aer2.d(☃.q, ☃.r, ☃.s);
/*      */       
/*  334 */       if (d2 < d1) {
/*  335 */         aer1 = aer2;
/*  336 */         d1 = d2;
/*      */       } 
/*      */     } 
/*      */     
/*  340 */     return (ako)aer1;
/*      */   }
/*      */   
/*      */   public double dT() {
/*  344 */     return a(bC).e();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected wi cs() {
/*  350 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected wi d(aea ☃) {
/*  356 */     if (this.T.nextInt(3) == 0) {
/*  357 */       dH();
/*      */     }
/*  359 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected wi D() {
/*  365 */     if (this.T.nextInt(10) == 0 && !cF()) {
/*  366 */       dH();
/*      */     }
/*  368 */     return null;
/*      */   }
/*      */   
/*      */   public boolean dU() {
/*  372 */     return true;
/*      */   }
/*      */   
/*      */   public boolean dV() {
/*  376 */     return p(4);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected wi dB() {
/*  381 */     dH();
/*  382 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(el ☃, blc blc1) {
/*  387 */     if (blc1.d().a()) {
/*      */       return;
/*      */     }
/*      */     
/*  391 */     bhr bhr = blc1.c().r();
/*  392 */     if (this.m.a_(☃.a()).c() == bct.cQ) {
/*  393 */       bhr = bct.cQ.r();
/*      */     }
/*      */     
/*  396 */     if (aX() && this.bK) {
/*  397 */       this.bL++;
/*  398 */       if (this.bL > 5 && this.bL % 3 == 0) {
/*  399 */         a(bhr);
/*  400 */       } else if (this.bL <= 5) {
/*  401 */         a(wj.dX, bhr.a() * 0.15F, bhr.b());
/*      */       } 
/*  403 */     } else if (bhr == bhr.a) {
/*  404 */       a(wj.dX, bhr.a() * 0.15F, bhr.b());
/*      */     } else {
/*  406 */       a(wj.dW, bhr.a() * 0.15F, bhr.b());
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void a(bhr ☃) {
/*  411 */     a(wj.dR, ☃.a() * 0.15F, ☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bZ() {
/*  416 */     super.bZ();
/*      */     
/*  418 */     cz().b(bC);
/*      */     
/*  420 */     a(ank.a).a(53.0D);
/*  421 */     a(ank.d).a(0.22499999403953552D);
/*      */   }
/*      */ 
/*      */   
/*      */   public int dg() {
/*  426 */     return 6;
/*      */   }
/*      */   
/*      */   public int dW() {
/*  430 */     return 100;
/*      */   }
/*      */ 
/*      */   
/*      */   protected float cD() {
/*  435 */     return 0.8F;
/*      */   }
/*      */ 
/*      */   
/*      */   public int z() {
/*  440 */     return 400;
/*      */   }
/*      */   
/*      */   public void c(aog ☃) {
/*  444 */     if (!this.m.B && (!aX() || w(☃)) && dJ()) {
/*  445 */       this.bH.a(e());
/*  446 */       ☃.a(this, this.bH);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean b(aog ☃, ate ate1) {
/*  451 */     boolean bool = false;
/*  452 */     float f = 0.0F;
/*  453 */     int i = 0;
/*  454 */     int j = 0;
/*      */     
/*  456 */     ata ata = ate1.b();
/*  457 */     if (ata == atf.S) {
/*  458 */       f = 2.0F;
/*  459 */       i = 20;
/*  460 */       j = 3;
/*  461 */     } else if (ata == atf.by) {
/*  462 */       f = 1.0F;
/*  463 */       i = 30;
/*  464 */       j = 3;
/*  465 */     } else if (ata == bct.fW.h()) {
/*  466 */       f = 20.0F;
/*  467 */       i = 180;
/*  468 */     } else if (ata == atf.f) {
/*  469 */       f = 3.0F;
/*  470 */       i = 60;
/*  471 */       j = 3;
/*  472 */     } else if (ata == atf.dH) {
/*  473 */       f = 4.0F;
/*  474 */       i = 60;
/*  475 */       j = 5;
/*  476 */       if (dJ() && i() == 0 && !dF()) {
/*  477 */         bool = true;
/*  478 */         f(☃);
/*      */       } 
/*  480 */     } else if (ata == atf.at || ata == atf.au) {
/*  481 */       f = 10.0F;
/*  482 */       i = 240;
/*  483 */       j = 10;
/*  484 */       if (dJ() && i() == 0 && !dF()) {
/*  485 */         bool = true;
/*  486 */         f(☃);
/*      */       } 
/*      */     } 
/*  489 */     if (cq() < cw() && f > 0.0F) {
/*  490 */       c(f);
/*  491 */       bool = true;
/*      */     } 
/*  493 */     if (y_() && i > 0) {
/*  494 */       this.m.a(fm.z, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H, this.r + 0.5D + (this.T.nextFloat() * this.I), this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H, 0.0D, 0.0D, 0.0D);
/*  495 */       if (!this.m.B) {
/*  496 */         a(i);
/*      */       }
/*  498 */       bool = true;
/*      */     } 
/*  500 */     if (j > 0 && (bool || !dJ()) && dQ() < dW()) {
/*  501 */       bool = true;
/*  502 */       if (!this.m.B) {
/*  503 */         r(j);
/*      */       }
/*      */     } 
/*  506 */     if (bool) {
/*  507 */       dy();
/*      */     }
/*  509 */     return bool;
/*      */   }
/*      */   
/*      */   protected void g(aog ☃) {
/*  513 */     y(false);
/*  514 */     z(false);
/*  515 */     if (!this.m.B) {
/*  516 */       ☃.w = this.w;
/*  517 */       ☃.x = this.x;
/*  518 */       ☃.m(this);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean cF() {
/*  524 */     return ((super.cF() && aX() && dV()) || dN() || dO());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean f(ate ☃) {
/*  530 */     return false;
/*      */   }
/*      */   
/*      */   private void dz() {
/*  534 */     this.bD = 1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aea ☃) {
/*  539 */     super.a(☃);
/*  540 */     if (this.m.B || this.bH == null) {
/*      */       return;
/*      */     }
/*      */     
/*  544 */     for (int i = 0; i < this.bH.T_(); i++) {
/*  545 */       ate ate = this.bH.a(i);
/*  546 */       if (!ate.a())
/*      */       {
/*      */         
/*  549 */         a_(ate);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void k() {
/*  555 */     if (this.T.nextInt(200) == 0) {
/*  556 */       dz();
/*      */     }
/*      */     
/*  559 */     super.k();
/*      */     
/*  561 */     if (this.m.B) {
/*      */       return;
/*      */     }
/*      */     
/*  565 */     if (this.T.nextInt(900) == 0 && this.aE == 0) {
/*  566 */       c(1.0F);
/*      */     }
/*      */     
/*  569 */     if (dY()) {
/*  570 */       if (!dN() && !aX() && this.T.nextInt(300) == 0 && 
/*  571 */         this.m.a_(new el(xq.c(this.q), xq.c(this.r) - 1, xq.c(this.s))).c() == bct.i) {
/*  572 */         y(true);
/*      */       }
/*      */ 
/*      */       
/*  576 */       if (dN() && ++this.bP > 50) {
/*  577 */         this.bP = 0;
/*  578 */         y(false);
/*      */       } 
/*      */     } 
/*      */     
/*  582 */     dX();
/*      */   }
/*      */   
/*      */   protected void dX() {
/*  586 */     if (dP() && y_() && !dN()) {
/*  587 */       ako ☃ = a(this, 16.0D);
/*  588 */       if (☃ != null && h(☃) > 4.0D) {
/*  589 */         this.bx.a(☃);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean dY() {
/*  595 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void R_() {
/*  600 */     super.R_();
/*      */     
/*  602 */     if (this.bQ > 0 && ++this.bQ > 30) {
/*  603 */       this.bQ = 0;
/*  604 */       d(64, false);
/*      */     } 
/*      */     
/*  607 */     if ((bT() || cP()) && 
/*  608 */       this.bR > 0 && ++this.bR > 20) {
/*  609 */       this.bR = 0;
/*  610 */       z(false);
/*      */     } 
/*      */ 
/*      */     
/*  614 */     if (this.bD > 0 && ++this.bD > 8) {
/*  615 */       this.bD = 0;
/*      */     }
/*      */     
/*  618 */     if (this.bE > 0) {
/*  619 */       this.bE++;
/*      */       
/*  621 */       if (this.bE > 300) {
/*  622 */         this.bE = 0;
/*      */       }
/*      */     } 
/*      */     
/*  626 */     this.bU = this.bT;
/*  627 */     if (dN()) {
/*  628 */       this.bT += (1.0F - this.bT) * 0.4F + 0.05F;
/*  629 */       if (this.bT > 1.0F) {
/*  630 */         this.bT = 1.0F;
/*      */       }
/*      */     } else {
/*  633 */       this.bT += (0.0F - this.bT) * 0.4F - 0.05F;
/*  634 */       if (this.bT < 0.0F) {
/*  635 */         this.bT = 0.0F;
/*      */       }
/*      */     } 
/*  638 */     this.bW = this.bV;
/*  639 */     if (dO()) {
/*      */       
/*  641 */       this.bT = 0.0F;
/*  642 */       this.bU = this.bT;
/*  643 */       this.bV += (1.0F - this.bV) * 0.4F + 0.05F;
/*  644 */       if (this.bV > 1.0F) {
/*  645 */         this.bV = 1.0F;
/*      */       }
/*      */     } else {
/*  648 */       this.bS = false;
/*      */       
/*  650 */       this.bV += (0.8F * this.bV * this.bV * this.bV - this.bV) * 0.6F - 0.05F;
/*  651 */       if (this.bV < 0.0F) {
/*  652 */         this.bV = 0.0F;
/*      */       }
/*      */     } 
/*  655 */     this.bY = this.bX;
/*  656 */     if (p(64)) {
/*  657 */       this.bX += (1.0F - this.bX) * 0.7F + 0.05F;
/*  658 */       if (this.bX > 1.0F) {
/*  659 */         this.bX = 1.0F;
/*      */       }
/*      */     } else {
/*  662 */       this.bX += (0.0F - this.bX) * 0.7F - 0.05F;
/*  663 */       if (this.bX < 0.0F) {
/*  664 */         this.bX = 0.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void dC() {
/*  670 */     if (!this.m.B) {
/*  671 */       this.bQ = 1;
/*  672 */       d(64, true);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void y(boolean ☃) {
/*  677 */     d(16, ☃);
/*      */   }
/*      */   
/*      */   public void z(boolean ☃) {
/*  681 */     if (☃) {
/*  682 */       y(false);
/*      */     }
/*  684 */     d(32, ☃);
/*      */   }
/*      */   
/*      */   private void dH() {
/*  688 */     if (bT() || cP()) {
/*  689 */       this.bR = 1;
/*  690 */       z(true);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void dZ() {
/*  695 */     dH();
/*  696 */     wi ☃ = dB();
/*  697 */     if (☃ != null) {
/*  698 */       a(☃, cD(), cE());
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean h(aog ☃) {
/*  703 */     b(☃.bt());
/*  704 */     u(true);
/*  705 */     if (☃ instanceof tf) {
/*  706 */       p.x.a((tf)☃, this);
/*      */     }
/*  708 */     this.m.a(this, (byte)7);
/*  709 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float ☃, float f1, float f2) {
/*  715 */     if (!aX() || !dh() || !dV()) {
/*  716 */       this.aU = 0.02F;
/*  717 */       super.a(☃, f1, f2);
/*      */       
/*      */       return;
/*      */     } 
/*  721 */     afa afa = (afa)bO();
/*      */     
/*  723 */     this.w = afa.w;
/*  724 */     this.y = this.w;
/*  725 */     this.x = afa.x * 0.5F;
/*  726 */     b(this.w, this.x);
/*  727 */     this.aQ = this.w;
/*  728 */     this.aS = this.aQ;
/*      */     
/*  730 */     ☃ = afa.bh * 0.5F;
/*  731 */     f2 = afa.bj;
/*      */ 
/*      */     
/*  734 */     if (f2 <= 0.0F) {
/*  735 */       f2 *= 0.25F;
/*  736 */       this.bL = 0;
/*      */     } 
/*      */     
/*  739 */     if (this.A && this.bJ == 0.0F && dO() && !this.bS) {
/*  740 */       ☃ = 0.0F;
/*  741 */       f2 = 0.0F;
/*      */     } 
/*      */     
/*  744 */     if (this.bJ > 0.0F && !dM() && this.A) {
/*  745 */       this.u = dT() * this.bJ;
/*  746 */       if (a(aem.h)) {
/*  747 */         this.u += ((b(aem.h).c() + 1) * 0.1F);
/*      */       }
/*      */       
/*  750 */       v(true);
/*  751 */       this.al = true;
/*      */       
/*  753 */       if (f2 > 0.0F) {
/*  754 */         float f3 = xq.a(this.w * 0.017453292F);
/*  755 */         float f4 = xq.b(this.w * 0.017453292F);
/*      */         
/*  757 */         this.t += (-0.4F * f3 * this.bJ);
/*  758 */         this.v += (0.4F * f4 * this.bJ);
/*      */         
/*  760 */         ea();
/*      */       } 
/*  762 */       this.bJ = 0.0F;
/*      */     } 
/*      */     
/*  765 */     this.aU = cK() * 0.1F;
/*  766 */     if (bT()) {
/*  767 */       o((float)a(ank.d).e());
/*  768 */       super.a(☃, f1, f2);
/*  769 */     } else if (afa instanceof aog) {
/*  770 */       this.t = 0.0D;
/*  771 */       this.u = 0.0D;
/*  772 */       this.v = 0.0D;
/*      */     } 
/*      */     
/*  775 */     if (this.A) {
/*      */       
/*  777 */       this.bJ = 0.0F;
/*  778 */       v(false);
/*      */     } 
/*  780 */     this.aI = this.aJ;
/*  781 */     double d1 = this.q - this.n;
/*  782 */     double d2 = this.s - this.p;
/*  783 */     float f = xq.a(d1 * d1 + d2 * d2) * 4.0F;
/*  784 */     if (f > 1.0F) {
/*  785 */       f = 1.0F;
/*      */     }
/*      */     
/*  788 */     this.aJ += (f - this.aJ) * 0.4F;
/*  789 */     this.aK += this.aJ;
/*      */   }
/*      */   
/*      */   protected void ea() {
/*  793 */     a(wj.dT, 0.4F, 1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(gy ☃) {
/*  798 */     super.b(☃);
/*      */     
/*  800 */     ☃.a("EatingHaystack", dN());
/*  801 */     ☃.a("Bred", dP());
/*  802 */     ☃.b("Temper", dQ());
/*  803 */     ☃.a("Tame", dJ());
/*      */     
/*  805 */     if (dK() != null) {
/*  806 */       ☃.a("OwnerUUID", dK().toString());
/*      */     }
/*      */     
/*  809 */     if (!this.bH.a(0).a()) {
/*  810 */       ☃.a("SaddleItem", this.bH.a(0).b(new gy()));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gy ☃) {
/*      */     String str;
/*  816 */     super.a(☃);
/*  817 */     y(☃.q("EatingHaystack"));
/*  818 */     w(☃.q("Bred"));
/*  819 */     q(☃.h("Temper"));
/*  820 */     u(☃.q("Tame"));
/*      */ 
/*      */     
/*  823 */     if (☃.c("OwnerUUID", 8)) {
/*  824 */       str = ☃.l("OwnerUUID");
/*      */     } else {
/*  826 */       String str1 = ☃.l("Owner");
/*  827 */       str = vo.a(bK(), str1);
/*      */     } 
/*  829 */     if (!str.isEmpty()) {
/*  830 */       b(UUID.fromString(str));
/*      */     }
/*      */     
/*  833 */     afn afn = cz().a("Speed");
/*  834 */     if (afn != null) {
/*  835 */       a(ank.d).a(afn.b() * 0.25D);
/*      */     }
/*      */     
/*  838 */     if (☃.c("SaddleItem", 10)) {
/*  839 */       ate ate = ate.a(☃.p("SaddleItem"));
/*  840 */       if (ate.b() == atf.aA) {
/*  841 */         this.bH.a(0, ate);
/*      */       }
/*      */     } 
/*  844 */     dS();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(ajq ☃) {
/*  849 */     return false;
/*      */   }
/*      */   
/*      */   protected boolean eb() {
/*  853 */     return (!aX() && !aW() && dJ() && !y_() && cq() >= cw() && dF());
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aeo a(aeo ☃) {
/*  859 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(aeo ☃, ako ako1) {
/*  864 */     double d1 = a(ank.a).b() + ☃.a(ank.a).b() + ec();
/*  865 */     ako1.a(ank.a).a(d1 / 3.0D);
/*      */     
/*  867 */     double d2 = a(bC).b() + ☃.a(bC).b() + ed();
/*  868 */     ako1.a(bC).a(d2 / 3.0D);
/*      */     
/*  870 */     double d3 = a(ank.d).b() + ☃.a(ank.d).b() + ee();
/*  871 */     ako1.a(ank.d).a(d3 / 3.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean dh() {
/*  876 */     return bO() instanceof afa;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean G_() {
/*  913 */     return dV();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int ☃) {
/*  928 */     this.bS = true;
/*  929 */     dH();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void I_() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void k(aer ☃) {
/*  960 */     super.k(☃);
/*      */     
/*  962 */     if (☃ instanceof afb) {
/*  963 */       afb afb = (afb)☃;
/*  964 */       this.aQ = afb.aQ;
/*      */     } 
/*      */     
/*  967 */     if (this.bW > 0.0F) {
/*  968 */       float f1 = xq.a(this.aQ * 0.017453292F);
/*  969 */       float f2 = xq.b(this.aQ * 0.017453292F);
/*  970 */       float f3 = 0.7F * this.bW;
/*  971 */       float f4 = 0.15F * this.bW;
/*      */       
/*  973 */       ☃.b(this.q + (f3 * f1), this.r + aJ() + ☃.aI() + f4, this.s - (f3 * f2));
/*  974 */       if (☃ instanceof afa) {
/*  975 */         ((afa)☃).aQ = this.aQ;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected float ec() {
/*  982 */     return 15.0F + this.T.nextInt(8) + this.T.nextInt(9);
/*      */   }
/*      */   
/*      */   protected double ed() {
/*  986 */     return 0.4000000059604645D + this.T.nextDouble() * 0.2D + this.T.nextDouble() * 0.2D + this.T.nextDouble() * 0.2D;
/*      */   }
/*      */   
/*      */   protected double ee() {
/*  990 */     return (0.44999998807907104D + this.T.nextDouble() * 0.3D + this.T.nextDouble() * 0.3D + this.T.nextDouble() * 0.3D) * 0.25D;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean z_() {
/*  995 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public float bF() {
/* 1000 */     return this.I;
/*      */   }
/*      */   
/*      */   public boolean ef() {
/* 1004 */     return false;
/*      */   }
/*      */   
/*      */   public boolean g(ate ☃) {
/* 1008 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(int ☃, ate ate1) {
/* 1013 */     int i = ☃ - 400;
/* 1014 */     if (i >= 0 && i < 2 && i < this.bH.T_()) {
/* 1015 */       if (i == 0 && ate1.b() != atf.aA) {
/* 1016 */         return false;
/*      */       }
/* 1018 */       if (i == 1 && (!ef() || !g(ate1))) {
/* 1019 */         return false;
/*      */       }
/* 1021 */       this.bH.a(i, ate1);
/* 1022 */       dS();
/* 1023 */       return true;
/*      */     } 
/* 1025 */     int j = ☃ - 500 + 2;
/* 1026 */     if (j >= 2 && j < this.bH.T_()) {
/* 1027 */       this.bH.a(j, ate1);
/* 1028 */       return true;
/*      */     } 
/* 1030 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aer bO() {
/* 1036 */     if (bP().isEmpty()) {
/* 1037 */       return null;
/*      */     }
/* 1039 */     return bP().get(0);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 1045 */     afj1 = super.a(☃, afj1, gy1);
/*      */     
/* 1047 */     if (this.T.nextInt(5) == 0) {
/* 1048 */       b_(-24000);
/*      */     }
/*      */     
/* 1051 */     return afj1;
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\ako.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */