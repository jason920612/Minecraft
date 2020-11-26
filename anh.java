/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class anh
/*     */   extends aey
/*     */   implements amy
/*     */ {
/*  44 */   private static final or<Integer> a = ou.a((Class)anh.class, ot.b);
/*     */   
/*  46 */   private cee b = cee.a;
/*  47 */   private el c = el.a;
/*     */   
/*     */   enum a {
/*  50 */     a,
/*  51 */     b;
/*     */   }
/*     */   
/*  54 */   private a bC = a.a;
/*     */   
/*     */   public anh(axy ☃) {
/*  57 */     super(aev.aM, ☃);
/*  58 */     this.b_ = 5;
/*     */     
/*  60 */     a(0.9F, 0.5F);
/*     */     
/*  62 */     this.g = new g(this, this);
/*  63 */     this.f = new f(this, this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected afv o() {
/*  68 */     return new d(this, this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  73 */     this.by.a(1, new c());
/*  74 */     this.by.a(2, new i());
/*  75 */     this.by.a(3, new e());
/*     */     
/*  77 */     this.bz.a(1, new b());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  82 */     super.bZ();
/*     */     
/*  84 */     cz().b(ank.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  89 */     super.x_();
/*     */     
/*  91 */     this.ab.a(a, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  95 */     if (☃ < 0) {
/*  96 */       ☃ = 0;
/*  97 */     } else if (☃ > 64) {
/*  98 */       ☃ = 64;
/*     */     } 
/* 100 */     this.ab.b(a, Integer.valueOf(☃));
/* 101 */     l();
/*     */   }
/*     */   
/*     */   public void l() {
/* 105 */     int ☃ = ((Integer)this.ab.<Integer>a(a)).intValue();
/* 106 */     a(0.9F + 0.2F * ☃, 0.5F + 0.1F * ☃);
/* 107 */     a(ank.f).a((6 + ☃));
/*     */   }
/*     */   
/*     */   public int dr() {
/* 111 */     return ((Integer)this.ab.<Integer>a(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 116 */     return this.I * 0.35F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 121 */     if (a.equals(☃)) {
/* 122 */       l();
/*     */     }
/*     */     
/* 125 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 130 */     super.R_();
/*     */     
/* 132 */     if (this.m.B) {
/* 133 */       float ☃ = xq.b((Q() * 3 + this.U) * 0.13F + 3.1415927F);
/* 134 */       float f1 = xq.b((Q() * 3 + this.U + 1) * 0.13F + 3.1415927F);
/* 135 */       if (☃ > 0.0F && f1 <= 0.0F) {
/* 136 */         this.m.a(this.q, this.r, this.s, wj.gB, bV(), 0.95F + this.T.nextFloat() * 0.05F, 0.95F + this.T.nextFloat() * 0.05F, false);
/*     */       }
/*     */       
/* 139 */       int i = dr();
/* 140 */       float f2 = xq.b(this.w * 0.017453292F) * (1.3F + 0.21F * i);
/* 141 */       float f3 = xq.a(this.w * 0.017453292F) * (1.3F + 0.21F * i);
/* 142 */       float f4 = (0.3F + ☃ * 0.45F) * (i * 0.2F + 1.0F);
/* 143 */       this.m.a(fm.H, this.q + f2, this.r + f4, this.s + f3, 0.0D, 0.0D, 0.0D);
/* 144 */       this.m.a(fm.H, this.q - f2, this.r + f4, this.s - f3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 147 */     if (!this.m.B && this.m.aj() == adi.a) {
/* 148 */       V();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 154 */     if (dq()) {
/* 155 */       f(8);
/*     */     }
/* 157 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 162 */     super.J();
/*     */   }
/*     */ 
/*     */   
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 167 */     this.c = (new el(this)).b(5);
/* 168 */     a(0);
/*     */     
/* 170 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 175 */     super.a(☃);
/*     */     
/* 177 */     if (☃.e("AX")) {
/* 178 */       this.c = new el(☃.h("AX"), ☃.h("AY"), ☃.h("AZ"));
/*     */     }
/* 180 */     a(☃.h("Size"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 185 */     super.b(☃);
/*     */     
/* 187 */     ☃.b("AX", this.c.o());
/* 188 */     ☃.b("AY", this.c.p());
/* 189 */     ☃.b("AZ", this.c.q());
/* 190 */     ☃.b("Size", dr());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public wk bV() {
/* 200 */     return wk.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 205 */     return wj.gy;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 210 */     return wj.gC;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 215 */     return wj.gA;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 221 */     return ccl.K;
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 226 */     return afd.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/* 231 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(Class<? extends afa> ☃) {
/* 236 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   class g
/*     */     extends agb
/*     */   {
/* 244 */     private float j = 0.1F;
/*     */     
/*     */     public g(anh this$0, afb ☃) {
/* 247 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 252 */       if (this.i.B) {
/*     */         
/* 254 */         this.i.w += 180.0F;
/* 255 */         this.j = 0.1F;
/*     */       } 
/*     */ 
/*     */       
/* 259 */       float ☃ = (float)((anh.a(this.i)).b - this.i.q);
/* 260 */       float f1 = (float)((anh.a(this.i)).c - this.i.r);
/* 261 */       float f2 = (float)((anh.a(this.i)).d - this.i.s);
/* 262 */       double d1 = xq.c(☃ * ☃ + f2 * f2);
/* 263 */       double d2 = 1.0D - xq.e(f1 * 0.7F) / d1;
/* 264 */       ☃ = (float)(☃ * d2);
/* 265 */       f2 = (float)(f2 * d2);
/* 266 */       d1 = xq.c(☃ * ☃ + f2 * f2);
/* 267 */       double d3 = xq.c(☃ * ☃ + f2 * f2 + f1 * f1);
/*     */ 
/*     */       
/* 270 */       float f3 = this.i.w;
/* 271 */       float f4 = (float)xq.c(f2, ☃);
/* 272 */       float f5 = xq.g(this.i.w + 90.0F);
/* 273 */       float f6 = xq.g(f4 * 57.295776F);
/* 274 */       this.i.w = xq.c(f5, f6, 4.0F) - 90.0F;
/* 275 */       this.i.aQ = this.i.w;
/*     */       
/* 277 */       if (xq.d(f3, this.i.w) < 3.0F) {
/* 278 */         this.j = xq.b(this.j, 1.8F, 0.005F * 1.8F / this.j);
/*     */       } else {
/* 280 */         this.j = xq.b(this.j, 0.2F, 0.025F);
/*     */       } 
/*     */       
/* 283 */       float f7 = (float)-(xq.c(-f1, d1) * 57.2957763671875D);
/* 284 */       this.i.x = f7;
/*     */       
/* 286 */       float f8 = this.i.w + 90.0F;
/* 287 */       double d4 = (this.j * xq.b(f8 * 0.017453292F)) * Math.abs(☃ / d3);
/* 288 */       double d5 = (this.j * xq.a(f8 * 0.017453292F)) * Math.abs(f2 / d3);
/* 289 */       double d6 = (this.j * xq.a(f7 * 0.017453292F)) * Math.abs(f1 / d3);
/* 290 */       this.i.t += (d4 - this.i.t) * 0.2D;
/* 291 */       this.i.u += (d6 - this.i.u) * 0.2D;
/* 292 */       this.i.v += (d5 - this.i.v) * 0.2D;
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends afv {
/*     */     public d(anh this$0, afa ☃) {
/* 298 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 303 */       this.a.aS = this.a.aQ;
/* 304 */       this.a.aQ = this.a.w;
/*     */     }
/*     */   }
/*     */   
/*     */   class f extends aga {
/*     */     public f(anh this$0, afb ☃) {
/* 310 */       super(☃);
/*     */     }
/*     */     
/*     */     public void a() {}
/*     */   }
/*     */   
/*     */   abstract class h
/*     */     extends agt
/*     */   {
/*     */     public h(anh this$0) {
/* 320 */       a(1);
/*     */     }
/*     */     
/*     */     protected boolean g() {
/* 324 */       return (anh.a(this.b).c(this.b.q, this.b.r, this.b.s) < 4.0D);
/*     */     } }
/*     */   
/*     */   class e extends h {
/*     */     private float c;
/*     */     private float d;
/*     */     private float e;
/*     */     private float f;
/*     */     
/*     */     private e(anh this$0) {}
/*     */     
/*     */     public boolean a() {
/* 336 */       return (this.a.v() == null || anh.b(this.a) == anh.a.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 341 */       this.d = 5.0F + anh.c(this.a).nextFloat() * 10.0F;
/* 342 */       this.e = -4.0F + anh.d(this.a).nextFloat() * 9.0F;
/* 343 */       this.f = anh.e(this.a).nextBoolean() ? 1.0F : -1.0F;
/* 344 */       i();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 349 */       if (anh.f(this.a).nextInt(350) == 0) {
/* 350 */         this.e = -4.0F + anh.g(this.a).nextFloat() * 9.0F;
/*     */       }
/* 352 */       if (anh.h(this.a).nextInt(250) == 0) {
/* 353 */         this.d++;
/* 354 */         if (this.d > 15.0F) {
/* 355 */           this.d = 5.0F;
/* 356 */           this.f = -this.f;
/*     */         } 
/*     */       } 
/* 359 */       if (anh.i(this.a).nextInt(450) == 0) {
/* 360 */         this.c = anh.j(this.a).nextFloat() * 2.0F * 3.1415927F;
/* 361 */         i();
/*     */       } 
/* 363 */       if (g()) {
/* 364 */         i();
/*     */       }
/*     */       
/* 367 */       if ((anh.a(this.a)).c < this.a.r && !this.a.m.c((new el(this.a)).c(1))) {
/* 368 */         this.e = Math.max(1.0F, this.e);
/* 369 */         i();
/*     */       } 
/*     */       
/* 372 */       if ((anh.a(this.a)).c > this.a.r && !this.a.m.c((new el(this.a)).b(1))) {
/* 373 */         this.e = Math.min(-1.0F, this.e);
/* 374 */         i();
/*     */       } 
/*     */     }
/*     */     
/*     */     private void i() {
/* 379 */       if (el.a.equals(anh.k(this.a))) {
/* 380 */         anh.a(this.a, new el(this.a));
/*     */       }
/* 382 */       this.c += this.f * 15.0F * 0.017453292F;
/* 383 */       anh.a(this.a, (new cee(anh.k(this.a))).b((this.d * xq.b(this.c)), (-4.0F + this.e), (this.d * xq.a(this.c))));
/*     */     }
/*     */   }
/*     */   
/*     */   class i
/*     */     extends h {
/*     */     public boolean a() {
/* 390 */       return (this.a.v() != null && anh.b(this.a) == anh.a.b);
/*     */     }
/*     */     private i(anh this$0) {}
/*     */     
/*     */     public boolean b() {
/* 395 */       afa ☃ = this.a.v();
/* 396 */       if (☃ == null) {
/* 397 */         return false;
/*     */       }
/* 399 */       if (!☃.aF()) {
/* 400 */         return false;
/*     */       }
/* 402 */       if (☃ instanceof aog && (((aog)☃).t() || ((aog)☃).u())) {
/* 403 */         return false;
/*     */       }
/*     */       
/* 406 */       return a();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void c() {}
/*     */ 
/*     */     
/*     */     public void d() {
/* 415 */       this.a.e((afa)null);
/* 416 */       anh.a(this.a, anh.a.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 421 */       afa ☃ = this.a.v();
/* 422 */       anh.a(this.a, new cee(☃.q, ☃.r + ☃.I * 0.5D, ☃.s));
/*     */       
/* 424 */       if (this.a.bD().g(0.20000000298023224D).c(☃.bD())) {
/* 425 */         this.a.B(☃);
/* 426 */         anh.a(this.a, anh.a.a);
/* 427 */         this.a.m.b(1039, new el(this.a), 0);
/* 428 */       } else if (this.a.B || this.a.aB > 0) {
/* 429 */         anh.a(this.a, anh.a.a);
/*     */       } 
/*     */     } }
/*     */   
/*     */   class c extends agt {
/*     */     private int b;
/*     */     
/*     */     private c(anh this$0) {}
/*     */     
/*     */     public boolean a() {
/* 439 */       return ais.a(this.a, this.a.v(), false, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 444 */       this.b = 10;
/* 445 */       anh.a(this.a, anh.a.a);
/* 446 */       g();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 451 */       anh.a(this.a, this.a.m.a(bor.a.d, anh.k(this.a)).b(10 + anh.l(this.a).nextInt(20)));
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 456 */       if (anh.b(this.a) == anh.a.a) {
/* 457 */         this.b--;
/* 458 */         if (this.b <= 0) {
/* 459 */           anh.a(this.a, anh.a.b);
/* 460 */           g();
/* 461 */           this.b = (8 + anh.m(this.a).nextInt(4)) * 20;
/*     */           
/* 463 */           this.a.a(wj.gD, 10.0F, 0.95F + anh.n(this.a).nextFloat() * 0.1F);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private void g() {
/* 469 */       anh.a(this.a, (new el(this.a.v())).b(20 + anh.o(this.a).nextInt(20)));
/* 470 */       if (anh.k(this.a).p() < this.a.m.k())
/* 471 */         anh.a(this.a, new el(anh.k(this.a).o(), this.a.m.k() + 1, anh.k(this.a).q())); 
/*     */     }
/*     */   }
/*     */   
/*     */   class b
/*     */     extends agt
/*     */   {
/* 478 */     private int b = 20;
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 482 */       if (this.b > 0) {
/* 483 */         this.b--;
/* 484 */         return false;
/*     */       } 
/* 486 */       this.b = 60;
/*     */       
/* 488 */       cea ☃ = this.a.bD().c(16.0D, 64.0D, 16.0D);
/* 489 */       List<aog> list = this.a.m.a(aog.class, ☃);
/* 490 */       if (!list.isEmpty()) {
/*     */         
/* 492 */         list.sort((☃, aog1) -> (☃.r > aog1.r) ? -1 : 1);
/* 493 */         for (aog aog : list) {
/* 494 */           if (ais.a(this.a, aog, false, false)) {
/* 495 */             this.a.e(aog);
/* 496 */             return true;
/*     */           } 
/*     */         } 
/*     */       } 
/* 500 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 505 */       return ais.a(this.a, this.a.v(), false, false);
/*     */     }
/*     */     
/*     */     private b(anh this$0) {}
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */