/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.function.IntPredicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xq
/*     */ {
/*  31 */   public static final float a = c(2.0F);
/*     */   private static final float[] b;
/*     */   
/*     */   static {
/*  35 */     b = k.<float[]>a(new float[65536], ☃ -> {
/*     */           for (int i = 0; i < ☃.length; i++)
/*     */             ☃[i] = (float)Math.sin(i * Math.PI * 2.0D / 65536.0D); 
/*     */         });
/*     */   }
/*     */   
/*  41 */   private static final Random c = new Random();
/*     */   
/*     */   public static float a(float ☃) {
/*  44 */     return b[(int)(☃ * 10430.378F) & 0xFFFF];
/*     */   }
/*     */   
/*     */   public static float b(float ☃) {
/*  48 */     return b[(int)(☃ * 10430.378F + 16384.0F) & 0xFFFF];
/*     */   }
/*     */   
/*     */   public static float c(float ☃) {
/*  52 */     return (float)Math.sqrt(☃);
/*     */   }
/*     */   
/*     */   public static float a(double ☃) {
/*  56 */     return (float)Math.sqrt(☃);
/*     */   }
/*     */   
/*     */   public static int d(float ☃) {
/*  60 */     int i = (int)☃;
/*  61 */     return (☃ < i) ? (i - 1) : i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int c(double ☃) {
/*  69 */     int i = (int)☃;
/*  70 */     return (☃ < i) ? (i - 1) : i;
/*     */   }
/*     */   
/*     */   public static long d(double ☃) {
/*  74 */     long l = (long)☃;
/*  75 */     return (☃ < l) ? (l - 1L) : l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float e(float ☃) {
/*  83 */     return (☃ >= 0.0F) ? ☃ : -☃;
/*     */   }
/*     */   
/*     */   public static int a(int ☃) {
/*  87 */     return (☃ >= 0) ? ☃ : -☃;
/*     */   }
/*     */   
/*     */   public static int f(float ☃) {
/*  91 */     int i = (int)☃;
/*  92 */     return (☃ > i) ? (i + 1) : i;
/*     */   }
/*     */   
/*     */   public static int f(double ☃) {
/*  96 */     int i = (int)☃;
/*  97 */     return (☃ > i) ? (i + 1) : i;
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
/*     */   public static int a(int ☃, int i, int j) {
/* 111 */     if (☃ < i) {
/* 112 */       return i;
/*     */     }
/* 114 */     if (☃ > j) {
/* 115 */       return j;
/*     */     }
/* 117 */     return ☃;
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
/*     */   public static float a(float ☃, float f1, float f2) {
/* 131 */     if (☃ < f1) {
/* 132 */       return f1;
/*     */     }
/* 134 */     if (☃ > f2) {
/* 135 */       return f2;
/*     */     }
/* 137 */     return ☃;
/*     */   }
/*     */   
/*     */   public static double a(double ☃, double d1, double d2) {
/* 141 */     if (☃ < d1) {
/* 142 */       return d1;
/*     */     }
/* 144 */     if (☃ > d2) {
/* 145 */       return d2;
/*     */     }
/* 147 */     return ☃;
/*     */   }
/*     */   
/*     */   public static double b(double ☃, double d1, double d2) {
/* 151 */     if (d2 < 0.0D) {
/* 152 */       return ☃;
/*     */     }
/* 154 */     if (d2 > 1.0D) {
/* 155 */       return d1;
/*     */     }
/* 157 */     return ☃ + (d1 - ☃) * d2;
/*     */   }
/*     */   
/*     */   public static double a(double ☃, double d1) {
/* 161 */     if (☃ < 0.0D) {
/* 162 */       ☃ = -☃;
/*     */     }
/* 164 */     if (d1 < 0.0D) {
/* 165 */       d1 = -d1;
/*     */     }
/* 167 */     return (☃ > d1) ? ☃ : d1;
/*     */   }
/*     */   
/*     */   public static int a(int ☃, int i) {
/* 171 */     return Math.floorDiv(☃, i);
/*     */   }
/*     */   
/*     */   public static int a(Random ☃, int i, int j) {
/* 175 */     if (i >= j) {
/* 176 */       return i;
/*     */     }
/* 178 */     return ☃.nextInt(j - i + 1) + i;
/*     */   }
/*     */   
/*     */   public static float a(Random ☃, float f1, float f2) {
/* 182 */     if (f1 >= f2) {
/* 183 */       return f1;
/*     */     }
/* 185 */     return ☃.nextFloat() * (f2 - f1) + f1;
/*     */   }
/*     */   
/*     */   public static double a(Random ☃, double d1, double d2) {
/* 189 */     if (d1 >= d2) {
/* 190 */       return d1;
/*     */     }
/* 192 */     return ☃.nextDouble() * (d2 - d1) + d1;
/*     */   }
/*     */   
/*     */   public static double a(long[] ☃) {
/* 196 */     long l = 0L;
/*     */     
/* 198 */     for (long l1 : ☃) {
/* 199 */       l += l1;
/*     */     }
/*     */     
/* 202 */     return l / ☃.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int b(int ☃, int i) {
/* 210 */     return Math.floorMod(☃, i);
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
/*     */   public static float g(float ☃) {
/* 222 */     ☃ %= 360.0F;
/* 223 */     if (☃ >= 180.0F) {
/* 224 */       ☃ -= 360.0F;
/*     */     }
/* 226 */     if (☃ < -180.0F) {
/* 227 */       ☃ += 360.0F;
/*     */     }
/* 229 */     return ☃;
/*     */   }
/*     */   
/*     */   public static double g(double ☃) {
/* 233 */     ☃ %= 360.0D;
/* 234 */     if (☃ >= 180.0D) {
/* 235 */       ☃ -= 360.0D;
/*     */     }
/* 237 */     if (☃ < -180.0D) {
/* 238 */       ☃ += 360.0D;
/*     */     }
/* 240 */     return ☃;
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
/*     */   public static float c(float ☃, float f1) {
/* 255 */     float f = g(☃ - f1);
/*     */     
/* 257 */     if (f < 180.0F) {
/* 258 */       return f;
/*     */     }
/*     */     
/* 261 */     return f - 360.0F;
/*     */   }
/*     */   
/*     */   public static float d(float ☃, float f1) {
/* 265 */     float f = g(☃ - f1);
/*     */     
/* 267 */     if (f < 180.0F) {
/* 268 */       return e(f);
/*     */     }
/*     */     
/* 271 */     return e(f - 360.0F);
/*     */   }
/*     */   
/*     */   public static float b(float ☃, float f1, float f2) {
/* 275 */     f2 = e(f2);
/*     */     
/* 277 */     if (☃ < f1) {
/* 278 */       return a(☃ + f2, ☃, f1);
/*     */     }
/* 280 */     return a(☃ - f2, f1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public static float c(float ☃, float f1, float f2) {
/* 285 */     float f = c(f1, ☃);
/* 286 */     return b(☃, ☃ + f, f2);
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
/*     */   public static int c(int ☃) {
/* 311 */     int i = ☃ - 1;
/* 312 */     i |= i >> 1;
/* 313 */     i |= i >> 2;
/* 314 */     i |= i >> 4;
/* 315 */     i |= i >> 8;
/* 316 */     i |= i >> 16;
/* 317 */     return i + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean g(int ☃) {
/* 322 */     return (☃ != 0 && (☃ & ☃ - 1) == 0);
/*     */   }
/*     */ 
/*     */   
/* 326 */   private static final int[] d = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
/*     */ 
/*     */ 
/*     */   
/*     */   public static int d(int ☃) {
/* 331 */     ☃ = g(☃) ? ☃ : c(☃);
/* 332 */     return d[(int)(☃ * 125613361L >> 27L) & 0x1F];
/*     */   }
/*     */   
/*     */   public static int e(int ☃) {
/* 336 */     return d(☃) - (g(☃) ? 0 : 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int c(int ☃, int i) {
/* 341 */     if (i == 0) {
/* 342 */       return 0;
/*     */     }
/* 344 */     if (☃ == 0) {
/* 345 */       return i;
/*     */     }
/*     */     
/* 348 */     if (☃ < 0) {
/* 349 */       i *= -1;
/*     */     }
/*     */     
/* 352 */     int j = ☃ % i;
/* 353 */     if (j == 0) {
/* 354 */       return ☃;
/*     */     }
/* 356 */     return ☃ + i - j;
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
/*     */   public static long c(int ☃, int i, int j) {
/* 420 */     long l = (☃ * 3129871) ^ j * 116129781L ^ i;
/* 421 */     l = l * l * 42317861L + l * 11L;
/* 422 */     return l >> 16L;
/*     */   }
/*     */   
/*     */   public static UUID a(Random ☃) {
/* 426 */     long l1 = ☃.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
/* 427 */     long l2 = ☃.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
/* 428 */     return new UUID(l1, l2);
/*     */   }
/*     */   
/*     */   public static UUID a() {
/* 432 */     return a(c);
/*     */   }
/*     */   
/*     */   public static double c(double ☃, double d1, double d2) {
/* 436 */     return (☃ - d1) / (d2 - d1);
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
/*     */   public static double c(double ☃, double d1) {
/* 482 */     double d2 = d1 * d1 + ☃ * ☃;
/*     */ 
/*     */     
/* 485 */     if (Double.isNaN(d2)) {
/* 486 */       return Double.NaN;
/*     */     }
/*     */ 
/*     */     
/* 490 */     boolean bool1 = (☃ < 0.0D);
/* 491 */     if (bool1) {
/* 492 */       ☃ = -☃;
/*     */     }
/* 494 */     boolean bool2 = (d1 < 0.0D);
/* 495 */     if (bool2) {
/* 496 */       d1 = -d1;
/*     */     }
/* 498 */     boolean bool3 = (☃ > d1);
/* 499 */     if (bool3) {
/* 500 */       double d = d1;
/* 501 */       d1 = ☃;
/* 502 */       ☃ = d;
/*     */     } 
/*     */ 
/*     */     
/* 506 */     double d3 = i(d2);
/* 507 */     d1 *= d3;
/* 508 */     ☃ *= d3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 517 */     double d4 = e + ☃;
/* 518 */     int i = (int)Double.doubleToRawLongBits(d4);
/*     */ 
/*     */     
/* 521 */     double d5 = f[i];
/* 522 */     double d6 = g[i];
/*     */ 
/*     */ 
/*     */     
/* 526 */     double d7 = d4 - e;
/* 527 */     double d8 = ☃ * d6 - d1 * d7;
/*     */ 
/*     */     
/* 530 */     double d9 = (6.0D + d8 * d8) * d8 * 0.16666666666666666D;
/* 531 */     double d10 = d5 + d9;
/*     */ 
/*     */     
/* 534 */     if (bool3) {
/* 535 */       d10 = 1.5707963267948966D - d10;
/*     */     }
/* 537 */     if (bool2) {
/* 538 */       d10 = Math.PI - d10;
/*     */     }
/* 540 */     if (bool1) {
/* 541 */       d10 = -d10;
/*     */     }
/*     */     
/* 544 */     return d10;
/*     */   }
/*     */   
/*     */   public static double i(double ☃) {
/* 548 */     double d = 0.5D * ☃;
/* 549 */     long l = Double.doubleToRawLongBits(☃);
/* 550 */     l = 6910469410427058090L - (l >> 1L);
/* 551 */     ☃ = Double.longBitsToDouble(l);
/* 552 */     ☃ *= 1.5D - d * ☃ * ☃;
/* 553 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 559 */   private static final double e = Double.longBitsToDouble(4805340802404319232L);
/* 560 */   private static final double[] f = new double[257];
/* 561 */   private static final double[] g = new double[257];
/*     */ 
/*     */   
/*     */   static {
/* 565 */     for (int ☃ = 0; ☃ < 257; ☃++) {
/* 566 */       double d1 = ☃ / 256.0D;
/* 567 */       double d2 = Math.asin(d1);
/* 568 */       g[☃] = Math.cos(d2);
/* 569 */       f[☃] = d2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int f(int ☃) {
/* 628 */     ☃ ^= ☃ >>> 16;
/* 629 */     ☃ *= -2048144789;
/* 630 */     ☃ ^= ☃ >>> 13;
/* 631 */     ☃ *= -1028477387;
/* 632 */     ☃ ^= ☃ >>> 16;
/* 633 */     return ☃;
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
/*     */   public static int a(int ☃, int i, IntPredicate intPredicate) {
/* 730 */     int j = i - ☃;
/* 731 */     while (j > 0) {
/* 732 */       int k = j / 2;
/* 733 */       int m = ☃ + k;
/* 734 */       if (intPredicate.test(m)) {
/*     */         
/* 736 */         j = k; continue;
/*     */       } 
/* 738 */       ☃ = m + 1;
/* 739 */       j -= k + 1;
/*     */     } 
/*     */     
/* 742 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */