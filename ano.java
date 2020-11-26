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
/*     */ public class ano
/*     */   extends afb
/*     */   implements amy
/*     */ {
/*  46 */   private static final or<Integer> bC = ou.a((Class)ano.class, ot.b);
/*     */   
/*     */   public float a;
/*     */   public float b;
/*     */   public float c;
/*     */   private boolean bD;
/*     */   
/*     */   protected ano(aev<?> ☃, axy axy1) {
/*  54 */     super(☃, axy1);
/*     */     
/*  56 */     this.g = new d(this);
/*     */   }
/*     */   
/*     */   public ano(axy ☃) {
/*  60 */     this(aev.am, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  65 */     this.by.a(1, new b(this));
/*     */     
/*  67 */     this.by.a(2, new a(this));
/*  68 */     this.by.a(3, new e(this));
/*     */     
/*  70 */     this.by.a(5, new c(this));
/*     */     
/*  72 */     this.bz.a(1, new ain(this));
/*  73 */     this.bz.a(3, new aim(this, (Class)ajw.class));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  78 */     super.x_();
/*     */     
/*  80 */     this.ab.a(bC, Integer.valueOf(1));
/*     */   }
/*     */   
/*     */   protected void a(int ☃, boolean bool) {
/*  84 */     this.ab.b(bC, Integer.valueOf(☃));
/*  85 */     a(0.51000005F * ☃, 0.51000005F * ☃);
/*  86 */     b(this.q, this.r, this.s);
/*  87 */     a(ank.a).a((☃ * ☃));
/*  88 */     a(ank.d).a((0.2F + 0.1F * ☃));
/*  89 */     if (bool) {
/*  90 */       l(cw());
/*     */     }
/*  92 */     this.b_ = ☃;
/*     */   }
/*     */   
/*     */   public int dx() {
/*  96 */     return ((Integer)this.ab.<Integer>a(bC)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 101 */     super.b(☃);
/* 102 */     ☃.b("Size", dx() - 1);
/* 103 */     ☃.a("wasOnGround", this.bD);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 108 */     super.a(☃);
/* 109 */     int i = ☃.h("Size");
/* 110 */     if (i < 0) {
/* 111 */       i = 0;
/*     */     }
/* 113 */     a(i + 1, false);
/* 114 */     this.bD = ☃.q("wasOnGround");
/*     */   }
/*     */   
/*     */   public boolean dy() {
/* 118 */     return (dx() <= 1);
/*     */   }
/*     */   
/*     */   protected fk l() {
/* 122 */     return fm.D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 127 */     if (!this.m.B && this.m.aj() == adi.a && dx() > 0) {
/* 128 */       this.G = true;
/*     */     }
/*     */     
/* 131 */     this.b += (this.a - this.b) * 0.5F;
/* 132 */     this.c = this.b;
/* 133 */     super.R_();
/*     */     
/* 135 */     if (this.A && !this.bD) {
/* 136 */       int ☃ = dx();
/* 137 */       for (int i = 0; i < ☃ * 8; i++) {
/* 138 */         float f1 = this.T.nextFloat() * 6.2831855F;
/* 139 */         float f2 = this.T.nextFloat() * 0.5F + 0.5F;
/* 140 */         float f3 = xq.a(f1) * ☃ * 0.5F * f2;
/* 141 */         float f4 = xq.b(f1) * ☃ * 0.5F * f2;
/* 142 */         this.m.a(l(), this.q + f3, (bD()).b, this.s + f4, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/* 145 */       a(dv(), cD(), ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/* 146 */       this.a = -0.5F;
/* 147 */     } else if (!this.A && this.bD) {
/* 148 */       this.a = 1.0F;
/*     */     } 
/* 150 */     this.bD = this.A;
/* 151 */     ds();
/*     */   }
/*     */   
/*     */   protected void ds() {
/* 155 */     this.a *= 0.6F;
/*     */   }
/*     */   
/*     */   protected int dr() {
/* 159 */     return this.T.nextInt(20) + 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 164 */     if (bC.equals(☃)) {
/* 165 */       int i = dx();
/* 166 */       a(0.51000005F * i, 0.51000005F * i);
/* 167 */       this.w = this.aS;
/* 168 */       this.aQ = this.aS;
/*     */       
/* 170 */       if (an() && 
/* 171 */         this.T.nextInt(20) == 0) {
/* 172 */         au();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 177 */     super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aev<? extends ano> P() {
/* 183 */     return (aev)super.P();
/*     */   }
/*     */ 
/*     */   
/*     */   public void V() {
/* 188 */     int ☃ = dx();
/* 189 */     if (!this.m.B && ☃ > 1 && cq() <= 0.0F) {
/* 190 */       int i = 2 + this.T.nextInt(3);
/* 191 */       for (int j = 0; j < i; j++) {
/* 192 */         float f1 = ((j % 2) - 0.5F) * ☃ / 4.0F;
/* 193 */         float f2 = ((j / 2) - 0.5F) * ☃ / 4.0F;
/* 194 */         ano ano1 = P().a(this.m);
/* 195 */         if (O_()) {
/* 196 */           ano1.b(e());
/*     */         }
/* 198 */         if (dk()) {
/* 199 */           ano1.di();
/*     */         }
/* 201 */         ano1.a(☃ / 2, true);
/* 202 */         ano1.b(this.q + f1, this.r + 0.5D, this.s + f2, this.T.nextFloat() * 360.0F, 0.0F);
/* 203 */         this.m.a(ano1);
/*     */       } 
/*     */     } 
/* 206 */     super.V();
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(aer ☃) {
/* 211 */     super.i(☃);
/* 212 */     if (☃ instanceof ajw && dt()) {
/* 213 */       f((afa)☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 219 */     if (dt()) {
/* 220 */       f(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void f(afa ☃) {
/* 225 */     int i = dx();
/* 226 */     if (D(☃) && h(☃) < 0.6D * i * 0.6D * i && 
/* 227 */       ☃.a(aea.a(this), du())) {
/* 228 */       a(wj.iG, 1.0F, (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/* 229 */       a(this, ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float bF() {
/* 236 */     return 0.625F * this.I;
/*     */   }
/*     */   
/*     */   protected boolean dt() {
/* 240 */     return (!dy() && cP());
/*     */   }
/*     */   
/*     */   protected int du() {
/* 244 */     return dx();
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 249 */     if (dy()) {
/* 250 */       return wj.iU;
/*     */     }
/* 252 */     return wj.iI;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 258 */     if (dy()) {
/* 259 */       return wj.iT;
/*     */     }
/* 261 */     return wj.iH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dv() {
/* 266 */     if (dy()) {
/* 267 */       return wj.iW;
/*     */     }
/* 269 */     return wj.iK;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected ata F() {
/* 275 */     if (dx() == 1) {
/* 276 */       return atf.aT;
/*     */     }
/* 278 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 284 */     return (dx() == 1) ? ccl.ao : ccl.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 289 */     el el = new el(xq.c(this.q), 0, xq.c(this.s));
/* 290 */     if (☃.g().t() == ayg.c && this.T.nextInt(4) != 1) {
/* 291 */       return false;
/*     */     }
/* 293 */     if (☃.aj() != adi.a) {
/*     */       
/* 295 */       ayu ayu = ☃.d(el);
/*     */       
/* 297 */       if (ayu == ayz.h && this.r > 50.0D && this.r < 70.0D && this.T.nextFloat() < 0.5F && 
/* 298 */         this.T.nextFloat() < ☃.ah() && ☃.C(new el(this)) <= this.T.nextInt(8)) {
/* 299 */         return super.a(☃, bool);
/*     */       }
/*     */ 
/*     */       
/* 303 */       axm axm = new axm(el);
/* 304 */       boolean bool1 = (boz.a(axm.a, axm.b, ☃.r_(), 987234911L).nextInt(10) == 0);
/* 305 */       if (this.T.nextInt(10) == 0 && bool1 && this.r < 40.0D) {
/* 306 */         return super.a(☃, bool);
/*     */       }
/*     */     } 
/* 309 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/* 314 */     return 0.4F * dx();
/*     */   }
/*     */ 
/*     */   
/*     */   public int K() {
/* 319 */     return 0;
/*     */   }
/*     */   
/*     */   protected boolean dz() {
/* 323 */     return (dx() > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void cH() {
/* 328 */     this.u = 0.41999998688697815D;
/* 329 */     this.al = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 335 */     int i = this.T.nextInt(3);
/* 336 */     if (i < 2 && this.T.nextFloat() < 0.5F * ☃.d()) {
/* 337 */       i++;
/*     */     }
/* 339 */     int j = 1 << i;
/* 340 */     a(j, true);
/*     */     
/* 342 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */   
/*     */   static class d extends agb {
/*     */     private float i;
/*     */     private int j;
/*     */     private final ano k;
/*     */     private boolean l;
/*     */     
/*     */     public d(ano ☃) {
/* 352 */       super(☃);
/* 353 */       this.k = ☃;
/* 354 */       this.i = 180.0F * ☃.w / 3.1415927F;
/*     */     }
/*     */     
/*     */     public void a(float ☃, boolean bool) {
/* 358 */       this.i = ☃;
/* 359 */       this.l = bool;
/*     */     }
/*     */     
/*     */     public void a(double ☃) {
/* 363 */       this.e = ☃;
/* 364 */       this.h = agb.a.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 369 */       this.a.w = a(this.a.w, this.i, 90.0F);
/* 370 */       this.a.aS = this.a.w;
/* 371 */       this.a.aQ = this.a.w;
/*     */       
/* 373 */       if (this.h != agb.a.b) {
/* 374 */         this.a.r(0.0F);
/*     */         return;
/*     */       } 
/* 377 */       this.h = agb.a.a;
/*     */       
/* 379 */       if (this.a.A) {
/* 380 */         this.a.o((float)(this.e * this.a.a(ank.d).e()));
/* 381 */         if (this.j-- <= 0) {
/* 382 */           this.j = this.k.dr();
/* 383 */           if (this.l) {
/* 384 */             this.j /= 3;
/*     */           }
/* 386 */           this.k.s().a();
/* 387 */           if (this.k.dz()) {
/* 388 */             this.k.a(this.k.dw(), this.k.cD(), ((this.k.ce().nextFloat() - this.k.ce().nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */           }
/*     */         } else {
/* 391 */           this.k.bh = 0.0F;
/* 392 */           this.k.bj = 0.0F;
/* 393 */           this.a.o(0.0F);
/*     */         } 
/*     */       } else {
/* 396 */         this.a.o((float)(this.e * this.a.a(ank.d).e()));
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected wi dw() {
/* 402 */     return dy() ? wj.iV : wj.iJ;
/*     */   }
/*     */   
/*     */   static class a extends agt {
/*     */     private final ano a;
/*     */     private int b;
/*     */     
/*     */     public a(ano ☃) {
/* 410 */       this.a = ☃;
/* 411 */       a(2);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 416 */       afa ☃ = this.a.v();
/*     */       
/* 418 */       if (☃ == null) {
/* 419 */         return false;
/*     */       }
/* 421 */       if (!☃.aF()) {
/* 422 */         return false;
/*     */       }
/*     */       
/* 425 */       if (☃ instanceof aog && ((aog)☃).bV.a) {
/* 426 */         return false;
/*     */       }
/*     */       
/* 429 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 434 */       this.b = 300;
/* 435 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 440 */       afa ☃ = this.a.v();
/*     */       
/* 442 */       if (☃ == null) {
/* 443 */         return false;
/*     */       }
/* 445 */       if (!☃.aF()) {
/* 446 */         return false;
/*     */       }
/* 448 */       if (☃ instanceof aog && ((aog)☃).bV.a) {
/* 449 */         return false;
/*     */       }
/*     */       
/* 452 */       if (--this.b <= 0) {
/* 453 */         return false;
/*     */       }
/*     */       
/* 456 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 461 */       this.a.a(this.a.v(), 10.0F, 10.0F);
/* 462 */       ((ano.d)this.a.r()).a(this.a.w, this.a.dt());
/*     */     }
/*     */   }
/*     */   
/*     */   static class e
/*     */     extends agt {
/*     */     private final ano a;
/*     */     private float b;
/*     */     private int c;
/*     */     
/*     */     public e(ano ☃) {
/* 473 */       this.a = ☃;
/* 474 */       a(2);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 479 */       return (this.a.v() == null && (this.a.A || this.a.an() || this.a.ax() || this.a.a(aem.y)));
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 484 */       if (--this.c <= 0) {
/* 485 */         this.c = 40 + this.a.ce().nextInt(60);
/* 486 */         this.b = this.a.ce().nextInt(360);
/*     */       } 
/* 488 */       ((ano.d)this.a.r()).a(this.b, false);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends agt {
/*     */     private final ano a;
/*     */     
/*     */     public b(ano ☃) {
/* 496 */       this.a = ☃;
/* 497 */       a(5);
/* 498 */       ((aiv)☃.t()).d(true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 503 */       return (this.a.an() || this.a.ax());
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 508 */       if (this.a.ce().nextFloat() < 0.8F) {
/* 509 */         this.a.s().a();
/*     */       }
/* 511 */       ((ano.d)this.a.r()).a(1.2D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends agt {
/*     */     private final ano a;
/*     */     
/*     */     public c(ano ☃) {
/* 519 */       this.a = ☃;
/* 520 */       a(5);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 525 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 530 */       ((ano.d)this.a.r()).a(1.0D);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ano.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */