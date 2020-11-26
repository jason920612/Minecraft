/*      */ import com.google.common.collect.UnmodifiableIterator;
/*      */ import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
/*      */ import java.util.List;
/*      */ import java.util.Objects;
/*      */ import java.util.Random;
/*      */ import java.util.stream.Stream;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class bcs
/*      */   implements axx
/*      */ {
/*   87 */   protected static final Logger d = LogManager.getLogger();
/*      */   
/*   89 */   public static final eu<blc> e = new eu<>();
/*      */   
/*   91 */   private static final eq[] a = new eq[] { eq.e, eq.f, eq.c, eq.d, eq.a, eq.b };
/*      */   
/*      */   protected final int f;
/*      */   protected final float g;
/*      */   protected final float h;
/*      */   protected final boolean i;
/*      */   protected final bhr j;
/*      */   protected final bza k;
/*      */   protected final bzb l;
/*      */   private final float b;
/*      */   protected final ble<bcs, blc> m;
/*      */   private blc c;
/*      */   protected final boolean n;
/*      */   private final boolean o;
/*      */   @Nullable
/*      */   private String p;
/*      */   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<a>> q;
/*      */   
/*      */   public static int l(@Nullable blc ☃) {
/*  110 */     if (☃ == null) {
/*  111 */       return 0;
/*      */     }
/*  113 */     int i = e.a(☃);
/*  114 */     return (i == -1) ? 0 : i;
/*      */   }
/*      */   
/*      */   public static blc a(int ☃) {
/*  118 */     blc blc1 = e.a(☃);
/*  119 */     return (blc1 == null) ? bct.a.p() : blc1;
/*      */   }
/*      */   
/*      */   public static bcs a(@Nullable ata ☃) {
/*  123 */     if (☃ instanceof arj) {
/*  124 */       return ((arj)☃).d();
/*      */     }
/*      */     
/*  127 */     return bct.a;
/*      */   }
/*      */   
/*      */   public static blc a(blc ☃, blc blc1, axy axy1, el el1) {
/*  131 */     cew cew = cet.b(☃.h(axy1, el1), blc1.h(axy1, el1), cei.ONLY_SECOND).a(el1.o(), el1.p(), el1.q());
/*  132 */     List<aer> list = axy1.a((aer)null, cew.a());
/*  133 */     for (aer aer : list) {
/*      */       
/*  135 */       double d = cet.a(eq.a.b, aer.bD().d(0.0D, 1.0D, 0.0D), Stream.of(cew), -1.0D);
/*  136 */       aer.a(aer.q, aer.r + 1.0D + d, aer.s);
/*      */     } 
/*  138 */     return blc1;
/*      */   }
/*      */   
/*      */   public static cew a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  142 */     return cet.a(☃ / 16.0D, d1 / 16.0D, d2 / 16.0D, d3 / 16.0D, d4 / 16.0D, d5 / 16.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(blc ☃, aer aer1) {
/*  148 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean e(blc ☃) {
/*  154 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int m(blc ☃) {
/*  160 */     return this.f;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public bza n(blc ☃) {
/*  166 */     return this.k;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public bzb c(blc ☃, axk axk1, el el1) {
/*  172 */     return this.l;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axz axz1, el el1, int i) {
/*  178 */     try (el.b ☃ = el.b.r()) {
/*  179 */       for (eq eq1 : a) {
/*  180 */         b.j(el1).d(eq1);
/*  181 */         blc blc1 = axz1.a_(b);
/*  182 */         blc blc2 = blc1.a(eq1.d(), ☃, axz1, b, el1);
/*  183 */         a(blc1, blc2, axz1, b, i);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(wz<bcs> ☃) {
/*  189 */     return ☃.a(this);
/*      */   }
/*      */   
/*      */   public static blc b(blc ☃, axz axz1, el el1) {
/*  193 */     blc blc1 = ☃;
/*      */     
/*  195 */     el.a a = new el.a();
/*  196 */     for (eq eq1 : a) {
/*  197 */       a.g(el1).c(eq1);
/*  198 */       blc1 = blc1.a(eq1, axz1.a_(a), axz1, el1, a);
/*      */     } 
/*      */     
/*  201 */     return blc1;
/*      */   }
/*      */   
/*      */   public static void a(blc ☃, blc blc1, axz axz1, el el1, int i) {
/*  205 */     if (blc1 != ☃) {
/*  206 */       if (blc1.f()) {
/*  207 */         if (!axz1.e()) {
/*  208 */           axz1.a(el1, ((i & 0x20) == 0));
/*      */         }
/*      */       } else {
/*  211 */         axz1.a(el1, blc1, i & 0xFFFFFFDF);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void b(blc ☃, axz axz1, el el1, int i) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  228 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public blc a(blc ☃, bhb bhb1) {
/*  234 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public blc a(blc ☃, bfz bfz1) {
/*  240 */     return ☃;
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
/*      */   public bcs(c ☃) {
/*  264 */     ble.a<bcs, blc> a = new ble.a<>(this);
/*  265 */     a(a);
/*  266 */     this.m = a.a(bld::new);
/*  267 */     v(this.m.b());
/*      */     
/*  269 */     this.k = c.a(☃);
/*  270 */     this.l = c.b(☃);
/*  271 */     this.n = c.c(☃);
/*  272 */     this.j = c.d(☃);
/*  273 */     this.f = c.e(☃);
/*  274 */     this.h = c.f(☃);
/*  275 */     this.g = c.g(☃);
/*  276 */     this.i = c.h(☃);
/*  277 */     this.b = c.i(☃);
/*  278 */     this.o = c.j(☃);
/*      */   }
/*      */   
/*      */   protected static boolean a(bcs ☃) {
/*  282 */     return (☃ instanceof bhi || ☃ instanceof bfr || ☃
/*      */       
/*  284 */       .a(wv.B) || ☃ instanceof bhv || ☃ == bct.eu || ☃ == bct.ed || ☃ == bct.ap || ☃ == bct.dg || ☃ == bct.cR || ☃ == bct.hm || ☃ == bct.ko);
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
/*      */   public static boolean b(bcs ☃) {
/*  297 */     return (a(☃) || ☃ == bct.aW || ☃ == bct.aP || ☃ == bct.aX);
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
/*      */   @Deprecated
/*      */   public boolean o(blc ☃) {
/*  310 */     return (☃.d().c() && ☃.g());
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean p(blc ☃) {
/*  316 */     return (☃.d().f() && ☃.g() && !☃.m());
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean q(blc ☃) {
/*  322 */     return (this.k.c() && ☃.g());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(blc ☃) {
/*  329 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean r(blc ☃) {
/*  335 */     return (☃.d().f() && ☃.g());
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
/*      */   @Deprecated
/*      */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/*  348 */     switch (null.a[cbf1.ordinal()]) {
/*      */       case 1:
/*  350 */         return !a(f(☃, axk1, el1));
/*      */       case 2:
/*  352 */         return axk1.b(el1).a(ww.a);
/*      */       case 3:
/*  354 */         return !a(f(☃, axk1, el1));
/*      */     } 
/*  356 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public bgy c(blc ☃) {
/*  363 */     return bgy.c;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(blc ☃, ark ark1) {
/*  369 */     return (this.k.e() && ark1.i().b() != h());
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public float d(blc ☃, axk axk1, el el1) {
/*  375 */     return this.g;
/*      */   }
/*      */   
/*      */   public boolean s(blc ☃) {
/*  379 */     return this.i;
/*      */   }
/*      */   
/*      */   public boolean i() {
/*  383 */     return this instanceof ben;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean e(blc ☃, axk axk1, el el1) {
/*  389 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class a
/*      */   {
/*      */     private final blc a;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final blc b;
/*      */ 
/*      */ 
/*      */     
/*      */     private final eq c;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public a(blc ☃, blc blc1, eq eq1) {
/*  413 */       this.a = ☃;
/*  414 */       this.b = blc1;
/*  415 */       this.c = eq1;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object ☃) {
/*  420 */       if (this == ☃) {
/*  421 */         return true;
/*      */       }
/*  423 */       if (!(☃ instanceof a)) {
/*  424 */         return false;
/*      */       }
/*      */       
/*  427 */       a a1 = (a)☃;
/*      */       
/*  429 */       return (this.a == a1.a && this.b == a1.b && this.c == a1.c);
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/*  434 */       return Objects.hash(new Object[] { this.a, this.b, this.c });
/*      */     }
/*      */   }
/*      */   
/*      */   static {
/*  439 */     q = ThreadLocal.withInitial(() -> {
/*      */           Object2ByteLinkedOpenHashMap<a> ☃ = new Object2ByteLinkedOpenHashMap<a>(200)
/*      */             {
/*      */               protected void rehash(int ☃) {}
/*      */             };
/*      */           ☃.defaultReturnValue(127);
/*      */           return ☃;
/*      */         });
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
/*      */   @Deprecated
/*      */   public boolean f(blc ☃) {
/*  482 */     return (this.n && ☃.c().c() == axl.a);
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
/*      */   @Deprecated
/*      */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  495 */     return blb.a;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cew a(blc ☃, axk axk1, el el1) {
/*  501 */     return cet.b();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cew f(blc ☃, axk axk1, el el1) {
/*  507 */     return this.n ? ☃.g(axk1, el1) : cet.a();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cew g(blc ☃, axk axk1, el el1) {
/*  513 */     return ☃.g(axk1, el1);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cew h(blc ☃, axk axk1, el el1) {
/*  519 */     return cet.a();
/*      */   }
/*      */   
/*      */   public static boolean a(cew ☃, eq eq1) {
/*  523 */     cew cew1 = ☃.a(eq1);
/*  524 */     return a(cew1);
/*      */   }
/*      */   
/*      */   public static boolean a(cew ☃) {
/*  528 */     return !cet.c(cet.b(), ☃, cei.ONLY_FIRST);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public final boolean i(blc ☃, axk axk1, el el1) {
/*  534 */     boolean bool = ☃.p();
/*  535 */     cew cew = bool ? ☃.i(axk1, el1) : cet.a();
/*  536 */     return a(cew);
/*      */   }
/*      */   
/*      */   public boolean a_(blc ☃, axk axk1, el el1) {
/*  540 */     return (!a(☃.g(axk1, el1)) && ☃.s().e());
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int j(blc ☃, axk axk1, el el1) {
/*  546 */     if (☃.f(axk1, el1)) {
/*  547 */       return axk1.K();
/*      */     }
/*  549 */     return ☃.a(axk1, el1) ? 0 : 1;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public final boolean k(blc ☃, axk axk1, el el1) {
/*  555 */     return (!☃.f(axk1, el1) && ☃.b(axk1, el1) == axk1.K());
/*      */   }
/*      */   
/*      */   public boolean d(blc ☃) {
/*  559 */     return j();
/*      */   }
/*      */   
/*      */   public boolean j() {
/*  563 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void b(blc ☃, axy axy1, el el1, Random random) {
/*  569 */     a(☃, axy1, el1, random);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, Random random) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(axz ☃, el el1, blc blc1) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(ayc ☃) {
/*  604 */     return 10;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, blc blc1) {}
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {}
/*      */ 
/*      */   
/*      */   public int a(blc ☃, Random random) {
/*  618 */     return 1;
/*      */   }
/*      */   
/*      */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  622 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public float a(blc ☃, aog aog1, axk axk1, el el1) {
/*  628 */     float f = ☃.e(axk1, el1);
/*  629 */     if (f == -1.0F) {
/*  630 */       return 0.0F;
/*      */     }
/*  632 */     int i = aog1.c(☃) ? 30 : 100;
/*  633 */     return aog1.b(☃) / f / i;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/*  639 */     if (axy1.B) {
/*      */       return;
/*      */     }
/*  642 */     int j = a(☃, i, axy1, el1, axy1.s);
/*  643 */     for (int k = 0; k < j; k++) {
/*  644 */       if (f >= 1.0F || axy1.s.nextFloat() <= f) {
/*      */ 
/*      */         
/*  647 */         ata ata = a(☃, axy1, el1, i).h();
/*  648 */         if (ata != atf.a)
/*      */         {
/*      */ 
/*      */           
/*  652 */           a(axy1, el1, new ate(ata)); } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   public static void a(axy ☃, el el1, ate ate1) {
/*  657 */     if (☃.B || ate1.a() || !☃.X().b("doTileDrops")) {
/*      */       return;
/*      */     }
/*      */     
/*  661 */     float f = 0.5F;
/*  662 */     double d1 = (☃.s.nextFloat() * 0.5F) + 0.25D;
/*  663 */     double d2 = (☃.s.nextFloat() * 0.5F) + 0.25D;
/*  664 */     double d3 = (☃.s.nextFloat() * 0.5F) + 0.25D;
/*  665 */     amm amm = new amm(☃, el1.o() + d1, el1.p() + d2, el1.q() + d3, ate1);
/*  666 */     amm.n();
/*  667 */     ☃.a(amm);
/*      */   }
/*      */   
/*      */   protected void a(axy ☃, el el1, int i) {
/*  671 */     if (!☃.B && ☃.X().b("doTileDrops")) {
/*  672 */       while (i > 0) {
/*  673 */         int j = aex.a(i);
/*  674 */         i -= j;
/*  675 */         ☃.a(new aex(☃, el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D, j));
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public float k() {
/*  681 */     return this.h;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public static ceb a(blc ☃, axy axy1, el el1, cee cee1, cee cee2) {
/*  686 */     ceb ceb = ☃.g(axy1, el1).a(cee1, cee2, el1);
/*  687 */     if (ceb != null) {
/*  688 */       ceb ceb1 = ☃.j(axy1, el1).a(cee1, cee2, el1);
/*  689 */       if (ceb1 != null && ceb1.c.d(cee1).c() < ceb.c.d(cee1).c()) {
/*  690 */         ceb.b = ceb1.b;
/*      */       }
/*      */     } 
/*  693 */     return ceb;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axy ☃, el el1, axr axr1) {}
/*      */   
/*      */   public axl c() {
/*  700 */     return axl.a;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  706 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  712 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axy ☃, el el1, aer aer1) {}
/*      */   
/*      */   @Nullable
/*      */   public blc a(ark ☃) {
/*  720 */     return p();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, aog aog1) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/*  734 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean i(blc ☃) {
/*  740 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(blc ☃, axy axy1, el el1, aer aer1) {}
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/*  751 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/*  756 */     aog1.b(ws.a.b(this));
/*  757 */     aog1.a(0.005F);
/*      */     
/*  759 */     if (X_() && awg.a(awi.t, ate1) > 0) {
/*  760 */       ate ate2 = t(blc1);
/*  761 */       a(☃, el1, ate2);
/*      */     } else {
/*  763 */       int i = awg.a(awi.v, ate1);
/*  764 */       blc1.a(☃, el1, i);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean X_() {
/*  769 */     return (p().g() && !i());
/*      */   }
/*      */   
/*      */   protected ate t(blc ☃) {
/*  773 */     return new ate(this);
/*      */   }
/*      */   
/*      */   public int a(blc ☃, int i, axy axy1, el el1, Random random) {
/*  777 */     return a(☃, random);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {}
/*      */   
/*      */   public boolean a() {
/*  784 */     return (!this.k.b() && !this.k.a());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String m() {
/*  792 */     if (this.p == null) {
/*  793 */       this.p = k.a("block", fc.g.b(this));
/*      */     }
/*  795 */     return this.p;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(blc ☃, axy axy1, el el1, int i, int j) {
/*  801 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public bzc j(blc ☃) {
/*  807 */     return this.k.h();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(axy ☃, el el1, aer aer1, float f) {
/*  817 */     aer1.c(f, 1.0F);
/*      */   }
/*      */   
/*      */   public void a(axk ☃, aer aer1) {
/*  821 */     aer1.u = 0.0D;
/*      */   }
/*      */   
/*      */   public ate a(axk ☃, el el1, blc blc1) {
/*  825 */     return new ate(this);
/*      */   }
/*      */   
/*      */   public void a(ary ☃, ez<ate> ez1) {
/*  829 */     ez1.add(new ate(this));
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public byw h(blc ☃) {
/*  835 */     return byy.a.i();
/*      */   }
/*      */   
/*      */   public float n() {
/*  839 */     return this.b;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class c
/*      */   {
/*      */     private bza a;
/*      */ 
/*      */     
/*      */     private bzb b;
/*      */     
/*      */     private boolean c = true;
/*      */     
/*  853 */     private bhr d = bhr.d;
/*      */     private int e;
/*      */     private float f;
/*      */     private float g;
/*      */     private boolean h;
/*  858 */     private float i = 0.6F;
/*      */     
/*      */     private boolean j;
/*      */     
/*      */     private c(bza ☃, bzb bzb1) {
/*  863 */       this.a = ☃;
/*  864 */       this.b = bzb1;
/*      */     }
/*      */     
/*      */     public static c a(bza ☃) {
/*  868 */       return a(☃, ☃.i());
/*      */     }
/*      */     
/*      */     public static c a(bza ☃, asc asc1) {
/*  872 */       return a(☃, asc1.e());
/*      */     }
/*      */     
/*      */     public static c a(bza ☃, bzb bzb1) {
/*  876 */       return new c(☃, bzb1);
/*      */     }
/*      */     
/*      */     public static c a(bcs ☃) {
/*  880 */       c c1 = new c(☃.k, ☃.l);
/*      */       
/*  882 */       c1.a = ☃.k;
/*  883 */       c1.g = ☃.g;
/*  884 */       c1.f = ☃.h;
/*  885 */       c1.c = ☃.n;
/*  886 */       c1.h = ☃.i;
/*  887 */       c1.e = ☃.f;
/*  888 */       c1.a = ☃.k;
/*  889 */       c1.b = ☃.l;
/*  890 */       c1.d = ☃.j;
/*  891 */       c1.i = ☃.n();
/*  892 */       c1.j = bcs.e(☃);
/*  893 */       return c1;
/*      */     }
/*      */     
/*      */     public c a() {
/*  897 */       this.c = false;
/*  898 */       return this;
/*      */     }
/*      */     
/*      */     public c a(float ☃) {
/*  902 */       this.i = ☃;
/*  903 */       return this;
/*      */     }
/*      */     
/*      */     protected c a(bhr ☃) {
/*  907 */       this.d = ☃;
/*  908 */       return this;
/*      */     }
/*      */     
/*      */     protected c a(int ☃) {
/*  912 */       this.e = ☃;
/*  913 */       return this;
/*      */     }
/*      */     
/*      */     public c a(float ☃, float f1) {
/*  917 */       this.g = ☃;
/*  918 */       this.f = Math.max(0.0F, f1);
/*  919 */       return this;
/*      */     }
/*      */     
/*      */     protected c b() {
/*  923 */       return b(0.0F);
/*      */     }
/*      */     
/*      */     protected c b(float ☃) {
/*  927 */       a(☃, ☃);
/*  928 */       return this;
/*      */     }
/*      */     
/*      */     protected c c() {
/*  932 */       this.h = true;
/*  933 */       return this;
/*      */     }
/*      */     
/*      */     protected c d() {
/*  937 */       this.j = true;
/*  938 */       return this;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/*  944 */     ☃.a(aog1, 2001, el1, l(blc1));
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(axy ☃, el el1) {}
/*      */   
/*      */   public boolean a(axr ☃) {
/*  951 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean u(blc ☃) {
/*  957 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int a(blc ☃, axy axy1, el el1) {
/*  963 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(ble.a<bcs, blc> ☃) {}
/*      */   
/*      */   public ble<bcs, blc> o() {
/*  970 */     return this.m;
/*      */   }
/*      */   
/*      */   protected final void v(blc ☃) {
/*  974 */     this.c = ☃;
/*      */   }
/*      */   
/*      */   public final blc p() {
/*  978 */     return this.c;
/*      */   }
/*      */   
/*      */   public b q() {
/*  982 */     return b.a;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cee l(blc ☃, axk axk1, el el1) {
/*  988 */     b b = q();
/*  989 */     if (b == b.a) {
/*  990 */       return cee.a;
/*      */     }
/*      */     
/*  993 */     long l = xq.c(el1.o(), 0, el1.q());
/*  994 */     return new cee((((float)(l & 0xFL) / 15.0F) - 0.5D) * 0.5D, (b == b.c) ? ((((float)(l >> 4L & 0xFL) / 15.0F) - 1.0D) * 0.2D) : 0.0D, (((float)(l >> 8L & 0xFL) / 15.0F) - 0.5D) * 0.5D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bhr r() {
/* 1002 */     return this.j;
/*      */   }
/*      */ 
/*      */   
/*      */   public ata h() {
/* 1007 */     return ata.a(this);
/*      */   }
/*      */   
/*      */   public enum b {
/* 1011 */     a,
/* 1012 */     b,
/* 1013 */     c;
/*      */   }
/*      */   
/*      */   public boolean s() {
/* 1017 */     return this.o;
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1022 */     return "Block{" + fc.g.b(this) + "}";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean c(bcs ☃) {
/* 1030 */     return (☃ == bct.b || ☃ == bct.c || ☃ == bct.e || ☃ == bct.g);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean d(bcs ☃) {
/* 1039 */     return (☃ == bct.j || ☃ == bct.k || ☃ == bct.l);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void t() {
/* 1046 */     bcs ☃ = new bcd(c.a(bza.a).a());
/* 1047 */     a(fc.g.b(), ☃);
/* 1048 */     bcs bcs1 = new bib(c.a(bza.D, bzb.m).a(1.5F, 6.0F));
/* 1049 */     a("stone", bcs1);
/* 1050 */     a("granite", new bcs(c.a(bza.D, bzb.l).a(1.5F, 6.0F)));
/* 1051 */     a("polished_granite", new bcs(c.a(bza.D, bzb.l).a(1.5F, 6.0F)));
/* 1052 */     a("diorite", new bcs(c.a(bza.D, bzb.p).a(1.5F, 6.0F)));
/* 1053 */     a("polished_diorite", new bcs(c.a(bza.D, bzb.p).a(1.5F, 6.0F)));
/* 1054 */     a("andesite", new bcs(c.a(bza.D, bzb.m).a(1.5F, 6.0F)));
/* 1055 */     a("polished_andesite", new bcs(c.a(bza.D, bzb.m).a(1.5F, 6.0F)));
/* 1056 */     a("grass_block", new bfc(c.a(bza.s).c().b(0.6F).a(bhr.c)));
/* 1057 */     a("dirt", new bcs(c.a(bza.r, bzb.l).b(0.5F).a(bhr.b)));
/* 1058 */     a("coarse_dirt", new bcs(c.a(bza.r, bzb.l).b(0.5F).a(bhr.b)));
/* 1059 */     a("podzol", new bhp(c.a(bza.r, bzb.J).b(0.5F).a(bhr.b)));
/* 1060 */     bcs bcs2 = new bcs(c.a(bza.D).a(2.0F, 6.0F));
/* 1061 */     a("cobblestone", bcs2);
/* 1062 */     bcs bcs3 = new bcs(c.a(bza.w, bzb.o).a(2.0F, 3.0F).a(bhr.a));
/* 1063 */     bcs bcs4 = new bcs(c.a(bza.w, bzb.J).a(2.0F, 3.0F).a(bhr.a));
/* 1064 */     bcs bcs5 = new bcs(c.a(bza.w, bzb.d).a(2.0F, 3.0F).a(bhr.a));
/* 1065 */     bcs bcs6 = new bcs(c.a(bza.w, bzb.l).a(2.0F, 3.0F).a(bhr.a));
/* 1066 */     bcs bcs7 = new bcs(c.a(bza.w, bzb.q).a(2.0F, 3.0F).a(bhr.a));
/* 1067 */     bcs bcs8 = new bcs(c.a(bza.w, bzb.B).a(2.0F, 3.0F).a(bhr.a));
/* 1068 */     a("oak_planks", bcs3);
/* 1069 */     a("spruce_planks", bcs4);
/* 1070 */     a("birch_planks", bcs5);
/* 1071 */     a("jungle_planks", bcs6);
/* 1072 */     a("acacia_planks", bcs7);
/* 1073 */     a("dark_oak_planks", bcs8);
/* 1074 */     bcs bcs9 = new bhd(new bkq(), c.a(bza.e).a().c().b().a(bhr.c));
/* 1075 */     bcs bcs10 = new bhd(new bkr(), c.a(bza.e).a().c().b().a(bhr.c));
/* 1076 */     bcs bcs11 = new bhd(new bkn(), c.a(bza.e).a().c().b().a(bhr.c));
/* 1077 */     bcs bcs12 = new bhd(new bkp(), c.a(bza.e).a().c().b().a(bhr.c));
/* 1078 */     bcs bcs13 = new bhd(new bkm(), c.a(bza.e).a().c().b().a(bhr.c));
/* 1079 */     bcs bcs14 = new bhd(new bko(), c.a(bza.e).a().c().b().a(bhr.c));
/* 1080 */     a("oak_sapling", bcs9);
/* 1081 */     a("spruce_sapling", bcs10);
/* 1082 */     a("birch_sapling", bcs11);
/* 1083 */     a("jungle_sapling", bcs12);
/* 1084 */     a("acacia_sapling", bcs13);
/* 1085 */     a("dark_oak_sapling", bcs14);
/* 1086 */     a("bedrock", new bge(c.a(bza.D).a(-1.0F, 3600000.0F)));
/* 1087 */     a("water", new bfu(byy.c, c.a(bza.i).a().b(100.0F)));
/* 1088 */     a("lava", new bfu(byy.e, c.a(bza.k).a().c().b(100.0F).a(15)));
/* 1089 */     a("sand", new bhc(14406560, c.a(bza.u, bzb.d).b(0.5F).a(bhr.h)));
/* 1090 */     a("red_sand", new bhc(11098145, c.a(bza.u, bzb.q).b(0.5F).a(bhr.h)));
/* 1091 */     a("gravel", new bfe(c.a(bza.u, bzb.m).b(0.6F).a(bhr.b)));
/* 1092 */     a("gold_ore", new bgh(c.a(bza.D).a(3.0F, 3.0F)));
/* 1093 */     a("iron_ore", new bgh(c.a(bza.D).a(3.0F, 3.0F)));
/* 1094 */     a("coal_ore", new bgh(c.a(bza.D).a(3.0F, 3.0F)));
/* 1095 */     a("oak_log", new bfw(bzb.o, c.a(bza.w, bzb.J).b(2.0F).a(bhr.a)));
/* 1096 */     a("spruce_log", new bfw(bzb.J, c.a(bza.w, bzb.B).b(2.0F).a(bhr.a)));
/* 1097 */     a("birch_log", new bfw(bzb.d, c.a(bza.w, bzb.p).b(2.0F).a(bhr.a)));
/* 1098 */     a("jungle_log", new bfw(bzb.l, c.a(bza.w, bzb.J).b(2.0F).a(bhr.a)));
/* 1099 */     a("acacia_log", new bfw(bzb.q, c.a(bza.w, bzb.m).b(2.0F).a(bhr.a)));
/* 1100 */     a("dark_oak_log", new bfw(bzb.B, c.a(bza.w, bzb.B).b(2.0F).a(bhr.a)));
/* 1101 */     a("stripped_spruce_log", new bfw(bzb.J, c.a(bza.w, bzb.J).b(2.0F).a(bhr.a)));
/* 1102 */     a("stripped_birch_log", new bfw(bzb.d, c.a(bza.w, bzb.d).b(2.0F).a(bhr.a)));
/* 1103 */     a("stripped_jungle_log", new bfw(bzb.l, c.a(bza.w, bzb.l).b(2.0F).a(bhr.a)));
/* 1104 */     a("stripped_acacia_log", new bfw(bzb.q, c.a(bza.w, bzb.q).b(2.0F).a(bhr.a)));
/* 1105 */     a("stripped_dark_oak_log", new bfw(bzb.B, c.a(bza.w, bzb.B).b(2.0F).a(bhr.a)));
/* 1106 */     a("stripped_oak_log", new bfw(bzb.o, c.a(bza.w, bzb.o).b(2.0F).a(bhr.a)));
/* 1107 */     a("oak_wood", new bha(c.a(bza.w, bzb.o).b(2.0F).a(bhr.a)));
/* 1108 */     a("spruce_wood", new bha(c.a(bza.w, bzb.J).b(2.0F).a(bhr.a)));
/* 1109 */     a("birch_wood", new bha(c.a(bza.w, bzb.d).b(2.0F).a(bhr.a)));
/* 1110 */     a("jungle_wood", new bha(c.a(bza.w, bzb.l).b(2.0F).a(bhr.a)));
/* 1111 */     a("acacia_wood", new bha(c.a(bza.w, bzb.q).b(2.0F).a(bhr.a)));
/* 1112 */     a("dark_oak_wood", new bha(c.a(bza.w, bzb.B).b(2.0F).a(bhr.a)));
/* 1113 */     a("stripped_oak_wood", new bha(c.a(bza.w, bzb.o).b(2.0F).a(bhr.a)));
/* 1114 */     a("stripped_spruce_wood", new bha(c.a(bza.w, bzb.J).b(2.0F).a(bhr.a)));
/* 1115 */     a("stripped_birch_wood", new bha(c.a(bza.w, bzb.d).b(2.0F).a(bhr.a)));
/* 1116 */     a("stripped_jungle_wood", new bha(c.a(bza.w, bzb.l).b(2.0F).a(bhr.a)));
/* 1117 */     a("stripped_acacia_wood", new bha(c.a(bza.w, bzb.q).b(2.0F).a(bhr.a)));
/* 1118 */     a("stripped_dark_oak_wood", new bha(c.a(bza.w, bzb.B).b(2.0F).a(bhr.a)));
/* 1119 */     a("oak_leaves", new bfr(c.a(bza.z).b(0.2F).c().a(bhr.c)));
/* 1120 */     a("spruce_leaves", new bfr(c.a(bza.z).b(0.2F).c().a(bhr.c)));
/* 1121 */     a("birch_leaves", new bfr(c.a(bza.z).b(0.2F).c().a(bhr.c)));
/* 1122 */     a("jungle_leaves", new bfr(c.a(bza.z).b(0.2F).c().a(bhr.c)));
/* 1123 */     a("acacia_leaves", new bfr(c.a(bza.z).b(0.2F).c().a(bhr.c)));
/* 1124 */     a("dark_oak_leaves", new bfr(c.a(bza.z).b(0.2F).c().a(bhr.c)));
/* 1125 */     a("sponge", new bht(c.a(bza.v).b(0.6F).a(bhr.c)));
/* 1126 */     a("wet_sponge", new biz(c.a(bza.v).b(0.6F).a(bhr.c)));
/* 1127 */     a("glass", new bey(c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1128 */     a("lapis_ore", new bgh(c.a(bza.D).a(3.0F, 3.0F)));
/* 1129 */     a("lapis_block", new bcs(c.a(bza.E, bzb.H).a(3.0F, 3.0F)));
/* 1130 */     a("dispenser", new bec(c.a(bza.D).b(3.5F)));
/* 1131 */     bcs bcs15 = new bcs(c.a(bza.D, bzb.d).b(0.8F));
/* 1132 */     a("sandstone", bcs15);
/* 1133 */     a("chiseled_sandstone", new bcs(c.a(bza.D, bzb.d).b(0.8F)));
/* 1134 */     a("cut_sandstone", new bcs(c.a(bza.D, bzb.d).b(0.8F)));
/* 1135 */     a("note_block", new bgf(c.a(bza.w).a(bhr.a).b(0.8F)));
/* 1136 */     a("white_bed", new bcq(asc.a, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1137 */     a("orange_bed", new bcq(asc.b, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1138 */     a("magenta_bed", new bcq(asc.c, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1139 */     a("light_blue_bed", new bcq(asc.d, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1140 */     a("yellow_bed", new bcq(asc.e, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1141 */     a("lime_bed", new bcq(asc.f, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1142 */     a("pink_bed", new bcq(asc.g, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1143 */     a("gray_bed", new bcq(asc.h, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1144 */     a("light_gray_bed", new bcq(asc.i, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1145 */     a("cyan_bed", new bcq(asc.j, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1146 */     a("purple_bed", new bcq(asc.k, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1147 */     a("blue_bed", new bcq(asc.l, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1148 */     a("brown_bed", new bcq(asc.m, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1149 */     a("green_bed", new bcq(asc.n, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1150 */     a("red_bed", new bcq(asc.o, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1151 */     a("black_bed", new bcq(asc.p, c.a(bza.x).a(bhr.a).b(0.2F)));
/* 1152 */     a("powered_rail", new bgo(c.a(bza.n).a().b(0.7F).a(bhr.e)));
/* 1153 */     a("detector_rail", new bdz(c.a(bza.n).a().b(0.7F).a(bhr.e)));
/* 1154 */     a("sticky_piston", new bkv(true, c.a(bza.I).b(0.5F)));
/* 1155 */     a("cobweb", new bix(c.a(bza.o).a().b(4.0F)));
/* 1156 */     bcs bcs16 = new bih(c.a(bza.g).a().b().a(bhr.c));
/* 1157 */     bcs bcs17 = new bih(c.a(bza.g).a().b().a(bhr.c));
/* 1158 */     bcs bcs18 = new bdy(c.a(bza.g, bzb.o).a().b().a(bhr.c));
/* 1159 */     a("grass", bcs16);
/* 1160 */     a("fern", bcs17);
/* 1161 */     a("dead_bush", bcs18);
/* 1162 */     bcs bcs19 = new bhg(c.a(bza.h).a().b().a(bhr.m));
/* 1163 */     a("seagrass", bcs19);
/* 1164 */     a("tall_seagrass", new bii(bcs19, c.a(bza.h).a().b().a(bhr.m)));
/* 1165 */     a("piston", new bkv(false, c.a(bza.I).b(0.5F)));
/* 1166 */     a("piston_head", new bkw(c.a(bza.I).b(0.5F)));
/* 1167 */     a("white_wool", new bcs(c.a(bza.x, bzb.j).b(0.8F).a(bhr.g)));
/* 1168 */     a("orange_wool", new bcs(c.a(bza.x, bzb.q).b(0.8F).a(bhr.g)));
/* 1169 */     a("magenta_wool", new bcs(c.a(bza.x, bzb.r).b(0.8F).a(bhr.g)));
/* 1170 */     a("light_blue_wool", new bcs(c.a(bza.x, bzb.s).b(0.8F).a(bhr.g)));
/* 1171 */     a("yellow_wool", new bcs(c.a(bza.x, bzb.t).b(0.8F).a(bhr.g)));
/* 1172 */     a("lime_wool", new bcs(c.a(bza.x, bzb.u).b(0.8F).a(bhr.g)));
/* 1173 */     a("pink_wool", new bcs(c.a(bza.x, bzb.v).b(0.8F).a(bhr.g)));
/* 1174 */     a("gray_wool", new bcs(c.a(bza.x, bzb.w).b(0.8F).a(bhr.g)));
/* 1175 */     a("light_gray_wool", new bcs(c.a(bza.x, bzb.x).b(0.8F).a(bhr.g)));
/* 1176 */     a("cyan_wool", new bcs(c.a(bza.x, bzb.y).b(0.8F).a(bhr.g)));
/* 1177 */     a("purple_wool", new bcs(c.a(bza.x, bzb.z).b(0.8F).a(bhr.g)));
/* 1178 */     a("blue_wool", new bcs(c.a(bza.x, bzb.A).b(0.8F).a(bhr.g)));
/* 1179 */     a("brown_wool", new bcs(c.a(bza.x, bzb.B).b(0.8F).a(bhr.g)));
/* 1180 */     a("green_wool", new bcs(c.a(bza.x, bzb.C).b(0.8F).a(bhr.g)));
/* 1181 */     a("red_wool", new bcs(c.a(bza.x, bzb.D).b(0.8F).a(bhr.g)));
/* 1182 */     a("black_wool", new bcs(c.a(bza.x, bzb.E).b(0.8F).a(bhr.g)));
/* 1183 */     a("moving_piston", new bku(c.a(bza.I).b(-1.0F).d()));
/* 1184 */     bcs bcs20 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1185 */     bcs bcs21 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1186 */     bcs bcs22 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1187 */     bcs bcs23 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1188 */     bcs bcs24 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1189 */     bcs bcs25 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1190 */     bcs bcs26 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1191 */     bcs bcs27 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1192 */     bcs bcs28 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1193 */     bcs bcs29 = new beu(c.a(bza.e).a().b().a(bhr.c));
/* 1194 */     a("dandelion", bcs20);
/* 1195 */     a("poppy", bcs21);
/* 1196 */     a("blue_orchid", bcs22);
/* 1197 */     a("allium", bcs23);
/* 1198 */     a("azure_bluet", bcs24);
/* 1199 */     a("red_tulip", bcs25);
/* 1200 */     a("orange_tulip", bcs26);
/* 1201 */     a("white_tulip", bcs27);
/* 1202 */     a("pink_tulip", bcs28);
/* 1203 */     a("oxeye_daisy", bcs29);
/* 1204 */     bcs bcs30 = new bga(c.a(bza.e).a().c().b().a(bhr.c).a(1));
/* 1205 */     bcs bcs31 = new bga(c.a(bza.e).a().c().b().a(bhr.c));
/* 1206 */     a("brown_mushroom", bcs30);
/* 1207 */     a("red_mushroom", bcs31);
/* 1208 */     a("gold_block", new bcs(c.a(bza.E, bzb.F).a(3.0F, 6.0F).a(bhr.e)));
/* 1209 */     a("iron_block", new bcs(c.a(bza.E, bzb.h).a(5.0F, 6.0F).a(bhr.e)));
/* 1210 */     bcs bcs32 = new bcs(c.a(bza.D, bzb.D).a(2.0F, 6.0F));
/* 1211 */     a("bricks", bcs32);
/* 1212 */     a("tnt", new bij(c.a(bza.y).b().a(bhr.c)));
/* 1213 */     a("bookshelf", new bcw(c.a(bza.w).b(1.5F).a(bhr.a)));
/* 1214 */     a("mossy_cobblestone", new bcs(c.a(bza.D).a(2.0F, 6.0F)));
/* 1215 */     a("obsidian", new bcs(c.a(bza.D, bzb.E).a(50.0F, 1200.0F)));
/* 1216 */     a("torch", new bik(c.a(bza.n).a().b().a(14).a(bhr.a)));
/* 1217 */     a("wall_torch", new biv(c.a(bza.n).a().b().a(14).a(bhr.a)));
/* 1218 */     a("fire", new bet(c.a(bza.m, bzb.f).a().c().b().a(15).a(bhr.g)));
/* 1219 */     a("spawner", new bhs(c.a(bza.D).b(5.0F).a(bhr.e)));
/* 1220 */     a("oak_stairs", new bhx(bcs3.p(), c.a(bcs3)));
/* 1221 */     a("chest", new bdh(c.a(bza.w).b(2.5F).a(bhr.a)));
/* 1222 */     a("redstone_wire", new bgu(c.a(bza.n).a().b()));
/* 1223 */     a("diamond_ore", new bgh(c.a(bza.D).a(3.0F, 3.0F)));
/* 1224 */     a("diamond_block", new bcs(c.a(bza.E, bzb.G).a(5.0F, 6.0F).a(bhr.e)));
/* 1225 */     a("crafting_table", new bdu(c.a(bza.w).b(2.5F).a(bhr.a)));
/* 1226 */     a("wheat", new bdv(c.a(bza.e).a().c().b().a(bhr.c)));
/* 1227 */     bcs bcs33 = new beq(c.a(bza.r).c().b(0.6F).a(bhr.b));
/* 1228 */     a("farmland", bcs33);
/* 1229 */     a("furnace", new bex(c.a(bza.D).b(3.5F).a(13)));
/* 1230 */     a("sign", new bhy(c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1231 */     a("oak_door", new bed(c.a(bza.w, bcs3.l).b(3.0F).a(bhr.a)));
/* 1232 */     a("ladder", new bfq(c.a(bza.n).b(0.4F).a(bhr.j)));
/* 1233 */     a("rail", new bgr(c.a(bza.n).a().b(0.7F).a(bhr.e)));
/* 1234 */     a("cobblestone_stairs", new bhx(bcs2.p(), c.a(bcs2)));
/* 1235 */     a("wall_sign", new bit(c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1236 */     a("lever", new bft(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1237 */     a("stone_pressure_plate", new bgp(bgp.a.b, c.a(bza.D).a().b(0.5F)));
/* 1238 */     a("iron_door", new bed(c.a(bza.E, bzb.h).b(5.0F).a(bhr.e)));
/* 1239 */     a("oak_pressure_plate", new bgp(bgp.a.a, c.a(bza.w, bcs3.l).a().b(0.5F).a(bhr.a)));
/* 1240 */     a("spruce_pressure_plate", new bgp(bgp.a.a, c.a(bza.w, bcs4.l).a().b(0.5F).a(bhr.a)));
/* 1241 */     a("birch_pressure_plate", new bgp(bgp.a.a, c.a(bza.w, bcs5.l).a().b(0.5F).a(bhr.a)));
/* 1242 */     a("jungle_pressure_plate", new bgp(bgp.a.a, c.a(bza.w, bcs6.l).a().b(0.5F).a(bhr.a)));
/* 1243 */     a("acacia_pressure_plate", new bgp(bgp.a.a, c.a(bza.w, bcs7.l).a().b(0.5F).a(bhr.a)));
/* 1244 */     a("dark_oak_pressure_plate", new bgp(bgp.a.a, c.a(bza.w, bcs8.l).a().b(0.5F).a(bhr.a)));
/* 1245 */     a("redstone_ore", new bgt(c.a(bza.D).c().a(9).a(3.0F, 3.0F)));
/* 1246 */     a("redstone_torch", new bgw(c.a(bza.n).a().b().a(7).a(bhr.a)));
/* 1247 */     a("redstone_wall_torch", new bgx(c.a(bza.n).a().b().a(7).a(bhr.a)));
/* 1248 */     a("stone_button", new bic(c.a(bza.n).a().b(0.5F)));
/* 1249 */     a("snow", new bho(c.a(bza.l).c().b(0.1F).a(bhr.i)));
/* 1250 */     a("ice", new bfk(c.a(bza.B).a(0.98F).c().b(0.5F).a(bhr.f)));
/* 1251 */     a("snow_block", new bhn(c.a(bza.F).c().b(0.2F).a(bhr.i)));
/* 1252 */     bcs bcs34 = new bdc(c.a(bza.C).c().b(0.4F).a(bhr.g));
/* 1253 */     a("cactus", bcs34);
/* 1254 */     a("clay", new bdk(c.a(bza.q).b(0.6F).a(bhr.b)));
/* 1255 */     a("sugar_cane", new bif(c.a(bza.e).a().c().b().a(bhr.c)));
/* 1256 */     a("jukebox", new bfn(c.a(bza.w, bzb.l).a(2.0F, 6.0F)));
/* 1257 */     a("oak_fence", new ber(c.a(bza.w, bcs3.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1258 */     bia bia1 = new bgq(c.a(bza.K, bzb.q).b(1.0F).a(bhr.a));
/* 1259 */     a("pumpkin", bia1);
/* 1260 */     a("netherrack", new bcs(c.a(bza.D, bzb.K).b(0.4F)));
/* 1261 */     a("soul_sand", new bhq(c.a(bza.u, bzb.B).c().b(0.5F).a(bhr.h)));
/* 1262 */     a("glowstone", new bfb(c.a(bza.A, bzb.d).b(0.3F).a(bhr.f).a(15)));
/* 1263 */     a("nether_portal", new bgc(c.a(bza.c).a().c().b(-1.0F).a(bhr.f).a(11)));
/* 1264 */     a("carved_pumpkin", new bdf(c.a(bza.K, bzb.q).b(1.0F).a(bhr.a)));
/* 1265 */     a("jack_o_lantern", new bdf(c.a(bza.K, bzb.q).b(1.0F).a(bhr.a).a(15)));
/* 1266 */     a("cake", new bdd(c.a(bza.M).b(0.5F).a(bhr.g)));
/* 1267 */     a("repeater", new bgz(c.a(bza.n).b().a(bhr.a)));
/* 1268 */     a("white_stained_glass", new bhv(asc.a, c.a(bza.A, asc.a).b(0.3F).a(bhr.f)));
/* 1269 */     a("orange_stained_glass", new bhv(asc.b, c.a(bza.A, asc.b).b(0.3F).a(bhr.f)));
/* 1270 */     a("magenta_stained_glass", new bhv(asc.c, c.a(bza.A, asc.c).b(0.3F).a(bhr.f)));
/* 1271 */     a("light_blue_stained_glass", new bhv(asc.d, c.a(bza.A, asc.d).b(0.3F).a(bhr.f)));
/* 1272 */     a("yellow_stained_glass", new bhv(asc.e, c.a(bza.A, asc.e).b(0.3F).a(bhr.f)));
/* 1273 */     a("lime_stained_glass", new bhv(asc.f, c.a(bza.A, asc.f).b(0.3F).a(bhr.f)));
/* 1274 */     a("pink_stained_glass", new bhv(asc.g, c.a(bza.A, asc.g).b(0.3F).a(bhr.f)));
/* 1275 */     a("gray_stained_glass", new bhv(asc.h, c.a(bza.A, asc.h).b(0.3F).a(bhr.f)));
/* 1276 */     a("light_gray_stained_glass", new bhv(asc.i, c.a(bza.A, asc.i).b(0.3F).a(bhr.f)));
/* 1277 */     a("cyan_stained_glass", new bhv(asc.j, c.a(bza.A, asc.j).b(0.3F).a(bhr.f)));
/* 1278 */     a("purple_stained_glass", new bhv(asc.k, c.a(bza.A, asc.k).b(0.3F).a(bhr.f)));
/* 1279 */     a("blue_stained_glass", new bhv(asc.l, c.a(bza.A, asc.l).b(0.3F).a(bhr.f)));
/* 1280 */     a("brown_stained_glass", new bhv(asc.m, c.a(bza.A, asc.m).b(0.3F).a(bhr.f)));
/* 1281 */     a("green_stained_glass", new bhv(asc.n, c.a(bza.A, asc.n).b(0.3F).a(bhr.f)));
/* 1282 */     a("red_stained_glass", new bhv(asc.o, c.a(bza.A, asc.o).b(0.3F).a(bhr.f)));
/* 1283 */     a("black_stained_glass", new bhv(asc.p, c.a(bza.A, asc.p).b(0.3F).a(bhr.f)));
/* 1284 */     a("oak_trapdoor", new bil(c.a(bza.w, bzb.o).b(3.0F).a(bhr.a)));
/* 1285 */     a("spruce_trapdoor", new bil(c.a(bza.w, bzb.J).b(3.0F).a(bhr.a)));
/* 1286 */     a("birch_trapdoor", new bil(c.a(bza.w, bzb.d).b(3.0F).a(bhr.a)));
/* 1287 */     a("jungle_trapdoor", new bil(c.a(bza.w, bzb.l).b(3.0F).a(bhr.a)));
/* 1288 */     a("acacia_trapdoor", new bil(c.a(bza.w, bzb.q).b(3.0F).a(bhr.a)));
/* 1289 */     a("dark_oak_trapdoor", new bil(c.a(bza.w, bzb.B).b(3.0F).a(bhr.a)));
/* 1290 */     bcs bcs35 = new bcs(c.a(bza.D).a(1.5F, 6.0F));
/* 1291 */     bcs bcs36 = new bcs(c.a(bza.D).a(1.5F, 6.0F));
/* 1292 */     bcs bcs37 = new bcs(c.a(bza.D).a(1.5F, 6.0F));
/* 1293 */     bcs bcs38 = new bcs(c.a(bza.D).a(1.5F, 6.0F));
/* 1294 */     a("infested_stone", new bfl(bcs1, c.a(bza.q).a(0.0F, 0.75F)));
/* 1295 */     a("infested_cobblestone", new bfl(bcs2, c.a(bza.q).a(0.0F, 0.75F)));
/* 1296 */     a("infested_stone_bricks", new bfl(bcs35, c.a(bza.q).a(0.0F, 0.75F)));
/* 1297 */     a("infested_mossy_stone_bricks", new bfl(bcs36, c.a(bza.q).a(0.0F, 0.75F)));
/* 1298 */     a("infested_cracked_stone_bricks", new bfl(bcs37, c.a(bza.q).a(0.0F, 0.75F)));
/* 1299 */     a("infested_chiseled_stone_bricks", new bfl(bcs38, c.a(bza.q).a(0.0F, 0.75F)));
/* 1300 */     a("stone_bricks", bcs35);
/* 1301 */     a("mossy_stone_bricks", bcs36);
/* 1302 */     a("cracked_stone_bricks", bcs37);
/* 1303 */     a("chiseled_stone_bricks", bcs38);
/* 1304 */     bcs bcs39 = new bfj(bcs30, c.a(bza.w, bzb.l).b(0.2F).a(bhr.a));
/* 1305 */     a("brown_mushroom_block", bcs39);
/* 1306 */     bcs bcs40 = new bfj(bcs31, c.a(bza.w, bzb.D).b(0.2F).a(bhr.a));
/* 1307 */     a("red_mushroom_block", bcs40);
/* 1308 */     a("mushroom_stem", new bfj(null, c.a(bza.w, bzb.L).b(0.2F).a(bhr.a)));
/* 1309 */     a("iron_bars", new bfm(c.a(bza.E, bzb.b).a(5.0F, 6.0F).a(bhr.e)));
/* 1310 */     a("glass_pane", new bez(c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1311 */     bia bia2 = new bfy(c.a(bza.K, bzb.u).b(1.0F).a(bhr.a));
/* 1312 */     a("melon", bia2);
/* 1313 */     a("attached_pumpkin_stem", new bcf(bia1, c.a(bza.e).a().b().a(bhr.a)));
/* 1314 */     a("attached_melon_stem", new bcf(bia2, c.a(bza.e).a().b().a(bhr.a)));
/* 1315 */     a("pumpkin_stem", new bhz(bia1, c.a(bza.e).a().c().b().a(bhr.a)));
/* 1316 */     a("melon_stem", new bhz(bia2, c.a(bza.e).a().c().b().a(bhr.a)));
/* 1317 */     a("vine", new biq(c.a(bza.g).a().c().b(0.2F).a(bhr.c)));
/* 1318 */     a("oak_fence_gate", new bes(c.a(bza.w, bcs3.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1319 */     a("brick_stairs", new bhx(bcs32.p(), c.a(bcs32)));
/* 1320 */     a("stone_brick_stairs", new bhx(bcs35.p(), c.a(bcs35)));
/* 1321 */     a("mycelium", new bgb(c.a(bza.s, bzb.z).c().b(0.6F).a(bhr.c)));
/* 1322 */     a("lily_pad", new biw(c.a(bza.e).b().a(bhr.c)));
/* 1323 */     bcs bcs41 = new bcs(c.a(bza.D, bzb.K).a(2.0F, 6.0F));
/* 1324 */     a("nether_bricks", bcs41);
/* 1325 */     a("nether_brick_fence", new ber(c.a(bza.D, bzb.K).a(2.0F, 6.0F)));
/* 1326 */     a("nether_brick_stairs", new bhx(bcs41.p(), c.a(bcs41)));
/* 1327 */     a("nether_wart", new bgd(c.a(bza.e, bzb.D).a().c()));
/* 1328 */     a("enchanting_table", new beh(c.a(bza.D, bzb.D).a(5.0F, 1200.0F)));
/* 1329 */     a("brewing_stand", new bcx(c.a(bza.E).b(0.5F).a(1)));
/* 1330 */     a("cauldron", new bdg(c.a(bza.E, bzb.m).b(2.0F)));
/* 1331 */     a("end_portal", new bej(c.a(bza.c, bzb.E).a().a(15).a(-1.0F, 3600000.0F)));
/* 1332 */     a("end_portal_frame", new bek(c.a(bza.D, bzb.C).a(bhr.f).a(1).a(-1.0F, 3600000.0F)));
/* 1333 */     a("end_stone", new bcs(c.a(bza.D, bzb.d).a(3.0F, 9.0F)));
/* 1334 */     a("dragon_egg", new bef(c.a(bza.L, bzb.E).a(3.0F, 9.0F).a(1)));
/* 1335 */     a("redstone_lamp", new bgv(c.a(bza.p).a(15).b(0.3F).a(bhr.f)));
/* 1336 */     a("cocoa", new bdl(c.a(bza.e).c().a(0.2F, 3.0F).a(bhr.a)));
/* 1337 */     a("sandstone_stairs", new bhx(bcs15.p(), c.a(bcs15)));
/* 1338 */     a("emerald_ore", new bgh(c.a(bza.D).a(3.0F, 3.0F)));
/* 1339 */     a("ender_chest", new bem(c.a(bza.D).a(22.5F, 600.0F).a(7)));
/* 1340 */     bio bio = new bio(c.a(bza.n).a());
/* 1341 */     a("tripwire_hook", bio);
/* 1342 */     a("tripwire", new bin(bio, c.a(bza.n).a()));
/* 1343 */     a("emerald_block", new bcs(c.a(bza.E, bzb.I).a(5.0F, 6.0F).a(bhr.e)));
/* 1344 */     a("spruce_stairs", new bhx(bcs4.p(), c.a(bcs4)));
/* 1345 */     a("birch_stairs", new bhx(bcs5.p(), c.a(bcs5)));
/* 1346 */     a("jungle_stairs", new bhx(bcs6.p(), c.a(bcs6)));
/* 1347 */     a("command_block", new bdm(c.a(bza.E, bzb.B).a(-1.0F, 3600000.0F)));
/* 1348 */     a("beacon", new bcp(c.a(bza.A, bzb.G).b(3.0F).a(15)));
/* 1349 */     a("cobblestone_wall", new bis(c.a(bcs2)));
/* 1350 */     a("mossy_cobblestone_wall", new bis(c.a(bcs2)));
/* 1351 */     a("flower_pot", new bev(☃, c.a(bza.n).b()));
/* 1352 */     a("potted_oak_sapling", new bev(bcs9, c.a(bza.n).b()));
/* 1353 */     a("potted_spruce_sapling", new bev(bcs10, c.a(bza.n).b()));
/* 1354 */     a("potted_birch_sapling", new bev(bcs11, c.a(bza.n).b()));
/* 1355 */     a("potted_jungle_sapling", new bev(bcs12, c.a(bza.n).b()));
/* 1356 */     a("potted_acacia_sapling", new bev(bcs13, c.a(bza.n).b()));
/* 1357 */     a("potted_dark_oak_sapling", new bev(bcs14, c.a(bza.n).b()));
/* 1358 */     a("potted_fern", new bev(bcs17, c.a(bza.n).b()));
/* 1359 */     a("potted_dandelion", new bev(bcs20, c.a(bza.n).b()));
/* 1360 */     a("potted_poppy", new bev(bcs21, c.a(bza.n).b()));
/* 1361 */     a("potted_blue_orchid", new bev(bcs22, c.a(bza.n).b()));
/* 1362 */     a("potted_allium", new bev(bcs23, c.a(bza.n).b()));
/* 1363 */     a("potted_azure_bluet", new bev(bcs24, c.a(bza.n).b()));
/* 1364 */     a("potted_red_tulip", new bev(bcs25, c.a(bza.n).b()));
/* 1365 */     a("potted_orange_tulip", new bev(bcs26, c.a(bza.n).b()));
/* 1366 */     a("potted_white_tulip", new bev(bcs27, c.a(bza.n).b()));
/* 1367 */     a("potted_pink_tulip", new bev(bcs28, c.a(bza.n).b()));
/* 1368 */     a("potted_oxeye_daisy", new bev(bcs29, c.a(bza.n).b()));
/* 1369 */     a("potted_red_mushroom", new bev(bcs31, c.a(bza.n).b()));
/* 1370 */     a("potted_brown_mushroom", new bev(bcs30, c.a(bza.n).b()));
/* 1371 */     a("potted_dead_bush", new bev(bcs18, c.a(bza.n).b()));
/* 1372 */     a("potted_cactus", new bev(bcs34, c.a(bza.n).b()));
/* 1373 */     a("carrots", new bde(c.a(bza.e).a().c().b().a(bhr.c)));
/* 1374 */     a("potatoes", new bgm(c.a(bza.e).a().c().b().a(bhr.c)));
/* 1375 */     a("oak_button", new bjc(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1376 */     a("spruce_button", new bjc(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1377 */     a("birch_button", new bjc(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1378 */     a("jungle_button", new bjc(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1379 */     a("acacia_button", new bjc(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1380 */     a("dark_oak_button", new bjc(c.a(bza.n).a().b(0.5F).a(bhr.a)));
/* 1381 */     a("skeleton_wall_skull", new biu(bhk.b.a, c.a(bza.n).b(1.0F)));
/* 1382 */     a("skeleton_skull", new bhk(bhk.b.a, c.a(bza.n).b(1.0F)));
/* 1383 */     a("wither_skeleton_wall_skull", new bjb(c.a(bza.n).b(1.0F)));
/* 1384 */     a("wither_skeleton_skull", new bja(c.a(bza.n).b(1.0F)));
/* 1385 */     a("zombie_wall_head", new biu(bhk.b.d, c.a(bza.n).b(1.0F)));
/* 1386 */     a("zombie_head", new bhk(bhk.b.d, c.a(bza.n).b(1.0F)));
/* 1387 */     a("player_wall_head", new bgl(c.a(bza.n).b(1.0F)));
/* 1388 */     a("player_head", new bgk(c.a(bza.n).b(1.0F)));
/* 1389 */     a("creeper_wall_head", new biu(bhk.b.e, c.a(bza.n).b(1.0F)));
/* 1390 */     a("creeper_head", new bhk(bhk.b.e, c.a(bza.n).b(1.0F)));
/* 1391 */     a("dragon_wall_head", new biu(bhk.b.f, c.a(bza.n).b(1.0F)));
/* 1392 */     a("dragon_head", new bhk(bhk.b.f, c.a(bza.n).b(1.0F)));
/* 1393 */     a("anvil", new bce(c.a(bza.G, bzb.h).a(5.0F, 1200.0F).a(bhr.k)));
/* 1394 */     a("chipped_anvil", new bce(c.a(bza.G, bzb.h).a(5.0F, 1200.0F).a(bhr.k)));
/* 1395 */     a("damaged_anvil", new bce(c.a(bza.G, bzb.h).a(5.0F, 1200.0F).a(bhr.k)));
/* 1396 */     a("trapped_chest", new bim(c.a(bza.w).b(2.5F).a(bhr.a)));
/* 1397 */     a("light_weighted_pressure_plate", new biy(15, c.a(bza.E, bzb.F).a().b(0.5F).a(bhr.a)));
/* 1398 */     a("heavy_weighted_pressure_plate", new biy(150, c.a(bza.E).a().b(0.5F).a(bhr.a)));
/* 1399 */     a("comparator", new bdn(c.a(bza.n).b().a(bhr.a)));
/* 1400 */     a("daylight_detector", new bdx(c.a(bza.w).b(0.2F).a(bhr.a)));
/* 1401 */     a("redstone_block", new bgn(c.a(bza.E, bzb.f).a(5.0F, 6.0F).a(bhr.e)));
/* 1402 */     a("nether_quartz_ore", new bgh(c.a(bza.D, bzb.K).a(3.0F, 3.0F)));
/* 1403 */     a("hopper", new bfh(c.a(bza.E, bzb.m).a(3.0F, 4.8F).a(bhr.e)));
/* 1404 */     bcs bcs42 = new bcs(c.a(bza.D, bzb.p).b(0.8F));
/* 1405 */     a("quartz_block", bcs42);
/* 1406 */     a("chiseled_quartz_block", new bcs(c.a(bza.D, bzb.p).b(0.8F)));
/* 1407 */     a("quartz_pillar", new bha(c.a(bza.D, bzb.p).b(0.8F)));
/* 1408 */     a("quartz_stairs", new bhx(bcs42.p(), c.a(bcs42)));
/* 1409 */     a("activator_rail", new bgo(c.a(bza.n).a().b(0.7F).a(bhr.e)));
/* 1410 */     a("dropper", new beg(c.a(bza.D).b(3.5F)));
/* 1411 */     a("white_terracotta", new bcs(c.a(bza.D, bzb.L).a(1.25F, 4.2F)));
/* 1412 */     a("orange_terracotta", new bcs(c.a(bza.D, bzb.M).a(1.25F, 4.2F)));
/* 1413 */     a("magenta_terracotta", new bcs(c.a(bza.D, bzb.N).a(1.25F, 4.2F)));
/* 1414 */     a("light_blue_terracotta", new bcs(c.a(bza.D, bzb.O).a(1.25F, 4.2F)));
/* 1415 */     a("yellow_terracotta", new bcs(c.a(bza.D, bzb.P).a(1.25F, 4.2F)));
/* 1416 */     a("lime_terracotta", new bcs(c.a(bza.D, bzb.Q).a(1.25F, 4.2F)));
/* 1417 */     a("pink_terracotta", new bcs(c.a(bza.D, bzb.R).a(1.25F, 4.2F)));
/* 1418 */     a("gray_terracotta", new bcs(c.a(bza.D, bzb.S).a(1.25F, 4.2F)));
/* 1419 */     a("light_gray_terracotta", new bcs(c.a(bza.D, bzb.T).a(1.25F, 4.2F)));
/* 1420 */     a("cyan_terracotta", new bcs(c.a(bza.D, bzb.U).a(1.25F, 4.2F)));
/* 1421 */     a("purple_terracotta", new bcs(c.a(bza.D, bzb.V).a(1.25F, 4.2F)));
/* 1422 */     a("blue_terracotta", new bcs(c.a(bza.D, bzb.W).a(1.25F, 4.2F)));
/* 1423 */     a("brown_terracotta", new bcs(c.a(bza.D, bzb.X).a(1.25F, 4.2F)));
/* 1424 */     a("green_terracotta", new bcs(c.a(bza.D, bzb.Y).a(1.25F, 4.2F)));
/* 1425 */     a("red_terracotta", new bcs(c.a(bza.D, bzb.Z).a(1.25F, 4.2F)));
/* 1426 */     a("black_terracotta", new bcs(c.a(bza.D, bzb.aa).a(1.25F, 4.2F)));
/* 1427 */     a("white_stained_glass_pane", new bhw(asc.a, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1428 */     a("orange_stained_glass_pane", new bhw(asc.b, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1429 */     a("magenta_stained_glass_pane", new bhw(asc.c, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1430 */     a("light_blue_stained_glass_pane", new bhw(asc.d, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1431 */     a("yellow_stained_glass_pane", new bhw(asc.e, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1432 */     a("lime_stained_glass_pane", new bhw(asc.f, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1433 */     a("pink_stained_glass_pane", new bhw(asc.g, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1434 */     a("gray_stained_glass_pane", new bhw(asc.h, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1435 */     a("light_gray_stained_glass_pane", new bhw(asc.i, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1436 */     a("cyan_stained_glass_pane", new bhw(asc.j, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1437 */     a("purple_stained_glass_pane", new bhw(asc.k, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1438 */     a("blue_stained_glass_pane", new bhw(asc.l, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1439 */     a("brown_stained_glass_pane", new bhw(asc.m, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1440 */     a("green_stained_glass_pane", new bhw(asc.n, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1441 */     a("red_stained_glass_pane", new bhw(asc.o, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1442 */     a("black_stained_glass_pane", new bhw(asc.p, c.a(bza.A).b(0.3F).a(bhr.f)));
/* 1443 */     a("acacia_stairs", new bhx(bcs7.p(), c.a(bcs7)));
/* 1444 */     a("dark_oak_stairs", new bhx(bcs8.p(), c.a(bcs8)));
/* 1445 */     a("slime_block", new bhm(c.a(bza.q, bzb.c).a(0.8F).a(bhr.l)));
/* 1446 */     a("barrier", new bch(c.a(bza.H).a(-1.0F, 3600000.8F)));
/* 1447 */     a("iron_trapdoor", new bil(c.a(bza.E).b(5.0F).a(bhr.e)));
/* 1448 */     bcs bcs43 = new bcs(c.a(bza.D, bzb.y).a(1.5F, 6.0F));
/* 1449 */     a("prismarine", bcs43);
/* 1450 */     bcs bcs44 = new bcs(c.a(bza.D, bzb.G).a(1.5F, 6.0F));
/* 1451 */     a("prismarine_bricks", bcs44);
/* 1452 */     bcs bcs45 = new bcs(c.a(bza.D, bzb.G).a(1.5F, 6.0F));
/* 1453 */     a("dark_prismarine", bcs45);
/* 1454 */     a("prismarine_stairs", new bhx(bcs43.p(), c.a(bcs43)));
/* 1455 */     a("prismarine_brick_stairs", new bhx(bcs44.p(), c.a(bcs44)));
/* 1456 */     a("dark_prismarine_stairs", new bhx(bcs45.p(), c.a(bcs45)));
/* 1457 */     a("prismarine_slab", new bhl(c.a(bza.D, bzb.y).a(1.5F, 6.0F)));
/* 1458 */     a("prismarine_brick_slab", new bhl(c.a(bza.D, bzb.G).a(1.5F, 6.0F)));
/* 1459 */     a("dark_prismarine_slab", new bhl(c.a(bza.D, bzb.G).a(1.5F, 6.0F)));
/* 1460 */     a("sea_lantern", new bhe(c.a(bza.A, bzb.p).b(0.3F).a(bhr.f).a(15)));
/* 1461 */     a("hay_block", new bfg(c.a(bza.s, bzb.t).b(0.5F).a(bhr.c)));
/* 1462 */     a("white_carpet", new bjd(asc.a, c.a(bza.d, bzb.j).b(0.1F).a(bhr.g)));
/* 1463 */     a("orange_carpet", new bjd(asc.b, c.a(bza.d, bzb.q).b(0.1F).a(bhr.g)));
/* 1464 */     a("magenta_carpet", new bjd(asc.c, c.a(bza.d, bzb.r).b(0.1F).a(bhr.g)));
/* 1465 */     a("light_blue_carpet", new bjd(asc.d, c.a(bza.d, bzb.s).b(0.1F).a(bhr.g)));
/* 1466 */     a("yellow_carpet", new bjd(asc.e, c.a(bza.d, bzb.t).b(0.1F).a(bhr.g)));
/* 1467 */     a("lime_carpet", new bjd(asc.f, c.a(bza.d, bzb.u).b(0.1F).a(bhr.g)));
/* 1468 */     a("pink_carpet", new bjd(asc.g, c.a(bza.d, bzb.v).b(0.1F).a(bhr.g)));
/* 1469 */     a("gray_carpet", new bjd(asc.h, c.a(bza.d, bzb.w).b(0.1F).a(bhr.g)));
/* 1470 */     a("light_gray_carpet", new bjd(asc.i, c.a(bza.d, bzb.x).b(0.1F).a(bhr.g)));
/* 1471 */     a("cyan_carpet", new bjd(asc.j, c.a(bza.d, bzb.y).b(0.1F).a(bhr.g)));
/* 1472 */     a("purple_carpet", new bjd(asc.k, c.a(bza.d, bzb.z).b(0.1F).a(bhr.g)));
/* 1473 */     a("blue_carpet", new bjd(asc.l, c.a(bza.d, bzb.A).b(0.1F).a(bhr.g)));
/* 1474 */     a("brown_carpet", new bjd(asc.m, c.a(bza.d, bzb.B).b(0.1F).a(bhr.g)));
/* 1475 */     a("green_carpet", new bjd(asc.n, c.a(bza.d, bzb.C).b(0.1F).a(bhr.g)));
/* 1476 */     a("red_carpet", new bjd(asc.o, c.a(bza.d, bzb.D).b(0.1F).a(bhr.g)));
/* 1477 */     a("black_carpet", new bjd(asc.p, c.a(bza.d, bzb.E).b(0.1F).a(bhr.g)));
/* 1478 */     a("terracotta", new bcs(c.a(bza.D, bzb.q).a(1.25F, 4.2F)));
/* 1479 */     a("coal_block", new bcs(c.a(bza.D, bzb.E).a(5.0F, 6.0F)));
/* 1480 */     a("packed_ice", new bgi(c.a(bza.t).a(0.98F).b(0.5F).a(bhr.f)));
/* 1481 */     a("sunflower", new big(c.a(bza.g).a().b().a(bhr.c)));
/* 1482 */     a("lilac", new big(c.a(bza.g).a().b().a(bhr.c)));
/* 1483 */     a("rose_bush", new big(c.a(bza.g).a().b().a(bhr.c)));
/* 1484 */     a("peony", new big(c.a(bza.g).a().b().a(bhr.c)));
/* 1485 */     a("tall_grass", new bhh(bcs16, c.a(bza.g).a().b().a(bhr.c)));
/* 1486 */     a("large_fern", new bhh(bcs17, c.a(bza.g).a().b().a(bhr.c)));
/* 1487 */     a("white_banner", new bcg(asc.a, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1488 */     a("orange_banner", new bcg(asc.b, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1489 */     a("magenta_banner", new bcg(asc.c, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1490 */     a("light_blue_banner", new bcg(asc.d, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1491 */     a("yellow_banner", new bcg(asc.e, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1492 */     a("lime_banner", new bcg(asc.f, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1493 */     a("pink_banner", new bcg(asc.g, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1494 */     a("gray_banner", new bcg(asc.h, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1495 */     a("light_gray_banner", new bcg(asc.i, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1496 */     a("cyan_banner", new bcg(asc.j, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1497 */     a("purple_banner", new bcg(asc.k, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1498 */     a("blue_banner", new bcg(asc.l, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1499 */     a("brown_banner", new bcg(asc.m, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1500 */     a("green_banner", new bcg(asc.n, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1501 */     a("red_banner", new bcg(asc.o, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1502 */     a("black_banner", new bcg(asc.p, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1503 */     a("white_wall_banner", new bir(asc.a, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1504 */     a("orange_wall_banner", new bir(asc.b, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1505 */     a("magenta_wall_banner", new bir(asc.c, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1506 */     a("light_blue_wall_banner", new bir(asc.d, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1507 */     a("yellow_wall_banner", new bir(asc.e, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1508 */     a("lime_wall_banner", new bir(asc.f, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1509 */     a("pink_wall_banner", new bir(asc.g, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1510 */     a("gray_wall_banner", new bir(asc.h, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1511 */     a("light_gray_wall_banner", new bir(asc.i, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1512 */     a("cyan_wall_banner", new bir(asc.j, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1513 */     a("purple_wall_banner", new bir(asc.k, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1514 */     a("blue_wall_banner", new bir(asc.l, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1515 */     a("brown_wall_banner", new bir(asc.m, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1516 */     a("green_wall_banner", new bir(asc.n, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1517 */     a("red_wall_banner", new bir(asc.o, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1518 */     a("black_wall_banner", new bir(asc.p, c.a(bza.w).a().b(1.0F).a(bhr.a)));
/* 1519 */     bcs bcs46 = new bcs(c.a(bza.D, bzb.q).b(0.8F));
/* 1520 */     a("red_sandstone", bcs46);
/* 1521 */     a("chiseled_red_sandstone", new bcs(c.a(bza.D, bzb.q).b(0.8F)));
/* 1522 */     a("cut_red_sandstone", new bcs(c.a(bza.D, bzb.q).b(0.8F)));
/* 1523 */     a("red_sandstone_stairs", new bhx(bcs46.p(), c.a(bcs46)));
/* 1524 */     a("oak_slab", new bhl(c.a(bza.w, bzb.o).a(2.0F, 3.0F).a(bhr.a)));
/* 1525 */     a("spruce_slab", new bhl(c.a(bza.w, bzb.J).a(2.0F, 3.0F).a(bhr.a)));
/* 1526 */     a("birch_slab", new bhl(c.a(bza.w, bzb.d).a(2.0F, 3.0F).a(bhr.a)));
/* 1527 */     a("jungle_slab", new bhl(c.a(bza.w, bzb.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1528 */     a("acacia_slab", new bhl(c.a(bza.w, bzb.q).a(2.0F, 3.0F).a(bhr.a)));
/* 1529 */     a("dark_oak_slab", new bhl(c.a(bza.w, bzb.B).a(2.0F, 3.0F).a(bhr.a)));
/* 1530 */     a("stone_slab", new bhl(c.a(bza.D, bzb.m).a(2.0F, 6.0F)));
/* 1531 */     a("sandstone_slab", new bhl(c.a(bza.D, bzb.d).a(2.0F, 6.0F)));
/* 1532 */     a("petrified_oak_slab", new bhl(c.a(bza.D, bzb.o).a(2.0F, 6.0F)));
/* 1533 */     a("cobblestone_slab", new bhl(c.a(bza.D, bzb.m).a(2.0F, 6.0F)));
/* 1534 */     a("brick_slab", new bhl(c.a(bza.D, bzb.D).a(2.0F, 6.0F)));
/* 1535 */     a("stone_brick_slab", new bhl(c.a(bza.D, bzb.m).a(2.0F, 6.0F)));
/* 1536 */     a("nether_brick_slab", new bhl(c.a(bza.D, bzb.K).a(2.0F, 6.0F)));
/* 1537 */     a("quartz_slab", new bhl(c.a(bza.D, bzb.p).a(2.0F, 6.0F)));
/* 1538 */     a("red_sandstone_slab", new bhl(c.a(bza.D, bzb.q).a(2.0F, 6.0F)));
/* 1539 */     a("purpur_slab", new bhl(c.a(bza.D, bzb.r).a(2.0F, 6.0F)));
/* 1540 */     a("smooth_stone", new bcs(c.a(bza.D, bzb.m).a(2.0F, 6.0F)));
/* 1541 */     a("smooth_sandstone", new bcs(c.a(bza.D, bzb.d).a(2.0F, 6.0F)));
/* 1542 */     a("smooth_quartz", new bcs(c.a(bza.D, bzb.p).a(2.0F, 6.0F)));
/* 1543 */     a("smooth_red_sandstone", new bcs(c.a(bza.D, bzb.q).a(2.0F, 6.0F)));
/* 1544 */     a("spruce_fence_gate", new bes(c.a(bza.w, bcs4.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1545 */     a("birch_fence_gate", new bes(c.a(bza.w, bcs5.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1546 */     a("jungle_fence_gate", new bes(c.a(bza.w, bcs6.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1547 */     a("acacia_fence_gate", new bes(c.a(bza.w, bcs7.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1548 */     a("dark_oak_fence_gate", new bes(c.a(bza.w, bcs8.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1549 */     a("spruce_fence", new ber(c.a(bza.w, bcs4.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1550 */     a("birch_fence", new ber(c.a(bza.w, bcs5.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1551 */     a("jungle_fence", new ber(c.a(bza.w, bcs6.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1552 */     a("acacia_fence", new ber(c.a(bza.w, bcs7.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1553 */     a("dark_oak_fence", new ber(c.a(bza.w, bcs8.l).a(2.0F, 3.0F).a(bhr.a)));
/* 1554 */     a("spruce_door", new bed(c.a(bza.w, bcs4.l).b(3.0F).a(bhr.a)));
/* 1555 */     a("birch_door", new bed(c.a(bza.w, bcs5.l).b(3.0F).a(bhr.a)));
/* 1556 */     a("jungle_door", new bed(c.a(bza.w, bcs6.l).b(3.0F).a(bhr.a)));
/* 1557 */     a("acacia_door", new bed(c.a(bza.w, bcs7.l).b(3.0F).a(bhr.a)));
/* 1558 */     a("dark_oak_door", new bed(c.a(bza.w, bcs8.l).b(3.0F).a(bhr.a)));
/* 1559 */     a("end_rod", new bel(c.a(bza.n).b().a(14).a(bhr.a)));
/* 1560 */     bdj bdj = new bdj(c.a(bza.e, bzb.z).b(0.4F).a(bhr.a));
/* 1561 */     a("chorus_plant", bdj);
/* 1562 */     a("chorus_flower", new bdi(bdj, c.a(bza.e, bzb.z).c().b(0.4F).a(bhr.a)));
/* 1563 */     bcs bcs47 = new bcs(c.a(bza.D, bzb.r).a(1.5F, 6.0F));
/* 1564 */     a("purpur_block", bcs47);
/* 1565 */     a("purpur_pillar", new bha(c.a(bza.D, bzb.r).a(1.5F, 6.0F)));
/* 1566 */     a("purpur_stairs", new bhx(bcs47.p(), c.a(bcs47)));
/* 1567 */     a("end_stone_bricks", new bcs(c.a(bza.D, bzb.d).b(0.8F)));
/* 1568 */     a("beetroots", new bcr(c.a(bza.e).a().c().b().a(bhr.c)));
/* 1569 */     bcs bcs48 = new bfd(c.a(bza.r).b(0.65F).a(bhr.c));
/* 1570 */     a("grass_path", bcs48);
/* 1571 */     a("end_gateway", new bei(c.a(bza.c, bzb.E).a().a(15).a(-1.0F, 3600000.0F)));
/* 1572 */     a("repeating_command_block", new bdm(c.a(bza.E, bzb.z).a(-1.0F, 3600000.0F)));
/* 1573 */     a("chain_command_block", new bdm(c.a(bza.E, bzb.C).a(-1.0F, 3600000.0F)));
/* 1574 */     a("frosted_ice", new bew(c.a(bza.B).a(0.98F).c().b(0.5F).a(bhr.f)));
/* 1575 */     a("magma_block", new bfx(c.a(bza.D, bzb.K).a(3).c().b(0.5F)));
/* 1576 */     a("nether_wart_block", new bcs(c.a(bza.s, bzb.D).b(1.0F).a(bhr.a)));
/* 1577 */     a("red_nether_bricks", new bcs(c.a(bza.D, bzb.K).a(2.0F, 6.0F)));
/* 1578 */     a("bone_block", new bha(c.a(bza.D, bzb.d).b(2.0F)));
/* 1579 */     a("structure_void", new bie(c.a(bza.b).a()));
/* 1580 */     a("observer", new bgg(c.a(bza.D).b(3.0F)));
/* 1581 */     a("shulker_box", new bhi(null, c.a(bza.D, bzb.z).b(2.0F).d()));
/* 1582 */     a("white_shulker_box", new bhi(asc.a, c.a(bza.D, bzb.j).b(2.0F).d()));
/* 1583 */     a("orange_shulker_box", new bhi(asc.b, c.a(bza.D, bzb.q).b(2.0F).d()));
/* 1584 */     a("magenta_shulker_box", new bhi(asc.c, c.a(bza.D, bzb.r).b(2.0F).d()));
/* 1585 */     a("light_blue_shulker_box", new bhi(asc.d, c.a(bza.D, bzb.s).b(2.0F).d()));
/* 1586 */     a("yellow_shulker_box", new bhi(asc.e, c.a(bza.D, bzb.t).b(2.0F).d()));
/* 1587 */     a("lime_shulker_box", new bhi(asc.f, c.a(bza.D, bzb.u).b(2.0F).d()));
/* 1588 */     a("pink_shulker_box", new bhi(asc.g, c.a(bza.D, bzb.v).b(2.0F).d()));
/* 1589 */     a("gray_shulker_box", new bhi(asc.h, c.a(bza.D, bzb.w).b(2.0F).d()));
/* 1590 */     a("light_gray_shulker_box", new bhi(asc.i, c.a(bza.D, bzb.x).b(2.0F).d()));
/* 1591 */     a("cyan_shulker_box", new bhi(asc.j, c.a(bza.D, bzb.y).b(2.0F).d()));
/* 1592 */     a("purple_shulker_box", new bhi(asc.k, c.a(bza.D, bzb.V).b(2.0F).d()));
/* 1593 */     a("blue_shulker_box", new bhi(asc.l, c.a(bza.D, bzb.A).b(2.0F).d()));
/* 1594 */     a("brown_shulker_box", new bhi(asc.m, c.a(bza.D, bzb.B).b(2.0F).d()));
/* 1595 */     a("green_shulker_box", new bhi(asc.n, c.a(bza.D, bzb.C).b(2.0F).d()));
/* 1596 */     a("red_shulker_box", new bhi(asc.o, c.a(bza.D, bzb.D).b(2.0F).d()));
/* 1597 */     a("black_shulker_box", new bhi(asc.p, c.a(bza.D, bzb.E).b(2.0F).d()));
/* 1598 */     a("white_glazed_terracotta", new bfa(c.a(bza.D, asc.a).b(1.4F)));
/* 1599 */     a("orange_glazed_terracotta", new bfa(c.a(bza.D, asc.b).b(1.4F)));
/* 1600 */     a("magenta_glazed_terracotta", new bfa(c.a(bza.D, asc.c).b(1.4F)));
/* 1601 */     a("light_blue_glazed_terracotta", new bfa(c.a(bza.D, asc.d).b(1.4F)));
/* 1602 */     a("yellow_glazed_terracotta", new bfa(c.a(bza.D, asc.e).b(1.4F)));
/* 1603 */     a("lime_glazed_terracotta", new bfa(c.a(bza.D, asc.f).b(1.4F)));
/* 1604 */     a("pink_glazed_terracotta", new bfa(c.a(bza.D, asc.g).b(1.4F)));
/* 1605 */     a("gray_glazed_terracotta", new bfa(c.a(bza.D, asc.h).b(1.4F)));
/* 1606 */     a("light_gray_glazed_terracotta", new bfa(c.a(bza.D, asc.i).b(1.4F)));
/* 1607 */     a("cyan_glazed_terracotta", new bfa(c.a(bza.D, asc.j).b(1.4F)));
/* 1608 */     a("purple_glazed_terracotta", new bfa(c.a(bza.D, asc.k).b(1.4F)));
/* 1609 */     a("blue_glazed_terracotta", new bfa(c.a(bza.D, asc.l).b(1.4F)));
/* 1610 */     a("brown_glazed_terracotta", new bfa(c.a(bza.D, asc.m).b(1.4F)));
/* 1611 */     a("green_glazed_terracotta", new bfa(c.a(bza.D, asc.n).b(1.4F)));
/* 1612 */     a("red_glazed_terracotta", new bfa(c.a(bza.D, asc.o).b(1.4F)));
/* 1613 */     a("black_glazed_terracotta", new bfa(c.a(bza.D, asc.p).b(1.4F)));
/* 1614 */     bcs bcs49 = new bcs(c.a(bza.D, asc.a).b(1.8F));
/* 1615 */     bcs bcs50 = new bcs(c.a(bza.D, asc.b).b(1.8F));
/* 1616 */     bcs bcs51 = new bcs(c.a(bza.D, asc.c).b(1.8F));
/* 1617 */     bcs bcs52 = new bcs(c.a(bza.D, asc.d).b(1.8F));
/* 1618 */     bcs bcs53 = new bcs(c.a(bza.D, asc.e).b(1.8F));
/* 1619 */     bcs bcs54 = new bcs(c.a(bza.D, asc.f).b(1.8F));
/* 1620 */     bcs bcs55 = new bcs(c.a(bza.D, asc.g).b(1.8F));
/* 1621 */     bcs bcs56 = new bcs(c.a(bza.D, asc.h).b(1.8F));
/* 1622 */     bcs bcs57 = new bcs(c.a(bza.D, asc.i).b(1.8F));
/* 1623 */     bcs bcs58 = new bcs(c.a(bza.D, asc.j).b(1.8F));
/* 1624 */     bcs bcs59 = new bcs(c.a(bza.D, asc.k).b(1.8F));
/* 1625 */     bcs bcs60 = new bcs(c.a(bza.D, asc.l).b(1.8F));
/* 1626 */     bcs bcs61 = new bcs(c.a(bza.D, asc.m).b(1.8F));
/* 1627 */     bcs bcs62 = new bcs(c.a(bza.D, asc.n).b(1.8F));
/* 1628 */     bcs bcs63 = new bcs(c.a(bza.D, asc.o).b(1.8F));
/* 1629 */     bcs bcs64 = new bcs(c.a(bza.D, asc.p).b(1.8F));
/* 1630 */     a("white_concrete", bcs49);
/* 1631 */     a("orange_concrete", bcs50);
/* 1632 */     a("magenta_concrete", bcs51);
/* 1633 */     a("light_blue_concrete", bcs52);
/* 1634 */     a("yellow_concrete", bcs53);
/* 1635 */     a("lime_concrete", bcs54);
/* 1636 */     a("pink_concrete", bcs55);
/* 1637 */     a("gray_concrete", bcs56);
/* 1638 */     a("light_gray_concrete", bcs57);
/* 1639 */     a("cyan_concrete", bcs58);
/* 1640 */     a("purple_concrete", bcs59);
/* 1641 */     a("blue_concrete", bcs60);
/* 1642 */     a("brown_concrete", bcs61);
/* 1643 */     a("green_concrete", bcs62);
/* 1644 */     a("red_concrete", bcs63);
/* 1645 */     a("black_concrete", bcs64);
/* 1646 */     a("white_concrete_powder", new bdo(bcs49, c.a(bza.u, asc.a).b(0.5F).a(bhr.h)));
/* 1647 */     a("orange_concrete_powder", new bdo(bcs50, c.a(bza.u, asc.b).b(0.5F).a(bhr.h)));
/* 1648 */     a("magenta_concrete_powder", new bdo(bcs51, c.a(bza.u, asc.c).b(0.5F).a(bhr.h)));
/* 1649 */     a("light_blue_concrete_powder", new bdo(bcs52, c.a(bza.u, asc.d).b(0.5F).a(bhr.h)));
/* 1650 */     a("yellow_concrete_powder", new bdo(bcs53, c.a(bza.u, asc.e).b(0.5F).a(bhr.h)));
/* 1651 */     a("lime_concrete_powder", new bdo(bcs54, c.a(bza.u, asc.f).b(0.5F).a(bhr.h)));
/* 1652 */     a("pink_concrete_powder", new bdo(bcs55, c.a(bza.u, asc.g).b(0.5F).a(bhr.h)));
/* 1653 */     a("gray_concrete_powder", new bdo(bcs56, c.a(bza.u, asc.h).b(0.5F).a(bhr.h)));
/* 1654 */     a("light_gray_concrete_powder", new bdo(bcs57, c.a(bza.u, asc.i).b(0.5F).a(bhr.h)));
/* 1655 */     a("cyan_concrete_powder", new bdo(bcs58, c.a(bza.u, asc.j).b(0.5F).a(bhr.h)));
/* 1656 */     a("purple_concrete_powder", new bdo(bcs59, c.a(bza.u, asc.k).b(0.5F).a(bhr.h)));
/* 1657 */     a("blue_concrete_powder", new bdo(bcs60, c.a(bza.u, asc.l).b(0.5F).a(bhr.h)));
/* 1658 */     a("brown_concrete_powder", new bdo(bcs61, c.a(bza.u, asc.m).b(0.5F).a(bhr.h)));
/* 1659 */     a("green_concrete_powder", new bdo(bcs62, c.a(bza.u, asc.n).b(0.5F).a(bhr.h)));
/* 1660 */     a("red_concrete_powder", new bdo(bcs63, c.a(bza.u, asc.o).b(0.5F).a(bhr.h)));
/* 1661 */     a("black_concrete_powder", new bdo(bcs64, c.a(bza.u, asc.p).b(0.5F).a(bhr.h)));
/* 1662 */     bfo bfo = new bfo(c.a(bza.f).a().c().b().a(bhr.m));
/* 1663 */     a("kelp", bfo);
/* 1664 */     a("kelp_plant", new bfp(bfo, c.a(bza.f).a().b().a(bhr.m)));
/* 1665 */     a("dried_kelp_block", new bcs(c.a(bza.s, bzb.B).a(0.5F, 2.5F).a(bhr.c)));
/* 1666 */     a("turtle_egg", new bip(c.a(bza.L, bzb.x).b(0.5F).a(bhr.e).c()));
/* 1667 */     bcs bcs65 = new bcs(c.a(bza.D, bzb.w).a(1.5F, 6.0F));
/* 1668 */     bcs bcs66 = new bcs(c.a(bza.D, bzb.w).a(1.5F, 6.0F));
/* 1669 */     bcs bcs67 = new bcs(c.a(bza.D, bzb.w).a(1.5F, 6.0F));
/* 1670 */     bcs bcs68 = new bcs(c.a(bza.D, bzb.w).a(1.5F, 6.0F));
/* 1671 */     bcs bcs69 = new bcs(c.a(bza.D, bzb.w).a(1.5F, 6.0F));
/* 1672 */     a("dead_tube_coral_block", bcs65);
/* 1673 */     a("dead_brain_coral_block", bcs66);
/* 1674 */     a("dead_bubble_coral_block", bcs67);
/* 1675 */     a("dead_fire_coral_block", bcs68);
/* 1676 */     a("dead_horn_coral_block", bcs69);
/* 1677 */     a("tube_coral_block", new bdq(bcs65, c.a(bza.D, bzb.A).a(1.5F, 6.0F).a(bhr.n)));
/* 1678 */     a("brain_coral_block", new bdq(bcs66, c.a(bza.D, bzb.v).a(1.5F, 6.0F).a(bhr.n)));
/* 1679 */     a("bubble_coral_block", new bdq(bcs67, c.a(bza.D, bzb.z).a(1.5F, 6.0F).a(bhr.n)));
/* 1680 */     a("fire_coral_block", new bdq(bcs68, c.a(bza.D, bzb.D).a(1.5F, 6.0F).a(bhr.n)));
/* 1681 */     a("horn_coral_block", new bdq(bcs69, c.a(bza.D, bzb.t).a(1.5F, 6.0F).a(bhr.n)));
/* 1682 */     bcs bcs70 = new bcj(c.a(bza.D, bzb.w).a().b());
/* 1683 */     bcs bcs71 = new bcj(c.a(bza.D, bzb.w).a().b());
/* 1684 */     bcs bcs72 = new bcj(c.a(bza.D, bzb.w).a().b());
/* 1685 */     bcs bcs73 = new bcj(c.a(bza.D, bzb.w).a().b());
/* 1686 */     bcs bcs74 = new bcj(c.a(bza.D, bzb.w).a().b());
/* 1687 */     a("dead_tube_coral", bcs70);
/* 1688 */     a("dead_brain_coral", bcs71);
/* 1689 */     a("dead_bubble_coral", bcs72);
/* 1690 */     a("dead_fire_coral", bcs73);
/* 1691 */     a("dead_horn_coral", bcs74);
/* 1692 */     a("tube_coral", new bds(bcs70, c.a(bza.f, bzb.A).a().b().a(bhr.m)));
/* 1693 */     a("brain_coral", new bds(bcs71, c.a(bza.f, bzb.v).a().b().a(bhr.m)));
/* 1694 */     a("bubble_coral", new bds(bcs72, c.a(bza.f, bzb.z).a().b().a(bhr.m)));
/* 1695 */     a("fire_coral", new bds(bcs73, c.a(bza.f, bzb.D).a().b().a(bhr.m)));
/* 1696 */     a("horn_coral", new bds(bcs74, c.a(bza.f, bzb.t).a().b().a(bhr.m)));
/* 1697 */     bcs bcs75 = new bcl(c.a(bza.D, bzb.w).a().b());
/* 1698 */     bcs bcs76 = new bcl(c.a(bza.D, bzb.w).a().b());
/* 1699 */     bcs bcs77 = new bcl(c.a(bza.D, bzb.w).a().b());
/* 1700 */     bcs bcs78 = new bcl(c.a(bza.D, bzb.w).a().b());
/* 1701 */     bcs bcs79 = new bcl(c.a(bza.D, bzb.w).a().b());
/* 1702 */     a("dead_tube_coral_wall_fan", bcs75);
/* 1703 */     a("dead_brain_coral_wall_fan", bcs76);
/* 1704 */     a("dead_bubble_coral_wall_fan", bcs77);
/* 1705 */     a("dead_fire_coral_wall_fan", bcs78);
/* 1706 */     a("dead_horn_coral_wall_fan", bcs79);
/* 1707 */     a("tube_coral_wall_fan", new bdt(bcs75, c.a(bza.f, bzb.A).a().b().a(bhr.m)));
/* 1708 */     a("brain_coral_wall_fan", new bdt(bcs76, c.a(bza.f, bzb.v).a().b().a(bhr.m)));
/* 1709 */     a("bubble_coral_wall_fan", new bdt(bcs77, c.a(bza.f, bzb.z).a().b().a(bhr.m)));
/* 1710 */     a("fire_coral_wall_fan", new bdt(bcs78, c.a(bza.f, bzb.D).a().b().a(bhr.m)));
/* 1711 */     a("horn_coral_wall_fan", new bdt(bcs79, c.a(bza.f, bzb.t).a().b().a(bhr.m)));
/* 1712 */     bcs bcs80 = new bci(c.a(bza.D, bzb.w).a().b());
/* 1713 */     bcs bcs81 = new bci(c.a(bza.D, bzb.w).a().b());
/* 1714 */     bcs bcs82 = new bci(c.a(bza.D, bzb.w).a().b());
/* 1715 */     bcs bcs83 = new bci(c.a(bza.D, bzb.w).a().b());
/* 1716 */     bcs bcs84 = new bci(c.a(bza.D, bzb.w).a().b());
/* 1717 */     a("dead_tube_coral_fan", bcs80);
/* 1718 */     a("dead_brain_coral_fan", bcs81);
/* 1719 */     a("dead_bubble_coral_fan", bcs82);
/* 1720 */     a("dead_fire_coral_fan", bcs83);
/* 1721 */     a("dead_horn_coral_fan", bcs84);
/* 1722 */     a("tube_coral_fan", new bdr(bcs80, c.a(bza.f, bzb.A).a().b().a(bhr.m)));
/* 1723 */     a("brain_coral_fan", new bdr(bcs81, c.a(bza.f, bzb.v).a().b().a(bhr.m)));
/* 1724 */     a("bubble_coral_fan", new bdr(bcs82, c.a(bza.f, bzb.z).a().b().a(bhr.m)));
/* 1725 */     a("fire_coral_fan", new bdr(bcs83, c.a(bza.f, bzb.D).a().b().a(bhr.m)));
/* 1726 */     a("horn_coral_fan", new bdr(bcs84, c.a(bza.f, bzb.t).a().b().a(bhr.m)));
/* 1727 */     a("sea_pickle", new bhf(c.a(bza.f, bzb.C).a(3).a(bhr.l)));
/* 1728 */     a("blue_ice", new bcu(c.a(bza.t).b(2.8F).a(0.989F).a(bhr.f)));
/* 1729 */     a("conduit", new bdp(c.a(bza.A, bzb.G).b(3.0F).a(15)));
/*      */     
/* 1731 */     a("void_air", new bcd(c.a(bza.a).a()));
/* 1732 */     a("cave_air", new bcd(c.a(bza.a).a()));
/*      */     
/* 1734 */     a("bubble_column", new bcy(c.a(bza.j).a()));
/*      */     
/* 1736 */     a("structure_block", new bid(c.a(bza.E, bzb.x).a(-1.0F, 3600000.0F)));
/*      */     
/* 1738 */     for (bcs bcs85 : fc.g) {
/* 1739 */       for (UnmodifiableIterator<blc> unmodifiableIterator = bcs85.o().a().iterator(); unmodifiableIterator.hasNext(); ) { blc blc1 = unmodifiableIterator.next();
/* 1740 */         e.b(blc1); }
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void a(pc ☃, bcs bcs1) {
/* 1746 */     fc.g.a(☃, bcs1);
/*      */   }
/*      */   
/*      */   private static void a(String ☃, bcs bcs1) {
/* 1750 */     a(new pc(☃), bcs1);
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\bcs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */