/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import javax.annotation.Nullable;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class bwr
/*      */ {
/*      */   public static void a() {
/*   31 */     bwy.a((Class)a.class, "NeBCr");
/*   32 */     bwy.a((Class)b.class, "NeBEF");
/*   33 */     bwy.a((Class)c.class, "NeBS");
/*   34 */     bwy.a((Class)d.class, "NeCCS");
/*   35 */     bwy.a((Class)e.class, "NeCTB");
/*   36 */     bwy.a((Class)f.class, "NeCE");
/*   37 */     bwy.a((Class)g.class, "NeSCSC");
/*   38 */     bwy.a((Class)h.class, "NeSCLT");
/*   39 */     bwy.a((Class)i.class, "NeSC");
/*   40 */     bwy.a((Class)j.class, "NeSCRT");
/*   41 */     bwy.a((Class)k.class, "NeCSR");
/*   42 */     bwy.a((Class)l.class, "NeMT");
/*   43 */     bwy.a((Class)o.class, "NeRC");
/*   44 */     bwy.a((Class)p.class, "NeSR");
/*   45 */     bwy.a((Class)q.class, "NeStart");
/*      */   }
/*      */   
/*      */   static class n {
/*      */     public Class<? extends bwr.m> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public int d;
/*      */     public boolean e;
/*      */     
/*      */     public n(Class<? extends bwr.m> ☃, int i, int j, boolean bool) {
/*   56 */       this.a = ☃;
/*   57 */       this.b = i;
/*   58 */       this.d = j;
/*   59 */       this.e = bool;
/*      */     }
/*      */     
/*      */     public n(Class<? extends bwr.m> ☃, int i, int j) {
/*   63 */       this(☃, i, j, false);
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   67 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   71 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */   
/*   75 */   private static final n[] a = new n[] { new n((Class)c.class, 30, 0, true), new n((Class)a.class, 10, 4), new n((Class)o.class, 10, 4), new n((Class)p.class, 10, 3), new n((Class)l.class, 5, 2), new n((Class)f.class, 5, 1) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   83 */   private static final n[] b = new n[] { new n((Class)i.class, 25, 0, true), new n((Class)g.class, 15, 5), new n((Class)j.class, 5, 10), new n((Class)h.class, 5, 10), new n((Class)d.class, 10, 3, true), new n((Class)e.class, 7, 2), new n((Class)k.class, 5, 2) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static m b(n ☃, List<bxb> list, Random random, int i, int j, int k, eq eq1, int m) {
/*   94 */     Class<? extends m> clazz = ☃.a;
/*   95 */     m m1 = null;
/*      */     
/*   97 */     if (clazz == c.class) {
/*   98 */       m1 = c.a(list, random, i, j, k, eq1, m);
/*   99 */     } else if (clazz == a.class) {
/*  100 */       m1 = a.a(list, random, i, j, k, eq1, m);
/*  101 */     } else if (clazz == o.class) {
/*  102 */       m1 = o.a(list, random, i, j, k, eq1, m);
/*  103 */     } else if (clazz == p.class) {
/*  104 */       m1 = p.a(list, random, i, j, k, m, eq1);
/*  105 */     } else if (clazz == l.class) {
/*  106 */       m1 = l.a(list, random, i, j, k, m, eq1);
/*  107 */     } else if (clazz == f.class) {
/*  108 */       m1 = f.a(list, random, i, j, k, eq1, m);
/*  109 */     } else if (clazz == i.class) {
/*  110 */       m1 = i.a(list, random, i, j, k, eq1, m);
/*  111 */     } else if (clazz == j.class) {
/*  112 */       m1 = j.a(list, random, i, j, k, eq1, m);
/*  113 */     } else if (clazz == h.class) {
/*  114 */       m1 = h.a(list, random, i, j, k, eq1, m);
/*  115 */     } else if (clazz == d.class) {
/*  116 */       m1 = d.a(list, random, i, j, k, eq1, m);
/*  117 */     } else if (clazz == e.class) {
/*  118 */       m1 = e.a(list, random, i, j, k, eq1, m);
/*  119 */     } else if (clazz == g.class) {
/*  120 */       m1 = g.a(list, random, i, j, k, eq1, m);
/*  121 */     } else if (clazz == k.class) {
/*  122 */       m1 = k.a(list, random, i, j, k, eq1, m);
/*      */     } 
/*  124 */     return m1;
/*      */   }
/*      */   
/*      */   static abstract class m
/*      */     extends bxb
/*      */   {
/*      */     public m() {}
/*      */     
/*      */     protected m(int ☃) {
/*  133 */       super(☃);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {}
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {}
/*      */ 
/*      */     
/*      */     private int a(List<bwr.n> ☃) {
/*  145 */       boolean bool = false;
/*  146 */       int i = 0;
/*  147 */       for (bwr.n n : ☃) {
/*  148 */         if (n.d > 0 && n.c < n.d) {
/*  149 */           bool = true;
/*      */         }
/*  151 */         i += n.b;
/*      */       } 
/*  153 */       return bool ? i : -1;
/*      */     }
/*      */     
/*      */     private m a(bwr.q ☃, List<bwr.n> list, List<bxb> list1, Random random, int i, int j, int k, eq eq1, int n) {
/*  157 */       int i1 = a(list);
/*  158 */       boolean bool = (i1 > 0 && n <= 30);
/*      */       
/*  160 */       int i2 = 0;
/*  161 */       while (i2 < 5 && bool) {
/*  162 */         i2++;
/*      */         
/*  164 */         int i3 = random.nextInt(i1);
/*  165 */         for (bwr.n n1 : list) {
/*  166 */           i3 -= n1.b;
/*  167 */           if (i3 < 0) {
/*  168 */             if (!n1.a(n) || (n1 == ☃.a && !n1.e)) {
/*      */               break;
/*      */             }
/*      */             
/*  172 */             m m1 = bwr.a(n1, list1, random, i, j, k, eq1, n);
/*  173 */             if (m1 != null) {
/*  174 */               n1.c++;
/*  175 */               ☃.a = n1;
/*      */               
/*  177 */               if (!n1.a()) {
/*  178 */                 list.remove(n1);
/*      */               }
/*  180 */               return m1;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*  185 */       return bwr.b.a(list1, random, i, j, k, eq1, n);
/*      */     }
/*      */     
/*      */     private bxb a(bwr.q ☃, List<bxb> list, Random random, int i, int j, int k, @Nullable eq eq1, int n, boolean bool) {
/*  189 */       if (Math.abs(i - (☃.d()).a) > 112 || Math.abs(k - (☃.d()).c) > 112) {
/*  190 */         return bwr.b.a(list, random, i, j, k, eq1, n);
/*      */       }
/*  192 */       List<bwr.n> list1 = ☃.b;
/*  193 */       if (bool) {
/*  194 */         list1 = ☃.c;
/*      */       }
/*  196 */       bxb bxb1 = a(☃, list1, list, random, i, j, k, eq1, n + 1);
/*  197 */       if (bxb1 != null) {
/*  198 */         list.add(bxb1);
/*  199 */         ☃.d.add(bxb1);
/*      */       } 
/*  201 */       return bxb1;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb a(bwr.q ☃, List<bxb> list, Random random, int i, int j, boolean bool) {
/*  206 */       eq eq = f();
/*  207 */       if (eq != null) {
/*  208 */         switch (bwr.null.a[eq.ordinal()]) {
/*      */           case 1:
/*  210 */             return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, eq, e(), bool);
/*      */           case 2:
/*  212 */             return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, eq, e(), bool);
/*      */           case 3:
/*  214 */             return a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, eq, e(), bool);
/*      */           case 4:
/*  216 */             return a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, eq, e(), bool);
/*      */         } 
/*      */       }
/*  219 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb b(bwr.q ☃, List<bxb> list, Random random, int i, int j, boolean bool) {
/*  224 */       eq eq = f();
/*  225 */       if (eq != null) {
/*  226 */         switch (bwr.null.a[eq.ordinal()]) {
/*      */           case 1:
/*  228 */             return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e(), bool);
/*      */           case 2:
/*  230 */             return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e(), bool);
/*      */           case 3:
/*  232 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e(), bool);
/*      */           case 4:
/*  234 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e(), bool);
/*      */         } 
/*      */       }
/*  237 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb c(bwr.q ☃, List<bxb> list, Random random, int i, int j, boolean bool) {
/*  242 */       eq eq = f();
/*  243 */       if (eq != null) {
/*  244 */         switch (bwr.null.a[eq.ordinal()]) {
/*      */           case 1:
/*  246 */             return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e(), bool);
/*      */           case 2:
/*  248 */             return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e(), bool);
/*      */           case 3:
/*  250 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e(), bool);
/*      */           case 4:
/*  252 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e(), bool);
/*      */         } 
/*      */       }
/*  255 */       return null;
/*      */     }
/*      */     
/*      */     protected static boolean a(bwf ☃) {
/*  259 */       return (☃ != null && ☃.b > 10);
/*      */     }
/*      */   }
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
/*      */   public static class q
/*      */     extends a
/*      */   {
/*      */     public bwr.n a;
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
/*      */     public List<bwr.n> b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<bwr.n> c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  307 */     public List<bxb> d = Lists.newArrayList();
/*      */ 
/*      */     
/*      */     public q() {}
/*      */ 
/*      */     
/*      */     public q(Random ☃, int i, int j) {
/*  314 */       super(☃, i, j);
/*      */       
/*  316 */       this.b = Lists.newArrayList();
/*  317 */       for (bwr.n n1 : bwr.b()) {
/*  318 */         n1.c = 0;
/*  319 */         this.b.add(n1);
/*      */       } 
/*      */       
/*  322 */       this.c = Lists.newArrayList();
/*  323 */       for (bwr.n n1 : bwr.c()) {
/*  324 */         n1.c = 0;
/*  325 */         this.c.add(n1);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends m
/*      */   {
/*      */     public c() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public c(int ☃, Random random, bwf bwf1, eq eq1) {
/*  340 */       super(☃);
/*      */       
/*  342 */       a(eq1);
/*  343 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  348 */       a((bwr.q)☃, list, random, 1, 3, false);
/*      */     }
/*      */     
/*      */     public static c a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/*  352 */       bwf bwf = bwf.a(i, j, k, -1, -3, 0, 5, 10, 19, eq1);
/*      */       
/*  354 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  355 */         return null;
/*      */       }
/*      */       
/*  358 */       return new c(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  364 */       a(☃, bwf1, 0, 3, 0, 4, 4, 18, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  366 */       a(☃, bwf1, 1, 5, 0, 3, 7, 18, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  369 */       a(☃, bwf1, 0, 5, 0, 0, 5, 18, bct.dX.p(), bct.dX.p(), false);
/*  370 */       a(☃, bwf1, 4, 5, 0, 4, 5, 18, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  373 */       a(☃, bwf1, 0, 2, 0, 4, 2, 5, bct.dX.p(), bct.dX.p(), false);
/*  374 */       a(☃, bwf1, 0, 2, 13, 4, 2, 18, bct.dX.p(), bct.dX.p(), false);
/*  375 */       a(☃, bwf1, 0, 0, 0, 4, 1, 3, bct.dX.p(), bct.dX.p(), false);
/*  376 */       a(☃, bwf1, 0, 0, 15, 4, 1, 18, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  378 */       for (int i = 0; i <= 4; i++) {
/*  379 */         for (int j = 0; j <= 2; j++) {
/*  380 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*  381 */           b(☃, bct.dX.p(), i, -1, 18 - j, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/*  385 */       blc blc1 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*  386 */       blc blc2 = blc1.a(ber.b, Boolean.valueOf(true));
/*  387 */       blc blc3 = blc1.a(ber.o, Boolean.valueOf(true));
/*  388 */       a(☃, bwf1, 0, 1, 1, 0, 4, 1, blc2, blc2, false);
/*  389 */       a(☃, bwf1, 0, 3, 4, 0, 4, 4, blc2, blc2, false);
/*  390 */       a(☃, bwf1, 0, 3, 14, 0, 4, 14, blc2, blc2, false);
/*  391 */       a(☃, bwf1, 0, 1, 17, 0, 4, 17, blc2, blc2, false);
/*  392 */       a(☃, bwf1, 4, 1, 1, 4, 4, 1, blc3, blc3, false);
/*  393 */       a(☃, bwf1, 4, 3, 4, 4, 4, 4, blc3, blc3, false);
/*  394 */       a(☃, bwf1, 4, 3, 14, 4, 4, 14, blc3, blc3, false);
/*  395 */       a(☃, bwf1, 4, 1, 17, 4, 4, 17, blc3, blc3, false);
/*      */       
/*  397 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends m
/*      */   {
/*      */     private int a;
/*      */ 
/*      */     
/*      */     public b() {}
/*      */ 
/*      */     
/*      */     public b(int ☃, Random random, bwf bwf1, eq eq1) {
/*  413 */       super(☃);
/*      */       
/*  415 */       a(eq1);
/*  416 */       this.n = bwf1;
/*  417 */       this.a = random.nextInt();
/*      */     }
/*      */     
/*      */     public static b a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/*  421 */       bwf bwf = bwf.a(i, j, k, -1, -3, 0, 5, 10, 8, eq1);
/*      */       
/*  423 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  424 */         return null;
/*      */       }
/*      */       
/*  427 */       return new b(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  432 */       super.a(☃, bxm1);
/*      */       
/*  434 */       this.a = ☃.h("Seed");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  439 */       super.a(☃);
/*      */       
/*  441 */       ☃.b("Seed", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  446 */       Random random1 = new Random(this.a);
/*      */       
/*      */       int i;
/*  449 */       for (i = 0; i <= 4; i++) {
/*  450 */         for (int j = 3; j <= 4; j++) {
/*  451 */           int k = random1.nextInt(8);
/*  452 */           a(☃, bwf1, i, j, 0, i, j, k, bct.dX.p(), bct.dX.p(), false);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  458 */       i = random1.nextInt(8);
/*  459 */       a(☃, bwf1, 0, 5, 0, 0, 5, i, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  462 */       i = random1.nextInt(8);
/*  463 */       a(☃, bwf1, 4, 5, 0, 4, 5, i, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */ 
/*      */       
/*  467 */       for (i = 0; i <= 4; i++) {
/*  468 */         int j = random1.nextInt(5);
/*  469 */         a(☃, bwf1, i, 2, 0, i, 2, j, bct.dX.p(), bct.dX.p(), false);
/*      */       } 
/*  471 */       for (i = 0; i <= 4; i++) {
/*  472 */         for (int j = 0; j <= 1; j++) {
/*  473 */           int k = random1.nextInt(3);
/*  474 */           a(☃, bwf1, i, j, 0, i, j, k, bct.dX.p(), bct.dX.p(), false);
/*      */         } 
/*      */       } 
/*      */       
/*  478 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends m
/*      */   {
/*      */     public a() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public a(int ☃, Random random, bwf bwf1, eq eq1) {
/*  492 */       super(☃);
/*      */       
/*  494 */       a(eq1);
/*  495 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     protected a(Random ☃, int i, int j) {
/*  499 */       super(0);
/*      */       
/*  501 */       a(eq.c.a.a(☃));
/*      */       
/*  503 */       if (f().k() == eq.a.c) {
/*  504 */         this.n = new bwf(i, 64, j, i + 19 - 1, 73, j + 19 - 1);
/*      */       } else {
/*  506 */         this.n = new bwf(i, 64, j, i + 19 - 1, 73, j + 19 - 1);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  512 */       a((bwr.q)☃, list, random, 8, 3, false);
/*  513 */       b((bwr.q)☃, list, random, 3, 8, false);
/*  514 */       c((bwr.q)☃, list, random, 3, 8, false);
/*      */     }
/*      */     
/*      */     public static a a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/*  518 */       bwf bwf = bwf.a(i, j, k, -8, -3, 0, 19, 10, 19, eq1);
/*      */       
/*  520 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  521 */         return null;
/*      */       }
/*      */       
/*  524 */       return new a(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  530 */       a(☃, bwf1, 7, 3, 0, 11, 4, 18, bct.dX.p(), bct.dX.p(), false);
/*  531 */       a(☃, bwf1, 0, 3, 7, 18, 4, 11, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  533 */       a(☃, bwf1, 8, 5, 0, 10, 7, 18, bct.a.p(), bct.a.p(), false);
/*  534 */       a(☃, bwf1, 0, 5, 8, 18, 7, 10, bct.a.p(), bct.a.p(), false);
/*      */       
/*  536 */       a(☃, bwf1, 7, 5, 0, 7, 5, 7, bct.dX.p(), bct.dX.p(), false);
/*  537 */       a(☃, bwf1, 7, 5, 11, 7, 5, 18, bct.dX.p(), bct.dX.p(), false);
/*  538 */       a(☃, bwf1, 11, 5, 0, 11, 5, 7, bct.dX.p(), bct.dX.p(), false);
/*  539 */       a(☃, bwf1, 11, 5, 11, 11, 5, 18, bct.dX.p(), bct.dX.p(), false);
/*  540 */       a(☃, bwf1, 0, 5, 7, 7, 5, 7, bct.dX.p(), bct.dX.p(), false);
/*  541 */       a(☃, bwf1, 11, 5, 7, 18, 5, 7, bct.dX.p(), bct.dX.p(), false);
/*  542 */       a(☃, bwf1, 0, 5, 11, 7, 5, 11, bct.dX.p(), bct.dX.p(), false);
/*  543 */       a(☃, bwf1, 11, 5, 11, 18, 5, 11, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  546 */       a(☃, bwf1, 7, 2, 0, 11, 2, 5, bct.dX.p(), bct.dX.p(), false);
/*  547 */       a(☃, bwf1, 7, 2, 13, 11, 2, 18, bct.dX.p(), bct.dX.p(), false);
/*  548 */       a(☃, bwf1, 7, 0, 0, 11, 1, 3, bct.dX.p(), bct.dX.p(), false);
/*  549 */       a(☃, bwf1, 7, 0, 15, 11, 1, 18, bct.dX.p(), bct.dX.p(), false); int i;
/*  550 */       for (i = 7; i <= 11; i++) {
/*  551 */         for (int j = 0; j <= 2; j++) {
/*  552 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*  553 */           b(☃, bct.dX.p(), i, -1, 18 - j, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/*  557 */       a(☃, bwf1, 0, 2, 7, 5, 2, 11, bct.dX.p(), bct.dX.p(), false);
/*  558 */       a(☃, bwf1, 13, 2, 7, 18, 2, 11, bct.dX.p(), bct.dX.p(), false);
/*  559 */       a(☃, bwf1, 0, 0, 7, 3, 1, 11, bct.dX.p(), bct.dX.p(), false);
/*  560 */       a(☃, bwf1, 15, 0, 7, 18, 1, 11, bct.dX.p(), bct.dX.p(), false);
/*  561 */       for (i = 0; i <= 2; i++) {
/*  562 */         for (int j = 7; j <= 11; j++) {
/*  563 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*  564 */           b(☃, bct.dX.p(), 18 - i, -1, j, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/*  568 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class o
/*      */     extends m
/*      */   {
/*      */     public o() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public o(int ☃, Random random, bwf bwf1, eq eq1) {
/*  582 */       super(☃);
/*      */       
/*  584 */       a(eq1);
/*  585 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  590 */       a((bwr.q)☃, list, random, 2, 0, false);
/*  591 */       b((bwr.q)☃, list, random, 0, 2, false);
/*  592 */       c((bwr.q)☃, list, random, 0, 2, false);
/*      */     }
/*      */     
/*      */     public static o a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/*  596 */       bwf bwf = bwf.a(i, j, k, -2, 0, 0, 7, 9, 7, eq1);
/*      */       
/*  598 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  599 */         return null;
/*      */       }
/*      */       
/*  602 */       return new o(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  608 */       a(☃, bwf1, 0, 0, 0, 6, 1, 6, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  610 */       a(☃, bwf1, 0, 2, 0, 6, 7, 6, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  613 */       a(☃, bwf1, 0, 2, 0, 1, 6, 0, bct.dX.p(), bct.dX.p(), false);
/*  614 */       a(☃, bwf1, 0, 2, 6, 1, 6, 6, bct.dX.p(), bct.dX.p(), false);
/*  615 */       a(☃, bwf1, 5, 2, 0, 6, 6, 0, bct.dX.p(), bct.dX.p(), false);
/*  616 */       a(☃, bwf1, 5, 2, 6, 6, 6, 6, bct.dX.p(), bct.dX.p(), false);
/*  617 */       a(☃, bwf1, 0, 2, 0, 0, 6, 1, bct.dX.p(), bct.dX.p(), false);
/*  618 */       a(☃, bwf1, 0, 2, 5, 0, 6, 6, bct.dX.p(), bct.dX.p(), false);
/*  619 */       a(☃, bwf1, 6, 2, 0, 6, 6, 1, bct.dX.p(), bct.dX.p(), false);
/*  620 */       a(☃, bwf1, 6, 2, 5, 6, 6, 6, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  623 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*  624 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */       
/*  626 */       a(☃, bwf1, 2, 6, 0, 4, 6, 0, bct.dX.p(), bct.dX.p(), false);
/*  627 */       a(☃, bwf1, 2, 5, 0, 4, 5, 0, blc1, blc1, false);
/*  628 */       a(☃, bwf1, 2, 6, 6, 4, 6, 6, bct.dX.p(), bct.dX.p(), false);
/*  629 */       a(☃, bwf1, 2, 5, 6, 4, 5, 6, blc1, blc1, false);
/*  630 */       a(☃, bwf1, 0, 6, 2, 0, 6, 4, bct.dX.p(), bct.dX.p(), false);
/*  631 */       a(☃, bwf1, 0, 5, 2, 0, 5, 4, blc2, blc2, false);
/*  632 */       a(☃, bwf1, 6, 6, 2, 6, 6, 4, bct.dX.p(), bct.dX.p(), false);
/*  633 */       a(☃, bwf1, 6, 5, 2, 6, 5, 4, blc2, blc2, false);
/*      */ 
/*      */       
/*  636 */       for (int i = 0; i <= 6; i++) {
/*  637 */         for (int j = 0; j <= 6; j++) {
/*  638 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*      */         }
/*      */       } 
/*      */       
/*  642 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class p
/*      */     extends m
/*      */   {
/*      */     public p() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public p(int ☃, Random random, bwf bwf1, eq eq1) {
/*  656 */       super(☃);
/*      */       
/*  658 */       a(eq1);
/*  659 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  664 */       c((bwr.q)☃, list, random, 6, 2, false);
/*      */     }
/*      */     
/*      */     public static p a(List<bxb> ☃, Random random, int i, int j, int k, int n, eq eq1) {
/*  668 */       bwf bwf = bwf.a(i, j, k, -2, 0, 0, 7, 11, 7, eq1);
/*      */       
/*  670 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  671 */         return null;
/*      */       }
/*      */       
/*  674 */       return new p(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  680 */       a(☃, bwf1, 0, 0, 0, 6, 1, 6, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  682 */       a(☃, bwf1, 0, 2, 0, 6, 10, 6, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  685 */       a(☃, bwf1, 0, 2, 0, 1, 8, 0, bct.dX.p(), bct.dX.p(), false);
/*  686 */       a(☃, bwf1, 5, 2, 0, 6, 8, 0, bct.dX.p(), bct.dX.p(), false);
/*  687 */       a(☃, bwf1, 0, 2, 1, 0, 8, 6, bct.dX.p(), bct.dX.p(), false);
/*  688 */       a(☃, bwf1, 6, 2, 1, 6, 8, 6, bct.dX.p(), bct.dX.p(), false);
/*  689 */       a(☃, bwf1, 1, 2, 6, 5, 8, 6, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  692 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*  693 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */       
/*  695 */       a(☃, bwf1, 0, 3, 2, 0, 5, 4, blc2, blc2, false);
/*  696 */       a(☃, bwf1, 6, 3, 2, 6, 5, 2, blc2, blc2, false);
/*  697 */       a(☃, bwf1, 6, 3, 4, 6, 5, 4, blc2, blc2, false);
/*      */ 
/*      */       
/*  700 */       a(☃, bct.dX.p(), 5, 2, 5, bwf1);
/*  701 */       a(☃, bwf1, 4, 2, 5, 4, 3, 5, bct.dX.p(), bct.dX.p(), false);
/*  702 */       a(☃, bwf1, 3, 2, 5, 3, 4, 5, bct.dX.p(), bct.dX.p(), false);
/*  703 */       a(☃, bwf1, 2, 2, 5, 2, 5, 5, bct.dX.p(), bct.dX.p(), false);
/*  704 */       a(☃, bwf1, 1, 2, 5, 1, 6, 5, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  707 */       a(☃, bwf1, 1, 7, 1, 5, 7, 4, bct.dX.p(), bct.dX.p(), false);
/*  708 */       a(☃, bwf1, 6, 8, 2, 6, 8, 4, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  711 */       a(☃, bwf1, 2, 6, 0, 4, 8, 0, bct.dX.p(), bct.dX.p(), false);
/*  712 */       a(☃, bwf1, 2, 5, 0, 4, 5, 0, blc1, blc1, false);
/*      */       
/*  714 */       for (int i = 0; i <= 6; i++) {
/*  715 */         for (int j = 0; j <= 6; j++) {
/*  716 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*      */         }
/*      */       } 
/*      */       
/*  720 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends m
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public l() {}
/*      */ 
/*      */     
/*      */     public l(int ☃, Random random, bwf bwf1, eq eq1) {
/*  736 */       super(☃);
/*      */       
/*  738 */       a(eq1);
/*  739 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  744 */       super.a(☃, bxm1);
/*      */       
/*  746 */       this.a = ☃.q("Mob");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  751 */       super.a(☃);
/*      */       
/*  753 */       ☃.a("Mob", this.a);
/*      */     }
/*      */     
/*      */     public static l a(List<bxb> ☃, Random random, int i, int j, int k, int n, eq eq1) {
/*  757 */       bwf bwf = bwf.a(i, j, k, -2, 0, 0, 7, 8, 9, eq1);
/*      */       
/*  759 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  760 */         return null;
/*      */       }
/*      */       
/*  763 */       return new l(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  769 */       a(☃, bwf1, 0, 2, 0, 6, 7, 7, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  772 */       a(☃, bwf1, 1, 0, 0, 5, 1, 7, bct.dX.p(), bct.dX.p(), false);
/*  773 */       a(☃, bwf1, 1, 2, 1, 5, 2, 7, bct.dX.p(), bct.dX.p(), false);
/*  774 */       a(☃, bwf1, 1, 3, 2, 5, 3, 7, bct.dX.p(), bct.dX.p(), false);
/*  775 */       a(☃, bwf1, 1, 4, 3, 5, 4, 7, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  778 */       a(☃, bwf1, 1, 2, 0, 1, 4, 2, bct.dX.p(), bct.dX.p(), false);
/*  779 */       a(☃, bwf1, 5, 2, 0, 5, 4, 2, bct.dX.p(), bct.dX.p(), false);
/*  780 */       a(☃, bwf1, 1, 5, 2, 1, 5, 3, bct.dX.p(), bct.dX.p(), false);
/*  781 */       a(☃, bwf1, 5, 5, 2, 5, 5, 3, bct.dX.p(), bct.dX.p(), false);
/*  782 */       a(☃, bwf1, 0, 5, 3, 0, 5, 8, bct.dX.p(), bct.dX.p(), false);
/*  783 */       a(☃, bwf1, 6, 5, 3, 6, 5, 8, bct.dX.p(), bct.dX.p(), false);
/*  784 */       a(☃, bwf1, 1, 5, 8, 5, 5, 8, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  786 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*  787 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */       
/*  789 */       a(☃, bct.dY.p().a(ber.o, Boolean.valueOf(true)), 1, 6, 3, bwf1);
/*  790 */       a(☃, bct.dY.p().a(ber.b, Boolean.valueOf(true)), 5, 6, 3, bwf1);
/*      */       
/*  792 */       a(☃, bct.dY.p().a(ber.b, Boolean.valueOf(true)).a(ber.a, Boolean.valueOf(true)), 0, 6, 3, bwf1);
/*  793 */       a(☃, bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.a, Boolean.valueOf(true)), 6, 6, 3, bwf1);
/*      */       
/*  795 */       a(☃, bwf1, 0, 6, 4, 0, 6, 7, blc2, blc2, false);
/*  796 */       a(☃, bwf1, 6, 6, 4, 6, 6, 7, blc2, blc2, false);
/*      */       
/*  798 */       a(☃, bct.dY.p().a(ber.b, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true)), 0, 6, 8, bwf1);
/*  799 */       a(☃, bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true)), 6, 6, 8, bwf1);
/*      */       
/*  801 */       a(☃, bwf1, 1, 6, 8, 5, 6, 8, blc1, blc1, false);
/*      */       
/*  803 */       a(☃, bct.dY.p().a(ber.b, Boolean.valueOf(true)), 1, 7, 8, bwf1);
/*  804 */       a(☃, bwf1, 2, 7, 8, 4, 7, 8, blc1, blc1, false);
/*  805 */       a(☃, bct.dY.p().a(ber.o, Boolean.valueOf(true)), 5, 7, 8, bwf1);
/*      */       
/*  807 */       a(☃, bct.dY.p().a(ber.b, Boolean.valueOf(true)), 2, 8, 8, bwf1);
/*  808 */       a(☃, blc1, 3, 8, 8, bwf1);
/*  809 */       a(☃, bct.dY.p().a(ber.o, Boolean.valueOf(true)), 4, 8, 8, bwf1);
/*      */       
/*  811 */       if (!this.a) {
/*  812 */         el el = new el(a(3, 5), d(5), b(3, 5));
/*  813 */         if (bwf1.b(el)) {
/*  814 */           this.a = true;
/*  815 */           ☃.a(el, bct.ci.p(), 2);
/*      */           
/*  817 */           bji bji = ☃.f(el);
/*  818 */           if (bji instanceof bke) {
/*  819 */             ((bke)bji).c().a(aev.e);
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  825 */       for (int i = 0; i <= 6; i++) {
/*  826 */         for (int j = 0; j <= 6; j++) {
/*  827 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*      */         }
/*      */       } 
/*      */       
/*  831 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class f
/*      */     extends m
/*      */   {
/*      */     public f() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public f(int ☃, Random random, bwf bwf1, eq eq1) {
/*  845 */       super(☃);
/*      */       
/*  847 */       a(eq1);
/*  848 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  853 */       a((bwr.q)☃, list, random, 5, 3, true);
/*      */     }
/*      */     
/*      */     public static f a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/*  857 */       bwf bwf = bwf.a(i, j, k, -5, -3, 0, 13, 14, 13, eq1);
/*      */       
/*  859 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  860 */         return null;
/*      */       }
/*      */       
/*  863 */       return new f(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  869 */       a(☃, bwf1, 0, 3, 0, 12, 4, 12, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  871 */       a(☃, bwf1, 0, 5, 0, 12, 13, 12, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  874 */       a(☃, bwf1, 0, 5, 0, 1, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  875 */       a(☃, bwf1, 11, 5, 0, 12, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  876 */       a(☃, bwf1, 2, 5, 11, 4, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  877 */       a(☃, bwf1, 8, 5, 11, 10, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  878 */       a(☃, bwf1, 5, 9, 11, 7, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  879 */       a(☃, bwf1, 2, 5, 0, 4, 12, 1, bct.dX.p(), bct.dX.p(), false);
/*  880 */       a(☃, bwf1, 8, 5, 0, 10, 12, 1, bct.dX.p(), bct.dX.p(), false);
/*  881 */       a(☃, bwf1, 5, 9, 0, 7, 12, 1, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  884 */       a(☃, bwf1, 2, 11, 2, 10, 12, 10, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/*  887 */       a(☃, bwf1, 5, 8, 0, 7, 8, 0, bct.dY.p(), bct.dY.p(), false);
/*      */       
/*  889 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*  890 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */       
/*      */       int i;
/*  893 */       for (i = 1; i <= 11; i += 2) {
/*  894 */         a(☃, bwf1, i, 10, 0, i, 11, 0, blc1, blc1, false);
/*  895 */         a(☃, bwf1, i, 10, 12, i, 11, 12, blc1, blc1, false);
/*  896 */         a(☃, bwf1, 0, 10, i, 0, 11, i, blc2, blc2, false);
/*  897 */         a(☃, bwf1, 12, 10, i, 12, 11, i, blc2, blc2, false);
/*  898 */         a(☃, bct.dX.p(), i, 13, 0, bwf1);
/*  899 */         a(☃, bct.dX.p(), i, 13, 12, bwf1);
/*  900 */         a(☃, bct.dX.p(), 0, 13, i, bwf1);
/*  901 */         a(☃, bct.dX.p(), 12, 13, i, bwf1);
/*  902 */         if (i != 11) {
/*  903 */           a(☃, blc1, i + 1, 13, 0, bwf1);
/*  904 */           a(☃, blc1, i + 1, 13, 12, bwf1);
/*  905 */           a(☃, blc2, 0, 13, i + 1, bwf1);
/*  906 */           a(☃, blc2, 12, 13, i + 1, bwf1);
/*      */         } 
/*      */       } 
/*  909 */       a(☃, bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 0, 13, 0, bwf1);
/*  910 */       a(☃, bct.dY.p().a(ber.c, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 0, 13, 12, bwf1);
/*  911 */       a(☃, bct.dY.p().a(ber.c, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 12, 13, 12, bwf1);
/*  912 */       a(☃, bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 12, 13, 0, bwf1);
/*      */ 
/*      */       
/*  915 */       for (i = 3; i <= 9; i += 2) {
/*  916 */         a(☃, bwf1, 1, 7, i, 1, 8, i, blc2.a(ber.o, Boolean.valueOf(true)), blc2.a(ber.o, Boolean.valueOf(true)), false);
/*  917 */         a(☃, bwf1, 11, 7, i, 11, 8, i, blc2.a(ber.b, Boolean.valueOf(true)), blc2.a(ber.b, Boolean.valueOf(true)), false);
/*      */       } 
/*      */ 
/*      */       
/*  921 */       a(☃, bwf1, 4, 2, 0, 8, 2, 12, bct.dX.p(), bct.dX.p(), false);
/*  922 */       a(☃, bwf1, 0, 2, 4, 12, 2, 8, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  924 */       a(☃, bwf1, 4, 0, 0, 8, 1, 3, bct.dX.p(), bct.dX.p(), false);
/*  925 */       a(☃, bwf1, 4, 0, 9, 8, 1, 12, bct.dX.p(), bct.dX.p(), false);
/*  926 */       a(☃, bwf1, 0, 0, 4, 3, 1, 8, bct.dX.p(), bct.dX.p(), false);
/*  927 */       a(☃, bwf1, 9, 0, 4, 12, 1, 8, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  929 */       for (i = 4; i <= 8; i++) {
/*  930 */         for (int j = 0; j <= 2; j++) {
/*  931 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*  932 */           b(☃, bct.dX.p(), i, -1, 12 - j, bwf1);
/*      */         } 
/*      */       } 
/*  935 */       for (i = 0; i <= 2; i++) {
/*  936 */         for (int j = 4; j <= 8; j++) {
/*  937 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*  938 */           b(☃, bct.dX.p(), 12 - i, -1, j, bwf1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  943 */       a(☃, bwf1, 5, 5, 5, 7, 5, 7, bct.dX.p(), bct.dX.p(), false);
/*  944 */       a(☃, bwf1, 6, 1, 6, 6, 4, 6, bct.a.p(), bct.a.p(), false);
/*  945 */       a(☃, bct.dX.p(), 6, 0, 6, bwf1);
/*  946 */       a(☃, bct.C.p(), 6, 5, 6, bwf1);
/*      */       
/*  948 */       el el = new el(a(6, 6), d(5), b(6, 6));
/*  949 */       if (bwf1.b(el)) {
/*  950 */         ☃.I().a(el, byy.e, 0);
/*      */       }
/*      */       
/*  953 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class k
/*      */     extends m
/*      */   {
/*      */     public k() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public k(int ☃, Random random, bwf bwf1, eq eq1) {
/*  967 */       super(☃);
/*      */       
/*  969 */       a(eq1);
/*  970 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  975 */       a((bwr.q)☃, list, random, 5, 3, true);
/*  976 */       a((bwr.q)☃, list, random, 5, 11, true);
/*      */     }
/*      */     
/*      */     public static k a(List<bxb> ☃, Random random, int i, int j, int n, eq eq1, int i1) {
/*  980 */       bwf bwf = bwf.a(i, j, n, -5, -3, 0, 13, 14, 13, eq1);
/*      */       
/*  982 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  983 */         return null;
/*      */       }
/*      */       
/*  986 */       return new k(i1, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  992 */       a(☃, bwf1, 0, 3, 0, 12, 4, 12, bct.dX.p(), bct.dX.p(), false);
/*      */       
/*  994 */       a(☃, bwf1, 0, 5, 0, 12, 13, 12, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  997 */       a(☃, bwf1, 0, 5, 0, 1, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  998 */       a(☃, bwf1, 11, 5, 0, 12, 12, 12, bct.dX.p(), bct.dX.p(), false);
/*  999 */       a(☃, bwf1, 2, 5, 11, 4, 12, 12, bct.dX.p(), bct.dX.p(), false);
/* 1000 */       a(☃, bwf1, 8, 5, 11, 10, 12, 12, bct.dX.p(), bct.dX.p(), false);
/* 1001 */       a(☃, bwf1, 5, 9, 11, 7, 12, 12, bct.dX.p(), bct.dX.p(), false);
/* 1002 */       a(☃, bwf1, 2, 5, 0, 4, 12, 1, bct.dX.p(), bct.dX.p(), false);
/* 1003 */       a(☃, bwf1, 8, 5, 0, 10, 12, 1, bct.dX.p(), bct.dX.p(), false);
/* 1004 */       a(☃, bwf1, 5, 9, 0, 7, 12, 1, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1007 */       a(☃, bwf1, 2, 11, 2, 10, 12, 10, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1009 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/* 1010 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/* 1011 */       blc blc3 = blc2.a(ber.o, Boolean.valueOf(true));
/* 1012 */       blc blc4 = blc2.a(ber.b, Boolean.valueOf(true));
/*      */       
/*      */       int i;
/* 1015 */       for (i = 1; i <= 11; i += 2) {
/* 1016 */         a(☃, bwf1, i, 10, 0, i, 11, 0, blc1, blc1, false);
/* 1017 */         a(☃, bwf1, i, 10, 12, i, 11, 12, blc1, blc1, false);
/* 1018 */         a(☃, bwf1, 0, 10, i, 0, 11, i, blc2, blc2, false);
/* 1019 */         a(☃, bwf1, 12, 10, i, 12, 11, i, blc2, blc2, false);
/* 1020 */         a(☃, bct.dX.p(), i, 13, 0, bwf1);
/* 1021 */         a(☃, bct.dX.p(), i, 13, 12, bwf1);
/* 1022 */         a(☃, bct.dX.p(), 0, 13, i, bwf1);
/* 1023 */         a(☃, bct.dX.p(), 12, 13, i, bwf1);
/* 1024 */         if (i != 11) {
/* 1025 */           a(☃, blc1, i + 1, 13, 0, bwf1);
/* 1026 */           a(☃, blc1, i + 1, 13, 12, bwf1);
/* 1027 */           a(☃, blc2, 0, 13, i + 1, bwf1);
/* 1028 */           a(☃, blc2, 12, 13, i + 1, bwf1);
/*      */         } 
/*      */       } 
/* 1031 */       a(☃, bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 0, 13, 0, bwf1);
/* 1032 */       a(☃, bct.dY.p().a(ber.c, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 0, 13, 12, bwf1);
/* 1033 */       a(☃, bct.dY.p().a(ber.c, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 12, 13, 12, bwf1);
/* 1034 */       a(☃, bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 12, 13, 0, bwf1);
/*      */ 
/*      */       
/* 1037 */       for (i = 3; i <= 9; i += 2) {
/* 1038 */         a(☃, bwf1, 1, 7, i, 1, 8, i, blc3, blc3, false);
/* 1039 */         a(☃, bwf1, 11, 7, i, 11, 8, i, blc4, blc4, false);
/*      */       } 
/*      */ 
/*      */       
/* 1043 */       blc blc5 = bct.dZ.p().a(bhx.a, eq.c); int j;
/* 1044 */       for (j = 0; j <= 6; j++) {
/* 1045 */         int i1 = j + 4;
/* 1046 */         for (int i2 = 5; i2 <= 7; i2++) {
/* 1047 */           a(☃, blc5, i2, 5 + j, i1, bwf1);
/*      */         }
/* 1049 */         if (i1 >= 5 && i1 <= 8) {
/* 1050 */           a(☃, bwf1, 5, 5, i1, 7, j + 4, i1, bct.dX.p(), bct.dX.p(), false);
/* 1051 */         } else if (i1 >= 9 && i1 <= 10) {
/* 1052 */           a(☃, bwf1, 5, 8, i1, 7, j + 4, i1, bct.dX.p(), bct.dX.p(), false);
/*      */         } 
/* 1054 */         if (j >= 1) {
/* 1055 */           a(☃, bwf1, 5, 6 + j, i1, 7, 9 + j, i1, bct.a.p(), bct.a.p(), false);
/*      */         }
/*      */       } 
/* 1058 */       for (j = 5; j <= 7; j++) {
/* 1059 */         a(☃, blc5, j, 12, 11, bwf1);
/*      */       }
/* 1061 */       a(☃, bwf1, 5, 6, 7, 5, 7, 7, blc4, blc4, false);
/* 1062 */       a(☃, bwf1, 7, 6, 7, 7, 7, 7, blc3, blc3, false);
/* 1063 */       a(☃, bwf1, 5, 13, 12, 7, 13, 12, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1066 */       a(☃, bwf1, 2, 5, 2, 3, 5, 3, bct.dX.p(), bct.dX.p(), false);
/* 1067 */       a(☃, bwf1, 2, 5, 9, 3, 5, 10, bct.dX.p(), bct.dX.p(), false);
/* 1068 */       a(☃, bwf1, 2, 5, 4, 2, 5, 8, bct.dX.p(), bct.dX.p(), false);
/* 1069 */       a(☃, bwf1, 9, 5, 2, 10, 5, 3, bct.dX.p(), bct.dX.p(), false);
/* 1070 */       a(☃, bwf1, 9, 5, 9, 10, 5, 10, bct.dX.p(), bct.dX.p(), false);
/* 1071 */       a(☃, bwf1, 10, 5, 4, 10, 5, 8, bct.dX.p(), bct.dX.p(), false);
/* 1072 */       blc blc6 = blc5.a(bhx.a, eq.f);
/* 1073 */       blc blc7 = blc5.a(bhx.a, eq.e);
/* 1074 */       a(☃, blc7, 4, 5, 2, bwf1);
/* 1075 */       a(☃, blc7, 4, 5, 3, bwf1);
/* 1076 */       a(☃, blc7, 4, 5, 9, bwf1);
/* 1077 */       a(☃, blc7, 4, 5, 10, bwf1);
/* 1078 */       a(☃, blc6, 8, 5, 2, bwf1);
/* 1079 */       a(☃, blc6, 8, 5, 3, bwf1);
/* 1080 */       a(☃, blc6, 8, 5, 9, bwf1);
/* 1081 */       a(☃, blc6, 8, 5, 10, bwf1);
/*      */ 
/*      */       
/* 1084 */       a(☃, bwf1, 3, 4, 4, 4, 4, 8, bct.df.p(), bct.df.p(), false);
/* 1085 */       a(☃, bwf1, 8, 4, 4, 9, 4, 8, bct.df.p(), bct.df.p(), false);
/* 1086 */       a(☃, bwf1, 3, 5, 4, 4, 5, 8, bct.ea.p(), bct.ea.p(), false);
/* 1087 */       a(☃, bwf1, 8, 5, 4, 9, 5, 8, bct.ea.p(), bct.ea.p(), false);
/*      */ 
/*      */       
/* 1090 */       a(☃, bwf1, 4, 2, 0, 8, 2, 12, bct.dX.p(), bct.dX.p(), false);
/* 1091 */       a(☃, bwf1, 0, 2, 4, 12, 2, 8, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1093 */       a(☃, bwf1, 4, 0, 0, 8, 1, 3, bct.dX.p(), bct.dX.p(), false);
/* 1094 */       a(☃, bwf1, 4, 0, 9, 8, 1, 12, bct.dX.p(), bct.dX.p(), false);
/* 1095 */       a(☃, bwf1, 0, 0, 4, 3, 1, 8, bct.dX.p(), bct.dX.p(), false);
/* 1096 */       a(☃, bwf1, 9, 0, 4, 12, 1, 8, bct.dX.p(), bct.dX.p(), false);
/*      */       int n;
/* 1098 */       for (n = 4; n <= 8; n++) {
/* 1099 */         for (int i1 = 0; i1 <= 2; i1++) {
/* 1100 */           b(☃, bct.dX.p(), n, -1, i1, bwf1);
/* 1101 */           b(☃, bct.dX.p(), n, -1, 12 - i1, bwf1);
/*      */         } 
/*      */       } 
/* 1104 */       for (n = 0; n <= 2; n++) {
/* 1105 */         for (int i1 = 4; i1 <= 8; i1++) {
/* 1106 */           b(☃, bct.dX.p(), n, -1, i1, bwf1);
/* 1107 */           b(☃, bct.dX.p(), 12 - n, -1, i1, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1111 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class i
/*      */     extends m
/*      */   {
/*      */     public i() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public i(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1125 */       super(☃);
/*      */       
/* 1127 */       a(eq1);
/* 1128 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1133 */       a((bwr.q)☃, list, random, 1, 0, true);
/*      */     }
/*      */     
/*      */     public static i a(List<bxb> ☃, Random random, int j, int k, int n, eq eq1, int i1) {
/* 1137 */       bwf bwf = bwf.a(j, k, n, -1, 0, 0, 5, 7, 5, eq1);
/*      */       
/* 1139 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1140 */         return null;
/*      */       }
/*      */       
/* 1143 */       return new i(i1, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1149 */       a(☃, bwf1, 0, 0, 0, 4, 1, 4, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1151 */       a(☃, bwf1, 0, 2, 0, 4, 5, 4, bct.a.p(), bct.a.p(), false);
/*      */       
/* 1153 */       blc blc = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1156 */       a(☃, bwf1, 0, 2, 0, 0, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1157 */       a(☃, bwf1, 4, 2, 0, 4, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1158 */       a(☃, bwf1, 0, 3, 1, 0, 4, 1, blc, blc, false);
/* 1159 */       a(☃, bwf1, 0, 3, 3, 0, 4, 3, blc, blc, false);
/* 1160 */       a(☃, bwf1, 4, 3, 1, 4, 4, 1, blc, blc, false);
/* 1161 */       a(☃, bwf1, 4, 3, 3, 4, 4, 3, blc, blc, false);
/*      */ 
/*      */       
/* 1164 */       a(☃, bwf1, 0, 6, 0, 4, 6, 4, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1167 */       for (int j = 0; j <= 4; j++) {
/* 1168 */         for (int k = 0; k <= 4; k++) {
/* 1169 */           b(☃, bct.dX.p(), j, -1, k, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1173 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends m
/*      */   {
/*      */     public g() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public g(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1187 */       super(☃);
/*      */       
/* 1189 */       a(eq1);
/* 1190 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1195 */       a((bwr.q)☃, list, random, 1, 0, true);
/* 1196 */       b((bwr.q)☃, list, random, 0, 1, true);
/* 1197 */       c((bwr.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static g a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/* 1201 */       bwf bwf = bwf.a(i, j, k, -1, 0, 0, 5, 7, 5, eq1);
/*      */       
/* 1203 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1204 */         return null;
/*      */       }
/*      */       
/* 1207 */       return new g(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1213 */       a(☃, bwf1, 0, 0, 0, 4, 1, 4, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1215 */       a(☃, bwf1, 0, 2, 0, 4, 5, 4, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1218 */       a(☃, bwf1, 0, 2, 0, 0, 5, 0, bct.dX.p(), bct.dX.p(), false);
/* 1219 */       a(☃, bwf1, 4, 2, 0, 4, 5, 0, bct.dX.p(), bct.dX.p(), false);
/* 1220 */       a(☃, bwf1, 0, 2, 4, 0, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1221 */       a(☃, bwf1, 4, 2, 4, 4, 5, 4, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1224 */       a(☃, bwf1, 0, 6, 0, 4, 6, 4, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1227 */       for (int i = 0; i <= 4; i++) {
/* 1228 */         for (int j = 0; j <= 4; j++) {
/* 1229 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1233 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class j
/*      */     extends m
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public j() {}
/*      */ 
/*      */     
/*      */     public j(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1249 */       super(☃);
/*      */       
/* 1251 */       a(eq1);
/* 1252 */       this.n = bwf1;
/*      */       
/* 1254 */       this.a = (random.nextInt(3) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1259 */       super.a(☃, bxm1);
/*      */       
/* 1261 */       this.a = ☃.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1266 */       super.a(☃);
/*      */       
/* 1268 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1273 */       c((bwr.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static j a(List<bxb> ☃, Random random, int i, int k, int n, eq eq1, int i1) {
/* 1277 */       bwf bwf = bwf.a(i, k, n, -1, 0, 0, 5, 7, 5, eq1);
/*      */       
/* 1279 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1280 */         return null;
/*      */       }
/*      */       
/* 1283 */       return new j(i1, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1289 */       a(☃, bwf1, 0, 0, 0, 4, 1, 4, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1291 */       a(☃, bwf1, 0, 2, 0, 4, 5, 4, bct.a.p(), bct.a.p(), false);
/*      */       
/* 1293 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/* 1294 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1297 */       a(☃, bwf1, 0, 2, 0, 0, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1298 */       a(☃, bwf1, 0, 3, 1, 0, 4, 1, blc2, blc2, false);
/* 1299 */       a(☃, bwf1, 0, 3, 3, 0, 4, 3, blc2, blc2, false);
/*      */       
/* 1301 */       a(☃, bwf1, 4, 2, 0, 4, 5, 0, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1303 */       a(☃, bwf1, 1, 2, 4, 4, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1304 */       a(☃, bwf1, 1, 3, 4, 1, 4, 4, blc1, blc1, false);
/* 1305 */       a(☃, bwf1, 3, 3, 4, 3, 4, 4, blc1, blc1, false);
/*      */       
/* 1307 */       if (this.a && 
/* 1308 */         bwf1.b(new el(a(1, 3), d(2), b(1, 3)))) {
/* 1309 */         this.a = false;
/* 1310 */         a(☃, bwf1, random, 1, 2, 3, ccl.g);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1315 */       a(☃, bwf1, 0, 6, 0, 4, 6, 4, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1318 */       for (int i = 0; i <= 4; i++) {
/* 1319 */         for (int k = 0; k <= 4; k++) {
/* 1320 */           b(☃, bct.dX.p(), i, -1, k, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1324 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends m
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public h() {}
/*      */ 
/*      */     
/*      */     public h(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1340 */       super(☃);
/*      */       
/* 1342 */       a(eq1);
/* 1343 */       this.n = bwf1;
/*      */       
/* 1345 */       this.a = (random.nextInt(3) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1350 */       super.a(☃, bxm1);
/*      */       
/* 1352 */       this.a = ☃.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1357 */       super.a(☃);
/*      */       
/* 1359 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1364 */       b((bwr.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static h a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/* 1368 */       bwf bwf = bwf.a(i, j, k, -1, 0, 0, 5, 7, 5, eq1);
/*      */       
/* 1370 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1371 */         return null;
/*      */       }
/*      */       
/* 1374 */       return new h(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1380 */       a(☃, bwf1, 0, 0, 0, 4, 1, 4, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1382 */       a(☃, bwf1, 0, 2, 0, 4, 5, 4, bct.a.p(), bct.a.p(), false);
/*      */       
/* 1384 */       blc blc1 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/* 1385 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1388 */       a(☃, bwf1, 4, 2, 0, 4, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1389 */       a(☃, bwf1, 4, 3, 1, 4, 4, 1, blc2, blc2, false);
/* 1390 */       a(☃, bwf1, 4, 3, 3, 4, 4, 3, blc2, blc2, false);
/*      */       
/* 1392 */       a(☃, bwf1, 0, 2, 0, 0, 5, 0, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1394 */       a(☃, bwf1, 0, 2, 4, 3, 5, 4, bct.dX.p(), bct.dX.p(), false);
/* 1395 */       a(☃, bwf1, 1, 3, 4, 1, 4, 4, blc1, blc1, false);
/* 1396 */       a(☃, bwf1, 3, 3, 4, 3, 4, 4, blc1, blc1, false);
/*      */       
/* 1398 */       if (this.a && 
/* 1399 */         bwf1.b(new el(a(3, 3), d(2), b(3, 3)))) {
/* 1400 */         this.a = false;
/* 1401 */         a(☃, bwf1, random, 3, 2, 3, ccl.g);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1406 */       a(☃, bwf1, 0, 6, 0, 4, 6, 4, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1409 */       for (int i = 0; i <= 4; i++) {
/* 1410 */         for (int j = 0; j <= 4; j++) {
/* 1411 */           b(☃, bct.dX.p(), i, -1, j, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1415 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends m
/*      */   {
/*      */     public d() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public d(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1429 */       super(☃);
/*      */       
/* 1431 */       a(eq1);
/* 1432 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1437 */       a((bwr.q)☃, list, random, 1, 0, true);
/*      */     }
/*      */     
/*      */     public static d a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/* 1441 */       bwf bwf = bwf.a(i, j, k, -1, -7, 0, 5, 14, 10, eq1);
/*      */       
/* 1443 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1444 */         return null;
/*      */       }
/*      */       
/* 1447 */       return new d(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1453 */       blc blc1 = bct.dZ.p().a(bhx.a, eq.d);
/* 1454 */       blc blc2 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */       
/* 1456 */       for (int i = 0; i <= 9; i++) {
/* 1457 */         int j = Math.max(1, 7 - i);
/* 1458 */         int k = Math.min(Math.max(j + 5, 14 - i), 13);
/* 1459 */         int n = i;
/*      */ 
/*      */         
/* 1462 */         a(☃, bwf1, 0, 0, n, 4, j, n, bct.dX.p(), bct.dX.p(), false);
/*      */         
/* 1464 */         a(☃, bwf1, 1, j + 1, n, 3, k - 1, n, bct.a.p(), bct.a.p(), false);
/* 1465 */         if (i <= 6) {
/* 1466 */           a(☃, blc1, 1, j + 1, n, bwf1);
/* 1467 */           a(☃, blc1, 2, j + 1, n, bwf1);
/* 1468 */           a(☃, blc1, 3, j + 1, n, bwf1);
/*      */         } 
/*      */         
/* 1471 */         a(☃, bwf1, 0, k, n, 4, k, n, bct.dX.p(), bct.dX.p(), false);
/*      */         
/* 1473 */         a(☃, bwf1, 0, j + 1, n, 0, k - 1, n, bct.dX.p(), bct.dX.p(), false);
/* 1474 */         a(☃, bwf1, 4, j + 1, n, 4, k - 1, n, bct.dX.p(), bct.dX.p(), false);
/* 1475 */         if ((i & 0x1) == 0) {
/* 1476 */           a(☃, bwf1, 0, j + 2, n, 0, j + 3, n, blc2, blc2, false);
/* 1477 */           a(☃, bwf1, 4, j + 2, n, 4, j + 3, n, blc2, blc2, false);
/*      */         } 
/*      */ 
/*      */         
/* 1481 */         for (int i1 = 0; i1 <= 4; i1++) {
/* 1482 */           b(☃, bct.dX.p(), i1, -1, n, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1486 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class e
/*      */     extends m
/*      */   {
/*      */     public e() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public e(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1500 */       super(☃);
/*      */       
/* 1502 */       a(eq1);
/* 1503 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1508 */       int i = 1;
/*      */       
/* 1510 */       eq eq = f();
/* 1511 */       if (eq == eq.e || eq == eq.c) {
/* 1512 */         i = 5;
/*      */       }
/*      */       
/* 1515 */       b((bwr.q)☃, list, random, 0, i, (random.nextInt(8) > 0));
/* 1516 */       c((bwr.q)☃, list, random, 0, i, (random.nextInt(8) > 0));
/*      */     }
/*      */     
/*      */     public static e a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int n) {
/* 1520 */       bwf bwf = bwf.a(i, j, k, -3, 0, 0, 9, 7, 9, eq1);
/*      */       
/* 1522 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1523 */         return null;
/*      */       }
/*      */       
/* 1526 */       return new e(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1531 */       blc blc1 = bct.dY.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/* 1532 */       blc blc2 = bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1535 */       a(☃, bwf1, 0, 0, 0, 8, 1, 8, bct.dX.p(), bct.dX.p(), false);
/*      */       
/* 1537 */       a(☃, bwf1, 0, 2, 0, 8, 5, 8, bct.a.p(), bct.a.p(), false);
/*      */       
/* 1539 */       a(☃, bwf1, 0, 6, 0, 8, 6, 5, bct.dX.p(), bct.dX.p(), false);
/*      */ 
/*      */       
/* 1542 */       a(☃, bwf1, 0, 2, 0, 2, 5, 0, bct.dX.p(), bct.dX.p(), false);
/* 1543 */       a(☃, bwf1, 6, 2, 0, 8, 5, 0, bct.dX.p(), bct.dX.p(), false);
/* 1544 */       a(☃, bwf1, 1, 3, 0, 1, 4, 0, blc2, blc2, false);
/* 1545 */       a(☃, bwf1, 7, 3, 0, 7, 4, 0, blc2, blc2, false);
/*      */ 
/*      */       
/* 1548 */       a(☃, bwf1, 0, 2, 4, 8, 2, 8, bct.dX.p(), bct.dX.p(), false);
/* 1549 */       a(☃, bwf1, 1, 1, 4, 2, 2, 4, bct.a.p(), bct.a.p(), false);
/* 1550 */       a(☃, bwf1, 6, 1, 4, 7, 2, 4, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1553 */       a(☃, bwf1, 1, 3, 8, 7, 3, 8, blc2, blc2, false);
/* 1554 */       a(☃, bct.dY.p().a(ber.b, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true)), 0, 3, 8, bwf1);
/* 1555 */       a(☃, bct.dY.p().a(ber.o, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true)), 8, 3, 8, bwf1);
/* 1556 */       a(☃, bwf1, 0, 3, 6, 0, 3, 7, blc1, blc1, false);
/* 1557 */       a(☃, bwf1, 8, 3, 6, 8, 3, 7, blc1, blc1, false);
/*      */ 
/*      */       
/* 1560 */       a(☃, bwf1, 0, 3, 4, 0, 5, 5, bct.dX.p(), bct.dX.p(), false);
/* 1561 */       a(☃, bwf1, 8, 3, 4, 8, 5, 5, bct.dX.p(), bct.dX.p(), false);
/* 1562 */       a(☃, bwf1, 1, 3, 5, 2, 5, 5, bct.dX.p(), bct.dX.p(), false);
/* 1563 */       a(☃, bwf1, 6, 3, 5, 7, 5, 5, bct.dX.p(), bct.dX.p(), false);
/* 1564 */       a(☃, bwf1, 1, 4, 5, 1, 5, 5, blc2, blc2, false);
/* 1565 */       a(☃, bwf1, 7, 4, 5, 7, 5, 5, blc2, blc2, false);
/*      */ 
/*      */       
/* 1568 */       for (int i = 0; i <= 5; i++) {
/* 1569 */         for (int j = 0; j <= 8; j++) {
/* 1570 */           b(☃, bct.dX.p(), j, -1, i, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1574 */       return true;
/*      */     }
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\bwr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */