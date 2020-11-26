/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class bwq
/*     */ {
/*     */   public static void a() {
/*  40 */     bwy.a((Class)a.class, "MSCorridor");
/*  41 */     bwy.a((Class)b.class, "MSCrossing");
/*  42 */     bwy.a((Class)d.class, "MSRoom");
/*  43 */     bwy.a((Class)e.class, "MSStairs");
/*     */   }
/*     */   
/*     */   static abstract class c
/*     */     extends bxb {
/*     */     protected bru.b a;
/*     */     
/*     */     public c() {}
/*     */     
/*     */     public c(int ☃, bru.b b1) {
/*  53 */       super(☃);
/*  54 */       this.a = b1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃) {
/*  59 */       ☃.b("MST", this.a.ordinal());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/*  64 */       this.a = bru.b.a(☃.h("MST"));
/*     */     }
/*     */     
/*     */     protected blc ae_() {
/*  68 */       switch (bwq.null.a[this.a.ordinal()])
/*     */       
/*     */       { default:
/*  71 */           return bct.n.p();
/*     */         case 2:
/*  73 */           break; }  return bct.s.p();
/*     */     }
/*     */ 
/*     */     
/*     */     protected blc b() {
/*  78 */       switch (bwq.null.a[this.a.ordinal()])
/*     */       
/*     */       { default:
/*  81 */           return bct.cX.p();
/*     */         case 2:
/*  83 */           break; }  return bct.db.p();
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(axk ☃, bwf bwf1, int i, int j, int k, int m) {
/*  88 */       for (int n = i; n <= j; n++) {
/*  89 */         if (a(☃, n, k + 1, m, bwf1).f()) {
/*  90 */           return false;
/*     */         }
/*     */       } 
/*  93 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   private static c a(List<bxb> ☃, Random random, int i, int j, int k, @Nullable eq eq1, int m, bru.b b1) {
/*  98 */     int n = random.nextInt(100);
/*  99 */     if (n >= 80) {
/* 100 */       bwf bwf = b.a(☃, random, i, j, k, eq1);
/* 101 */       if (bwf != null) {
/* 102 */         return new b(m, random, bwf, eq1, b1);
/*     */       }
/* 104 */     } else if (n >= 70) {
/* 105 */       bwf bwf = e.a(☃, random, i, j, k, eq1);
/* 106 */       if (bwf != null) {
/* 107 */         return new e(m, random, bwf, eq1, b1);
/*     */       }
/*     */     } else {
/* 110 */       bwf bwf = a.a(☃, random, i, j, k, eq1);
/* 111 */       if (bwf != null) {
/* 112 */         return new a(m, random, bwf, eq1, b1);
/*     */       }
/*     */     } 
/*     */     
/* 116 */     return null;
/*     */   }
/*     */   
/*     */   private static c b(bxb ☃, List<bxb> list, Random random, int i, int j, int k, eq eq1, int m) {
/* 120 */     if (m > 8) {
/* 121 */       return null;
/*     */     }
/* 123 */     if (Math.abs(i - (☃.d()).a) > 80 || Math.abs(k - (☃.d()).c) > 80) {
/* 124 */       return null;
/*     */     }
/*     */     
/* 127 */     bru.b b = ((c)☃).a;
/* 128 */     c c = a(list, random, i, j, k, eq1, m + 1, b);
/* 129 */     if (c != null) {
/* 130 */       list.add(c);
/* 131 */       c.a(☃, list, random);
/*     */     } 
/* 133 */     return c;
/*     */   }
/*     */   
/*     */   public static class d extends c {
/* 137 */     private final List<bwf> b = Lists.newLinkedList();
/*     */ 
/*     */     
/*     */     public d() {}
/*     */ 
/*     */     
/*     */     public d(int ☃, Random random, int i, int j, bru.b b1) {
/* 144 */       super(☃, b1);
/* 145 */       this.a = b1;
/*     */       
/* 147 */       this.n = new bwf(i, 50, j, i + 7 + random.nextInt(6), 54 + random.nextInt(6), j + 7 + random.nextInt(6));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 152 */       int i = e();
/*     */ 
/*     */ 
/*     */       
/* 156 */       int k = this.n.d() - 3 - 1;
/* 157 */       if (k <= 0) {
/* 158 */         k = 1;
/*     */       }
/*     */ 
/*     */       
/* 162 */       int j = 0;
/* 163 */       while (j < this.n.c()) {
/* 164 */         j += random.nextInt(this.n.c());
/* 165 */         if (j + 3 > this.n.c()) {
/*     */           break;
/*     */         }
/* 168 */         bwq.c c1 = bwq.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.c - 1, eq.c, i);
/* 169 */         if (c1 != null) {
/* 170 */           bwf bwf = c1.d();
/* 171 */           this.b.add(new bwf(bwf.a, bwf.b, this.n.c, bwf.d, bwf.e, this.n.c + 1));
/*     */         } 
/* 173 */         j += 4;
/*     */       } 
/*     */       
/* 176 */       j = 0;
/* 177 */       while (j < this.n.c()) {
/* 178 */         j += random.nextInt(this.n.c());
/* 179 */         if (j + 3 > this.n.c()) {
/*     */           break;
/*     */         }
/* 182 */         bwq.c c1 = bwq.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.f + 1, eq.d, i);
/* 183 */         if (c1 != null) {
/* 184 */           bwf bwf = c1.d();
/* 185 */           this.b.add(new bwf(bwf.a, bwf.b, this.n.f - 1, bwf.d, bwf.e, this.n.f));
/*     */         } 
/* 187 */         j += 4;
/*     */       } 
/*     */       
/* 190 */       j = 0;
/* 191 */       while (j < this.n.e()) {
/* 192 */         j += random.nextInt(this.n.e());
/* 193 */         if (j + 3 > this.n.e()) {
/*     */           break;
/*     */         }
/* 196 */         bwq.c c1 = bwq.a(☃, list, random, this.n.a - 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, eq.e, i);
/* 197 */         if (c1 != null) {
/* 198 */           bwf bwf = c1.d();
/* 199 */           this.b.add(new bwf(this.n.a, bwf.b, bwf.c, this.n.a + 1, bwf.e, bwf.f));
/*     */         } 
/* 201 */         j += 4;
/*     */       } 
/*     */       
/* 204 */       j = 0;
/* 205 */       while (j < this.n.e()) {
/* 206 */         j += random.nextInt(this.n.e());
/* 207 */         if (j + 3 > this.n.e()) {
/*     */           break;
/*     */         }
/* 210 */         bxb bxb1 = bwq.a(☃, list, random, this.n.d + 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, eq.f, i);
/* 211 */         if (bxb1 != null) {
/* 212 */           bwf bwf = bxb1.d();
/* 213 */           this.b.add(new bwf(this.n.d - 1, bwf.b, bwf.c, this.n.d, bwf.e, bwf.f));
/*     */         } 
/* 215 */         j += 4;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 221 */       if (a(☃, bwf1)) {
/* 222 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 226 */       a(☃, bwf1, this.n.a, this.n.b, this.n.c, this.n.d, this.n.b, this.n.f, bct.j.p(), m, true);
/*     */ 
/*     */       
/* 229 */       a(☃, bwf1, this.n.a, this.n.b + 1, this.n.c, this.n.d, Math.min(this.n.b + 3, this.n.e), this.n.f, m, m, false);
/* 230 */       for (bwf bwf2 : this.b) {
/* 231 */         a(☃, bwf1, bwf2.a, bwf2.e - 2, bwf2.c, bwf2.d, bwf2.e, bwf2.f, m, m, false);
/*     */       }
/* 233 */       a(☃, bwf1, this.n.a, this.n.b + 4, this.n.c, this.n.d, this.n.e, this.n.f, m, false);
/*     */       
/* 235 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i, int j) {
/* 240 */       super.a(☃, i, j);
/* 241 */       for (bwf bwf : this.b) {
/* 242 */         bwf.a(☃, i, j);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃) {
/* 248 */       super.a(☃);
/* 249 */       he he = new he();
/* 250 */       for (bwf bwf : this.b) {
/* 251 */         he.a(bwf.g());
/*     */       }
/* 253 */       ☃.a("Entrances", he);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/* 258 */       super.a(☃, bxm1);
/* 259 */       he he = ☃.d("Entrances", 11);
/* 260 */       for (int i = 0; i < he.size(); i++) {
/* 261 */         this.b.add(new bwf(he.i(i)));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends c
/*     */   {
/*     */     private boolean b;
/*     */     private boolean c;
/*     */     private boolean d;
/*     */     private int e;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     protected void a(gy ☃) {
/* 278 */       super.a(☃);
/* 279 */       ☃.a("hr", this.b);
/* 280 */       ☃.a("sc", this.c);
/* 281 */       ☃.a("hps", this.d);
/* 282 */       ☃.b("Num", this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/* 287 */       super.a(☃, bxm1);
/* 288 */       this.b = ☃.q("hr");
/* 289 */       this.c = ☃.q("sc");
/* 290 */       this.d = ☃.q("hps");
/* 291 */       this.e = ☃.h("Num");
/*     */     }
/*     */     
/*     */     public a(int ☃, Random random, bwf bwf1, eq eq1, bru.b b1) {
/* 295 */       super(☃, b1);
/* 296 */       a(eq1);
/* 297 */       this.n = bwf1;
/* 298 */       this.b = (random.nextInt(3) == 0);
/* 299 */       this.c = (!this.b && random.nextInt(23) == 0);
/*     */       
/* 301 */       if (f().k() == eq.a.c) {
/* 302 */         this.e = bwf1.e() / 5;
/*     */       } else {
/* 304 */         this.e = bwf1.c() / 5;
/*     */       } 
/*     */     }
/*     */     
/*     */     public static bwf a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1) {
/* 309 */       bwf bwf = new bwf(i, j, k, i, j + 3 - 1, k);
/*     */       
/* 311 */       int m = random.nextInt(3) + 2;
/* 312 */       while (m > 0) {
/* 313 */         int n = m * 5;
/*     */         
/* 315 */         switch (bwq.null.b[eq1.ordinal()]) {
/*     */           
/*     */           default:
/* 318 */             bwf.d = i + 3 - 1;
/* 319 */             bwf.c = k - n - 1;
/*     */             break;
/*     */           case 2:
/* 322 */             bwf.d = i + 3 - 1;
/* 323 */             bwf.f = k + n - 1;
/*     */             break;
/*     */           case 3:
/* 326 */             bwf.a = i - n - 1;
/* 327 */             bwf.f = k + 3 - 1;
/*     */             break;
/*     */           case 4:
/* 330 */             bwf.d = i + n - 1;
/* 331 */             bwf.f = k + 3 - 1;
/*     */             break;
/*     */         } 
/*     */         
/* 335 */         if (bxb.a(☃, bwf) != null) {
/* 336 */           m--;
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 342 */       if (m > 0) {
/* 343 */         return bwf;
/*     */       }
/*     */       
/* 346 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 351 */       int i = e();
/* 352 */       int j = random.nextInt(4);
/* 353 */       eq eq = f();
/* 354 */       if (eq != null) {
/* 355 */         switch (bwq.null.b[eq.ordinal()]) {
/*     */           
/*     */           default:
/* 358 */             if (j <= 1) {
/* 359 */               bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, eq, i); break;
/* 360 */             }  if (j == 2) {
/* 361 */               bwq.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq.e, i); break;
/*     */             } 
/* 363 */             bwq.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq.f, i);
/*     */             break;
/*     */           
/*     */           case 2:
/* 367 */             if (j <= 1) {
/* 368 */               bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, eq, i); break;
/* 369 */             }  if (j == 2) {
/* 370 */               bwq.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, eq.e, i); break;
/*     */             } 
/* 372 */             bwq.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, eq.f, i);
/*     */             break;
/*     */           
/*     */           case 3:
/* 376 */             if (j <= 1) {
/* 377 */               bwq.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq, i); break;
/* 378 */             }  if (j == 2) {
/* 379 */               bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, eq.c, i); break;
/*     */             } 
/* 381 */             bwq.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, eq.d, i);
/*     */             break;
/*     */           
/*     */           case 4:
/* 385 */             if (j <= 1) {
/* 386 */               bwq.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, eq, i); break;
/* 387 */             }  if (j == 2) {
/* 388 */               bwq.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.c - 1, eq.c, i); break;
/*     */             } 
/* 390 */             bwq.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.f + 1, eq.d, i);
/*     */             break;
/*     */         } 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 397 */       if (i < 8) {
/* 398 */         if (eq == eq.c || eq == eq.d) {
/* 399 */           for (int k = this.n.c + 3; k + 3 <= this.n.f; k += 5) {
/* 400 */             int m = random.nextInt(5);
/* 401 */             if (m == 0) {
/* 402 */               bwq.a(☃, list, random, this.n.a - 1, this.n.b, k, eq.e, i + 1);
/* 403 */             } else if (m == 1) {
/* 404 */               bwq.a(☃, list, random, this.n.d + 1, this.n.b, k, eq.f, i + 1);
/*     */             } 
/*     */           } 
/*     */         } else {
/* 408 */           for (int k = this.n.a + 3; k + 3 <= this.n.d; k += 5) {
/* 409 */             int m = random.nextInt(5);
/* 410 */             if (m == 0) {
/* 411 */               bwq.a(☃, list, random, k, this.n.b, this.n.c - 1, eq.c, i + 1);
/* 412 */             } else if (m == 1) {
/* 413 */               bwq.a(☃, list, random, k, this.n.b, this.n.f + 1, eq.d, i + 1);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(axz ☃, bwf bwf1, Random random, int i, int j, int k, pc pc1) {
/* 422 */       el el = new el(a(i, k), d(j), b(i, k));
/* 423 */       if (bwf1.b(el) && 
/* 424 */         ☃.a_(el).f() && !☃.a_(el.b()).f()) {
/* 425 */         blc blc = bct.cA.p().a(bgr.c, random.nextBoolean() ? bmn.a : bmn.b);
/* 426 */         a(☃, blc, i, j, k, bwf1);
/* 427 */         apl apl = new apl(☃.f(), (el.o() + 0.5F), (el.p() + 0.5F), (el.q() + 0.5F));
/* 428 */         apl.a(pc1, random.nextLong());
/* 429 */         ☃.a(apl);
/* 430 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 434 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 439 */       if (a(☃, bwf1)) {
/* 440 */         return false;
/*     */       }
/*     */       
/* 443 */       int i = 0;
/* 444 */       int j = 2;
/* 445 */       int k = 0;
/* 446 */       int m = 2;
/* 447 */       int n = this.e * 5 - 1;
/*     */       
/* 449 */       blc blc = ae_();
/*     */ 
/*     */       
/* 452 */       a(☃, bwf1, 0, 0, 0, 2, 1, n, m, m, false);
/* 453 */       a(☃, bwf1, random, 0.8F, 0, 2, 0, 2, 2, n, m, m, false, false);
/*     */       
/* 455 */       if (this.c) {
/* 456 */         a(☃, bwf1, random, 0.6F, 0, 0, 0, 2, 1, n, bct.aQ.p(), m, false, true);
/*     */       }
/*     */       
/*     */       int i1;
/* 460 */       for (i1 = 0; i1 < this.e; i1++) {
/* 461 */         int i2 = 2 + i1 * 5;
/*     */         
/* 463 */         a(☃, bwf1, 0, 0, i2, 2, 2, random);
/*     */         
/* 465 */         a(☃, bwf1, random, 0.1F, 0, 2, i2 - 1);
/* 466 */         a(☃, bwf1, random, 0.1F, 2, 2, i2 - 1);
/* 467 */         a(☃, bwf1, random, 0.1F, 0, 2, i2 + 1);
/* 468 */         a(☃, bwf1, random, 0.1F, 2, 2, i2 + 1);
/* 469 */         a(☃, bwf1, random, 0.05F, 0, 2, i2 - 2);
/* 470 */         a(☃, bwf1, random, 0.05F, 2, 2, i2 - 2);
/* 471 */         a(☃, bwf1, random, 0.05F, 0, 2, i2 + 2);
/* 472 */         a(☃, bwf1, random, 0.05F, 2, 2, i2 + 2);
/*     */         
/* 474 */         if (random.nextInt(100) == 0) {
/* 475 */           a(☃, bwf1, random, 2, 0, i2 - 1, ccl.f);
/*     */         }
/* 477 */         if (random.nextInt(100) == 0) {
/* 478 */           a(☃, bwf1, random, 0, 0, i2 + 1, ccl.f);
/*     */         }
/* 480 */         if (this.c && !this.d) {
/* 481 */           int i3 = d(0);
/* 482 */           int i4 = i2 - 1 + random.nextInt(3);
/* 483 */           int i5 = a(1, i4);
/* 484 */           int i6 = b(1, i4);
/* 485 */           el el = new el(i5, i3, i6);
/*     */           
/* 487 */           if (bwf1.b(el) && a(☃, 1, 0, i4, bwf1)) {
/* 488 */             this.d = true;
/* 489 */             ☃.a(el, bct.ci.p(), 2);
/*     */             
/* 491 */             bji bji = ☃.f(el);
/* 492 */             if (bji instanceof bke) {
/* 493 */               ((bke)bji).c().a(aev.g);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 500 */       for (i1 = 0; i1 <= 2; i1++) {
/* 501 */         for (int i2 = 0; i2 <= n; i2++) {
/* 502 */           int i3 = -1;
/* 503 */           blc blc1 = a(☃, i1, -1, i2, bwf1);
/* 504 */           if (blc1.f() && a(☃, i1, -1, i2, bwf1)) {
/* 505 */             int i4 = -1;
/* 506 */             a(☃, blc, i1, -1, i2, bwf1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 511 */       if (this.b) {
/* 512 */         blc blc1 = bct.cA.p().a(bgr.c, bmn.a);
/* 513 */         for (int i2 = 0; i2 <= n; i2++) {
/* 514 */           blc blc2 = a(☃, 1, -1, i2, bwf1);
/* 515 */           if (!blc2.f() && blc2.f(☃, new el(a(1, i2), d(-1), b(1, i2)))) {
/* 516 */             float f = a(☃, 1, 0, i2, bwf1) ? 0.7F : 0.9F;
/* 517 */             a(☃, bwf1, random, f, 1, 0, i2, blc1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 522 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, Random random) {
/* 527 */       if (!a(☃, bwf1, i, n, m, k)) {
/*     */         return;
/*     */       }
/*     */       
/* 531 */       blc blc1 = ae_();
/* 532 */       blc blc2 = b();
/*     */       
/* 534 */       a(☃, bwf1, i, j, k, i, m - 1, k, blc2.a(ber.o, Boolean.valueOf(true)), m, false);
/* 535 */       a(☃, bwf1, n, j, k, n, m - 1, k, blc2.a(ber.b, Boolean.valueOf(true)), m, false);
/* 536 */       if (random.nextInt(4) == 0) {
/* 537 */         a(☃, bwf1, i, m, k, i, m, k, blc1, m, false);
/* 538 */         a(☃, bwf1, n, m, k, n, m, k, blc1, m, false);
/*     */       } else {
/* 540 */         a(☃, bwf1, i, m, k, n, m, k, blc1, m, false);
/* 541 */         a(☃, bwf1, random, 0.05F, i + 1, m, k - 1, bct.cg.p().a(biv.a, eq.c));
/* 542 */         a(☃, bwf1, random, 0.05F, i + 1, m, k + 1, bct.cg.p().a(biv.a, eq.d));
/*     */       } 
/*     */     }
/*     */     
/*     */     private void a(axz ☃, bwf bwf1, Random random, float f, int i, int j, int k) {
/* 547 */       if (a(☃, i, j, k, bwf1)) {
/* 548 */         a(☃, bwf1, random, f, i, j, k, bct.aQ.p());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class b
/*     */     extends c
/*     */   {
/*     */     private eq b;
/*     */     private boolean c;
/*     */     
/*     */     public b() {}
/*     */     
/*     */     protected void a(gy ☃) {
/* 563 */       super.a(☃);
/* 564 */       ☃.a("tf", this.c);
/* 565 */       ☃.b("D", this.b.b());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/* 570 */       super.a(☃, bxm1);
/* 571 */       this.c = ☃.q("tf");
/* 572 */       this.b = eq.b(☃.h("D"));
/*     */     }
/*     */     
/*     */     public b(int ☃, Random random, bwf bwf1, @Nullable eq eq1, bru.b b1) {
/* 576 */       super(☃, b1);
/*     */       
/* 578 */       this.b = eq1;
/* 579 */       this.n = bwf1;
/* 580 */       this.c = (bwf1.d() > 3);
/*     */     }
/*     */     
/*     */     public static bwf a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1) {
/* 584 */       bwf bwf = new bwf(i, j, k, i, j + 3 - 1, k);
/*     */       
/* 586 */       if (random.nextInt(4) == 0) {
/* 587 */         bwf.e += 4;
/*     */       }
/*     */       
/* 590 */       switch (bwq.null.b[eq1.ordinal()]) {
/*     */         
/*     */         default:
/* 593 */           bwf.a = i - 1;
/* 594 */           bwf.d = i + 3;
/* 595 */           bwf.c = k - 4;
/*     */           break;
/*     */         case 2:
/* 598 */           bwf.a = i - 1;
/* 599 */           bwf.d = i + 3;
/* 600 */           bwf.f = k + 3 + 1;
/*     */           break;
/*     */         case 3:
/* 603 */           bwf.a = i - 4;
/* 604 */           bwf.c = k - 1;
/* 605 */           bwf.f = k + 3;
/*     */           break;
/*     */         case 4:
/* 608 */           bwf.d = i + 3 + 1;
/* 609 */           bwf.c = k - 1;
/* 610 */           bwf.f = k + 3;
/*     */           break;
/*     */       } 
/*     */       
/* 614 */       if (bxb.a(☃, bwf) != null) {
/* 615 */         return null;
/*     */       }
/*     */       
/* 618 */       return bwf;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 623 */       int i = e();
/*     */ 
/*     */       
/* 626 */       switch (bwq.null.b[this.b.ordinal()]) {
/*     */         
/*     */         default:
/* 629 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b, this.n.c - 1, eq.c, i);
/* 630 */           bwq.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c + 1, eq.e, i);
/* 631 */           bwq.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c + 1, eq.f, i);
/*     */           break;
/*     */         case 2:
/* 634 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b, this.n.f + 1, eq.d, i);
/* 635 */           bwq.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c + 1, eq.e, i);
/* 636 */           bwq.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c + 1, eq.f, i);
/*     */           break;
/*     */         case 3:
/* 639 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b, this.n.c - 1, eq.c, i);
/* 640 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b, this.n.f + 1, eq.d, i);
/* 641 */           bwq.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c + 1, eq.e, i);
/*     */           break;
/*     */         case 4:
/* 644 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b, this.n.c - 1, eq.c, i);
/* 645 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b, this.n.f + 1, eq.d, i);
/* 646 */           bwq.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c + 1, eq.f, i);
/*     */           break;
/*     */       } 
/*     */       
/* 650 */       if (this.c) {
/* 651 */         if (random.nextBoolean()) {
/* 652 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b + 3 + 1, this.n.c - 1, eq.c, i);
/*     */         }
/* 654 */         if (random.nextBoolean()) {
/* 655 */           bwq.a(☃, list, random, this.n.a - 1, this.n.b + 3 + 1, this.n.c + 1, eq.e, i);
/*     */         }
/* 657 */         if (random.nextBoolean()) {
/* 658 */           bwq.a(☃, list, random, this.n.d + 1, this.n.b + 3 + 1, this.n.c + 1, eq.f, i);
/*     */         }
/* 660 */         if (random.nextBoolean()) {
/* 661 */           bwq.a(☃, list, random, this.n.a + 1, this.n.b + 3 + 1, this.n.f + 1, eq.d, i);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 668 */       if (a(☃, bwf1)) {
/* 669 */         return false;
/*     */       }
/*     */       
/* 672 */       blc blc = ae_();
/*     */ 
/*     */       
/* 675 */       if (this.c) {
/* 676 */         a(☃, bwf1, this.n.a + 1, this.n.b, this.n.c, this.n.d - 1, this.n.b + 3 - 1, this.n.f, m, m, false);
/* 677 */         a(☃, bwf1, this.n.a, this.n.b, this.n.c + 1, this.n.d, this.n.b + 3 - 1, this.n.f - 1, m, m, false);
/* 678 */         a(☃, bwf1, this.n.a + 1, this.n.e - 2, this.n.c, this.n.d - 1, this.n.e, this.n.f, m, m, false);
/* 679 */         a(☃, bwf1, this.n.a, this.n.e - 2, this.n.c + 1, this.n.d, this.n.e, this.n.f - 1, m, m, false);
/* 680 */         a(☃, bwf1, this.n.a + 1, this.n.b + 3, this.n.c + 1, this.n.d - 1, this.n.b + 3, this.n.f - 1, m, m, false);
/*     */       } else {
/* 682 */         a(☃, bwf1, this.n.a + 1, this.n.b, this.n.c, this.n.d - 1, this.n.e, this.n.f, m, m, false);
/* 683 */         a(☃, bwf1, this.n.a, this.n.b, this.n.c + 1, this.n.d, this.n.e, this.n.f - 1, m, m, false);
/*     */       } 
/*     */ 
/*     */       
/* 687 */       a(☃, bwf1, this.n.a + 1, this.n.b, this.n.c + 1, this.n.e);
/* 688 */       a(☃, bwf1, this.n.a + 1, this.n.b, this.n.f - 1, this.n.e);
/* 689 */       a(☃, bwf1, this.n.d - 1, this.n.b, this.n.c + 1, this.n.e);
/* 690 */       a(☃, bwf1, this.n.d - 1, this.n.b, this.n.f - 1, this.n.e);
/*     */ 
/*     */ 
/*     */       
/* 694 */       for (int i = this.n.a; i <= this.n.d; i++) {
/* 695 */         for (int j = this.n.c; j <= this.n.f; j++) {
/* 696 */           if (a(☃, i, this.n.b - 1, j, bwf1).f() && a(☃, i, this.n.b - 1, j, bwf1)) {
/* 697 */             a(☃, blc, i, this.n.b - 1, j, bwf1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 702 */       return true;
/*     */     }
/*     */     
/*     */     private void a(axz ☃, bwf bwf1, int i, int j, int k, int m) {
/* 706 */       if (!a(☃, i, m + 1, k, bwf1).f()) {
/* 707 */         a(☃, bwf1, i, j, k, i, m, k, ae_(), m, false);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static class e
/*     */     extends c
/*     */   {
/*     */     public e() {}
/*     */     
/*     */     public e(int ☃, Random random, bwf bwf1, eq eq1, bru.b b1) {
/* 718 */       super(☃, b1);
/* 719 */       a(eq1);
/* 720 */       this.n = bwf1;
/*     */     }
/*     */ 
/*     */     
/*     */     public static bwf a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1) {
/* 725 */       bwf bwf = new bwf(i, j - 5, k, i, j + 3 - 1, k);
/*     */       
/* 727 */       switch (bwq.null.b[eq1.ordinal()]) {
/*     */         
/*     */         default:
/* 730 */           bwf.d = i + 3 - 1;
/* 731 */           bwf.c = k - 8;
/*     */           break;
/*     */         case 2:
/* 734 */           bwf.d = i + 3 - 1;
/* 735 */           bwf.f = k + 8;
/*     */           break;
/*     */         case 3:
/* 738 */           bwf.a = i - 8;
/* 739 */           bwf.f = k + 3 - 1;
/*     */           break;
/*     */         case 4:
/* 742 */           bwf.d = i + 8;
/* 743 */           bwf.f = k + 3 - 1;
/*     */           break;
/*     */       } 
/*     */       
/* 747 */       if (bxb.a(☃, bwf) != null) {
/* 748 */         return null;
/*     */       }
/*     */       
/* 751 */       return bwf;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 756 */       int i = e();
/*     */ 
/*     */       
/* 759 */       eq eq = f();
/* 760 */       if (eq != null) {
/* 761 */         switch (bwq.null.b[eq.ordinal()]) {
/*     */           
/*     */           default:
/* 764 */             bwq.a(☃, list, random, this.n.a, this.n.b, this.n.c - 1, eq.c, i);
/*     */             return;
/*     */           case 2:
/* 767 */             bwq.a(☃, list, random, this.n.a, this.n.b, this.n.f + 1, eq.d, i);
/*     */             return;
/*     */           case 3:
/* 770 */             bwq.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c, eq.e, i); return;
/*     */           case 4:
/*     */             break;
/* 773 */         }  bwq.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c, eq.f, i);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 781 */       if (a(☃, bwf1)) {
/* 782 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 786 */       a(☃, bwf1, 0, 5, 0, 2, 7, 1, m, m, false);
/*     */       
/* 788 */       a(☃, bwf1, 0, 0, 7, 2, 2, 8, m, m, false);
/*     */       
/* 790 */       for (int i = 0; i < 5; i++) {
/* 791 */         a(☃, bwf1, 0, 5 - i - ((i < 4) ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, m, m, false);
/*     */       }
/*     */       
/* 794 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */