/*      */ import com.google.common.base.MoreObjects;
/*      */ import com.google.common.collect.Lists;
/*      */ import it.unimi.dsi.fastutil.longs.LongSet;
/*      */ import it.unimi.dsi.fastutil.longs.LongSets;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.function.BooleanSupplier;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
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
/*      */ public abstract class axy
/*      */   implements axp, axz, aye, AutoCloseable
/*      */ {
/*   81 */   protected static final Logger e = LogManager.getLogger();
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
/*   97 */   private static final eq[] a = eq.values();
/*      */   
/*   99 */   private int b = 63;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  106 */   public final List<aer> f = Lists.newArrayList();
/*  107 */   protected final List<aer> g = Lists.newArrayList();
/*  108 */   public final List<bji> h = Lists.newArrayList();
/*  109 */   public final List<bji> i = Lists.newArrayList();
/*  110 */   private final List<bji> c = Lists.newArrayList();
/*  111 */   private final List<bji> d = Lists.newArrayList();
/*      */   
/*  113 */   public final List<aog> j = Lists.newArrayList();
/*  114 */   public final List<aer> k = Lists.newArrayList();
/*  115 */   protected final xm<aer> l = new xm<>();
/*      */   
/*  117 */   private final long F = 16777215L;
/*      */   
/*      */   private int G;
/*      */   
/*  121 */   protected int m = (new Random()).nextInt();
/*  122 */   protected final int n = 1013904223;
/*      */   
/*      */   protected float o;
/*      */   protected float p;
/*      */   protected float q;
/*      */   protected float r;
/*      */   private int H;
/*  129 */   public final Random s = new Random();
/*      */   
/*      */   public final boc t;
/*  132 */   protected aix u = new aix();
/*  133 */   protected List<ayb> v = Lists.newArrayList((Object[])new ayb[] { this.u });
/*      */ 
/*      */ 
/*      */   
/*      */   protected bnc w;
/*      */ 
/*      */ 
/*      */   
/*      */   protected final ccc x;
/*      */ 
/*      */ 
/*      */   
/*      */   protected ccb y;
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   private final cck I;
/*      */ 
/*      */ 
/*      */   
/*      */   protected aji z;
/*      */ 
/*      */ 
/*      */   
/*      */   public final xr A;
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean B;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean C = true;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean D = true;
/*      */ 
/*      */   
/*      */   private boolean J;
/*      */ 
/*      */   
/*      */   private final bmv K;
/*      */ 
/*      */   
/*      */   int[] E;
/*      */ 
/*      */ 
/*      */   
/*      */   public ayu d(el ☃) {
/*  184 */     if (D(☃)) {
/*  185 */       bnj bnj = l(☃);
/*      */       try {
/*  187 */         return bnj.i(☃);
/*  188 */       } catch (Throwable throwable) {
/*  189 */         b b = b.a(throwable, "Getting biome");
/*  190 */         c c = b.a("Coordinates of biome request");
/*      */         
/*  192 */         c.a("Location", () -> c.a(☃));
/*      */         
/*  194 */         throw new h(b);
/*      */       } 
/*      */     } 
/*  197 */     return this.w.f().b().a(☃, ayz.c);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ayd ☃) {
/*  203 */     this.y.d(true);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e() {
/*  208 */     return this.B;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public MinecraftServer z() {
/*  214 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public blc i(el ☃) {
/*  222 */     el el1 = new el(☃.o(), k(), ☃.q());
/*  223 */     while (!c(el1.a())) {
/*  224 */       el1 = el1.a();
/*      */     }
/*  226 */     return a_(el1);
/*      */   }
/*      */   
/*      */   public static boolean j(el ☃) {
/*  230 */     return (!k(☃) && ☃.o() >= -30000000 && ☃.q() >= -30000000 && ☃.o() < 30000000 && ☃.q() < 30000000);
/*      */   }
/*      */   
/*      */   public static boolean k(el ☃) {
/*  234 */     return (☃.p() < 0 || ☃.p() >= 256);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(el ☃) {
/*  239 */     return a_(☃).f();
/*      */   }
/*      */   
/*      */   public bnj l(el ☃) {
/*  243 */     return c(☃.o() >> 4, ☃.q() >> 4);
/*      */   }
/*      */ 
/*      */   
/*      */   public bnj c(int ☃, int i) {
/*  248 */     bnj bnj = this.w.a(☃, i, true, true);
/*  249 */     if (bnj == null) {
/*  250 */       throw new IllegalStateException("Should always be able to create a chunk!");
/*      */     }
/*  252 */     return bnj;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(el ☃, blc blc1, int i) {
/*  257 */     if (k(☃)) {
/*  258 */       return false;
/*      */     }
/*      */     
/*  261 */     if (!this.B && this.y.t() == ayg.h) {
/*  262 */       return false;
/*      */     }
/*      */     
/*  265 */     bnj bnj = l(☃);
/*  266 */     bcs bcs = blc1.c();
/*  267 */     blc blc2 = bnj.a(☃, blc1, ((i & 0x40) != 0));
/*      */ 
/*      */     
/*  270 */     if (blc2 != null) {
/*      */       
/*  272 */       blc blc3 = a_(☃);
/*      */       
/*  274 */       if (blc3.b(this, ☃) != blc2.b(this, ☃) || blc3.e() != blc2.e()) {
/*  275 */         this.A.a("checkLight");
/*  276 */         r(☃);
/*  277 */         this.A.e();
/*      */       } 
/*      */ 
/*      */       
/*  281 */       if (blc3 == blc1) {
/*  282 */         if (blc2 != blc3) {
/*  283 */           a(☃, ☃);
/*      */         }
/*      */         
/*  286 */         if ((i & 0x2) != 0 && (!this.B || (i & 0x4) == 0) && bnj.u()) {
/*  287 */           a(☃, blc2, blc1, i);
/*      */         }
/*      */         
/*  290 */         if (!this.B && (i & 0x1) != 0) {
/*  291 */           a(☃, blc2.c());
/*  292 */           if (blc1.n()) {
/*  293 */             c(☃, bcs);
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/*  298 */         if ((i & 0x10) == 0) {
/*  299 */           int j = i & 0xFFFFFFFE;
/*  300 */           blc2.b(this, ☃, j);
/*  301 */           blc1.a(this, ☃, j);
/*  302 */           blc1.b(this, ☃, j);
/*      */         } 
/*      */       } 
/*      */       
/*  306 */       return true;
/*      */     } 
/*      */     
/*  309 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean g(el ☃) {
/*  320 */     byw byw = b(☃);
/*  321 */     return a(☃, byw.i(), 3);
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
/*      */   public boolean a(el ☃, boolean bool) {
/*  334 */     blc blc = a_(☃);
/*  335 */     if (blc.f()) {
/*  336 */       return false;
/*      */     }
/*      */     
/*  339 */     byw byw = b(☃);
/*  340 */     b(2001, ☃, bcs.l(blc));
/*  341 */     if (bool) {
/*  342 */       blc.a(this, ☃, 0);
/*      */     }
/*  344 */     return a(☃, byw.i(), 3);
/*      */   }
/*      */   
/*      */   public boolean a(el ☃, blc blc1) {
/*  348 */     return a(☃, blc1, 3);
/*      */   }
/*      */   
/*      */   public void a(el ☃, blc blc1, blc blc2, int i) {
/*  352 */     for (int j = 0; j < this.v.size(); j++) {
/*  353 */       ((ayb)this.v.get(j)).a(this, ☃, blc1, blc2, i);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(el ☃, bcs bcs1) {
/*  359 */     if (this.y.t() != ayg.h) {
/*  360 */       b(☃, bcs1);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, int j, int k) {
/*  365 */     if (j > k) {
/*  366 */       int m = k;
/*  367 */       k = j;
/*  368 */       j = m;
/*      */     } 
/*  370 */     if (this.t.g()) {
/*  371 */       for (int m = j; m <= k; m++) {
/*  372 */         c(ayi.a, new el(☃, m, i));
/*      */       }
/*      */     }
/*  375 */     a(☃, j, i, ☃, k, i);
/*      */   }
/*      */   
/*      */   public void a(el ☃, el el1) {
/*  379 */     a(☃.o(), ☃.p(), ☃.q(), el1.o(), el1.p(), el1.q());
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, int j, int k, int m, int n) {
/*  383 */     for (int i1 = 0; i1 < this.v.size(); i1++) {
/*  384 */       ((ayb)this.v.get(i1)).a(☃, i, j, k, m, n);
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(el ☃, bcs bcs1) {
/*  389 */     a(☃.e(), bcs1, ☃);
/*  390 */     a(☃.f(), bcs1, ☃);
/*  391 */     a(☃.b(), bcs1, ☃);
/*  392 */     a(☃.a(), bcs1, ☃);
/*  393 */     a(☃.c(), bcs1, ☃);
/*  394 */     a(☃.d(), bcs1, ☃);
/*      */   }
/*      */   
/*      */   public void a(el ☃, bcs bcs1, eq eq1) {
/*  398 */     if (eq1 != eq.e) {
/*  399 */       a(☃.e(), bcs1, ☃);
/*      */     }
/*  401 */     if (eq1 != eq.f) {
/*  402 */       a(☃.f(), bcs1, ☃);
/*      */     }
/*  404 */     if (eq1 != eq.a) {
/*  405 */       a(☃.b(), bcs1, ☃);
/*      */     }
/*  407 */     if (eq1 != eq.b) {
/*  408 */       a(☃.a(), bcs1, ☃);
/*      */     }
/*  410 */     if (eq1 != eq.c) {
/*  411 */       a(☃.c(), bcs1, ☃);
/*      */     }
/*  413 */     if (eq1 != eq.d) {
/*  414 */       a(☃.d(), bcs1, ☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(el ☃, bcs bcs1, el el1) {
/*  419 */     if (this.B) {
/*      */       return;
/*      */     }
/*  422 */     blc blc = a_(☃);
/*      */     
/*      */     try {
/*  425 */       blc.a(this, ☃, bcs1, el1);
/*  426 */     } catch (Throwable throwable) {
/*  427 */       b b = b.a(throwable, "Exception while updating neighbours");
/*  428 */       c c = b.a("Block being updated");
/*      */       
/*  430 */       c.a("Source block type", () -> {
/*      */             try {
/*      */               return String.format("ID #%s (%s // %s)", new Object[] { fc.g.b(☃), ☃.m(), ☃.getClass().getCanonicalName() });
/*  433 */             } catch (Throwable throwable) {
/*      */               return "ID #" + fc.g.b(☃);
/*      */             } 
/*      */           });
/*      */       
/*  438 */       c.a(c, ☃, blc);
/*      */       
/*  440 */       throw new h(b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(el ☃) {
/*  446 */     return l(☃).c(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(el ☃, int i) {
/*  451 */     if (☃.o() < -30000000 || ☃.q() < -30000000 || ☃.o() >= 30000000 || ☃.q() >= 30000000) {
/*  452 */       return 15;
/*      */     }
/*      */     
/*  455 */     if (☃.p() < 0) {
/*  456 */       return 0;
/*      */     }
/*  458 */     if (☃.p() >= 256) {
/*  459 */       ☃ = new el(☃.o(), 255, ☃.q());
/*      */     }
/*      */     
/*  462 */     return l(☃).a(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(bor.a ☃, int i, int j) {
/*      */     int k;
/*  468 */     if (i < -30000000 || j < -30000000 || i >= 30000000 || j >= 30000000) {
/*  469 */       k = k() + 1;
/*  470 */     } else if (a(i >> 4, j >> 4, true)) {
/*  471 */       k = c(i >> 4, j >> 4).a(☃, i & 0xF, j & 0xF) + 1;
/*      */     } else {
/*  473 */       k = 0;
/*      */     } 
/*  475 */     return k;
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public int d(int ☃, int i) {
/*  480 */     if (☃ < -30000000 || i < -30000000 || ☃ >= 30000000 || i >= 30000000) {
/*  481 */       return k() + 1;
/*      */     }
/*  483 */     if (!a(☃ >> 4, i >> 4, true)) {
/*  484 */       return 0;
/*      */     }
/*      */     
/*  487 */     bnj bnj = c(☃ >> 4, i >> 4);
/*  488 */     return bnj.D();
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
/*      */   public int a(ayi ☃, el el1) {
/*  532 */     if (el1.p() < 0) {
/*  533 */       el1 = new el(el1.o(), 0, el1.q());
/*      */     }
/*  535 */     if (!j(el1)) {
/*  536 */       return ☃.c;
/*      */     }
/*  538 */     if (!D(el1)) {
/*  539 */       return ☃.c;
/*      */     }
/*  541 */     return l(el1).a(☃, el1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ayi ☃, el el1, int i) {
/*  546 */     if (!j(el1)) {
/*      */       return;
/*      */     }
/*  549 */     if (!D(el1)) {
/*      */       return;
/*      */     }
/*  552 */     l(el1).a(☃, el1, i);
/*  553 */     m(el1);
/*      */   }
/*      */   
/*      */   public void m(el ☃) {
/*  557 */     for (int i = 0; i < this.v.size(); i++) {
/*  558 */       ((ayb)this.v.get(i)).a(☃);
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
/*      */   
/*      */   public blc a_(el ☃) {
/*  574 */     if (k(☃)) {
/*  575 */       return bct.jH.p();
/*      */     }
/*  577 */     bnj bnj = l(☃);
/*  578 */     return bnj.a_(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public byw b(el ☃) {
/*  583 */     if (k(☃)) {
/*  584 */       return byy.a.i();
/*      */     }
/*  586 */     bnj bnj = l(☃);
/*  587 */     return bnj.b(☃);
/*      */   }
/*      */   
/*      */   public boolean L() {
/*  591 */     return (this.G < 4);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public ceb a(cee ☃, cee cee1) {
/*  596 */     return a(☃, cee1, cec.a, false, false);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public ceb a(cee ☃, cee cee1, cec cec1) {
/*  601 */     return a(☃, cee1, cec1, false, false);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public ceb a(cee ☃, cee cee1, cec cec1, boolean bool1, boolean bool2) {
/*  606 */     double d1 = ☃.b;
/*  607 */     double d2 = ☃.c;
/*  608 */     double d3 = ☃.d;
/*  609 */     if (Double.isNaN(d1) || Double.isNaN(d2) || Double.isNaN(d3)) {
/*  610 */       return null;
/*      */     }
/*  612 */     if (Double.isNaN(cee1.b) || Double.isNaN(cee1.c) || Double.isNaN(cee1.d)) {
/*  613 */       return null;
/*      */     }
/*      */     
/*  616 */     int i = xq.c(cee1.b);
/*  617 */     int j = xq.c(cee1.c);
/*  618 */     int k = xq.c(cee1.d);
/*      */     
/*  620 */     int m = xq.c(d1);
/*  621 */     int n = xq.c(d2);
/*  622 */     int i1 = xq.c(d3);
/*      */     
/*  624 */     el el = new el(m, n, i1);
/*      */     
/*  626 */     blc blc = a_(el);
/*  627 */     byw byw = b(el);
/*  628 */     if (!bool1 || !blc.h(this, el).b()) {
/*      */ 
/*      */       
/*  631 */       boolean bool3 = blc.c().d(blc);
/*  632 */       boolean bool4 = cec1.d.test(byw);
/*      */       
/*  634 */       if (bool3 || bool4) {
/*  635 */         ceb ceb1 = null;
/*  636 */         if (bool3) {
/*  637 */           ceb1 = bcs.a(blc, this, el, ☃, cee1);
/*      */         }
/*      */         
/*  640 */         if (ceb1 == null && bool4) {
/*  641 */           ceb1 = cet.a(0.0D, 0.0D, 0.0D, 1.0D, byw.f(), 1.0D).a(☃, cee1, el);
/*      */         }
/*      */         
/*  644 */         if (ceb1 != null) {
/*  645 */           return ceb1;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  651 */     ceb ceb = null;
/*      */     
/*  653 */     int i2 = 200;
/*  654 */     while (i2-- >= 0) {
/*  655 */       eq eq1; if (Double.isNaN(d1) || Double.isNaN(d2) || Double.isNaN(d3)) {
/*  656 */         return null;
/*      */       }
/*  658 */       if (m == i && n == j && i1 == k) {
/*  659 */         return bool2 ? ceb : null;
/*      */       }
/*      */       
/*  662 */       boolean bool3 = true;
/*  663 */       boolean bool4 = true;
/*  664 */       boolean bool5 = true;
/*      */       
/*  666 */       double d4 = 999.0D;
/*  667 */       double d5 = 999.0D;
/*  668 */       double d6 = 999.0D;
/*      */       
/*  670 */       if (i > m) {
/*  671 */         d4 = m + 1.0D;
/*  672 */       } else if (i < m) {
/*  673 */         d4 = m + 0.0D;
/*      */       } else {
/*  675 */         bool3 = false;
/*      */       } 
/*      */       
/*  678 */       if (j > n) {
/*  679 */         d5 = n + 1.0D;
/*  680 */       } else if (j < n) {
/*  681 */         d5 = n + 0.0D;
/*      */       } else {
/*  683 */         bool4 = false;
/*      */       } 
/*      */       
/*  686 */       if (k > i1) {
/*  687 */         d6 = i1 + 1.0D;
/*  688 */       } else if (k < i1) {
/*  689 */         d6 = i1 + 0.0D;
/*      */       } else {
/*  691 */         bool5 = false;
/*      */       } 
/*      */       
/*  694 */       double d7 = 999.0D;
/*  695 */       double d8 = 999.0D;
/*  696 */       double d9 = 999.0D;
/*      */       
/*  698 */       double d10 = cee1.b - d1;
/*  699 */       double d11 = cee1.c - d2;
/*  700 */       double d12 = cee1.d - d3;
/*      */       
/*  702 */       if (bool3) {
/*  703 */         d7 = (d4 - d1) / d10;
/*      */       }
/*  705 */       if (bool4) {
/*  706 */         d8 = (d5 - d2) / d11;
/*      */       }
/*  708 */       if (bool5) {
/*  709 */         d9 = (d6 - d3) / d12;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  714 */       if (d7 == -0.0D) {
/*  715 */         d7 = -1.0E-4D;
/*      */       }
/*  717 */       if (d8 == -0.0D) {
/*  718 */         d8 = -1.0E-4D;
/*      */       }
/*  720 */       if (d9 == -0.0D) {
/*  721 */         d9 = -1.0E-4D;
/*      */       }
/*      */ 
/*      */       
/*  725 */       if (d7 < d8 && d7 < d9) {
/*  726 */         eq1 = (i > m) ? eq.e : eq.f;
/*  727 */         d1 = d4;
/*  728 */         d2 += d11 * d7;
/*  729 */         d3 += d12 * d7;
/*  730 */       } else if (d8 < d9) {
/*  731 */         eq1 = (j > n) ? eq.a : eq.b;
/*  732 */         d1 += d10 * d8;
/*  733 */         d2 = d5;
/*  734 */         d3 += d12 * d8;
/*      */       } else {
/*  736 */         eq1 = (k > i1) ? eq.c : eq.d;
/*  737 */         d1 += d10 * d9;
/*  738 */         d2 += d11 * d9;
/*  739 */         d3 = d6;
/*      */       } 
/*      */       
/*  742 */       m = xq.c(d1) - ((eq1 == eq.f) ? 1 : 0);
/*  743 */       n = xq.c(d2) - ((eq1 == eq.b) ? 1 : 0);
/*  744 */       i1 = xq.c(d3) - ((eq1 == eq.d) ? 1 : 0);
/*      */       
/*  746 */       el = new el(m, n, i1);
/*  747 */       blc blc1 = a_(el);
/*  748 */       byw byw1 = b(el);
/*  749 */       if (bool1 && blc1.d() != bza.c && blc1.h(this, el).b()) {
/*      */         continue;
/*      */       }
/*  752 */       boolean bool6 = blc1.c().d(blc1);
/*  753 */       boolean bool7 = cec1.d.test(byw1);
/*  754 */       if (bool6 || bool7) {
/*  755 */         ceb ceb1 = null;
/*      */         
/*  757 */         if (bool6) {
/*  758 */           ceb1 = bcs.a(blc1, this, el, ☃, cee1);
/*      */         }
/*      */         
/*  761 */         if (ceb1 == null && bool7) {
/*  762 */           ceb1 = cet.a(0.0D, 0.0D, 0.0D, 1.0D, byw1.f(), 1.0D).a(☃, cee1, el);
/*      */         }
/*      */         
/*  765 */         if (ceb1 != null)
/*  766 */           return ceb1; 
/*      */         continue;
/*      */       } 
/*  769 */       ceb = new ceb(ceb.a.a, new cee(d1, d2, d3), eq1, el);
/*      */     } 
/*      */ 
/*      */     
/*  773 */     return bool2 ? ceb : null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(@Nullable aog ☃, el el1, wi wi1, wk wk1, float f1, float f2) {
/*  779 */     a(☃, el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D, wi1, wk1, f1, f2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable aog ☃, double d1, double d2, double d3, wi wi1, wk wk1, float f1, float f2) {
/*  784 */     for (int i = 0; i < this.v.size(); i++) {
/*  785 */       ((ayb)this.v.get(i)).a(☃, wi1, wk1, d1, d2, d3, f1, f2);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2, wi wi1, wk wk1, float f1, float f2, boolean bool) {}
/*      */   
/*      */   public void a(el ☃, @Nullable wi wi1) {
/*  793 */     for (int i = 0; i < this.v.size(); i++) {
/*  794 */       ((ayb)this.v.get(i)).a(wi1, ☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fk ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  800 */     for (int i = 0; i < this.v.size(); i++) {
/*  801 */       ((ayb)this.v.get(i)).a(☃, ☃.b().e(), d1, d2, d3, d4, d5, d6);
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
/*      */   public void b(fk ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  814 */     for (int i = 0; i < this.v.size(); i++) {
/*  815 */       ((ayb)this.v.get(i)).a(☃, false, true, d1, d2, d3, d4, d5, d6);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean d(aer ☃) {
/*  820 */     this.k.add(☃);
/*  821 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aer ☃) {
/*  826 */     int i = xq.c(☃.q / 16.0D);
/*  827 */     int j = xq.c(☃.s / 16.0D);
/*      */     
/*  829 */     boolean bool = ☃.l;
/*  830 */     if (☃ instanceof aog) {
/*  831 */       bool = true;
/*      */     }
/*      */     
/*  834 */     if (bool || a(i, j, false)) {
/*  835 */       if (☃ instanceof aog) {
/*  836 */         aog aog = (aog)☃;
/*  837 */         this.j.add(aog);
/*  838 */         k_();
/*      */       } 
/*  840 */       c(i, j).a(☃);
/*  841 */       this.f.add(☃);
/*  842 */       b(☃);
/*  843 */       return true;
/*      */     } 
/*  845 */     return false;
/*      */   }
/*      */   
/*      */   protected void b(aer ☃) {
/*  849 */     for (int i = 0; i < this.v.size(); i++) {
/*  850 */       ((ayb)this.v.get(i)).a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void c(aer ☃) {
/*  855 */     for (int i = 0; i < this.v.size(); i++) {
/*  856 */       ((ayb)this.v.get(i)).b(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(aer ☃) {
/*  861 */     if (☃.aX()) {
/*  862 */       ☃.aL();
/*      */     }
/*  864 */     if (☃.aW()) {
/*  865 */       ☃.S_();
/*      */     }
/*  867 */     ☃.V();
/*  868 */     if (☃ instanceof aog) {
/*  869 */       this.j.remove(☃);
/*  870 */       k_();
/*  871 */       c(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void f(aer ☃) {
/*  876 */     ☃.b(false);
/*  877 */     ☃.V();
/*      */     
/*  879 */     if (☃ instanceof aog) {
/*  880 */       this.j.remove(☃);
/*  881 */       k_();
/*      */     } 
/*      */     
/*  884 */     int i = ☃.ae;
/*  885 */     int j = ☃.ag;
/*  886 */     if (☃.ad && a(i, j, true)) {
/*  887 */       c(i, j).b(☃);
/*      */     }
/*      */     
/*  890 */     this.f.remove(☃);
/*  891 */     c(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ayb ☃) {
/*  899 */     this.v.add(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(float ☃) {
/*  907 */     float f1 = k(☃);
/*  908 */     float f2 = 1.0F - xq.b(f1 * 6.2831855F) * 2.0F + 0.5F;
/*  909 */     f2 = xq.a(f2, 0.0F, 1.0F);
/*  910 */     f2 = 1.0F - f2;
/*  911 */     f2 = (float)(f2 * (1.0D - (i(☃) * 5.0F) / 16.0D));
/*  912 */     f2 = (float)(f2 * (1.0D - (g(☃) * 5.0F) / 16.0D));
/*  913 */     f2 = 1.0F - f2;
/*  914 */     return (int)(f2 * 11.0F);
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
/*      */   public float c(float ☃) {
/*  986 */     float f = k(☃);
/*  987 */     return f * 6.2831855F;
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
/*      */   public void o_() {
/* 1042 */     this.A.a("entities");
/* 1043 */     this.A.a("global");
/*      */     int i;
/* 1045 */     for (i = 0; i < this.k.size(); i++) {
/* 1046 */       aer aer = this.k.get(i);
/*      */       try {
/* 1048 */         aer.U++;
/* 1049 */         aer.R_();
/* 1050 */       } catch (Throwable throwable) {
/* 1051 */         b b = b.a(throwable, "Ticking entity");
/* 1052 */         c c = b.a("Entity being ticked");
/*      */         
/* 1054 */         if (aer == null) {
/* 1055 */           c.a("Entity", "~~NULL~~");
/*      */         } else {
/* 1057 */           aer.a(c);
/*      */         } 
/*      */         
/* 1060 */         throw new h(b);
/*      */       } 
/*      */       
/* 1063 */       if (aer.G) {
/* 1064 */         this.k.remove(i--);
/*      */       }
/*      */     } 
/*      */     
/* 1068 */     this.A.c("remove");
/* 1069 */     this.f.removeAll(this.g);
/* 1070 */     for (i = 0; i < this.g.size(); i++) {
/* 1071 */       aer aer = this.g.get(i);
/* 1072 */       int j = aer.ae;
/* 1073 */       int k = aer.ag;
/* 1074 */       if (aer.ad && a(j, k, true)) {
/* 1075 */         c(j, k).b(aer);
/*      */       }
/*      */     } 
/* 1078 */     for (i = 0; i < this.g.size(); i++) {
/* 1079 */       c(this.g.get(i));
/*      */     }
/* 1081 */     this.g.clear();
/*      */     
/* 1083 */     p_();
/*      */     
/* 1085 */     this.A.c("regular");
/* 1086 */     for (i = 0; i < this.f.size(); i++) {
/* 1087 */       aer aer1 = this.f.get(i);
/* 1088 */       aer aer2 = aer1.bU();
/* 1089 */       if (aer2 != null) {
/* 1090 */         if (aer2.G || !aer2.w(aer1)) {
/* 1091 */           aer1.S_();
/*      */         } else {
/*      */           continue;
/*      */         } 
/*      */       }
/*      */       
/* 1097 */       this.A.a("tick");
/* 1098 */       if (!aer1.G && !(aer1 instanceof tf)) {
/*      */         try {
/* 1100 */           g(aer1);
/* 1101 */         } catch (Throwable throwable) {
/* 1102 */           b b = b.a(throwable, "Ticking entity");
/* 1103 */           c c = b.a("Entity being ticked");
/*      */           
/* 1105 */           aer1.a(c);
/*      */           
/* 1107 */           throw new h(b);
/*      */         } 
/*      */       }
/* 1110 */       this.A.e();
/*      */       
/* 1112 */       this.A.a("remove");
/* 1113 */       if (aer1.G) {
/* 1114 */         int j = aer1.ae;
/* 1115 */         int k = aer1.ag;
/* 1116 */         if (aer1.ad && a(j, k, true)) {
/* 1117 */           c(j, k).b(aer1);
/*      */         }
/* 1119 */         this.f.remove(i--);
/* 1120 */         c(aer1);
/*      */       } 
/* 1122 */       this.A.e();
/*      */       continue;
/*      */     } 
/* 1125 */     this.A.c("blockEntities");
/*      */     
/* 1127 */     if (!this.d.isEmpty()) {
/* 1128 */       this.i.removeAll(this.d);
/* 1129 */       this.h.removeAll(this.d);
/* 1130 */       this.d.clear();
/*      */     } 
/*      */     
/* 1133 */     this.J = true;
/* 1134 */     Iterator<bji> ☃ = this.i.iterator();
/* 1135 */     while (☃.hasNext()) {
/* 1136 */       bji bji = ☃.next();
/* 1137 */       if (!bji.x() && bji.u()) {
/* 1138 */         el el = bji.v();
/* 1139 */         if (D(el) && this.K.a(el)) {
/*      */           try {
/* 1141 */             this.A.a(() -> String.valueOf(bjj.a(☃.C())));
/* 1142 */             ((pt)bji).Y_();
/* 1143 */             this.A.e();
/* 1144 */           } catch (Throwable throwable) {
/* 1145 */             b b = b.a(throwable, "Ticking block entity");
/* 1146 */             c c = b.a("Block entity being ticked");
/*      */             
/* 1148 */             bji.a(c);
/*      */             
/* 1150 */             throw new h(b);
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/* 1155 */       if (bji.x()) {
/* 1156 */         ☃.remove();
/* 1157 */         this.h.remove(bji);
/*      */         
/* 1159 */         if (D(bji.v())) {
/* 1160 */           l(bji.v()).d(bji.v());
/*      */         }
/*      */       } 
/*      */     } 
/* 1164 */     this.J = false;
/*      */     
/* 1166 */     this.A.c("pendingBlockEntities");
/* 1167 */     if (!this.c.isEmpty()) {
/* 1168 */       for (int j = 0; j < this.c.size(); j++) {
/* 1169 */         bji bji = this.c.get(j);
/* 1170 */         if (!bji.x()) {
/* 1171 */           if (!this.h.contains(bji)) {
/* 1172 */             a(bji);
/*      */           }
/*      */           
/* 1175 */           if (D(bji.v())) {
/* 1176 */             bnj bnj = l(bji.v());
/* 1177 */             blc blc = bnj.a_(bji.v());
/* 1178 */             bnj.a(bji.v(), bji);
/* 1179 */             a(bji.v(), blc, blc, 3);
/*      */           } 
/*      */         } 
/*      */       } 
/* 1183 */       this.c.clear();
/*      */     } 
/* 1185 */     this.A.e();
/* 1186 */     this.A.e();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void p_() {}
/*      */   
/*      */   public boolean a(bji ☃) {
/* 1193 */     boolean bool = this.h.add(☃);
/* 1194 */     if (bool && ☃ instanceof pt) {
/* 1195 */       this.i.add(☃);
/*      */     }
/*      */     
/* 1198 */     if (this.B) {
/* 1199 */       el el = ☃.v();
/* 1200 */       blc blc = a_(el);
/* 1201 */       a(el, blc, blc, 2);
/*      */     } 
/*      */     
/* 1204 */     return bool;
/*      */   }
/*      */   
/*      */   public void a(Collection<bji> ☃) {
/* 1208 */     if (this.J) {
/* 1209 */       this.c.addAll(☃);
/*      */     } else {
/* 1211 */       for (bji bji : ☃) {
/* 1212 */         a(bji);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void g(aer ☃) {
/* 1218 */     a(☃, true);
/*      */   }
/*      */   
/*      */   public void a(aer ☃, boolean bool) {
/* 1222 */     if (!(☃ instanceof aog)) {
/* 1223 */       int m = xq.c(☃.q);
/* 1224 */       int n = xq.c(☃.s);
/* 1225 */       int i1 = 32;
/* 1226 */       if (bool && !a(m - 32, 0, n - 32, m + 32, 0, n + 32, true)) {
/*      */         return;
/*      */       }
/*      */     } 
/*      */     
/* 1231 */     ☃.N = ☃.q;
/* 1232 */     ☃.O = ☃.r;
/* 1233 */     ☃.P = ☃.s;
/* 1234 */     ☃.y = ☃.w;
/* 1235 */     ☃.z = ☃.x;
/*      */     
/* 1237 */     if (bool && ☃.ad) {
/* 1238 */       ☃.U++;
/* 1239 */       if (☃.aW()) {
/* 1240 */         ☃.aH();
/*      */       } else {
/* 1242 */         this.A.a(() -> fc.r.b(☃.P()).toString());
/* 1243 */         ☃.R_();
/* 1244 */         this.A.e();
/*      */       } 
/*      */     } 
/*      */     
/* 1248 */     this.A.a("chunkCheck");
/*      */     
/* 1250 */     if (Double.isNaN(☃.q) || Double.isInfinite(☃.q)) {
/* 1251 */       ☃.q = ☃.N;
/*      */     }
/* 1253 */     if (Double.isNaN(☃.r) || Double.isInfinite(☃.r)) {
/* 1254 */       ☃.r = ☃.O;
/*      */     }
/* 1256 */     if (Double.isNaN(☃.s) || Double.isInfinite(☃.s)) {
/* 1257 */       ☃.s = ☃.P;
/*      */     }
/* 1259 */     if (Double.isNaN(☃.x) || Double.isInfinite(☃.x)) {
/* 1260 */       ☃.x = ☃.z;
/*      */     }
/* 1262 */     if (Double.isNaN(☃.w) || Double.isInfinite(☃.w)) {
/* 1263 */       ☃.w = ☃.y;
/*      */     }
/*      */     
/* 1266 */     int i = xq.c(☃.q / 16.0D);
/* 1267 */     int j = xq.c(☃.r / 16.0D);
/* 1268 */     int k = xq.c(☃.s / 16.0D);
/*      */     
/* 1270 */     if (!☃.ad || ☃.ae != i || ☃.af != j || ☃.ag != k) {
/* 1271 */       if (☃.ad && a(☃.ae, ☃.ag, true)) {
/* 1272 */         c(☃.ae, ☃.ag).a(☃, ☃.af);
/*      */       }
/*      */       
/* 1275 */       if (☃.bN() || a(i, k, true)) {
/* 1276 */         c(i, k).a(☃);
/*      */       } else {
/* 1278 */         ☃.ad = false;
/*      */       } 
/*      */     } 
/* 1281 */     this.A.e();
/*      */     
/* 1283 */     if (bool && ☃.ad) {
/* 1284 */       for (aer aer1 : ☃.bP()) {
/* 1285 */         if (aer1.G || aer1.bU() != ☃) {
/* 1286 */           aer1.S_(); continue;
/*      */         } 
/* 1288 */         g(aer1);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(@Nullable aer ☃, cew cew1) {
/* 1296 */     if (cew1.b()) {
/* 1297 */       return true;
/*      */     }
/*      */     
/* 1300 */     List<aer> list = a((aer)null, cew1.a());
/* 1301 */     for (int i = 0; i < list.size(); i++) {
/* 1302 */       aer aer1 = list.get(i);
/* 1303 */       if (!aer1.G && aer1.j && aer1 != ☃ && (☃ == null || !aer1.x(☃)) && 
/* 1304 */         cet.c(cew1, cet.a(aer1.bD()), cei.AND)) {
/* 1305 */         return false;
/*      */       }
/*      */     } 
/*      */     
/* 1309 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(cea ☃) {
/* 1313 */     int i = xq.c(☃.a);
/* 1314 */     int j = xq.f(☃.d);
/* 1315 */     int k = xq.c(☃.b);
/* 1316 */     int m = xq.f(☃.e);
/* 1317 */     int n = xq.c(☃.c);
/* 1318 */     int i1 = xq.f(☃.f);
/*      */     
/* 1320 */     try (el.b ☃ = el.b.r()) {
/* 1321 */       for (int i2 = i; i2 < j; i2++) {
/* 1322 */         for (int i3 = k; i3 < m; i3++) {
/* 1323 */           for (int i4 = n; i4 < i1; i4++) {
/* 1324 */             blc blc = a_(b.f(i2, i3, i4));
/* 1325 */             if (!blc.f()) {
/* 1326 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1332 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(cea ☃) {
/* 1336 */     int i = xq.c(☃.a);
/* 1337 */     int j = xq.f(☃.d);
/* 1338 */     int k = xq.c(☃.b);
/* 1339 */     int m = xq.f(☃.e);
/* 1340 */     int n = xq.c(☃.c);
/* 1341 */     int i1 = xq.f(☃.f);
/*      */     
/* 1343 */     if (a(i, k, n, j, m, i1, true)) {
/* 1344 */       try (el.b ☃ = el.b.r()) {
/* 1345 */         for (int i2 = i; i2 < j; i2++) {
/* 1346 */           for (int i3 = k; i3 < m; i3++) {
/* 1347 */             for (int i4 = n; i4 < i1; i4++) {
/* 1348 */               bcs bcs = a_(b.f(i2, i3, i4)).c();
/* 1349 */               if (bcs == bct.ch || bcs == bct.C) {
/* 1350 */                 return true;
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/* 1357 */     return false;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public blc a(cea ☃, bcs bcs1) {
/* 1362 */     int i = xq.c(☃.a);
/* 1363 */     int j = xq.f(☃.d);
/* 1364 */     int k = xq.c(☃.b);
/* 1365 */     int m = xq.f(☃.e);
/* 1366 */     int n = xq.c(☃.c);
/* 1367 */     int i1 = xq.f(☃.f);
/*      */     
/* 1369 */     if (a(i, k, n, j, m, i1, true)) {
/* 1370 */       try (el.b ☃ = el.b.r()) {
/* 1371 */         for (int i2 = i; i2 < j; i2++) {
/* 1372 */           for (int i3 = k; i3 < m; i3++) {
/* 1373 */             for (int i4 = n; i4 < i1; i4++) {
/* 1374 */               blc blc = a_(b.f(i2, i3, i4));
/* 1375 */               if (blc.c() == bcs1) {
/* 1376 */                 return blc;
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/* 1383 */     return null;
/*      */   }
/*      */   
/*      */   public boolean a(cea ☃, bza bza1) {
/* 1387 */     int i = xq.c(☃.a);
/* 1388 */     int j = xq.f(☃.d);
/* 1389 */     int k = xq.c(☃.b);
/* 1390 */     int m = xq.f(☃.e);
/* 1391 */     int n = xq.c(☃.c);
/* 1392 */     int i1 = xq.f(☃.f);
/*      */     
/* 1394 */     bln bln = bln.a(bza1);
/*      */     
/* 1396 */     try (el.b ☃ = el.b.r()) {
/* 1397 */       for (int i2 = i; i2 < j; i2++) {
/* 1398 */         for (int i3 = k; i3 < m; i3++) {
/* 1399 */           for (int i4 = n; i4 < i1; i4++) {
/* 1400 */             if (bln.a(a_(b.f(i2, i3, i4)))) {
/* 1401 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1407 */     return false;
/*      */   }
/*      */   
/*      */   public axr a(@Nullable aer ☃, double d1, double d2, double d3, float f, boolean bool) {
/* 1411 */     return a(☃, (aea)null, d1, d2, d3, f, false, bool);
/*      */   }
/*      */   
/*      */   public axr a(@Nullable aer ☃, double d1, double d2, double d3, float f, boolean bool1, boolean bool2) {
/* 1415 */     return a(☃, (aea)null, d1, d2, d3, f, bool1, bool2);
/*      */   }
/*      */   
/*      */   public axr a(@Nullable aer ☃, @Nullable aea aea1, double d1, double d2, double d3, float f, boolean bool1, boolean bool2) {
/* 1419 */     axr axr = new axr(this, ☃, d1, d2, d3, f, bool1, bool2);
/* 1420 */     if (aea1 != null) {
/* 1421 */       axr.a(aea1);
/*      */     }
/* 1423 */     axr.a();
/* 1424 */     axr.a(true);
/* 1425 */     return axr;
/*      */   }
/*      */   
/*      */   public float a(cee ☃, cea cea1) {
/* 1429 */     double d1 = 1.0D / ((cea1.d - cea1.a) * 2.0D + 1.0D);
/* 1430 */     double d2 = 1.0D / ((cea1.e - cea1.b) * 2.0D + 1.0D);
/* 1431 */     double d3 = 1.0D / ((cea1.f - cea1.c) * 2.0D + 1.0D);
/*      */     
/* 1433 */     double d4 = (1.0D - Math.floor(1.0D / d1) * d1) / 2.0D;
/* 1434 */     double d5 = (1.0D - Math.floor(1.0D / d3) * d3) / 2.0D;
/*      */     
/* 1436 */     if (d1 < 0.0D || d2 < 0.0D || d3 < 0.0D) {
/* 1437 */       return 0.0F;
/*      */     }
/* 1439 */     int i = 0;
/* 1440 */     int j = 0; float f;
/* 1441 */     for (f = 0.0F; f <= 1.0F; f = (float)(f + d1)) {
/* 1442 */       float f1; for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d2)) {
/* 1443 */         float f2; for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d3)) {
/* 1444 */           double d6 = cea1.a + (cea1.d - cea1.a) * f;
/* 1445 */           double d7 = cea1.b + (cea1.e - cea1.b) * f1;
/* 1446 */           double d8 = cea1.c + (cea1.f - cea1.c) * f2;
/* 1447 */           if (a(new cee(d6 + d4, d7, d8 + d5), ☃) == null) {
/* 1448 */             i++;
/*      */           }
/* 1450 */           j++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1455 */     return i / j;
/*      */   }
/*      */   
/*      */   public boolean a(@Nullable aog ☃, el el1, eq eq1) {
/* 1459 */     el1 = el1.a(eq1);
/*      */     
/* 1461 */     if (a_(el1).c() == bct.ch) {
/* 1462 */       a(☃, 1009, el1, 0);
/* 1463 */       g(el1);
/* 1464 */       return true;
/*      */     } 
/* 1466 */     return false;
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
/*      */   @Nullable
/*      */   public bji f(el ☃) {
/* 1480 */     if (k(☃)) {
/* 1481 */       return null;
/*      */     }
/* 1483 */     bji bji = null;
/*      */     
/* 1485 */     if (this.J) {
/* 1486 */       bji = E(☃);
/*      */     }
/*      */     
/* 1489 */     if (bji == null) {
/* 1490 */       bji = l(☃).a(☃, bnj.a.a);
/*      */     }
/*      */     
/* 1493 */     if (bji == null) {
/* 1494 */       bji = E(☃);
/*      */     }
/* 1496 */     return bji;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private bji E(el ☃) {
/* 1501 */     for (int i = 0; i < this.c.size(); i++) {
/* 1502 */       bji bji = this.c.get(i);
/* 1503 */       if (!bji.x() && bji.v().equals(☃)) {
/* 1504 */         return bji;
/*      */       }
/*      */     } 
/* 1507 */     return null;
/*      */   }
/*      */   
/*      */   public void a(el ☃, @Nullable bji bji1) {
/* 1511 */     if (k(☃)) {
/*      */       return;
/*      */     }
/*      */     
/* 1515 */     if (bji1 != null && !bji1.x()) {
/* 1516 */       if (this.J) {
/* 1517 */         bji1.a(☃);
/*      */ 
/*      */         
/* 1520 */         Iterator<bji> iterator = this.c.iterator();
/* 1521 */         while (iterator.hasNext()) {
/* 1522 */           bji bji2 = iterator.next();
/* 1523 */           if (bji2.v().equals(☃)) {
/* 1524 */             bji2.y();
/* 1525 */             iterator.remove();
/*      */           } 
/*      */         } 
/*      */         
/* 1529 */         this.c.add(bji1);
/*      */       } else {
/* 1531 */         l(☃).a(☃, bji1);
/* 1532 */         a(bji1);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void n(el ☃) {
/* 1538 */     bji bji = f(☃);
/* 1539 */     if (bji != null && this.J) {
/* 1540 */       bji.y();
/* 1541 */       this.c.remove(bji);
/*      */     } else {
/* 1543 */       if (bji != null) {
/* 1544 */         this.c.remove(bji);
/* 1545 */         this.h.remove(bji);
/* 1546 */         this.i.remove(bji);
/*      */       } 
/*      */       
/* 1549 */       l(☃).d(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void b(bji ☃) {
/* 1554 */     this.d.add(☃);
/*      */   }
/*      */   
/*      */   public boolean o(el ☃) {
/* 1558 */     return bcs.a(a_(☃).h(this, ☃));
/*      */   }
/*      */   
/*      */   public boolean p(el ☃) {
/* 1562 */     if (k(☃)) {
/* 1563 */       return false;
/*      */     }
/* 1565 */     bnj bnj = this.w.a(☃.o() >> 4, ☃.q() >> 4, false, false);
/* 1566 */     return (bnj != null && !bnj.s());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean q(el ☃) {
/* 1575 */     return (p(☃) && a_(☃).q());
/*      */   }
/*      */   
/*      */   public void P() {
/* 1579 */     int ☃ = a(1.0F);
/* 1580 */     if (☃ != this.G) {
/* 1581 */       this.G = ☃;
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/* 1586 */     this.C = ☃;
/* 1587 */     this.D = bool1;
/*      */   }
/*      */   
/*      */   public void a(BooleanSupplier ☃) {
/* 1591 */     this.K.r();
/* 1592 */     w();
/*      */   }
/*      */   
/*      */   protected void Q() {
/* 1596 */     if (this.y.o()) {
/* 1597 */       this.p = 1.0F;
/* 1598 */       if (this.y.m()) {
/* 1599 */         this.r = 1.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void close() {
/* 1606 */     this.w.close();
/*      */   }
/*      */   
/*      */   protected void w() {
/* 1610 */     if (!this.t.g()) {
/*      */       return;
/*      */     }
/* 1613 */     if (this.B) {
/*      */       return;
/*      */     }
/*      */     
/* 1617 */     boolean ☃ = X().b("doWeatherCycle");
/*      */     
/* 1619 */     if (☃) {
/*      */       
/* 1621 */       int i = this.y.z();
/* 1622 */       if (i > 0) {
/* 1623 */         i--;
/* 1624 */         this.y.g(i);
/* 1625 */         this.y.e(this.y.m() ? 1 : 2);
/* 1626 */         this.y.f(this.y.o() ? 1 : 2);
/*      */       } 
/*      */ 
/*      */       
/* 1630 */       int j = this.y.n();
/* 1631 */       if (j <= 0) {
/* 1632 */         if (this.y.m()) {
/* 1633 */           this.y.e(this.s.nextInt(12000) + 3600);
/*      */         } else {
/* 1635 */           this.y.e(this.s.nextInt(168000) + 12000);
/*      */         } 
/*      */       } else {
/* 1638 */         j--;
/* 1639 */         this.y.e(j);
/* 1640 */         if (j <= 0) {
/* 1641 */           this.y.a(!this.y.m());
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1646 */       int k = this.y.p();
/* 1647 */       if (k <= 0) {
/* 1648 */         if (this.y.o()) {
/* 1649 */           this.y.f(this.s.nextInt(12000) + 12000);
/*      */         } else {
/* 1651 */           this.y.f(this.s.nextInt(168000) + 12000);
/*      */         } 
/*      */       } else {
/* 1654 */         k--;
/* 1655 */         this.y.f(k);
/* 1656 */         if (k <= 0) {
/* 1657 */           this.y.b(!this.y.o());
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1662 */     this.q = this.r;
/* 1663 */     if (this.y.m()) {
/* 1664 */       this.r = (float)(this.r + 0.01D);
/*      */     } else {
/* 1666 */       this.r = (float)(this.r - 0.01D);
/*      */     } 
/* 1668 */     this.r = xq.a(this.r, 0.0F, 1.0F);
/*      */     
/* 1670 */     this.o = this.p;
/* 1671 */     if (this.y.o()) {
/* 1672 */       this.p = (float)(this.p + 0.01D);
/*      */     } else {
/* 1674 */       this.p = (float)(this.p - 0.01D);
/*      */     } 
/* 1676 */     this.p = xq.a(this.p, 0.0F, 1.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void n_() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean r(el ☃) {
/* 1687 */     boolean bool = false;
/* 1688 */     if (this.t.g()) {
/* 1689 */       bool |= c(ayi.a, ☃);
/*      */     }
/* 1691 */     bool |= c(ayi.b, ☃);
/* 1692 */     return bool;
/*      */   }
/*      */   
/*      */   protected axy(ccc ☃, @Nullable cck cck1, ccb ccb1, boc boc1, xr xr1, boolean bool) {
/* 1696 */     this.E = new int[32768]; this.x = ☃; this.I = cck1; this.A = xr1; this.y = ccb1;
/*      */     this.t = boc1;
/*      */     this.B = bool;
/* 1699 */     this.K = boc1.j(); } private int a(el ☃, ayi ayi1) { if (ayi1 == ayi.a && e(☃)) {
/* 1700 */       return 15;
/*      */     }
/* 1702 */     blc blc = a_(☃);
/* 1703 */     int i = (ayi1 == ayi.a) ? 0 : blc.e();
/* 1704 */     int j = blc.b(this, ☃);
/* 1705 */     if (j >= 15 && blc.e() > 0) {
/* 1706 */       j = 1;
/*      */     }
/* 1708 */     if (j < 1) {
/* 1709 */       j = 1;
/*      */     }
/* 1711 */     if (j >= 15) {
/* 1712 */       return 0;
/*      */     }
/*      */     
/* 1715 */     if (i >= 14) {
/* 1716 */       return i;
/*      */     }
/*      */     
/* 1719 */     try (el.b ☃ = el.b.r()) {
/* 1720 */       for (eq eq1 : a) {
/* 1721 */         b.j(☃).d(eq1);
/* 1722 */         int k = a(ayi1, b) - j;
/*      */         
/* 1724 */         if (k > i) {
/* 1725 */           i = k;
/*      */         }
/* 1727 */         if (i >= 14) {
/* 1728 */           return i;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1733 */     return i; }
/*      */ 
/*      */   
/*      */   public boolean c(ayi ☃, el el1) {
/* 1737 */     if (!a(el1, 17, false)) {
/* 1738 */       return false;
/*      */     }
/*      */     
/* 1741 */     int i = 0;
/* 1742 */     int j = 0;
/*      */     
/* 1744 */     this.A.a("getBrightness");
/* 1745 */     int k = a(☃, el1);
/* 1746 */     int m = a(el1, ☃);
/* 1747 */     int n = el1.o();
/* 1748 */     int i1 = el1.p();
/* 1749 */     int i2 = el1.q();
/*      */     
/* 1751 */     if (m > k) {
/* 1752 */       this.E[j++] = 133152;
/* 1753 */     } else if (m < k) {
/* 1754 */       this.E[j++] = 0x20820 | k << 18;
/*      */ 
/*      */       
/* 1757 */       while (i < j) {
/* 1758 */         int i3 = this.E[i++];
/* 1759 */         int i4 = (i3 & 0x3F) - 32 + n;
/* 1760 */         int i5 = (i3 >> 6 & 0x3F) - 32 + i1;
/* 1761 */         int i6 = (i3 >> 12 & 0x3F) - 32 + i2;
/* 1762 */         int i7 = i3 >> 18 & 0xF;
/* 1763 */         el el2 = new el(i4, i5, i6);
/* 1764 */         int i8 = a(☃, el2);
/*      */         
/* 1766 */         if (i8 == i7) {
/* 1767 */           a(☃, el2, 0);
/*      */           
/* 1769 */           if (i7 > 0) {
/* 1770 */             int i9 = xq.a(i4 - n);
/* 1771 */             int i10 = xq.a(i5 - i1);
/* 1772 */             int i11 = xq.a(i6 - i2);
/*      */             
/* 1774 */             if (i9 + i10 + i11 < 17) {
/* 1775 */               try (el.b ☃ = el.b.r()) {
/* 1776 */                 for (eq eq1 : a) {
/* 1777 */                   int i12 = i4 + eq1.g();
/* 1778 */                   int i13 = i5 + eq1.h();
/* 1779 */                   int i14 = i6 + eq1.i();
/* 1780 */                   b.f(i12, i13, i14);
/* 1781 */                   int i15 = Math.max(1, a_(b).b(this, b));
/*      */                   
/* 1783 */                   i8 = a(☃, b);
/*      */                   
/* 1785 */                   if (i8 == i7 - i15 && j < this.E.length) {
/* 1786 */                     this.E[j++] = i12 - n + 32 | i13 - i1 + 32 << 6 | i14 - i2 + 32 << 12 | i7 - i15 << 18;
/*      */                   }
/*      */                 } 
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/* 1794 */       i = 0;
/*      */     } 
/* 1796 */     this.A.e();
/*      */     
/* 1798 */     this.A.a("checkedPosition < toCheckCount");
/* 1799 */     while (i < j) {
/* 1800 */       int i3 = this.E[i++];
/* 1801 */       int i4 = (i3 & 0x3F) - 32 + n;
/* 1802 */       int i5 = (i3 >> 6 & 0x3F) - 32 + i1;
/* 1803 */       int i6 = (i3 >> 12 & 0x3F) - 32 + i2;
/* 1804 */       el el2 = new el(i4, i5, i6);
/*      */       
/* 1806 */       int i7 = a(☃, el2);
/* 1807 */       int i8 = a(el2, ☃);
/*      */       
/* 1809 */       if (i8 != i7) {
/* 1810 */         a(☃, el2, i8);
/*      */         
/* 1812 */         if (i8 > i7) {
/* 1813 */           int i9 = Math.abs(i4 - n);
/* 1814 */           int i10 = Math.abs(i5 - i1);
/* 1815 */           int i11 = Math.abs(i6 - i2);
/* 1816 */           boolean bool = (j < this.E.length - 6);
/*      */           
/* 1818 */           if (i9 + i10 + i11 < 17 && bool) {
/* 1819 */             if (a(☃, el2.e()) < i8) {
/* 1820 */               this.E[j++] = i4 - 1 - n + 32 + (i5 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 1822 */             if (a(☃, el2.f()) < i8) {
/* 1823 */               this.E[j++] = i4 + 1 - n + 32 + (i5 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 1825 */             if (a(☃, el2.b()) < i8) {
/* 1826 */               this.E[j++] = i4 - n + 32 + (i5 - 1 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 1828 */             if (a(☃, el2.a()) < i8) {
/* 1829 */               this.E[j++] = i4 - n + 32 + (i5 + 1 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 1831 */             if (a(☃, el2.c()) < i8) {
/* 1832 */               this.E[j++] = i4 - n + 32 + (i5 - i1 + 32 << 6) + (i6 - 1 - i2 + 32 << 12);
/*      */             }
/* 1834 */             if (a(☃, el2.d()) < i8) {
/* 1835 */               this.E[j++] = i4 - n + 32 + (i5 - i1 + 32 << 6) + (i6 + 1 - i2 + 32 << 12);
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1841 */     this.A.e();
/*      */     
/* 1843 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public Stream<cew> a(@Nullable aer ☃, cew cew1, cew cew2, Set<aer> set) {
/* 1848 */     Stream<cew> stream = super.a(☃, cew1, cew2, set);
/* 1849 */     if (☃ == null) {
/* 1850 */       return stream;
/*      */     }
/* 1852 */     return Stream.concat(stream, a(☃, cew1, set));
/*      */   }
/*      */ 
/*      */   
/*      */   public List<aer> a(@Nullable aer ☃, cea cea1, @Nullable Predicate<? super aer> predicate) {
/* 1857 */     List<aer> list = Lists.newArrayList();
/* 1858 */     int i = xq.c((cea1.a - 2.0D) / 16.0D);
/* 1859 */     int j = xq.c((cea1.d + 2.0D) / 16.0D);
/* 1860 */     int k = xq.c((cea1.c - 2.0D) / 16.0D);
/* 1861 */     int m = xq.c((cea1.f + 2.0D) / 16.0D);
/* 1862 */     for (int n = i; n <= j; n++) {
/* 1863 */       for (int i1 = k; i1 <= m; i1++) {
/* 1864 */         if (a(n, i1, true)) {
/* 1865 */           c(n, i1).a(☃, cea1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/* 1869 */     return list;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends aer> List<T> a(Class<? extends T> ☃, Predicate<? super T> predicate) {
/* 1875 */     List<T> list = Lists.newArrayList();
/* 1876 */     for (aer aer : this.f) {
/* 1877 */       if (☃.isAssignableFrom(aer.getClass()) && predicate.test((T)aer)) {
/* 1878 */         list.add((T)aer);
/*      */       }
/*      */     } 
/* 1881 */     return list;
/*      */   }
/*      */ 
/*      */   
/*      */   public <T extends aer> List<T> b(Class<? extends T> ☃, Predicate<? super T> predicate) {
/* 1886 */     List<T> list = Lists.newArrayList();
/* 1887 */     for (aer aer : this.j) {
/* 1888 */       if (☃.isAssignableFrom(aer.getClass()) && predicate.test((T)aer)) {
/* 1889 */         list.add((T)aer);
/*      */       }
/*      */     } 
/* 1892 */     return list;
/*      */   }
/*      */   
/*      */   public <T extends aer> List<T> a(Class<? extends T> ☃, cea cea1) {
/* 1896 */     return a(☃, cea1, (Predicate)aeu.f);
/*      */   }
/*      */   
/*      */   public <T extends aer> List<T> a(Class<? extends T> ☃, cea cea1, @Nullable Predicate<? super T> predicate) {
/* 1900 */     int i = xq.c((cea1.a - 2.0D) / 16.0D);
/* 1901 */     int j = xq.f((cea1.d + 2.0D) / 16.0D);
/* 1902 */     int k = xq.c((cea1.c - 2.0D) / 16.0D);
/* 1903 */     int m = xq.f((cea1.f + 2.0D) / 16.0D);
/* 1904 */     List<T> list = Lists.newArrayList();
/*      */     
/* 1906 */     for (int n = i; n < j; n++) {
/* 1907 */       for (int i1 = k; i1 < m; i1++) {
/* 1908 */         if (a(n, i1, true)) {
/* 1909 */           c(n, i1).a(☃, cea1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1914 */     return list;
/*      */   }
/*      */   @Nullable
/*      */   public <T extends aer> T a(Class<? extends T> ☃, cea cea1, T t) {
/*      */     aer aer;
/* 1919 */     List<T> list = a(☃, cea1);
/* 1920 */     T t1 = null;
/* 1921 */     double d = Double.MAX_VALUE;
/* 1922 */     for (int i = 0; i < list.size(); i++) {
/* 1923 */       aer aer1 = (aer)list.get(i);
/* 1924 */       if (aer1 != t)
/*      */       {
/*      */         
/* 1927 */         if (aeu.f.test(aer1)) {
/*      */ 
/*      */           
/* 1930 */           double d1 = t.h(aer1);
/* 1931 */           if (d1 <= d)
/*      */           
/*      */           { 
/* 1934 */             aer = aer1;
/* 1935 */             d = d1; } 
/*      */         }  } 
/* 1937 */     }  return (T)aer;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aer a(int ☃) {
/* 1942 */     return this.l.a(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(el ☃, bji bji1) {
/* 1950 */     if (D(☃)) {
/* 1951 */       l(☃).r();
/*      */     }
/*      */   }
/*      */   
/*      */   public int a(Class<?> ☃, int i) {
/* 1956 */     int j = 0;
/* 1957 */     for (aer aer : this.f) {
/* 1958 */       if (aer instanceof afb && ((afb)aer).dk()) {
/*      */         continue;
/*      */       }
/* 1961 */       if (☃.isAssignableFrom(aer.getClass())) {
/* 1962 */         j++;
/*      */       }
/* 1964 */       if (j > i) {
/* 1965 */         return j;
/*      */       }
/*      */     } 
/* 1968 */     return j;
/*      */   }
/*      */   
/*      */   public void a(Stream<aer> ☃) {
/* 1972 */     ☃.forEach(☃ -> {
/*      */           this.f.add(☃);
/*      */           b(☃);
/*      */         });
/*      */   }
/*      */   
/*      */   public void b(Collection<aer> ☃) {
/* 1979 */     this.g.addAll(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int k() {
/* 1984 */     return this.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public axy f() {
/* 1989 */     return this;
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/* 1993 */     this.b = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(el ☃, eq eq1) {
/* 1998 */     return a_(☃).b(this, ☃, eq1);
/*      */   }
/*      */ 
/*      */   
/*      */   public ayg S() {
/* 2003 */     return this.y.t();
/*      */   }
/*      */   
/*      */   public int s(el ☃) {
/* 2007 */     int i = 0;
/* 2008 */     i = Math.max(i, a(☃.b(), eq.a));
/* 2009 */     if (i >= 15) {
/* 2010 */       return i;
/*      */     }
/* 2012 */     i = Math.max(i, a(☃.a(), eq.b));
/* 2013 */     if (i >= 15) {
/* 2014 */       return i;
/*      */     }
/* 2016 */     i = Math.max(i, a(☃.c(), eq.c));
/* 2017 */     if (i >= 15) {
/* 2018 */       return i;
/*      */     }
/* 2020 */     i = Math.max(i, a(☃.d(), eq.d));
/* 2021 */     if (i >= 15) {
/* 2022 */       return i;
/*      */     }
/* 2024 */     i = Math.max(i, a(☃.e(), eq.e));
/* 2025 */     if (i >= 15) {
/* 2026 */       return i;
/*      */     }
/* 2028 */     i = Math.max(i, a(☃.f(), eq.f));
/* 2029 */     if (i >= 15) {
/* 2030 */       return i;
/*      */     }
/* 2032 */     return i;
/*      */   }
/*      */   
/*      */   public boolean b(el ☃, eq eq1) {
/* 2036 */     return (c(☃, eq1) > 0);
/*      */   }
/*      */   
/*      */   public int c(el ☃, eq eq1) {
/* 2040 */     blc blc = a_(☃);
/*      */     
/* 2042 */     if (blc.l()) {
/* 2043 */       return s(☃);
/*      */     }
/* 2045 */     return blc.a(this, ☃, eq1);
/*      */   }
/*      */   
/*      */   public boolean t(el ☃) {
/* 2049 */     if (c(☃.b(), eq.a) > 0) {
/* 2050 */       return true;
/*      */     }
/* 2052 */     if (c(☃.a(), eq.b) > 0) {
/* 2053 */       return true;
/*      */     }
/* 2055 */     if (c(☃.c(), eq.c) > 0) {
/* 2056 */       return true;
/*      */     }
/* 2058 */     if (c(☃.d(), eq.d) > 0) {
/* 2059 */       return true;
/*      */     }
/* 2061 */     if (c(☃.e(), eq.e) > 0) {
/* 2062 */       return true;
/*      */     }
/* 2064 */     if (c(☃.f(), eq.f) > 0) {
/* 2065 */       return true;
/*      */     }
/* 2067 */     return false;
/*      */   }
/*      */   
/*      */   public int u(el ☃) {
/* 2071 */     int i = 0;
/*      */     
/* 2073 */     for (eq eq1 : a) {
/* 2074 */       int j = c(☃.a(eq1), eq1);
/*      */       
/* 2076 */       if (j >= 15) {
/* 2077 */         return 15;
/*      */       }
/* 2079 */       if (j > i) {
/* 2080 */         i = j;
/*      */       }
/*      */     } 
/*      */     
/* 2084 */     return i;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aog a(double ☃, double d1, double d2, double d3, Predicate<aer> predicate) {
/* 2090 */     double d = -1.0D;
/* 2091 */     aog aog = null;
/*      */     
/* 2093 */     for (int i = 0; i < this.j.size(); i++) {
/* 2094 */       aog aog1 = this.j.get(i);
/* 2095 */       if (predicate.test(aog1)) {
/*      */ 
/*      */ 
/*      */         
/* 2099 */         double d4 = aog1.d(☃, d1, d2);
/* 2100 */         if ((d3 < 0.0D || d4 < d3 * d3) && (d == -1.0D || d4 < d)) {
/* 2101 */           d = d4;
/* 2102 */           aog = aog1;
/*      */         } 
/*      */       } 
/* 2105 */     }  return aog;
/*      */   }
/*      */   
/*      */   public boolean a(double ☃, double d1, double d2, double d3) {
/* 2109 */     for (int i = 0; i < this.j.size(); i++) {
/* 2110 */       aog aog = this.j.get(i);
/* 2111 */       if (aeu.f.test(aog)) {
/*      */ 
/*      */         
/* 2114 */         double d = aog.d(☃, d1, d2);
/* 2115 */         if (d3 < 0.0D || d < d3 * d3)
/* 2116 */           return true; 
/*      */       } 
/*      */     } 
/* 2119 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(double ☃, double d1, double d2, double d3) {
/* 2123 */     for (aog aog : this.j) {
/* 2124 */       if (!aeu.f.test(aog) || !aeu.b.test(aog)) {
/*      */         continue;
/*      */       }
/* 2127 */       double d = aog.d(☃, d1, d2);
/* 2128 */       if (d3 < 0.0D || d < d3 * d3) {
/* 2129 */         return true;
/*      */       }
/*      */     } 
/* 2132 */     return false;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aog a(double ☃, double d1, double d2) {
/* 2137 */     double d = -1.0D;
/* 2138 */     aog aog = null;
/* 2139 */     for (int i = 0; i < this.j.size(); i++) {
/* 2140 */       aog aog1 = this.j.get(i);
/* 2141 */       if (aeu.f.test(aog1)) {
/*      */ 
/*      */         
/* 2144 */         double d3 = aog1.d(☃, aog1.r, d1);
/* 2145 */         if ((d2 < 0.0D || d3 < d2 * d2) && (d == -1.0D || d3 < d)) {
/* 2146 */           d = d3;
/* 2147 */           aog = aog1;
/*      */         } 
/*      */       } 
/* 2150 */     }  return aog;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aog a(aer ☃, double d1, double d2) {
/* 2155 */     return a(☃.q, ☃.r, ☃.s, d1, d2, (Function<aog, Double>)null, (Predicate<aog>)null);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aog a(el ☃, double d1, double d2) {
/* 2160 */     return a((☃.o() + 0.5F), (☃.p() + 0.5F), (☃.q() + 0.5F), d1, d2, (Function<aog, Double>)null, (Predicate<aog>)null);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aog a(double ☃, double d1, double d2, double d3, double d4, @Nullable Function<aog, Double> function, @Nullable Predicate<aog> predicate) {
/* 2165 */     double d = -1.0D;
/* 2166 */     aog aog = null;
/* 2167 */     for (int i = 0; i < this.j.size(); i++) {
/* 2168 */       aog aog1 = this.j.get(i);
/* 2169 */       if (!aog1.bV.a && aog1.aF() && !aog1.t() && (predicate == null || predicate.test(aog1))) {
/*      */ 
/*      */         
/* 2172 */         double d5 = aog1.d(☃, aog1.r, d2);
/* 2173 */         double d6 = d3;
/*      */         
/* 2175 */         if (aog1.aZ()) {
/* 2176 */           d6 *= 0.800000011920929D;
/*      */         }
/* 2178 */         if (aog1.bd()) {
/* 2179 */           float f = aog1.dk();
/* 2180 */           if (f < 0.1F) {
/* 2181 */             f = 0.1F;
/*      */           }
/* 2183 */           d6 *= (0.7F * f);
/*      */         } 
/* 2185 */         if (function != null) {
/* 2186 */           d6 *= ((Double)MoreObjects.firstNonNull(function.apply(aog1), Double.valueOf(1.0D))).doubleValue();
/*      */         }
/* 2188 */         if ((d4 < 0.0D || Math.abs(aog1.r - d1) < d4 * d4) && (d3 < 0.0D || d5 < d6 * d6) && (d == -1.0D || d5 < d)) {
/* 2189 */           d = d5;
/* 2190 */           aog = aog1;
/*      */         } 
/*      */       } 
/* 2193 */     }  return aog;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aog a(String ☃) {
/* 2198 */     for (int i = 0; i < this.j.size(); i++) {
/* 2199 */       aog aog = this.j.get(i);
/* 2200 */       if (☃.equals(aog.N_().getString())) {
/* 2201 */         return aog;
/*      */       }
/*      */     } 
/* 2204 */     return null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aog b(UUID ☃) {
/* 2209 */     for (int i = 0; i < this.j.size(); i++) {
/* 2210 */       aog aog = this.j.get(i);
/* 2211 */       if (☃.equals(aog.bt())) {
/* 2212 */         return aog;
/*      */       }
/*      */     } 
/* 2215 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void U() throws aya {
/* 2222 */     this.x.c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long r_() {
/* 2231 */     return this.y.a();
/*      */   }
/*      */   
/*      */   public long V() {
/* 2235 */     return this.y.e();
/*      */   }
/*      */   
/*      */   public long W() {
/* 2239 */     return this.y.f();
/*      */   }
/*      */   
/*      */   public void b(long ☃) {
/* 2243 */     this.y.b(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public el n() {
/* 2248 */     el ☃ = new el(this.y.b(), this.y.c(), this.y.d());
/* 2249 */     if (!d().a(☃)) {
/* 2250 */       ☃ = a(bor.a.d, new el(d().f(), 0.0D, d().g()));
/*      */     }
/* 2252 */     return ☃;
/*      */   }
/*      */   
/*      */   public void v(el ☃) {
/* 2256 */     this.y.a(☃);
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
/*      */   public boolean a(aog ☃, el el1) {
/* 2276 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃, byte b) {}
/*      */ 
/*      */   
/*      */   public bnc H() {
/* 2284 */     return this.w;
/*      */   }
/*      */   
/*      */   public void a(el ☃, bcs bcs1, int i, int j) {
/* 2288 */     a_(☃).a(this, ☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ccc s_() {
/* 2293 */     return this.x;
/*      */   }
/*      */ 
/*      */   
/*      */   public ccb g() {
/* 2298 */     return this.y;
/*      */   }
/*      */   
/*      */   public axu X() {
/* 2302 */     return this.y.w();
/*      */   }
/*      */ 
/*      */   
/*      */   public void k_() {}
/*      */   
/*      */   public float g(float ☃) {
/* 2309 */     return (this.q + (this.r - this.q) * ☃) * i(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float i(float ☃) {
/* 2318 */     return this.o + (this.p - this.o) * ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean Y() {
/* 2327 */     if (!this.t.g() || this.t.h()) {
/* 2328 */       return false;
/*      */     }
/* 2330 */     return (g(1.0F) > 0.9D);
/*      */   }
/*      */   
/*      */   public boolean Z() {
/* 2334 */     return (i(1.0F) > 0.2D);
/*      */   }
/*      */   
/*      */   public boolean w(el ☃) {
/* 2338 */     if (!Z()) {
/* 2339 */       return false;
/*      */     }
/* 2341 */     if (!e(☃)) {
/* 2342 */       return false;
/*      */     }
/* 2344 */     if (a(bor.a.d, ☃).p() > ☃.p()) {
/* 2345 */       return false;
/*      */     }
/*      */     
/* 2348 */     return (d(☃).c() == ayu.d.b);
/*      */   }
/*      */   
/*      */   public boolean x(el ☃) {
/* 2352 */     ayu ayu = d(☃);
/* 2353 */     return ayu.d();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public cck h() {
/* 2359 */     return this.I;
/*      */   }
/*      */   
/*      */   public void a(int ☃, el el1, int i) {
/* 2363 */     for (int j = 0; j < this.v.size(); j++) {
/* 2364 */       ((ayb)this.v.get(j)).a(☃, el1, i);
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(int ☃, el el1, int i) {
/* 2369 */     a((aog)null, ☃, el1, i);
/*      */   }
/*      */   
/*      */   public void a(@Nullable aog ☃, int i, el el1, int j) {
/*      */     try {
/* 2374 */       for (int k = 0; k < this.v.size(); k++) {
/* 2375 */         ((ayb)this.v.get(k)).a(☃, i, el1, j);
/*      */       }
/* 2377 */     } catch (Throwable throwable) {
/* 2378 */       b b = b.a(throwable, "Playing level event");
/* 2379 */       c c = b.a("Level event being played");
/*      */       
/* 2381 */       c.a("Block coordinates", c.a(el1));
/* 2382 */       c.a("Event source", ☃);
/* 2383 */       c.a("Event type", Integer.valueOf(i));
/* 2384 */       c.a("Event data", Integer.valueOf(j));
/*      */       
/* 2386 */       throw new h(b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int aa() {
/* 2392 */     return 256;
/*      */   }
/*      */   
/*      */   public int ab() {
/* 2396 */     return this.t.h() ? 128 : 256;
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
/*      */   public c a(b ☃) {
/* 2412 */     c c = ☃.a("Affected level", 1);
/*      */     
/* 2414 */     c.a("Level name", (this.y == null) ? "????" : this.y.j());
/* 2415 */     c.a("All players", () -> this.j.size() + " total; " + this.j);
/* 2416 */     c.a("Chunk stats", () -> this.w.e());
/*      */     
/*      */     try {
/* 2419 */       this.y.a(c);
/* 2420 */     } catch (Throwable throwable) {
/* 2421 */       c.a("Level Data Unobtainable", throwable);
/*      */     } 
/*      */     
/* 2424 */     return c;
/*      */   }
/*      */   
/*      */   public void c(int ☃, el el1, int i) {
/* 2428 */     for (int j = 0; j < this.v.size(); j++) {
/* 2429 */       ayb ayb = this.v.get(j);
/* 2430 */       ayb.b(☃, el1, i);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(el ☃, bcs bcs1) {
/* 2440 */     for (eq eq1 : eq.c.a) {
/* 2441 */       el el1 = ☃.a(eq1);
/*      */       
/* 2443 */       if (D(el1)) {
/* 2444 */         blc blc = a_(el1);
/* 2445 */         if (blc.c() == bct.ft) {
/* 2446 */           blc.a(this, el1, bcs1, ☃); continue;
/* 2447 */         }  if (blc.l()) {
/* 2448 */           el1 = el1.a(eq1);
/* 2449 */           blc = a_(el1);
/*      */           
/* 2451 */           if (blc.c() == bct.ft) {
/* 2452 */             blc.a(this, el1, bcs1, ☃);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public adj h(el ☃) {
/* 2461 */     long l = 0L;
/* 2462 */     float f = 0.0F;
/* 2463 */     if (D(☃)) {
/* 2464 */       f = ah();
/* 2465 */       l = l(☃).m();
/*      */     } 
/*      */     
/* 2468 */     return new adj(aj(), W(), l, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public int c() {
/* 2473 */     return this.G;
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/* 2477 */     this.G = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(int ☃) {
/* 2485 */     this.H = ☃;
/*      */   }
/*      */   
/*      */   public aji af() {
/* 2489 */     return this.z;
/*      */   }
/*      */ 
/*      */   
/*      */   public bmv d() {
/* 2494 */     return this.K;
/*      */   }
/*      */   
/*      */   public boolean e(int ☃, int i) {
/* 2498 */     el el = n();
/* 2499 */     int j = ☃ * 16 + 8 - el.o();
/* 2500 */     int k = i * 16 + 8 - el.q();
/* 2501 */     int m = 128;
/* 2502 */     return (j >= -128 && j <= 128 && k >= -128 && k <= 128);
/*      */   }
/*      */   
/*      */   public LongSet ag() {
/* 2506 */     axt ☃ = a(this.t.q(), axt::new, "chunks");
/* 2507 */     return (☃ != null) ? LongSets.unmodifiable(☃.a()) : (LongSet)LongSets.EMPTY_SET;
/*      */   }
/*      */   
/*      */   public boolean f(int ☃, int i) {
/* 2511 */     axt axt = a(this.t.q(), axt::new, "chunks");
/* 2512 */     return (axt != null && axt.a().contains(axm.a(☃, i)));
/*      */   }
/*      */   public boolean b(int ☃, int i, boolean bool) {
/*      */     boolean bool1;
/* 2516 */     String str = "chunks";
/* 2517 */     axt axt = a(this.t.q(), axt::new, "chunks");
/* 2518 */     if (axt == null) {
/* 2519 */       axt = new axt("chunks");
/* 2520 */       a(this.t.q(), "chunks", axt);
/*      */     } 
/*      */     
/* 2523 */     long l = axm.a(☃, i);
/*      */     
/* 2525 */     if (bool) {
/* 2526 */       bool1 = axt.a().add(l);
/* 2527 */       if (bool1) {
/* 2528 */         c(☃, i);
/*      */       }
/*      */     } else {
/* 2531 */       bool1 = axt.a().remove(l);
/*      */     } 
/* 2533 */     axt.a(bool1);
/* 2534 */     return bool1;
/*      */   }
/*      */   
/*      */   public void a(iv<?> ☃) {
/* 2538 */     throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public el a(String ☃, el el1, int i, boolean bool) {
/* 2543 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public boc o() {
/* 2548 */     return this.t;
/*      */   }
/*      */ 
/*      */   
/*      */   public Random m() {
/* 2553 */     return this.s;
/*      */   }
/*      */   
/*      */   protected abstract bnc r();
/*      */   
/*      */   public abstract cfc G();
/*      */   
/*      */   public abstract avl E();
/*      */   
/*      */   public abstract xb F();
/*      */ }


/* Location:              F:\dw\server.jar!\axy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */