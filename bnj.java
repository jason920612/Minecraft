/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.collect.Sets;
/*      */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*      */ import it.unimi.dsi.fastutil.longs.LongSet;
/*      */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*      */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*      */ import java.util.BitSet;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ import java.util.concurrent.atomic.AtomicInteger;
/*      */ import java.util.function.Predicate;
/*      */ import javax.annotation.Nullable;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
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
/*      */ public class bnj
/*      */   implements bmx
/*      */ {
/*   58 */   private static final Logger d = LogManager.getLogger();
/*      */ 
/*      */   
/*   61 */   public static final bnk a = null;
/*      */   
/*   63 */   private final bnk[] e = new bnk[16];
/*      */   private final ayu[] f;
/*   65 */   private final boolean[] g = new boolean[256];
/*   66 */   private final Map<el, gy> h = Maps.newHashMap();
/*      */   private boolean i;
/*      */   private final axy j;
/*   69 */   private final Map<bor.a, bor> k = Maps.newEnumMap(bor.a.class);
/*      */   
/*      */   public final int b;
/*      */   
/*      */   public final int c;
/*      */   private boolean l;
/*      */   private final bnt m;
/*   76 */   private final Map<el, bji> n = Maps.newHashMap();
/*      */   
/*      */   private final xe<aer>[] o;
/*   79 */   private final Map<String, bxc> p = Maps.newHashMap();
/*   80 */   private final Map<String, LongSet> q = Maps.newHashMap();
/*      */   
/*   82 */   private final ShortList[] r = new ShortList[16];
/*      */   
/*      */   private final ayo<bcs> s;
/*      */   
/*      */   private final ayo<byv> t;
/*      */   
/*      */   private boolean u;
/*      */   private boolean v;
/*      */   private long w;
/*      */   private boolean x;
/*      */   private int y;
/*      */   private long z;
/*   94 */   private int A = 4096;
/*      */   
/*   96 */   private final ConcurrentLinkedQueue<el> B = Queues.newConcurrentLinkedQueue();
/*      */   
/*   98 */   private bnd C = bnd.a;
/*      */   private int D;
/*  100 */   private final AtomicInteger E = new AtomicInteger();
/*      */ 
/*      */   
/*      */   private final axm F;
/*      */ 
/*      */ 
/*      */   
/*      */   public bnj(axy ☃, int i, int j, ayu[] arrayOfAyu, bnt bnt1, ayo<bcs> ayo1, ayo<byv> ayo2, long l) {
/*  108 */     this.o = (xe<aer>[])new xe[16];
/*  109 */     this.j = ☃;
/*  110 */     this.b = i;
/*  111 */     this.c = j;
/*  112 */     this.F = new axm(i, j);
/*  113 */     this.m = bnt1;
/*      */     
/*  115 */     for (bor.a a : bor.a.values()) {
/*  116 */       if (a.c() == bor.b.b) {
/*  117 */         this.k.put(a, new bor(this, a));
/*      */       }
/*      */     } 
/*      */     
/*  121 */     for (int k = 0; k < this.o.length; k++) {
/*  122 */       this.o[k] = new xe<>(aer.class);
/*      */     }
/*      */     
/*  125 */     this.f = arrayOfAyu;
/*  126 */     this.s = ayo1;
/*  127 */     this.t = ayo2;
/*  128 */     this.z = l;
/*      */   }
/*      */   
/*      */   public bnj(axy ☃, bnr bnr1, int i, int j) {
/*  132 */     this(☃, i, j, bnr1.g(), bnr1.v(), bnr1.n(), bnr1.o(), bnr1.m());
/*      */     
/*      */     int k;
/*  135 */     for (k = 0; k < this.e.length; k++) {
/*  136 */       this.e[k] = bnr1.c()[k];
/*      */     }
/*      */     
/*  139 */     for (gy gy : bnr1.s()) {
/*  140 */       bnv.a(gy, ☃, this);
/*      */     }
/*      */     
/*  143 */     for (bji bji : bnr1.r().values()) {
/*  144 */       a(bji);
/*      */     }
/*      */     
/*  147 */     this.h.putAll(bnr1.w());
/*      */     
/*  149 */     for (k = 0; k < (bnr1.u()).length; k++) {
/*  150 */       this.r[k] = bnr1.u()[k];
/*      */     }
/*      */     
/*  153 */     a(bnr1.e());
/*  154 */     b(bnr1.f());
/*      */     
/*  156 */     for (bor.a a : bnr1.t()) {
/*  157 */       if (a.c() == bor.b.b) {
/*  158 */         ((bor)this.k.computeIfAbsent(a, ☃ -> new bor(this, ☃))).a(bnr1.b(a).b());
/*      */       }
/*      */     } 
/*      */     
/*  162 */     this.x = true;
/*      */     
/*  164 */     a(bnd.i);
/*      */   }
/*      */   
/*      */   public Set<el> t() {
/*  168 */     Set<el> ☃ = Sets.newHashSet(this.h.keySet());
/*  169 */     ☃.addAll(this.n.keySet());
/*  170 */     return ☃;
/*      */   }
/*      */   
/*      */   public boolean a(int ☃, int i) {
/*  174 */     return (☃ == this.b && i == this.c);
/*      */   }
/*      */ 
/*      */   
/*      */   public bnk[] c() {
/*  179 */     return this.e;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void o() {
/*  190 */     int ☃ = b();
/*  191 */     this.y = Integer.MAX_VALUE;
/*  192 */     for (bor bor : this.k.values()) {
/*  193 */       bor.a();
/*      */     }
/*      */     
/*  196 */     for (int i = 0; i < 16; i++) {
/*  197 */       for (int j = 0; j < 16; j++) {
/*  198 */         if (this.j.t.g()) {
/*  199 */           int k = 15;
/*  200 */           int m = ☃ + 16 - 1;
/*      */           do {
/*  202 */             int n = d(i, m, j);
/*  203 */             if (n == 0 && k != 15) {
/*  204 */               n = 1;
/*      */             }
/*  206 */             k -= n;
/*      */             
/*  208 */             if (k <= 0)
/*  209 */               continue;  bnk bnk1 = this.e[m >> 4];
/*  210 */             if (bnk1 == a)
/*  211 */               continue;  bnk1.a(i, m & 0xF, j, k);
/*  212 */             this.j.m(new el((this.b << 4) + i, m, (this.c << 4) + j));
/*      */ 
/*      */             
/*  215 */             --m;
/*  216 */           } while (m > 0 && k > 0);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  221 */     this.x = true;
/*      */   }
/*      */   
/*      */   private void c(int ☃, int i) {
/*  225 */     this.g[☃ + i * 16] = true;
/*  226 */     this.l = true;
/*      */   }
/*      */   
/*      */   private void g(boolean ☃) {
/*  230 */     this.j.A.a("recheckGaps");
/*  231 */     if (this.j.e(new el(this.b * 16 + 8, 0, this.c * 16 + 8), 16)) {
/*  232 */       for (int i = 0; i < 16; i++) {
/*  233 */         for (int j = 0; j < 16; j++) {
/*  234 */           if (this.g[i + j * 16]) {
/*  235 */             this.g[i + j * 16] = false;
/*  236 */             int k = a(bor.a.c, i, j);
/*  237 */             int m = this.b * 16 + i;
/*  238 */             int n = this.c * 16 + j;
/*      */             
/*  240 */             int i1 = Integer.MAX_VALUE;
/*  241 */             for (eq eq : eq.c.a) {
/*  242 */               i1 = Math.min(i1, this.j.d(m + eq.g(), n + eq.i()));
/*      */             }
/*      */             
/*  245 */             c(m, n, i1);
/*  246 */             for (eq eq : eq.c.a) {
/*  247 */               c(m + eq.g(), n + eq.i(), k);
/*      */             }
/*      */             
/*  250 */             if (☃) {
/*  251 */               this.j.A.e();
/*      */               return;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*  257 */       this.l = false;
/*      */     } 
/*  259 */     this.j.A.e();
/*      */   }
/*      */   
/*      */   private void c(int ☃, int i, int j) {
/*  263 */     int k = this.j.a(bor.a.d, new el(☃, 0, i)).p();
/*      */     
/*  265 */     if (k > j) {
/*  266 */       a(☃, i, j, k + 1);
/*  267 */     } else if (k < j) {
/*  268 */       a(☃, i, k, j + 1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(int ☃, int i, int j, int k) {
/*  273 */     if (k > j && 
/*  274 */       this.j.e(new el(☃, 0, i), 16)) {
/*  275 */       for (int m = j; m < k; m++) {
/*  276 */         this.j.c(ayi.a, new el(☃, m, i));
/*      */       }
/*  278 */       this.x = true;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(int ☃, int i, int j, blc blc1) {
/*  284 */     bor bor = this.k.get(bor.a.c);
/*  285 */     int k = bor.a(☃ & 0xF, j & 0xF) & 0xFF;
/*  286 */     if (!bor.a(☃, i, j, blc1)) {
/*      */       return;
/*      */     }
/*  289 */     int m = bor.a(☃ & 0xF, j & 0xF);
/*      */     
/*  291 */     int n = this.b * 16 + ☃;
/*  292 */     int i1 = this.c * 16 + j;
/*      */     
/*  294 */     this.j.a(n, i1, m, k);
/*      */     
/*  296 */     if (this.j.t.g()) {
/*  297 */       int i2 = Math.min(k, m);
/*  298 */       int i3 = Math.max(k, m);
/*  299 */       int i4 = (m < k) ? 15 : 0;
/*      */       int i5;
/*  301 */       for (i5 = i2; i5 < i3; i5++) {
/*  302 */         bnk bnk1 = this.e[i5 >> 4];
/*  303 */         if (bnk1 != a) {
/*  304 */           bnk1.a(☃, i5 & 0xF, j, i4);
/*  305 */           this.j.m(new el((this.b << 4) + ☃, i5, (this.c << 4) + j));
/*      */         } 
/*      */       } 
/*      */       
/*  309 */       i5 = 15;
/*  310 */       while (m > 0 && i5 > 0) {
/*  311 */         m--;
/*  312 */         int i6 = d(☃, m, j);
/*  313 */         i6 = (i6 == 0) ? 1 : i6;
/*  314 */         i5 -= i6;
/*  315 */         i5 = Math.max(0, i5);
/*  316 */         bnk bnk1 = this.e[m >> 4];
/*  317 */         if (bnk1 != a) {
/*  318 */           bnk1.a(☃, m & 0xF, j, i5);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  323 */     if (m < this.y) {
/*  324 */       this.y = m;
/*      */     }
/*      */     
/*  327 */     if (this.j.t.g()) {
/*  328 */       int i2 = bor.a(☃ & 0xF, j & 0xF);
/*  329 */       int i3 = Math.min(k, i2);
/*  330 */       int i4 = Math.max(k, i2);
/*      */       
/*  332 */       for (eq eq : eq.c.a) {
/*  333 */         a(n + eq.g(), i1 + eq.i(), i3, i4);
/*      */       }
/*  335 */       a(n, i1, i3, i4);
/*      */     } 
/*      */     
/*  338 */     this.x = true;
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
/*      */   
/*      */   private int d(int ☃, int i, int j) {
/*  353 */     return a(☃, i, j).b(this.j, new el(☃, i, j));
/*      */   }
/*      */ 
/*      */   
/*      */   public blc a_(el ☃) {
/*  358 */     return a(☃.o(), ☃.p(), ☃.q());
/*      */   }
/*      */   
/*      */   public blc a(int ☃, int i, int j) {
/*  362 */     if (this.j.S() == ayg.h) {
/*  363 */       blc blc = null;
/*  364 */       if (i == 60) {
/*  365 */         blc = bct.fU.p();
/*      */       }
/*  367 */       if (i == 70) {
/*  368 */         blc = boo.b(☃, j);
/*      */       }
/*  370 */       return (blc == null) ? bct.a.p() : blc;
/*      */     } 
/*      */     
/*      */     try {
/*  374 */       if (i >= 0 && i >> 4 < this.e.length) {
/*  375 */         bnk bnk1 = this.e[i >> 4];
/*  376 */         if (bnk1 != a) {
/*  377 */           return bnk1.a(☃ & 0xF, i & 0xF, j & 0xF);
/*      */         }
/*      */       } 
/*  380 */       return bct.a.p();
/*  381 */     } catch (Throwable throwable) {
/*  382 */       b b = b.a(throwable, "Getting block state");
/*  383 */       c c = b.a("Block being got");
/*  384 */       c.a("Location", () -> c.a(☃, i, j));
/*  385 */       throw new h(b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public byw b(el ☃) {
/*  391 */     return b(☃.o(), ☃.p(), ☃.q());
/*      */   }
/*      */   
/*      */   public byw b(int ☃, int i, int j) {
/*      */     try {
/*  396 */       if (i >= 0 && i >> 4 < this.e.length) {
/*  397 */         bnk bnk1 = this.e[i >> 4];
/*  398 */         if (bnk1 != a) {
/*  399 */           return bnk1.b(☃ & 0xF, i & 0xF, j & 0xF);
/*      */         }
/*      */       } 
/*  402 */       return byy.a.i();
/*  403 */     } catch (Throwable throwable) {
/*  404 */       b b = b.a(throwable, "Getting fluid state");
/*  405 */       c c = b.a("Block being got");
/*  406 */       c.a("Location", () -> c.a(☃, i, j));
/*  407 */       throw new h(b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public blc a(el ☃, blc blc1, boolean bool) {
/*  414 */     int i = ☃.o() & 0xF;
/*  415 */     int j = ☃.p();
/*  416 */     int k = ☃.q() & 0xF;
/*      */     
/*  418 */     int m = ((bor)this.k.get(bor.a.c)).a(i, k);
/*      */     
/*  420 */     blc blc2 = a_(☃);
/*      */     
/*  422 */     if (blc2 == blc1) {
/*  423 */       return null;
/*      */     }
/*      */     
/*  426 */     bcs bcs1 = blc1.c();
/*  427 */     bcs bcs2 = blc2.c();
/*      */     
/*  429 */     bnk bnk1 = this.e[j >> 4];
/*  430 */     boolean bool1 = false;
/*  431 */     if (bnk1 == a) {
/*      */       
/*  433 */       if (blc1.f()) {
/*  434 */         return null;
/*      */       }
/*      */       
/*  437 */       bnk1 = new bnk(j >> 4 << 4, this.j.t.g());
/*  438 */       this.e[j >> 4] = bnk1;
/*  439 */       bool1 = (j >= m);
/*      */     } 
/*      */     
/*  442 */     bnk1.a(i, j & 0xF, k, blc1);
/*  443 */     ((bor)this.k.get(bor.a.d)).a(i, j, k, blc1);
/*  444 */     ((bor)this.k.get(bor.a.e)).a(i, j, k, blc1);
/*  445 */     ((bor)this.k.get(bor.a.f)).a(i, j, k, blc1);
/*  446 */     ((bor)this.k.get(bor.a.g)).a(i, j, k, blc1);
/*      */     
/*  448 */     if (!this.j.B) {
/*  449 */       blc2.a(this.j, ☃, blc1, bool);
/*  450 */     } else if (bcs2 != bcs1 && bcs2 instanceof ben) {
/*  451 */       this.j.n(☃);
/*      */     } 
/*      */     
/*  454 */     if (bnk1.a(i, j & 0xF, k).c() != bcs1) {
/*  455 */       return null;
/*      */     }
/*      */     
/*  458 */     if (bool1) {
/*  459 */       o();
/*      */     } else {
/*  461 */       int n = blc1.b(this.j, ☃);
/*  462 */       int i1 = blc2.b(this.j, ☃);
/*      */       
/*  464 */       a(i, j, k, blc1);
/*      */       
/*  466 */       if (n != i1)
/*      */       {
/*  468 */         if (n < i1 || a(ayi.a, ☃) > 0 || a(ayi.b, ☃) > 0) {
/*  469 */           c(i, k);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  474 */     if (bcs2 instanceof ben) {
/*  475 */       bji bji = a(☃, a.c);
/*  476 */       if (bji != null) {
/*  477 */         bji.A();
/*      */       }
/*      */     } 
/*      */     
/*  481 */     if (!this.j.B) {
/*  482 */       blc1.a(this.j, ☃, blc2);
/*      */     }
/*  484 */     if (bcs1 instanceof ben) {
/*  485 */       bji bji = a(☃, a.c);
/*  486 */       if (bji == null) {
/*  487 */         bji = ((ben)bcs1).a(this.j);
/*  488 */         this.j.a(☃, bji);
/*      */       } else {
/*  490 */         bji.A();
/*      */       } 
/*      */     } 
/*      */     
/*  494 */     this.x = true;
/*  495 */     return blc2;
/*      */   }
/*      */   
/*      */   public int a(ayi ☃, el el1) {
/*  499 */     return a(☃, el1, this.j.o().g());
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(ayi ☃, el el1, boolean bool) {
/*  504 */     int i = el1.o() & 0xF;
/*  505 */     int j = el1.p();
/*  506 */     int k = el1.q() & 0xF;
/*  507 */     int m = j >> 4;
/*      */     
/*  509 */     if (m < 0 || m > this.e.length - 1) {
/*  510 */       if ((☃ == ayi.a && bool) || ☃ == ayi.b) {
/*  511 */         return ☃.c;
/*      */       }
/*  513 */       return 0;
/*      */     } 
/*      */     
/*  516 */     bnk bnk1 = this.e[m];
/*      */     
/*  518 */     if (bnk1 == a) {
/*  519 */       if (c(el1)) {
/*  520 */         return ☃.c;
/*      */       }
/*  522 */       return 0;
/*      */     } 
/*      */ 
/*      */     
/*  526 */     if (☃ == ayi.a) {
/*  527 */       if (!bool) {
/*  528 */         return 0;
/*      */       }
/*  530 */       return bnk1.c(i, j & 0xF, k);
/*  531 */     }  if (☃ == ayi.b) {
/*  532 */       return bnk1.d(i, j & 0xF, k);
/*      */     }
/*  534 */     return ☃.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ayi ☃, el el1, int i) {
/*  539 */     a(☃, this.j.o().g(), el1, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ayi ☃, boolean bool, el el1, int i) {
/*  544 */     int j = el1.o() & 0xF;
/*  545 */     int k = el1.p();
/*  546 */     int m = el1.q() & 0xF;
/*      */     
/*  548 */     int n = k >> 4;
/*  549 */     if (n >= 16 || n < 0) {
/*      */       return;
/*      */     }
/*      */     
/*  553 */     bnk bnk1 = this.e[n];
/*  554 */     if (bnk1 == a) {
/*  555 */       if (i == ☃.c) {
/*      */         return;
/*      */       }
/*      */       
/*  559 */       bnk1 = new bnk(n << 4, bool);
/*  560 */       this.e[n] = bnk1;
/*  561 */       o();
/*      */     } 
/*      */     
/*  564 */     if (☃ == ayi.a) {
/*  565 */       if (this.j.t.g()) {
/*  566 */         bnk1.a(j, k & 0xF, m, i);
/*      */       }
/*  568 */     } else if (☃ == ayi.b) {
/*  569 */       bnk1.b(j, k & 0xF, m, i);
/*      */     } 
/*      */     
/*  572 */     this.x = true;
/*      */   }
/*      */   
/*      */   public int a(el ☃, int i) {
/*  576 */     return a(☃, i, this.j.o().g());
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(el ☃, int i, boolean bool) {
/*  581 */     int j = ☃.o() & 0xF;
/*  582 */     int k = ☃.p();
/*  583 */     int m = ☃.q() & 0xF;
/*  584 */     int n = k >> 4;
/*      */     
/*  586 */     if (n < 0 || n > this.e.length - 1) {
/*  587 */       return 0;
/*      */     }
/*      */     
/*  590 */     bnk bnk1 = this.e[n];
/*      */     
/*  592 */     if (bnk1 == a) {
/*  593 */       if (bool && i < ayi.a.c) {
/*  594 */         return ayi.a.c - i;
/*      */       }
/*  596 */       return 0;
/*      */     } 
/*      */     
/*  599 */     int i1 = bool ? bnk1.c(j, k & 0xF, m) : 0;
/*  600 */     i1 -= i;
/*  601 */     int i2 = bnk1.d(j, k & 0xF, m);
/*  602 */     if (i2 > i1) {
/*  603 */       i1 = i2;
/*      */     }
/*      */     
/*  606 */     return i1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃) {
/*  611 */     this.v = true;
/*      */     
/*  613 */     int i = xq.c(☃.q / 16.0D);
/*  614 */     int j = xq.c(☃.s / 16.0D);
/*  615 */     if (i != this.b || j != this.c) {
/*  616 */       d.warn("Wrong location! ({}, {}) should be ({}, {}), {}", Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.b), Integer.valueOf(this.c), ☃);
/*      */       
/*  618 */       ☃.V();
/*      */     } 
/*  620 */     int k = xq.c(☃.r / 16.0D);
/*  621 */     if (k < 0) {
/*  622 */       k = 0;
/*      */     }
/*  624 */     if (k >= this.o.length) {
/*  625 */       k = this.o.length - 1;
/*      */     }
/*  627 */     ☃.ad = true;
/*  628 */     ☃.ae = this.b;
/*  629 */     ☃.af = k;
/*  630 */     ☃.ag = this.c;
/*  631 */     this.o[k].add(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bor.a ☃, long[] arrayOfLong) {
/*  636 */     ((bor)this.k.get(☃)).a(arrayOfLong);
/*      */   }
/*      */   
/*      */   public void b(aer ☃) {
/*  640 */     a(☃, ☃.af);
/*      */   }
/*      */   
/*      */   public void a(aer ☃, int i) {
/*  644 */     if (i < 0) {
/*  645 */       i = 0;
/*      */     }
/*  647 */     if (i >= this.o.length) {
/*  648 */       i = this.o.length - 1;
/*      */     }
/*  650 */     this.o[i].remove(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(el ☃) {
/*  655 */     int i = ☃.o() & 0xF;
/*  656 */     int j = ☃.p();
/*  657 */     int k = ☃.q() & 0xF;
/*  658 */     return (j >= ((bor)this.k.get(bor.a.c)).a(i, k));
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(bor.a ☃, int i, int j) {
/*  663 */     return ((bor)this.k.get(☃)).a(i & 0xF, j & 0xF) - 1;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   private bji j(el ☃) {
/*  685 */     blc blc = a_(☃);
/*  686 */     bcs bcs = blc.c();
/*  687 */     if (!bcs.i()) {
/*  688 */       return null;
/*      */     }
/*      */     
/*  691 */     return ((ben)bcs).a(this.j);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public bji f(el ☃) {
/*  697 */     return a(☃, a.c);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bji a(el ☃, a a1) {
/*  702 */     bji bji = this.n.get(☃);
/*  703 */     if (bji == null) {
/*  704 */       gy gy = this.h.remove(☃);
/*  705 */       if (gy != null) {
/*  706 */         bji bji1 = a(☃, gy);
/*  707 */         if (bji1 != null) {
/*  708 */           return bji1;
/*      */         }
/*      */       } 
/*      */     } 
/*  712 */     if (bji == null) {
/*  713 */       if (a1 == a.a) {
/*  714 */         bji = j(☃);
/*  715 */         this.j.a(☃, bji);
/*  716 */       } else if (a1 == a.b) {
/*  717 */         this.B.add(☃);
/*      */       } 
/*  719 */     } else if (bji.x()) {
/*  720 */       this.n.remove(☃);
/*  721 */       return null;
/*      */     } 
/*      */     
/*  724 */     return bji;
/*      */   }
/*      */   
/*      */   public void a(bji ☃) {
/*  728 */     a(☃.v(), ☃);
/*  729 */     if (this.i) {
/*  730 */       this.j.a(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(el ☃, bji bji1) {
/*  736 */     bji1.a(this.j);
/*  737 */     bji1.a(☃);
/*      */     
/*  739 */     if (!(a_(☃).c() instanceof ben)) {
/*      */       return;
/*      */     }
/*  742 */     if (this.n.containsKey(☃)) {
/*  743 */       ((bji)this.n.get(☃)).y();
/*      */     }
/*      */     
/*  746 */     bji1.z();
/*  747 */     this.n.put(☃.h(), bji1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(gy ☃) {
/*  752 */     this.h.put(new el(☃.h("x"), ☃.h("y"), ☃.h("z")), ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(el ☃) {
/*  757 */     if (this.i) {
/*  758 */       bji bji = this.n.remove(☃);
/*  759 */       if (bji != null) {
/*  760 */         bji.y();
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void p() {
/*  766 */     this.i = true;
/*  767 */     this.j.a(this.n.values());
/*      */     
/*  769 */     for (xe<aer> ☃ : this.o) {
/*  770 */       this.j.a(☃.stream().filter(☃ -> !(☃ instanceof aog)));
/*      */     }
/*      */   }
/*      */   
/*      */   public void q() {
/*  775 */     this.i = false;
/*  776 */     for (bji ☃ : this.n.values()) {
/*  777 */       this.j.b(☃);
/*      */     }
/*  779 */     for (xe<aer> ☃ : this.o) {
/*  780 */       this.j.b(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void r() {
/*  785 */     this.x = true;
/*      */   }
/*      */   
/*      */   public void a(@Nullable aer ☃, cea cea1, List<aer> list, Predicate<? super aer> predicate) {
/*  789 */     int i = xq.c((cea1.b - 2.0D) / 16.0D);
/*  790 */     int j = xq.c((cea1.e + 2.0D) / 16.0D);
/*  791 */     i = xq.a(i, 0, this.o.length - 1);
/*  792 */     j = xq.a(j, 0, this.o.length - 1);
/*      */     
/*  794 */     for (int k = i; k <= j; k++) {
/*  795 */       if (!this.o[k].isEmpty())
/*      */       {
/*      */         
/*  798 */         for (aer aer1 : this.o[k]) {
/*  799 */           if (aer1.bD().c(cea1) && aer1 != ☃) {
/*  800 */             if (predicate == null || predicate.test(aer1)) {
/*  801 */               list.add(aer1);
/*      */             }
/*      */             
/*  804 */             aer[] arrayOfAer = aer1.bi();
/*  805 */             if (arrayOfAer != null)
/*  806 */               for (aer aer2 : arrayOfAer) {
/*  807 */                 aer1 = aer2;
/*  808 */                 if (aer1 != ☃ && aer1.bD().c(cea1) && (predicate == null || predicate.test(aer1))) {
/*  809 */                   list.add(aer1);
/*      */                 }
/*      */               }  
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public <T extends aer> void a(Class<? extends T> ☃, cea cea1, List<T> list, @Nullable Predicate<? super T> predicate) {
/*  819 */     int i = xq.c((cea1.b - 2.0D) / 16.0D);
/*  820 */     int j = xq.c((cea1.e + 2.0D) / 16.0D);
/*  821 */     i = xq.a(i, 0, this.o.length - 1);
/*  822 */     j = xq.a(j, 0, this.o.length - 1);
/*      */     
/*  824 */     for (int k = i; k <= j; k++) {
/*  825 */       for (aer aer : this.o[k].<T>c(☃)) {
/*  826 */         if (aer.bD().c(cea1) && (
/*  827 */           predicate == null || predicate.test((T)aer))) {
/*  828 */           list.add((T)aer);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(boolean ☃) {
/*  836 */     if (☃) {
/*  837 */       if ((this.v && this.j.V() != this.w) || this.x) {
/*  838 */         return true;
/*      */       }
/*      */     }
/*  841 */     else if (this.v && this.j.V() >= this.w + 600L) {
/*  842 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  846 */     return this.x;
/*      */   }
/*      */   
/*      */   public boolean s() {
/*  850 */     return false;
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/*  854 */     if (this.l && this.j.t.g() && !☃) {
/*  855 */       g(this.j.B);
/*      */     }
/*  857 */     this.u = true;
/*      */     
/*  859 */     while (!this.B.isEmpty()) {
/*  860 */       el el = this.B.poll();
/*  861 */       if (a(el, a.c) == null && a_(el).c().i()) {
/*  862 */         bji bji = j(el);
/*  863 */         this.j.a(el, bji);
/*  864 */         this.j.a(el, el);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean u() {
/*  870 */     return this.C.a(bnd.j);
/*      */   }
/*      */   
/*      */   public boolean v() {
/*  874 */     return this.u;
/*      */   }
/*      */ 
/*      */   
/*      */   public axm d() {
/*  879 */     return this.F;
/*      */   }
/*      */   
/*      */   public boolean b(int ☃, int i) {
/*  883 */     if (☃ < 0) {
/*  884 */       ☃ = 0;
/*      */     }
/*  886 */     if (i >= 256) {
/*  887 */       i = 255;
/*      */     }
/*  889 */     for (int j = ☃; j <= i; j += 16) {
/*  890 */       bnk bnk1 = this.e[j >> 4];
/*  891 */       if (bnk1 != a && !bnk1.a()) {
/*  892 */         return false;
/*      */       }
/*      */     } 
/*  895 */     return true;
/*      */   }
/*      */   
/*      */   public void a(bnk[] ☃) {
/*  899 */     if (this.e.length != ☃.length) {
/*  900 */       d.warn("Could not set level chunk sections, array length is {} instead of {}", Integer.valueOf(☃.length), Integer.valueOf(this.e.length));
/*      */       
/*      */       return;
/*      */     } 
/*  904 */     System.arraycopy(☃, 0, this.e, 0, this.e.length);
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
/*      */   public ayu i(el ☃) {
/*  965 */     int i = ☃.o() & 0xF;
/*  966 */     int j = ☃.q() & 0xF;
/*  967 */     return this.f[j << 4 | i];
/*      */   }
/*      */ 
/*      */   
/*      */   public ayu[] g() {
/*  972 */     return this.f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void x() {
/*  980 */     if (this.A >= 4096) {
/*      */       return;
/*      */     }
/*      */     
/*  984 */     el ☃ = new el(this.b << 4, 0, this.c << 4);
/*  985 */     for (int i = 0; i < 8; i++) {
/*  986 */       if (this.A >= 4096) {
/*      */         return;
/*      */       }
/*      */       
/*  990 */       int j = this.A % 16;
/*  991 */       int k = this.A / 16 % 16;
/*  992 */       int m = this.A / 256;
/*  993 */       this.A++;
/*      */       
/*  995 */       for (int n = 0; n < 16; n++) {
/*  996 */         el el = ☃.a(k, (j << 4) + n, m);
/*  997 */         boolean bool = (n == 0 || n == 15 || k == 0 || k == 15 || m == 0 || m == 15);
/*      */         
/*  999 */         if ((this.e[j] == a && bool) || (this.e[j] != a && this.e[j].a(k, n, m).f())) {
/* 1000 */           for (eq eq : eq.values()) {
/* 1001 */             el el1 = el.a(eq);
/* 1002 */             if (this.j.a_(el1).e() > 0) {
/* 1003 */               this.j.r(el1);
/*      */             }
/*      */           } 
/* 1006 */           this.j.r(el);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean y() {
/* 1013 */     return this.i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public axy z() {
/* 1021 */     return this.j;
/*      */   }
/*      */   
/*      */   public Set<bor.a> A() {
/* 1025 */     return this.k.keySet();
/*      */   }
/*      */   
/*      */   public bor b(bor.a ☃) {
/* 1029 */     return this.k.get(☃);
/*      */   }
/*      */   
/*      */   public Map<el, bji> B() {
/* 1033 */     return this.n;
/*      */   }
/*      */   
/*      */   public xe<aer>[] C() {
/* 1037 */     return this.o;
/*      */   }
/*      */ 
/*      */   
/*      */   public gy g(el ☃) {
/* 1042 */     return this.h.get(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ayo<bcs> k() {
/* 1047 */     return this.s;
/*      */   }
/*      */ 
/*      */   
/*      */   public ayo<byv> l() {
/* 1052 */     return this.t;
/*      */   }
/*      */ 
/*      */   
/*      */   public BitSet a(boq.a ☃) {
/* 1057 */     throw new RuntimeException("Not yet implemented");
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(boolean ☃) {
/* 1062 */     this.x = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(boolean ☃) {
/* 1071 */     this.v = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(long ☃) {
/* 1076 */     this.w = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public bxc a(String ☃) {
/* 1082 */     return this.p.get(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String ☃, bxc bxc1) {
/* 1087 */     this.p.put(☃, bxc1);
/*      */   }
/*      */ 
/*      */   
/*      */   public Map<String, bxc> e() {
/* 1092 */     return this.p;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(Map<String, bxc> ☃) {
/* 1097 */     this.p.clear();
/* 1098 */     this.p.putAll(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public LongSet b(String ☃) {
/* 1104 */     return this.q.computeIfAbsent(☃, ☃ -> new LongOpenHashSet());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String ☃, long l) {
/* 1109 */     ((LongSet)this.q.computeIfAbsent(☃, ☃ -> new LongOpenHashSet())).add(l);
/*      */   }
/*      */ 
/*      */   
/*      */   public Map<String, LongSet> f() {
/* 1114 */     return this.q;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(Map<String, LongSet> ☃) {
/* 1119 */     this.q.clear();
/* 1120 */     this.q.putAll(☃);
/*      */   }
/*      */   
/*      */   public int D() {
/* 1124 */     return this.y;
/*      */   }
/*      */ 
/*      */   
/*      */   public long m() {
/* 1129 */     return this.z;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(long ☃) {
/* 1134 */     this.z = ☃;
/*      */   }
/*      */   
/*      */   public void E() {
/* 1138 */     if (this.C.a(bnd.j) || this.D != 8) {
/*      */       return;
/*      */     }
/*      */     
/* 1142 */     axm ☃ = d();
/* 1143 */     for (int i = 0; i < this.r.length; i++) {
/* 1144 */       if (this.r[i] != null) {
/* 1145 */         for (ShortListIterator<Short> shortListIterator = this.r[i].iterator(); shortListIterator.hasNext(); ) { Short short_ = shortListIterator.next();
/* 1146 */           el el = bnr.a(short_.shortValue(), i, ☃);
/* 1147 */           blc blc1 = this.j.a_(el);
/* 1148 */           blc blc2 = bcs.b(blc1, this.j, el);
/* 1149 */           this.j.a(el, blc2, 20); }
/*      */         
/* 1151 */         this.r[i].clear();
/*      */       } 
/*      */     } 
/*      */     
/* 1155 */     if (this.s instanceof bns) {
/* 1156 */       ((bns<bcs>)this.s).a(this.j.J(), ☃ -> this.j.a_(☃).c());
/*      */     }
/*      */     
/* 1159 */     if (this.t instanceof bns) {
/* 1160 */       ((bns<byv>)this.t).a(this.j.I(), ☃ -> this.j.b(☃).c());
/*      */     }
/*      */     
/* 1163 */     for (el el : new HashSet(this.h.keySet())) {
/* 1164 */       f(el);
/*      */     }
/* 1166 */     this.h.clear();
/*      */     
/* 1168 */     a(bnd.j);
/* 1169 */     this.m.a(this);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private bji a(el ☃, gy gy1) {
/*      */     bji bji;
/* 1175 */     if ("DUMMY".equals(gy1.l("id"))) {
/* 1176 */       bcs bcs = a_(☃).c();
/* 1177 */       if (bcs instanceof ben) {
/* 1178 */         bji = ((ben)bcs).a(this.j);
/*      */       } else {
/* 1180 */         bji = null;
/* 1181 */         d.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", ☃, a_(☃));
/*      */       } 
/*      */     } else {
/* 1184 */       bji = bji.c(gy1);
/*      */     } 
/*      */     
/* 1187 */     if (bji != null) {
/* 1188 */       bji.a(☃);
/* 1189 */       a(bji);
/*      */     } else {
/* 1191 */       d.warn("Tried to load a block entity for block {} but failed at location {}", a_(☃), ☃);
/*      */     } 
/*      */     
/* 1194 */     return bji;
/*      */   }
/*      */   
/*      */   public bnt F() {
/* 1198 */     return this.m;
/*      */   }
/*      */   
/*      */   public ShortList[] G() {
/* 1202 */     return this.r;
/*      */   }
/*      */   
/*      */   public void a(short ☃, int i) {
/* 1206 */     bnr.a(this.r, i).add(☃);
/*      */   }
/*      */   
/*      */   public enum a {
/* 1210 */     a,
/* 1211 */     b,
/* 1212 */     c;
/*      */   }
/*      */ 
/*      */   
/*      */   public bnd i() {
/* 1217 */     return this.C;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bnd ☃) {
/* 1222 */     this.C = ☃;
/*      */   }
/*      */   
/*      */   public void c(String ☃) {
/* 1226 */     a(bnd.a(☃));
/*      */   }
/*      */   
/*      */   public void H() {
/* 1230 */     this.D++;
/* 1231 */     if (this.D > 8) {
/* 1232 */       throw new RuntimeException("Error while adding chunk to cache. Too many neighbors");
/*      */     }
/*      */     
/* 1235 */     if (J()) {
/* 1236 */       ((acv)this.j).a(this::E);
/*      */     }
/*      */   }
/*      */   
/*      */   public void I() {
/* 1241 */     this.D--;
/* 1242 */     if (this.D < 0) {
/* 1243 */       throw new RuntimeException("Error while removing chunk from cache. Not enough neighbors");
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean J() {
/* 1248 */     return (this.D == 8);
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\bnj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */