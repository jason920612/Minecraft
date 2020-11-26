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
/*     */ public class aiv
/*     */   extends aiw
/*     */ {
/*     */   private boolean p;
/*     */   
/*     */   public aiv(afb ☃, axy axy1) {
/*  22 */     super(☃, axy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cbg a() {
/*  27 */     this.o = new cbj();
/*  28 */     this.o.a(true);
/*  29 */     return new cbg(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/*  34 */     return (this.a.A || r() || this.a.aW());
/*     */   }
/*     */ 
/*     */   
/*     */   protected cee c() {
/*  39 */     return new cee(this.a.q, u(), this.a.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public cbe b(el ☃) {
/*  44 */     if (this.b.a_(☃).f()) {
/*  45 */       el el1 = ☃.b();
/*  46 */       while (el1.p() > 0 && this.b.a_(el1).f()) {
/*  47 */         el1 = el1.b();
/*     */       }
/*     */       
/*  50 */       if (el1.p() > 0) {
/*  51 */         return super.b(el1.a());
/*     */       }
/*     */       
/*  54 */       while (el1.p() < this.b.aa() && this.b.a_(el1).f()) {
/*  55 */         el1 = el1.a();
/*     */       }
/*  57 */       ☃ = el1;
/*     */     } 
/*     */     
/*  60 */     if (this.b.a_(☃).d().b()) {
/*  61 */       el el1 = ☃.a();
/*  62 */       while (el1.p() < this.b.aa() && this.b.a_(el1).d().b()) {
/*  63 */         el1 = el1.a();
/*     */       }
/*  65 */       return super.b(el1);
/*     */     } 
/*     */     
/*  68 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cbe a(aer ☃) {
/*  73 */     return b(new el(☃));
/*     */   }
/*     */   
/*     */   private int u() {
/*  77 */     if (!this.a.an() || !t()) {
/*  78 */       return (int)((this.a.bD()).b + 0.5D);
/*     */     }
/*     */     
/*  81 */     int ☃ = (int)(this.a.bD()).b;
/*  82 */     bcs bcs = this.b.a_(new el(xq.c(this.a.q), ☃, xq.c(this.a.s))).c();
/*  83 */     int i = 0;
/*  84 */     while (bcs == bct.A) {
/*  85 */       ☃++;
/*  86 */       bcs = this.b.a_(new el(xq.c(this.a.q), ☃, xq.c(this.a.s))).c();
/*  87 */       if (++i > 16) {
/*  88 */         return (int)(this.a.bD()).b;
/*     */       }
/*     */     } 
/*  91 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void E_() {
/*  96 */     super.E_();
/*     */     
/*  98 */     if (this.p) {
/*  99 */       if (this.b.e(new el(xq.c(this.a.q), (int)((this.a.bD()).b + 0.5D), xq.c(this.a.s)))) {
/*     */         return;
/*     */       }
/*     */       
/* 103 */       for (int ☃ = 0; ☃ < this.c.d(); ☃++) {
/* 104 */         cbc cbc = this.c.a(☃);
/* 105 */         if (this.b.e(new el(cbc.a, cbc.b, cbc.c))) {
/* 106 */           this.c.b(☃ - 1);
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(cee ☃, cee cee1, int i, int j, int k) {
/* 115 */     int m = xq.c(☃.b);
/* 116 */     int n = xq.c(☃.d);
/*     */     
/* 118 */     double d1 = cee1.b - ☃.b;
/* 119 */     double d2 = cee1.d - ☃.d;
/* 120 */     double d3 = d1 * d1 + d2 * d2;
/* 121 */     if (d3 < 1.0E-8D) {
/* 122 */       return false;
/*     */     }
/*     */     
/* 125 */     double d4 = 1.0D / Math.sqrt(d3);
/* 126 */     d1 *= d4;
/* 127 */     d2 *= d4;
/*     */     
/* 129 */     i += 2;
/* 130 */     k += 2;
/* 131 */     if (!a(m, (int)☃.c, n, i, j, k, ☃, d1, d2)) {
/* 132 */       return false;
/*     */     }
/* 134 */     i -= 2;
/* 135 */     k -= 2;
/*     */     
/* 137 */     double d5 = 1.0D / Math.abs(d1);
/* 138 */     double d6 = 1.0D / Math.abs(d2);
/*     */     
/* 140 */     double d7 = m - ☃.b;
/* 141 */     double d8 = n - ☃.d;
/* 142 */     if (d1 >= 0.0D) {
/* 143 */       d7++;
/*     */     }
/* 145 */     if (d2 >= 0.0D) {
/* 146 */       d8++;
/*     */     }
/* 148 */     d7 /= d1;
/* 149 */     d8 /= d2;
/*     */     
/* 151 */     int i1 = (d1 < 0.0D) ? -1 : 1;
/* 152 */     int i2 = (d2 < 0.0D) ? -1 : 1;
/* 153 */     int i3 = xq.c(cee1.b);
/* 154 */     int i4 = xq.c(cee1.d);
/* 155 */     int i5 = i3 - m;
/* 156 */     int i6 = i4 - n;
/* 157 */     while (i5 * i1 > 0 || i6 * i2 > 0) {
/* 158 */       if (d7 < d8) {
/* 159 */         d7 += d5;
/* 160 */         m += i1;
/* 161 */         i5 = i3 - m;
/*     */       } else {
/* 163 */         d8 += d6;
/* 164 */         n += i2;
/* 165 */         i6 = i4 - n;
/*     */       } 
/*     */       
/* 168 */       if (!a(m, (int)☃.c, n, i, j, k, ☃, d1, d2)) {
/* 169 */         return false;
/*     */       }
/*     */     } 
/* 172 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j, int k, int m, int n, cee cee1, double d1, double d2) {
/* 176 */     int i1 = ☃ - k / 2;
/* 177 */     int i2 = j - n / 2;
/*     */     
/* 179 */     if (!b(i1, i, i2, k, m, n, cee1, d1, d2)) {
/* 180 */       return false;
/*     */     }
/*     */     
/* 183 */     for (int i3 = i1; i3 < i1 + k; i3++) {
/* 184 */       for (int i4 = i2; i4 < i2 + n; i4++) {
/* 185 */         double d3 = i3 + 0.5D - cee1.b;
/* 186 */         double d4 = i4 + 0.5D - cee1.d;
/* 187 */         if (d3 * d1 + d4 * d2 >= 0.0D) {
/*     */ 
/*     */ 
/*     */           
/* 191 */           cba cba = this.o.a(this.b, i3, i - 1, i4, this.a, k, m, n, true, true);
/*     */           
/* 193 */           if (cba == cba.g) {
/* 194 */             return false;
/*     */           }
/*     */           
/* 197 */           if (cba == cba.f) {
/* 198 */             return false;
/*     */           }
/*     */           
/* 201 */           if (cba == cba.b) {
/* 202 */             return false;
/*     */           }
/*     */           
/* 205 */           cba = this.o.a(this.b, i3, i, i4, this.a, k, m, n, true, true);
/* 206 */           float f = this.a.a(cba);
/*     */           
/* 208 */           if (f < 0.0F || f >= 8.0F) {
/* 209 */             return false;
/*     */           }
/*     */           
/* 212 */           if (cba == cba.k || cba == cba.j || cba == cba.o) {
/* 213 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 218 */     return true;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃, int i, int j, int k, int m, int n, cee cee1, double d1, double d2) {
/* 222 */     for (el el : el.a(new el(☃, i, j), new el(☃ + k - 1, i + m - 1, j + n - 1))) {
/* 223 */       double d3 = el.o() + 0.5D - cee1.b;
/* 224 */       double d4 = el.q() + 0.5D - cee1.d;
/* 225 */       if (d3 * d1 + d4 * d2 < 0.0D) {
/*     */         continue;
/*     */       }
/* 228 */       if (!this.b.a_(el).a(this.b, el, cbf.a)) {
/* 229 */         return false;
/*     */       }
/*     */     } 
/* 232 */     return true;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 236 */     this.o.b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 244 */     this.o.a(☃);
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 248 */     return this.o.c();
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 252 */     this.p = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aiv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */