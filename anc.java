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
/*     */ public class anc
/*     */   extends ang
/*     */ {
/*  49 */   private static final or<Boolean> bF = ou.a((Class)anc.class, ot.i);
/*  50 */   private static final or<Integer> bG = ou.a((Class)anc.class, ot.b);
/*     */   
/*     */   protected float a;
/*     */   protected float b;
/*     */   protected float c;
/*     */   protected float bC;
/*     */   protected float bD;
/*     */   private afa bH;
/*     */   private int bI;
/*     */   private boolean bJ;
/*     */   protected ahr bE;
/*     */   
/*     */   protected anc(aev<?> ☃, axy axy1) {
/*  63 */     super(☃, axy1);
/*     */     
/*  65 */     this.b_ = 10;
/*  66 */     a(0.85F, 0.85F);
/*     */     
/*  68 */     this.g = new c(this);
/*     */     
/*  70 */     this.a = this.T.nextFloat();
/*  71 */     this.b = this.a;
/*     */   }
/*     */   
/*     */   public anc(axy ☃) {
/*  75 */     this(aev.C, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  80 */     ahi ☃ = new ahi(this, 1.0D);
/*  81 */     this.bE = new ahr(this, 1.0D, 80);
/*     */     
/*  83 */     this.by.a(4, new a(this));
/*  84 */     this.by.a(5, ☃);
/*  85 */     this.by.a(7, this.bE);
/*  86 */     this.by.a(8, new ahb(this, (Class)aog.class, 8.0F));
/*  87 */     this.by.a(8, new ahb(this, (Class)anc.class, 12.0F, 0.01F));
/*  88 */     this.by.a(9, new ahq(this));
/*     */ 
/*     */     
/*  91 */     this.bE.a(3);
/*  92 */     ☃.a(3);
/*     */     
/*  94 */     this.bz.a(1, new aio<>(this, afa.class, 10, true, false, new b(this)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  99 */     super.bZ();
/* 100 */     a(ank.f).a(6.0D);
/* 101 */     a(ank.d).a(0.5D);
/* 102 */     a(ank.b).a(16.0D);
/* 103 */     a(ank.a).a(30.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/* 108 */     return new aiz(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 113 */     super.x_();
/*     */     
/* 115 */     this.ab.a(bF, Boolean.valueOf(false));
/* 116 */     this.ab.a(bG, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ca() {
/* 121 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 126 */     return afd.e;
/*     */   }
/*     */   
/*     */   public boolean dB() {
/* 130 */     return ((Boolean)this.ab.<Boolean>a(bF)).booleanValue();
/*     */   }
/*     */   
/*     */   private void a(boolean ☃) {
/* 134 */     this.ab.b(bF, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int l() {
/* 138 */     return 80;
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 142 */     this.ab.b(bG, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean dC() {
/* 146 */     return (((Integer)this.ab.<Integer>a(bG)).intValue() != 0);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa dD() {
/* 151 */     if (!dC()) {
/* 152 */       return null;
/*     */     }
/* 154 */     if (this.m.B) {
/* 155 */       if (this.bH != null) {
/* 156 */         return this.bH;
/*     */       }
/* 158 */       aer ☃ = this.m.a(((Integer)this.ab.<Integer>a(bG)).intValue());
/* 159 */       if (☃ instanceof afa) {
/* 160 */         this.bH = (afa)☃;
/* 161 */         return this.bH;
/*     */       } 
/* 163 */       return null;
/*     */     } 
/* 165 */     return v();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 170 */     super.a(☃);
/*     */     
/* 172 */     if (bG.equals(☃)) {
/* 173 */       this.bI = 0;
/* 174 */       this.bH = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int z() {
/* 180 */     return 160;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 185 */     return aq() ? wj.dC : wj.dD;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 190 */     return aq() ? wj.dI : wj.dJ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 195 */     return aq() ? wj.dF : wj.dG;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/* 200 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 205 */     return this.I * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(el ☃, ayc ayc1) {
/* 210 */     if (ayc1.b(☃).a(ww.a)) {
/* 211 */       return 10.0F + ayc1.A(☃) - 0.5F;
/*     */     }
/* 213 */     return super.a(☃, ayc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 218 */     if (this.m.B) {
/*     */       
/* 220 */       this.b = this.a;
/* 221 */       if (!an()) {
/* 222 */         this.c = 2.0F;
/* 223 */         if (this.u > 0.0D && this.bJ && !ai()) {
/* 224 */           this.m.a(this.q, this.r, this.s, dA(), bV(), 1.0F, 1.0F, false);
/*     */         }
/* 226 */         this.bJ = (this.u < 0.0D && this.m.q((new el(this)).b()));
/* 227 */       } else if (dB()) {
/* 228 */         if (this.c < 0.5F) {
/* 229 */           this.c = 4.0F;
/*     */         } else {
/* 231 */           this.c += (0.5F - this.c) * 0.1F;
/*     */         } 
/*     */       } else {
/* 234 */         this.c += (0.125F - this.c) * 0.2F;
/*     */       } 
/* 236 */       this.a += this.c;
/*     */ 
/*     */       
/* 239 */       this.bD = this.bC;
/* 240 */       if (!aq()) {
/* 241 */         this.bC = this.T.nextFloat();
/* 242 */       } else if (dB()) {
/* 243 */         this.bC += (0.0F - this.bC) * 0.25F;
/*     */       } else {
/* 245 */         this.bC += (1.0F - this.bC) * 0.06F;
/*     */       } 
/*     */       
/* 248 */       if (dB() && an()) {
/* 249 */         cee ☃ = f(0.0F);
/* 250 */         for (int i = 0; i < 2; i++) {
/* 251 */           this.m.a(fm.e, this.q + (this.T.nextDouble() - 0.5D) * this.H - ☃.b * 1.5D, this.r + this.T.nextDouble() * this.I - ☃.c * 1.5D, this.s + (this.T.nextDouble() - 0.5D) * this.H - ☃.d * 1.5D, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       } 
/*     */       
/* 255 */       if (dC()) {
/* 256 */         if (this.bI < l()) {
/* 257 */           this.bI++;
/*     */         }
/* 259 */         afa ☃ = dD();
/* 260 */         if (☃ != null) {
/* 261 */           p().a(☃, 90.0F, 90.0F);
/* 262 */           p().a();
/*     */           
/* 264 */           double d1 = w(0.0F);
/* 265 */           double d2 = ☃.q - this.q;
/* 266 */           double d3 = ☃.r + (☃.I * 0.5F) - this.r + bF();
/* 267 */           double d4 = ☃.s - this.s;
/* 268 */           double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
/* 269 */           d2 /= d5;
/* 270 */           d3 /= d5;
/* 271 */           d4 /= d5;
/* 272 */           double d6 = this.T.nextDouble();
/* 273 */           while (d6 < d5) {
/* 274 */             d6 += 1.8D - d1 + this.T.nextDouble() * (1.7D - d1);
/* 275 */             this.m.a(fm.e, this.q + d2 * d6, this.r + d3 * d6 + bF(), this.s + d4 * d6, 0.0D, 0.0D, 0.0D);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 281 */     if (aq()) {
/* 282 */       i(300);
/*     */     }
/* 284 */     else if (this.A) {
/* 285 */       this.u += 0.5D;
/* 286 */       this.t += ((this.T.nextFloat() * 2.0F - 1.0F) * 0.4F);
/* 287 */       this.v += ((this.T.nextFloat() * 2.0F - 1.0F) * 0.4F);
/* 288 */       this.w = this.T.nextFloat() * 360.0F;
/* 289 */       this.A = false;
/* 290 */       this.al = true;
/*     */     } 
/*     */ 
/*     */     
/* 294 */     if (dC()) {
/* 295 */       this.w = this.aS;
/*     */     }
/*     */     
/* 298 */     super.k();
/*     */   }
/*     */   
/*     */   protected wi dA() {
/* 302 */     return wj.dH;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float w(float ☃) {
/* 314 */     return (this.bI + ☃) / l();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 320 */     return ccl.D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean K_() {
/* 325 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ayc ☃) {
/* 330 */     return (☃.a_(this, bD()) && ☃.c(this, bD()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 336 */     return ((this.T.nextInt(20) == 0 || !☃.z(new el(this))) && super.a(☃, bool));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 341 */     if (!dB() && !☃.t() && ☃.j() instanceof afa) {
/* 342 */       afa afa1 = (afa)☃.j();
/*     */ 
/*     */       
/* 345 */       if (!☃.d()) {
/* 346 */         afa1.a(aea.a(this), 2.0F);
/*     */       }
/*     */     } 
/*     */     
/* 350 */     if (this.bE != null) {
/* 351 */       this.bE.i();
/*     */     }
/*     */     
/* 354 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int K() {
/* 359 */     return 180;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 364 */     if (cP() && an()) {
/* 365 */       a(☃, f1, f2, 0.1F);
/* 366 */       a(afe.a, this.t, this.u, this.v);
/*     */       
/* 368 */       this.t *= 0.8999999761581421D;
/* 369 */       this.u *= 0.8999999761581421D;
/* 370 */       this.v *= 0.8999999761581421D;
/* 371 */       if (!dB() && v() == null) {
/* 372 */         this.u -= 0.005D;
/*     */       }
/*     */     } else {
/* 375 */       super.a(☃, f1, f2);
/*     */     } 
/*     */   }
/*     */   
/*     */   static class b implements Predicate<afa> {
/*     */     private final anc a;
/*     */     
/*     */     public b(anc ☃) {
/* 383 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable afa ☃) {
/* 388 */       return ((☃ instanceof aog || ☃ instanceof aki) && ☃.h(this.a) > 9.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends agt {
/*     */     private final anc a;
/*     */     private int b;
/*     */     private final boolean c;
/*     */     
/*     */     public a(anc ☃) {
/* 398 */       this.a = ☃;
/*     */ 
/*     */       
/* 401 */       this.c = ☃ instanceof amv;
/*     */       
/* 403 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 408 */       afa ☃ = this.a.v();
/* 409 */       return (☃ != null && ☃.aF());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 414 */       return (super.b() && (this.c || this.a.h(this.a.v()) > 9.0D));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 419 */       this.b = -10;
/* 420 */       this.a.t().q();
/* 421 */       this.a.p().a(this.a.v(), 90.0F, 90.0F);
/*     */ 
/*     */       
/* 424 */       this.a.al = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 429 */       anc.a(this.a, 0);
/* 430 */       this.a.e((afa)null);
/*     */       
/* 432 */       this.a.bE.i();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 437 */       afa ☃ = this.a.v();
/*     */       
/* 439 */       this.a.t().q();
/* 440 */       this.a.p().a(☃, 90.0F, 90.0F);
/*     */       
/* 442 */       if (!this.a.D(☃)) {
/* 443 */         this.a.e((afa)null);
/*     */         
/*     */         return;
/*     */       } 
/* 447 */       this.b++;
/* 448 */       if (this.b == 0) {
/*     */         
/* 450 */         anc.a(this.a, this.a.v().Q());
/* 451 */         this.a.m.a(this.a, (byte)21);
/* 452 */       } else if (this.b >= this.a.l()) {
/* 453 */         float f = 1.0F;
/* 454 */         if (this.a.m.aj() == adi.d) {
/* 455 */           f += 2.0F;
/*     */         }
/* 457 */         if (this.c) {
/* 458 */           f += 2.0F;
/*     */         }
/* 460 */         ☃.a(aea.c(this.a, this.a), f);
/* 461 */         ☃.a(aea.a(this.a), (float)this.a.a(ank.f).e());
/* 462 */         this.a.e((afa)null);
/*     */       } 
/*     */       
/* 465 */       super.e();
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends agb {
/*     */     private final anc i;
/*     */     
/*     */     public c(anc ☃) {
/* 473 */       super(☃);
/* 474 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 479 */       if (this.h != agb.a.b || this.i.t().p()) {
/*     */         
/* 481 */         this.i.o(0.0F);
/* 482 */         anc.a(this.i, false);
/*     */         
/*     */         return;
/*     */       } 
/* 486 */       double ☃ = this.b - this.i.q;
/* 487 */       double d1 = this.c - this.i.r;
/* 488 */       double d2 = this.d - this.i.s;
/* 489 */       double d3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/* 490 */       d1 /= d3;
/*     */       
/* 492 */       float f1 = (float)(xq.c(d2, ☃) * 57.2957763671875D) - 90.0F;
/*     */       
/* 494 */       this.i.w = a(this.i.w, f1, 90.0F);
/* 495 */       this.i.aQ = this.i.w;
/*     */       
/* 497 */       float f2 = (float)(this.e * this.i.a(ank.d).e());
/* 498 */       this.i.o(this.i.cK() + (f2 - this.i.cK()) * 0.125F);
/* 499 */       double d4 = Math.sin((this.i.U + this.i.Q()) * 0.5D) * 0.05D;
/* 500 */       double d5 = Math.cos((this.i.w * 0.017453292F));
/* 501 */       double d6 = Math.sin((this.i.w * 0.017453292F));
/* 502 */       this.i.t += d4 * d5;
/* 503 */       this.i.v += d4 * d6;
/*     */       
/* 505 */       d4 = Math.sin((this.i.U + this.i.Q()) * 0.75D) * 0.05D;
/* 506 */       this.i.u += d4 * (d6 + d5) * 0.25D;
/* 507 */       this.i.u += this.i.cK() * d1 * 0.1D;
/*     */       
/* 509 */       aga aga = this.i.p();
/* 510 */       double d7 = this.i.q + ☃ / d3 * 2.0D;
/* 511 */       double d8 = this.i.bF() + this.i.r + d1 / d3;
/* 512 */       double d9 = this.i.s + d2 / d3 * 2.0D;
/* 513 */       double d10 = aga.e();
/* 514 */       double d11 = aga.f();
/* 515 */       double d12 = aga.g();
/* 516 */       if (!aga.b()) {
/* 517 */         d10 = d7;
/* 518 */         d11 = d8;
/* 519 */         d12 = d9;
/*     */       } 
/* 521 */       this.i.p().a(d10 + (d7 - d10) * 0.125D, d11 + (d8 - d11) * 0.125D, d12 + (d9 - d12) * 0.125D, 10.0F, 40.0F);
/* 522 */       anc.a(this.i, true);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */