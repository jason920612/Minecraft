/*      */ import com.google.common.collect.Lists;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Comparator;
/*      */ import java.util.List;
/*      */ import java.util.UUID;
/*      */ import java.util.function.Predicate;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class aog
/*      */   extends afa
/*      */ {
/*      */   public enum b
/*      */   {
/*  123 */     a(0, "options.chat.visibility.full"),
/*  124 */     b(1, "options.chat.visibility.system"),
/*  125 */     c(2, "options.chat.visibility.hidden"); private static final b[] d;
/*      */     static {
/*  127 */       d = (b[])Arrays.<b>stream(values()).sorted(Comparator.comparingInt(b::a)).toArray(☃ -> new b[☃]);
/*      */     }
/*      */     private final int e; private final String f;
/*      */     
/*      */     b(int ☃, String str1) {
/*  132 */       this.e = ☃;
/*  133 */       this.f = str1;
/*      */     }
/*      */     
/*      */     public int a() {
/*  137 */       return this.e;
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
/*  151 */   private static final or<Float> a = ou.a((Class)aog.class, ot.c);
/*  152 */   private static final or<Integer> b = ou.a((Class)aog.class, ot.b);
/*  153 */   protected static final or<Byte> bx = ou.a((Class)aog.class, ot.a);
/*  154 */   protected static final or<Byte> by = ou.a((Class)aog.class, ot.a);
/*      */   
/*  156 */   protected static final or<gy> bz = ou.a((Class)aog.class, ot.p);
/*  157 */   protected static final or<gy> bA = ou.a((Class)aog.class, ot.p);
/*      */   
/*  159 */   public aof bB = new aof(this);
/*  160 */   protected aqq bC = new aqq();
/*      */   
/*      */   public apv bD;
/*      */   public apv bE;
/*  164 */   protected apt bF = new apt();
/*      */   
/*      */   protected int bG;
/*      */   
/*      */   public float bH;
/*      */   
/*      */   public float bI;
/*      */   
/*      */   public int bJ;
/*      */   
/*      */   public double bK;
/*      */   
/*      */   public double bL;
/*      */   
/*      */   public double bM;
/*      */   
/*      */   public double bN;
/*      */   
/*      */   public double bO;
/*      */   
/*      */   public double bP;
/*      */   protected boolean bQ;
/*      */   public el bR;
/*      */   private int c;
/*      */   public float bS;
/*      */   public float bT;
/*      */   private boolean d;
/*      */   protected boolean bU;
/*      */   private el e;
/*      */   private boolean f;
/*  194 */   public aoe bV = new aoe();
/*      */   
/*      */   public int bW;
/*      */   
/*      */   public int bX;
/*      */   public float bY;
/*      */   protected int bZ;
/*  201 */   protected float ca = 0.02F;
/*      */   
/*      */   private int g;
/*      */   private final GameProfile h;
/*  205 */   private ate cd = ate.a;
/*  206 */   private final atb ce = g();
/*      */   
/*      */   @Nullable
/*      */   public amg cb;
/*      */   
/*      */   public aog(axy ☃, GameProfile gameProfile) {
/*  212 */     super(aev.aO, ☃);
/*  213 */     a(a(gameProfile));
/*      */     
/*  215 */     this.h = gameProfile;
/*      */     
/*  217 */     this.bD = new aqm(this.bB, !☃.B, this);
/*  218 */     this.bE = this.bD;
/*      */     
/*  220 */     el el1 = ☃.n();
/*  221 */     b(el1.o() + 0.5D, (el1.p() + 1), el1.q() + 0.5D, 0.0F, 0.0F);
/*      */     
/*  223 */     this.bd = 180.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bZ() {
/*  228 */     super.bZ();
/*      */     
/*  230 */     cz().b(ank.f).a(1.0D);
/*  231 */     a(ank.d).a(0.10000000149011612D);
/*  232 */     cz().b(ank.g);
/*  233 */     cz().b(ank.j);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void x_() {
/*  238 */     super.x_();
/*      */     
/*  240 */     this.ab.a(a, Float.valueOf(0.0F));
/*  241 */     this.ab.a(b, Integer.valueOf(0));
/*  242 */     this.ab.a(bx, Byte.valueOf((byte)0));
/*  243 */     this.ab.a(by, Byte.valueOf((byte)1));
/*  244 */     this.ab.a(bz, new gy());
/*  245 */     this.ab.a(bA, new gy());
/*      */   }
/*      */ 
/*      */   
/*      */   public void R_() {
/*  250 */     this.R = t();
/*  251 */     if (t()) {
/*  252 */       this.A = false;
/*      */     }
/*      */     
/*  255 */     if (this.bJ > 0) {
/*  256 */       this.bJ--;
/*      */     }
/*  258 */     if (cL()) {
/*  259 */       this.c++;
/*  260 */       if (this.c > 100) {
/*  261 */         this.c = 100;
/*      */       }
/*      */       
/*  264 */       if (!this.m.B) {
/*  265 */         if (!p()) {
/*  266 */           a(true, true, false);
/*  267 */         } else if (this.m.L()) {
/*  268 */           a(false, true, true);
/*      */         } 
/*      */       }
/*  271 */     } else if (this.c > 0) {
/*  272 */       this.c++;
/*  273 */       if (this.c >= 110) {
/*  274 */         this.c = 0;
/*      */       }
/*      */     } 
/*      */     
/*  278 */     n();
/*  279 */     dg();
/*      */     
/*  281 */     super.R_();
/*      */     
/*  283 */     if (!this.m.B && 
/*  284 */       this.bE != null && !this.bE.a(this)) {
/*  285 */       w_();
/*  286 */       this.bE = this.bD;
/*      */     } 
/*      */ 
/*      */     
/*  290 */     if (aV() && this.bV.a) {
/*  291 */       Z();
/*      */     }
/*      */     
/*  294 */     o();
/*      */     
/*  296 */     if (!this.m.B) {
/*  297 */       this.bF.a(this);
/*  298 */       a(ws.k);
/*  299 */       if (aF()) {
/*  300 */         a(ws.l);
/*      */       }
/*  302 */       if (aZ()) {
/*  303 */         a(ws.n);
/*      */       }
/*  305 */       if (!cL()) {
/*  306 */         a(ws.m);
/*      */       }
/*      */     } 
/*      */     
/*  310 */     int ☃ = 29999999;
/*  311 */     double d1 = xq.a(this.q, -2.9999999E7D, 2.9999999E7D);
/*  312 */     double d2 = xq.a(this.s, -2.9999999E7D, 2.9999999E7D);
/*  313 */     if (d1 != this.q || d2 != this.s) {
/*  314 */       b(d1, this.r, d2);
/*      */     }
/*      */     
/*  317 */     this.aH++;
/*      */     
/*  319 */     ate ate1 = cB();
/*  320 */     if (!ate.b(this.cd, ate1)) {
/*      */ 
/*      */ 
/*      */       
/*  324 */       if (!ate.d(this.cd, ate1)) {
/*  325 */         dH();
/*      */       }
/*  327 */       this.cd = ate1.a() ? ate.a : ate1.i();
/*      */     } 
/*      */     
/*  330 */     l();
/*  331 */     this.ce.a();
/*      */     
/*  333 */     dh();
/*      */   }
/*      */   
/*      */   protected boolean dg() {
/*  337 */     this.bU = a(ww.a);
/*  338 */     return this.bU;
/*      */   }
/*      */   
/*      */   private void l() {
/*  342 */     ate ☃ = b(aew.f);
/*  343 */     if (☃.b() == atf.ao && !a(ww.a)) {
/*  344 */       c(new aek(aem.m, 200, 0, false, false, true));
/*      */     }
/*      */   }
/*      */   
/*      */   protected atb g() {
/*  349 */     return new atb();
/*      */   }
/*      */ 
/*      */   
/*      */   private void n() {
/*  354 */     blc ☃ = this.m.a(bD().c(0.0D, -0.4000000059604645D, 0.0D).h(0.001D), bct.B);
/*  355 */     if (☃ != null) {
/*  356 */       if (!this.d && !this.Z && 
/*  357 */         ☃.c() == bct.B && !t()) {
/*  358 */         boolean bool = ((Boolean)☃.c(bcy.a)).booleanValue();
/*  359 */         if (bool) {
/*  360 */           this.m.a(this.q, this.r, this.s, wj.ag, bV(), 1.0F, 1.0F, false);
/*      */         } else {
/*  362 */           this.m.a(this.q, this.r, this.s, wj.ae, bV(), 1.0F, 1.0F, false);
/*      */         } 
/*      */       } 
/*      */       
/*  366 */       this.d = true;
/*      */     } else {
/*  368 */       this.d = false;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void o() {
/*  373 */     this.bK = this.bN;
/*  374 */     this.bL = this.bO;
/*  375 */     this.bM = this.bP;
/*      */     
/*  377 */     double ☃ = this.q - this.bN;
/*  378 */     double d1 = this.r - this.bO;
/*  379 */     double d2 = this.s - this.bP;
/*      */     
/*  381 */     double d3 = 10.0D;
/*  382 */     if (☃ > 10.0D) {
/*  383 */       this.bN = this.q;
/*  384 */       this.bK = this.bN;
/*      */     } 
/*  386 */     if (d2 > 10.0D) {
/*  387 */       this.bP = this.s;
/*  388 */       this.bM = this.bP;
/*      */     } 
/*  390 */     if (d1 > 10.0D) {
/*  391 */       this.bO = this.r;
/*  392 */       this.bL = this.bO;
/*      */     } 
/*  394 */     if (☃ < -10.0D) {
/*  395 */       this.bN = this.q;
/*  396 */       this.bK = this.bN;
/*      */     } 
/*  398 */     if (d2 < -10.0D) {
/*  399 */       this.bP = this.s;
/*  400 */       this.bM = this.bP;
/*      */     } 
/*  402 */     if (d1 < -10.0D) {
/*  403 */       this.bO = this.r;
/*  404 */       this.bL = this.bO;
/*      */     } 
/*      */     
/*  407 */     this.bN += ☃ * 0.25D;
/*  408 */     this.bP += d2 * 0.25D;
/*  409 */     this.bO += d1 * 0.25D;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void dh() {
/*      */     float ☃;
/*      */     float f1;
/*  416 */     if (dc()) {
/*  417 */       ☃ = 0.6F;
/*  418 */       f1 = 0.6F;
/*  419 */     } else if (cL()) {
/*  420 */       ☃ = 0.2F;
/*  421 */       f1 = 0.2F;
/*  422 */     } else if (bb() || cO()) {
/*  423 */       ☃ = 0.6F;
/*  424 */       f1 = 0.6F;
/*  425 */     } else if (aZ()) {
/*  426 */       ☃ = 0.6F;
/*  427 */       f1 = 1.65F;
/*      */     } else {
/*  429 */       ☃ = 0.6F;
/*  430 */       f1 = 1.8F;
/*      */     } 
/*      */     
/*  433 */     if (☃ != this.H || f1 != this.I) {
/*  434 */       cea cea = bD();
/*  435 */       cea = new cea(cea.a, cea.b, cea.c, cea.a + ☃, cea.b + f1, cea.c + ☃);
/*      */       
/*  437 */       if (this.m.c((aer)null, cea)) {
/*  438 */         a(☃, f1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int X() {
/*  445 */     return this.bV.a ? 1 : 80;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi ad() {
/*  450 */     return wj.hc;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi ae() {
/*  455 */     return wj.ha;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi af() {
/*  460 */     return wj.hb;
/*      */   }
/*      */ 
/*      */   
/*      */   public int aQ() {
/*  465 */     return 10;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(wi ☃, float f1, float f2) {
/*  471 */     this.m.a(this, this.q, this.r, this.s, ☃, bV(), f1, f2);
/*      */   }
/*      */ 
/*      */   
/*      */   public wk bV() {
/*  476 */     return wk.h;
/*      */   }
/*      */ 
/*      */   
/*      */   protected int bW() {
/*  481 */     return 20;
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
/*      */   protected boolean cF() {
/*  499 */     return (cq() <= 0.0F || cL());
/*      */   }
/*      */   
/*      */   protected void w_() {
/*  503 */     this.bE = this.bD;
/*      */   }
/*      */ 
/*      */   
/*      */   public void aH() {
/*  508 */     if (!this.m.B && aZ() && aW()) {
/*  509 */       S_();
/*  510 */       e(false);
/*      */       
/*      */       return;
/*      */     } 
/*  514 */     double ☃ = this.q;
/*  515 */     double d1 = this.r;
/*  516 */     double d2 = this.s;
/*  517 */     float f1 = this.w;
/*  518 */     float f2 = this.x;
/*      */     
/*  520 */     super.aH();
/*  521 */     this.bH = this.bI;
/*  522 */     this.bI = 0.0F;
/*      */     
/*  524 */     l(this.q - ☃, this.r - d1, this.s - d2);
/*      */     
/*  526 */     if (bU() instanceof aka) {
/*  527 */       this.x = f2;
/*  528 */       this.w = f1;
/*  529 */       this.aQ = ((aka)bU()).aQ;
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
/*      */   protected void cM() {
/*  543 */     super.cM();
/*  544 */     cy();
/*      */     
/*  546 */     this.aS = this.w;
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {
/*  551 */     if (this.bG > 0) {
/*  552 */       this.bG--;
/*      */     }
/*      */     
/*  555 */     if (this.m.aj() == adi.a && this.m.X().b("naturalRegeneration")) {
/*  556 */       if (cq() < cw() && 
/*  557 */         this.U % 20 == 0) {
/*  558 */         c(1.0F);
/*      */       }
/*      */       
/*  561 */       if (this.bF.c() && 
/*  562 */         this.U % 10 == 0) {
/*  563 */         this.bF.a(this.bF.a() + 1);
/*      */       }
/*      */     } 
/*      */     
/*  567 */     this.bB.p();
/*  568 */     this.bH = this.bI;
/*      */     
/*  570 */     super.k();
/*      */     
/*  572 */     afn ☃ = a(ank.d);
/*  573 */     if (!this.m.B) {
/*  574 */       ☃.a(this.bV.b());
/*      */     }
/*  576 */     this.aU = this.ca;
/*  577 */     if (ba()) {
/*  578 */       this.aU = (float)(this.aU + this.ca * 0.3D);
/*      */     }
/*      */     
/*  581 */     o((float)☃.e());
/*      */     
/*  583 */     float f1 = xq.a(this.t * this.t + this.v * this.v);
/*  584 */     float f2 = (float)(Math.atan(-this.u * 0.20000000298023224D) * 15.0D);
/*  585 */     if (f1 > 0.1F) {
/*  586 */       f1 = 0.1F;
/*      */     }
/*  588 */     if (!this.A || cq() <= 0.0F || bb()) {
/*  589 */       f1 = 0.0F;
/*      */     }
/*  591 */     if (this.A || cq() <= 0.0F) {
/*  592 */       f2 = 0.0F;
/*      */     }
/*  594 */     this.bI += (f1 - this.bI) * 0.4F;
/*  595 */     this.aN += (f2 - this.aN) * 0.8F;
/*      */     
/*  597 */     if (cq() > 0.0F && !t()) {
/*      */       cea cea;
/*  599 */       if (aW() && !(bU()).G) {
/*      */         
/*  601 */         cea = bD().b(bU().bD()).c(1.0D, 0.0D, 1.0D);
/*      */       } else {
/*  603 */         cea = bD().c(1.0D, 0.5D, 1.0D);
/*      */       } 
/*      */       
/*  606 */       List<aer> list = this.m.a(this, cea);
/*  607 */       for (int i = 0; i < list.size(); i++) {
/*  608 */         aer aer = list.get(i);
/*  609 */         if (!aer.G) {
/*  610 */           c(aer);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  615 */     j(dE());
/*  616 */     j(dF());
/*  617 */     if ((!this.m.B && (this.M > 0.5F || an() || aW())) || this.bV.b) {
/*  618 */       dA();
/*      */     }
/*      */   }
/*      */   
/*      */   private void j(@Nullable gy ☃) {
/*  623 */     if ((☃ != null && !☃.e("Silent")) || !☃.q("Silent")) {
/*  624 */       String str = ☃.l("id");
/*  625 */       if (aev.a(str) == aev.Y) {
/*  626 */         ajz.a(this.m, this);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void c(aer ☃) {
/*  632 */     ☃.d(this);
/*      */   }
/*      */   
/*      */   public int di() {
/*  636 */     return ((Integer)this.ab.<Integer>a(b)).intValue();
/*      */   }
/*      */   
/*      */   public void p(int ☃) {
/*  640 */     this.ab.b(b, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public void q(int ☃) {
/*  644 */     int i = di();
/*  645 */     this.ab.b(b, Integer.valueOf(i + ☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aea ☃) {
/*  650 */     super.a(☃);
/*  651 */     a(0.2F, 0.2F);
/*  652 */     b(this.q, this.r, this.s);
/*  653 */     this.u = 0.10000000149011612D;
/*      */     
/*  655 */     if ("Notch".equals(N_().getString())) {
/*  656 */       a(new ate(atf.f), true, false);
/*      */     }
/*  658 */     if (!this.m.X().b("keepInventory") && !t()) {
/*  659 */       dj();
/*  660 */       this.bB.q();
/*      */     } 
/*      */     
/*  663 */     if (☃ != null) {
/*  664 */       this.t = (-xq.b((this.aD + this.w) * 0.017453292F) * 0.1F);
/*  665 */       this.v = (-xq.a((this.aD + this.w) * 0.017453292F) * 0.1F);
/*      */     } else {
/*  667 */       this.t = 0.0D;
/*  668 */       this.v = 0.0D;
/*      */     } 
/*      */     
/*  671 */     a(ws.L);
/*  672 */     a(ws.i.b(ws.l));
/*  673 */     a(ws.i.b(ws.m));
/*  674 */     Z();
/*  675 */     b(0, false);
/*      */   }
/*      */   
/*      */   protected void dj() {
/*  679 */     for (int ☃ = 0; ☃ < this.bB.T_(); ☃++) {
/*  680 */       ate ate1 = this.bB.a(☃);
/*  681 */       if (!ate1.a() && awg.e(ate1)) {
/*  682 */         this.bB.b(☃);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi d(aea ☃) {
/*  689 */     if (☃ == aea.c) {
/*  690 */       return wj.gX;
/*      */     }
/*  692 */     if (☃ == aea.h) {
/*  693 */       return wj.gW;
/*      */     }
/*  695 */     return wj.gV;
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi cs() {
/*  700 */     return wj.gU;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a(boolean ☃) {
/*  705 */     return a(this.bB.a(this.bB.d, (☃ && !this.bB.i().a()) ? this.bB.i().C() : 1), false, true);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a(ate ☃, boolean bool) {
/*  710 */     return a(☃, false, bool);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public amm a(ate ☃, boolean bool1, boolean bool2) {
/*  715 */     if (☃.a()) {
/*  716 */       return null;
/*      */     }
/*      */     
/*  719 */     double d = this.r - 0.30000001192092896D + bF();
/*  720 */     amm amm = new amm(this.m, this.q, d, this.s, ☃);
/*  721 */     amm.a(40);
/*      */     
/*  723 */     if (bool2) {
/*  724 */       amm.c(bt());
/*      */     }
/*      */     
/*  727 */     if (bool1) {
/*  728 */       float f1 = this.T.nextFloat() * 0.5F;
/*  729 */       float f2 = this.T.nextFloat() * 6.2831855F;
/*  730 */       amm.t = (-xq.a(f2) * f1);
/*  731 */       amm.v = (xq.b(f2) * f1);
/*  732 */       amm.u = 0.20000000298023224D;
/*      */     } else {
/*  734 */       float f1 = 0.3F;
/*  735 */       amm.t = (-xq.a(this.w * 0.017453292F) * xq.b(this.x * 0.017453292F) * f1);
/*  736 */       amm.v = (xq.b(this.w * 0.017453292F) * xq.b(this.x * 0.017453292F) * f1);
/*  737 */       amm.u = (-xq.a(this.x * 0.017453292F) * f1 + 0.1F);
/*      */       
/*  739 */       float f2 = this.T.nextFloat() * 6.2831855F;
/*  740 */       f1 = 0.02F * this.T.nextFloat();
/*  741 */       amm.t += Math.cos(f2) * f1;
/*  742 */       amm.u += ((this.T.nextFloat() - this.T.nextFloat()) * 0.1F);
/*  743 */       amm.v += Math.sin(f2) * f1;
/*      */     } 
/*      */     
/*  746 */     ate ate1 = a(amm);
/*  747 */     if (bool2) {
/*  748 */       if (!ate1.a()) {
/*  749 */         a(ws.f.b(ate1.b()), ☃.C());
/*      */       }
/*  751 */       a(ws.D);
/*      */     } 
/*      */     
/*  754 */     return amm;
/*      */   }
/*      */   
/*      */   protected ate a(amm ☃) {
/*  758 */     this.m.a(☃);
/*  759 */     return ☃.i();
/*      */   }
/*      */   
/*      */   public float b(blc ☃) {
/*  763 */     float f = this.bB.a(☃);
/*  764 */     if (f > 1.0F) {
/*  765 */       int i = awg.f(this);
/*  766 */       ate ate1 = cB();
/*      */       
/*  768 */       if (i > 0 && !ate1.a()) {
/*  769 */         f += (i * i + 1);
/*      */       }
/*      */     } 
/*      */     
/*  773 */     if (ael.a(this)) {
/*  774 */       f *= 1.0F + (ael.b(this) + 1) * 0.2F;
/*      */     }
/*  776 */     if (a(aem.d)) {
/*      */       float f1;
/*      */ 
/*      */       
/*  780 */       switch (b(aem.d).c()) {
/*      */         case 0:
/*  782 */           f1 = 0.3F;
/*      */           break;
/*      */         case 1:
/*  785 */           f1 = 0.09F;
/*      */           break;
/*      */         case 2:
/*  788 */           f1 = 0.0027F;
/*      */           break;
/*      */         
/*      */         default:
/*  792 */           f1 = 8.1E-4F;
/*      */           break;
/*      */       } 
/*  795 */       f *= f1;
/*      */     } 
/*      */     
/*  798 */     if (a(ww.a) && !awg.h(this)) {
/*  799 */       f /= 5.0F;
/*      */     }
/*  801 */     if (!this.A) {
/*  802 */       f /= 5.0F;
/*      */     }
/*      */     
/*  805 */     return f;
/*      */   }
/*      */   
/*      */   public boolean c(blc ☃) {
/*  809 */     return (☃.d().g() || this.bB.b(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(gy ☃) {
/*  814 */     super.a(☃);
/*      */     
/*  816 */     a(a(this.h));
/*  817 */     he he = ☃.d("Inventory", 10);
/*  818 */     this.bB.b(he);
/*  819 */     this.bB.d = ☃.h("SelectedItemSlot");
/*  820 */     this.bQ = ☃.q("Sleeping");
/*  821 */     this.c = ☃.g("SleepTimer");
/*      */     
/*  823 */     this.bY = ☃.j("XpP");
/*  824 */     this.bW = ☃.h("XpLevel");
/*  825 */     this.bX = ☃.h("XpTotal");
/*  826 */     this.bZ = ☃.h("XpSeed");
/*  827 */     if (this.bZ == 0) {
/*  828 */       this.bZ = this.T.nextInt();
/*      */     }
/*  830 */     p(☃.h("Score"));
/*      */     
/*  832 */     if (this.bQ) {
/*  833 */       this.bR = new el(this);
/*  834 */       a(true, true, false);
/*      */     } 
/*      */     
/*  837 */     if (☃.c("SpawnX", 99) && ☃.c("SpawnY", 99) && ☃.c("SpawnZ", 99)) {
/*  838 */       this.e = new el(☃.h("SpawnX"), ☃.h("SpawnY"), ☃.h("SpawnZ"));
/*  839 */       this.f = ☃.q("SpawnForced");
/*      */     } 
/*      */     
/*  842 */     this.bF.a(☃);
/*  843 */     this.bV.b(☃);
/*      */     
/*  845 */     if (☃.c("EnderItems", 9)) {
/*  846 */       this.bC.a(☃.d("EnderItems", 10));
/*      */     }
/*      */     
/*  849 */     if (☃.c("ShoulderEntityLeft", 10)) {
/*  850 */       h(☃.p("ShoulderEntityLeft"));
/*      */     }
/*  852 */     if (☃.c("ShoulderEntityRight", 10)) {
/*  853 */       i(☃.p("ShoulderEntityRight"));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(gy ☃) {
/*  859 */     super.b(☃);
/*  860 */     ☃.b("DataVersion", 1631);
/*  861 */     ☃.a("Inventory", this.bB.a(new he()));
/*  862 */     ☃.b("SelectedItemSlot", this.bB.d);
/*  863 */     ☃.a("Sleeping", this.bQ);
/*  864 */     ☃.a("SleepTimer", (short)this.c);
/*  865 */     ☃.a("XpP", this.bY);
/*  866 */     ☃.b("XpLevel", this.bW);
/*  867 */     ☃.b("XpTotal", this.bX);
/*  868 */     ☃.b("XpSeed", this.bZ);
/*  869 */     ☃.b("Score", di());
/*      */     
/*  871 */     if (this.e != null) {
/*  872 */       ☃.b("SpawnX", this.e.o());
/*  873 */       ☃.b("SpawnY", this.e.p());
/*  874 */       ☃.b("SpawnZ", this.e.q());
/*  875 */       ☃.a("SpawnForced", this.f);
/*      */     } 
/*      */     
/*  878 */     this.bF.b(☃);
/*  879 */     this.bV.a(☃);
/*  880 */     ☃.a("EnderItems", this.bC.i());
/*      */     
/*  882 */     if (!dE().isEmpty()) {
/*  883 */       ☃.a("ShoulderEntityLeft", dE());
/*      */     }
/*  885 */     if (!dF().isEmpty()) {
/*  886 */       ☃.a("ShoulderEntityRight", dF());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aea ☃, float f) {
/*  892 */     if (b(☃)) {
/*  893 */       return false;
/*      */     }
/*  895 */     if (this.bV.a && !☃.h()) {
/*  896 */       return false;
/*      */     }
/*      */     
/*  899 */     this.aY = 0;
/*  900 */     if (cq() <= 0.0F) {
/*  901 */       return false;
/*      */     }
/*      */     
/*  904 */     if (cL() && !this.m.B) {
/*  905 */       a(true, true, false);
/*      */     }
/*      */     
/*  908 */     dA();
/*      */     
/*  910 */     if (☃.s()) {
/*  911 */       if (this.m.aj() == adi.a) {
/*  912 */         f = 0.0F;
/*      */       }
/*  914 */       if (this.m.aj() == adi.b) {
/*  915 */         f = Math.min(f / 2.0F + 1.0F, f);
/*      */       }
/*  917 */       if (this.m.aj() == adi.d) {
/*  918 */         f = f * 3.0F / 2.0F;
/*      */       }
/*      */     } 
/*      */     
/*  922 */     if (f == 0.0F) {
/*  923 */       return false;
/*      */     }
/*      */     
/*  926 */     return super.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(afa ☃) {
/*  931 */     super.c(☃);
/*      */     
/*  933 */     if (☃.cB().b() instanceof arg) {
/*  934 */       p(true);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(aog ☃) {
/*  939 */     cfe cfe1 = be();
/*  940 */     cfe cfe2 = ☃.be();
/*      */     
/*  942 */     if (cfe1 == null) {
/*  943 */       return true;
/*      */     }
/*  945 */     if (!cfe1.a(cfe2)) {
/*  946 */       return true;
/*      */     }
/*  948 */     return cfe1.h();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void m(float ☃) {
/*  953 */     this.bB.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void n(float ☃) {
/*  958 */     if (☃ >= 3.0F && this.bt.b() == atf.eK) {
/*  959 */       int i = 1 + xq.d(☃);
/*  960 */       this.bt.a(i, this);
/*  961 */       if (this.bt.a()) {
/*      */         
/*  963 */         adk adk = cU();
/*  964 */         if (adk == adk.a) {
/*  965 */           a(aew.a, ate.a);
/*      */         } else {
/*  967 */           a(aew.b, ate.a);
/*      */         } 
/*  969 */         this.bt = ate.a;
/*  970 */         a(wj.ib, 0.8F, 0.8F + this.m.s.nextFloat() * 0.4F);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public float dk() {
/*  976 */     int ☃ = 0;
/*  977 */     for (ate ate1 : this.bB.b) {
/*  978 */       if (!ate1.a()) {
/*  979 */         ☃++;
/*      */       }
/*      */     } 
/*  982 */     return ☃ / this.bB.b.size();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void d(aea ☃, float f) {
/*  987 */     if (b(☃)) {
/*      */       return;
/*      */     }
/*  990 */     f = b(☃, f);
/*  991 */     f = c(☃, f);
/*      */     
/*  993 */     float f1 = f;
/*  994 */     f = Math.max(f - cQ(), 0.0F);
/*  995 */     q(cQ() - f1 - f);
/*      */     
/*  997 */     float f2 = f1 - f;
/*  998 */     if (f2 > 0.0F && f2 < 3.4028235E37F) {
/*  999 */       a(ws.J, Math.round(f2 * 10.0F));
/*      */     }
/*      */     
/* 1002 */     if (f == 0.0F) {
/*      */       return;
/*      */     }
/*      */     
/* 1006 */     a(☃.g());
/* 1007 */     float f3 = cq();
/* 1008 */     l(cq() - f);
/* 1009 */     cu().a(☃, f3, f);
/* 1010 */     if (f < 3.4028235E37F) {
/* 1011 */       a(ws.H, Math.round(f * 10.0F));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bkc ☃) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(axh ☃) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bjm ☃) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bkf ☃) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(axd ☃) {}
/*      */ 
/*      */   
/*      */   public void a(ade ☃) {}
/*      */ 
/*      */   
/*      */   public void a(ako ☃, ade ade1) {}
/*      */ 
/*      */   
/*      */   public void a(adl ☃) {}
/*      */ 
/*      */   
/*      */   public void a(ate ☃, adk adk1) {}
/*      */ 
/*      */   
/*      */   public adm a(aer ☃, adk adk1) {
/* 1049 */     if (t()) {
/* 1050 */       if (☃ instanceof ade) {
/* 1051 */         a((ade)☃);
/*      */       }
/* 1053 */       return adm.b;
/*      */     } 
/*      */     
/* 1056 */     ate ate1 = b(adk1);
/*      */     
/* 1058 */     ate ate2 = ate1.a() ? ate.a : ate1.i();
/* 1059 */     if (☃.b(this, adk1)) {
/* 1060 */       if (this.bV.d && ate1 == b(adk1) && ate1.C() < ate2.C()) {
/* 1061 */         ate1.e(ate2.C());
/*      */       }
/* 1063 */       return adm.a;
/*      */     } 
/*      */     
/* 1066 */     if (!ate1.a() && ☃ instanceof afa) {
/*      */       
/* 1068 */       if (this.bV.d) {
/* 1069 */         ate1 = ate2;
/*      */       }
/* 1071 */       if (ate1.a(this, (afa)☃, adk1)) {
/*      */         
/* 1073 */         if (ate1.a() && !this.bV.d) {
/* 1074 */           a(adk1, ate.a);
/*      */         }
/* 1076 */         return adm.a;
/*      */       } 
/*      */     } 
/* 1079 */     return adm.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public double aI() {
/* 1084 */     return -0.35D;
/*      */   }
/*      */ 
/*      */   
/*      */   public void S_() {
/* 1089 */     super.S_();
/*      */ 
/*      */     
/* 1092 */     this.k = 0;
/*      */   }
/*      */   public void f(aer ☃) {
/*      */     float f2;
/* 1096 */     if (!☃.bk()) {
/*      */       return;
/*      */     }
/* 1099 */     if (☃.t(this)) {
/*      */       return;
/*      */     }
/*      */     
/* 1103 */     float f1 = (float)a(ank.f).e();
/*      */ 
/*      */     
/* 1106 */     if (☃ instanceof afa) {
/* 1107 */       f2 = awg.a(cB(), ((afa)☃).cA());
/*      */     } else {
/* 1109 */       f2 = awg.a(cB(), afd.a);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1114 */     float f3 = r(0.5F);
/* 1115 */     f1 *= 0.2F + f3 * f3 * 0.8F;
/* 1116 */     f2 *= f3;
/*      */     
/* 1118 */     dH();
/*      */     
/* 1120 */     if (f1 > 0.0F || f2 > 0.0F) {
/* 1121 */       boolean bool1 = (f3 > 0.9F);
/*      */       
/* 1123 */       boolean bool2 = false;
/* 1124 */       int i = 0;
/* 1125 */       i += awg.b(this);
/*      */       
/* 1127 */       if (ba() && bool1) {
/* 1128 */         this.m.a((aog)null, this.q, this.r, this.s, wj.gM, bV(), 1.0F, 1.0F);
/* 1129 */         i++;
/* 1130 */         bool2 = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1135 */       boolean bool3 = (bool1 && this.M > 0.0F && !this.A && !z_() && !an() && !a(aem.o) && !aW() && ☃ instanceof afa);
/*      */       
/* 1137 */       bool3 = (bool3 && !ba());
/* 1138 */       if (bool3) {
/* 1139 */         f1 *= 1.5F;
/*      */       }
/* 1141 */       f1 += f2;
/*      */       
/* 1143 */       boolean bool4 = false;
/*      */ 
/*      */       
/* 1146 */       double d1 = (this.K - this.J);
/* 1147 */       if (bool1 && !bool3 && !bool2 && this.A && d1 < cK()) {
/*      */         
/* 1149 */         ate ate1 = b(adk.a);
/* 1150 */         if (ate1.b() instanceof auh) {
/* 1151 */           bool4 = true;
/*      */         }
/*      */       } 
/*      */       
/* 1155 */       float f = 0.0F;
/* 1156 */       boolean bool5 = false;
/* 1157 */       int j = awg.c(this);
/*      */       
/* 1159 */       if (☃ instanceof afa) {
/* 1160 */         f = ((afa)☃).cq();
/*      */ 
/*      */         
/* 1163 */         if (j > 0 && !☃.aV()) {
/* 1164 */           bool5 = true;
/* 1165 */           ☃.f(1);
/*      */         } 
/*      */       } 
/*      */       
/* 1169 */       double d2 = ☃.t;
/* 1170 */       double d3 = ☃.u;
/* 1171 */       double d4 = ☃.v;
/*      */       
/* 1173 */       boolean bool6 = ☃.a(aea.a(this), f1);
/* 1174 */       if (bool6) {
/* 1175 */         if (i > 0) {
/* 1176 */           if (☃ instanceof afa) {
/* 1177 */             ((afa)☃).a(this, i * 0.5F, xq.a(this.w * 0.017453292F), -xq.b(this.w * 0.017453292F));
/*      */           } else {
/* 1179 */             ☃.f((-xq.a(this.w * 0.017453292F) * i * 0.5F), 0.1D, (xq.b(this.w * 0.017453292F) * i * 0.5F));
/*      */           } 
/* 1181 */           this.t *= 0.6D;
/* 1182 */           this.v *= 0.6D;
/* 1183 */           f(false);
/*      */         } 
/* 1185 */         if (bool4) {
/* 1186 */           float f4 = 1.0F + awg.a(this) * f1;
/* 1187 */           List<afa> list = this.m.a(afa.class, ☃.bD().c(1.0D, 0.25D, 1.0D));
/* 1188 */           for (afa afa1 : list) {
/* 1189 */             if (afa1 == this || afa1 == ☃ || r(afa1)) {
/*      */               continue;
/*      */             }
/*      */             
/* 1193 */             if (afa1 instanceof alz && ((alz)afa1).p()) {
/*      */               continue;
/*      */             }
/*      */             
/* 1197 */             if (h(afa1) < 9.0D) {
/* 1198 */               afa1.a(this, 0.4F, xq.a(this.w * 0.017453292F), -xq.b(this.w * 0.017453292F));
/* 1199 */               afa1.a(aea.a(this), f4);
/*      */             } 
/*      */           } 
/* 1202 */           this.m.a((aog)null, this.q, this.r, this.s, wj.gP, bV(), 1.0F, 1.0F);
/* 1203 */           dl();
/*      */         } 
/*      */         
/* 1206 */         if (☃ instanceof tf && ☃.E) {
/* 1207 */           ((tf)☃).a.a(new li(☃));
/* 1208 */           ☃.E = false;
/* 1209 */           ☃.t = d2;
/* 1210 */           ☃.u = d3;
/* 1211 */           ☃.v = d4;
/*      */         } 
/*      */         
/* 1214 */         if (bool3) {
/* 1215 */           this.m.a((aog)null, this.q, this.r, this.s, wj.gL, bV(), 1.0F, 1.0F);
/* 1216 */           a(☃);
/*      */         } 
/*      */         
/* 1219 */         if (!bool3 && !bool4) {
/* 1220 */           if (bool1) {
/* 1221 */             this.m.a((aog)null, this.q, this.r, this.s, wj.gO, bV(), 1.0F, 1.0F);
/*      */           } else {
/* 1223 */             this.m.a((aog)null, this.q, this.r, this.s, wj.gQ, bV(), 1.0F, 1.0F);
/*      */           } 
/*      */         }
/*      */         
/* 1227 */         if (f2 > 0.0F) {
/* 1228 */           b(☃);
/*      */         }
/*      */         
/* 1231 */         z(☃);
/*      */         
/* 1233 */         if (☃ instanceof afa) {
/* 1234 */           awg.a((afa)☃, this);
/*      */         }
/* 1236 */         awg.b(this, ☃);
/*      */         
/* 1238 */         ate ate1 = cB();
/* 1239 */         aer aer1 = ☃;
/* 1240 */         if (☃ instanceof alb) {
/* 1241 */           ala ala = ((alb)☃).a;
/* 1242 */           if (ala instanceof afa) {
/* 1243 */             aer1 = (afa)ala;
/*      */           }
/*      */         } 
/* 1246 */         if (!ate1.a() && aer1 instanceof afa) {
/* 1247 */           ate1.a((afa)aer1, this);
/*      */ 
/*      */           
/* 1250 */           if (ate1.a()) {
/* 1251 */             a(adk.a, ate.a);
/*      */           }
/*      */         } 
/* 1254 */         if (☃ instanceof afa) {
/* 1255 */           float f4 = f - ((afa)☃).cq();
/*      */           
/* 1257 */           a(ws.E, Math.round(f4 * 10.0F));
/*      */           
/* 1259 */           if (j > 0) {
/* 1260 */             ☃.f(j * 4);
/*      */           }
/*      */ 
/*      */           
/* 1264 */           if (this.m instanceof td && f4 > 2.0F) {
/* 1265 */             int k = (int)(f4 * 0.5D);
/* 1266 */             ((td)this.m).a(fm.i, ☃.q, ☃.r + (☃.I * 0.5F), ☃.s, k, 0.1D, 0.0D, 0.1D, 0.2D);
/*      */           } 
/*      */         } 
/*      */         
/* 1270 */         a(0.1F);
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/* 1276 */         this.m.a((aog)null, this.q, this.r, this.s, wj.gN, bV(), 1.0F, 1.0F);
/*      */         
/* 1278 */         if (bool5) {
/* 1279 */           ☃.Z();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void d(afa ☃) {
/* 1287 */     f(☃);
/*      */   }
/*      */   
/*      */   public void p(boolean ☃) {
/* 1291 */     float f = 0.25F + awg.f(this) * 0.05F;
/*      */     
/* 1293 */     if (☃) {
/* 1294 */       f += 0.75F;
/*      */     }
/*      */     
/* 1297 */     if (this.T.nextFloat() < f) {
/* 1298 */       dI().a(atf.eK, 100);
/* 1299 */       da();
/* 1300 */       this.m.a(this, (byte)30);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aer ☃) {}
/*      */ 
/*      */   
/*      */   public void b(aer ☃) {}
/*      */ 
/*      */   
/*      */   public void dl() {
/* 1312 */     double ☃ = -xq.a(this.w * 0.017453292F);
/* 1313 */     double d1 = xq.b(this.w * 0.017453292F);
/* 1314 */     if (this.m instanceof td) {
/* 1315 */       ((td)this.m).a(fm.O, this.q + ☃, this.r + this.I * 0.5D, this.s + d1, 0, ☃, 0.0D, d1, 0.0D);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void V() {
/* 1324 */     super.V();
/* 1325 */     this.bD.b(this);
/* 1326 */     if (this.bE != null) {
/* 1327 */       this.bE.b(this);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aG() {
/* 1333 */     return (!this.bQ && super.aG());
/*      */   }
/*      */   
/*      */   public boolean dn() {
/* 1337 */     return false;
/*      */   }
/*      */   
/*      */   public GameProfile do() {
/* 1341 */     return this.h;
/*      */   }
/*      */   
/*      */   public enum a {
/* 1345 */     a,
/* 1346 */     b,
/* 1347 */     c,
/* 1348 */     d,
/* 1349 */     e,
/* 1350 */     f;
/*      */   }
/*      */   
/*      */   public a a(el ☃) {
/* 1354 */     eq eq = (eq)this.m.a_(☃).c(bfi.D);
/*      */     
/* 1356 */     if (!this.m.B) {
/* 1357 */       if (cL() || !aF()) {
/* 1358 */         return a.e;
/*      */       }
/*      */       
/* 1361 */       if (!this.m.t.o())
/*      */       {
/* 1363 */         return a.b;
/*      */       }
/* 1365 */       if (this.m.L())
/*      */       {
/* 1367 */         return a.c;
/*      */       }
/*      */       
/* 1370 */       if (!a(☃, eq)) {
/* 1371 */         return a.d;
/*      */       }
/*      */       
/* 1374 */       if (!u()) {
/* 1375 */         double d1 = 8.0D;
/* 1376 */         double d2 = 5.0D;
/* 1377 */         List<ang> list = this.m.a(ang.class, new cea(☃.o() - 8.0D, ☃.p() - 5.0D, ☃.q() - 8.0D, ☃.o() + 8.0D, ☃.p() + 5.0D, ☃.q() + 8.0D), new c(this));
/* 1378 */         if (!list.isEmpty()) {
/* 1379 */           return a.f;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1384 */     if (aW()) {
/* 1385 */       S_();
/*      */     }
/*      */     
/* 1388 */     dA();
/* 1389 */     a(ws.i.b(ws.m));
/*      */     
/* 1391 */     a(0.2F, 0.2F);
/* 1392 */     if (this.m.D(☃)) {
/* 1393 */       float f1 = 0.5F + eq.g() * 0.4F;
/* 1394 */       float f2 = 0.5F + eq.i() * 0.4F;
/*      */       
/* 1396 */       a(eq);
/* 1397 */       b((☃.o() + f1), (☃.p() + 0.6875F), (☃.q() + f2));
/*      */     } else {
/* 1399 */       b((☃.o() + 0.5F), (☃.p() + 0.6875F), (☃.q() + 0.5F));
/*      */     } 
/* 1401 */     this.bQ = true;
/* 1402 */     this.c = 0;
/* 1403 */     this.bR = ☃;
/* 1404 */     this.t = 0.0D;
/* 1405 */     this.u = 0.0D;
/* 1406 */     this.v = 0.0D;
/*      */     
/* 1408 */     if (!this.m.B) {
/* 1409 */       this.m.k_();
/*      */     }
/*      */     
/* 1412 */     return a.a;
/*      */   }
/*      */   
/*      */   private boolean a(el ☃, eq eq1) {
/* 1416 */     if (Math.abs(this.q - ☃.o()) <= 3.0D && Math.abs(this.r - ☃.p()) <= 2.0D && Math.abs(this.s - ☃.q()) <= 3.0D) {
/* 1417 */       return true;
/*      */     }
/* 1419 */     el el1 = ☃.a(eq1.d());
/* 1420 */     return (Math.abs(this.q - el1.o()) <= 3.0D && Math.abs(this.r - el1.p()) <= 2.0D && Math.abs(this.s - el1.q()) <= 3.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(eq ☃) {
/* 1425 */     this.bS = -1.8F * ☃.g();
/* 1426 */     this.bT = -1.8F * ☃.i();
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
/*      */   public void a(boolean ☃, boolean bool1, boolean bool2) {
/* 1438 */     a(0.6F, 1.8F);
/*      */     
/* 1440 */     blc blc = this.m.a_(this.bR);
/*      */ 
/*      */     
/* 1443 */     if (this.bR != null && blc.c() instanceof bcq) {
/* 1444 */       this.m.a(this.bR, blc.a(bcq.b, Boolean.valueOf(false)), 4);
/*      */       
/* 1446 */       el el1 = bcq.a(this.m, this.bR, 0);
/* 1447 */       if (el1 == null) {
/* 1448 */         el1 = this.bR.a();
/*      */       }
/* 1450 */       b((el1.o() + 0.5F), (el1.p() + 0.1F), (el1.q() + 0.5F));
/*      */     } 
/*      */     
/* 1453 */     this.bQ = false;
/* 1454 */     if (!this.m.B && bool1) {
/* 1455 */       this.m.k_();
/*      */     }
/*      */     
/* 1458 */     this.c = ☃ ? 0 : 100;
/*      */     
/* 1460 */     if (bool2) {
/* 1461 */       b(this.bR, false);
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean p() {
/* 1466 */     return this.m.a_(this.bR).c() instanceof bcq;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public static el a(axk ☃, el el1, boolean bool) {
/* 1472 */     bcs bcs = ☃.a_(el1).c();
/* 1473 */     if (!(bcs instanceof bcq)) {
/* 1474 */       if (!bool) {
/* 1475 */         return null;
/*      */       }
/*      */       
/* 1478 */       boolean bool1 = bcs.a();
/* 1479 */       boolean bool2 = ☃.a_(el1.a()).c().a();
/*      */       
/* 1481 */       if (bool1 && bool2) {
/* 1482 */         return el1;
/*      */       }
/*      */       
/* 1485 */       return null;
/*      */     } 
/*      */ 
/*      */     
/* 1489 */     return bcq.a(☃, el1, 0);
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
/*      */   public boolean cL() {
/* 1511 */     return this.bQ;
/*      */   }
/*      */   
/*      */   public boolean dq() {
/* 1515 */     return (this.bQ && this.c >= 100);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ij ☃, boolean bool) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public el ds() {
/* 1534 */     return this.e;
/*      */   }
/*      */   
/*      */   public boolean dt() {
/* 1538 */     return this.f;
/*      */   }
/*      */   
/*      */   public void b(el ☃, boolean bool) {
/* 1542 */     if (☃ != null) {
/* 1543 */       this.e = ☃;
/* 1544 */       this.f = bool;
/*      */     } else {
/* 1546 */       this.e = null;
/* 1547 */       this.f = false;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(pc ☃) {
/* 1552 */     b(ws.i.b(☃));
/*      */   }
/*      */   
/*      */   public void a(pc ☃, int i) {
/* 1556 */     a(ws.i.b(☃), i);
/*      */   }
/*      */   
/*      */   public void b(wp<?> ☃) {
/* 1560 */     a(☃, 1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(wp<?> ☃, int i) {}
/*      */ 
/*      */   
/*      */   public void a(wp<?> ☃) {}
/*      */   
/*      */   public int a(Collection<avk> ☃) {
/* 1570 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pc[] ☃) {}
/*      */   
/*      */   public int b(Collection<avk> ☃) {
/* 1577 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void cH() {
/* 1582 */     super.cH();
/*      */     
/* 1584 */     a(ws.C);
/* 1585 */     if (ba()) {
/* 1586 */       a(0.2F);
/*      */     } else {
/* 1588 */       a(0.05F);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(float ☃, float f1, float f2) {
/* 1594 */     double d1 = this.q;
/* 1595 */     double d2 = this.r;
/* 1596 */     double d3 = this.s;
/*      */     
/* 1598 */     if (bb() && !aW()) {
/* 1599 */       double d4 = (aN()).c;
/* 1600 */       double d5 = (d4 < -0.2D) ? 0.085D : 0.06D;
/*      */       
/* 1602 */       if (d4 <= 0.0D || this.bg || !this.m.a_(new el(this.q, this.r + 1.0D - 0.1D, this.s)).s().e()) {
/* 1603 */         this.u += (d4 - this.u) * d5;
/*      */       }
/*      */     } 
/*      */     
/* 1607 */     if (this.bV.b && !aW()) {
/* 1608 */       double d = this.u;
/* 1609 */       float f = this.aU;
/*      */       
/* 1611 */       this.aU = this.bV.a() * (ba() ? 2 : true);
/* 1612 */       super.a(☃, f1, f2);
/* 1613 */       this.u = d * 0.6D;
/* 1614 */       this.aU = f;
/*      */       
/* 1616 */       this.M = 0.0F;
/*      */       
/* 1618 */       b(7, false);
/*      */     } else {
/* 1620 */       super.a(☃, f1, f2);
/*      */     } 
/*      */     
/* 1623 */     k(this.q - d1, this.r - d2, this.s - d3);
/*      */   }
/*      */ 
/*      */   
/*      */   public void as() {
/* 1628 */     if (this.bV.b) {
/* 1629 */       g(false);
/*      */     } else {
/* 1631 */       super.as();
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
/*      */   public float cK() {
/* 1645 */     return (float)a(ank.d).e();
/*      */   }
/*      */   
/*      */   public void k(double ☃, double d1, double d2) {
/* 1649 */     if (aW()) {
/*      */       return;
/*      */     }
/*      */     
/* 1653 */     if (bb()) {
/* 1654 */       int i = Math.round(xq.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1655 */       if (i > 0) {
/* 1656 */         a(ws.B, i);
/* 1657 */         a(0.01F * i * 0.01F);
/*      */       } 
/* 1659 */     } else if (a(ww.a)) {
/* 1660 */       int i = Math.round(xq.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1661 */       if (i > 0) {
/* 1662 */         a(ws.v, i);
/* 1663 */         a(0.01F * i * 0.01F);
/*      */       } 
/* 1665 */     } else if (an()) {
/* 1666 */       int i = Math.round(xq.a(☃ * ☃ + d2 * d2) * 100.0F);
/* 1667 */       if (i > 0) {
/* 1668 */         a(ws.r, i);
/* 1669 */         a(0.01F * i * 0.01F);
/*      */       } 
/* 1671 */     } else if (z_()) {
/* 1672 */       if (d1 > 0.0D) {
/* 1673 */         a(ws.t, (int)Math.round(d1 * 100.0D));
/*      */       }
/* 1675 */     } else if (this.A) {
/* 1676 */       int i = Math.round(xq.a(☃ * ☃ + d2 * d2) * 100.0F);
/* 1677 */       if (i > 0) {
/* 1678 */         if (ba()) {
/* 1679 */           a(ws.q, i);
/* 1680 */           a(0.1F * i * 0.01F);
/* 1681 */         } else if (aZ()) {
/* 1682 */           a(ws.p, i);
/* 1683 */           a(0.0F * i * 0.01F);
/*      */         } else {
/* 1685 */           a(ws.o, i);
/* 1686 */           a(0.0F * i * 0.01F);
/*      */         } 
/*      */       }
/* 1689 */     } else if (dc()) {
/* 1690 */       int i = Math.round(xq.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1691 */       a(ws.A, i);
/*      */     } else {
/* 1693 */       int i = Math.round(xq.a(☃ * ☃ + d2 * d2) * 100.0F);
/* 1694 */       if (i > 25) {
/* 1695 */         a(ws.u, i);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void l(double ☃, double d1, double d2) {
/* 1701 */     if (aW()) {
/* 1702 */       int i = Math.round(xq.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1703 */       if (i > 0) {
/* 1704 */         if (bU() instanceof aph) {
/* 1705 */           a(ws.w, i);
/* 1706 */         } else if (bU() instanceof apj) {
/* 1707 */           a(ws.x, i);
/* 1708 */         } else if (bU() instanceof aka) {
/* 1709 */           a(ws.y, i);
/* 1710 */         } else if (bU() instanceof ako) {
/* 1711 */           a(ws.z, i);
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(float ☃, float f1) {
/* 1719 */     if (this.bV.c) {
/*      */       return;
/*      */     }
/*      */     
/* 1723 */     if (☃ >= 2.0F) {
/* 1724 */       a(ws.s, (int)Math.round(☃ * 100.0D));
/*      */     }
/* 1726 */     super.c(☃, f1);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void au() {
/* 1731 */     if (!t()) {
/* 1732 */       super.au();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected wi m(int ☃) {
/* 1738 */     if (☃ > 4) {
/* 1739 */       return wj.gR;
/*      */     }
/* 1741 */     return wj.gZ;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(afa ☃) {
/* 1747 */     b(ws.g.b(☃.P()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void bh() {
/* 1752 */     if (!this.bV.b) {
/* 1753 */       super.bh();
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/* 1758 */     q(☃);
/* 1759 */     this.bY += ☃ / dv();
/* 1760 */     this.bX = xq.a(this.bX + ☃, 0, 2147483647);
/* 1761 */     while (this.bY < 0.0F) {
/* 1762 */       float f = this.bY * dv();
/* 1763 */       if (this.bW > 0) {
/* 1764 */         c(-1);
/* 1765 */         this.bY = 1.0F + f / dv(); continue;
/*      */       } 
/* 1767 */       c(-1);
/* 1768 */       this.bY = 0.0F;
/*      */     } 
/*      */     
/* 1771 */     while (this.bY >= 1.0F) {
/* 1772 */       this.bY = (this.bY - 1.0F) * dv();
/* 1773 */       c(1);
/* 1774 */       this.bY /= dv();
/*      */     } 
/*      */   }
/*      */   
/*      */   public int du() {
/* 1779 */     return this.bZ;
/*      */   }
/*      */   
/*      */   public void a(ate ☃, int i) {
/* 1783 */     this.bW -= i;
/* 1784 */     if (this.bW < 0) {
/* 1785 */       this.bW = 0;
/* 1786 */       this.bY = 0.0F;
/* 1787 */       this.bX = 0;
/*      */     } 
/* 1789 */     this.bZ = this.T.nextInt();
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/* 1793 */     this.bW += ☃;
/* 1794 */     if (this.bW < 0) {
/* 1795 */       this.bW = 0;
/* 1796 */       this.bY = 0.0F;
/* 1797 */       this.bX = 0;
/*      */     } 
/*      */     
/* 1800 */     if (☃ > 0 && this.bW % 5 == 0 && this.g < this.U - 100.0F) {
/* 1801 */       float f = (this.bW > 30) ? 1.0F : (this.bW / 30.0F);
/* 1802 */       this.m.a((aog)null, this.q, this.r, this.s, wj.gY, bV(), f * 0.75F, 1.0F);
/* 1803 */       this.g = this.U;
/*      */     } 
/*      */   }
/*      */   
/*      */   public int dv() {
/* 1808 */     if (this.bW >= 30) {
/* 1809 */       return 112 + (this.bW - 30) * 9;
/*      */     }
/* 1811 */     if (this.bW >= 15) {
/* 1812 */       return 37 + (this.bW - 15) * 5;
/*      */     }
/* 1814 */     return 7 + this.bW * 2;
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
/*      */   public void a(float ☃) {
/* 1826 */     if (this.bV.a) {
/*      */       return;
/*      */     }
/*      */     
/* 1830 */     if (!this.m.B) {
/* 1831 */       this.bF.a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public apt dw() {
/* 1836 */     return this.bF;
/*      */   }
/*      */   
/*      */   public boolean q(boolean ☃) {
/* 1840 */     return (!this.bV.a && (☃ || this.bF.c()));
/*      */   }
/*      */   
/*      */   public boolean dx() {
/* 1844 */     return (cq() > 0.0F && cq() < cw());
/*      */   }
/*      */   
/*      */   public boolean dy() {
/* 1848 */     return this.bV.e;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(el ☃, eq eq1, ate ate1) {
/* 1853 */     if (this.bV.e) {
/* 1854 */       return true;
/*      */     }
/*      */     
/* 1857 */     el el1 = ☃.a(eq1.d());
/* 1858 */     blh blh = new blh(this.m, el1, false);
/* 1859 */     return ate1.b(this.m.F(), blh);
/*      */   }
/*      */ 
/*      */   
/*      */   protected int b(aog ☃) {
/* 1864 */     if (this.m.X().b("keepInventory") || t()) {
/* 1865 */       return 0;
/*      */     }
/*      */     
/* 1868 */     int i = this.bW * 7;
/* 1869 */     if (i > 100) {
/* 1870 */       return 100;
/*      */     }
/* 1872 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean cd() {
/* 1878 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean ak() {
/* 1888 */     return !this.bV.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public void r() {}
/*      */ 
/*      */   
/*      */   public void a(axv ☃) {}
/*      */ 
/*      */   
/*      */   public ij N_() {
/* 1899 */     return new iq(this.h.getName());
/*      */   }
/*      */   
/*      */   public aqq dz() {
/* 1903 */     return this.bC;
/*      */   }
/*      */ 
/*      */   
/*      */   public ate b(aew ☃) {
/* 1908 */     if (☃ == aew.a)
/* 1909 */       return this.bB.i(); 
/* 1910 */     if (☃ == aew.b)
/* 1911 */       return this.bB.c.get(0); 
/* 1912 */     if (☃.a() == aew.a.b) {
/* 1913 */       return this.bB.b.get(☃.b());
/*      */     }
/* 1915 */     return ate.a;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aew ☃, ate ate1) {
/* 1920 */     if (☃ == aew.a) {
/* 1921 */       b(ate1);
/* 1922 */       this.bB.a.set(this.bB.d, ate1);
/* 1923 */     } else if (☃ == aew.b) {
/* 1924 */       b(ate1);
/* 1925 */       this.bB.c.set(0, ate1);
/* 1926 */     } else if (☃.a() == aew.a.b) {
/* 1927 */       b(ate1);
/* 1928 */       this.bB.b.set(☃.b(), ate1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean d(ate ☃) {
/* 1933 */     b(☃);
/* 1934 */     return this.bB.e(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<ate> aS() {
/* 1939 */     return Lists.newArrayList((Object[])new ate[] { cB(), cC() });
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<ate> aT() {
/* 1944 */     return this.bB.b;
/*      */   }
/*      */   
/*      */   public boolean g(gy ☃) {
/* 1948 */     if (aW() || !this.A || an()) {
/* 1949 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1953 */     if (dE().isEmpty()) {
/* 1954 */       h(☃);
/* 1955 */       return true;
/* 1956 */     }  if (dF().isEmpty()) {
/* 1957 */       i(☃);
/* 1958 */       return true;
/*      */     } 
/*      */     
/* 1961 */     return false;
/*      */   }
/*      */   
/*      */   protected void dA() {
/* 1965 */     k(dE());
/* 1966 */     h(new gy());
/* 1967 */     k(dF());
/* 1968 */     i(new gy());
/*      */   }
/*      */   
/*      */   private void k(@Nullable gy ☃) {
/* 1972 */     if (!this.m.B && !☃.isEmpty()) {
/* 1973 */       aer aer = aev.a(☃, this.m);
/* 1974 */       if (aer instanceof afl) {
/* 1975 */         ((afl)aer).b(this.at);
/*      */       }
/*      */       
/* 1978 */       aer.b(this.q, this.r + 0.699999988079071D, this.s);
/*      */       
/* 1980 */       this.m.a(aer);
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
/*      */   public boolean bb() {
/* 2005 */     return (!this.bV.b && !t() && super.bb());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bw() {
/* 2012 */     return !this.bV.b;
/*      */   }
/*      */   
/*      */   public cfc dB() {
/* 2016 */     return this.m.G();
/*      */   }
/*      */ 
/*      */   
/*      */   public ij O() {
/* 2021 */     ij ☃ = cfa.a(be(), N_());
/* 2022 */     return c(☃);
/*      */   }
/*      */   
/*      */   public ij dC() {
/* 2026 */     return (new iq("")).a(N_()).a(" (").a(this.h.getId().toString()).a(")");
/*      */   }
/*      */   
/*      */   private ij c(ij ☃) {
/* 2030 */     String str = do().getName();
/*      */     
/* 2032 */     return ☃.a(ip1 -> ip1.a(new ii(ii.a.d, "/tell " + ☃ + " ")).a(bC()).a(☃));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String bv() {
/* 2041 */     return do().getName();
/*      */   }
/*      */ 
/*      */   
/*      */   public float bF() {
/* 2046 */     float ☃ = 1.62F;
/* 2047 */     if (cL()) {
/* 2048 */       ☃ = 0.2F;
/* 2049 */     } else if (bb() || dc() || this.I == 0.6F) {
/* 2050 */       ☃ = 0.4F;
/* 2051 */     } else if (aZ() || this.I == 1.65F) {
/*      */       
/* 2053 */       ☃ -= 0.08F;
/*      */     } 
/*      */     
/* 2056 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void q(float ☃) {
/* 2061 */     if (☃ < 0.0F) {
/* 2062 */       ☃ = 0.0F;
/*      */     }
/* 2064 */     T().b(a, Float.valueOf(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public float cQ() {
/* 2069 */     return ((Float)T().<Float>a(a)).floatValue();
/*      */   }
/*      */   
/*      */   public static UUID a(GameProfile ☃) {
/* 2073 */     UUID uUID = ☃.getId();
/* 2074 */     if (uUID == null) {
/* 2075 */       uUID = c(☃.getName());
/*      */     }
/* 2077 */     return uUID;
/*      */   }
/*      */   
/*      */   public static UUID c(String ☃) {
/* 2081 */     return UUID.nameUUIDFromBytes(("OfflinePlayer:" + ☃).getBytes(StandardCharsets.UTF_8));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(adp ☃) {
/* 2086 */     if (☃.a()) {
/* 2087 */       return true;
/*      */     }
/* 2089 */     ate ate1 = cB();
/* 2090 */     if (!ate1.a() && ate1.s()) {
/* 2091 */       return ate1.q().getString().equals(☃.b());
/*      */     }
/* 2093 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(int ☃, ate ate1) {
/*      */     aew aew;
/* 2102 */     if (☃ >= 0 && ☃ < this.bB.a.size()) {
/* 2103 */       this.bB.a(☃, ate1);
/* 2104 */       return true;
/*      */     } 
/*      */ 
/*      */     
/* 2108 */     if (☃ == 100 + aew.f.b()) {
/* 2109 */       aew = aew.f;
/* 2110 */     } else if (☃ == 100 + aew.e.b()) {
/* 2111 */       aew = aew.e;
/* 2112 */     } else if (☃ == 100 + aew.d.b()) {
/* 2113 */       aew = aew.d;
/* 2114 */     } else if (☃ == 100 + aew.c.b()) {
/* 2115 */       aew = aew.c;
/*      */     } else {
/* 2117 */       aew = null;
/*      */     } 
/*      */     
/* 2120 */     if (☃ == 98) {
/* 2121 */       a(aew.a, ate1);
/* 2122 */       return true;
/* 2123 */     }  if (☃ == 99) {
/* 2124 */       a(aew.b, ate1);
/* 2125 */       return true;
/*      */     } 
/*      */     
/* 2128 */     if (aew != null) {
/* 2129 */       if (!ate1.a()) {
/* 2130 */         if (ate1.b() instanceof arb || ate1.b() instanceof asg) {
/* 2131 */           if (afb.e(ate1) != aew) {
/* 2132 */             return false;
/*      */           }
/* 2134 */         } else if (aew != aew.f) {
/* 2135 */           return false;
/*      */         } 
/*      */       }
/* 2138 */       this.bB.a(aew.b() + this.bB.a.size(), ate1);
/* 2139 */       return true;
/*      */     } 
/* 2141 */     int i = ☃ - 200;
/* 2142 */     if (i >= 0 && i < this.bC.T_()) {
/* 2143 */       this.bC.a(i, ate1);
/* 2144 */       return true;
/*      */     } 
/* 2146 */     return false;
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
/*      */   public aez cS() {
/* 2159 */     return (((Byte)this.ab.<Byte>a(by)).byteValue() == 0) ? aez.a : aez.b;
/*      */   }
/*      */   
/*      */   public void a(aez ☃) {
/* 2163 */     this.ab.b(by, Byte.valueOf((byte)((☃ == aez.a) ? 0 : 1)));
/*      */   }
/*      */   
/*      */   public gy dE() {
/* 2167 */     return this.ab.<gy>a(bz);
/*      */   }
/*      */   
/*      */   protected void h(gy ☃) {
/* 2171 */     this.ab.b(bz, ☃);
/*      */   }
/*      */   
/*      */   public gy dF() {
/* 2175 */     return this.ab.<gy>a(bA);
/*      */   }
/*      */   
/*      */   protected void i(gy ☃) {
/* 2179 */     this.ab.b(bA, ☃);
/*      */   }
/*      */   
/*      */   public float dG() {
/* 2183 */     return (float)(1.0D / a(ank.g).e() * 20.0D);
/*      */   }
/*      */   
/*      */   public float r(float ☃) {
/* 2187 */     return xq.a((this.aH + ☃) / dG(), 0.0F, 1.0F);
/*      */   }
/*      */   
/*      */   public void dH() {
/* 2191 */     this.aH = 0;
/*      */   }
/*      */   
/*      */   public atb dI() {
/* 2195 */     return this.ce;
/*      */   }
/*      */ 
/*      */   
/*      */   public void i(aer ☃) {
/* 2200 */     if (!cL()) {
/* 2201 */       super.i(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public float dJ() {
/* 2206 */     return (float)a(ank.j).e();
/*      */   }
/*      */   
/*      */   public boolean dK() {
/* 2210 */     return (this.bV.d && y() >= 2);
/*      */   }
/*      */   public abstract boolean t();
/*      */   public abstract boolean u();
/*      */   static class c implements Predicate<ang> { private final aog a;
/*      */     
/*      */     private c(aog ☃) {
/* 2217 */       this.a = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(@Nullable ang ☃) {
/* 2222 */       return ☃.c(this.a);
/*      */     } }
/*      */ 
/*      */ }


/* Location:              F:\dw\server.jar!\aog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */