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
/*     */ public class ana
/*     */   extends aey
/*     */   implements amy
/*     */ {
/*  36 */   private static final or<Boolean> a = ou.a((Class)ana.class, ot.i);
/*     */   
/*  38 */   private int b = 1;
/*     */   
/*     */   public ana(axy ☃) {
/*  41 */     super(aev.A, ☃);
/*  42 */     a(4.0F, 4.0F);
/*  43 */     this.aa = true;
/*  44 */     this.b_ = 5;
/*     */     
/*  46 */     this.g = new b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  51 */     this.by.a(5, new d(this));
/*     */     
/*  53 */     this.by.a(7, new a(this));
/*  54 */     this.by.a(7, new c(this));
/*     */     
/*  56 */     this.bz.a(1, new ain(this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/*  64 */     this.ab.b(a, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int dr() {
/*  68 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  73 */     super.R_();
/*     */     
/*  75 */     if (!this.m.B && this.m.aj() == adi.a) {
/*  76 */       V();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/*  82 */     if (b(☃)) {
/*  83 */       return false;
/*     */     }
/*  85 */     if (☃.j() instanceof aor && 
/*  86 */       ☃.k() instanceof aog) {
/*     */       
/*  88 */       super.a(☃, 1000.0F);
/*  89 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  93 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  98 */     super.x_();
/*     */     
/* 100 */     this.ab.a(a, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 105 */     super.bZ();
/*     */     
/* 107 */     a(ank.a).a(10.0D);
/* 108 */     a(ank.b).a(100.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/* 113 */     return wk.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 118 */     return wj.cX;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 123 */     return wj.cZ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 128 */     return wj.cY;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 134 */     return ccl.aq;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/* 139 */     return 10.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 144 */     return (this.T.nextInt(20) == 0 && super.a(☃, bool) && ☃.aj() != adi.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public int dg() {
/* 149 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 154 */     super.b(☃);
/* 155 */     ☃.b("ExplosionPower", this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 160 */     super.a(☃);
/* 161 */     if (☃.c("ExplosionPower", 99))
/* 162 */       this.b = ☃.h("ExplosionPower"); 
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends agb {
/*     */     private final ana i;
/*     */     private int j;
/*     */     
/*     */     public b(ana ☃) {
/* 171 */       super(☃);
/* 172 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 177 */       if (this.h != agb.a.b) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 182 */       double ☃ = this.b - this.i.q;
/* 183 */       double d1 = this.c - this.i.r;
/* 184 */       double d2 = this.d - this.i.s;
/*     */       
/* 186 */       double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/*     */       
/* 188 */       if (this.j-- <= 0) {
/* 189 */         this.j += this.i.ce().nextInt(5) + 2;
/*     */         
/* 191 */         d3 = xq.a(d3);
/*     */         
/* 193 */         if (b(this.b, this.c, this.d, d3)) {
/* 194 */           this.i.t += ☃ / d3 * 0.1D;
/* 195 */           this.i.u += d1 / d3 * 0.1D;
/* 196 */           this.i.v += d2 / d3 * 0.1D;
/*     */         } else {
/* 198 */           this.h = agb.a.a;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean b(double ☃, double d1, double d2, double d3) {
/* 204 */       double d4 = (☃ - this.i.q) / d3;
/* 205 */       double d5 = (d1 - this.i.r) / d3;
/* 206 */       double d6 = (d2 - this.i.s) / d3;
/*     */       
/* 208 */       cea cea = this.i.bD();
/* 209 */       for (int i = 1; i < d3; i++) {
/* 210 */         cea = cea.d(d4, d5, d6);
/* 211 */         if (!this.i.m.c(this.i, cea)) {
/* 212 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 216 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends agt {
/*     */     private final ana a;
/*     */     
/*     */     public d(ana ☃) {
/* 224 */       this.a = ☃;
/*     */       
/* 226 */       a(1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 231 */       agb ☃ = this.a.r();
/* 232 */       if (!☃.b()) {
/* 233 */         return true;
/*     */       }
/*     */       
/* 236 */       double d1 = ☃.d() - this.a.q;
/* 237 */       double d2 = ☃.e() - this.a.r;
/* 238 */       double d3 = ☃.f() - this.a.s;
/*     */       
/* 240 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */       
/* 242 */       if (d4 < 1.0D || d4 > 3600.0D) {
/* 243 */         return true;
/*     */       }
/*     */       
/* 246 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 251 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 256 */       Random ☃ = this.a.ce();
/* 257 */       double d1 = this.a.q + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 258 */       double d2 = this.a.r + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 259 */       double d3 = this.a.s + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 260 */       this.a.r().a(d1, d2, d3, 1.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends agt {
/*     */     private final ana a;
/*     */     
/*     */     public a(ana ☃) {
/* 268 */       this.a = ☃;
/*     */       
/* 270 */       a(2);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 275 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 280 */       if (this.a.v() == null) {
/* 281 */         this.a.w = -((float)xq.c(this.a.t, this.a.v)) * 57.295776F;
/* 282 */         this.a.aQ = this.a.w;
/*     */       } else {
/* 284 */         afa ☃ = this.a.v();
/*     */         
/* 286 */         double d = 64.0D;
/* 287 */         if (☃.h(this.a) < 4096.0D) {
/* 288 */           double d1 = ☃.q - this.a.q;
/* 289 */           double d2 = ☃.s - this.a.s;
/* 290 */           this.a.w = -((float)xq.c(d1, d2)) * 57.295776F;
/* 291 */           this.a.aQ = this.a.w;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends agt {
/*     */     private final ana b;
/*     */     public int a;
/*     */     
/*     */     public c(ana ☃) {
/* 302 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 307 */       return (this.b.v() != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 312 */       this.a = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 317 */       this.b.a(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 322 */       afa ☃ = this.b.v();
/*     */       
/* 324 */       double d = 64.0D;
/* 325 */       if (☃.h(this.b) < 4096.0D && this.b.D(☃)) {
/* 326 */         axy axy = this.b.m;
/*     */         
/* 328 */         this.a++;
/* 329 */         if (this.a == 10) {
/* 330 */           axy.a((aog)null, 1015, new el(this.b), 0);
/*     */         }
/* 332 */         if (this.a == 20) {
/* 333 */           double d1 = 4.0D;
/* 334 */           cee cee = this.b.f(1.0F);
/*     */           
/* 336 */           double d2 = ☃.q - this.b.q + cee.b * 4.0D;
/* 337 */           double d3 = (☃.bD()).b + (☃.I / 2.0F) - 0.5D + this.b.r + (this.b.I / 2.0F);
/* 338 */           double d4 = ☃.s - this.b.s + cee.d * 4.0D;
/*     */           
/* 340 */           axy.a((aog)null, 1016, new el(this.b), 0);
/* 341 */           aor aor = new aor(axy, this.b, d2, d3, d4);
/* 342 */           aor.e = this.b.dr();
/* 343 */           aor.q = this.b.q + cee.b * 4.0D;
/* 344 */           aor.r = this.b.r + (this.b.I / 2.0F) + 0.5D;
/* 345 */           aor.s = this.b.s + cee.d * 4.0D;
/* 346 */           axy.a(aor);
/* 347 */           this.a = -40;
/*     */         } 
/* 349 */       } else if (this.a > 0) {
/* 350 */         this.a--;
/*     */       } 
/* 352 */       this.b.a((this.a > 10));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 358 */     return 2.6F;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ana.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */