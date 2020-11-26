/*     */ import java.util.List;
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
/*     */ public class apj
/*     */   extends aer
/*     */ {
/*  47 */   private static final or<Integer> a = ou.a((Class)apj.class, ot.b);
/*  48 */   private static final or<Integer> b = ou.a((Class)apj.class, ot.b);
/*  49 */   private static final or<Float> c = ou.a((Class)apj.class, ot.c);
/*  50 */   private static final or<Integer> d = ou.a((Class)apj.class, ot.b);
/*  51 */   private static final or<Boolean> e = ou.a((Class)apj.class, ot.i);
/*  52 */   private static final or<Boolean> f = ou.a((Class)apj.class, ot.i);
/*  53 */   private static final or<Integer> g = ou.a((Class)apj.class, ot.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   private final float[] h = new float[2];
/*     */   
/*     */   private float aw;
/*     */   
/*     */   private float ax;
/*     */   private float ay;
/*     */   private int az;
/*     */   private double aA;
/*     */   private double aB;
/*     */   private double aC;
/*     */   private double aD;
/*     */   private double aE;
/*     */   private boolean aF;
/*     */   private boolean aG;
/*     */   private boolean aH;
/*     */   private boolean aI;
/*     */   private double aJ;
/*     */   private float aK;
/*     */   private a aL;
/*     */   private a aM;
/*     */   private double aN;
/*     */   private boolean aO;
/*     */   private boolean aP;
/*     */   private float aQ;
/*     */   private float aR;
/*     */   private float aS;
/*     */   
/*     */   public apj(axy ☃) {
/*  89 */     super(aev.f, ☃);
/*  90 */     this.j = true;
/*  91 */     a(1.375F, 0.5625F);
/*     */   }
/*     */   
/*     */   public apj(axy ☃, double d1, double d2, double d3) {
/*  95 */     this(☃);
/*  96 */     b(d1, d2, d3);
/*     */     
/*  98 */     this.t = 0.0D;
/*  99 */     this.u = 0.0D;
/* 100 */     this.v = 0.0D;
/*     */     
/* 102 */     this.n = d1;
/* 103 */     this.o = d2;
/* 104 */     this.p = d3;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/* 109 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 114 */     this.ab.a(a, Integer.valueOf(0));
/* 115 */     this.ab.a(b, Integer.valueOf(1));
/* 116 */     this.ab.a(c, Float.valueOf(0.0F));
/* 117 */     this.ab.a(d, Integer.valueOf(b.a.ordinal()));
/* 118 */     this.ab.a(e, Boolean.valueOf(false));
/* 119 */     this.ab.a(f, Boolean.valueOf(false));
/* 120 */     this.ab.a(g, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cea j(aer ☃) {
/* 126 */     if (☃.aC()) {
/* 127 */       return ☃.bD();
/*     */     }
/* 129 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cea al() {
/* 135 */     return bD();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aC() {
/* 140 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public double aJ() {
/* 145 */     return -0.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 150 */     if (b(☃)) {
/* 151 */       return false;
/*     */     }
/* 153 */     if (this.m.B || this.G) {
/* 154 */       return true;
/*     */     }
/* 156 */     if (☃ instanceof aec && ☃.k() != null && w(☃.k())) {
/* 157 */       return false;
/*     */     }
/* 159 */     c(-o());
/* 160 */     b(10);
/* 161 */     a(m() + f * 10.0F);
/* 162 */     aA();
/* 163 */     boolean bool = (☃.k() instanceof aog && ((aog)☃.k()).bV.d);
/* 164 */     if (bool || m() > 40.0F) {
/* 165 */       if (!bool && this.m.X().b("doEntityDrops")) {
/* 166 */         a(f());
/*     */       }
/* 168 */       V();
/*     */     } 
/* 170 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j(boolean ☃) {
/* 175 */     if (!this.m.B) {
/* 176 */       this.aO = true;
/* 177 */       this.aP = ☃;
/* 178 */       if (z() == 0) {
/* 179 */         d(60);
/*     */       }
/*     */     } 
/*     */     
/* 183 */     this.m.a(fm.R, this.q + this.T.nextFloat(), this.r + 0.7D, this.s + this.T.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 184 */     if (this.T.nextInt(20) == 0) {
/* 185 */       this.m.a(this.q, this.r, this.s, ae(), bV(), 1.0F, 0.8F + 0.4F * this.T.nextFloat(), false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(aer ☃) {
/* 191 */     if (☃ instanceof apj) {
/* 192 */       if ((☃.bD()).b < (bD()).e) {
/* 193 */         super.i(☃);
/*     */       }
/* 195 */     } else if ((☃.bD()).b <= (bD()).b) {
/* 196 */       super.i(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public ata f() {
/* 201 */     switch (null.a[p().ordinal()])
/*     */     
/*     */     { default:
/* 204 */         return atf.aD;
/*     */       case 2:
/* 206 */         return atf.aE;
/*     */       case 3:
/* 208 */         return atf.aF;
/*     */       case 4:
/* 210 */         return atf.aG;
/*     */       case 5:
/* 212 */         return atf.aH;
/*     */       case 6:
/* 214 */         break; }  return atf.aI;
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
/*     */   public boolean aB() {
/* 227 */     return !this.G;
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
/*     */   public eq bB() {
/* 242 */     return bA().e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 247 */     this.aM = this.aL;
/* 248 */     this.aL = s();
/*     */     
/* 250 */     if (this.aL == a.b || this.aL == a.c) {
/* 251 */       this.ax++;
/*     */     } else {
/* 253 */       this.ax = 0.0F;
/*     */     } 
/*     */     
/* 256 */     if (!this.m.B && this.ax >= 60.0F) {
/* 257 */       aL();
/*     */     }
/*     */     
/* 260 */     if (n() > 0) {
/* 261 */       b(n() - 1);
/*     */     }
/* 263 */     if (m() > 0.0F) {
/* 264 */       a(m() - 1.0F);
/*     */     }
/* 266 */     this.n = this.q;
/* 267 */     this.o = this.r;
/* 268 */     this.p = this.s;
/*     */     
/* 270 */     super.R_();
/* 271 */     r();
/*     */     
/* 273 */     if (bT()) {
/* 274 */       if (bP().isEmpty() || !(bP().get(0) instanceof aog)) {
/* 275 */         a(false, false);
/*     */       }
/*     */       
/* 278 */       v();
/* 279 */       if (this.m.B) {
/* 280 */         x();
/* 281 */         this.m.a(new mw(a(0), a(1)));
/*     */       } 
/* 283 */       a(afe.a, this.t, this.u, this.v);
/*     */     } else {
/* 285 */       this.t = 0.0D;
/* 286 */       this.u = 0.0D;
/* 287 */       this.v = 0.0D;
/*     */     } 
/*     */     
/* 290 */     q();
/*     */     
/* 292 */     for (int i = 0; i <= 1; i++) {
/* 293 */       if (a(i)) {
/* 294 */         if (!ai() && (this.h[i] % 6.2831855F) <= 0.7853981852531433D && (this.h[i] + 0.39269909262657166D) % 6.2831854820251465D >= 0.7853981852531433D) {
/* 295 */           wi wi = i();
/* 296 */           if (wi != null) {
/* 297 */             cee cee = f(1.0F);
/* 298 */             double d1 = (i == 1) ? -cee.d : cee.d;
/* 299 */             double d2 = (i == 1) ? cee.b : -cee.b;
/*     */             
/* 301 */             this.m.a((aog)null, this.q + d1, this.r, this.s + d2, wi, bV(), 1.0F, 0.8F + 0.4F * this.T.nextFloat());
/*     */           } 
/*     */         } 
/* 304 */         this.h[i] = (float)(this.h[i] + 0.39269909262657166D);
/*     */       } else {
/* 306 */         this.h[i] = 0.0F;
/*     */       } 
/*     */     } 
/*     */     
/* 310 */     ag();
/*     */     
/* 312 */     List<aer> ☃ = this.m.a(this, bD().c(0.20000000298023224D, -0.009999999776482582D, 0.20000000298023224D), aeu.a(this));
/*     */     
/* 314 */     if (!☃.isEmpty()) {
/* 315 */       boolean bool = (!this.m.B && !(bO() instanceof aog));
/* 316 */       for (int j = 0; j < ☃.size(); j++) {
/* 317 */         aer aer1 = ☃.get(j);
/* 318 */         if (!aer1.w(this))
/*     */         {
/*     */ 
/*     */           
/* 322 */           if (bool && 
/* 323 */             bP().size() < 2 && 
/* 324 */             !aer1.aW() && aer1.H < this.H && aer1 instanceof afa && !(aer1 instanceof akl) && !(aer1 instanceof aog)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 330 */             aer1.m(this);
/*     */           } else {
/* 332 */             i(aer1);
/*     */           }  } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void q() {
/* 339 */     if (this.m.B) {
/* 340 */       int ☃ = z();
/* 341 */       if (☃ > 0) {
/* 342 */         this.aQ += 0.05F;
/*     */       } else {
/* 344 */         this.aQ -= 0.1F;
/*     */       } 
/* 346 */       this.aQ = xq.a(this.aQ, 0.0F, 1.0F);
/*     */       
/* 348 */       this.aS = this.aR;
/* 349 */       this.aR = 10.0F * (float)Math.sin((0.5F * (float)this.m.V())) * this.aQ;
/*     */     } else {
/* 351 */       if (!this.aO) {
/* 352 */         d(0);
/*     */       }
/*     */       
/* 355 */       int ☃ = z();
/* 356 */       if (☃ > 0) {
/* 357 */         ☃--;
/* 358 */         d(☃);
/*     */         
/* 360 */         int i = 60 - ☃ - 1;
/* 361 */         if (i > 0 && 
/* 362 */           ☃ == 0) {
/* 363 */           d(0);
/* 364 */           if (this.aP) {
/* 365 */             this.u -= 0.7D;
/* 366 */             aL();
/*     */           } else {
/* 368 */             this.u = a((Class)aog.class) ? 2.7D : 0.6D;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 373 */         this.aO = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected wi i() {
/* 380 */     switch (null.b[s().ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/*     */       case 3:
/* 384 */         return wj.U;
/*     */       case 4:
/* 386 */         return wj.T;
/*     */     } 
/*     */     
/* 389 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private void r() {
/* 394 */     if (this.az <= 0 || bT()) {
/*     */       return;
/*     */     }
/*     */     
/* 398 */     double ☃ = this.q + (this.aA - this.q) / this.az;
/* 399 */     double d1 = this.r + (this.aB - this.r) / this.az;
/* 400 */     double d2 = this.s + (this.aC - this.s) / this.az;
/*     */     
/* 402 */     double d3 = xq.g(this.aD - this.w);
/*     */     
/* 404 */     this.w = (float)(this.w + d3 / this.az);
/* 405 */     this.x = (float)(this.x + (this.aE - this.x) / this.az);
/*     */     
/* 407 */     this.az--;
/* 408 */     b(☃, d1, d2);
/* 409 */     b(this.w, this.x);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃, boolean bool1) {
/* 413 */     this.ab.b(e, Boolean.valueOf(☃));
/* 414 */     this.ab.b(f, Boolean.valueOf(bool1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum a
/*     */   {
/* 425 */     a,
/* 426 */     b,
/* 427 */     c,
/* 428 */     d,
/* 429 */     e;
/*     */   }
/*     */   
/*     */   private a s() {
/* 433 */     a ☃ = u();
/* 434 */     if (☃ != null) {
/* 435 */       this.aJ = (bD()).e;
/* 436 */       return ☃;
/*     */     } 
/*     */     
/* 439 */     if (t()) {
/* 440 */       return a.a;
/*     */     }
/*     */     
/* 443 */     float f = l();
/* 444 */     if (f > 0.0F) {
/* 445 */       this.aK = f;
/* 446 */       return a.d;
/*     */     } 
/*     */     
/* 449 */     return a.e;
/*     */   }
/*     */   
/*     */   public float k() {
/* 453 */     cea ☃ = bD();
/* 454 */     int i = xq.c(☃.a);
/* 455 */     int j = xq.f(☃.d);
/* 456 */     int k = xq.c(☃.e);
/* 457 */     int m = xq.f(☃.e - this.aN);
/* 458 */     int n = xq.c(☃.c);
/* 459 */     int i1 = xq.f(☃.f);
/*     */     
/* 461 */     try (el.b ☃ = el.b.r()) {
/*     */       int i2;
/* 463 */       label55: for (i2 = k; i2 < m; i2++) {
/* 464 */         float f = 0.0F;
/* 465 */         for (int i3 = i; i3 < j; i3++) {
/* 466 */           for (int i4 = n; i4 < i1; i4++) {
/* 467 */             b.f(i3, i2, i4);
/* 468 */             byw byw = this.m.b(b);
/* 469 */             if (byw.a(ww.a)) {
/* 470 */               f = Math.max(f, i2 + byw.f());
/*     */             }
/* 472 */             if (f >= 1.0F) {
/*     */               continue label55;
/*     */             }
/*     */           } 
/*     */         } 
/* 477 */         if (f < 1.0F) {
/* 478 */           float f1 = b.p() + f;
/*     */ 
/*     */ 
/*     */           
/* 482 */           if (b != null) if (null != null) { try { b.close(); } catch (Throwable throwable) { null.addSuppressed(throwable); }  } else { b.close(); }
/*     */               return f1;
/*     */         } 
/*     */       }  return (m + 1);
/* 486 */     }  } public float l() { cea ☃ = bD();
/* 487 */     cea cea1 = new cea(☃.a, ☃.b - 0.001D, ☃.c, ☃.d, ☃.b, ☃.f);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 497 */     int i = xq.c(cea1.a) - 1;
/* 498 */     int j = xq.f(cea1.d) + 1;
/* 499 */     int k = xq.c(cea1.b) - 1;
/* 500 */     int m = xq.f(cea1.e) + 1;
/* 501 */     int n = xq.c(cea1.c) - 1;
/* 502 */     int i1 = xq.f(cea1.f) + 1;
/*     */     
/* 504 */     cew cew = cet.a(cea1);
/* 505 */     float f = 0.0F;
/* 506 */     int i2 = 0;
/*     */     
/* 508 */     try (el.b ☃ = el.b.r()) {
/* 509 */       for (int i3 = i; i3 < j; i3++) {
/* 510 */         for (int i4 = n; i4 < i1; i4++) {
/*     */           
/* 512 */           int i5 = ((i3 == i || i3 == j - 1) ? 1 : 0) + ((i4 == n || i4 == i1 - 1) ? 1 : 0);
/* 513 */           if (i5 != 2)
/*     */           {
/*     */ 
/*     */             
/* 517 */             for (int i6 = k; i6 < m; i6++) {
/*     */               
/* 519 */               if (i5 <= 0 || (i6 != k && i6 != m - 1)) {
/*     */ 
/*     */ 
/*     */                 
/* 523 */                 b.f(i3, i6, i4);
/*     */                 
/* 525 */                 blc blc = this.m.a_(b);
/* 526 */                 if (!(blc.c() instanceof biw))
/*     */                 {
/*     */                   
/* 529 */                   if (cet.c(blc.h(this.m, b).a(i3, i6, i4), cew, cei.AND)) {
/* 530 */                     f += blc.c().n();
/* 531 */                     i2++;
/*     */                   }  } 
/*     */               } 
/*     */             }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 538 */     return f / i2; }
/*     */   
/*     */   private boolean t() {
/*     */     int i2;
/* 542 */     cea ☃ = bD();
/* 543 */     int i = xq.c(☃.a);
/* 544 */     int j = xq.f(☃.d);
/* 545 */     int k = xq.c(☃.b);
/* 546 */     int m = xq.f(☃.b + 0.001D);
/* 547 */     int n = xq.c(☃.c);
/* 548 */     int i1 = xq.f(☃.f);
/*     */     
/* 550 */     boolean bool = false;
/* 551 */     this.aJ = Double.MIN_VALUE;
/*     */     
/* 553 */     try (el.b ☃ = el.b.r()) {
/* 554 */       for (int i3 = i; i3 < j; i3++) {
/* 555 */         for (int i4 = k; i4 < m; i4++) {
/* 556 */           for (int i5 = n; i5 < i1; i5++) {
/* 557 */             b.f(i3, i4, i5);
/* 558 */             byw byw = this.m.b(b);
/*     */             
/* 560 */             if (byw.a(ww.a)) {
/*     */ 
/*     */ 
/*     */               
/* 564 */               float f = i4 + byw.f();
/* 565 */               this.aJ = Math.max(f, this.aJ);
/* 566 */               i2 = bool | ((☃.b < f) ? 1 : 0);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 572 */     return i2;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private a u() {
/* 577 */     cea ☃ = bD();
/* 578 */     double d = ☃.e + 0.001D;
/*     */     
/* 580 */     int i = xq.c(☃.a);
/* 581 */     int j = xq.f(☃.d);
/* 582 */     int k = xq.c(☃.e);
/* 583 */     int m = xq.f(d);
/* 584 */     int n = xq.c(☃.c);
/* 585 */     int i1 = xq.f(☃.f);
/*     */     
/* 587 */     boolean bool = false;
/* 588 */     try (el.b ☃ = el.b.r()) {
/* 589 */       for (int i2 = i; i2 < j; i2++) {
/* 590 */         for (int i3 = k; i3 < m; i3++) {
/* 591 */           for (int i4 = n; i4 < i1; i4++) {
/* 592 */             b.f(i2, i3, i4);
/* 593 */             byw byw = this.m.b(b);
/* 594 */             if (byw.a(ww.a) && 
/* 595 */               d < (b.p() + byw.f())) {
/* 596 */               if (byw.d()) {
/* 597 */                 bool = true;
/*     */               } else {
/* 599 */                 return a.c;
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 608 */     return bool ? a.b : null;
/*     */   }
/*     */   
/*     */   private void v() {
/* 612 */     double ☃ = -0.03999999910593033D;
/* 613 */     double d1 = aj() ? 0.0D : -0.03999999910593033D;
/* 614 */     double d2 = 0.0D;
/* 615 */     this.aw = 0.05F;
/*     */     
/* 617 */     if (this.aM == a.e && this.aL != a.e && this.aL != a.d) {
/* 618 */       this.aJ = (bD()).b + this.I;
/* 619 */       b(this.q, (k() - this.I) + 0.101D, this.s);
/* 620 */       this.u = 0.0D;
/* 621 */       this.aN = 0.0D;
/*     */       
/* 623 */       this.aL = a.a;
/*     */     } else {
/* 625 */       if (this.aL == a.a) {
/* 626 */         d2 = (this.aJ - (bD()).b) / this.I;
/* 627 */         this.aw = 0.9F;
/* 628 */       } else if (this.aL == a.c) {
/* 629 */         d1 = -7.0E-4D;
/* 630 */         this.aw = 0.9F;
/* 631 */       } else if (this.aL == a.b) {
/* 632 */         d2 = 0.009999999776482582D;
/* 633 */         this.aw = 0.45F;
/* 634 */       } else if (this.aL == a.e) {
/* 635 */         this.aw = 0.9F;
/* 636 */       } else if (this.aL == a.d) {
/* 637 */         this.aw = this.aK;
/* 638 */         if (bO() instanceof aog) {
/* 639 */           this.aK /= 2.0F;
/*     */         }
/*     */       } 
/*     */       
/* 643 */       this.t *= this.aw;
/* 644 */       this.v *= this.aw;
/* 645 */       this.ay *= this.aw;
/*     */       
/* 647 */       this.u += d1;
/* 648 */       if (d2 > 0.0D) {
/* 649 */         double d3 = 0.65D;
/* 650 */         this.u += d2 * 0.06153846016296973D;
/*     */         
/* 652 */         double d4 = 0.75D;
/* 653 */         this.u *= 0.75D;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void x() {
/* 659 */     if (!aX()) {
/*     */       return;
/*     */     }
/*     */     
/* 663 */     float ☃ = 0.0F;
/* 664 */     if (this.aF) {
/* 665 */       this.ay--;
/*     */     }
/* 667 */     if (this.aG) {
/* 668 */       this.ay++;
/*     */     }
/* 670 */     if (this.aG != this.aF && !this.aH && !this.aI) {
/* 671 */       ☃ += 0.005F;
/*     */     }
/* 673 */     this.w += this.ay;
/*     */     
/* 675 */     if (this.aH) {
/* 676 */       ☃ += 0.04F;
/*     */     }
/* 678 */     if (this.aI) {
/* 679 */       ☃ -= 0.005F;
/*     */     }
/*     */     
/* 682 */     this.t += (xq.a(-this.w * 0.017453292F) * ☃);
/* 683 */     this.v += (xq.b(this.w * 0.017453292F) * ☃);
/*     */     
/* 685 */     a(((this.aG && !this.aF) || this.aH), ((this.aF && !this.aG) || this.aH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(aer ☃) {
/* 690 */     if (!w(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 694 */     float f1 = 0.0F;
/* 695 */     float f2 = (float)((this.G ? 0.009999999776482582D : aJ()) + ☃.aI());
/*     */     
/* 697 */     if (bP().size() > 1) {
/* 698 */       int i = bP().indexOf(☃);
/* 699 */       if (i == 0) {
/* 700 */         f1 = 0.2F;
/*     */       } else {
/* 702 */         f1 = -0.6F;
/*     */       } 
/*     */       
/* 705 */       if (☃ instanceof ajq) {
/* 706 */         f1 = (float)(f1 + 0.2D);
/*     */       }
/*     */     } 
/*     */     
/* 710 */     cee cee = (new cee(f1, 0.0D, 0.0D)).b(-this.w * 0.017453292F - 1.5707964F);
/*     */     
/* 712 */     ☃.b(this.q + cee.b, this.r + f2, this.s + cee.d);
/*     */     
/* 714 */     ☃.w += this.ay;
/* 715 */     ☃.j(☃.bj() + this.ay);
/*     */     
/* 717 */     a(☃);
/*     */     
/* 719 */     if (☃ instanceof ajq && bP().size() > 1) {
/* 720 */       int i = (☃.Q() % 2 == 0) ? 90 : 270;
/* 721 */       ☃.k(((ajq)☃).aQ + i);
/* 722 */       ☃.j(☃.bj() + i);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(aer ☃) {
/* 727 */     ☃.k(this.w);
/*     */     
/* 729 */     float f1 = xq.g(☃.w - this.w);
/* 730 */     float f2 = xq.a(f1, -105.0F, 105.0F);
/* 731 */     ☃.y += f2 - f1;
/* 732 */     ☃.w += f2 - f1;
/* 733 */     ☃.j(☃.w);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 743 */     ☃.a("Type", p().a());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 748 */     if (☃.c("Type", 8)) {
/* 749 */       a(b.a(☃.l("Type")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(aog ☃, adk adk1) {
/* 755 */     if (☃.aZ()) {
/* 756 */       return false;
/*     */     }
/*     */     
/* 759 */     if (!this.m.B && this.ax < 60.0F) {
/* 760 */       ☃.m(this);
/*     */     }
/* 762 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, blc blc1, el el1) {
/* 767 */     this.aN = this.u;
/* 768 */     if (aW()) {
/*     */       return;
/*     */     }
/*     */     
/* 772 */     if (bool) {
/* 773 */       if (this.M > 3.0F) {
/*     */         
/* 775 */         if (this.aL != a.d) {
/* 776 */           this.M = 0.0F;
/*     */           
/*     */           return;
/*     */         } 
/* 780 */         c(this.M, 1.0F);
/* 781 */         if (!this.m.B && !this.G) {
/* 782 */           V();
/* 783 */           if (this.m.X().b("doEntityDrops")) {
/* 784 */             int i; for (i = 0; i < 3; i++) {
/* 785 */               a(p().b());
/*     */             }
/* 787 */             for (i = 0; i < 2; i++) {
/* 788 */               a(atf.C);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 793 */       this.M = 0.0F;
/* 794 */     } else if (!this.m.b((new el(this)).b()).a(ww.a) && 
/* 795 */       ☃ < 0.0D) {
/* 796 */       this.M = (float)(this.M - ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃) {
/* 802 */     return (((Boolean)this.ab.<Boolean>a((☃ == 0) ? e : f)).booleanValue() && bO() != null);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 806 */     this.ab.b(c, Float.valueOf(☃));
/*     */   }
/*     */   
/*     */   public float m() {
/* 810 */     return ((Float)this.ab.<Float>a(c)).floatValue();
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 814 */     this.ab.b(a, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int n() {
/* 818 */     return ((Integer)this.ab.<Integer>a(a)).intValue();
/*     */   }
/*     */   
/*     */   private void d(int ☃) {
/* 822 */     this.ab.b(g, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   private int z() {
/* 826 */     return ((Integer)this.ab.<Integer>a(g)).intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(int ☃) {
/* 834 */     this.ab.b(b, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int o() {
/* 838 */     return ((Integer)this.ab.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/* 842 */     this.ab.b(d, Integer.valueOf(☃.ordinal()));
/*     */   }
/*     */   
/*     */   public b p() {
/* 846 */     return b.a(((Integer)this.ab.<Integer>a(d)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean q(aer ☃) {
/* 851 */     return (bP().size() < 2 && !a(ww.a));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aer bO() {
/* 857 */     List<aer> ☃ = bP();
/* 858 */     return ☃.isEmpty() ? null : ☃.get(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum b
/*     */   {
/* 869 */     a((String)bct.n, "oak"),
/* 870 */     b((String)bct.o, "spruce"),
/* 871 */     c((String)bct.p, "birch"),
/* 872 */     d((String)bct.q, "jungle"),
/* 873 */     e((String)bct.r, "acacia"),
/* 874 */     f((String)bct.s, "dark_oak");
/*     */     
/*     */     private final String g;
/*     */     private final bcs h;
/*     */     
/*     */     b(bcs ☃, String str1) {
/* 880 */       this.g = str1;
/* 881 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/* 885 */       return this.g;
/*     */     }
/*     */     
/*     */     public bcs b() {
/* 889 */       return this.h;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 894 */       return this.g;
/*     */     }
/*     */     
/*     */     public static b a(int ☃) {
/* 898 */       b[] arrayOfB = values();
/* 899 */       if (☃ < 0 || ☃ >= arrayOfB.length) {
/* 900 */         ☃ = 0;
/*     */       }
/* 902 */       return arrayOfB[☃];
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 906 */       b[] arrayOfB = values();
/* 907 */       for (int i = 0; i < arrayOfB.length; i++) {
/* 908 */         if (arrayOfB[i].a().equals(☃)) {
/* 909 */           return arrayOfB[i];
/*     */         }
/*     */       } 
/* 912 */       return arrayOfB[0];
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */