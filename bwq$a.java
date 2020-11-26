/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends bwq.c
/*     */ {
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private int e;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   protected void a(gy ☃) {
/* 278 */     super.a(☃);
/* 279 */     ☃.a("hr", this.b);
/* 280 */     ☃.a("sc", this.c);
/* 281 */     ☃.a("hps", this.d);
/* 282 */     ☃.b("Num", this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/* 287 */     super.a(☃, bxm1);
/* 288 */     this.b = ☃.q("hr");
/* 289 */     this.c = ☃.q("sc");
/* 290 */     this.d = ☃.q("hps");
/* 291 */     this.e = ☃.h("Num");
/*     */   }
/*     */   
/*     */   public a(int ☃, Random random, bwf bwf1, eq eq1, bru.b b1) {
/* 295 */     super(☃, b1);
/* 296 */     a(eq1);
/* 297 */     this.n = bwf1;
/* 298 */     this.b = (random.nextInt(3) == 0);
/* 299 */     this.c = (!this.b && random.nextInt(23) == 0);
/*     */     
/* 301 */     if (f().k() == eq.a.c) {
/* 302 */       this.e = bwf1.e() / 5;
/*     */     } else {
/* 304 */       this.e = bwf1.c() / 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static bwf a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1) {
/* 309 */     bwf bwf = new bwf(i, j, k, i, j + 3 - 1, k);
/*     */     
/* 311 */     int m = random.nextInt(3) + 2;
/* 312 */     while (m > 0) {
/* 313 */       int n = m * 5;
/*     */       
/* 315 */       switch (bwq.null.b[eq1.ordinal()]) {
/*     */         
/*     */         default:
/* 318 */           bwf.d = i + 3 - 1;
/* 319 */           bwf.c = k - n - 1;
/*     */           break;
/*     */         case 2:
/* 322 */           bwf.d = i + 3 - 1;
/* 323 */           bwf.f = k + n - 1;
/*     */           break;
/*     */         case 3:
/* 326 */           bwf.a = i - n - 1;
/* 327 */           bwf.f = k + 3 - 1;
/*     */           break;
/*     */         case 4:
/* 330 */           bwf.d = i + n - 1;
/* 331 */           bwf.f = k + 3 - 1;
/*     */           break;
/*     */       } 
/*     */       
/* 335 */       if (bxb.a(☃, bwf) != null) {
/* 336 */         m--;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 342 */     if (m > 0) {
/* 343 */       return bwf;
/*     */     }
/*     */     
/* 346 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bxb ☃, List<bxb> list, Random random) {
/* 351 */     int i = e();
/* 352 */     int j = random.nextInt(4);
/* 353 */     eq eq = f();
/* 354 */     if (eq != null) {
/* 355 */       switch (bwq.null.b[eq.ordinal()]) {
/*     */         
/*     */         default:
/* 358 */           if (j <= 1) {
/* 359 */             bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, eq, i); break;
/* 360 */           }  if (j == 2) {
/* 361 */             bwq.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq.e, i); break;
/*     */           } 
/* 363 */           bwq.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq.f, i);
/*     */           break;
/*     */         
/*     */         case 2:
/* 367 */           if (j <= 1) {
/* 368 */             bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, eq, i); break;
/* 369 */           }  if (j == 2) {
/* 370 */             bwq.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, eq.e, i); break;
/*     */           } 
/* 372 */           bwq.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, eq.f, i);
/*     */           break;
/*     */         
/*     */         case 3:
/* 376 */           if (j <= 1) {
/* 377 */             bwq.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq, i); break;
/* 378 */           }  if (j == 2) {
/* 379 */             bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, eq.c, i); break;
/*     */           } 
/* 381 */           bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, eq.d, i);
/*     */           break;
/*     */         
/*     */         case 4:
/* 385 */           if (j <= 1) {
/* 386 */             bwq.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq, i); break;
/* 387 */           }  if (j == 2) {
/* 388 */             bwq.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.c - 1, eq.c, i); break;
/*     */           } 
/* 390 */           bwq.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.f + 1, eq.d, i);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 397 */     if (i < 8) {
/* 398 */       if (eq == eq.c || eq == eq.d) {
/* 399 */         for (int k = this.n.c + 3; k + 3 <= this.n.f; k += 5) {
/* 400 */           int m = random.nextInt(5);
/* 401 */           if (m == 0) {
/* 402 */             bwq.a(☃, list, random, this.n.a - 1, this.n.b, k, eq.e, i + 1);
/* 403 */           } else if (m == 1) {
/* 404 */             bwq.a(☃, list, random, this.n.d + 1, this.n.b, k, eq.f, i + 1);
/*     */           } 
/*     */         } 
/*     */       } else {
/* 408 */         for (int k = this.n.a + 3; k + 3 <= this.n.d; k += 5) {
/* 409 */           int m = random.nextInt(5);
/* 410 */           if (m == 0) {
/* 411 */             bwq.a(☃, list, random, k, this.n.b, this.n.c - 1, eq.c, i + 1);
/* 412 */           } else if (m == 1) {
/* 413 */             bwq.a(☃, list, random, k, this.n.b, this.n.f + 1, eq.d, i + 1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃, bwf bwf1, Random random, int i, int j, int k, pc pc1) {
/* 422 */     el el = new el(a(i, k), d(j), b(i, k));
/* 423 */     if (bwf1.b(el) && 
/* 424 */       ☃.a_(el).f() && !☃.a_(el.b()).f()) {
/* 425 */       blc blc = bct.cA.p().a(bgr.c, random.nextBoolean() ? bmn.a : bmn.b);
/* 426 */       a(☃, blc, i, j, k, bwf1);
/* 427 */       apl apl = new apl(☃.f(), (el.o() + 0.5F), (el.p() + 0.5F), (el.q() + 0.5F));
/* 428 */       apl.a(pc1, random.nextLong());
/* 429 */       ☃.a(apl);
/* 430 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 434 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 439 */     if (a(☃, bwf1)) {
/* 440 */       return false;
/*     */     }
/*     */     
/* 443 */     int i = 0;
/* 444 */     int j = 2;
/* 445 */     int k = 0;
/* 446 */     int m = 2;
/* 447 */     int n = this.e * 5 - 1;
/*     */     
/* 449 */     blc blc = ae_();
/*     */ 
/*     */     
/* 452 */     a(☃, bwf1, 0, 0, 0, 2, 1, n, m, m, false);
/* 453 */     a(☃, bwf1, random, 0.8F, 0, 2, 0, 2, 2, n, m, m, false, false);
/*     */     
/* 455 */     if (this.c) {
/* 456 */       a(☃, bwf1, random, 0.6F, 0, 0, 0, 2, 1, n, bct.aQ.p(), m, false, true);
/*     */     }
/*     */     
/*     */     int i1;
/* 460 */     for (i1 = 0; i1 < this.e; i1++) {
/* 461 */       int i2 = 2 + i1 * 5;
/*     */       
/* 463 */       a(☃, bwf1, 0, 0, i2, 2, 2, random);
/*     */       
/* 465 */       a(☃, bwf1, random, 0.1F, 0, 2, i2 - 1);
/* 466 */       a(☃, bwf1, random, 0.1F, 2, 2, i2 - 1);
/* 467 */       a(☃, bwf1, random, 0.1F, 0, 2, i2 + 1);
/* 468 */       a(☃, bwf1, random, 0.1F, 2, 2, i2 + 1);
/* 469 */       a(☃, bwf1, random, 0.05F, 0, 2, i2 - 2);
/* 470 */       a(☃, bwf1, random, 0.05F, 2, 2, i2 - 2);
/* 471 */       a(☃, bwf1, random, 0.05F, 0, 2, i2 + 2);
/* 472 */       a(☃, bwf1, random, 0.05F, 2, 2, i2 + 2);
/*     */       
/* 474 */       if (random.nextInt(100) == 0) {
/* 475 */         a(☃, bwf1, random, 2, 0, i2 - 1, ccl.f);
/*     */       }
/* 477 */       if (random.nextInt(100) == 0) {
/* 478 */         a(☃, bwf1, random, 0, 0, i2 + 1, ccl.f);
/*     */       }
/* 480 */       if (this.c && !this.d) {
/* 481 */         int i3 = d(0);
/* 482 */         int i4 = i2 - 1 + random.nextInt(3);
/* 483 */         int i5 = a(1, i4);
/* 484 */         int i6 = b(1, i4);
/* 485 */         el el = new el(i5, i3, i6);
/*     */         
/* 487 */         if (bwf1.b(el) && a(☃, 1, 0, i4, bwf1)) {
/* 488 */           this.d = true;
/* 489 */           ☃.a(el, bct.ci.p(), 2);
/*     */           
/* 491 */           bji bji = ☃.f(el);
/* 492 */           if (bji instanceof bke) {
/* 493 */             ((bke)bji).c().a(aev.g);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 500 */     for (i1 = 0; i1 <= 2; i1++) {
/* 501 */       for (int i2 = 0; i2 <= n; i2++) {
/* 502 */         int i3 = -1;
/* 503 */         blc blc1 = a(☃, i1, -1, i2, bwf1);
/* 504 */         if (blc1.f() && a(☃, i1, -1, i2, bwf1)) {
/* 505 */           int i4 = -1;
/* 506 */           a(☃, blc, i1, -1, i2, bwf1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 511 */     if (this.b) {
/* 512 */       blc blc1 = bct.cA.p().a(bgr.c, bmn.a);
/* 513 */       for (int i2 = 0; i2 <= n; i2++) {
/* 514 */         blc blc2 = a(☃, 1, -1, i2, bwf1);
/* 515 */         if (!blc2.f() && blc2.f(☃, new el(a(1, i2), d(-1), b(1, i2)))) {
/* 516 */           float f = a(☃, 1, 0, i2, bwf1) ? 0.7F : 0.9F;
/* 517 */           a(☃, bwf1, random, f, 1, 0, i2, blc1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 522 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, Random random) {
/* 527 */     if (!a(☃, bwf1, i, n, m, k)) {
/*     */       return;
/*     */     }
/*     */     
/* 531 */     blc blc1 = ae_();
/* 532 */     blc blc2 = b();
/*     */     
/* 534 */     a(☃, bwf1, i, j, k, i, m - 1, k, blc2.a(ber.o, Boolean.valueOf(true)), m, false);
/* 535 */     a(☃, bwf1, n, j, k, n, m - 1, k, blc2.a(ber.b, Boolean.valueOf(true)), m, false);
/* 536 */     if (random.nextInt(4) == 0) {
/* 537 */       a(☃, bwf1, i, m, k, i, m, k, blc1, m, false);
/* 538 */       a(☃, bwf1, n, m, k, n, m, k, blc1, m, false);
/*     */     } else {
/* 540 */       a(☃, bwf1, i, m, k, n, m, k, blc1, m, false);
/* 541 */       a(☃, bwf1, random, 0.05F, i + 1, m, k - 1, bct.cg.p().a(biv.a, eq.c));
/* 542 */       a(☃, bwf1, random, 0.05F, i + 1, m, k + 1, bct.cg.p().a(biv.a, eq.d));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(axz ☃, bwf bwf1, Random random, float f, int i, int j, int k) {
/* 547 */     if (a(☃, i, j, k, bwf1))
/* 548 */       a(☃, bwf1, random, f, i, j, k, bct.aQ.p()); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */