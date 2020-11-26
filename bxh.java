/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Iterator;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ public class bxh
/*      */ {
/*      */   public enum n
/*      */   {
/*   50 */     a(0),
/*   51 */     b(1),
/*   52 */     c(2),
/*   53 */     d(3);
/*      */     
/*      */     private final int e;
/*      */ 
/*      */     
/*      */     n(int ☃) {
/*   59 */       this.e = ☃;
/*      */     }
/*      */     
/*      */     public int a() {
/*   63 */       return this.e;
/*      */     }
/*      */     
/*      */     public static n a(int ☃) {
/*   67 */       n[] arrayOfN = values();
/*   68 */       if (☃ >= 0 && ☃ < arrayOfN.length) {
/*   69 */         return arrayOfN[☃];
/*      */       }
/*   71 */       return a;
/*      */     }
/*      */   }
/*      */   
/*      */   public static void a() {
/*   76 */     bwy.a((Class)a.class, "ViBH");
/*   77 */     bwy.a((Class)b.class, "ViDF");
/*   78 */     bwy.a((Class)c.class, "ViF");
/*   79 */     bwy.a((Class)d.class, "ViL");
/*   80 */     bwy.a((Class)f.class, "ViPH");
/*   81 */     bwy.a((Class)g.class, "ViSH");
/*   82 */     bwy.a((Class)h.class, "ViSmH");
/*   83 */     bwy.a((Class)i.class, "ViST");
/*   84 */     bwy.a((Class)j.class, "ViS");
/*   85 */     bwy.a((Class)k.class, "ViStart");
/*   86 */     bwy.a((Class)l.class, "ViSR");
/*   87 */     bwy.a((Class)m.class, "ViTRH");
/*   88 */     bwy.a((Class)q.class, "ViW");
/*      */   }
/*      */   
/*      */   public static class e {
/*      */     public Class<? extends bxh.o> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public int d;
/*      */     
/*      */     public e(Class<? extends bxh.o> ☃, int i, int j) {
/*   98 */       this.a = ☃;
/*   99 */       this.b = i;
/*  100 */       this.d = j;
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*  104 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*  108 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */   
/*      */   public static List<e> a(Random ☃, int i) {
/*  113 */     List<e> list = Lists.newArrayList();
/*      */     
/*  115 */     list.add(new e((Class)g.class, 4, xq.a(☃, 2 + i, 4 + i * 2)));
/*  116 */     list.add(new e((Class)i.class, 20, xq.a(☃, 0 + i, 1 + i)));
/*  117 */     list.add(new e((Class)a.class, 20, xq.a(☃, 0 + i, 2 + i)));
/*  118 */     list.add(new e((Class)h.class, 3, xq.a(☃, 2 + i, 5 + i * 3)));
/*  119 */     list.add(new e((Class)f.class, 15, xq.a(☃, 0 + i, 2 + i)));
/*  120 */     list.add(new e((Class)b.class, 3, xq.a(☃, 1 + i, 4 + i)));
/*  121 */     list.add(new e((Class)c.class, 3, xq.a(☃, 2 + i, 4 + i * 2)));
/*  122 */     list.add(new e((Class)j.class, 15, xq.a(☃, 0, 1 + i)));
/*  123 */     list.add(new e((Class)m.class, 8, xq.a(☃, 0 + i, 3 + i * 2)));
/*      */ 
/*      */     
/*  126 */     Iterator<e> iterator = list.iterator();
/*  127 */     while (iterator.hasNext()) {
/*  128 */       if (((e)iterator.next()).d == 0) {
/*  129 */         iterator.remove();
/*      */       }
/*      */     } 
/*      */     
/*  133 */     return list;
/*      */   }
/*      */   
/*      */   private static int a(List<e> ☃) {
/*  137 */     boolean bool = false;
/*  138 */     int i = 0;
/*  139 */     for (e e : ☃) {
/*  140 */       if (e.d > 0 && e.c < e.d) {
/*  141 */         bool = true;
/*      */       }
/*  143 */       i += e.b;
/*      */     } 
/*  145 */     return bool ? i : -1;
/*      */   }
/*      */   
/*      */   private static o a(k ☃, e e1, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/*  149 */     Class<? extends o> clazz = e1.a;
/*  150 */     o o = null;
/*      */     
/*  152 */     if (clazz == g.class) {
/*  153 */       o = g.a(☃, list, random, i, j, m, eq1, n);
/*  154 */     } else if (clazz == i.class) {
/*  155 */       o = i.a(☃, list, random, i, j, m, eq1, n);
/*  156 */     } else if (clazz == a.class) {
/*  157 */       o = a.a(☃, list, random, i, j, m, eq1, n);
/*  158 */     } else if (clazz == h.class) {
/*  159 */       o = h.a(☃, list, random, i, j, m, eq1, n);
/*  160 */     } else if (clazz == f.class) {
/*  161 */       o = f.a(☃, list, random, i, j, m, eq1, n);
/*  162 */     } else if (clazz == b.class) {
/*  163 */       o = b.a(☃, list, random, i, j, m, eq1, n);
/*  164 */     } else if (clazz == c.class) {
/*  165 */       o = c.a(☃, list, random, i, j, m, eq1, n);
/*  166 */     } else if (clazz == j.class) {
/*  167 */       o = j.a(☃, list, random, i, j, m, eq1, n);
/*  168 */     } else if (clazz == m.class) {
/*  169 */       o = m.a(☃, list, random, i, j, m, eq1, n);
/*      */     } 
/*      */     
/*  172 */     return o;
/*      */   }
/*      */   
/*      */   private static o c(k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/*  176 */     int i1 = a(☃.c);
/*  177 */     if (i1 <= 0) {
/*  178 */       return null;
/*      */     }
/*      */     
/*  181 */     int i2 = 0;
/*  182 */     while (i2 < 5) {
/*  183 */       i2++;
/*      */       
/*  185 */       int i3 = random.nextInt(i1);
/*  186 */       for (e e : ☃.c) {
/*  187 */         i3 -= e.b;
/*  188 */         if (i3 < 0) {
/*  189 */           if (!e.a(n) || (e == ☃.b && ☃.c.size() > 1)) {
/*      */             break;
/*      */           }
/*      */           
/*  193 */           o o = a(☃, e, list, random, i, j, m, eq1, n);
/*  194 */           if (o != null) {
/*  195 */             e.c++;
/*  196 */             ☃.b = e;
/*      */             
/*  198 */             if (!e.a()) {
/*  199 */               ☃.c.remove(e);
/*      */             }
/*  201 */             return o;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  208 */     bwf bwf = d.a(☃, list, random, i, j, m, eq1);
/*  209 */     if (bwf != null) {
/*  210 */       return new d(☃, n, random, bwf, eq1);
/*      */     }
/*      */     
/*  213 */     return null;
/*      */   }
/*      */   
/*      */   private static bxb d(k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/*  217 */     if (n > 50) {
/*  218 */       return null;
/*      */     }
/*  220 */     if (Math.abs(i - (☃.d()).a) > 112 || Math.abs(m - (☃.d()).c) > 112) {
/*  221 */       return null;
/*      */     }
/*      */     
/*  224 */     bxb bxb = c(☃, list, random, i, j, m, eq1, n + 1);
/*  225 */     if (bxb != null) {
/*  226 */       list.add(bxb);
/*  227 */       ☃.d.add(bxb);
/*  228 */       return bxb;
/*      */     } 
/*  230 */     return null;
/*      */   }
/*      */   
/*      */   private static bxb e(k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/*  234 */     if (n > 3 + ☃.a) {
/*  235 */       return null;
/*      */     }
/*  237 */     if (Math.abs(i - (☃.d()).a) > 112 || Math.abs(m - (☃.d()).c) > 112) {
/*  238 */       return null;
/*      */     }
/*      */     
/*  241 */     bwf bwf = l.a(☃, list, random, i, j, m, eq1);
/*  242 */     if (bwf != null && bwf.b > 10) {
/*  243 */       bxb bxb = new l(☃, n, random, bwf, eq1);
/*  244 */       list.add(bxb);
/*  245 */       ☃.e.add(bxb);
/*  246 */       return bxb;
/*      */     } 
/*      */     
/*  249 */     return null;
/*      */   }
/*      */   
/*      */   static abstract class o extends bxb {
/*  253 */     protected int f = -1;
/*      */     
/*      */     private int a;
/*      */     
/*      */     protected bxh.n g;
/*      */     protected boolean h;
/*      */     
/*      */     public o() {}
/*      */     
/*      */     protected o(bxh.k ☃, int i) {
/*  263 */       super(i);
/*  264 */       if (☃ != null) {
/*  265 */         this.g = ☃.g;
/*  266 */         this.h = ☃.h;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  272 */       ☃.b("HPos", this.f);
/*  273 */       ☃.b("VCount", this.a);
/*  274 */       ☃.a("Type", (byte)this.g.a());
/*  275 */       ☃.a("Zombie", this.h);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  280 */       this.f = ☃.h("HPos");
/*  281 */       this.a = ☃.h("VCount");
/*  282 */       this.g = bxh.n.a(☃.f("Type"));
/*  283 */       if (☃.q("Desert")) {
/*  284 */         this.g = bxh.n.b;
/*      */       }
/*  286 */       this.h = ☃.q("Zombie");
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb a(bxh.k ☃, List<bxb> list, Random random, int i, int j) {
/*  291 */       eq eq = f();
/*  292 */       if (eq != null) {
/*  293 */         switch (bxh.null.a[eq.ordinal()])
/*      */         
/*      */         { default:
/*  296 */             return bxh.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*      */           case 2:
/*  298 */             return bxh.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*      */           case 3:
/*  300 */             return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*      */           case 4:
/*  302 */             break; }  return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*      */       } 
/*      */       
/*  305 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected bxb b(bxh.k ☃, List<bxb> list, Random random, int i, int j) {
/*  310 */       eq eq = f();
/*  311 */       if (eq != null) {
/*  312 */         switch (bxh.null.a[eq.ordinal()])
/*      */         
/*      */         { default:
/*  315 */             return bxh.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*      */           case 2:
/*  317 */             return bxh.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*      */           case 3:
/*  319 */             return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*      */           case 4:
/*  321 */             break; }  return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*      */       } 
/*      */       
/*  324 */       return null;
/*      */     }
/*      */     
/*      */     protected int a(axz ☃, bwf bwf1) {
/*  328 */       int i = 0;
/*  329 */       int j = 0;
/*  330 */       el.a a = new el.a();
/*  331 */       for (int k = this.n.c; k <= this.n.f; k++) {
/*  332 */         for (int m = this.n.a; m <= this.n.d; m++) {
/*  333 */           a.c(m, 64, k);
/*  334 */           if (bwf1.b(a)) {
/*  335 */             i += ☃.a(bor.a.e, a).p();
/*  336 */             j++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  341 */       if (j == 0) {
/*  342 */         return -1;
/*      */       }
/*  344 */       return i / j;
/*      */     }
/*      */     
/*      */     protected static boolean a(bwf ☃) {
/*  348 */       return (☃ != null && ☃.b > 10);
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
/*      */     protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m) {
/*  363 */       if (this.a >= m) {
/*      */         return;
/*      */       }
/*      */       
/*  367 */       int i1 = this.a;
/*  368 */       int i2 = a(i + i1, k);
/*  369 */       int i3 = d(j);
/*  370 */       int i4 = b(i + i1, k);
/*      */       
/*  372 */       for (; i1 < m && bwf1.b(new el(i2, i3, i4)); i1++) {
/*  373 */         this.a++;
/*      */         
/*  375 */         if (this.h) {
/*  376 */           anx anx = new anx(☃.f());
/*  377 */           anx.b(i2 + 0.5D, i3, i4 + 0.5D, 0.0F, 0.0F);
/*  378 */           anx.a(☃.h(new el(anx)), (afj)null, (gy)null);
/*  379 */           anx.a(c(i1, 0));
/*  380 */           anx.di();
/*  381 */           ☃.a(anx);
/*      */         } else {
/*  383 */           aob aob = new aob(☃.f());
/*  384 */           aob.b(i2 + 0.5D, i3, i4 + 0.5D, 0.0F, 0.0F);
/*  385 */           aob.d(c(i1, ☃.m().nextInt(6)));
/*  386 */           aob.a(☃.h(new el(aob)), (afj)null, (gy)null, false);
/*  387 */           ☃.a(aob);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/*  397 */       return i;
/*      */     }
/*      */     
/*      */     protected blc a(blc ☃) {
/*  401 */       bcs bcs = ☃.c();
/*  402 */       if (this.g == bxh.n.b) {
/*  403 */         if (bcs.a(wv.n) || bcs == bct.m)
/*  404 */           return bct.at.p(); 
/*  405 */         if (bcs.a(wv.b))
/*  406 */           return bct.av.p(); 
/*  407 */         if (bcs == bct.cj)
/*  408 */           return bct.ek.p().a(bhx.a, ☃.c(bhx.a)); 
/*  409 */         if (bcs == bct.cB)
/*  410 */           return bct.ek.p().a(bhx.a, ☃.c(bhx.a)); 
/*  411 */         if (bcs == bct.F)
/*  412 */           return bct.at.p(); 
/*  413 */         if (bcs == bct.cG) {
/*  414 */           return bct.cI.p();
/*      */         }
/*  416 */       } else if (this.g == bxh.n.d) {
/*  417 */         if (bcs.a(wv.n))
/*  418 */           return bct.K.p().a(bfw.a, ☃.c(bfw.a)); 
/*  419 */         if (bcs.a(wv.b))
/*  420 */           return bct.o.p(); 
/*  421 */         if (bcs == bct.cj)
/*  422 */           return bct.eq.p().a(bhx.a, ☃.c(bhx.a)); 
/*  423 */         if (bcs == bct.cX)
/*  424 */           return bct.cY.p(); 
/*  425 */         if (bcs == bct.cG) {
/*  426 */           return bct.cH.p();
/*      */         }
/*  428 */       } else if (this.g == bxh.n.c) {
/*  429 */         if (bcs.a(wv.n))
/*  430 */           return bct.N.p().a(bfw.a, ☃.c(bfw.a)); 
/*  431 */         if (bcs.a(wv.b))
/*  432 */           return bct.r.p(); 
/*  433 */         if (bcs == bct.cj)
/*  434 */           return bct.gr.p().a(bhx.a, ☃.c(bhx.a)); 
/*  435 */         if (bcs == bct.m)
/*  436 */           return bct.N.p().a(bfw.a, eq.a.b); 
/*  437 */         if (bcs == bct.cX)
/*  438 */           return bct.dc.p(); 
/*  439 */         if (bcs == bct.cG) {
/*  440 */           return bct.cK.p();
/*      */         }
/*      */       } 
/*  443 */       return ☃;
/*      */     }
/*      */     
/*      */     protected bed b() {
/*  447 */       if (this.g == bxh.n.c)
/*  448 */         return (bed)bct.cx; 
/*  449 */       if (this.g == bxh.n.d) {
/*  450 */         return (bed)bct.cu;
/*      */       }
/*  452 */       return (bed)bct.ct;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(axz ☃, bwf bwf1, Random random, int i, int j, int k, eq eq1) {
/*  457 */       if (!this.h) {
/*  458 */         a(☃, bwf1, random, i, j, k, eq.c, b());
/*      */       }
/*      */     }
/*      */     
/*      */     protected void a(axz ☃, eq eq1, int i, int j, int k, bwf bwf1) {
/*  463 */       if (!this.h) {
/*  464 */         a(☃, bct.cg.p().a(biv.a, eq1), i, j, k, bwf1);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(axz ☃, blc blc1, int i, int j, int k, bwf bwf1) {
/*  470 */       blc blc2 = a(blc1);
/*  471 */       super.b(☃, blc2, i, j, k, bwf1);
/*      */     }
/*      */     
/*      */     protected void a(bxh.n ☃) {
/*  475 */       this.g = ☃;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class q
/*      */     extends o
/*      */   {
/*      */     public q() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public q(bxh.k ☃, int i, Random random, int j, int m) {
/*  489 */       super(☃, i);
/*      */       
/*  491 */       a(eq.c.a.a(random));
/*      */       
/*  493 */       if (f().k() == eq.a.c) {
/*  494 */         this.n = new bwf(j, 64, m, j + 6 - 1, 78, m + 6 - 1);
/*      */       } else {
/*  496 */         this.n = new bwf(j, 64, m, j + 6 - 1, 78, m + 6 - 1);
/*      */       } 
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
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  509 */       bxh.b((bxh.k)☃, list, random, this.n.a - 1, this.n.e - 4, this.n.c + 1, eq.e, e());
/*  510 */       bxh.b((bxh.k)☃, list, random, this.n.d + 1, this.n.e - 4, this.n.c + 1, eq.f, e());
/*  511 */       bxh.b((bxh.k)☃, list, random, this.n.a + 1, this.n.e - 4, this.n.c - 1, eq.c, e());
/*  512 */       bxh.b((bxh.k)☃, list, random, this.n.a + 1, this.n.e - 4, this.n.f + 1, eq.d, e());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  517 */       if (this.f < 0) {
/*  518 */         this.f = a(☃, bwf1);
/*  519 */         if (this.f < 0) {
/*  520 */           return true;
/*      */         }
/*  522 */         this.n.a(0, this.f - this.n.e + 3, 0);
/*      */       } 
/*      */       
/*  525 */       blc blc1 = a(bct.m.p());
/*  526 */       blc blc2 = a(bct.cX.p());
/*      */       
/*  528 */       a(☃, bwf1, 1, 0, 1, 4, 12, 4, blc1, bct.A.p(), false);
/*  529 */       a(☃, bct.a.p(), 2, 12, 2, bwf1);
/*  530 */       a(☃, bct.a.p(), 3, 12, 2, bwf1);
/*  531 */       a(☃, bct.a.p(), 2, 12, 3, bwf1);
/*  532 */       a(☃, bct.a.p(), 3, 12, 3, bwf1);
/*      */       
/*  534 */       a(☃, blc2, 1, 13, 1, bwf1);
/*  535 */       a(☃, blc2, 1, 14, 1, bwf1);
/*  536 */       a(☃, blc2, 4, 13, 1, bwf1);
/*  537 */       a(☃, blc2, 4, 14, 1, bwf1);
/*  538 */       a(☃, blc2, 1, 13, 4, bwf1);
/*  539 */       a(☃, blc2, 1, 14, 4, bwf1);
/*  540 */       a(☃, blc2, 4, 13, 4, bwf1);
/*  541 */       a(☃, blc2, 4, 14, 4, bwf1);
/*  542 */       a(☃, bwf1, 1, 15, 1, 4, 15, 4, blc1, blc1, false);
/*      */       
/*  544 */       for (int i = 0; i <= 5; i++) {
/*  545 */         for (int j = 0; j <= 5; j++) {
/*      */           
/*  547 */           if (j == 0 || j == 5 || i == 0 || i == 5) {
/*      */ 
/*      */             
/*  550 */             a(☃, blc1, j, 11, i, bwf1);
/*  551 */             a(☃, j, 12, i, bwf1);
/*      */           } 
/*      */         } 
/*      */       } 
/*  555 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class k
/*      */     extends q
/*      */   {
/*      */     public int a;
/*      */     public bxh.e b;
/*      */     public List<bxh.e> c;
/*  565 */     public List<bxb> d = Lists.newArrayList();
/*  566 */     public List<bxb> e = Lists.newArrayList();
/*      */ 
/*      */ 
/*      */     
/*      */     public k() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public k(int ☃, Random random, int i, int j, List<bxh.e> list, btu btu1) {
/*  575 */       super((k)null, 0, random, i, j);
/*  576 */       this.c = list;
/*  577 */       this.a = btu1.a;
/*  578 */       this.g = btu1.b;
/*      */       
/*  580 */       a(this.g);
/*  581 */       this.h = (random.nextInt(50) == 0);
/*      */     }
/*      */   }
/*      */   
/*      */   public static abstract class p
/*      */     extends o
/*      */   {
/*      */     public p() {}
/*      */     
/*      */     protected p(bxh.k ☃, int i) {
/*  591 */       super(☃, i);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends p
/*      */   {
/*      */     private int a;
/*      */ 
/*      */     
/*      */     public l() {}
/*      */     
/*      */     public l(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/*  605 */       super(☃, i);
/*      */       
/*  607 */       a(eq1);
/*  608 */       this.n = bwf1;
/*  609 */       this.a = Math.max(bwf1.c(), bwf1.e());
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  614 */       super.a(☃);
/*  615 */       ☃.b("Length", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  620 */       super.a(☃, bxm1);
/*  621 */       this.a = ☃.h("Length");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(bxb ☃, List<bxb> list, Random random) {
/*  626 */       boolean bool = false;
/*      */ 
/*      */       
/*  629 */       int i = random.nextInt(5);
/*  630 */       while (i < this.a - 8) {
/*  631 */         bxb bxb1 = a((bxh.k)☃, list, random, 0, i);
/*  632 */         if (bxb1 != null) {
/*  633 */           i += Math.max(bxb1.n.c(), bxb1.n.e());
/*  634 */           bool = true;
/*      */         } 
/*  636 */         i += 2 + random.nextInt(5);
/*      */       } 
/*      */ 
/*      */       
/*  640 */       i = random.nextInt(5);
/*  641 */       while (i < this.a - 8) {
/*  642 */         bxb bxb1 = b((bxh.k)☃, list, random, 0, i);
/*  643 */         if (bxb1 != null) {
/*  644 */           i += Math.max(bxb1.n.c(), bxb1.n.e());
/*  645 */           bool = true;
/*      */         } 
/*  647 */         i += 2 + random.nextInt(5);
/*      */       } 
/*      */       
/*  650 */       eq eq = f();
/*  651 */       if (bool && random.nextInt(3) > 0 && eq != null) {
/*  652 */         switch (bxh.null.a[eq.ordinal()]) {
/*      */           
/*      */           default:
/*  655 */             bxh.b((bxh.k)☃, list, random, this.n.a - 1, this.n.b, this.n.c, eq.e, e());
/*      */             break;
/*      */           case 2:
/*  658 */             bxh.b((bxh.k)☃, list, random, this.n.a - 1, this.n.b, this.n.f - 2, eq.e, e());
/*      */             break;
/*      */           case 4:
/*  661 */             bxh.b((bxh.k)☃, list, random, this.n.d - 2, this.n.b, this.n.c - 1, eq.c, e());
/*      */             break;
/*      */           case 3:
/*  664 */             bxh.b((bxh.k)☃, list, random, this.n.a, this.n.b, this.n.c - 1, eq.c, e());
/*      */             break;
/*      */         } 
/*      */       }
/*  668 */       if (bool && random.nextInt(3) > 0 && eq != null) {
/*  669 */         switch (bxh.null.a[eq.ordinal()]) {
/*      */           
/*      */           default:
/*  672 */             bxh.b((bxh.k)☃, list, random, this.n.d + 1, this.n.b, this.n.c, eq.f, e());
/*      */             return;
/*      */           case 2:
/*  675 */             bxh.b((bxh.k)☃, list, random, this.n.d + 1, this.n.b, this.n.f - 2, eq.f, e());
/*      */             return;
/*      */           case 4:
/*  678 */             bxh.b((bxh.k)☃, list, random, this.n.d - 2, this.n.b, this.n.f + 1, eq.d, e()); return;
/*      */           case 3:
/*      */             break;
/*  681 */         }  bxh.b((bxh.k)☃, list, random, this.n.a, this.n.b, this.n.f + 1, eq.d, e());
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public static bwf a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1) {
/*  688 */       int n = 7 * xq.a(random, 3, 5);
/*      */       
/*  690 */       while (n >= 7) {
/*  691 */         bwf bwf = bwf.a(i, j, m, 0, 0, 0, 3, 3, n, eq1);
/*      */         
/*  693 */         if (bxb.a(list, bwf) == null) {
/*  694 */           return bwf;
/*      */         }
/*  696 */         n -= 7;
/*      */       } 
/*      */       
/*  699 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  704 */       blc blc1 = a(bct.if.p());
/*  705 */       blc blc2 = a(bct.n.p());
/*  706 */       blc blc3 = a(bct.F.p());
/*  707 */       blc blc4 = a(bct.m.p());
/*      */       
/*  709 */       el.a a = new el.a();
/*      */       
/*  711 */       this.n.b = 1000;
/*  712 */       this.n.e = 0;
/*      */       
/*  714 */       for (int i = this.n.a; i <= this.n.d; i++) {
/*  715 */         for (int j = this.n.c; j <= this.n.f; j++) {
/*  716 */           a.c(i, 64, j);
/*  717 */           if (bwf1.b(a)) {
/*  718 */             int k = ☃.a(bor.a.e, a.o(), a.q());
/*  719 */             a.c(a.o(), k, a.q()).c(eq.a);
/*  720 */             if (a.p() < ☃.k()) {
/*  721 */               a.p(☃.k() - 1);
/*      */             }
/*  723 */             while (a.p() >= ☃.k() - 1) {
/*  724 */               blc blc = ☃.a_(a);
/*  725 */               bcs bcs = blc.c();
/*  726 */               if (bcs == bct.i && ☃.c(a.a())) {
/*  727 */                 ☃.a(a, blc1, 2); break;
/*      */               } 
/*  729 */               if (blc.d().a()) {
/*  730 */                 ☃.a(new el(a), blc2, 2); break;
/*      */               } 
/*  732 */               if (bcs == bct.D || bcs == bct.E || bcs == bct.at || bcs == bct.au || bcs == bct.av || bcs == bct.hT || bcs == bct.au || bcs == bct.av) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  741 */                 ☃.a(a, blc3, 2);
/*  742 */                 ☃.a(a.b(), blc4, 2);
/*      */                 break;
/*      */               } 
/*  745 */               a.c(eq.a);
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/*  750 */             this.n.b = Math.min(this.n.b, a.p());
/*  751 */             this.n.e = Math.max(this.n.e, a.p());
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  756 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends o
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public g() {}
/*      */ 
/*      */     
/*      */     public g(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/*  772 */       super(☃, i);
/*      */       
/*  774 */       a(eq1);
/*  775 */       this.n = bwf1;
/*  776 */       this.a = random.nextBoolean();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/*  781 */       super.a(☃);
/*  782 */       ☃.a("Terrace", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/*  787 */       super.a(☃, bxm1);
/*  788 */       this.a = ☃.q("Terrace");
/*      */     }
/*      */     
/*      */     public static g a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/*  792 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 5, 6, 5, eq1);
/*      */       
/*  794 */       if (bxb.a(list, bwf) != null) {
/*  795 */         return null;
/*      */       }
/*      */       
/*  798 */       return new g(☃, n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  803 */       if (this.f < 0) {
/*  804 */         this.f = a(☃, bwf1);
/*  805 */         if (this.f < 0) {
/*  806 */           return true;
/*      */         }
/*  808 */         this.n.a(0, this.f - this.n.e + 6 - 1, 0);
/*      */       } 
/*      */       
/*  811 */       blc blc1 = a(bct.m.p());
/*  812 */       blc blc2 = a(bct.n.p());
/*  813 */       blc blc3 = a(bct.cB.p().a(bhx.a, eq.c));
/*  814 */       blc blc4 = a(bct.J.p());
/*  815 */       blc blc5 = a(bct.cX.p());
/*      */ 
/*      */       
/*  818 */       a(☃, bwf1, 0, 0, 0, 4, 0, 4, blc1, blc1, false);
/*      */       
/*  820 */       a(☃, bwf1, 0, 4, 0, 4, 4, 4, blc4, blc4, false);
/*  821 */       a(☃, bwf1, 1, 4, 1, 3, 4, 3, blc2, blc2, false);
/*      */ 
/*      */       
/*  824 */       a(☃, blc1, 0, 1, 0, bwf1);
/*  825 */       a(☃, blc1, 0, 2, 0, bwf1);
/*  826 */       a(☃, blc1, 0, 3, 0, bwf1);
/*  827 */       a(☃, blc1, 4, 1, 0, bwf1);
/*  828 */       a(☃, blc1, 4, 2, 0, bwf1);
/*  829 */       a(☃, blc1, 4, 3, 0, bwf1);
/*  830 */       a(☃, blc1, 0, 1, 4, bwf1);
/*  831 */       a(☃, blc1, 0, 2, 4, bwf1);
/*  832 */       a(☃, blc1, 0, 3, 4, bwf1);
/*  833 */       a(☃, blc1, 4, 1, 4, bwf1);
/*  834 */       a(☃, blc1, 4, 2, 4, bwf1);
/*  835 */       a(☃, blc1, 4, 3, 4, bwf1);
/*  836 */       a(☃, bwf1, 0, 1, 1, 0, 3, 3, blc2, blc2, false);
/*  837 */       a(☃, bwf1, 4, 1, 1, 4, 3, 3, blc2, blc2, false);
/*  838 */       a(☃, bwf1, 1, 1, 4, 3, 3, 4, blc2, blc2, false);
/*  839 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/*  840 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 2, 4, bwf1);
/*  841 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 4, 2, 2, bwf1);
/*      */ 
/*      */       
/*  844 */       a(☃, blc2, 1, 1, 0, bwf1);
/*  845 */       a(☃, blc2, 1, 2, 0, bwf1);
/*  846 */       a(☃, blc2, 1, 3, 0, bwf1);
/*  847 */       a(☃, blc2, 2, 3, 0, bwf1);
/*  848 */       a(☃, blc2, 3, 3, 0, bwf1);
/*  849 */       a(☃, blc2, 3, 2, 0, bwf1);
/*  850 */       a(☃, blc2, 3, 1, 0, bwf1);
/*  851 */       if (a(☃, 2, 0, -1, bwf1).f() && !a(☃, 2, -1, -1, bwf1).f()) {
/*  852 */         a(☃, blc3, 2, 0, -1, bwf1);
/*  853 */         if (a(☃, 2, -1, -1, bwf1).c() == bct.if) {
/*  854 */           a(☃, bct.i.p(), 2, -1, -1, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  859 */       a(☃, bwf1, 1, 1, 1, 3, 3, 3, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  862 */       if (this.a) {
/*  863 */         int j = 0;
/*  864 */         int k = 4;
/*      */         
/*  866 */         for (int m = 0; m <= 4; m++) {
/*  867 */           for (int n = 0; n <= 4; n++) {
/*  868 */             boolean bool1 = (m == 0 || m == 4);
/*  869 */             boolean bool2 = (n == 0 || n == 4);
/*      */             
/*  871 */             if (bool1 || bool2) {
/*  872 */               boolean bool3 = (m == 0 || m == 4);
/*  873 */               boolean bool4 = (n == 0 || n == 4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  879 */               blc blc = blc5.a(ber.c, Boolean.valueOf((bool3 && n != 0))).a(ber.a, Boolean.valueOf((bool3 && n != 4))).a(ber.o, Boolean.valueOf((bool4 && m != 0))).a(ber.b, Boolean.valueOf((bool4 && m != 4)));
/*      */               
/*  881 */               a(☃, blc, m, 5, n, bwf1);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  888 */       if (this.a) {
/*  889 */         blc blc = bct.cz.p().a(bfq.a, eq.d);
/*  890 */         a(☃, blc, 3, 1, 3, bwf1);
/*  891 */         a(☃, blc, 3, 2, 3, bwf1);
/*  892 */         a(☃, blc, 3, 3, 3, bwf1);
/*  893 */         a(☃, blc, 3, 4, 3, bwf1);
/*      */       } 
/*      */ 
/*      */       
/*  897 */       a(☃, eq.c, 2, 3, 1, bwf1);
/*      */       
/*  899 */       for (int i = 0; i < 5; i++) {
/*  900 */         for (int j = 0; j < 5; j++) {
/*  901 */           a(☃, j, 6, i, bwf1);
/*  902 */           b(☃, blc1, j, -1, i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/*  906 */       a(☃, bwf1, 1, 1, 2, 1);
/*      */       
/*  908 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class i
/*      */     extends o
/*      */   {
/*      */     public i() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public i(bxh.k ☃, int j, Random random, bwf bwf1, eq eq1) {
/*  922 */       super(☃, j);
/*      */       
/*  924 */       a(eq1);
/*  925 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     public static i a(bxh.k ☃, List<bxb> list, Random random, int j, int m, int n, eq eq1, int i1) {
/*  929 */       bwf bwf = bwf.a(j, m, n, 0, 0, 0, 5, 12, 9, eq1);
/*      */       
/*  931 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/*  932 */         return null;
/*      */       }
/*      */       
/*  935 */       return new i(☃, i1, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  940 */       if (this.f < 0) {
/*  941 */         this.f = a(☃, bwf1);
/*  942 */         if (this.f < 0) {
/*  943 */           return true;
/*      */         }
/*  945 */         this.n.a(0, this.f - this.n.e + 12 - 1, 0);
/*      */       } 
/*      */       
/*  948 */       blc blc1 = bct.m.p();
/*  949 */       blc blc2 = a(bct.cB.p().a(bhx.a, eq.c));
/*  950 */       blc blc3 = a(bct.cB.p().a(bhx.a, eq.e));
/*  951 */       blc blc4 = a(bct.cB.p().a(bhx.a, eq.f));
/*      */ 
/*      */       
/*  954 */       a(☃, bwf1, 1, 1, 1, 3, 3, 7, bct.a.p(), bct.a.p(), false);
/*  955 */       a(☃, bwf1, 1, 5, 1, 3, 9, 3, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/*  958 */       a(☃, bwf1, 1, 0, 0, 3, 0, 8, blc1, blc1, false);
/*      */ 
/*      */       
/*  961 */       a(☃, bwf1, 1, 1, 0, 3, 10, 0, blc1, blc1, false);
/*      */       
/*  963 */       a(☃, bwf1, 0, 1, 1, 0, 10, 3, blc1, blc1, false);
/*      */       
/*  965 */       a(☃, bwf1, 4, 1, 1, 4, 10, 3, blc1, blc1, false);
/*      */       
/*  967 */       a(☃, bwf1, 0, 0, 4, 0, 4, 7, blc1, blc1, false);
/*      */       
/*  969 */       a(☃, bwf1, 4, 0, 4, 4, 4, 7, blc1, blc1, false);
/*      */       
/*  971 */       a(☃, bwf1, 1, 1, 8, 3, 4, 8, blc1, blc1, false);
/*      */       
/*  973 */       a(☃, bwf1, 1, 5, 4, 3, 10, 4, blc1, blc1, false);
/*      */ 
/*      */       
/*  976 */       a(☃, bwf1, 1, 5, 5, 3, 5, 7, blc1, blc1, false);
/*      */       
/*  978 */       a(☃, bwf1, 0, 9, 0, 4, 9, 4, blc1, blc1, false);
/*      */       
/*  980 */       a(☃, bwf1, 0, 4, 0, 4, 4, 4, blc1, blc1, false);
/*  981 */       a(☃, blc1, 0, 11, 2, bwf1);
/*  982 */       a(☃, blc1, 4, 11, 2, bwf1);
/*  983 */       a(☃, blc1, 2, 11, 0, bwf1);
/*  984 */       a(☃, blc1, 2, 11, 4, bwf1);
/*      */ 
/*      */       
/*  987 */       a(☃, blc1, 1, 1, 6, bwf1);
/*  988 */       a(☃, blc1, 1, 1, 7, bwf1);
/*  989 */       a(☃, blc1, 2, 1, 7, bwf1);
/*  990 */       a(☃, blc1, 3, 1, 6, bwf1);
/*  991 */       a(☃, blc1, 3, 1, 7, bwf1);
/*      */       
/*  993 */       a(☃, blc2, 1, 1, 5, bwf1);
/*  994 */       a(☃, blc2, 2, 1, 6, bwf1);
/*  995 */       a(☃, blc2, 3, 1, 5, bwf1);
/*  996 */       a(☃, blc3, 1, 2, 7, bwf1);
/*  997 */       a(☃, blc4, 3, 2, 7, bwf1);
/*      */ 
/*      */       
/* 1000 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/* 1001 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 3, 2, bwf1);
/* 1002 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 4, 2, 2, bwf1);
/* 1003 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 4, 3, 2, bwf1);
/* 1004 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 6, 2, bwf1);
/* 1005 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 7, 2, bwf1);
/* 1006 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 4, 6, 2, bwf1);
/* 1007 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 4, 7, 2, bwf1);
/* 1008 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 6, 0, bwf1);
/* 1009 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 7, 0, bwf1);
/* 1010 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 6, 4, bwf1);
/* 1011 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 7, 4, bwf1);
/* 1012 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 3, 6, bwf1);
/* 1013 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 4, 3, 6, bwf1);
/* 1014 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 3, 8, bwf1);
/*      */ 
/*      */       
/* 1017 */       a(☃, eq.d, 2, 4, 7, bwf1);
/* 1018 */       a(☃, eq.f, 1, 4, 6, bwf1);
/* 1019 */       a(☃, eq.e, 3, 4, 6, bwf1);
/* 1020 */       a(☃, eq.c, 2, 4, 5, bwf1);
/*      */ 
/*      */       
/* 1023 */       blc blc5 = bct.cz.p().a(bfq.a, eq.e); int j;
/* 1024 */       for (j = 1; j <= 9; j++) {
/* 1025 */         a(☃, blc5, 3, j, 3, bwf1);
/*      */       }
/*      */ 
/*      */       
/* 1029 */       a(☃, bct.a.p(), 2, 1, 0, bwf1);
/* 1030 */       a(☃, bct.a.p(), 2, 2, 0, bwf1);
/* 1031 */       a(☃, bwf1, random, 2, 1, 0, eq.c);
/* 1032 */       if (a(☃, 2, 0, -1, bwf1).f() && !a(☃, 2, -1, -1, bwf1).f()) {
/* 1033 */         a(☃, blc2, 2, 0, -1, bwf1);
/* 1034 */         if (a(☃, 2, -1, -1, bwf1).c() == bct.if) {
/* 1035 */           a(☃, bct.i.p(), 2, -1, -1, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1039 */       for (j = 0; j < 9; j++) {
/* 1040 */         for (int k = 0; k < 5; k++) {
/* 1041 */           a(☃, k, 12, j, bwf1);
/* 1042 */           b(☃, blc1, k, -1, j, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1046 */       a(☃, bwf1, 2, 1, 2, 1);
/*      */       
/* 1048 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int j) {
/* 1053 */       return 2;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends o
/*      */   {
/*      */     public a() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public a(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1067 */       super(☃, i);
/*      */       
/* 1069 */       a(eq1);
/* 1070 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     public static a a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/* 1074 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 9, 9, 6, eq1);
/*      */       
/* 1076 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1077 */         return null;
/*      */       }
/*      */       
/* 1080 */       return new a(☃, n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1085 */       if (this.f < 0) {
/* 1086 */         this.f = a(☃, bwf1);
/* 1087 */         if (this.f < 0) {
/* 1088 */           return true;
/*      */         }
/* 1090 */         this.n.a(0, this.f - this.n.e + 9 - 1, 0);
/*      */       } 
/*      */       
/* 1093 */       blc blc1 = a(bct.m.p());
/* 1094 */       blc blc2 = a(bct.cj.p().a(bhx.a, eq.c));
/* 1095 */       blc blc3 = a(bct.cj.p().a(bhx.a, eq.d));
/* 1096 */       blc blc4 = a(bct.cj.p().a(bhx.a, eq.f));
/* 1097 */       blc blc5 = a(bct.n.p());
/* 1098 */       blc blc6 = a(bct.cB.p().a(bhx.a, eq.c));
/* 1099 */       blc blc7 = a(bct.cX.p());
/*      */ 
/*      */       
/* 1102 */       a(☃, bwf1, 1, 1, 1, 7, 5, 4, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1105 */       a(☃, bwf1, 0, 0, 0, 8, 0, 5, blc1, blc1, false);
/*      */       
/* 1107 */       a(☃, bwf1, 0, 5, 0, 8, 5, 5, blc1, blc1, false);
/* 1108 */       a(☃, bwf1, 0, 6, 1, 8, 6, 4, blc1, blc1, false);
/* 1109 */       a(☃, bwf1, 0, 7, 2, 8, 7, 3, blc1, blc1, false);
/* 1110 */       for (int i = -1; i <= 2; i++) {
/* 1111 */         for (int k = 0; k <= 8; k++) {
/* 1112 */           a(☃, blc2, k, 6 + i, i, bwf1);
/* 1113 */           a(☃, blc3, k, 6 + i, 5 - i, bwf1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1118 */       a(☃, bwf1, 0, 1, 0, 0, 1, 5, blc1, blc1, false);
/* 1119 */       a(☃, bwf1, 1, 1, 5, 8, 1, 5, blc1, blc1, false);
/* 1120 */       a(☃, bwf1, 8, 1, 0, 8, 1, 4, blc1, blc1, false);
/* 1121 */       a(☃, bwf1, 2, 1, 0, 7, 1, 0, blc1, blc1, false);
/* 1122 */       a(☃, bwf1, 0, 2, 0, 0, 4, 0, blc1, blc1, false);
/* 1123 */       a(☃, bwf1, 0, 2, 5, 0, 4, 5, blc1, blc1, false);
/* 1124 */       a(☃, bwf1, 8, 2, 5, 8, 4, 5, blc1, blc1, false);
/* 1125 */       a(☃, bwf1, 8, 2, 0, 8, 4, 0, blc1, blc1, false);
/*      */ 
/*      */       
/* 1128 */       a(☃, bwf1, 0, 2, 1, 0, 4, 4, blc5, blc5, false);
/* 1129 */       a(☃, bwf1, 1, 2, 5, 7, 4, 5, blc5, blc5, false);
/* 1130 */       a(☃, bwf1, 8, 2, 1, 8, 4, 4, blc5, blc5, false);
/* 1131 */       a(☃, bwf1, 1, 2, 0, 7, 4, 0, blc5, blc5, false);
/*      */ 
/*      */       
/* 1134 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 4, 2, 0, bwf1);
/* 1135 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 5, 2, 0, bwf1);
/* 1136 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 6, 2, 0, bwf1);
/* 1137 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 4, 3, 0, bwf1);
/* 1138 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 5, 3, 0, bwf1);
/* 1139 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 6, 3, 0, bwf1);
/* 1140 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/* 1141 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 3, bwf1);
/* 1142 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 3, 2, bwf1);
/* 1143 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 3, 3, bwf1);
/* 1144 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 2, bwf1);
/* 1145 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 3, bwf1);
/* 1146 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 3, 2, bwf1);
/* 1147 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 3, 3, bwf1);
/* 1148 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 2, 5, bwf1);
/* 1149 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 3, 2, 5, bwf1);
/* 1150 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 5, 2, 5, bwf1);
/* 1151 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 6, 2, 5, bwf1);
/*      */ 
/*      */       
/* 1154 */       a(☃, bwf1, 1, 4, 1, 7, 4, 1, blc5, blc5, false);
/* 1155 */       a(☃, bwf1, 1, 4, 4, 7, 4, 4, blc5, blc5, false);
/* 1156 */       a(☃, bwf1, 1, 3, 4, 7, 3, 4, bct.cc.p(), bct.cc.p(), false);
/*      */ 
/*      */       
/* 1159 */       a(☃, blc5, 7, 1, 4, bwf1);
/* 1160 */       a(☃, blc4, 7, 1, 3, bwf1);
/* 1161 */       blc blc8 = blc2;
/* 1162 */       a(☃, blc8, 6, 1, 4, bwf1);
/* 1163 */       a(☃, blc8, 5, 1, 4, bwf1);
/* 1164 */       a(☃, blc8, 4, 1, 4, bwf1);
/* 1165 */       a(☃, blc8, 3, 1, 4, bwf1);
/*      */ 
/*      */       
/* 1168 */       a(☃, blc7, 6, 1, 3, bwf1);
/* 1169 */       a(☃, bct.cG.p(), 6, 2, 3, bwf1);
/* 1170 */       a(☃, blc7, 4, 1, 3, bwf1);
/* 1171 */       a(☃, bct.cG.p(), 4, 2, 3, bwf1);
/* 1172 */       a(☃, bct.co.p(), 7, 1, 1, bwf1);
/*      */ 
/*      */       
/* 1175 */       a(☃, bct.a.p(), 1, 1, 0, bwf1);
/* 1176 */       a(☃, bct.a.p(), 1, 2, 0, bwf1);
/* 1177 */       a(☃, bwf1, random, 1, 1, 0, eq.c);
/* 1178 */       if (a(☃, 1, 0, -1, bwf1).f() && !a(☃, 1, -1, -1, bwf1).f()) {
/* 1179 */         a(☃, blc6, 1, 0, -1, bwf1);
/* 1180 */         if (a(☃, 1, -1, -1, bwf1).c() == bct.if) {
/* 1181 */           a(☃, bct.i.p(), 1, -1, -1, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1185 */       for (int j = 0; j < 6; j++) {
/* 1186 */         for (int k = 0; k < 9; k++) {
/* 1187 */           a(☃, k, 9, j, bwf1);
/* 1188 */           b(☃, blc1, k, -1, j, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1192 */       a(☃, bwf1, 2, 1, 2, 1);
/*      */       
/* 1194 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/* 1199 */       return 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends o
/*      */   {
/*      */     private boolean a;
/*      */     
/*      */     private int b;
/*      */ 
/*      */     
/*      */     public h() {}
/*      */ 
/*      */     
/*      */     public h(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1216 */       super(☃, i);
/*      */       
/* 1218 */       a(eq1);
/* 1219 */       this.n = bwf1;
/* 1220 */       this.a = random.nextBoolean();
/* 1221 */       this.b = random.nextInt(3);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1226 */       super.a(☃);
/* 1227 */       ☃.b("T", this.b);
/* 1228 */       ☃.a("C", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1233 */       super.a(☃, bxm1);
/* 1234 */       this.b = ☃.h("T");
/* 1235 */       this.a = ☃.q("C");
/*      */     }
/*      */     
/*      */     public static h a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/* 1239 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 4, 6, 5, eq1);
/*      */       
/* 1241 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1242 */         return null;
/*      */       }
/*      */       
/* 1245 */       return new h(☃, n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1250 */       if (this.f < 0) {
/* 1251 */         this.f = a(☃, bwf1);
/* 1252 */         if (this.f < 0) {
/* 1253 */           return true;
/*      */         }
/* 1255 */         this.n.a(0, this.f - this.n.e + 6 - 1, 0);
/*      */       } 
/*      */       
/* 1258 */       blc blc1 = a(bct.m.p());
/* 1259 */       blc blc2 = a(bct.n.p());
/* 1260 */       blc blc3 = a(bct.cB.p().a(bhx.a, eq.c));
/* 1261 */       blc blc4 = a(bct.J.p());
/* 1262 */       blc blc5 = a(bct.cX.p());
/*      */ 
/*      */       
/* 1265 */       a(☃, bwf1, 1, 1, 1, 3, 5, 4, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1268 */       a(☃, bwf1, 0, 0, 0, 3, 0, 4, blc1, blc1, false);
/* 1269 */       a(☃, bwf1, 1, 0, 1, 2, 0, 3, bct.j.p(), bct.j.p(), false);
/*      */       
/* 1271 */       if (this.a) {
/* 1272 */         a(☃, bwf1, 1, 4, 1, 2, 4, 3, blc4, blc4, false);
/*      */       } else {
/* 1274 */         a(☃, bwf1, 1, 5, 1, 2, 5, 3, blc4, blc4, false);
/*      */       } 
/* 1276 */       a(☃, blc4, 1, 4, 0, bwf1);
/* 1277 */       a(☃, blc4, 2, 4, 0, bwf1);
/* 1278 */       a(☃, blc4, 1, 4, 4, bwf1);
/* 1279 */       a(☃, blc4, 2, 4, 4, bwf1);
/* 1280 */       a(☃, blc4, 0, 4, 1, bwf1);
/* 1281 */       a(☃, blc4, 0, 4, 2, bwf1);
/* 1282 */       a(☃, blc4, 0, 4, 3, bwf1);
/* 1283 */       a(☃, blc4, 3, 4, 1, bwf1);
/* 1284 */       a(☃, blc4, 3, 4, 2, bwf1);
/* 1285 */       a(☃, blc4, 3, 4, 3, bwf1);
/*      */ 
/*      */       
/* 1288 */       a(☃, bwf1, 0, 1, 0, 0, 3, 0, blc4, blc4, false);
/* 1289 */       a(☃, bwf1, 3, 1, 0, 3, 3, 0, blc4, blc4, false);
/* 1290 */       a(☃, bwf1, 0, 1, 4, 0, 3, 4, blc4, blc4, false);
/* 1291 */       a(☃, bwf1, 3, 1, 4, 3, 3, 4, blc4, blc4, false);
/*      */ 
/*      */       
/* 1294 */       a(☃, bwf1, 0, 1, 1, 0, 3, 3, blc2, blc2, false);
/* 1295 */       a(☃, bwf1, 3, 1, 1, 3, 3, 3, blc2, blc2, false);
/* 1296 */       a(☃, bwf1, 1, 1, 0, 2, 3, 0, blc2, blc2, false);
/* 1297 */       a(☃, bwf1, 1, 1, 4, 2, 3, 4, blc2, blc2, false);
/*      */ 
/*      */       
/* 1300 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/* 1301 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 3, 2, 2, bwf1);
/*      */ 
/*      */       
/* 1304 */       if (this.b > 0) {
/* 1305 */         a(☃, blc5.a(ber.a, Boolean.valueOf(true)).a((this.b == 1) ? ber.o : ber.b, Boolean.valueOf(true)), this.b, 1, 3, bwf1);
/* 1306 */         a(☃, bct.cG.p(), this.b, 2, 3, bwf1);
/*      */       } 
/*      */ 
/*      */       
/* 1310 */       a(☃, bct.a.p(), 1, 1, 0, bwf1);
/* 1311 */       a(☃, bct.a.p(), 1, 2, 0, bwf1);
/* 1312 */       a(☃, bwf1, random, 1, 1, 0, eq.c);
/* 1313 */       if (a(☃, 1, 0, -1, bwf1).f() && !a(☃, 1, -1, -1, bwf1).f()) {
/* 1314 */         a(☃, blc3, 1, 0, -1, bwf1);
/* 1315 */         if (a(☃, 1, -1, -1, bwf1).c() == bct.if) {
/* 1316 */           a(☃, bct.i.p(), 1, -1, -1, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1320 */       for (int i = 0; i < 5; i++) {
/* 1321 */         for (int j = 0; j < 4; j++) {
/* 1322 */           a(☃, j, 6, i, bwf1);
/* 1323 */           b(☃, blc1, j, -1, i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1327 */       a(☃, bwf1, 1, 1, 2, 1);
/*      */       
/* 1329 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class f
/*      */     extends o
/*      */   {
/*      */     public f() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public f(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1343 */       super(☃, i);
/*      */       
/* 1345 */       a(eq1);
/* 1346 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     public static f a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/* 1350 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 9, 7, 11, eq1);
/*      */       
/* 1352 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1353 */         return null;
/*      */       }
/*      */       
/* 1356 */       return new f(☃, n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1361 */       if (this.f < 0) {
/* 1362 */         this.f = a(☃, bwf1);
/* 1363 */         if (this.f < 0) {
/* 1364 */           return true;
/*      */         }
/* 1366 */         this.n.a(0, this.f - this.n.e + 7 - 1, 0);
/*      */       } 
/*      */       
/* 1369 */       blc blc1 = a(bct.m.p());
/* 1370 */       blc blc2 = a(bct.cj.p().a(bhx.a, eq.c));
/* 1371 */       blc blc3 = a(bct.cj.p().a(bhx.a, eq.d));
/* 1372 */       blc blc4 = a(bct.cj.p().a(bhx.a, eq.e));
/* 1373 */       blc blc5 = a(bct.n.p());
/* 1374 */       blc blc6 = a(bct.J.p());
/* 1375 */       blc blc7 = a(bct.cX.p());
/*      */ 
/*      */       
/* 1378 */       a(☃, bwf1, 1, 1, 1, 7, 4, 4, bct.a.p(), bct.a.p(), false);
/* 1379 */       a(☃, bwf1, 2, 1, 6, 8, 4, 10, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1382 */       a(☃, bwf1, 2, 0, 6, 8, 0, 10, bct.j.p(), bct.j.p(), false);
/* 1383 */       a(☃, blc1, 6, 0, 6, bwf1);
/*      */       
/* 1385 */       blc blc8 = blc7.a(ber.a, Boolean.valueOf(true)).a(ber.c, Boolean.valueOf(true));
/* 1386 */       blc blc9 = blc7.a(ber.o, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true));
/*      */       
/* 1388 */       a(☃, bwf1, 2, 1, 6, 2, 1, 9, blc8, blc8, false);
/* 1389 */       a(☃, blc7.a(ber.c, Boolean.valueOf(true)).a(ber.b, Boolean.valueOf(true)), 2, 1, 10, bwf1);
/* 1390 */       a(☃, bwf1, 8, 1, 6, 8, 1, 9, blc8, blc8, false);
/* 1391 */       a(☃, blc7.a(ber.c, Boolean.valueOf(true)).a(ber.o, Boolean.valueOf(true)), 8, 1, 10, bwf1);
/* 1392 */       a(☃, bwf1, 3, 1, 10, 7, 1, 10, blc9, blc9, false);
/*      */ 
/*      */       
/* 1395 */       a(☃, bwf1, 1, 0, 1, 7, 0, 4, blc5, blc5, false);
/* 1396 */       a(☃, bwf1, 0, 0, 0, 0, 3, 5, blc1, blc1, false);
/* 1397 */       a(☃, bwf1, 8, 0, 0, 8, 3, 5, blc1, blc1, false);
/* 1398 */       a(☃, bwf1, 1, 0, 0, 7, 1, 0, blc1, blc1, false);
/* 1399 */       a(☃, bwf1, 1, 0, 5, 7, 1, 5, blc1, blc1, false);
/*      */ 
/*      */       
/* 1402 */       a(☃, bwf1, 1, 2, 0, 7, 3, 0, blc5, blc5, false);
/* 1403 */       a(☃, bwf1, 1, 2, 5, 7, 3, 5, blc5, blc5, false);
/* 1404 */       a(☃, bwf1, 0, 4, 1, 8, 4, 1, blc5, blc5, false);
/* 1405 */       a(☃, bwf1, 0, 4, 4, 8, 4, 4, blc5, blc5, false);
/* 1406 */       a(☃, bwf1, 0, 5, 2, 8, 5, 3, blc5, blc5, false);
/* 1407 */       a(☃, blc5, 0, 4, 2, bwf1);
/* 1408 */       a(☃, blc5, 0, 4, 3, bwf1);
/* 1409 */       a(☃, blc5, 8, 4, 2, bwf1);
/* 1410 */       a(☃, blc5, 8, 4, 3, bwf1);
/*      */       
/* 1412 */       blc blc10 = blc2;
/* 1413 */       blc blc11 = blc3;
/* 1414 */       blc blc12 = blc4;
/* 1415 */       for (int i = -1; i <= 2; i++) {
/* 1416 */         for (int k = 0; k <= 8; k++) {
/* 1417 */           a(☃, blc10, k, 4 + i, i, bwf1);
/* 1418 */           a(☃, blc11, k, 4 + i, 5 - i, bwf1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1423 */       a(☃, blc6, 0, 2, 1, bwf1);
/* 1424 */       a(☃, blc6, 0, 2, 4, bwf1);
/* 1425 */       a(☃, blc6, 8, 2, 1, bwf1);
/* 1426 */       a(☃, blc6, 8, 2, 4, bwf1);
/* 1427 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/* 1428 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 3, bwf1);
/* 1429 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 2, bwf1);
/* 1430 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 3, bwf1);
/* 1431 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 2, 5, bwf1);
/* 1432 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 3, 2, 5, bwf1);
/* 1433 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 5, 2, 0, bwf1);
/*      */ 
/*      */       
/* 1436 */       a(☃, blc7, 2, 1, 3, bwf1);
/* 1437 */       a(☃, bct.cG.p(), 2, 2, 3, bwf1);
/* 1438 */       a(☃, blc5, 1, 1, 4, bwf1);
/* 1439 */       a(☃, blc10, 2, 1, 4, bwf1);
/* 1440 */       a(☃, blc12, 1, 1, 3, bwf1);
/*      */ 
/*      */       
/* 1443 */       blc blc13 = bct.bJ.p().a(bhl.a, bmp.c);
/* 1444 */       a(☃, bwf1, 5, 0, 1, 7, 0, 3, blc13, blc13, false);
/* 1445 */       a(☃, blc13, 6, 1, 1, bwf1);
/* 1446 */       a(☃, blc13, 6, 1, 2, bwf1);
/*      */ 
/*      */       
/* 1449 */       a(☃, bct.a.p(), 2, 1, 0, bwf1);
/* 1450 */       a(☃, bct.a.p(), 2, 2, 0, bwf1);
/* 1451 */       a(☃, eq.c, 2, 3, 1, bwf1);
/* 1452 */       a(☃, bwf1, random, 2, 1, 0, eq.c);
/* 1453 */       if (a(☃, 2, 0, -1, bwf1).f() && !a(☃, 2, -1, -1, bwf1).f()) {
/* 1454 */         a(☃, blc10, 2, 0, -1, bwf1);
/* 1455 */         if (a(☃, 2, -1, -1, bwf1).c() == bct.if) {
/* 1456 */           a(☃, bct.i.p(), 2, -1, -1, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1461 */       a(☃, bct.a.p(), 6, 1, 5, bwf1);
/* 1462 */       a(☃, bct.a.p(), 6, 2, 5, bwf1);
/* 1463 */       a(☃, eq.d, 6, 3, 4, bwf1);
/* 1464 */       a(☃, bwf1, random, 6, 1, 5, eq.d);
/*      */       
/* 1466 */       for (int j = 0; j < 5; j++) {
/* 1467 */         for (int k = 0; k < 9; k++) {
/* 1468 */           a(☃, k, 7, j, bwf1);
/* 1469 */           b(☃, blc1, k, -1, j, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1473 */       a(☃, bwf1, 4, 1, 2, 2);
/*      */       
/* 1475 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/* 1480 */       if (☃ == 0) {
/* 1481 */         return 4;
/*      */       }
/* 1483 */       return super.c(☃, i);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class m
/*      */     extends o
/*      */   {
/*      */     public m() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public m(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1497 */       super(☃, i);
/*      */       
/* 1499 */       a(eq1);
/* 1500 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     public static m a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int n, eq eq1, int i1) {
/* 1504 */       bwf bwf = bwf.a(i, j, n, 0, 0, 0, 9, 7, 12, eq1);
/*      */       
/* 1506 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1507 */         return null;
/*      */       }
/*      */       
/* 1510 */       return new m(☃, i1, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1515 */       if (this.f < 0) {
/* 1516 */         this.f = a(☃, bwf1);
/* 1517 */         if (this.f < 0) {
/* 1518 */           return true;
/*      */         }
/* 1520 */         this.n.a(0, this.f - this.n.e + 7 - 1, 0);
/*      */       } 
/*      */       
/* 1523 */       blc blc1 = a(bct.m.p());
/* 1524 */       blc blc2 = a(bct.cj.p().a(bhx.a, eq.c));
/* 1525 */       blc blc3 = a(bct.cj.p().a(bhx.a, eq.d));
/* 1526 */       blc blc4 = a(bct.cj.p().a(bhx.a, eq.f));
/* 1527 */       blc blc5 = a(bct.cj.p().a(bhx.a, eq.e));
/* 1528 */       blc blc6 = a(bct.n.p());
/* 1529 */       blc blc7 = a(bct.J.p());
/*      */ 
/*      */       
/* 1532 */       a(☃, bwf1, 1, 1, 1, 7, 4, 4, bct.a.p(), bct.a.p(), false);
/* 1533 */       a(☃, bwf1, 2, 1, 6, 8, 4, 10, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1536 */       a(☃, bwf1, 2, 0, 5, 8, 0, 10, blc6, blc6, false);
/* 1537 */       a(☃, bwf1, 1, 0, 1, 7, 0, 4, blc6, blc6, false);
/* 1538 */       a(☃, bwf1, 0, 0, 0, 0, 3, 5, blc1, blc1, false);
/* 1539 */       a(☃, bwf1, 8, 0, 0, 8, 3, 10, blc1, blc1, false);
/* 1540 */       a(☃, bwf1, 1, 0, 0, 7, 2, 0, blc1, blc1, false);
/* 1541 */       a(☃, bwf1, 1, 0, 5, 2, 1, 5, blc1, blc1, false);
/* 1542 */       a(☃, bwf1, 2, 0, 6, 2, 3, 10, blc1, blc1, false);
/* 1543 */       a(☃, bwf1, 3, 0, 10, 7, 3, 10, blc1, blc1, false);
/*      */ 
/*      */       
/* 1546 */       a(☃, bwf1, 1, 2, 0, 7, 3, 0, blc6, blc6, false);
/* 1547 */       a(☃, bwf1, 1, 2, 5, 2, 3, 5, blc6, blc6, false);
/* 1548 */       a(☃, bwf1, 0, 4, 1, 8, 4, 1, blc6, blc6, false);
/* 1549 */       a(☃, bwf1, 0, 4, 4, 3, 4, 4, blc6, blc6, false);
/* 1550 */       a(☃, bwf1, 0, 5, 2, 8, 5, 3, blc6, blc6, false);
/* 1551 */       a(☃, blc6, 0, 4, 2, bwf1);
/* 1552 */       a(☃, blc6, 0, 4, 3, bwf1);
/* 1553 */       a(☃, blc6, 8, 4, 2, bwf1);
/* 1554 */       a(☃, blc6, 8, 4, 3, bwf1);
/* 1555 */       a(☃, blc6, 8, 4, 4, bwf1);
/*      */       
/* 1557 */       blc blc8 = blc2;
/* 1558 */       blc blc9 = blc3;
/* 1559 */       blc blc10 = blc5;
/* 1560 */       blc blc11 = blc4; int i;
/* 1561 */       for (i = -1; i <= 2; i++) {
/* 1562 */         for (int j = 0; j <= 8; j++) {
/* 1563 */           a(☃, blc8, j, 4 + i, i, bwf1);
/* 1564 */           if ((i > -1 || j <= 1) && (i > 0 || j <= 3) && (i > 1 || j <= 4 || j >= 6)) {
/* 1565 */             a(☃, blc9, j, 4 + i, 5 - i, bwf1);
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1571 */       a(☃, bwf1, 3, 4, 5, 3, 4, 10, blc6, blc6, false);
/* 1572 */       a(☃, bwf1, 7, 4, 2, 7, 4, 10, blc6, blc6, false);
/* 1573 */       a(☃, bwf1, 4, 5, 4, 4, 5, 10, blc6, blc6, false);
/* 1574 */       a(☃, bwf1, 6, 5, 4, 6, 5, 10, blc6, blc6, false);
/* 1575 */       a(☃, bwf1, 5, 6, 3, 5, 6, 10, blc6, blc6, false);
/* 1576 */       for (i = 4; i >= 1; i--) {
/* 1577 */         a(☃, blc6, i, 2 + i, 7 - i, bwf1);
/* 1578 */         for (int j = 8 - i; j <= 10; j++) {
/* 1579 */           a(☃, blc11, i, 2 + i, j, bwf1);
/*      */         }
/*      */       } 
/* 1582 */       a(☃, blc6, 6, 6, 3, bwf1);
/* 1583 */       a(☃, blc6, 7, 5, 4, bwf1);
/* 1584 */       a(☃, blc10, 6, 6, 4, bwf1);
/* 1585 */       for (i = 6; i <= 8; i++) {
/* 1586 */         for (int j = 5; j <= 10; j++) {
/* 1587 */           a(☃, blc10, i, 12 - i, j, bwf1);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1592 */       a(☃, blc7, 0, 2, 1, bwf1);
/* 1593 */       a(☃, blc7, 0, 2, 4, bwf1);
/* 1594 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/* 1595 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 3, bwf1);
/*      */       
/* 1597 */       a(☃, blc7, 4, 2, 0, bwf1);
/* 1598 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 5, 2, 0, bwf1);
/* 1599 */       a(☃, blc7, 6, 2, 0, bwf1);
/*      */       
/* 1601 */       a(☃, blc7, 8, 2, 1, bwf1);
/* 1602 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 2, bwf1);
/* 1603 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 3, bwf1);
/* 1604 */       a(☃, blc7, 8, 2, 4, bwf1);
/* 1605 */       a(☃, blc6, 8, 2, 5, bwf1);
/* 1606 */       a(☃, blc7, 8, 2, 6, bwf1);
/* 1607 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 7, bwf1);
/* 1608 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 8, 2, 8, bwf1);
/* 1609 */       a(☃, blc7, 8, 2, 9, bwf1);
/* 1610 */       a(☃, blc7, 2, 2, 6, bwf1);
/* 1611 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 2, 2, 7, bwf1);
/* 1612 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 2, 2, 8, bwf1);
/* 1613 */       a(☃, blc7, 2, 2, 9, bwf1);
/*      */       
/* 1615 */       a(☃, blc7, 4, 4, 10, bwf1);
/* 1616 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 5, 4, 10, bwf1);
/* 1617 */       a(☃, blc7, 6, 4, 10, bwf1);
/* 1618 */       a(☃, blc6, 5, 5, 10, bwf1);
/*      */ 
/*      */       
/* 1621 */       a(☃, bct.a.p(), 2, 1, 0, bwf1);
/* 1622 */       a(☃, bct.a.p(), 2, 2, 0, bwf1);
/* 1623 */       a(☃, eq.c, 2, 3, 1, bwf1);
/* 1624 */       a(☃, bwf1, random, 2, 1, 0, eq.c);
/* 1625 */       a(☃, bwf1, 1, 0, -1, 3, 2, -1, bct.a.p(), bct.a.p(), false);
/* 1626 */       if (a(☃, 2, 0, -1, bwf1).f() && !a(☃, 2, -1, -1, bwf1).f()) {
/* 1627 */         a(☃, blc8, 2, 0, -1, bwf1);
/* 1628 */         if (a(☃, 2, -1, -1, bwf1).c() == bct.if) {
/* 1629 */           a(☃, bct.i.p(), 2, -1, -1, bwf1);
/*      */         }
/*      */       } 
/*      */       
/* 1633 */       for (i = 0; i < 5; i++) {
/* 1634 */         for (int j = 0; j < 9; j++) {
/* 1635 */           a(☃, j, 7, i, bwf1);
/* 1636 */           b(☃, blc1, j, -1, i, bwf1);
/*      */         } 
/*      */       } 
/* 1639 */       for (i = 5; i < 11; i++) {
/* 1640 */         for (int j = 2; j < 9; j++) {
/* 1641 */           a(☃, j, 7, i, bwf1);
/* 1642 */           b(☃, blc1, j, -1, i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1646 */       a(☃, bwf1, 4, 1, 2, 2);
/*      */       
/* 1648 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class j
/*      */     extends o
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public j() {}
/*      */ 
/*      */     
/*      */     public j(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1664 */       super(☃, i);
/*      */       
/* 1666 */       a(eq1);
/* 1667 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     public static j a(bxh.k ☃, List<bxb> list, Random random, int i, int m, int n, eq eq1, int i1) {
/* 1671 */       bwf bwf = bwf.a(i, m, n, 0, 0, 0, 10, 6, 7, eq1);
/*      */       
/* 1673 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1674 */         return null;
/*      */       }
/*      */       
/* 1677 */       return new j(☃, i1, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1682 */       super.a(☃);
/* 1683 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1688 */       super.a(☃, bxm1);
/* 1689 */       this.a = ☃.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1694 */       if (this.f < 0) {
/* 1695 */         this.f = a(☃, bwf1);
/* 1696 */         if (this.f < 0) {
/* 1697 */           return true;
/*      */         }
/* 1699 */         this.n.a(0, this.f - this.n.e + 6 - 1, 0);
/*      */       } 
/*      */       
/* 1702 */       blc blc1 = bct.m.p();
/* 1703 */       blc blc2 = a(bct.cj.p().a(bhx.a, eq.c));
/* 1704 */       blc blc3 = a(bct.cj.p().a(bhx.a, eq.e));
/* 1705 */       blc blc4 = a(bct.n.p());
/* 1706 */       blc blc5 = a(bct.cB.p().a(bhx.a, eq.c));
/* 1707 */       blc blc6 = a(bct.J.p());
/* 1708 */       blc blc7 = a(bct.cX.p());
/*      */ 
/*      */       
/* 1711 */       a(☃, bwf1, 0, 1, 0, 9, 4, 6, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1714 */       a(☃, bwf1, 0, 0, 0, 9, 0, 6, blc1, blc1, false);
/*      */ 
/*      */       
/* 1717 */       a(☃, bwf1, 0, 4, 0, 9, 4, 6, blc1, blc1, false);
/* 1718 */       a(☃, bwf1, 0, 5, 0, 9, 5, 6, bct.bJ.p(), bct.bJ.p(), false);
/* 1719 */       a(☃, bwf1, 1, 5, 1, 8, 5, 5, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1722 */       a(☃, bwf1, 1, 1, 0, 2, 3, 0, blc4, blc4, false);
/* 1723 */       a(☃, bwf1, 0, 1, 0, 0, 4, 0, blc6, blc6, false);
/* 1724 */       a(☃, bwf1, 3, 1, 0, 3, 4, 0, blc6, blc6, false);
/* 1725 */       a(☃, bwf1, 0, 1, 6, 0, 4, 6, blc6, blc6, false);
/* 1726 */       a(☃, blc4, 3, 3, 1, bwf1);
/* 1727 */       a(☃, bwf1, 3, 1, 2, 3, 3, 2, blc4, blc4, false);
/* 1728 */       a(☃, bwf1, 4, 1, 3, 5, 3, 3, blc4, blc4, false);
/* 1729 */       a(☃, bwf1, 0, 1, 1, 0, 3, 5, blc4, blc4, false);
/* 1730 */       a(☃, bwf1, 1, 1, 6, 5, 3, 6, blc4, blc4, false);
/*      */ 
/*      */       
/* 1733 */       a(☃, bwf1, 5, 1, 0, 5, 3, 0, blc7, blc7, false);
/* 1734 */       a(☃, bwf1, 9, 1, 0, 9, 3, 0, blc7, blc7, false);
/*      */ 
/*      */       
/* 1737 */       a(☃, bwf1, 6, 1, 4, 9, 4, 6, blc1, blc1, false);
/* 1738 */       a(☃, bct.C.p(), 7, 1, 5, bwf1);
/* 1739 */       a(☃, bct.C.p(), 8, 1, 5, bwf1);
/* 1740 */       a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)).a(bfm.c, Boolean.valueOf(true)), 9, 2, 5, bwf1);
/* 1741 */       a(☃, bct.dF.p().a(bfm.a, Boolean.valueOf(true)), 9, 2, 4, bwf1);
/* 1742 */       a(☃, bwf1, 7, 2, 4, 8, 2, 5, bct.a.p(), bct.a.p(), false);
/* 1743 */       a(☃, blc1, 6, 1, 3, bwf1);
/* 1744 */       a(☃, bct.cr.p().a(bex.a, eq.d), 6, 2, 3, bwf1);
/* 1745 */       a(☃, bct.cr.p().a(bex.a, eq.d), 6, 3, 3, bwf1);
/* 1746 */       a(☃, bct.bJ.p().a(bhl.a, bmp.c), 8, 1, 1, bwf1);
/*      */ 
/*      */       
/* 1749 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 2, bwf1);
/* 1750 */       a(☃, bct.dG.p().a(bez.c, Boolean.valueOf(true)).a(bez.a, Boolean.valueOf(true)), 0, 2, 4, bwf1);
/* 1751 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 2, 2, 6, bwf1);
/* 1752 */       a(☃, bct.dG.p().a(bez.b, Boolean.valueOf(true)).a(bez.o, Boolean.valueOf(true)), 4, 2, 6, bwf1);
/*      */ 
/*      */       
/* 1755 */       a(☃, blc7, 2, 1, 4, bwf1);
/* 1756 */       a(☃, bct.cG.p(), 2, 2, 4, bwf1);
/* 1757 */       a(☃, blc4, 1, 1, 5, bwf1);
/* 1758 */       a(☃, blc2, 2, 1, 5, bwf1);
/* 1759 */       a(☃, blc3, 1, 1, 4, bwf1);
/*      */       
/* 1761 */       if (!this.a && 
/* 1762 */         bwf1.b(new el(a(5, 5), d(1), b(5, 5)))) {
/* 1763 */         this.a = true;
/* 1764 */         a(☃, bwf1, random, 5, 1, 5, ccl.e);
/*      */       } 
/*      */       
/*      */       int i;
/*      */       
/* 1769 */       for (i = 6; i <= 8; i++) {
/* 1770 */         if (a(☃, i, 0, -1, bwf1).f() && !a(☃, i, -1, -1, bwf1).f()) {
/* 1771 */           a(☃, blc5, i, 0, -1, bwf1);
/* 1772 */           if (a(☃, i, -1, -1, bwf1).c() == bct.if) {
/* 1773 */             a(☃, bct.i.p(), i, -1, -1, bwf1);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1778 */       for (i = 0; i < 7; i++) {
/* 1779 */         for (int k = 0; k < 10; k++) {
/* 1780 */           a(☃, k, 6, i, bwf1);
/* 1781 */           b(☃, blc1, k, -1, i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1785 */       a(☃, bwf1, 7, 1, 1, 1);
/*      */       
/* 1787 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/* 1792 */       return 3;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends o
/*      */   {
/*      */     private blc a;
/*      */     
/*      */     private blc b;
/*      */ 
/*      */     
/*      */     public c() {}
/*      */ 
/*      */     
/*      */     public c(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1809 */       super(☃, i);
/*      */       
/* 1811 */       a(eq1);
/* 1812 */       this.n = bwf1;
/*      */       
/* 1814 */       this.a = b(random);
/* 1815 */       this.b = b(random);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1820 */       super.a(☃);
/* 1821 */       ☃.a("CA", hk.a(this.a));
/* 1822 */       ☃.a("CB", hk.a(this.b));
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1827 */       super.a(☃, bxm1);
/* 1828 */       this.a = hk.d(☃.p("CA"));
/* 1829 */       this.b = hk.d(☃.p("CB"));
/*      */     }
/*      */     
/*      */     private static blc b(Random ☃) {
/* 1833 */       switch (☃.nextInt(10))
/*      */       { default:
/* 1835 */           return bct.cp.p();
/*      */         case 0:
/*      */         case 1:
/* 1838 */           return bct.eT.p();
/*      */         case 2:
/*      */         case 3:
/* 1841 */           return bct.eU.p();
/*      */         case 4:
/* 1843 */           break; }  return bct.ie.p();
/*      */     }
/*      */ 
/*      */     
/*      */     public static c a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/* 1848 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 7, 4, 9, eq1);
/*      */       
/* 1850 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1851 */         return null;
/*      */       }
/*      */       
/* 1854 */       return new c(☃, n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1859 */       if (this.f < 0) {
/* 1860 */         this.f = a(☃, bwf1);
/* 1861 */         if (this.f < 0) {
/* 1862 */           return true;
/*      */         }
/* 1864 */         this.n.a(0, this.f - this.n.e + 4 - 1, 0);
/*      */       } 
/*      */       
/* 1867 */       blc blc1 = a(bct.J.p());
/*      */ 
/*      */       
/* 1870 */       a(☃, bwf1, 0, 1, 0, 6, 4, 8, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1873 */       a(☃, bwf1, 1, 0, 1, 2, 0, 7, bct.cq.p(), bct.cq.p(), false);
/* 1874 */       a(☃, bwf1, 4, 0, 1, 5, 0, 7, bct.cq.p(), bct.cq.p(), false);
/*      */       
/* 1876 */       a(☃, bwf1, 0, 0, 0, 0, 0, 8, blc1, blc1, false);
/* 1877 */       a(☃, bwf1, 6, 0, 0, 6, 0, 8, blc1, blc1, false);
/* 1878 */       a(☃, bwf1, 1, 0, 0, 5, 0, 0, blc1, blc1, false);
/* 1879 */       a(☃, bwf1, 1, 0, 8, 5, 0, 8, blc1, blc1, false);
/*      */       
/* 1881 */       a(☃, bwf1, 3, 0, 1, 3, 0, 7, bct.A.p(), bct.A.p(), false);
/*      */       int i;
/* 1883 */       for (i = 1; i <= 7; i++) {
/* 1884 */         bdv bdv = (bdv)this.a.c();
/* 1885 */         int j = bdv.e();
/* 1886 */         int k = j / 3;
/* 1887 */         a(☃, this.a.a(bdv.d(), Integer.valueOf(xq.a(random, k, j))), 1, 1, i, bwf1);
/* 1888 */         a(☃, this.a.a(bdv.d(), Integer.valueOf(xq.a(random, k, j))), 2, 1, i, bwf1);
/*      */         
/* 1890 */         bdv = (bdv)this.b.c();
/* 1891 */         int m = bdv.e();
/* 1892 */         int n = m / 3;
/* 1893 */         a(☃, this.b.a(bdv.d(), Integer.valueOf(xq.a(random, n, m))), 4, 1, i, bwf1);
/* 1894 */         a(☃, this.b.a(bdv.d(), Integer.valueOf(xq.a(random, n, m))), 5, 1, i, bwf1);
/*      */       } 
/*      */       
/* 1897 */       for (i = 0; i < 9; i++) {
/* 1898 */         for (int j = 0; j < 7; j++) {
/* 1899 */           a(☃, j, 4, i, bwf1);
/* 1900 */           b(☃, bct.j.p(), j, -1, i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 1904 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends o
/*      */   {
/*      */     private blc a;
/*      */     
/*      */     private blc b;
/*      */     
/*      */     private blc c;
/*      */     
/*      */     private blc d;
/*      */     
/*      */     public b() {}
/*      */     
/*      */     public b(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 1923 */       super(☃, i);
/*      */       
/* 1925 */       a(eq1);
/* 1926 */       this.n = bwf1;
/*      */       
/* 1928 */       this.a = bxh.c.a(random);
/* 1929 */       this.b = bxh.c.a(random);
/* 1930 */       this.c = bxh.c.a(random);
/* 1931 */       this.d = bxh.c.a(random);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃) {
/* 1936 */       super.a(☃);
/* 1937 */       ☃.a("CA", hk.a(this.a));
/* 1938 */       ☃.a("CB", hk.a(this.b));
/* 1939 */       ☃.a("CC", hk.a(this.c));
/* 1940 */       ☃.a("CD", hk.a(this.d));
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(gy ☃, bxm bxm1) {
/* 1945 */       super.a(☃, bxm1);
/* 1946 */       this.a = hk.d(☃.p("CA"));
/* 1947 */       this.b = hk.d(☃.p("CB"));
/* 1948 */       this.c = hk.d(☃.p("CC"));
/* 1949 */       this.d = hk.d(☃.p("CD"));
/*      */       
/* 1951 */       if (!(this.a.c() instanceof bdv)) {
/* 1952 */         this.a = bct.cp.p();
/*      */       }
/* 1954 */       if (!(this.b.c() instanceof bdv)) {
/* 1955 */         this.b = bct.eT.p();
/*      */       }
/* 1957 */       if (!(this.c.c() instanceof bdv)) {
/* 1958 */         this.c = bct.eU.p();
/*      */       }
/* 1960 */       if (!(this.d.c() instanceof bdv)) {
/* 1961 */         this.d = bct.ie.p();
/*      */       }
/*      */     }
/*      */     
/*      */     public static b a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1, int n) {
/* 1966 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 13, 4, 9, eq1);
/*      */       
/* 1968 */       if (!a(bwf) || bxb.a(list, bwf) != null) {
/* 1969 */         return null;
/*      */       }
/*      */       
/* 1972 */       return new b(☃, n, random, bwf, eq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 1977 */       if (this.f < 0) {
/* 1978 */         this.f = a(☃, bwf1);
/* 1979 */         if (this.f < 0) {
/* 1980 */           return true;
/*      */         }
/* 1982 */         this.n.a(0, this.f - this.n.e + 4 - 1, 0);
/*      */       } 
/*      */       
/* 1985 */       blc blc1 = a(bct.J.p());
/*      */ 
/*      */       
/* 1988 */       a(☃, bwf1, 0, 1, 0, 12, 4, 8, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 1991 */       a(☃, bwf1, 1, 0, 1, 2, 0, 7, bct.cq.p(), bct.cq.p(), false);
/* 1992 */       a(☃, bwf1, 4, 0, 1, 5, 0, 7, bct.cq.p(), bct.cq.p(), false);
/* 1993 */       a(☃, bwf1, 7, 0, 1, 8, 0, 7, bct.cq.p(), bct.cq.p(), false);
/* 1994 */       a(☃, bwf1, 10, 0, 1, 11, 0, 7, bct.cq.p(), bct.cq.p(), false);
/*      */       
/* 1996 */       a(☃, bwf1, 0, 0, 0, 0, 0, 8, blc1, blc1, false);
/* 1997 */       a(☃, bwf1, 6, 0, 0, 6, 0, 8, blc1, blc1, false);
/* 1998 */       a(☃, bwf1, 12, 0, 0, 12, 0, 8, blc1, blc1, false);
/* 1999 */       a(☃, bwf1, 1, 0, 0, 11, 0, 0, blc1, blc1, false);
/* 2000 */       a(☃, bwf1, 1, 0, 8, 11, 0, 8, blc1, blc1, false);
/*      */       
/* 2002 */       a(☃, bwf1, 3, 0, 1, 3, 0, 7, bct.A.p(), bct.A.p(), false);
/* 2003 */       a(☃, bwf1, 9, 0, 1, 9, 0, 7, bct.A.p(), bct.A.p(), false);
/*      */       int i;
/* 2005 */       for (i = 1; i <= 7; i++) {
/* 2006 */         bdv bdv = (bdv)this.a.c();
/* 2007 */         int j = bdv.e();
/* 2008 */         int k = j / 3;
/* 2009 */         a(☃, this.a.a(bdv.d(), Integer.valueOf(xq.a(random, k, j))), 1, 1, i, bwf1);
/* 2010 */         a(☃, this.a.a(bdv.d(), Integer.valueOf(xq.a(random, k, j))), 2, 1, i, bwf1);
/*      */         
/* 2012 */         bdv = (bdv)this.b.c();
/* 2013 */         int m = bdv.e();
/* 2014 */         int n = m / 3;
/* 2015 */         a(☃, this.b.a(bdv.d(), Integer.valueOf(xq.a(random, n, m))), 4, 1, i, bwf1);
/* 2016 */         a(☃, this.b.a(bdv.d(), Integer.valueOf(xq.a(random, n, m))), 5, 1, i, bwf1);
/*      */         
/* 2018 */         bdv = (bdv)this.c.c();
/* 2019 */         int i1 = bdv.e();
/* 2020 */         int i2 = i1 / 3;
/* 2021 */         a(☃, this.c.a(bdv.d(), Integer.valueOf(xq.a(random, i2, i1))), 7, 1, i, bwf1);
/* 2022 */         a(☃, this.c.a(bdv.d(), Integer.valueOf(xq.a(random, i2, i1))), 8, 1, i, bwf1);
/*      */         
/* 2024 */         bdv = (bdv)this.d.c();
/* 2025 */         int i3 = bdv.e();
/* 2026 */         int i4 = i3 / 3;
/* 2027 */         a(☃, this.d.a(bdv.d(), Integer.valueOf(xq.a(random, i4, i3))), 10, 1, i, bwf1);
/* 2028 */         a(☃, this.d.a(bdv.d(), Integer.valueOf(xq.a(random, i4, i3))), 11, 1, i, bwf1);
/*      */       } 
/*      */       
/* 2031 */       for (i = 0; i < 9; i++) {
/* 2032 */         for (int j = 0; j < 13; j++) {
/* 2033 */           a(☃, j, 4, i, bwf1);
/* 2034 */           b(☃, bct.j.p(), j, -1, i, bwf1);
/*      */         } 
/*      */       } 
/*      */       
/* 2038 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends o
/*      */   {
/*      */     public d() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public d(bxh.k ☃, int i, Random random, bwf bwf1, eq eq1) {
/* 2052 */       super(☃, i);
/*      */       
/* 2054 */       a(eq1);
/* 2055 */       this.n = bwf1;
/*      */     }
/*      */     
/*      */     public static bwf a(bxh.k ☃, List<bxb> list, Random random, int i, int j, int m, eq eq1) {
/* 2059 */       bwf bwf = bwf.a(i, j, m, 0, 0, 0, 3, 4, 2, eq1);
/*      */       
/* 2061 */       if (bxb.a(list, bwf) != null) {
/* 2062 */         return null;
/*      */       }
/*      */       
/* 2065 */       return bwf;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 2070 */       if (this.f < 0) {
/* 2071 */         this.f = a(☃, bwf1);
/* 2072 */         if (this.f < 0) {
/* 2073 */           return true;
/*      */         }
/* 2075 */         this.n.a(0, this.f - this.n.e + 4 - 1, 0);
/*      */       } 
/*      */       
/* 2078 */       blc blc = a(bct.cX.p());
/*      */ 
/*      */       
/* 2081 */       a(☃, bwf1, 0, 0, 0, 2, 3, 1, bct.a.p(), bct.a.p(), false);
/*      */ 
/*      */       
/* 2084 */       a(☃, blc, 1, 0, 0, bwf1);
/* 2085 */       a(☃, blc, 1, 1, 0, bwf1);
/* 2086 */       a(☃, blc, 1, 2, 0, bwf1);
/*      */ 
/*      */       
/* 2089 */       a(☃, bct.bn.p(), 1, 3, 0, bwf1);
/*      */ 
/*      */       
/* 2092 */       a(☃, eq.f, 2, 3, 0, bwf1);
/* 2093 */       a(☃, eq.c, 1, 3, 1, bwf1);
/* 2094 */       a(☃, eq.e, 0, 3, 0, bwf1);
/* 2095 */       a(☃, eq.d, 1, 3, -1, bwf1);
/*      */       
/* 2097 */       return true;
/*      */     }
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\bxh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */