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
/*     */ public class ane
/*     */   extends anp
/*     */   implements anj
/*     */ {
/*     */   private int c;
/*     */   private final cee[][] bC;
/*     */   
/*     */   public ane(axy ☃) {
/*  52 */     super(aev.F, ☃);
/*     */     
/*  54 */     a(0.6F, 1.95F);
/*     */     
/*  56 */     this.b_ = 5;
/*     */     
/*  58 */     this.bC = new cee[2][4];
/*  59 */     for (int i = 0; i < 4; i++) {
/*  60 */       this.bC[0][i] = new cee(0.0D, 0.0D, 0.0D);
/*  61 */       this.bC[1][i] = new cee(0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  67 */     super.n();
/*     */     
/*  69 */     this.by.a(0, new agm(this));
/*  70 */     this.by.a(1, new anp.b(this));
/*  71 */     this.by.a(4, new b());
/*  72 */     this.by.a(5, new a());
/*  73 */     this.by.a(6, new ahu<>(this, 0.5D, 20, 15.0F));
/*  74 */     this.by.a(8, new ahr(this, 0.6D));
/*  75 */     this.by.a(9, new ahb(this, (Class)aog.class, 3.0F, 1.0F));
/*  76 */     this.by.a(10, new ahb(this, (Class)afb.class, 8.0F));
/*     */     
/*  78 */     this.bz.a(1, new ail(this, true, new Class[] { ane.class }));
/*  79 */     this.bz.a(2, (new aio<>(this, (Class)aog.class, true)).b(300));
/*  80 */     this.bz.a(3, (new aio<>(this, (Class)aob.class, false)).b(300));
/*  81 */     this.bz.a(3, (new aio<>(this, (Class)ajw.class, false)).b(300));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  86 */     super.bZ();
/*     */     
/*  88 */     a(ank.d).a(0.5D);
/*  89 */     a(ank.b).a(18.0D);
/*  90 */     a(ank.a).a(32.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*  95 */     a(aew.a, new ate(atf.g));
/*     */     
/*  97 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 102 */     super.x_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected pc G() {
/* 107 */     return ccl.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 117 */     super.k();
/*     */     
/* 119 */     if (this.m.B && bd()) {
/* 120 */       this.c--;
/* 121 */       if (this.c < 0) {
/* 122 */         this.c = 0;
/*     */       }
/*     */       
/* 125 */       if (this.aB == 1 || this.U % 1200 == 0) {
/* 126 */         this.c = 3;
/*     */         
/* 128 */         float ☃ = -6.0F;
/* 129 */         int i = 13;
/*     */         int j;
/* 131 */         for (j = 0; j < 4; j++) {
/* 132 */           this.bC[0][j] = this.bC[1][j];
/* 133 */           this.bC[1][j] = new cee((-6.0F + this.T.nextInt(13)) * 0.5D, Math.max(0, this.T.nextInt(6) - 4), (-6.0F + this.T.nextInt(13)) * 0.5D);
/*     */         } 
/* 135 */         for (j = 0; j < 16; j++) {
/* 136 */           this.m.a(fm.g, this.q + (this.T.nextDouble() - 0.5D) * this.H, this.r + this.T.nextDouble() * this.I, this.s + (this.T.nextDouble() - 0.5D) * this.H, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */         
/* 139 */         this.m.a(this.q, this.r, this.s, wj.en, bV(), 1.0F, 1.0F, false);
/* 140 */       } else if (this.aB == this.aC - 1) {
/* 141 */         this.c = 3;
/* 142 */         for (int ☃ = 0; ☃ < 4; ☃++) {
/* 143 */           this.bC[0][☃] = this.bC[1][☃];
/* 144 */           this.bC[1][☃] = new cee(0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       } 
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean r(aer ☃) {
/* 165 */     if (super.r(☃)) {
/* 166 */       return true;
/*     */     }
/* 168 */     if (☃ instanceof afa && ((afa)☃).cA() == afd.d)
/*     */     {
/* 170 */       return (be() == null && ☃.be() == null);
/*     */     }
/* 172 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 177 */     return wj.ej;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 182 */     return wj.el;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 187 */     return wj.em;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dz() {
/* 192 */     return wj.ek;
/*     */   }
/*     */   
/*     */   class b
/*     */     extends anp.c {
/*     */     public boolean a() {
/* 198 */       if (!super.a()) {
/* 199 */         return false;
/*     */       }
/* 201 */       if (this.a.a(aem.n)) {
/* 202 */         return false;
/*     */       }
/* 204 */       return true;
/*     */     }
/*     */     private b(ane this$0) {}
/*     */     
/*     */     protected int g() {
/* 209 */       return 20;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int i() {
/* 214 */       return 340;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 219 */       this.a.c(new aek(aem.n, 1200));
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     protected wi k() {
/* 225 */       return wj.ep;
/*     */     }
/*     */ 
/*     */     
/*     */     protected anp.a l() {
/* 230 */       return anp.a.e;
/*     */     } }
/*     */   
/*     */   class a extends anp.c {
/*     */     private int e;
/*     */     
/*     */     private a(ane this$0) {}
/*     */     
/*     */     public boolean a() {
/* 239 */       if (!super.a()) {
/* 240 */         return false;
/*     */       }
/* 242 */       if (this.a.v() == null) {
/* 243 */         return false;
/*     */       }
/* 245 */       if (this.a.v().Q() == this.e) {
/* 246 */         return false;
/*     */       }
/* 248 */       if (!this.a.m.h(new el(this.a)).a(adi.c.ordinal())) {
/* 249 */         return false;
/*     */       }
/* 251 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 256 */       super.c();
/*     */       
/* 258 */       this.e = this.a.v().Q();
/*     */     }
/*     */ 
/*     */     
/*     */     protected int g() {
/* 263 */       return 20;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int i() {
/* 268 */       return 180;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 273 */       this.a.v().c(new aek(aem.o, 400));
/*     */     }
/*     */ 
/*     */     
/*     */     protected wi k() {
/* 278 */       return wj.eo;
/*     */     }
/*     */ 
/*     */     
/*     */     protected anp.a l() {
/* 283 */       return anp.a.f;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 289 */     aok aok = v(f);
/*     */     
/* 291 */     double d1 = ☃.q - this.q;
/* 292 */     double d2 = (☃.bD()).b + (☃.I / 3.0F) - aok.r;
/* 293 */     double d3 = ☃.s - this.s;
/* 294 */     double d4 = xq.a(d1 * d1 + d3 * d3);
/* 295 */     aok.c(d1, d2 + d4 * 0.20000000298023224D, d3, 1.6F, (14 - this.m.aj().a() * 4));
/* 296 */     a(wj.iE, 1.0F, 1.0F / (ce().nextFloat() * 0.4F + 0.8F));
/* 297 */     this.m.a(aok);
/*     */   }
/*     */   
/*     */   protected aok v(float ☃) {
/* 301 */     aom aom = new aom(this.m, this);
/* 302 */     aom.a(this, ☃);
/* 303 */     return aom;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void s(boolean ☃) {
/* 313 */     a(1, ☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */