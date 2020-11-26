/*      */ import com.google.common.base.Objects;
/*      */ import com.google.common.collect.Maps;
/*      */ import java.util.Collection;
/*      */ import java.util.ConcurrentModificationException;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
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
/*      */ public abstract class afa
/*      */   extends aer
/*      */ {
/*   91 */   private static final Logger a = LogManager.getLogger();
/*   92 */   private static final UUID b = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
/*   93 */   private static final afo c = (new afo(b, "Sprinting speed boost", 0.30000001192092896D, 2)).a(false);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  108 */   protected static final or<Byte> aw = ou.a((Class)afa.class, ot.a);
/*  109 */   private static final or<Float> f = ou.a((Class)afa.class, ot.c);
/*  110 */   private static final or<Integer> g = ou.a((Class)afa.class, ot.b);
/*  111 */   private static final or<Boolean> h = ou.a((Class)afa.class, ot.i);
/*  112 */   private static final or<Integer> bx = ou.a((Class)afa.class, ot.b);
/*      */   
/*      */   private afq by;
/*      */   
/*  116 */   private final adz bz = new adz(this);
/*  117 */   private final Map<aej, aek> bA = Maps.newHashMap();
/*  118 */   private final ez<ate> bB = ez.a(2, ate.a);
/*  119 */   private final ez<ate> bC = ez.a(4, ate.a);
/*      */   public boolean ax;
/*      */   public adk ay;
/*      */   public int az;
/*      */   public int aA;
/*      */   public int aB;
/*      */   public int aC;
/*      */   public float aD;
/*      */   public int aE;
/*      */   public float aF;
/*      */   public float aG;
/*      */   protected int aH;
/*      */   public float aI;
/*      */   public float aJ;
/*      */   public float aK;
/*  134 */   public int aL = 20;
/*      */   public float aM;
/*      */   public float aN;
/*      */   public float aO;
/*      */   public float aP;
/*      */   public float aQ;
/*      */   public float aR;
/*      */   public float aS;
/*      */   public float aT;
/*  143 */   public float aU = 0.02F;
/*      */   protected aog aV;
/*      */   protected int aW;
/*      */   protected boolean aX;
/*      */   protected int aY;
/*      */   protected float aZ;
/*      */   protected float ba;
/*      */   protected float bb;
/*      */   protected float bc;
/*      */   protected float bd;
/*      */   protected int be;
/*      */   protected float bf;
/*      */   protected boolean bg;
/*      */   public float bh;
/*      */   public float bi;
/*      */   public float bj;
/*      */   public float bk;
/*      */   protected int bl;
/*      */   protected double bm;
/*      */   protected double bn;
/*      */   protected double bo;
/*      */   protected double bp;
/*      */   protected double bq;
/*      */   protected double br;
/*      */   protected int bs;
/*      */   private boolean bD = true;
/*      */   private afa bE;
/*      */   private int bF;
/*      */   private afa bG;
/*      */   private int bH;
/*      */   private float bI;
/*      */   private int bJ;
/*      */   private float bK;
/*  176 */   protected ate bt = ate.a;
/*      */   protected int bu;
/*      */   protected int bv;
/*      */   private el bL;
/*      */   private aea bM;
/*      */   private long bN;
/*      */   protected int bw;
/*      */   private float bO;
/*      */   private float bP;
/*      */   
/*      */   protected afa(aev<?> ☃, axy axy1) {
/*  187 */     super(☃, axy1);
/*      */     
/*  189 */     bZ();
/*  190 */     l(cw());
/*      */     
/*  192 */     this.j = true;
/*  193 */     this.aP = (float)((Math.random() + 1.0D) * 0.009999999776482582D);
/*  194 */     b(this.q, this.r, this.s);
/*  195 */     this.aO = (float)Math.random() * 12398.0F;
/*  196 */     this.w = (float)(Math.random() * 6.2831854820251465D);
/*  197 */     this.aS = this.w;
/*  198 */     this.Q = 0.6F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void S() {
/*  203 */     a(aea.m, Float.MAX_VALUE);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void x_() {
/*  208 */     this.ab.a(aw, Byte.valueOf((byte)0));
/*  209 */     this.ab.a(g, Integer.valueOf(0));
/*  210 */     this.ab.a(h, Boolean.valueOf(false));
/*  211 */     this.ab.a(bx, Integer.valueOf(0));
/*  212 */     this.ab.a(f, Float.valueOf(1.0F));
/*      */   }
/*      */   
/*      */   protected void bZ() {
/*  216 */     cz().b(ank.a);
/*  217 */     cz().b(ank.c);
/*  218 */     cz().b(ank.d);
/*  219 */     cz().b(ank.h);
/*  220 */     cz().b(ank.i);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, blc blc1, el el1) {
/*  225 */     if (!an())
/*      */     {
/*  227 */       at();
/*      */     }
/*      */     
/*  230 */     if (!this.m.B && this.M > 3.0F && bool) {
/*  231 */       float f = xq.f(this.M - 3.0F);
/*  232 */       if (!blc1.f()) {
/*  233 */         double d = Math.min((0.2F + f / 15.0F), 2.5D);
/*  234 */         int i = (int)(150.0D * d);
/*  235 */         ((td)this.m).a(new fh(fm.d, blc1), this.q, this.r, this.s, i, 0.0D, 0.0D, 0.0D, 0.15000000596046448D);
/*      */       } 
/*      */     } 
/*      */     
/*  239 */     super.a(☃, bool, blc1, el1);
/*      */   }
/*      */   
/*      */   public boolean ca() {
/*  243 */     return (cA() == afd.b);
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
/*      */   public void W() {
/*  256 */     this.aF = this.aG;
/*  257 */     super.W();
/*      */     
/*  259 */     this.m.A.a("livingEntityBaseTick");
/*      */     
/*  261 */     boolean ☃ = this instanceof aog;
/*  262 */     if (aF()) {
/*  263 */       if (aG()) {
/*  264 */         a(aea.f, 1.0F);
/*  265 */       } else if (☃ && !this.m.d().a(bD())) {
/*  266 */         double d = this.m.d().a(this) + this.m.d().m();
/*  267 */         if (d < 0.0D) {
/*  268 */           double d1 = this.m.d().n();
/*  269 */           if (d1 > 0.0D) {
/*  270 */             a(aea.f, Math.max(1, xq.c(-d * d1)));
/*      */           }
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*  276 */     if (am() || this.m.B) {
/*  277 */       Z();
/*      */     }
/*  279 */     boolean bool1 = (☃ && ((aog)this).bV.a);
/*      */     
/*  281 */     if (aF()) {
/*  282 */       if (a(ww.a) && this.m.a_(new el(this.q, this.r + bF(), this.s)).c() != bct.B) {
/*  283 */         if (!ca() && !ael.c(this) && !bool1) {
/*  284 */           i(k(bg()));
/*  285 */           if (bg() == -20) {
/*  286 */             i(0);
/*  287 */             for (int i = 0; i < 8; i++) {
/*  288 */               float f1 = this.T.nextFloat() - this.T.nextFloat();
/*  289 */               float f2 = this.T.nextFloat() - this.T.nextFloat();
/*  290 */               float f3 = this.T.nextFloat() - this.T.nextFloat();
/*  291 */               this.m.a(fm.e, this.q + f1, this.r + f2, this.s + f3, this.t, this.u, this.v);
/*      */             } 
/*  293 */             a(aea.h, 2.0F);
/*      */           } 
/*      */         } 
/*      */         
/*  297 */         if (!this.m.B && aW() && bU() != null && !bU().aY()) {
/*  298 */           S_();
/*      */         }
/*  300 */       } else if (bg() < bf()) {
/*  301 */         i(l(bg()));
/*      */       } 
/*      */       
/*  304 */       if (!this.m.B) {
/*  305 */         el el1 = new el(this);
/*  306 */         if (!Objects.equal(this.bL, el1)) {
/*  307 */           this.bL = el1;
/*  308 */           b(el1);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  313 */     if (aF() && ap()) {
/*  314 */       Z();
/*      */     }
/*      */     
/*  317 */     this.aM = this.aN;
/*      */     
/*  319 */     if (this.aB > 0) {
/*  320 */       this.aB--;
/*      */     }
/*  322 */     if (this.Y > 0 && !(this instanceof tf)) {
/*  323 */       this.Y--;
/*      */     }
/*  325 */     if (cq() <= 0.0F) {
/*  326 */       cb();
/*      */     }
/*  328 */     if (this.aW > 0) {
/*  329 */       this.aW--;
/*      */     } else {
/*  331 */       this.aV = null;
/*      */     } 
/*  333 */     if (this.bG != null && !this.bG.aF()) {
/*  334 */       this.bG = null;
/*      */     }
/*      */     
/*  337 */     if (this.bE != null) {
/*  338 */       if (!this.bE.aF()) {
/*  339 */         a((afa)null);
/*  340 */       } else if (this.U - this.bF > 100) {
/*  341 */         a((afa)null);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  346 */     ck();
/*      */     
/*  348 */     this.bc = this.bb;
/*      */     
/*  350 */     this.aR = this.aQ;
/*  351 */     this.aT = this.aS;
/*  352 */     this.y = this.w;
/*  353 */     this.z = this.x;
/*      */     
/*  355 */     this.m.A.e();
/*      */   }
/*      */   
/*      */   protected void b(el ☃) {
/*  359 */     int i = awg.a(awi.j, this);
/*  360 */     if (i > 0) {
/*  361 */       awl.a(this, this.m, ☃, i);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean y_() {
/*  366 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aY() {
/*  371 */     return false;
/*      */   }
/*      */   
/*      */   protected void cb() {
/*  375 */     this.aE++;
/*  376 */     if (this.aE == 20) {
/*  377 */       if (!this.m.B && (cd() || (this.aW > 0 && cc() && this.m.X().b("doMobLoot")))) {
/*  378 */         int i = b(this.aV);
/*  379 */         while (i > 0) {
/*  380 */           int j = aex.a(i);
/*  381 */           i -= j;
/*  382 */           this.m.a(new aex(this.m, this.q, this.r, this.s, j));
/*      */         } 
/*      */       } 
/*      */       
/*  386 */       V();
/*  387 */       for (int ☃ = 0; ☃ < 20; ☃++) {
/*  388 */         double d1 = this.T.nextGaussian() * 0.02D;
/*  389 */         double d2 = this.T.nextGaussian() * 0.02D;
/*  390 */         double d3 = this.T.nextGaussian() * 0.02D;
/*  391 */         this.m.a(fm.J, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H, this.r + (this.T.nextFloat() * this.I), this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H, d1, d2, d3);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean cc() {
/*  397 */     return !y_();
/*      */   }
/*      */   
/*      */   protected int k(int ☃) {
/*  401 */     int i = awg.d(this);
/*  402 */     if (i > 0 && 
/*  403 */       this.T.nextInt(i + 1) > 0)
/*      */     {
/*  405 */       return ☃;
/*      */     }
/*      */     
/*  408 */     return ☃ - 1;
/*      */   }
/*      */   
/*      */   protected int l(int ☃) {
/*  412 */     return Math.min(☃ + 4, bf());
/*      */   }
/*      */   
/*      */   protected int b(aog ☃) {
/*  416 */     return 0;
/*      */   }
/*      */   
/*      */   protected boolean cd() {
/*  420 */     return false;
/*      */   }
/*      */   
/*      */   public Random ce() {
/*  424 */     return this.T;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public afa cf() {
/*  429 */     return this.bE;
/*      */   }
/*      */   
/*      */   public int cg() {
/*  433 */     return this.bF;
/*      */   }
/*      */   
/*      */   public void a(@Nullable afa ☃) {
/*  437 */     this.bE = ☃;
/*  438 */     this.bF = this.U;
/*      */   }
/*      */   
/*      */   public afa ch() {
/*  442 */     return this.bG;
/*      */   }
/*      */   
/*      */   public int ci() {
/*  446 */     return this.bH;
/*      */   }
/*      */   
/*      */   public void z(aer ☃) {
/*  450 */     if (☃ instanceof afa) {
/*  451 */       this.bG = (afa)☃;
/*      */     } else {
/*  453 */       this.bG = null;
/*      */     } 
/*  455 */     this.bH = this.U;
/*      */   }
/*      */   
/*      */   public int cj() {
/*  459 */     return this.aY;
/*      */   }
/*      */   
/*      */   protected void b(ate ☃) {
/*  463 */     if (☃.a()) {
/*      */       return;
/*      */     }
/*      */     
/*  467 */     wi wi = wj.s;
/*  468 */     ata ata = ☃.b();
/*  469 */     if (ata instanceof arb) {
/*  470 */       wi = ((arb)ata).d().b();
/*  471 */     } else if (ata == atf.eL) {
/*  472 */       wi = wj.r;
/*      */     } 
/*      */     
/*  475 */     a(wi, 1.0F, 1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(gy ☃) {
/*  480 */     ☃.a("Health", cq());
/*  481 */     ☃.a("HurtTime", (short)this.aB);
/*  482 */     ☃.b("HurtByTimestamp", this.bF);
/*  483 */     ☃.a("DeathTime", (short)this.aE);
/*  484 */     ☃.a("AbsorptionAmount", cQ());
/*      */     
/*  486 */     for (aew aew : aew.values()) {
/*  487 */       ate ate1 = b(aew);
/*  488 */       if (!ate1.a()) {
/*  489 */         cz().a(ate1.a(aew));
/*      */       }
/*      */     } 
/*      */     
/*  493 */     ☃.a("Attributes", ank.a(cz()));
/*      */     
/*  495 */     for (aew aew : aew.values()) {
/*  496 */       ate ate1 = b(aew);
/*  497 */       if (!ate1.a()) {
/*  498 */         cz().b(ate1.a(aew));
/*      */       }
/*      */     } 
/*      */     
/*  502 */     if (!this.bA.isEmpty()) {
/*  503 */       he he = new he();
/*      */       
/*  505 */       for (aek aek : this.bA.values()) {
/*  506 */         he.a(aek.a(new gy()));
/*      */       }
/*  508 */       ☃.a("ActiveEffects", he);
/*      */     } 
/*      */     
/*  511 */     ☃.a("FallFlying", dc());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(gy ☃) {
/*  516 */     q(☃.j("AbsorptionAmount"));
/*      */     
/*  518 */     if (☃.c("Attributes", 9) && this.m != null && !this.m.B) {
/*  519 */       ank.a(cz(), ☃.d("Attributes", 10));
/*      */     }
/*      */     
/*  522 */     if (☃.c("ActiveEffects", 9)) {
/*  523 */       he he = ☃.d("ActiveEffects", 10);
/*  524 */       for (int i = 0; i < he.size(); i++) {
/*  525 */         gy gy1 = he.e(i);
/*  526 */         aek aek = aek.b(gy1);
/*  527 */         if (aek != null) {
/*  528 */           this.bA.put(aek.a(), aek);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  533 */     if (☃.c("Health", 99)) {
/*  534 */       l(☃.j("Health"));
/*      */     }
/*      */     
/*  537 */     this.aB = ☃.g("HurtTime");
/*  538 */     this.aE = ☃.g("DeathTime");
/*  539 */     this.bF = ☃.h("HurtByTimestamp");
/*      */ 
/*      */     
/*  542 */     if (☃.c("Team", 8)) {
/*  543 */       String str = ☃.l("Team");
/*  544 */       cfa cfa = this.m.G().f(str);
/*  545 */       boolean bool = (cfa != null && this.m.G().a(bu(), cfa));
/*  546 */       if (!bool) {
/*  547 */         a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", str);
/*      */       }
/*      */     } 
/*      */     
/*  551 */     if (☃.q("FallFlying")) {
/*  552 */       b(7, true);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void ck() {
/*  557 */     Iterator<aej> ☃ = this.bA.keySet().iterator();
/*      */     try {
/*  559 */       while (☃.hasNext()) {
/*  560 */         aej aej = ☃.next();
/*  561 */         aek aek = this.bA.get(aej);
/*      */         
/*  563 */         if (!aek.a(this)) {
/*  564 */           if (!this.m.B) {
/*  565 */             ☃.remove();
/*  566 */             b(aek);
/*      */           }  continue;
/*  568 */         }  if (aek.b() % 600 == 0)
/*      */         {
/*  570 */           a(aek, false);
/*      */         }
/*      */       } 
/*  573 */     } catch (ConcurrentModificationException concurrentModificationException) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  578 */     if (this.bD) {
/*  579 */       if (!this.m.B) {
/*  580 */         C();
/*      */       }
/*  582 */       this.bD = false;
/*      */     } 
/*  584 */     int i = ((Integer)this.ab.<Integer>a(g)).intValue();
/*  585 */     boolean bool = ((Boolean)this.ab.<Boolean>a(h)).booleanValue();
/*      */     
/*  587 */     if (i > 0) {
/*      */       boolean bool1; int j;
/*  589 */       if (bd()) {
/*      */         
/*  591 */         bool1 = (this.T.nextInt(15) == 0);
/*      */       } else {
/*  593 */         bool1 = this.T.nextBoolean();
/*      */       } 
/*      */       
/*  596 */       if (bool) {
/*  597 */         j = bool1 & ((this.T.nextInt(5) == 0) ? 1 : 0);
/*      */       }
/*      */       
/*  600 */       if (j != 0 && 
/*  601 */         i > 0) {
/*  602 */         double d1 = (i >> 16 & 0xFF) / 255.0D;
/*  603 */         double d2 = (i >> 8 & 0xFF) / 255.0D;
/*  604 */         double d3 = (i >> 0 & 0xFF) / 255.0D;
/*      */         
/*  606 */         this.m.a(bool ? fm.a : fm.s, this.q + (this.T
/*      */             
/*  608 */             .nextDouble() - 0.5D) * this.H, this.r + this.T
/*  609 */             .nextDouble() * this.I, this.s + (this.T
/*  610 */             .nextDouble() - 0.5D) * this.H, d1, d2, d3);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void C() {
/*  621 */     if (this.bA.isEmpty()) {
/*  622 */       cl();
/*  623 */       i(false);
/*      */     } else {
/*  625 */       Collection<aek> ☃ = this.bA.values();
/*  626 */       this.ab.b(h, Boolean.valueOf(c(☃)));
/*  627 */       this.ab.b(g, Integer.valueOf(auv.a(☃)));
/*  628 */       i(a(aem.n));
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean c(Collection<aek> ☃) {
/*  633 */     for (aek aek : ☃) {
/*  634 */       if (!aek.d()) {
/*  635 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  639 */     return true;
/*      */   }
/*      */   
/*      */   protected void cl() {
/*  643 */     this.ab.b(h, Boolean.valueOf(false));
/*  644 */     this.ab.b(g, Integer.valueOf(0));
/*      */   }
/*      */   
/*      */   public boolean cm() {
/*  648 */     if (this.m.B) {
/*  649 */       return false;
/*      */     }
/*      */     
/*  652 */     Iterator<aek> ☃ = this.bA.values().iterator();
/*  653 */     boolean bool = false;
/*  654 */     while (☃.hasNext()) {
/*  655 */       b(☃.next());
/*  656 */       ☃.remove();
/*  657 */       bool = true;
/*      */     } 
/*  659 */     return bool;
/*      */   }
/*      */   
/*      */   public Collection<aek> cn() {
/*  663 */     return this.bA.values();
/*      */   }
/*      */   
/*      */   public Map<aej, aek> co() {
/*  667 */     return this.bA;
/*      */   }
/*      */   
/*      */   public boolean a(aej ☃) {
/*  671 */     return this.bA.containsKey(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aek b(aej ☃) {
/*  676 */     return this.bA.get(☃);
/*      */   }
/*      */   
/*      */   public boolean c(aek ☃) {
/*  680 */     if (!d(☃)) {
/*  681 */       return false;
/*      */     }
/*      */     
/*  684 */     aek aek1 = this.bA.get(☃.a());
/*  685 */     if (aek1 == null) {
/*  686 */       this.bA.put(☃.a(), ☃);
/*  687 */       a(☃);
/*  688 */       return true;
/*      */     } 
/*      */     
/*  691 */     if (aek1.a(☃)) {
/*  692 */       a(aek1, true);
/*  693 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  697 */     return false;
/*      */   }
/*      */   
/*      */   public boolean d(aek ☃) {
/*  701 */     if (cA() == afd.b) {
/*  702 */       aej aej = ☃.a();
/*  703 */       if (aej == aem.j || aej == aem.s) {
/*  704 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  708 */     return true;
/*      */   }
/*      */   
/*      */   public boolean cp() {
/*  712 */     return (cA() == afd.b);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aek c(@Nullable aej ☃) {
/*  717 */     return this.bA.remove(☃);
/*      */   }
/*      */   
/*      */   public boolean d(aej ☃) {
/*  721 */     aek aek = c(☃);
/*  722 */     if (aek != null) {
/*  723 */       b(aek);
/*  724 */       return true;
/*      */     } 
/*  726 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(aek ☃) {
/*  730 */     this.bD = true;
/*  731 */     if (!this.m.B) {
/*  732 */       ☃.a().b(this, cz(), ☃.c());
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(aek ☃, boolean bool) {
/*  737 */     this.bD = true;
/*  738 */     if (bool && !this.m.B) {
/*  739 */       aej aej = ☃.a();
/*  740 */       aej.a(this, cz(), ☃.c());
/*  741 */       aej.b(this, cz(), ☃.c());
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void b(aek ☃) {
/*  746 */     this.bD = true;
/*  747 */     if (!this.m.B) {
/*  748 */       ☃.a().a(this, cz(), ☃.c());
/*      */     }
/*      */   }
/*      */   
/*      */   public void c(float ☃) {
/*  753 */     float f = cq();
/*  754 */     if (f > 0.0F) {
/*  755 */       l(f + ☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public float cq() {
/*  760 */     return ((Float)this.ab.<Float>a(f)).floatValue();
/*      */   }
/*      */   
/*      */   public void l(float ☃) {
/*  764 */     this.ab.b(f, Float.valueOf(xq.a(☃, 0.0F, cw())));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aea ☃, float f) {
/*  769 */     if (b(☃)) {
/*  770 */       return false;
/*      */     }
/*  772 */     if (this.m.B) {
/*  773 */       return false;
/*      */     }
/*      */     
/*  776 */     if (cq() <= 0.0F) {
/*  777 */       return false;
/*      */     }
/*      */     
/*  780 */     if (☃.p() && a(aem.l)) {
/*  781 */       return false;
/*      */     }
/*      */     
/*  784 */     this.aY = 0;
/*  785 */     float f1 = f;
/*      */     
/*  787 */     if ((☃ == aea.q || ☃ == aea.r) && !b(aew.f).a()) {
/*  788 */       b(aew.f).a((int)(f * 4.0F + this.T.nextFloat() * f * 2.0F), this);
/*  789 */       f *= 0.75F;
/*      */     } 
/*      */     
/*  792 */     boolean bool1 = false;
/*  793 */     float f2 = 0.0F;
/*  794 */     if (f > 0.0F && f(☃)) {
/*  795 */       n(f);
/*      */       
/*  797 */       f2 = f;
/*  798 */       f = 0.0F;
/*  799 */       if (!☃.b()) {
/*      */         
/*  801 */         aer aer2 = ☃.j();
/*  802 */         if (aer2 instanceof afa) {
/*  803 */           c((afa)aer2);
/*      */         }
/*      */       } 
/*      */       
/*  807 */       bool1 = true;
/*      */     } 
/*      */     
/*  810 */     this.aJ = 1.5F;
/*      */     
/*  812 */     boolean bool2 = true;
/*  813 */     if (this.Y > this.aL / 2.0F) {
/*  814 */       if (f <= this.bf) {
/*  815 */         return false;
/*      */       }
/*  817 */       d(☃, f - this.bf);
/*  818 */       this.bf = f;
/*  819 */       bool2 = false;
/*      */     } else {
/*  821 */       this.bf = f;
/*  822 */       this.Y = this.aL;
/*  823 */       d(☃, f);
/*  824 */       this.aC = 10;
/*  825 */       this.aB = this.aC;
/*      */     } 
/*      */     
/*  828 */     this.aD = 0.0F;
/*      */     
/*  830 */     aer aer1 = ☃.k();
/*  831 */     if (aer1 != null) {
/*  832 */       if (aer1 instanceof afa) {
/*  833 */         a((afa)aer1);
/*      */       }
/*  835 */       if (aer1 instanceof aog) {
/*  836 */         this.aW = 100;
/*  837 */         this.aV = (aog)aer1;
/*  838 */       } else if (aer1 instanceof akm) {
/*  839 */         akm akm = (akm)aer1;
/*  840 */         if (akm.dy()) {
/*  841 */           this.aW = 100;
/*  842 */           this.aV = null;
/*      */         } 
/*      */       } 
/*      */     } 
/*  846 */     if (bool2) {
/*  847 */       if (bool1) {
/*  848 */         this.m.a(this, (byte)29);
/*      */       }
/*  850 */       else if (☃ instanceof aeb && ((aeb)☃).y()) {
/*  851 */         this.m.a(this, (byte)33);
/*      */       } else {
/*      */         byte b;
/*  854 */         if (☃ == aea.h) {
/*  855 */           b = 36;
/*  856 */         } else if (☃.p()) {
/*  857 */           b = 37;
/*      */         } else {
/*  859 */           b = 2;
/*      */         } 
/*  861 */         this.m.a(this, b);
/*      */       } 
/*      */       
/*  864 */       if (☃ != aea.h && (!bool1 || f > 0.0F)) {
/*  865 */         aA();
/*      */       }
/*  867 */       if (aer1 != null) {
/*  868 */         double d1 = aer1.q - this.q;
/*  869 */         double d2 = aer1.s - this.s;
/*  870 */         while (d1 * d1 + d2 * d2 < 1.0E-4D) {
/*  871 */           d1 = (Math.random() - Math.random()) * 0.01D;
/*  872 */           d2 = (Math.random() - Math.random()) * 0.01D;
/*      */         } 
/*  874 */         this.aD = (float)(xq.c(d2, d1) * 57.2957763671875D - this.w);
/*  875 */         a(aer1, 0.4F, d1, d2);
/*      */       } else {
/*  877 */         this.aD = ((int)(Math.random() * 2.0D) * 180);
/*      */       } 
/*      */     } 
/*      */     
/*  881 */     if (cq() <= 0.0F) {
/*  882 */       if (!e(☃)) {
/*  883 */         wi wi = cs();
/*  884 */         if (bool2 && wi != null) {
/*  885 */           a(wi, cD(), cE());
/*      */         }
/*  887 */         a(☃);
/*      */       }
/*      */     
/*  890 */     } else if (bool2) {
/*  891 */       c(☃);
/*      */     } 
/*      */ 
/*      */     
/*  895 */     boolean bool3 = (!bool1 || f > 0.0F);
/*  896 */     if (bool3) {
/*  897 */       this.bM = ☃;
/*  898 */       this.bN = this.m.V();
/*      */     } 
/*  900 */     if (this instanceof tf) {
/*  901 */       p.h.a((tf)this, ☃, f1, f, bool1);
/*      */       
/*  903 */       if (f2 > 0.0F && f2 < 3.4028235E37F) {
/*  904 */         ((tf)this).a(ws.I, Math.round(f2 * 10.0F));
/*      */       }
/*      */     } 
/*  907 */     if (aer1 instanceof tf) {
/*  908 */       p.g.a((tf)aer1, this, ☃, f1, f, bool1);
/*      */     }
/*  910 */     return bool3;
/*      */   }
/*      */   
/*      */   protected void c(afa ☃) {
/*  914 */     ☃.a(this, 0.5F, this.q - ☃.q, this.s - ☃.s);
/*      */   }
/*      */   
/*      */   private boolean e(aea ☃) {
/*  918 */     if (☃.h()) {
/*  919 */       return false;
/*      */     }
/*      */     
/*  922 */     ate ate1 = null;
/*      */     
/*  924 */     for (adk adk1 : adk.values()) {
/*  925 */       ate ate2 = b(adk1);
/*  926 */       if (ate2.b() == atf.eR) {
/*  927 */         ate1 = ate2.i();
/*  928 */         ate2.g(1);
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*  933 */     if (ate1 != null) {
/*      */       
/*  935 */       if (this instanceof tf) {
/*  936 */         tf tf = (tf)this;
/*  937 */         tf.b(ws.c.b(atf.eR));
/*  938 */         p.B.a(tf, ate1);
/*      */       } 
/*  940 */       l(1.0F);
/*  941 */       cm();
/*  942 */       c(new aek(aem.j, 900, 1));
/*  943 */       c(new aek(aem.v, 100, 1));
/*  944 */       this.m.a(this, (byte)35);
/*      */     } 
/*  946 */     return (ate1 != null);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aea cr() {
/*  951 */     if (this.m.V() - this.bN > 40L) {
/*  952 */       this.bM = null;
/*      */     }
/*  954 */     return this.bM;
/*      */   }
/*      */   
/*      */   protected void c(aea ☃) {
/*  958 */     wi wi = d(☃);
/*  959 */     if (wi != null) {
/*  960 */       a(wi, cD(), cE());
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean f(aea ☃) {
/*  965 */     if (!☃.f() && db()) {
/*  966 */       cee cee = ☃.w();
/*  967 */       if (cee != null) {
/*  968 */         cee cee1 = f(1.0F);
/*  969 */         cee cee2 = cee.a(new cee(this.q, this.r, this.s)).a();
/*  970 */         cee2 = new cee(cee2.b, 0.0D, cee2.d);
/*      */ 
/*      */ 
/*      */         
/*  974 */         if (cee2.b(cee1) < 0.0D) {
/*  975 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/*  979 */     return false;
/*      */   }
/*      */   
/*      */   public void c(ate ☃) {
/*  983 */     a(wj.eD, 0.8F, 0.8F + this.m.s.nextFloat() * 0.4F);
/*  984 */     a(☃, 5);
/*      */   }
/*      */   
/*      */   public void a(aea ☃) {
/*  988 */     if (this.aX) {
/*      */       return;
/*      */     }
/*  991 */     aer aer1 = ☃.k();
/*  992 */     afa afa1 = cv();
/*  993 */     if (this.be >= 0 && afa1 != null) {
/*  994 */       afa1.a(this, this.be, ☃);
/*      */     }
/*      */     
/*  997 */     if (aer1 != null) {
/*  998 */       aer1.b(this);
/*      */     }
/*      */     
/* 1001 */     this.aX = true;
/* 1002 */     cu().g();
/*      */     
/* 1004 */     if (!this.m.B) {
/* 1005 */       int i = 0;
/* 1006 */       if (aer1 instanceof aog) {
/* 1007 */         i = awg.g((afa)aer1);
/*      */       }
/* 1009 */       if (cc() && this.m.X().b("doMobLoot")) {
/* 1010 */         boolean bool = (this.aW > 0);
/* 1011 */         a(bool, i, ☃);
/*      */       } 
/*      */     } 
/*      */     
/* 1015 */     this.m.a(this, (byte)3);
/*      */   }
/*      */   
/*      */   protected void a(boolean ☃, int i, aea aea1) {
/* 1019 */     b(☃, i);
/* 1020 */     a(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(boolean ☃, int i) {}
/*      */   
/*      */   public void a(aer ☃, float f, double d1, double d2) {
/* 1027 */     if (this.T.nextDouble() < a(ank.c).e()) {
/*      */       return;
/*      */     }
/*      */     
/* 1031 */     this.al = true;
/* 1032 */     float f1 = xq.a(d1 * d1 + d2 * d2);
/*      */     
/* 1034 */     this.t /= 2.0D;
/* 1035 */     this.v /= 2.0D;
/*      */     
/* 1037 */     this.t -= d1 / f1 * f;
/* 1038 */     this.v -= d2 / f1 * f;
/*      */     
/* 1040 */     if (this.A) {
/* 1041 */       this.u /= 2.0D;
/* 1042 */       this.u += f;
/* 1043 */       if (this.u > 0.4000000059604645D) {
/* 1044 */         this.u = 0.4000000059604645D;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected wi d(aea ☃) {
/* 1051 */     return wj.cT;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected wi cs() {
/* 1056 */     return wj.cO;
/*      */   }
/*      */   
/*      */   protected wi m(int ☃) {
/* 1060 */     if (☃ > 4) {
/* 1061 */       return wj.cM;
/*      */     }
/* 1063 */     return wj.cU;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(boolean ☃, int i) {}
/*      */ 
/*      */   
/*      */   public boolean z_() {
/* 1071 */     int ☃ = xq.c(this.q);
/* 1072 */     int i = xq.c((bD()).b);
/* 1073 */     int j = xq.c(this.s);
/* 1074 */     if (this instanceof aog && ((aog)this).t()) {
/* 1075 */       return false;
/*      */     }
/* 1077 */     el el1 = new el(☃, i, j);
/* 1078 */     blc blc = this.m.a_(el1);
/* 1079 */     bcs bcs = blc.c();
/* 1080 */     if (bcs == bct.cz || bcs == bct.dM) {
/* 1081 */       return true;
/*      */     }
/*      */     
/* 1084 */     return (bcs instanceof bil && b(el1, blc));
/*      */   }
/*      */   
/*      */   private boolean b(el ☃, blc blc1) {
/* 1088 */     if (((Boolean)blc1.c(bil.a)).booleanValue()) {
/* 1089 */       blc blc2 = this.m.a_(☃.b());
/* 1090 */       if (blc2.c() == bct.cz && blc2.c(bfq.a) == blc1.c(bil.D)) {
/* 1091 */         return true;
/*      */       }
/*      */     } 
/* 1094 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aF() {
/* 1099 */     return (!this.G && cq() > 0.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(float ☃, float f1) {
/* 1104 */     super.c(☃, f1);
/* 1105 */     aek aek = b(aem.h);
/* 1106 */     float f = (aek == null) ? 0.0F : (aek.c() + 1);
/*      */     
/* 1108 */     int i = xq.f((☃ - 3.0F - f) * f1);
/*      */     
/* 1110 */     if (i > 0) {
/* 1111 */       a(m(i), 1.0F, 1.0F);
/* 1112 */       a(aea.k, i);
/*      */       
/* 1114 */       int j = xq.c(this.q);
/* 1115 */       int k = xq.c(this.r - 0.20000000298023224D);
/* 1116 */       int m = xq.c(this.s);
/*      */       
/* 1118 */       blc blc = this.m.a_(new el(j, k, m));
/* 1119 */       if (!blc.f()) {
/* 1120 */         bhr bhr = blc.c().r();
/* 1121 */         a(bhr.g(), bhr.a() * 0.5F, bhr.b() * 0.75F);
/*      */       } 
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
/*      */   public int ct() {
/* 1139 */     afn ☃ = a(ank.h);
/* 1140 */     return xq.c(☃.e());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void m(float ☃) {}
/*      */ 
/*      */   
/*      */   protected void n(float ☃) {}
/*      */   
/*      */   protected float b(aea ☃, float f) {
/* 1150 */     if (!☃.f()) {
/* 1151 */       m(f);
/* 1152 */       f = ady.a(f, ct(), (float)a(ank.i).e());
/*      */     } 
/* 1154 */     return f;
/*      */   }
/*      */   
/*      */   protected float c(aea ☃, float f) {
/* 1158 */     if (☃.i()) {
/* 1159 */       return f;
/*      */     }
/*      */     
/* 1162 */     if (a(aem.k) && ☃ != aea.m) {
/* 1163 */       int j = (b(aem.k).c() + 1) * 5;
/* 1164 */       int k = 25 - j;
/* 1165 */       float f1 = f * k;
/* 1166 */       float f2 = f;
/* 1167 */       f = Math.max(f1 / 25.0F, 0.0F);
/*      */       
/* 1169 */       float f3 = f2 - f;
/* 1170 */       if (f3 > 0.0F && f3 < 3.4028235E37F) {
/* 1171 */         if (this instanceof tf) {
/* 1172 */           ((tf)this).a(ws.K, Math.round(f3 * 10.0F));
/* 1173 */         } else if (☃.k() instanceof tf) {
/* 1174 */           ((tf)☃.k()).a(ws.G, Math.round(f3 * 10.0F));
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1179 */     if (f <= 0.0F) {
/* 1180 */       return 0.0F;
/*      */     }
/*      */     
/* 1183 */     int i = awg.a(aT(), ☃);
/* 1184 */     if (i > 0) {
/* 1185 */       f = ady.a(f, i);
/*      */     }
/*      */     
/* 1188 */     return f;
/*      */   }
/*      */   
/*      */   protected void d(aea ☃, float f) {
/* 1192 */     if (b(☃)) {
/*      */       return;
/*      */     }
/* 1195 */     f = b(☃, f);
/* 1196 */     f = c(☃, f);
/*      */     
/* 1198 */     float f1 = f;
/* 1199 */     f = Math.max(f - cQ(), 0.0F);
/* 1200 */     q(cQ() - f1 - f);
/*      */     
/* 1202 */     float f2 = f1 - f;
/* 1203 */     if (f2 > 0.0F && f2 < 3.4028235E37F && ☃.k() instanceof tf) {
/* 1204 */       ((tf)☃.k()).a(ws.F, Math.round(f2 * 10.0F));
/*      */     }
/*      */     
/* 1207 */     if (f == 0.0F) {
/*      */       return;
/*      */     }
/*      */     
/* 1211 */     float f3 = cq();
/* 1212 */     l(f3 - f);
/* 1213 */     cu().a(☃, f3, f);
/* 1214 */     q(cQ() - f);
/*      */   }
/*      */   
/*      */   public adz cu() {
/* 1218 */     return this.bz;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public afa cv() {
/* 1223 */     if (this.bz.c() != null) {
/* 1224 */       return this.bz.c();
/*      */     }
/* 1226 */     if (this.aV != null) {
/* 1227 */       return this.aV;
/*      */     }
/* 1229 */     if (this.bE != null) {
/* 1230 */       return this.bE;
/*      */     }
/* 1232 */     return null;
/*      */   }
/*      */   
/*      */   public final float cw() {
/* 1236 */     return (float)a(ank.a).e();
/*      */   }
/*      */   
/*      */   public final int cx() {
/* 1240 */     return ((Integer)this.ab.<Integer>a(bx)).intValue();
/*      */   }
/*      */   
/*      */   public final void n(int ☃) {
/* 1244 */     this.ab.b(bx, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   private int l() {
/* 1248 */     if (ael.a(this)) {
/* 1249 */       return 6 - 1 + ael.b(this);
/*      */     }
/* 1251 */     if (a(aem.d)) {
/* 1252 */       return 6 + (1 + b(aem.d).c()) * 2;
/*      */     }
/* 1254 */     return 6;
/*      */   }
/*      */   
/*      */   public void a(adk ☃) {
/* 1258 */     if (!this.ax || this.az >= l() / 2 || this.az < 0) {
/* 1259 */       this.az = -1;
/* 1260 */       this.ax = true;
/* 1261 */       this.ay = ☃;
/*      */       
/* 1263 */       if (this.m instanceof td) {
/* 1264 */         ((td)this.m).A().a(this, new jf(this, (☃ == adk.a) ? 0 : 3));
/*      */       }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void aa() {
/* 1318 */     a(aea.m, 4.0F);
/*      */   }
/*      */   
/*      */   protected void cy() {
/* 1322 */     int ☃ = l();
/* 1323 */     if (this.ax) {
/* 1324 */       this.az++;
/* 1325 */       if (this.az >= ☃) {
/* 1326 */         this.az = 0;
/* 1327 */         this.ax = false;
/*      */       } 
/*      */     } else {
/* 1330 */       this.az = 0;
/*      */     } 
/*      */     
/* 1333 */     this.aG = this.az / ☃;
/*      */   }
/*      */   
/*      */   public afn a(afm ☃) {
/* 1337 */     return cz().a(☃);
/*      */   }
/*      */   
/*      */   public afq cz() {
/* 1341 */     if (this.by == null) {
/* 1342 */       this.by = new afs();
/*      */     }
/*      */     
/* 1345 */     return this.by;
/*      */   }
/*      */   
/*      */   public afd cA() {
/* 1349 */     return afd.a;
/*      */   }
/*      */   
/*      */   public ate cB() {
/* 1353 */     return b(aew.a);
/*      */   }
/*      */   
/*      */   public ate cC() {
/* 1357 */     return b(aew.b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ate b(adk ☃) {
/* 1364 */     if (☃ == adk.a)
/* 1365 */       return b(aew.a); 
/* 1366 */     if (☃ == adk.b) {
/* 1367 */       return b(aew.b);
/*      */     }
/* 1369 */     throw new IllegalArgumentException("Invalid hand " + ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adk ☃, ate ate1) {
/* 1374 */     if (☃ == adk.a) {
/* 1375 */       a(aew.a, ate1);
/* 1376 */     } else if (☃ == adk.b) {
/* 1377 */       a(aew.b, ate1);
/*      */     } else {
/* 1379 */       throw new IllegalArgumentException("Invalid hand " + ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(aew ☃) {
/* 1384 */     return !b(☃).a();
/*      */   }
/*      */ 
/*      */   
/*      */   public abstract Iterable<ate> aT();
/*      */ 
/*      */   
/*      */   public abstract ate b(aew paramaew);
/*      */ 
/*      */   
/*      */   public abstract void a(aew paramaew, ate paramate);
/*      */   
/*      */   public void f(boolean ☃) {
/* 1397 */     super.f(☃);
/*      */     
/* 1399 */     afn afn = a(ank.d);
/* 1400 */     if (afn.a(b) != null) {
/* 1401 */       afn.c(c);
/*      */     }
/* 1403 */     if (☃) {
/* 1404 */       afn.b(c);
/*      */     }
/*      */   }
/*      */   
/*      */   protected float cD() {
/* 1409 */     return 1.0F;
/*      */   }
/*      */   
/*      */   protected float cE() {
/* 1413 */     if (y_()) {
/* 1414 */       return (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.5F;
/*      */     }
/* 1416 */     return (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F;
/*      */   }
/*      */   
/*      */   protected boolean cF() {
/* 1420 */     return (cq() <= 0.0F);
/*      */   }
/*      */   
/*      */   public void A(aer ☃) {
/* 1424 */     if (☃ instanceof apj || ☃ instanceof ako) {
/*      */       float f1;
/* 1426 */       double d4 = (this.H / 2.0F + ☃.H / 2.0F) + 0.4D;
/*      */ 
/*      */       
/* 1429 */       if (☃ instanceof apj) {
/* 1430 */         f1 = 0.0F;
/*      */       } else {
/* 1432 */         f1 = 1.5707964F * ((cS() == aez.b) ? -1 : true);
/*      */       } 
/* 1434 */       float f2 = -xq.a(-this.w * 0.017453292F - 3.1415927F + f1);
/* 1435 */       float f3 = -xq.b(-this.w * 0.017453292F - 3.1415927F + f1);
/*      */       
/* 1437 */       double d5 = (Math.abs(f2) > Math.abs(f3)) ? (d4 / Math.abs(f2)) : (d4 / Math.abs(f3));
/* 1438 */       double d6 = this.q + f2 * d5;
/* 1439 */       double d7 = this.s + f3 * d5;
/*      */       
/* 1441 */       b(d6, ☃.r + ☃.I + 0.001D, d7);
/* 1442 */       if (this.m.c(this, bD().b(☃.bD()))) {
/*      */         return;
/*      */       }
/*      */       
/* 1446 */       b(d6, ☃.r + ☃.I + 1.001D, d7);
/* 1447 */       if (this.m.c(this, bD().b(☃.bD()))) {
/*      */         return;
/*      */       }
/*      */       
/* 1451 */       b(☃.q, ☃.r + this.I + 0.001D, ☃.s);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1456 */     double d1 = ☃.q;
/* 1457 */     double d2 = (☃.bD()).b + ☃.I;
/* 1458 */     double d3 = ☃.s;
/*      */     
/* 1460 */     eq eq = ☃.bB();
/* 1461 */     if (eq != null) {
/* 1462 */       eq eq1 = eq.e();
/*      */ 
/*      */       
/* 1465 */       int[][] arrayOfInt = { { 0, 1 }, { 0, -1 }, { -1, 1 }, { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };
/*      */       
/* 1467 */       double d4 = Math.floor(this.q) + 0.5D;
/* 1468 */       double d5 = Math.floor(this.s) + 0.5D;
/* 1469 */       double d6 = (bD()).d - (bD()).a;
/* 1470 */       double d7 = (bD()).f - (bD()).c;
/* 1471 */       cea cea = new cea(d4 - d6 / 2.0D, (☃.bD()).b, d5 - d7 / 2.0D, d4 + d6 / 2.0D, Math.floor((☃.bD()).b) + this.I, d5 + d7 / 2.0D);
/*      */       
/* 1473 */       for (int[] arrayOfInt1 : arrayOfInt) {
/* 1474 */         double d8 = (eq.g() * arrayOfInt1[0] + eq1.g() * arrayOfInt1[1]);
/* 1475 */         double d9 = (eq.i() * arrayOfInt1[0] + eq1.i() * arrayOfInt1[1]);
/*      */         
/* 1477 */         double d10 = d4 + d8;
/* 1478 */         double d11 = d5 + d9;
/*      */         
/* 1480 */         cea cea1 = cea.d(d8, 0.0D, d9);
/*      */         
/* 1482 */         if (this.m.c(this, cea1)) {
/* 1483 */           if (this.m.a_(new el(d10, this.r, d11)).q()) {
/* 1484 */             a(d10, this.r + 1.0D, d11);
/*      */             return;
/*      */           } 
/* 1487 */           el el1 = new el(d10, this.r - 1.0D, d11);
/* 1488 */           if (this.m.a_(el1).q() || this.m.b(el1).a(ww.a)) {
/* 1489 */             d1 = d10;
/* 1490 */             d2 = this.r + 1.0D;
/* 1491 */             d3 = d11;
/*      */           }
/*      */         
/* 1494 */         } else if (this.m.c(this, cea1.d(0.0D, 1.0D, 0.0D)) && this.m.a_(new el(d10, this.r + 1.0D, d11)).q()) {
/* 1495 */           d1 = d10;
/* 1496 */           d2 = this.r + 2.0D;
/* 1497 */           d3 = d11;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1502 */     a(d1, d2, d3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float cG() {
/* 1511 */     return 0.42F;
/*      */   }
/*      */   
/*      */   protected void cH() {
/* 1515 */     this.u = cG();
/* 1516 */     if (a(aem.h)) {
/* 1517 */       this.u += ((b(aem.h).c() + 1) * 0.1F);
/*      */     }
/* 1519 */     if (ba()) {
/* 1520 */       float ☃ = this.w * 0.017453292F;
/*      */       
/* 1522 */       this.t -= (xq.a(☃) * 0.2F);
/* 1523 */       this.v += (xq.b(☃) * 0.2F);
/*      */     } 
/* 1525 */     this.al = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void c(wz<byv> ☃) {
/* 1533 */     this.u += 0.03999999910593033D;
/*      */   }
/*      */   
/*      */   protected float cJ() {
/* 1537 */     return 0.8F;
/*      */   }
/*      */   
/*      */   public void a(float ☃, float f1, float f2) {
/* 1541 */     if (cP() || bT()) {
/* 1542 */       double d = 0.08D;
/* 1543 */       if (this.u <= 0.0D && a(aem.B)) {
/* 1544 */         d = 0.01D;
/* 1545 */         this.M = 0.0F;
/*      */       } 
/*      */       
/* 1548 */       if (an() && (!(this instanceof aog) || !((aog)this).bV.b)) {
/* 1549 */         double d4 = this.r;
/*      */         
/* 1551 */         float f3 = ba() ? 0.9F : cJ();
/* 1552 */         float f4 = 0.02F;
/*      */         
/* 1554 */         float f5 = awg.e(this);
/* 1555 */         if (f5 > 3.0F) {
/* 1556 */           f5 = 3.0F;
/*      */         }
/* 1558 */         if (!this.A) {
/* 1559 */           f5 *= 0.5F;
/*      */         }
/* 1561 */         if (f5 > 0.0F) {
/*      */           
/* 1563 */           f3 += (0.54600006F - f3) * f5 / 3.0F;
/*      */           
/* 1565 */           f4 += (cK() - f4) * f5 / 3.0F;
/*      */         } 
/*      */         
/* 1568 */         if (a(aem.D)) {
/* 1569 */           f3 = 0.96F;
/*      */         }
/*      */         
/* 1572 */         a(☃, f1, f2, f4);
/* 1573 */         a(afe.a, this.t, this.u, this.v);
/*      */         
/* 1575 */         this.t *= f3;
/* 1576 */         this.u *= 0.800000011920929D;
/* 1577 */         this.v *= f3;
/* 1578 */         if (!aj() && !ba()) {
/* 1579 */           if (this.u <= 0.0D && Math.abs(this.u - 0.005D) >= 0.003D && Math.abs(this.u - d / 16.0D) < 0.003D) {
/*      */             
/* 1581 */             this.u = -0.003D;
/*      */           } else {
/* 1583 */             this.u -= d / 16.0D;
/*      */           } 
/*      */         }
/*      */         
/* 1587 */         if (this.B && c(this.t, this.u + 0.6000000238418579D - this.r + d4, this.v)) {
/* 1588 */           this.u = 0.30000001192092896D;
/*      */         }
/* 1590 */       } else if (ax() && (!(this instanceof aog) || !((aog)this).bV.b)) {
/* 1591 */         double d4 = this.r;
/* 1592 */         a(☃, f1, f2, 0.02F);
/* 1593 */         a(afe.a, this.t, this.u, this.v);
/* 1594 */         this.t *= 0.5D;
/* 1595 */         this.u *= 0.5D;
/* 1596 */         this.v *= 0.5D;
/* 1597 */         if (!aj()) {
/* 1598 */           this.u -= d / 4.0D;
/*      */         }
/*      */         
/* 1601 */         if (this.B && c(this.t, this.u + 0.6000000238418579D - this.r + d4, this.v)) {
/* 1602 */           this.u = 0.30000001192092896D;
/*      */         }
/* 1604 */       } else if (dc()) {
/*      */         
/* 1606 */         if (this.u > -0.5D) {
/* 1607 */           this.M = 1.0F;
/*      */         }
/*      */         
/* 1610 */         cee cee = aN();
/* 1611 */         float f3 = this.x * 0.017453292F;
/* 1612 */         double d4 = Math.sqrt(cee.b * cee.b + cee.d * cee.d);
/* 1613 */         double d5 = Math.sqrt(this.t * this.t + this.v * this.v);
/* 1614 */         double d6 = cee.b();
/*      */ 
/*      */         
/* 1617 */         float f4 = xq.b(f3);
/* 1618 */         f4 = (float)(f4 * f4 * Math.min(1.0D, d6 / 0.4D));
/* 1619 */         this.u += d * (-1.0D + f4 * 0.75D);
/*      */ 
/*      */         
/* 1622 */         if (this.u < 0.0D && d4 > 0.0D) {
/* 1623 */           double d7 = this.u * -0.1D * f4;
/* 1624 */           this.u += d7;
/* 1625 */           this.t += cee.b * d7 / d4;
/* 1626 */           this.v += cee.d * d7 / d4;
/*      */         } 
/*      */         
/* 1629 */         if (f3 < 0.0F && d4 > 0.0D) {
/* 1630 */           double d7 = d5 * -xq.a(f3) * 0.04D;
/* 1631 */           this.u += d7 * 3.2D;
/* 1632 */           this.t -= cee.b * d7 / d4;
/* 1633 */           this.v -= cee.d * d7 / d4;
/*      */         } 
/*      */ 
/*      */         
/* 1637 */         if (d4 > 0.0D) {
/* 1638 */           this.t += (cee.b / d4 * d5 - this.t) * 0.1D;
/* 1639 */           this.v += (cee.d / d4 * d5 - this.v) * 0.1D;
/*      */         } 
/*      */         
/* 1642 */         this.t *= 0.9900000095367432D;
/* 1643 */         this.u *= 0.9800000190734863D;
/* 1644 */         this.v *= 0.9900000095367432D;
/* 1645 */         a(afe.a, this.t, this.u, this.v);
/*      */         
/* 1647 */         if (this.B && !this.m.B) {
/* 1648 */           double d7 = Math.sqrt(this.t * this.t + this.v * this.v);
/* 1649 */           double d8 = d5 - d7;
/* 1650 */           float f5 = (float)(d8 * 10.0D - 3.0D);
/*      */           
/* 1652 */           if (f5 > 0.0F) {
/* 1653 */             a(m((int)f5), 1.0F, 1.0F);
/* 1654 */             a(aea.l, f5);
/*      */           } 
/*      */         } 
/*      */         
/* 1658 */         if (this.A && !this.m.B) {
/* 1659 */           b(7, false);
/*      */         }
/*      */       } else {
/* 1662 */         float f3 = 0.91F;
/* 1663 */         try (el.b ☃ = el.b.d(this.q, (bD()).b - 1.0D, this.s)) {
/* 1664 */           float f5; if (this.A) {
/* 1665 */             f3 = this.m.a_(b).c().n() * 0.91F;
/*      */           }
/*      */           
/* 1668 */           float f4 = 0.16277137F / f3 * f3 * f3;
/*      */ 
/*      */           
/* 1671 */           if (this.A) {
/* 1672 */             f5 = cK() * f4;
/*      */           } else {
/* 1674 */             f5 = this.aU;
/*      */           } 
/*      */           
/* 1677 */           a(☃, f1, f2, f5);
/*      */           
/* 1679 */           f3 = 0.91F;
/* 1680 */           if (this.A) {
/* 1681 */             f3 = this.m.a_(b.e(this.q, (bD()).b - 1.0D, this.s)).c().n() * 0.91F;
/*      */           }
/* 1683 */           if (z_()) {
/* 1684 */             float f6 = 0.15F;
/* 1685 */             this.t = xq.a(this.t, -0.15000000596046448D, 0.15000000596046448D);
/* 1686 */             this.v = xq.a(this.v, -0.15000000596046448D, 0.15000000596046448D);
/* 1687 */             this.M = 0.0F;
/* 1688 */             if (this.u < -0.15D) {
/* 1689 */               this.u = -0.15D;
/*      */             }
/* 1691 */             boolean bool = (aZ() && this instanceof aog);
/* 1692 */             if (bool && this.u < 0.0D) {
/* 1693 */               this.u = 0.0D;
/*      */             }
/*      */           } 
/*      */           
/* 1697 */           a(afe.a, this.t, this.u, this.v);
/*      */           
/* 1699 */           if (this.B && z_()) {
/* 1700 */             this.u = 0.2D;
/*      */           }
/*      */           
/* 1703 */           if (a(aem.y)) {
/* 1704 */             this.u += (0.05D * (b(aem.y).c() + 1) - this.u) * 0.2D;
/* 1705 */             this.M = 0.0F;
/*      */           } else {
/* 1707 */             b.e(this.q, 0.0D, this.s);
/* 1708 */             if (!this.m.B || (this.m.D(b) && this.m.l(b).y())) {
/* 1709 */               if (!aj()) {
/* 1710 */                 this.u -= d;
/*      */               }
/* 1712 */             } else if (this.r > 0.0D) {
/* 1713 */               this.u = -0.1D;
/*      */             } else {
/* 1715 */               this.u = 0.0D;
/*      */             } 
/*      */           } 
/* 1718 */           this.u *= 0.9800000190734863D;
/* 1719 */           this.t *= f3;
/* 1720 */           this.v *= f3;
/*      */         } 
/*      */       } 
/*      */     } 
/* 1724 */     this.aI = this.aJ;
/* 1725 */     double d1 = this.q - this.n;
/* 1726 */     double d2 = this.s - this.p;
/*      */     
/* 1728 */     double d3 = (this instanceof ajv) ? (this.r - this.o) : 0.0D;
/* 1729 */     float f = xq.a(d1 * d1 + d3 * d3 + d2 * d2) * 4.0F;
/*      */     
/* 1731 */     if (f > 1.0F) {
/* 1732 */       f = 1.0F;
/*      */     }
/* 1734 */     this.aJ += (f - this.aJ) * 0.4F;
/* 1735 */     this.aK += this.aJ;
/*      */   }
/*      */   
/*      */   public float cK() {
/* 1739 */     return this.bI;
/*      */   }
/*      */   
/*      */   public void o(float ☃) {
/* 1743 */     this.bI = ☃;
/*      */   }
/*      */   
/*      */   public boolean B(aer ☃) {
/* 1747 */     z(☃);
/* 1748 */     return false;
/*      */   }
/*      */   
/*      */   public boolean cL() {
/* 1752 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void R_() {
/* 1757 */     super.R_();
/*      */     
/* 1759 */     cV();
/* 1760 */     o();
/*      */     
/* 1762 */     if (!this.m.B) {
/* 1763 */       int i = cx();
/* 1764 */       if (i > 0) {
/* 1765 */         if (this.aA <= 0) {
/* 1766 */           this.aA = 20 * (30 - i);
/*      */         }
/* 1768 */         this.aA--;
/* 1769 */         if (this.aA <= 0)
/* 1770 */           n(i - 1); 
/*      */       }  aew[] arrayOfAew;
/*      */       int j;
/*      */       byte b;
/* 1774 */       for (arrayOfAew = aew.values(), j = arrayOfAew.length, b = 0; b < j; ) { ate ate1; aew aew = arrayOfAew[b];
/*      */         
/* 1776 */         switch (null.a[aew.a().ordinal()]) {
/*      */           case 1:
/* 1778 */             ate1 = this.bB.get(aew.b());
/*      */             break;
/*      */           case 2:
/* 1781 */             ate1 = this.bC.get(aew.b()); break;
/*      */           default:
/*      */             b++;
/*      */             continue;
/*      */         } 
/* 1786 */         ate ate2 = b(aew);
/*      */         
/* 1788 */         if (!ate.b(ate2, ate1)) {
/* 1789 */           ((td)this.m).A().a(this, new lj(Q(), aew, ate2));
/* 1790 */           if (!ate1.a()) {
/* 1791 */             cz().a(ate1.a(aew));
/*      */           }
/* 1793 */           if (!ate2.a()) {
/* 1794 */             cz().b(ate2.a(aew));
/*      */           }
/* 1796 */           switch (null.a[aew.a().ordinal()]) {
/*      */             case 1:
/* 1798 */               this.bB.set(aew.b(), ate2.a() ? ate.a : ate2.i());
/*      */             
/*      */             case 2:
/* 1801 */               this.bC.set(aew.b(), ate2.a() ? ate.a : ate2.i());
/*      */           } 
/*      */ 
/*      */         
/*      */         }  }
/*      */       
/* 1807 */       if (this.U % 20 == 0) {
/* 1808 */         cu().g();
/*      */       }
/*      */       
/* 1811 */       if (!this.av) {
/* 1812 */         boolean bool = a(aem.x);
/* 1813 */         if (h(6) != bool) {
/* 1814 */           b(6, bool);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1819 */     k();
/*      */     
/* 1821 */     double ☃ = this.q - this.n;
/* 1822 */     double d1 = this.s - this.p;
/*      */     
/* 1824 */     float f1 = (float)(☃ * ☃ + d1 * d1);
/*      */     
/* 1826 */     float f2 = this.aQ;
/*      */     
/* 1828 */     float f3 = 0.0F;
/* 1829 */     this.aZ = this.ba;
/* 1830 */     float f4 = 0.0F;
/* 1831 */     if (f1 > 0.0025000002F) {
/* 1832 */       f4 = 1.0F;
/* 1833 */       f3 = (float)Math.sqrt(f1) * 3.0F;
/*      */       
/* 1835 */       float f5 = (float)xq.c(d1, ☃) * 57.295776F - 90.0F;
/* 1836 */       float f6 = xq.e(xq.g(this.w) - f5);
/* 1837 */       if (95.0F < f6 && f6 < 265.0F) {
/* 1838 */         float f = f5 - 180.0F;
/*      */       } else {
/* 1840 */         f2 = f5;
/*      */       } 
/*      */     } 
/* 1843 */     if (this.aG > 0.0F) {
/* 1844 */       f2 = this.w;
/*      */     }
/* 1846 */     if (!this.A) {
/* 1847 */       f4 = 0.0F;
/*      */     }
/* 1849 */     this.ba += (f4 - this.ba) * 0.3F;
/*      */     
/* 1851 */     this.m.A.a("headTurn");
/*      */     
/* 1853 */     f3 = e(f2, f3);
/*      */     
/* 1855 */     this.m.A.e();
/*      */     
/* 1857 */     this.m.A.a("rangeChecks");
/* 1858 */     while (this.w - this.y < -180.0F) {
/* 1859 */       this.y -= 360.0F;
/*      */     }
/* 1861 */     while (this.w - this.y >= 180.0F) {
/* 1862 */       this.y += 360.0F;
/*      */     }
/*      */     
/* 1865 */     while (this.aQ - this.aR < -180.0F) {
/* 1866 */       this.aR -= 360.0F;
/*      */     }
/* 1868 */     while (this.aQ - this.aR >= 180.0F) {
/* 1869 */       this.aR += 360.0F;
/*      */     }
/*      */     
/* 1872 */     while (this.x - this.z < -180.0F) {
/* 1873 */       this.z -= 360.0F;
/*      */     }
/* 1875 */     while (this.x - this.z >= 180.0F) {
/* 1876 */       this.z += 360.0F;
/*      */     }
/*      */     
/* 1879 */     while (this.aS - this.aT < -180.0F) {
/* 1880 */       this.aT -= 360.0F;
/*      */     }
/* 1882 */     while (this.aS - this.aT >= 180.0F) {
/* 1883 */       this.aT += 360.0F;
/*      */     }
/* 1885 */     this.m.A.e();
/*      */     
/* 1887 */     this.bb += f3;
/*      */     
/* 1889 */     if (dc()) {
/* 1890 */       this.bv++;
/*      */     } else {
/* 1892 */       this.bv = 0;
/*      */     } 
/*      */   }
/*      */   
/*      */   protected float e(float ☃, float f1) {
/* 1897 */     float f2 = xq.g(☃ - this.aQ);
/* 1898 */     this.aQ += f2 * 0.3F;
/*      */     
/* 1900 */     float f3 = xq.g(this.w - this.aQ);
/* 1901 */     boolean bool = (f3 < -90.0F || f3 >= 90.0F);
/* 1902 */     if (f3 < -75.0F) {
/* 1903 */       f3 = -75.0F;
/*      */     }
/* 1905 */     if (f3 >= 75.0F) {
/* 1906 */       f3 = 75.0F;
/*      */     }
/* 1908 */     this.aQ = this.w - f3;
/* 1909 */     if (f3 * f3 > 2500.0F) {
/* 1910 */       this.aQ += f3 * 0.2F;
/*      */     }
/*      */     
/* 1913 */     if (bool) {
/* 1914 */       f1 *= -1.0F;
/*      */     }
/*      */     
/* 1917 */     return f1;
/*      */   }
/*      */   
/*      */   public void k() {
/* 1921 */     if (this.bJ > 0) {
/* 1922 */       this.bJ--;
/*      */     }
/* 1924 */     if (this.bl > 0 && !bT()) {
/* 1925 */       double d1 = this.q + (this.bm - this.q) / this.bl;
/* 1926 */       double d2 = this.r + (this.bn - this.r) / this.bl;
/* 1927 */       double d3 = this.s + (this.bo - this.s) / this.bl;
/*      */       
/* 1929 */       double d4 = xq.g(this.bp - this.w);
/*      */       
/* 1931 */       this.w = (float)(this.w + d4 / this.bl);
/* 1932 */       this.x = (float)(this.x + (this.bq - this.x) / this.bl);
/*      */       
/* 1934 */       this.bl--;
/* 1935 */       b(d1, d2, d3);
/* 1936 */       b(this.w, this.x);
/* 1937 */     } else if (!cP()) {
/*      */ 
/*      */       
/* 1940 */       this.t *= 0.98D;
/* 1941 */       this.u *= 0.98D;
/* 1942 */       this.v *= 0.98D;
/*      */     } 
/* 1944 */     if (this.bs > 0) {
/* 1945 */       this.aS = (float)(this.aS + xq.g(this.br - this.aS) / this.bs);
/* 1946 */       this.bs--;
/*      */     } 
/*      */     
/* 1949 */     if (Math.abs(this.t) < 0.003D) {
/* 1950 */       this.t = 0.0D;
/*      */     }
/* 1952 */     if (Math.abs(this.u) < 0.003D) {
/* 1953 */       this.u = 0.0D;
/*      */     }
/* 1955 */     if (Math.abs(this.v) < 0.003D) {
/* 1956 */       this.v = 0.0D;
/*      */     }
/*      */     
/* 1959 */     this.m.A.a("ai");
/* 1960 */     if (cF()) {
/* 1961 */       this.bg = false;
/* 1962 */       this.bh = 0.0F;
/* 1963 */       this.bj = 0.0F;
/* 1964 */       this.bk = 0.0F;
/*      */     }
/* 1966 */     else if (cP()) {
/* 1967 */       this.m.A.a("newAi");
/* 1968 */       cM();
/* 1969 */       this.m.A.e();
/*      */     } 
/*      */     
/* 1972 */     this.m.A.e();
/*      */     
/* 1974 */     this.m.A.a("jump");
/* 1975 */     if (this.bg) {
/* 1976 */       if (this.W > 0.0D && (!this.A || this.W > 0.4D)) {
/* 1977 */         c(ww.a);
/* 1978 */       } else if (ax()) {
/* 1979 */         c(ww.b);
/* 1980 */       } else if ((this.A || (this.W > 0.0D && this.W <= 0.4D)) && 
/* 1981 */         this.bJ == 0) {
/* 1982 */         cH();
/* 1983 */         this.bJ = 10;
/*      */       } 
/*      */     } else {
/*      */       
/* 1987 */       this.bJ = 0;
/*      */     } 
/* 1989 */     this.m.A.e();
/*      */     
/* 1991 */     this.m.A.a("travel");
/* 1992 */     this.bh *= 0.98F;
/* 1993 */     this.bj *= 0.98F;
/* 1994 */     this.bk *= 0.9F;
/*      */     
/* 1996 */     n();
/* 1997 */     cea ☃ = bD();
/* 1998 */     a(this.bh, this.bi, this.bj);
/* 1999 */     this.m.A.e();
/*      */     
/* 2001 */     this.m.A.a("push");
/* 2002 */     if (this.bw > 0) {
/* 2003 */       this.bw--;
/* 2004 */       a(☃, bD());
/*      */     } 
/* 2006 */     cN();
/* 2007 */     this.m.A.e();
/*      */   }
/*      */   
/*      */   private void n() {
/* 2011 */     boolean ☃ = h(7);
/* 2012 */     if (☃ && !this.A && !aW()) {
/* 2013 */       ate ate1 = b(aew.e);
/* 2014 */       if (ate1.b() == atf.eL && asg.e(ate1)) {
/* 2015 */         ☃ = true;
/* 2016 */         if (!this.m.B && (this.bv + 1) % 20 == 0)
/*      */         {
/* 2018 */           ate1.a(1, this);
/*      */         }
/*      */       } else {
/* 2021 */         ☃ = false;
/*      */       } 
/*      */     } else {
/* 2024 */       ☃ = false;
/*      */     } 
/* 2026 */     if (!this.m.B) {
/* 2027 */       b(7, ☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void cM() {}
/*      */   
/*      */   protected void cN() {
/* 2035 */     List<aer> ☃ = this.m.a(this, bD(), aeu.a(this));
/*      */     
/* 2037 */     if (!☃.isEmpty()) {
/* 2038 */       int i = this.m.X().c("maxEntityCramming");
/* 2039 */       if (i > 0 && ☃.size() > i - 1 && this.T.nextInt(4) == 0) {
/* 2040 */         int k = 0;
/* 2041 */         for (int m = 0; m < ☃.size(); m++) {
/* 2042 */           if (!((aer)☃.get(m)).aW()) {
/* 2043 */             k++;
/*      */           }
/*      */         } 
/* 2046 */         if (k > i - 1) {
/* 2047 */           a(aea.g, 6.0F);
/*      */         }
/*      */       } 
/* 2050 */       for (int j = 0; j < ☃.size(); j++) {
/* 2051 */         aer aer1 = ☃.get(j);
/* 2052 */         C(aer1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void a(cea ☃, cea cea1) {
/* 2058 */     cea cea2 = ☃.b(cea1);
/* 2059 */     List<aer> list = this.m.a(this, cea2);
/* 2060 */     if (!list.isEmpty()) {
/* 2061 */       for (int i = 0; i < list.size(); i++) {
/* 2062 */         aer aer1 = list.get(i);
/* 2063 */         if (aer1 instanceof afa) {
/* 2064 */           d((afa)aer1);
/* 2065 */           this.bw = 0;
/* 2066 */           this.t *= -0.2D;
/* 2067 */           this.u *= -0.2D;
/* 2068 */           this.v *= -0.2D;
/*      */           break;
/*      */         } 
/*      */       } 
/* 2072 */     } else if (this.B) {
/* 2073 */       this.bw = 0;
/*      */     } 
/* 2075 */     if (!this.m.B && this.bw <= 0) {
/* 2076 */       c(4, false);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void C(aer ☃) {
/* 2081 */     ☃.i(this);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void d(afa ☃) {}
/*      */   
/*      */   public void o(int ☃) {
/* 2088 */     this.bw = ☃;
/* 2089 */     if (!this.m.B) {
/* 2090 */       c(4, true);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean cO() {
/* 2095 */     return ((((Byte)this.ab.<Byte>a(aw)).byteValue() & 0x4) != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public void S_() {
/* 2100 */     aer ☃ = bU();
/* 2101 */     super.S_();
/* 2102 */     if (☃ != null && ☃ != bU() && !this.m.B) {
/* 2103 */       A(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void aH() {
/* 2109 */     super.aH();
/* 2110 */     this.aZ = this.ba;
/* 2111 */     this.ba = 0.0F;
/* 2112 */     this.M = 0.0F;
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
/*      */   public void o(boolean ☃) {
/* 2134 */     this.bg = ☃;
/*      */   }
/*      */   
/*      */   public void a(aer ☃, int i) {
/* 2138 */     if (!☃.G && !this.m.B) {
/* 2139 */       sz sz = ((td)this.m).A();
/* 2140 */       if (☃ instanceof amm || ☃ instanceof aok || ☃ instanceof aex) {
/* 2141 */         sz.a(☃, new lx(☃.Q(), Q(), i));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean D(aer ☃) {
/* 2147 */     return (this.m.a(new cee(this.q, this.r + bF(), this.s), new cee(☃.q, ☃.r + ☃.bF(), ☃.s), cec.a, true, false) == null);
/*      */   }
/*      */ 
/*      */   
/*      */   public float h(float ☃) {
/* 2152 */     if (☃ == 1.0F) {
/* 2153 */       return this.aS;
/*      */     }
/* 2155 */     return this.aT + (this.aS - this.aT) * ☃;
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
/*      */   public boolean cP() {
/* 2167 */     return !this.m.B;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aB() {
/* 2172 */     return !this.G;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aC() {
/* 2177 */     return (aF() && !z_());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void aA() {
/* 2182 */     this.E = (this.T.nextDouble() >= a(ank.c).e());
/*      */   }
/*      */ 
/*      */   
/*      */   public float bj() {
/* 2187 */     return this.aS;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j(float ☃) {
/* 2192 */     this.aS = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void k(float ☃) {
/* 2197 */     this.aQ = ☃;
/*      */   }
/*      */   
/*      */   public float cQ() {
/* 2201 */     return this.bK;
/*      */   }
/*      */   
/*      */   public void q(float ☃) {
/* 2205 */     if (☃ < 0.0F) {
/* 2206 */       ☃ = 0.0F;
/*      */     }
/* 2208 */     this.bK = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void v_() {}
/*      */ 
/*      */   
/*      */   public void f() {}
/*      */   
/*      */   protected void cR() {
/* 2218 */     this.bD = true;
/*      */   }
/*      */   
/*      */   public abstract aez cS();
/*      */   
/*      */   public boolean cT() {
/* 2224 */     return ((((Byte)this.ab.<Byte>a(aw)).byteValue() & 0x1) > 0);
/*      */   }
/*      */   
/*      */   public adk cU() {
/* 2228 */     return ((((Byte)this.ab.<Byte>a(aw)).byteValue() & 0x2) > 0) ? adk.b : adk.a;
/*      */   }
/*      */   
/*      */   protected void cV() {
/* 2232 */     if (cT()) {
/* 2233 */       if (b(cU()) == this.bt) {
/* 2234 */         if (cX() <= 25 && cX() % 4 == 0) {
/* 2235 */           b(this.bt, 5);
/*      */         }
/* 2237 */         if (--this.bu == 0 && 
/* 2238 */           !this.m.B) {
/* 2239 */           q();
/*      */         }
/*      */       } else {
/*      */         
/* 2243 */         da();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private void o() {
/* 2249 */     this.bP = this.bO;
/* 2250 */     if (bb()) {
/* 2251 */       this.bO = Math.min(1.0F, this.bO + 0.09F);
/*      */     } else {
/* 2253 */       this.bO = Math.max(0.0F, this.bO - 0.09F);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void c(int ☃, boolean bool) {
/* 2258 */     int i = ((Byte)this.ab.<Byte>a(aw)).byteValue();
/* 2259 */     if (bool) {
/* 2260 */       i |= ☃;
/*      */     } else {
/* 2262 */       i &= ☃ ^ 0xFFFFFFFF;
/*      */     } 
/* 2264 */     this.ab.b(aw, Byte.valueOf((byte)i));
/*      */   }
/*      */   
/*      */   public void c(adk ☃) {
/* 2268 */     ate ate1 = b(☃);
/* 2269 */     if (ate1.a() || cT()) {
/*      */       return;
/*      */     }
/*      */     
/* 2273 */     this.bt = ate1;
/* 2274 */     this.bu = ate1.k();
/*      */     
/* 2276 */     if (!this.m.B) {
/* 2277 */       c(1, true);
/* 2278 */       c(2, (☃ == adk.b));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(or<?> ☃) {
/* 2284 */     super.a(☃);
/*      */     
/* 2286 */     if (aw.equals(☃) && this.m.B) {
/* 2287 */       if (cT() && this.bt.a()) {
/* 2288 */         this.bt = b(cU());
/* 2289 */         if (!this.bt.a()) {
/* 2290 */           this.bu = this.bt.k();
/*      */         }
/* 2292 */       } else if (!cT() && !this.bt.a()) {
/* 2293 */         this.bt = ate.a;
/* 2294 */         this.bu = 0;
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ca.a ☃, cee cee1) {
/* 2301 */     super.a(☃, cee1);
/* 2302 */     this.aT = this.aS;
/* 2303 */     this.aQ = this.aS;
/* 2304 */     this.aR = this.aQ;
/*      */   }
/*      */   
/*      */   protected void b(ate ☃, int i) {
/* 2308 */     if (☃.a() || !cT()) {
/*      */       return;
/*      */     }
/*      */     
/* 2312 */     if (☃.l() == auo.c) {
/* 2313 */       a(wj.cP, 0.5F, this.m.s.nextFloat() * 0.1F + 0.9F);
/*      */     }
/*      */     
/* 2316 */     if (☃.l() == auo.b) {
/* 2317 */       a(☃, i);
/* 2318 */       a(wj.cQ, 0.5F + 0.5F * this.T.nextInt(2), (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(ate ☃, int i) {
/* 2323 */     for (int j = 0; j < i; j++) {
/* 2324 */       cee cee1 = new cee((this.T.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/* 2325 */       cee1 = cee1.a(-this.x * 0.017453292F);
/* 2326 */       cee1 = cee1.b(-this.w * 0.017453292F);
/*      */       
/* 2328 */       double d = -this.T.nextFloat() * 0.6D - 0.3D;
/* 2329 */       cee cee2 = new cee((this.T.nextFloat() - 0.5D) * 0.3D, d, 0.6D);
/* 2330 */       cee2 = cee2.a(-this.x * 0.017453292F);
/* 2331 */       cee2 = cee2.b(-this.w * 0.017453292F);
/* 2332 */       cee2 = cee2.b(this.q, this.r + bF(), this.s);
/* 2333 */       this.m.a(new fj(fm.C, ☃), cee2.b, cee2.c, cee2.d, cee1.b, cee1.c + 0.05D, cee1.d);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void q() {
/* 2338 */     if (!this.bt.a() && cT()) {
/* 2339 */       b(this.bt, 16);
/*      */       
/* 2341 */       a(cU(), this.bt.a(this.m, this));
/* 2342 */       da();
/*      */     } 
/*      */   }
/*      */   
/*      */   public ate cW() {
/* 2347 */     return this.bt;
/*      */   }
/*      */   
/*      */   public int cX() {
/* 2351 */     return this.bu;
/*      */   }
/*      */   
/*      */   public int cY() {
/* 2355 */     if (cT()) {
/* 2356 */       return this.bt.k() - cX();
/*      */     }
/* 2358 */     return 0;
/*      */   }
/*      */   
/*      */   public void cZ() {
/* 2362 */     if (!this.bt.a()) {
/* 2363 */       this.bt.a(this.m, this, cX());
/*      */     }
/* 2365 */     da();
/*      */   }
/*      */   
/*      */   public void da() {
/* 2369 */     if (!this.m.B) {
/* 2370 */       c(1, false);
/*      */     }
/* 2372 */     this.bt = ate.a;
/* 2373 */     this.bu = 0;
/*      */   }
/*      */   
/*      */   public boolean db() {
/* 2377 */     if (!cT() || this.bt.a()) {
/* 2378 */       return false;
/*      */     }
/* 2380 */     ata ☃ = this.bt.b();
/* 2381 */     if (☃.d(this.bt) != auo.d) {
/* 2382 */       return false;
/*      */     }
/* 2384 */     if (☃.c(this.bt) - this.bu < 5) {
/* 2385 */       return false;
/*      */     }
/* 2387 */     return true;
/*      */   }
/*      */   
/*      */   public boolean dc() {
/* 2391 */     return h(7);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean j(double ☃, double d1, double d2) {
/* 2399 */     double d3 = this.q;
/* 2400 */     double d4 = this.r;
/* 2401 */     double d5 = this.s;
/*      */     
/* 2403 */     this.q = ☃;
/* 2404 */     this.r = d1;
/* 2405 */     this.s = d2;
/* 2406 */     boolean bool = false;
/* 2407 */     el el1 = new el(this);
/* 2408 */     axz axz = this.m;
/* 2409 */     Random random = ce();
/*      */     
/* 2411 */     if (axz.D(el1)) {
/* 2412 */       boolean bool1 = false;
/* 2413 */       while (!bool1 && el1.p() > 0) {
/* 2414 */         el el2 = el1.b();
/* 2415 */         blc blc = axz.a_(el2);
/* 2416 */         if (blc.d().c()) {
/* 2417 */           bool1 = true; continue;
/*      */         } 
/* 2419 */         this.r--;
/* 2420 */         el1 = el2;
/*      */       } 
/*      */       
/* 2423 */       if (bool1) {
/* 2424 */         a(this.q, this.r, this.s);
/* 2425 */         if (axz.c(this, bD()) && !axz.c(bD())) {
/* 2426 */           bool = true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 2431 */     if (!bool) {
/* 2432 */       a(d3, d4, d5);
/* 2433 */       return false;
/*      */     } 
/*      */     
/* 2436 */     int i = 128;
/*      */     
/* 2438 */     for (int j = 0; j < 128; j++) {
/* 2439 */       double d6 = j / 127.0D;
/* 2440 */       float f1 = (random.nextFloat() - 0.5F) * 0.2F;
/* 2441 */       float f2 = (random.nextFloat() - 0.5F) * 0.2F;
/* 2442 */       float f3 = (random.nextFloat() - 0.5F) * 0.2F;
/*      */       
/* 2444 */       double d7 = d3 + (this.q - d3) * d6 + (random.nextDouble() - 0.5D) * this.H * 2.0D;
/* 2445 */       double d8 = d4 + (this.r - d4) * d6 + random.nextDouble() * this.I;
/* 2446 */       double d9 = d5 + (this.s - d5) * d6 + (random.nextDouble() - 0.5D) * this.H * 2.0D;
/* 2447 */       axz.a(fm.K, d7, d8, d9, f1, f2, f3);
/*      */     } 
/*      */     
/* 2450 */     if (this instanceof afg) {
/* 2451 */       ((afg)this).t().q();
/*      */     }
/*      */     
/* 2454 */     return true;
/*      */   }
/*      */   
/*      */   public boolean de() {
/* 2458 */     return true;
/*      */   }
/*      */   
/*      */   public boolean df() {
/* 2462 */     return true;
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\afa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */