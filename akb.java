/*     */ import java.util.List;
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
/*     */ public class akb
/*     */   extends ajq
/*     */ {
/*  45 */   private static final or<Boolean> bC = ou.a((Class)akb.class, ot.i);
/*     */   
/*     */   private float bD;
/*     */   
/*     */   private float bE;
/*     */   private int bG;
/*     */   
/*     */   public akb(axy ☃) {
/*  53 */     super(aev.ac, ☃);
/*  54 */     a(1.3F, 1.4F);
/*     */   }
/*     */ 
/*     */   
/*     */   public aeo a(aeo ☃) {
/*  59 */     return new akb(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  69 */     super.n();
/*     */     
/*  71 */     this.by.a(0, new agm(this));
/*  72 */     this.by.a(1, new d(this));
/*  73 */     this.by.a(1, new e(this));
/*  74 */     this.by.a(4, new ags(this, 1.25D));
/*  75 */     this.by.a(5, new ahr(this, 1.0D));
/*  76 */     this.by.a(6, new ahb(this, (Class)aog.class, 6.0F));
/*  77 */     this.by.a(7, new ahq(this));
/*     */     
/*  79 */     this.bz.a(1, new c(this));
/*  80 */     this.bz.a(2, new a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  85 */     super.bZ();
/*     */     
/*  87 */     a(ank.a).a(30.0D);
/*  88 */     a(ank.b).a(20.0D);
/*  89 */     a(ank.d).a(0.25D);
/*     */     
/*  91 */     cz().b(ank.f);
/*  92 */     a(ank.f).a(6.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/*  97 */     int i = xq.c(this.q);
/*  98 */     int j = xq.c((bD()).b);
/*  99 */     int k = xq.c(this.s);
/* 100 */     el el = new el(i, j, k);
/*     */     
/* 102 */     ayu ayu = ☃.d(el);
/* 103 */     if (ayu == ayz.l || ayu == ayz.Z) {
/* 104 */       return (☃.a(el, 0) > 8 && ☃.a_(el.b()).c() == bct.cR);
/*     */     }
/*     */     
/* 107 */     return super.a(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 112 */     if (y_()) {
/* 113 */       return wj.he;
/*     */     }
/* 115 */     return wj.hd;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 120 */     return wj.hg;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 125 */     return wj.hf;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 130 */     a(wj.hh, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void dy() {
/* 134 */     if (this.bG <= 0) {
/* 135 */       a(wj.hi, 1.0F, 1.0F);
/*     */       
/* 137 */       this.bG = 40;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 144 */     return ccl.M;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 149 */     super.x_();
/*     */     
/* 151 */     this.ab.a(bC, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 156 */     super.R_();
/*     */     
/* 158 */     if (this.m.B) {
/* 159 */       this.bD = this.bE;
/* 160 */       if (dz()) {
/* 161 */         this.bE = xq.a(this.bE + 1.0F, 0.0F, 6.0F);
/*     */       } else {
/* 163 */         this.bE = xq.a(this.bE - 1.0F, 0.0F, 6.0F);
/*     */       } 
/*     */     } 
/*     */     
/* 167 */     if (this.bG > 0) {
/* 168 */       this.bG--;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 175 */     boolean bool = ☃.a(aea.a(this), (int)a(ank.f).e());
/* 176 */     if (bool) {
/* 177 */       a(this, ☃);
/*     */     }
/* 179 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean dz() {
/* 183 */     return ((Boolean)this.ab.<Boolean>a(bC)).booleanValue();
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {
/* 187 */     this.ab.b(bC, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float cJ() {
/* 196 */     return 0.98F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 202 */     if (afj1 instanceof b) {
/* 203 */       if (((b)afj1).a) {
/* 204 */         b_(-24000);
/*     */       }
/*     */     } else {
/* 207 */       b b = new b();
/* 208 */       b.a = true;
/* 209 */       afj1 = b;
/*     */     } 
/*     */     
/* 212 */     return afj1;
/*     */   }
/*     */   
/*     */   static class b
/*     */     implements afj {
/*     */     public boolean a;
/*     */     
/*     */     private b() {}
/*     */   }
/*     */   
/*     */   class c
/*     */     extends ail {
/*     */     public c(akb this$0) {
/* 225 */       super(this$0, false, new Class[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 230 */       super.c();
/* 231 */       if (this.a.y_()) {
/* 232 */         g();
/* 233 */         d();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(afg ☃, afa afa1) {
/* 239 */       if (☃ instanceof akb && 
/* 240 */         !☃.y_()) {
/* 241 */         super.a(☃, afa1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   class a
/*     */     extends aio<aog>
/*     */   {
/*     */     public a(akb this$0) {
/* 253 */       super(this$0, aog.class, 20, true, true, (Predicate<? super aog>)null);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 258 */       if (this.i.y_()) {
/* 259 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 263 */       if (super.a()) {
/* 264 */         List<akb> ☃ = this.i.m.a(akb.class, this.i.bD().c(8.0D, 4.0D, 8.0D));
/* 265 */         for (akb akb1 : ☃) {
/* 266 */           if (akb1.y_()) {
/* 267 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 273 */       this.i.e((afa)null);
/* 274 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     protected double i() {
/* 279 */       return super.i() * 0.5D;
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends ahe {
/*     */     public d(akb this$0) {
/* 285 */       super(this$0, 1.25D, true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(afa ☃, double d1) {
/* 290 */       double d2 = a(☃);
/* 291 */       if (d1 <= d2 && this.b <= 0) {
/* 292 */         this.b = 20;
/* 293 */         this.a.B(☃);
/* 294 */         this.d.s(false);
/* 295 */       } else if (d1 <= d2 * 2.0D) {
/* 296 */         if (this.b <= 0) {
/* 297 */           this.d.s(false);
/* 298 */           this.b = 20;
/*     */         } 
/* 300 */         if (this.b <= 10) {
/* 301 */           this.d.s(true);
/* 302 */           this.d.dy();
/*     */         } 
/*     */       } else {
/*     */         
/* 306 */         this.b = 20;
/* 307 */         this.d.s(false);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 313 */       this.d.s(false);
/* 314 */       super.d();
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(afa ☃) {
/* 319 */       return (4.0F + ☃.H);
/*     */     }
/*     */   }
/*     */   
/*     */   class e extends aho {
/*     */     public e(akb this$0) {
/* 325 */       super(this$0, 2.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 330 */       if (!this.f.y_() && !this.f.aV()) {
/* 331 */         return false;
/*     */       }
/* 333 */       return super.a();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */