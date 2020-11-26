/*      */ import com.google.common.collect.ImmutableSet;
/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class bws
/*      */ {
/*      */   public static void a() {
/*   23 */     bwy.a((Class)h.class, "OMB");
/*   24 */     bwy.a((Class)j.class, "OMCR");
/*   25 */     bwy.a((Class)k.class, "OMDXR");
/*   26 */     bwy.a((Class)l.class, "OMDXYR");
/*   27 */     bwy.a((Class)m.class, "OMDYR");
/*   28 */     bwy.a((Class)n.class, "OMDYZR");
/*   29 */     bwy.a((Class)o.class, "OMDZR");
/*   30 */     bwy.a((Class)p.class, "OMEntry");
/*   31 */     bwy.a((Class)q.class, "OMPenthouse");
/*   32 */     bwy.a((Class)s.class, "OMSimple");
/*   33 */     bwy.a((Class)t.class, "OMSimpleT");
/*      */   }
/*      */ 
/*      */   
/*      */   public static abstract class r
/*      */     extends bxb
/*      */   {
/*   40 */     protected static final blc a = bct.hg.p();
/*   41 */     protected static final blc b = bct.hh.p();
/*   42 */     protected static final blc c = bct.hi.p();
/*      */     
/*   44 */     protected static final blc d = b;
/*      */     
/*   46 */     protected static final blc e = bct.hm.p();
/*      */ 
/*      */     
/*   49 */     protected static final blc f = bct.A.p();
/*   50 */     protected static final Set<bcs> g = (Set<bcs>)ImmutableSet.builder()
/*   51 */       .add(bct.cR)
/*   52 */       .add(bct.gp)
/*   53 */       .add(bct.gq)
/*   54 */       .add(f.c())
/*   55 */       .build();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   66 */     protected static final int h = b(2, 0, 0);
/*   67 */     protected static final int i = b(2, 2, 0);
/*   68 */     protected static final int j = b(0, 1, 0);
/*   69 */     protected static final int k = b(4, 1, 0);
/*      */ 
/*      */ 
/*      */     
/*      */     protected bws.v l;
/*      */ 
/*      */ 
/*      */     
/*      */     protected static final int b(int ☃, int i, int j) {
/*   78 */       return i * 25 + j * 5 + ☃;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public r() {
/*   96 */       super(0);
/*      */     }
/*      */     
/*      */     public r(int ☃) {
/*  100 */       super(☃);
/*      */     }
/*      */     
/*      */     public r(eq ☃, bwf bwf1) {
/*  104 */       super(1);
/*  105 */       a(☃);
/*  106 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     protected r(int ☃, eq eq1, bws.v v1, int i, int j, int k) {
/*  110 */       super(☃);
/*  111 */       a(eq1);
/*  112 */       this.l = v1;
/*      */       
/*  114 */       int m = bws.v.a(v1);
/*  115 */       int n = m % 5;
/*  116 */       int i1 = m / 5 % 5;
/*  117 */       int i2 = m / 25;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  122 */       if (eq1 == eq.c || eq1 == eq.d) {
/*  123 */         this.n = new bwf(0, 0, 0, i * 8 - 1, j * 4 - 1, k * 8 - 1);
/*      */       } else {
/*      */         
/*  126 */         this.n = new bwf(0, 0, 0, k * 8 - 1, j * 4 - 1, i * 8 - 1);
/*      */       } 
/*      */       
/*  129 */       switch (bws.null.a[eq1.ordinal()]) {
/*      */         case 1:
/*  131 */           this.n.a(n * 8, i2 * 4, -(i1 + k) * 8 + 1);
/*      */           return;
/*      */         
/*      */         case 2:
/*  135 */           this.n.a(n * 8, i2 * 4, i1 * 8);
/*      */           return;
/*      */         case 3:
/*  138 */           this.n.a(-(i1 + k) * 8 + 1, i2 * 4, n * 8);
/*      */           return;
/*      */       } 
/*  141 */       this.n.a(i1 * 8, i2 * 4, n * 8);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {}
/*      */ 
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {}
/*      */ 
/*      */ 
/*      */     
/*      */     protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1) {
/*  155 */       for (int i2 = j; i2 <= n; i2++) {
/*  156 */         for (int i3 = i; i3 <= m; i3++) {
/*  157 */           for (int i4 = k; i4 <= i1; i4++) {
/*  158 */             blc blc1 = a(☃, i3, i2, i4, bwf1);
/*  159 */             if (!g.contains(blc1.c())) {
/*  160 */               if (d(i2) >= ☃.k() && blc1 != f) {
/*  161 */                 a(☃, bct.a.p(), i3, i2, i4, bwf1);
/*      */               } else {
/*  163 */                 a(☃, f, i3, i2, i4, bwf1);
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     protected void a(axz ☃, bwf bwf1, int i, int j, boolean bool) {
/*  172 */       if (bool) {
/*  173 */         a(☃, bwf1, i + 0, 0, j + 0, i + 2, 0, j + 8 - 1, a, a, false);
/*  174 */         a(☃, bwf1, i + 5, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*  175 */         a(☃, bwf1, i + 3, 0, j + 0, i + 4, 0, j + 2, a, a, false);
/*  176 */         a(☃, bwf1, i + 3, 0, j + 5, i + 4, 0, j + 8 - 1, a, a, false);
/*      */         
/*  178 */         a(☃, bwf1, i + 3, 0, j + 2, i + 4, 0, j + 2, b, b, false);
/*  179 */         a(☃, bwf1, i + 3, 0, j + 5, i + 4, 0, j + 5, b, b, false);
/*  180 */         a(☃, bwf1, i + 2, 0, j + 3, i + 2, 0, j + 4, b, b, false);
/*  181 */         a(☃, bwf1, i + 5, 0, j + 3, i + 5, 0, j + 4, b, b, false);
/*      */       } else {
/*  183 */         a(☃, bwf1, i + 0, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*      */       } 
/*      */     }
/*      */     
/*      */     protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m, int n, int i1, blc blc1) {
/*  188 */       for (int i2 = j; i2 <= n; i2++) {
/*  189 */         for (int i3 = i; i3 <= m; i3++) {
/*  190 */           for (int i4 = k; i4 <= i1; i4++) {
/*  191 */             if (a(☃, i3, i2, i4, bwf1) == f)
/*      */             {
/*      */               
/*  194 */               a(☃, blc1, i3, i2, i4, bwf1); } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     protected boolean a(bwf ☃, int i, int j, int k, int m) {
/*  201 */       int n = a(i, j);
/*  202 */       int i1 = b(i, j);
/*  203 */       int i2 = a(k, m);
/*  204 */       int i3 = b(k, m);
/*  205 */       return ☃.a(Math.min(n, i2), Math.min(i1, i3), Math.max(n, i2), Math.max(i1, i3));
/*      */     }
/*      */     
/*      */     protected boolean a(axz ☃, bwf bwf1, int i, int j, int k) {
/*  209 */       int m = a(i, k);
/*  210 */       int n = d(j);
/*  211 */       int i1 = b(i, k);
/*      */       
/*  213 */       if (bwf1.b(new el(m, n, i1))) {
/*  214 */         amv amv = new amv(☃.f());
/*  215 */         amv.c(amv.cw());
/*  216 */         amv.b(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/*  217 */         amv.a(☃.h(new el(amv)), (afj)null, (gy)null);
/*  218 */         ☃.a(amv);
/*  219 */         return true;
/*      */       } 
/*  221 */       return false;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends r
/*      */   {
/*      */     private bws.v p;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private bws.v q;
/*      */ 
/*      */ 
/*      */     
/*  241 */     private final List<bws.r> r = Lists.newArrayList();
/*      */ 
/*      */     
/*      */     public h() {}
/*      */ 
/*      */     
/*      */     public h(Random ☃, int i, int j, eq eq1) {
/*  248 */       super(0);
/*      */       
/*  250 */       a(eq1);
/*      */       
/*  252 */       eq eq2 = f();
/*  253 */       if (eq2.k() == eq.a.c) {
/*  254 */         this.n = new bwf(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*      */       } else {
/*  256 */         this.n = new bwf(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*      */       } 
/*      */       
/*  259 */       List<bws.v> list = a(☃);
/*      */       
/*  261 */       bws.v.a(this.p, true);
/*  262 */       this.r.add(new bws.p(eq2, this.p));
/*  263 */       this.r.add(new bws.j(eq2, this.q, ☃));
/*      */       
/*  265 */       List<bws.i> list1 = Lists.newArrayList();
/*  266 */       list1.add(new bws.b());
/*  267 */       list1.add(new bws.d());
/*  268 */       list1.add(new bws.e());
/*  269 */       list1.add(new bws.a());
/*  270 */       list1.add(new bws.c());
/*  271 */       list1.add(new bws.g());
/*  272 */       list1.add(new bws.f());
/*      */       
/*  274 */       for (bws.v v1 : list) {
/*  275 */         if (!bws.v.b(v1) && !v1.b())
/*      */         {
/*  277 */           for (bws.i i2 : list1) {
/*  278 */             if (i2.a(v1)) {
/*  279 */               this.r.add(i2.a(eq2, v1, ☃));
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  287 */       int k = this.n.b;
/*  288 */       int m = a(9, 22);
/*  289 */       int n = b(9, 22);
/*  290 */       for (bws.r r1 : this.r) {
/*  291 */         r1.d().a(m, k, n);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  296 */       bwf bwf1 = bwf.a(a(1, 1), d(1), b(1, 1), a(23, 21), d(8), b(23, 21));
/*  297 */       bwf bwf2 = bwf.a(a(34, 1), d(1), b(34, 1), a(56, 21), d(8), b(56, 21));
/*  298 */       bwf bwf3 = bwf.a(a(22, 22), d(13), b(22, 22), a(35, 35), d(17), b(35, 35));
/*      */ 
/*      */       
/*  301 */       int i1 = ☃.nextInt();
/*  302 */       this.r.add(new bws.u(eq2, bwf1, i1++));
/*  303 */       this.r.add(new bws.u(eq2, bwf2, i1++));
/*      */       
/*  305 */       this.r.add(new bws.q(eq2, bwf3));
/*      */     }
/*      */ 
/*      */     
/*      */     private List<bws.v> a(Random ☃) {
/*  310 */       bws.v[] arrayOfV = new bws.v[75];
/*      */       int i;
/*  312 */       for (i = 0; i < 5; i++) {
/*  313 */         for (int k = 0; k < 4; k++) {
/*  314 */           int m = 0;
/*  315 */           int n = b(i, 0, k);
/*  316 */           arrayOfV[n] = new bws.v(n);
/*      */         } 
/*      */       } 
/*  319 */       for (i = 0; i < 5; i++) {
/*  320 */         for (int k = 0; k < 4; k++) {
/*  321 */           int m = 1;
/*  322 */           int n = b(i, 1, k);
/*  323 */           arrayOfV[n] = new bws.v(n);
/*      */         } 
/*      */       } 
/*  326 */       for (i = 1; i < 4; i++) {
/*  327 */         for (int k = 0; k < 2; k++) {
/*  328 */           int m = 2;
/*  329 */           int n = b(i, 2, k);
/*  330 */           arrayOfV[n] = new bws.v(n);
/*      */         } 
/*      */       } 
/*      */       
/*  334 */       this.p = arrayOfV[h];
/*      */       
/*  336 */       for (i = 0; i < 5; i++) {
/*  337 */         for (int k = 0; k < 5; k++) {
/*  338 */           for (int m = 0; m < 3; m++) {
/*  339 */             int n = b(i, m, k);
/*  340 */             if (arrayOfV[n] != null)
/*      */             {
/*      */               
/*  343 */               for (eq eq : eq.values()) {
/*  344 */                 int i1 = i + eq.g();
/*  345 */                 int i2 = m + eq.h();
/*  346 */                 int i3 = k + eq.i();
/*  347 */                 if (i1 >= 0 && i1 < 5 && i3 >= 0 && i3 < 5 && i2 >= 0 && i2 < 3) {
/*  348 */                   int i4 = b(i1, i2, i3);
/*  349 */                   if (arrayOfV[i4] != null)
/*      */                   {
/*      */                     
/*  352 */                     if (i3 == k) {
/*  353 */                       arrayOfV[n].a(eq, arrayOfV[i4]);
/*      */                     } else {
/*  355 */                       arrayOfV[n].a(eq.d(), arrayOfV[i4]);
/*      */                     }  } 
/*      */                 } 
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*  363 */       bws.v v1 = new bws.v(1003);
/*  364 */       bws.v v2 = new bws.v(1001);
/*  365 */       bws.v v3 = new bws.v(1002);
/*  366 */       arrayOfV[i].a(eq.b, v1);
/*  367 */       arrayOfV[j].a(eq.d, v2);
/*  368 */       arrayOfV[k].a(eq.d, v3);
/*  369 */       bws.v.a(v1, true);
/*  370 */       bws.v.a(v2, true);
/*  371 */       bws.v.a(v3, true);
/*  372 */       bws.v.b(this.p, true);
/*      */ 
/*      */       
/*  375 */       this.q = arrayOfV[b(☃.nextInt(4), 0, 2)];
/*  376 */       bws.v.a(this.q, true);
/*  377 */       bws.v.a(bws.v.c(this.q)[eq.f.a()], true);
/*  378 */       bws.v.a(bws.v.c(this.q)[eq.c.a()], true);
/*  379 */       bws.v.a(bws.v.c(bws.v.c(this.q)[eq.f.a()])[eq.c.a()], true);
/*  380 */       bws.v.a(bws.v.c(this.q)[eq.b.a()], true);
/*  381 */       bws.v.a(bws.v.c(bws.v.c(this.q)[eq.f.a()])[eq.b.a()], true);
/*  382 */       bws.v.a(bws.v.c(bws.v.c(this.q)[eq.c.a()])[eq.b.a()], true);
/*  383 */       bws.v.a(bws.v.c(bws.v.c(bws.v.c(this.q)[eq.f.a()])[eq.c.a()])[eq.b.a()], true);
/*      */       
/*  385 */       List<bws.v> list = Lists.newArrayList();
/*  386 */       for (bws.v v4 : arrayOfV) {
/*  387 */         if (v4 != null) {
/*  388 */           v4.a();
/*  389 */           list.add(v4);
/*      */         } 
/*      */       } 
/*  392 */       v1.a();
/*      */       
/*  394 */       Collections.shuffle(list, ☃);
/*  395 */       int j = 1;
/*  396 */       for (bws.v v4 : list) {
/*      */         
/*  398 */         int k = 0;
/*  399 */         int m = 0;
/*  400 */         while (k < 2 && m < 5) {
/*  401 */           m++;
/*      */           
/*  403 */           int n = ☃.nextInt(6);
/*  404 */           if (bws.v.d(v4)[n]) {
/*  405 */             int i1 = eq.a(n).d().a();
/*      */ 
/*      */             
/*  408 */             bws.v.d(v4)[n] = false;
/*  409 */             bws.v.d(bws.v.c(v4)[n])[i1] = false;
/*      */             
/*  411 */             if (v4.a(j++) && bws.v.c(v4)[n].a(j++)) {
/*  412 */               k++;
/*      */               continue;
/*      */             } 
/*  415 */             bws.v.d(v4)[n] = true;
/*  416 */             bws.v.d(bws.v.c(v4)[n])[i1] = true;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  421 */       list.add(v1);
/*  422 */       list.add(v2);
/*  423 */       list.add(v3);
/*      */       
/*  425 */       return list;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  430 */       int i = Math.max(☃.k(), 64) - this.n.b;
/*      */       
/*  432 */       a(☃, bwf1, 0, 0, 0, 58, i, 58);
/*      */ 
/*      */       
/*  435 */       a(false, 0, ☃, random, bwf1);
/*      */ 
/*      */       
/*  438 */       a(true, 33, ☃, random, bwf1);
/*      */ 
/*      */       
/*  441 */       a(☃, random, bwf1);
/*      */       
/*  443 */       b(☃, random, bwf1);
/*  444 */       c(☃, random, bwf1);
/*      */       
/*  446 */       d(☃, random, bwf1);
/*  447 */       e(☃, random, bwf1);
/*  448 */       f(☃, random, bwf1);
/*      */       
/*      */       int j;
/*  451 */       for (j = 0; j < 7; j++) {
/*  452 */         for (int k = 0; k < 7; ) {
/*  453 */           if (k == 0 && j == 3)
/*      */           {
/*  455 */             k = 6;
/*      */           }
/*      */           
/*  458 */           int m = j * 9;
/*  459 */           int n = k * 9;
/*  460 */           for (int i1 = 0; i1 < 4; i1++) {
/*  461 */             for (int i2 = 0; i2 < 4; i2++) {
/*  462 */               a(☃, b, m + i1, 0, n + i2, bwf1);
/*  463 */               b(☃, b, m + i1, -1, n + i2, bwf1);
/*      */             } 
/*      */           } 
/*      */           
/*  467 */           if (j == 0 || j == 6) {
/*  468 */             k++; continue;
/*      */           } 
/*  470 */           k += 6;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  476 */       for (j = 0; j < 5; j++) {
/*  477 */         a(☃, bwf1, -1 - j, 0 + j * 2, -1 - j, -1 - j, 23, 58 + j);
/*  478 */         a(☃, bwf1, 58 + j, 0 + j * 2, -1 - j, 58 + j, 23, 58 + j);
/*  479 */         a(☃, bwf1, 0 - j, 0 + j * 2, -1 - j, 57 + j, 23, -1 - j);
/*  480 */         a(☃, bwf1, 0 - j, 0 + j * 2, 58 + j, 57 + j, 23, 58 + j);
/*      */       } 
/*      */       
/*  483 */       for (bws.r r1 : this.r) {
/*  484 */         if (r1.d().a(bwf1)) {
/*  485 */           r1.a(☃, random, bwf1, axm1);
/*      */         }
/*      */       } 
/*      */       
/*  489 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     private void a(boolean ☃, int i, axz axz1, Random random, bwf bwf1) {
/*  494 */       int j = 24;
/*  495 */       if (a(bwf1, i, 0, i + 23, 20)) {
/*  496 */         a(axz1, bwf1, i + 0, 0, 0, i + 24, 0, 20, a, a, false);
/*      */         
/*  498 */         a(axz1, bwf1, i + 0, 1, 0, i + 24, 10, 20);
/*      */         int k;
/*  500 */         for (k = 0; k < 4; k++) {
/*  501 */           a(axz1, bwf1, i + k, k + 1, k, i + k, k + 1, 20, b, b, false);
/*  502 */           a(axz1, bwf1, i + k + 7, k + 5, k + 7, i + k + 7, k + 5, 20, b, b, false);
/*  503 */           a(axz1, bwf1, i + 17 - k, k + 5, k + 7, i + 17 - k, k + 5, 20, b, b, false);
/*  504 */           a(axz1, bwf1, i + 24 - k, k + 1, k, i + 24 - k, k + 1, 20, b, b, false);
/*      */           
/*  506 */           a(axz1, bwf1, i + k + 1, k + 1, k, i + 23 - k, k + 1, k, b, b, false);
/*  507 */           a(axz1, bwf1, i + k + 8, k + 5, k + 7, i + 16 - k, k + 5, k + 7, b, b, false);
/*      */         } 
/*  509 */         a(axz1, bwf1, i + 4, 4, 4, i + 6, 4, 20, a, a, false);
/*  510 */         a(axz1, bwf1, i + 7, 4, 4, i + 17, 4, 6, a, a, false);
/*  511 */         a(axz1, bwf1, i + 18, 4, 4, i + 20, 4, 20, a, a, false);
/*  512 */         a(axz1, bwf1, i + 11, 8, 11, i + 13, 8, 20, a, a, false);
/*  513 */         a(axz1, d, i + 12, 9, 12, bwf1);
/*  514 */         a(axz1, d, i + 12, 9, 15, bwf1);
/*  515 */         a(axz1, d, i + 12, 9, 18, bwf1);
/*      */         
/*  517 */         k = i + (☃ ? 19 : 5);
/*  518 */         int m = i + (☃ ? 5 : 19); int n;
/*  519 */         for (n = 20; n >= 5; n -= 3) {
/*  520 */           a(axz1, d, k, 5, n, bwf1);
/*      */         }
/*  522 */         for (n = 19; n >= 7; n -= 3) {
/*  523 */           a(axz1, d, m, 5, n, bwf1);
/*      */         }
/*  525 */         for (n = 0; n < 4; n++) {
/*  526 */           int i1 = ☃ ? (i + 24 - 17 - n * 3) : (i + 17 - n * 3);
/*  527 */           a(axz1, d, i1, 5, 5, bwf1);
/*      */         } 
/*  529 */         a(axz1, d, m, 5, 5, bwf1);
/*      */ 
/*      */         
/*  532 */         a(axz1, bwf1, i + 11, 1, 12, i + 13, 7, 12, a, a, false);
/*  533 */         a(axz1, bwf1, i + 12, 1, 11, i + 12, 7, 13, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     private void a(axz ☃, Random random, bwf bwf1) {
/*  539 */       if (a(bwf1, 22, 5, 35, 17)) {
/*      */         
/*  541 */         a(☃, bwf1, 25, 0, 0, 32, 8, 20);
/*      */ 
/*      */         
/*  544 */         for (int i = 0; i < 4; i++) {
/*  545 */           a(☃, bwf1, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, b, b, false);
/*  546 */           a(☃, bwf1, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, b, b, false);
/*  547 */           a(☃, b, 25, 5, 5 + i * 4, bwf1);
/*  548 */           a(☃, b, 26, 6, 5 + i * 4, bwf1);
/*  549 */           a(☃, e, 26, 5, 5 + i * 4, bwf1);
/*      */           
/*  551 */           a(☃, bwf1, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, b, b, false);
/*  552 */           a(☃, bwf1, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, b, b, false);
/*  553 */           a(☃, b, 32, 5, 5 + i * 4, bwf1);
/*  554 */           a(☃, b, 31, 6, 5 + i * 4, bwf1);
/*  555 */           a(☃, e, 31, 5, 5 + i * 4, bwf1);
/*      */           
/*  557 */           a(☃, bwf1, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, a, a, false);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void b(axz ☃, Random random, bwf bwf1) {
/*  565 */       if (a(bwf1, 15, 20, 42, 21)) {
/*  566 */         a(☃, bwf1, 15, 0, 21, 42, 0, 21, a, a, false);
/*      */         
/*  568 */         a(☃, bwf1, 26, 1, 21, 31, 3, 21);
/*      */ 
/*      */ 
/*      */         
/*  572 */         a(☃, bwf1, 21, 12, 21, 36, 12, 21, a, a, false);
/*  573 */         a(☃, bwf1, 17, 11, 21, 40, 11, 21, a, a, false);
/*  574 */         a(☃, bwf1, 16, 10, 21, 41, 10, 21, a, a, false);
/*  575 */         a(☃, bwf1, 15, 7, 21, 42, 9, 21, a, a, false);
/*  576 */         a(☃, bwf1, 16, 6, 21, 41, 6, 21, a, a, false);
/*  577 */         a(☃, bwf1, 17, 5, 21, 40, 5, 21, a, a, false);
/*  578 */         a(☃, bwf1, 21, 4, 21, 36, 4, 21, a, a, false);
/*  579 */         a(☃, bwf1, 22, 3, 21, 26, 3, 21, a, a, false);
/*  580 */         a(☃, bwf1, 31, 3, 21, 35, 3, 21, a, a, false);
/*  581 */         a(☃, bwf1, 23, 2, 21, 25, 2, 21, a, a, false);
/*  582 */         a(☃, bwf1, 32, 2, 21, 34, 2, 21, a, a, false);
/*      */ 
/*      */         
/*  585 */         a(☃, bwf1, 28, 4, 20, 29, 4, 21, b, b, false);
/*  586 */         a(☃, b, 27, 3, 21, bwf1);
/*  587 */         a(☃, b, 30, 3, 21, bwf1);
/*  588 */         a(☃, b, 26, 2, 21, bwf1);
/*  589 */         a(☃, b, 31, 2, 21, bwf1);
/*  590 */         a(☃, b, 25, 1, 21, bwf1);
/*  591 */         a(☃, b, 32, 1, 21, bwf1); int i;
/*  592 */         for (i = 0; i < 7; i++) {
/*  593 */           a(☃, c, 28 - i, 6 + i, 21, bwf1);
/*  594 */           a(☃, c, 29 + i, 6 + i, 21, bwf1);
/*      */         } 
/*  596 */         for (i = 0; i < 4; i++) {
/*  597 */           a(☃, c, 28 - i, 9 + i, 21, bwf1);
/*  598 */           a(☃, c, 29 + i, 9 + i, 21, bwf1);
/*      */         } 
/*  600 */         a(☃, c, 28, 12, 21, bwf1);
/*  601 */         a(☃, c, 29, 12, 21, bwf1);
/*  602 */         for (i = 0; i < 3; i++) {
/*  603 */           a(☃, c, 22 - i * 2, 8, 21, bwf1);
/*  604 */           a(☃, c, 22 - i * 2, 9, 21, bwf1);
/*      */           
/*  606 */           a(☃, c, 35 + i * 2, 8, 21, bwf1);
/*  607 */           a(☃, c, 35 + i * 2, 9, 21, bwf1);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  612 */         a(☃, bwf1, 15, 13, 21, 42, 15, 21);
/*  613 */         a(☃, bwf1, 15, 1, 21, 15, 6, 21);
/*  614 */         a(☃, bwf1, 16, 1, 21, 16, 5, 21);
/*  615 */         a(☃, bwf1, 17, 1, 21, 20, 4, 21);
/*  616 */         a(☃, bwf1, 21, 1, 21, 21, 3, 21);
/*  617 */         a(☃, bwf1, 22, 1, 21, 22, 2, 21);
/*  618 */         a(☃, bwf1, 23, 1, 21, 24, 1, 21);
/*  619 */         a(☃, bwf1, 42, 1, 21, 42, 6, 21);
/*  620 */         a(☃, bwf1, 41, 1, 21, 41, 5, 21);
/*  621 */         a(☃, bwf1, 37, 1, 21, 40, 4, 21);
/*  622 */         a(☃, bwf1, 36, 1, 21, 36, 3, 21);
/*  623 */         a(☃, bwf1, 33, 1, 21, 34, 1, 21);
/*  624 */         a(☃, bwf1, 35, 1, 21, 35, 2, 21);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private void c(axz ☃, Random random, bwf bwf1) {
/*  632 */       if (a(bwf1, 21, 21, 36, 36)) {
/*  633 */         a(☃, bwf1, 21, 0, 22, 36, 0, 36, a, a, false);
/*      */ 
/*      */ 
/*      */         
/*  637 */         a(☃, bwf1, 21, 1, 22, 36, 23, 36);
/*      */ 
/*      */         
/*  640 */         for (int i = 0; i < 4; i++) {
/*  641 */           a(☃, bwf1, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, b, b, false);
/*  642 */           a(☃, bwf1, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, b, b, false);
/*  643 */           a(☃, bwf1, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, b, b, false);
/*  644 */           a(☃, bwf1, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, b, b, false);
/*      */         } 
/*  646 */         a(☃, bwf1, 25, 16, 25, 32, 16, 32, a, a, false);
/*  647 */         a(☃, bwf1, 25, 17, 25, 25, 19, 25, b, b, false);
/*  648 */         a(☃, bwf1, 32, 17, 25, 32, 19, 25, b, b, false);
/*  649 */         a(☃, bwf1, 25, 17, 32, 25, 19, 32, b, b, false);
/*  650 */         a(☃, bwf1, 32, 17, 32, 32, 19, 32, b, b, false);
/*      */         
/*  652 */         a(☃, b, 26, 20, 26, bwf1);
/*  653 */         a(☃, b, 27, 21, 27, bwf1);
/*  654 */         a(☃, e, 27, 20, 27, bwf1);
/*  655 */         a(☃, b, 26, 20, 31, bwf1);
/*  656 */         a(☃, b, 27, 21, 30, bwf1);
/*  657 */         a(☃, e, 27, 20, 30, bwf1);
/*  658 */         a(☃, b, 31, 20, 31, bwf1);
/*  659 */         a(☃, b, 30, 21, 30, bwf1);
/*  660 */         a(☃, e, 30, 20, 30, bwf1);
/*  661 */         a(☃, b, 31, 20, 26, bwf1);
/*  662 */         a(☃, b, 30, 21, 27, bwf1);
/*  663 */         a(☃, e, 30, 20, 27, bwf1);
/*      */         
/*  665 */         a(☃, bwf1, 28, 21, 27, 29, 21, 27, a, a, false);
/*  666 */         a(☃, bwf1, 27, 21, 28, 27, 21, 29, a, a, false);
/*  667 */         a(☃, bwf1, 28, 21, 30, 29, 21, 30, a, a, false);
/*  668 */         a(☃, bwf1, 30, 21, 28, 30, 21, 29, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void d(axz ☃, Random random, bwf bwf1) {
/*  675 */       if (a(bwf1, 0, 21, 6, 58)) {
/*  676 */         a(☃, bwf1, 0, 0, 21, 6, 0, 57, a, a, false);
/*      */         
/*  678 */         a(☃, bwf1, 0, 1, 21, 6, 7, 57);
/*      */ 
/*      */         
/*  681 */         a(☃, bwf1, 4, 4, 21, 6, 4, 53, a, a, false); int i;
/*  682 */         for (i = 0; i < 4; i++) {
/*  683 */           a(☃, bwf1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*      */         }
/*  685 */         for (i = 23; i < 53; i += 3) {
/*  686 */           a(☃, d, 5, 5, i, bwf1);
/*      */         }
/*  688 */         a(☃, d, 5, 5, 52, bwf1);
/*      */         
/*  690 */         for (i = 0; i < 4; i++) {
/*  691 */           a(☃, bwf1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*      */         }
/*      */         
/*  694 */         a(☃, bwf1, 4, 1, 52, 6, 3, 52, a, a, false);
/*  695 */         a(☃, bwf1, 5, 1, 51, 5, 3, 53, a, a, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  700 */       if (a(bwf1, 51, 21, 58, 58)) {
/*  701 */         a(☃, bwf1, 51, 0, 21, 57, 0, 57, a, a, false);
/*      */         
/*  703 */         a(☃, bwf1, 51, 1, 21, 57, 7, 57);
/*      */ 
/*      */         
/*  706 */         a(☃, bwf1, 51, 4, 21, 53, 4, 53, a, a, false); int i;
/*  707 */         for (i = 0; i < 4; i++) {
/*  708 */           a(☃, bwf1, 57 - i, i + 1, 21, 57 - i, i + 1, 57 - i, b, b, false);
/*      */         }
/*  710 */         for (i = 23; i < 53; i += 3) {
/*  711 */           a(☃, d, 52, 5, i, bwf1);
/*      */         }
/*  713 */         a(☃, d, 52, 5, 52, bwf1);
/*      */ 
/*      */         
/*  716 */         a(☃, bwf1, 51, 1, 52, 53, 3, 52, a, a, false);
/*  717 */         a(☃, bwf1, 52, 1, 51, 52, 3, 53, a, a, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  722 */       if (a(bwf1, 0, 51, 57, 57)) {
/*  723 */         a(☃, bwf1, 7, 0, 51, 50, 0, 57, a, a, false);
/*      */         
/*  725 */         a(☃, bwf1, 7, 1, 51, 50, 10, 57);
/*      */ 
/*      */         
/*  728 */         for (int i = 0; i < 4; i++) {
/*  729 */           a(☃, bwf1, i + 1, i + 1, 57 - i, 56 - i, i + 1, 57 - i, b, b, false);
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void e(axz ☃, Random random, bwf bwf1) {
/*  737 */       if (a(bwf1, 7, 21, 13, 50)) {
/*  738 */         a(☃, bwf1, 7, 0, 21, 13, 0, 50, a, a, false);
/*      */         
/*  740 */         a(☃, bwf1, 7, 1, 21, 13, 10, 50);
/*      */ 
/*      */         
/*  743 */         a(☃, bwf1, 11, 8, 21, 13, 8, 53, a, a, false); int i;
/*  744 */         for (i = 0; i < 4; i++) {
/*  745 */           a(☃, bwf1, i + 7, i + 5, 21, i + 7, i + 5, 54, b, b, false);
/*      */         }
/*  747 */         for (i = 21; i <= 45; i += 3) {
/*  748 */           a(☃, d, 12, 9, i, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  754 */       if (a(bwf1, 44, 21, 50, 54)) {
/*  755 */         a(☃, bwf1, 44, 0, 21, 50, 0, 50, a, a, false);
/*      */         
/*  757 */         a(☃, bwf1, 44, 1, 21, 50, 10, 50);
/*      */ 
/*      */         
/*  760 */         a(☃, bwf1, 44, 8, 21, 46, 8, 53, a, a, false); int i;
/*  761 */         for (i = 0; i < 4; i++) {
/*  762 */           a(☃, bwf1, 50 - i, i + 5, 21, 50 - i, i + 5, 54, b, b, false);
/*      */         }
/*  764 */         for (i = 21; i <= 45; i += 3) {
/*  765 */           a(☃, d, 45, 9, i, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  771 */       if (a(bwf1, 8, 44, 49, 54)) {
/*  772 */         a(☃, bwf1, 14, 0, 44, 43, 0, 50, a, a, false);
/*      */         
/*  774 */         a(☃, bwf1, 14, 1, 44, 43, 10, 50);
/*      */         
/*      */         int i;
/*  777 */         for (i = 12; i <= 45; i += 3) {
/*  778 */           a(☃, d, i, 9, 45, bwf1);
/*  779 */           a(☃, d, i, 9, 52, bwf1);
/*  780 */           if (i == 12 || i == 18 || i == 24 || i == 33 || i == 39 || i == 45) {
/*  781 */             a(☃, d, i, 9, 47, bwf1);
/*  782 */             a(☃, d, i, 9, 50, bwf1);
/*  783 */             a(☃, d, i, 10, 45, bwf1);
/*  784 */             a(☃, d, i, 10, 46, bwf1);
/*  785 */             a(☃, d, i, 10, 51, bwf1);
/*  786 */             a(☃, d, i, 10, 52, bwf1);
/*  787 */             a(☃, d, i, 11, 47, bwf1);
/*  788 */             a(☃, d, i, 11, 50, bwf1);
/*  789 */             a(☃, d, i, 12, 48, bwf1);
/*  790 */             a(☃, d, i, 12, 49, bwf1);
/*      */           } 
/*      */         } 
/*      */         
/*  794 */         for (i = 0; i < 3; i++) {
/*  795 */           a(☃, bwf1, 8 + i, 5 + i, 54, 49 - i, 5 + i, 54, a, a, false);
/*      */         }
/*  797 */         a(☃, bwf1, 11, 8, 54, 46, 8, 54, b, b, false);
/*  798 */         a(☃, bwf1, 14, 8, 44, 43, 8, 53, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void f(axz ☃, Random random, bwf bwf1) {
/*  805 */       if (a(bwf1, 14, 21, 20, 43)) {
/*  806 */         a(☃, bwf1, 14, 0, 21, 20, 0, 43, a, a, false);
/*      */         
/*  808 */         a(☃, bwf1, 14, 1, 22, 20, 14, 43);
/*      */ 
/*      */         
/*  811 */         a(☃, bwf1, 18, 12, 22, 20, 12, 39, a, a, false);
/*  812 */         a(☃, bwf1, 18, 12, 21, 20, 12, 21, b, b, false); int i;
/*  813 */         for (i = 0; i < 4; i++) {
/*  814 */           a(☃, bwf1, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, b, b, false);
/*      */         }
/*  816 */         for (i = 23; i <= 39; i += 3) {
/*  817 */           a(☃, d, 19, 13, i, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  823 */       if (a(bwf1, 37, 21, 43, 43)) {
/*  824 */         a(☃, bwf1, 37, 0, 21, 43, 0, 43, a, a, false);
/*      */         
/*  826 */         a(☃, bwf1, 37, 1, 22, 43, 14, 43);
/*      */ 
/*      */         
/*  829 */         a(☃, bwf1, 37, 12, 22, 39, 12, 39, a, a, false);
/*  830 */         a(☃, bwf1, 37, 12, 21, 39, 12, 21, b, b, false); int i;
/*  831 */         for (i = 0; i < 4; i++) {
/*  832 */           a(☃, bwf1, 43 - i, i + 9, 21, 43 - i, i + 9, 43 - i, b, b, false);
/*      */         }
/*  834 */         for (i = 23; i <= 39; i += 3) {
/*  835 */           a(☃, d, 38, 13, i, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  841 */       if (a(bwf1, 15, 37, 42, 43)) {
/*  842 */         a(☃, bwf1, 21, 0, 37, 36, 0, 43, a, a, false);
/*      */         
/*  844 */         a(☃, bwf1, 21, 1, 37, 36, 14, 43);
/*      */ 
/*      */         
/*  847 */         a(☃, bwf1, 21, 12, 37, 36, 12, 39, a, a, false); int i;
/*  848 */         for (i = 0; i < 4; i++) {
/*  849 */           a(☃, bwf1, 15 + i, i + 9, 43 - i, 42 - i, i + 9, 43 - i, b, b, false);
/*      */         }
/*  851 */         for (i = 21; i <= 36; i += 3)
/*  852 */           a(☃, d, i, 13, 38, bwf1); 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public static class p
/*      */     extends r
/*      */   {
/*      */     public p() {}
/*      */     
/*      */     public p(eq ☃, bws.v v1) {
/*  863 */       super(1, ☃, v1, 1, 1, 1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  869 */       a(☃, bwf1, 0, 3, 0, 2, 3, 7, b, b, false);
/*  870 */       a(☃, bwf1, 5, 3, 0, 7, 3, 7, b, b, false);
/*  871 */       a(☃, bwf1, 0, 2, 0, 1, 2, 7, b, b, false);
/*  872 */       a(☃, bwf1, 6, 2, 0, 7, 2, 7, b, b, false);
/*  873 */       a(☃, bwf1, 0, 1, 0, 0, 1, 7, b, b, false);
/*  874 */       a(☃, bwf1, 7, 1, 0, 7, 1, 7, b, b, false);
/*      */ 
/*      */       
/*  877 */       a(☃, bwf1, 0, 1, 7, 7, 3, 7, b, b, false);
/*      */ 
/*      */       
/*  880 */       a(☃, bwf1, 1, 1, 0, 2, 3, 0, b, b, false);
/*  881 */       a(☃, bwf1, 5, 1, 0, 6, 3, 0, b, b, false);
/*      */       
/*  883 */       if (bws.v.d(this.l)[eq.c.a()]) {
/*  884 */         a(☃, bwf1, 3, 1, 7, 4, 2, 7);
/*      */       }
/*  886 */       if (bws.v.d(this.l)[eq.e.a()]) {
/*  887 */         a(☃, bwf1, 0, 1, 3, 1, 2, 4);
/*      */       }
/*  889 */       if (bws.v.d(this.l)[eq.f.a()]) {
/*  890 */         a(☃, bwf1, 6, 1, 3, 7, 2, 4);
/*      */       }
/*      */       
/*  893 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class s
/*      */     extends r {
/*      */     private int p;
/*      */     
/*      */     public s() {}
/*      */     
/*      */     public s(eq ☃, bws.v v1, Random random) {
/*  904 */       super(1, ☃, v1, 1, 1, 1);
/*  905 */       this.p = random.nextInt(3);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  910 */       if (bws.v.a(this.l) / 25 > 0) {
/*  911 */         a(☃, bwf1, 0, 0, bws.v.d(this.l)[eq.a.a()]);
/*      */       }
/*  913 */       if (bws.v.c(this.l)[eq.b.a()] == null) {
/*  914 */         a(☃, bwf1, 1, 4, 1, 6, 4, 6, a);
/*      */       }
/*      */       
/*  917 */       boolean bool = (this.p != 0 && random.nextBoolean() && !bws.v.d(this.l)[eq.a.a()] && !bws.v.d(this.l)[eq.b.a()] && this.l.c() > 1);
/*      */       
/*  919 */       if (this.p == 0) {
/*      */         
/*  921 */         a(☃, bwf1, 0, 1, 0, 2, 1, 2, b, b, false);
/*  922 */         a(☃, bwf1, 0, 3, 0, 2, 3, 2, b, b, false);
/*  923 */         a(☃, bwf1, 0, 2, 0, 0, 2, 2, a, a, false);
/*  924 */         a(☃, bwf1, 1, 2, 0, 2, 2, 0, a, a, false);
/*  925 */         a(☃, e, 1, 2, 1, bwf1);
/*      */ 
/*      */         
/*  928 */         a(☃, bwf1, 5, 1, 0, 7, 1, 2, b, b, false);
/*  929 */         a(☃, bwf1, 5, 3, 0, 7, 3, 2, b, b, false);
/*  930 */         a(☃, bwf1, 7, 2, 0, 7, 2, 2, a, a, false);
/*  931 */         a(☃, bwf1, 5, 2, 0, 6, 2, 0, a, a, false);
/*  932 */         a(☃, e, 6, 2, 1, bwf1);
/*      */ 
/*      */         
/*  935 */         a(☃, bwf1, 0, 1, 5, 2, 1, 7, b, b, false);
/*  936 */         a(☃, bwf1, 0, 3, 5, 2, 3, 7, b, b, false);
/*  937 */         a(☃, bwf1, 0, 2, 5, 0, 2, 7, a, a, false);
/*  938 */         a(☃, bwf1, 1, 2, 7, 2, 2, 7, a, a, false);
/*  939 */         a(☃, e, 1, 2, 6, bwf1);
/*      */ 
/*      */         
/*  942 */         a(☃, bwf1, 5, 1, 5, 7, 1, 7, b, b, false);
/*  943 */         a(☃, bwf1, 5, 3, 5, 7, 3, 7, b, b, false);
/*  944 */         a(☃, bwf1, 7, 2, 5, 7, 2, 7, a, a, false);
/*  945 */         a(☃, bwf1, 5, 2, 7, 6, 2, 7, a, a, false);
/*  946 */         a(☃, e, 6, 2, 6, bwf1);
/*      */         
/*  948 */         if (bws.v.d(this.l)[eq.d.a()]) {
/*  949 */           a(☃, bwf1, 3, 3, 0, 4, 3, 0, b, b, false);
/*      */         } else {
/*  951 */           a(☃, bwf1, 3, 3, 0, 4, 3, 1, b, b, false);
/*  952 */           a(☃, bwf1, 3, 2, 0, 4, 2, 0, a, a, false);
/*  953 */           a(☃, bwf1, 3, 1, 0, 4, 1, 1, b, b, false);
/*      */         } 
/*  955 */         if (bws.v.d(this.l)[eq.c.a()]) {
/*  956 */           a(☃, bwf1, 3, 3, 7, 4, 3, 7, b, b, false);
/*      */         } else {
/*  958 */           a(☃, bwf1, 3, 3, 6, 4, 3, 7, b, b, false);
/*  959 */           a(☃, bwf1, 3, 2, 7, 4, 2, 7, a, a, false);
/*  960 */           a(☃, bwf1, 3, 1, 6, 4, 1, 7, b, b, false);
/*      */         } 
/*  962 */         if (bws.v.d(this.l)[eq.e.a()]) {
/*  963 */           a(☃, bwf1, 0, 3, 3, 0, 3, 4, b, b, false);
/*      */         } else {
/*  965 */           a(☃, bwf1, 0, 3, 3, 1, 3, 4, b, b, false);
/*  966 */           a(☃, bwf1, 0, 2, 3, 0, 2, 4, a, a, false);
/*  967 */           a(☃, bwf1, 0, 1, 3, 1, 1, 4, b, b, false);
/*      */         } 
/*  969 */         if (bws.v.d(this.l)[eq.f.a()]) {
/*  970 */           a(☃, bwf1, 7, 3, 3, 7, 3, 4, b, b, false);
/*      */         } else {
/*  972 */           a(☃, bwf1, 6, 3, 3, 7, 3, 4, b, b, false);
/*  973 */           a(☃, bwf1, 7, 2, 3, 7, 2, 4, a, a, false);
/*  974 */           a(☃, bwf1, 6, 1, 3, 7, 1, 4, b, b, false);
/*      */         } 
/*  976 */       } else if (this.p == 1) {
/*      */         
/*  978 */         a(☃, bwf1, 2, 1, 2, 2, 3, 2, b, b, false);
/*  979 */         a(☃, bwf1, 2, 1, 5, 2, 3, 5, b, b, false);
/*  980 */         a(☃, bwf1, 5, 1, 5, 5, 3, 5, b, b, false);
/*  981 */         a(☃, bwf1, 5, 1, 2, 5, 3, 2, b, b, false);
/*  982 */         a(☃, e, 2, 2, 2, bwf1);
/*  983 */         a(☃, e, 2, 2, 5, bwf1);
/*  984 */         a(☃, e, 5, 2, 5, bwf1);
/*  985 */         a(☃, e, 5, 2, 2, bwf1);
/*      */ 
/*      */         
/*  988 */         a(☃, bwf1, 0, 1, 0, 1, 3, 0, b, b, false);
/*  989 */         a(☃, bwf1, 0, 1, 1, 0, 3, 1, b, b, false);
/*  990 */         a(☃, bwf1, 0, 1, 7, 1, 3, 7, b, b, false);
/*  991 */         a(☃, bwf1, 0, 1, 6, 0, 3, 6, b, b, false);
/*  992 */         a(☃, bwf1, 6, 1, 7, 7, 3, 7, b, b, false);
/*  993 */         a(☃, bwf1, 7, 1, 6, 7, 3, 6, b, b, false);
/*  994 */         a(☃, bwf1, 6, 1, 0, 7, 3, 0, b, b, false);
/*  995 */         a(☃, bwf1, 7, 1, 1, 7, 3, 1, b, b, false);
/*  996 */         a(☃, a, 1, 2, 0, bwf1);
/*  997 */         a(☃, a, 0, 2, 1, bwf1);
/*  998 */         a(☃, a, 1, 2, 7, bwf1);
/*  999 */         a(☃, a, 0, 2, 6, bwf1);
/* 1000 */         a(☃, a, 6, 2, 7, bwf1);
/* 1001 */         a(☃, a, 7, 2, 6, bwf1);
/* 1002 */         a(☃, a, 6, 2, 0, bwf1);
/* 1003 */         a(☃, a, 7, 2, 1, bwf1);
/* 1004 */         if (!bws.v.d(this.l)[eq.d.a()]) {
/* 1005 */           a(☃, bwf1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1006 */           a(☃, bwf1, 1, 2, 0, 6, 2, 0, a, a, false);
/* 1007 */           a(☃, bwf1, 1, 1, 0, 6, 1, 0, b, b, false);
/*      */         } 
/* 1009 */         if (!bws.v.d(this.l)[eq.c.a()]) {
/* 1010 */           a(☃, bwf1, 1, 3, 7, 6, 3, 7, b, b, false);
/* 1011 */           a(☃, bwf1, 1, 2, 7, 6, 2, 7, a, a, false);
/* 1012 */           a(☃, bwf1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */         } 
/* 1014 */         if (!bws.v.d(this.l)[eq.e.a()]) {
/* 1015 */           a(☃, bwf1, 0, 3, 1, 0, 3, 6, b, b, false);
/* 1016 */           a(☃, bwf1, 0, 2, 1, 0, 2, 6, a, a, false);
/* 1017 */           a(☃, bwf1, 0, 1, 1, 0, 1, 6, b, b, false);
/*      */         } 
/* 1019 */         if (!bws.v.d(this.l)[eq.f.a()]) {
/* 1020 */           a(☃, bwf1, 7, 3, 1, 7, 3, 6, b, b, false);
/* 1021 */           a(☃, bwf1, 7, 2, 1, 7, 2, 6, a, a, false);
/* 1022 */           a(☃, bwf1, 7, 1, 1, 7, 1, 6, b, b, false);
/*      */         } 
/* 1024 */       } else if (this.p == 2) {
/* 1025 */         a(☃, bwf1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1026 */         a(☃, bwf1, 7, 1, 0, 7, 1, 7, b, b, false);
/* 1027 */         a(☃, bwf1, 1, 1, 0, 6, 1, 0, b, b, false);
/* 1028 */         a(☃, bwf1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */         
/* 1030 */         a(☃, bwf1, 0, 2, 0, 0, 2, 7, c, c, false);
/* 1031 */         a(☃, bwf1, 7, 2, 0, 7, 2, 7, c, c, false);
/* 1032 */         a(☃, bwf1, 1, 2, 0, 6, 2, 0, c, c, false);
/* 1033 */         a(☃, bwf1, 1, 2, 7, 6, 2, 7, c, c, false);
/*      */         
/* 1035 */         a(☃, bwf1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1036 */         a(☃, bwf1, 7, 3, 0, 7, 3, 7, b, b, false);
/* 1037 */         a(☃, bwf1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1038 */         a(☃, bwf1, 1, 3, 7, 6, 3, 7, b, b, false);
/*      */         
/* 1040 */         a(☃, bwf1, 0, 1, 3, 0, 2, 4, c, c, false);
/* 1041 */         a(☃, bwf1, 7, 1, 3, 7, 2, 4, c, c, false);
/* 1042 */         a(☃, bwf1, 3, 1, 0, 4, 2, 0, c, c, false);
/* 1043 */         a(☃, bwf1, 3, 1, 7, 4, 2, 7, c, c, false);
/*      */         
/* 1045 */         if (bws.v.d(this.l)[eq.d.a()]) {
/* 1046 */           a(☃, bwf1, 3, 1, 0, 4, 2, 0);
/*      */         }
/* 1048 */         if (bws.v.d(this.l)[eq.c.a()]) {
/* 1049 */           a(☃, bwf1, 3, 1, 7, 4, 2, 7);
/*      */         }
/* 1051 */         if (bws.v.d(this.l)[eq.e.a()]) {
/* 1052 */           a(☃, bwf1, 0, 1, 3, 0, 2, 4);
/*      */         }
/* 1054 */         if (bws.v.d(this.l)[eq.f.a()]) {
/* 1055 */           a(☃, bwf1, 7, 1, 3, 7, 2, 4);
/*      */         }
/*      */       } 
/* 1058 */       if (bool) {
/* 1059 */         a(☃, bwf1, 3, 1, 3, 4, 1, 4, b, b, false);
/* 1060 */         a(☃, bwf1, 3, 2, 3, 4, 2, 4, a, a, false);
/* 1061 */         a(☃, bwf1, 3, 3, 3, 4, 3, 4, b, b, false);
/*      */       } 
/*      */       
/* 1064 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class t
/*      */     extends r
/*      */   {
/*      */     public t() {}
/*      */     
/*      */     public t(eq ☃, bws.v v1, Random random) {
/* 1074 */       super(1, ☃, v1, 1, 1, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1079 */       if (bws.v.a(this.l) / 25 > 0) {
/* 1080 */         a(☃, bwf1, 0, 0, bws.v.d(this.l)[eq.a.a()]);
/*      */       }
/* 1082 */       if (bws.v.c(this.l)[eq.b.a()] == null) {
/* 1083 */         a(☃, bwf1, 1, 4, 1, 6, 4, 6, a);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1088 */       for (int i = 1; i <= 6; i++) {
/* 1089 */         for (int j = 1; j <= 6; j++) {
/* 1090 */           if (random.nextInt(3) != 0) {
/* 1091 */             int k = 2 + ((random.nextInt(4) == 0) ? 0 : 1);
/* 1092 */             blc blc = bct.ao.p();
/* 1093 */             a(☃, bwf1, i, k, j, i, 3, j, blc, blc, false);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1098 */       a(☃, bwf1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1099 */       a(☃, bwf1, 7, 1, 0, 7, 1, 7, b, b, false);
/* 1100 */       a(☃, bwf1, 1, 1, 0, 6, 1, 0, b, b, false);
/* 1101 */       a(☃, bwf1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */       
/* 1103 */       a(☃, bwf1, 0, 2, 0, 0, 2, 7, c, c, false);
/* 1104 */       a(☃, bwf1, 7, 2, 0, 7, 2, 7, c, c, false);
/* 1105 */       a(☃, bwf1, 1, 2, 0, 6, 2, 0, c, c, false);
/* 1106 */       a(☃, bwf1, 1, 2, 7, 6, 2, 7, c, c, false);
/*      */       
/* 1108 */       a(☃, bwf1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1109 */       a(☃, bwf1, 7, 3, 0, 7, 3, 7, b, b, false);
/* 1110 */       a(☃, bwf1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1111 */       a(☃, bwf1, 1, 3, 7, 6, 3, 7, b, b, false);
/*      */       
/* 1113 */       a(☃, bwf1, 0, 1, 3, 0, 2, 4, c, c, false);
/* 1114 */       a(☃, bwf1, 7, 1, 3, 7, 2, 4, c, c, false);
/* 1115 */       a(☃, bwf1, 3, 1, 0, 4, 2, 0, c, c, false);
/* 1116 */       a(☃, bwf1, 3, 1, 7, 4, 2, 7, c, c, false);
/*      */       
/* 1118 */       if (bws.v.d(this.l)[eq.d.a()]) {
/* 1119 */         a(☃, bwf1, 3, 1, 0, 4, 2, 0);
/*      */       }
/*      */ 
/*      */       
/* 1123 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class m
/*      */     extends r
/*      */   {
/*      */     public m() {}
/*      */     
/*      */     public m(eq ☃, bws.v v1, Random random) {
/* 1133 */       super(1, ☃, v1, 1, 2, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1138 */       if (bws.v.a(this.l) / 25 > 0) {
/* 1139 */         a(☃, bwf1, 0, 0, bws.v.d(this.l)[eq.a.a()]);
/*      */       }
/* 1141 */       bws.v v1 = bws.v.c(this.l)[eq.b.a()];
/* 1142 */       if (bws.v.c(v1)[eq.b.a()] == null) {
/* 1143 */         a(☃, bwf1, 1, 8, 1, 6, 8, 6, a);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1148 */       a(☃, bwf1, 0, 4, 0, 0, 4, 7, b, b, false);
/* 1149 */       a(☃, bwf1, 7, 4, 0, 7, 4, 7, b, b, false);
/* 1150 */       a(☃, bwf1, 1, 4, 0, 6, 4, 0, b, b, false);
/* 1151 */       a(☃, bwf1, 1, 4, 7, 6, 4, 7, b, b, false);
/*      */       
/* 1153 */       a(☃, bwf1, 2, 4, 1, 2, 4, 2, b, b, false);
/* 1154 */       a(☃, bwf1, 1, 4, 2, 1, 4, 2, b, b, false);
/* 1155 */       a(☃, bwf1, 5, 4, 1, 5, 4, 2, b, b, false);
/* 1156 */       a(☃, bwf1, 6, 4, 2, 6, 4, 2, b, b, false);
/* 1157 */       a(☃, bwf1, 2, 4, 5, 2, 4, 6, b, b, false);
/* 1158 */       a(☃, bwf1, 1, 4, 5, 1, 4, 5, b, b, false);
/* 1159 */       a(☃, bwf1, 5, 4, 5, 5, 4, 6, b, b, false);
/* 1160 */       a(☃, bwf1, 6, 4, 5, 6, 4, 5, b, b, false);
/*      */       
/* 1162 */       bws.v v2 = this.l;
/* 1163 */       for (int i = 1; i <= 5; i += 4) {
/* 1164 */         int j = 0;
/* 1165 */         if (bws.v.d(v2)[eq.d.a()]) {
/* 1166 */           a(☃, bwf1, 2, i, j, 2, i + 2, j, b, b, false);
/* 1167 */           a(☃, bwf1, 5, i, j, 5, i + 2, j, b, b, false);
/* 1168 */           a(☃, bwf1, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*      */         } else {
/* 1170 */           a(☃, bwf1, 0, i, j, 7, i + 2, j, b, b, false);
/* 1171 */           a(☃, bwf1, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*      */         } 
/* 1173 */         j = 7;
/* 1174 */         if (bws.v.d(v2)[eq.c.a()]) {
/* 1175 */           a(☃, bwf1, 2, i, j, 2, i + 2, j, b, b, false);
/* 1176 */           a(☃, bwf1, 5, i, j, 5, i + 2, j, b, b, false);
/* 1177 */           a(☃, bwf1, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*      */         } else {
/* 1179 */           a(☃, bwf1, 0, i, j, 7, i + 2, j, b, b, false);
/* 1180 */           a(☃, bwf1, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*      */         } 
/* 1182 */         int k = 0;
/* 1183 */         if (bws.v.d(v2)[eq.e.a()]) {
/* 1184 */           a(☃, bwf1, k, i, 2, k, i + 2, 2, b, b, false);
/* 1185 */           a(☃, bwf1, k, i, 5, k, i + 2, 5, b, b, false);
/* 1186 */           a(☃, bwf1, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*      */         } else {
/* 1188 */           a(☃, bwf1, k, i, 0, k, i + 2, 7, b, b, false);
/* 1189 */           a(☃, bwf1, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*      */         } 
/* 1191 */         k = 7;
/* 1192 */         if (bws.v.d(v2)[eq.f.a()]) {
/* 1193 */           a(☃, bwf1, k, i, 2, k, i + 2, 2, b, b, false);
/* 1194 */           a(☃, bwf1, k, i, 5, k, i + 2, 5, b, b, false);
/* 1195 */           a(☃, bwf1, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*      */         } else {
/* 1197 */           a(☃, bwf1, k, i, 0, k, i + 2, 7, b, b, false);
/* 1198 */           a(☃, bwf1, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*      */         } 
/* 1200 */         v2 = v1;
/*      */       } 
/*      */ 
/*      */       
/* 1204 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class k
/*      */     extends r
/*      */   {
/*      */     public k() {}
/*      */     
/*      */     public k(eq ☃, bws.v v1, Random random) {
/* 1214 */       super(1, ☃, v1, 2, 1, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1219 */       bws.v v1 = bws.v.c(this.l)[eq.f.a()];
/* 1220 */       bws.v v2 = this.l;
/* 1221 */       if (bws.v.a(this.l) / 25 > 0) {
/* 1222 */         a(☃, bwf1, 8, 0, bws.v.d(v1)[eq.a.a()]);
/* 1223 */         a(☃, bwf1, 0, 0, bws.v.d(v2)[eq.a.a()]);
/*      */       } 
/* 1225 */       if (bws.v.c(v2)[eq.b.a()] == null) {
/* 1226 */         a(☃, bwf1, 1, 4, 1, 7, 4, 6, a);
/*      */       }
/* 1228 */       if (bws.v.c(v1)[eq.b.a()] == null) {
/* 1229 */         a(☃, bwf1, 8, 4, 1, 14, 4, 6, a);
/*      */       }
/*      */ 
/*      */       
/* 1233 */       a(☃, bwf1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1234 */       a(☃, bwf1, 15, 3, 0, 15, 3, 7, b, b, false);
/* 1235 */       a(☃, bwf1, 1, 3, 0, 15, 3, 0, b, b, false);
/* 1236 */       a(☃, bwf1, 1, 3, 7, 14, 3, 7, b, b, false);
/* 1237 */       a(☃, bwf1, 0, 2, 0, 0, 2, 7, a, a, false);
/* 1238 */       a(☃, bwf1, 15, 2, 0, 15, 2, 7, a, a, false);
/* 1239 */       a(☃, bwf1, 1, 2, 0, 15, 2, 0, a, a, false);
/* 1240 */       a(☃, bwf1, 1, 2, 7, 14, 2, 7, a, a, false);
/* 1241 */       a(☃, bwf1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1242 */       a(☃, bwf1, 15, 1, 0, 15, 1, 7, b, b, false);
/* 1243 */       a(☃, bwf1, 1, 1, 0, 15, 1, 0, b, b, false);
/* 1244 */       a(☃, bwf1, 1, 1, 7, 14, 1, 7, b, b, false);
/*      */ 
/*      */       
/* 1247 */       a(☃, bwf1, 5, 1, 0, 10, 1, 4, b, b, false);
/* 1248 */       a(☃, bwf1, 6, 2, 0, 9, 2, 3, a, a, false);
/* 1249 */       a(☃, bwf1, 5, 3, 0, 10, 3, 4, b, b, false);
/*      */       
/* 1251 */       a(☃, e, 6, 2, 3, bwf1);
/* 1252 */       a(☃, e, 9, 2, 3, bwf1);
/*      */ 
/*      */       
/* 1255 */       if (bws.v.d(v2)[eq.d.a()]) {
/* 1256 */         a(☃, bwf1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1258 */       if (bws.v.d(v2)[eq.c.a()]) {
/* 1259 */         a(☃, bwf1, 3, 1, 7, 4, 2, 7);
/*      */       }
/* 1261 */       if (bws.v.d(v2)[eq.e.a()]) {
/* 1262 */         a(☃, bwf1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1264 */       if (bws.v.d(v1)[eq.d.a()]) {
/* 1265 */         a(☃, bwf1, 11, 1, 0, 12, 2, 0);
/*      */       }
/* 1267 */       if (bws.v.d(v1)[eq.c.a()]) {
/* 1268 */         a(☃, bwf1, 11, 1, 7, 12, 2, 7);
/*      */       }
/* 1270 */       if (bws.v.d(v1)[eq.f.a()]) {
/* 1271 */         a(☃, bwf1, 15, 1, 3, 15, 2, 4);
/*      */       }
/*      */       
/* 1274 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class o
/*      */     extends r
/*      */   {
/*      */     public o() {}
/*      */     
/*      */     public o(eq ☃, bws.v v1, Random random) {
/* 1284 */       super(1, ☃, v1, 1, 1, 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1289 */       bws.v v1 = bws.v.c(this.l)[eq.c.a()];
/* 1290 */       bws.v v2 = this.l;
/* 1291 */       if (bws.v.a(this.l) / 25 > 0) {
/* 1292 */         a(☃, bwf1, 0, 8, bws.v.d(v1)[eq.a.a()]);
/* 1293 */         a(☃, bwf1, 0, 0, bws.v.d(v2)[eq.a.a()]);
/*      */       } 
/* 1295 */       if (bws.v.c(v2)[eq.b.a()] == null) {
/* 1296 */         a(☃, bwf1, 1, 4, 1, 6, 4, 7, a);
/*      */       }
/* 1298 */       if (bws.v.c(v1)[eq.b.a()] == null) {
/* 1299 */         a(☃, bwf1, 1, 4, 8, 6, 4, 14, a);
/*      */       }
/*      */ 
/*      */       
/* 1303 */       a(☃, bwf1, 0, 3, 0, 0, 3, 15, b, b, false);
/* 1304 */       a(☃, bwf1, 7, 3, 0, 7, 3, 15, b, b, false);
/* 1305 */       a(☃, bwf1, 1, 3, 0, 7, 3, 0, b, b, false);
/* 1306 */       a(☃, bwf1, 1, 3, 15, 6, 3, 15, b, b, false);
/* 1307 */       a(☃, bwf1, 0, 2, 0, 0, 2, 15, a, a, false);
/* 1308 */       a(☃, bwf1, 7, 2, 0, 7, 2, 15, a, a, false);
/* 1309 */       a(☃, bwf1, 1, 2, 0, 7, 2, 0, a, a, false);
/* 1310 */       a(☃, bwf1, 1, 2, 15, 6, 2, 15, a, a, false);
/* 1311 */       a(☃, bwf1, 0, 1, 0, 0, 1, 15, b, b, false);
/* 1312 */       a(☃, bwf1, 7, 1, 0, 7, 1, 15, b, b, false);
/* 1313 */       a(☃, bwf1, 1, 1, 0, 7, 1, 0, b, b, false);
/* 1314 */       a(☃, bwf1, 1, 1, 15, 6, 1, 15, b, b, false);
/*      */ 
/*      */       
/* 1317 */       a(☃, bwf1, 1, 1, 1, 1, 1, 2, b, b, false);
/* 1318 */       a(☃, bwf1, 6, 1, 1, 6, 1, 2, b, b, false);
/* 1319 */       a(☃, bwf1, 1, 3, 1, 1, 3, 2, b, b, false);
/* 1320 */       a(☃, bwf1, 6, 3, 1, 6, 3, 2, b, b, false);
/* 1321 */       a(☃, bwf1, 1, 1, 13, 1, 1, 14, b, b, false);
/* 1322 */       a(☃, bwf1, 6, 1, 13, 6, 1, 14, b, b, false);
/* 1323 */       a(☃, bwf1, 1, 3, 13, 1, 3, 14, b, b, false);
/* 1324 */       a(☃, bwf1, 6, 3, 13, 6, 3, 14, b, b, false);
/*      */ 
/*      */       
/* 1327 */       a(☃, bwf1, 2, 1, 6, 2, 3, 6, b, b, false);
/* 1328 */       a(☃, bwf1, 5, 1, 6, 5, 3, 6, b, b, false);
/* 1329 */       a(☃, bwf1, 2, 1, 9, 2, 3, 9, b, b, false);
/* 1330 */       a(☃, bwf1, 5, 1, 9, 5, 3, 9, b, b, false);
/*      */       
/* 1332 */       a(☃, bwf1, 3, 2, 6, 4, 2, 6, b, b, false);
/* 1333 */       a(☃, bwf1, 3, 2, 9, 4, 2, 9, b, b, false);
/* 1334 */       a(☃, bwf1, 2, 2, 7, 2, 2, 8, b, b, false);
/* 1335 */       a(☃, bwf1, 5, 2, 7, 5, 2, 8, b, b, false);
/*      */       
/* 1337 */       a(☃, e, 2, 2, 5, bwf1);
/* 1338 */       a(☃, e, 5, 2, 5, bwf1);
/* 1339 */       a(☃, e, 2, 2, 10, bwf1);
/* 1340 */       a(☃, e, 5, 2, 10, bwf1);
/* 1341 */       a(☃, b, 2, 3, 5, bwf1);
/* 1342 */       a(☃, b, 5, 3, 5, bwf1);
/* 1343 */       a(☃, b, 2, 3, 10, bwf1);
/* 1344 */       a(☃, b, 5, 3, 10, bwf1);
/*      */ 
/*      */       
/* 1347 */       if (bws.v.d(v2)[eq.d.a()]) {
/* 1348 */         a(☃, bwf1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1350 */       if (bws.v.d(v2)[eq.f.a()]) {
/* 1351 */         a(☃, bwf1, 7, 1, 3, 7, 2, 4);
/*      */       }
/* 1353 */       if (bws.v.d(v2)[eq.e.a()]) {
/* 1354 */         a(☃, bwf1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1356 */       if (bws.v.d(v1)[eq.c.a()]) {
/* 1357 */         a(☃, bwf1, 3, 1, 15, 4, 2, 15);
/*      */       }
/* 1359 */       if (bws.v.d(v1)[eq.e.a()]) {
/* 1360 */         a(☃, bwf1, 0, 1, 11, 0, 2, 12);
/*      */       }
/* 1362 */       if (bws.v.d(v1)[eq.f.a()]) {
/* 1363 */         a(☃, bwf1, 7, 1, 11, 7, 2, 12);
/*      */       }
/*      */       
/* 1366 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class l
/*      */     extends r
/*      */   {
/*      */     public l() {}
/*      */     
/*      */     public l(eq ☃, bws.v v1, Random random) {
/* 1376 */       super(1, ☃, v1, 2, 2, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1381 */       bws.v v1 = bws.v.c(this.l)[eq.f.a()];
/* 1382 */       bws.v v2 = this.l;
/* 1383 */       bws.v v3 = bws.v.c(v2)[eq.b.a()];
/* 1384 */       bws.v v4 = bws.v.c(v1)[eq.b.a()];
/*      */       
/* 1386 */       if (bws.v.a(this.l) / 25 > 0) {
/* 1387 */         a(☃, bwf1, 8, 0, bws.v.d(v1)[eq.a.a()]);
/* 1388 */         a(☃, bwf1, 0, 0, bws.v.d(v2)[eq.a.a()]);
/*      */       } 
/* 1390 */       if (bws.v.c(v3)[eq.b.a()] == null) {
/* 1391 */         a(☃, bwf1, 1, 8, 1, 7, 8, 6, a);
/*      */       }
/* 1393 */       if (bws.v.c(v4)[eq.b.a()] == null) {
/* 1394 */         a(☃, bwf1, 8, 8, 1, 14, 8, 6, a);
/*      */       }
/*      */ 
/*      */       
/* 1398 */       for (int i = 1; i <= 7; i++) {
/* 1399 */         blc blc = b;
/* 1400 */         if (i == 2 || i == 6) {
/* 1401 */           blc = a;
/*      */         }
/* 1403 */         a(☃, bwf1, 0, i, 0, 0, i, 7, blc, blc, false);
/* 1404 */         a(☃, bwf1, 15, i, 0, 15, i, 7, blc, blc, false);
/* 1405 */         a(☃, bwf1, 1, i, 0, 15, i, 0, blc, blc, false);
/* 1406 */         a(☃, bwf1, 1, i, 7, 14, i, 7, blc, blc, false);
/*      */       } 
/*      */ 
/*      */       
/* 1410 */       a(☃, bwf1, 2, 1, 3, 2, 7, 4, b, b, false);
/* 1411 */       a(☃, bwf1, 3, 1, 2, 4, 7, 2, b, b, false);
/* 1412 */       a(☃, bwf1, 3, 1, 5, 4, 7, 5, b, b, false);
/* 1413 */       a(☃, bwf1, 13, 1, 3, 13, 7, 4, b, b, false);
/* 1414 */       a(☃, bwf1, 11, 1, 2, 12, 7, 2, b, b, false);
/* 1415 */       a(☃, bwf1, 11, 1, 5, 12, 7, 5, b, b, false);
/*      */       
/* 1417 */       a(☃, bwf1, 5, 1, 3, 5, 3, 4, b, b, false);
/* 1418 */       a(☃, bwf1, 10, 1, 3, 10, 3, 4, b, b, false);
/*      */       
/* 1420 */       a(☃, bwf1, 5, 7, 2, 10, 7, 5, b, b, false);
/* 1421 */       a(☃, bwf1, 5, 5, 2, 5, 7, 2, b, b, false);
/* 1422 */       a(☃, bwf1, 10, 5, 2, 10, 7, 2, b, b, false);
/* 1423 */       a(☃, bwf1, 5, 5, 5, 5, 7, 5, b, b, false);
/* 1424 */       a(☃, bwf1, 10, 5, 5, 10, 7, 5, b, b, false);
/* 1425 */       a(☃, b, 6, 6, 2, bwf1);
/* 1426 */       a(☃, b, 9, 6, 2, bwf1);
/* 1427 */       a(☃, b, 6, 6, 5, bwf1);
/* 1428 */       a(☃, b, 9, 6, 5, bwf1);
/*      */       
/* 1430 */       a(☃, bwf1, 5, 4, 3, 6, 4, 4, b, b, false);
/* 1431 */       a(☃, bwf1, 9, 4, 3, 10, 4, 4, b, b, false);
/* 1432 */       a(☃, e, 5, 4, 2, bwf1);
/* 1433 */       a(☃, e, 5, 4, 5, bwf1);
/* 1434 */       a(☃, e, 10, 4, 2, bwf1);
/* 1435 */       a(☃, e, 10, 4, 5, bwf1);
/*      */ 
/*      */       
/* 1438 */       if (bws.v.d(v2)[eq.d.a()]) {
/* 1439 */         a(☃, bwf1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1441 */       if (bws.v.d(v2)[eq.c.a()]) {
/* 1442 */         a(☃, bwf1, 3, 1, 7, 4, 2, 7);
/*      */       }
/* 1444 */       if (bws.v.d(v2)[eq.e.a()]) {
/* 1445 */         a(☃, bwf1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1447 */       if (bws.v.d(v1)[eq.d.a()]) {
/* 1448 */         a(☃, bwf1, 11, 1, 0, 12, 2, 0);
/*      */       }
/* 1450 */       if (bws.v.d(v1)[eq.c.a()]) {
/* 1451 */         a(☃, bwf1, 11, 1, 7, 12, 2, 7);
/*      */       }
/* 1453 */       if (bws.v.d(v1)[eq.f.a()]) {
/* 1454 */         a(☃, bwf1, 15, 1, 3, 15, 2, 4);
/*      */       }
/* 1456 */       if (bws.v.d(v3)[eq.d.a()]) {
/* 1457 */         a(☃, bwf1, 3, 5, 0, 4, 6, 0);
/*      */       }
/* 1459 */       if (bws.v.d(v3)[eq.c.a()]) {
/* 1460 */         a(☃, bwf1, 3, 5, 7, 4, 6, 7);
/*      */       }
/* 1462 */       if (bws.v.d(v3)[eq.e.a()]) {
/* 1463 */         a(☃, bwf1, 0, 5, 3, 0, 6, 4);
/*      */       }
/* 1465 */       if (bws.v.d(v4)[eq.d.a()]) {
/* 1466 */         a(☃, bwf1, 11, 5, 0, 12, 6, 0);
/*      */       }
/* 1468 */       if (bws.v.d(v4)[eq.c.a()]) {
/* 1469 */         a(☃, bwf1, 11, 5, 7, 12, 6, 7);
/*      */       }
/* 1471 */       if (bws.v.d(v4)[eq.f.a()]) {
/* 1472 */         a(☃, bwf1, 15, 5, 3, 15, 6, 4);
/*      */       }
/*      */       
/* 1475 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class n
/*      */     extends r
/*      */   {
/*      */     public n() {}
/*      */     
/*      */     public n(eq ☃, bws.v v1, Random random) {
/* 1485 */       super(1, ☃, v1, 1, 2, 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1490 */       bws.v v1 = bws.v.c(this.l)[eq.c.a()];
/* 1491 */       bws.v v2 = this.l;
/* 1492 */       bws.v v3 = bws.v.c(v1)[eq.b.a()];
/* 1493 */       bws.v v4 = bws.v.c(v2)[eq.b.a()];
/* 1494 */       if (bws.v.a(this.l) / 25 > 0) {
/* 1495 */         a(☃, bwf1, 0, 8, bws.v.d(v1)[eq.a.a()]);
/* 1496 */         a(☃, bwf1, 0, 0, bws.v.d(v2)[eq.a.a()]);
/*      */       } 
/* 1498 */       if (bws.v.c(v4)[eq.b.a()] == null) {
/* 1499 */         a(☃, bwf1, 1, 8, 1, 6, 8, 7, a);
/*      */       }
/* 1501 */       if (bws.v.c(v3)[eq.b.a()] == null) {
/* 1502 */         a(☃, bwf1, 1, 8, 8, 6, 8, 14, a);
/*      */       }
/*      */       
/*      */       int i;
/* 1506 */       for (i = 1; i <= 7; i++) {
/* 1507 */         blc blc = b;
/* 1508 */         if (i == 2 || i == 6) {
/* 1509 */           blc = a;
/*      */         }
/* 1511 */         a(☃, bwf1, 0, i, 0, 0, i, 15, blc, blc, false);
/* 1512 */         a(☃, bwf1, 7, i, 0, 7, i, 15, blc, blc, false);
/* 1513 */         a(☃, bwf1, 1, i, 0, 6, i, 0, blc, blc, false);
/* 1514 */         a(☃, bwf1, 1, i, 15, 6, i, 15, blc, blc, false);
/*      */       } 
/*      */ 
/*      */       
/* 1518 */       for (i = 1; i <= 7; i++) {
/* 1519 */         blc blc = c;
/* 1520 */         if (i == 2 || i == 6) {
/* 1521 */           blc = e;
/*      */         }
/* 1523 */         a(☃, bwf1, 3, i, 7, 4, i, 8, blc, blc, false);
/*      */       } 
/*      */ 
/*      */       
/* 1527 */       if (bws.v.d(v2)[eq.d.a()]) {
/* 1528 */         a(☃, bwf1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1530 */       if (bws.v.d(v2)[eq.f.a()]) {
/* 1531 */         a(☃, bwf1, 7, 1, 3, 7, 2, 4);
/*      */       }
/* 1533 */       if (bws.v.d(v2)[eq.e.a()]) {
/* 1534 */         a(☃, bwf1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1536 */       if (bws.v.d(v1)[eq.c.a()]) {
/* 1537 */         a(☃, bwf1, 3, 1, 15, 4, 2, 15);
/*      */       }
/* 1539 */       if (bws.v.d(v1)[eq.e.a()]) {
/* 1540 */         a(☃, bwf1, 0, 1, 11, 0, 2, 12);
/*      */       }
/* 1542 */       if (bws.v.d(v1)[eq.f.a()]) {
/* 1543 */         a(☃, bwf1, 7, 1, 11, 7, 2, 12);
/*      */       }
/*      */       
/* 1546 */       if (bws.v.d(v4)[eq.d.a()]) {
/* 1547 */         a(☃, bwf1, 3, 5, 0, 4, 6, 0);
/*      */       }
/* 1549 */       if (bws.v.d(v4)[eq.f.a()]) {
/* 1550 */         a(☃, bwf1, 7, 5, 3, 7, 6, 4);
/* 1551 */         a(☃, bwf1, 5, 4, 2, 6, 4, 5, b, b, false);
/* 1552 */         a(☃, bwf1, 6, 1, 2, 6, 3, 2, b, b, false);
/* 1553 */         a(☃, bwf1, 6, 1, 5, 6, 3, 5, b, b, false);
/*      */       } 
/* 1555 */       if (bws.v.d(v4)[eq.e.a()]) {
/* 1556 */         a(☃, bwf1, 0, 5, 3, 0, 6, 4);
/* 1557 */         a(☃, bwf1, 1, 4, 2, 2, 4, 5, b, b, false);
/* 1558 */         a(☃, bwf1, 1, 1, 2, 1, 3, 2, b, b, false);
/* 1559 */         a(☃, bwf1, 1, 1, 5, 1, 3, 5, b, b, false);
/*      */       } 
/* 1561 */       if (bws.v.d(v3)[eq.c.a()]) {
/* 1562 */         a(☃, bwf1, 3, 5, 15, 4, 6, 15);
/*      */       }
/* 1564 */       if (bws.v.d(v3)[eq.e.a()]) {
/* 1565 */         a(☃, bwf1, 0, 5, 11, 0, 6, 12);
/* 1566 */         a(☃, bwf1, 1, 4, 10, 2, 4, 13, b, b, false);
/* 1567 */         a(☃, bwf1, 1, 1, 10, 1, 3, 10, b, b, false);
/* 1568 */         a(☃, bwf1, 1, 1, 13, 1, 3, 13, b, b, false);
/*      */       } 
/* 1570 */       if (bws.v.d(v3)[eq.f.a()]) {
/* 1571 */         a(☃, bwf1, 7, 5, 11, 7, 6, 12);
/* 1572 */         a(☃, bwf1, 5, 4, 10, 6, 4, 13, b, b, false);
/* 1573 */         a(☃, bwf1, 6, 1, 10, 6, 3, 10, b, b, false);
/* 1574 */         a(☃, bwf1, 6, 1, 13, 6, 3, 13, b, b, false);
/*      */       } 
/*      */       
/* 1577 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class j
/*      */     extends r
/*      */   {
/*      */     public j() {}
/*      */     
/*      */     public j(eq ☃, bws.v v1, Random random) {
/* 1587 */       super(1, ☃, v1, 2, 2, 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1592 */       a(☃, bwf1, 1, 8, 0, 14, 8, 14, a);
/*      */ 
/*      */ 
/*      */       
/* 1596 */       int i = 7;
/* 1597 */       blc blc = b;
/* 1598 */       a(☃, bwf1, 0, 7, 0, 0, 7, 15, blc, blc, false);
/* 1599 */       a(☃, bwf1, 15, 7, 0, 15, 7, 15, blc, blc, false);
/* 1600 */       a(☃, bwf1, 1, 7, 0, 15, 7, 0, blc, blc, false);
/* 1601 */       a(☃, bwf1, 1, 7, 15, 14, 7, 15, blc, blc, false);
/*      */       
/* 1603 */       for (i = 1; i <= 6; i++) {
/* 1604 */         blc = b;
/* 1605 */         if (i == 2 || i == 6) {
/* 1606 */           blc = a;
/*      */         }
/*      */         
/* 1609 */         for (int k = 0; k <= 15; k += 15) {
/* 1610 */           a(☃, bwf1, k, i, 0, k, i, 1, blc, blc, false);
/* 1611 */           a(☃, bwf1, k, i, 6, k, i, 9, blc, blc, false);
/* 1612 */           a(☃, bwf1, k, i, 14, k, i, 15, blc, blc, false);
/*      */         } 
/* 1614 */         a(☃, bwf1, 1, i, 0, 1, i, 0, blc, blc, false);
/* 1615 */         a(☃, bwf1, 6, i, 0, 9, i, 0, blc, blc, false);
/* 1616 */         a(☃, bwf1, 14, i, 0, 14, i, 0, blc, blc, false);
/*      */         
/* 1618 */         a(☃, bwf1, 1, i, 15, 14, i, 15, blc, blc, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1623 */       a(☃, bwf1, 6, 3, 6, 9, 6, 9, c, c, false);
/* 1624 */       a(☃, bwf1, 7, 4, 7, 8, 5, 8, bct.bB.p(), bct.bB.p(), false);
/* 1625 */       for (i = 3; i <= 6; i += 3) {
/* 1626 */         for (int k = 6; k <= 9; k += 3) {
/* 1627 */           a(☃, e, k, i, 6, bwf1);
/* 1628 */           a(☃, e, k, i, 9, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1632 */       a(☃, bwf1, 5, 1, 6, 5, 2, 6, b, b, false);
/* 1633 */       a(☃, bwf1, 5, 1, 9, 5, 2, 9, b, b, false);
/* 1634 */       a(☃, bwf1, 10, 1, 6, 10, 2, 6, b, b, false);
/* 1635 */       a(☃, bwf1, 10, 1, 9, 10, 2, 9, b, b, false);
/* 1636 */       a(☃, bwf1, 6, 1, 5, 6, 2, 5, b, b, false);
/* 1637 */       a(☃, bwf1, 9, 1, 5, 9, 2, 5, b, b, false);
/* 1638 */       a(☃, bwf1, 6, 1, 10, 6, 2, 10, b, b, false);
/* 1639 */       a(☃, bwf1, 9, 1, 10, 9, 2, 10, b, b, false);
/*      */       
/* 1641 */       a(☃, bwf1, 5, 2, 5, 5, 6, 5, b, b, false);
/* 1642 */       a(☃, bwf1, 5, 2, 10, 5, 6, 10, b, b, false);
/* 1643 */       a(☃, bwf1, 10, 2, 5, 10, 6, 5, b, b, false);
/* 1644 */       a(☃, bwf1, 10, 2, 10, 10, 6, 10, b, b, false);
/*      */       
/* 1646 */       a(☃, bwf1, 5, 7, 1, 5, 7, 6, b, b, false);
/* 1647 */       a(☃, bwf1, 10, 7, 1, 10, 7, 6, b, b, false);
/* 1648 */       a(☃, bwf1, 5, 7, 9, 5, 7, 14, b, b, false);
/* 1649 */       a(☃, bwf1, 10, 7, 9, 10, 7, 14, b, b, false);
/*      */       
/* 1651 */       a(☃, bwf1, 1, 7, 5, 6, 7, 5, b, b, false);
/* 1652 */       a(☃, bwf1, 1, 7, 10, 6, 7, 10, b, b, false);
/* 1653 */       a(☃, bwf1, 9, 7, 5, 14, 7, 5, b, b, false);
/* 1654 */       a(☃, bwf1, 9, 7, 10, 14, 7, 10, b, b, false);
/*      */ 
/*      */       
/* 1657 */       a(☃, bwf1, 2, 1, 2, 2, 1, 3, b, b, false);
/* 1658 */       a(☃, bwf1, 3, 1, 2, 3, 1, 2, b, b, false);
/* 1659 */       a(☃, bwf1, 13, 1, 2, 13, 1, 3, b, b, false);
/* 1660 */       a(☃, bwf1, 12, 1, 2, 12, 1, 2, b, b, false);
/* 1661 */       a(☃, bwf1, 2, 1, 12, 2, 1, 13, b, b, false);
/* 1662 */       a(☃, bwf1, 3, 1, 13, 3, 1, 13, b, b, false);
/* 1663 */       a(☃, bwf1, 13, 1, 12, 13, 1, 13, b, b, false);
/* 1664 */       a(☃, bwf1, 12, 1, 13, 12, 1, 13, b, b, false);
/*      */       
/* 1666 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class u
/*      */     extends r
/*      */   {
/*      */     private int p;
/*      */     
/*      */     public u() {}
/*      */     
/*      */     public u(eq ☃, bwf bwf1, int i) {
/* 1678 */       super(☃, bwf1);
/* 1679 */       this.p = i & 0x1;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1684 */       if (this.p == 0) {
/* 1685 */         int i; for (i = 0; i < 4; i++) {
/* 1686 */           a(☃, bwf1, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, b, b, false);
/*      */         }
/* 1688 */         a(☃, bwf1, 7, 0, 6, 15, 0, 16, b, b, false);
/* 1689 */         a(☃, bwf1, 6, 0, 6, 6, 3, 20, b, b, false);
/* 1690 */         a(☃, bwf1, 16, 0, 6, 16, 3, 20, b, b, false);
/* 1691 */         a(☃, bwf1, 7, 1, 7, 7, 1, 20, b, b, false);
/* 1692 */         a(☃, bwf1, 15, 1, 7, 15, 1, 20, b, b, false);
/*      */         
/* 1694 */         a(☃, bwf1, 7, 1, 6, 9, 3, 6, b, b, false);
/* 1695 */         a(☃, bwf1, 13, 1, 6, 15, 3, 6, b, b, false);
/* 1696 */         a(☃, bwf1, 8, 1, 7, 9, 1, 7, b, b, false);
/* 1697 */         a(☃, bwf1, 13, 1, 7, 14, 1, 7, b, b, false);
/* 1698 */         a(☃, bwf1, 9, 0, 5, 13, 0, 5, b, b, false);
/*      */         
/* 1700 */         a(☃, bwf1, 10, 0, 7, 12, 0, 7, c, c, false);
/* 1701 */         a(☃, bwf1, 8, 0, 10, 8, 0, 12, c, c, false);
/* 1702 */         a(☃, bwf1, 14, 0, 10, 14, 0, 12, c, c, false);
/*      */         
/* 1704 */         for (i = 18; i >= 7; i -= 3) {
/* 1705 */           a(☃, e, 6, 3, i, bwf1);
/* 1706 */           a(☃, e, 16, 3, i, bwf1);
/*      */         } 
/* 1708 */         a(☃, e, 10, 0, 10, bwf1);
/* 1709 */         a(☃, e, 12, 0, 10, bwf1);
/* 1710 */         a(☃, e, 10, 0, 12, bwf1);
/* 1711 */         a(☃, e, 12, 0, 12, bwf1);
/*      */         
/* 1713 */         a(☃, e, 8, 3, 6, bwf1);
/* 1714 */         a(☃, e, 14, 3, 6, bwf1);
/*      */ 
/*      */         
/* 1717 */         a(☃, b, 4, 2, 4, bwf1);
/* 1718 */         a(☃, e, 4, 1, 4, bwf1);
/* 1719 */         a(☃, b, 4, 0, 4, bwf1);
/*      */         
/* 1721 */         a(☃, b, 18, 2, 4, bwf1);
/* 1722 */         a(☃, e, 18, 1, 4, bwf1);
/* 1723 */         a(☃, b, 18, 0, 4, bwf1);
/*      */         
/* 1725 */         a(☃, b, 4, 2, 18, bwf1);
/* 1726 */         a(☃, e, 4, 1, 18, bwf1);
/* 1727 */         a(☃, b, 4, 0, 18, bwf1);
/*      */         
/* 1729 */         a(☃, b, 18, 2, 18, bwf1);
/* 1730 */         a(☃, e, 18, 1, 18, bwf1);
/* 1731 */         a(☃, b, 18, 0, 18, bwf1);
/*      */ 
/*      */         
/* 1734 */         a(☃, b, 9, 7, 20, bwf1);
/* 1735 */         a(☃, b, 13, 7, 20, bwf1);
/* 1736 */         a(☃, bwf1, 6, 0, 21, 7, 4, 21, b, b, false);
/* 1737 */         a(☃, bwf1, 15, 0, 21, 16, 4, 21, b, b, false);
/*      */         
/* 1739 */         a(☃, bwf1, 11, 2, 16);
/* 1740 */       } else if (this.p == 1) {
/* 1741 */         a(☃, bwf1, 9, 3, 18, 13, 3, 20, b, b, false);
/* 1742 */         a(☃, bwf1, 9, 0, 18, 9, 2, 18, b, b, false);
/* 1743 */         a(☃, bwf1, 13, 0, 18, 13, 2, 18, b, b, false);
/* 1744 */         int i = 9;
/* 1745 */         int j = 20;
/* 1746 */         int k = 5; int m;
/* 1747 */         for (m = 0; m < 2; m++) {
/* 1748 */           a(☃, b, i, 6, 20, bwf1);
/* 1749 */           a(☃, e, i, 5, 20, bwf1);
/* 1750 */           a(☃, b, i, 4, 20, bwf1);
/* 1751 */           i = 13;
/*      */         } 
/*      */         
/* 1754 */         a(☃, bwf1, 7, 3, 7, 15, 3, 14, b, b, false);
/* 1755 */         i = 10;
/* 1756 */         for (m = 0; m < 2; m++) {
/* 1757 */           a(☃, bwf1, i, 0, 10, i, 6, 10, b, b, false);
/* 1758 */           a(☃, bwf1, i, 0, 12, i, 6, 12, b, b, false);
/* 1759 */           a(☃, e, i, 0, 10, bwf1);
/* 1760 */           a(☃, e, i, 0, 12, bwf1);
/* 1761 */           a(☃, e, i, 4, 10, bwf1);
/* 1762 */           a(☃, e, i, 4, 12, bwf1);
/* 1763 */           i = 12;
/*      */         } 
/* 1765 */         i = 8;
/* 1766 */         for (m = 0; m < 2; m++) {
/* 1767 */           a(☃, bwf1, i, 0, 7, i, 2, 7, b, b, false);
/* 1768 */           a(☃, bwf1, i, 0, 14, i, 2, 14, b, b, false);
/* 1769 */           i = 14;
/*      */         } 
/* 1771 */         a(☃, bwf1, 8, 3, 8, 8, 3, 13, c, c, false);
/* 1772 */         a(☃, bwf1, 14, 3, 8, 14, 3, 13, c, c, false);
/*      */         
/* 1774 */         a(☃, bwf1, 11, 5, 13);
/*      */       } 
/*      */       
/* 1777 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class q
/*      */     extends r {
/*      */     public q() {}
/*      */     
/*      */     public q(eq ☃, bwf bwf1) {
/* 1786 */       super(☃, bwf1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1791 */       a(☃, bwf1, 2, -1, 2, 11, -1, 11, b, b, false);
/* 1792 */       a(☃, bwf1, 0, -1, 0, 1, -1, 11, a, a, false);
/* 1793 */       a(☃, bwf1, 12, -1, 0, 13, -1, 11, a, a, false);
/* 1794 */       a(☃, bwf1, 2, -1, 0, 11, -1, 1, a, a, false);
/* 1795 */       a(☃, bwf1, 2, -1, 12, 11, -1, 13, a, a, false);
/*      */       
/* 1797 */       a(☃, bwf1, 0, 0, 0, 0, 0, 13, b, b, false);
/* 1798 */       a(☃, bwf1, 13, 0, 0, 13, 0, 13, b, b, false);
/* 1799 */       a(☃, bwf1, 1, 0, 0, 12, 0, 0, b, b, false);
/* 1800 */       a(☃, bwf1, 1, 0, 13, 12, 0, 13, b, b, false);
/*      */       int i;
/* 1802 */       for (i = 2; i <= 11; i += 3) {
/* 1803 */         a(☃, e, 0, 0, i, bwf1);
/* 1804 */         a(☃, e, 13, 0, i, bwf1);
/* 1805 */         a(☃, e, i, 0, 0, bwf1);
/*      */       } 
/*      */       
/* 1808 */       a(☃, bwf1, 2, 0, 3, 4, 0, 9, b, b, false);
/* 1809 */       a(☃, bwf1, 9, 0, 3, 11, 0, 9, b, b, false);
/* 1810 */       a(☃, bwf1, 4, 0, 9, 9, 0, 11, b, b, false);
/* 1811 */       a(☃, b, 5, 0, 8, bwf1);
/* 1812 */       a(☃, b, 8, 0, 8, bwf1);
/* 1813 */       a(☃, b, 10, 0, 10, bwf1);
/* 1814 */       a(☃, b, 3, 0, 10, bwf1);
/* 1815 */       a(☃, bwf1, 3, 0, 3, 3, 0, 7, c, c, false);
/* 1816 */       a(☃, bwf1, 10, 0, 3, 10, 0, 7, c, c, false);
/* 1817 */       a(☃, bwf1, 6, 0, 10, 7, 0, 10, c, c, false);
/*      */       
/* 1819 */       i = 3;
/* 1820 */       for (int j = 0; j < 2; j++) {
/* 1821 */         for (int k = 2; k <= 8; k += 3) {
/* 1822 */           a(☃, bwf1, i, 0, k, i, 2, k, b, b, false);
/*      */         }
/* 1824 */         i = 10;
/*      */       } 
/* 1826 */       a(☃, bwf1, 5, 0, 10, 5, 2, 10, b, b, false);
/* 1827 */       a(☃, bwf1, 8, 0, 10, 8, 2, 10, b, b, false);
/*      */       
/* 1829 */       a(☃, bwf1, 6, -1, 7, 7, -1, 8, c, c, false);
/*      */ 
/*      */       
/* 1832 */       a(☃, bwf1, 6, -1, 3, 7, -1, 4);
/*      */       
/* 1834 */       a(☃, bwf1, 6, 1, 6);
/*      */       
/* 1836 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   static class v {
/*      */     private final int a;
/* 1842 */     private final v[] b = new v[6];
/* 1843 */     private final boolean[] c = new boolean[6];
/*      */     private boolean d;
/*      */     private boolean e;
/*      */     private int f;
/*      */     
/*      */     public v(int ☃) {
/* 1849 */       this.a = ☃;
/*      */     }
/*      */     
/*      */     public void a(eq ☃, v v1) {
/* 1853 */       this.b[☃.a()] = v1;
/* 1854 */       v1.b[☃.d().a()] = this;
/*      */     }
/*      */     
/*      */     public void a() {
/* 1858 */       for (int ☃ = 0; ☃ < 6; ☃++) {
/* 1859 */         this.c[☃] = (this.b[☃] != null);
/*      */       }
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/* 1864 */       if (this.e) {
/* 1865 */         return true;
/*      */       }
/* 1867 */       this.f = ☃;
/* 1868 */       for (int i = 0; i < 6; i++) {
/* 1869 */         if (this.b[i] != null && this.c[i] && 
/* 1870 */           (this.b[i]).f != ☃ && this.b[i].a(☃)) {
/* 1871 */           return true;
/*      */         }
/*      */       } 
/*      */       
/* 1875 */       return false;
/*      */     }
/*      */     
/*      */     public boolean b() {
/* 1879 */       return (this.a >= 75);
/*      */     }
/*      */     
/*      */     public int c() {
/* 1883 */       int ☃ = 0;
/* 1884 */       for (int i = 0; i < 6; i++) {
/* 1885 */         if (this.c[i]) {
/* 1886 */           ☃++;
/*      */         }
/*      */       } 
/* 1889 */       return ☃;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static class f
/*      */     implements i
/*      */   {
/*      */     private f() {}
/*      */ 
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1902 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 1907 */       bws.v.a(v1, true);
/* 1908 */       return new bws.s(☃, v1, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class g implements i { private g() {}
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1915 */       return (!bws.v.d(☃)[eq.e.a()] && !bws.v.d(☃)[eq.f.a()] && !bws.v.d(☃)[eq.c.a()] && !bws.v.d(☃)[eq.d.a()] && !bws.v.d(☃)[eq.b.a()]);
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 1920 */       bws.v.a(v1, true);
/* 1921 */       return new bws.t(☃, v1, random);
/*      */     } }
/*      */   
/*      */   static class c implements i {
/*      */     private c() {}
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1928 */       return (bws.v.d(☃)[eq.b.a()] && !bws.v.b(bws.v.c(☃)[eq.b.a()]));
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 1933 */       bws.v.a(v1, true);
/* 1934 */       bws.v.a(bws.v.c(v1)[eq.b.a()], true);
/* 1935 */       return new bws.m(☃, v1, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class a implements i { private a() {}
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1942 */       return (bws.v.d(☃)[eq.f.a()] && !bws.v.b(bws.v.c(☃)[eq.f.a()]));
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 1947 */       bws.v.a(v1, true);
/* 1948 */       bws.v.a(bws.v.c(v1)[eq.f.a()], true);
/* 1949 */       return new bws.k(☃, v1, random);
/*      */     } }
/*      */   
/*      */   static class e implements i {
/*      */     private e() {}
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1956 */       return (bws.v.d(☃)[eq.c.a()] && !bws.v.b(bws.v.c(☃)[eq.c.a()]));
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 1961 */       bws.v v2 = v1;
/* 1962 */       if (!bws.v.d(v1)[eq.c.a()] || bws.v.b(bws.v.c(v1)[eq.c.a()])) {
/* 1963 */         v2 = bws.v.c(v1)[eq.d.a()];
/*      */       }
/* 1965 */       bws.v.a(v2, true);
/* 1966 */       bws.v.a(bws.v.c(v2)[eq.c.a()], true);
/* 1967 */       return new bws.o(☃, v2, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class b implements i { private b() {}
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1974 */       if (bws.v.d(☃)[eq.f.a()] && !bws.v.b(bws.v.c(☃)[eq.f.a()]) && 
/* 1975 */         bws.v.d(☃)[eq.b.a()] && !bws.v.b(bws.v.c(☃)[eq.b.a()])) {
/* 1976 */         bws.v v1 = bws.v.c(☃)[eq.f.a()];
/*      */         
/* 1978 */         return (bws.v.d(v1)[eq.b.a()] && !bws.v.b(bws.v.c(v1)[eq.b.a()]));
/*      */       } 
/*      */       
/* 1981 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 1986 */       bws.v.a(v1, true);
/* 1987 */       bws.v.a(bws.v.c(v1)[eq.f.a()], true);
/* 1988 */       bws.v.a(bws.v.c(v1)[eq.b.a()], true);
/* 1989 */       bws.v.a(bws.v.c(bws.v.c(v1)[eq.f.a()])[eq.b.a()], true);
/* 1990 */       return new bws.l(☃, v1, random);
/*      */     } }
/*      */   
/*      */   static class d implements i {
/*      */     private d() {}
/*      */     
/*      */     public boolean a(bws.v ☃) {
/* 1997 */       if (bws.v.d(☃)[eq.c.a()] && !bws.v.b(bws.v.c(☃)[eq.c.a()]) && 
/* 1998 */         bws.v.d(☃)[eq.b.a()] && !bws.v.b(bws.v.c(☃)[eq.b.a()])) {
/* 1999 */         bws.v v1 = bws.v.c(☃)[eq.c.a()];
/*      */         
/* 2001 */         return (bws.v.d(v1)[eq.b.a()] && !bws.v.b(bws.v.c(v1)[eq.b.a()]));
/*      */       } 
/*      */       
/* 2004 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public bws.r a(eq ☃, bws.v v1, Random random) {
/* 2009 */       bws.v.a(v1, true);
/* 2010 */       bws.v.a(bws.v.c(v1)[eq.c.a()], true);
/* 2011 */       bws.v.a(bws.v.c(v1)[eq.b.a()], true);
/* 2012 */       bws.v.a(bws.v.c(bws.v.c(v1)[eq.c.a()])[eq.b.a()], true);
/* 2013 */       return new bws.n(☃, v1, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static interface i {
/*      */     boolean a(bws.v param1v);
/*      */     
/*      */     bws.r a(eq param1eq, bws.v param1v, Random param1Random);
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\bws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */