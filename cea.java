/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cea
/*     */ {
/*     */   public final double a;
/*     */   public final double b;
/*     */   public final double c;
/*     */   public final double d;
/*     */   public final double e;
/*     */   public final double f;
/*     */   
/*     */   public cea(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  19 */     this.a = Math.min(☃, d3);
/*  20 */     this.b = Math.min(d1, d4);
/*  21 */     this.c = Math.min(d2, d5);
/*  22 */     this.d = Math.max(☃, d3);
/*  23 */     this.e = Math.max(d1, d4);
/*  24 */     this.f = Math.max(d2, d5);
/*     */   }
/*     */   
/*     */   public cea(el ☃) {
/*  28 */     this(☃.o(), ☃.p(), ☃.q(), (☃.o() + 1), (☃.p() + 1), (☃.q() + 1));
/*     */   }
/*     */   
/*     */   public cea(el ☃, el el1) {
/*  32 */     this(☃.o(), ☃.p(), ☃.q(), el1.o(), el1.p(), el1.q());
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
/*     */   public double a(eq.a ☃) {
/*  64 */     return ☃.a(this.a, this.b, this.c);
/*     */   }
/*     */   
/*     */   public double b(eq.a ☃) {
/*  68 */     return ☃.a(this.d, this.e, this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  73 */     if (this == ☃) {
/*  74 */       return true;
/*     */     }
/*  76 */     if (!(☃ instanceof cea)) {
/*  77 */       return false;
/*     */     }
/*     */     
/*  80 */     cea cea1 = (cea)☃;
/*     */     
/*  82 */     if (Double.compare(cea1.a, this.a) != 0) {
/*  83 */       return false;
/*     */     }
/*  85 */     if (Double.compare(cea1.b, this.b) != 0) {
/*  86 */       return false;
/*     */     }
/*  88 */     if (Double.compare(cea1.c, this.c) != 0) {
/*  89 */       return false;
/*     */     }
/*  91 */     if (Double.compare(cea1.d, this.d) != 0) {
/*  92 */       return false;
/*     */     }
/*  94 */     if (Double.compare(cea1.e, this.e) != 0) {
/*  95 */       return false;
/*     */     }
/*  97 */     return (Double.compare(cea1.f, this.f) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 102 */     long ☃ = Double.doubleToLongBits(this.a);
/* 103 */     int i = (int)(☃ ^ ☃ >>> 32L);
/* 104 */     ☃ = Double.doubleToLongBits(this.b);
/* 105 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 106 */     ☃ = Double.doubleToLongBits(this.c);
/* 107 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 108 */     ☃ = Double.doubleToLongBits(this.d);
/* 109 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 110 */     ☃ = Double.doubleToLongBits(this.e);
/* 111 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 112 */     ☃ = Double.doubleToLongBits(this.f);
/* 113 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 114 */     return i;
/*     */   }
/*     */   
/*     */   public cea a(double ☃, double d1, double d2) {
/* 118 */     double d3 = this.a;
/* 119 */     double d4 = this.b;
/* 120 */     double d5 = this.c;
/* 121 */     double d6 = this.d;
/* 122 */     double d7 = this.e;
/* 123 */     double d8 = this.f;
/*     */     
/* 125 */     if (☃ < 0.0D) {
/* 126 */       d3 -= ☃;
/* 127 */     } else if (☃ > 0.0D) {
/* 128 */       d6 -= ☃;
/*     */     } 
/*     */     
/* 131 */     if (d1 < 0.0D) {
/* 132 */       d4 -= d1;
/* 133 */     } else if (d1 > 0.0D) {
/* 134 */       d7 -= d1;
/*     */     } 
/*     */     
/* 137 */     if (d2 < 0.0D) {
/* 138 */       d5 -= d2;
/* 139 */     } else if (d2 > 0.0D) {
/* 140 */       d8 -= d2;
/*     */     } 
/*     */     
/* 143 */     return new cea(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public cea b(double ☃, double d1, double d2) {
/* 147 */     double d3 = this.a;
/* 148 */     double d4 = this.b;
/* 149 */     double d5 = this.c;
/* 150 */     double d6 = this.d;
/* 151 */     double d7 = this.e;
/* 152 */     double d8 = this.f;
/*     */     
/* 154 */     if (☃ < 0.0D) {
/* 155 */       d3 += ☃;
/* 156 */     } else if (☃ > 0.0D) {
/* 157 */       d6 += ☃;
/*     */     } 
/*     */     
/* 160 */     if (d1 < 0.0D) {
/* 161 */       d4 += d1;
/* 162 */     } else if (d1 > 0.0D) {
/* 163 */       d7 += d1;
/*     */     } 
/*     */     
/* 166 */     if (d2 < 0.0D) {
/* 167 */       d5 += d2;
/* 168 */     } else if (d2 > 0.0D) {
/* 169 */       d8 += d2;
/*     */     } 
/*     */     
/* 172 */     return new cea(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public cea c(double ☃, double d1, double d2) {
/* 176 */     double d3 = this.a - ☃;
/* 177 */     double d4 = this.b - d1;
/* 178 */     double d5 = this.c - d2;
/* 179 */     double d6 = this.d + ☃;
/* 180 */     double d7 = this.e + d1;
/* 181 */     double d8 = this.f + d2;
/*     */     
/* 183 */     return new cea(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public cea g(double ☃) {
/* 187 */     return c(☃, ☃, ☃);
/*     */   }
/*     */   
/*     */   public cea a(cea ☃) {
/* 191 */     double d1 = Math.max(this.a, ☃.a);
/* 192 */     double d2 = Math.max(this.b, ☃.b);
/* 193 */     double d3 = Math.max(this.c, ☃.c);
/* 194 */     double d4 = Math.min(this.d, ☃.d);
/* 195 */     double d5 = Math.min(this.e, ☃.e);
/* 196 */     double d6 = Math.min(this.f, ☃.f);
/*     */     
/* 198 */     return new cea(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public cea b(cea ☃) {
/* 202 */     double d1 = Math.min(this.a, ☃.a);
/* 203 */     double d2 = Math.min(this.b, ☃.b);
/* 204 */     double d3 = Math.min(this.c, ☃.c);
/* 205 */     double d4 = Math.max(this.d, ☃.d);
/* 206 */     double d5 = Math.max(this.e, ☃.e);
/* 207 */     double d6 = Math.max(this.f, ☃.f);
/*     */     
/* 209 */     return new cea(d1, d2, d3, d4, d5, d6);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public cea d(double ☃, double d1, double d2) {
/* 245 */     return new cea(this.a + ☃, this.b + d1, this.c + d2, this.d + ☃, this.e + d1, this.f + d2);
/*     */   }
/*     */   
/*     */   public cea a(el ☃) {
/* 249 */     return new cea(this.a + ☃.o(), this.b + ☃.p(), this.c + ☃.q(), this.d + ☃.o(), this.e + ☃.p(), this.f + ☃.q());
/*     */   }
/*     */   
/*     */   public cea a(cee ☃) {
/* 253 */     return d(☃.b, ☃.c, ☃.d);
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
/*     */   public boolean c(cea ☃) {
/* 323 */     return a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 328 */     return (this.a < d3 && this.d > ☃ && this.b < d4 && this.e > d1 && this.c < d5 && this.f > d2);
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
/*     */   public boolean b(cee ☃) {
/* 341 */     return e(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public boolean e(double ☃, double d1, double d2) {
/* 345 */     return (☃ >= this.a && ☃ < this.d && d1 >= this.b && d1 < this.e && d2 >= this.c && d2 < this.f);
/*     */   }
/*     */   
/*     */   public double a() {
/* 349 */     double ☃ = this.d - this.a;
/* 350 */     double d1 = this.e - this.b;
/* 351 */     double d2 = this.f - this.c;
/* 352 */     return (☃ + d1 + d2) / 3.0D;
/*     */   }
/*     */   
/*     */   public cea f(double ☃, double d1, double d2) {
/* 356 */     return c(-☃, -d1, -d2);
/*     */   }
/*     */   
/*     */   public cea h(double ☃) {
/* 360 */     return g(-☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ceb b(cee ☃, cee cee1) {
/* 365 */     return a(☃, cee1, (el)null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ceb a(cee ☃, cee cee1, @Nullable el el1) {
/* 370 */     double[] arrayOfDouble = { 1.0D };
/* 371 */     eq eq = null;
/*     */     
/* 373 */     double d1 = cee1.b - ☃.b;
/* 374 */     double d2 = cee1.c - ☃.c;
/* 375 */     double d3 = cee1.d - ☃.d;
/*     */     
/* 377 */     eq = a((el1 == null) ? this : a(el1), ☃, arrayOfDouble, eq, d1, d2, d3);
/*     */     
/* 379 */     if (eq == null) {
/* 380 */       return null;
/*     */     }
/*     */     
/* 383 */     double d4 = arrayOfDouble[0];
/* 384 */     return new ceb(☃.b(d4 * d1, d4 * d2, d4 * d3), eq, (el1 == null) ? el.a : el1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ceb a(Iterable<cea> ☃, cee cee1, cee cee2, el el1) {
/* 389 */     double[] arrayOfDouble = { 1.0D };
/* 390 */     eq eq = null;
/*     */     
/* 392 */     double d1 = cee2.b - cee1.b;
/* 393 */     double d2 = cee2.c - cee1.c;
/* 394 */     double d3 = cee2.d - cee1.d;
/*     */     
/* 396 */     for (cea cea1 : ☃) {
/* 397 */       eq = a(cea1.a(el1), cee1, arrayOfDouble, eq, d1, d2, d3);
/*     */     }
/*     */     
/* 400 */     if (eq == null) {
/* 401 */       return null;
/*     */     }
/*     */     
/* 404 */     double d4 = arrayOfDouble[0];
/* 405 */     return new ceb(cee1.b(d4 * d1, d4 * d2, d4 * d3), eq, el1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static eq a(cea ☃, cee cee1, double[] arrayOfDouble, @Nullable eq eq1, double d1, double d2, double d3) {
/* 410 */     if (d1 > 1.0E-7D) {
/* 411 */       eq1 = a(arrayOfDouble, eq1, d1, d2, d3, ☃.a, ☃.b, ☃.e, ☃.c, ☃.f, eq.e, cee1.b, cee1.c, cee1.d);
/* 412 */     } else if (d1 < -1.0E-7D) {
/* 413 */       eq1 = a(arrayOfDouble, eq1, d1, d2, d3, ☃.d, ☃.b, ☃.e, ☃.c, ☃.f, eq.f, cee1.b, cee1.c, cee1.d);
/*     */     } 
/*     */     
/* 416 */     if (d2 > 1.0E-7D) {
/* 417 */       eq1 = a(arrayOfDouble, eq1, d2, d3, d1, ☃.b, ☃.c, ☃.f, ☃.a, ☃.d, eq.a, cee1.c, cee1.d, cee1.b);
/* 418 */     } else if (d2 < -1.0E-7D) {
/* 419 */       eq1 = a(arrayOfDouble, eq1, d2, d3, d1, ☃.e, ☃.c, ☃.f, ☃.a, ☃.d, eq.b, cee1.c, cee1.d, cee1.b);
/*     */     } 
/*     */     
/* 422 */     if (d3 > 1.0E-7D) {
/* 423 */       eq1 = a(arrayOfDouble, eq1, d3, d1, d2, ☃.c, ☃.a, ☃.d, ☃.b, ☃.e, eq.c, cee1.d, cee1.b, cee1.c);
/* 424 */     } else if (d3 < -1.0E-7D) {
/* 425 */       eq1 = a(arrayOfDouble, eq1, d3, d1, d2, ☃.f, ☃.a, ☃.d, ☃.b, ☃.e, eq.d, cee1.d, cee1.b, cee1.c);
/*     */     } 
/* 427 */     return eq1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static eq a(double[] ☃, @Nullable eq eq1, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, eq eq2, double d9, double d10, double d11) {
/* 432 */     double d12 = (d4 - d9) / d1;
/* 433 */     double d13 = d10 + d12 * d2;
/* 434 */     double d14 = d11 + d12 * d3;
/* 435 */     if (0.0D < d12 && d12 < ☃[0] && d5 - 1.0E-7D < d13 && d13 < d6 + 1.0E-7D && d7 - 1.0E-7D < d14 && d14 < d8 + 1.0E-7D) {
/*     */ 
/*     */ 
/*     */       
/* 439 */       ☃[0] = d12;
/* 440 */       return eq2;
/*     */     } 
/* 442 */     return eq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 447 */     return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */