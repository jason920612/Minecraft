/*      */ import com.google.common.collect.HashMultimap;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Multimap;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
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
/*      */ public class ata
/*      */   implements axx
/*      */ {
/*      */   private static final atd a;
/*      */   private static final atd b;
/*      */   private static final atd c;
/*      */   private static final atd d;
/*   52 */   public static final Map<bcs, ata> f = Maps.newHashMap(); static {
/*   53 */     a = ((☃, axy1, afa1) -> ☃.f() ? 1.0F : 0.0F);
/*   54 */     b = ((☃, axy1, afa1) -> xq.a(☃.g() / ☃.h(), 0.0F, 1.0F));
/*   55 */     c = ((☃, axy1, afa1) -> (afa1 == null || afa1.cS() == aez.b) ? 0.0F : 1.0F);
/*   56 */     d = ((☃, axy1, afa1) -> (afa1 instanceof aog) ? ((aog)afa1).dI().a(☃.b(), 0.0F) : 0.0F);
/*      */   }
/*   58 */   protected static final UUID g = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
/*   59 */   protected static final UUID h = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
/*      */   
/*   61 */   protected static Random i = new Random();
/*      */ 
/*      */   
/*      */   public static int a(ata ☃) {
/*   65 */     return (☃ == null) ? 0 : fc.s.a(☃);
/*      */   }
/*      */   
/*      */   public static ata b(int ☃) {
/*   69 */     return fc.s.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static ata a(bcs ☃) {
/*   75 */     ata ata1 = f.get(☃);
/*   76 */     return (ata1 == null) ? atf.a : ata1;
/*      */   }
/*      */   
/*   79 */   private final Map<pc, atd> e = Maps.newHashMap();
/*      */   
/*      */   protected final ary j;
/*      */   
/*      */   private final atq k;
/*      */   
/*      */   private final int l;
/*      */   
/*      */   private final int m;
/*      */   private final ata n;
/*      */   @Nullable
/*      */   private String o;
/*      */   
/*      */   public ata(a ☃) {
/*   93 */     a(new pc("lefthanded"), c);
/*   94 */     a(new pc("cooldown"), d);
/*      */     
/*   96 */     this.j = a.a(☃);
/*   97 */     this.k = a.b(☃);
/*   98 */     this.n = a.c(☃);
/*   99 */     this.m = a.d(☃);
/*  100 */     this.l = a.e(☃);
/*      */     
/*  102 */     if (this.m > 0) {
/*  103 */       a(new pc("damaged"), a);
/*  104 */       a(new pc("damage"), b);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static class a {
/*  109 */     private int a = 64;
/*      */     private int b;
/*      */     private ata c;
/*      */     private ary d;
/*  113 */     private atq e = atq.a;
/*      */     
/*      */     public a a(int ☃) {
/*  116 */       if (this.b > 0) {
/*  117 */         throw new RuntimeException("Unable to have damage AND stack.");
/*      */       }
/*  119 */       this.a = ☃;
/*  120 */       return this;
/*      */     }
/*      */     
/*      */     public a b(int ☃) {
/*  124 */       return (this.b == 0) ? c(☃) : this;
/*      */     }
/*      */     
/*      */     private a c(int ☃) {
/*  128 */       this.b = ☃;
/*  129 */       this.a = 1;
/*  130 */       return this;
/*      */     }
/*      */     
/*      */     public a a(ata ☃) {
/*  134 */       this.c = ☃;
/*  135 */       return this;
/*      */     }
/*      */     
/*      */     public a a(ary ☃) {
/*  139 */       this.d = ☃;
/*  140 */       return this;
/*      */     }
/*      */     
/*      */     public a a(atq ☃) {
/*  144 */       this.e = ☃;
/*  145 */       return this;
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
/*      */   public boolean a(gy ☃) {
/*  159 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(blc ☃, axy axy1, el el1, aog aog1) {
/*  163 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public ata h() {
/*  168 */     return this;
/*      */   }
/*      */   
/*      */   public final void a(pc ☃, atd atd1) {
/*  172 */     this.e.put(☃, atd1);
/*      */   }
/*      */   
/*      */   public adm a(aup ☃) {
/*  176 */     return adm.b;
/*      */   }
/*      */   
/*      */   public float a(ate ☃, blc blc1) {
/*  180 */     return 1.0F;
/*      */   }
/*      */   
/*      */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  184 */     return new adn<>(adm.b, aog1.b(adk1));
/*      */   }
/*      */   
/*      */   public ate a(ate ☃, axy axy1, afa afa1) {
/*  188 */     return ☃;
/*      */   }
/*      */   
/*      */   public final int i() {
/*  192 */     return this.l;
/*      */   }
/*      */   
/*      */   public final int j() {
/*  196 */     return this.m;
/*      */   }
/*      */   
/*      */   public boolean k() {
/*  200 */     return (this.m > 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(ate ☃, afa afa1, afa afa2) {
/*  207 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(ate ☃, axy axy1, blc blc1, el el1, afa afa1) {
/*  214 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(blc ☃) {
/*  218 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(ate ☃, aog aog1, afa afa1, adk adk1) {
/*  222 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String m() {
/*  230 */     if (this.o == null) {
/*  231 */       this.o = k.a("item", fc.s.b(this));
/*      */     }
/*  233 */     return this.o;
/*      */   }
/*      */   
/*      */   public String a() {
/*  237 */     return m();
/*      */   }
/*      */   
/*      */   public String h(ate ☃) {
/*  241 */     return a();
/*      */   }
/*      */   
/*      */   public boolean n() {
/*  245 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final ata o() {
/*  251 */     return this.n;
/*      */   }
/*      */   
/*      */   public boolean p() {
/*  255 */     return (this.n != null);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ate ☃, axy axy1, aer aer1, int i, boolean bool) {}
/*      */ 
/*      */   
/*      */   public void b(ate ☃, axy axy1, aog aog1) {}
/*      */   
/*      */   public boolean W_() {
/*  265 */     return false;
/*      */   }
/*      */   
/*      */   public auo d(ate ☃) {
/*  269 */     return auo.a;
/*      */   }
/*      */   
/*      */   public int c(ate ☃) {
/*  273 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ate ☃, axy axy1, afa afa1, int i) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public ij i(ate ☃) {
/*  283 */     return new ir(h(☃), new Object[0]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public atq j(ate ☃) {
/*  291 */     if (!☃.w()) {
/*  292 */       return this.k;
/*      */     }
/*      */     
/*  295 */     switch (null.a[this.k.ordinal()]) {
/*      */       case 1:
/*      */       case 2:
/*  298 */         return atq.c;
/*      */       
/*      */       case 3:
/*  301 */         return atq.d;
/*      */     } 
/*      */ 
/*      */     
/*  305 */     return this.k;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(ate ☃) {
/*  310 */     return (i() == 1 && k());
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected ceb a(axy ☃, aog aog1, boolean bool) {
/*  315 */     float f1 = aog1.x;
/*  316 */     float f2 = aog1.w;
/*      */     
/*  318 */     double d1 = aog1.q;
/*  319 */     double d2 = aog1.r + aog1.bF();
/*  320 */     double d3 = aog1.s;
/*      */     
/*  322 */     cee cee1 = new cee(d1, d2, d3);
/*      */     
/*  324 */     float f3 = xq.b(-f2 * 0.017453292F - 3.1415927F);
/*  325 */     float f4 = xq.a(-f2 * 0.017453292F - 3.1415927F);
/*  326 */     float f5 = -xq.b(-f1 * 0.017453292F);
/*  327 */     float f6 = xq.a(-f1 * 0.017453292F);
/*      */     
/*  329 */     float f7 = f4 * f5;
/*  330 */     float f8 = f6;
/*  331 */     float f9 = f3 * f5;
/*      */     
/*  333 */     double d4 = 5.0D;
/*  334 */     cee cee2 = cee1.b(f7 * 5.0D, f8 * 5.0D, f9 * 5.0D);
/*      */     
/*  336 */     return ☃.a(cee1, cee2, bool ? cec.b : cec.a, false, false);
/*      */   }
/*      */   
/*      */   public int c() {
/*  340 */     return 0;
/*      */   }
/*      */   
/*      */   public void a(ary ☃, ez<ate> ez1) {
/*  344 */     if (a(☃)) {
/*  345 */       ez1.add(new ate(this));
/*      */     }
/*      */   }
/*      */   
/*      */   protected boolean a(ary ☃) {
/*  350 */     ary ary1 = q();
/*  351 */     return (ary1 != null && (☃ == ary.g || ☃ == ary1));
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final ary q() {
/*  356 */     return this.j;
/*      */   }
/*      */   
/*      */   public boolean a(ate ☃, ate ate1) {
/*  360 */     return false;
/*      */   }
/*      */   
/*      */   public Multimap<String, afo> a(aew ☃) {
/*  364 */     return (Multimap<String, afo>)HashMultimap.create();
/*      */   }
/*      */   
/*      */   public static void r() {
/*  368 */     a(bct.a, new ara(bct.a, new a()));
/*  369 */     a(bct.b, ary.b);
/*  370 */     a(bct.c, ary.b);
/*  371 */     a(bct.d, ary.b);
/*  372 */     a(bct.e, ary.b);
/*  373 */     a(bct.f, ary.b);
/*  374 */     a(bct.g, ary.b);
/*  375 */     a(bct.h, ary.b);
/*  376 */     a(bct.i, ary.b);
/*  377 */     a(bct.j, ary.b);
/*  378 */     a(bct.k, ary.b);
/*  379 */     a(bct.l, ary.b);
/*  380 */     a(bct.m, ary.b);
/*  381 */     a(bct.n, ary.b);
/*  382 */     a(bct.o, ary.b);
/*  383 */     a(bct.p, ary.b);
/*  384 */     a(bct.q, ary.b);
/*  385 */     a(bct.r, ary.b);
/*  386 */     a(bct.s, ary.b);
/*  387 */     a(bct.t, ary.c);
/*  388 */     a(bct.u, ary.c);
/*  389 */     a(bct.v, ary.c);
/*  390 */     a(bct.w, ary.c);
/*  391 */     a(bct.x, ary.c);
/*  392 */     a(bct.y, ary.c);
/*  393 */     a(bct.z, ary.b);
/*  394 */     a(bct.D, ary.b);
/*  395 */     a(bct.E, ary.b);
/*  396 */     a(bct.F, ary.b);
/*  397 */     a(bct.G, ary.b);
/*  398 */     a(bct.H, ary.b);
/*  399 */     a(bct.I, ary.b);
/*  400 */     a(bct.J, ary.b);
/*  401 */     a(bct.K, ary.b);
/*  402 */     a(bct.L, ary.b);
/*  403 */     a(bct.M, ary.b);
/*  404 */     a(bct.N, ary.b);
/*  405 */     a(bct.O, ary.b);
/*  406 */     a(bct.P, ary.b);
/*  407 */     a(bct.Q, ary.b);
/*  408 */     a(bct.R, ary.b);
/*  409 */     a(bct.S, ary.b);
/*  410 */     a(bct.T, ary.b);
/*  411 */     a(bct.U, ary.b);
/*  412 */     a(bct.ab, ary.b);
/*  413 */     a(bct.ac, ary.b);
/*  414 */     a(bct.ad, ary.b);
/*  415 */     a(bct.ae, ary.b);
/*  416 */     a(bct.af, ary.b);
/*  417 */     a(bct.ag, ary.b);
/*  418 */     a(bct.V, ary.b);
/*  419 */     a(bct.W, ary.b);
/*  420 */     a(bct.X, ary.b);
/*  421 */     a(bct.Y, ary.b);
/*  422 */     a(bct.Z, ary.b);
/*  423 */     a(bct.aa, ary.b);
/*  424 */     a(bct.ah, ary.c);
/*  425 */     a(bct.ai, ary.c);
/*  426 */     a(bct.aj, ary.c);
/*  427 */     a(bct.ak, ary.c);
/*  428 */     a(bct.al, ary.c);
/*  429 */     a(bct.am, ary.c);
/*  430 */     a(bct.an, ary.b);
/*  431 */     a(bct.ao, ary.b);
/*  432 */     a(bct.ap, ary.b);
/*  433 */     a(bct.aq, ary.b);
/*  434 */     a(bct.ar, ary.b);
/*  435 */     a(bct.as, ary.d);
/*  436 */     a(bct.at, ary.b);
/*  437 */     a(bct.au, ary.b);
/*  438 */     a(bct.av, ary.b);
/*  439 */     a(bct.aw, ary.d);
/*  440 */     a(bct.aN, ary.e);
/*  441 */     a(bct.aO, ary.e);
/*  442 */     a(bct.aP, ary.d);
/*  443 */     a(bct.aQ, ary.c);
/*  444 */     a(bct.aR, ary.c);
/*  445 */     a(bct.aS, ary.c);
/*  446 */     a(bct.aT, ary.c);
/*  447 */     a(bct.aU, ary.c);
/*  448 */     a(bct.kn, ary.c);
/*  449 */     a(bct.aW, ary.d);
/*  450 */     a(bct.aY, ary.b);
/*  451 */     a(bct.aZ, ary.b);
/*  452 */     a(bct.ba, ary.b);
/*  453 */     a(bct.bb, ary.b);
/*  454 */     a(bct.bc, ary.b);
/*  455 */     a(bct.bd, ary.b);
/*  456 */     a(bct.be, ary.b);
/*  457 */     a(bct.bf, ary.b);
/*  458 */     a(bct.bg, ary.b);
/*  459 */     a(bct.bh, ary.b);
/*  460 */     a(bct.bi, ary.b);
/*  461 */     a(bct.bj, ary.b);
/*  462 */     a(bct.bk, ary.b);
/*  463 */     a(bct.bl, ary.b);
/*  464 */     a(bct.bm, ary.b);
/*  465 */     a(bct.bn, ary.b);
/*  466 */     a(bct.bp, ary.c);
/*  467 */     a(bct.bq, ary.c);
/*  468 */     a(bct.br, ary.c);
/*  469 */     a(bct.bs, ary.c);
/*  470 */     a(bct.bt, ary.c);
/*  471 */     a(bct.bu, ary.c);
/*  472 */     a(bct.bv, ary.c);
/*  473 */     a(bct.bw, ary.c);
/*  474 */     a(bct.bx, ary.c);
/*  475 */     a(bct.by, ary.c);
/*  476 */     a(bct.bz, ary.c);
/*  477 */     a(bct.bA, ary.c);
/*  478 */     a(bct.bB, ary.b);
/*  479 */     a(bct.bC, ary.b);
/*  480 */     a(bct.bD, ary.b);
/*  481 */     a(bct.bE, ary.b);
/*  482 */     a(bct.bF, ary.b);
/*  483 */     a(bct.bG, ary.b);
/*  484 */     a(bct.bH, ary.b);
/*  485 */     a(bct.bI, ary.b);
/*  486 */     a(bct.bJ, ary.b);
/*  487 */     a(bct.bK, ary.b);
/*  488 */     a(bct.bL, ary.b);
/*  489 */     a(bct.bM, ary.b);
/*  490 */     a(bct.bN, ary.b);
/*  491 */     a(bct.bO, ary.b);
/*  492 */     a(bct.bP, ary.b);
/*  493 */     a(bct.bQ, ary.b);
/*  494 */     a(bct.bR, ary.b);
/*  495 */     a(bct.bS, ary.b);
/*  496 */     a(bct.bT, ary.b);
/*  497 */     a(bct.bU, ary.b);
/*  498 */     a(bct.bV, ary.b);
/*  499 */     a(bct.bY, ary.b);
/*  500 */     a(bct.bZ, ary.b);
/*  501 */     a(bct.bX, ary.b);
/*  502 */     a(bct.bW, ary.b);
/*  503 */     a(bct.ca, ary.b);
/*  504 */     a(bct.cb, ary.d);
/*  505 */     a(bct.cc, ary.b);
/*  506 */     a(bct.cd, ary.b);
/*  507 */     a(bct.ce, ary.b);
/*  508 */     a(new auf(bct.cf, bct.cg, (new a()).a(ary.c)));
/*  509 */     a(bct.hX, ary.c);
/*  510 */     a(bct.hY, ary.c);
/*  511 */     a(bct.hZ, ary.c);
/*  512 */     a(bct.ia, ary.b);
/*  513 */     a(bct.ib, ary.b);
/*  514 */     a(bct.ic, ary.b);
/*  515 */     b(bct.ci);
/*  516 */     a(bct.cj, ary.b);
/*  517 */     a(bct.ck, ary.c);
/*  518 */     a(bct.cm, ary.b);
/*  519 */     a(bct.cn, ary.b);
/*  520 */     a(bct.co, ary.c);
/*  521 */     a(bct.cq, ary.c);
/*  522 */     a(bct.cr, ary.c);
/*  523 */     a(bct.cz, ary.c);
/*  524 */     a(bct.cA, ary.e);
/*  525 */     a(bct.cB, ary.b);
/*  526 */     a(bct.cD, ary.d);
/*  527 */     a(bct.cE, ary.d);
/*  528 */     a(bct.cG, ary.d);
/*  529 */     a(bct.cH, ary.d);
/*  530 */     a(bct.cI, ary.d);
/*  531 */     a(bct.cJ, ary.d);
/*  532 */     a(bct.cK, ary.d);
/*  533 */     a(bct.cL, ary.d);
/*  534 */     a(bct.cM, ary.b);
/*  535 */     a(new auf(bct.cN, bct.cO, (new a()).a(ary.d)));
/*  536 */     a(bct.cP, ary.d);
/*  537 */     a(bct.cQ, ary.c);
/*  538 */     a(bct.cR, ary.b);
/*  539 */     a(bct.cS, ary.b);
/*  540 */     a(bct.cT, ary.c);
/*  541 */     a(bct.cU, ary.b);
/*  542 */     a(bct.cW, ary.c);
/*  543 */     a(bct.cX, ary.c);
/*  544 */     a(bct.cY, ary.c);
/*  545 */     a(bct.cZ, ary.c);
/*  546 */     a(bct.da, ary.c);
/*  547 */     a(bct.dc, ary.c);
/*  548 */     a(bct.db, ary.c);
/*  549 */     a(bct.dd, ary.b);
/*  550 */     a(bct.di, ary.b);
/*  551 */     a(bct.de, ary.b);
/*  552 */     a(bct.df, ary.b);
/*  553 */     a(bct.dg, ary.b);
/*  554 */     a(bct.dj, ary.b);
/*  555 */     a(bct.dm, ary.d);
/*  556 */     a(bct.dn, ary.d);
/*  557 */     a(bct.do, ary.d);
/*  558 */     a(bct.dp, ary.d);
/*  559 */     a(bct.dq, ary.d);
/*  560 */     a(bct.dr, ary.d);
/*  561 */     a(bct.ds, ary.c);
/*  562 */     a(bct.dt, ary.c);
/*  563 */     a(bct.du, ary.c);
/*  564 */     a(bct.dv, ary.c);
/*  565 */     a(bct.dw, ary.c);
/*  566 */     a(bct.dx, ary.c);
/*  567 */     a(bct.dy, ary.b);
/*  568 */     a(bct.dz, ary.b);
/*  569 */     a(bct.dA, ary.b);
/*  570 */     a(bct.dB, ary.b);
/*  571 */     a(bct.dC, ary.c);
/*  572 */     a(bct.dD, ary.c);
/*  573 */     a(bct.dE, ary.c);
/*  574 */     a(bct.dF, ary.c);
/*  575 */     a(bct.dG, ary.c);
/*  576 */     a(bct.dH, ary.b);
/*  577 */     a(bct.dM, ary.c);
/*  578 */     a(bct.dN, ary.d);
/*  579 */     a(bct.dO, ary.d);
/*  580 */     a(bct.dP, ary.d);
/*  581 */     a(bct.dQ, ary.d);
/*  582 */     a(bct.dS, ary.d);
/*  583 */     a(bct.dR, ary.d);
/*  584 */     a(bct.dT, ary.b);
/*  585 */     a(bct.dU, ary.b);
/*  586 */     a(bct.dV, ary.b);
/*  587 */     a(new auq(bct.dW, (new a()).a(ary.c)));
/*  588 */     a(bct.dX, ary.b);
/*  589 */     a(bct.dY, ary.c);
/*  590 */     a(bct.dZ, ary.b);
/*  591 */     a(bct.eb, ary.c);
/*  592 */     a(bct.ef, ary.c);
/*  593 */     a(bct.eg, ary.b);
/*  594 */     a(bct.id, ary.b);
/*  595 */     a(new arj(bct.eh, (new a()).a(atq.d)));
/*  596 */     a(bct.ei, ary.d);
/*  597 */     a(bct.ek, ary.b);
/*  598 */     a(bct.el, ary.b);
/*  599 */     a(bct.em, ary.c);
/*  600 */     a(bct.en, ary.d);
/*  601 */     a(bct.ep, ary.b);
/*  602 */     a(bct.eq, ary.b);
/*  603 */     a(bct.er, ary.b);
/*  604 */     a(bct.es, ary.b);
/*  605 */     a(new asw(bct.et, (new a()).a(atq.d)));
/*  606 */     a(new arj(bct.eu, (new a()).a(ary.f).a(atq.c)));
/*  607 */     a(bct.ev, ary.c);
/*  608 */     a(bct.ew, ary.c);
/*  609 */     a(bct.eV, ary.d);
/*  610 */     a(bct.eW, ary.d);
/*  611 */     a(bct.eX, ary.d);
/*  612 */     a(bct.eY, ary.d);
/*  613 */     a(bct.eZ, ary.d);
/*  614 */     a(bct.fa, ary.d);
/*  615 */     a(bct.fn, ary.c);
/*  616 */     a(bct.fo, ary.c);
/*  617 */     a(bct.fp, ary.c);
/*  618 */     a(bct.fq, ary.d);
/*  619 */     a(bct.fr, ary.d);
/*  620 */     a(bct.fs, ary.d);
/*  621 */     a(bct.fu, ary.d);
/*  622 */     a(bct.fv, ary.d);
/*  623 */     a(bct.fw, ary.b);
/*  624 */     a(bct.fx, ary.d);
/*  625 */     a(bct.fA, ary.b);
/*  626 */     a(bct.fy, ary.b);
/*  627 */     a(bct.fz, ary.b);
/*  628 */     a(bct.fB, ary.b);
/*  629 */     a(bct.fC, ary.e);
/*  630 */     a(bct.fD, ary.d);
/*  631 */     a(bct.fE, ary.b);
/*  632 */     a(bct.fF, ary.b);
/*  633 */     a(bct.fG, ary.b);
/*  634 */     a(bct.fH, ary.b);
/*  635 */     a(bct.fI, ary.b);
/*  636 */     a(bct.fJ, ary.b);
/*  637 */     a(bct.fK, ary.b);
/*  638 */     a(bct.fL, ary.b);
/*  639 */     a(bct.fM, ary.b);
/*  640 */     a(bct.fN, ary.b);
/*  641 */     a(bct.fO, ary.b);
/*  642 */     a(bct.fP, ary.b);
/*  643 */     a(bct.fQ, ary.b);
/*  644 */     a(bct.fR, ary.b);
/*  645 */     a(bct.fS, ary.b);
/*  646 */     a(bct.fT, ary.b);
/*  647 */     b(bct.fU);
/*  648 */     a(bct.fV, ary.d);
/*  649 */     a(bct.fW, ary.b);
/*  650 */     a(bct.fX, ary.c);
/*  651 */     a(bct.fY, ary.c);
/*  652 */     a(bct.fZ, ary.c);
/*  653 */     a(bct.ga, ary.c);
/*  654 */     a(bct.gb, ary.c);
/*  655 */     a(bct.gc, ary.c);
/*  656 */     a(bct.gd, ary.c);
/*  657 */     a(bct.ge, ary.c);
/*  658 */     a(bct.gf, ary.c);
/*  659 */     a(bct.gg, ary.c);
/*  660 */     a(bct.gh, ary.c);
/*  661 */     a(bct.gi, ary.c);
/*  662 */     a(bct.gj, ary.c);
/*  663 */     a(bct.gk, ary.c);
/*  664 */     a(bct.gl, ary.c);
/*  665 */     a(bct.gm, ary.c);
/*  666 */     a(bct.gn, ary.b);
/*  667 */     a(bct.go, ary.b);
/*  668 */     a(bct.gp, ary.b);
/*  669 */     a(bct.gr, ary.b);
/*  670 */     a(bct.gs, ary.b);
/*  671 */     a(bct.gt, ary.c);
/*  672 */     a(bct.if, ary.c);
/*  673 */     a(new asb(bct.gu, (new a()).a(ary.c)));
/*  674 */     a(new asb(bct.gv, (new a()).a(ary.c)));
/*  675 */     a(new asb(bct.gw, (new a()).a(ary.c)));
/*  676 */     a(new asb(bct.gx, (new a()).a(ary.c)));
/*  677 */     a(new asb(bct.gy, (new a()).a(ary.c)));
/*  678 */     a(new asb(bct.gz, (new a()).a(ary.c)));
/*  679 */     a(bct.gA, ary.b);
/*  680 */     a(bct.gB, ary.b);
/*  681 */     a(bct.gC, ary.b);
/*  682 */     a(bct.gD, ary.b);
/*  683 */     a(bct.gE, ary.b);
/*  684 */     a(bct.gF, ary.b);
/*  685 */     a(bct.gG, ary.b);
/*  686 */     a(bct.gH, ary.b);
/*  687 */     a(bct.gI, ary.b);
/*  688 */     a(bct.gJ, ary.b);
/*  689 */     a(bct.gK, ary.b);
/*  690 */     a(bct.gL, ary.b);
/*  691 */     a(bct.gM, ary.b);
/*  692 */     a(bct.gN, ary.b);
/*  693 */     a(bct.gO, ary.b);
/*  694 */     a(bct.gP, ary.b);
/*  695 */     a(bct.gQ, ary.c);
/*  696 */     a(bct.gR, ary.c);
/*  697 */     a(bct.gS, ary.c);
/*  698 */     a(bct.gT, ary.c);
/*  699 */     a(bct.gU, ary.c);
/*  700 */     a(bct.gV, ary.c);
/*  701 */     a(bct.gW, ary.c);
/*  702 */     a(bct.gX, ary.c);
/*  703 */     a(bct.gY, ary.c);
/*  704 */     a(bct.gZ, ary.c);
/*  705 */     a(bct.ha, ary.c);
/*  706 */     a(bct.hb, ary.c);
/*  707 */     a(bct.hc, ary.c);
/*  708 */     a(bct.hd, ary.c);
/*  709 */     a(bct.he, ary.c);
/*  710 */     a(bct.hf, ary.c);
/*  711 */     a(bct.hg, ary.b);
/*  712 */     a(bct.hh, ary.b);
/*  713 */     a(bct.hi, ary.b);
/*  714 */     a(bct.hj, ary.b);
/*  715 */     a(bct.hk, ary.b);
/*  716 */     a(bct.hl, ary.b);
/*  717 */     a(bct.hm, ary.b);
/*  718 */     a(bct.hT, ary.b);
/*  719 */     a(bct.hU, ary.b);
/*  720 */     a(bct.hV, ary.b);
/*  721 */     a(bct.hW, ary.b);
/*  722 */     a(new asw(bct.ih, (new a()).a(atq.d)));
/*  723 */     a(new asw(bct.ii, (new a()).a(atq.d)));
/*  724 */     a(bct.ik, ary.b);
/*  725 */     a(bct.il, ary.b);
/*  726 */     a(bct.im, ary.b);
/*  727 */     a(bct.in, ary.b);
/*  728 */     b(bct.io);
/*  729 */     a(bct.ip, ary.d);
/*  730 */     a(new arj(bct.iq, (new a()).a(1).a(ary.c)));
/*  731 */     a(new arj(bct.ir, (new a()).a(1).a(ary.c)));
/*  732 */     a(new arj(bct.is, (new a()).a(1).a(ary.c)));
/*  733 */     a(new arj(bct.it, (new a()).a(1).a(ary.c)));
/*  734 */     a(new arj(bct.iu, (new a()).a(1).a(ary.c)));
/*  735 */     a(new arj(bct.iv, (new a()).a(1).a(ary.c)));
/*  736 */     a(new arj(bct.iw, (new a()).a(1).a(ary.c)));
/*  737 */     a(new arj(bct.ix, (new a()).a(1).a(ary.c)));
/*  738 */     a(new arj(bct.iy, (new a()).a(1).a(ary.c)));
/*  739 */     a(new arj(bct.iz, (new a()).a(1).a(ary.c)));
/*  740 */     a(new arj(bct.iA, (new a()).a(1).a(ary.c)));
/*  741 */     a(new arj(bct.iB, (new a()).a(1).a(ary.c)));
/*  742 */     a(new arj(bct.iC, (new a()).a(1).a(ary.c)));
/*  743 */     a(new arj(bct.iD, (new a()).a(1).a(ary.c)));
/*  744 */     a(new arj(bct.iE, (new a()).a(1).a(ary.c)));
/*  745 */     a(new arj(bct.iF, (new a()).a(1).a(ary.c)));
/*  746 */     a(new arj(bct.iG, (new a()).a(1).a(ary.c)));
/*  747 */     a(bct.iH, ary.c);
/*  748 */     a(bct.iI, ary.c);
/*  749 */     a(bct.iJ, ary.c);
/*  750 */     a(bct.iK, ary.c);
/*  751 */     a(bct.iL, ary.c);
/*  752 */     a(bct.iM, ary.c);
/*  753 */     a(bct.iN, ary.c);
/*  754 */     a(bct.iO, ary.c);
/*  755 */     a(bct.iP, ary.c);
/*  756 */     a(bct.iQ, ary.c);
/*  757 */     a(bct.iR, ary.c);
/*  758 */     a(bct.iS, ary.c);
/*  759 */     a(bct.iT, ary.c);
/*  760 */     a(bct.iU, ary.c);
/*  761 */     a(bct.iV, ary.c);
/*  762 */     a(bct.iW, ary.c);
/*  763 */     a(bct.iX, ary.b);
/*  764 */     a(bct.iY, ary.b);
/*  765 */     a(bct.iZ, ary.b);
/*  766 */     a(bct.ja, ary.b);
/*  767 */     a(bct.jb, ary.b);
/*  768 */     a(bct.jc, ary.b);
/*  769 */     a(bct.jd, ary.b);
/*  770 */     a(bct.je, ary.b);
/*  771 */     a(bct.jf, ary.b);
/*  772 */     a(bct.jg, ary.b);
/*  773 */     a(bct.jh, ary.b);
/*  774 */     a(bct.ji, ary.b);
/*  775 */     a(bct.jj, ary.b);
/*  776 */     a(bct.jk, ary.b);
/*  777 */     a(bct.jl, ary.b);
/*  778 */     a(bct.jm, ary.b);
/*  779 */     a(bct.jn, ary.b);
/*  780 */     a(bct.jo, ary.b);
/*  781 */     a(bct.jp, ary.b);
/*  782 */     a(bct.jq, ary.b);
/*  783 */     a(bct.jr, ary.b);
/*  784 */     a(bct.js, ary.b);
/*  785 */     a(bct.jt, ary.b);
/*  786 */     a(bct.ju, ary.b);
/*  787 */     a(bct.jv, ary.b);
/*  788 */     a(bct.jw, ary.b);
/*  789 */     a(bct.jx, ary.b);
/*  790 */     a(bct.jy, ary.b);
/*  791 */     a(bct.jz, ary.b);
/*  792 */     a(bct.jA, ary.b);
/*  793 */     a(bct.jB, ary.b);
/*  794 */     a(bct.jC, ary.b);
/*  795 */     a(bct.jG, ary.f);
/*  796 */     a(bct.jJ, ary.b);
/*  797 */     a(bct.jK, ary.b);
/*  798 */     a(bct.jL, ary.b);
/*  799 */     a(bct.jM, ary.b);
/*  800 */     a(bct.jN, ary.b);
/*  801 */     a(bct.jO, ary.b);
/*  802 */     a(bct.jP, ary.b);
/*  803 */     a(bct.jQ, ary.b);
/*  804 */     a(bct.jR, ary.b);
/*  805 */     a(bct.jS, ary.b);
/*  806 */     a(bct.jT, ary.c);
/*  807 */     a(bct.jU, ary.c);
/*  808 */     a(bct.jV, ary.c);
/*  809 */     a(bct.jW, ary.c);
/*  810 */     a(bct.jX, ary.c);
/*  811 */     a(bct.jZ, ary.c);
/*  812 */     a(bct.ka, ary.c);
/*  813 */     a(bct.kb, ary.c);
/*  814 */     a(bct.kc, ary.c);
/*  815 */     a(bct.jY, ary.c);
/*  816 */     a(new auf(bct.ki, bct.kd, (new a()).a(ary.c)));
/*  817 */     a(new auf(bct.kj, bct.ke, (new a()).a(ary.c)));
/*  818 */     a(new auf(bct.kk, bct.kf, (new a()).a(ary.c)));
/*  819 */     a(new auf(bct.kl, bct.kg, (new a()).a(ary.c)));
/*  820 */     a(new auf(bct.km, bct.kh, (new a()).a(ary.c)));
/*  821 */     a(new auf(bct.ku, bct.kp, (new a()).a(ary.c)));
/*  822 */     a(new auf(bct.kv, bct.kq, (new a()).a(ary.c)));
/*  823 */     a(new auf(bct.kw, bct.kr, (new a()).a(ary.c)));
/*  824 */     a(new auf(bct.kx, bct.ks, (new a()).a(ary.c)));
/*  825 */     a(new auf(bct.ky, bct.kt, (new a()).a(ary.c)));
/*  826 */     a(bct.gq, ary.b);
/*  827 */     a(new arj(bct.ko, (new a()).a(ary.f).a(atq.c)));
/*      */     
/*  829 */     a(new asb(bct.cF, (new a()).a(ary.d)));
/*  830 */     a(new asb(bct.ct, (new a()).a(ary.d)));
/*  831 */     a(new asb(bct.cu, (new a()).a(ary.d)));
/*  832 */     a(new asb(bct.cv, (new a()).a(ary.d)));
/*  833 */     a(new asb(bct.cw, (new a()).a(ary.d)));
/*  834 */     a(new asb(bct.cx, (new a()).a(ary.d)));
/*  835 */     a(new asb(bct.cy, (new a()).a(ary.d)));
/*      */     
/*  837 */     a(bct.dl, ary.d);
/*  838 */     a(bct.ft, ary.d);
/*  839 */     a(new asw(bct.kz, (new a()).a(atq.d)));
/*      */     
/*  841 */     a("turtle_helmet", new arb(ard.f, aew.f, (new a()).a(ary.j)));
/*  842 */     a("scute", new ata((new a()).a(ary.l)));
/*  843 */     a("iron_shovel", new aty(auk.c, 1.5F, -3.0F, (new a()).a(ary.i)));
/*  844 */     a("iron_pickaxe", new atn(auk.c, 1, -2.8F, (new a()).a(ary.i)));
/*  845 */     a("iron_axe", new arg(auk.c, 6.0F, -3.1F, (new a()).a(ary.i)));
/*  846 */     a("flint_and_steel", new asu(a.a(new a(), 64).a(ary.i)));
/*  847 */     a("apple", new asv(4, 0.3F, false, (new a()).a(ary.h)));
/*  848 */     a("bow", new arp(a.a(new a(), 384).a(ary.j)));
/*  849 */     a("arrow", new arf((new a()).a(ary.j)));
/*  850 */     a("coal", new ata((new a()).a(ary.l)));
/*  851 */     a("charcoal", new ata((new a()).a(ary.l)));
/*  852 */     a("diamond", new ata((new a()).a(ary.l)));
/*  853 */     a("iron_ingot", new ata((new a()).a(ary.l)));
/*  854 */     a("gold_ingot", new ata((new a()).a(ary.l)));
/*  855 */     a("iron_sword", new auh(auk.c, 3, -2.4F, (new a()).a(ary.j)));
/*  856 */     a("wooden_sword", new auh(auk.a, 3, -2.4F, (new a()).a(ary.j)));
/*  857 */     a("wooden_shovel", new aty(auk.a, 1.5F, -3.0F, (new a()).a(ary.i)));
/*  858 */     a("wooden_pickaxe", new atn(auk.a, 1, -2.8F, (new a()).a(ary.i)));
/*  859 */     a("wooden_axe", new arg(auk.a, 6.0F, -3.2F, (new a()).a(ary.i)));
/*  860 */     a("stone_sword", new auh(auk.b, 3, -2.4F, (new a()).a(ary.j)));
/*  861 */     a("stone_shovel", new aty(auk.b, 1.5F, -3.0F, (new a()).a(ary.i)));
/*  862 */     a("stone_pickaxe", new atn(auk.b, 1, -2.8F, (new a()).a(ary.i)));
/*  863 */     a("stone_axe", new arg(auk.b, 7.0F, -3.2F, (new a()).a(ary.i)));
/*  864 */     a("diamond_sword", new auh(auk.d, 3, -2.4F, (new a()).a(ary.j)));
/*  865 */     a("diamond_shovel", new aty(auk.d, 1.5F, -3.0F, (new a()).a(ary.i)));
/*  866 */     a("diamond_pickaxe", new atn(auk.d, 1, -2.8F, (new a()).a(ary.i)));
/*  867 */     a("diamond_axe", new arg(auk.d, 5.0F, -3.0F, (new a()).a(ary.i)));
/*  868 */     a("stick", new ata((new a()).a(ary.l)));
/*  869 */     a("bowl", new ata((new a()).a(ary.l)));
/*  870 */     a("mushroom_stew", new arq(6, (new a()).a(1).a(ary.h)));
/*  871 */     a("golden_sword", new auh(auk.e, 3, -2.4F, (new a()).a(ary.j)));
/*  872 */     a("golden_shovel", new aty(auk.e, 1.5F, -3.0F, (new a()).a(ary.i)));
/*  873 */     a("golden_pickaxe", new atn(auk.e, 1, -2.8F, (new a()).a(ary.i)));
/*  874 */     a("golden_axe", new arg(auk.e, 6.0F, -3.0F, (new a()).a(ary.i)));
/*  875 */     a("string", new aug((new a()).a(ary.f)));
/*  876 */     a("feather", new ata((new a()).a(ary.l)));
/*  877 */     a("gunpowder", new ata((new a()).a(ary.l)));
/*  878 */     a("wooden_hoe", new asz(auk.a, -3.0F, (new a()).a(ary.i)));
/*  879 */     a("stone_hoe", new asz(auk.b, -2.0F, (new a()).a(ary.i)));
/*  880 */     a("iron_hoe", new asz(auk.c, -1.0F, (new a()).a(ary.i)));
/*  881 */     a("diamond_hoe", new asz(auk.d, 0.0F, (new a()).a(ary.i)));
/*  882 */     a("golden_hoe", new asz(auk.e, -3.0F, (new a()).a(ary.i)));
/*  883 */     a("wheat_seeds", new atu(bct.cp, (new a()).a(ary.l)));
/*  884 */     a("wheat", new ata((new a()).a(ary.l)));
/*  885 */     a("bread", new asv(5, 0.6F, false, (new a()).a(ary.h)));
/*  886 */     a("leather_helmet", new ase(ard.a, aew.f, (new a()).a(ary.j)));
/*  887 */     a("leather_chestplate", new ase(ard.a, aew.e, (new a()).a(ary.j)));
/*  888 */     a("leather_leggings", new ase(ard.a, aew.d, (new a()).a(ary.j)));
/*  889 */     a("leather_boots", new ase(ard.a, aew.c, (new a()).a(ary.j)));
/*  890 */     a("chainmail_helmet", new arb(ard.b, aew.f, (new a()).a(ary.j)));
/*  891 */     a("chainmail_chestplate", new arb(ard.b, aew.e, (new a()).a(ary.j)));
/*  892 */     a("chainmail_leggings", new arb(ard.b, aew.d, (new a()).a(ary.j)));
/*  893 */     a("chainmail_boots", new arb(ard.b, aew.c, (new a()).a(ary.j)));
/*  894 */     a("iron_helmet", new arb(ard.c, aew.f, (new a()).a(ary.j)));
/*  895 */     a("iron_chestplate", new arb(ard.c, aew.e, (new a()).a(ary.j)));
/*  896 */     a("iron_leggings", new arb(ard.c, aew.d, (new a()).a(ary.j)));
/*  897 */     a("iron_boots", new arb(ard.c, aew.c, (new a()).a(ary.j)));
/*  898 */     a("diamond_helmet", new arb(ard.e, aew.f, (new a()).a(ary.j)));
/*  899 */     a("diamond_chestplate", new arb(ard.e, aew.e, (new a()).a(ary.j)));
/*  900 */     a("diamond_leggings", new arb(ard.e, aew.d, (new a()).a(ary.j)));
/*  901 */     a("diamond_boots", new arb(ard.e, aew.c, (new a()).a(ary.j)));
/*  902 */     a("golden_helmet", new arb(ard.d, aew.f, (new a()).a(ary.j)));
/*  903 */     a("golden_chestplate", new arb(ard.d, aew.e, (new a()).a(ary.j)));
/*  904 */     a("golden_leggings", new arb(ard.d, aew.d, (new a()).a(ary.j)));
/*  905 */     a("golden_boots", new arb(ard.d, aew.c, (new a()).a(ary.j)));
/*  906 */     a("flint", new ata((new a()).a(ary.l)));
/*  907 */     a("porkchop", new asv(3, 0.3F, true, (new a()).a(ary.h)));
/*  908 */     a("cooked_porkchop", new asv(8, 0.8F, true, (new a()).a(ary.h)));
/*  909 */     a("painting", new asy((Class)ame.class, (new a()).a(ary.c)));
/*  910 */     a("golden_apple", (new asx(4, 1.2F, false, (new a()).a(ary.h).a(atq.c))).e());
/*  911 */     a("enchanted_golden_apple", (new asj(4, 1.2F, false, (new a()).a(ary.h).a(atq.d))).e());
/*  912 */     a("sign", new atz((new a()).a(16).a(ary.c)));
/*  913 */     ata ☃ = new arr(byy.a, (new a()).a(16).a(ary.f));
/*  914 */     a("bucket", ☃);
/*  915 */     a("water_bucket", new arr(byy.c, (new a()).a(☃).a(1).a(ary.f)));
/*  916 */     a("lava_bucket", new arr(byy.e, (new a()).a(☃).a(1).a(ary.f)));
/*  917 */     a("minecart", new atl(aph.a.a, (new a()).a(1).a(ary.e)));
/*  918 */     a("saddle", new ats((new a()).a(1).a(ary.e)));
/*  919 */     a("redstone", new arj(bct.cl, (new a()).a(ary.d)));
/*  920 */     a("snowball", new aub((new a()).a(16).a(ary.f)));
/*  921 */     a("oak_boat", new arl(apj.b.a, (new a()).a(1).a(ary.e)));
/*  922 */     a("leather", new ata((new a()).a(ary.l)));
/*  923 */     a("milk_bucket", new atk((new a()).a(☃).a(1).a(ary.f)));
/*  924 */     a("pufferfish_bucket", new asr(aev.aa, byy.c, (new a()).a(1).a(ary.f)));
/*  925 */     a("salmon_bucket", new asr(aev.af, byy.c, (new a()).a(1).a(ary.f)));
/*  926 */     a("cod_bucket", new asr(aev.i, byy.c, (new a()).a(1).a(ary.f)));
/*  927 */     a("tropical_fish_bucket", new asr(aev.au, byy.c, (new a()).a(1).a(ary.f)));
/*  928 */     a("brick", new ata((new a()).a(ary.l)));
/*  929 */     a("clay_ball", new ata((new a()).a(ary.l)));
/*  930 */     a(bct.cV, ary.f);
/*  931 */     a(bct.jE, ary.f);
/*  932 */     a(bct.jF, ary.b);
/*  933 */     a("paper", new ata((new a()).a(ary.f)));
/*  934 */     a("book", new arn((new a()).a(ary.f)));
/*  935 */     a("slime_ball", new ata((new a()).a(ary.f)));
/*  936 */     a("chest_minecart", new atl(aph.a.b, (new a()).a(1).a(ary.e)));
/*  937 */     a("furnace_minecart", new atl(aph.a.c, (new a()).a(1).a(ary.e)));
/*  938 */     a("egg", new asf((new a()).a(16).a(ary.l)));
/*  939 */     a("compass", new arw((new a()).a(ary.i)));
/*  940 */     a("fishing_rod", new ast(a.a(new a(), 64).a(ary.i)));
/*  941 */     a("clock", new aru((new a()).a(ary.i)));
/*  942 */     a("glowstone_dust", new ata((new a()).a(ary.l)));
/*  943 */     a("cod", new ass(ass.a.a, false, (new a()).a(ary.h)));
/*  944 */     a("salmon", new ass(ass.a.b, false, (new a()).a(ary.h)));
/*  945 */     a("tropical_fish", new ass(ass.a.c, false, (new a()).a(ary.h)));
/*  946 */     a("pufferfish", new ass(ass.a.d, false, (new a()).a(ary.h)));
/*  947 */     a("cooked_cod", new ass(ass.a.a, true, (new a()).a(ary.h)));
/*  948 */     a("cooked_salmon", new ass(ass.a.b, true, (new a()).a(ary.h)));
/*  949 */     a("ink_sac", new asd(asc.p, (new a()).a(ary.l)));
/*  950 */     a("rose_red", new asd(asc.o, (new a()).a(ary.l)));
/*  951 */     a("cactus_green", new asd(asc.n, (new a()).a(ary.l)));
/*  952 */     a("cocoa_beans", new arv(asc.m, (new a()).a(ary.l)));
/*  953 */     a("lapis_lazuli", new asd(asc.l, (new a()).a(ary.l)));
/*  954 */     a("purple_dye", new asd(asc.k, (new a()).a(ary.l)));
/*  955 */     a("cyan_dye", new asd(asc.j, (new a()).a(ary.l)));
/*  956 */     a("light_gray_dye", new asd(asc.i, (new a()).a(ary.l)));
/*  957 */     a("gray_dye", new asd(asc.h, (new a()).a(ary.l)));
/*  958 */     a("pink_dye", new asd(asc.g, (new a()).a(ary.l)));
/*  959 */     a("lime_dye", new asd(asc.f, (new a()).a(ary.l)));
/*  960 */     a("dandelion_yellow", new asd(asc.e, (new a()).a(ary.l)));
/*  961 */     a("light_blue_dye", new asd(asc.d, (new a()).a(ary.l)));
/*  962 */     a("magenta_dye", new asd(asc.c, (new a()).a(ary.l)));
/*  963 */     a("orange_dye", new asd(asc.b, (new a()).a(ary.l)));
/*  964 */     a("bone_meal", new arm(asc.a, (new a()).a(ary.l)));
/*  965 */     a("bone", new ata((new a()).a(ary.f)));
/*  966 */     a("sugar", new ata((new a()).a(ary.l)));
/*  967 */     a(new arj(bct.dk, (new a()).a(1).a(ary.h)));
/*  968 */     a(new ari(bct.ax, (new a()).a(1).a(ary.c)));
/*  969 */     a(new ari(bct.ay, (new a()).a(1).a(ary.c)));
/*  970 */     a(new ari(bct.az, (new a()).a(1).a(ary.c)));
/*  971 */     a(new ari(bct.aA, (new a()).a(1).a(ary.c)));
/*  972 */     a(new ari(bct.aB, (new a()).a(1).a(ary.c)));
/*  973 */     a(new ari(bct.aC, (new a()).a(1).a(ary.c)));
/*  974 */     a(new ari(bct.aD, (new a()).a(1).a(ary.c)));
/*  975 */     a(new ari(bct.aE, (new a()).a(1).a(ary.c)));
/*  976 */     a(new ari(bct.aF, (new a()).a(1).a(ary.c)));
/*  977 */     a(new ari(bct.aG, (new a()).a(1).a(ary.c)));
/*  978 */     a(new ari(bct.aH, (new a()).a(1).a(ary.c)));
/*  979 */     a(new ari(bct.aI, (new a()).a(1).a(ary.c)));
/*  980 */     a(new ari(bct.aJ, (new a()).a(1).a(ary.c)));
/*  981 */     a(new ari(bct.aK, (new a()).a(1).a(ary.c)));
/*  982 */     a(new ari(bct.aL, (new a()).a(1).a(ary.c)));
/*  983 */     a(new ari(bct.aM, (new a()).a(1).a(ary.c)));
/*  984 */     a("cookie", new asv(2, 0.1F, false, (new a()).a(ary.h)));
/*  985 */     a("filled_map", new atj(new a()));
/*  986 */     a("shears", new atw(a.a(new a(), 238).a(ary.i)));
/*  987 */     a("melon_slice", new asv(2, 0.3F, false, (new a()).a(ary.h)));
/*  988 */     a("dried_kelp", (new asv(1, 0.3F, false, (new a()).a(ary.h))).f());
/*  989 */     a("pumpkin_seeds", new atu(bct.dK, (new a()).a(ary.l)));
/*  990 */     a("melon_seeds", new atu(bct.dL, (new a()).a(ary.l)));
/*  991 */     a("beef", new asv(3, 0.3F, true, (new a()).a(ary.h)));
/*  992 */     a("cooked_beef", new asv(8, 0.8F, true, (new a()).a(ary.h)));
/*  993 */     a("chicken", (new asv(2, 0.3F, true, (new a()).a(ary.h))).a(new aek(aem.q, 600, 0), 0.3F));
/*  994 */     a("cooked_chicken", new asv(6, 0.6F, true, (new a()).a(ary.h)));
/*  995 */     a("rotten_flesh", (new asv(4, 0.1F, true, (new a()).a(ary.h))).a(new aek(aem.q, 600, 0), 0.8F));
/*  996 */     a("ender_pearl", new asm((new a()).a(16).a(ary.f)));
/*  997 */     a("blaze_rod", new ata((new a()).a(ary.l)));
/*  998 */     a("ghast_tear", new ata((new a()).a(ary.k)));
/*  999 */     a("gold_nugget", new ata((new a()).a(ary.l)));
/* 1000 */     a("nether_wart", new atu(bct.ea, (new a()).a(ary.l)));
/* 1001 */     a("potion", new atp((new a()).a(1).a(ary.k)));
/* 1002 */     ata ata1 = new aro((new a()).a(ary.k));
/* 1003 */     a("glass_bottle", ata1);
/* 1004 */     a("spider_eye", (new asv(2, 0.8F, false, (new a()).a(ary.h))).a(new aek(aem.s, 100, 0), 1.0F));
/* 1005 */     a("fermented_spider_eye", new ata((new a()).a(ary.k)));
/* 1006 */     a("blaze_powder", new ata((new a()).a(ary.k)));
/* 1007 */     a("magma_cream", new ata((new a()).a(ary.k)));
/* 1008 */     a(bct.ec, ary.k);
/* 1009 */     a(bct.ed, ary.k);
/* 1010 */     a("ender_eye", new asl((new a()).a(ary.f)));
/* 1011 */     a("glistering_melon_slice", new ata((new a()).a(ary.k)));
/* 1012 */     a("bat_spawn_egg", new auc(aev.d, 4996656, 986895, (new a()).a(ary.f)));
/* 1013 */     a("blaze_spawn_egg", new auc(aev.e, 16167425, 16775294, (new a()).a(ary.f)));
/* 1014 */     a("cave_spider_spawn_egg", new auc(aev.g, 803406, 11013646, (new a()).a(ary.f)));
/* 1015 */     a("chicken_spawn_egg", new auc(aev.h, 10592673, 16711680, (new a()).a(ary.f)));
/* 1016 */     a("cod_spawn_egg", new auc(aev.i, 12691306, 15058059, (new a()).a(ary.f)));
/* 1017 */     a("cow_spawn_egg", new auc(aev.j, 4470310, 10592673, (new a()).a(ary.f)));
/* 1018 */     a("creeper_spawn_egg", new auc(aev.k, 894731, 0, (new a()).a(ary.f)));
/* 1019 */     a("dolphin_spawn_egg", new auc(aev.m, 2243405, 16382457, (new a()).a(ary.f)));
/* 1020 */     a("donkey_spawn_egg", new auc(aev.l, 5457209, 8811878, (new a()).a(ary.f)));
/* 1021 */     a("drowned_spawn_egg", new auc(aev.o, 9433559, 7969893, (new a()).a(ary.f)));
/* 1022 */     a("elder_guardian_spawn_egg", new auc(aev.p, 13552826, 7632531, (new a()).a(ary.f)));
/* 1023 */     a("enderman_spawn_egg", new auc(aev.s, 1447446, 0, (new a()).a(ary.f)));
/* 1024 */     a("endermite_spawn_egg", new auc(aev.t, 1447446, 7237230, (new a()).a(ary.f)));
/* 1025 */     a("evoker_spawn_egg", new auc(aev.v, 9804699, 1973274, (new a()).a(ary.f)));
/* 1026 */     a("ghast_spawn_egg", new auc(aev.A, 16382457, 12369084, (new a()).a(ary.f)));
/* 1027 */     a("guardian_spawn_egg", new auc(aev.C, 5931634, 15826224, (new a()).a(ary.f)));
/* 1028 */     a("horse_spawn_egg", new auc(aev.D, 12623485, 15656192, (new a()).a(ary.f)));
/* 1029 */     a("husk_spawn_egg", new auc(aev.E, 7958625, 15125652, (new a()).a(ary.f)));
/* 1030 */     a("llama_spawn_egg", new auc(aev.K, 12623485, 10051392, (new a()).a(ary.f)));
/* 1031 */     a("magma_cube_spawn_egg", new auc(aev.M, 3407872, 16579584, (new a()).a(ary.f)));
/* 1032 */     a("mooshroom_spawn_egg", new auc(aev.V, 10489616, 12040119, (new a()).a(ary.f)));
/* 1033 */     a("mule_spawn_egg", new auc(aev.U, 1769984, 5321501, (new a()).a(ary.f)));
/* 1034 */     a("ocelot_spawn_egg", new auc(aev.W, 15720061, 5653556, (new a()).a(ary.f)));
/* 1035 */     a("parrot_spawn_egg", new auc(aev.Y, 894731, 16711680, (new a()).a(ary.f)));
/* 1036 */     a("phantom_spawn_egg", new auc(aev.aM, 4411786, 8978176, (new a()).a(ary.f)));
/* 1037 */     a("pig_spawn_egg", new auc(aev.Z, 15771042, 14377823, (new a()).a(ary.f)));
/* 1038 */     a("polar_bear_spawn_egg", new auc(aev.ac, 15921906, 9803152, (new a()).a(ary.f)));
/* 1039 */     a("pufferfish_spawn_egg", new auc(aev.aa, 16167425, 3654642, (new a()).a(ary.f)));
/* 1040 */     a("rabbit_spawn_egg", new auc(aev.ae, 10051392, 7555121, (new a()).a(ary.f)));
/* 1041 */     a("salmon_spawn_egg", new auc(aev.af, 10489616, 951412, (new a()).a(ary.f)));
/* 1042 */     a("sheep_spawn_egg", new auc(aev.ag, 15198183, 16758197, (new a()).a(ary.f)));
/* 1043 */     a("shulker_spawn_egg", new auc(aev.ah, 9725844, 5060690, (new a()).a(ary.f)));
/* 1044 */     a("silverfish_spawn_egg", new auc(aev.aj, 7237230, 3158064, (new a()).a(ary.f)));
/* 1045 */     a("skeleton_spawn_egg", new auc(aev.ak, 12698049, 4802889, (new a()).a(ary.f)));
/* 1046 */     a("skeleton_horse_spawn_egg", new auc(aev.al, 6842447, 15066584, (new a()).a(ary.f)));
/* 1047 */     a("slime_spawn_egg", new auc(aev.am, 5349438, 8306542, (new a()).a(ary.f)));
/* 1048 */     a("spider_spawn_egg", new auc(aev.ar, 3419431, 11013646, (new a()).a(ary.f)));
/* 1049 */     a("squid_spawn_egg", new auc(aev.as, 2243405, 7375001, (new a()).a(ary.f)));
/* 1050 */     a("stray_spawn_egg", new auc(aev.at, 6387319, 14543594, (new a()).a(ary.f)));
/* 1051 */     a("tropical_fish_spawn_egg", new auc(aev.au, 15690005, 16775663, (new a()).a(ary.f)));
/* 1052 */     a("turtle_spawn_egg", new auc(aev.av, 15198183, 44975, (new a()).a(ary.f)));
/* 1053 */     a("vex_spawn_egg", new auc(aev.aA, 8032420, 15265265, (new a()).a(ary.f)));
/* 1054 */     a("villager_spawn_egg", new auc(aev.aB, 5651507, 12422002, (new a()).a(ary.f)));
/* 1055 */     a("vindicator_spawn_egg", new auc(aev.aD, 9804699, 2580065, (new a()).a(ary.f)));
/* 1056 */     a("witch_spawn_egg", new auc(aev.aE, 3407872, 5349438, (new a()).a(ary.f)));
/* 1057 */     a("wither_skeleton_spawn_egg", new auc(aev.aG, 1315860, 4672845, (new a()).a(ary.f)));
/* 1058 */     a("wolf_spawn_egg", new auc(aev.aI, 14144467, 13545366, (new a()).a(ary.f)));
/* 1059 */     a("zombie_spawn_egg", new auc(aev.aJ, 44975, 7969893, (new a()).a(ary.f)));
/* 1060 */     a("zombie_horse_spawn_egg", new auc(aev.aK, 3232308, 9945732, (new a()).a(ary.f)));
/* 1061 */     a("zombie_pigman_spawn_egg", new auc(aev.ab, 15373203, 5009705, (new a()).a(ary.f)));
/* 1062 */     a("zombie_villager_spawn_egg", new auc(aev.aL, 5651507, 7969893, (new a()).a(ary.f)));
/* 1063 */     a("experience_bottle", new asn((new a()).a(ary.f).a(atq.b)));
/* 1064 */     a("fire_charge", new aso((new a()).a(ary.f)));
/* 1065 */     a("writable_book", new aur((new a()).a(1).a(ary.f)));
/* 1066 */     a("written_book", new aus((new a()).a(16)));
/* 1067 */     a("emerald", new ata((new a()).a(ary.l)));
/* 1068 */     a("item_frame", new atc((new a()).a(ary.c)));
/* 1069 */     a(bct.ex, ary.c);
/* 1070 */     a("carrot", new att(3, 0.6F, bct.eT, (new a()).a(ary.h)));
/* 1071 */     a("potato", new att(1, 0.3F, bct.eU, (new a()).a(ary.h)));
/* 1072 */     a("baked_potato", new asv(5, 0.6F, false, (new a()).a(ary.h)));
/* 1073 */     a("poisonous_potato", (new asv(2, 0.3F, false, (new a()).a(ary.h))).a(new aek(aem.s, 100, 0), 0.6F));
/* 1074 */     a("map", new ash((new a()).a(ary.f)));
/* 1075 */     a("golden_carrot", new asv(6, 1.2F, false, (new a()).a(ary.k)));
/* 1076 */     a(new auf(bct.fc, bct.fb, (new a()).a(ary.c).a(atq.b)));
/* 1077 */     a(new auf(bct.fe, bct.fd, (new a()).a(ary.c).a(atq.b)));
/* 1078 */     a(new ato(bct.fi, bct.fh, (new a()).a(ary.c).a(atq.b)));
/* 1079 */     a(new auf(bct.fg, bct.ff, (new a()).a(ary.c).a(atq.b)));
/* 1080 */     a(new auf(bct.fk, bct.fj, (new a()).a(ary.c).a(atq.b)));
/* 1081 */     a(new auf(bct.fm, bct.fl, (new a()).a(ary.c).a(atq.b)));
/* 1082 */     a("carrot_on_a_stick", new ars(a.a(new a(), 25).a(ary.e)));
/* 1083 */     a("nether_star", new aua((new a()).a(ary.l).a(atq.b)));
/* 1084 */     a("pumpkin_pie", new asv(8, 0.3F, false, (new a()).a(ary.h)));
/* 1085 */     a("firework_rocket", new asp((new a()).a(ary.f)));
/* 1086 */     a("firework_star", new asq((new a()).a(ary.f)));
/* 1087 */     a("enchanted_book", new asi((new a()).a(1).a(atq.b)));
/* 1088 */     a("nether_brick", new ata((new a()).a(ary.l)));
/* 1089 */     a("quartz", new ata((new a()).a(ary.l)));
/* 1090 */     a("tnt_minecart", new atl(aph.a.d, (new a()).a(1).a(ary.e)));
/* 1091 */     a("hopper_minecart", new atl(aph.a.f, (new a()).a(1).a(ary.e)));
/* 1092 */     a("prismarine_shard", new ata((new a()).a(ary.l)));
/* 1093 */     a("prismarine_crystals", new ata((new a()).a(ary.l)));
/* 1094 */     a("rabbit", new asv(3, 0.3F, true, (new a()).a(ary.h)));
/* 1095 */     a("cooked_rabbit", new asv(5, 0.6F, true, (new a()).a(ary.h)));
/* 1096 */     a("rabbit_stew", new arq(10, (new a()).a(1).a(ary.h)));
/* 1097 */     a("rabbit_foot", new ata((new a()).a(ary.k)));
/* 1098 */     a("rabbit_hide", new ata((new a()).a(ary.l)));
/* 1099 */     a("armor_stand", new are((new a()).a(16).a(ary.c)));
/* 1100 */     a("iron_horse_armor", new ata((new a()).a(1).a(ary.f)));
/* 1101 */     a("golden_horse_armor", new ata((new a()).a(1).a(ary.f)));
/* 1102 */     a("diamond_horse_armor", new ata((new a()).a(1).a(ary.f)));
/* 1103 */     a("lead", new ath((new a()).a(ary.i)));
/* 1104 */     a("name_tag", new atm((new a()).a(ary.i)));
/* 1105 */     a("command_block_minecart", new atl(aph.a.g, (new a()).a(1)));
/* 1106 */     a("mutton", new asv(2, 0.3F, true, (new a()).a(ary.h)));
/* 1107 */     a("cooked_mutton", new asv(6, 0.8F, true, (new a()).a(ary.h)));
/* 1108 */     a("white_banner", new arh(bct.hn, bct.hD, (new a()).a(16).a(ary.c)));
/* 1109 */     a("orange_banner", new arh(bct.ho, bct.hE, (new a()).a(16).a(ary.c)));
/* 1110 */     a("magenta_banner", new arh(bct.hp, bct.hF, (new a()).a(16).a(ary.c)));
/* 1111 */     a("light_blue_banner", new arh(bct.hq, bct.hG, (new a()).a(16).a(ary.c)));
/* 1112 */     a("yellow_banner", new arh(bct.hr, bct.hH, (new a()).a(16).a(ary.c)));
/* 1113 */     a("lime_banner", new arh(bct.hs, bct.hI, (new a()).a(16).a(ary.c)));
/* 1114 */     a("pink_banner", new arh(bct.ht, bct.hJ, (new a()).a(16).a(ary.c)));
/* 1115 */     a("gray_banner", new arh(bct.hu, bct.hK, (new a()).a(16).a(ary.c)));
/* 1116 */     a("light_gray_banner", new arh(bct.hv, bct.hL, (new a()).a(16).a(ary.c)));
/* 1117 */     a("cyan_banner", new arh(bct.hw, bct.hM, (new a()).a(16).a(ary.c)));
/* 1118 */     a("purple_banner", new arh(bct.hx, bct.hN, (new a()).a(16).a(ary.c)));
/* 1119 */     a("blue_banner", new arh(bct.hy, bct.hO, (new a()).a(16).a(ary.c)));
/* 1120 */     a("brown_banner", new arh(bct.hz, bct.hP, (new a()).a(16).a(ary.c)));
/* 1121 */     a("green_banner", new arh(bct.hA, bct.hQ, (new a()).a(16).a(ary.c)));
/* 1122 */     a("red_banner", new arh(bct.hB, bct.hR, (new a()).a(16).a(ary.c)));
/* 1123 */     a("black_banner", new arh(bct.hC, bct.hS, (new a()).a(16).a(ary.c)));
/* 1124 */     a("end_crystal", new ask((new a()).a(ary.c).a(atq.c)));
/* 1125 */     a("chorus_fruit", (new art(4, 0.3F, (new a()).a(ary.l))).e());
/* 1126 */     a("popped_chorus_fruit", new ata((new a()).a(ary.l)));
/* 1127 */     a("beetroot", new asv(1, 0.6F, false, (new a()).a(ary.h)));
/* 1128 */     a("beetroot_seeds", new atu(bct.ie, (new a()).a(ary.l)));
/* 1129 */     a("beetroot_soup", new arq(6, (new a()).a(1).a(ary.h)));
/* 1130 */     a("dragon_breath", new ata((new a()).a(ata1).a(ary.k).a(atq.b)));
/* 1131 */     a("splash_potion", new aue((new a()).a(1).a(ary.k)));
/* 1132 */     a("spectral_arrow", new aud((new a()).a(ary.j)));
/* 1133 */     a("tipped_arrow", new aul((new a()).a(ary.j)));
/* 1134 */     a("lingering_potion", new ati((new a()).a(1).a(ary.k)));
/* 1135 */     a("shield", new atx(a.a(new a(), 336).a(ary.j)));
/* 1136 */     a("elytra", new asg(a.a(new a(), 432).a(ary.e).a(atq.b)));
/* 1137 */     a("spruce_boat", new arl(apj.b.b, (new a()).a(1).a(ary.e)));
/* 1138 */     a("birch_boat", new arl(apj.b.c, (new a()).a(1).a(ary.e)));
/* 1139 */     a("jungle_boat", new arl(apj.b.d, (new a()).a(1).a(ary.e)));
/* 1140 */     a("acacia_boat", new arl(apj.b.e, (new a()).a(1).a(ary.e)));
/* 1141 */     a("dark_oak_boat", new arl(apj.b.f, (new a()).a(1).a(ary.e)));
/* 1142 */     a("totem_of_undying", new ata((new a()).a(1).a(ary.j).a(atq.b)));
/* 1143 */     a("shulker_shell", new ata((new a()).a(ary.l)));
/* 1144 */     a("iron_nugget", new ata((new a()).a(ary.l)));
/* 1145 */     a("knowledge_book", new atg((new a()).a(1)));
/* 1146 */     a("debug_stick", new arz((new a()).a(1)));
/* 1147 */     a("music_disc_13", new atr(1, wj.hA, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1148 */     a("music_disc_cat", new atr(2, wj.hC, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1149 */     a("music_disc_blocks", new atr(3, wj.hB, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1150 */     a("music_disc_chirp", new atr(4, wj.hD, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1151 */     a("music_disc_far", new atr(5, wj.hE, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1152 */     a("music_disc_mall", new atr(6, wj.hF, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1153 */     a("music_disc_mellohi", new atr(7, wj.hG, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1154 */     a("music_disc_stal", new atr(8, wj.hH, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1155 */     a("music_disc_strad", new atr(9, wj.hI, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1156 */     a("music_disc_ward", new atr(10, wj.hK, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1157 */     a("music_disc_11", new atr(11, wj.hz, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1158 */     a("music_disc_wait", new atr(12, wj.hJ, (new a()).a(1).a(ary.f).a(atq.c)));
/* 1159 */     a("trident", new aun(a.a(new a(), 250).a(ary.j)));
/* 1160 */     a("phantom_membrane", new ata((new a()).a(ary.k)));
/* 1161 */     a("nautilus_shell", new ata((new a()).a(ary.l)));
/* 1162 */     a("heart_of_the_sea", new ata((new a()).a(ary.l).a(atq.b)));
/*      */   }
/*      */   
/*      */   private static void b(bcs ☃) {
/* 1166 */     a(new arj(☃, new a()));
/*      */   }
/*      */   
/*      */   private static void a(bcs ☃, ary ary1) {
/* 1170 */     a(new arj(☃, (new a()).a(ary1)));
/*      */   }
/*      */   
/*      */   private static void a(arj ☃) {
/* 1174 */     a(☃.d(), ☃);
/*      */   }
/*      */   
/*      */   protected static void a(bcs ☃, ata ata1) {
/* 1178 */     a(fc.g.b(☃), ata1);
/*      */   }
/*      */   
/*      */   private static void a(String ☃, ata ata1) {
/* 1182 */     a(new pc(☃), ata1);
/*      */   }
/*      */   
/*      */   private static void a(pc ☃, ata ata1) {
/* 1186 */     if (ata1 instanceof arj) {
/* 1187 */       ((arj)ata1).a(f, ata1);
/*      */     }
/* 1189 */     fc.s.a(☃, ata1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(wz<ata> ☃) {
/* 1197 */     return ☃.a(this);
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\ata.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */