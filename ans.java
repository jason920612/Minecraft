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
/*     */ public class ans
/*     */   extends ang
/*     */ {
/*  40 */   protected static final or<Byte> a = ou.a((Class)ans.class, ot.a);
/*     */   
/*     */   private afb b;
/*     */   
/*     */   @Nullable
/*     */   private el c;
/*     */   
/*     */   private boolean bC;
/*     */   private int bD;
/*     */   
/*     */   public ans(axy ☃) {
/*  51 */     super(aev.aA, ☃);
/*     */     
/*  53 */     this.aa = true;
/*  54 */     this.g = new c(this, this);
/*  55 */     a(0.4F, 0.8F);
/*     */     
/*  57 */     this.b_ = 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afe ☃, double d1, double d2, double d3) {
/*  62 */     super.a(☃, d1, d2, d3);
/*     */     
/*  64 */     ag();
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  69 */     this.R = true;
/*  70 */     super.R_();
/*  71 */     this.R = false;
/*     */     
/*  73 */     d(true);
/*     */     
/*  75 */     if (this.bC && 
/*  76 */       --this.bD <= 0) {
/*  77 */       this.bD = 20;
/*  78 */       a(aea.i, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void n() {
/*  85 */     super.n();
/*     */     
/*  87 */     this.by.a(0, new agm(this));
/*  88 */     this.by.a(4, new a(this));
/*  89 */     this.by.a(8, new d(this));
/*  90 */     this.by.a(9, new ahb(this, (Class)aog.class, 3.0F, 1.0F));
/*  91 */     this.by.a(10, new ahb(this, (Class)afb.class, 8.0F));
/*     */     
/*  93 */     this.bz.a(1, new ail(this, true, new Class[] { ans.class }));
/*  94 */     this.bz.a(2, new b(this, this));
/*  95 */     this.bz.a(3, new aio<>(this, aog.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 100 */     super.bZ();
/*     */     
/* 102 */     a(ank.a).a(14.0D);
/* 103 */     a(ank.f).a(4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 108 */     super.x_();
/*     */     
/* 110 */     this.ab.a(a, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 115 */     super.a(☃);
/*     */     
/* 117 */     if (☃.e("BoundX")) {
/* 118 */       this.c = new el(☃.h("BoundX"), ☃.h("BoundY"), ☃.h("BoundZ"));
/*     */     }
/* 120 */     if (☃.e("LifeTicks")) {
/* 121 */       a(☃.h("LifeTicks"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 127 */     super.b(☃);
/*     */     
/* 129 */     if (this.c != null) {
/* 130 */       ☃.b("BoundX", this.c.o());
/* 131 */       ☃.b("BoundY", this.c.p());
/* 132 */       ☃.b("BoundZ", this.c.q());
/*     */     } 
/* 134 */     if (this.bC) {
/* 135 */       ☃.b("LifeTicks", this.bD);
/*     */     }
/*     */   }
/*     */   
/*     */   public afb l() {
/* 140 */     return this.b;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public el dz() {
/* 145 */     return this.c;
/*     */   }
/*     */   
/*     */   public void g(@Nullable el ☃) {
/* 149 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃) {
/* 153 */     int i = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 154 */     return ((i & ☃) != 0);
/*     */   }
/*     */   
/*     */   private void a(int ☃, boolean bool) {
/* 158 */     int i = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 159 */     if (bool) {
/* 160 */       i |= ☃;
/*     */     } else {
/* 162 */       i &= ☃ ^ 0xFFFFFFFF;
/*     */     } 
/* 164 */     this.ab.b(a, Byte.valueOf((byte)(i & 0xFF)));
/*     */   }
/*     */   
/*     */   public boolean dA() {
/* 168 */     return b(1);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 172 */     a(1, ☃);
/*     */   }
/*     */   
/*     */   public void a(afb ☃) {
/* 176 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 180 */     this.bC = true;
/* 181 */     this.bD = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 186 */     return wj.kn;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 191 */     return wj.kp;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 196 */     return wj.kq;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 202 */     return ccl.aG;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float az() {
/* 212 */     return 1.0F;
/*     */   }
/*     */   
/*     */   class c extends agb {
/*     */     public c(ans this$0, ans ☃) {
/* 217 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 222 */       if (this.h != agb.a.b) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 227 */       double ☃ = this.b - this.i.q;
/* 228 */       double d1 = this.c - this.i.r;
/* 229 */       double d2 = this.d - this.i.s;
/*     */       
/* 231 */       double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/* 232 */       d3 = xq.a(d3);
/*     */       
/* 234 */       if (d3 < this.i.bD().a()) {
/* 235 */         this.h = agb.a.a;
/* 236 */         this.i.t *= 0.5D;
/* 237 */         this.i.u *= 0.5D;
/* 238 */         this.i.v *= 0.5D;
/*     */       } else {
/* 240 */         this.i.t += ☃ / d3 * 0.05D * this.e;
/* 241 */         this.i.u += d1 / d3 * 0.05D * this.e;
/* 242 */         this.i.v += d2 / d3 * 0.05D * this.e;
/*     */         
/* 244 */         if (this.i.v() == null) {
/* 245 */           this.i.w = -((float)xq.c(this.i.t, this.i.v)) * 57.295776F;
/* 246 */           this.i.aQ = this.i.w;
/*     */         } else {
/*     */           
/* 249 */           double d4 = (this.i.v()).q - this.i.q;
/* 250 */           double d5 = (this.i.v()).s - this.i.s;
/* 251 */           this.i.w = -((float)xq.c(d4, d5)) * 57.295776F;
/* 252 */           this.i.aQ = this.i.w;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends agt {
/*     */     public a(ans this$0) {
/* 260 */       a(1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 265 */       if (this.a.v() != null && !this.a.r().b() && ans.a(this.a).nextInt(7) == 0) {
/* 266 */         return (this.a.h(this.a.v()) > 4.0D);
/*     */       }
/* 268 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 273 */       return (this.a.r().b() && this.a.dA() && this.a.v() != null && this.a.v().aF());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 278 */       afa ☃ = this.a.v();
/* 279 */       cee cee = ☃.i(1.0F);
/* 280 */       ans.b(this.a).a(cee.b, cee.c, cee.d, 1.0D);
/* 281 */       this.a.a(true);
/* 282 */       this.a.a(wj.ko, 1.0F, 1.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 287 */       this.a.a(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 292 */       afa ☃ = this.a.v();
/* 293 */       if (this.a.bD().c(☃.bD())) {
/* 294 */         this.a.B(☃);
/* 295 */         this.a.a(false);
/*     */       } else {
/* 297 */         double d = this.a.h(☃);
/* 298 */         if (d < 9.0D) {
/* 299 */           cee cee = ☃.i(1.0F);
/* 300 */           ans.c(this.a).a(cee.b, cee.c, cee.d, 1.0D);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends agt {
/*     */     public d(ans this$0) {
/* 308 */       a(1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 313 */       return (!this.a.r().b() && ans.d(this.a).nextInt(7) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 318 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 323 */       el ☃ = this.a.dz();
/* 324 */       if (☃ == null)
/*     */       {
/* 326 */         ☃ = new el(this.a);
/*     */       }
/*     */       
/* 329 */       for (int i = 0; i < 3; i++) {
/* 330 */         el el = ☃.a(ans.e(this.a).nextInt(15) - 7, ans.f(this.a).nextInt(11) - 5, ans.g(this.a).nextInt(15) - 7);
/* 331 */         if (this.a.m.c(el)) {
/* 332 */           ans.h(this.a).a(el.o() + 0.5D, el.p() + 0.5D, el.q() + 0.5D, 0.25D);
/* 333 */           if (this.a.v() == null) {
/* 334 */             this.a.p().a(el.o() + 0.5D, el.p() + 0.5D, el.q() + 0.5D, 180.0F, 20.0F);
/*     */           }
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 345 */     a(☃);
/* 346 */     b(☃);
/*     */     
/* 348 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adj ☃) {
/* 353 */     a(aew.a, new ate(atf.p));
/* 354 */     a(aew.a, 0.0F);
/*     */   }
/*     */   
/*     */   class b extends ais {
/*     */     public b(ans this$0, afg ☃) {
/* 359 */       super(☃, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 364 */       return (ans.i(this.a) != null && ans.i(this.a).v() != null && a(ans.i(this.a).v(), false));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 369 */       this.a.e(ans.i(this.a).v());
/* 370 */       super.c();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ans.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */