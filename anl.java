/*     */ import java.util.List;
/*     */ import java.util.Optional;
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
/*     */ public class anl
/*     */   extends ajo
/*     */   implements amy
/*     */ {
/*  50 */   private static final UUID bD = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
/*  51 */   private static final afo bE = (new afo(bD, "Covered armor bonus", 20.0D, 0)).a(false);
/*     */   
/*  53 */   protected static final or<eq> a = ou.a((Class)anl.class, ot.n);
/*  54 */   protected static final or<Optional<el>> b = ou.a((Class)anl.class, ot.m);
/*  55 */   protected static final or<Byte> c = ou.a((Class)anl.class, ot.a);
/*  56 */   protected static final or<Byte> bC = ou.a((Class)anl.class, ot.a);
/*     */   
/*     */   private float bF;
/*     */   
/*     */   private float bG;
/*     */   
/*     */   private el bH;
/*     */   
/*     */   private int bI;
/*     */ 
/*     */   
/*     */   public anl(axy ☃) {
/*  68 */     super(aev.ah, ☃);
/*     */     
/*  70 */     a(1.0F, 1.0F);
/*  71 */     this.aR = 180.0F;
/*  72 */     this.aQ = 180.0F;
/*  73 */     this.aa = true;
/*     */     
/*  75 */     this.bH = null;
/*  76 */     this.b_ = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*  82 */     this.aQ = 180.0F;
/*  83 */     this.aR = 180.0F;
/*  84 */     this.w = 180.0F;
/*  85 */     this.y = 180.0F;
/*  86 */     this.aS = 180.0F;
/*  87 */     this.aT = 180.0F;
/*     */     
/*  89 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  94 */     this.by.a(1, new ahb(this, (Class)aog.class, 8.0F));
/*  95 */     this.by.a(4, new a(this));
/*  96 */     this.by.a(7, new e());
/*  97 */     this.by.a(8, new ahq(this));
/*     */     
/*  99 */     this.bz.a(1, new ail(this, true, new Class[0]));
/* 100 */     this.bz.a(2, new d(this, this));
/* 101 */     this.bz.a(3, new c(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/* 106 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/* 111 */     return wk.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 116 */     return wj.id;
/*     */   }
/*     */ 
/*     */   
/*     */   public void A() {
/* 121 */     if (!dG()) {
/* 122 */       super.A();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 128 */     return wj.ij;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 133 */     if (dG()) {
/* 134 */       return wj.il;
/*     */     }
/* 136 */     return wj.ik;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 141 */     super.x_();
/*     */     
/* 143 */     this.ab.a(a, eq.a);
/* 144 */     this.ab.a(b, Optional.empty());
/* 145 */     this.ab.a(c, Byte.valueOf((byte)0));
/* 146 */     this.ab.a(bC, Byte.valueOf((byte)16));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 151 */     super.bZ();
/*     */     
/* 153 */     a(ank.a).a(30.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected afv o() {
/* 158 */     return new b(this, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 163 */     super.a(☃);
/*     */     
/* 165 */     this.ab.b(a, eq.a(☃.f("AttachFace")));
/* 166 */     this.ab.b(c, Byte.valueOf(☃.f("Peek")));
/* 167 */     this.ab.b(bC, Byte.valueOf(☃.f("Color")));
/* 168 */     if (☃.e("APX")) {
/* 169 */       int i = ☃.h("APX");
/* 170 */       int j = ☃.h("APY");
/* 171 */       int k = ☃.h("APZ");
/* 172 */       this.ab.b(b, Optional.of(new el(i, j, k)));
/*     */     } else {
/* 174 */       this.ab.b(b, Optional.empty());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 180 */     super.b(☃);
/*     */     
/* 182 */     ☃.a("AttachFace", (byte)((eq)this.ab.<eq>a(a)).a());
/* 183 */     ☃.a("Peek", ((Byte)this.ab.<Byte>a(c)).byteValue());
/* 184 */     ☃.a("Color", ((Byte)this.ab.<Byte>a(bC)).byteValue());
/* 185 */     el el1 = dz();
/* 186 */     if (el1 != null) {
/* 187 */       ☃.b("APX", el1.o());
/* 188 */       ☃.b("APY", el1.p());
/* 189 */       ☃.b("APZ", el1.q());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 195 */     super.R_();
/*     */     
/* 197 */     el ☃ = ((Optional<el>)this.ab.<Optional<el>>a(b)).orElse(null);
/* 198 */     if (☃ == null && !this.m.B) {
/* 199 */       ☃ = new el(this);
/* 200 */       this.ab.b(b, Optional.of(☃));
/*     */     } 
/*     */     
/* 203 */     if (aW()) {
/* 204 */       ☃ = null;
/* 205 */       float f1 = (bU()).w;
/* 206 */       this.w = f1;
/* 207 */       this.aQ = f1;
/* 208 */       this.aR = f1;
/* 209 */       this.bI = 0;
/*     */     }
/* 211 */     else if (!this.m.B) {
/* 212 */       blc blc = this.m.a_(☃);
/* 213 */       if (!blc.f()) {
/* 214 */         if (blc.c() == bct.bo) {
/* 215 */           eq eq = (eq)blc.c(bkv.a);
/* 216 */           if (this.m.c(☃.a(eq))) {
/* 217 */             ☃ = ☃.a(eq);
/* 218 */             this.ab.b(b, Optional.of(☃));
/*     */           } else {
/* 220 */             l();
/*     */           } 
/* 222 */         } else if (blc.c() == bct.aX) {
/* 223 */           eq eq = (eq)blc.c(bkw.a);
/* 224 */           if (this.m.c(☃.a(eq))) {
/* 225 */             ☃ = ☃.a(eq);
/* 226 */             this.ab.b(b, Optional.of(☃));
/*     */           } else {
/* 228 */             l();
/*     */           } 
/*     */         } else {
/* 231 */           l();
/*     */         } 
/*     */       }
/*     */       
/* 235 */       el el1 = ☃.a(dy());
/* 236 */       if (!this.m.q(el1)) {
/*     */         
/* 238 */         boolean bool = false;
/* 239 */         for (eq eq : eq.values()) {
/* 240 */           el1 = ☃.a(eq);
/* 241 */           if (this.m.q(el1)) {
/* 242 */             this.ab.b(a, eq);
/* 243 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 247 */         if (!bool) {
/* 248 */           l();
/*     */         }
/*     */       } 
/*     */       
/* 252 */       el el2 = ☃.a(dy().d());
/* 253 */       if (this.m.q(el2)) {
/* 254 */         l();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 259 */     float f = dA() * 0.01F;
/*     */     
/* 261 */     this.bF = this.bG;
/* 262 */     if (this.bG > f) {
/* 263 */       this.bG = xq.a(this.bG - 0.05F, f, 1.0F);
/* 264 */     } else if (this.bG < f) {
/* 265 */       this.bG = xq.a(this.bG + 0.05F, 0.0F, f);
/*     */     } 
/*     */     
/* 268 */     if (☃ != null) {
/* 269 */       if (this.m.B) {
/* 270 */         if (this.bI > 0 && this.bH != null) {
/* 271 */           this.bI--;
/*     */         } else {
/* 273 */           this.bH = ☃;
/*     */         } 
/*     */       }
/* 276 */       this.q = ☃.o() + 0.5D;
/* 277 */       this.r = ☃.p();
/* 278 */       this.s = ☃.q() + 0.5D;
/* 279 */       this.n = this.q;
/* 280 */       this.o = this.r;
/* 281 */       this.p = this.s;
/* 282 */       this.N = this.q;
/* 283 */       this.O = this.r;
/* 284 */       this.P = this.s;
/*     */       
/* 286 */       double d1 = 0.5D - xq.a((0.5F + this.bG) * 3.1415927F) * 0.5D;
/* 287 */       double d2 = 0.5D - xq.a((0.5F + this.bF) * 3.1415927F) * 0.5D;
/* 288 */       double d3 = d1 - d2;
/* 289 */       double d4 = 0.0D;
/* 290 */       double d5 = 0.0D;
/* 291 */       double d6 = 0.0D;
/*     */ 
/*     */       
/* 294 */       eq eq = dy();
/* 295 */       switch (null.a[eq.ordinal()]) {
/*     */         case 1:
/* 297 */           a(new cea(this.q - 0.5D, this.r, this.s - 0.5D, this.q + 0.5D, this.r + 1.0D + d1, this.s + 0.5D));
/* 298 */           d5 = d3;
/*     */           break;
/*     */         case 2:
/* 301 */           a(new cea(this.q - 0.5D, this.r - d1, this.s - 0.5D, this.q + 0.5D, this.r + 1.0D, this.s + 0.5D));
/* 302 */           d5 = -d3;
/*     */           break;
/*     */         case 3:
/* 305 */           a(new cea(this.q - 0.5D, this.r, this.s - 0.5D, this.q + 0.5D, this.r + 1.0D, this.s + 0.5D + d1));
/* 306 */           d6 = d3;
/*     */           break;
/*     */         case 4:
/* 309 */           a(new cea(this.q - 0.5D, this.r, this.s - 0.5D - d1, this.q + 0.5D, this.r + 1.0D, this.s + 0.5D));
/* 310 */           d6 = -d3;
/*     */           break;
/*     */         case 5:
/* 313 */           a(new cea(this.q - 0.5D, this.r, this.s - 0.5D, this.q + 0.5D + d1, this.r + 1.0D, this.s + 0.5D));
/* 314 */           d4 = d3;
/*     */           break;
/*     */         case 6:
/* 317 */           a(new cea(this.q - 0.5D - d1, this.r, this.s - 0.5D, this.q + 0.5D, this.r + 1.0D, this.s + 0.5D));
/* 318 */           d4 = -d3;
/*     */           break;
/*     */       } 
/*     */       
/* 322 */       if (d3 > 0.0D) {
/* 323 */         List<aer> list = this.m.a(this, bD());
/* 324 */         if (!list.isEmpty()) {
/* 325 */           for (aer aer : list) {
/* 326 */             if (!(aer instanceof anl) && !aer.R) {
/* 327 */               aer.a(afe.e, d4, d5, d6);
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afe ☃, double d1, double d2, double d3) {
/* 337 */     if (☃ == afe.d) {
/* 338 */       l();
/*     */     } else {
/* 340 */       super.a(☃, d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(double ☃, double d1, double d2) {
/* 346 */     super.b(☃, d1, d2);
/* 347 */     if (this.ab == null || this.U == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 351 */     Optional<el> optional1 = this.ab.<Optional<el>>a(b);
/* 352 */     Optional<el> optional2 = Optional.of(new el(☃, d1, d2));
/* 353 */     if (!optional2.equals(optional1)) {
/* 354 */       this.ab.b(b, optional2);
/* 355 */       this.ab.b(c, Byte.valueOf((byte)0));
/* 356 */       this.al = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean l() {
/* 361 */     if (do() || !aF()) {
/* 362 */       return true;
/*     */     }
/* 364 */     el ☃ = new el(this);
/* 365 */     for (int i = 0; i < 5; i++) {
/* 366 */       el el1 = ☃.a(8 - this.T.nextInt(17), 8 - this.T.nextInt(17), 8 - this.T.nextInt(17));
/* 367 */       if (el1.p() > 0 && this.m.c(el1) && this.m.i(this) && this.m.c(this, new cea(el1))) {
/* 368 */         boolean bool = false;
/* 369 */         for (eq eq : eq.values()) {
/* 370 */           if (this.m.q(el1.a(eq))) {
/* 371 */             this.ab.b(a, eq);
/* 372 */             bool = true;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/* 377 */         if (bool) {
/* 378 */           a(wj.io, 1.0F, 1.0F);
/* 379 */           this.ab.b(b, Optional.of(el1));
/* 380 */           this.ab.b(c, Byte.valueOf((byte)0));
/* 381 */           e((afa)null);
/* 382 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 386 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 391 */     super.k();
/*     */     
/* 393 */     this.t = 0.0D;
/* 394 */     this.u = 0.0D;
/* 395 */     this.v = 0.0D;
/* 396 */     this.aR = 180.0F;
/* 397 */     this.aQ = 180.0F;
/* 398 */     this.w = 180.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 403 */     if (b.equals(☃) && 
/* 404 */       this.m.B && !aW()) {
/*     */ 
/*     */ 
/*     */       
/* 408 */       el el1 = dz();
/* 409 */       if (el1 != null) {
/* 410 */         if (this.bH == null) {
/* 411 */           this.bH = el1;
/*     */         } else {
/* 413 */           this.bI = 6;
/*     */         } 
/* 415 */         this.q = el1.o() + 0.5D;
/* 416 */         this.r = el1.p();
/* 417 */         this.s = el1.q() + 0.5D;
/* 418 */         this.n = this.q;
/* 419 */         this.o = this.r;
/* 420 */         this.p = this.s;
/* 421 */         this.N = this.q;
/* 422 */         this.O = this.r;
/* 423 */         this.P = this.s;
/*     */       } 
/*     */     } 
/*     */     
/* 427 */     super.a(☃);
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
/*     */   public boolean a(aea ☃, float f) {
/* 439 */     if (dG()) {
/* 440 */       aer aer = ☃.j();
/* 441 */       if (aer instanceof aok) {
/* 442 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 446 */     if (super.a(☃, f)) {
/* 447 */       if (cq() < cw() * 0.5D && this.T.nextInt(4) == 0) {
/* 448 */         l();
/*     */       }
/*     */       
/* 451 */       return true;
/*     */     } 
/* 453 */     return false;
/*     */   }
/*     */   
/*     */   private boolean dG() {
/* 457 */     return (dA() == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cea al() {
/* 463 */     return aF() ? bD() : null;
/*     */   }
/*     */   
/*     */   public eq dy() {
/* 467 */     return this.ab.<eq>a(a);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public el dz() {
/* 472 */     return ((Optional<el>)this.ab.<Optional<el>>a(b)).orElse(null);
/*     */   }
/*     */   
/*     */   public void g(@Nullable el ☃) {
/* 476 */     this.ab.b(b, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   public int dA() {
/* 480 */     return ((Byte)this.ab.<Byte>a(c)).byteValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 484 */     if (!this.m.B) {
/* 485 */       a(ank.h).c(bE);
/* 486 */       if (☃ == 0) {
/* 487 */         a(ank.h).b(bE);
/* 488 */         a(wj.ii, 1.0F, 1.0F);
/*     */       } else {
/* 490 */         a(wj.im, 1.0F, 1.0F);
/*     */       } 
/*     */     } 
/*     */     
/* 494 */     this.ab.b(c, Byte.valueOf((byte)☃));
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
/*     */   public float bF() {
/* 511 */     return 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int K() {
/* 516 */     return 180;
/*     */   }
/*     */ 
/*     */   
/*     */   public int L() {
/* 521 */     return 180;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void i(aer ☃) {}
/*     */ 
/*     */   
/*     */   public float aM() {
/* 530 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   class b
/*     */     extends afv
/*     */   {
/*     */     public b(anl this$0, afa ☃) {
/* 539 */       super(☃);
/*     */     }
/*     */     
/*     */     public void a() {}
/*     */   }
/*     */   
/*     */   class e
/*     */     extends agt
/*     */   {
/*     */     private int b;
/*     */     
/*     */     private e(anl this$0) {}
/*     */     
/*     */     public boolean a() {
/* 553 */       return (this.a.v() == null && anl.a(this.a).nextInt(40) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 558 */       return (this.a.v() == null && this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 563 */       this.b = 20 * (1 + anl.b(this.a).nextInt(3));
/* 564 */       this.a.a(30);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 569 */       if (this.a.v() == null) {
/* 570 */         this.a.a(0);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 576 */       this.b--;
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends agt {
/*     */     private int b;
/*     */     
/*     */     public a(anl this$0) {
/* 584 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 589 */       afa ☃ = this.a.v();
/* 590 */       if (☃ == null || !☃.aF()) {
/* 591 */         return false;
/*     */       }
/* 593 */       if (this.a.m.aj() == adi.a) {
/* 594 */         return false;
/*     */       }
/*     */       
/* 597 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 602 */       this.b = 20;
/* 603 */       this.a.a(100);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 608 */       this.a.a(0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 613 */       if (this.a.m.aj() == adi.a) {
/*     */         return;
/*     */       }
/* 616 */       this.b--;
/*     */       
/* 618 */       afa ☃ = this.a.v();
/* 619 */       this.a.p().a(☃, 180.0F, 180.0F);
/*     */       
/* 621 */       double d = this.a.h(☃);
/*     */       
/* 623 */       if (d < 400.0D) {
/* 624 */         if (this.b <= 0) {
/* 625 */           this.b = 20 + anl.c(this.a).nextInt(10) * 20 / 2;
/*     */           
/* 627 */           aov aov = new aov(this.a.m, this.a, ☃, this.a.dy().k());
/* 628 */           this.a.m.a(aov);
/* 629 */           this.a.a(wj.in, 2.0F, (anl.d(this.a).nextFloat() - anl.e(this.a).nextFloat()) * 0.2F + 1.0F);
/*     */         } 
/*     */       } else {
/* 632 */         this.a.e((afa)null);
/*     */       } 
/*     */       
/* 635 */       super.e();
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends aio<aog> {
/*     */     public d(anl this$0, anl ☃) {
/* 641 */       super(☃, aog.class, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 646 */       if (this.i.m.aj() == adi.a) {
/* 647 */         return false;
/*     */       }
/* 649 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     protected cea a(double ☃) {
/* 654 */       eq eq = ((anl)this.e).dy();
/* 655 */       if (eq.k() == eq.a.a) {
/* 656 */         return this.e.bD().c(4.0D, ☃, ☃);
/*     */       }
/* 658 */       if (eq.k() == eq.a.c) {
/* 659 */         return this.e.bD().c(☃, ☃, 4.0D);
/*     */       }
/* 661 */       return this.e.bD().c(☃, 4.0D, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends aio<afa> {
/*     */     public c(anl ☃) {
/* 667 */       super(☃, afa.class, 10, true, false, ☃ -> ☃ instanceof amy);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 672 */       if (this.e.be() == null) {
/* 673 */         return false;
/*     */       }
/* 675 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     protected cea a(double ☃) {
/* 680 */       eq eq = ((anl)this.e).dy();
/* 681 */       if (eq.k() == eq.a.a) {
/* 682 */         return this.e.bD().c(4.0D, ☃, ☃);
/*     */       }
/* 684 */       if (eq.k() == eq.a.c) {
/* 685 */         return this.e.bD().c(☃, ☃, 4.0D);
/*     */       }
/* 687 */       return this.e.bD().c(☃, 4.0D, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 694 */     return ccl.F;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */