/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public abstract class bxb
/*     */ {
/*  62 */   protected static final blc m = bct.jI.p();
/*     */   
/*     */   protected bwf n;
/*     */   
/*     */   @Nullable
/*     */   private eq a;
/*     */   private bfz b;
/*     */   private bhb c;
/*     */   protected int o;
/*     */   
/*     */   public bxb() {}
/*     */   
/*     */   protected bxb(int ☃) {
/*  75 */     this.o = ☃;
/*     */   }
/*     */   
/*     */   public final gy c() {
/*  79 */     gy ☃ = new gy();
/*     */     
/*  81 */     ☃.a("id", bwy.a(this));
/*  82 */     ☃.a("BB", this.n.g());
/*  83 */     eq eq1 = f();
/*  84 */     ☃.b("O", (eq1 == null) ? -1 : eq1.b());
/*  85 */     ☃.b("GD", this.o);
/*     */     
/*  87 */     a(☃);
/*     */     
/*  89 */     return ☃;
/*     */   }
/*     */   
/*     */   protected abstract void a(gy paramgy);
/*     */   
/*     */   public void a(axz ☃, gy gy1) {
/*  95 */     if (gy1.e("BB")) {
/*  96 */       this.n = new bwf(gy1.n("BB"));
/*     */     }
/*  98 */     int i = gy1.h("O");
/*  99 */     a((i == -1) ? null : eq.b(i));
/* 100 */     this.o = gy1.h("GD");
/*     */     
/* 102 */     a(gy1, ☃.s_().h());
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(gy paramgy, bxm parambxm);
/*     */   
/*     */   public void a(bxb ☃, List<bxb> list, Random random) {}
/*     */   
/*     */   public abstract boolean a(axz paramaxz, Random paramRandom, bwf parambwf, axm paramaxm);
/*     */   
/*     */   public bwf d() {
/* 113 */     return this.n;
/*     */   }
/*     */   
/*     */   public int e() {
/* 117 */     return this.o;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static bxb a(List<bxb> ☃, bwf bwf1) {
/* 128 */     for (bxb bxb1 : ☃) {
/* 129 */       if (bxb1.d() != null && bxb1.d().a(bwf1)) {
/* 130 */         return bxb1;
/*     */       }
/*     */     } 
/* 133 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(axk ☃, bwf bwf1) {
/* 141 */     int i = Math.max(this.n.a - 1, bwf1.a);
/* 142 */     int j = Math.max(this.n.b - 1, bwf1.b);
/* 143 */     int k = Math.max(this.n.c - 1, bwf1.c);
/* 144 */     int m = Math.min(this.n.d + 1, bwf1.d);
/* 145 */     int n = Math.min(this.n.e + 1, bwf1.e);
/* 146 */     int i1 = Math.min(this.n.f + 1, bwf1.f);
/*     */     
/* 148 */     el.a a = new el.a();
/*     */     
/*     */     int i2;
/* 151 */     for (i2 = i; i2 <= m; i2++) {
/* 152 */       for (int i3 = k; i3 <= i1; i3++) {
/* 153 */         if (☃.a_(a.c(i2, j, i3)).d().a()) {
/* 154 */           return true;
/*     */         }
/* 156 */         if (☃.a_(a.c(i2, n, i3)).d().a()) {
/* 157 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 162 */     for (i2 = i; i2 <= m; i2++) {
/* 163 */       for (int i3 = j; i3 <= n; i3++) {
/* 164 */         if (☃.a_(a.c(i2, i3, k)).d().a()) {
/* 165 */           return true;
/*     */         }
/* 167 */         if (☃.a_(a.c(i2, i3, i1)).d().a()) {
/* 168 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 173 */     for (i2 = k; i2 <= i1; i2++) {
/* 174 */       for (int i3 = j; i3 <= n; i3++) {
/* 175 */         if (☃.a_(a.c(i, i3, i2)).d().a()) {
/* 176 */           return true;
/*     */         }
/* 178 */         if (☃.a_(a.c(m, i3, i2)).d().a()) {
/* 179 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 183 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(int ☃, int i) {
/* 191 */     eq eq1 = f();
/* 192 */     if (eq1 == null) {
/* 193 */       return ☃;
/*     */     }
/*     */     
/* 196 */     switch (null.a[eq1.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 199 */         return this.n.a + ☃;
/*     */       case 3:
/* 201 */         return this.n.d - i;
/*     */       case 4:
/* 203 */         return this.n.a + i;
/*     */     } 
/* 205 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(int ☃) {
/* 210 */     if (f() == null) {
/* 211 */       return ☃;
/*     */     }
/* 213 */     return ☃ + this.n.b;
/*     */   }
/*     */   
/*     */   protected int b(int ☃, int i) {
/* 217 */     eq eq1 = f();
/* 218 */     if (eq1 == null) {
/* 219 */       return i;
/*     */     }
/*     */     
/* 222 */     switch (null.a[eq1.ordinal()]) {
/*     */       case 1:
/* 224 */         return this.n.f - i;
/*     */       case 2:
/* 226 */         return this.n.c + i;
/*     */       case 3:
/*     */       case 4:
/* 229 */         return this.n.c + ☃;
/*     */     } 
/* 231 */     return i;
/*     */   }
/*     */ 
/*     */   
/* 235 */   private static final Set<bcs> d = (Set<bcs>)ImmutableSet.builder()
/* 236 */     .add(bct.dY)
/* 237 */     .add(bct.cf)
/* 238 */     .add(bct.cg)
/* 239 */     .add(bct.cX)
/* 240 */     .add(bct.cY)
/* 241 */     .add(bct.db)
/* 242 */     .add(bct.dc)
/* 243 */     .add(bct.cZ)
/* 244 */     .add(bct.da)
/* 245 */     .add(bct.cz)
/* 246 */     .add(bct.dF)
/* 247 */     .build();
/*     */   
/*     */   protected void a(axz ☃, blc blc1, int i, int j, int k, bwf bwf1) {
/* 250 */     el el = new el(a(i, k), d(j), b(i, k));
/*     */     
/* 252 */     if (!bwf1.b(el)) {
/*     */       return;
/*     */     }
/*     */     
/* 256 */     if (this.b != bfz.a) {
/* 257 */       blc1 = blc1.a(this.b);
/*     */     }
/* 259 */     if (this.c != bhb.a) {
/* 260 */       blc1 = blc1.a(this.c);
/*     */     }
/*     */     
/* 263 */     ☃.a(el, blc1, 2);
/* 264 */     byw byw = ☃.b(el);
/* 265 */     if (!byw.e()) {
/* 266 */       ☃.I().a(el, byw.c(), 0);
/*     */     }
/* 268 */     if (d.contains(blc1.c())) {
/* 269 */       ☃.y(el).e(el);
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
/*     */   protected blc a(axk ☃, int i, int j, int k, bwf bwf1) {
/* 286 */     int m = a(i, k);
/* 287 */     int n = d(j);
/* 288 */     int i1 = b(i, k);
/*     */     
/* 290 */     el el = new el(m, n, i1);
/* 291 */     if (!bwf1.b(el)) {
/* 292 */       return bct.a.p();
/*     */     }
/*     */     
/* 295 */     return ☃.a_(el);
/*     */   }
/*     */   
/*     */   protected boolean a(ayc ☃, int i, int j, int k, bwf bwf1) {
/* 299 */     int m = a(i, k);
/* 300 */     int n = d(j + 1);
/* 301 */     int i1 = b(i, k);
/*     */     
/* 303 */     el el = new el(m, n, i1);
/*     */     
/* 305 */     if (!bwf1.b(el)) {
/* 306 */       return false;
/*     */     }
/*     */     
/* 309 */     return (n < ☃.a(bor.a.b, m, i1));
/*     */   }
/*     */   
/*     */   protected void b(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1) {
/* 313 */     for (int i2 = j; i2 <= n; i2++) {
/* 314 */       for (int i3 = i; i3 <= m; i3++) {
/* 315 */         for (int i4 = k; i4 <= i1; i4++) {
/* 316 */           a(☃, bct.a.p(), i3, i2, i4, bwf1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1, blc blc1, blc blc2, boolean bool) {
/* 323 */     for (int i2 = j; i2 <= n; i2++) {
/* 324 */       for (int i3 = i; i3 <= m; i3++) {
/* 325 */         for (int i4 = k; i4 <= i1; i4++) {
/* 326 */           if (!bool || !a(☃, i3, i2, i4, bwf1).f())
/*     */           {
/*     */             
/* 329 */             if (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1) {
/* 330 */               a(☃, blc1, i3, i2, i4, bwf1);
/*     */             } else {
/* 332 */               a(☃, blc2, i3, i2, i4, bwf1);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1, boolean bool, Random random, a a1) {
/* 344 */     for (int i2 = j; i2 <= n; i2++) {
/* 345 */       for (int i3 = i; i3 <= m; i3++) {
/* 346 */         for (int i4 = k; i4 <= i1; i4++) {
/* 347 */           if (!bool || !a(☃, i3, i2, i4, bwf1).f()) {
/*     */ 
/*     */             
/* 350 */             a1.a(random, i3, i2, i4, (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1));
/* 351 */             a(☃, a1.a(), i3, i2, i4, bwf1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, Random random, float f, int i, int j, int k, int m, int n, int i1, blc blc1, blc blc2, boolean bool1, boolean bool2) {
/* 362 */     for (int i2 = j; i2 <= n; i2++) {
/* 363 */       for (int i3 = i; i3 <= m; i3++) {
/* 364 */         for (int i4 = k; i4 <= i1; i4++) {
/* 365 */           if (random.nextFloat() <= f)
/*     */           {
/*     */             
/* 368 */             if (!bool1 || !a(☃, i3, i2, i4, bwf1).f())
/*     */             {
/*     */               
/* 371 */               if (!bool2 || a(☃, i3, i2, i4, bwf1))
/*     */               {
/*     */                 
/* 374 */                 if (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1) {
/* 375 */                   a(☃, blc1, i3, i2, i4, bwf1);
/*     */                 } else {
/* 377 */                   a(☃, blc2, i3, i2, i4, bwf1);
/*     */                 }  }  }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, Random random, float f, int i, int j, int k, blc blc1) {
/* 385 */     if (random.nextFloat() < f) {
/* 386 */       a(☃, blc1, i, j, k, bwf1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1, blc blc1, boolean bool) {
/* 391 */     float f1 = (m - i + 1);
/* 392 */     float f2 = (n - j + 1);
/* 393 */     float f3 = (i1 - k + 1);
/* 394 */     float f4 = i + f1 / 2.0F;
/* 395 */     float f5 = k + f3 / 2.0F;
/*     */     
/* 397 */     for (int i2 = j; i2 <= n; i2++) {
/* 398 */       float f = (i2 - j) / f2;
/*     */       
/* 400 */       for (int i3 = i; i3 <= m; i3++) {
/* 401 */         float f6 = (i3 - f4) / f1 * 0.5F;
/*     */         
/* 403 */         for (int i4 = k; i4 <= i1; i4++) {
/* 404 */           float f7 = (i4 - f5) / f3 * 0.5F;
/*     */           
/* 406 */           if (!bool || !a(☃, i3, i2, i4, bwf1).f()) {
/*     */ 
/*     */ 
/*     */             
/* 410 */             float f8 = f6 * f6 + f * f + f7 * f7;
/*     */             
/* 412 */             if (f8 <= 1.05F)
/* 413 */               a(☃, blc1, i3, i2, i4, bwf1); 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, int i, int j, int k, bwf bwf1) {
/* 421 */     el el = new el(a(i, k), d(j), b(i, k));
/*     */     
/* 423 */     if (!bwf1.b(el)) {
/*     */       return;
/*     */     }
/*     */     
/* 427 */     while (!☃.c(el) && el.p() < 255) {
/* 428 */       ☃.a(el, bct.a.p(), 2);
/* 429 */       el = el.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(axz ☃, blc blc1, int i, int j, int k, bwf bwf1) {
/* 434 */     int m = a(i, k);
/* 435 */     int n = d(j);
/* 436 */     int i1 = b(i, k);
/*     */     
/* 438 */     if (!bwf1.b(new el(m, n, i1))) {
/*     */       return;
/*     */     }
/*     */     
/* 442 */     while ((☃.c(new el(m, n, i1)) || ☃.a_(new el(m, n, i1)).d().a()) && n > 1) {
/* 443 */       ☃.a(new el(m, n, i1), blc1, 2);
/* 444 */       n--;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, bwf bwf1, Random random, int i, int j, int k, pc pc1) {
/* 449 */     el el = new el(a(i, k), d(j), b(i, k));
/* 450 */     return a(☃, bwf1, random, el, pc1, (blc)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static blc a(axk ☃, el el1, blc blc1) {
/* 455 */     eq eq1 = null;
/* 456 */     for (eq eq3 : eq.c.a) {
/* 457 */       el el3 = el1.a(eq3);
/* 458 */       blc blc2 = ☃.a_(el3);
/* 459 */       if (blc2.c() == bct.ck) {
/* 460 */         return blc1;
/*     */       }
/* 462 */       if (blc2.f(☃, el3)) {
/* 463 */         if (eq1 == null) {
/* 464 */           eq1 = eq3; continue;
/*     */         } 
/* 466 */         eq1 = null;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 471 */     if (eq1 != null) {
/* 472 */       return blc1.a(bfi.D, eq1.d());
/*     */     }
/*     */ 
/*     */     
/* 476 */     eq eq2 = (eq)blc1.c(bfi.D);
/* 477 */     el el2 = el1.a(eq2);
/* 478 */     if (☃.a_(el2).f(☃, el2)) {
/* 479 */       eq2 = eq2.d();
/* 480 */       el2 = el1.a(eq2);
/*     */     } 
/* 482 */     if (☃.a_(el2).f(☃, el2)) {
/* 483 */       eq2 = eq2.e();
/* 484 */       el2 = el1.a(eq2);
/*     */     } 
/* 486 */     if (☃.a_(el2).f(☃, el2)) {
/* 487 */       eq2 = eq2.d();
/* 488 */       el2 = el1.a(eq2);
/*     */     } 
/*     */     
/* 491 */     return blc1.a(bfi.D, eq2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃, bwf bwf1, Random random, el el1, pc pc1, @Nullable blc blc1) {
/* 498 */     if (!bwf1.b(el1) || ☃.a_(el1).c() == bct.ck) {
/* 499 */       return false;
/*     */     }
/*     */     
/* 502 */     if (blc1 == null) {
/* 503 */       blc1 = a(☃, el1, bct.ck.p());
/*     */     }
/* 505 */     ☃.a(el1, blc1, 2);
/*     */     
/* 507 */     bji bji = ☃.f(el1);
/* 508 */     if (bji instanceof bjl) {
/* 509 */       ((bjl)bji).a(pc1, random.nextLong());
/*     */     }
/* 511 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, bwf bwf1, Random random, int i, int j, int k, eq eq1, pc pc1) {
/* 515 */     el el = new el(a(i, k), d(j), b(i, k));
/*     */     
/* 517 */     if (bwf1.b(el) && 
/* 518 */       ☃.a_(el).c() != bct.as) {
/* 519 */       a(☃, bct.as.p().a(bec.a, eq1), i, j, k, bwf1);
/*     */       
/* 521 */       bji bji = ☃.f(el);
/* 522 */       if (bji instanceof bjq) {
/* 523 */         ((bjq)bji).a(pc1, random.nextLong());
/*     */       }
/* 525 */       return true;
/*     */     } 
/*     */     
/* 528 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, Random random, int i, int j, int k, eq eq1, bed bed1) {
/* 532 */     a(☃, bed1.p().a(bed.a, eq1), i, j, k, bwf1);
/* 533 */     a(☃, bed1.p().a(bed.a, eq1).a(bed.p, bmg.a), i, j + 1, k, bwf1);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 537 */     this.n.a(☃, i, j);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public eq f() {
/* 542 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(@Nullable eq ☃) {
/* 546 */     this.a = ☃;
/* 547 */     if (☃ == null) {
/* 548 */       this.c = bhb.a;
/* 549 */       this.b = bfz.a;
/*     */     } else {
/* 551 */       switch (null.a[☃.ordinal()]) {
/*     */         case 2:
/* 553 */           this.b = bfz.b;
/* 554 */           this.c = bhb.a;
/*     */           return;
/*     */         case 3:
/* 557 */           this.b = bfz.b;
/* 558 */           this.c = bhb.b;
/*     */           return;
/*     */         case 4:
/* 561 */           this.b = bfz.a;
/* 562 */           this.c = bhb.b;
/*     */           return;
/*     */       } 
/* 565 */       this.b = bfz.a;
/* 566 */       this.c = bhb.a;
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
/*     */   public static abstract class a
/*     */   {
/* 581 */     protected blc a = bct.a.p();
/*     */     
/*     */     public abstract void a(Random param1Random, int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean);
/*     */     
/*     */     public blc a() {
/* 586 */       return this.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */