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
/*      */ public class bwx
/*      */ {
/*      */   public static void a() {
/*   45 */     bwy.a((Class)a.class, "SHCC");
/*   46 */     bwy.a((Class)b.class, "SHFC");
/*   47 */     bwy.a((Class)c.class, "SH5C");
/*   48 */     bwy.a((Class)d.class, "SHLT");
/*   49 */     bwy.a((Class)e.class, "SHLi");
/*   50 */     bwy.a((Class)g.class, "SHPR");
/*   51 */     bwy.a((Class)h.class, "SHPH");
/*   52 */     bwy.a((Class)i.class, "SHRT");
/*   53 */     bwy.a((Class)j.class, "SHRC");
/*   54 */     bwy.a((Class)l.class, "SHSD");
/*   55 */     bwy.a((Class)m.class, "SHStart");
/*   56 */     bwy.a((Class)n.class, "SHS");
/*   57 */     bwy.a((Class)o.class, "SHSSD");
/*      */   }
/*      */   
/*      */   static class f {
/*      */     public Class<? extends bwx.p> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public int d;
/*      */     
/*      */     public f(Class<? extends bwx.p> ☃, int i, int j) {
/*   67 */       this.a = ☃;
/*   68 */       this.b = i;
/*   69 */       this.d = j;
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   73 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   77 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */   
/*   81 */   private static final f[] a = new f[] { new f((Class)n.class, 40, 0), new f((Class)h.class, 5, 5), new f((Class)d.class, 20, 0), new f((Class)i.class, 20, 0), new f((Class)j.class, 10, 6), new f((Class)o.class, 5, 5), new f((Class)l.class, 5, 5), new f((Class)c.class, 5, 4), new f((Class)a.class, 5, 4), new f(e.class, 10, 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public boolean a(int ☃)
/*      */         {
/*   94 */           return (super.a(☃) && ☃ > 4);
/*      */         }
/*      */       }, 
/*      */       new f(g.class, 20, 1)
/*      */       {
/*      */         public boolean a(int ☃) {
/*  100 */           return (super.a(☃) && ☃ > 5);
/*      */         }
/*      */       } };
/*      */   
/*      */   private static List<f> b;
/*      */   private static Class<? extends p> c;
/*      */   private static int d;
/*      */   
/*      */   public static void b() {
/*  109 */     b = Lists.newArrayList();
/*  110 */     for (f ☃ : a) {
/*  111 */       ☃.c = 0;
/*  112 */       b.add(☃);
/*      */     } 
/*  114 */     c = null;
/*      */   }
/*      */   
/*      */   private static boolean d() {
/*  118 */     boolean ☃ = false;
/*  119 */     d = 0;
/*  120 */     for (f f1 : b) {
/*  121 */       if (f1.d > 0 && f1.c < f1.d) {
/*  122 */         ☃ = true;
/*      */       }
/*  124 */       d += f1.b;
/*      */     } 
/*  126 */     return ☃;
/*      */   }
/*      */   
/*      */   private static p a(Class<? extends p> ☃, List<bxb> list, Random random, int i, int j, int m, @Nullable eq eq1, int n) {
/*  130 */     p p = null;
/*      */     
/*  132 */     if (☃ == n.class) {
/*  133 */       p = n.a(list, random, i, j, m, eq1, n);
/*  134 */     } else if (☃ == h.class) {
/*  135 */       p = h.a(list, random, i, j, m, eq1, n);
/*  136 */     } else if (☃ == d.class) {
/*  137 */       p = d.a(list, random, i, j, m, eq1, n);
/*  138 */     } else if (☃ == i.class) {
/*  139 */       p = i.a(list, random, i, j, m, eq1, n);
/*  140 */     } else if (☃ == j.class) {
/*  141 */       p = j.a(list, random, i, j, m, eq1, n);
/*  142 */     } else if (☃ == o.class) {
/*  143 */       p = o.a(list, random, i, j, m, eq1, n);
/*  144 */     } else if (☃ == l.class) {
/*  145 */       p = l.a(list, random, i, j, m, eq1, n);
/*  146 */     } else if (☃ == c.class) {
/*  147 */       p = c.a(list, random, i, j, m, eq1, n);
/*  148 */     } else if (☃ == a.class) {
/*  149 */       p = a.a(list, random, i, j, m, eq1, n);
/*  150 */     } else if (☃ == e.class) {
/*  151 */       p = e.a(list, random, i, j, m, eq1, n);
/*  152 */     } else if (☃ == g.class) {
/*  153 */       p = g.a(list, random, i, j, m, eq1, n);
/*      */     } 
/*      */     
/*  156 */     return p;
/*      */   }
/*      */   
/*      */   private static p b(m ☃, List<bxb> list, Random random, int i, int j, int n, eq eq1, int i1) {
/*  160 */     if (!d()) {
/*  161 */       return null;
/*      */     }
/*      */     
/*  164 */     if (c != null) {
/*  165 */       p p = a(c, list, random, i, j, n, eq1, i1);
/*  166 */       c = null;
/*      */       
/*  168 */       if (p != null) {
/*  169 */         return p;
/*      */       }
/*      */     } 
/*      */     
/*  173 */     int i2 = 0;
/*  174 */     while (i2 < 5) {
/*  175 */       i2++;
/*      */       
/*  177 */       int i3 = random.nextInt(d);
/*  178 */       for (f f1 : b) {
/*  179 */         i3 -= f1.b;
/*  180 */         if (i3 < 0) {
/*  181 */           if (!f1.a(i1) || f1 == ☃.a) {
/*      */             break;
/*      */           }
/*      */           
/*  185 */           p p = a(f1.a, list, random, i, j, n, eq1, i1);
/*  186 */           if (p != null) {
/*  187 */             f1.c++;
/*  188 */             ☃.a = f1;
/*      */             
/*  190 */             if (!f1.a()) {
/*  191 */               b.remove(f1);
/*      */             }
/*  193 */             return p;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*  198 */     bwf bwf = b.a(list, random, i, j, n, eq1);
/*  199 */     if (bwf != null && bwf.b > 1) {
/*  200 */       return new b(i1, random, bwf, eq1);
/*      */     }
/*      */     
/*  203 */     return null;
/*      */   }
/*      */   
/*      */   private static bxb c(m ☃, List<bxb> list, Random random, int i, int j, int n, @Nullable eq eq1, int i1) {
/*  207 */     if (i1 > 50) {
/*  208 */       return null;
/*      */     }
/*  210 */     if (Math.abs(i - (☃.d()).a) > 112 || Math.abs(n - (☃.d()).c) > 112) {
/*  211 */       return null;
/*      */     }
/*      */     
/*  214 */     bxb bxb = b(☃, list, random, i, j, n, eq1, i1 + 1);
/*  215 */     if (bxb != null) {
/*  216 */       list.add(bxb);
/*  217 */       ☃.c.add(bxb);
/*      */     } 
/*  219 */     return bxb;
/*      */   }
/*      */   
/*      */   static abstract class p extends bxb {
/*  223 */     protected a d = a.a;
/*      */ 
/*      */     
/*      */     public p() {}
/*      */ 
/*      */     
/*      */     protected p(int ☃) {
/*  230 */       super(☃);
/*      */     }
/*      */     
/*      */     public enum a {
/*  234 */       a, b, c, d;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  239 */       ☃.a("EntryDoor", this.d.name());
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  244 */       this.d = a.valueOf(☃.l("EntryDoor"));
/*      */     }
/*      */     
/*      */     protected void a(axz ☃, Random random, bwf bwf1, a a1, int i, int j, int k) {
/*  248 */       switch (bwx.null.a[a1.ordinal()]) {
/*      */         case 1:
/*  250 */           a(☃, bwf1, i, j, k, i + 3 - 1, j + 3 - 1, k, m, m, false);
/*      */           break;
/*      */         case 2:
/*  253 */           a(☃, bct.dy.p(), i, j, k, bwf1);
/*  254 */           a(☃, bct.dy.p(), i, j + 1, k, bwf1);
/*  255 */           a(☃, bct.dy.p(), i, j + 2, k, bwf1);
/*  256 */           a(☃, bct.dy.p(), i + 1, j + 2, k, bwf1);
/*  257 */           a(☃, bct.dy.p(), i + 2, j + 2, k, bwf1);
/*  258 */           a(☃, bct.dy.p(), i + 2, j + 1, k, bwf1);
/*  259 */           a(☃, bct.dy.p(), i + 2, j, k, bwf1);
/*  260 */           a(☃, bct.ct.p(), i + 1, j, k, bwf1);
/*  261 */           a(☃, bct.ct.p().a(bed.p, bmg.a), i + 1, j + 1, k, bwf1);
/*      */           break;
/*      */         case 3:
/*  264 */           a(☃, bct.jI.p(), i + 1, j, k, bwf1);
/*  265 */           a(☃, bct.jI.p(), i + 1, j + 1, k, bwf1);
/*  266 */           a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)), i, j, k, bwf1);
/*  267 */           a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)), i, j + 1, k, bwf1);
/*  268 */           a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)).a(bfm.o, Boolean.valueOf(true)), i, j + 2, k, bwf1);
/*  269 */           a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)).a(bfm.o, Boolean.valueOf(true)), i + 1, j + 2, k, bwf1);
/*  270 */           a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)).a(bfm.o, Boolean.valueOf(true)), i + 2, j + 2, k, bwf1);
/*  271 */           a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)), i + 2, j + 1, k, bwf1);
/*  272 */           a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)), i + 2, j, k, bwf1);
/*      */           break;
/*      */         case 4:
/*  275 */           a(☃, bct.dy.p(), i, j, k, bwf1);
/*  276 */           a(☃, bct.dy.p(), i, j + 1, k, bwf1);
/*  277 */           a(☃, bct.dy.p(), i, j + 2, k, bwf1);
/*  278 */           a(☃, bct.dy.p(), i + 1, j + 2, k, bwf1);
/*  279 */           a(☃, bct.dy.p(), i + 2, j + 2, k, bwf1);
/*  280 */           a(☃, bct.dy.p(), i + 2, j + 1, k, bwf1);
/*  281 */           a(☃, bct.dy.p(), i + 2, j, k, bwf1);
/*  282 */           a(☃, bct.cF.p(), i + 1, j, k, bwf1);
/*  283 */           a(☃, bct.cF.p().a(bed.p, bmg.a), i + 1, j + 1, k, bwf1);
/*  284 */           a(☃, bct.cP.p().a(bdb.D, eq.c), i + 2, j + 1, k + 1, bwf1);
/*  285 */           a(☃, bct.cP.p().a(bdb.D, eq.d), i + 2, j + 1, k - 1, bwf1);
/*      */           break;
/*      */       } 
/*      */     }
/*      */     
/*      */     protected a a(Random ☃) {
/*  291 */       int i = ☃.nextInt(5);
/*  292 */       switch (i)
/*      */       
/*      */       { 
/*      */         default:
/*  296 */           return a.a;
/*      */         case 2:
/*  298 */           return a.b;
/*      */         case 3:
/*  300 */           return a.c;
/*      */         case 4:
/*  302 */           break; }  return a.d;
/*      */     }
/*      */ 
/*      */     
/*      */     @Nullable
/*      */     protected bxb a(bwx.m ☃, List<bxb> list, Random random, int i, int j) {
/*  308 */       eq eq = f();
/*  309 */       if (eq != null) {
/*  310 */         switch (bwx.null.b[eq.ordinal()]) {
/*      */           case 1:
/*  312 */             return bwx.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, eq, e());
/*      */           case 2:
/*  314 */             return bwx.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, eq, e());
/*      */           case 3:
/*  316 */             return bwx.a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, eq, e());
/*      */           case 4:
/*  318 */             return bwx.a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, eq, e());
/*      */         } 
/*      */       }
/*  321 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb b(bwx.m ☃, List<bxb> list, Random random, int i, int j) {
/*  326 */       eq eq = f();
/*  327 */       if (eq != null) {
/*  328 */         switch (bwx.null.b[eq.ordinal()]) {
/*      */           case 1:
/*  330 */             return bwx.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*      */           case 2:
/*  332 */             return bwx.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*      */           case 3:
/*  334 */             return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*      */           case 4:
/*  336 */             return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*      */         } 
/*      */       }
/*  339 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb c(bwx.m ☃, List<bxb> list, Random random, int i, int j) {
/*  344 */       eq eq = f();
/*  345 */       if (eq != null) {
/*  346 */         switch (bwx.null.b[eq.ordinal()]) {
/*      */           case 1:
/*  348 */             return bwx.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*      */           case 2:
/*  350 */             return bwx.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*      */           case 3:
/*  352 */             return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*      */           case 4:
/*  354 */             return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*      */         } 
/*      */       }
/*  357 */       return null;
/*      */     }
/*      */     
/*      */     protected static boolean a(bwf ☃) {
/*  361 */       return (☃ != null && ☃.b > 10);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends p
/*      */   {
/*      */     private int a;
/*      */ 
/*      */     
/*      */     public b() {}
/*      */ 
/*      */     
/*      */     public b(int ☃, Random random, bwf bwf1, eq eq1) {
/*  376 */       super(☃);
/*      */       
/*  378 */       a(eq1);
/*  379 */       this.n = bwf1;
/*  380 */       this.a = (eq1 == eq.c || eq1 == eq.d) ? bwf1.e() : bwf1.c();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  385 */       super.a(☃);
/*  386 */       ☃.b("Steps", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  391 */       super.a(☃, bxm1);
/*  392 */       this.a = ☃.h("Steps");
/*      */     }
/*      */     
/*      */     public static bwf a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1) {
/*  396 */       int m = 3;
/*      */       
/*  398 */       bwf bwf = bwf.a(i, j, k, -1, -1, 0, 5, 5, 4, eq1);
/*      */       
/*  400 */       bxb bxb = bxb.a(☃, bwf);
/*  401 */       if (bxb == null)
/*      */       {
/*  403 */         return null;
/*      */       }
/*      */       
/*  406 */       if ((bxb.d()).b == bwf.b)
/*      */       {
/*  408 */         for (int n = 3; n >= 1; n--) {
/*  409 */           bwf = bwf.a(i, j, k, -1, -1, 0, 5, 5, n - 1, eq1);
/*  410 */           if (!bxb.d().a(bwf))
/*      */           {
/*      */             
/*  413 */             return bwf.a(i, j, k, -1, -1, 0, 5, 5, n, eq1);
/*      */           }
/*      */         } 
/*      */       }
/*      */       
/*  418 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  424 */       for (int i = 0; i < this.a; i++) {
/*      */         
/*  426 */         a(☃, bct.dy.p(), 0, 0, i, bwf1);
/*  427 */         a(☃, bct.dy.p(), 1, 0, i, bwf1);
/*  428 */         a(☃, bct.dy.p(), 2, 0, i, bwf1);
/*  429 */         a(☃, bct.dy.p(), 3, 0, i, bwf1);
/*  430 */         a(☃, bct.dy.p(), 4, 0, i, bwf1);
/*      */         
/*  432 */         for (int j = 1; j <= 3; j++) {
/*  433 */           a(☃, bct.dy.p(), 0, j, i, bwf1);
/*  434 */           a(☃, bct.jI.p(), 1, j, i, bwf1);
/*  435 */           a(☃, bct.jI.p(), 2, j, i, bwf1);
/*  436 */           a(☃, bct.jI.p(), 3, j, i, bwf1);
/*  437 */           a(☃, bct.dy.p(), 4, j, i, bwf1);
/*      */         } 
/*      */         
/*  440 */         a(☃, bct.dy.p(), 0, 4, i, bwf1);
/*  441 */         a(☃, bct.dy.p(), 1, 4, i, bwf1);
/*  442 */         a(☃, bct.dy.p(), 2, 4, i, bwf1);
/*  443 */         a(☃, bct.dy.p(), 3, 4, i, bwf1);
/*  444 */         a(☃, bct.dy.p(), 4, 4, i, bwf1);
/*      */       } 
/*      */       
/*  447 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public l() {}
/*      */ 
/*      */     
/*      */     public l(int ☃, Random random, int i, int j) {
/*  463 */       super(☃);
/*      */       
/*  465 */       this.a = true;
/*  466 */       a(eq.c.a.a(random));
/*  467 */       this.d = bwx.p.a.a;
/*      */       
/*  469 */       if (f().k() == eq.a.c) {
/*  470 */         this.n = new bwf(i, 64, j, i + 5 - 1, 74, j + 5 - 1);
/*      */       } else {
/*  472 */         this.n = new bwf(i, 64, j, i + 5 - 1, 74, j + 5 - 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public l(int ☃, Random random, bwf bwf1, eq eq1) {
/*  477 */       super(☃);
/*      */       
/*  479 */       this.a = false;
/*  480 */       a(eq1);
/*  481 */       this.d = a(random);
/*  482 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  487 */       super.a(☃);
/*  488 */       ☃.a("Source", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  493 */       super.a(☃, bxm1);
/*  494 */       this.a = ☃.q("Source");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  499 */       if (this.a)
/*      */       {
/*  501 */         bwx.a(bwx.c.class);
/*      */       }
/*  503 */       a((bwx.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static l a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/*  507 */       bwf bwf = bwf.a(i, j, k, -1, -7, 0, 5, 11, 5, eq1);
/*      */       
/*  509 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  510 */         return null;
/*      */       }
/*      */       
/*  513 */       return new l(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  519 */       a(☃, bwf1, 0, 0, 0, 4, 10, 4, true, random, bwx.c());
/*      */       
/*  521 */       a(☃, random, bwf1, this.d, 1, 7, 0);
/*      */       
/*  523 */       a(☃, random, bwf1, bwx.p.a.a, 1, 1, 4);
/*      */ 
/*      */       
/*  526 */       a(☃, bct.dy.p(), 2, 6, 1, bwf1);
/*  527 */       a(☃, bct.dy.p(), 1, 5, 1, bwf1);
/*  528 */       a(☃, bct.bJ.p(), 1, 6, 1, bwf1);
/*  529 */       a(☃, bct.dy.p(), 1, 5, 2, bwf1);
/*  530 */       a(☃, bct.dy.p(), 1, 4, 3, bwf1);
/*  531 */       a(☃, bct.bJ.p(), 1, 5, 3, bwf1);
/*  532 */       a(☃, bct.dy.p(), 2, 4, 3, bwf1);
/*  533 */       a(☃, bct.dy.p(), 3, 3, 3, bwf1);
/*  534 */       a(☃, bct.bJ.p(), 3, 4, 3, bwf1);
/*  535 */       a(☃, bct.dy.p(), 3, 3, 2, bwf1);
/*  536 */       a(☃, bct.dy.p(), 3, 2, 1, bwf1);
/*  537 */       a(☃, bct.bJ.p(), 3, 3, 1, bwf1);
/*  538 */       a(☃, bct.dy.p(), 2, 2, 1, bwf1);
/*  539 */       a(☃, bct.dy.p(), 1, 1, 1, bwf1);
/*  540 */       a(☃, bct.bJ.p(), 1, 2, 1, bwf1);
/*  541 */       a(☃, bct.dy.p(), 1, 1, 2, bwf1);
/*  542 */       a(☃, bct.bJ.p(), 1, 1, 3, bwf1);
/*      */       
/*  544 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class m
/*      */     extends l
/*      */   {
/*      */     public bwx.f a;
/*      */     public bwx.g b;
/*  553 */     public List<bxb> c = Lists.newArrayList();
/*      */ 
/*      */     
/*      */     public m() {}
/*      */ 
/*      */     
/*      */     public m(int ☃, Random random, int i, int j) {
/*  560 */       super(0, random, i, j);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class n
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */ 
/*      */     
/*      */     private boolean b;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public n() {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public n(int ☃, Random random, bwf bwf1, eq eq1) {
/*  585 */       super(☃);
/*      */       
/*  587 */       a(eq1);
/*  588 */       this.d = a(random);
/*  589 */       this.n = bwf1;
/*      */       
/*  591 */       this.a = (random.nextInt(2) == 0);
/*  592 */       this.b = (random.nextInt(2) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  597 */       super.a(☃);
/*  598 */       ☃.a("Left", this.a);
/*  599 */       ☃.a("Right", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  604 */       super.a(☃, bxm1);
/*  605 */       this.a = ☃.q("Left");
/*  606 */       this.b = ☃.q("Right");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  611 */       a((bwx.m)☃, list, random, 1, 1);
/*  612 */       if (this.a) {
/*  613 */         b((bwx.m)☃, list, random, 1, 2);
/*      */       }
/*  615 */       if (this.b) {
/*  616 */         c((bwx.m)☃, list, random, 1, 2);
/*      */       }
/*      */     }
/*      */     
/*      */     public static n a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/*  621 */       bwf bwf = bwf.a(i, j, k, -1, -1, 0, 5, 5, 7, eq1);
/*      */       
/*  623 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  624 */         return null;
/*      */       }
/*      */       
/*  627 */       return new n(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  633 */       a(☃, bwf1, 0, 0, 0, 4, 4, 6, true, random, bwx.c());
/*      */       
/*  635 */       a(☃, random, bwf1, this.d, 1, 1, 0);
/*      */       
/*  637 */       a(☃, random, bwf1, bwx.p.a.a, 1, 1, 6);
/*      */       
/*  639 */       blc blc1 = bct.cg.p().a(biv.a, eq.f);
/*  640 */       blc blc2 = bct.cg.p().a(biv.a, eq.e);
/*      */       
/*  642 */       a(☃, bwf1, random, 0.1F, 1, 2, 1, blc1);
/*  643 */       a(☃, bwf1, random, 0.1F, 3, 2, 1, blc2);
/*  644 */       a(☃, bwf1, random, 0.1F, 1, 2, 5, blc1);
/*  645 */       a(☃, bwf1, random, 0.1F, 3, 2, 5, blc2);
/*      */       
/*  647 */       if (this.a) {
/*  648 */         a(☃, bwf1, 0, 1, 2, 0, 3, 4, m, m, false);
/*      */       }
/*  650 */       if (this.b) {
/*  651 */         a(☃, bwf1, 4, 1, 2, 4, 3, 4, m, m, false);
/*      */       }
/*      */       
/*  654 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public a() {}
/*      */ 
/*      */     
/*      */     public a(int ☃, Random random, bwf bwf1, eq eq1) {
/*  670 */       super(☃);
/*      */       
/*  672 */       a(eq1);
/*  673 */       this.d = a(random);
/*  674 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  679 */       super.a(☃);
/*  680 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  685 */       super.a(☃, bxm1);
/*  686 */       this.a = ☃.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  691 */       a((bwx.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static a a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/*  695 */       bwf bwf = bwf.a(i, j, k, -1, -1, 0, 5, 5, 7, eq1);
/*      */       
/*  697 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  698 */         return null;
/*      */       }
/*      */       
/*  701 */       return new a(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  707 */       a(☃, bwf1, 0, 0, 0, 4, 4, 6, true, random, bwx.c());
/*      */       
/*  709 */       a(☃, random, bwf1, this.d, 1, 1, 0);
/*      */       
/*  711 */       a(☃, random, bwf1, bwx.p.a.a, 1, 1, 6);
/*      */ 
/*      */       
/*  714 */       a(☃, bwf1, 3, 1, 2, 3, 1, 4, bct.dy.p(), bct.dy.p(), false);
/*  715 */       a(☃, bct.bO.p(), 3, 1, 1, bwf1);
/*  716 */       a(☃, bct.bO.p(), 3, 1, 5, bwf1);
/*  717 */       a(☃, bct.bO.p(), 3, 2, 2, bwf1);
/*  718 */       a(☃, bct.bO.p(), 3, 2, 4, bwf1);
/*  719 */       for (int i = 2; i <= 4; i++) {
/*  720 */         a(☃, bct.bO.p(), 2, 1, i, bwf1);
/*      */       }
/*      */       
/*  723 */       if (!this.a && 
/*  724 */         bwf1.b(new el(a(3, 3), d(2), b(3, 3)))) {
/*  725 */         this.a = true;
/*  726 */         a(☃, bwf1, random, 3, 2, 3, ccl.j);
/*      */       } 
/*      */ 
/*      */       
/*  730 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class o
/*      */     extends p
/*      */   {
/*      */     public o() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public o(int ☃, Random random, bwf bwf1, eq eq1) {
/*  744 */       super(☃);
/*      */       
/*  746 */       a(eq1);
/*  747 */       this.d = a(random);
/*  748 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  753 */       a((bwx.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static o a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/*  757 */       bwf bwf = bwf.a(i, j, k, -1, -7, 0, 5, 11, 8, eq1);
/*      */       
/*  759 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  760 */         return null;
/*      */       }
/*      */       
/*  763 */       return new o(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  769 */       a(☃, bwf1, 0, 0, 0, 4, 10, 7, true, random, bwx.c());
/*      */       
/*  771 */       a(☃, random, bwf1, this.d, 1, 7, 0);
/*      */       
/*  773 */       a(☃, random, bwf1, bwx.p.a.a, 1, 1, 7);
/*      */ 
/*      */       
/*  776 */       blc blc = bct.cB.p().a(bhx.a, eq.d);
/*  777 */       for (int i = 0; i < 6; i++) {
/*  778 */         a(☃, blc, 1, 6 - i, 1 + i, bwf1);
/*  779 */         a(☃, blc, 2, 6 - i, 1 + i, bwf1);
/*  780 */         a(☃, blc, 3, 6 - i, 1 + i, bwf1);
/*  781 */         if (i < 5) {
/*  782 */           a(☃, bct.dy.p(), 1, 5 - i, 1 + i, bwf1);
/*  783 */           a(☃, bct.dy.p(), 2, 5 - i, 1 + i, bwf1);
/*  784 */           a(☃, bct.dy.p(), 3, 5 - i, 1 + i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/*  788 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends p
/*      */   {
/*      */     public d() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public d(int ☃, Random random, bwf bwf1, eq eq1) {
/*  802 */       super(☃);
/*      */       
/*  804 */       a(eq1);
/*  805 */       this.d = a(random);
/*  806 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  811 */       eq eq = f();
/*  812 */       if (eq == eq.c || eq == eq.f) {
/*  813 */         b((bwx.m)☃, list, random, 1, 1);
/*      */       } else {
/*  815 */         c((bwx.m)☃, list, random, 1, 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public static d a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/*  820 */       bwf bwf = bwf.a(i, j, k, -1, -1, 0, 5, 5, 5, eq1);
/*      */       
/*  822 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  823 */         return null;
/*      */       }
/*      */       
/*  826 */       return new d(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  832 */       a(☃, bwf1, 0, 0, 0, 4, 4, 4, true, random, bwx.c());
/*      */       
/*  834 */       a(☃, random, bwf1, this.d, 1, 1, 0);
/*      */       
/*  836 */       eq eq = f();
/*  837 */       if (eq == eq.c || eq == eq.f) {
/*  838 */         a(☃, bwf1, 0, 1, 1, 0, 3, 3, m, m, false);
/*      */       } else {
/*  840 */         a(☃, bwf1, 4, 1, 1, 4, 3, 3, m, m, false);
/*      */       } 
/*      */       
/*  843 */       return true;
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
/*      */   public static class i
/*      */     extends d
/*      */   {
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  858 */       eq eq = f();
/*  859 */       if (eq == eq.c || eq == eq.f) {
/*  860 */         c((bwx.m)☃, list, random, 1, 1);
/*      */       } else {
/*  862 */         b((bwx.m)☃, list, random, 1, 1);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  869 */       a(☃, bwf1, 0, 0, 0, 4, 4, 4, true, random, bwx.c());
/*      */       
/*  871 */       a(☃, random, bwf1, this.d, 1, 1, 0);
/*      */       
/*  873 */       eq eq = f();
/*  874 */       if (eq == eq.c || eq == eq.f) {
/*  875 */         a(☃, bwf1, 4, 1, 1, 4, 3, 3, m, m, false);
/*      */       } else {
/*  877 */         a(☃, bwf1, 0, 1, 1, 0, 3, 3, m, m, false);
/*      */       } 
/*      */       
/*  880 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class j
/*      */     extends p
/*      */   {
/*      */     protected int a;
/*      */ 
/*      */     
/*      */     public j() {}
/*      */ 
/*      */     
/*      */     public j(int ☃, Random random, bwf bwf1, eq eq1) {
/*  896 */       super(☃);
/*      */       
/*  898 */       a(eq1);
/*  899 */       this.d = a(random);
/*  900 */       this.n = bwf1;
/*  901 */       this.a = random.nextInt(5);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  906 */       super.a(☃);
/*  907 */       ☃.b("Type", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  912 */       super.a(☃, bxm1);
/*  913 */       this.a = ☃.h("Type");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  918 */       a((bwx.m)☃, list, random, 4, 1);
/*  919 */       b((bwx.m)☃, list, random, 1, 4);
/*  920 */       c((bwx.m)☃, list, random, 1, 4);
/*      */     }
/*      */     
/*      */     public static j a(List<bxb> ☃, Random random, int i, int k, int m, eq eq1, int n) {
/*  924 */       bwf bwf = bwf.a(i, k, m, -4, -1, 0, 11, 7, 11, eq1);
/*      */       
/*  926 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*  927 */         return null;
/*      */       }
/*      */       
/*  930 */       return new j(n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1)
/*      */     {
/*  936 */       a(☃, bwf1, 0, 0, 0, 10, 6, 10, true, random, bwx.c());
/*      */       
/*  938 */       a(☃, random, bwf1, this.d, 4, 1, 0);
/*      */       
/*  940 */       a(☃, bwf1, 4, 1, 10, 6, 3, 10, m, m, false);
/*  941 */       a(☃, bwf1, 0, 1, 4, 0, 3, 6, m, m, false);
/*  942 */       a(☃, bwf1, 10, 1, 4, 10, 3, 6, m, m, false);
/*      */       
/*  944 */       switch (this.a) {
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         default:
/* 1021 */           return true;
/*      */         case 0:
/*      */           a(☃, bct.dy.p(), 5, 1, 5, bwf1); a(☃, bct.dy.p(), 5, 2, 5, bwf1); a(☃, bct.dy.p(), 5, 3, 5, bwf1); a(☃, bct.cg.p().a(biv.a, eq.e), 4, 3, 5, bwf1); a(☃, bct.cg.p().a(biv.a, eq.f), 6, 3, 5, bwf1); a(☃, bct.cg.p().a(biv.a, eq.d), 5, 3, 4, bwf1); a(☃, bct.cg.p().a(biv.a, eq.c), 5, 3, 6, bwf1); a(☃, bct.bJ.p(), 4, 1, 4, bwf1); a(☃, bct.bJ.p(), 4, 1, 5, bwf1); a(☃, bct.bJ.p(), 4, 1, 6, bwf1); a(☃, bct.bJ.p(), 6, 1, 4, bwf1); a(☃, bct.bJ.p(), 6, 1, 5, bwf1); a(☃, bct.bJ.p(), 6, 1, 6, bwf1); a(☃, bct.bJ.p(), 5, 1, 4, bwf1); a(☃, bct.bJ.p(), 5, 1, 6, bwf1);
/*      */         case 1:
/*      */           for (i = 0; i < 5; i++) { a(☃, bct.dy.p(), 3, 1, 3 + i, bwf1); a(☃, bct.dy.p(), 7, 1, 3 + i, bwf1); a(☃, bct.dy.p(), 3 + i, 1, 3, bwf1); a(☃, bct.dy.p(), 3 + i, 1, 7, bwf1); }
/*      */            a(☃, bct.dy.p(), 5, 1, 5, bwf1); a(☃, bct.dy.p(), 5, 2, 5, bwf1); a(☃, bct.dy.p(), 5, 3, 5, bwf1); a(☃, bct.A.p(), 5, 4, 5, bwf1);
/*      */         case 2:
/*      */           break;
/*      */       }  int i; for (i = 1; i <= 9; i++) { a(☃, bct.m.p(), 1, 3, i, bwf1); a(☃, bct.m.p(), 9, 3, i, bwf1); }
/*      */        for (i = 1; i <= 9; i++) { a(☃, bct.m.p(), i, 3, 1, bwf1); a(☃, bct.m.p(), i, 3, 9, bwf1); }
/*      */        a(☃, bct.m.p(), 5, 1, 4, bwf1); a(☃, bct.m.p(), 5, 1, 6, bwf1); a(☃, bct.m.p(), 5, 3, 4, bwf1); a(☃, bct.m.p(), 5, 3, 6, bwf1); a(☃, bct.m.p(), 4, 1, 5, bwf1); a(☃, bct.m.p(), 6, 1, 5, bwf1); a(☃, bct.m.p(), 4, 3, 5, bwf1); a(☃, bct.m.p(), 6, 3, 5, bwf1); for (i = 1; i <= 3; i++) { a(☃, bct.m.p(), 4, i, 4, bwf1); a(☃, bct.m.p(), 6, i, 4, bwf1); a(☃, bct.m.p(), 4, i, 6, bwf1); a(☃, bct.m.p(), 6, i, 6, bwf1); }
/*      */        a(☃, bct.cf.p(), 5, 3, 5, bwf1); for (i = 2; i <= 8; i++) { a(☃, bct.n.p(), 2, 3, i, bwf1); a(☃, bct.n.p(), 3, 3, i, bwf1); if (i <= 3 || i >= 7) {
/*      */           a(☃, bct.n.p(), 4, 3, i, bwf1); a(☃, bct.n.p(), 5, 3, i, bwf1); a(☃, bct.n.p(), 6, 3, i, bwf1);
/*      */         }  a(☃, bct.n.p(), 7, 3, i, bwf1); a(☃, bct.n.p(), 8, 3, i, bwf1); }
/* 1035 */        blc blc = bct.cz.p().a(bfq.a, eq.e); a(☃, blc, 9, 1, 3, bwf1); a(☃, blc, 9, 2, 3, bwf1); a(☃, blc, 9, 3, 3, bwf1); a(☃, bwf1, random, 3, 4, 8, ccl.i); } } public static class h extends p { public h(int ☃, Random random, bwf bwf1, eq eq1) { super(☃);
/*      */       
/* 1037 */       a(eq1);
/* 1038 */       this.d = a(random);
/* 1039 */       this.n = bwf1; }
/*      */     
/*      */     public h() {}
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1044 */       a((bwx.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static h a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/* 1048 */       bwf bwf = bwf.a(i, j, k, -1, -1, 0, 9, 5, 11, eq1);
/*      */       
/* 1050 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1051 */         return null;
/*      */       }
/*      */       
/* 1054 */       return new h(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1060 */       a(☃, bwf1, 0, 0, 0, 8, 4, 10, true, random, bwx.c());
/*      */       
/* 1062 */       a(☃, random, bwf1, this.d, 1, 1, 0);
/*      */       
/* 1064 */       a(☃, bwf1, 1, 1, 10, 3, 3, 10, m, m, false);
/*      */ 
/*      */       
/* 1067 */       a(☃, bwf1, 4, 1, 1, 4, 3, 1, false, random, bwx.c());
/* 1068 */       a(☃, bwf1, 4, 1, 3, 4, 3, 3, false, random, bwx.c());
/* 1069 */       a(☃, bwf1, 4, 1, 7, 4, 3, 7, false, random, bwx.c());
/* 1070 */       a(☃, bwf1, 4, 1, 9, 4, 3, 9, false, random, bwx.c());
/*      */ 
/*      */       
/* 1073 */       for (int i = 1; i <= 3; i++) {
/* 1074 */         a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true)), 4, i, 4, bwf1);
/* 1075 */         a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true)).a(bfm.b, Boolean.valueOf(true)), 4, i, 5, bwf1);
/* 1076 */         a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true)), 4, i, 6, bwf1);
/*      */         
/* 1078 */         a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)).a(bfm.b, Boolean.valueOf(true)), 5, i, 5, bwf1);
/* 1079 */         a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)).a(bfm.b, Boolean.valueOf(true)), 6, i, 5, bwf1);
/* 1080 */         a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)).a(bfm.b, Boolean.valueOf(true)), 7, i, 5, bwf1);
/*      */       } 
/*      */ 
/*      */       
/* 1084 */       a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true)), 4, 3, 2, bwf1);
/* 1085 */       a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true)), 4, 3, 8, bwf1);
/* 1086 */       blc blc1 = bct.cF.p().a(bed.a, eq.e);
/* 1087 */       blc blc2 = bct.cF.p().a(bed.a, eq.e).a(bed.p, bmg.a);
/* 1088 */       a(☃, blc1, 4, 1, 2, bwf1);
/* 1089 */       a(☃, blc2, 4, 2, 2, bwf1);
/* 1090 */       a(☃, blc1, 4, 1, 8, bwf1);
/* 1091 */       a(☃, blc2, 4, 2, 8, bwf1);
/*      */       
/* 1093 */       return true;
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class e
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */ 
/*      */     
/*      */     public e() {}
/*      */ 
/*      */     
/*      */     public e(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1110 */       super(☃);
/*      */       
/* 1112 */       a(eq1);
/* 1113 */       this.d = a(random);
/* 1114 */       this.n = bwf1;
/* 1115 */       this.a = (bwf1.d() > 6);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1120 */       super.a(☃);
/* 1121 */       ☃.a("Tall", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1126 */       super.a(☃, bxm1);
/* 1127 */       this.a = ☃.q("Tall");
/*      */     }
/*      */ 
/*      */     
/*      */     public static e a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/* 1132 */       bwf bwf = bwf.a(i, j, k, -4, -1, 0, 14, 11, 15, eq1);
/*      */       
/* 1134 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/*      */         
/* 1136 */         bwf = bwf.a(i, j, k, -4, -1, 0, 14, 6, 15, eq1);
/*      */         
/* 1138 */         if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1139 */           return null;
/*      */         }
/*      */       } 
/*      */       
/* 1143 */       return new e(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1148 */       int i = 11;
/* 1149 */       if (!this.a) {
/* 1150 */         i = 6;
/*      */       }
/*      */ 
/*      */       
/* 1154 */       a(☃, bwf1, 0, 0, 0, 13, i - 1, 14, true, random, bwx.c());
/*      */       
/* 1156 */       a(☃, random, bwf1, this.d, 4, 1, 0);
/*      */ 
/*      */       
/* 1159 */       a(☃, bwf1, random, 0.07F, 2, 1, 1, 11, 4, 13, bct.aQ.p(), bct.aQ.p(), false, false);
/*      */       
/* 1161 */       int j = 1;
/* 1162 */       int k = 12;
/*      */       
/*      */       int m;
/* 1165 */       for (m = 1; m <= 13; m++) {
/* 1166 */         if ((m - 1) % 4 == 0) {
/* 1167 */           a(☃, bwf1, 1, 1, m, 1, 4, m, bct.n.p(), bct.n.p(), false);
/* 1168 */           a(☃, bwf1, 12, 1, m, 12, 4, m, bct.n.p(), bct.n.p(), false);
/*      */           
/* 1170 */           a(☃, bct.cg.p().a(biv.a, eq.f), 2, 3, m, bwf1);
/* 1171 */           a(☃, bct.cg.p().a(biv.a, eq.e), 11, 3, m, bwf1);
/*      */           
/* 1173 */           if (this.a) {
/* 1174 */             a(☃, bwf1, 1, 6, m, 1, 9, m, bct.n.p(), bct.n.p(), false);
/* 1175 */             a(☃, bwf1, 12, 6, m, 12, 9, m, bct.n.p(), bct.n.p(), false);
/*      */           } 
/*      */         } else {
/* 1178 */           a(☃, bwf1, 1, 1, m, 1, 4, m, bct.cc.p(), bct.cc.p(), false);
/* 1179 */           a(☃, bwf1, 12, 1, m, 12, 4, m, bct.cc.p(), bct.cc.p(), false);
/*      */           
/* 1181 */           if (this.a) {
/* 1182 */             a(☃, bwf1, 1, 6, m, 1, 9, m, bct.cc.p(), bct.cc.p(), false);
/* 1183 */             a(☃, bwf1, 12, 6, m, 12, 9, m, bct.cc.p(), bct.cc.p(), false);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1189 */       for (m = 3; m < 12; m += 2) {
/* 1190 */         a(☃, bwf1, 3, 1, m, 4, 3, m, bct.cc.p(), bct.cc.p(), false);
/* 1191 */         a(☃, bwf1, 6, 1, m, 7, 3, m, bct.cc.p(), bct.cc.p(), false);
/* 1192 */         a(☃, bwf1, 9, 1, m, 10, 3, m, bct.cc.p(), bct.cc.p(), false);
/*      */       } 
/*      */       
/* 1195 */       if (this.a) {
/*      */         
/* 1197 */         a(☃, bwf1, 1, 5, 1, 3, 5, 13, bct.n.p(), bct.n.p(), false);
/* 1198 */         a(☃, bwf1, 10, 5, 1, 12, 5, 13, bct.n.p(), bct.n.p(), false);
/* 1199 */         a(☃, bwf1, 4, 5, 1, 9, 5, 2, bct.n.p(), bct.n.p(), false);
/* 1200 */         a(☃, bwf1, 4, 5, 12, 9, 5, 13, bct.n.p(), bct.n.p(), false);
/*      */         
/* 1202 */         a(☃, bct.n.p(), 9, 5, 11, bwf1);
/* 1203 */         a(☃, bct.n.p(), 8, 5, 11, bwf1);
/* 1204 */         a(☃, bct.n.p(), 9, 5, 10, bwf1);
/*      */         
/* 1206 */         blc blc1 = bct.cX.p().a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/* 1207 */         blc blc2 = bct.cX.p().a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/*      */ 
/*      */         
/* 1210 */         a(☃, bwf1, 3, 6, 3, 3, 6, 11, blc2, blc2, false);
/* 1211 */         a(☃, bwf1, 10, 6, 3, 10, 6, 9, blc2, blc2, false);
/* 1212 */         a(☃, bwf1, 4, 6, 2, 9, 6, 2, blc1, blc1, false);
/* 1213 */         a(☃, bwf1, 4, 6, 12, 7, 6, 12, blc1, blc1, false);
/*      */         
/* 1215 */         a(☃, bct.cX.p().a(ber.a, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 3, 6, 2, bwf1);
/* 1216 */         a(☃, bct.cX.p().a(ber.c, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 3, 6, 12, bwf1);
/* 1217 */         a(☃, bct.cX.p().a(ber.a, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 10, 6, 2, bwf1);
/*      */         
/* 1219 */         for (int n = 0; n <= 2; n++) {
/* 1220 */           a(☃, bct.cX.p().a(ber.c, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 8 + n, 6, 12 - n, bwf1);
/* 1221 */           if (n != 2) {
/* 1222 */             a(☃, bct.cX.p().a(ber.a, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 8 + n, 6, 11 - n, bwf1);
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/* 1227 */         blc blc3 = bct.cz.p().a(bfq.a, eq.d);
/* 1228 */         a(☃, blc3, 10, 1, 13, bwf1);
/* 1229 */         a(☃, blc3, 10, 2, 13, bwf1);
/* 1230 */         a(☃, blc3, 10, 3, 13, bwf1);
/* 1231 */         a(☃, blc3, 10, 4, 13, bwf1);
/* 1232 */         a(☃, blc3, 10, 5, 13, bwf1);
/* 1233 */         a(☃, blc3, 10, 6, 13, bwf1);
/* 1234 */         a(☃, blc3, 10, 7, 13, bwf1);
/*      */ 
/*      */         
/* 1237 */         int i1 = 7;
/* 1238 */         int i2 = 7;
/* 1239 */         blc blc4 = bct.cX.p().a(ber.b, Boolean.valueOf(true));
/* 1240 */         a(☃, blc4, 6, 9, 7, bwf1);
/* 1241 */         blc blc5 = bct.cX.p().a(ber.o, Boolean.valueOf(true));
/* 1242 */         a(☃, blc5, 7, 9, 7, bwf1);
/*      */         
/* 1244 */         a(☃, blc4, 6, 8, 7, bwf1);
/* 1245 */         a(☃, blc5, 7, 8, 7, bwf1);
/*      */         
/* 1247 */         blc blc6 = blc2.a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*      */         
/* 1249 */         a(☃, blc6, 6, 7, 7, bwf1);
/* 1250 */         a(☃, blc6, 7, 7, 7, bwf1);
/*      */         
/* 1252 */         a(☃, blc4, 5, 7, 7, bwf1);
/*      */         
/* 1254 */         a(☃, blc5, 8, 7, 7, bwf1);
/*      */         
/* 1256 */         a(☃, blc4.a(ber.a, Boolean.valueOf(true)), 6, 7, 6, bwf1);
/* 1257 */         a(☃, blc4.a(ber.c, Boolean.valueOf(true)), 6, 7, 8, bwf1);
/*      */         
/* 1259 */         a(☃, blc5.a(ber.a, Boolean.valueOf(true)), 7, 7, 6, bwf1);
/* 1260 */         a(☃, blc5.a(ber.c, Boolean.valueOf(true)), 7, 7, 8, bwf1);
/*      */         
/* 1262 */         blc blc7 = bct.cf.p();
/* 1263 */         a(☃, blc7, 5, 8, 7, bwf1);
/* 1264 */         a(☃, blc7, 8, 8, 7, bwf1);
/* 1265 */         a(☃, blc7, 6, 8, 6, bwf1);
/* 1266 */         a(☃, blc7, 6, 8, 8, bwf1);
/* 1267 */         a(☃, blc7, 7, 8, 6, bwf1);
/* 1268 */         a(☃, blc7, 7, 8, 8, bwf1);
/*      */       } 
/*      */ 
/*      */       
/* 1272 */       a(☃, bwf1, random, 3, 3, 5, ccl.h);
/* 1273 */       if (this.a) {
/* 1274 */         a(☃, m, 12, 9, 1, bwf1);
/* 1275 */         a(☃, bwf1, random, 12, 8, 1, ccl.h);
/*      */       } 
/*      */       
/* 1278 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */     
/*      */     private boolean b;
/*      */     
/*      */     private boolean c;
/*      */     
/*      */     private boolean e;
/*      */     
/*      */     public c() {}
/*      */     
/*      */     public c(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1297 */       super(☃);
/*      */       
/* 1299 */       a(eq1);
/* 1300 */       this.d = a(random);
/* 1301 */       this.n = bwf1;
/*      */       
/* 1303 */       this.a = random.nextBoolean();
/* 1304 */       this.b = random.nextBoolean();
/* 1305 */       this.c = random.nextBoolean();
/* 1306 */       this.e = (random.nextInt(3) > 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1311 */       super.a(☃);
/* 1312 */       ☃.a("leftLow", this.a);
/* 1313 */       ☃.a("leftHigh", this.b);
/* 1314 */       ☃.a("rightLow", this.c);
/* 1315 */       ☃.a("rightHigh", this.e);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1320 */       super.a(☃, bxm1);
/* 1321 */       this.a = ☃.q("leftLow");
/* 1322 */       this.b = ☃.q("leftHigh");
/* 1323 */       this.c = ☃.q("rightLow");
/* 1324 */       this.e = ☃.q("rightHigh");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1329 */       int i = 3;
/* 1330 */       int j = 5;
/*      */       
/* 1332 */       eq eq = f();
/* 1333 */       if (eq == eq.e || eq == eq.c) {
/* 1334 */         i = 8 - i;
/* 1335 */         j = 8 - j;
/*      */       } 
/*      */       
/* 1338 */       a((bwx.m)☃, list, random, 5, 1);
/* 1339 */       if (this.a) {
/* 1340 */         b((bwx.m)☃, list, random, i, 1);
/*      */       }
/* 1342 */       if (this.b) {
/* 1343 */         b((bwx.m)☃, list, random, j, 7);
/*      */       }
/* 1345 */       if (this.c) {
/* 1346 */         c((bwx.m)☃, list, random, i, 1);
/*      */       }
/* 1348 */       if (this.e) {
/* 1349 */         c((bwx.m)☃, list, random, j, 7);
/*      */       }
/*      */     }
/*      */     
/*      */     public static c a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/* 1354 */       bwf bwf = bwf.a(i, j, k, -4, -3, 0, 10, 9, 11, eq1);
/*      */       
/* 1356 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1357 */         return null;
/*      */       }
/*      */       
/* 1360 */       return new c(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1366 */       a(☃, bwf1, 0, 0, 0, 9, 8, 10, true, random, bwx.c());
/*      */       
/* 1368 */       a(☃, random, bwf1, this.d, 4, 3, 0);
/*      */ 
/*      */       
/* 1371 */       if (this.a) {
/* 1372 */         a(☃, bwf1, 0, 3, 1, 0, 5, 3, m, m, false);
/*      */       }
/* 1374 */       if (this.c) {
/* 1375 */         a(☃, bwf1, 9, 3, 1, 9, 5, 3, m, m, false);
/*      */       }
/* 1377 */       if (this.b) {
/* 1378 */         a(☃, bwf1, 0, 5, 7, 0, 7, 9, m, m, false);
/*      */       }
/* 1380 */       if (this.e) {
/* 1381 */         a(☃, bwf1, 9, 5, 7, 9, 7, 9, m, m, false);
/*      */       }
/* 1383 */       a(☃, bwf1, 5, 1, 10, 7, 3, 10, m, m, false);
/*      */ 
/*      */       
/* 1386 */       a(☃, bwf1, 1, 2, 1, 8, 2, 6, false, random, bwx.c());
/*      */       
/* 1388 */       a(☃, bwf1, 4, 1, 5, 4, 4, 9, false, random, bwx.c());
/* 1389 */       a(☃, bwf1, 8, 1, 5, 8, 4, 9, false, random, bwx.c());
/*      */       
/* 1391 */       a(☃, bwf1, 1, 4, 7, 3, 4, 9, false, random, bwx.c());
/*      */ 
/*      */       
/* 1394 */       a(☃, bwf1, 1, 3, 5, 3, 3, 6, false, random, bwx.c());
/* 1395 */       a(☃, bwf1, 1, 3, 4, 3, 3, 4, bct.bJ.p(), bct.bJ.p(), false);
/* 1396 */       a(☃, bwf1, 1, 4, 6, 3, 4, 6, bct.bJ.p(), bct.bJ.p(), false);
/*      */ 
/*      */       
/* 1399 */       a(☃, bwf1, 5, 1, 7, 7, 1, 8, false, random, bwx.c());
/* 1400 */       a(☃, bwf1, 5, 1, 9, 7, 1, 9, bct.bJ.p(), bct.bJ.p(), false);
/* 1401 */       a(☃, bwf1, 5, 2, 7, 7, 2, 7, bct.bJ.p(), bct.bJ.p(), false);
/*      */ 
/*      */       
/* 1404 */       a(☃, bwf1, 4, 5, 7, 4, 5, 9, bct.bJ.p(), bct.bJ.p(), false);
/* 1405 */       a(☃, bwf1, 8, 5, 7, 8, 5, 9, bct.bJ.p(), bct.bJ.p(), false);
/* 1406 */       a(☃, bwf1, 5, 5, 7, 7, 5, 9, bct.bJ.p().a(bhl.a, bmp.c), bct.bJ.p().a(bhl.a, bmp.c), false);
/* 1407 */       a(☃, bct.cg.p().a(biv.a, eq.d), 6, 5, 6, bwf1);
/*      */       
/* 1409 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public g() {}
/*      */ 
/*      */     
/*      */     public g(int ☃, Random random, bwf bwf1, eq eq1) {
/* 1425 */       super(☃);
/*      */       
/* 1427 */       a(eq1);
/* 1428 */       this.n = bwf1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1433 */       super.a(☃);
/* 1434 */       ☃.a("Mob", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1439 */       super.a(☃, bxm1);
/* 1440 */       this.a = ☃.q("Mob");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/* 1445 */       if (☃ != null) {
/* 1446 */         ((bwx.m)☃).b = this;
/*      */       }
/*      */     }
/*      */     
/*      */     public static g a(List<bxb> ☃, Random random, int i, int j, int k, eq eq1, int m) {
/* 1451 */       bwf bwf = bwf.a(i, j, k, -4, -1, 0, 11, 8, 16, eq1);
/*      */       
/* 1453 */       if (!a(bwf) || bxb.a(☃, bwf) != null) {
/* 1454 */         return null;
/*      */       }
/*      */       
/* 1457 */       return new g(m, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1463 */       a(☃, bwf1, 0, 0, 0, 10, 7, 15, false, random, bwx.c());
/*      */       
/* 1465 */       a(☃, random, bwf1, bwx.p.a.c, 4, 1, 0);
/*      */ 
/*      */       
/* 1468 */       int i = 6;
/* 1469 */       a(☃, bwf1, 1, i, 1, 1, i, 14, false, random, bwx.c());
/* 1470 */       a(☃, bwf1, 9, i, 1, 9, i, 14, false, random, bwx.c());
/* 1471 */       a(☃, bwf1, 2, i, 1, 8, i, 2, false, random, bwx.c());
/* 1472 */       a(☃, bwf1, 2, i, 14, 8, i, 14, false, random, bwx.c());
/*      */ 
/*      */       
/* 1475 */       a(☃, bwf1, 1, 1, 1, 2, 1, 4, false, random, bwx.c());
/* 1476 */       a(☃, bwf1, 8, 1, 1, 9, 1, 4, false, random, bwx.c());
/* 1477 */       a(☃, bwf1, 1, 1, 1, 1, 1, 3, bct.C.p(), bct.C.p(), false);
/* 1478 */       a(☃, bwf1, 9, 1, 1, 9, 1, 3, bct.C.p(), bct.C.p(), false);
/*      */ 
/*      */       
/* 1481 */       a(☃, bwf1, 3, 1, 8, 7, 1, 12, false, random, bwx.c());
/* 1482 */       a(☃, bwf1, 4, 1, 9, 6, 1, 11, bct.C.p(), bct.C.p(), false);
/*      */ 
/*      */       
/* 1485 */       blc blc1 = bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true));
/* 1486 */       blc blc2 = bct.dF.p().a(bfm.o, Boolean.valueOf(true)).a(bfm.b, Boolean.valueOf(true)); int j;
/* 1487 */       for (j = 3; j < 14; j += 2) {
/* 1488 */         a(☃, bwf1, 0, 3, j, 0, 4, j, blc1, blc1, false);
/* 1489 */         a(☃, bwf1, 10, 3, j, 10, 4, j, blc1, blc1, false);
/*      */       } 
/* 1491 */       for (j = 2; j < 9; j += 2) {
/* 1492 */         a(☃, bwf1, j, 3, 15, j, 4, 15, blc2, blc2, false);
/*      */       }
/*      */ 
/*      */       
/* 1496 */       blc blc3 = bct.dU.p().a(bhx.a, eq.c);
/* 1497 */       a(☃, bwf1, 4, 1, 5, 6, 1, 7, false, random, bwx.c());
/* 1498 */       a(☃, bwf1, 4, 2, 6, 6, 2, 7, false, random, bwx.c());
/* 1499 */       a(☃, bwf1, 4, 3, 7, 6, 3, 7, false, random, bwx.c());
/* 1500 */       for (int k = 4; k <= 6; k++) {
/* 1501 */         a(☃, blc3, k, 1, 4, bwf1);
/* 1502 */         a(☃, blc3, k, 2, 5, bwf1);
/* 1503 */         a(☃, blc3, k, 3, 6, bwf1);
/*      */       } 
/*      */       
/* 1506 */       blc blc4 = bct.ef.p().a(bek.a, eq.c);
/* 1507 */       blc blc5 = bct.ef.p().a(bek.a, eq.d);
/* 1508 */       blc blc6 = bct.ef.p().a(bek.a, eq.f);
/* 1509 */       blc blc7 = bct.ef.p().a(bek.a, eq.e);
/*      */       
/* 1511 */       boolean bool = true;
/* 1512 */       boolean[] arrayOfBoolean = new boolean[12];
/* 1513 */       for (int m = 0; m < arrayOfBoolean.length; m++) {
/* 1514 */         arrayOfBoolean[m] = (random.nextFloat() > 0.9F);
/* 1515 */         bool &= arrayOfBoolean[m];
/*      */       } 
/*      */       
/* 1518 */       a(☃, blc4.a(bek.b, Boolean.valueOf(arrayOfBoolean[0])), 4, 3, 8, bwf1);
/* 1519 */       a(☃, blc4.a(bek.b, Boolean.valueOf(arrayOfBoolean[1])), 5, 3, 8, bwf1);
/* 1520 */       a(☃, blc4.a(bek.b, Boolean.valueOf(arrayOfBoolean[2])), 6, 3, 8, bwf1);
/* 1521 */       a(☃, blc5.a(bek.b, Boolean.valueOf(arrayOfBoolean[3])), 4, 3, 12, bwf1);
/* 1522 */       a(☃, blc5.a(bek.b, Boolean.valueOf(arrayOfBoolean[4])), 5, 3, 12, bwf1);
/* 1523 */       a(☃, blc5.a(bek.b, Boolean.valueOf(arrayOfBoolean[5])), 6, 3, 12, bwf1);
/* 1524 */       a(☃, blc6.a(bek.b, Boolean.valueOf(arrayOfBoolean[6])), 3, 3, 9, bwf1);
/* 1525 */       a(☃, blc6.a(bek.b, Boolean.valueOf(arrayOfBoolean[7])), 3, 3, 10, bwf1);
/* 1526 */       a(☃, blc6.a(bek.b, Boolean.valueOf(arrayOfBoolean[8])), 3, 3, 11, bwf1);
/* 1527 */       a(☃, blc7.a(bek.b, Boolean.valueOf(arrayOfBoolean[9])), 7, 3, 9, bwf1);
/* 1528 */       a(☃, blc7.a(bek.b, Boolean.valueOf(arrayOfBoolean[10])), 7, 3, 10, bwf1);
/* 1529 */       a(☃, blc7.a(bek.b, Boolean.valueOf(arrayOfBoolean[11])), 7, 3, 11, bwf1);
/*      */       
/* 1531 */       if (bool) {
/* 1532 */         blc blc = bct.ee.p();
/*      */         
/* 1534 */         a(☃, blc, 4, 3, 9, bwf1);
/* 1535 */         a(☃, blc, 5, 3, 9, bwf1);
/* 1536 */         a(☃, blc, 6, 3, 9, bwf1);
/* 1537 */         a(☃, blc, 4, 3, 10, bwf1);
/* 1538 */         a(☃, blc, 5, 3, 10, bwf1);
/* 1539 */         a(☃, blc, 6, 3, 10, bwf1);
/* 1540 */         a(☃, blc, 4, 3, 11, bwf1);
/* 1541 */         a(☃, blc, 5, 3, 11, bwf1);
/* 1542 */         a(☃, blc, 6, 3, 11, bwf1);
/*      */       } 
/*      */       
/* 1545 */       if (!this.a) {
/* 1546 */         i = d(3);
/* 1547 */         el el = new el(a(5, 6), i, b(5, 6));
/* 1548 */         if (bwf1.b(el)) {
/* 1549 */           this.a = true;
/* 1550 */           ☃.a(el, bct.ci.p(), 2);
/*      */           
/* 1552 */           bji bji = ☃.f(el);
/* 1553 */           if (bji instanceof bke) {
/* 1554 */             ((bke)bji).c().a(aev.aj);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1559 */       return true;
/*      */     } }
/*      */   
/*      */   static class k extends bxb.a {
/*      */     private k() {}
/*      */     
/*      */     public void a(Random ☃, int i, int j, int m, boolean bool) {
/* 1566 */       if (bool) {
/* 1567 */         float f = ☃.nextFloat();
/* 1568 */         if (f < 0.2F) {
/* 1569 */           this.a = bct.dA.p();
/* 1570 */         } else if (f < 0.5F) {
/* 1571 */           this.a = bct.dz.p();
/* 1572 */         } else if (f < 0.55F) {
/* 1573 */           this.a = bct.du.p();
/*      */         } else {
/* 1575 */           this.a = bct.dy.p();
/*      */         } 
/*      */       } else {
/* 1578 */         this.a = bct.jI.p();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/* 1583 */   private static final k e = new k();
/*      */ }


/* Location:              F:\dw\server.jar!\bwx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */