/*     */ import java.io.PrintStream;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pf
/*     */ {
/*  82 */   public static final PrintStream a = System.out;
/*     */   
/*     */   private static boolean b;
/*  85 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*     */   public static boolean a() {
/*  88 */     return b;
/*     */   }
/*     */   
/*     */   static void b() {
/*  92 */     bec.a(atf.h, new pe()
/*     */         {
/*     */           protected aot a(axy ☃, fa fa1, ate ate1) {
/*  95 */             aom aom = new aom(☃, fa1.a(), fa1.b(), fa1.c());
/*  96 */             aom.d = aok.a.b;
/*     */             
/*  98 */             return aom;
/*     */           }
/*     */         });
/* 101 */     bec.a(atf.j, new pe()
/*     */         {
/*     */           protected aot a(axy ☃, fa fa1, ate ate1) {
/* 104 */             aom aom = new aom(☃, fa1.a(), fa1.b(), fa1.c());
/* 105 */             aom.b(ate1);
/* 106 */             aom.d = aok.a.b;
/*     */             
/* 108 */             return aom;
/*     */           }
/*     */         });
/* 111 */     bec.a(atf.i, new pe()
/*     */         {
/*     */           protected aot a(axy ☃, fa fa1, ate ate1) {
/* 114 */             aok aok = new aoy(☃, fa1.a(), fa1.b(), fa1.c());
/* 115 */             aok.d = aok.a.b;
/*     */             
/* 117 */             return aok;
/*     */           }
/*     */         });
/* 120 */     bec.a(atf.aW, new pe()
/*     */         {
/*     */           protected aot a(axy ☃, fa fa1, ate ate1) {
/* 123 */             return new apa(☃, fa1.a(), fa1.b(), fa1.c());
/*     */           }
/*     */         });
/* 126 */     bec.a(atf.aC, new pe()
/*     */         {
/*     */           protected aot a(axy ☃, fa fa1, ate ate1) {
/* 129 */             return new aox(☃, fa1.a(), fa1.b(), fa1.c());
/*     */           }
/*     */         });
/* 132 */     bec.a(atf.dw, new pe()
/*     */         {
/*     */           protected aot a(axy ☃, fa fa1, ate ate1) {
/* 135 */             return new apc(☃, fa1.a(), fa1.b(), fa1.c());
/*     */           }
/*     */ 
/*     */           
/*     */           protected float a() {
/* 140 */             return super.a() * 0.5F;
/*     */           }
/*     */ 
/*     */           
/*     */           protected float b() {
/* 145 */             return super.b() * 1.25F;
/*     */           }
/*     */         });
/*     */     
/* 149 */     bec.a(atf.co, new es()
/*     */         {
/*     */           public ate dispense(em ☃, ate ate1) {
/* 152 */             return (new pe(this, ate1)
/*     */               {
/*     */                 protected aot a(axy ☃, fa fa1, ate ate1) {
/* 155 */                   return new apd(☃, fa1.a(), fa1.b(), fa1.c(), this.a.i());
/*     */                 }
/*     */ 
/*     */                 
/*     */                 protected float a() {
/* 160 */                   return super.a() * 0.5F;
/*     */                 }
/*     */ 
/*     */                 
/*     */                 protected float b() {
/* 165 */                   return super.b() * 1.25F;
/*     */                 }
/* 167 */               }).dispense(☃, ate1);
/*     */           }
/*     */         });
/*     */     
/* 171 */     bec.a(atf.cp, new es()
/*     */         {
/*     */           public ate dispense(em ☃, ate ate1) {
/* 174 */             return (new pe(this, ate1)
/*     */               {
/*     */                 protected aot a(axy ☃, fa fa1, ate ate1) {
/* 177 */                   return new apd(☃, fa1.a(), fa1.b(), fa1.c(), this.a.i());
/*     */                 }
/*     */ 
/*     */                 
/*     */                 protected float a() {
/* 182 */                   return super.a() * 0.5F;
/*     */                 }
/*     */ 
/*     */                 
/*     */                 protected float b() {
/* 187 */                   return super.b() * 1.25F;
/*     */                 }
/* 189 */               }).dispense(☃, ate1);
/*     */           }
/*     */         });
/*     */     
/* 193 */     eo ☃ = new eo()
/*     */       {
/*     */         public ate a(em ☃, ate ate1) {
/* 196 */           eq eq = (eq)☃.e().c(bec.a);
/*     */           
/* 198 */           aev<?> aev = ((auc)ate1.b()).b(ate1.n());
/* 199 */           if (aev != null) {
/* 200 */             aev.a(☃.h(), ate1, null, ☃.d().a(eq), (eq != eq.b), false);
/*     */           }
/* 202 */           ate1.g(1);
/* 203 */           return ate1;
/*     */         }
/*     */       };
/*     */     
/* 207 */     for (auc auc : auc.d()) {
/* 208 */       bec.a(auc, ☃);
/*     */     }
/*     */     
/* 211 */     bec.a(atf.dR, new eo()
/*     */         {
/*     */           public ate a(em ☃, ate ate1) {
/* 214 */             eq eq = (eq)☃.e().c(bec.a);
/*     */             
/* 216 */             double d1 = ☃.a() + eq.g();
/* 217 */             double d2 = (☃.d().p() + 0.2F);
/* 218 */             double d3 = ☃.c() + eq.i();
/*     */             
/* 220 */             aoq aoq = new aoq(☃.h(), d1, d2, d3, ate1);
/* 221 */             ☃.h().a(aoq);
/*     */             
/* 223 */             ate1.g(1);
/* 224 */             return ate1;
/*     */           }
/*     */ 
/*     */           
/*     */           protected void a(em ☃) {
/* 229 */             ☃.h().b(1004, ☃.d(), 0);
/*     */           }
/*     */         });
/*     */     
/* 233 */     bec.a(atf.dx, new eo()
/*     */         {
/*     */           public ate a(em ☃, ate ate1) {
/* 236 */             eq eq = (eq)☃.e().c(bec.a);
/*     */             
/* 238 */             fa fa = bec.a(☃);
/* 239 */             double d1 = fa.a() + (eq.g() * 0.3F);
/* 240 */             double d2 = fa.b() + (eq.h() * 0.3F);
/* 241 */             double d3 = fa.c() + (eq.i() * 0.3F);
/*     */             
/* 243 */             axy axy = ☃.h();
/* 244 */             Random random = axy.s;
/*     */             
/* 246 */             double d4 = random.nextGaussian() * 0.05D + eq.g();
/* 247 */             double d5 = random.nextGaussian() * 0.05D + eq.h();
/* 248 */             double d6 = random.nextGaussian() * 0.05D + eq.i();
/*     */             
/* 250 */             axy.a(new aow(axy, d1, d2, d3, d4, d5, d6));
/*     */             
/* 252 */             ate1.g(1);
/* 253 */             return ate1;
/*     */           }
/*     */ 
/*     */           
/*     */           protected void a(em ☃) {
/* 258 */             ☃.h().b(1018, ☃.d(), 0);
/*     */           }
/*     */         });
/*     */     
/* 262 */     bec.a(atf.aD, new a(apj.b.a));
/* 263 */     bec.a(atf.aE, new a(apj.b.b));
/* 264 */     bec.a(atf.aF, new a(apj.b.c));
/* 265 */     bec.a(atf.aG, new a(apj.b.d));
/* 266 */     bec.a(atf.aI, new a(apj.b.f));
/* 267 */     bec.a(atf.aH, new a(apj.b.e));
/*     */     
/* 269 */     es es = new eo() {
/* 270 */         private final eo a = new eo();
/*     */ 
/*     */         
/*     */         public ate a(em ☃, ate ate1) {
/* 274 */           arr arr = (arr)ate1.b();
/* 275 */           el el = ☃.d().a((eq)☃.e().c(bec.a));
/*     */           
/* 277 */           axy axy = ☃.h();
/* 278 */           if (arr.a(null, axy, el, null)) {
/* 279 */             arr.a(axy, ate1, el);
/* 280 */             return new ate(atf.aw);
/*     */           } 
/*     */           
/* 283 */           return this.a.dispense(☃, ate1);
/*     */         }
/*     */       };
/* 286 */     bec.a(atf.ay, es);
/* 287 */     bec.a(atf.ax, es);
/* 288 */     bec.a(atf.aM, es);
/* 289 */     bec.a(atf.aN, es);
/* 290 */     bec.a(atf.aL, es);
/* 291 */     bec.a(atf.aO, es);
/*     */     
/* 293 */     bec.a(atf.aw, new eo() {
/* 294 */           private final eo a = new eo();
/*     */           
/*     */           public ate a(em ☃, ate ate1) {
/*     */             ata ata;
/* 298 */             axz axz = ☃.h();
/*     */             
/* 300 */             el el = ☃.d().a((eq)☃.e().c(bec.a));
/*     */             
/* 302 */             blc blc = axz.a_(el);
/* 303 */             bcs bcs = blc.c();
/*     */ 
/*     */ 
/*     */             
/* 307 */             if (bcs instanceof bcz) {
/* 308 */               byv byv = ((bcz)bcs).a(axz, el, blc);
/* 309 */               if (!(byv instanceof byu)) {
/* 310 */                 return super.a(☃, ate1);
/*     */               }
/* 312 */               ata = byv.b();
/*     */             } else {
/* 314 */               return super.a(☃, ate1);
/*     */             } 
/*     */             
/* 317 */             ate1.g(1);
/* 318 */             if (ate1.a())
/* 319 */               return new ate(ata); 
/* 320 */             if (((bjq)☃.<bjq>g()).a(new ate(ata)) < 0) {
/* 321 */               this.a.dispense(☃, new ate(ata));
/*     */             }
/* 323 */             return ate1;
/*     */           }
/*     */         });
/*     */     
/* 327 */     bec.a(atf.e, new c()
/*     */         {
/*     */           protected ate a(em ☃, ate ate1) {
/* 330 */             axy axy = ☃.h();
/*     */             
/* 332 */             this.a = true;
/* 333 */             el el = ☃.d().a((eq)☃.e().c(bec.a));
/* 334 */             if (asu.a(axy, el)) {
/* 335 */               axy.a(el, bct.ch.p());
/*     */             } else {
/* 337 */               bcs bcs = axy.a_(el).c();
/* 338 */               if (bcs instanceof bij) {
/* 339 */                 ((bij)bcs).a(axy, el);
/* 340 */                 axy.g(el);
/*     */               } else {
/* 342 */                 this.a = false;
/*     */               } 
/*     */             } 
/*     */             
/* 346 */             if (this.a && ate1.a(1, axy.s, (tf)null)) {
/* 347 */               ate1.e(0);
/*     */             }
/*     */             
/* 350 */             return ate1;
/*     */           }
/*     */         });
/*     */     
/* 354 */     bec.a(atf.bh, new c()
/*     */         {
/*     */           protected ate a(em ☃, ate ate1) {
/* 357 */             this.a = true;
/* 358 */             axy axy = ☃.h();
/*     */             
/* 360 */             el el = ☃.d().a((eq)☃.e().c(bec.a));
/* 361 */             if (arm.a(ate1, axy, el) || arm.a(ate1, axy, el, null)) {
/* 362 */               if (!axy.B) {
/* 363 */                 axy.b(2005, el, 0);
/*     */               }
/*     */             } else {
/* 366 */               this.a = false;
/*     */             } 
/*     */             
/* 369 */             return ate1;
/*     */           }
/*     */         });
/*     */     
/* 373 */     bec.a(bct.cb, new eo()
/*     */         {
/*     */           protected ate a(em ☃, ate ate1) {
/* 376 */             axy axy = ☃.h();
/* 377 */             el el = ☃.d().a((eq)☃.e().c(bec.a));
/*     */             
/* 379 */             amn amn = new amn(axy, el.o() + 0.5D, el.p(), el.q() + 0.5D, null);
/* 380 */             axy.a(amn);
/* 381 */             axy.a((aog)null, amn.q, amn.r, amn.s, wj.jF, wk.e, 1.0F, 1.0F);
/*     */             
/* 383 */             ate1.g(1);
/* 384 */             return ate1;
/*     */           }
/*     */         });
/*     */     
/* 388 */     c c = new c()
/*     */       {
/*     */         protected ate a(em ☃, ate ate1) {
/* 391 */           this.a = !arb.a(☃, ate1).a();
/*     */           
/* 393 */           return ate1;
/*     */         }
/*     */       };
/* 396 */     bec.a(atf.dL, c);
/* 397 */     bec.a(atf.dM, c);
/* 398 */     bec.a(atf.dN, c);
/* 399 */     bec.a(atf.dI, c);
/* 400 */     bec.a(atf.dK, c);
/* 401 */     bec.a(atf.dJ, new c()
/*     */         {
/*     */           protected ate a(em ☃, ate ate1) {
/* 404 */             axy axy = ☃.h();
/* 405 */             eq eq = (eq)☃.e().c(bec.a);
/* 406 */             el el = ☃.d().a(eq);
/*     */             
/* 408 */             this.a = true;
/* 409 */             if (axy.c(el) && bja.b(axy, el, ate1)) {
/* 410 */               axy.a(el, bct.fe.p().a(bhk.a, Integer.valueOf((eq.k() == eq.a.b) ? 0 : (eq.d().b() * 4))), 3);
/* 411 */               bji bji = axy.f(el);
/* 412 */               if (bji instanceof bkd) {
/* 413 */                 bja.a(axy, el, (bkd)bji);
/*     */               }
/* 415 */               ate1.g(1);
/* 416 */             } else if (arb.a(☃, ate1).a()) {
/* 417 */               this.a = false;
/*     */             } 
/*     */             
/* 420 */             return ate1;
/*     */           }
/*     */         });
/*     */     
/* 424 */     bec.a(bct.di, new c()
/*     */         {
/*     */           protected ate a(em ☃, ate ate1) {
/* 427 */             axy axy = ☃.h();
/* 428 */             el el = ☃.d().a((eq)☃.e().c(bec.a));
/* 429 */             bdf bdf = (bdf)bct.di;
/*     */             
/* 431 */             this.a = true;
/* 432 */             if (axy.c(el) && bdf.a(axy, el)) {
/* 433 */               if (!axy.B) {
/* 434 */                 axy.a(el, bdf.p(), 3);
/*     */               }
/* 436 */               ate1.g(1);
/*     */             } else {
/* 438 */               ate ate2 = arb.a(☃, ate1);
/* 439 */               if (ate2.a()) {
/* 440 */                 this.a = false;
/*     */               }
/*     */             } 
/*     */             
/* 444 */             return ate1;
/*     */           }
/*     */         });
/*     */     
/* 448 */     bec.a(bct.iq.h(), new d());
/* 449 */     for (asc asc : asc.values()) {
/* 450 */       bec.a(bhi.a(asc).h(), new d());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c() {
/* 455 */     if (b) {
/*     */       return;
/*     */     }
/* 458 */     b = true;
/*     */     
/* 460 */     wi.b();
/*     */     
/* 462 */     byv.l();
/*     */     
/* 464 */     bcs.t();
/* 465 */     bet.d();
/*     */     
/* 467 */     aej.m();
/* 468 */     awe.h();
/*     */     
/* 470 */     if (aev.a(aev.aO) == null) {
/* 471 */       throw new IllegalStateException("Failed loading EntityTypes");
/*     */     }
/*     */     
/* 474 */     ata.r();
/*     */     
/* 476 */     aut.b();
/* 477 */     auu.a();
/*     */     
/* 479 */     ayu.t();
/*     */     
/* 481 */     dt.a();
/*     */     
/* 483 */     fl.c();
/*     */     
/* 485 */     b();
/*     */     
/* 487 */     dz.a();
/*     */     
/* 489 */     ayy.a();
/* 490 */     bjj.a();
/* 491 */     bnb.a();
/* 492 */     bod.a();
/* 493 */     amd.a();
/* 494 */     ws.a();
/*     */     
/* 496 */     fc.e();
/*     */     
/* 498 */     if (j.b) {
/* 499 */       a("block", fc.g, bcs::m);
/* 500 */       a("biome", fc.m, ayu::k);
/* 501 */       a("enchantment", fc.q, awe::g);
/* 502 */       a("item", fc.s, ata::a);
/* 503 */       a("effect", fc.t, aej::c);
/* 504 */       a("entity", fc.r, aev::d);
/*     */     } 
/*     */     
/* 507 */     d();
/*     */   }
/*     */   
/*     */   private static <T> void a(String ☃, fc<T> fc1, Function<T, String> function) {
/* 511 */     gt gt = gt.a();
/* 512 */     fc1.iterator().forEachRemaining(object -> {
/*     */           String str1 = ☃.apply(object);
/*     */           if (!gt1.b(str1)) {
/*     */             c.warn("Missing translation for {}: {} (key: '{}')", str, fc1.b(object), str1);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void d() {
/* 521 */     if (c.isDebugEnabled()) {
/* 522 */       System.setErr(new pj("STDERR", System.err));
/* 523 */       System.setOut(new pj("STDOUT", a));
/*     */     } else {
/* 525 */       System.setErr(new pl("STDERR", System.err));
/* 526 */       System.setOut(new pl("STDOUT", a));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends eo
/*     */   {
/* 535 */     private final eo a = new eo();
/*     */     private final apj.b b;
/*     */     
/*     */     public a(apj.b ☃) {
/* 539 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     public ate a(em ☃, ate ate1) {
/*     */       double d4;
/* 544 */       eq eq = (eq)☃.e().c(bec.a);
/* 545 */       axy axy = ☃.h();
/*     */ 
/*     */       
/* 548 */       double d1 = ☃.a() + (eq.g() * 1.125F);
/* 549 */       double d2 = ☃.b() + (eq.h() * 1.125F);
/* 550 */       double d3 = ☃.c() + (eq.i() * 1.125F);
/*     */       
/* 552 */       el el = ☃.d().a(eq);
/*     */ 
/*     */       
/* 555 */       if (axy.b(el).a(ww.a)) {
/* 556 */         d4 = 1.0D;
/* 557 */       } else if (axy.a_(el).f() && axy.b(el.b()).a(ww.a)) {
/* 558 */         d4 = 0.0D;
/*     */       } else {
/* 560 */         return this.a.dispense(☃, ate1);
/*     */       } 
/*     */       
/* 563 */       apj apj = new apj(axy, d1, d2 + d4, d3);
/* 564 */       apj.a(this.b);
/* 565 */       apj.w = eq.l();
/* 566 */       axy.a(apj);
/*     */       
/* 568 */       ate1.g(1);
/* 569 */       return ate1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(em ☃) {
/* 574 */       ☃.h().b(1000, ☃.d(), 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public static abstract class c
/*     */     extends eo {
/*     */     protected boolean a = true;
/*     */     
/*     */     protected void a(em ☃) {
/* 583 */       ☃.h().b(this.a ? 1000 : 1001, ☃.d(), 0);
/*     */     } }
/*     */   
/*     */   static class d extends c {
/*     */     private d() {}
/*     */     
/*     */     protected ate a(em ☃, ate ate1) {
/* 590 */       this.a = false;
/*     */       
/* 592 */       ata ata = ate1.b();
/* 593 */       if (ata instanceof arj) {
/* 594 */         eq eq1 = (eq)☃.e().c(bec.a);
/* 595 */         el el = ☃.d().a(eq1);
/*     */         
/* 597 */         eq eq2 = ☃.h().c(el.b()) ? eq1 : eq.b;
/* 598 */         this.a = (((arj)ata).a(new pf.b(☃.h(), el, eq1, ate1, eq2)) == adm.a);
/*     */         
/* 600 */         if (this.a) {
/* 601 */           ate1.g(1);
/*     */         }
/*     */       } 
/* 604 */       return ate1;
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends ark {
/*     */     private final eq j;
/*     */     
/*     */     public b(axy ☃, el el1, eq eq1, ate ate1, eq eq2) {
/* 612 */       super(☃, (aog)null, ate1, el1, eq2, 0.5F, 0.0F, 0.5F);
/*     */       
/* 614 */       this.j = eq1;
/*     */     }
/*     */ 
/*     */     
/*     */     public el a() {
/* 619 */       return this.i;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 624 */       return this.g.a_(this.i).a(this);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c() {
/* 629 */       return b();
/*     */     }
/*     */ 
/*     */     
/*     */     public eq d() {
/* 634 */       return eq.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public eq[] e() {
/* 639 */       switch (pf.null.a[this.j.ordinal()])
/*     */       
/*     */       { default:
/* 642 */           return new eq[] { eq.a, eq.c, eq.f, eq.d, eq.e, eq.b };
/*     */         case 2:
/* 644 */           return new eq[] { eq.a, eq.b, eq.c, eq.f, eq.d, eq.e };
/*     */         case 3:
/* 646 */           return new eq[] { eq.a, eq.c, eq.f, eq.e, eq.b, eq.d };
/*     */         case 4:
/* 648 */           return new eq[] { eq.a, eq.d, eq.f, eq.e, eq.b, eq.c };
/*     */         case 5:
/* 650 */           return new eq[] { eq.a, eq.e, eq.d, eq.b, eq.c, eq.f };
/*     */         case 6:
/* 652 */           break; }  return new eq[] { eq.a, eq.f, eq.d, eq.b, eq.c, eq.e };
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public eq f() {
/* 658 */       return (this.j.k() == eq.a.b) ? eq.c : this.j;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean g() {
/* 663 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public float h() {
/* 668 */       return (this.j.b() * 90);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\pf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */