/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ public class byl
/*     */ {
/*   6 */   private static final int[][] e = new int[][] { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  20 */   public static final double a = Math.sqrt(3.0D);
/*     */   
/*  22 */   private final int[] f = new int[512];
/*     */   
/*     */   public double b;
/*     */   
/*     */   public double c;
/*     */   public double d;
/*     */   
/*     */   public byl(Random ☃) {
/*  30 */     this.b = ☃.nextDouble() * 256.0D;
/*  31 */     this.c = ☃.nextDouble() * 256.0D;
/*  32 */     this.d = ☃.nextDouble() * 256.0D; int i;
/*  33 */     for (i = 0; i < 256; i++) {
/*  34 */       this.f[i] = i;
/*     */     }
/*     */     
/*  37 */     for (i = 0; i < 256; i++) {
/*  38 */       int j = ☃.nextInt(256 - i) + i;
/*  39 */       int k = this.f[i];
/*  40 */       this.f[i] = this.f[j];
/*  41 */       this.f[j] = k;
/*     */       
/*  43 */       this.f[i + 256] = this.f[i];
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(double ☃) {
/*  49 */     return (☃ > 0.0D) ? (int)☃ : ((int)☃ - 1);
/*     */   }
/*     */   
/*     */   private static double a(int[] ☃, double d1, double d2) {
/*  53 */     return ☃[0] * d1 + ☃[1] * d2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double a(double ☃, double d1) {
/*     */     double d2, d3, d4;
/*     */     int k, m;
/*  66 */     double d5 = 0.5D * (a - 1.0D);
/*  67 */     double d6 = (☃ + d1) * d5;
/*  68 */     int i = a(☃ + d6);
/*  69 */     int j = a(d1 + d6);
/*  70 */     double d7 = (3.0D - a) / 6.0D;
/*  71 */     double d8 = (i + j) * d7;
/*  72 */     double d9 = i - d8;
/*  73 */     double d10 = j - d8;
/*  74 */     double d11 = ☃ - d9;
/*  75 */     double d12 = d1 - d10;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     if (d11 > d12) {
/*  81 */       k = 1;
/*  82 */       m = 0;
/*     */     } else {
/*     */       
/*  85 */       k = 0;
/*  86 */       m = 1;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     double d13 = d11 - k + d7;
/*  93 */     double d14 = d12 - m + d7;
/*  94 */     double d15 = d11 - 1.0D + 2.0D * d7;
/*  95 */     double d16 = d12 - 1.0D + 2.0D * d7;
/*     */     
/*  97 */     int n = i & 0xFF;
/*  98 */     int i1 = j & 0xFF;
/*  99 */     int i2 = this.f[n + this.f[i1]] % 12;
/* 100 */     int i3 = this.f[n + k + this.f[i1 + m]] % 12;
/* 101 */     int i4 = this.f[n + 1 + this.f[i1 + 1]] % 12;
/*     */     
/* 103 */     double d17 = 0.5D - d11 * d11 - d12 * d12;
/* 104 */     if (d17 < 0.0D) {
/* 105 */       d2 = 0.0D;
/*     */     } else {
/* 107 */       d17 *= d17;
/* 108 */       d2 = d17 * d17 * a(e[i2], d11, d12);
/*     */     } 
/* 110 */     double d18 = 0.5D - d13 * d13 - d14 * d14;
/* 111 */     if (d18 < 0.0D) {
/* 112 */       d3 = 0.0D;
/*     */     } else {
/* 114 */       d18 *= d18;
/* 115 */       d3 = d18 * d18 * a(e[i3], d13, d14);
/*     */     } 
/* 117 */     double d19 = 0.5D - d15 * d15 - d16 * d16;
/* 118 */     if (d19 < 0.0D) {
/* 119 */       d4 = 0.0D;
/*     */     } else {
/* 121 */       d19 *= d19;
/* 122 */       d4 = d19 * d19 * a(e[i4], d15, d16);
/*     */     } 
/*     */ 
/*     */     
/* 126 */     return 70.0D * (d2 + d3 + d4);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 261 */   private static final double g = 0.5D * (a - 1.0D);
/* 262 */   private static final double h = (3.0D - a) / 6.0D;
/*     */   
/*     */   public void a(double[] ☃, double d1, double d2, int i, int j, double d3, double d4, double d5) {
/* 265 */     int k = 0;
/* 266 */     for (int m = 0; m < j; m++) {
/* 267 */       double d = (d2 + m) * d4 + this.c;
/* 268 */       for (int n = 0; n < i; n++) {
/* 269 */         double d7, d8, d9; int i3, i4; double d6 = (d1 + n) * d3 + this.b;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 274 */         double d10 = (d6 + d) * g;
/* 275 */         int i1 = a(d6 + d10);
/* 276 */         int i2 = a(d + d10);
/* 277 */         double d11 = (i1 + i2) * h;
/* 278 */         double d12 = i1 - d11;
/* 279 */         double d13 = i2 - d11;
/* 280 */         double d14 = d6 - d12;
/* 281 */         double d15 = d - d13;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 286 */         if (d14 > d15) {
/* 287 */           i3 = 1;
/* 288 */           i4 = 0;
/*     */         } else {
/*     */           
/* 291 */           i3 = 0;
/* 292 */           i4 = 1;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 298 */         double d16 = d14 - i3 + h;
/* 299 */         double d17 = d15 - i4 + h;
/* 300 */         double d18 = d14 - 1.0D + 2.0D * h;
/* 301 */         double d19 = d15 - 1.0D + 2.0D * h;
/*     */         
/* 303 */         int i5 = i1 & 0xFF;
/* 304 */         int i6 = i2 & 0xFF;
/* 305 */         int i7 = this.f[i5 + this.f[i6]] % 12;
/* 306 */         int i8 = this.f[i5 + i3 + this.f[i6 + i4]] % 12;
/* 307 */         int i9 = this.f[i5 + 1 + this.f[i6 + 1]] % 12;
/*     */         
/* 309 */         double d20 = 0.5D - d14 * d14 - d15 * d15;
/* 310 */         if (d20 < 0.0D) {
/* 311 */           d7 = 0.0D;
/*     */         } else {
/* 313 */           d20 *= d20;
/* 314 */           d7 = d20 * d20 * a(e[i7], d14, d15);
/*     */         } 
/* 316 */         double d21 = 0.5D - d16 * d16 - d17 * d17;
/* 317 */         if (d21 < 0.0D) {
/* 318 */           d8 = 0.0D;
/*     */         } else {
/* 320 */           d21 *= d21;
/* 321 */           d8 = d21 * d21 * a(e[i8], d16, d17);
/*     */         } 
/* 323 */         double d22 = 0.5D - d18 * d18 - d19 * d19;
/* 324 */         if (d22 < 0.0D) {
/* 325 */           d9 = 0.0D;
/*     */         } else {
/* 327 */           d22 *= d22;
/* 328 */           d9 = d22 * d22 * a(e[i9], d18, d19);
/*     */         } 
/*     */ 
/*     */         
/* 332 */         ☃[k++] = ☃[k++] + 70.0D * (d7 + d8 + d9) * d5;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\byl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */