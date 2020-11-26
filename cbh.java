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
/*     */ public class cbh
/*     */   extends cbd
/*     */ {
/*     */   private final boolean j;
/*     */   
/*     */   public cbh(boolean ☃) {
/*  18 */     this.j = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public cbc b() {
/*  23 */     return super.a(xq.c((this.b.bD()).a), xq.c((this.b.bD()).b + 0.5D), xq.c((this.b.bD()).c));
/*     */   }
/*     */ 
/*     */   
/*     */   public cbc a(double ☃, double d1, double d2) {
/*  28 */     return super.a(xq.c(☃ - (this.b.H / 2.0F)), xq.c(d1 + 0.5D), xq.c(d2 - (this.b.H / 2.0F)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cbc[] ☃, cbc cbc1, cbc cbc2, float f) {
/*  33 */     int i = 0;
/*     */     
/*  35 */     for (eq eq : eq.values()) {
/*  36 */       cbc cbc3 = b(cbc1.a + eq.g(), cbc1.b + eq.h(), cbc1.c + eq.i());
/*  37 */       if (cbc3 != null && !cbc3.i && cbc3.a(cbc2) < f) {
/*  38 */         ☃[i++] = cbc3;
/*     */       }
/*     */     } 
/*     */     
/*  42 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k, afb afb1, int m, int n, int i1, boolean bool1, boolean bool2) {
/*  47 */     return a(☃, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k) {
/*  52 */     el el = new el(i, j, k);
/*  53 */     byw byw = ☃.b(el);
/*  54 */     blc blc = ☃.a_(el);
/*     */     
/*  56 */     if (byw.e() && blc.a(☃, el.b(), cbf.b) && blc.f())
/*  57 */       return cba.s; 
/*  58 */     if (!byw.a(ww.a) || !blc.a(☃, el, cbf.b)) {
/*  59 */       return cba.a;
/*     */     }
/*     */     
/*  62 */     return cba.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cbc b(int ☃, int i, int j) {
/*  67 */     cba cba = c(☃, i, j);
/*     */     
/*  69 */     if ((this.j && cba == cba.s) || cba == cba.g) {
/*  70 */       return a(☃, i, j);
/*     */     }
/*  72 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected cbc a(int ☃, int i, int j) {
/*  78 */     cbc cbc = null;
/*     */     
/*  80 */     cba cba = a(this.b.m, ☃, i, j);
/*     */     
/*  82 */     float f = this.b.a(cba);
/*     */ 
/*     */     
/*  85 */     cbc = super.a(☃, i, j);
/*  86 */     cbc.m = cba;
/*  87 */     cbc.l = Math.max(cbc.l, f);
/*     */     
/*  89 */     if (f >= 0.0F && this.a.b(new el(☃, i, j)).e()) {
/*  90 */       cbc.l += 8.0F;
/*     */     }
/*     */ 
/*     */     
/*  94 */     if (cba == cba.b) {
/*  95 */       return cbc;
/*     */     }
/*     */     
/*  98 */     return cbc;
/*     */   }
/*     */   
/*     */   private cba c(int ☃, int i, int j) {
/* 102 */     el.a a = new el.a();
/* 103 */     for (int k = ☃; k < ☃ + this.d; k++) {
/* 104 */       for (int m = i; m < i + this.e; m++) {
/* 105 */         for (int n = j; n < j + this.f; n++) {
/* 106 */           byw byw = this.a.b(a.c(k, m, n));
/* 107 */           blc blc1 = this.a.a_(a.c(k, m, n));
/*     */           
/* 109 */           if (byw.e() && blc1.a(this.a, a.b(), cbf.b) && blc1.f())
/* 110 */             return cba.s; 
/* 111 */           if (!byw.a(ww.a)) {
/* 112 */             return cba.a;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 118 */     blc blc = this.a.a_(a);
/*     */ 
/*     */     
/* 121 */     if (blc.a(this.a, a, cbf.b)) {
/* 122 */       return cba.g;
/*     */     }
/*     */     
/* 125 */     return cba.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */