/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class aju
/*     */   extends akl
/*     */ {
/*  63 */   private static final or<el> b = ou.a((Class)aju.class, ot.l);
/*  64 */   private static final or<Boolean> c = ou.a((Class)aju.class, ot.i);
/*  65 */   private static final or<Integer> bC = ou.a((Class)aju.class, ot.b);
/*     */   public static final Predicate<amm> a;
/*     */   
/*     */   static {
/*  69 */     a = (☃ -> (!☃.q() && ☃.aF() && ☃.an()));
/*     */   }
/*     */   public aju(axy ☃) {
/*  72 */     super(aev.m, ☃);
/*     */     
/*  74 */     a(0.9F, 0.6F);
/*     */     
/*  76 */     this.g = new a(this);
/*  77 */     this.f = new afx(this, 10);
/*     */     
/*  79 */     p(true);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*  85 */     i(bf());
/*  86 */     this.x = 0.0F;
/*     */     
/*  88 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ca() {
/*  93 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(el ☃) {
/* 103 */     this.ab.b(b, ☃);
/*     */   }
/*     */   
/*     */   public el l() {
/* 107 */     return this.ab.<el>a(b);
/*     */   }
/*     */   
/*     */   public boolean dy() {
/* 111 */     return ((Boolean)this.ab.<Boolean>a(c)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 115 */     this.ab.b(c, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int dz() {
/* 119 */     return ((Integer)this.ab.<Integer>a(bC)).intValue();
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 123 */     this.ab.b(bC, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 128 */     super.x_();
/* 129 */     this.ab.a(b, el.a);
/* 130 */     this.ab.a(c, Boolean.valueOf(false));
/* 131 */     this.ab.a(bC, Integer.valueOf(2400));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 136 */     super.b(☃);
/*     */     
/* 138 */     ☃.b("TreasurePosX", l().o());
/* 139 */     ☃.b("TreasurePosY", l().p());
/* 140 */     ☃.b("TreasurePosZ", l().q());
/* 141 */     ☃.a("GotFish", dy());
/* 142 */     ☃.b("Moistness", dz());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 147 */     int i = ☃.h("TreasurePosX");
/* 148 */     int j = ☃.h("TreasurePosY");
/* 149 */     int k = ☃.h("TreasurePosZ");
/* 150 */     g(new el(i, j, k));
/*     */     
/* 152 */     super.a(☃);
/* 153 */     a(☃.q("GotFish"));
/* 154 */     b(☃.h("Moistness"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 159 */     this.by.a(0, new agh(this));
/* 160 */     this.by.a(0, new aie(this));
/* 161 */     this.by.a(1, new b(this));
/* 162 */     this.by.a(2, new c(this, 4.0D));
/* 163 */     this.by.a(4, new ahs(this, 1.0D, 10));
/* 164 */     this.by.a(4, new ahq(this));
/* 165 */     this.by.a(5, new ahb(this, (Class)aog.class, 6.0F));
/* 166 */     this.by.a(5, new agx(this, 10));
/* 167 */     this.by.a(6, new ahe(this, 1.2000000476837158D, true));
/* 168 */     this.by.a(8, new d());
/* 169 */     this.by.a(8, new agn(this));
/* 170 */     this.by.a(9, new agd<>(this, anc.class, 8.0F, 1.0D, 1.0D));
/*     */     
/* 172 */     this.bz.a(1, new ail(this, true, new Class[] { anc.class }));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 177 */     super.bZ();
/*     */     
/* 179 */     a(ank.a).a(10.0D);
/* 180 */     a(ank.d).a(1.2000000476837158D);
/* 181 */     cz().b(ank.f);
/* 182 */     a(ank.f).a(3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/* 187 */     return new aiz(this, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 193 */     boolean bool = ☃.a(aea.a(this), (int)a(ank.f).e());
/* 194 */     if (bool) {
/* 195 */       a(this, ☃);
/* 196 */       a(wj.bg, 1.0F, 1.0F);
/*     */     } 
/* 198 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public int bf() {
/* 203 */     return 4800;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int l(int ☃) {
/* 208 */     return bf();
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 213 */     return 0.3F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int K() {
/* 218 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int L() {
/* 223 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean n(aer ☃) {
/* 228 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(amm ☃) {
/* 233 */     if (b(aew.a).a()) {
/* 234 */       ate ate = ☃.i();
/* 235 */       if (d(ate)) {
/* 236 */         a(aew.a, ate);
/* 237 */         this.bA[aew.a.b()] = 2.0F;
/* 238 */         a(☃, ate.C());
/* 239 */         ☃.V();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 246 */     super.R_();
/*     */     
/* 248 */     if (do()) {
/*     */       return;
/*     */     }
/*     */     
/* 252 */     if (ap()) {
/* 253 */       b(2400);
/*     */     } else {
/* 255 */       b(dz() - 1);
/*     */       
/* 257 */       if (dz() <= 0) {
/* 258 */         a(aea.u, 1.0F);
/*     */       }
/*     */       
/* 261 */       if (this.A) {
/* 262 */         this.u += 0.5D;
/* 263 */         this.t += ((this.T.nextFloat() * 2.0F - 1.0F) * 0.2F);
/* 264 */         this.v += ((this.T.nextFloat() * 2.0F - 1.0F) * 0.2F);
/* 265 */         this.w = this.T.nextFloat() * 360.0F;
/* 266 */         this.A = false;
/* 267 */         this.al = true;
/*     */       } 
/*     */     } 
/*     */     
/* 271 */     if (this.m.B && an() && this.t * this.t + this.u * this.u + this.v * this.v > 0.03D) {
/* 272 */       cee ☃ = f(0.0F);
/* 273 */       float f1 = xq.b(this.w * 0.017453292F) * 0.3F;
/* 274 */       float f2 = xq.a(this.w * 0.017453292F) * 0.3F;
/* 275 */       float f3 = 1.2F - this.T.nextFloat() * 0.7F;
/* 276 */       for (int i = 0; i < 2; i++) {
/* 277 */         this.m.a(fm.X, this.q - ☃.b * f3 + f1, this.r - ☃.c, this.s - ☃.d * f3 + f2, 0.0D, 0.0D, 0.0D);
/* 278 */         this.m.a(fm.X, this.q - ☃.b * f3 - f1, this.r - ☃.c, this.s - ☃.d * f3 - f2, 0.0D, 0.0D, 0.0D);
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aog ☃, adk adk1) {
/* 303 */     ate ate = ☃.b(adk1);
/*     */     
/* 305 */     if (!ate.a() && ate.b().a(wx.D)) {
/* 306 */       if (!this.m.B) {
/* 307 */         a(wj.bi, 1.0F, 1.0F);
/*     */       }
/*     */       
/* 310 */       a(true);
/*     */       
/* 312 */       if (!☃.bV.d) {
/* 313 */         ate.g(1);
/*     */       }
/*     */       
/* 316 */       return true;
/*     */     } 
/*     */     
/* 319 */     return super.a(☃, adk1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public amm f(ate ☃) {
/* 324 */     if (☃.a()) {
/* 325 */       return null;
/*     */     }
/*     */     
/* 328 */     double d = this.r - 0.30000001192092896D + bF();
/* 329 */     amm amm = new amm(this.m, this.q, d, this.s, ☃);
/* 330 */     amm.a(40);
/*     */     
/* 332 */     amm.c(bt());
/*     */     
/* 334 */     float f1 = 0.3F;
/* 335 */     amm.t = (-xq.a(this.w * 0.017453292F) * xq.b(this.x * 0.017453292F) * f1);
/* 336 */     amm.u = (xq.a(this.x * 0.017453292F) * f1 * 1.5F);
/* 337 */     amm.v = (xq.b(this.w * 0.017453292F) * xq.b(this.x * 0.017453292F) * f1);
/*     */     
/* 339 */     float f2 = this.T.nextFloat() * 6.2831855F;
/* 340 */     f1 = 0.02F * this.T.nextFloat();
/* 341 */     amm.t += (xq.b(f2) * f1);
/* 342 */     amm.v += (xq.a(f2) * f1);
/*     */     
/* 344 */     this.m.a(amm);
/*     */     
/* 346 */     return amm;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 351 */     return ((this.r > 45.0D && this.r < ☃.k() && ☃.d(new el(this)) != ayz.a) || (☃.d(new el(this)) != ayz.z && super.a(☃, bool)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 356 */     return wj.bj;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi cs() {
/* 362 */     return wj.bh;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi D() {
/* 368 */     return an() ? wj.bf : wj.be;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ae() {
/* 373 */     return wj.bm;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ad() {
/* 378 */     return wj.bn;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 384 */     return ccl.aN;
/*     */   }
/*     */   
/*     */   protected boolean dA() {
/* 388 */     el ☃ = t().i();
/* 389 */     if (☃ != null) {
/* 390 */       return (c(☃) < 144.0D);
/*     */     }
/* 392 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 397 */     if (cP() && an()) {
/* 398 */       a(☃, f1, f2, cK());
/* 399 */       a(afe.a, this.t, this.u, this.v);
/*     */       
/* 401 */       this.t *= 0.8999999761581421D;
/* 402 */       this.u *= 0.8999999761581421D;
/* 403 */       this.v *= 0.8999999761581421D;
/* 404 */       if (v() == null) {
/* 405 */         this.u -= 0.005D;
/*     */       }
/*     */     } else {
/* 408 */       super.a(☃, f1, f2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 414 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */     extends agb
/*     */   {
/*     */     private final aju i;
/*     */     
/*     */     public a(aju ☃) {
/* 424 */       super(☃);
/* 425 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 430 */       if (this.i.an()) {
/* 431 */         this.i.u += 0.005D;
/*     */       }
/*     */       
/* 434 */       if (this.h != agb.a.b || this.i.t().p()) {
/*     */         
/* 436 */         this.i.o(0.0F);
/* 437 */         this.i.t(0.0F);
/* 438 */         this.i.s(0.0F);
/* 439 */         this.i.r(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 443 */       double ☃ = this.b - this.i.q;
/* 444 */       double d1 = this.c - this.i.r;
/* 445 */       double d2 = this.d - this.i.s;
/* 446 */       double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/*     */       
/* 448 */       if (d3 < 2.500000277905201E-7D) {
/* 449 */         this.a.r(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 453 */       float f1 = (float)(xq.c(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 454 */       this.i.w = a(this.i.w, f1, 10.0F);
/* 455 */       this.i.aQ = this.i.w;
/* 456 */       this.i.aS = this.i.w;
/*     */       
/* 458 */       float f2 = (float)(this.e * this.i.a(ank.d).e());
/* 459 */       if (this.i.an()) {
/* 460 */         this.i.o(f2 * 0.02F);
/* 461 */         float f3 = -((float)(xq.c(d1, xq.a(☃ * ☃ + d2 * d2)) * 57.2957763671875D));
/* 462 */         f3 = xq.a(xq.g(f3), -85.0F, 85.0F);
/*     */         
/* 464 */         this.i.x = a(this.i.x, f3, 5.0F);
/*     */         
/* 466 */         float f4 = xq.b(this.i.x * 0.017453292F);
/* 467 */         float f5 = xq.a(this.i.x * 0.017453292F);
/* 468 */         this.i.bj = f4 * f2;
/* 469 */         this.i.bi = -f5 * f2;
/*     */       } else {
/* 471 */         this.i.o(f2 * 0.1F);
/*     */       } 
/*     */     } }
/*     */   
/*     */   class d extends agt {
/*     */     private int b;
/*     */     
/*     */     private d(aju this$0) {}
/*     */     
/*     */     public boolean a() {
/* 481 */       if (this.b > this.a.U) {
/* 482 */         return false;
/*     */       }
/* 484 */       List<amm> ☃ = this.a.m.a(amm.class, this.a.bD().c(8.0D, 8.0D, 8.0D), aju.a);
/* 485 */       return (!☃.isEmpty() || !this.a.b(aew.a).a());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 490 */       List<amm> ☃ = this.a.m.a(amm.class, this.a.bD().c(8.0D, 8.0D, 8.0D), aju.a);
/* 491 */       if (!☃.isEmpty()) {
/* 492 */         this.a.t().a(☃.get(0), 1.2000000476837158D);
/* 493 */         this.a.a(wj.bl, 1.0F, 1.0F);
/*     */       } 
/* 495 */       this.b = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 500 */       ate ☃ = this.a.b(aew.a);
/* 501 */       if (!☃.a()) {
/* 502 */         this.a.f(☃);
/* 503 */         this.a.a(aew.a, ate.a);
/* 504 */         this.b = this.a.U + aju.a(this.a).nextInt(100);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 510 */       List<amm> ☃ = this.a.m.a(amm.class, this.a.bD().c(8.0D, 8.0D, 8.0D), aju.a);
/*     */       
/* 512 */       ate ate = this.a.b(aew.a);
/* 513 */       if (!ate.a()) {
/* 514 */         this.a.f(ate);
/* 515 */         this.a.a(aew.a, ate.a);
/* 516 */       } else if (!☃.isEmpty()) {
/* 517 */         this.a.t().a(☃.get(0), 1.2000000476837158D);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends agt {
/*     */     private final aju a;
/*     */     private final double b;
/*     */     private aog c;
/*     */     
/*     */     c(aju ☃, double d) {
/* 528 */       this.a = ☃;
/* 529 */       this.b = d;
/* 530 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 535 */       this.c = this.a.m.a(this.a, 10.0D);
/*     */       
/* 537 */       if (this.c == null) {
/* 538 */         return false;
/*     */       }
/* 540 */       return this.c.bb();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 545 */       return (this.c != null && this.c.bb() && this.a.h(this.c) < 256.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 550 */       this.c.c(new aek(aem.D, 100));
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 555 */       this.c = null;
/* 556 */       this.a.t().q();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 561 */       this.a.p().a(this.c, (this.a.L() + 20), this.a.K());
/* 562 */       if (this.a.h(this.c) < 6.25D) {
/* 563 */         this.a.t().q();
/*     */       } else {
/* 565 */         this.a.t().a(this.c, this.b);
/*     */       } 
/*     */       
/* 568 */       if (this.c.bb() && this.c.m.s.nextInt(6) == 0)
/* 569 */         this.c.c(new aek(aem.D, 100)); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends agt {
/*     */     private final aju a;
/*     */     private boolean b;
/*     */     
/*     */     b(aju ☃) {
/* 579 */       this.a = ☃;
/* 580 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean f() {
/* 585 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 590 */       return (this.a.dy() && this.a.bg() >= 100);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 595 */       el ☃ = this.a.l(); return (
/* 596 */         this.a.c(new el(☃.o(), this.a.r, ☃.q())) > 16.0D && !this.b && this.a.bg() >= 100);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 601 */       this.b = false;
/* 602 */       this.a.t().q();
/*     */       
/* 604 */       axy ☃ = this.a.m;
/* 605 */       el el1 = new el(this.a);
/*     */       
/* 607 */       String str = (☃.s.nextFloat() >= 0.5D) ? "Ocean_Ruin" : "Shipwreck";
/* 608 */       el el2 = ☃.a(str, el1, 50, false);
/* 609 */       if (el2 == null) {
/* 610 */         el el = ☃.a(str.equals("Ocean_Ruin") ? "Shipwreck" : "Ocean_Ruin", el1, 50, false);
/* 611 */         if (el != null) {
/* 612 */           this.a.g(el);
/*     */         } else {
/*     */           
/* 615 */           this.b = true;
/*     */           return;
/*     */         } 
/*     */       } else {
/* 619 */         this.a.g(el2);
/*     */       } 
/*     */       
/* 622 */       ☃.a(this.a, (byte)38);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 627 */       el ☃ = this.a.l();
/* 628 */       if (this.a.c(new el(☃.o(), this.a.r, ☃.q())) <= 16.0D || this.b) {
/* 629 */         this.a.a(false);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 635 */       el ☃ = this.a.l();
/* 636 */       axy axy = this.a.m;
/*     */       
/* 638 */       if (this.a.dA() || this.a.t().p()) {
/* 639 */         cee cee = ajd.a(this.a, 16, 1, new cee(☃.o(), ☃.p(), ☃.q()), 0.39269909262657166D);
/* 640 */         if (cee == null) {
/* 641 */           cee = ajd.a(this.a, 8, 4, new cee(☃.o(), ☃.p(), ☃.q()));
/*     */         }
/*     */         
/* 644 */         if (cee != null) {
/* 645 */           el el = new el(cee);
/* 646 */           if (!axy.b(el).a(ww.a) || !axy.a_(el).a(axy, el, cbf.b)) {
/* 647 */             cee = ajd.a(this.a, 8, 5, new cee(☃.o(), ☃.p(), ☃.q()));
/*     */           }
/*     */         } 
/*     */         
/* 651 */         if (cee == null) {
/* 652 */           this.b = true;
/*     */           
/*     */           return;
/*     */         } 
/* 656 */         this.a.p().a(cee.b, cee.c, cee.d, (this.a.L() + 20), this.a.K());
/* 657 */         this.a.t().a(cee.b, cee.c, cee.d, 1.3D);
/*     */         
/* 659 */         if (axy.s.nextInt(80) == 0)
/* 660 */           axy.a(this.a, (byte)38); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */