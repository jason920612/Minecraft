/*      */ import com.google.common.collect.Maps;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class afb
/*      */   extends afa
/*      */ {
/*   75 */   private static final or<Byte> a = ou.a((Class)afb.class, ot.a);
/*      */   
/*      */   public int a_;
/*      */   
/*      */   protected int b_;
/*      */   
/*      */   protected aga f;
/*      */   
/*      */   protected agb g;
/*      */   
/*      */   protected afz h;
/*      */   
/*      */   private final afv b;
/*      */   
/*      */   protected aiw bx;
/*      */   
/*      */   protected final agu by;
/*      */   protected final agu bz;
/*      */   private afa c;
/*      */   private final ajb bC;
/*   95 */   private final ez<ate> bD = ez.a(2, ate.a);
/*   96 */   protected float[] bA = new float[2];
/*   97 */   private final ez<ate> bE = ez.a(4, ate.a);
/*   98 */   protected float[] bB = new float[4];
/*      */   private boolean bF;
/*      */   private boolean bG;
/*  101 */   private final Map<cba, Float> bH = Maps.newEnumMap(cba.class);
/*      */   
/*      */   private pc bI;
/*      */   private long bJ;
/*      */   private boolean bK;
/*      */   private aer bL;
/*      */   private gy bM;
/*      */   
/*      */   protected afb(aev<?> ☃, axy axy1) {
/*  110 */     super(☃, axy1);
/*      */     
/*  112 */     this.by = new agu((axy1 == null || axy1.A == null) ? null : axy1.A);
/*  113 */     this.bz = new agu((axy1 == null || axy1.A == null) ? null : axy1.A);
/*  114 */     this.f = new aga(this);
/*  115 */     this.g = new agb(this);
/*  116 */     this.h = new afz(this);
/*  117 */     this.b = o();
/*  118 */     this.bx = b(axy1);
/*  119 */     this.bC = new ajb(this);
/*      */     
/*  121 */     Arrays.fill(this.bB, 0.085F);
/*  122 */     Arrays.fill(this.bA, 0.085F);
/*      */     
/*  124 */     if (axy1 != null && !axy1.B) {
/*  125 */       n();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void n() {}
/*      */ 
/*      */   
/*      */   protected void bZ() {
/*  134 */     super.bZ();
/*      */     
/*  136 */     cz().b(ank.b).a(16.0D);
/*      */   }
/*      */   
/*      */   protected aiw b(axy ☃) {
/*  140 */     return new aiv(this, ☃);
/*      */   }
/*      */   
/*      */   public float a(cba ☃) {
/*  144 */     Float float_ = this.bH.get(☃);
/*  145 */     return (float_ == null) ? ☃.a() : float_.floatValue();
/*      */   }
/*      */   
/*      */   public void a(cba ☃, float f) {
/*  149 */     this.bH.put(☃, Float.valueOf(f));
/*      */   }
/*      */   
/*      */   protected afv o() {
/*  153 */     return new afv(this);
/*      */   }
/*      */   
/*      */   public aga p() {
/*  157 */     return this.f;
/*      */   }
/*      */   
/*      */   public agb r() {
/*  161 */     return this.g;
/*      */   }
/*      */   
/*      */   public afz s() {
/*  165 */     return this.h;
/*      */   }
/*      */   
/*      */   public aiw t() {
/*  169 */     return this.bx;
/*      */   }
/*      */   
/*      */   public ajb u() {
/*  173 */     return this.bC;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public afa v() {
/*  178 */     return this.c;
/*      */   }
/*      */   
/*      */   public void e(@Nullable afa ☃) {
/*  182 */     this.c = ☃;
/*      */   }
/*      */   
/*      */   public boolean b(Class<? extends afa> ☃) {
/*  186 */     return (☃ != ana.class);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void x() {}
/*      */ 
/*      */   
/*      */   protected void x_() {
/*  195 */     super.x_();
/*  196 */     this.ab.a(a, Byte.valueOf((byte)0));
/*      */   }
/*      */   
/*      */   public int z() {
/*  200 */     return 80;
/*      */   }
/*      */   
/*      */   public void A() {
/*  204 */     wi ☃ = D();
/*  205 */     if (☃ != null) {
/*  206 */       a(☃, cD(), cE());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void W() {
/*  212 */     super.W();
/*      */     
/*  214 */     this.m.A.a("mobBaseTick");
/*  215 */     if (aF() && this.T.nextInt(1000) < this.a_++) {
/*  216 */       l();
/*  217 */       A();
/*      */     } 
/*  219 */     this.m.A.e();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(aea ☃) {
/*  224 */     l();
/*  225 */     super.c(☃);
/*      */   }
/*      */   
/*      */   private void l() {
/*  229 */     this.a_ = -z();
/*      */   }
/*      */ 
/*      */   
/*      */   protected int b(aog ☃) {
/*  234 */     if (this.b_ > 0) {
/*  235 */       int i = this.b_;
/*      */       int j;
/*  237 */       for (j = 0; j < this.bE.size(); j++) {
/*  238 */         if (!((ate)this.bE.get(j)).a() && this.bB[j] <= 1.0F) {
/*  239 */           i += 1 + this.T.nextInt(3);
/*      */         }
/*      */       } 
/*  242 */       for (j = 0; j < this.bD.size(); j++) {
/*  243 */         if (!((ate)this.bD.get(j)).a() && this.bA[j] <= 1.0F) {
/*  244 */           i += 1 + this.T.nextInt(3);
/*      */         }
/*      */       } 
/*      */       
/*  248 */       return i;
/*      */     } 
/*  250 */     return this.b_;
/*      */   }
/*      */ 
/*      */   
/*      */   public void B() {
/*  255 */     if (this.m.B) {
/*  256 */       for (int ☃ = 0; ☃ < 20; ☃++) {
/*  257 */         double d1 = this.T.nextGaussian() * 0.02D;
/*  258 */         double d2 = this.T.nextGaussian() * 0.02D;
/*  259 */         double d3 = this.T.nextGaussian() * 0.02D;
/*  260 */         double d4 = 10.0D;
/*  261 */         this.m.a(fm.J, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H - d1 * 10.0D, this.r + (this.T.nextFloat() * this.I) - d2 * 10.0D, this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H - d3 * 10.0D, d1, d2, d3);
/*      */       } 
/*      */     } else {
/*  264 */       this.m.a(this, (byte)20);
/*      */     } 
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
/*      */   public void R_() {
/*  279 */     super.R_();
/*      */     
/*  281 */     if (!this.m.B) {
/*  282 */       dl();
/*      */       
/*  284 */       if (this.U % 5 == 0) {
/*  285 */         boolean ☃ = !(bO() instanceof afb);
/*  286 */         boolean bool1 = !(bU() instanceof apj);
/*  287 */         this.by.a(1, ☃);
/*  288 */         this.by.a(4, (☃ && bool1));
/*  289 */         this.by.a(2, ☃);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected float e(float ☃, float f1) {
/*  296 */     this.b.a();
/*  297 */     return f1;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected wi D() {
/*  302 */     return null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected ata F() {
/*  307 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(boolean ☃, int i) {
/*  312 */     ata ata = F();
/*  313 */     if (ata != null) {
/*  314 */       int j = this.T.nextInt(3);
/*  315 */       if (i > 0) {
/*  316 */         j += this.T.nextInt(i + 1);
/*      */       }
/*  318 */       for (int k = 0; k < j; k++) {
/*  319 */         a(ata);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(gy ☃) {
/*  326 */     super.b(☃);
/*  327 */     ☃.a("CanPickUpLoot", dj());
/*  328 */     ☃.a("PersistenceRequired", this.bG);
/*      */     
/*  330 */     he he1 = new he();
/*  331 */     for (ate ate : this.bE) {
/*  332 */       gy gy1 = new gy();
/*  333 */       if (!ate.a()) {
/*  334 */         ate.b(gy1);
/*      */       }
/*  336 */       he1.a(gy1);
/*      */     } 
/*  338 */     ☃.a("ArmorItems", he1);
/*      */     
/*  340 */     he he2 = new he();
/*  341 */     for (ate ate : this.bD) {
/*  342 */       gy gy1 = new gy();
/*  343 */       if (!ate.a()) {
/*  344 */         ate.b(gy1);
/*      */       }
/*  346 */       he2.a(gy1);
/*      */     } 
/*  348 */     ☃.a("HandItems", he2);
/*      */     
/*  350 */     he he3 = new he();
/*  351 */     for (float f : this.bB) {
/*  352 */       he3.a(new hb(f));
/*      */     }
/*  354 */     ☃.a("ArmorDropChances", he3);
/*      */     
/*  356 */     he he4 = new he();
/*  357 */     for (float f : this.bA) {
/*  358 */       he4.a(new hb(f));
/*      */     }
/*  360 */     ☃.a("HandDropChances", he4);
/*      */ 
/*      */     
/*  363 */     ☃.a("Leashed", this.bK);
/*  364 */     if (this.bL != null) {
/*  365 */       gy gy1 = new gy();
/*  366 */       if (this.bL instanceof afa) {
/*      */         
/*  368 */         UUID uUID = this.bL.bt();
/*  369 */         gy1.a("UUID", uUID);
/*  370 */       } else if (this.bL instanceof ama) {
/*      */         
/*  372 */         el el = ((ama)this.bL).n();
/*  373 */         gy1.b("X", el.o());
/*  374 */         gy1.b("Y", el.p());
/*  375 */         gy1.b("Z", el.q());
/*      */       } 
/*  377 */       ☃.a("Leash", gy1);
/*      */     } 
/*      */     
/*  380 */     ☃.a("LeftHanded", dp());
/*      */     
/*  382 */     if (this.bI != null) {
/*  383 */       ☃.a("DeathLootTable", this.bI.toString());
/*  384 */       if (this.bJ != 0L) {
/*  385 */         ☃.a("DeathLootTableSeed", this.bJ);
/*      */       }
/*      */     } 
/*      */     
/*  389 */     if (do()) {
/*  390 */       ☃.a("NoAI", do());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(gy ☃) {
/*  396 */     super.a(☃);
/*      */     
/*  398 */     if (☃.c("CanPickUpLoot", 1)) {
/*  399 */       p(☃.q("CanPickUpLoot"));
/*      */     }
/*  401 */     this.bG = ☃.q("PersistenceRequired");
/*      */     
/*  403 */     if (☃.c("ArmorItems", 9)) {
/*  404 */       he he = ☃.d("ArmorItems", 10);
/*      */       
/*  406 */       for (int i = 0; i < this.bE.size(); i++) {
/*  407 */         this.bE.set(i, ate.a(he.e(i)));
/*      */       }
/*      */     } 
/*  410 */     if (☃.c("HandItems", 9)) {
/*  411 */       he he = ☃.d("HandItems", 10);
/*      */       
/*  413 */       for (int i = 0; i < this.bD.size(); i++) {
/*  414 */         this.bD.set(i, ate.a(he.e(i)));
/*      */       }
/*      */     } 
/*      */     
/*  418 */     if (☃.c("ArmorDropChances", 9)) {
/*  419 */       he he = ☃.d("ArmorDropChances", 5);
/*  420 */       for (int i = 0; i < he.size(); i++) {
/*  421 */         this.bB[i] = he.l(i);
/*      */       }
/*      */     } 
/*  424 */     if (☃.c("HandDropChances", 9)) {
/*  425 */       he he = ☃.d("HandDropChances", 5);
/*  426 */       for (int i = 0; i < he.size(); i++) {
/*  427 */         this.bA[i] = he.l(i);
/*      */       }
/*      */     } 
/*      */     
/*  431 */     this.bK = ☃.q("Leashed");
/*  432 */     if (this.bK && ☃.c("Leash", 10)) {
/*  433 */       this.bM = ☃.p("Leash");
/*      */     }
/*      */     
/*  436 */     r(☃.q("LeftHanded"));
/*      */     
/*  438 */     if (☃.c("DeathLootTable", 8)) {
/*  439 */       this.bI = new pc(☃.l("DeathLootTable"));
/*  440 */       this.bJ = ☃.i("DeathLootTableSeed");
/*      */     } 
/*      */     
/*  443 */     q(☃.q("NoAI"));
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected pc G() {
/*  448 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(boolean ☃, int i, aea aea1) {
/*  453 */     pc pc1 = this.bI;
/*  454 */     if (pc1 == null) {
/*  455 */       pc1 = G();
/*      */     }
/*  457 */     if (pc1 != null) {
/*  458 */       ccq ccq = this.m.z().aN().a(pc1);
/*  459 */       this.bI = null;
/*      */       
/*  461 */       ccr.a a = (new ccr.a((td)this.m)).a(this).a(aea1).a(new el(this));
/*  462 */       if (☃ && this.aV != null) {
/*  463 */         a = a.a(this.aV).a(this.aV.dJ());
/*      */       }
/*  465 */       Collection<ate> collection = ccq.a((this.bJ == 0L) ? this.T : new Random(this.bJ), a.a());
/*  466 */       for (ate ate : collection) {
/*  467 */         a_(ate);
/*      */       }
/*  469 */       a(☃, i);
/*      */     } else {
/*  471 */       super.a(☃, i, aea1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void r(float ☃) {
/*  476 */     this.bj = ☃;
/*      */   }
/*      */   
/*      */   public void s(float ☃) {
/*  480 */     this.bi = ☃;
/*      */   }
/*      */   
/*      */   public void t(float ☃) {
/*  484 */     this.bh = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void o(float ☃) {
/*  489 */     super.o(☃);
/*  490 */     r(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {
/*  495 */     super.k();
/*      */     
/*  497 */     this.m.A.a("looting");
/*  498 */     if (!this.m.B && dj() && !this.aX && this.m.X().b("mobGriefing")) {
/*  499 */       List<amm> ☃ = this.m.a(amm.class, bD().c(1.0D, 0.0D, 1.0D));
/*  500 */       for (amm amm : ☃) {
/*  501 */         if (amm.G || amm.i().a() || amm.q()) {
/*      */           continue;
/*      */         }
/*  504 */         a(amm);
/*      */       } 
/*      */     } 
/*  507 */     this.m.A.e();
/*      */   }
/*      */   
/*      */   protected void a(amm ☃) {
/*  511 */     ate ate1 = ☃.i();
/*  512 */     aew aew = e(ate1);
/*      */     
/*  514 */     ate ate2 = b(aew);
/*  515 */     boolean bool = a(ate1, ate2, aew);
/*      */     
/*  517 */     if (bool && d(ate1)) {
/*  518 */       double d = c(aew);
/*  519 */       if (!ate2.a() && (this.T.nextFloat() - 0.1F) < d) {
/*  520 */         a_(ate2);
/*      */       }
/*      */       
/*  523 */       a(aew, ate1);
/*  524 */       switch (null.a[aew.a().ordinal()]) {
/*      */         case 1:
/*  526 */           this.bA[aew.b()] = 2.0F;
/*      */           break;
/*      */         case 2:
/*  529 */           this.bB[aew.b()] = 2.0F;
/*      */           break;
/*      */       } 
/*  532 */       this.bG = true;
/*  533 */       a(☃, ate1.C());
/*  534 */       ☃.V();
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean a(ate ☃, ate ate1, aew aew1) {
/*  539 */     boolean bool = true;
/*      */     
/*  541 */     if (!ate1.a()) {
/*  542 */       if (aew1.a() == aew.a.a) {
/*  543 */         if (☃.b() instanceof auh && !(ate1.b() instanceof auh)) {
/*  544 */           bool = true;
/*  545 */         } else if (☃.b() instanceof auh && ate1.b() instanceof auh) {
/*  546 */           auh auh1 = (auh)☃.b();
/*  547 */           auh auh2 = (auh)ate1.b();
/*      */           
/*  549 */           if (auh1.d() == auh2.d()) {
/*  550 */             bool = (☃.g() < ate1.g() || (☃.m() && !ate1.m()));
/*      */           } else {
/*  552 */             bool = (auh1.d() > auh2.d());
/*      */           } 
/*  554 */         } else if (☃.b() instanceof arp && ate1.b() instanceof arp) {
/*  555 */           bool = (☃.m() && !ate1.m());
/*      */         } else {
/*  557 */           bool = false;
/*      */         }
/*      */       
/*  560 */       } else if (☃.b() instanceof arb && !(ate1.b() instanceof arb)) {
/*  561 */         bool = true;
/*  562 */       } else if (☃.b() instanceof arb && ate1.b() instanceof arb && !awg.d(ate1)) {
/*  563 */         arb arb1 = (arb)☃.b();
/*  564 */         arb arb2 = (arb)ate1.b();
/*      */         
/*  566 */         if (arb1.e() == arb2.e()) {
/*  567 */           bool = (☃.g() < ate1.g() || (☃.m() && !ate1.m()));
/*      */         } else {
/*  569 */           bool = (arb1.e() > arb2.e());
/*      */         } 
/*      */       } else {
/*  572 */         bool = false;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  577 */     return bool;
/*      */   }
/*      */   
/*      */   protected boolean d(ate ☃) {
/*  581 */     return true;
/*      */   }
/*      */   
/*      */   public boolean H() {
/*  585 */     return true;
/*      */   }
/*      */   
/*      */   protected void I() {
/*  589 */     if (this.bG) {
/*  590 */       this.aY = 0;
/*      */       
/*      */       return;
/*      */     } 
/*  594 */     aer ☃ = this.m.a(this, -1.0D);
/*  595 */     if (☃ != null) {
/*  596 */       double d1 = ☃.q - this.q;
/*  597 */       double d2 = ☃.r - this.r;
/*  598 */       double d3 = ☃.s - this.s;
/*  599 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*      */       
/*  601 */       if (H() && d4 > 16384.0D) {
/*  602 */         V();
/*      */       }
/*      */       
/*  605 */       if (this.aY > 600 && this.T.nextInt(800) == 0 && d4 > 1024.0D && H()) {
/*  606 */         V();
/*  607 */       } else if (d4 < 1024.0D) {
/*  608 */         this.aY = 0;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected final void cM() {
/*  616 */     this.aY++;
/*  617 */     this.m.A.a("checkDespawn");
/*  618 */     I();
/*  619 */     this.m.A.e();
/*      */     
/*  621 */     this.m.A.a("sensing");
/*  622 */     this.bC.a();
/*  623 */     this.m.A.e();
/*      */     
/*  625 */     this.m.A.a("targetSelector");
/*  626 */     this.bz.a();
/*  627 */     this.m.A.e();
/*      */     
/*  629 */     this.m.A.a("goalSelector");
/*  630 */     this.by.a();
/*  631 */     this.m.A.e();
/*      */     
/*  633 */     this.m.A.a("navigation");
/*  634 */     this.bx.d();
/*  635 */     this.m.A.e();
/*      */     
/*  637 */     this.m.A.a("mob tick");
/*  638 */     J();
/*  639 */     this.m.A.e();
/*      */     
/*  641 */     if (aW() && bU() instanceof afb) {
/*  642 */       afb ☃ = (afb)bU();
/*  643 */       ☃.t().a(t().m(), 1.5D);
/*  644 */       ☃.r().a(r());
/*      */     } 
/*      */     
/*  647 */     this.m.A.a("controls");
/*  648 */     this.m.A.a("move");
/*  649 */     this.g.a();
/*  650 */     this.m.A.c("look");
/*  651 */     this.f.a();
/*  652 */     this.m.A.c("jump");
/*  653 */     this.h.b();
/*  654 */     this.m.A.e();
/*  655 */     this.m.A.e();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void J() {}
/*      */   
/*      */   public int K() {
/*  662 */     return 40;
/*      */   }
/*      */   
/*      */   public int L() {
/*  666 */     return 10;
/*      */   }
/*      */   
/*      */   public void a(aer ☃, float f1, float f2) {
/*  670 */     double d2, d1 = ☃.q - this.q;
/*      */     
/*  672 */     double d3 = ☃.s - this.s;
/*      */     
/*  674 */     if (☃ instanceof afa) {
/*  675 */       afa afa1 = (afa)☃;
/*  676 */       d2 = afa1.r + afa1.bF() - this.r + bF();
/*      */     } else {
/*  678 */       d2 = ((☃.bD()).b + (☃.bD()).e) / 2.0D - this.r + bF();
/*      */     } 
/*      */     
/*  681 */     double d4 = xq.a(d1 * d1 + d3 * d3);
/*      */     
/*  683 */     float f3 = (float)(xq.c(d3, d1) * 57.2957763671875D) - 90.0F;
/*  684 */     float f4 = (float)-(xq.c(d2, d4) * 57.2957763671875D);
/*  685 */     this.x = c(this.x, f4, f2);
/*  686 */     this.w = c(this.w, f3, f1);
/*      */   }
/*      */   
/*      */   private float c(float ☃, float f1, float f2) {
/*  690 */     float f = xq.g(f1 - ☃);
/*  691 */     if (f > f2) {
/*  692 */       f = f2;
/*      */     }
/*  694 */     if (f < -f2) {
/*  695 */       f = -f2;
/*      */     }
/*  697 */     return ☃ + f;
/*      */   }
/*      */   
/*      */   public boolean a(axz ☃, boolean bool) {
/*  701 */     blc blc = ☃.a_((new el(this)).b());
/*  702 */     return blc.a(this);
/*      */   }
/*      */   
/*      */   public final boolean M() {
/*  706 */     return a(this.m);
/*      */   }
/*      */   
/*      */   public boolean a(ayc ☃) {
/*  710 */     return (!☃.c(bD()) && ☃.c(this, bD()) && ☃.a_(this, bD()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int dg() {
/*  718 */     return 4;
/*      */   }
/*      */   
/*      */   public boolean c(int ☃) {
/*  722 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int bn() {
/*  727 */     if (v() == null) {
/*  728 */       return 3;
/*      */     }
/*  730 */     int ☃ = (int)(cq() - cw() * 0.33F);
/*  731 */     ☃ -= (3 - this.m.aj().a()) * 4;
/*  732 */     if (☃ < 0) {
/*  733 */       ☃ = 0;
/*      */     }
/*  735 */     return ☃ + 3;
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<ate> aS() {
/*  740 */     return this.bD;
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<ate> aT() {
/*  745 */     return this.bE;
/*      */   }
/*      */ 
/*      */   
/*      */   public ate b(aew ☃) {
/*  750 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/*  752 */         return this.bD.get(☃.b());
/*      */       case 2:
/*  754 */         return this.bE.get(☃.b());
/*      */     } 
/*  756 */     return ate.a;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aew ☃, ate ate1) {
/*  761 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/*  763 */         this.bD.set(☃.b(), ate1);
/*      */         break;
/*      */       case 2:
/*  766 */         this.bE.set(☃.b(), ate1);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(boolean ☃, int i) {
/*  773 */     for (aew aew : aew.values()) {
/*  774 */       ate ate = b(aew);
/*  775 */       float f = c(aew);
/*  776 */       boolean bool = (f > 1.0F);
/*  777 */       if (!ate.a() && !awg.e(ate) && (☃ || bool) && this.T.nextFloat() - i * 0.01F < f) {
/*  778 */         if (!bool && ate.e()) {
/*  779 */           ate.b(ate.h() - this.T.nextInt(1 + this.T.nextInt(Math.max(ate.h() - 3, 1))));
/*      */         }
/*  781 */         a_(ate);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected float c(aew ☃) {
/*  788 */     switch (null.a[☃.a().ordinal()])
/*      */     { case 1:
/*  790 */         f = this.bA[☃.b()];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  800 */         return f;case 2: f = this.bB[☃.b()]; return f; }  float f = 0.0F; return f;
/*      */   }
/*      */   
/*      */   protected void a(adj ☃) {
/*  804 */     if (this.T.nextFloat() < 0.15F * ☃.d()) {
/*  805 */       int i = this.T.nextInt(2);
/*  806 */       float f = (this.m.aj() == adi.d) ? 0.1F : 0.25F;
/*  807 */       if (this.T.nextFloat() < 0.095F) {
/*  808 */         i++;
/*      */       }
/*  810 */       if (this.T.nextFloat() < 0.095F) {
/*  811 */         i++;
/*      */       }
/*  813 */       if (this.T.nextFloat() < 0.095F) {
/*  814 */         i++;
/*      */       }
/*      */       
/*  817 */       boolean bool = true;
/*  818 */       for (aew aew : aew.values()) {
/*  819 */         if (aew.a() == aew.a.b) {
/*      */ 
/*      */           
/*  822 */           ate ate = b(aew);
/*  823 */           if (!bool && this.T.nextFloat() < f) {
/*      */             break;
/*      */           }
/*  826 */           bool = false;
/*  827 */           if (ate.a()) {
/*  828 */             ata ata = a(aew, i);
/*  829 */             if (ata != null)
/*  830 */               a(aew, new ate(ata)); 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public static aew e(ate ☃) {
/*  838 */     ata ata = ☃.b();
/*  839 */     if (ata == bct.di.h() || (ata instanceof arj && ((arj)ata).d() instanceof bcc)) {
/*  840 */       return aew.f;
/*      */     }
/*      */     
/*  843 */     if (ata instanceof arb) {
/*  844 */       return ((arb)ata).b();
/*      */     }
/*      */     
/*  847 */     if (ata == atf.eL) {
/*  848 */       return aew.e;
/*      */     }
/*      */     
/*  851 */     if (ata == atf.eK) {
/*  852 */       return aew.b;
/*      */     }
/*      */     
/*  855 */     return aew.a;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public static ata a(aew ☃, int i) {
/*  860 */     switch (null.b[☃.ordinal()]) {
/*      */       case 1:
/*  862 */         if (i == 0) {
/*  863 */           return atf.U;
/*      */         }
/*  865 */         if (i == 1) {
/*  866 */           return atf.ak;
/*      */         }
/*  868 */         if (i == 2) {
/*  869 */           return atf.Y;
/*      */         }
/*  871 */         if (i == 3) {
/*  872 */           return atf.ac;
/*      */         }
/*  874 */         if (i == 4) {
/*  875 */           return atf.ag;
/*      */         }
/*      */       case 2:
/*  878 */         if (i == 0) {
/*  879 */           return atf.V;
/*      */         }
/*  881 */         if (i == 1) {
/*  882 */           return atf.al;
/*      */         }
/*  884 */         if (i == 2) {
/*  885 */           return atf.Z;
/*      */         }
/*  887 */         if (i == 3) {
/*  888 */           return atf.ad;
/*      */         }
/*  890 */         if (i == 4) {
/*  891 */           return atf.ah;
/*      */         }
/*      */       case 3:
/*  894 */         if (i == 0) {
/*  895 */           return atf.W;
/*      */         }
/*  897 */         if (i == 1) {
/*  898 */           return atf.am;
/*      */         }
/*  900 */         if (i == 2) {
/*  901 */           return atf.aa;
/*      */         }
/*  903 */         if (i == 3) {
/*  904 */           return atf.ae;
/*      */         }
/*  906 */         if (i == 4) {
/*  907 */           return atf.ai;
/*      */         }
/*      */       case 4:
/*  910 */         if (i == 0) {
/*  911 */           return atf.X;
/*      */         }
/*  913 */         if (i == 1) {
/*  914 */           return atf.an;
/*      */         }
/*  916 */         if (i == 2) {
/*  917 */           return atf.ab;
/*      */         }
/*  919 */         if (i == 3) {
/*  920 */           return atf.af;
/*      */         }
/*  922 */         if (i == 4) {
/*  923 */           return atf.aj;
/*      */         }
/*      */         break;
/*      */     } 
/*  927 */     return null;
/*      */   }
/*      */   
/*      */   protected void b(adj ☃) {
/*  931 */     float f = ☃.d();
/*      */     
/*  933 */     if (!cB().a() && this.T.nextFloat() < 0.25F * f) {
/*  934 */       a(aew.a, awg.a(this.T, cB(), (int)(5.0F + f * this.T.nextInt(18)), false));
/*      */     }
/*      */     
/*  937 */     for (aew aew : aew.values()) {
/*  938 */       if (aew.a() == aew.a.b) {
/*      */ 
/*      */         
/*  941 */         ate ate = b(aew);
/*  942 */         if (!ate.a() && this.T.nextFloat() < 0.5F * f)
/*  943 */           a(aew, awg.a(this.T, ate, (int)(5.0F + f * this.T.nextInt(18)), false)); 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*  950 */     a(ank.b).b(new afo("Random spawn bonus", this.T.nextGaussian() * 0.05D, 1));
/*      */     
/*  952 */     if (this.T.nextFloat() < 0.05F) {
/*  953 */       r(true);
/*      */     } else {
/*  955 */       r(false);
/*      */     } 
/*      */     
/*  958 */     return afj1;
/*      */   }
/*      */   
/*      */   public boolean dh() {
/*  962 */     return false;
/*      */   }
/*      */   
/*      */   public void di() {
/*  966 */     this.bG = true;
/*      */   }
/*      */   
/*      */   public void a(aew ☃, float f) {
/*  970 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/*  972 */         this.bA[☃.b()] = f;
/*      */         break;
/*      */       case 2:
/*  975 */         this.bB[☃.b()] = f;
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean dj() {
/*  981 */     return this.bF;
/*      */   }
/*      */   
/*      */   public void p(boolean ☃) {
/*  985 */     this.bF = ☃;
/*      */   }
/*      */   
/*      */   public boolean dk() {
/*  989 */     return this.bG;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean b(aog ☃, adk adk1) {
/*  994 */     if (dm() && dn() == ☃) {
/*  995 */       a(true, !☃.bV.d);
/*  996 */       return true;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1001 */     ate ate = ☃.b(adk1);
/* 1002 */     if (ate.b() == atf.ec && a(☃)) {
/* 1003 */       b(☃, true);
/* 1004 */       ate.g(1);
/* 1005 */       return true;
/*      */     } 
/*      */     
/* 1008 */     if (a(☃, adk1)) {
/* 1009 */       return true;
/*      */     }
/*      */     
/* 1012 */     return super.b(☃, adk1);
/*      */   }
/*      */   
/*      */   protected boolean a(aog ☃, adk adk1) {
/* 1016 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void dl() {
/* 1022 */     if (this.bM != null) {
/* 1023 */       dr();
/*      */     }
/* 1025 */     if (!this.bK) {
/*      */       return;
/*      */     }
/* 1028 */     if (!aF()) {
/* 1029 */       a(true, true);
/*      */     }
/*      */     
/* 1032 */     if (this.bL == null || this.bL.G) {
/* 1033 */       a(true, true);
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/* 1039 */     if (this.bK) {
/* 1040 */       this.bK = false;
/* 1041 */       this.bL = null;
/* 1042 */       if (!this.m.B && bool1) {
/* 1043 */         a(atf.ec);
/*      */       }
/*      */       
/* 1046 */       if (!this.m.B && ☃ && this.m instanceof td) {
/* 1047 */         ((td)this.m).A().a(this, new lh(this, null));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(aog ☃) {
/* 1053 */     return (!dm() && !(this instanceof amy));
/*      */   }
/*      */   
/*      */   public boolean dm() {
/* 1057 */     return this.bK;
/*      */   }
/*      */   
/*      */   public aer dn() {
/* 1061 */     return this.bL;
/*      */   }
/*      */   
/*      */   public void b(aer ☃, boolean bool) {
/* 1065 */     this.bK = true;
/* 1066 */     this.bL = ☃;
/*      */     
/* 1068 */     if (!this.m.B && bool && this.m instanceof td) {
/* 1069 */       ((td)this.m).A().a(this, new lh(this, this.bL));
/*      */     }
/*      */     
/* 1072 */     if (aW()) {
/* 1073 */       S_();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aer ☃, boolean bool) {
/* 1079 */     boolean bool1 = super.a(☃, bool);
/* 1080 */     if (bool1 && dm()) {
/* 1081 */       a(true, true);
/*      */     }
/*      */     
/* 1084 */     return bool1;
/*      */   }
/*      */ 
/*      */   
/*      */   private void dr() {
/* 1089 */     if (this.bK && this.bM != null) {
/* 1090 */       if (this.bM.b("UUID")) {
/* 1091 */         UUID ☃ = this.bM.a("UUID");
/* 1092 */         List<afa> list = this.m.a(afa.class, bD().g(10.0D));
/* 1093 */         for (afa afa1 : list) {
/* 1094 */           if (afa1.bt().equals(☃)) {
/* 1095 */             b(afa1, true);
/*      */             break;
/*      */           } 
/*      */         } 
/* 1099 */       } else if (this.bM.c("X", 99) && this.bM.c("Y", 99) && this.bM.c("Z", 99)) {
/* 1100 */         el ☃ = new el(this.bM.h("X"), this.bM.h("Y"), this.bM.h("Z"));
/*      */         
/* 1102 */         amc amc = amc.b(this.m, ☃);
/* 1103 */         if (amc == null) {
/* 1104 */           amc = amc.a(this.m, ☃);
/*      */         }
/* 1106 */         b(amc, true);
/*      */       } else {
/* 1108 */         a(false, true);
/*      */       } 
/*      */     }
/* 1111 */     this.bM = null;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(int ☃, ate ate1) {
/*      */     aew aew;
/* 1117 */     if (☃ == 98) {
/* 1118 */       aew = aew.a;
/* 1119 */     } else if (☃ == 99) {
/* 1120 */       aew = aew.b;
/*      */     }
/* 1122 */     else if (☃ == 100 + aew.f.b()) {
/* 1123 */       aew = aew.f;
/* 1124 */     } else if (☃ == 100 + aew.e.b()) {
/* 1125 */       aew = aew.e;
/* 1126 */     } else if (☃ == 100 + aew.d.b()) {
/* 1127 */       aew = aew.d;
/* 1128 */     } else if (☃ == 100 + aew.c.b()) {
/* 1129 */       aew = aew.c;
/*      */     } else {
/* 1131 */       return false;
/*      */     } 
/*      */     
/* 1134 */     if (ate1.a() || b(aew, ate1) || aew == aew.f) {
/* 1135 */       a(aew, ate1);
/* 1136 */       return true;
/*      */     } 
/* 1138 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bT() {
/* 1143 */     return (dh() && super.bT());
/*      */   }
/*      */   
/*      */   public static boolean b(aew ☃, ate ate1) {
/* 1147 */     aew aew1 = e(ate1);
/* 1148 */     return (aew1 == ☃ || (aew1 == aew.a && ☃ == aew.b) || (aew1 == aew.b && ☃ == aew.a));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean cP() {
/* 1156 */     return (super.cP() && !do());
/*      */   }
/*      */   
/*      */   public void q(boolean ☃) {
/* 1160 */     byte b = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 1161 */     this.ab.b(a, Byte.valueOf(☃ ? (byte)(b | 0x1) : (byte)(b & 0xFFFFFFFE)));
/*      */   }
/*      */   
/*      */   public void r(boolean ☃) {
/* 1165 */     byte b = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 1166 */     this.ab.b(a, Byte.valueOf(☃ ? (byte)(b | 0x2) : (byte)(b & 0xFFFFFFFD)));
/*      */   }
/*      */   
/*      */   public boolean do() {
/* 1170 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x1) != 0);
/*      */   }
/*      */   
/*      */   public boolean dp() {
/* 1174 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x2) != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public aez cS() {
/* 1179 */     return dp() ? aez.a : aez.b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean B(aer ☃) {
/* 1190 */     float f = (float)a(ank.f).e();
/* 1191 */     int i = 0;
/*      */     
/* 1193 */     if (☃ instanceof afa) {
/* 1194 */       f += awg.a(cB(), ((afa)☃).cA());
/* 1195 */       i += awg.b(this);
/*      */     } 
/*      */     
/* 1198 */     boolean bool = ☃.a(aea.a(this), f);
/*      */     
/* 1200 */     if (bool) {
/* 1201 */       if (i > 0 && ☃ instanceof afa) {
/* 1202 */         ((afa)☃).a(this, i * 0.5F, xq.a(this.w * 0.017453292F), -xq.b(this.w * 0.017453292F));
/* 1203 */         this.t *= 0.6D;
/* 1204 */         this.v *= 0.6D;
/*      */       } 
/*      */       
/* 1207 */       int j = awg.c(this);
/* 1208 */       if (j > 0) {
/* 1209 */         ☃.f(j * 4);
/*      */       }
/*      */       
/* 1212 */       if (☃ instanceof aog) {
/* 1213 */         aog aog = (aog)☃;
/* 1214 */         ate ate1 = cB();
/* 1215 */         ate ate2 = aog.cT() ? aog.cW() : ate.a;
/*      */         
/* 1217 */         if (!ate1.a() && !ate2.a() && ate1.b() instanceof arg && ate2.b() == atf.eK) {
/* 1218 */           float f1 = 0.25F + awg.f(this) * 0.05F;
/*      */           
/* 1220 */           if (this.T.nextFloat() < f1) {
/* 1221 */             aog.dI().a(atf.eK, 100);
/* 1222 */             this.m.a(aog, (byte)30);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1227 */       a(this, ☃);
/*      */     } 
/*      */     
/* 1230 */     return bool;
/*      */   }
/*      */   
/*      */   protected boolean dq() {
/* 1234 */     if (this.m.L() && !this.m.B) {
/* 1235 */       float ☃ = az();
/* 1236 */       el el = (bU() instanceof apj) ? (new el(this.q, Math.round(this.r), this.s)).a() : new el(this.q, Math.round(this.r), this.s);
/* 1237 */       if (☃ > 0.5F && this.T.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F && this.m.e(el)) {
/* 1238 */         return true;
/*      */       }
/*      */     } 
/* 1241 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(wz<byv> ☃) {
/* 1246 */     if (t().t()) {
/* 1247 */       super.c(☃);
/*      */     } else {
/* 1249 */       this.u += 0.30000001192092896D;
/*      */     } 
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\afb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */