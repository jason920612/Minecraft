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
/*     */ public class ayl
/*     */   implements aye
/*     */ {
/*     */   protected int a;
/*     */   protected int b;
/*     */   protected bnj[][] c;
/*     */   protected boolean d;
/*     */   protected axy e;
/*     */   
/*     */   public ayl(axy ☃, el el1, el el2, int i) {
/*  32 */     this.e = ☃;
/*     */     
/*  34 */     this.a = el1.o() - i >> 4;
/*  35 */     this.b = el1.q() - i >> 4;
/*  36 */     int j = el2.o() + i >> 4;
/*  37 */     int k = el2.q() + i >> 4;
/*     */     
/*  39 */     this.c = new bnj[j - this.a + 1][k - this.b + 1];
/*     */     
/*  41 */     this.d = true; int m;
/*  42 */     for (m = this.a; m <= j; m++) {
/*  43 */       for (int n = this.b; n <= k; n++) {
/*  44 */         this.c[m - this.a][n - this.b] = ☃.c(m, n);
/*     */       }
/*     */     } 
/*     */     
/*  48 */     for (m = el1.o() >> 4; m <= el2.o() >> 4; m++) {
/*  49 */       for (int n = el1.q() >> 4; n <= el2.q() >> 4; n++) {
/*  50 */         bnj bnj1 = this.c[m - this.a][n - this.b];
/*  51 */         if (bnj1 != null && 
/*  52 */           !bnj1.b(el1.p(), el2.p())) {
/*  53 */           this.d = false;
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
/*     */   @Nullable
/*     */   public bji f(el ☃) {
/*  68 */     return a(☃, bnj.a.a);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bji a(el ☃, bnj.a a1) {
/*  73 */     int i = (☃.o() >> 4) - this.a;
/*  74 */     int j = (☃.q() >> 4) - this.b;
/*     */     
/*  76 */     return this.c[i][j].a(☃, a1);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float A(el ☃) {
/* 100 */     return this.e.t.i()[C(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public int d(el ☃, int i) {
/* 105 */     if (a_(☃).c(this, ☃)) {
/* 106 */       int j = 0;
/* 107 */       for (eq eq : eq.values()) {
/* 108 */         int k = a(☃.a(eq), i);
/* 109 */         if (k > j) {
/* 110 */           j = k;
/*     */         }
/* 112 */         if (j >= 15) {
/* 113 */           return j;
/*     */         }
/*     */       } 
/* 116 */       return j;
/*     */     } 
/*     */     
/* 119 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boc o() {
/* 124 */     return this.e.o();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(el ☃, int i) {
/* 129 */     if (☃.o() < -30000000 || ☃.q() < -30000000 || ☃.o() >= 30000000 || ☃.q() > 30000000) {
/* 130 */       return 15;
/*     */     }
/*     */     
/* 133 */     if (☃.p() < 0) {
/* 134 */       return 0;
/*     */     }
/* 136 */     if (☃.p() >= 256) {
/* 137 */       int m = 15 - i;
/* 138 */       if (m < 0) {
/* 139 */         m = 0;
/*     */       }
/* 141 */       return m;
/*     */     } 
/*     */     
/* 144 */     int j = (☃.o() >> 4) - this.a;
/* 145 */     int k = (☃.q() >> 4) - this.b;
/*     */     
/* 147 */     return this.c[j][k].a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, boolean bool) {
/* 152 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(el ☃) {
/* 157 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 162 */     int j = ☃ - this.a;
/* 163 */     int k = i - this.b;
/*     */     
/* 165 */     return (j >= 0 && j < this.c.length && k >= 0 && k < (this.c[j]).length);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(bor.a ☃, int i, int j) {
/* 170 */     throw new RuntimeException("NOT IMPLEMENTED!");
/*     */   }
/*     */ 
/*     */   
/*     */   public bmv d() {
/* 175 */     return this.e.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(@Nullable aer ☃, cew cew1) {
/* 180 */     throw new RuntimeException("This method should never be called here. No entity logic inside Region");
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aog a(double ☃, double d1, double d2, double d3, Predicate<aer> predicate) {
/* 186 */     throw new RuntimeException("This method should never be called here. No entity logic inside Region");
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a_(el ☃) {
/* 191 */     if (☃.p() >= 0 && 
/* 192 */       ☃.p() < 256) {
/* 193 */       int i = (☃.o() >> 4) - this.a;
/* 194 */       int j = (☃.q() >> 4) - this.b;
/*     */       
/* 196 */       if (i >= 0 && i < this.c.length && j >= 0 && j < (this.c[i]).length) {
/* 197 */         bnj bnj1 = this.c[i][j];
/* 198 */         if (bnj1 != null) {
/* 199 */           return bnj1.a_(☃);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 205 */     return bct.a.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public byw b(el ☃) {
/* 210 */     if (☃.p() >= 0 && 
/* 211 */       ☃.p() < 256) {
/* 212 */       int i = (☃.o() >> 4) - this.a;
/* 213 */       int j = (☃.q() >> 4) - this.b;
/*     */       
/* 215 */       if (i >= 0 && i < this.c.length && j >= 0 && j < (this.c[i]).length) {
/* 216 */         bnj bnj1 = this.c[i][j];
/* 217 */         if (bnj1 != null) {
/* 218 */           return bnj1.b(☃);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 224 */     return byy.a.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 229 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu d(el ☃) {
/* 234 */     int i = (☃.o() >> 4) - this.a;
/* 235 */     int j = (☃.q() >> 4) - this.b;
/*     */     
/* 237 */     return this.c[i][j].i(☃);
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
/*     */   public boolean c(el ☃) {
/* 270 */     return a_(☃).f();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayi ☃, el el1) {
/* 275 */     if (el1.p() < 0 || el1.p() >= 256) {
/* 276 */       return ☃.c;
/*     */     }
/* 278 */     int i = (el1.o() >> 4) - this.a;
/* 279 */     int j = (el1.q() >> 4) - this.b;
/*     */     
/* 281 */     return this.c[i][j].a(☃, el1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(el ☃, eq eq1) {
/* 291 */     return a_(☃).b(this, ☃, eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 296 */     throw new RuntimeException("Not yet implemented");
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 301 */     throw new RuntimeException("Not yet implemented");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ayl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */