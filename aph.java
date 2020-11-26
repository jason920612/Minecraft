/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aph
/*     */   extends aer
/*     */   implements adr
/*     */ {
/*     */   public enum a
/*     */   {
/*  44 */     a(0),
/*  45 */     b(1),
/*  46 */     c(2),
/*  47 */     d(3),
/*  48 */     e(4),
/*  49 */     f(5),
/*  50 */     g(6); private static final a[] h;
/*     */     static {
/*  52 */       h = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(a::a)).toArray(☃ -> new a[☃]);
/*     */     }
/*     */     private final int i;
/*     */     
/*     */     a(int ☃) {
/*  57 */       this.i = ☃;
/*     */     }
/*     */     
/*     */     public int a() {
/*  61 */       return this.i;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   private static final or<Integer> a = ou.a((Class)aph.class, ot.b);
/*  70 */   private static final or<Integer> b = ou.a((Class)aph.class, ot.b);
/*  71 */   private static final or<Float> c = ou.a((Class)aph.class, ot.c);
/*  72 */   private static final or<Integer> d = ou.a((Class)aph.class, ot.b);
/*  73 */   private static final or<Integer> e = ou.a((Class)aph.class, ot.b);
/*  74 */   private static final or<Boolean> f = ou.a((Class)aph.class, ot.i);
/*     */   
/*     */   private boolean g;
/*     */   
/*     */   protected aph(aev<?> ☃, axy axy1) {
/*  79 */     super(☃, axy1);
/*  80 */     this.j = true;
/*  81 */     a(0.98F, 0.7F);
/*     */   }
/*     */   
/*     */   protected aph(aev<?> ☃, axy axy1, double d1, double d2, double d3) {
/*  85 */     this(☃, axy1);
/*  86 */     b(d1, d2, d3);
/*     */     
/*  88 */     this.t = 0.0D;
/*  89 */     this.u = 0.0D;
/*  90 */     this.v = 0.0D;
/*     */     
/*  92 */     this.n = d1;
/*  93 */     this.o = d2;
/*  94 */     this.p = d3;
/*     */   }
/*     */   
/*     */   public static aph a(axy ☃, double d1, double d2, double d3, a a1) {
/*  98 */     switch (null.a[a1.ordinal()]) {
/*     */       case 1:
/* 100 */         return new apl(☃, d1, d2, d3);
/*     */       case 2:
/* 102 */         return new apn(☃, d1, d2, d3);
/*     */       case 3:
/* 104 */         return new apq(☃, d1, d2, d3);
/*     */       case 4:
/* 106 */         return new app(☃, d1, d2, d3);
/*     */       case 5:
/* 108 */         return new apo(☃, d1, d2, d3);
/*     */       case 6:
/* 110 */         return new apm(☃, d1, d2, d3);
/*     */     } 
/* 112 */     return new apk(☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 123 */     this.ab.a(a, Integer.valueOf(0));
/* 124 */     this.ab.a(b, Integer.valueOf(1));
/* 125 */     this.ab.a(c, Float.valueOf(0.0F));
/* 126 */     this.ab.a(d, Integer.valueOf(bcs.l(bct.a.p())));
/* 127 */     this.ab.a(e, Integer.valueOf(6));
/* 128 */     this.ab.a(f, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cea j(aer ☃) {
/* 134 */     if (☃.aC()) {
/* 135 */       return ☃.bD();
/*     */     }
/* 137 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aC() {
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public double aJ() {
/* 147 */     return 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 152 */     if (this.m.B || this.G) {
/* 153 */       return true;
/*     */     }
/* 155 */     if (b(☃)) {
/* 156 */       return false;
/*     */     }
/* 158 */     k(-u());
/* 159 */     d(10);
/* 160 */     aA();
/* 161 */     a(s() + f * 10.0F);
/* 162 */     boolean bool = (☃.k() instanceof aog && ((aog)☃.k()).bV.d);
/*     */     
/* 164 */     if (bool || s() > 40.0F) {
/* 165 */       aL();
/*     */       
/* 167 */       if (!bool || O_()) {
/* 168 */         a(☃);
/*     */       } else {
/* 170 */         V();
/*     */       } 
/*     */     } 
/* 173 */     return true;
/*     */   }
/*     */   
/*     */   public void a(aea ☃) {
/* 177 */     V();
/*     */     
/* 179 */     if (this.m.X().b("doEntityDrops")) {
/* 180 */       ate ate = new ate(atf.az);
/* 181 */       if (O_()) {
/* 182 */         ate.a(e());
/*     */       }
/* 184 */       a_(ate);
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
/*     */   public boolean aB() {
/* 197 */     return !this.G;
/*     */   }
/*     */   
/* 200 */   private static final int[][][] h = new int[][][] { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
/*     */   
/*     */   private int aw;
/*     */   
/*     */   private double ax;
/*     */   
/*     */   private double ay;
/*     */   
/*     */   private double az;
/*     */   
/*     */   private double aA;
/*     */   
/*     */   private double aB;
/*     */   
/*     */   public eq bB() {
/* 215 */     return this.g ? bA().d().e() : bA().e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 220 */     if (t() > 0) {
/* 221 */       d(t() - 1);
/*     */     }
/* 223 */     if (s() > 0.0F) {
/* 224 */       a(s() - 1.0F);
/*     */     }
/* 226 */     if (this.r < -64.0D) {
/* 227 */       aa();
/*     */     }
/*     */     
/* 230 */     if (!this.m.B && this.m instanceof td) {
/* 231 */       this.m.A.a("portal");
/* 232 */       MinecraftServer minecraftServer = this.m.z();
/* 233 */       int k = X();
/*     */       
/* 235 */       if (this.an) {
/* 236 */         if (minecraftServer.u()) {
/* 237 */           if (!aW() && 
/* 238 */             this.ao++ >= k) {
/* 239 */             bod bod; this.ao = k;
/* 240 */             this.am = aQ();
/*     */ 
/*     */ 
/*     */             
/* 244 */             if (this.m.t.q() == bod.b) {
/* 245 */               bod = bod.a;
/*     */             } else {
/* 247 */               bod = bod.b;
/*     */             } 
/*     */             
/* 250 */             a(bod);
/*     */           } 
/*     */           
/* 253 */           this.an = false;
/*     */         } 
/*     */       } else {
/* 256 */         if (this.ao > 0) {
/* 257 */           this.ao -= 4;
/*     */         }
/* 259 */         if (this.ao < 0) {
/* 260 */           this.ao = 0;
/*     */         }
/*     */       } 
/* 263 */       if (this.am > 0) {
/* 264 */         this.am--;
/*     */       }
/* 266 */       this.m.A.e();
/*     */     } 
/*     */     
/* 269 */     if (this.m.B) {
/* 270 */       if (this.aw > 0) {
/* 271 */         double d4 = this.q + (this.ax - this.q) / this.aw;
/* 272 */         double d5 = this.r + (this.ay - this.r) / this.aw;
/* 273 */         double d6 = this.s + (this.az - this.s) / this.aw;
/*     */         
/* 275 */         double d7 = xq.g(this.aA - this.w);
/*     */         
/* 277 */         this.w = (float)(this.w + d7 / this.aw);
/* 278 */         this.x = (float)(this.x + (this.aB - this.x) / this.aw);
/*     */         
/* 280 */         this.aw--;
/* 281 */         b(d4, d5, d6);
/* 282 */         b(this.w, this.x);
/*     */       } else {
/* 284 */         b(this.q, this.r, this.s);
/* 285 */         b(this.w, this.x);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 290 */     this.n = this.q;
/* 291 */     this.o = this.r;
/* 292 */     this.p = this.s;
/*     */     
/* 294 */     if (!aj()) {
/* 295 */       this.u -= 0.03999999910593033D;
/*     */     }
/*     */     
/* 298 */     int ☃ = xq.c(this.q);
/* 299 */     int i = xq.c(this.r);
/* 300 */     int j = xq.c(this.s);
/* 301 */     if (this.m.a_(new el(☃, i - 1, j)).a(wv.z)) {
/* 302 */       i--;
/*     */     }
/*     */     
/* 305 */     el el = new el(☃, i, j);
/* 306 */     blc blc = this.m.a_(el);
/* 307 */     if (blc.a(wv.z)) {
/* 308 */       b(el, blc);
/*     */       
/* 310 */       if (blc.c() == bct.fC) {
/* 311 */         a(☃, i, j, ((Boolean)blc.c(bgo.o)).booleanValue());
/*     */       }
/*     */     } else {
/* 314 */       q();
/*     */     } 
/*     */     
/* 317 */     ag();
/*     */     
/* 319 */     this.x = 0.0F;
/* 320 */     double d1 = this.n - this.q;
/* 321 */     double d2 = this.p - this.s;
/* 322 */     if (d1 * d1 + d2 * d2 > 0.001D) {
/* 323 */       this.w = (float)(xq.c(d2, d1) * 180.0D / Math.PI);
/* 324 */       if (this.g) {
/* 325 */         this.w += 180.0F;
/*     */       }
/*     */     } 
/*     */     
/* 329 */     double d3 = xq.g(this.w - this.y);
/* 330 */     if (d3 < -170.0D || d3 >= 170.0D) {
/* 331 */       this.w += 180.0F;
/* 332 */       this.g = !this.g;
/*     */     } 
/* 334 */     b(this.w, this.x);
/*     */     
/* 336 */     if (v() == a.a && this.t * this.t + this.v * this.v > 0.01D) {
/* 337 */       List<aer> list = this.m.a(this, bD().c(0.20000000298023224D, 0.0D, 0.20000000298023224D), aeu.a(this));
/* 338 */       if (!list.isEmpty()) {
/* 339 */         for (int k = 0; k < list.size(); k++) {
/* 340 */           aer aer1 = list.get(k);
/* 341 */           if (aer1 instanceof aog || aer1 instanceof ajw || aer1 instanceof aph || aX() || aer1.aW()) {
/* 342 */             aer1.i(this);
/*     */           } else {
/* 344 */             aer1.m(this);
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } else {
/* 349 */       for (aer aer1 : this.m.a(this, bD().c(0.20000000298023224D, 0.0D, 0.20000000298023224D))) {
/* 350 */         if (!w(aer1) && aer1.aC() && aer1 instanceof aph) {
/* 351 */           aer1.i(this);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 356 */     at();
/*     */   }
/*     */   
/*     */   protected double p() {
/* 360 */     return 0.4D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {}
/*     */   
/*     */   protected void q() {
/* 367 */     double ☃ = p();
/* 368 */     this.t = xq.a(this.t, -☃, ☃);
/* 369 */     this.v = xq.a(this.v, -☃, ☃);
/* 370 */     if (this.A) {
/* 371 */       this.t *= 0.5D;
/* 372 */       this.u *= 0.5D;
/* 373 */       this.v *= 0.5D;
/*     */     } 
/* 375 */     a(afe.a, this.t, this.u, this.v);
/*     */     
/* 377 */     if (!this.A) {
/* 378 */       this.t *= 0.949999988079071D;
/* 379 */       this.u *= 0.949999988079071D;
/* 380 */       this.v *= 0.949999988079071D;
/*     */     } 
/*     */   }
/*     */   protected void b(el ☃, blc blc1) {
/*     */     double d11;
/* 385 */     this.M = 0.0F;
/*     */     
/* 387 */     cee cee1 = j(this.q, this.r, this.s);
/* 388 */     this.r = ☃.p();
/*     */     
/* 390 */     boolean bool1 = false;
/* 391 */     boolean bool2 = false;
/* 392 */     bco bco = (bco)blc1.c();
/*     */     
/* 394 */     if (bco == bct.aN) {
/* 395 */       bool1 = ((Boolean)blc1.c(bgo.o)).booleanValue();
/* 396 */       bool2 = !bool1;
/*     */     } 
/*     */     
/* 399 */     double d1 = 0.0078125D;
/* 400 */     bmn bmn = (bmn)blc1.c(bco.e());
/* 401 */     switch (null.b[bmn.ordinal()]) {
/*     */       case 1:
/* 403 */         this.t -= 0.0078125D;
/* 404 */         this.r++;
/*     */         break;
/*     */       case 2:
/* 407 */         this.t += 0.0078125D;
/* 408 */         this.r++;
/*     */         break;
/*     */       case 3:
/* 411 */         this.v += 0.0078125D;
/* 412 */         this.r++;
/*     */         break;
/*     */       case 4:
/* 415 */         this.v -= 0.0078125D;
/* 416 */         this.r++;
/*     */         break;
/*     */     } 
/*     */     
/* 420 */     int[][] arrayOfInt = h[bmn.a()];
/*     */     
/* 422 */     double d2 = (arrayOfInt[1][0] - arrayOfInt[0][0]);
/* 423 */     double d3 = (arrayOfInt[1][2] - arrayOfInt[0][2]);
/* 424 */     double d4 = Math.sqrt(d2 * d2 + d3 * d3);
/*     */     
/* 426 */     double d5 = this.t * d2 + this.v * d3;
/* 427 */     if (d5 < 0.0D) {
/* 428 */       d2 = -d2;
/* 429 */       d3 = -d3;
/*     */     } 
/*     */     
/* 432 */     double d6 = Math.sqrt(this.t * this.t + this.v * this.v);
/* 433 */     if (d6 > 2.0D) {
/* 434 */       d6 = 2.0D;
/*     */     }
/*     */     
/* 437 */     this.t = d6 * d2 / d4;
/* 438 */     this.v = d6 * d3 / d4;
/*     */     
/* 440 */     aer aer1 = bP().isEmpty() ? null : bP().get(0);
/* 441 */     if (aer1 instanceof aog) {
/* 442 */       double d = ((aog)aer1).bj;
/*     */       
/* 444 */       if (d > 0.0D) {
/* 445 */         double d15 = -Math.sin((aer1.w * 0.017453292F));
/* 446 */         double d16 = Math.cos((aer1.w * 0.017453292F));
/*     */         
/* 448 */         double d17 = this.t * this.t + this.v * this.v;
/*     */         
/* 450 */         if (d17 < 0.01D) {
/* 451 */           this.t += d15 * 0.1D;
/* 452 */           this.v += d16 * 0.1D;
/*     */           
/* 454 */           bool2 = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 460 */     if (bool2) {
/* 461 */       double d = Math.sqrt(this.t * this.t + this.v * this.v);
/* 462 */       if (d < 0.03D) {
/* 463 */         this.t *= 0.0D;
/* 464 */         this.u *= 0.0D;
/* 465 */         this.v *= 0.0D;
/*     */       } else {
/* 467 */         this.t *= 0.5D;
/* 468 */         this.u *= 0.0D;
/* 469 */         this.v *= 0.5D;
/*     */       } 
/*     */     } 
/*     */     
/* 473 */     double d7 = ☃.o() + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 474 */     double d8 = ☃.q() + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 475 */     double d9 = ☃.o() + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 476 */     double d10 = ☃.q() + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */     
/* 478 */     d2 = d9 - d7;
/* 479 */     d3 = d10 - d8;
/*     */ 
/*     */     
/* 482 */     if (d2 == 0.0D) {
/* 483 */       this.q = ☃.o() + 0.5D;
/* 484 */       d11 = this.s - ☃.q();
/* 485 */     } else if (d3 == 0.0D) {
/* 486 */       this.s = ☃.q() + 0.5D;
/* 487 */       d11 = this.q - ☃.o();
/*     */     } else {
/* 489 */       double d15 = this.q - d7;
/* 490 */       double d16 = this.s - d8;
/*     */       
/* 492 */       d11 = (d15 * d2 + d16 * d3) * 2.0D;
/*     */     } 
/*     */     
/* 495 */     this.q = d7 + d2 * d11;
/* 496 */     this.s = d8 + d3 * d11;
/*     */     
/* 498 */     b(this.q, this.r, this.s);
/*     */     
/* 500 */     double d12 = this.t;
/* 501 */     double d13 = this.v;
/* 502 */     if (aX()) {
/* 503 */       d12 *= 0.75D;
/* 504 */       d13 *= 0.75D;
/*     */     } 
/*     */     
/* 507 */     double d14 = p();
/* 508 */     d12 = xq.a(d12, -d14, d14);
/* 509 */     d13 = xq.a(d13, -d14, d14);
/*     */     
/* 511 */     a(afe.a, d12, 0.0D, d13);
/*     */     
/* 513 */     if (arrayOfInt[0][1] != 0 && xq.c(this.q) - ☃.o() == arrayOfInt[0][0] && xq.c(this.s) - ☃.q() == arrayOfInt[0][2]) {
/* 514 */       b(this.q, this.r + arrayOfInt[0][1], this.s);
/* 515 */     } else if (arrayOfInt[1][1] != 0 && xq.c(this.q) - ☃.o() == arrayOfInt[1][0] && xq.c(this.s) - ☃.q() == arrayOfInt[1][2]) {
/* 516 */       b(this.q, this.r + arrayOfInt[1][1], this.s);
/*     */     } 
/*     */     
/* 519 */     r();
/*     */     
/* 521 */     cee cee2 = j(this.q, this.r, this.s);
/* 522 */     if (cee2 != null && cee1 != null) {
/* 523 */       double d = (cee1.c - cee2.c) * 0.05D;
/*     */       
/* 525 */       d6 = Math.sqrt(this.t * this.t + this.v * this.v);
/* 526 */       if (d6 > 0.0D) {
/* 527 */         this.t = this.t / d6 * (d6 + d);
/* 528 */         this.v = this.v / d6 * (d6 + d);
/*     */       } 
/* 530 */       b(this.q, cee2.c, this.s);
/*     */     } 
/*     */     
/* 533 */     int i = xq.c(this.q);
/* 534 */     int j = xq.c(this.s);
/* 535 */     if (i != ☃.o() || j != ☃.q()) {
/* 536 */       d6 = Math.sqrt(this.t * this.t + this.v * this.v);
/*     */       
/* 538 */       this.t = d6 * (i - ☃.o());
/* 539 */       this.v = d6 * (j - ☃.q());
/*     */     } 
/*     */ 
/*     */     
/* 543 */     if (bool1) {
/* 544 */       double d = Math.sqrt(this.t * this.t + this.v * this.v);
/* 545 */       if (d > 0.01D) {
/* 546 */         double d15 = 0.06D;
/* 547 */         this.t += this.t / d * 0.06D;
/* 548 */         this.v += this.v / d * 0.06D;
/*     */ 
/*     */       
/*     */       }
/* 552 */       else if (bmn == bmn.b) {
/* 553 */         if (this.m.a_(☃.e()).l()) {
/* 554 */           this.t = 0.02D;
/* 555 */         } else if (this.m.a_(☃.f()).l()) {
/* 556 */           this.t = -0.02D;
/*     */         } 
/* 558 */       } else if (bmn == bmn.a) {
/* 559 */         if (this.m.a_(☃.c()).l()) {
/* 560 */           this.v = 0.02D;
/* 561 */         } else if (this.m.a_(☃.d()).l()) {
/* 562 */           this.v = -0.02D;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void r() {
/* 570 */     if (aX()) {
/* 571 */       this.t *= 0.996999979019165D;
/* 572 */       this.u *= 0.0D;
/* 573 */       this.v *= 0.996999979019165D;
/*     */     } else {
/* 575 */       this.t *= 0.9599999785423279D;
/* 576 */       this.u *= 0.0D;
/* 577 */       this.v *= 0.9599999785423279D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(double ☃, double d1, double d2) {
/* 583 */     this.q = ☃;
/* 584 */     this.r = d1;
/* 585 */     this.s = d2;
/* 586 */     float f1 = this.H / 2.0F;
/* 587 */     float f2 = this.I;
/* 588 */     a(new cea(☃ - f1, d1, d2 - f1, ☃ + f1, d1 + f2, d2 + f1));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cee j(double ☃, double d1, double d2) {
/* 632 */     int i = xq.c(☃);
/* 633 */     int j = xq.c(d1);
/* 634 */     int k = xq.c(d2);
/* 635 */     if (this.m.a_(new el(i, j - 1, k)).a(wv.z)) {
/* 636 */       j--;
/*     */     }
/*     */     
/* 639 */     blc blc = this.m.a_(new el(i, j, k));
/* 640 */     if (blc.a(wv.z)) {
/* 641 */       double d12; bmn bmn = (bmn)blc.c(((bco)blc.c()).e());
/* 642 */       int[][] arrayOfInt = h[bmn.a()];
/*     */       
/* 644 */       double d3 = i + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 645 */       double d4 = j + 0.0625D + arrayOfInt[0][1] * 0.5D;
/* 646 */       double d5 = k + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 647 */       double d6 = i + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 648 */       double d7 = j + 0.0625D + arrayOfInt[1][1] * 0.5D;
/* 649 */       double d8 = k + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */       
/* 651 */       double d9 = d6 - d3;
/* 652 */       double d10 = (d7 - d4) * 2.0D;
/* 653 */       double d11 = d8 - d5;
/*     */ 
/*     */       
/* 656 */       if (d9 == 0.0D) {
/* 657 */         d12 = d2 - k;
/* 658 */       } else if (d11 == 0.0D) {
/* 659 */         d12 = ☃ - i;
/*     */       } else {
/* 661 */         double d13 = ☃ - d3;
/* 662 */         double d14 = d2 - d5;
/*     */         
/* 664 */         d12 = (d13 * d9 + d14 * d11) * 2.0D;
/*     */       } 
/*     */       
/* 667 */       ☃ = d3 + d9 * d12;
/* 668 */       d1 = d4 + d10 * d12;
/* 669 */       d2 = d5 + d11 * d12;
/* 670 */       if (d10 < 0.0D) {
/* 671 */         d1++;
/*     */       }
/* 673 */       if (d10 > 0.0D) {
/* 674 */         d1 += 0.5D;
/*     */       }
/* 676 */       return new cee(☃, d1, d2);
/*     */     } 
/* 678 */     return null;
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
/*     */   protected void a(gy ☃) {
/* 692 */     if (☃.q("CustomDisplayTile")) {
/* 693 */       b(hk.d(☃.p("DisplayState")));
/*     */       
/* 695 */       l(☃.h("DisplayOffset"));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 701 */     if (C()) {
/* 702 */       ☃.a("CustomDisplayTile", true);
/* 703 */       ☃.a("DisplayState", hk.a(x()));
/* 704 */       ☃.b("DisplayOffset", A());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(aer ☃) {
/* 710 */     if (this.m.B) {
/*     */       return;
/*     */     }
/* 713 */     if (☃.R || this.R) {
/*     */       return;
/*     */     }
/*     */     
/* 717 */     if (w(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 721 */     double d1 = ☃.q - this.q;
/* 722 */     double d2 = ☃.s - this.s;
/*     */     
/* 724 */     double d3 = d1 * d1 + d2 * d2;
/* 725 */     if (d3 >= 9.999999747378752E-5D) {
/* 726 */       d3 = xq.a(d3);
/* 727 */       d1 /= d3;
/* 728 */       d2 /= d3;
/* 729 */       double d = 1.0D / d3;
/* 730 */       if (d > 1.0D) {
/* 731 */         d = 1.0D;
/*     */       }
/* 733 */       d1 *= d;
/* 734 */       d2 *= d;
/* 735 */       d1 *= 0.10000000149011612D;
/* 736 */       d2 *= 0.10000000149011612D;
/*     */       
/* 738 */       d1 *= (1.0F - this.S);
/* 739 */       d2 *= (1.0F - this.S);
/* 740 */       d1 *= 0.5D;
/* 741 */       d2 *= 0.5D;
/*     */       
/* 743 */       if (☃ instanceof aph) {
/* 744 */         double d4 = ☃.q - this.q;
/* 745 */         double d5 = ☃.s - this.s;
/*     */         
/* 747 */         cee cee1 = (new cee(d4, 0.0D, d5)).a();
/* 748 */         cee cee2 = (new cee(xq.b(this.w * 0.017453292F), 0.0D, xq.a(this.w * 0.017453292F))).a();
/*     */         
/* 750 */         double d6 = Math.abs(cee1.b(cee2));
/*     */         
/* 752 */         if (d6 < 0.800000011920929D) {
/*     */           return;
/*     */         }
/*     */         
/* 756 */         double d7 = ☃.t + this.t;
/* 757 */         double d8 = ☃.v + this.v;
/*     */         
/* 759 */         if (((aph)☃).v() == a.c && v() != a.c) {
/* 760 */           this.t *= 0.20000000298023224D;
/* 761 */           this.v *= 0.20000000298023224D;
/* 762 */           f(☃.t - d1, 0.0D, ☃.v - d2);
/* 763 */           ☃.t *= 0.949999988079071D;
/* 764 */           ☃.v *= 0.949999988079071D;
/* 765 */         } else if (((aph)☃).v() != a.c && v() == a.c) {
/* 766 */           ☃.t *= 0.20000000298023224D;
/* 767 */           ☃.v *= 0.20000000298023224D;
/* 768 */           ☃.f(this.t + d1, 0.0D, this.v + d2);
/* 769 */           this.t *= 0.949999988079071D;
/* 770 */           this.v *= 0.949999988079071D;
/*     */         } else {
/* 772 */           d7 /= 2.0D;
/* 773 */           d8 /= 2.0D;
/* 774 */           this.t *= 0.20000000298023224D;
/* 775 */           this.v *= 0.20000000298023224D;
/* 776 */           f(d7 - d1, 0.0D, d8 - d2);
/* 777 */           ☃.t *= 0.20000000298023224D;
/* 778 */           ☃.v *= 0.20000000298023224D;
/* 779 */           ☃.f(d7 + d1, 0.0D, d8 + d2);
/*     */         } 
/*     */       } else {
/* 782 */         f(-d1, 0.0D, -d2);
/* 783 */         ☃.f(d1 / 4.0D, 0.0D, d2 / 4.0D);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 824 */     this.ab.b(c, Float.valueOf(☃));
/*     */   }
/*     */   
/*     */   public float s() {
/* 828 */     return ((Float)this.ab.<Float>a(c)).floatValue();
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 832 */     this.ab.b(a, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int t() {
/* 836 */     return ((Integer)this.ab.<Integer>a(a)).intValue();
/*     */   }
/*     */   
/*     */   public void k(int ☃) {
/* 840 */     this.ab.b(b, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int u() {
/* 844 */     return ((Integer)this.ab.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   public abstract a v();
/*     */   
/*     */   public blc x() {
/* 850 */     if (!C()) {
/* 851 */       return z();
/*     */     }
/* 853 */     return bcs.a(((Integer)T().<Integer>a(d)).intValue());
/*     */   }
/*     */   
/*     */   public blc z() {
/* 857 */     return bct.a.p();
/*     */   }
/*     */   
/*     */   public int A() {
/* 861 */     if (!C()) {
/* 862 */       return B();
/*     */     }
/* 864 */     return ((Integer)T().<Integer>a(e)).intValue();
/*     */   }
/*     */   
/*     */   public int B() {
/* 868 */     return 6;
/*     */   }
/*     */   
/*     */   public void b(blc ☃) {
/* 872 */     T().b(d, Integer.valueOf(bcs.l(☃)));
/* 873 */     a(true);
/*     */   }
/*     */   
/*     */   public void l(int ☃) {
/* 877 */     T().b(e, Integer.valueOf(☃));
/* 878 */     a(true);
/*     */   }
/*     */   
/*     */   public boolean C() {
/* 882 */     return ((Boolean)T().<Boolean>a(f)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 886 */     T().b(f, Boolean.valueOf(☃));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */