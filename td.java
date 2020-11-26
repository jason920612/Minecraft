/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.util.concurrent.ListenableFuture;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import java.util.function.BooleanSupplier;
/*      */ import java.util.function.Function;
/*      */ import java.util.stream.Collectors;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nonnull;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class td
/*      */   extends axy
/*      */   implements acv
/*      */ {
/*  100 */   private static final Logger a = LogManager.getLogger();
/*      */   
/*      */   private final MinecraftServer F;
/*      */   
/*      */   private final sz G;
/*      */   private final tl H;
/*  106 */   private final Map<UUID, aer> I = Maps.newHashMap();
/*      */   public boolean b;
/*      */   private boolean J;
/*      */   private int K;
/*      */   private final ayk L;
/*  111 */   private final ayj M = new ayj();
/*      */   
/*      */   private final aym<bcs> N;
/*      */   
/*      */   private final aym<byv> O;
/*      */   
/*      */   protected final ajh c;
/*      */   ObjectLinkedOpenHashSet<axj> d;
/*      */   private boolean P;
/*      */   
/*      */   public td(MinecraftServer ☃, ccc ccc1, cck cck1, ccb ccb1, bod bod1, xr xr1) {
/*  122 */     super(ccc1, cck1, ccb1, bod1.e(), xr1, false); this.N = new aym<>(this, ☃ -> (☃ == null || ☃.p().f()), fc.g::b, fc.g::a, this::b); this.O = new aym<>(this, ☃ -> (☃ == null || ☃ == byy.a), fc.h::b, fc.h::a, this::a); this.c = new ajh(this); this.d = new ObjectLinkedOpenHashSet();
/*  123 */     this.F = ☃;
/*  124 */     this.G = new sz(this);
/*  125 */     this.H = new tl(this);
/*      */     
/*  127 */     this.t.a(this);
/*  128 */     this.w = r();
/*      */     
/*  130 */     this.L = new ayk(this);
/*      */     
/*  132 */     P();
/*  133 */     Q();
/*      */     
/*  135 */     d().a(☃.au());
/*      */   }
/*      */ 
/*      */   
/*      */   public td i_() {
/*  140 */     String ☃ = aji.a(this.t);
/*  141 */     aji aji = a(bod.a, aji::new, ☃);
/*  142 */     if (aji == null) {
/*  143 */       this.z = new aji(this);
/*  144 */       a(bod.a, ☃, this.z);
/*      */     } else {
/*  146 */       this.z = aji;
/*  147 */       this.z.a(this);
/*      */     } 
/*      */     
/*  150 */     cfd cfd = a(bod.a, cfd::new, "scoreboard");
/*  151 */     if (cfd == null) {
/*  152 */       cfd = new cfd();
/*  153 */       a(bod.a, "scoreboard", cfd);
/*      */     } 
/*  155 */     cfd.a(this.F.aM());
/*  156 */     this.F.aM().a(new cbn(cfd));
/*      */     
/*  158 */     d().c(this.y.B(), this.y.C());
/*  159 */     d().c(this.y.H());
/*  160 */     d().b(this.y.G());
/*  161 */     d().c(this.y.I());
/*  162 */     d().b(this.y.J());
/*      */     
/*  164 */     if (this.y.E() > 0L) {
/*  165 */       d().a(this.y.D(), this.y.F(), this.y.E());
/*      */     } else {
/*  167 */       d().a(this.y.D());
/*      */     } 
/*      */     
/*  170 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(BooleanSupplier ☃) {
/*  175 */     this.P = true;
/*  176 */     super.a(☃);
/*  177 */     if (g().s() && aj() != adi.d) {
/*  178 */       g().a(adi.d);
/*      */     }
/*  180 */     this.w.f().b().Y_();
/*      */     
/*  182 */     if (j()) {
/*  183 */       if (X().b("doDaylightCycle")) {
/*      */         
/*  185 */         long l = this.y.f() + 24000L;
/*  186 */         this.y.b(l - l % 24000L);
/*      */       } 
/*      */       
/*  189 */       i();
/*      */     } 
/*      */     
/*  192 */     this.A.a("spawner");
/*  193 */     if (X().b("doMobSpawning") && this.y.t() != ayg.h) {
/*      */       
/*  195 */       this.M.a(this, this.C, this.D, (this.y.e() % 400L == 0L));
/*  196 */       v().a(this, this.C, this.D);
/*      */     } 
/*  198 */     this.A.c("chunkSource");
/*  199 */     this.w.a(☃);
/*  200 */     int i = a(1.0F);
/*      */     
/*  202 */     if (i != c()) {
/*  203 */       c(i);
/*      */     }
/*      */ 
/*      */     
/*  207 */     this.y.a(this.y.e() + 1L);
/*  208 */     if (X().b("doDaylightCycle")) {
/*  209 */       this.y.b(this.y.f() + 1L);
/*      */     }
/*      */     
/*  212 */     this.A.c("tickPending");
/*  213 */     q();
/*      */     
/*  215 */     this.A.c("tickBlocks");
/*  216 */     n_();
/*      */     
/*  218 */     this.A.c("chunkMap");
/*  219 */     this.H.c();
/*      */     
/*  221 */     this.A.c("village");
/*  222 */     this.z.a();
/*  223 */     this.c.a();
/*      */     
/*  225 */     this.A.c("portalForcer");
/*  226 */     this.L.a(V());
/*      */     
/*  228 */     this.A.e();
/*      */ 
/*      */     
/*  231 */     an();
/*  232 */     this.P = false;
/*      */   }
/*      */   
/*      */   public boolean j_() {
/*  236 */     return this.P;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public ayu.e a(afc ☃, el el1) {
/*  241 */     List<ayu.e> list = v().a(☃, el1);
/*  242 */     if (list.isEmpty()) {
/*  243 */       return null;
/*      */     }
/*      */     
/*  246 */     return xy.<ayu.e>a(this.s, list);
/*      */   }
/*      */   
/*      */   public boolean a(afc ☃, ayu.e e1, el el1) {
/*  250 */     List<ayu.e> list = v().a(☃, el1);
/*  251 */     if (list == null || list.isEmpty()) {
/*  252 */       return false;
/*      */     }
/*  254 */     return list.contains(e1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void k_() {
/*  259 */     this.J = false;
/*      */     
/*  261 */     if (!this.j.isEmpty()) {
/*  262 */       int ☃ = 0;
/*  263 */       int i = 0;
/*      */       
/*  265 */       for (aog aog : this.j) {
/*  266 */         if (aog.t()) {
/*  267 */           ☃++; continue;
/*  268 */         }  if (aog.cL()) {
/*  269 */           i++;
/*      */         }
/*      */       } 
/*      */       
/*  273 */       this.J = (i > 0 && i >= this.j.size() - ☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public pr l_() {
/*  279 */     return this.F.aM();
/*      */   }
/*      */   
/*      */   protected void i() {
/*  283 */     this.J = false;
/*      */     
/*  285 */     List<aog> ☃ = (List<aog>)this.j.stream().filter(aog::cL).collect(Collectors.toList());
/*  286 */     for (aog aog : ☃) {
/*  287 */       aog.a(false, false, true);
/*      */     }
/*      */     
/*  290 */     if (X().b("doWeatherCycle")) {
/*  291 */       b();
/*      */     }
/*      */   }
/*      */   
/*      */   private void b() {
/*  296 */     this.y.f(0);
/*  297 */     this.y.b(false);
/*  298 */     this.y.e(0);
/*  299 */     this.y.a(false);
/*      */   }
/*      */   
/*      */   public boolean j() {
/*  303 */     if (this.J && !this.B) {
/*      */       
/*  305 */       for (aog ☃ : this.j) {
/*  306 */         if (!☃.t() && !☃.dq()) {
/*  307 */           return false;
/*      */         }
/*      */       } 
/*  310 */       return true;
/*      */     } 
/*  312 */     return false;
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
/*      */   public boolean a(int ☃, int i, boolean bool) {
/*  336 */     return a(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int ☃, int i) {
/*  341 */     return v().b(☃, i);
/*      */   }
/*      */   
/*      */   protected void l() {
/*  345 */     this.A.a("playerCheckLight");
/*      */     
/*  347 */     if (!this.j.isEmpty()) {
/*  348 */       int ☃ = this.s.nextInt(this.j.size());
/*  349 */       aog aog = this.j.get(☃);
/*  350 */       int i = xq.c(aog.q) + this.s.nextInt(11) - 5;
/*  351 */       int j = xq.c(aog.r) + this.s.nextInt(11) - 5;
/*  352 */       int k = xq.c(aog.s) + this.s.nextInt(11) - 5;
/*  353 */       r(new el(i, j, k));
/*      */     } 
/*  355 */     this.A.e();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void n_() {
/*  360 */     l();
/*      */     
/*  362 */     if (this.y.t() == ayg.h) {
/*  363 */       Iterator<bnj> iterator1 = this.H.b();
/*  364 */       while (iterator1.hasNext()) {
/*  365 */         ((bnj)iterator1.next()).d(false);
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/*  370 */     int ☃ = X().c("randomTickSpeed");
/*  371 */     boolean bool1 = Z();
/*  372 */     boolean bool2 = Y();
/*      */     
/*  374 */     this.A.a("pollingChunks");
/*  375 */     Iterator<bnj> iterator = this.H.b();
/*  376 */     while (iterator.hasNext()) {
/*  377 */       this.A.a("getChunk");
/*  378 */       bnj bnj = iterator.next();
/*  379 */       int i = bnj.b * 16;
/*  380 */       int j = bnj.c * 16;
/*      */       
/*  382 */       this.A.c("checkNextLight");
/*  383 */       bnj.x();
/*      */       
/*  385 */       this.A.c("tickChunk");
/*  386 */       bnj.d(false);
/*      */       
/*  388 */       this.A.c("thunder");
/*  389 */       if (bool1 && bool2 && this.s.nextInt(100000) == 0) {
/*  390 */         this.m = this.m * 3 + 1013904223;
/*  391 */         int k = this.m >> 2;
/*      */         
/*  393 */         el el = a(new el(i + (k & 0xF), 0, j + (k >> 8 & 0xF)));
/*  394 */         if (w(el)) {
/*  395 */           adj adj = h(el);
/*      */           
/*  397 */           boolean bool = (X().b("doMobSpawning") && this.s.nextDouble() < adj.b() * 0.01D);
/*  398 */           if (bool) {
/*  399 */             aku aku = new aku(this);
/*  400 */             aku.s(true);
/*  401 */             aku.b_(0);
/*  402 */             aku.b(el.o(), el.p(), el.q());
/*  403 */             a(aku);
/*      */           } 
/*  405 */           d(new amj(this, el.o() + 0.5D, el.p(), el.q() + 0.5D, bool));
/*      */         } 
/*      */       } 
/*      */       
/*  409 */       this.A.c("iceandsnow");
/*  410 */       if (this.s.nextInt(16) == 0) {
/*  411 */         this.m = this.m * 3 + 1013904223;
/*  412 */         int k = this.m >> 2;
/*      */         
/*  414 */         el el1 = a(bor.a.d, new el(i + (k & 0xF), 0, j + (k >> 8 & 0xF)));
/*  415 */         el el2 = el1.b();
/*  416 */         ayu ayu = d(el1);
/*      */         
/*  418 */         if (ayu.a(this, el2)) {
/*  419 */           a(el2, bct.cR.p());
/*      */         }
/*      */         
/*  422 */         if (bool1 && ayu.b(this, el1)) {
/*  423 */           a(el1, bct.cQ.p());
/*      */         }
/*      */         
/*  426 */         if (bool1 && 
/*  427 */           d(el2).c() == ayu.d.b) {
/*  428 */           a_(el2).c().c(this, el2);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  433 */       this.A.c("tickBlocks");
/*  434 */       if (☃ > 0) {
/*  435 */         for (bnk bnk : bnj.c()) {
/*  436 */           if (bnk != bnj.a && bnk.b()) {
/*  437 */             for (int k = 0; k < ☃; k++) {
/*  438 */               this.m = this.m * 3 + 1013904223;
/*  439 */               int m = this.m >> 2;
/*  440 */               int n = m & 0xF;
/*  441 */               int i1 = m >> 8 & 0xF;
/*  442 */               int i2 = m >> 16 & 0xF;
/*      */               
/*  444 */               blc blc = bnk.a(n, i2, i1);
/*  445 */               byw byw = bnk.b(n, i2, i1);
/*  446 */               this.A.a("randomTick");
/*  447 */               if (blc.t()) {
/*  448 */                 blc.b(this, new el(n + i, i2 + bnk.e(), i1 + j), this.s);
/*      */               }
/*  450 */               if (byw.h()) {
/*  451 */                 byw.b(this, new el(n + i, i2 + bnk.e(), i1 + j), this.s);
/*      */               }
/*  453 */               this.A.e();
/*      */             } 
/*      */           }
/*      */         } 
/*      */       }
/*  458 */       this.A.e();
/*      */     } 
/*  460 */     this.A.e();
/*      */   }
/*      */   
/*      */   protected el a(el ☃) {
/*  464 */     el el1 = a(bor.a.d, ☃);
/*  465 */     cea cea = (new cea(el1, new el(el1.o(), aa(), el1.q()))).g(3.0D);
/*      */     
/*  467 */     List<afa> list = a(afa.class, cea, ☃ -> (☃ != null && ☃.aF() && e(☃.bH())));
/*      */     
/*  469 */     if (!list.isEmpty()) {
/*  470 */       return ((afa)list.get(this.s.nextInt(list.size()))).bH();
/*      */     }
/*      */     
/*  473 */     if (el1.p() == -1) {
/*  474 */       el1 = el1.b(2);
/*      */     }
/*      */     
/*  477 */     return el1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void o_() {
/*  482 */     if (this.j.isEmpty()) {
/*  483 */       if (this.K++ >= 300) {
/*      */         return;
/*      */       }
/*      */     } else {
/*  487 */       p();
/*      */     } 
/*      */     
/*  490 */     this.t.l();
/*  491 */     super.o_();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void p_() {
/*  496 */     super.p_();
/*      */     
/*  498 */     this.A.c("players");
/*  499 */     for (int ☃ = 0; ☃ < this.j.size(); ☃++) {
/*  500 */       aer aer1 = this.j.get(☃);
/*      */       
/*  502 */       aer aer2 = aer1.bU();
/*  503 */       if (aer2 != null) {
/*  504 */         if (aer2.G || !aer2.w(aer1)) {
/*  505 */           aer1.S_();
/*      */         } else {
/*      */           continue;
/*      */         } 
/*      */       }
/*      */       
/*  511 */       this.A.a("tick");
/*  512 */       if (!aer1.G) {
/*      */         try {
/*  514 */           g(aer1);
/*  515 */         } catch (Throwable throwable) {
/*  516 */           b b = b.a(throwable, "Ticking player");
/*  517 */           c c = b.a("Player being ticked");
/*      */           
/*  519 */           aer1.a(c);
/*      */           
/*  521 */           throw new h(b);
/*      */         } 
/*      */       }
/*  524 */       this.A.e();
/*      */       
/*  526 */       this.A.a("remove");
/*  527 */       if (aer1.G) {
/*  528 */         int i = aer1.ae;
/*  529 */         int j = aer1.ag;
/*  530 */         if (aer1.ad && a(i, j, true)) {
/*  531 */           c(i, j).b(aer1);
/*      */         }
/*  533 */         this.f.remove(aer1);
/*  534 */         c(aer1);
/*      */       } 
/*  536 */       this.A.e();
/*      */       continue;
/*      */     } 
/*      */   }
/*      */   public void p() {
/*  541 */     this.K = 0;
/*      */   }
/*      */   
/*      */   public void q() {
/*  545 */     if (this.y.t() == ayg.h) {
/*      */       return;
/*      */     }
/*      */     
/*  549 */     this.N.a();
/*  550 */     this.O.a();
/*      */   }
/*      */   
/*      */   private void a(ayp<byv> ☃) {
/*  554 */     byw byw = b(☃.a);
/*  555 */     if (byw.c() == ☃.a()) {
/*  556 */       byw.a(this, ☃.a);
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(ayp<bcs> ☃) {
/*  561 */     blc blc = a_(☃.a);
/*  562 */     if (blc.c() == ☃.a()) {
/*  563 */       blc.a(this, ☃.a, this.s);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃, boolean bool) {
/*  569 */     if (!al() && (☃ instanceof ajq || ☃ instanceof akl)) {
/*  570 */       ☃.V();
/*      */     }
/*  572 */     if (!ak() && ☃ instanceof aoa) {
/*  573 */       ☃.V();
/*      */     }
/*  575 */     super.a(☃, bool);
/*      */   }
/*      */   
/*      */   private boolean ak() {
/*  579 */     return this.F.U();
/*      */   }
/*      */   
/*      */   private boolean al() {
/*  583 */     return this.F.T();
/*      */   }
/*      */ 
/*      */   
/*      */   protected bnc r() {
/*  588 */     bnw ☃ = this.x.a(this.t);
/*  589 */     return new tc(this, ☃, this.t.n(), (acv)this.F);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aog ☃, el el1) {
/*  594 */     return (!this.F.a(this, el1, ☃) && d().a(el1));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ayd ☃) {
/*  599 */     if (!this.y.v()) {
/*      */       try {
/*  601 */         b(☃);
/*  602 */         if (this.y.t() == ayg.h) {
/*  603 */           am();
/*      */         }
/*  605 */         super.a(☃);
/*  606 */       } catch (Throwable throwable) {
/*  607 */         b b = b.a(throwable, "Exception initializing level");
/*      */         
/*      */         try {
/*  610 */           a(b);
/*  611 */         } catch (Throwable throwable1) {}
/*      */ 
/*      */         
/*  614 */         throw new h(b);
/*      */       } 
/*  616 */       this.y.d(true);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void am() {
/*  621 */     this.y.f(false);
/*  622 */     this.y.c(true);
/*  623 */     this.y.b(false);
/*  624 */     this.y.a(false);
/*  625 */     this.y.g(1000000000);
/*  626 */     this.y.b(6000L);
/*  627 */     this.y.a(axv.e);
/*  628 */     this.y.g(false);
/*  629 */     this.y.a(adi.a);
/*  630 */     this.y.e(true);
/*  631 */     X().a("doDaylightCycle", "false", this.F);
/*      */   }
/*      */   
/*      */   private void b(ayd ☃) {
/*  635 */     if (!this.t.p()) {
/*  636 */       this.y.a(el.a.b(this.w.f().d()));
/*      */       
/*      */       return;
/*      */     } 
/*  640 */     if (this.y.t() == ayg.h) {
/*  641 */       this.y.a(el.a.a());
/*      */       
/*      */       return;
/*      */     } 
/*  645 */     ayw ayw = this.w.f().b();
/*  646 */     List<ayu> list = ayw.a();
/*  647 */     Random random = new Random(r_());
/*      */     
/*  649 */     el el = ayw.a(0, 0, 256, list, random);
/*  650 */     axm axm = (el == null) ? new axm(0, 0) : new axm(el);
/*      */     
/*  652 */     if (el == null) {
/*  653 */       a.warn("Unable to find spawn biome");
/*      */     }
/*      */     
/*  656 */     boolean bool = false;
/*  657 */     for (bcs bcs : wv.F.a()) {
/*  658 */       if (ayw.b().contains(bcs.p())) {
/*  659 */         bool = true;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*  664 */     this.y.a(axm.h().a(8, this.w.f().d(), 8));
/*      */     
/*  666 */     int i = 0;
/*  667 */     int j = 0;
/*  668 */     int k = 0;
/*  669 */     int m = -1;
/*  670 */     int n = 32;
/*  671 */     for (int i1 = 0; i1 < 1024; i1++) {
/*  672 */       if (i > -16 && i <= 16 && j > -16 && j <= 16) {
/*  673 */         el el1 = this.t.a(new axm(axm.a + i, axm.b + j), bool);
/*  674 */         if (el1 != null) {
/*  675 */           this.y.a(el1);
/*      */           break;
/*      */         } 
/*      */       } 
/*  679 */       if (i == j || (i < 0 && i == -j) || (i > 0 && i == 1 - j)) {
/*  680 */         int i2 = k;
/*  681 */         k = -m;
/*  682 */         m = i2;
/*      */       } 
/*  684 */       i += k;
/*  685 */       j += m;
/*      */     } 
/*      */     
/*  688 */     if (☃.c()) {
/*  689 */       s();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void s() {
/*  696 */     bpg ☃ = new bpg();
/*  697 */     for (int i = 0; i < 10; i++) {
/*  698 */       int j = this.y.b() + this.s.nextInt(6) - this.s.nextInt(6);
/*  699 */       int k = this.y.d() + this.s.nextInt(6) - this.s.nextInt(6);
/*      */       
/*  701 */       el el = a(bor.a.e, new el(j, 0, k)).a();
/*      */       
/*  703 */       if (☃.a(this, (bmy)this.w.f(), this.s, el, bqp.e)) {
/*      */         break;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public el t() {
/*  711 */     return this.t.d();
/*      */   }
/*      */   
/*      */   public void a(boolean ☃, @Nullable xs xs1) throws aya {
/*  715 */     tc tc = v();
/*  716 */     if (!tc.d()) {
/*      */       return;
/*      */     }
/*      */     
/*  720 */     if (xs1 != null) {
/*  721 */       xs1.a(new ir("menu.savingLevel", new Object[0]));
/*      */     }
/*  723 */     a();
/*      */     
/*  725 */     if (xs1 != null) {
/*  726 */       xs1.c(new ir("menu.savingChunks", new Object[0]));
/*      */     }
/*  728 */     tc.a(☃);
/*      */ 
/*      */     
/*  731 */     List<bnj> list = Lists.newArrayList(tc.a());
/*  732 */     for (bnj bnj : list) {
/*  733 */       if (bnj == null) {
/*      */         continue;
/*      */       }
/*  736 */       if (!this.H.a(bnj.b, bnj.c)) {
/*  737 */         tc.a(bnj);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void u() {
/*  743 */     tc ☃ = v();
/*  744 */     if (!☃.d()) {
/*      */       return;
/*      */     }
/*  747 */     ☃.c();
/*      */   }
/*      */   
/*      */   protected void a() throws aya {
/*  751 */     U();
/*      */     
/*  753 */     for (td ☃ : this.F.w()) {
/*  754 */       if (☃ instanceof sy) {
/*  755 */         ((sy)☃).t_();
/*      */       }
/*      */     } 
/*      */     
/*  759 */     this.y.a(d().h());
/*  760 */     this.y.d(d().f());
/*  761 */     this.y.c(d().g());
/*  762 */     this.y.e(d().m());
/*  763 */     this.y.f(d().n());
/*  764 */     this.y.h(d().q());
/*  765 */     this.y.i(d().p());
/*      */     
/*  767 */     this.y.b(d().j());
/*  768 */     this.y.c(d().i());
/*  769 */     this.y.c(this.F.aP().c());
/*      */     
/*  771 */     this.x.a(this.y, this.F.ac().t());
/*  772 */     h().a();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aer ☃) {
/*  777 */     if (j(☃)) {
/*  778 */       return super.a(☃);
/*      */     }
/*  780 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(Stream<aer> ☃) {
/*  785 */     ☃.forEach(☃ -> {
/*      */           if (j(☃)) {
/*      */             this.f.add(☃);
/*      */             b(☃);
/*      */           } 
/*      */         });
/*      */   }
/*      */   
/*      */   private boolean j(aer ☃) {
/*  794 */     if (☃.G) {
/*  795 */       a.warn("Tried to add entity {} but it was marked as removed already", aev.a(☃.P()));
/*  796 */       return false;
/*      */     } 
/*  798 */     UUID uUID = ☃.bt();
/*  799 */     if (this.I.containsKey(uUID)) {
/*  800 */       aer aer1 = this.I.get(uUID);
/*  801 */       if (this.g.contains(aer1)) {
/*      */         
/*  803 */         this.g.remove(aer1);
/*      */       } else {
/*  805 */         if (!(☃ instanceof aog)) {
/*  806 */           a.warn("Keeping entity {} that already exists with UUID {}", aev.a(aer1.P()), uUID.toString());
/*  807 */           return false;
/*      */         } 
/*  809 */         a.warn("Force-added player with duplicate UUID {}", uUID.toString());
/*      */       } 
/*  811 */       f(aer1);
/*      */     } 
/*  813 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(aer ☃) {
/*  818 */     super.b(☃);
/*  819 */     this.l.a(☃.Q(), ☃);
/*  820 */     this.I.put(☃.bt(), ☃);
/*  821 */     aer[] arrayOfAer = ☃.bi();
/*  822 */     if (arrayOfAer != null) {
/*  823 */       for (aer aer1 : arrayOfAer) {
/*  824 */         this.l.a(aer1.Q(), aer1);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(aer ☃) {
/*  831 */     super.c(☃);
/*  832 */     this.l.d(☃.Q());
/*  833 */     this.I.remove(☃.bt());
/*  834 */     aer[] arrayOfAer = ☃.bi();
/*  835 */     if (arrayOfAer != null) {
/*  836 */       for (aer aer1 : arrayOfAer) {
/*  837 */         this.l.d(aer1.Q());
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean d(aer ☃) {
/*  844 */     if (super.d(☃)) {
/*  845 */       this.F.ac().a(null, ☃.q, ☃.r, ☃.s, 512.0D, this.t.q(), new jb(☃));
/*  846 */       return true;
/*      */     } 
/*  848 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃, byte b) {
/*  853 */     A().b(☃, new kb(☃, b));
/*      */   }
/*      */ 
/*      */   
/*      */   public tc v() {
/*  858 */     return (tc)super.H();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public axr a(@Nullable aer ☃, aea aea1, double d1, double d2, double d3, float f, boolean bool1, boolean bool2) {
/*  865 */     axr axr = new axr(this, ☃, d1, d2, d3, f, bool1, bool2);
/*  866 */     if (aea1 != null) {
/*  867 */       axr.a(aea1);
/*      */     }
/*  869 */     axr.a();
/*  870 */     axr.a(false);
/*      */     
/*  872 */     if (!bool2) {
/*  873 */       axr.e();
/*      */     }
/*      */     
/*  876 */     for (aog aog : this.j) {
/*  877 */       if (aog.d(d1, d2, d3) < 4096.0D) {
/*  878 */         ((tf)aog).a.a(new kc(d1, d2, d3, f, axr.f(), axr.c().get(aog)));
/*      */       }
/*      */     } 
/*      */     
/*  882 */     return axr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(el ☃, bcs bcs1, int i, int j) {
/*  887 */     this.d.add(new axj(☃, bcs1, i, j));
/*      */   }
/*      */   
/*      */   private void an() {
/*  891 */     while (!this.d.isEmpty()) {
/*  892 */       axj ☃ = (axj)this.d.removeFirst();
/*  893 */       if (a(☃)) {
/*  894 */         this.F.ac().a(null, ☃.a().o(), ☃.a().p(), ☃.a().q(), 64.0D, this.t.q(), new jj(☃.a(), ☃.b(), ☃.c(), ☃.d()));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean a(axj ☃) {
/*  900 */     blc blc = a_(☃.a());
/*  901 */     if (blc.c() == ☃.b()) {
/*  902 */       return blc.a(this, ☃.a(), ☃.c(), ☃.d());
/*      */     }
/*  904 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void close() {
/*  909 */     this.x.a();
/*  910 */     super.close();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void w() {
/*  915 */     boolean ☃ = Z();
/*  916 */     super.w();
/*      */     
/*  918 */     if (this.o != this.p) {
/*  919 */       this.F.ac().a(new ke(7, this.p), this.t.q());
/*      */     }
/*  921 */     if (this.q != this.r) {
/*  922 */       this.F.ac().a(new ke(8, this.r), this.t.q());
/*      */     }
/*      */     
/*  925 */     if (☃ != Z()) {
/*  926 */       if (☃) {
/*  927 */         this.F.ac().a(new ke(2, 0.0F));
/*      */       } else {
/*  929 */         this.F.ac().a(new ke(1, 0.0F));
/*      */       } 
/*  931 */       this.F.ac().a(new ke(7, this.p));
/*  932 */       this.F.ac().a(new ke(8, this.r));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public aym<bcs> x() {
/*  938 */     return this.N;
/*      */   }
/*      */ 
/*      */   
/*      */   public aym<byv> y() {
/*  943 */     return this.O;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nonnull
/*      */   public MinecraftServer z() {
/*  949 */     return this.F;
/*      */   }
/*      */   
/*      */   public sz A() {
/*  953 */     return this.G;
/*      */   }
/*      */   
/*      */   public tl B() {
/*  957 */     return this.H;
/*      */   }
/*      */   
/*      */   public ayk C() {
/*  961 */     return this.L;
/*      */   }
/*      */   
/*      */   public bxm D() {
/*  965 */     return this.x.h();
/*      */   }
/*      */   
/*      */   public <T extends fk> int a(T ☃, double d1, double d2, double d3, int i, double d4, double d5, double d6, double d7) {
/*  969 */     ki ki = new ki(☃, false, (float)d1, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, i);
/*  970 */     int j = 0;
/*      */     
/*  972 */     for (int k = 0; k < this.j.size(); k++) {
/*  973 */       tf tf = (tf)this.j.get(k);
/*      */       
/*  975 */       if (a(tf, false, d1, d2, d3, ki)) {
/*  976 */         j++;
/*      */       }
/*      */     } 
/*      */     
/*  980 */     return j;
/*      */   }
/*      */   
/*      */   public <T extends fk> boolean a(tf ☃, T t, boolean bool, double d1, double d2, double d3, int i, double d4, double d5, double d6, double d7) {
/*  984 */     iv<?> iv = new ki(t, bool, (float)d1, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, i);
/*      */     
/*  986 */     return a(☃, bool, d1, d2, d3, iv);
/*      */   }
/*      */   
/*      */   private boolean a(tf ☃, boolean bool, double d1, double d2, double d3, iv<?> iv1) {
/*  990 */     if (☃.s() != this) {
/*  991 */       return false;
/*      */     }
/*      */     
/*  994 */     el el = ☃.bH();
/*  995 */     double d = el.f(d1, d2, d3);
/*      */     
/*  997 */     if (d <= 1024.0D || (bool && d <= 262144.0D)) {
/*  998 */       ☃.a.a(iv1);
/*  999 */       return true;
/*      */     } 
/*      */     
/* 1002 */     return false;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aer a(UUID ☃) {
/* 1007 */     return this.I.get(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ListenableFuture<Object> a(Runnable ☃) {
/* 1017 */     return this.F.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean av() {
/* 1022 */     return this.F.av();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public el a(String ☃, el el1, int i, boolean bool) {
/* 1028 */     return v().a(this, ☃, el1, i, bool);
/*      */   }
/*      */ 
/*      */   
/*      */   public avl E() {
/* 1033 */     return this.F.aK();
/*      */   }
/*      */ 
/*      */   
/*      */   public xb F() {
/* 1038 */     return this.F.aL();
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\td.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */