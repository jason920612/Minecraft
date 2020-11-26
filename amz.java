/*     */ import java.util.List;
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
/*     */ public class amz
/*     */   extends anp
/*     */ {
/*     */   private akf c;
/*     */   
/*     */   public amz(axy ☃) {
/*  44 */     super(aev.v, ☃);
/*     */     
/*  46 */     a(0.6F, 1.95F);
/*     */     
/*  48 */     this.b_ = 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  53 */     super.n();
/*     */     
/*  55 */     this.by.a(0, new agm(this));
/*  56 */     this.by.a(1, new b());
/*  57 */     this.by.a(2, new agd<>(this, aog.class, 8.0F, 0.6D, 1.0D));
/*  58 */     this.by.a(4, new c());
/*  59 */     this.by.a(5, new a());
/*  60 */     this.by.a(6, new d(this));
/*  61 */     this.by.a(8, new ahr(this, 0.6D));
/*  62 */     this.by.a(9, new ahb(this, (Class)aog.class, 3.0F, 1.0F));
/*  63 */     this.by.a(10, new ahb(this, (Class)afb.class, 8.0F));
/*     */     
/*  65 */     this.bz.a(1, new ail(this, true, new Class[] { amz.class }));
/*  66 */     this.bz.a(2, (new aio<>(this, (Class)aog.class, true)).b(300));
/*  67 */     this.bz.a(3, (new aio<>(this, (Class)aob.class, false)).b(300));
/*  68 */     this.bz.a(3, new aio<>(this, ajw.class, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  73 */     super.bZ();
/*     */     
/*  75 */     a(ank.d).a(0.5D);
/*  76 */     a(ank.b).a(12.0D);
/*  77 */     a(ank.a).a(24.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  82 */     super.x_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  87 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  92 */     super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected pc G() {
/*  97 */     return ccl.aB;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 102 */     super.J();
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 107 */     super.R_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aer ☃) {
/* 112 */     if (☃ == null) {
/* 113 */       return false;
/*     */     }
/* 115 */     if (☃ == this) {
/* 116 */       return true;
/*     */     }
/* 118 */     if (super.r(☃)) {
/* 119 */       return true;
/*     */     }
/* 121 */     if (☃ instanceof ans) {
/* 122 */       return r(((ans)☃).l());
/*     */     }
/* 124 */     if (☃ instanceof afa && ((afa)☃).cA() == afd.d)
/*     */     {
/* 126 */       return (be() == null && ☃.be() == null);
/*     */     }
/* 128 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 133 */     return wj.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 138 */     return wj.co;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 143 */     return wj.cq;
/*     */   }
/*     */   
/*     */   private void a(@Nullable akf ☃) {
/* 147 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private akf dD() {
/* 152 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dz() {
/* 157 */     return wj.cn;
/*     */   }
/*     */   
/*     */   class b extends anp.b { private b(amz this$0) {}
/*     */     
/*     */     public void e() {
/* 163 */       if (this.a.v() != null) {
/* 164 */         this.a.p().a(this.a.v(), this.a.L(), this.a.K());
/* 165 */       } else if (amz.a(this.a) != null) {
/* 166 */         this.a.p().a(amz.a(this.a), this.a.L(), this.a.K());
/*     */       } 
/*     */     } }
/*     */   
/*     */   class a extends anp.c {
/*     */     private a(amz this$0) {}
/*     */     
/*     */     protected int g() {
/* 174 */       return 40;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int i() {
/* 179 */       return 100;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected void j() {
/* 185 */       afa ☃ = this.a.v();
/* 186 */       double d1 = Math.min(☃.r, this.a.r);
/* 187 */       double d2 = Math.max(☃.r, this.a.r) + 1.0D;
/* 188 */       float f = (float)xq.c(☃.s - this.a.s, ☃.q - this.a.q);
/* 189 */       if (this.a.h(☃) < 9.0D) {
/*     */         int i;
/* 191 */         for (i = 0; i < 5; i++) {
/* 192 */           float f1 = f + i * 3.1415927F * 0.4F;
/* 193 */           a(this.a.q + xq.b(f1) * 1.5D, this.a.s + xq.a(f1) * 1.5D, d1, d2, f1, 0);
/*     */         } 
/*     */         
/* 196 */         for (i = 0; i < 8; i++) {
/* 197 */           float f1 = f + i * 3.1415927F * 2.0F / 8.0F + 1.2566371F;
/* 198 */           a(this.a.q + xq.b(f1) * 2.5D, this.a.s + xq.a(f1) * 2.5D, d1, d2, f1, 3);
/*     */         } 
/*     */       } else {
/*     */         
/* 202 */         for (int i = 0; i < 16; i++) {
/* 203 */           double d = 1.25D * (i + 1);
/* 204 */           int j = 1 * i;
/* 205 */           a(this.a.q + xq.b(f) * d, this.a.s + xq.a(f) * d, d1, d2, f, j);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(double ☃, double d1, double d2, double d3, float f, int i) {
/* 212 */       el el = new el(☃, d3, d1);
/* 213 */       boolean bool = false;
/* 214 */       double d = 0.0D;
/*     */       do {
/* 216 */         if (!this.a.m.q(el) && this.a.m.q(el.b())) {
/* 217 */           if (!this.a.m.c(el)) {
/* 218 */             blc blc = this.a.m.a_(el);
/* 219 */             cew cew = blc.h(this.a.m, el);
/* 220 */             if (!cew.b()) {
/* 221 */               d = cew.c(eq.a.b);
/*     */             }
/*     */           } 
/* 224 */           bool = true;
/*     */           break;
/*     */         } 
/* 227 */         el = el.b();
/* 228 */       } while (el.p() >= xq.c(d2) - 1);
/* 229 */       if (bool) {
/* 230 */         aoo aoo = new aoo(this.a.m, ☃, el.p() + d, d1, f, i, this.a);
/* 231 */         this.a.m.a(aoo);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected wi k() {
/* 237 */       return wj.cr;
/*     */     }
/*     */ 
/*     */     
/*     */     protected anp.a l() {
/* 242 */       return anp.a.c;
/*     */     }
/*     */   }
/*     */   
/*     */   class c extends anp.c { private c(amz this$0) {}
/*     */     
/*     */     public boolean a() {
/* 249 */       if (!super.a()) {
/* 250 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 254 */       int ☃ = this.a.m.<ans>a(ans.class, this.a.bD().g(16.0D)).size();
/* 255 */       return (amz.b(this.a).nextInt(8) + 1 > ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected int g() {
/* 260 */       return 100;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int i() {
/* 265 */       return 340;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 270 */       for (int ☃ = 0; ☃ < 3; ☃++) {
/* 271 */         el el = (new el(this.a)).a(-2 + amz.c(this.a).nextInt(5), 1, -2 + amz.d(this.a).nextInt(5));
/* 272 */         ans ans = new ans(this.a.m);
/* 273 */         ans.a(el, 0.0F, 0.0F);
/* 274 */         ans.a(this.a.m.h(el), (afj)null, (gy)null);
/* 275 */         ans.a(this.a);
/* 276 */         ans.g(el);
/* 277 */         ans.a(20 * (30 + amz.e(this.a).nextInt(90)));
/* 278 */         this.a.m.a(ans);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected wi k() {
/* 284 */       return wj.cs;
/*     */     }
/*     */ 
/*     */     
/*     */     protected anp.a l() {
/* 289 */       return anp.a.b;
/*     */     } }
/*     */   
/*     */   public class d extends anp.c { public d(amz ☃) {
/* 293 */       super(☃);
/* 294 */       this.e = (☃ -> (☃.dy() == asc.l));
/*     */     }
/*     */     private final Predicate<akf> e;
/*     */     public boolean a() {
/* 298 */       if (this.a.v() != null)
/*     */       {
/* 300 */         return false;
/*     */       }
/* 302 */       if (this.a.dA())
/*     */       {
/* 304 */         return false;
/*     */       }
/* 306 */       if (this.a.U < this.c) {
/* 307 */         return false;
/*     */       }
/* 309 */       if (!this.a.m.X().b("mobGriefing")) {
/* 310 */         return false;
/*     */       }
/*     */       
/* 313 */       List<akf> ☃ = this.a.m.a(akf.class, this.a.bD().c(16.0D, 4.0D, 16.0D), this.e);
/*     */       
/* 315 */       if (☃.isEmpty()) {
/* 316 */         return false;
/*     */       }
/* 318 */       amz.a(this.a, ☃.get(amz.f(this.a).nextInt(☃.size())));
/* 319 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 325 */       return (amz.a(this.a) != null && this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 330 */       super.d();
/* 331 */       amz.a(this.a, (akf)null);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 336 */       akf ☃ = amz.a(this.a);
/* 337 */       if (☃ != null && ☃.aF()) {
/* 338 */         ☃.b(asc.o);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected int m() {
/* 344 */       return 40;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int g() {
/* 349 */       return 60;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int i() {
/* 354 */       return 140;
/*     */     }
/*     */ 
/*     */     
/*     */     protected wi k() {
/* 359 */       return wj.ct;
/*     */     }
/*     */ 
/*     */     
/*     */     protected anp.a l() {
/* 364 */       return anp.a.d;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\amz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */