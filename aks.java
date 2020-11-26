/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aks
/*     */   extends akn
/*     */   implements anj
/*     */ {
/*  60 */   private static final or<Integer> bM = ou.a((Class)aks.class, ot.b);
/*  61 */   private static final or<Integer> bN = ou.a((Class)aks.class, ot.b);
/*  62 */   private static final or<Integer> bO = ou.a((Class)aks.class, ot.b);
/*     */   
/*     */   private boolean bP;
/*     */   
/*     */   @Nullable
/*     */   private aks bQ;
/*     */   @Nullable
/*     */   private aks bR;
/*     */   
/*     */   public aks(axy ☃) {
/*  72 */     super(aev.K, ☃);
/*  73 */     a(0.9F, 1.87F);
/*     */   }
/*     */   
/*     */   private void t(int ☃) {
/*  77 */     this.ab.b(bM, Integer.valueOf(Math.max(1, Math.min(5, ☃))));
/*     */   }
/*     */   
/*     */   private void eo() {
/*  81 */     int ☃ = (this.T.nextFloat() < 0.04F) ? 5 : 3;
/*     */     
/*  83 */     t(1 + this.T.nextInt(☃));
/*     */   }
/*     */   
/*     */   public int eg() {
/*  87 */     return ((Integer)this.ab.<Integer>a(bM)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  92 */     super.b(☃);
/*     */     
/*  94 */     ☃.b("Variant", eh());
/*  95 */     ☃.b("Strength", eg());
/*     */     
/*  97 */     if (!this.bH.a(1).a()) {
/*  98 */       ☃.a("DecorItem", this.bH.a(1).b(new gy()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 104 */     t(☃.h("Strength"));
/*     */     
/* 106 */     super.a(☃);
/* 107 */     s(☃.h("Variant"));
/*     */     
/* 109 */     if (☃.c("DecorItem", 10)) {
/* 110 */       this.bH.a(1, ate.a(☃.p("DecorItem")));
/*     */     }
/*     */     
/* 113 */     dS();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 118 */     this.by.a(0, new agm(this));
/* 119 */     this.by.a(1, new ahy(this, 1.2D));
/* 120 */     this.by.a(2, new aha(this, 2.0999999046325684D));
/* 121 */     this.by.a(3, new aht((anj)this, 1.25D, 40, 20.0F));
/* 122 */     this.by.a(3, new aho(this, 1.2D));
/* 123 */     this.by.a(4, new agi(this, 1.0D));
/* 124 */     this.by.a(5, new ags(this, 1.0D));
/* 125 */     this.by.a(6, new aih(this, 0.7D));
/* 126 */     this.by.a(7, new ahb(this, (Class)aog.class, 6.0F));
/* 127 */     this.by.a(8, new ahq(this));
/*     */     
/* 129 */     this.bz.a(1, new c(this));
/* 130 */     this.bz.a(2, new a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 135 */     super.bZ();
/* 136 */     a(ank.b).a(40.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 141 */     super.x_();
/*     */     
/* 143 */     this.ab.a(bM, Integer.valueOf(0));
/* 144 */     this.ab.a(bN, Integer.valueOf(-1));
/* 145 */     this.ab.a(bO, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public int eh() {
/* 149 */     return xq.a(((Integer)this.ab.<Integer>a(bO)).intValue(), 0, 3);
/*     */   }
/*     */   
/*     */   public void s(int ☃) {
/* 153 */     this.ab.b(bO, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int dA() {
/* 158 */     if (dz()) {
/* 159 */       return 2 + 3 * dH();
/*     */     }
/* 161 */     return super.dA();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(aer ☃) {
/* 166 */     if (!w(☃)) {
/*     */       return;
/*     */     }
/* 169 */     float f1 = xq.b(this.aQ * 0.017453292F);
/* 170 */     float f2 = xq.a(this.aQ * 0.017453292F);
/* 171 */     float f3 = 0.3F;
/* 172 */     ☃.b(this.q + (0.3F * f2), this.r + aJ() + ☃.aI(), this.s - (0.3F * f1));
/*     */   }
/*     */ 
/*     */   
/*     */   public double aJ() {
/* 177 */     return this.I * 0.67D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dh() {
/* 182 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(aog ☃, ate ate1) {
/* 187 */     int i = 0;
/* 188 */     int j = 0;
/* 189 */     float f = 0.0F;
/* 190 */     boolean bool = false;
/*     */     
/* 192 */     ata ata = ate1.b();
/* 193 */     if (ata == atf.S) {
/* 194 */       i = 10;
/* 195 */       j = 3;
/* 196 */       f = 2.0F;
/* 197 */     } else if (ata == bct.fW.h()) {
/* 198 */       i = 90;
/* 199 */       j = 6;
/* 200 */       f = 10.0F;
/* 201 */       if (dJ() && i() == 0 && dD()) {
/* 202 */         bool = true;
/* 203 */         f(☃);
/*     */       } 
/*     */     } 
/* 206 */     if (cq() < cw() && f > 0.0F) {
/* 207 */       c(f);
/* 208 */       bool = true;
/*     */     } 
/* 210 */     if (y_() && i > 0) {
/* 211 */       this.m.a(fm.z, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H, this.r + 0.5D + (this.T.nextFloat() * this.I), this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H, 0.0D, 0.0D, 0.0D);
/* 212 */       if (!this.m.B) {
/* 213 */         a(i);
/*     */       }
/* 215 */       bool = true;
/*     */     } 
/* 217 */     if (j > 0 && (bool || !dJ()) && dQ() < dW()) {
/* 218 */       bool = true;
/* 219 */       if (!this.m.B) {
/* 220 */         r(j);
/*     */       }
/*     */     } 
/* 223 */     if (bool && !ai()) {
/* 224 */       this.m.a((aog)null, this.q, this.r, this.s, wj.eX, bV(), 1.0F, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/*     */     }
/*     */     
/* 227 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean cF() {
/* 232 */     return (cq() <= 0.0F || dN());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*     */     int i;
/* 238 */     afj1 = super.a(☃, afj1, gy1);
/* 239 */     eo();
/*     */ 
/*     */     
/* 242 */     if (afj1 instanceof b) {
/* 243 */       i = ((b)afj1).a;
/*     */     } else {
/* 245 */       i = this.T.nextInt(4);
/* 246 */       afj1 = new b(i);
/*     */     } 
/* 248 */     s(i);
/*     */     
/* 250 */     return afj1;
/*     */   }
/*     */ 
/*     */   
/*     */   static class b
/*     */     implements afj
/*     */   {
/*     */     public int a;
/*     */ 
/*     */     
/*     */     private b(int ☃) {
/* 261 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dB() {
/* 267 */     return wj.eU;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 272 */     return wj.eT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 277 */     return wj.eY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 282 */     return wj.eW;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 287 */     a(wj.fa, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dC() {
/* 292 */     a(wj.eV, 1.0F, (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dZ() {
/* 297 */     wi ☃ = dB();
/* 298 */     if (☃ != null) {
/* 299 */       a(☃, cD(), cE());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 306 */     return ccl.aD;
/*     */   }
/*     */ 
/*     */   
/*     */   public int dH() {
/* 311 */     return eg();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ef() {
/* 316 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g(ate ☃) {
/* 321 */     ata ata = ☃.b();
/* 322 */     return wx.f.a(ata);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dU() {
/* 327 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ade ☃) {
/* 332 */     asc asc1 = ej();
/* 333 */     super.a(☃);
/*     */     
/* 335 */     asc asc2 = ej();
/* 336 */     if (this.U > 20 && asc2 != null && asc2 != asc1) {
/* 337 */       a(wj.fb, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dS() {
/* 343 */     if (this.m.B) {
/*     */       return;
/*     */     }
/*     */     
/* 347 */     super.dS();
/*     */     
/* 349 */     a(h(this.bH.a(1)));
/*     */   }
/*     */   
/*     */   private void a(@Nullable asc ☃) {
/* 353 */     this.ab.b(bN, Integer.valueOf((☃ == null) ? -1 : ☃.a()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static asc h(ate ☃) {
/* 358 */     bcs bcs = bcs.a(☃.b());
/* 359 */     if (bcs instanceof bjd) {
/* 360 */       return ((bjd)bcs).d();
/*     */     }
/* 362 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public asc ej() {
/* 367 */     int ☃ = ((Integer)this.ab.<Integer>a(bN)).intValue();
/* 368 */     return (☃ == -1) ? null : asc.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int dW() {
/* 373 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ajq ☃) {
/* 378 */     return (☃ != this && ☃ instanceof aks && eb() && ((aks)☃).eb());
/*     */   }
/*     */ 
/*     */   
/*     */   public aks b(aeo ☃) {
/* 383 */     aks aks1 = new aks(this.m);
/*     */     
/* 385 */     a(☃, aks1);
/*     */     
/* 387 */     aks aks2 = (aks)☃;
/*     */     
/* 389 */     int i = this.T.nextInt(Math.max(eg(), aks2.eg())) + 1;
/* 390 */     if (this.T.nextFloat() < 0.03F) {
/* 391 */       i++;
/*     */     }
/* 393 */     aks1.t(i);
/*     */     
/* 395 */     aks1.s(this.T.nextBoolean() ? eh() : aks2.eh());
/*     */     
/* 397 */     return aks1;
/*     */   }
/*     */   
/*     */   private void f(afa ☃) {
/* 401 */     aos aos = new aos(this.m, this);
/* 402 */     double d1 = ☃.q - this.q;
/* 403 */     double d2 = (☃.bD()).b + (☃.I / 3.0F) - aos.r;
/* 404 */     double d3 = ☃.s - this.s;
/* 405 */     float f = xq.a(d1 * d1 + d3 * d3) * 0.2F;
/* 406 */     aos.c(d1, d2 + f, d3, 1.5F, 10.0F);
/* 407 */     this.m.a((aog)null, this.q, this.r, this.s, wj.eZ, bV(), 1.0F, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/*     */     
/* 409 */     this.m.a(aos);
/* 410 */     this.bP = true;
/*     */   }
/*     */   
/*     */   private void B(boolean ☃) {
/* 414 */     this.bP = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {
/* 419 */     int i = xq.f((☃ * 0.5F - 3.0F) * f1);
/* 420 */     if (i <= 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 425 */     if (☃ >= 6.0F) {
/* 426 */       a(aea.k, i);
/*     */       
/* 428 */       if (aX()) {
/* 429 */         for (aer aer : bQ()) {
/* 430 */           aer.a(aea.k, i);
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 435 */     blc blc = this.m.a_(new el(this.q, this.r - 0.2D - this.y, this.s));
/* 436 */     bcs bcs = blc.c();
/* 437 */     if (!blc.f() && !ai()) {
/* 438 */       bhr bhr = bcs.r();
/* 439 */       this.m.a((aog)null, this.q, this.r, this.s, bhr.d(), bV(), bhr.a() * 0.5F, bhr.b() * 0.75F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void ek() {
/* 444 */     if (this.bQ != null) {
/* 445 */       this.bQ.bR = null;
/*     */     }
/* 447 */     this.bQ = null;
/*     */   }
/*     */   
/*     */   public void a(aks ☃) {
/* 451 */     this.bQ = ☃;
/* 452 */     this.bQ.bR = this;
/*     */   }
/*     */   
/*     */   public boolean el() {
/* 456 */     return (this.bR != null);
/*     */   }
/*     */   
/*     */   public boolean em() {
/* 460 */     return (this.bQ != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aks en() {
/* 465 */     return this.bQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected double dx() {
/* 470 */     return 2.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dX() {
/* 475 */     if (!em() && y_()) {
/* 476 */       super.dX();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dY() {
/* 482 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 487 */     f(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void s(boolean ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   static class c
/*     */     extends ail
/*     */   {
/*     */     public c(aks ☃) {
/* 501 */       super(☃, false, new Class[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 506 */       if (this.e instanceof aks) {
/* 507 */         aks ☃ = (aks)this.e;
/* 508 */         if (aks.b(☃)) {
/* 509 */           aks.a(☃, false);
/* 510 */           return false;
/*     */         } 
/*     */       } 
/* 513 */       return super.b();
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends aio<akm> {
/*     */     public a(aks ☃) {
/* 519 */       super(☃, akm.class, 16, false, true, (Predicate<? super akm>)null);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 524 */       if (super.a() && this.d != null && !this.d.dy()) {
/* 525 */         return true;
/*     */       }
/*     */       
/* 528 */       this.e.e((afa)null);
/* 529 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     protected double i() {
/* 534 */       return super.i() * 0.25D;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */