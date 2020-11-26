/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Sets;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class aer
/*      */   implements adr, bt
/*      */ {
/*  101 */   protected static final Logger i = LogManager.getLogger();
/*      */ 
/*      */   
/*  104 */   private static final List<ate> a = Collections.emptyList();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  109 */   private static final cea b = new cea(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*  110 */   private static double c = 1.0D;
/*      */   
/*      */   private static int f;
/*      */   private final aev<?> g;
/*  114 */   private int h = f++;
/*      */   
/*      */   public boolean j;
/*  117 */   private final List<aer> aw = Lists.newArrayList();
/*      */   
/*      */   protected int k;
/*      */   private aer ax;
/*      */   public boolean l;
/*      */   public axy m;
/*      */   public double n;
/*      */   public double o;
/*      */   public double p;
/*      */   public double q;
/*      */   public double r;
/*      */   public double s;
/*      */   public double t;
/*      */   public double u;
/*      */   public double v;
/*      */   public float w;
/*      */   public float x;
/*      */   public float y;
/*      */   public float z;
/*  136 */   private cea ay = b;
/*      */   
/*      */   public boolean A;
/*      */   
/*      */   public boolean B;
/*      */   
/*      */   public boolean C;
/*      */   
/*      */   public boolean D;
/*      */   
/*      */   public boolean E;
/*      */   protected boolean F;
/*      */   private boolean az;
/*      */   public boolean G;
/*  150 */   public float H = 0.6F;
/*  151 */   public float I = 1.8F;
/*      */   
/*      */   public float J;
/*      */   public float K;
/*      */   public float L;
/*      */   public float M;
/*  157 */   private float aA = 1.0F;
/*  158 */   private float aB = 1.0F;
/*      */   
/*      */   public double N;
/*      */   public double O;
/*      */   public double P;
/*      */   public float Q;
/*      */   public boolean R;
/*      */   public float S;
/*  166 */   protected Random T = new Random();
/*      */   
/*      */   public int U;
/*  169 */   private int aC = -bW();
/*      */   
/*      */   protected boolean V;
/*      */   
/*      */   protected double W;
/*      */   
/*      */   protected boolean X;
/*      */   
/*      */   public int Y;
/*      */   
/*      */   protected boolean Z = true;
/*      */   
/*      */   protected boolean aa;
/*      */   
/*      */   protected ou ab;
/*  184 */   protected static final or<Byte> ac = ou.a(aer.class, ot.a);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  193 */   private static final or<Integer> aD = ou.a(aer.class, ot.b);
/*  194 */   private static final or<Optional<ij>> aE = ou.a(aer.class, ot.f);
/*  195 */   private static final or<Boolean> aF = ou.a(aer.class, ot.i);
/*  196 */   private static final or<Boolean> aG = ou.a(aer.class, ot.i);
/*  197 */   private static final or<Boolean> aH = ou.a(aer.class, ot.i);
/*      */   
/*      */   public boolean ad;
/*      */   
/*      */   public int ae;
/*      */   
/*      */   public int af;
/*      */   
/*      */   public int ag;
/*      */   public boolean ak;
/*      */   public boolean al;
/*      */   public int am;
/*      */   protected boolean an;
/*      */   protected int ao;
/*      */   public bod ap;
/*      */   protected el aq;
/*      */   protected cee ar;
/*      */   protected eq as;
/*      */   private boolean aI;
/*  216 */   protected UUID at = xq.a(this.T);
/*  217 */   protected String au = this.at.toString();
/*      */   protected boolean av;
/*  219 */   private final Set<String> aJ = Sets.newHashSet();
/*      */   
/*      */   private boolean aK;
/*  222 */   private final double[] aL = new double[] { 0.0D, 0.0D, 0.0D };
/*      */   private long aM;
/*      */   
/*      */   public aer(aev<?> ☃, axy axy1) {
/*  226 */     this.g = ☃;
/*  227 */     this.m = axy1;
/*  228 */     b(0.0D, 0.0D, 0.0D);
/*      */     
/*  230 */     if (axy1 != null) {
/*  231 */       this.ap = axy1.t.q();
/*      */     }
/*      */     
/*  234 */     this.ab = new ou(this);
/*  235 */     this.ab.a(ac, Byte.valueOf((byte)0));
/*  236 */     this.ab.a(aD, Integer.valueOf(bf()));
/*  237 */     this.ab.a(aF, Boolean.valueOf(false));
/*  238 */     this.ab.a(aE, Optional.empty());
/*  239 */     this.ab.a(aG, Boolean.valueOf(false));
/*  240 */     this.ab.a(aH, Boolean.valueOf(false));
/*  241 */     x_();
/*      */   }
/*      */   
/*      */   public aev<?> P() {
/*  245 */     return this.g;
/*      */   }
/*      */   
/*      */   public int Q() {
/*  249 */     return this.h;
/*      */   }
/*      */   
/*      */   public void e(int ☃) {
/*  253 */     this.h = ☃;
/*      */   }
/*      */   
/*      */   public Set<String> R() {
/*  257 */     return this.aJ;
/*      */   }
/*      */   
/*      */   public boolean a(String ☃) {
/*  261 */     if (this.aJ.size() >= 1024) {
/*  262 */       return false;
/*      */     }
/*  264 */     return this.aJ.add(☃);
/*      */   }
/*      */   
/*      */   public boolean b(String ☃) {
/*  268 */     return this.aJ.remove(☃);
/*      */   }
/*      */   
/*      */   public void S() {
/*  272 */     V();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ou T() {
/*  278 */     return this.ab;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object ☃) {
/*  283 */     if (☃ instanceof aer) {
/*  284 */       return (((aer)☃).h == this.h);
/*      */     }
/*  286 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*  291 */     return this.h;
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
/*      */   public void V() {
/*  313 */     this.G = true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(boolean ☃) {}
/*      */   
/*      */   protected void a(float ☃, float f1) {
/*  320 */     if (☃ != this.H || f1 != this.I) {
/*  321 */       float f = this.H;
/*      */       
/*  323 */       this.H = ☃;
/*  324 */       this.I = f1;
/*      */       
/*  326 */       if (this.H < f) {
/*  327 */         double d = ☃ / 2.0D;
/*  328 */         a(new cea(this.q - d, this.r, this.s - d, this.q + d, this.r + this.I, this.s + d));
/*      */         
/*      */         return;
/*      */       } 
/*  332 */       cea cea1 = bD();
/*  333 */       a(new cea(cea1.a, cea1.b, cea1.c, cea1.a + this.H, cea1.b + this.I, cea1.c + this.H));
/*      */       
/*  335 */       if (this.H > f && !this.Z && !this.m.B) {
/*  336 */         a(afe.a, (f - this.H), 0.0D, (f - this.H));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void b(float ☃, float f1) {
/*  342 */     this.w = ☃ % 360.0F;
/*  343 */     this.x = f1 % 360.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(double ☃, double d1, double d2) {
/*  348 */     this.q = ☃;
/*  349 */     this.r = d1;
/*  350 */     this.s = d2;
/*  351 */     float f1 = this.H / 2.0F;
/*  352 */     float f2 = this.I;
/*  353 */     a(new cea(☃ - f1, d1, d2 - f1, ☃ + f1, d1 + f2, d2 + f1));
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
/*      */   public void R_() {
/*  374 */     if (!this.m.B) {
/*  375 */       b(6, bc());
/*      */     }
/*  377 */     W();
/*      */   }
/*      */   
/*      */   public void W() {
/*  381 */     this.m.A.a("entityBaseTick");
/*      */     
/*  383 */     if (aW() && (bU()).G) {
/*  384 */       S_();
/*      */     }
/*      */     
/*  387 */     if (this.k > 0) {
/*  388 */       this.k--;
/*      */     }
/*      */     
/*  391 */     this.J = this.K;
/*  392 */     this.n = this.q;
/*  393 */     this.o = this.r;
/*  394 */     this.p = this.s;
/*  395 */     this.z = this.x;
/*  396 */     this.y = this.w;
/*      */     
/*  398 */     if (!this.m.B && this.m instanceof td) {
/*  399 */       this.m.A.a("portal");
/*  400 */       if (this.an) {
/*  401 */         MinecraftServer ☃ = this.m.z();
/*      */         
/*  403 */         if (☃.u()) {
/*      */           
/*  405 */           int i = X();
/*  406 */           if (!aW() && this.ao++ >= i) {
/*  407 */             bod bod1; this.ao = i;
/*  408 */             this.am = aQ();
/*      */ 
/*      */ 
/*      */             
/*  412 */             if (this.m.t.q() == bod.b) {
/*  413 */               bod1 = bod.a;
/*      */             } else {
/*  415 */               bod1 = bod.b;
/*      */             } 
/*      */             
/*  418 */             a(bod1);
/*      */           } 
/*      */           
/*  421 */           this.an = false;
/*      */         } 
/*      */       } else {
/*  424 */         if (this.ao > 0) {
/*  425 */           this.ao -= 4;
/*      */         }
/*  427 */         if (this.ao < 0) {
/*  428 */           this.ao = 0;
/*      */         }
/*      */       } 
/*  431 */       E();
/*  432 */       this.m.A.e();
/*      */     } 
/*      */ 
/*      */     
/*  436 */     av();
/*      */     
/*  438 */     r();
/*      */     
/*  440 */     if (this.m.B) {
/*  441 */       Z();
/*      */     }
/*  443 */     else if (this.aC > 0) {
/*  444 */       if (this.aa) {
/*  445 */         this.aC -= 4;
/*  446 */         if (this.aC < 0) {
/*  447 */           Z();
/*      */         }
/*      */       } else {
/*  450 */         if (this.aC % 20 == 0) {
/*  451 */           a(aea.c, 1.0F);
/*      */         }
/*  453 */         this.aC--;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  458 */     if (ax()) {
/*  459 */       Y();
/*  460 */       this.M *= 0.5F;
/*      */     } 
/*      */     
/*  463 */     if (this.r < -64.0D) {
/*  464 */       aa();
/*      */     }
/*      */     
/*  467 */     if (!this.m.B) {
/*  468 */       b(0, (this.aC > 0));
/*      */     }
/*      */     
/*  471 */     this.Z = false;
/*      */     
/*  473 */     this.m.A.e();
/*      */   }
/*      */   
/*      */   protected void E() {
/*  477 */     if (this.am > 0) {
/*  478 */       this.am--;
/*      */     }
/*      */   }
/*      */   
/*      */   public int X() {
/*  483 */     return 1;
/*      */   }
/*      */   
/*      */   protected void Y() {
/*  487 */     if (this.aa) {
/*      */       return;
/*      */     }
/*      */     
/*  491 */     f(15);
/*  492 */     a(aea.d, 4.0F);
/*      */   }
/*      */   
/*      */   public void f(int ☃) {
/*  496 */     int i = ☃ * 20;
/*  497 */     if (this instanceof afa) {
/*  498 */       i = awq.a((afa)this, i);
/*      */     }
/*  500 */     if (this.aC < i) {
/*  501 */       this.aC = i;
/*      */     }
/*      */   }
/*      */   
/*      */   public void Z() {
/*  506 */     this.aC = 0;
/*      */   }
/*      */   
/*      */   protected void aa() {
/*  510 */     V();
/*      */   }
/*      */   
/*      */   public boolean c(double ☃, double d1, double d2) {
/*  514 */     return b(bD().d(☃, d1, d2));
/*      */   }
/*      */   
/*      */   private boolean b(cea ☃) {
/*  518 */     return (this.m.c(this, ☃) && !this.m.c(☃));
/*      */   }
/*      */   
/*      */   public void a(afe ☃, double d1, double d2, double d3) {
/*  522 */     if (this.R) {
/*  523 */       a(bD().d(d1, d2, d3));
/*  524 */       ac();
/*      */       
/*      */       return;
/*      */     } 
/*  528 */     if (☃ == afe.c) {
/*  529 */       long l = this.m.V();
/*  530 */       if (l != this.aM) {
/*  531 */         Arrays.fill(this.aL, 0.0D);
/*  532 */         this.aM = l;
/*      */       } 
/*      */       
/*  535 */       if (d1 != 0.0D) {
/*  536 */         int m = eq.a.a.ordinal();
/*  537 */         double d = xq.a(d1 + this.aL[m], -0.51D, 0.51D);
/*  538 */         d1 = d - this.aL[m];
/*  539 */         this.aL[m] = d;
/*  540 */         if (Math.abs(d1) <= 9.999999747378752E-6D) {
/*      */           return;
/*      */         }
/*  543 */       } else if (d2 != 0.0D) {
/*  544 */         int m = eq.a.b.ordinal();
/*  545 */         double d = xq.a(d2 + this.aL[m], -0.51D, 0.51D);
/*  546 */         d2 = d - this.aL[m];
/*  547 */         this.aL[m] = d;
/*  548 */         if (Math.abs(d2) <= 9.999999747378752E-6D) {
/*      */           return;
/*      */         }
/*  551 */       } else if (d3 != 0.0D) {
/*  552 */         int m = eq.a.c.ordinal();
/*  553 */         double d = xq.a(d3 + this.aL[m], -0.51D, 0.51D);
/*  554 */         d3 = d - this.aL[m];
/*  555 */         this.aL[m] = d;
/*  556 */         if (Math.abs(d3) <= 9.999999747378752E-6D) {
/*      */           return;
/*      */         }
/*      */       } else {
/*      */         return;
/*      */       } 
/*      */     } 
/*      */     
/*  564 */     this.m.A.a("move");
/*      */     
/*  566 */     double d4 = this.q;
/*  567 */     double d5 = this.r;
/*  568 */     double d6 = this.s;
/*      */ 
/*      */     
/*  571 */     if (this.F) {
/*  572 */       this.F = false;
/*      */       
/*  574 */       d1 *= 0.25D;
/*  575 */       d2 *= 0.05000000074505806D;
/*  576 */       d3 *= 0.25D;
/*  577 */       this.t = 0.0D;
/*  578 */       this.u = 0.0D;
/*  579 */       this.v = 0.0D;
/*      */     } 
/*      */     
/*  582 */     double d7 = d1;
/*  583 */     double d8 = d2;
/*  584 */     double d9 = d3;
/*      */ 
/*      */     
/*  587 */     if ((☃ == afe.a || ☃ == afe.b) && this.A && aZ() && this instanceof aog) {
/*  588 */       double d = 0.05D;
/*      */ 
/*      */       
/*  591 */       while (d1 != 0.0D && this.m.c(this, bD().d(d1, -this.Q, 0.0D))) {
/*  592 */         if (d1 < 0.05D && d1 >= -0.05D) {
/*  593 */           d1 = 0.0D;
/*  594 */         } else if (d1 > 0.0D) {
/*  595 */           d1 -= 0.05D;
/*      */         } else {
/*  597 */           d1 += 0.05D;
/*      */         } 
/*  599 */         d7 = d1;
/*      */       } 
/*      */ 
/*      */       
/*  603 */       while (d3 != 0.0D && this.m.c(this, bD().d(0.0D, -this.Q, d3))) {
/*  604 */         if (d3 < 0.05D && d3 >= -0.05D) {
/*  605 */           d3 = 0.0D;
/*  606 */         } else if (d3 > 0.0D) {
/*  607 */           d3 -= 0.05D;
/*      */         } else {
/*  609 */           d3 += 0.05D;
/*      */         } 
/*  611 */         d9 = d3;
/*      */       } 
/*      */ 
/*      */       
/*  615 */       while (d1 != 0.0D && d3 != 0.0D && this.m.c(this, bD().d(d1, -this.Q, d3))) {
/*  616 */         if (d1 < 0.05D && d1 >= -0.05D) {
/*  617 */           d1 = 0.0D;
/*  618 */         } else if (d1 > 0.0D) {
/*  619 */           d1 -= 0.05D;
/*      */         } else {
/*  621 */           d1 += 0.05D;
/*      */         } 
/*  623 */         d7 = d1;
/*      */         
/*  625 */         if (d3 < 0.05D && d3 >= -0.05D) {
/*  626 */           d3 = 0.0D;
/*  627 */         } else if (d3 > 0.0D) {
/*  628 */           d3 -= 0.05D;
/*      */         } else {
/*  630 */           d3 += 0.05D;
/*      */         } 
/*  632 */         d9 = d3;
/*      */       } 
/*      */     } 
/*      */     
/*  636 */     cea cea1 = bD();
/*      */     
/*  638 */     if (d1 != 0.0D || d2 != 0.0D || d3 != 0.0D) {
/*  639 */       xt<cew> xt = new xt<>(this.m.a(this, bD(), d1, d2, d3));
/*      */ 
/*      */       
/*  642 */       if (d2 != 0.0D) {
/*  643 */         d2 = cet.a(eq.a.b, bD(), xt.a(), d2);
/*  644 */         a(bD().d(0.0D, d2, 0.0D));
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  649 */       if (d1 != 0.0D) {
/*  650 */         d1 = cet.a(eq.a.a, bD(), xt.a(), d1);
/*  651 */         if (d1 != 0.0D) {
/*  652 */           a(bD().d(d1, 0.0D, 0.0D));
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  657 */       if (d3 != 0.0D) {
/*  658 */         d3 = cet.a(eq.a.c, bD(), xt.a(), d3);
/*  659 */         if (d3 != 0.0D) {
/*  660 */           a(bD().d(0.0D, 0.0D, d3));
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  665 */     boolean bool1 = (this.A || (d8 != d2 && d8 < 0.0D));
/*      */ 
/*      */     
/*  668 */     if (this.Q > 0.0F && bool1 && (d7 != d1 || d9 != d3)) {
/*  669 */       double d10 = d1;
/*  670 */       double d11 = d2;
/*  671 */       double d12 = d3;
/*  672 */       cea cea2 = bD();
/*      */ 
/*      */       
/*  675 */       a(cea1);
/*  676 */       d1 = d7;
/*  677 */       d2 = this.Q;
/*  678 */       d3 = d9;
/*      */       
/*  680 */       if (d1 != 0.0D || d2 != 0.0D || d3 != 0.0D) {
/*  681 */         xt<cew> xt = new xt<>(this.m.a(this, bD(), d1, d2, d3));
/*      */ 
/*      */         
/*  684 */         cea cea3 = bD();
/*  685 */         cea cea4 = cea3.b(d1, 0.0D, d3);
/*  686 */         double d13 = cet.a(eq.a.b, cea4, xt.a(), d2);
/*  687 */         if (d13 != 0.0D) {
/*  688 */           cea3 = cea3.d(0.0D, d13, 0.0D);
/*      */         }
/*      */ 
/*      */         
/*  692 */         double d14 = cet.a(eq.a.a, cea3, xt.a(), d1);
/*  693 */         if (d14 != 0.0D) {
/*  694 */           cea3 = cea3.d(d14, 0.0D, 0.0D);
/*      */         }
/*      */ 
/*      */         
/*  698 */         double d15 = cet.a(eq.a.c, cea3, xt.a(), d3);
/*  699 */         if (d15 != 0.0D) {
/*  700 */           cea3 = cea3.d(0.0D, 0.0D, d15);
/*      */         }
/*      */ 
/*      */         
/*  704 */         cea cea5 = bD();
/*  705 */         double d16 = cet.a(eq.a.b, cea5, xt.a(), d2);
/*  706 */         if (d16 != 0.0D) {
/*  707 */           cea5 = cea5.d(0.0D, d16, 0.0D);
/*      */         }
/*      */ 
/*      */         
/*  711 */         double d17 = cet.a(eq.a.a, cea5, xt.a(), d1);
/*  712 */         if (d17 != 0.0D) {
/*  713 */           cea5 = cea5.d(d17, 0.0D, 0.0D);
/*      */         }
/*      */ 
/*      */         
/*  717 */         double d18 = cet.a(eq.a.c, cea5, xt.a(), d3);
/*  718 */         if (d18 != 0.0D) {
/*  719 */           cea5 = cea5.d(0.0D, 0.0D, d18);
/*      */         }
/*      */ 
/*      */         
/*  723 */         double d19 = d14 * d14 + d15 * d15;
/*  724 */         double d20 = d17 * d17 + d18 * d18;
/*      */ 
/*      */         
/*  727 */         if (d19 > d20) {
/*  728 */           d1 = d14;
/*  729 */           d3 = d15;
/*  730 */           d2 = -d13;
/*  731 */           a(cea3);
/*      */         } else {
/*  733 */           d1 = d17;
/*  734 */           d3 = d18;
/*  735 */           d2 = -d16;
/*  736 */           a(cea5);
/*      */         } 
/*      */ 
/*      */         
/*  740 */         d2 = cet.a(eq.a.b, bD(), xt.a(), d2);
/*  741 */         if (d2 != 0.0D) {
/*  742 */           a(bD().d(0.0D, d2, 0.0D));
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  747 */       if (d10 * d10 + d12 * d12 >= d1 * d1 + d3 * d3) {
/*  748 */         d1 = d10;
/*  749 */         d2 = d11;
/*  750 */         d3 = d12;
/*  751 */         a(cea2);
/*      */       } 
/*      */     } 
/*  754 */     this.m.A.e();
/*  755 */     this.m.A.a("rest");
/*      */     
/*  757 */     ac();
/*      */     
/*  759 */     this.B = (d7 != d1 || d9 != d3);
/*  760 */     this.C = (d8 != d2);
/*      */     
/*  762 */     this.A = (this.C && d8 < 0.0D);
/*  763 */     this.D = (this.B || this.C);
/*      */ 
/*      */     
/*  766 */     int i = xq.c(this.q);
/*  767 */     int j = xq.c(this.r - 0.20000000298023224D);
/*  768 */     int k = xq.c(this.s);
/*      */     
/*  770 */     el el1 = new el(i, j, k);
/*  771 */     blc blc = this.m.a_(el1);
/*  772 */     if (blc.f()) {
/*  773 */       el el2 = el1.b();
/*  774 */       blc blc1 = this.m.a_(el2);
/*  775 */       bcs bcs1 = blc1.c();
/*  776 */       if (bcs1 instanceof ber || bcs1 instanceof bis || bcs1 instanceof bes) {
/*  777 */         blc = blc1;
/*  778 */         el1 = el2;
/*      */       } 
/*      */     } 
/*      */     
/*  782 */     a(d2, this.A, blc, el1);
/*      */     
/*  784 */     if (d7 != d1) {
/*  785 */       this.t = 0.0D;
/*      */     }
/*  787 */     if (d9 != d3) {
/*  788 */       this.v = 0.0D;
/*      */     }
/*      */     
/*  791 */     bcs bcs = blc.c();
/*  792 */     if (d8 != d2) {
/*  793 */       bcs.a(this.m, this);
/*      */     }
/*      */     
/*  796 */     if (ak() && (!this.A || !aZ() || !(this instanceof aog)) && !aW()) {
/*  797 */       double d10 = this.q - d4;
/*  798 */       double d11 = this.r - d5;
/*  799 */       double d12 = this.s - d6;
/*      */       
/*  801 */       if (bcs != bct.cz) {
/*  802 */         d11 = 0.0D;
/*      */       }
/*      */       
/*  805 */       if (bcs != null && this.A) {
/*  806 */         bcs.a(this.m, el1, this);
/*      */       }
/*      */       
/*  809 */       this.K = (float)(this.K + xq.a(d10 * d10 + d12 * d12) * 0.6D);
/*  810 */       this.L = (float)(this.L + xq.a(d10 * d10 + d11 * d11 + d12 * d12) * 0.6D);
/*      */       
/*  812 */       if (this.L > this.aA && !blc.f()) {
/*  813 */         this.aA = ab();
/*  814 */         if (an()) {
/*  815 */           aer aer1 = (aX() && bO() != null) ? bO() : this;
/*  816 */           float f1 = (aer1 == this) ? 0.35F : 0.4F;
/*  817 */           float f2 = xq.a(aer1.t * aer1.t * 0.20000000298023224D + aer1.u * aer1.u + aer1.v * aer1.v * 0.20000000298023224D) * f1;
/*  818 */           if (f2 > 1.0F) {
/*  819 */             f2 = 1.0F;
/*      */           }
/*  821 */           d(f2);
/*      */         } else {
/*  823 */           a(el1, blc);
/*      */         } 
/*  825 */       } else if (this.L > this.aB && ah() && blc.f()) {
/*  826 */         this.aB = e(this.L);
/*      */       } 
/*      */     } 
/*      */     
/*      */     try {
/*  831 */       ag();
/*  832 */     } catch (Throwable throwable) {
/*  833 */       b b = b.a(throwable, "Checking entity block collision");
/*  834 */       c c = b.a("Entity being checked for collision");
/*      */       
/*  836 */       a(c);
/*      */       
/*  838 */       throw new h(b);
/*      */     } 
/*      */     
/*  841 */     boolean bool2 = ap();
/*  842 */     if (this.m.b(bD().h(0.001D))) {
/*  843 */       if (!bool2) {
/*  844 */         this.aC++;
/*  845 */         if (this.aC == 0) {
/*  846 */           f(8);
/*      */         }
/*      */       } 
/*  849 */       g(1);
/*      */     }
/*  851 */     else if (this.aC <= 0) {
/*  852 */       this.aC = -bW();
/*      */     } 
/*      */ 
/*      */     
/*  856 */     if (bool2 && aV()) {
/*  857 */       a(wj.cS, 0.7F, 1.6F + (this.T.nextFloat() - this.T.nextFloat()) * 0.4F);
/*  858 */       this.aC = -bW();
/*      */     } 
/*      */     
/*  861 */     this.m.A.e();
/*      */   }
/*      */   
/*      */   protected float ab() {
/*  865 */     return ((int)this.L + 1);
/*      */   }
/*      */   
/*      */   public void ac() {
/*  869 */     cea ☃ = bD();
/*  870 */     this.q = (☃.a + ☃.d) / 2.0D;
/*  871 */     this.r = ☃.b;
/*  872 */     this.s = (☃.c + ☃.f) / 2.0D;
/*      */   }
/*      */   
/*      */   protected wi ad() {
/*  876 */     return wj.cW;
/*      */   }
/*      */   
/*      */   protected wi ae() {
/*  880 */     return wj.cV;
/*      */   }
/*      */   
/*      */   protected wi af() {
/*  884 */     return wj.cV;
/*      */   }
/*      */   
/*      */   protected void ag() {
/*  888 */     cea ☃ = bD();
/*      */     
/*  890 */     try(el.b ☃ = el.b.d(☃.a + 0.001D, ☃.b + 0.001D, ☃.c + 0.001D); 
/*  891 */         el.b ☃ = el.b.d(☃.d - 0.001D, ☃.e - 0.001D, ☃.f - 0.001D); 
/*  892 */         el.b ☃ = el.b.r()) {
/*      */       
/*  894 */       if (this.m.b(b, b1)) {
/*  895 */         for (int i = b.o(); i <= b1.o(); i++) {
/*  896 */           for (int j = b.p(); j <= b1.p(); j++) {
/*  897 */             for (int k = b.q(); k <= b1.q(); k++) {
/*  898 */               b2.f(i, j, k);
/*  899 */               blc blc = this.m.a_(b2);
/*      */               
/*      */               try {
/*  902 */                 blc.a(this.m, b2, this);
/*  903 */                 a(blc);
/*  904 */               } catch (Throwable throwable) {
/*  905 */                 b b3 = b.a(throwable, "Colliding entity with block");
/*  906 */                 c c = b3.a("Block being collided with");
/*      */                 
/*  908 */                 c.a(c, b2, blc);
/*      */                 
/*  910 */                 throw new h(b3);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(blc ☃) {}
/*      */   
/*      */   protected void a(el ☃, blc blc1) {
/*  923 */     if (blc1.d().a()) {
/*      */       return;
/*      */     }
/*      */     
/*  927 */     bhr bhr = (this.m.a_(☃.a()).c() == bct.cQ) ? bct.cQ.r() : blc1.c().r();
/*  928 */     a(bhr.d(), bhr.a() * 0.15F, bhr.b());
/*      */   }
/*      */   
/*      */   protected void d(float ☃) {
/*  932 */     a(ad(), ☃, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.4F);
/*      */   }
/*      */   
/*      */   protected float e(float ☃) {
/*  936 */     return 0.0F;
/*      */   }
/*      */   
/*      */   protected boolean ah() {
/*  940 */     return false;
/*      */   }
/*      */   
/*      */   public void a(wi ☃, float f1, float f2) {
/*  944 */     if (!ai()) {
/*  945 */       this.m.a((aog)null, this.q, this.r, this.s, ☃, bV(), f1, f2);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean ai() {
/*  950 */     return ((Boolean)this.ab.<Boolean>a(aG)).booleanValue();
/*      */   }
/*      */   
/*      */   public void c(boolean ☃) {
/*  954 */     this.ab.b(aG, Boolean.valueOf(☃));
/*      */   }
/*      */   
/*      */   public boolean aj() {
/*  958 */     return ((Boolean)this.ab.<Boolean>a(aH)).booleanValue();
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/*  962 */     this.ab.b(aH, Boolean.valueOf(☃));
/*      */   }
/*      */   
/*      */   protected boolean ak() {
/*  966 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, blc blc1, el el1) {
/*  971 */     if (bool) {
/*  972 */       if (this.M > 0.0F) {
/*  973 */         blc1.c().a(this.m, el1, this, this.M);
/*      */       }
/*  975 */       this.M = 0.0F;
/*  976 */     } else if (☃ < 0.0D) {
/*  977 */       this.M = (float)(this.M - ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public cea al() {
/*  983 */     return null;
/*      */   }
/*      */   
/*      */   protected void g(int ☃) {
/*  987 */     if (!this.aa) {
/*  988 */       a(aea.a, ☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public final boolean am() {
/*  993 */     return this.aa;
/*      */   }
/*      */   
/*      */   public void c(float ☃, float f1) {
/*  997 */     if (aX()) {
/*  998 */       for (aer aer1 : bP()) {
/*  999 */         aer1.c(☃, f1);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean an() {
/* 1005 */     return this.V;
/*      */   }
/*      */   
/*      */   private boolean p() {
/* 1009 */     try (el.b ☃ = el.b.b(this)) {
/* 1010 */       return (this.m.w(☃) || this.m.w(☃.e(this.q, this.r + this.I, this.s)));
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean q() {
/* 1015 */     return (this.m.a_(new el(this)).c() == bct.B);
/*      */   }
/*      */   
/*      */   public boolean ao() {
/* 1019 */     return (an() || p());
/*      */   }
/*      */   
/*      */   public boolean ap() {
/* 1023 */     return (an() || p() || q());
/*      */   }
/*      */   
/*      */   public boolean aq() {
/* 1027 */     return (an() || q());
/*      */   }
/*      */   
/*      */   public boolean ar() {
/* 1031 */     return (this.X && an());
/*      */   }
/*      */   
/*      */   private void r() {
/* 1035 */     at();
/* 1036 */     s();
/* 1037 */     as();
/*      */   }
/*      */   
/*      */   public void as() {
/* 1041 */     if (bb()) {
/* 1042 */       g((ba() && an() && !aW()));
/*      */     } else {
/* 1044 */       g((ba() && ar() && !aW()));
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean at() {
/* 1049 */     if (bU() instanceof apj) {
/* 1050 */       this.V = false;
/* 1051 */     } else if (b(ww.a)) {
/* 1052 */       if (!this.V && !this.Z) {
/* 1053 */         au();
/*      */       }
/* 1055 */       this.M = 0.0F;
/* 1056 */       this.V = true;
/* 1057 */       Z();
/*      */     } else {
/* 1059 */       this.V = false;
/*      */     } 
/* 1061 */     return this.V;
/*      */   }
/*      */   
/*      */   private void s() {
/* 1065 */     this.X = a(ww.a);
/*      */   }
/*      */   
/*      */   protected void au() {
/* 1069 */     aer ☃ = (aX() && bO() != null) ? bO() : this;
/* 1070 */     float f1 = (☃ == this) ? 0.2F : 0.9F;
/* 1071 */     float f2 = xq.a(☃.t * ☃.t * 0.20000000298023224D + ☃.u * ☃.u + ☃.v * ☃.v * 0.20000000298023224D) * f1;
/*      */     
/* 1073 */     if (f2 > 1.0F) {
/* 1074 */       f2 = 1.0F;
/*      */     }
/*      */     
/* 1077 */     if (f2 < 0.25D) {
/* 1078 */       a(ae(), f2, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.4F);
/*      */     } else {
/* 1080 */       a(af(), f2, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.4F);
/*      */     } 
/*      */     
/* 1083 */     float f3 = xq.c((bD()).b); int i;
/* 1084 */     for (i = 0; i < 1.0F + this.H * 20.0F; i++) {
/* 1085 */       float f4 = (this.T.nextFloat() * 2.0F - 1.0F) * this.H;
/* 1086 */       float f5 = (this.T.nextFloat() * 2.0F - 1.0F) * this.H;
/* 1087 */       this.m.a(fm.e, this.q + f4, (f3 + 1.0F), this.s + f5, this.t, this.u - (this.T.nextFloat() * 0.2F), this.v);
/*      */     } 
/* 1089 */     for (i = 0; i < 1.0F + this.H * 20.0F; i++) {
/* 1090 */       float f4 = (this.T.nextFloat() * 2.0F - 1.0F) * this.H;
/* 1091 */       float f5 = (this.T.nextFloat() * 2.0F - 1.0F) * this.H;
/* 1092 */       this.m.a(fm.R, this.q + f4, (f3 + 1.0F), this.s + f5, this.t, this.u, this.v);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void av() {
/* 1097 */     if (ba() && !an()) {
/* 1098 */       aw();
/*      */     }
/*      */   }
/*      */   
/*      */   protected void aw() {
/* 1103 */     int ☃ = xq.c(this.q);
/* 1104 */     int i = xq.c(this.r - 0.20000000298023224D);
/* 1105 */     int j = xq.c(this.s);
/* 1106 */     el el1 = new el(☃, i, j);
/*      */     
/* 1108 */     blc blc = this.m.a_(el1);
/* 1109 */     if (blc.i() != bgy.a) {
/* 1110 */       this.m.a(new fh(fm.d, blc), this.q + (this.T.nextFloat() - 0.5D) * this.H, (bD()).b + 0.1D, this.s + (this.T.nextFloat() - 0.5D) * this.H, -this.t * 4.0D, 1.5D, -this.v * 4.0D);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(wz<byv> ☃) {
/* 1115 */     if (bU() instanceof apj) {
/* 1116 */       return false;
/*      */     }
/*      */     
/* 1119 */     double d = this.r + bF();
/* 1120 */     el el1 = new el(this.q, d, this.s);
/* 1121 */     byw byw = this.m.b(el1);
/*      */     
/* 1123 */     return (byw.a(☃) && d < (el1.p() + byw.f() + 0.11111111F));
/*      */   }
/*      */   
/*      */   public boolean ax() {
/* 1127 */     return this.m.a(bD().f(0.10000000149011612D, 0.4000000059604645D, 0.10000000149011612D), bza.k);
/*      */   }
/*      */   
/*      */   public void a(float ☃, float f1, float f2, float f3) {
/* 1131 */     float f4 = ☃ * ☃ + f1 * f1 + f2 * f2;
/* 1132 */     if (f4 < 1.0E-4F) {
/*      */       return;
/*      */     }
/*      */     
/* 1136 */     f4 = xq.c(f4);
/* 1137 */     if (f4 < 1.0F) {
/* 1138 */       f4 = 1.0F;
/*      */     }
/* 1140 */     f4 = f3 / f4;
/* 1141 */     ☃ *= f4;
/* 1142 */     f1 *= f4;
/* 1143 */     f2 *= f4;
/*      */     
/* 1145 */     float f5 = xq.a(this.w * 0.017453292F);
/* 1146 */     float f6 = xq.b(this.w * 0.017453292F);
/*      */     
/* 1148 */     this.t += (☃ * f6 - f2 * f5);
/* 1149 */     this.u += f1;
/* 1150 */     this.v += (f2 * f6 + ☃ * f5);
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
/*      */   public float az() {
/* 1163 */     el.a ☃ = new el.a(xq.c(this.q), 0, xq.c(this.s));
/* 1164 */     if (this.m.D(☃)) {
/* 1165 */       ☃.p(xq.c(this.r + bF()));
/* 1166 */       return this.m.A(☃);
/*      */     } 
/* 1168 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public void a(axy ☃) {
/* 1172 */     this.m = ☃;
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2) {
/* 1176 */     this.q = xq.a(☃, -3.0E7D, 3.0E7D);
/* 1177 */     this.r = d1;
/* 1178 */     this.s = xq.a(d2, -3.0E7D, 3.0E7D);
/*      */     
/* 1180 */     this.n = this.q;
/* 1181 */     this.o = this.r;
/* 1182 */     this.p = this.s;
/*      */     
/* 1184 */     f2 = xq.a(f2, -90.0F, 90.0F);
/*      */     
/* 1186 */     this.w = f1;
/* 1187 */     this.x = f2;
/* 1188 */     this.y = this.w;
/* 1189 */     this.z = this.x;
/*      */     
/* 1191 */     double d = (this.y - f1);
/* 1192 */     if (d < -180.0D) {
/* 1193 */       this.y += 360.0F;
/*      */     }
/* 1195 */     if (d >= 180.0D) {
/* 1196 */       this.y -= 360.0F;
/*      */     }
/* 1198 */     b(this.q, this.r, this.s);
/* 1199 */     b(f1, f2);
/*      */   }
/*      */   
/*      */   public void a(el ☃, float f1, float f2) {
/* 1203 */     b(☃.o() + 0.5D, ☃.p(), ☃.q() + 0.5D, f1, f2);
/*      */   }
/*      */   
/*      */   public void b(double ☃, double d1, double d2, float f1, float f2) {
/* 1207 */     this.q = ☃;
/* 1208 */     this.r = d1;
/* 1209 */     this.s = d2;
/* 1210 */     this.n = this.q;
/* 1211 */     this.o = this.r;
/* 1212 */     this.p = this.s;
/* 1213 */     this.N = this.q;
/* 1214 */     this.O = this.r;
/* 1215 */     this.P = this.s;
/*      */     
/* 1217 */     this.w = f1;
/* 1218 */     this.x = f2;
/* 1219 */     b(this.q, this.r, this.s);
/*      */   }
/*      */   
/*      */   public float g(aer ☃) {
/* 1223 */     float f1 = (float)(this.q - ☃.q);
/* 1224 */     float f2 = (float)(this.r - ☃.r);
/* 1225 */     float f3 = (float)(this.s - ☃.s);
/* 1226 */     return xq.c(f1 * f1 + f2 * f2 + f3 * f3);
/*      */   }
/*      */   
/*      */   public double d(double ☃, double d1, double d2) {
/* 1230 */     double d3 = this.q - ☃;
/* 1231 */     double d4 = this.r - d1;
/* 1232 */     double d5 = this.s - d2;
/* 1233 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*      */   }
/*      */   
/*      */   public double c(el ☃) {
/* 1237 */     return ☃.f(this.q, this.r, this.s);
/*      */   }
/*      */   
/*      */   public double d(el ☃) {
/* 1241 */     return ☃.g(this.q, this.r, this.s);
/*      */   }
/*      */   
/*      */   public double e(double ☃, double d1, double d2) {
/* 1245 */     double d3 = this.q - ☃;
/* 1246 */     double d4 = this.r - d1;
/* 1247 */     double d5 = this.s - d2;
/* 1248 */     return xq.a(d3 * d3 + d4 * d4 + d5 * d5);
/*      */   }
/*      */   
/*      */   public double h(aer ☃) {
/* 1252 */     double d1 = this.q - ☃.q;
/* 1253 */     double d2 = this.r - ☃.r;
/* 1254 */     double d3 = this.s - ☃.s;
/* 1255 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*      */   }
/*      */   
/*      */   public double a(cee ☃) {
/* 1259 */     double d1 = this.q - ☃.b;
/* 1260 */     double d2 = this.r - ☃.c;
/* 1261 */     double d3 = this.s - ☃.d;
/* 1262 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(aog ☃) {}
/*      */   
/*      */   public void i(aer ☃) {
/* 1269 */     if (x(☃)) {
/*      */       return;
/*      */     }
/* 1272 */     if (☃.R || this.R) {
/*      */       return;
/*      */     }
/*      */     
/* 1276 */     double d1 = ☃.q - this.q;
/* 1277 */     double d2 = ☃.s - this.s;
/*      */     
/* 1279 */     double d3 = xq.a(d1, d2);
/*      */     
/* 1281 */     if (d3 >= 0.009999999776482582D) {
/* 1282 */       d3 = xq.a(d3);
/* 1283 */       d1 /= d3;
/* 1284 */       d2 /= d3;
/*      */       
/* 1286 */       double d = 1.0D / d3;
/* 1287 */       if (d > 1.0D) {
/* 1288 */         d = 1.0D;
/*      */       }
/* 1290 */       d1 *= d;
/* 1291 */       d2 *= d;
/*      */       
/* 1293 */       d1 *= 0.05000000074505806D;
/* 1294 */       d2 *= 0.05000000074505806D;
/*      */       
/* 1296 */       d1 *= (1.0F - this.S);
/* 1297 */       d2 *= (1.0F - this.S);
/*      */       
/* 1299 */       if (!aX()) {
/* 1300 */         f(-d1, 0.0D, -d2);
/*      */       }
/* 1302 */       if (!☃.aX()) {
/* 1303 */         ☃.f(d1, 0.0D, d2);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void f(double ☃, double d1, double d2) {
/* 1309 */     this.t += ☃;
/* 1310 */     this.u += d1;
/* 1311 */     this.v += d2;
/* 1312 */     this.al = true;
/*      */   }
/*      */   
/*      */   protected void aA() {
/* 1316 */     this.E = true;
/*      */   }
/*      */   
/*      */   public boolean a(aea ☃, float f) {
/* 1320 */     if (b(☃)) {
/* 1321 */       return false;
/*      */     }
/* 1323 */     aA();
/* 1324 */     return false;
/*      */   }
/*      */   
/*      */   public final cee f(float ☃) {
/* 1328 */     return d(g(☃), h(☃));
/*      */   }
/*      */   
/*      */   public float g(float ☃) {
/* 1332 */     if (☃ == 1.0F) {
/* 1333 */       return this.x;
/*      */     }
/* 1335 */     return this.z + (this.x - this.z) * ☃;
/*      */   }
/*      */   
/*      */   public float h(float ☃) {
/* 1339 */     if (☃ == 1.0F) {
/* 1340 */       return this.w;
/*      */     }
/* 1342 */     return this.y + (this.w - this.y) * ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected final cee d(float ☃, float f1) {
/* 1348 */     float f2 = ☃ * 0.017453292F;
/* 1349 */     float f3 = -f1 * 0.017453292F;
/*      */     
/* 1351 */     float f4 = xq.b(f3);
/* 1352 */     float f5 = xq.a(f3);
/* 1353 */     float f6 = xq.b(f2);
/* 1354 */     float f7 = xq.a(f2);
/*      */     
/* 1356 */     return new cee((f5 * f6), -f7, (f4 * f6));
/*      */   }
/*      */   
/*      */   public cee i(float ☃) {
/* 1360 */     if (☃ == 1.0F) {
/* 1361 */       return new cee(this.q, this.r + bF(), this.s);
/*      */     }
/* 1363 */     double d1 = this.n + (this.q - this.n) * ☃;
/* 1364 */     double d2 = this.o + (this.r - this.o) * ☃ + bF();
/* 1365 */     double d3 = this.p + (this.s - this.p) * ☃;
/*      */     
/* 1367 */     return new cee(d1, d2, d3);
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
/*      */   public boolean aB() {
/* 1379 */     return false;
/*      */   }
/*      */   
/*      */   public boolean aC() {
/* 1383 */     return false;
/*      */   }
/*      */   
/*      */   public void a(aer ☃, int i, aea aea1) {
/* 1387 */     if (☃ instanceof tf) {
/* 1388 */       p.c.a((tf)☃, this, aea1);
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
/*      */   public boolean c(gy ☃) {
/* 1410 */     String str = aE();
/* 1411 */     if (this.G || str == null) {
/* 1412 */       return false;
/*      */     }
/* 1414 */     ☃.a("id", str);
/* 1415 */     e(☃);
/* 1416 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(gy ☃) {
/* 1420 */     if (aW()) {
/* 1421 */       return false;
/*      */     }
/* 1423 */     return c(☃);
/*      */   }
/*      */   
/*      */   public gy e(gy ☃) {
/*      */     try {
/* 1428 */       ☃.a("Pos", a(new double[] { this.q, this.r, this.s }));
/* 1429 */       ☃.a("Motion", a(new double[] { this.t, this.u, this.v }));
/* 1430 */       ☃.a("Rotation", a(new float[] { this.w, this.x }));
/*      */       
/* 1432 */       ☃.a("FallDistance", this.M);
/* 1433 */       ☃.a("Fire", (short)this.aC);
/* 1434 */       ☃.a("Air", (short)bg());
/* 1435 */       ☃.a("OnGround", this.A);
/* 1436 */       ☃.b("Dimension", this.ap.c());
/* 1437 */       ☃.a("Invulnerable", this.aI);
/* 1438 */       ☃.b("PortalCooldown", this.am);
/*      */       
/* 1440 */       ☃.a("UUID", bt());
/*      */       
/* 1442 */       ij ij = e();
/* 1443 */       if (ij != null) {
/* 1444 */         ☃.a("CustomName", ij.a.a(ij));
/*      */       }
/* 1446 */       if (by()) {
/* 1447 */         ☃.a("CustomNameVisible", by());
/*      */       }
/* 1449 */       if (ai()) {
/* 1450 */         ☃.a("Silent", ai());
/*      */       }
/* 1452 */       if (aj()) {
/* 1453 */         ☃.a("NoGravity", aj());
/*      */       }
/* 1455 */       if (this.av) {
/* 1456 */         ☃.a("Glowing", this.av);
/*      */       }
/* 1458 */       if (!this.aJ.isEmpty()) {
/* 1459 */         he he = new he();
/* 1460 */         for (String str : this.aJ) {
/* 1461 */           he.a(new hn(str));
/*      */         }
/* 1463 */         ☃.a("Tags", he);
/*      */       } 
/*      */       
/* 1466 */       b(☃);
/*      */       
/* 1468 */       if (aX()) {
/* 1469 */         he he = new he();
/* 1470 */         for (aer aer1 : bP()) {
/* 1471 */           gy gy1 = new gy();
/* 1472 */           if (aer1.c(gy1)) {
/* 1473 */             he.a(gy1);
/*      */           }
/*      */         } 
/* 1476 */         if (!he.isEmpty()) {
/* 1477 */           ☃.a("Passengers", he);
/*      */         }
/*      */       } 
/* 1480 */     } catch (Throwable throwable) {
/* 1481 */       b b = b.a(throwable, "Saving entity NBT");
/* 1482 */       c c = b.a("Entity being saved");
/* 1483 */       a(c);
/* 1484 */       throw new h(b);
/*      */     } 
/*      */     
/* 1487 */     return ☃;
/*      */   }
/*      */   
/*      */   public void f(gy ☃) {
/*      */     try {
/* 1492 */       he he1 = ☃.d("Pos", 6);
/* 1493 */       he he2 = ☃.d("Motion", 6);
/* 1494 */       he he3 = ☃.d("Rotation", 5);
/*      */       
/* 1496 */       this.t = he2.k(0);
/* 1497 */       this.u = he2.k(1);
/* 1498 */       this.v = he2.k(2);
/*      */       
/* 1500 */       if (Math.abs(this.t) > 10.0D) {
/* 1501 */         this.t = 0.0D;
/*      */       }
/* 1503 */       if (Math.abs(this.u) > 10.0D) {
/* 1504 */         this.u = 0.0D;
/*      */       }
/* 1506 */       if (Math.abs(this.v) > 10.0D) {
/* 1507 */         this.v = 0.0D;
/*      */       }
/*      */       
/* 1510 */       this.q = he1.k(0);
/* 1511 */       this.r = he1.k(1);
/* 1512 */       this.s = he1.k(2);
/* 1513 */       this.N = this.q;
/* 1514 */       this.O = this.r;
/* 1515 */       this.P = this.s;
/* 1516 */       this.n = this.q;
/* 1517 */       this.o = this.r;
/* 1518 */       this.p = this.s;
/*      */       
/* 1520 */       this.w = he3.l(0);
/* 1521 */       this.x = he3.l(1);
/* 1522 */       this.y = this.w;
/* 1523 */       this.z = this.x;
/*      */       
/* 1525 */       j(this.w);
/* 1526 */       k(this.w);
/*      */       
/* 1528 */       this.M = ☃.j("FallDistance");
/* 1529 */       this.aC = ☃.g("Fire");
/* 1530 */       i(☃.g("Air"));
/* 1531 */       this.A = ☃.q("OnGround");
/* 1532 */       if (☃.e("Dimension")) {
/* 1533 */         this.ap = bod.a(☃.h("Dimension"));
/*      */       }
/* 1535 */       this.aI = ☃.q("Invulnerable");
/* 1536 */       this.am = ☃.h("PortalCooldown");
/*      */       
/* 1538 */       if (☃.b("UUID")) {
/* 1539 */         this.at = ☃.a("UUID");
/* 1540 */         this.au = this.at.toString();
/*      */       } 
/*      */       
/* 1543 */       b(this.q, this.r, this.s);
/* 1544 */       b(this.w, this.x);
/*      */       
/* 1546 */       if (☃.c("CustomName", 8)) {
/* 1547 */         b(ij.a.a(☃.l("CustomName")));
/*      */       }
/* 1549 */       m(☃.q("CustomNameVisible"));
/* 1550 */       c(☃.q("Silent"));
/* 1551 */       d(☃.q("NoGravity"));
/* 1552 */       h(☃.q("Glowing"));
/*      */       
/* 1554 */       if (☃.c("Tags", 9)) {
/* 1555 */         this.aJ.clear();
/* 1556 */         he he = ☃.d("Tags", 8);
/* 1557 */         int i = Math.min(he.size(), 1024);
/* 1558 */         for (int j = 0; j < i; j++) {
/* 1559 */           this.aJ.add(he.m(j));
/*      */         }
/*      */       } 
/*      */       
/* 1563 */       a(☃);
/*      */       
/* 1565 */       if (aD()) {
/* 1566 */         b(this.q, this.r, this.s);
/*      */       }
/* 1568 */     } catch (Throwable throwable) {
/* 1569 */       b b = b.a(throwable, "Loading entity NBT");
/* 1570 */       c c = b.a("Entity being loaded");
/* 1571 */       a(c);
/* 1572 */       throw new h(b);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean aD() {
/* 1577 */     return true;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected final String aE() {
/* 1582 */     aev<?> ☃ = P();
/* 1583 */     pc pc = aev.a(☃);
/* 1584 */     return (!☃.a() || pc == null) ? null : pc.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected he a(double... ☃) {
/* 1592 */     he he = new he();
/* 1593 */     for (double d : ☃) {
/* 1594 */       he.a(new gz(d));
/*      */     }
/* 1596 */     return he;
/*      */   }
/*      */   
/*      */   protected he a(float... ☃) {
/* 1600 */     he he = new he();
/* 1601 */     for (float f : ☃) {
/* 1602 */       he.a(new hb(f));
/*      */     }
/* 1604 */     return he;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a(axx ☃) {
/* 1609 */     return a(☃, 0);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a(axx ☃, int i) {
/* 1614 */     return a(new ate(☃), i);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a_(ate ☃) {
/* 1619 */     return a(☃, 0.0F);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a(ate ☃, float f) {
/* 1624 */     if (☃.a()) {
/* 1625 */       return null;
/*      */     }
/*      */     
/* 1628 */     amm amm = new amm(this.m, this.q, this.r + f, this.s, ☃);
/* 1629 */     amm.n();
/* 1630 */     this.m.a(amm);
/* 1631 */     return amm;
/*      */   }
/*      */   
/*      */   public boolean aF() {
/* 1635 */     return !this.G;
/*      */   }
/*      */   
/*      */   public boolean aG() {
/* 1639 */     if (this.R) {
/* 1640 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1644 */     try (el.b ☃ = el.b.r()) {
/* 1645 */       for (int i = 0; i < 8; i++) {
/*      */         
/* 1647 */         int j = xq.c(this.r + ((((i >> 0) % 2) - 0.5F) * 0.1F) + bF());
/* 1648 */         int k = xq.c(this.q + ((((i >> 1) % 2) - 0.5F) * this.H * 0.8F));
/* 1649 */         int m = xq.c(this.s + ((((i >> 2) % 2) - 0.5F) * this.H * 0.8F));
/*      */         
/* 1651 */         if (☃.o() != k || ☃.p() != j || ☃.q() != m) {
/* 1652 */           ☃.f(k, j, m);
/* 1653 */           if (this.m.a_(☃).r()) {
/* 1654 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/* 1659 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(aog ☃, adk adk1) {
/* 1663 */     return false;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public cea j(aer ☃) {
/* 1668 */     return null;
/*      */   }
/*      */   
/*      */   public void aH() {
/* 1672 */     aer ☃ = bU();
/* 1673 */     if (aW() && ☃.G) {
/* 1674 */       S_();
/*      */       return;
/*      */     } 
/* 1677 */     this.t = 0.0D;
/* 1678 */     this.u = 0.0D;
/* 1679 */     this.v = 0.0D;
/* 1680 */     R_();
/* 1681 */     if (!aW()) {
/*      */       return;
/*      */     }
/*      */     
/* 1685 */     ☃.k(this);
/*      */   }
/*      */   
/*      */   public void k(aer ☃) {
/* 1689 */     if (!w(☃)) {
/*      */       return;
/*      */     }
/* 1692 */     ☃.b(this.q, this.r + aJ() + ☃.aI(), this.s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double aI() {
/* 1699 */     return 0.0D;
/*      */   }
/*      */   
/*      */   public double aJ() {
/* 1703 */     return this.I * 0.75D;
/*      */   }
/*      */   
/*      */   public boolean m(aer ☃) {
/* 1707 */     return a(☃, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aer ☃, boolean bool) {
/* 1715 */     aer aer1 = ☃;
/* 1716 */     while (aer1.ax != null) {
/* 1717 */       if (aer1.ax == this) {
/* 1718 */         return false;
/*      */       }
/*      */       
/* 1721 */       aer1 = aer1.ax;
/*      */     } 
/*      */     
/* 1724 */     if (!bool && (!n(☃) || !☃.q(this))) {
/* 1725 */       return false;
/*      */     }
/*      */     
/* 1728 */     if (aW()) {
/* 1729 */       S_();
/*      */     }
/*      */     
/* 1732 */     this.ax = ☃;
/* 1733 */     this.ax.o(this);
/*      */     
/* 1735 */     return true;
/*      */   }
/*      */   
/*      */   protected boolean n(aer ☃) {
/* 1739 */     return (this.k <= 0);
/*      */   }
/*      */   
/*      */   public void aL() {
/* 1743 */     for (int ☃ = this.aw.size() - 1; ☃ >= 0; ☃--) {
/* 1744 */       ((aer)this.aw.get(☃)).S_();
/*      */     }
/*      */   }
/*      */   
/*      */   public void S_() {
/* 1749 */     if (this.ax != null) {
/* 1750 */       aer ☃ = this.ax;
/* 1751 */       this.ax = null;
/* 1752 */       ☃.p(this);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void o(aer ☃) {
/* 1757 */     if (☃.bU() != this) {
/* 1758 */       throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
/*      */     }
/*      */     
/* 1761 */     if (!this.m.B && ☃ instanceof aog && !(bO() instanceof aog)) {
/* 1762 */       this.aw.add(0, ☃);
/*      */     } else {
/* 1764 */       this.aw.add(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void p(aer ☃) {
/* 1769 */     if (☃.bU() == this) {
/* 1770 */       throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
/*      */     }
/*      */     
/* 1773 */     this.aw.remove(☃);
/* 1774 */     ☃.k = 60;
/*      */   }
/*      */   
/*      */   protected boolean q(aer ☃) {
/* 1778 */     return (bP().size() < 1);
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
/*      */   public float aM() {
/* 1791 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public cee aN() {
/* 1795 */     return d(this.x, this.w);
/*      */   }
/*      */   
/*      */   public ced aO() {
/* 1799 */     return new ced(this.x, this.w);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(el ☃) {
/* 1807 */     if (this.am > 0) {
/* 1808 */       this.am = aQ();
/*      */       
/*      */       return;
/*      */     } 
/* 1812 */     if (!this.m.B && !☃.equals(this.aq)) {
/* 1813 */       this.aq = new el(☃);
/* 1814 */       bli.b b = ((bgc)bct.dh).c(this.m, this.aq);
/*      */       
/* 1816 */       double d1 = (b.b().k() == eq.a.a) ? b.a().q() : b.a().o();
/* 1817 */       double d2 = (b.b().k() == eq.a.a) ? this.s : this.q;
/* 1818 */       d2 = Math.abs(xq.c(d2 - ((b.b().e().c() == eq.b.b) ? true : false), d1, d1 - b.d()));
/* 1819 */       double d3 = xq.c(this.r - 1.0D, b.a().p(), (b.a().p() - b.e()));
/* 1820 */       this.ar = new cee(d2, d3, 0.0D);
/* 1821 */       this.as = b.b();
/*      */     } 
/*      */     
/* 1824 */     this.an = true;
/*      */   }
/*      */   
/*      */   public int aQ() {
/* 1828 */     return 300;
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
/*      */   public Iterable<ate> aS() {
/* 1844 */     return a;
/*      */   }
/*      */   
/*      */   public Iterable<ate> aT() {
/* 1848 */     return a;
/*      */   }
/*      */   
/*      */   public Iterable<ate> aU() {
/* 1852 */     return Iterables.concat(aS(), aT());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aew ☃, ate ate1) {}
/*      */ 
/*      */   
/*      */   public boolean aV() {
/* 1860 */     boolean ☃ = (this.m != null && this.m.B);
/*      */     
/* 1862 */     return (!this.aa && (this.aC > 0 || (☃ && h(0))));
/*      */   }
/*      */   
/*      */   public boolean aW() {
/* 1866 */     return (bU() != null);
/*      */   }
/*      */   
/*      */   public boolean aX() {
/* 1870 */     return !bP().isEmpty();
/*      */   }
/*      */   
/*      */   public boolean aY() {
/* 1874 */     return true;
/*      */   }
/*      */   
/*      */   public boolean aZ() {
/* 1878 */     return h(1);
/*      */   }
/*      */   
/*      */   public void e(boolean ☃) {
/* 1882 */     b(1, ☃);
/*      */   }
/*      */   
/*      */   public boolean ba() {
/* 1886 */     return h(3);
/*      */   }
/*      */   
/*      */   public void f(boolean ☃) {
/* 1890 */     b(3, ☃);
/*      */   }
/*      */   
/*      */   public boolean bb() {
/* 1894 */     return h(4);
/*      */   }
/*      */   
/*      */   public void g(boolean ☃) {
/* 1898 */     b(4, ☃);
/*      */   }
/*      */   
/*      */   public boolean bc() {
/* 1902 */     return (this.av || (this.m.B && h(6)));
/*      */   }
/*      */   
/*      */   public void h(boolean ☃) {
/* 1906 */     this.av = ☃;
/* 1907 */     if (!this.m.B) {
/* 1908 */       b(6, this.av);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean bd() {
/* 1913 */     return h(5);
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
/*      */   @Nullable
/*      */   public cfe be() {
/* 1929 */     return this.m.G().i(bv());
/*      */   }
/*      */   
/*      */   public boolean r(aer ☃) {
/* 1933 */     return a(☃.be());
/*      */   }
/*      */   
/*      */   public boolean a(cfe ☃) {
/* 1937 */     if (be() != null) {
/* 1938 */       return be().a(☃);
/*      */     }
/* 1940 */     return false;
/*      */   }
/*      */   
/*      */   public void i(boolean ☃) {
/* 1944 */     b(5, ☃);
/*      */   }
/*      */   
/*      */   protected boolean h(int ☃) {
/* 1948 */     return ((((Byte)this.ab.<Byte>a(ac)).byteValue() & 1 << ☃) != 0);
/*      */   }
/*      */   
/*      */   protected void b(int ☃, boolean bool) {
/* 1952 */     byte b = ((Byte)this.ab.<Byte>a(ac)).byteValue();
/* 1953 */     if (bool) {
/* 1954 */       this.ab.b(ac, Byte.valueOf((byte)(b | 1 << ☃)));
/*      */     } else {
/* 1956 */       this.ab.b(ac, Byte.valueOf((byte)(b & (1 << ☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */   
/*      */   public int bf() {
/* 1961 */     return 300;
/*      */   }
/*      */   
/*      */   public int bg() {
/* 1965 */     return ((Integer)this.ab.<Integer>a(aD)).intValue();
/*      */   }
/*      */   
/*      */   public void i(int ☃) {
/* 1969 */     this.ab.b(aD, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public void a(amj ☃) {
/* 1973 */     this.aC++;
/* 1974 */     if (this.aC == 0) {
/* 1975 */       f(8);
/*      */     }
/* 1977 */     a(aea.b, 5.0F);
/*      */   }
/*      */   
/*      */   public void j(boolean ☃) {
/* 1981 */     if (☃) {
/* 1982 */       this.u = Math.max(-0.9D, this.u - 0.03D);
/*      */     } else {
/* 1984 */       this.u = Math.min(1.8D, this.u + 0.1D);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void k(boolean ☃) {
/* 1989 */     if (☃) {
/* 1990 */       this.u = Math.max(-0.3D, this.u - 0.03D);
/*      */     } else {
/* 1992 */       this.u = Math.min(0.7D, this.u + 0.06D);
/*      */     } 
/* 1994 */     this.M = 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(afa ☃) {}
/*      */   
/*      */   protected boolean i(double ☃, double d1, double d2) {
/* 2001 */     el el1 = new el(☃, d1, d2);
/*      */     
/* 2003 */     double d3 = ☃ - el1.o();
/* 2004 */     double d4 = d1 - el1.p();
/* 2005 */     double d5 = d2 - el1.q();
/*      */     
/* 2007 */     if (this.m.c((aer)null, bD())) {
/* 2008 */       return false;
/*      */     }
/*      */     
/* 2011 */     eq eq1 = eq.b;
/* 2012 */     double d6 = Double.MAX_VALUE;
/* 2013 */     if (!this.m.o(el1.e()) && d3 < d6) {
/* 2014 */       d6 = d3;
/* 2015 */       eq1 = eq.e;
/*      */     } 
/* 2017 */     if (!this.m.o(el1.f()) && 1.0D - d3 < d6) {
/* 2018 */       d6 = 1.0D - d3;
/* 2019 */       eq1 = eq.f;
/*      */     } 
/* 2021 */     if (!this.m.o(el1.c()) && d5 < d6) {
/* 2022 */       d6 = d5;
/* 2023 */       eq1 = eq.c;
/*      */     } 
/* 2025 */     if (!this.m.o(el1.d()) && 1.0D - d5 < d6) {
/* 2026 */       d6 = 1.0D - d5;
/* 2027 */       eq1 = eq.d;
/*      */     } 
/*      */     
/* 2030 */     if (!this.m.o(el1.a()) && 1.0D - d4 < d6) {
/* 2031 */       d6 = 1.0D - d4;
/* 2032 */       eq1 = eq.b;
/*      */     } 
/*      */     
/* 2035 */     float f1 = this.T.nextFloat() * 0.2F + 0.1F;
/* 2036 */     float f2 = eq1.c().a();
/*      */     
/* 2038 */     if (eq1.k() == eq.a.a) {
/* 2039 */       this.t = (f2 * f1);
/* 2040 */       this.u *= 0.75D;
/* 2041 */       this.v *= 0.75D;
/* 2042 */     } else if (eq1.k() == eq.a.b) {
/* 2043 */       this.t *= 0.75D;
/* 2044 */       this.u = (f2 * f1);
/* 2045 */       this.v *= 0.75D;
/* 2046 */     } else if (eq1.k() == eq.a.c) {
/* 2047 */       this.t *= 0.75D;
/* 2048 */       this.u *= 0.75D;
/* 2049 */       this.v = (f2 * f1);
/*      */     } 
/* 2051 */     return true;
/*      */   }
/*      */   
/*      */   public void bh() {
/* 2055 */     this.F = true;
/* 2056 */     this.M = 0.0F;
/*      */   }
/*      */   
/*      */   private static void c(ij ☃) {
/* 2060 */     ☃.a(☃ -> ☃.a((ii)null)).a().forEach(aer::c);
/*      */   }
/*      */ 
/*      */   
/*      */   public ij N_() {
/* 2065 */     ij ☃ = e();
/* 2066 */     if (☃ != null) {
/* 2067 */       ij ij = ☃.h();
/* 2068 */       c(ij);
/* 2069 */       return ij;
/*      */     } 
/* 2071 */     return this.g.e();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aer[] bi() {
/* 2076 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean s(aer ☃) {
/* 2081 */     return (this == ☃);
/*      */   }
/*      */   
/*      */   public float bj() {
/* 2085 */     return 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j(float ☃) {}
/*      */ 
/*      */   
/*      */   public void k(float ☃) {}
/*      */   
/*      */   public boolean bk() {
/* 2095 */     return true;
/*      */   }
/*      */   
/*      */   public boolean t(aer ☃) {
/* 2099 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 2104 */     return String.format(Locale.ROOT, "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), N_().d(), Integer.valueOf(this.h), (this.m == null) ? "~NULL~" : this.m.g().j(), Double.valueOf(this.q), Double.valueOf(this.r), Double.valueOf(this.s) });
/*      */   }
/*      */   
/*      */   public boolean b(aea ☃) {
/* 2108 */     return (this.aI && ☃ != aea.m && !☃.v());
/*      */   }
/*      */   
/*      */   public boolean bl() {
/* 2112 */     return this.aI;
/*      */   }
/*      */   
/*      */   public void l(boolean ☃) {
/* 2116 */     this.aI = ☃;
/*      */   }
/*      */   
/*      */   public void u(aer ☃) {
/* 2120 */     b(☃.q, ☃.r, ☃.s, ☃.w, ☃.x);
/*      */   }
/*      */   
/*      */   public void v(aer ☃) {
/* 2124 */     gy gy = ☃.e(new gy());
/* 2125 */     gy.r("Dimension");
/* 2126 */     f(gy);
/* 2127 */     this.am = ☃.am;
/* 2128 */     this.aq = ☃.aq;
/* 2129 */     this.ar = ☃.ar;
/* 2130 */     this.as = ☃.as;
/*      */   }
/*      */   @Nullable
/*      */   public aer a(bod ☃) {
/*      */     el el1;
/* 2135 */     if (this.m.B || this.G) {
/* 2136 */       return null;
/*      */     }
/* 2138 */     this.m.A.a("changeDimension");
/*      */     
/* 2140 */     MinecraftServer minecraftServer = bK();
/* 2141 */     bod bod1 = this.ap;
/* 2142 */     td td1 = minecraftServer.a(bod1);
/* 2143 */     td td2 = minecraftServer.a(☃);
/* 2144 */     this.ap = ☃;
/*      */     
/* 2146 */     if (bod1 == bod.c && ☃ == bod.c) {
/* 2147 */       td2 = minecraftServer.a(bod.a);
/* 2148 */       this.ap = bod.a;
/*      */     } 
/*      */     
/* 2151 */     this.m.e(this);
/* 2152 */     this.G = false;
/* 2153 */     this.m.A.a("reposition");
/*      */ 
/*      */     
/* 2156 */     if (☃ == bod.c) {
/* 2157 */       el1 = td2.t();
/*      */     } else {
/* 2159 */       double d1 = this.q;
/* 2160 */       double d2 = this.s;
/* 2161 */       double d3 = 8.0D;
/*      */       
/* 2163 */       if (☃ == bod.b) {
/* 2164 */         d1 = xq.a(d1 / 8.0D, td2.d().b() + 16.0D, td2.d().d() - 16.0D);
/* 2165 */         d2 = xq.a(d2 / 8.0D, td2.d().c() + 16.0D, td2.d().e() - 16.0D);
/* 2166 */       } else if (☃ == bod.a) {
/* 2167 */         d1 = xq.a(d1 * 8.0D, td2.d().b() + 16.0D, td2.d().d() - 16.0D);
/* 2168 */         d2 = xq.a(d2 * 8.0D, td2.d().c() + 16.0D, td2.d().e() - 16.0D);
/*      */       } 
/* 2170 */       d1 = xq.a((int)d1, -29999872, 29999872);
/* 2171 */       d2 = xq.a((int)d2, -29999872, 29999872);
/*      */       
/* 2173 */       float f = this.w;
/* 2174 */       b(d1, this.r, d2, 90.0F, 0.0F);
/* 2175 */       ayk ayk = td2.C();
/* 2176 */       ayk.b(this, f);
/* 2177 */       el1 = new el(this);
/*      */     } 
/*      */     
/* 2180 */     td1.a(this, false);
/*      */     
/* 2182 */     this.m.A.c("reloading");
/* 2183 */     aer aer1 = (aer)P().a(td2);
/*      */     
/* 2185 */     if (aer1 != null) {
/* 2186 */       aer1.v(this);
/*      */       
/* 2188 */       if (bod1 == bod.c && ☃ == bod.c) {
/* 2189 */         el el2 = td2.a(bor.a.e, td2.n());
/* 2190 */         aer1.a(el2, aer1.w, aer1.x);
/*      */       } else {
/* 2192 */         aer1.a(el1, aer1.w, aer1.x);
/*      */       } 
/* 2194 */       boolean bool = aer1.l;
/* 2195 */       aer1.l = true;
/* 2196 */       td2.a(aer1);
/* 2197 */       aer1.l = bool;
/* 2198 */       td2.a(aer1, false);
/*      */     } 
/*      */     
/* 2201 */     this.G = true;
/* 2202 */     this.m.A.e();
/*      */     
/* 2204 */     td1.p();
/* 2205 */     td2.p();
/* 2206 */     this.m.A.e();
/* 2207 */     return aer1;
/*      */   }
/*      */   
/*      */   public boolean bm() {
/* 2211 */     return true;
/*      */   }
/*      */   
/*      */   public float a(axr ☃, axk axk1, el el1, blc blc1, byw byw1, float f) {
/* 2215 */     return f;
/*      */   }
/*      */   
/*      */   public boolean a(axr ☃, axk axk1, el el1, blc blc1, float f) {
/* 2219 */     return true;
/*      */   }
/*      */   
/*      */   public int bn() {
/* 2223 */     return 3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public cee bp() {
/* 2231 */     return this.ar;
/*      */   }
/*      */   
/*      */   public eq bq() {
/* 2235 */     return this.as;
/*      */   }
/*      */   
/*      */   public boolean br() {
/* 2239 */     return false;
/*      */   }
/*      */   
/*      */   public void a(c ☃) {
/* 2243 */     ☃.a("Entity Type", () -> aev.a(P()) + " (" + getClass().getCanonicalName() + ")");
/* 2244 */     ☃.a("Entity ID", Integer.valueOf(this.h));
/* 2245 */     ☃.a("Entity Name", () -> N_().getString());
/* 2246 */     ☃.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.q), Double.valueOf(this.r), Double.valueOf(this.s) }));
/* 2247 */     ☃.a("Entity's Block location", c.a(xq.c(this.q), xq.c(this.r), xq.c(this.s)));
/* 2248 */     ☃.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.t), Double.valueOf(this.u), Double.valueOf(this.v) }));
/* 2249 */     ☃.a("Entity's Passengers", () -> bP().toString());
/* 2250 */     ☃.a("Entity's Vehicle", () -> bU().toString());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(UUID ☃) {
/* 2258 */     this.at = ☃;
/* 2259 */     this.au = this.at.toString();
/*      */   }
/*      */   
/*      */   public UUID bt() {
/* 2263 */     return this.at;
/*      */   }
/*      */   
/*      */   public String bu() {
/* 2267 */     return this.au;
/*      */   }
/*      */   
/*      */   public String bv() {
/* 2271 */     return this.au;
/*      */   }
/*      */   
/*      */   public boolean bw() {
/* 2275 */     return true;
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
/*      */   public ij O() {
/* 2288 */     return cfa.a(be(), N_()).a(☃ -> ☃.a(bC()).a(bu()));
/*      */   }
/*      */   
/*      */   public void b(@Nullable ij ☃) {
/* 2292 */     this.ab.b(aE, Optional.ofNullable(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public ij e() {
/* 2298 */     return ((Optional<ij>)this.ab.<Optional<ij>>a(aE)).orElse(null);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean O_() {
/* 2303 */     return ((Optional)this.ab.<Optional>a((or)aE)).isPresent();
/*      */   }
/*      */   
/*      */   public void m(boolean ☃) {
/* 2307 */     this.ab.b(aF, Boolean.valueOf(☃));
/*      */   }
/*      */   
/*      */   public boolean by() {
/* 2311 */     return ((Boolean)this.ab.<Boolean>a(aF)).booleanValue();
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2) {
/* 2315 */     this.aK = true;
/* 2316 */     b(☃, d1, d2, this.w, this.x);
/* 2317 */     this.m.a(this, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(or<?> ☃) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public eq bA() {
/* 2328 */     return eq.a(this.w);
/*      */   }
/*      */   
/*      */   public eq bB() {
/* 2332 */     return bA();
/*      */   }
/*      */   
/*      */   protected il bC() {
/* 2336 */     gy ☃ = new gy();
/* 2337 */     pc pc = aev.a(P());
/*      */     
/* 2339 */     ☃.a("id", bu());
/* 2340 */     if (pc != null) {
/* 2341 */       ☃.a("type", pc.toString());
/*      */     }
/* 2343 */     ☃.a("name", ij.a.a(N_()));
/*      */     
/* 2345 */     return new il(il.a.c, new iq(☃.toString()));
/*      */   }
/*      */   
/*      */   public boolean a(tf ☃) {
/* 2349 */     return true;
/*      */   }
/*      */   
/*      */   public cea bD() {
/* 2353 */     return this.ay;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cea ☃) {
/* 2361 */     this.ay = ☃;
/*      */   }
/*      */   
/*      */   public float bF() {
/* 2365 */     return this.I * 0.85F;
/*      */   }
/*      */   
/*      */   public boolean bG() {
/* 2369 */     return this.az;
/*      */   }
/*      */   
/*      */   public void n(boolean ☃) {
/* 2373 */     this.az = ☃;
/*      */   }
/*      */   
/*      */   public boolean c(int ☃, ate ate1) {
/* 2377 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ij ☃) {}
/*      */ 
/*      */   
/*      */   public el bH() {
/* 2385 */     return new el(this);
/*      */   }
/*      */   
/*      */   public cee bI() {
/* 2389 */     return new cee(this.q, this.r, this.s);
/*      */   }
/*      */   
/*      */   public axy bJ() {
/* 2393 */     return this.m;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public MinecraftServer bK() {
/* 2398 */     return this.m.z();
/*      */   }
/*      */   
/*      */   public adm a(aog ☃, cee cee1, adk adk1) {
/* 2402 */     return adm.b;
/*      */   }
/*      */   
/*      */   public boolean bL() {
/* 2406 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(afa ☃, aer aer1) {
/* 2410 */     if (aer1 instanceof afa) {
/* 2411 */       awg.a((afa)aer1, ☃);
/*      */     }
/* 2413 */     awg.b(☃, aer1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(tf ☃) {}
/*      */ 
/*      */   
/*      */   public void c(tf ☃) {}
/*      */   
/*      */   public float a(bhb ☃) {
/* 2423 */     float f = xq.g(this.w);
/* 2424 */     switch (null.a[☃.ordinal()]) {
/*      */       case 1:
/* 2426 */         return f + 180.0F;
/*      */       case 2:
/* 2428 */         return f + 270.0F;
/*      */       case 3:
/* 2430 */         return f + 90.0F;
/*      */     } 
/* 2432 */     return f;
/*      */   }
/*      */ 
/*      */   
/*      */   public float a(bfz ☃) {
/* 2437 */     float f = xq.g(this.w);
/* 2438 */     switch (null.b[☃.ordinal()]) {
/*      */       case 1:
/* 2440 */         return -f;
/*      */       case 2:
/* 2442 */         return 180.0F - f;
/*      */     } 
/* 2444 */     return f;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bM() {
/* 2449 */     return false;
/*      */   }
/*      */   
/*      */   public boolean bN() {
/* 2453 */     boolean ☃ = this.aK;
/* 2454 */     this.aK = false;
/* 2455 */     return ☃;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aer bO() {
/* 2460 */     return null;
/*      */   }
/*      */   
/*      */   public List<aer> bP() {
/* 2464 */     if (this.aw.isEmpty()) {
/* 2465 */       return Collections.emptyList();
/*      */     }
/* 2467 */     return Lists.newArrayList(this.aw);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean w(aer ☃) {
/* 2472 */     for (aer aer1 : bP()) {
/* 2473 */       if (aer1.equals(☃)) {
/* 2474 */         return true;
/*      */       }
/*      */     } 
/* 2477 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(Class<? extends aer> ☃) {
/* 2481 */     for (aer aer1 : bP()) {
/* 2482 */       if (☃.isAssignableFrom(aer1.getClass())) {
/* 2483 */         return true;
/*      */       }
/*      */     } 
/* 2486 */     return false;
/*      */   }
/*      */   
/*      */   public Collection<aer> bQ() {
/* 2490 */     Set<aer> ☃ = Sets.newHashSet();
/* 2491 */     for (aer aer1 : bP()) {
/* 2492 */       ☃.add(aer1);
/* 2493 */       aer1.a(false, ☃);
/*      */     } 
/* 2495 */     return ☃;
/*      */   }
/*      */   
/*      */   public boolean bR() {
/* 2499 */     Set<aer> ☃ = Sets.newHashSet();
/* 2500 */     a(true, ☃);
/* 2501 */     return (☃.size() == 1);
/*      */   }
/*      */   
/*      */   private void a(boolean ☃, Set<aer> set) {
/* 2505 */     for (aer aer1 : bP()) {
/*      */       
/* 2507 */       if (!☃ || tf.class.isAssignableFrom(aer1.getClass())) {
/* 2508 */         set.add(aer1);
/*      */       }
/* 2510 */       aer1.a(☃, set);
/*      */     } 
/*      */   }
/*      */   
/*      */   public aer bS() {
/* 2515 */     aer ☃ = this;
/* 2516 */     while (☃.aW()) {
/* 2517 */       ☃ = ☃.bU();
/*      */     }
/* 2519 */     return ☃;
/*      */   }
/*      */   
/*      */   public boolean x(aer ☃) {
/* 2523 */     return (bS() == ☃.bS());
/*      */   }
/*      */   
/*      */   public boolean y(aer ☃) {
/* 2527 */     for (aer aer1 : bP()) {
/* 2528 */       if (aer1.equals(☃)) {
/* 2529 */         return true;
/*      */       }
/* 2531 */       if (aer1.y(☃)) {
/* 2532 */         return true;
/*      */       }
/*      */     } 
/* 2535 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bT() {
/* 2540 */     aer ☃ = bO();
/* 2541 */     if (☃ instanceof aog) {
/* 2542 */       return ((aog)☃).dn();
/*      */     }
/* 2544 */     return !this.m.B;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aer bU() {
/* 2550 */     return this.ax;
/*      */   }
/*      */   
/*      */   public bzc A_() {
/* 2554 */     return bzc.a;
/*      */   }
/*      */   
/*      */   public wk bV() {
/* 2558 */     return wk.g;
/*      */   }
/*      */   
/*      */   protected int bW() {
/* 2562 */     return 1;
/*      */   }
/*      */ 
/*      */   
/*      */   public bu bX() {
/* 2567 */     return new bu(this, new cee(this.q, this.r, this.s), aO(), (this.m instanceof td) ? (td)this.m : null, y(), N_().getString(), O(), this.m.z(), this);
/*      */   }
/*      */   
/*      */   protected int y() {
/* 2571 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean j(int ☃) {
/* 2575 */     return (y() >= ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a() {
/* 2580 */     return this.m.X().b("sendCommandFeedback");
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/* 2585 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean B_() {
/* 2590 */     return true;
/*      */   }
/*      */   
/*      */   public void a(ca.a ☃, cee cee1) {
/* 2594 */     cee cee2 = ☃.a(this);
/* 2595 */     double d1 = cee1.b - cee2.b;
/* 2596 */     double d2 = cee1.c - cee2.c;
/* 2597 */     double d3 = cee1.d - cee2.d;
/* 2598 */     double d4 = xq.a(d1 * d1 + d3 * d3);
/*      */     
/* 2600 */     this.x = xq.g((float)-(xq.c(d2, d4) * 57.2957763671875D));
/* 2601 */     this.w = xq.g((float)(xq.c(d3, d1) * 57.2957763671875D) - 90.0F);
/* 2602 */     j(this.w);
/* 2603 */     this.z = this.x;
/* 2604 */     this.y = this.w;
/*      */   }
/*      */   
/*      */   public boolean b(wz<byv> ☃) {
/* 2608 */     cea cea1 = bD().h(0.001D);
/* 2609 */     int i = xq.c(cea1.a);
/* 2610 */     int j = xq.f(cea1.d);
/* 2611 */     int k = xq.c(cea1.b);
/* 2612 */     int m = xq.f(cea1.e);
/* 2613 */     int n = xq.c(cea1.c);
/* 2614 */     int i1 = xq.f(cea1.f);
/*      */     
/* 2616 */     if (!this.m.a(i, k, n, j, m, i1, true)) {
/* 2617 */       return false;
/*      */     }
/*      */     
/* 2620 */     double d = 0.0D;
/* 2621 */     boolean bool1 = bw();
/*      */     
/* 2623 */     boolean bool2 = false;
/* 2624 */     cee cee1 = cee.a;
/* 2625 */     int i2 = 0;
/* 2626 */     try (el.b ☃ = el.b.r()) {
/* 2627 */       for (int i3 = i; i3 < j; i3++) {
/* 2628 */         for (int i4 = k; i4 < m; i4++) {
/* 2629 */           for (int i5 = n; i5 < i1; i5++) {
/* 2630 */             b.f(i3, i4, i5);
/* 2631 */             byw byw = this.m.b(b);
/* 2632 */             if (byw.a(☃)) {
/* 2633 */               double d1 = (i4 + byw.f());
/* 2634 */               if (d1 >= cea1.b) {
/* 2635 */                 bool2 = true;
/* 2636 */                 d = Math.max(d1 - cea1.b, d);
/* 2637 */                 if (bool1) {
/* 2638 */                   cee cee2 = byw.a(this.m, b);
/* 2639 */                   if (d < 0.4D) {
/* 2640 */                     cee2 = cee2.a(d);
/*      */                   }
/*      */                   
/* 2643 */                   cee1 = cee1.e(cee2);
/* 2644 */                   i2++;
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2653 */     if (cee1.b() > 0.0D) {
/* 2654 */       if (i2 > 0) {
/* 2655 */         cee1 = cee1.a(1.0D / i2);
/*      */       }
/*      */       
/* 2658 */       if (!(this instanceof aog)) {
/* 2659 */         cee1 = cee1.a();
/*      */       }
/*      */       
/* 2662 */       double d1 = 0.014D;
/* 2663 */       this.t += cee1.b * 0.014D;
/* 2664 */       this.u += cee1.c * 0.014D;
/* 2665 */       this.v += cee1.d * 0.014D;
/*      */     } 
/* 2667 */     this.W = d;
/* 2668 */     return bool2;
/*      */   }
/*      */   
/*      */   public double bY() {
/* 2672 */     return this.W;
/*      */   }
/*      */   
/*      */   protected abstract void x_();
/*      */   
/*      */   protected abstract void a(gy paramgy);
/*      */   
/*      */   protected abstract void b(gy paramgy);
/*      */ }


/* Location:              F:\dw\server.jar!\aer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */