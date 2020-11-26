/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bxp
/*     */ {
/*  60 */   private final List<List<b>> a = Lists.newArrayList();
/*  61 */   private final List<c> b = Lists.newArrayList();
/*  62 */   private el c = el.a;
/*  63 */   private String d = "?";
/*     */   
/*     */   public el a() {
/*  66 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  70 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public String b() {
/*  74 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(axy ☃, el el1, el el2, boolean bool, @Nullable bcs bcs1) {
/*  78 */     if (el2.o() < 1 || el2.p() < 1 || el2.q() < 1) {
/*     */       return;
/*     */     }
/*  81 */     el el3 = el1.a(el2).a(-1, -1, -1);
/*  82 */     List<b> list1 = Lists.newArrayList();
/*  83 */     List<b> list2 = Lists.newArrayList();
/*  84 */     List<b> list3 = Lists.newArrayList();
/*     */     
/*  86 */     el el4 = new el(Math.min(el1.o(), el3.o()), Math.min(el1.p(), el3.p()), Math.min(el1.q(), el3.q()));
/*  87 */     el el5 = new el(Math.max(el1.o(), el3.o()), Math.max(el1.p(), el3.p()), Math.max(el1.q(), el3.q()));
/*  88 */     this.c = el2;
/*     */     
/*  90 */     for (el.a a : el.b(el4, el5)) {
/*  91 */       el el6 = a.b(el4);
/*  92 */       blc blc = ☃.a_(a);
/*  93 */       if (bcs1 != null && bcs1 == blc.c()) {
/*     */         continue;
/*     */       }
/*  96 */       bji bji = ☃.f(a);
/*  97 */       if (bji != null) {
/*  98 */         gy gy = bji.a(new gy());
/*  99 */         gy.r("x");
/* 100 */         gy.r("y");
/* 101 */         gy.r("z");
/* 102 */         list2.add(new b(el6, blc, gy)); continue;
/* 103 */       }  if (blc.f(☃, a) || blc.g()) {
/* 104 */         list1.add(new b(el6, blc, null)); continue;
/*     */       } 
/* 106 */       list3.add(new b(el6, blc, null));
/*     */     } 
/*     */ 
/*     */     
/* 110 */     List<b> list4 = Lists.newArrayList();
/* 111 */     list4.addAll(list1);
/* 112 */     list4.addAll(list2);
/* 113 */     list4.addAll(list3);
/*     */     
/* 115 */     this.a.clear();
/* 116 */     this.a.add(list4);
/*     */     
/* 118 */     if (bool) {
/* 119 */       a(☃, el4, el5.a(1, 1, 1));
/*     */     } else {
/* 121 */       this.b.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, el el2) {
/* 126 */     List<aer> list = ☃.a(aer.class, new cea(el1, el2), ☃ -> !(☃ instanceof aog));
/* 127 */     this.b.clear();
/* 128 */     for (aer aer : list) {
/* 129 */       el el3; cee cee = new cee(aer.q - el1.o(), aer.r - el1.p(), aer.s - el1.q());
/* 130 */       gy gy = new gy();
/* 131 */       aer.d(gy);
/*     */       
/* 133 */       if (aer instanceof ame) {
/* 134 */         el3 = ((ame)aer).n().b(el1);
/*     */       } else {
/* 136 */         el3 = new el(cee);
/*     */       } 
/* 138 */       this.b.add(new c(cee, el3, gy));
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<el, String> a(el ☃, bxn bxn1) {
/* 143 */     Map<el, String> map = Maps.newHashMap();
/* 144 */     bwf bwf = bxn1.j();
/* 145 */     for (b b : bxn1.a(this.a, ☃)) {
/* 146 */       el el1 = a(bxn1, b.a).a(☃);
/* 147 */       if (bwf != null && !bwf.b(el1)) {
/*     */         continue;
/*     */       }
/* 150 */       blc blc = b.b;
/* 151 */       if (blc.c() != bct.kz || b.c == null) {
/*     */         continue;
/*     */       }
/* 154 */       bmr bmr = bmr.valueOf(b.c.l("mode"));
/* 155 */       if (bmr != bmr.d) {
/*     */         continue;
/*     */       }
/* 158 */       map.put(el1, b.c.l("metadata"));
/*     */     } 
/* 160 */     return map;
/*     */   }
/*     */   
/*     */   public el a(bxn ☃, el el1, bxn bxn1, el el2) {
/* 164 */     el el3 = a(☃, el1);
/* 165 */     el el4 = a(bxn1, el2);
/* 166 */     return el3.b(el4);
/*     */   }
/*     */   
/*     */   public static el a(bxn ☃, el el1) {
/* 170 */     return a(el1, ☃.b(), ☃.c(), ☃.d());
/*     */   }
/*     */   
/*     */   public void a(axz ☃, el el1, bxn bxn1) {
/* 174 */     bxn1.l();
/* 175 */     b(☃, el1, bxn1);
/*     */   }
/*     */   
/*     */   public void b(axz ☃, el el1, bxn bxn1) {
/* 179 */     a(☃, el1, new bxl(el1, bxn1), bxn1, 2);
/*     */   }
/*     */   
/*     */   public boolean a(axz ☃, el el1, bxn bxn1, int i) {
/* 183 */     return a(☃, el1, new bxl(el1, bxn1), bxn1, i);
/*     */   }
/*     */   
/*     */   public boolean a(axz ☃, el el1, @Nullable bxo bxo1, bxn bxn1, int i) {
/* 187 */     if (this.a.isEmpty()) {
/* 188 */       return false;
/*     */     }
/* 190 */     List<b> list = bxn1.a(this.a, el1);
/* 191 */     if ((list.isEmpty() && (bxn1.h() || this.b.isEmpty())) || this.c.o() < 1 || this.c.p() < 1 || this.c.q() < 1) {
/* 192 */       return false;
/*     */     }
/*     */     
/* 195 */     bcs bcs = bxn1.i();
/* 196 */     bwf bwf = bxn1.j();
/* 197 */     List<el> list1 = Lists.newArrayListWithCapacity(bxn1.m() ? list.size() : 0);
/* 198 */     List<Pair<el, gy>> list2 = Lists.newArrayListWithCapacity(list.size());
/*     */     
/* 200 */     int j = Integer.MAX_VALUE;
/* 201 */     int k = Integer.MAX_VALUE;
/* 202 */     int m = Integer.MAX_VALUE;
/*     */     
/* 204 */     int n = Integer.MIN_VALUE;
/* 205 */     int i1 = Integer.MIN_VALUE;
/* 206 */     int i2 = Integer.MIN_VALUE;
/*     */     
/* 208 */     for (b b1 : list) {
/* 209 */       el el2 = a(bxn1, b1.a).a(el1);
/* 210 */       b b2 = (bxo1 != null) ? bxo1.a(☃, el2, b1) : b1;
/*     */       
/* 212 */       if (b2 == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 216 */       bcs bcs1 = b2.b.c();
/* 217 */       if (bcs != null && bcs == bcs1) {
/*     */         continue;
/*     */       }
/* 220 */       if (bxn1.k() && bcs1 == bct.kz) {
/*     */         continue;
/*     */       }
/*     */       
/* 224 */       if (bwf != null && !bwf.b(el2)) {
/*     */         continue;
/*     */       }
/*     */       
/* 228 */       byw byw = bxn1.m() ? ☃.b(el2) : null;
/* 229 */       blc blc1 = b2.b.a(bxn1.b());
/* 230 */       blc blc2 = blc1.a(bxn1.c());
/*     */       
/* 232 */       if (b2.c != null) {
/* 233 */         bji bji = ☃.f(el2);
/* 234 */         if (bji instanceof ade) {
/* 235 */           ((ade)bji).m();
/*     */         }
/* 237 */         ☃.a(el2, bct.fU.p(), 4);
/*     */       } 
/* 239 */       if (☃.a(el2, blc2, i)) {
/* 240 */         j = Math.min(j, el2.o());
/* 241 */         k = Math.min(k, el2.p());
/* 242 */         m = Math.min(m, el2.q());
/*     */         
/* 244 */         n = Math.max(n, el2.o());
/* 245 */         i1 = Math.max(i1, el2.p());
/* 246 */         i2 = Math.max(i2, el2.q());
/* 247 */         list2.add(Pair.of(el2, b1.c));
/*     */         
/* 249 */         if (b2.c != null) {
/* 250 */           bji bji = ☃.f(el2);
/* 251 */           if (bji != null) {
/* 252 */             b2.c.b("x", el2.o());
/* 253 */             b2.c.b("y", el2.p());
/* 254 */             b2.c.b("z", el2.q());
/* 255 */             bji.b(b2.c);
/* 256 */             bji.a(bxn1.b());
/* 257 */             bji.a(bxn1.c());
/*     */           } 
/*     */         } 
/* 260 */         if (byw != null && 
/* 261 */           blc2.c() instanceof bfv) {
/* 262 */           ((bfv)blc2.c()).a(☃, el2, blc2, byw);
/* 263 */           if (!byw.d()) {
/* 264 */             list1.add(el2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 271 */     boolean bool = true;
/* 272 */     eq[] arrayOfEq = { eq.b, eq.c, eq.f, eq.d, eq.e };
/*     */     
/* 274 */     while (bool && !list1.isEmpty()) {
/* 275 */       bool = false;
/* 276 */       for (Iterator<el> iterator = list1.iterator(); iterator.hasNext(); ) {
/* 277 */         el el2 = iterator.next();
/*     */         
/* 279 */         byw byw = ☃.b(el2);
/* 280 */         for (int i3 = 0; i3 < arrayOfEq.length && !byw.d(); i3++) {
/* 281 */           byw byw1 = ☃.b(el2.a(arrayOfEq[i3]));
/* 282 */           if (byw1.f() > byw.f() || (byw1.d() && !byw.d())) {
/* 283 */             byw = byw1;
/*     */           }
/*     */         } 
/*     */         
/* 287 */         if (byw.d()) {
/* 288 */           blc blc = ☃.a_(el2);
/* 289 */           if (blc.c() instanceof bfv) {
/* 290 */             ((bfv)blc.c()).a(☃, el2, blc, byw);
/* 291 */             bool = true;
/* 292 */             iterator.remove();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 298 */     if (j <= n) {
/* 299 */       cem cem = new ceh(n - j + 1, i1 - k + 1, i2 - m + 1);
/*     */       
/* 301 */       int i3 = j;
/* 302 */       int i4 = k;
/* 303 */       int i5 = m;
/*     */       
/* 305 */       for (Pair<el, gy> pair : list2) {
/* 306 */         el el2 = (el)pair.getFirst();
/* 307 */         cem.a(el2.o() - i3, el2.p() - i4, el2.q() - i5, true, true);
/*     */       } 
/*     */       
/* 310 */       cem.a((eq1, m, n, i1) -> {
/*     */             el el1 = new el(☃ + m, i + n, j + i1);
/*     */             
/*     */             el el2 = el1.a(eq1);
/*     */             blc blc1 = axz1.a_(el1);
/*     */             blc blc2 = axz1.a_(el2);
/*     */             blc blc3 = blc1.a(eq1, blc2, axz1, el1, el2);
/*     */             if (blc1 != blc3) {
/*     */               axz1.a(el1, blc3, k & 0xFFFFFFFE | 0x10);
/*     */             }
/*     */             blc blc4 = blc2.a(eq1.d(), blc3, axz1, el2, el1);
/*     */             if (blc2 != blc4) {
/*     */               axz1.a(el2, blc4, k & 0xFFFFFFFE | 0x10);
/*     */             }
/*     */           });
/* 325 */       for (Pair<el, gy> pair : list2) {
/* 326 */         el el2 = (el)pair.getFirst();
/* 327 */         blc blc1 = ☃.a_(el2);
/* 328 */         blc blc2 = bcs.b(blc1, ☃, el2);
/* 329 */         if (blc1 != blc2) {
/* 330 */           ☃.a(el2, blc2, i & 0xFFFFFFFE | 0x10);
/*     */         }
/*     */         
/* 333 */         ☃.a(el2, blc2.c());
/* 334 */         if (pair.getSecond() != null) {
/* 335 */           bji bji = ☃.f(el2);
/* 336 */           if (bji != null) {
/* 337 */             bji.g();
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 343 */     if (!bxn1.h()) {
/* 344 */       a(☃, el1, bxn1.b(), bxn1.c(), bxn1.d(), bwf);
/*     */     }
/*     */     
/* 347 */     return true;
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1, bfz bfz1, bhb bhb1, el el2, @Nullable bwf bwf1) {
/* 351 */     for (c c : this.b) {
/* 352 */       aer aer; el el3 = a(c.b, bfz1, bhb1, el2).a(el1);
/* 353 */       if (bwf1 != null && !bwf1.b(el3)) {
/*     */         continue;
/*     */       }
/*     */       
/* 357 */       gy gy = c.c;
/* 358 */       cee cee1 = a(c.a, bfz1, bhb1, el2);
/* 359 */       cee cee2 = cee1.b(el1.o(), el1.p(), el1.q());
/*     */       
/* 361 */       he he = new he();
/* 362 */       he.a(new gz(cee2.b));
/* 363 */       he.a(new gz(cee2.c));
/* 364 */       he.a(new gz(cee2.d));
/* 365 */       gy.a("Pos", he);
/*     */       
/* 367 */       gy.a("UUID", UUID.randomUUID());
/*     */ 
/*     */       
/*     */       try {
/* 371 */         aer = aev.a(gy, ☃.f());
/* 372 */       } catch (Exception exception) {
/* 373 */         aer = null;
/*     */       } 
/* 375 */       if (aer != null) {
/* 376 */         float f = aer.a(bfz1);
/* 377 */         f += aer.w - aer.a(bhb1);
/* 378 */         aer.b(cee2.b, cee2.c, cee2.d, f, aer.x);
/* 379 */         ☃.a(aer);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public el a(bhb ☃) {
/* 385 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 388 */         return new el(this.c.q(), this.c.p(), this.c.o());
/*     */     } 
/* 390 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public static el a(el ☃, bfz bfz1, bhb bhb1, el el1) {
/* 395 */     int i = ☃.o();
/* 396 */     int j = ☃.p();
/* 397 */     int k = ☃.q();
/*     */     
/* 399 */     boolean bool = true;
/* 400 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 402 */         k = -k;
/*     */         break;
/*     */       case 2:
/* 405 */         i = -i;
/*     */         break;
/*     */       default:
/* 408 */         bool = false;
/*     */         break;
/*     */     } 
/*     */     
/* 412 */     int m = el1.o();
/* 413 */     int n = el1.q();
/* 414 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 3:
/* 416 */         return new el(m + m - i, j, n + n - k);
/*     */       case 1:
/* 418 */         return new el(m - n + k, j, m + n - i);
/*     */       case 2:
/* 420 */         return new el(m + n - k, j, n - m + i);
/*     */     } 
/* 422 */     return bool ? new el(i, j, k) : ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   private static cee a(cee ☃, bfz bfz1, bhb bhb1, el el1) {
/* 427 */     double d1 = ☃.b;
/* 428 */     double d2 = ☃.c;
/* 429 */     double d3 = ☃.d;
/*     */     
/* 431 */     boolean bool = true;
/* 432 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 434 */         d3 = 1.0D - d3;
/*     */         break;
/*     */       case 2:
/* 437 */         d1 = 1.0D - d1;
/*     */         break;
/*     */       default:
/* 440 */         bool = false;
/*     */         break;
/*     */     } 
/*     */     
/* 444 */     int i = el1.o();
/* 445 */     int j = el1.q();
/* 446 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 3:
/* 448 */         return new cee((i + i + 1) - d1, d2, (j + j + 1) - d3);
/*     */       case 1:
/* 450 */         return new cee((i - j) + d3, d2, (i + j + 1) - d1);
/*     */       case 2:
/* 452 */         return new cee((i + j + 1) - d3, d2, (j - i) + d1);
/*     */     } 
/* 454 */     return bool ? new cee(d1, d2, d3) : ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public el a(el ☃, bfz bfz1, bhb bhb1) {
/* 459 */     return a(☃, bfz1, bhb1, a().o(), a().q());
/*     */   }
/*     */   
/*     */   public static el a(el ☃, bfz bfz1, bhb bhb1, int i, int j) {
/* 463 */     i--;
/* 464 */     j--;
/*     */     
/* 466 */     int k = (bfz1 == bfz.c) ? i : 0;
/* 467 */     int m = (bfz1 == bfz.b) ? j : 0;
/*     */     
/* 469 */     el el1 = ☃;
/*     */     
/* 471 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 4:
/* 473 */         el1 = ☃.a(k, 0, m);
/*     */         break;
/*     */       case 2:
/* 476 */         el1 = ☃.a(j - m, 0, k);
/*     */         break;
/*     */       case 3:
/* 479 */         el1 = ☃.a(i - k, 0, j - m);
/*     */         break;
/*     */       case 1:
/* 482 */         el1 = ☃.a(m, 0, i - k);
/*     */         break;
/*     */     } 
/* 485 */     return el1;
/*     */   }
/*     */   
/*     */   static class a implements Iterable<blc> {
/* 489 */     public static final blc a = bct.a.p();
/*     */     
/* 491 */     private final eu<blc> b = new eu<>(16);
/*     */     private int c;
/*     */     
/*     */     public int a(blc ☃) {
/* 495 */       int i = this.b.a(☃);
/* 496 */       if (i == -1) {
/* 497 */         i = this.c++;
/* 498 */         this.b.a(☃, i);
/*     */       } 
/*     */       
/* 501 */       return i;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public blc a(int ☃) {
/* 506 */       blc blc1 = this.b.a(☃);
/* 507 */       return (blc1 == null) ? a : blc1;
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<blc> iterator() {
/* 512 */       return this.b.iterator();
/*     */     }
/*     */     
/*     */     public void a(blc ☃, int i) {
/* 516 */       this.b.a(☃, i);
/*     */     }
/*     */     private a() {} }
/*     */   
/*     */   public gy a(gy ☃) {
/* 521 */     if (this.a.isEmpty()) {
/* 522 */       ☃.a("blocks", new he());
/* 523 */       ☃.a("palette", new he());
/*     */     } else {
/* 525 */       List<a> list = Lists.newArrayList();
/* 526 */       a a = new a();
/* 527 */       list.add(a);
/*     */       
/* 529 */       for (int i = 1; i < this.a.size(); i++) {
/* 530 */         list.add(new a());
/*     */       }
/*     */       
/* 533 */       he he1 = new he();
/* 534 */       List<b> list1 = this.a.get(0);
/* 535 */       for (int j = 0; j < list1.size(); j++) {
/* 536 */         b b = list1.get(j);
/* 537 */         gy gy1 = new gy();
/* 538 */         gy1.a("pos", a(new int[] { b.a.o(), b.a.p(), b.a.q() }));
/* 539 */         int k = a.a(b.b);
/* 540 */         gy1.b("state", k);
/* 541 */         if (b.c != null) {
/* 542 */           gy1.a("nbt", b.c);
/*     */         }
/* 544 */         he1.a(gy1);
/*     */         
/* 546 */         for (int m = 1; m < this.a.size(); m++) {
/* 547 */           a a1 = list.get(m);
/* 548 */           a1.a(((b)((List)this.a.get(j)).get(j)).b, k);
/*     */         } 
/*     */       } 
/* 551 */       ☃.a("blocks", he1);
/*     */       
/* 553 */       if (list.size() == 1) {
/* 554 */         he he2 = new he();
/* 555 */         for (blc blc : a) {
/* 556 */           he2.a(hk.a(blc));
/*     */         }
/* 558 */         ☃.a("palette", he2);
/*     */       } else {
/* 560 */         he he2 = new he();
/* 561 */         for (a a1 : list) {
/* 562 */           he he3 = new he();
/* 563 */           for (blc blc : a1) {
/* 564 */             he3.a(hk.a(blc));
/*     */           }
/* 566 */           he2.a(he3);
/*     */         } 
/* 568 */         ☃.a("palettes", he2);
/*     */       } 
/*     */     } 
/*     */     
/* 572 */     he he = new he();
/* 573 */     for (c c : this.b) {
/* 574 */       gy gy1 = new gy();
/* 575 */       gy1.a("pos", a(new double[] { c.a.b, c.a.c, c.a.d }));
/* 576 */       gy1.a("blockPos", a(new int[] { c.b.o(), c.b.p(), c.b.q() }));
/* 577 */       if (c.c != null) {
/* 578 */         gy1.a("nbt", c.c);
/*     */       }
/* 580 */       he.a(gy1);
/*     */     } 
/*     */     
/* 583 */     ☃.a("entities", he);
/* 584 */     ☃.a("size", a(new int[] { this.c.o(), this.c.p(), this.c.q() }));
/* 585 */     ☃.b("DataVersion", 1631);
/*     */     
/* 587 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/* 591 */     this.a.clear();
/* 592 */     this.b.clear();
/*     */     
/* 594 */     he he1 = ☃.d("size", 3);
/* 595 */     this.c = new el(he1.h(0), he1.h(1), he1.h(2));
/*     */     
/* 597 */     he he2 = ☃.d("blocks", 10);
/* 598 */     if (☃.c("palettes", 9)) {
/* 599 */       he he = ☃.d("palettes", 9);
/* 600 */       for (int j = 0; j < he.size(); j++) {
/* 601 */         a(he.f(j), he2);
/*     */       }
/*     */     } else {
/* 604 */       a(☃.d("palette", 10), he2);
/*     */     } 
/*     */     
/* 607 */     he he3 = ☃.d("entities", 10);
/* 608 */     for (int i = 0; i < he3.size(); i++) {
/* 609 */       gy gy1 = he3.e(i);
/* 610 */       he he4 = gy1.d("pos", 6);
/* 611 */       cee cee = new cee(he4.k(0), he4.k(1), he4.k(2));
/* 612 */       he he5 = gy1.d("blockPos", 3);
/* 613 */       el el1 = new el(he5.h(0), he5.h(1), he5.h(2));
/* 614 */       if (gy1.e("nbt")) {
/* 615 */         gy gy2 = gy1.p("nbt");
/* 616 */         this.b.add(new c(cee, el1, gy2));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(he ☃, he he1) {
/* 622 */     a a = new a();
/* 623 */     List<b> list = Lists.newArrayList();
/*     */     int i;
/* 625 */     for (i = 0; i < ☃.size(); i++) {
/* 626 */       a.a(hk.d(☃.e(i)), i);
/*     */     }
/*     */     
/* 629 */     for (i = 0; i < he1.size(); i++) {
/* 630 */       gy gy2, gy1 = he1.e(i);
/* 631 */       he he2 = gy1.d("pos", 3);
/* 632 */       el el1 = new el(he2.h(0), he2.h(1), he2.h(2));
/* 633 */       blc blc = a.a(gy1.h("state"));
/*     */       
/* 635 */       if (gy1.e("nbt")) {
/* 636 */         gy2 = gy1.p("nbt");
/*     */       } else {
/* 638 */         gy2 = null;
/*     */       } 
/* 640 */       list.add(new b(el1, blc, gy2));
/*     */     } 
/*     */     
/* 643 */     this.a.add(list);
/*     */   }
/*     */   
/*     */   private he a(int... ☃) {
/* 647 */     he he = new he();
/* 648 */     for (int i : ☃) {
/* 649 */       he.a(new hd(i));
/*     */     }
/* 651 */     return he;
/*     */   }
/*     */   
/*     */   private he a(double... ☃) {
/* 655 */     he he = new he();
/* 656 */     for (double d : ☃) {
/* 657 */       he.a(new gz(d));
/*     */     }
/* 659 */     return he;
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     public final el a;
/*     */     public final blc b;
/*     */     public final gy c;
/*     */     
/*     */     public b(el ☃, blc blc1, @Nullable gy gy1) {
/* 668 */       this.a = ☃;
/* 669 */       this.b = blc1;
/* 670 */       this.c = gy1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c {
/*     */     public final cee a;
/*     */     public final el b;
/*     */     public final gy c;
/*     */     
/*     */     public c(cee ☃, el el1, gy gy1) {
/* 680 */       this.a = ☃;
/* 681 */       this.b = el1;
/* 682 */       this.c = gy1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */