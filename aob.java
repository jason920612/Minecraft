/*      */ import java.util.Locale;
/*      */ import java.util.Random;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class aob
/*      */   extends aeo
/*      */   implements aoa, axd
/*      */ {
/*  100 */   private static final Logger bC = LogManager.getLogger();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  110 */   private static final or<Integer> bD = ou.a((Class)aob.class, ot.b);
/*      */   
/*      */   private int bE;
/*      */   
/*      */   private boolean bF;
/*      */   
/*      */   private boolean bG;
/*      */   
/*      */   private ajg bH;
/*      */   
/*      */   @Nullable
/*      */   private aog bI;
/*      */   
/*      */   @Nullable
/*      */   private axf bJ;
/*      */   
/*      */   private int bK;
/*      */   
/*      */   private boolean bL;
/*      */   
/*      */   private boolean bM;
/*      */   
/*      */   private int bN;
/*      */   
/*      */   private String bO;
/*      */   
/*      */   private int bP;
/*      */   
/*      */   private int bQ;
/*      */   private boolean bR;
/*      */   private boolean bS;
/*  141 */   private final adt bT = new adt(new iq("Items"), 8);
/*      */   
/*      */   public aob(axy ☃) {
/*  144 */     this(☃, 0);
/*      */   }
/*      */   
/*      */   public aob(axy ☃, int i) {
/*  148 */     super(aev.aB, ☃);
/*  149 */     d(i);
/*  150 */     a(0.6F, 1.95F);
/*      */     
/*  152 */     ((aiv)t()).a(true);
/*      */     
/*  154 */     p(true);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void n() {
/*  159 */     this.by.a(0, new agm(this));
/*  160 */     this.by.a(1, new agd<>(this, anw.class, 8.0F, 0.6D, 0.6D));
/*  161 */     this.by.a(1, new agd<>(this, amz.class, 12.0F, 0.8D, 0.8D));
/*  162 */     this.by.a(1, new agd<>(this, ant.class, 8.0F, 0.8D, 0.8D));
/*  163 */     this.by.a(1, new agd<>(this, ans.class, 8.0F, 0.6D, 0.6D));
/*  164 */     this.by.a(1, new aid(this));
/*  165 */     this.by.a(1, new ahc(this));
/*  166 */     this.by.a(2, new ahf(this));
/*  167 */     this.by.a(3, new ahw(this));
/*  168 */     this.by.a(4, new ahn(this, true));
/*  169 */     this.by.a(5, new ahi(this, 0.6D));
/*  170 */     this.by.a(6, new ahd(this));
/*  171 */     this.by.a(7, new aib(this));
/*  172 */     this.by.a(9, new agw(this, (Class)aog.class, 3.0F, 1.0F));
/*  173 */     this.by.a(9, new aif(this));
/*  174 */     this.by.a(9, new aih(this, 0.6D));
/*  175 */     this.by.a(10, new ahb(this, (Class)afb.class, 8.0F));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void dJ() {
/*  182 */     if (this.bS) {
/*      */       return;
/*      */     }
/*  185 */     this.bS = true;
/*      */     
/*  187 */     if (y_()) {
/*  188 */       this.by.a(8, new ahp(this, 0.32D));
/*  189 */     } else if (dy() == 0) {
/*  190 */       this.by.a(6, new agv(this, 0.6D));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void l() {
/*  196 */     if (dy() == 0) {
/*  197 */       this.by.a(8, new agv(this, 0.6D));
/*      */     }
/*      */     
/*  200 */     super.l();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bZ() {
/*  205 */     super.bZ();
/*      */     
/*  207 */     a(ank.d).a(0.5D);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void J() {
/*  212 */     if (--this.bE <= 0) {
/*  213 */       el ☃ = new el(this);
/*  214 */       this.m.af().a(☃);
/*  215 */       this.bE = 70 + this.T.nextInt(50);
/*      */       
/*  217 */       this.bH = this.m.af().a(☃, 32);
/*  218 */       if (this.bH == null) {
/*  219 */         dv();
/*      */       } else {
/*  221 */         el el = this.bH.a();
/*  222 */         a(el, this.bH.b());
/*      */         
/*  224 */         if (this.bR) {
/*  225 */           this.bR = false;
/*  226 */           this.bH.b(5);
/*      */         } 
/*      */       } 
/*      */     } 
/*  230 */     if (!dB() && this.bK > 0) {
/*  231 */       this.bK--;
/*  232 */       if (this.bK <= 0) {
/*  233 */         if (this.bL) {
/*      */           
/*  235 */           for (axe ☃ : this.bJ) {
/*  236 */             if (☃.h()) {
/*  237 */               ☃.a(this.T.nextInt(6) + this.T.nextInt(6) + 2);
/*      */             }
/*      */           } 
/*      */           
/*  241 */           dK();
/*  242 */           this.bL = false;
/*      */           
/*  244 */           if (this.bH != null && this.bO != null) {
/*  245 */             this.m.a(this, (byte)14);
/*  246 */             this.bH.a(this.bO, 1);
/*      */           } 
/*      */         } 
/*  249 */         c(new aek(aem.j, 200, 0));
/*      */       } 
/*      */     } 
/*      */     
/*  253 */     super.J();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aog ☃, adk adk1) {
/*  259 */     ate ate = ☃.b(adk1);
/*  260 */     boolean bool = (ate.b() == atf.ed);
/*      */     
/*  262 */     if (bool) {
/*  263 */       ate.a(☃, this, adk1);
/*  264 */       return true;
/*      */     } 
/*      */     
/*  267 */     if (ate.b() != atf.dn && aF() && !dB() && !y_()) {
/*  268 */       if (this.bJ == null) {
/*  269 */         dK();
/*      */       }
/*      */ 
/*      */       
/*  273 */       if (adk1 == adk.a) {
/*  274 */         ☃.a(ws.Q);
/*      */       }
/*      */       
/*  277 */       if (!this.m.B && !this.bJ.isEmpty()) {
/*      */         
/*  279 */         a_(☃);
/*  280 */         ☃.a(this);
/*  281 */       } else if (this.bJ.isEmpty()) {
/*  282 */         return super.a(☃, adk1);
/*      */       } 
/*  284 */       return true;
/*      */     } 
/*  286 */     return super.a(☃, adk1);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void x_() {
/*  291 */     super.x_();
/*  292 */     this.ab.a(bD, Integer.valueOf(0));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(gy ☃) {
/*  297 */     super.b(☃);
/*  298 */     ☃.b("Profession", dy());
/*  299 */     ☃.b("Riches", this.bN);
/*  300 */     ☃.b("Career", this.bP);
/*  301 */     ☃.b("CareerLevel", this.bQ);
/*  302 */     ☃.a("Willing", this.bM);
/*  303 */     if (this.bJ != null) {
/*  304 */       ☃.a("Offers", this.bJ.a());
/*      */     }
/*  306 */     he he = new he();
/*  307 */     for (int i = 0; i < this.bT.T_(); i++) {
/*  308 */       ate ate = this.bT.a(i);
/*  309 */       if (!ate.a()) {
/*  310 */         he.a(ate.b(new gy()));
/*      */       }
/*      */     } 
/*  313 */     ☃.a("Inventory", he);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(gy ☃) {
/*  318 */     super.a(☃);
/*  319 */     d(☃.h("Profession"));
/*  320 */     this.bN = ☃.h("Riches");
/*  321 */     this.bP = ☃.h("Career");
/*  322 */     this.bQ = ☃.h("CareerLevel");
/*  323 */     this.bM = ☃.q("Willing");
/*  324 */     if (☃.c("Offers", 10)) {
/*  325 */       gy gy1 = ☃.p("Offers");
/*  326 */       this.bJ = new axf(gy1);
/*      */     } 
/*  328 */     he he = ☃.d("Inventory", 10);
/*  329 */     for (int i = 0; i < he.size(); i++) {
/*  330 */       ate ate = ate.a(he.e(i));
/*  331 */       if (!ate.a()) {
/*  332 */         this.bT.a(ate);
/*      */       }
/*      */     } 
/*      */     
/*  336 */     p(true);
/*  337 */     dJ();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean H() {
/*  342 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi D() {
/*  347 */     if (dB()) {
/*  348 */       return wj.kv;
/*      */     }
/*  350 */     return wj.kr;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi d(aea ☃) {
/*  355 */     return wj.kt;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi cs() {
/*  360 */     return wj.ks;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected pc G() {
/*  366 */     return ccl.aA;
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/*  370 */     this.ab.b(bD, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public int dy() {
/*  374 */     return Math.max(((Integer)this.ab.<Integer>a(bD)).intValue() % 6, 0);
/*      */   }
/*      */   
/*      */   public boolean dz() {
/*  378 */     return this.bF;
/*      */   }
/*      */   
/*      */   public void s(boolean ☃) {
/*  382 */     this.bF = ☃;
/*      */   }
/*      */   
/*      */   public void t(boolean ☃) {
/*  386 */     this.bG = ☃;
/*      */   }
/*      */   
/*      */   public boolean dA() {
/*  390 */     return this.bG;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable afa ☃) {
/*  395 */     super.a(☃);
/*  396 */     if (this.bH != null && ☃ != null) {
/*  397 */       this.bH.a(☃);
/*      */       
/*  399 */       if (☃ instanceof aog) {
/*  400 */         int i = -1;
/*  401 */         if (y_()) {
/*  402 */           i = -3;
/*      */         }
/*  404 */         this.bH.a(((aog)☃).do().getName(), i);
/*  405 */         if (aF()) {
/*  406 */           this.m.a(this, (byte)13);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aea ☃) {
/*  414 */     if (this.bH != null) {
/*  415 */       aer aer = ☃.k();
/*  416 */       if (aer != null) {
/*  417 */         if (aer instanceof aog) {
/*  418 */           this.bH.a(((aog)aer).do().getName(), -2);
/*  419 */         } else if (aer instanceof amy) {
/*  420 */           this.bH.h();
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  425 */         aog aog1 = this.m.a(this, 16.0D);
/*  426 */         if (aog1 != null) {
/*  427 */           this.bH.h();
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  432 */     super.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a_(@Nullable aog ☃) {
/*  437 */     this.bI = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aog M_() {
/*  443 */     return this.bI;
/*      */   }
/*      */   
/*      */   public boolean dB() {
/*  447 */     return (this.bI != null);
/*      */   }
/*      */   
/*      */   public boolean u(boolean ☃) {
/*  451 */     if (!this.bM && ☃ && dE()) {
/*  452 */       boolean bool = false;
/*      */       
/*  454 */       for (int i = 0; i < this.bT.T_(); i++) {
/*  455 */         ate ate = this.bT.a(i);
/*  456 */         if (!ate.a()) {
/*  457 */           if (ate.b() == atf.T && ate.C() >= 3) {
/*  458 */             bool = true;
/*  459 */             this.bT.a(i, 3);
/*  460 */           } else if ((ate.b() == atf.dD || ate.b() == atf.dC) && ate.C() >= 12) {
/*  461 */             bool = true;
/*  462 */             this.bT.a(i, 12);
/*      */           } 
/*      */         }
/*  465 */         if (bool) {
/*  466 */           this.m.a(this, (byte)18);
/*  467 */           this.bM = true;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */     } 
/*  473 */     return this.bM;
/*      */   }
/*      */   
/*      */   public void v(boolean ☃) {
/*  477 */     this.bM = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(axe ☃) {
/*  482 */     ☃.g();
/*  483 */     this.a_ = -z();
/*  484 */     a(wj.kw, cD(), cE());
/*      */     
/*  486 */     int i = 3 + this.T.nextInt(4);
/*      */ 
/*      */     
/*  489 */     if (☃.e() == 1 || this.T.nextInt(5) == 0) {
/*  490 */       this.bK = 40;
/*  491 */       this.bL = true;
/*  492 */       this.bM = true;
/*  493 */       if (this.bI != null) {
/*  494 */         this.bO = this.bI.do().getName();
/*      */       } else {
/*  496 */         this.bO = null;
/*      */       } 
/*  498 */       i += 5;
/*      */     } 
/*  500 */     if (☃.a().b() == atf.dA) {
/*  501 */       this.bN += ☃.a().C();
/*      */     }
/*      */     
/*  504 */     if (☃.j()) {
/*  505 */       this.m.a(new aex(this.m, this.q, this.r + 0.5D, this.s, i));
/*      */     }
/*      */     
/*  508 */     if (this.bI instanceof tf) {
/*  509 */       p.s.a((tf)this.bI, this, ☃.d());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ate ☃) {
/*  515 */     if (!this.m.B && this.a_ > -z() + 20) {
/*  516 */       this.a_ = -z();
/*  517 */       a(☃.a() ? wj.ku : wj.kw, cD(), cE());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public axf b_(aog ☃) {
/*  524 */     if (this.bJ == null) {
/*  525 */       dK();
/*      */     }
/*  527 */     return this.bJ;
/*      */   }
/*      */   
/*      */   private void dK() {
/*  531 */     f[][][] ☃ = bU[dy()];
/*      */     
/*  533 */     if (this.bP == 0 || this.bQ == 0) {
/*      */       
/*  535 */       this.bP = this.T.nextInt(☃.length) + 1;
/*  536 */       this.bQ = 1;
/*      */     } else {
/*  538 */       this.bQ++;
/*      */     } 
/*      */     
/*  541 */     if (this.bJ == null) {
/*  542 */       this.bJ = new axf();
/*      */     }
/*      */     
/*  545 */     int i = this.bP - 1;
/*  546 */     int j = this.bQ - 1;
/*      */     
/*  548 */     if (i < 0 || i >= ☃.length) {
/*      */       return;
/*      */     }
/*      */     
/*  552 */     f[][] arrayOfF = ☃[i];
/*  553 */     if (j >= 0 && j < arrayOfF.length) {
/*  554 */       f[] arrayOfF1 = arrayOfF[j];
/*  555 */       for (f f1 : arrayOfF1) {
/*  556 */         f1.a(this, this.bJ, this.T);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public axy c() {
/*  567 */     return this.m;
/*      */   }
/*      */ 
/*      */   
/*      */   public el d() {
/*  572 */     return new el(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public ij O() {
/*  577 */     cfe ☃ = be();
/*  578 */     ij ij = e();
/*  579 */     if (ij != null) {
/*  580 */       return cfa.a(☃, ij).a(☃ -> ☃.a(bC()).a(bu()));
/*      */     }
/*      */     
/*  583 */     if (this.bJ == null)
/*      */     {
/*  585 */       dK();
/*      */     }
/*      */     
/*  588 */     String str = null;
/*  589 */     switch (dy()) {
/*      */       case 0:
/*  591 */         if (this.bP == 1) {
/*  592 */           str = "farmer"; break;
/*  593 */         }  if (this.bP == 2) {
/*  594 */           str = "fisherman"; break;
/*  595 */         }  if (this.bP == 3) {
/*  596 */           str = "shepherd"; break;
/*  597 */         }  if (this.bP == 4) {
/*  598 */           str = "fletcher";
/*      */         }
/*      */         break;
/*      */       
/*      */       case 1:
/*  603 */         if (this.bP == 1) {
/*  604 */           str = "librarian"; break;
/*  605 */         }  if (this.bP == 2) {
/*  606 */           str = "cartographer";
/*      */         }
/*      */         break;
/*      */       
/*      */       case 2:
/*  611 */         str = "cleric";
/*      */         break;
/*      */       
/*      */       case 3:
/*  615 */         if (this.bP == 1) {
/*  616 */           str = "armorer"; break;
/*  617 */         }  if (this.bP == 2) {
/*  618 */           str = "weapon_smith"; break;
/*  619 */         }  if (this.bP == 3) {
/*  620 */           str = "tool_smith";
/*      */         }
/*      */         break;
/*      */       
/*      */       case 4:
/*  625 */         if (this.bP == 1) {
/*  626 */           str = "butcher"; break;
/*  627 */         }  if (this.bP == 2) {
/*  628 */           str = "leatherworker";
/*      */         }
/*      */         break;
/*      */       
/*      */       case 5:
/*  633 */         str = "nitwit";
/*      */         break;
/*      */     } 
/*      */ 
/*      */     
/*  638 */     if (str != null) {
/*  639 */       ij ij1 = (new ir(P().d() + '.' + str, new Object[0])).a(☃ -> ☃.a(bC()).a(bu()));
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  644 */       if (☃ != null) {
/*  645 */         ij1.a(☃.n());
/*      */       }
/*  647 */       return ij1;
/*      */     } 
/*      */     
/*  650 */     return super.O();
/*      */   }
/*      */ 
/*      */   
/*      */   public float bF() {
/*  655 */     if (y_()) {
/*  656 */       return 0.81F;
/*      */     }
/*  658 */     return 1.62F;
/*      */   }
/*      */   
/*  661 */   private static final f[][][][] bU = new f[][][][] { { { { new a(atf.S, new g(18, 22)), new a(atf.dD, new g(15, 19)), new a(atf.dC, new g(15, 19)), new e(atf.T, new g(-4, -2)) }, { new a(bct.dd, new g(8, 13)), new e(atf.dQ, new g(-3, -2)) }, { new a(bct.dH, new g(7, 12)), new e(atf.f, new g(-7, -5)) }, { new e(atf.bP, new g(-10, -6)), new e(bct.dk, new g(1, 1)) } }, { { new a(atf.J, new g(15, 20)), new a(atf.k, new g(16, 24)), new d(atf.bb, new g(6, 6), atf.bf, new g(6, 6)), new d(atf.bc, new g(6, 6), atf.bg, new g(6, 6)) }, { new c(atf.aY, new g(7, 8)) } }, { { new a(bct.aY, new g(16, 22)), new e(atf.bR, new g(3, 4)) }, { new e(new ate(bct.aY), new g(1, 2)), new e(new ate(bct.aZ), new g(1, 2)), new e(new ate(bct.ba), new g(1, 2)), new e(new ate(bct.bb), new g(1, 2)), new e(new ate(bct.bc), new g(1, 2)), new e(new ate(bct.bd), new g(1, 2)), new e(new ate(bct.be), new g(1, 2)), new e(new ate(bct.bf), new g(1, 2)), new e(new ate(bct.bg), new g(1, 2)), new e(new ate(bct.bh), new g(1, 2)), new e(new ate(bct.bi), new g(1, 2)), new e(new ate(bct.bj), new g(1, 2)), new e(new ate(bct.bk), new g(1, 2)), new e(new ate(bct.bl), new g(1, 2)), new e(new ate(bct.bm), new g(1, 2)), new e(new ate(bct.bn), new g(1, 2)) } }, { { new a(atf.J, new g(15, 20)), new e(atf.h, new g(-12, -8)) }, { new e(atf.g, new g(2, 3)), new d(bct.F, new g(10, 10), atf.ap, new g(6, 10)) } } }, { { { new a(atf.aR, new g(24, 36)), new b() }, { new a(atf.aS, new g(8, 10)), new e(atf.aX, new g(10, 12)), new e(bct.cc, new g(3, 4)) }, { new a(atf.dz, new g(2, 2)), new e(atf.aZ, new g(10, 12)), new e(bct.ap, new g(-5, -3)) }, { new b() }, { new b() }, { new e(atf.ed, new g(20, 22)) } }, { { new a(atf.aR, new g(24, 36)) }, { new a(atf.aX, new g(1, 1)) }, { new e(atf.dG, new g(7, 11)) }, { new h(new g(12, 20), "Monument", cbq.a.j), new h(new g(16, 28), "Mansion", cbq.a.i) } } }, { { { new a(atf.ch, new g(36, 40)), new a(atf.o, new g(8, 10)) }, { new e(atf.aB, new g(-4, -1)), new e(new ate(atf.bs), new g(-2, -1)) }, { new e(atf.ci, new g(4, 7)), new e(bct.dg, new g(-3, -1)) }, { new e(atf.dw, new g(3, 11)) } } }, { { { new a(atf.k, new g(16, 24)), new e(atf.ac, new g(4, 6)) }, { new a(atf.n, new g(7, 9)), new e(atf.ad, new g(10, 14)) }, { new a(atf.m, new g(3, 4)), new c(atf.ah, new g(16, 19)) }, { new e(atf.ab, new g(5, 7)), new e(atf.aa, new g(9, 11)), new e(atf.Y, new g(5, 7)), new e(atf.Z, new g(11, 15)) } }, { { new a(atf.k, new g(16, 24)), new e(atf.d, new g(6, 8)) }, { new a(atf.n, new g(7, 9)), new c(atf.p, new g(9, 10)) }, { new a(atf.m, new g(3, 4)), new c(atf.y, new g(12, 15)), new c(atf.B, new g(9, 12)) } }, { { new a(atf.k, new g(16, 24)), new c(atf.b, new g(5, 7)) }, { new a(atf.n, new g(7, 9)), new c(atf.c, new g(9, 11)) }, { new a(atf.m, new g(3, 4)), new c(atf.A, new g(12, 15)) } } }, { { { new a(atf.aq, new g(14, 18)), new a(atf.bY, new g(14, 18)) }, { new a(atf.k, new g(16, 24)), new e(atf.ar, new g(-7, -5)), new e(atf.bZ, new g(-8, -6)) } }, { { new a(atf.aJ, new g(9, 12)), new e(atf.W, new g(2, 4)) }, { new c(atf.V, new g(7, 12)) }, { new e(atf.aA, new g(8, 10)) } } }, { {} } };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static class g
/*      */     extends xx<Integer, Integer>
/*      */   {
/*      */     public g(int ☃, int i) {
/*  893 */       super(Integer.valueOf(☃), Integer.valueOf(i));
/*  894 */       if (i < ☃) {
/*  895 */         aob.dI().warn("PriceRange({}, {}) invalid, {} smaller than {}", Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(☃));
/*      */       }
/*      */     }
/*      */     
/*      */     public int a(Random ☃) {
/*  900 */       if (a().intValue() >= b().intValue()) {
/*  901 */         return a().intValue();
/*      */       }
/*  903 */       return a().intValue() + ☃.nextInt(b().intValue() - a().intValue() + 1);
/*      */     }
/*      */   }
/*      */   
/*      */   static interface f {
/*      */     void a(axd param1axd, axf param1axf, Random param1Random);
/*      */   }
/*      */   
/*      */   static class a
/*      */     implements f {
/*      */     public ata a;
/*      */     public aob.g b;
/*      */     
/*      */     public a(axx ☃, aob.g g1) {
/*  917 */       this.a = ☃.h();
/*  918 */       this.b = g1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(axd ☃, axf axf1, Random random) {
/*  923 */       ate ate = new ate(this.a, (this.b == null) ? 1 : this.b.a(random));
/*  924 */       axf1.add(new axe(ate, atf.dA));
/*      */     }
/*      */   }
/*      */   
/*      */   static class e implements f {
/*      */     public ate a;
/*      */     public aob.g b;
/*      */     
/*      */     public e(bcs ☃, aob.g g1) {
/*  933 */       this(new ate(☃), g1);
/*      */     }
/*      */     
/*      */     public e(ata ☃, aob.g g1) {
/*  937 */       this(new ate(☃), g1);
/*      */     }
/*      */     
/*      */     public e(ate ☃, aob.g g1) {
/*  941 */       this.a = ☃;
/*  942 */       this.b = g1;
/*      */     }
/*      */     
/*      */     public void a(axd ☃, axf axf1, Random random) {
/*      */       ate ate1, ate2;
/*  947 */       int i = 1;
/*  948 */       if (this.b != null) {
/*  949 */         i = this.b.a(random);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  954 */       if (i < 0) {
/*  955 */         ate1 = new ate(atf.dA);
/*  956 */         ate2 = new ate(this.a.b(), -i);
/*      */       } else {
/*  958 */         ate1 = new ate(atf.dA, i);
/*  959 */         ate2 = new ate(this.a.b());
/*      */       } 
/*  961 */       axf1.add(new axe(ate1, ate2));
/*      */     }
/*      */   }
/*      */   
/*      */   static class c implements f {
/*      */     public ate a;
/*      */     public aob.g b;
/*      */     
/*      */     public c(ata ☃, aob.g g1) {
/*  970 */       this.a = new ate(☃);
/*  971 */       this.b = g1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(axd ☃, axf axf1, Random random) {
/*  976 */       int i = 1;
/*  977 */       if (this.b != null) {
/*  978 */         i = this.b.a(random);
/*      */       }
/*      */       
/*  981 */       ate ate1 = new ate(atf.dA, i);
/*  982 */       ate ate2 = awg.a(random, new ate(this.a.b()), 5 + random.nextInt(15), false);
/*      */       
/*  984 */       axf1.add(new axe(ate1, ate2));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static class b
/*      */     implements f
/*      */   {
/*      */     public void a(axd ☃, axf axf1, Random random) {
/*  994 */       awe awe = fc.q.a(random);
/*  995 */       int i = xq.a(random, awe.e(), awe.a());
/*  996 */       ate ate = asi.a(new awh(awe, i));
/*  997 */       int j = 2 + random.nextInt(5 + i * 10) + 3 * i;
/*  998 */       if (awe.b()) {
/*  999 */         j *= 2;
/*      */       }
/* 1001 */       if (j > 64) {
/* 1002 */         j = 64;
/*      */       }
/*      */       
/* 1005 */       axf1.add(new axe(new ate(atf.aS), new ate(atf.dA, j), ate));
/*      */     }
/*      */   }
/*      */   
/*      */   static class h implements f {
/*      */     public aob.g a;
/*      */     public String b;
/*      */     public cbq.a c;
/*      */     
/*      */     public h(aob.g ☃, String str, cbq.a a1) {
/* 1015 */       this.a = ☃;
/* 1016 */       this.b = str;
/* 1017 */       this.c = a1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(axd ☃, axf axf1, Random random) {
/* 1022 */       int i = this.a.a(random);
/*      */ 
/*      */       
/* 1025 */       axy axy = ☃.c();
/* 1026 */       el el = axy.a(this.b, ☃.d(), 100, true);
/* 1027 */       if (el != null) {
/* 1028 */         ate ate = atj.a(axy, el.o(), el.q(), (byte)2, true, true);
/* 1029 */         atj.a(axy, ate);
/* 1030 */         cbs.a(ate, el, "+", this.c);
/* 1031 */         ate.a(new ir("filled_map." + this.b.toLowerCase(Locale.ROOT), new Object[0]));
/* 1032 */         axf1.add(new axe(new ate(atf.dA, i), new ate(atf.aX), ate));
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   static class d implements f {
/*      */     public ate a;
/*      */     public aob.g b;
/*      */     public ate c;
/*      */     public aob.g d;
/*      */     
/*      */     public d(axx ☃, aob.g g1, ata ata1, aob.g g2) {
/* 1044 */       this.a = new ate(☃);
/* 1045 */       this.b = g1;
/* 1046 */       this.c = new ate(ata1);
/* 1047 */       this.d = g2;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(axd ☃, axf axf1, Random random) {
/* 1052 */       int i = this.b.a(random);
/* 1053 */       int j = this.d.a(random);
/*      */       
/* 1055 */       axf1.add(new axe(new ate(this.a.b(), i), new ate(atf.dA), new ate(this.c.b(), j)));
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
/*      */ 
/*      */ 
/*      */ 
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
/*      */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 1084 */     return a(☃, afj1, gy1, true);
/*      */   }
/*      */   
/*      */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1, boolean bool) {
/* 1088 */     afj1 = super.a(☃, afj1, gy1);
/*      */     
/* 1090 */     if (bool) {
/* 1091 */       d(this.m.s.nextInt(6));
/*      */     }
/*      */     
/* 1094 */     dJ();
/*      */     
/* 1096 */     dK();
/*      */     
/* 1098 */     return afj1;
/*      */   }
/*      */   
/*      */   public void dC() {
/* 1102 */     this.bR = true;
/*      */   }
/*      */ 
/*      */   
/*      */   public aob b(aeo ☃) {
/* 1107 */     aob aob1 = new aob(this.m);
/* 1108 */     aob1.a(this.m.h(new el(aob1)), (afj)null, (gy)null);
/* 1109 */     return aob1;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aog ☃) {
/* 1114 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(amj ☃) {
/* 1119 */     if (this.m.B || this.G) {
/*      */       return;
/*      */     }
/*      */     
/* 1123 */     anu anu = new anu(this.m);
/* 1124 */     anu.b(this.q, this.r, this.s, this.w, this.x);
/* 1125 */     anu.a(this.m.h(new el(anu)), (afj)null, (gy)null);
/* 1126 */     anu.q(do());
/* 1127 */     if (O_()) {
/* 1128 */       anu.b(e());
/* 1129 */       anu.m(by());
/*      */     } 
/* 1131 */     this.m.a(anu);
/* 1132 */     V();
/*      */   }
/*      */   
/*      */   public adt dD() {
/* 1136 */     return this.bT;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(amm ☃) {
/* 1141 */     ate ate = ☃.i();
/* 1142 */     ata ata = ate.b();
/*      */     
/* 1144 */     if (a(ata)) {
/* 1145 */       ate ate1 = this.bT.a(ate);
/* 1146 */       if (ate1.a()) {
/* 1147 */         ☃.V();
/*      */       } else {
/* 1149 */         ate.e(ate1.C());
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean a(ata ☃) {
/* 1155 */     return (☃ == atf.T || ☃ == atf.dD || ☃ == atf.dC || ☃ == atf.S || ☃ == atf.R || ☃ == atf.eP || ☃ == atf.eO);
/*      */   }
/*      */   
/*      */   public boolean dE() {
/* 1159 */     return p(1);
/*      */   }
/*      */   
/*      */   public boolean dF() {
/* 1163 */     return p(2);
/*      */   }
/*      */   
/*      */   public boolean dG() {
/* 1167 */     boolean ☃ = (dy() == 0);
/* 1168 */     if (☃) {
/* 1169 */       return !p(5);
/*      */     }
/* 1171 */     return !p(1);
/*      */   }
/*      */   
/*      */   private boolean p(int ☃) {
/* 1175 */     boolean bool = (dy() == 0);
/*      */     
/* 1177 */     for (int i = 0; i < this.bT.T_(); i++) {
/* 1178 */       ate ate = this.bT.a(i);
/* 1179 */       ata ata = ate.b();
/* 1180 */       int j = ate.C();
/*      */       
/* 1182 */       if ((ata == atf.T && j >= 3 * ☃) || (ata == atf.dD && j >= 12 * ☃) || (ata == atf.dC && j >= 12 * ☃) || (ata == atf.eP && j >= 12 * ☃))
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 1187 */         return true;
/*      */       }
/* 1189 */       if (bool && ata == atf.S && j >= 9 * ☃) {
/* 1190 */         return true;
/*      */       }
/*      */     } 
/* 1193 */     return false;
/*      */   }
/*      */   
/*      */   public boolean dH() {
/* 1197 */     for (int ☃ = 0; ☃ < this.bT.T_(); ☃++) {
/* 1198 */       ata ata = this.bT.a(☃).b();
/* 1199 */       if (ata == atf.R || ata == atf.dD || ata == atf.dC || ata == atf.eO) {
/* 1200 */         return true;
/*      */       }
/*      */     } 
/* 1203 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(int ☃, ate ate1) {
/* 1208 */     if (super.c(☃, ate1)) {
/* 1209 */       return true;
/*      */     }
/* 1211 */     int i = ☃ - 300;
/* 1212 */     if (i >= 0 && i < this.bT.T_()) {
/* 1213 */       this.bT.a(i, ate1);
/* 1214 */       return true;
/*      */     } 
/* 1216 */     return false;
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\aob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */