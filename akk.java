/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akk
/*     */   extends ajq
/*     */ {
/*  67 */   private static final or<el> bD = ou.a((Class)akk.class, ot.l);
/*  68 */   private static final or<Boolean> bE = ou.a((Class)akk.class, ot.i);
/*  69 */   private static final or<Boolean> bG = ou.a((Class)akk.class, ot.i);
/*  70 */   private static final or<el> bH = ou.a((Class)akk.class, ot.l);
/*  71 */   private static final or<Boolean> bI = ou.a((Class)akk.class, ot.i);
/*  72 */   private static final or<Boolean> bJ = ou.a((Class)akk.class, ot.i);
/*     */   private int bK;
/*     */   
/*     */   static {
/*  76 */     bC = (☃ -> (☃ instanceof afa) ? (
/*     */       
/*  78 */       (((afa)☃).y_() && !☃.an())) : false);
/*     */   }
/*     */   
/*     */   public static final Predicate<aer> bC;
/*     */   
/*     */   public akk(axy ☃) {
/*  84 */     super(aev.av, ☃);
/*  85 */     a(1.2F, 0.4F);
/*  86 */     this.g = new e(this);
/*  87 */     this.bF = bct.D;
/*  88 */     this.Q = 1.0F;
/*     */   }
/*     */   
/*     */   public void g(el ☃) {
/*  92 */     this.ab.b(bD, ☃);
/*     */   }
/*     */   
/*     */   private el dA() {
/*  96 */     return this.ab.<el>a(bD);
/*     */   }
/*     */   
/*     */   private void h(el ☃) {
/* 100 */     this.ab.b(bH, ☃);
/*     */   }
/*     */   
/*     */   private el dB() {
/* 104 */     return this.ab.<el>a(bH);
/*     */   }
/*     */   
/*     */   public boolean dy() {
/* 108 */     return ((Boolean)this.ab.<Boolean>a(bE)).booleanValue();
/*     */   }
/*     */   
/*     */   private void s(boolean ☃) {
/* 112 */     this.ab.b(bE, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean dz() {
/* 116 */     return ((Boolean)this.ab.<Boolean>a(bG)).booleanValue();
/*     */   }
/*     */   
/*     */   private void t(boolean ☃) {
/* 120 */     this.bK = ☃ ? 1 : 0;
/* 121 */     this.ab.b(bG, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   private boolean dC() {
/* 125 */     return ((Boolean)this.ab.<Boolean>a(bI)).booleanValue();
/*     */   }
/*     */   
/*     */   private void u(boolean ☃) {
/* 129 */     this.ab.b(bI, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   private boolean dH() {
/* 133 */     return ((Boolean)this.ab.<Boolean>a(bJ)).booleanValue();
/*     */   }
/*     */   
/*     */   private void v(boolean ☃) {
/* 137 */     this.ab.b(bJ, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 142 */     super.x_();
/* 143 */     this.ab.a(bD, el.a);
/* 144 */     this.ab.a(bE, Boolean.valueOf(false));
/* 145 */     this.ab.a(bH, el.a);
/* 146 */     this.ab.a(bI, Boolean.valueOf(false));
/* 147 */     this.ab.a(bJ, Boolean.valueOf(false));
/* 148 */     this.ab.a(bG, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 153 */     super.b(☃);
/*     */     
/* 155 */     ☃.b("HomePosX", dA().o());
/* 156 */     ☃.b("HomePosY", dA().p());
/* 157 */     ☃.b("HomePosZ", dA().q());
/* 158 */     ☃.a("HasEgg", dy());
/*     */     
/* 160 */     ☃.b("TravelPosX", dB().o());
/* 161 */     ☃.b("TravelPosY", dB().p());
/* 162 */     ☃.b("TravelPosZ", dB().q());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 167 */     int i = ☃.h("HomePosX");
/* 168 */     int j = ☃.h("HomePosY");
/* 169 */     int k = ☃.h("HomePosZ");
/* 170 */     g(new el(i, j, k));
/*     */     
/* 172 */     super.a(☃);
/* 173 */     s(☃.q("HasEgg"));
/*     */     
/* 175 */     int m = ☃.h("TravelPosX");
/* 176 */     int n = ☃.h("TravelPosY");
/* 177 */     int i1 = ☃.h("TravelPosZ");
/* 178 */     h(new el(m, n, i1));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 184 */     g(new el(this.q, this.r, this.s));
/* 185 */     h(el.a);
/* 186 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 191 */     el el = new el(this.q, (bD()).b, this.s);
/* 192 */     return (el.p() < ☃.k() + 4 && super.a(☃, bool));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 197 */     this.by.a(0, new f(this, 1.2D));
/* 198 */     this.by.a(1, new a(this, 1.0D));
/* 199 */     this.by.a(1, new d(this, 1.0D));
/* 200 */     this.by.a(2, new i(this, 1.1D, bct.aU.h()));
/* 201 */     this.by.a(3, new c(this, 1.0D));
/* 202 */     this.by.a(4, new b(this, 1.0D));
/* 203 */     this.by.a(7, new j(this, 1.0D));
/* 204 */     this.by.a(8, new ahb(this, (Class)aog.class, 8.0F));
/* 205 */     this.by.a(9, new h(this, 1.0D, 100));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 210 */     super.bZ();
/*     */     
/* 212 */     a(ank.a).a(30.0D);
/* 213 */     a(ank.d).a(0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bw() {
/* 218 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ca() {
/* 224 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 229 */     return afd.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public int z() {
/* 234 */     return 200;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi D() {
/* 240 */     if (!an() && this.A && !y_()) {
/* 241 */       return wj.jX;
/*     */     }
/*     */     
/* 244 */     return super.D();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(float ☃) {
/* 249 */     super.d(☃ * 1.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ad() {
/* 254 */     return wj.ki;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi d(aea ☃) {
/* 260 */     if (y_()) {
/* 261 */       return wj.ke;
/*     */     }
/* 263 */     return wj.kd;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi cs() {
/* 269 */     if (y_()) {
/* 270 */       return wj.jZ;
/*     */     }
/* 272 */     return wj.jY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 277 */     wi wi = y_() ? wj.kh : wj.kg;
/*     */     
/* 279 */     a(wi, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dD() {
/* 284 */     return (super.dD() && !dy());
/*     */   }
/*     */ 
/*     */   
/*     */   protected float ab() {
/* 289 */     return this.L + 0.15F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 294 */     a(☃ ? 0.3F : 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/* 299 */     return new g(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aeo a(aeo ☃) {
/* 305 */     return new akk(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/* 310 */     return (☃.b() == bct.aU.h());
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(el ☃, ayc ayc1) {
/* 315 */     if (!dC() && ayc1.b(☃).a(ww.a)) {
/* 316 */       return 10.0F;
/*     */     }
/* 318 */     return super.a(☃, ayc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 323 */     super.k();
/*     */     
/* 325 */     if (dz() && this.bK >= 1 && this.bK % 5 == 0) {
/* 326 */       el ☃ = new el(this);
/* 327 */       if (this.m.a_(☃.b()).c() == bct.D) {
/* 328 */         this.m.b(2001, ☃, bcs.l(bct.D.p()));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l() {
/* 335 */     super.l();
/*     */ 
/*     */     
/* 338 */     if (this.m.X().b("doMobLoot")) {
/* 339 */       a(atf.eV, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 345 */     if (cP() && an()) {
/* 346 */       a(☃, f1, f2, 0.1F);
/* 347 */       a(afe.a, this.t, this.u, this.v);
/*     */       
/* 349 */       this.t *= 0.8999999761581421D;
/* 350 */       this.u *= 0.8999999761581421D;
/* 351 */       this.v *= 0.8999999761581421D;
/* 352 */       if (v() == null && (!dC() || c(dA()) >= 400.0D)) {
/* 353 */         this.u -= 0.005D;
/*     */       }
/*     */     } else {
/* 356 */       super.a(☃, f1, f2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 362 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 368 */     return ccl.aI;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amj ☃) {
/* 373 */     a(aea.b, Float.MAX_VALUE);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 378 */     super.a(☃);
/*     */     
/* 380 */     if (☃ == aea.b)
/* 381 */       a(new ate(atf.D, 1), 0.0F); 
/*     */   }
/*     */   
/*     */   static class f
/*     */     extends aho {
/*     */     f(akk ☃, double d) {
/* 387 */       super(☃, d);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 392 */       if (this.a.cf() == null && !this.a.aV()) {
/* 393 */         return false;
/*     */       }
/*     */       
/* 396 */       el ☃ = a(this.a.m, this.a, 7, 4);
/* 397 */       if (☃ != null) {
/* 398 */         this.c = ☃.o();
/* 399 */         this.d = ☃.p();
/* 400 */         this.e = ☃.q();
/*     */         
/* 402 */         return true;
/*     */       } 
/*     */       
/* 405 */       return g();
/*     */     }
/*     */   }
/*     */   
/*     */   static class j extends agt {
/*     */     private final akk a;
/*     */     private final double b;
/*     */     private boolean c;
/*     */     
/*     */     j(akk ☃, double d) {
/* 415 */       this.a = ☃;
/* 416 */       this.b = d;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 421 */       return (!akk.a(this.a) && !this.a.dy() && this.a.an());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 426 */       int ☃ = 512;
/* 427 */       int i = 4;
/* 428 */       Random random = akk.b(this.a);
/* 429 */       int k = random.nextInt(1025) - 512;
/* 430 */       int m = random.nextInt(9) - 4;
/* 431 */       int n = random.nextInt(1025) - 512;
/*     */       
/* 433 */       if (m + this.a.r > (this.a.m.k() - 1)) {
/* 434 */         m = 0;
/*     */       }
/* 436 */       el el = new el(k + this.a.q, m + this.a.r, n + this.a.s);
/* 437 */       akk.a(this.a, el);
/* 438 */       akk.a(this.a, true);
/* 439 */       this.c = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 444 */       if (this.a.t().p()) {
/* 445 */         el ☃ = akk.c(this.a);
/* 446 */         cee cee = ajd.a(this.a, 16, 3, new cee(☃.o(), ☃.p(), ☃.q()), 0.3141592741012573D);
/* 447 */         if (cee == null) {
/* 448 */           cee = ajd.a(this.a, 8, 7, new cee(☃.o(), ☃.p(), ☃.q()));
/*     */         }
/*     */ 
/*     */         
/* 452 */         if (cee != null) {
/* 453 */           int i = xq.c(cee.b);
/* 454 */           int k = xq.c(cee.d);
/* 455 */           int m = 34;
/* 456 */           bwf bwf = new bwf(i - 34, 0, k - 34, i + 34, 0, k + 34);
/* 457 */           if (!this.a.m.a(bwf)) {
/* 458 */             cee = null;
/*     */           }
/*     */         } 
/*     */         
/* 462 */         if (cee == null) {
/* 463 */           this.c = true;
/*     */           
/*     */           return;
/*     */         } 
/* 467 */         this.a.t().a(cee.b, cee.c, cee.d, this.b);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 473 */       return (!this.a.t().p() && !this.c && !akk.a(this.a) && !this.a.dF() && !this.a.dy());
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 478 */       akk.a(this.a, false);
/* 479 */       super.d();
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends agt {
/*     */     private final akk a;
/*     */     private final double b;
/*     */     private boolean c;
/*     */     private int d;
/*     */     
/*     */     b(akk ☃, double d) {
/* 491 */       this.a = ☃;
/* 492 */       this.b = d;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 497 */       if (this.a.y_()) {
/* 498 */         return false;
/*     */       }
/*     */       
/* 501 */       if (this.a.dy()) {
/* 502 */         return true;
/*     */       }
/*     */       
/* 505 */       if (this.a.ce().nextInt(700) != 0) {
/* 506 */         return false;
/*     */       }
/*     */       
/* 509 */       return (this.a.c(akk.d(this.a)) >= 4096.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 514 */       akk.b(this.a, true);
/* 515 */       this.c = false;
/* 516 */       this.d = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 521 */       akk.b(this.a, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 526 */       return (this.a.c(akk.d(this.a)) >= 49.0D && !this.c && this.d <= 600);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 531 */       el ☃ = akk.d(this.a);
/* 532 */       boolean bool = (this.a.c(☃) <= 256.0D);
/* 533 */       if (bool) {
/* 534 */         this.d++;
/*     */       }
/*     */       
/* 537 */       if (this.a.t().p()) {
/* 538 */         cee cee = ajd.a(this.a, 16, 3, new cee(☃.o(), ☃.p(), ☃.q()), 0.3141592741012573D);
/* 539 */         if (cee == null) {
/* 540 */           cee = ajd.a(this.a, 8, 7, new cee(☃.o(), ☃.p(), ☃.q()));
/*     */         }
/*     */         
/* 543 */         if (cee != null && !bool && this.a.m.a_(new el(cee)).c() != bct.A)
/*     */         {
/* 545 */           cee = ajd.a(this.a, 16, 5, new cee(☃.o(), ☃.p(), ☃.q()));
/*     */         }
/*     */         
/* 548 */         if (cee == null) {
/* 549 */           this.c = true;
/*     */           
/*     */           return;
/*     */         } 
/* 553 */         this.a.t().a(cee.b, cee.c, cee.d, this.b);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class i extends agt {
/*     */     private final akk a;
/*     */     private final double b;
/*     */     private aog c;
/*     */     private int d;
/*     */     private final Set<ata> e;
/*     */     
/*     */     i(akk ☃, double d, ata ata1) {
/* 566 */       this.a = ☃;
/* 567 */       this.b = d;
/* 568 */       this.e = Sets.newHashSet((Object[])new ata[] { ata1 });
/* 569 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 574 */       if (this.d > 0) {
/* 575 */         this.d--;
/* 576 */         return false;
/*     */       } 
/* 578 */       this.c = this.a.m.a(this.a, 10.0D);
/*     */       
/* 580 */       if (this.c == null) {
/* 581 */         return false;
/*     */       }
/* 583 */       return (a(this.c.cB()) || a(this.c.cC()));
/*     */     }
/*     */     
/*     */     private boolean a(ate ☃) {
/* 587 */       return this.e.contains(☃.b());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 592 */       return a();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 597 */       this.c = null;
/* 598 */       this.a.t().q();
/* 599 */       this.d = 100;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 604 */       this.a.p().a(this.c, (this.a.L() + 20), this.a.K());
/* 605 */       if (this.a.h(this.c) < 6.25D) {
/* 606 */         this.a.t().q();
/*     */       } else {
/* 608 */         this.a.t().a(this.c, this.b);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends agi {
/*     */     private final akk d;
/*     */     
/*     */     a(akk ☃, double d) {
/* 617 */       super(☃, d);
/* 618 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 623 */       return (super.a() && !this.d.dy());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void g() {
/* 628 */       tf ☃ = this.a.dE();
/* 629 */       if (☃ == null && this.c.dE() != null) {
/* 630 */         ☃ = this.c.dE();
/*     */       }
/*     */       
/* 633 */       if (☃ != null) {
/* 634 */         ☃.a(ws.N);
/* 635 */         p.o.a(☃, this.a, this.c, null);
/*     */       } 
/*     */       
/* 638 */       akk.c(this.d, true);
/* 639 */       this.a.dG();
/* 640 */       this.c.dG();
/*     */       
/* 642 */       Random random = this.a.ce();
/* 643 */       if (this.b.X().b("doMobLoot"))
/* 644 */         this.b.a(new aex(this.b, this.a.q, this.a.r, this.a.s, random.nextInt(7) + 1)); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class d
/*     */     extends ahh {
/*     */     private final akk f;
/*     */     
/*     */     d(akk ☃, double d1) {
/* 653 */       super(☃, d1, 16);
/* 654 */       this.f = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 659 */       if (this.f.dy() && this.f.c(akk.d(this.f)) < 81.0D) {
/* 660 */         return super.a();
/*     */       }
/* 662 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 667 */       return (super.b() && this.f.dy() && this.f.c(akk.d(this.f)) < 81.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 672 */       super.e();
/*     */       
/* 674 */       el ☃ = new el(this.f);
/* 675 */       if (!this.f.an() && k()) {
/* 676 */         if (akk.e(this.f) < 1) {
/* 677 */           akk.d(this.f, true);
/* 678 */         } else if (akk.e(this.f) > 200) {
/* 679 */           axy axy = this.f.m;
/* 680 */           axy.a((aog)null, ☃, wj.kf, wk.e, 0.3F, 0.9F + axy.s.nextFloat() * 0.2F);
/* 681 */           axy.a(this.d.a(), bct.jG.p().a(bip.b, Integer.valueOf(akk.f(this.f).nextInt(4) + 1)), 3);
/* 682 */           akk.c(this.f, false);
/* 683 */           akk.d(this.f, false);
/* 684 */           this.f.d(600);
/*     */         } 
/* 686 */         if (this.f.dz()) {
/* 687 */           akk.g(this.f);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(ayc ☃, el el1) {
/* 694 */       if (!☃.c(el1.a())) {
/* 695 */         return false;
/*     */       }
/*     */       
/* 698 */       bcs bcs = ☃.a_(el1).c();
/* 699 */       return (bcs == bct.D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class h extends ahr {
/*     */     private final akk h;
/*     */     
/*     */     private h(akk ☃, double d, int i) {
/* 707 */       super(☃, d, i);
/* 708 */       this.h = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 713 */       if (!this.a.an() && !akk.a(this.h) && !this.h.dy()) {
/* 714 */         return super.a();
/*     */       }
/*     */       
/* 717 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends ahh
/*     */   {
/*     */     private final akk f;
/*     */     
/*     */     private c(akk ☃, double d) {
/* 727 */       super(☃, ☃.y_() ? 2.0D : d, 24);
/* 728 */       this.f = ☃;
/* 729 */       this.e = -1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 734 */       return (!this.f.an() && this.c <= 1200 && a(this.f.m, this.d));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 739 */       if (this.f.y_() && !this.f.an()) {
/* 740 */         return super.a();
/*     */       }
/*     */       
/* 743 */       if (!akk.a(this.f) && !this.f.an() && !this.f.dy()) {
/* 744 */         return super.a();
/*     */       }
/*     */       
/* 747 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int j() {
/* 752 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean i() {
/* 757 */       return (this.c % 160 == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(ayc ☃, el el1) {
/* 762 */       bcs bcs = ☃.a_(el1).c();
/* 763 */       return (bcs == bct.A);
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends agb {
/*     */     private final akk i;
/*     */     
/*     */     e(akk ☃) {
/* 771 */       super(☃);
/* 772 */       this.i = ☃;
/*     */     }
/*     */     
/*     */     private void g() {
/* 776 */       if (this.i.an()) {
/* 777 */         this.i.u += 0.005D;
/*     */         
/* 779 */         if (this.i.c(akk.d(this.i)) > 256.0D) {
/* 780 */           this.i.o(Math.max(this.i.cK() / 2.0F, 0.08F));
/*     */         }
/*     */         
/* 783 */         if (this.i.y_()) {
/* 784 */           this.i.o(Math.max(this.i.cK() / 3.0F, 0.06F));
/*     */         }
/* 786 */       } else if (this.i.A) {
/* 787 */         this.i.o(Math.max(this.i.cK() / 2.0F, 0.06F));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 793 */       g();
/*     */       
/* 795 */       if (this.h != agb.a.b || this.i.t().p()) {
/* 796 */         this.i.o(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 800 */       double ☃ = this.b - this.i.q;
/* 801 */       double d1 = this.c - this.i.r;
/* 802 */       double d2 = this.d - this.i.s;
/* 803 */       double d3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/* 804 */       d1 /= d3;
/*     */       
/* 806 */       float f1 = (float)(xq.c(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 807 */       this.i.w = a(this.i.w, f1, 90.0F);
/* 808 */       this.i.aQ = this.i.w;
/*     */       
/* 810 */       float f2 = (float)(this.e * this.i.a(ank.d).e());
/* 811 */       this.i.o(this.i.cK() + (f2 - this.i.cK()) * 0.125F);
/*     */       
/* 813 */       this.i.u += this.i.cK() * d1 * 0.1D;
/*     */     }
/*     */   }
/*     */   
/*     */   static class g extends aiz {
/*     */     g(akk ☃, axy axy1) {
/* 819 */       super(☃, axy1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean b() {
/* 824 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected cbg a() {
/* 829 */       return new cbg(new cbi());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(el ☃) {
/* 834 */       if (this.a instanceof akk) {
/* 835 */         akk akk = (akk)this.a;
/* 836 */         if (akk.h(akk)) {
/* 837 */           return (this.b.a_(☃).c() == bct.A);
/*     */         }
/*     */       } 
/*     */       
/* 841 */       return !this.b.a_(☃.b()).f();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */