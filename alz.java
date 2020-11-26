/*     */ import java.util.List;
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
/*     */ public class alz
/*     */   extends afa
/*     */ {
/*  48 */   private static final fd bx = new fd(0.0F, 0.0F, 0.0F);
/*  49 */   private static final fd by = new fd(0.0F, 0.0F, 0.0F);
/*  50 */   private static final fd bz = new fd(-10.0F, 0.0F, -10.0F);
/*  51 */   private static final fd bA = new fd(-15.0F, 0.0F, 10.0F);
/*  52 */   private static final fd bB = new fd(-1.0F, 0.0F, -1.0F);
/*  53 */   private static final fd bC = new fd(1.0F, 0.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   public static final or<Byte> a = ou.a((Class)alz.class, ot.a);
/*  69 */   public static final or<fd> b = ou.a((Class)alz.class, ot.k);
/*  70 */   public static final or<fd> c = ou.a((Class)alz.class, ot.k);
/*  71 */   public static final or<fd> d = ou.a((Class)alz.class, ot.k);
/*  72 */   public static final or<fd> e = ou.a((Class)alz.class, ot.k);
/*  73 */   public static final or<fd> f = ou.a((Class)alz.class, ot.k);
/*  74 */   public static final or<fd> g = ou.a((Class)alz.class, ot.k);
/*     */   static {
/*  76 */     bD = (☃ -> (☃ instanceof aph && ((aph)☃).v() == aph.a.a));
/*     */   }
/*     */   
/*     */   private static final Predicate<aer> bD;
/*  80 */   private final ez<ate> bE = ez.a(2, ate.a);
/*  81 */   private final ez<ate> bF = ez.a(4, ate.a);
/*     */   
/*     */   private boolean bG;
/*     */   public long h;
/*     */   private int bH;
/*     */   private boolean bI;
/*  87 */   private fd bJ = bx;
/*  88 */   private fd bK = by;
/*  89 */   private fd bL = bz;
/*  90 */   private fd bM = bA;
/*  91 */   private fd bN = bB;
/*  92 */   private fd bO = bC;
/*     */   
/*     */   public alz(axy ☃) {
/*  95 */     super(aev.b, ☃);
/*  96 */     this.R = aj();
/*  97 */     a(0.5F, 1.975F);
/*  98 */     this.Q = 0.0F;
/*     */   }
/*     */   
/*     */   public alz(axy ☃, double d1, double d2, double d3) {
/* 102 */     this(☃);
/* 103 */     b(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected final void a(float ☃, float f1) {
/* 108 */     double d1 = this.q;
/* 109 */     double d2 = this.r;
/* 110 */     double d3 = this.s;
/*     */     
/* 112 */     float f = p() ? 0.0F : (y_() ? 0.5F : 1.0F);
/* 113 */     super.a(☃ * f, f1 * f);
/*     */     
/* 115 */     b(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cP() {
/* 120 */     return (super.cP() && !aj());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 125 */     super.x_();
/* 126 */     this.ab.a(a, Byte.valueOf((byte)0));
/* 127 */     this.ab.a(b, bx);
/* 128 */     this.ab.a(c, by);
/* 129 */     this.ab.a(d, bz);
/* 130 */     this.ab.a(e, bA);
/* 131 */     this.ab.a(f, bB);
/* 132 */     this.ab.a(g, bC);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<ate> aS() {
/* 137 */     return this.bE;
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<ate> aT() {
/* 142 */     return this.bF;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aew ☃) {
/* 147 */     switch (null.a[☃.a().ordinal()]) {
/*     */       case 1:
/* 149 */         return this.bE.get(☃.b());
/*     */       case 2:
/* 151 */         return this.bF.get(☃.b());
/*     */     } 
/* 153 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aew ☃, ate ate1) {
/* 158 */     switch (null.a[☃.a().ordinal()]) {
/*     */       case 1:
/* 160 */         b(ate1);
/* 161 */         this.bE.set(☃.b(), ate1);
/*     */         break;
/*     */       case 2:
/* 164 */         b(ate1);
/* 165 */         this.bF.set(☃.b(), ate1);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, ate ate1) {
/*     */     aew aew;
/* 173 */     if (☃ == 98) {
/* 174 */       aew = aew.a;
/* 175 */     } else if (☃ == 99) {
/* 176 */       aew = aew.b;
/*     */     }
/* 178 */     else if (☃ == 100 + aew.f.b()) {
/* 179 */       aew = aew.f;
/* 180 */     } else if (☃ == 100 + aew.e.b()) {
/* 181 */       aew = aew.e;
/* 182 */     } else if (☃ == 100 + aew.d.b()) {
/* 183 */       aew = aew.d;
/* 184 */     } else if (☃ == 100 + aew.c.b()) {
/* 185 */       aew = aew.c;
/*     */     } else {
/* 187 */       return false;
/*     */     } 
/*     */     
/* 190 */     if (ate1.a() || afb.b(aew, ate1) || aew == aew.f) {
/* 191 */       a(aew, ate1);
/* 192 */       return true;
/*     */     } 
/* 194 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 199 */     super.b(☃);
/*     */     
/* 201 */     he he1 = new he();
/* 202 */     for (ate ate : this.bF) {
/* 203 */       gy gy1 = new gy();
/* 204 */       if (!ate.a()) {
/* 205 */         ate.b(gy1);
/*     */       }
/* 207 */       he1.a(gy1);
/*     */     } 
/* 209 */     ☃.a("ArmorItems", he1);
/*     */     
/* 211 */     he he2 = new he();
/* 212 */     for (ate ate : this.bE) {
/* 213 */       gy gy1 = new gy();
/* 214 */       if (!ate.a()) {
/* 215 */         ate.b(gy1);
/*     */       }
/* 217 */       he2.a(gy1);
/*     */     } 
/* 219 */     ☃.a("HandItems", he2);
/*     */     
/* 221 */     ☃.a("Invisible", bd());
/* 222 */     ☃.a("Small", l());
/*     */     
/* 224 */     ☃.a("ShowArms", n());
/*     */     
/* 226 */     ☃.b("DisabledSlots", this.bH);
/* 227 */     ☃.a("NoBasePlate", o());
/* 228 */     if (p()) {
/* 229 */       ☃.a("Marker", p());
/*     */     }
/* 231 */     ☃.a("Pose", z());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 236 */     super.a(☃);
/*     */     
/* 238 */     if (☃.c("ArmorItems", 9)) {
/* 239 */       he he = ☃.d("ArmorItems", 10);
/*     */       
/* 241 */       for (int i = 0; i < this.bF.size(); i++) {
/* 242 */         this.bF.set(i, ate.a(he.e(i)));
/*     */       }
/*     */     } 
/* 245 */     if (☃.c("HandItems", 9)) {
/* 246 */       he he = ☃.d("HandItems", 10);
/*     */       
/* 248 */       for (int i = 0; i < this.bE.size(); i++) {
/* 249 */         this.bE.set(i, ate.a(he.e(i)));
/*     */       }
/*     */     } 
/*     */     
/* 253 */     i(☃.q("Invisible"));
/*     */     
/* 255 */     p(☃.q("Small"));
/*     */     
/* 257 */     q(☃.q("ShowArms"));
/*     */     
/* 259 */     this.bH = ☃.h("DisabledSlots");
/* 260 */     r(☃.q("NoBasePlate"));
/* 261 */     s(☃.q("Marker"));
/* 262 */     this.bI = !p();
/* 263 */     this.R = aj();
/* 264 */     gy gy1 = ☃.p("Pose");
/* 265 */     g(gy1);
/*     */   }
/*     */   
/*     */   private void g(gy ☃) {
/* 269 */     he he1 = ☃.d("Head", 5);
/* 270 */     a(he1.isEmpty() ? bx : new fd(he1));
/*     */     
/* 272 */     he he2 = ☃.d("Body", 5);
/* 273 */     b(he2.isEmpty() ? by : new fd(he2));
/*     */     
/* 275 */     he he3 = ☃.d("LeftArm", 5);
/* 276 */     c(he3.isEmpty() ? bz : new fd(he3));
/*     */     
/* 278 */     he he4 = ☃.d("RightArm", 5);
/* 279 */     d(he4.isEmpty() ? bA : new fd(he4));
/*     */     
/* 281 */     he he5 = ☃.d("LeftLeg", 5);
/* 282 */     e(he5.isEmpty() ? bB : new fd(he5));
/*     */     
/* 284 */     he he6 = ☃.d("RightLeg", 5);
/* 285 */     f(he6.isEmpty() ? bC : new fd(he6));
/*     */   }
/*     */   
/*     */   private gy z() {
/* 289 */     gy ☃ = new gy();
/* 290 */     if (!bx.equals(this.bJ)) {
/* 291 */       ☃.a("Head", this.bJ.a());
/*     */     }
/* 293 */     if (!by.equals(this.bK)) {
/* 294 */       ☃.a("Body", this.bK.a());
/*     */     }
/* 296 */     if (!bz.equals(this.bL)) {
/* 297 */       ☃.a("LeftArm", this.bL.a());
/*     */     }
/* 299 */     if (!bA.equals(this.bM)) {
/* 300 */       ☃.a("RightArm", this.bM.a());
/*     */     }
/* 302 */     if (!bB.equals(this.bN)) {
/* 303 */       ☃.a("LeftLeg", this.bN.a());
/*     */     }
/* 305 */     if (!bC.equals(this.bO)) {
/* 306 */       ☃.a("RightLeg", this.bO.a());
/*     */     }
/* 308 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean aC() {
/* 314 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void C(aer ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void cN() {
/* 325 */     List<aer> ☃ = this.m.a(this, bD(), bD);
/* 326 */     for (int i = 0; i < ☃.size(); i++) {
/* 327 */       aer aer = ☃.get(i);
/*     */       
/* 329 */       if (h(aer) <= 0.2D) {
/* 330 */         aer.i(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aog ☃, cee cee1, adk adk1) {
/* 337 */     ate ate = ☃.b(adk1);
/* 338 */     if (p() || ate.b() == atf.ed) {
/* 339 */       return adm.b;
/*     */     }
/* 341 */     if (this.m.B || ☃.t()) {
/* 342 */       return adm.a;
/*     */     }
/*     */     
/* 345 */     aew aew = afb.e(ate);
/*     */     
/* 347 */     if (ate.a()) {
/* 348 */       aew aew1 = b(cee1);
/* 349 */       aew aew2 = c(aew1) ? aew : aew1;
/* 350 */       if (a(aew2)) {
/* 351 */         a(☃, aew2, ate, adk1);
/*     */       }
/*     */     } else {
/* 354 */       if (c(aew)) {
/* 355 */         return adm.c;
/*     */       }
/* 357 */       if (aew.a() == aew.a.a && !n()) {
/* 358 */         return adm.c;
/*     */       }
/* 360 */       a(☃, aew, ate, adk1);
/*     */     } 
/*     */     
/* 363 */     return adm.a;
/*     */   }
/*     */   
/*     */   protected aew b(cee ☃) {
/* 367 */     aew aew1 = aew.a;
/* 368 */     boolean bool = l();
/* 369 */     double d = bool ? (☃.c * 2.0D) : ☃.c;
/* 370 */     aew aew2 = aew.c;
/* 371 */     if (d >= 0.1D && d < 0.1D + (bool ? 0.8D : 0.45D) && a(aew2)) {
/* 372 */       aew1 = aew.c;
/* 373 */     } else if (d >= 0.9D + (bool ? 0.3D : 0.0D) && d < 0.9D + (bool ? 1.0D : 0.7D) && a(aew.e)) {
/* 374 */       aew1 = aew.e;
/* 375 */     } else if (d >= 0.4D && d < 0.4D + (bool ? 1.0D : 0.8D) && a(aew.d)) {
/* 376 */       aew1 = aew.d;
/* 377 */     } else if (d >= 1.6D && a(aew.f)) {
/* 378 */       aew1 = aew.f;
/* 379 */     } else if (!a(aew.a) && a(aew.b)) {
/* 380 */       aew1 = aew.b;
/*     */     } 
/*     */     
/* 383 */     return aew1;
/*     */   }
/*     */   
/*     */   public boolean c(aew ☃) {
/* 387 */     return ((this.bH & 1 << ☃.c()) != 0 || (☃.a() == aew.a.a && !n()));
/*     */   }
/*     */   
/*     */   private void a(aog ☃, aew aew1, ate ate1, adk adk1) {
/* 391 */     ate ate2 = b(aew1);
/*     */     
/* 393 */     if (!ate2.a() && (this.bH & 1 << aew1.c() + 8) != 0) {
/*     */       return;
/*     */     }
/*     */     
/* 397 */     if (ate2.a() && (this.bH & 1 << aew1.c() + 16) != 0) {
/*     */       return;
/*     */     }
/*     */     
/* 401 */     if (☃.bV.d && ate2.a() && !ate1.a()) {
/* 402 */       ate ate3 = ate1.i();
/* 403 */       ate3.e(1);
/* 404 */       a(aew1, ate3);
/*     */       
/*     */       return;
/*     */     } 
/* 408 */     if (!ate1.a() && ate1.C() > 1) {
/* 409 */       if (!ate2.a()) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 414 */       ate ate3 = ate1.i();
/* 415 */       ate3.e(1);
/* 416 */       a(aew1, ate3);
/* 417 */       ate1.g(1);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 422 */     a(aew1, ate1);
/* 423 */     ☃.a(adk1, ate2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 428 */     if (this.m.B || this.G) {
/* 429 */       return false;
/*     */     }
/*     */     
/* 432 */     if (aea.m.equals(☃)) {
/* 433 */       V();
/* 434 */       return false;
/*     */     } 
/* 436 */     if (b(☃) || this.bG || p()) {
/* 437 */       return false;
/*     */     }
/* 439 */     if (☃.d()) {
/* 440 */       D();
/* 441 */       V();
/* 442 */       return false;
/*     */     } 
/* 444 */     if (aea.a.equals(☃)) {
/* 445 */       if (aV()) {
/* 446 */         a(0.15F);
/*     */       } else {
/* 448 */         f(5);
/*     */       } 
/* 450 */       return false;
/*     */     } 
/* 452 */     if (aea.c.equals(☃) && cq() > 0.5F) {
/* 453 */       a(4.0F);
/* 454 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 458 */     boolean bool1 = ☃.j() instanceof aok;
/* 459 */     boolean bool2 = "player".equals(☃.q());
/* 460 */     if (!bool2 && !bool1) {
/* 461 */       return false;
/*     */     }
/* 463 */     if (☃.k() instanceof aog && !((aog)☃.k()).bV.e) {
/* 464 */       return false;
/*     */     }
/* 466 */     if (☃.v()) {
/* 467 */       F();
/* 468 */       A();
/* 469 */       V();
/* 470 */       return false;
/*     */     } 
/*     */     
/* 473 */     long l = this.m.V();
/* 474 */     if (l - this.h <= 5L || bool1) {
/* 475 */       B();
/* 476 */       A();
/* 477 */       V();
/*     */     } else {
/* 479 */       this.m.a(this, (byte)32);
/* 480 */       this.h = l;
/*     */     } 
/* 482 */     return true;
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
/*     */   private void A() {
/* 508 */     if (this.m instanceof td) {
/* 509 */       ((td)this.m).a(new fh(fm.d, bct.n.p()), this.q, this.r + this.I / 1.5D, this.s, 10, (this.H / 4.0F), (this.I / 4.0F), (this.H / 4.0F), 0.05D);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(float ☃) {
/* 514 */     float f = cq();
/* 515 */     f -= ☃;
/* 516 */     if (f <= 0.5F) {
/* 517 */       D();
/* 518 */       V();
/*     */     } else {
/* 520 */       l(f);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void B() {
/* 525 */     bcs.a(this.m, new el(this), new ate(atf.dY));
/* 526 */     D();
/*     */   }
/*     */   
/*     */   private void D() {
/* 530 */     F(); int ☃;
/* 531 */     for (☃ = 0; ☃ < this.bE.size(); ☃++) {
/* 532 */       ate ate = this.bE.get(☃);
/* 533 */       if (!ate.a()) {
/* 534 */         bcs.a(this.m, (new el(this)).a(), ate);
/* 535 */         this.bE.set(☃, ate.a);
/*     */       } 
/*     */     } 
/* 538 */     for (☃ = 0; ☃ < this.bF.size(); ☃++) {
/* 539 */       ate ate = this.bF.get(☃);
/* 540 */       if (!ate.a()) {
/* 541 */         bcs.a(this.m, (new el(this)).a(), ate);
/* 542 */         this.bF.set(☃, ate.a);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void F() {
/* 548 */     this.m.a((aog)null, this.q, this.r, this.s, wj.x, bV(), 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float e(float ☃, float f1) {
/* 553 */     this.aR = this.y;
/* 554 */     this.aQ = this.w;
/* 555 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 560 */     return y_() ? (this.I * 0.5F) : (this.I * 0.9F);
/*     */   }
/*     */ 
/*     */   
/*     */   public double aI() {
/* 565 */     return p() ? 0.0D : 0.10000000149011612D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 570 */     if (aj()) {
/*     */       return;
/*     */     }
/* 573 */     super.a(☃, f1, f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(float ☃) {
/* 578 */     this.aR = this.y = ☃;
/* 579 */     this.aT = this.aS = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j(float ☃) {
/* 584 */     this.aR = this.y = ☃;
/* 585 */     this.aT = this.aS = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 590 */     super.R_();
/*     */     
/* 592 */     fd ☃ = this.ab.<fd>a(b);
/* 593 */     if (!this.bJ.equals(☃)) {
/* 594 */       a(☃);
/*     */     }
/* 596 */     fd fd1 = this.ab.<fd>a(c);
/* 597 */     if (!this.bK.equals(fd1)) {
/* 598 */       b(fd1);
/*     */     }
/* 600 */     fd fd2 = this.ab.<fd>a(d);
/* 601 */     if (!this.bL.equals(fd2)) {
/* 602 */       c(fd2);
/*     */     }
/* 604 */     fd fd3 = this.ab.<fd>a(e);
/* 605 */     if (!this.bM.equals(fd3)) {
/* 606 */       d(fd3);
/*     */     }
/* 608 */     fd fd4 = this.ab.<fd>a(f);
/* 609 */     if (!this.bN.equals(fd4)) {
/* 610 */       e(fd4);
/*     */     }
/* 612 */     fd fd5 = this.ab.<fd>a(g);
/* 613 */     if (!this.bO.equals(fd5)) {
/* 614 */       f(fd5);
/*     */     }
/*     */     
/* 617 */     boolean bool = p();
/* 618 */     if (this.bI != bool) {
/* 619 */       a(bool);
/* 620 */       this.j = !bool;
/* 621 */       this.bI = bool;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(boolean ☃) {
/* 626 */     if (☃) {
/* 627 */       a(0.0F, 0.0F);
/*     */     } else {
/* 629 */       a(0.5F, 1.975F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void C() {
/* 635 */     i(this.bG);
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(boolean ☃) {
/* 640 */     this.bG = ☃;
/* 641 */     super.i(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean y_() {
/* 646 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   public void S() {
/* 651 */     V();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bL() {
/* 656 */     return bd();
/*     */   }
/*     */ 
/*     */   
/*     */   public bzc A_() {
/* 661 */     if (p()) {
/* 662 */       return bzc.d;
/*     */     }
/* 664 */     return super.A_();
/*     */   }
/*     */   
/*     */   private void p(boolean ☃) {
/* 668 */     this.ab.b(a, Byte.valueOf(a(((Byte)this.ab.<Byte>a(a)).byteValue(), 1, ☃)));
/* 669 */     a(0.5F, 1.975F);
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 673 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   private void q(boolean ☃) {
/* 677 */     this.ab.b(a, Byte.valueOf(a(((Byte)this.ab.<Byte>a(a)).byteValue(), 4, ☃)));
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 681 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x4) != 0);
/*     */   }
/*     */   
/*     */   private void r(boolean ☃) {
/* 685 */     this.ab.b(a, Byte.valueOf(a(((Byte)this.ab.<Byte>a(a)).byteValue(), 8, ☃)));
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 689 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x8) != 0);
/*     */   }
/*     */   
/*     */   private void s(boolean ☃) {
/* 693 */     this.ab.b(a, Byte.valueOf(a(((Byte)this.ab.<Byte>a(a)).byteValue(), 16, ☃)));
/* 694 */     a(0.5F, 1.975F);
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 698 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x10) != 0);
/*     */   }
/*     */   
/*     */   private byte a(byte ☃, int i, boolean bool) {
/* 702 */     if (bool) {
/* 703 */       ☃ = (byte)(☃ | i);
/*     */     } else {
/* 705 */       ☃ = (byte)(☃ & (i ^ 0xFFFFFFFF));
/*     */     } 
/* 707 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(fd ☃) {
/* 711 */     this.bJ = ☃;
/* 712 */     this.ab.b(b, ☃);
/*     */   }
/*     */   
/*     */   public void b(fd ☃) {
/* 716 */     this.bK = ☃;
/* 717 */     this.ab.b(c, ☃);
/*     */   }
/*     */   
/*     */   public void c(fd ☃) {
/* 721 */     this.bL = ☃;
/* 722 */     this.ab.b(d, ☃);
/*     */   }
/*     */   
/*     */   public void d(fd ☃) {
/* 726 */     this.bM = ☃;
/* 727 */     this.ab.b(e, ☃);
/*     */   }
/*     */   
/*     */   public void e(fd ☃) {
/* 731 */     this.bN = ☃;
/* 732 */     this.ab.b(f, ☃);
/*     */   }
/*     */   
/*     */   public void f(fd ☃) {
/* 736 */     this.bO = ☃;
/* 737 */     this.ab.b(g, ☃);
/*     */   }
/*     */   
/*     */   public fd r() {
/* 741 */     return this.bJ;
/*     */   }
/*     */   
/*     */   public fd s() {
/* 745 */     return this.bK;
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
/*     */   public boolean aB() {
/* 766 */     return (super.aB() && !p());
/*     */   }
/*     */ 
/*     */   
/*     */   public aez cS() {
/* 771 */     return aez.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi m(int ☃) {
/* 776 */     return wj.y;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi d(aea ☃) {
/* 782 */     return wj.z;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi cs() {
/* 788 */     return wj.x;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(amj ☃) {}
/*     */ 
/*     */   
/*     */   public boolean de() {
/* 797 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 802 */     if (a.equals(☃)) {
/* 803 */       a(0.5F, 1.975F);
/*     */     }
/* 805 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean df() {
/* 810 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\alz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */