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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akd
/*     */   extends ajq
/*     */ {
/*  67 */   private static final or<Integer> bC = ou.a((Class)akd.class, ot.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  78 */   private static final pc bD = new pc("killer_bunny");
/*     */ 
/*     */   
/*     */   private int bE;
/*     */ 
/*     */   
/*     */   private int bG;
/*     */   
/*     */   private boolean bH;
/*     */   
/*     */   private int bI;
/*     */   
/*     */   private int bJ;
/*     */ 
/*     */   
/*     */   public akd(axy ☃) {
/*  94 */     super(aev.ae, ☃);
/*  95 */     a(0.4F, 0.5F);
/*     */     
/*  97 */     this.h = new d(this, this);
/*     */     
/*  99 */     this.g = new e(this);
/*     */     
/* 101 */     c(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 106 */     this.by.a(1, new agm(this));
/* 107 */     this.by.a(1, new f(this, 2.2D));
/* 108 */     this.by.a(2, new agi(this, 0.8D));
/* 109 */     this.by.a(3, new aic(this, 1.0D, avh.a(new axx[] { atf.dC, atf.dH, bct.bp }, ), false));
/* 110 */     this.by.a(4, new b<>(this, aog.class, 8.0F, 2.2D, 2.2D));
/* 111 */     this.by.a(4, new b<>(this, akm.class, 10.0F, 2.2D, 2.2D));
/* 112 */     this.by.a(4, new b<>(this, ang.class, 4.0F, 2.2D, 2.2D));
/* 113 */     this.by.a(5, new g(this));
/* 114 */     this.by.a(6, new aih(this, 0.6D));
/* 115 */     this.by.a(11, new ahb(this, (Class)aog.class, 10.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cG() {
/* 120 */     if (this.B || (this.g.b() && this.g.e() > this.r + 0.5D)) {
/* 121 */       return 0.5F;
/*     */     }
/* 123 */     cbe ☃ = this.bx.m();
/* 124 */     if (☃ != null && ☃.e() < ☃.d()) {
/* 125 */       cee cee = ☃.a(this);
/* 126 */       if (cee.c > this.r + 0.5D) {
/* 127 */         return 0.5F;
/*     */       }
/*     */     } 
/* 130 */     if (this.g.c() <= 0.6D) {
/* 131 */       return 0.2F;
/*     */     }
/* 133 */     return 0.3F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void cH() {
/* 138 */     super.cH();
/* 139 */     double ☃ = this.g.c();
/* 140 */     if (☃ > 0.0D) {
/* 141 */       double d = this.t * this.t + this.v * this.v;
/* 142 */       if (d < 0.010000000000000002D)
/*     */       {
/* 144 */         a(0.0F, 0.0F, 1.0F, 0.1F);
/*     */       }
/*     */     } 
/* 147 */     if (!this.m.B) {
/* 148 */       this.m.a(this, (byte)1);
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
/*     */   public void c(double ☃) {
/* 160 */     t().a(☃);
/* 161 */     this.g.a(this.g.d(), this.g.e(), this.g.f(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void o(boolean ☃) {
/* 166 */     super.o(☃);
/* 167 */     if (☃) {
/* 168 */       a(dz(), cD(), ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void dy() {
/* 173 */     o(true);
/* 174 */     this.bG = 10;
/* 175 */     this.bE = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 180 */     super.x_();
/*     */     
/* 182 */     this.ab.a(bC, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void J() {
/* 187 */     if (this.bI > 0) {
/* 188 */       this.bI--;
/*     */     }
/*     */     
/* 191 */     if (this.bJ > 0) {
/* 192 */       this.bJ -= this.T.nextInt(3);
/* 193 */       if (this.bJ < 0) {
/* 194 */         this.bJ = 0;
/*     */       }
/*     */     } 
/*     */     
/* 198 */     if (this.A) {
/* 199 */       if (!this.bH) {
/* 200 */         o(false);
/* 201 */         dI();
/*     */       } 
/*     */       
/* 204 */       if (dA() == 99 && this.bI == 0) {
/* 205 */         afa afa = v();
/* 206 */         if (afa != null && h(afa) < 16.0D) {
/* 207 */           b(afa.q, afa.s);
/* 208 */           this.g.a(afa.q, afa.r, afa.s, this.g.c());
/* 209 */           dy();
/* 210 */           this.bH = true;
/*     */         } 
/*     */       } 
/*     */       
/* 214 */       d ☃ = (d)this.h;
/* 215 */       if (!☃.c()) {
/* 216 */         if (this.g.b() && this.bI == 0) {
/* 217 */           cbe cbe = this.bx.m();
/* 218 */           cee cee = new cee(this.g.d(), this.g.e(), this.g.f());
/* 219 */           if (cbe != null && cbe.e() < cbe.d()) {
/* 220 */             cee = cbe.a(this);
/*     */           }
/* 222 */           b(cee.b, cee.d);
/* 223 */           dy();
/*     */         } 
/* 225 */       } else if (!☃.d()) {
/* 226 */         dB();
/*     */       } 
/*     */     } 
/*     */     
/* 230 */     this.bH = this.A;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void av() {}
/*     */ 
/*     */   
/*     */   private void b(double ☃, double d1) {
/* 239 */     this.w = (float)(xq.c(d1 - this.s, ☃ - this.q) * 57.2957763671875D) - 90.0F;
/*     */   }
/*     */   
/*     */   private void dB() {
/* 243 */     ((d)this.h).a(true);
/*     */   }
/*     */   
/*     */   private void dC() {
/* 247 */     ((d)this.h).a(false);
/*     */   }
/*     */   
/*     */   private void dH() {
/* 251 */     if (this.g.c() < 2.2D) {
/* 252 */       this.bI = 10;
/*     */     } else {
/* 254 */       this.bI = 1;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void dI() {
/* 259 */     dH();
/* 260 */     dC();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 265 */     super.k();
/* 266 */     if (this.bE != this.bG) {
/* 267 */       this.bE++;
/* 268 */     } else if (this.bG != 0) {
/* 269 */       this.bE = 0;
/* 270 */       this.bG = 0;
/* 271 */       o(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 277 */     super.bZ();
/*     */     
/* 279 */     a(ank.a).a(3.0D);
/* 280 */     a(ank.d).a(0.30000001192092896D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 285 */     super.b(☃);
/* 286 */     ☃.b("RabbitType", dA());
/* 287 */     ☃.b("MoreCarrotTicks", this.bJ);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 292 */     super.a(☃);
/* 293 */     p(☃.h("RabbitType"));
/* 294 */     this.bJ = ☃.h("MoreCarrotTicks");
/*     */   }
/*     */   
/*     */   protected wi dz() {
/* 298 */     return wj.hy;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 303 */     return wj.hu;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 308 */     return wj.hx;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 313 */     return wj.hw;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 318 */     if (dA() == 99) {
/* 319 */       a(wj.hv, 1.0F, (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/* 320 */       return ☃.a(aea.a(this), 8.0F);
/*     */     } 
/* 322 */     return ☃.a(aea.a(this), 3.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/* 327 */     return (dA() == 99) ? wk.f : wk.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 332 */     if (b(☃)) {
/* 333 */       return false;
/*     */     }
/* 335 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 341 */     return ccl.I;
/*     */   }
/*     */   
/*     */   private boolean a(ata ☃) {
/* 345 */     return (☃ == atf.dC || ☃ == atf.dH || ☃ == bct.bp.h());
/*     */   }
/*     */ 
/*     */   
/*     */   public akd b(aeo ☃) {
/* 350 */     akd akd1 = new akd(this.m);
/* 351 */     int i = dJ();
/* 352 */     if (this.T.nextInt(20) != 0) {
/* 353 */       if (☃ instanceof akd && this.T.nextBoolean()) {
/* 354 */         i = ((akd)☃).dA();
/*     */       } else {
/* 356 */         i = dA();
/*     */       } 
/*     */     }
/* 359 */     akd1.p(i);
/* 360 */     return akd1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/* 365 */     return a(☃.b());
/*     */   }
/*     */   
/*     */   public int dA() {
/* 369 */     return ((Integer)this.ab.<Integer>a(bC)).intValue();
/*     */   }
/*     */   
/*     */   public void p(int ☃) {
/* 373 */     if (☃ == 99) {
/* 374 */       a(ank.h).a(8.0D);
/* 375 */       this.by.a(4, new a(this));
/* 376 */       this.bz.a(1, new ail(this, false, new Class[0]));
/* 377 */       this.bz.a(2, new aio<>(this, aog.class, true));
/* 378 */       this.bz.a(2, new aio<>(this, akm.class, true));
/*     */       
/* 380 */       if (!O_()) {
/* 381 */         b(new ir(k.a("entity", bD), new Object[0]));
/*     */       }
/*     */     } 
/*     */     
/* 385 */     this.ab.b(bC, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 391 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/* 393 */     int i = dJ();
/* 394 */     boolean bool = false;
/* 395 */     if (afj1 instanceof c) {
/*     */       
/* 397 */       i = ((c)afj1).a;
/* 398 */       bool = true;
/*     */     } else {
/* 400 */       afj1 = new c(i);
/*     */     } 
/*     */     
/* 403 */     p(i);
/* 404 */     if (bool) {
/* 405 */       b_(-24000);
/*     */     }
/*     */     
/* 408 */     return afj1;
/*     */   }
/*     */   
/*     */   private int dJ() {
/* 412 */     ayu ☃ = this.m.d(new el(this));
/*     */     
/* 414 */     int i = this.T.nextInt(100);
/* 415 */     if (☃.c() == ayu.d.c) {
/* 416 */       return (i < 80) ? 1 : 3;
/*     */     }
/*     */     
/* 419 */     if (☃.p() == ayu.b.m) {
/* 420 */       return 4;
/*     */     }
/*     */     
/* 423 */     return (i < 50) ? 0 : ((i < 90) ? 5 : 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 428 */     int i = xq.c(this.q);
/* 429 */     int j = xq.c((bD()).b);
/* 430 */     int k = xq.c(this.s);
/* 431 */     el el = new el(i, j, k);
/* 432 */     bcs bcs = ☃.a_(el.b()).c();
/*     */ 
/*     */     
/* 435 */     if (bcs == bct.aR || bcs == bct.cQ || bcs == bct.D) {
/* 436 */       return true;
/*     */     }
/*     */     
/* 439 */     return super.a(☃, bool);
/*     */   }
/*     */   
/*     */   public static class c implements afj {
/*     */     public int a;
/*     */     
/*     */     public c(int ☃) {
/* 446 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean dK() {
/* 451 */     return (this.bJ == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class d
/*     */     extends afz
/*     */   {
/*     */     private final akd c;
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean d;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public d(akd ☃, akd akd1) {
/* 470 */       super(akd1);
/* 471 */       this.c = akd1;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 475 */       return this.a;
/*     */     }
/*     */     
/*     */     public boolean d() {
/* 479 */       return this.d;
/*     */     }
/*     */     
/*     */     public void a(boolean ☃) {
/* 483 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 488 */       if (this.a) {
/* 489 */         this.c.dy();
/* 490 */         this.a = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends agb {
/*     */     private final akd i;
/*     */     private double j;
/*     */     
/*     */     public e(akd ☃) {
/* 500 */       super(☃);
/* 501 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 506 */       if (this.i.A && !akd.a(this.i) && !((akd.d)akd.b(this.i)).c()) {
/* 507 */         this.i.c(0.0D);
/* 508 */       } else if (b()) {
/* 509 */         this.i.c(this.j);
/*     */       } 
/* 511 */       super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(double ☃, double d1, double d2, double d3) {
/* 516 */       if (this.i.an()) {
/* 517 */         d3 = 1.5D;
/*     */       }
/*     */       
/* 520 */       super.a(☃, d1, d2, d3);
/* 521 */       if (d3 > 0.0D)
/* 522 */         this.j = d3; 
/*     */     }
/*     */   }
/*     */   
/*     */   static class b<T extends aer>
/*     */     extends agd<T> {
/*     */     private final akd c;
/*     */     
/*     */     public b(akd ☃, Class<T> clazz, float f, double d1, double d2) {
/* 531 */       super(☃, clazz, f, d1, d2);
/* 532 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 537 */       return (this.c.dA() != 99 && super.a());
/*     */     }
/*     */   }
/*     */   
/*     */   static class g
/*     */     extends ahh {
/*     */     private final akd f;
/*     */     private boolean g;
/*     */     private boolean h;
/*     */     
/*     */     public g(akd ☃) {
/* 548 */       super(☃, 0.699999988079071D, 16);
/* 549 */       this.f = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 554 */       if (this.b <= 0) {
/* 555 */         if (!this.f.m.X().b("mobGriefing")) {
/* 556 */           return false;
/*     */         }
/*     */ 
/*     */         
/* 560 */         this.h = false;
/* 561 */         this.g = akd.c(this.f);
/* 562 */         this.g = true;
/*     */       } 
/*     */       
/* 565 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 570 */       return (this.h && super.b());
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 575 */       super.e();
/*     */       
/* 577 */       this.f.p().a(this.d.o() + 0.5D, (this.d.p() + 1), this.d.q() + 0.5D, 10.0F, this.f.K());
/*     */       
/* 579 */       if (k()) {
/* 580 */         axy ☃ = this.f.m;
/* 581 */         el el = this.d.a();
/*     */         
/* 583 */         blc blc = ☃.a_(el);
/* 584 */         bcs bcs = blc.c();
/*     */         
/* 586 */         if (this.h && bcs instanceof bde) {
/* 587 */           Integer integer = (Integer)blc.c(bde.b);
/* 588 */           if (integer.intValue() == 0) {
/* 589 */             ☃.a(el, bct.a.p(), 2);
/* 590 */             ☃.a(el, true);
/*     */           } else {
/* 592 */             ☃.a(el, blc.a(bde.b, Integer.valueOf(integer.intValue() - 1)), 2);
/* 593 */             ☃.b(2001, el, bcs.l(blc));
/*     */           } 
/* 595 */           akd.a(this.f, 40);
/*     */         } 
/*     */         
/* 598 */         this.h = false;
/*     */ 
/*     */         
/* 601 */         this.b = 10;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(ayc ☃, el el1) {
/* 607 */       bcs bcs = ☃.a_(el1).c();
/*     */       
/* 609 */       if (bcs == bct.cq && this.g && !this.h) {
/* 610 */         el1 = el1.a();
/* 611 */         blc blc = ☃.a_(el1);
/* 612 */         bcs = blc.c();
/*     */         
/* 614 */         if (bcs instanceof bde && ((bde)bcs).w(blc)) {
/* 615 */           this.h = true;
/* 616 */           return true;
/*     */         } 
/*     */       } 
/* 619 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   static class f extends aho {
/*     */     private final akd f;
/*     */     
/*     */     public f(akd ☃, double d) {
/* 627 */       super(☃, d);
/* 628 */       this.f = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 633 */       super.e();
/*     */       
/* 635 */       this.f.c(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends ahe {
/*     */     public a(akd ☃) {
/* 641 */       super(☃, 1.4D, true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(afa ☃) {
/* 646 */       return (4.0F + ☃.H);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */