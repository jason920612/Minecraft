/*     */ import java.util.EnumSet;
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
/*     */ public class cbi
/*     */   extends cbj
/*     */ {
/*     */   private float k;
/*     */   private float l;
/*     */   
/*     */   public void a(axk ☃, afb afb1) {
/*  23 */     super.a(☃, afb1);
/*  24 */     afb1.a(cba.g, 0.0F);
/*  25 */     this.k = afb1.a(cba.c);
/*  26 */     afb1.a(cba.c, 6.0F);
/*  27 */     this.l = afb1.a(cba.h);
/*  28 */     afb1.a(cba.h, 4.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  33 */     this.b.a(cba.c, this.k);
/*  34 */     this.b.a(cba.h, this.l);
/*  35 */     super.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public cbc b() {
/*  40 */     return a(xq.c((this.b.bD()).a), xq.c((this.b.bD()).b + 0.5D), xq.c((this.b.bD()).c));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cbc a(double ☃, double d1, double d2) {
/*  46 */     return a(xq.c(☃), xq.c(d1 + 0.5D), xq.c(d2));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(cbc[] ☃, cbc cbc1, cbc cbc2, float f) {
/*  52 */     int i = 0;
/*  53 */     int j = 1;
/*     */     
/*  55 */     el el = new el(cbc1.a, cbc1.b, cbc1.c);
/*  56 */     double d = a(el);
/*     */     
/*  58 */     cbc cbc3 = a(cbc1.a, cbc1.b, cbc1.c + 1, 1, d);
/*  59 */     cbc cbc4 = a(cbc1.a - 1, cbc1.b, cbc1.c, 1, d);
/*  60 */     cbc cbc5 = a(cbc1.a + 1, cbc1.b, cbc1.c, 1, d);
/*  61 */     cbc cbc6 = a(cbc1.a, cbc1.b, cbc1.c - 1, 1, d);
/*  62 */     cbc cbc7 = a(cbc1.a, cbc1.b + 1, cbc1.c, 0, d);
/*  63 */     cbc cbc8 = a(cbc1.a, cbc1.b - 1, cbc1.c, 1, d);
/*     */     
/*  65 */     if (cbc3 != null && !cbc3.i && cbc3.a(cbc2) < f) {
/*  66 */       ☃[i++] = cbc3;
/*     */     }
/*  68 */     if (cbc4 != null && !cbc4.i && cbc4.a(cbc2) < f) {
/*  69 */       ☃[i++] = cbc4;
/*     */     }
/*  71 */     if (cbc5 != null && !cbc5.i && cbc5.a(cbc2) < f) {
/*  72 */       ☃[i++] = cbc5;
/*     */     }
/*  74 */     if (cbc6 != null && !cbc6.i && cbc6.a(cbc2) < f) {
/*  75 */       ☃[i++] = cbc6;
/*     */     }
/*  77 */     if (cbc7 != null && !cbc7.i && cbc7.a(cbc2) < f) {
/*  78 */       ☃[i++] = cbc7;
/*     */     }
/*  80 */     if (cbc8 != null && !cbc8.i && cbc8.a(cbc2) < f) {
/*  81 */       ☃[i++] = cbc8;
/*     */     }
/*     */     
/*  84 */     boolean bool1 = (cbc6 == null || cbc6.m == cba.b || cbc6.l != 0.0F);
/*  85 */     boolean bool2 = (cbc3 == null || cbc3.m == cba.b || cbc3.l != 0.0F);
/*  86 */     boolean bool3 = (cbc5 == null || cbc5.m == cba.b || cbc5.l != 0.0F);
/*  87 */     boolean bool4 = (cbc4 == null || cbc4.m == cba.b || cbc4.l != 0.0F);
/*     */     
/*  89 */     if (bool1 && bool4) {
/*  90 */       cbc cbc9 = a(cbc1.a - 1, cbc1.b, cbc1.c - 1, 1, d);
/*  91 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/*  92 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/*  95 */     if (bool1 && bool3) {
/*  96 */       cbc cbc9 = a(cbc1.a + 1, cbc1.b, cbc1.c - 1, 1, d);
/*  97 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/*  98 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 101 */     if (bool2 && bool4) {
/* 102 */       cbc cbc9 = a(cbc1.a - 1, cbc1.b, cbc1.c + 1, 1, d);
/* 103 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 104 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/* 107 */     if (bool2 && bool3) {
/* 108 */       cbc cbc9 = a(cbc1.a + 1, cbc1.b, cbc1.c + 1, 1, d);
/* 109 */       if (cbc9 != null && !cbc9.i && cbc9.a(cbc2) < f) {
/* 110 */         ☃[i++] = cbc9;
/*     */       }
/*     */     } 
/*     */     
/* 114 */     return i;
/*     */   }
/*     */   
/*     */   private double a(el ☃) {
/* 118 */     if (!this.b.an()) {
/* 119 */       el el1 = ☃.b();
/* 120 */       cew cew = this.a.a_(el1).h(this.a, el1);
/* 121 */       return el1.p() + (cew.b() ? 0.0D : cew.c(eq.a.b));
/*     */     } 
/* 123 */     return ☃.p() + 0.5D;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cbc a(int ☃, int i, int j, int k, double d) {
/* 128 */     cbc cbc = null;
/*     */     
/* 130 */     el el = new el(☃, i, j);
/* 131 */     double d1 = a(el);
/*     */ 
/*     */     
/* 134 */     if (d1 - d > 1.125D) {
/* 135 */       return null;
/*     */     }
/*     */     
/* 138 */     cba cba = a(this.a, ☃, i, j, this.b, this.d, this.e, this.f, false, false);
/*     */     
/* 140 */     float f = this.b.a(cba);
/* 141 */     double d2 = this.b.H / 2.0D;
/*     */     
/* 143 */     if (f >= 0.0F) {
/* 144 */       cbc = a(☃, i, j);
/* 145 */       cbc.m = cba;
/* 146 */       cbc.l = Math.max(cbc.l, f);
/*     */     } 
/*     */     
/* 149 */     if (cba == cba.g || cba == cba.c) {
/*     */       
/* 151 */       if (i < this.b.m.k() - 10 && cbc != null) {
/* 152 */         cbc.l++;
/*     */       }
/*     */       
/* 155 */       return cbc;
/*     */     } 
/*     */     
/* 158 */     if (cbc == null && k > 0 && cba != cba.e && cba != cba.d) {
/* 159 */       cbc = a(☃, i + 1, j, k - 1, d);
/*     */     }
/*     */     
/* 162 */     if (cba == cba.b) {
/*     */       
/* 164 */       cea cea = new cea(☃ - d2 + 0.5D, i + 0.001D, j - d2 + 0.5D, ☃ + d2 + 0.5D, (i + this.b.I), j + d2 + 0.5D);
/* 165 */       if (!this.b.m.c((aer)null, cea)) {
/* 166 */         return null;
/*     */       }
/*     */ 
/*     */       
/* 170 */       cba cba1 = a(this.a, ☃, i - 1, j, this.b, this.d, this.e, this.f, false, false);
/* 171 */       if (cba1 == cba.a) {
/* 172 */         cbc = a(☃, i, j);
/* 173 */         cbc.m = cba.c;
/* 174 */         cbc.l = Math.max(cbc.l, f);
/* 175 */         return cbc;
/*     */       } 
/* 177 */       if (cba1 == cba.g) {
/* 178 */         cbc = a(☃, i, j);
/* 179 */         cbc.m = cba.g;
/* 180 */         cbc.l = Math.max(cbc.l, f);
/* 181 */         return cbc;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 186 */       int m = 0;
/* 187 */       while (i > 0 && cba == cba.b) {
/* 188 */         i--;
/*     */         
/* 190 */         if (m++ >= this.b.bn()) {
/* 191 */           return null;
/*     */         }
/*     */         
/* 194 */         cba = a(this.a, ☃, i, j, this.b, this.d, this.e, this.f, false, false);
/* 195 */         f = this.b.a(cba);
/*     */         
/* 197 */         if (cba != cba.b && f >= 0.0F) {
/* 198 */           cbc = a(☃, i, j);
/* 199 */           cbc.m = cba;
/* 200 */           cbc.l = Math.max(cbc.l, f); break;
/*     */         } 
/* 202 */         if (f < 0.0F) {
/* 203 */           return null;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 208 */     return cbc;
/*     */   }
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2, EnumSet<cba> enumSet, cba cba1, el el1) {
/* 213 */     for (int i2 = 0; i2 < m; i2++) {
/* 214 */       for (int i3 = 0; i3 < n; i3++) {
/* 215 */         for (int i4 = 0; i4 < i1; i4++) {
/* 216 */           int i5 = i2 + i;
/* 217 */           int i6 = i3 + j;
/* 218 */           int i7 = i4 + k;
/*     */           
/* 220 */           cba cba2 = a(☃, i5, i6, i7);
/*     */           
/* 222 */           if (cba2 == cba.i && !(☃.a_(el1).c() instanceof bco) && !(☃.a_(el1.b()).c() instanceof bco)) {
/* 223 */             cba2 = cba.e;
/*     */           }
/*     */           
/* 226 */           if (cba2 == cba.p || cba2 == cba.q || cba2 == cba.r) {
/* 227 */             cba2 = cba.a;
/*     */           }
/*     */           
/* 230 */           if (i2 == 0 && i3 == 0 && i4 == 0) {
/* 231 */             cba1 = cba2;
/*     */           }
/*     */           
/* 234 */           enumSet.add(cba2);
/*     */         } 
/*     */       } 
/*     */     } 
/* 238 */     return cba1;
/*     */   }
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k) {
/* 243 */     cba cba = b(☃, i, j, k);
/*     */     
/* 245 */     if (cba == cba.g) {
/* 246 */       for (eq eq : eq.values()) {
/* 247 */         cba cba1 = b(☃, i + eq.g(), j + eq.h(), k + eq.i());
/* 248 */         if (cba1 == cba.a) {
/* 249 */           return cba.h;
/*     */         }
/*     */       } 
/*     */       
/* 253 */       return cba.g;
/*     */     } 
/*     */     
/* 256 */     if (cba == cba.b && j >= 1) {
/* 257 */       bcs bcs = ☃.a_(new el(i, j - 1, k)).c();
/* 258 */       cba cba1 = b(☃, i, j - 1, k);
/* 259 */       if (cba1 == cba.c || cba1 == cba.b || cba1 == cba.f) {
/* 260 */         cba = cba.b;
/*     */       } else {
/* 262 */         cba = cba.c;
/*     */       } 
/*     */       
/* 265 */       if (cba1 == cba.k || bcs == bct.ik) {
/* 266 */         cba = cba.k;
/*     */       }
/*     */       
/* 269 */       if (cba1 == cba.m) {
/* 270 */         cba = cba.m;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 275 */     cba = a(☃, i, j, k, cba);
/*     */     
/* 277 */     return cba;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */