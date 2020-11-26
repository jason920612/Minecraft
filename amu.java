/*     */ import java.util.Random;
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
/*     */ public class amu
/*     */   extends anw
/*     */   implements anj
/*     */ {
/*     */   private boolean bC;
/*     */   protected final aiz a;
/*     */   protected final aiv b;
/*     */   
/*     */   public amu(axy ☃) {
/*  62 */     super(aev.o, ☃);
/*  63 */     this.Q = 1.0F;
/*  64 */     this.g = new e(this);
/*     */     
/*  66 */     a(cba.g, 0.0F);
/*  67 */     this.a = new aiz(this, ☃);
/*  68 */     this.b = new aiv(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l() {
/*  73 */     this.by.a(1, new d(this, 1.0D));
/*  74 */     this.by.a(2, new g(this, 1.0D, 40, 10.0F));
/*  75 */     this.by.a(2, new a(this, 1.0D, false));
/*  76 */     this.by.a(5, new c(this, 1.0D));
/*  77 */     this.by.a(6, new f(this, 1.0D, this.m.k()));
/*  78 */     this.by.a(7, new ahr(this, 1.0D));
/*     */     
/*  80 */     this.bz.a(1, new ail(this, true, new Class[] { amu.class }));
/*  81 */     this.bz.a(2, new aio<>(this, aog.class, 10, true, false, new b(this)));
/*  82 */     this.bz.a(3, new aio<>(this, aob.class, false));
/*  83 */     this.bz.a(3, new aio<>(this, ajw.class, true));
/*  84 */     this.bz.a(5, new aio<>(this, (Class)akk.class, 10, true, false, akk.bC));
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/*  89 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*  94 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/*  96 */     if (b(aew.b).a() && 
/*  97 */       this.T.nextFloat() < 0.03F) {
/*  98 */       a(aew.b, new ate(atf.eZ));
/*  99 */       this.bA[aew.b.b()] = 2.0F;
/*     */     } 
/*     */ 
/*     */     
/* 103 */     return afj1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 108 */     ayu ayu = ☃.d(new el(this.q, this.r, this.s));
/* 109 */     if (ayu == ayz.i || ayu == ayz.m) {
/* 110 */       return (this.T.nextInt(15) == 0 && super.a(☃, bool));
/*     */     }
/* 112 */     return (this.T.nextInt(40) == 0 && dF() && super.a(☃, bool));
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean dF() {
/* 117 */     return ((bD()).b < (this.m.k() - 5));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dz() {
/* 122 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 128 */     return ccl.aM;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 133 */     if (an()) {
/* 134 */       return wj.bu;
/*     */     }
/* 136 */     return wj.bt;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 141 */     if (an()) {
/* 142 */       return wj.by;
/*     */     }
/* 144 */     return wj.bx;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 149 */     if (an()) {
/* 150 */       return wj.bw;
/*     */     }
/* 152 */     return wj.bv;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dA() {
/* 157 */     return wj.bA;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi ad() {
/* 162 */     return wj.bB;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate dB() {
/* 167 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adj ☃) {
/* 172 */     if (this.T.nextFloat() > 0.9D) {
/* 173 */       int i = this.T.nextInt(16);
/* 174 */       if (i < 10) {
/* 175 */         a(aew.a, new ate(atf.eX));
/*     */       } else {
/* 177 */         a(aew.a, new ate(atf.aY));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(ate ☃, ate ate1, aew aew1) {
/* 184 */     if (ate1.b() == atf.eZ) {
/* 185 */       return false;
/*     */     }
/*     */     
/* 188 */     if (ate1.b() == atf.eX) {
/* 189 */       if (☃.b() == atf.eX) {
/* 190 */         return (☃.g() < ate1.g());
/*     */       }
/*     */       
/* 193 */       return false;
/* 194 */     }  if (☃.b() == atf.eX) {
/* 195 */       return true;
/*     */     }
/*     */     
/* 198 */     return super.a(☃, ate1, aew1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dC() {
/* 203 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ayc ☃) {
/* 208 */     return (☃.a_(this, bD()) && ☃.c(this, bD()));
/*     */   }
/*     */   
/*     */   public boolean f(@Nullable afa ☃) {
/* 212 */     if (☃ != null) {
/* 213 */       if (this.m.L() && !☃.an()) {
/* 214 */         return false;
/*     */       }
/*     */       
/* 217 */       return true;
/*     */     } 
/* 219 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bw() {
/* 224 */     return !bb();
/*     */   }
/*     */   
/*     */   private boolean dI() {
/* 228 */     if (this.bC) {
/* 229 */       return true;
/*     */     }
/*     */     
/* 232 */     afa ☃ = v();
/* 233 */     if (☃ != null && ☃.an()) {
/* 234 */       return true;
/*     */     }
/*     */     
/* 237 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 242 */     if (cP() && an() && dI()) {
/* 243 */       a(☃, f1, f2, 0.01F);
/* 244 */       a(afe.a, this.t, this.u, this.v);
/*     */       
/* 246 */       this.t *= 0.8999999761581421D;
/* 247 */       this.u *= 0.8999999761581421D;
/* 248 */       this.v *= 0.8999999761581421D;
/*     */     } else {
/* 250 */       super.a(☃, f1, f2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void as() {
/* 256 */     if (!this.m.B) {
/* 257 */       if (cP() && an() && dI()) {
/* 258 */         this.bx = this.a;
/* 259 */         g(true);
/*     */       } else {
/* 261 */         this.bx = this.b;
/* 262 */         g(false);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean dD() {
/* 268 */     cbe ☃ = t().m();
/* 269 */     if (☃ != null) {
/* 270 */       cbc cbc = ☃.i();
/* 271 */       if (cbc != null) {
/* 272 */         double d = d(cbc.a, cbc.b, cbc.c);
/* 273 */         if (d < 4.0D) {
/* 274 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 278 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 283 */     ape ape = new ape(this.m, this, new ate(atf.eX));
/*     */     
/* 285 */     double d1 = ☃.q - this.q;
/* 286 */     double d2 = (☃.bD()).b + (☃.I / 3.0F) - ape.r;
/* 287 */     double d3 = ☃.s - this.s;
/* 288 */     double d4 = xq.a(d1 * d1 + d3 * d3);
/* 289 */     ape.c(d1, d2 + d4 * 0.20000000298023224D, d3, 1.6F, (14 - this.m.aj().a() * 4));
/* 290 */     a(wj.bz, 1.0F, 1.0F / (ce().nextFloat() * 0.4F + 0.8F));
/* 291 */     this.m.a(ape);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 295 */     this.bC = ☃;
/*     */   }
/*     */   
/*     */   static class g extends aht {
/*     */     private final amu a;
/*     */     
/*     */     public g(anj ☃, double d, int i, float f) {
/* 302 */       super(☃, d, i, f);
/* 303 */       this.a = (amu)☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 308 */       return (super.a() && this.a.cB().b() == atf.eX);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 313 */       super.c();
/* 314 */       this.a.s(true);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 319 */       super.d();
/* 320 */       this.a.s(false);
/*     */     }
/*     */   }
/*     */   
/*     */   static class f extends agt {
/*     */     private final amu a;
/*     */     private final double b;
/*     */     private final int c;
/*     */     private boolean d;
/*     */     
/*     */     public f(amu ☃, double d, int i) {
/* 331 */       this.a = ☃;
/* 332 */       this.b = d;
/* 333 */       this.c = i;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 338 */       return (!this.a.m.L() && this.a.an() && this.a.r < (this.c - 2));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 343 */       return (a() && !this.d);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 348 */       if (this.a.r < (this.c - 1) && (this.a.t().p() || this.a.dD())) {
/*     */         
/* 350 */         cee ☃ = ajd.a(this.a, 4, 8, new cee(this.a.q, (this.c - 1), this.a.s));
/*     */         
/* 352 */         if (☃ == null) {
/* 353 */           this.d = true;
/*     */           
/*     */           return;
/*     */         } 
/* 357 */         this.a.t().a(☃.b, ☃.c, ☃.d, this.b);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 363 */       this.a.a(true);
/* 364 */       this.d = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 369 */       this.a.a(false);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends ahh {
/*     */     private final amu f;
/*     */     
/*     */     public c(amu ☃, double d) {
/* 378 */       super(☃, d, 8, 2);
/* 379 */       this.f = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 384 */       return (super.a() && !this.f.m.L() && this.f.an() && this.f.r >= (this.f.m.k() - 3));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 389 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(ayc ☃, el el1) {
/* 394 */       el el2 = el1.a();
/* 395 */       if (!☃.c(el2) || !☃.c(el2.a())) {
/* 396 */         return false;
/*     */       }
/*     */       
/* 399 */       return ☃.a_(el1).q();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 404 */       this.f.a(false);
/* 405 */       amu.a(this.f, this.f.b);
/* 406 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 411 */       super.d();
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends agt {
/*     */     private final afg a;
/*     */     private double b;
/*     */     private double c;
/*     */     private double d;
/*     */     private final double e;
/*     */     private final axy f;
/*     */     
/*     */     public d(afg ☃, double d1) {
/* 424 */       this.a = ☃;
/* 425 */       this.e = d1;
/* 426 */       this.f = ☃.m;
/* 427 */       a(1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 432 */       if (!this.f.L()) {
/* 433 */         return false;
/*     */       }
/* 435 */       if (this.a.an()) {
/* 436 */         return false;
/*     */       }
/*     */       
/* 439 */       cee ☃ = g();
/* 440 */       if (☃ == null) {
/* 441 */         return false;
/*     */       }
/* 443 */       this.b = ☃.b;
/* 444 */       this.c = ☃.c;
/* 445 */       this.d = ☃.d;
/* 446 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 451 */       return !this.a.t().p();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 456 */       this.a.t().a(this.b, this.c, this.d, this.e);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private cee g() {
/* 461 */       Random ☃ = this.a.ce();
/* 462 */       el el = new el(this.a.q, (this.a.bD()).b, this.a.s);
/*     */       
/* 464 */       for (int i = 0; i < 10; i++) {
/* 465 */         el el1 = el.a(☃.nextInt(20) - 10, 2 - ☃.nextInt(8), ☃.nextInt(20) - 10);
/*     */         
/* 467 */         if (this.f.a_(el1).c() == bct.A) {
/* 468 */           return new cee(el1.o(), el1.p(), el1.q());
/*     */         }
/*     */       } 
/* 471 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends aii {
/*     */     private final amu d;
/*     */     
/*     */     public a(amu ☃, double d, boolean bool) {
/* 479 */       super(☃, d, bool);
/* 480 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 485 */       return (super.a() && this.d.f(this.d.v()));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 490 */       return (super.b() && this.d.f(this.d.v()));
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends agb {
/*     */     private final amu i;
/*     */     
/*     */     public e(amu ☃) {
/* 498 */       super(☃);
/* 499 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 504 */       afa ☃ = this.i.v();
/* 505 */       if (amu.a(this.i) && this.i.an()) {
/* 506 */         if ((☃ != null && ☃.r > this.i.r) || amu.b(this.i)) {
/* 507 */           this.i.u += 0.002D;
/*     */         }
/*     */         
/* 510 */         if (this.h != agb.a.b || this.i.t().p()) {
/* 511 */           this.i.o(0.0F);
/*     */           
/*     */           return;
/*     */         } 
/* 515 */         double d1 = this.b - this.i.q;
/* 516 */         double d2 = this.c - this.i.r;
/* 517 */         double d3 = this.d - this.i.s;
/* 518 */         double d4 = xq.a(d1 * d1 + d2 * d2 + d3 * d3);
/* 519 */         d2 /= d4;
/*     */         
/* 521 */         float f1 = (float)(xq.c(d3, d1) * 57.2957763671875D) - 90.0F;
/* 522 */         this.i.w = a(this.i.w, f1, 90.0F);
/* 523 */         this.i.aQ = this.i.w;
/*     */         
/* 525 */         float f2 = (float)(this.e * this.i.a(ank.d).e());
/* 526 */         this.i.o(this.i.cK() + (f2 - this.i.cK()) * 0.125F);
/* 527 */         this.i.u += this.i.cK() * d2 * 0.1D;
/* 528 */         this.i.t += this.i.cK() * d1 * 0.005D;
/* 529 */         this.i.v += this.i.cK() * d3 * 0.005D;
/*     */       } else {
/* 531 */         if (!this.i.A) {
/* 532 */           this.i.u -= 0.008D;
/*     */         }
/* 534 */         super.a();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class b implements Predicate<aog> {
/*     */     private final amu a;
/*     */     
/*     */     public b(amu ☃) {
/* 543 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable aog ☃) {
/* 548 */       return this.a.f(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */