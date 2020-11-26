/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class bkf
/*     */   extends bji
/*     */ {
/*     */   private pc a;
/*  40 */   private String e = "";
/*  41 */   private String f = "";
/*  42 */   private el g = new el(0, 1, 0);
/*  43 */   private el h = el.a;
/*  44 */   private bfz i = bfz.a;
/*  45 */   private bhb j = bhb.a;
/*  46 */   private bmr k = bmr.d;
/*     */   private boolean l = true;
/*     */   private boolean m;
/*     */   private boolean n;
/*     */   private boolean o = true;
/*  51 */   private float p = 1.0F;
/*     */   private long q;
/*     */   
/*     */   public bkf() {
/*  55 */     super(bjj.t);
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  60 */     super.a(☃);
/*  61 */     ☃.a("name", c());
/*  62 */     ☃.a("author", this.e);
/*  63 */     ☃.a("metadata", this.f);
/*  64 */     ☃.b("posX", this.g.o());
/*  65 */     ☃.b("posY", this.g.p());
/*  66 */     ☃.b("posZ", this.g.q());
/*  67 */     ☃.b("sizeX", this.h.o());
/*  68 */     ☃.b("sizeY", this.h.p());
/*  69 */     ☃.b("sizeZ", this.h.q());
/*  70 */     ☃.a("rotation", this.j.toString());
/*  71 */     ☃.a("mirror", this.i.toString());
/*  72 */     ☃.a("mode", this.k.toString());
/*  73 */     ☃.a("ignoreEntities", this.l);
/*  74 */     ☃.a("powered", this.m);
/*  75 */     ☃.a("showair", this.n);
/*  76 */     ☃.a("showboundingbox", this.o);
/*  77 */     ☃.a("integrity", this.p);
/*  78 */     ☃.a("seed", this.q);
/*  79 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  84 */     super.b(☃);
/*  85 */     a(☃.l("name"));
/*  86 */     this.e = ☃.l("author");
/*  87 */     this.f = ☃.l("metadata");
/*  88 */     int i = xq.a(☃.h("posX"), -32, 32);
/*  89 */     int j = xq.a(☃.h("posY"), -32, 32);
/*  90 */     int k = xq.a(☃.h("posZ"), -32, 32);
/*  91 */     this.g = new el(i, j, k);
/*  92 */     int m = xq.a(☃.h("sizeX"), 0, 32);
/*  93 */     int n = xq.a(☃.h("sizeY"), 0, 32);
/*  94 */     int i1 = xq.a(☃.h("sizeZ"), 0, 32);
/*  95 */     this.h = new el(m, n, i1);
/*     */     try {
/*  97 */       this.j = bhb.valueOf(☃.l("rotation"));
/*  98 */     } catch (IllegalArgumentException illegalArgumentException) {
/*  99 */       this.j = bhb.a;
/*     */     } 
/*     */     try {
/* 102 */       this.i = bfz.valueOf(☃.l("mirror"));
/* 103 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 104 */       this.i = bfz.a;
/*     */     } 
/*     */     try {
/* 107 */       this.k = bmr.valueOf(☃.l("mode"));
/* 108 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 109 */       this.k = bmr.d;
/*     */     } 
/* 111 */     this.l = ☃.q("ignoreEntities");
/* 112 */     this.m = ☃.q("powered");
/* 113 */     this.n = ☃.q("showair");
/* 114 */     this.o = ☃.q("showboundingbox");
/* 115 */     if (☃.e("integrity")) {
/* 116 */       this.p = ☃.j("integrity");
/*     */     } else {
/* 118 */       this.p = 1.0F;
/*     */     } 
/* 120 */     this.q = ☃.i("seed");
/* 121 */     J();
/*     */   }
/*     */   
/*     */   private void J() {
/* 125 */     if (this.c_ == null) {
/*     */       return;
/*     */     }
/* 128 */     el ☃ = v();
/* 129 */     blc blc = this.c_.a_(☃);
/* 130 */     if (blc.c() == bct.kz) {
/* 131 */       this.c_.a(☃, blc.a(bid.a, this.k), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/* 138 */     return new ji(this.d_, 7, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/* 143 */     return a(new gy());
/*     */   }
/*     */   
/*     */   public boolean a(aog ☃) {
/* 147 */     if (!☃.dK()) {
/* 148 */       return false;
/*     */     }
/* 150 */     if ((☃.bJ()).B) {
/* 151 */       ☃.a(this);
/*     */     }
/* 153 */     return true;
/*     */   }
/*     */   
/*     */   public String c() {
/* 157 */     return (this.a == null) ? "" : this.a.toString();
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 161 */     return (this.a != null);
/*     */   }
/*     */   
/*     */   public void a(@Nullable String ☃) {
/* 165 */     a(xw.b(☃) ? null : pc.a(☃));
/*     */   }
/*     */   
/*     */   public void a(@Nullable pc ☃) {
/* 169 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(afa ☃) {
/* 173 */     this.e = ☃.N_().getString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(el ☃) {
/* 181 */     this.g = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(el ☃) {
/* 189 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bfz ☃) {
/* 197 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bhb ☃) {
/* 205 */     this.j = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(String ☃) {
/* 213 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public bmr k() {
/* 217 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(bmr ☃) {
/* 221 */     this.k = ☃;
/* 222 */     blc blc = this.c_.a_(v());
/* 223 */     if (blc.c() == bct.kz) {
/* 224 */       this.c_.a(v(), blc.a(bid.a, ☃), 2);
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
/*     */   public void a(boolean ☃) {
/* 250 */     this.l = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 258 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 266 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 270 */     if (this.k != bmr.a) {
/* 271 */       return false;
/*     */     }
/* 273 */     el ☃ = v();
/* 274 */     int i = 80;
/* 275 */     el el1 = new el(☃.o() - 80, 0, ☃.q() - 80);
/* 276 */     el el2 = new el(☃.o() + 80, 255, ☃.q() + 80);
/*     */     
/* 278 */     List<bkf> list1 = a(el1, el2);
/* 279 */     List<bkf> list2 = a(list1);
/* 280 */     if (list2.size() < 1) {
/* 281 */       return false;
/*     */     }
/*     */     
/* 284 */     bwf bwf = a(☃, list2);
/* 285 */     if (bwf.d - bwf.a > 1 && bwf.e - bwf.b > 1 && bwf.f - bwf.c > 1) {
/* 286 */       this.g = new el(bwf.a - ☃.o() + 1, bwf.b - ☃.p() + 1, bwf.c - ☃.q() + 1);
/* 287 */       this.h = new el(bwf.d - bwf.a - 1, bwf.e - bwf.b - 1, bwf.f - bwf.c - 1);
/* 288 */       g();
/* 289 */       blc blc = this.c_.a_(☃);
/* 290 */       this.c_.a(☃, blc, blc, 3);
/* 291 */       return true;
/*     */     } 
/* 293 */     return false;
/*     */   }
/*     */   
/*     */   private List<bkf> a(List<bkf> ☃) {
/* 297 */     Predicate<bkf> predicate = ☃ -> (☃.k == bmr.c && Objects.equals(this.a, ☃.a));
/* 298 */     return (List<bkf>)☃.stream().filter(predicate).collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   private List<bkf> a(el ☃, el el1) {
/* 302 */     List<bkf> list = Lists.newArrayList();
/* 303 */     for (el.a a : el.b(☃, el1)) {
/* 304 */       blc blc = this.c_.a_(a);
/* 305 */       if (blc.c() != bct.kz) {
/*     */         continue;
/*     */       }
/* 308 */       bji bji1 = this.c_.f(a);
/* 309 */       if (bji1 != null && bji1 instanceof bkf) {
/* 310 */         list.add((bkf)bji1);
/*     */       }
/*     */     } 
/* 313 */     return list;
/*     */   }
/*     */   
/*     */   private bwf a(el ☃, List<bkf> list) {
/*     */     bwf bwf;
/* 318 */     if (list.size() > 1) {
/* 319 */       el el1 = ((bkf)list.get(0)).v();
/* 320 */       bwf = new bwf(el1, el1);
/*     */     } else {
/* 322 */       bwf = new bwf(☃, ☃);
/*     */     } 
/*     */     
/* 325 */     for (bkf bkf1 : list) {
/* 326 */       el el1 = bkf1.v();
/* 327 */       if (el1.o() < bwf.a) {
/* 328 */         bwf.a = el1.o();
/* 329 */       } else if (el1.o() > bwf.d) {
/* 330 */         bwf.d = el1.o();
/*     */       } 
/* 332 */       if (el1.p() < bwf.b) {
/* 333 */         bwf.b = el1.p();
/* 334 */       } else if (el1.p() > bwf.e) {
/* 335 */         bwf.e = el1.p();
/*     */       } 
/* 337 */       if (el1.q() < bwf.c) {
/* 338 */         bwf.c = el1.q(); continue;
/* 339 */       }  if (el1.q() > bwf.f) {
/* 340 */         bwf.f = el1.q();
/*     */       }
/*     */     } 
/* 343 */     return bwf;
/*     */   }
/*     */   
/*     */   public boolean q() {
/* 347 */     return b(true);
/*     */   }
/*     */   public boolean b(boolean ☃) {
/*     */     bxp bxp;
/* 351 */     if (this.k != bmr.a || this.c_.B || this.a == null) {
/* 352 */       return false;
/*     */     }
/* 354 */     el el1 = v().a(this.g);
/*     */     
/* 356 */     td td = (td)this.c_;
/* 357 */     bxm bxm = td.D();
/*     */     
/*     */     try {
/* 360 */       bxp = bxm.a(this.a);
/* 361 */     } catch (i i) {
/* 362 */       return false;
/*     */     } 
/*     */     
/* 365 */     bxp.a(this.c_, el1, this.h, !this.l, bct.io);
/* 366 */     bxp.a(this.e);
/* 367 */     if (☃) {
/*     */       try {
/* 369 */         return bxm.c(this.a);
/* 370 */       } catch (i i) {
/* 371 */         return false;
/*     */       } 
/*     */     }
/* 374 */     return true;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 378 */     return c(true);
/*     */   }
/*     */   public boolean c(boolean ☃) {
/*     */     bxp bxp;
/* 382 */     if (this.k != bmr.b || this.c_.B || this.a == null) {
/* 383 */       return false;
/*     */     }
/* 385 */     el el1 = v();
/* 386 */     el el2 = el1.a(this.g);
/*     */     
/* 388 */     td td = (td)this.c_;
/* 389 */     bxm bxm = td.D();
/*     */     
/*     */     try {
/* 392 */       bxp = bxm.b(this.a);
/* 393 */     } catch (i i) {
/* 394 */       return false;
/*     */     } 
/*     */     
/* 397 */     if (bxp == null) {
/* 398 */       return false;
/*     */     }
/*     */     
/* 401 */     if (!xw.b(bxp.b())) {
/* 402 */       this.e = bxp.b();
/*     */     }
/*     */     
/* 405 */     el el3 = bxp.a();
/* 406 */     boolean bool = this.h.equals(el3);
/*     */     
/* 408 */     if (!bool) {
/* 409 */       this.h = el3;
/* 410 */       g();
/* 411 */       blc blc = this.c_.a_(el1);
/* 412 */       this.c_.a(el1, blc, blc, 3);
/*     */     } 
/*     */     
/* 415 */     if (!☃ || bool) {
/* 416 */       bxn bxn = (new bxn()).a(this.i).a(this.j).a(this.l).a((axm)null).a((bcs)null).c(false);
/* 417 */       if (this.p < 1.0F) {
/* 418 */         bxn.a(xq.a(this.p, 0.0F, 1.0F)).a(Long.valueOf(this.q));
/*     */       }
/* 420 */       bxp.a(this.c_, el2, bxn);
/* 421 */       return true;
/*     */     } 
/* 423 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void s() {
/* 428 */     if (this.a == null) {
/*     */       return;
/*     */     }
/* 431 */     td ☃ = (td)this.c_;
/* 432 */     bxm bxm = ☃.D();
/* 433 */     bxm.d(this.a);
/*     */   }
/*     */   
/*     */   public boolean D() {
/* 437 */     if (this.k != bmr.b || this.c_.B || this.a == null) {
/* 438 */       return false;
/*     */     }
/* 440 */     td ☃ = (td)this.c_;
/* 441 */     bxm bxm = ☃.D();
/*     */     try {
/* 443 */       return (bxm.b(this.a) != null);
/* 444 */     } catch (i i) {
/* 445 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean E() {
/* 450 */     return this.m;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 454 */     this.m = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e(boolean ☃) {
/* 462 */     this.n = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f(boolean ☃) {
/* 470 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum a
/*     */   {
/* 478 */     a,
/* 479 */     b,
/* 480 */     c,
/* 481 */     d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */