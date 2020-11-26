/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aiz
/*     */   extends aiw
/*     */ {
/*     */   private boolean p;
/*     */   
/*     */   public aiz(afb ☃, axy axy1) {
/*  19 */     super(☃, axy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cbg a() {
/*  24 */     this.p = this.a instanceof aju;
/*  25 */     this.o = new cbh(this.p);
/*  26 */     return new cbg(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/*  31 */     return (this.p || r());
/*     */   }
/*     */ 
/*     */   
/*     */   protected cee c() {
/*  36 */     return new cee(this.a.q, this.a.r + this.a.I * 0.5D, this.a.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  41 */     this.e++;
/*     */     
/*  43 */     if (this.m) {
/*  44 */       l();
/*     */     }
/*     */     
/*  47 */     if (p()) {
/*     */       return;
/*     */     }
/*     */     
/*  51 */     if (b()) {
/*  52 */       o();
/*  53 */     } else if (this.c != null && this.c.e() < this.c.d()) {
/*  54 */       cee cee = this.c.a(this.a, this.c.e());
/*  55 */       if (xq.c(this.a.q) == xq.c(cee.b) && xq.c(this.a.r) == xq.c(cee.c) && xq.c(this.a.s) == xq.c(cee.d)) {
/*  56 */         this.c.c(this.c.e() + 1);
/*     */       }
/*     */     } 
/*     */     
/*  60 */     n();
/*     */     
/*  62 */     if (p()) {
/*     */       return;
/*     */     }
/*     */     
/*  66 */     cee ☃ = this.c.a(this.a);
/*  67 */     this.a.r().a(☃.b, ☃.c, ☃.d, this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  72 */     if (this.c == null) {
/*     */       return;
/*     */     }
/*     */     
/*  76 */     cee ☃ = c();
/*     */ 
/*     */     
/*  79 */     float f = (this.a.H > 0.75F) ? (this.a.H / 2.0F) : (0.75F - this.a.H / 2.0F);
/*  80 */     if (xq.e((float)this.a.t) > 0.2D || xq.e((float)this.a.v) > 0.2D) {
/*  81 */       f *= xq.a(this.a.t * this.a.t + this.a.u * this.a.u + this.a.v * this.a.v) * 6.0F;
/*     */     }
/*     */     
/*  84 */     int i = 6;
/*  85 */     cee cee1 = this.c.f();
/*  86 */     if (xq.e((float)(this.a.q - cee1.b + 0.5D)) < f && xq.e((float)(this.a.s - cee1.d + 0.5D)) < f && Math.abs(this.a.r - cee1.c) < (f * 2.0F)) {
/*  87 */       this.c.a();
/*     */     }
/*     */     
/*  90 */     for (int j = Math.min(this.c.e() + 6, this.c.d() - 1); j > this.c.e(); j--) {
/*  91 */       cee1 = this.c.a(this.a, j);
/*  92 */       if (cee1.g(☃) <= 36.0D)
/*     */       {
/*     */         
/*  95 */         if (a(☃, cee1, 0, 0, 0)) {
/*  96 */           this.c.c(j);
/*     */           break;
/*     */         } 
/*     */       }
/*     */     } 
/* 101 */     a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(cee ☃) {
/* 107 */     if (this.e - this.f > 100) {
/* 108 */       if (☃.g(this.g) < 2.25D) {
/* 109 */         q();
/*     */       }
/* 111 */       this.f = this.e;
/* 112 */       this.g = ☃;
/*     */     } 
/*     */     
/* 115 */     if (this.c != null && !this.c.b()) {
/* 116 */       cee cee1 = this.c.f();
/*     */       
/* 118 */       if (cee1.equals(this.h)) {
/* 119 */         this.i += k.b() - this.j;
/*     */       } else {
/* 121 */         this.h = cee1;
/* 122 */         double d = ☃.f(this.h);
/* 123 */         this.k = (this.a.cK() > 0.0F) ? (d / this.a.cK() * 100.0D) : 0.0D;
/*     */       } 
/*     */       
/* 126 */       if (this.k > 0.0D && this.i > this.k * 2.0D) {
/* 127 */         this.h = cee.a;
/* 128 */         this.i = 0L;
/* 129 */         this.k = 0.0D;
/* 130 */         q();
/*     */       } 
/* 132 */       this.j = k.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(cee ☃, cee cee1, int i, int j, int k) {
/* 138 */     ceb ceb = this.b.a(☃, new cee(cee1.b, cee1.c + this.a.I * 0.5D, cee1.d), cec.a, true, false);
/* 139 */     return (ceb == null || ceb.a == ceb.a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(el ☃) {
/* 144 */     return !this.b.a_(☃).f(this.b, ☃);
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {}
/*     */ }


/* Location:              F:\dw\server.jar!\aiz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */