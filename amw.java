/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Function;
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
/*     */ public class amw
/*     */   extends ang
/*     */ {
/*  53 */   private static final UUID a = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
/*  54 */   private static final afo b = (new afo(a, "Attacking speed boost", 0.15000000596046448D, 0)).a(false);
/*     */ 
/*     */ 
/*     */   
/*  58 */   private static final or<Optional<blc>> c = ou.a((Class)amw.class, ot.h);
/*  59 */   private static final or<Boolean> bC = ou.a((Class)amw.class, ot.i);
/*     */   
/*     */   private int bD;
/*     */   private int bE;
/*     */   
/*     */   public amw(axy ☃) {
/*  65 */     super(aev.s, ☃);
/*  66 */     a(0.6F, 2.9F);
/*  67 */     this.Q = 1.0F;
/*     */     
/*  69 */     a(cba.g, -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  74 */     this.by.a(0, new agm(this));
/*  75 */     this.by.a(2, new ahe(this, 1.0D, false));
/*  76 */     this.by.a(7, new aih(this, 1.0D, 0.0F));
/*  77 */     this.by.a(8, new ahb(this, (Class)aog.class, 8.0F));
/*  78 */     this.by.a(8, new ahq(this));
/*     */     
/*  80 */     this.by.a(10, new a(this));
/*  81 */     this.by.a(11, new c(this));
/*     */     
/*  83 */     this.bz.a(1, new b(this));
/*  84 */     this.bz.a(2, new ail(this, false, new Class[0]));
/*  85 */     this.bz.a(3, new aio<>(this, amx.class, 10, true, false, amx::l));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  90 */     super.bZ();
/*     */     
/*  92 */     a(ank.a).a(40.0D);
/*  93 */     a(ank.d).a(0.30000001192092896D);
/*  94 */     a(ank.f).a(7.0D);
/*  95 */     a(ank.b).a(64.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(@Nullable afa ☃) {
/* 100 */     super.e(☃);
/*     */     
/* 102 */     afn afn = a(ank.d);
/*     */     
/* 104 */     if (☃ == null) {
/* 105 */       this.bE = 0;
/* 106 */       this.ab.b(bC, Boolean.valueOf(false));
/*     */       
/* 108 */       afn.c(b);
/*     */     } else {
/* 110 */       this.bE = this.U;
/* 111 */       this.ab.b(bC, Boolean.valueOf(true));
/*     */       
/* 113 */       if (!afn.a(b)) {
/* 114 */         afn.b(b);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 121 */     super.x_();
/*     */     
/* 123 */     this.ab.a(c, Optional.empty());
/* 124 */     this.ab.a(bC, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public void l() {
/* 128 */     if (this.U >= this.bD + 400) {
/* 129 */       this.bD = this.U;
/* 130 */       if (!ai()) {
/* 131 */         this.m.a(this.q, this.r + bF(), this.s, wj.cc, bV(), 2.5F, 1.0F, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 138 */     if (bC.equals(☃) && 
/* 139 */       dB() && this.m.B) {
/* 140 */       l();
/*     */     }
/*     */     
/* 143 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 148 */     super.b(☃);
/* 149 */     blc blc = dA();
/* 150 */     if (blc != null) {
/* 151 */       ☃.a("carriedBlockState", hk.a(blc));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 157 */     super.a(☃);
/* 158 */     blc blc = null;
/* 159 */     if (☃.c("carriedBlockState", 10)) {
/* 160 */       blc = hk.d(☃.p("carriedBlockState"));
/* 161 */       if (blc.f()) {
/* 162 */         blc = null;
/*     */       }
/*     */     } 
/* 165 */     b(blc);
/*     */   }
/*     */   
/*     */   private boolean f(aog ☃) {
/* 169 */     ate ate = ☃.bB.b.get(3);
/* 170 */     if (ate.b() == bct.di.h()) {
/* 171 */       return false;
/*     */     }
/*     */     
/* 174 */     cee cee1 = ☃.f(1.0F).a();
/* 175 */     cee cee2 = new cee(this.q - ☃.q, (bD()).b + bF() - ☃.r + ☃.bF(), this.s - ☃.s);
/* 176 */     double d1 = cee2.b();
/* 177 */     cee2 = cee2.a();
/* 178 */     double d2 = cee1.b(cee2);
/* 179 */     if (d2 > 1.0D - 0.025D / d1) {
/* 180 */       return ☃.D(this);
/*     */     }
/* 182 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 187 */     return 2.55F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 192 */     if (this.m.B) {
/* 193 */       for (int ☃ = 0; ☃ < 2; ☃++) {
/* 194 */         this.m.a(fm.K, this.q + (this.T.nextDouble() - 0.5D) * this.H, this.r + this.T.nextDouble() * this.I - 0.25D, this.s + (this.T.nextDouble() - 0.5D) * this.H, (this.T.nextDouble() - 0.5D) * 2.0D, -this.T.nextDouble(), (this.T.nextDouble() - 0.5D) * 2.0D);
/*     */       }
/*     */     }
/*     */     
/* 198 */     this.bg = false;
/*     */     
/* 200 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 205 */     if (ap()) {
/* 206 */       a(aea.h, 1.0F);
/*     */     }
/*     */     
/* 209 */     if (this.m.L() && this.U >= this.bE + 600) {
/* 210 */       float ☃ = az();
/* 211 */       if (☃ > 0.5F && 
/* 212 */         this.m.e(new el(this)) && this.T.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F) {
/* 213 */         e((afa)null);
/* 214 */         dz();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 219 */     super.J();
/*     */   }
/*     */   
/*     */   protected boolean dz() {
/* 223 */     double ☃ = this.q + (this.T.nextDouble() - 0.5D) * 64.0D;
/* 224 */     double d1 = this.r + (this.T.nextInt(64) - 32);
/* 225 */     double d2 = this.s + (this.T.nextDouble() - 0.5D) * 64.0D;
/* 226 */     return k(☃, d1, d2);
/*     */   }
/*     */   
/*     */   protected boolean a(aer ☃) {
/* 230 */     cee cee = new cee(this.q - ☃.q, (bD()).b + (this.I / 2.0F) - ☃.r + ☃.bF(), this.s - ☃.s);
/* 231 */     cee = cee.a();
/* 232 */     double d1 = 16.0D;
/* 233 */     double d2 = this.q + (this.T.nextDouble() - 0.5D) * 8.0D - cee.b * 16.0D;
/* 234 */     double d3 = this.r + (this.T.nextInt(16) - 8) - cee.c * 16.0D;
/* 235 */     double d4 = this.s + (this.T.nextDouble() - 0.5D) * 8.0D - cee.d * 16.0D;
/* 236 */     return k(d2, d3, d4);
/*     */   }
/*     */   
/*     */   private boolean k(double ☃, double d1, double d2) {
/* 240 */     boolean bool = j(☃, d1, d2);
/* 241 */     if (bool) {
/* 242 */       this.m.a((aog)null, this.n, this.o, this.p, wj.cd, bV(), 1.0F, 1.0F);
/* 243 */       a(wj.cd, 1.0F, 1.0F);
/*     */     } 
/* 245 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 250 */     return dB() ? wj.cb : wj.bY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 255 */     return wj.ca;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 260 */     return wj.bZ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(boolean ☃, int i) {
/* 265 */     super.a(☃, i);
/* 266 */     blc blc = dA();
/* 267 */     if (blc != null) {
/* 268 */       a(blc.c());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 275 */     return ccl.C;
/*     */   }
/*     */   
/*     */   public void b(@Nullable blc ☃) {
/* 279 */     this.ab.b(c, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public blc dA() {
/* 284 */     return ((Optional<blc>)this.ab.<Optional<blc>>a(c)).orElse(null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 289 */     if (b(☃)) {
/* 290 */       return false;
/*     */     }
/*     */     
/* 293 */     if (☃ instanceof aec) {
/* 294 */       for (int i = 0; i < 64; i++) {
/* 295 */         if (dz()) {
/* 296 */           return true;
/*     */         }
/*     */       } 
/* 299 */       return false;
/*     */     } 
/*     */     
/* 302 */     boolean bool = super.a(☃, f);
/* 303 */     if (☃.f() && this.T.nextInt(10) != 0) {
/* 304 */       dz();
/*     */     }
/*     */     
/* 307 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean dB() {
/* 311 */     return ((Boolean)this.ab.<Boolean>a(bC)).booleanValue();
/*     */   }
/*     */   
/*     */   static class b extends aio<aog> {
/*     */     private final amw i;
/*     */     private aog j;
/*     */     private int k;
/*     */     private int l;
/*     */     
/*     */     public b(amw ☃) {
/* 321 */       super(☃, aog.class, false);
/* 322 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 327 */       double ☃ = i();
/* 328 */       this.j = this.i.m.a(this.i.q, this.i.r, this.i.s, ☃, ☃, (Function<aog, Double>)null, ☃ -> (☃ != null && amw.a(this.i, ☃)));
/* 329 */       return (this.j != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 334 */       this.k = 5;
/* 335 */       this.l = 0;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void d() {
/* 341 */       this.j = null;
/*     */       
/* 343 */       super.d();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 348 */       if (this.j != null) {
/* 349 */         if (!amw.a(this.i, this.j)) {
/* 350 */           return false;
/*     */         }
/* 352 */         this.i.a(this.j, 10.0F, 10.0F);
/* 353 */         return true;
/* 354 */       }  if (this.d != null && this.d.aF()) {
/* 355 */         return true;
/*     */       }
/* 357 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 362 */       if (this.j != null) {
/* 363 */         if (--this.k <= 0) {
/* 364 */           this.d = this.j;
/* 365 */           this.j = null;
/* 366 */           super.c();
/*     */         } 
/*     */       } else {
/* 369 */         if (this.d != null) {
/* 370 */           if (amw.a(this.i, this.d)) {
/* 371 */             if (this.d.h(this.i) < 16.0D) {
/* 372 */               this.i.dz();
/*     */             }
/* 374 */             this.l = 0;
/* 375 */           } else if (this.d.h(this.i) > 256.0D && 
/* 376 */             this.l++ >= 30 && 
/* 377 */             this.i.a(this.d)) {
/* 378 */             this.l = 0;
/*     */           } 
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 384 */         super.e();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends agt {
/*     */     private final amw a;
/*     */     
/*     */     public a(amw ☃) {
/* 393 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 398 */       if (this.a.dA() == null) {
/* 399 */         return false;
/*     */       }
/* 401 */       if (!this.a.m.X().b("mobGriefing")) {
/* 402 */         return false;
/*     */       }
/* 404 */       if (this.a.ce().nextInt(2000) != 0) {
/* 405 */         return false;
/*     */       }
/* 407 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 412 */       Random ☃ = this.a.ce();
/* 413 */       axz axz = this.a.m;
/*     */       
/* 415 */       int i = xq.c(this.a.q - 1.0D + ☃.nextDouble() * 2.0D);
/* 416 */       int j = xq.c(this.a.r + ☃.nextDouble() * 2.0D);
/* 417 */       int k = xq.c(this.a.s - 1.0D + ☃.nextDouble() * 2.0D);
/* 418 */       el el = new el(i, j, k);
/* 419 */       blc blc1 = axz.a_(el);
/* 420 */       blc blc2 = axz.a_(el.b());
/*     */       
/* 422 */       blc blc3 = this.a.dA();
/* 423 */       if (blc3 != null && a(axz, el, blc3, blc1, blc2)) {
/* 424 */         axz.a(el, blc3, 3);
/* 425 */         this.a.b((blc)null);
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean a(ayc ☃, el el1, blc blc1, blc blc2, blc blc3) {
/* 430 */       return (blc2.f() && !blc3.f() && blc3.g() && blc1.a(☃, el1));
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends agt {
/*     */     private final amw a;
/*     */     
/*     */     public c(amw ☃) {
/* 438 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 443 */       if (this.a.dA() != null) {
/* 444 */         return false;
/*     */       }
/* 446 */       if (!this.a.m.X().b("mobGriefing")) {
/* 447 */         return false;
/*     */       }
/* 449 */       if (this.a.ce().nextInt(20) != 0) {
/* 450 */         return false;
/*     */       }
/* 452 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 457 */       Random ☃ = this.a.ce();
/* 458 */       axy axy = this.a.m;
/*     */       
/* 460 */       int i = xq.c(this.a.q - 2.0D + ☃.nextDouble() * 4.0D);
/* 461 */       int j = xq.c(this.a.r + ☃.nextDouble() * 3.0D);
/* 462 */       int k = xq.c(this.a.s - 2.0D + ☃.nextDouble() * 4.0D);
/* 463 */       el el = new el(i, j, k);
/* 464 */       blc blc = axy.a_(el);
/* 465 */       bcs bcs = blc.c();
/*     */       
/* 467 */       ceb ceb = axy.a(new cee((xq.c(this.a.q) + 0.5F), (j + 0.5F), (xq.c(this.a.s) + 0.5F)), new cee((i + 0.5F), (j + 0.5F), (k + 0.5F)), cec.a, true, false);
/* 468 */       boolean bool = (ceb != null && ceb.a().equals(el));
/*     */       
/* 470 */       if (bcs.a(wv.D) && bool) {
/* 471 */         this.a.b(blc);
/* 472 */         axy.g(el);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */