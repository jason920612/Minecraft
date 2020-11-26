/*     */ import java.util.Random;
/*     */ 
/*     */ public class byi
/*     */   extends bym
/*     */ {
/*   6 */   private final int[] d = new int[512];
/*     */   
/*     */   public double a;
/*     */   
/*     */   public double b;
/*     */   public double c;
/*     */   
/*     */   public byi(Random ☃) {
/*  14 */     this.a = ☃.nextDouble() * 256.0D;
/*  15 */     this.b = ☃.nextDouble() * 256.0D;
/*  16 */     this.c = ☃.nextDouble() * 256.0D; int i;
/*  17 */     for (i = 0; i < 256; i++) {
/*  18 */       this.d[i] = i;
/*     */     }
/*     */     
/*  21 */     for (i = 0; i < 256; i++) {
/*  22 */       int j = ☃.nextInt(256 - i) + i;
/*  23 */       int k = this.d[i];
/*  24 */       this.d[i] = this.d[j];
/*  25 */       this.d[j] = k;
/*     */       
/*  27 */       this.d[i + 256] = this.d[i];
/*     */     } 
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2) {
/*  32 */     double d3 = ☃ + this.a;
/*  33 */     double d4 = d1 + this.b;
/*  34 */     double d5 = d2 + this.c;
/*     */     
/*  36 */     int i = (int)d3;
/*  37 */     int j = (int)d4;
/*  38 */     int k = (int)d5;
/*     */     
/*  40 */     if (d3 < i) {
/*  41 */       i--;
/*     */     }
/*  43 */     if (d4 < j) {
/*  44 */       j--;
/*     */     }
/*  46 */     if (d5 < k) {
/*  47 */       k--;
/*     */     }
/*     */     
/*  50 */     int m = i & 0xFF;
/*  51 */     int n = j & 0xFF;
/*  52 */     int i1 = k & 0xFF;
/*     */     
/*  54 */     d3 -= i;
/*  55 */     d4 -= j;
/*  56 */     d5 -= k;
/*     */     
/*  58 */     double d6 = d3 * d3 * d3 * (d3 * (d3 * 6.0D - 15.0D) + 10.0D);
/*  59 */     double d7 = d4 * d4 * d4 * (d4 * (d4 * 6.0D - 15.0D) + 10.0D);
/*  60 */     double d8 = d5 * d5 * d5 * (d5 * (d5 * 6.0D - 15.0D) + 10.0D);
/*     */     
/*  62 */     int i2 = this.d[m] + n;
/*  63 */     int i3 = this.d[i2] + i1;
/*  64 */     int i4 = this.d[i2 + 1] + i1;
/*  65 */     int i5 = this.d[m + 1] + n;
/*  66 */     int i6 = this.d[i5] + i1;
/*  67 */     int i7 = this.d[i5 + 1] + i1;
/*     */ 
/*     */     
/*  70 */     return b(d8, 
/*     */         
/*  72 */         b(d7, 
/*     */           
/*  74 */           b(d6, a(this.d[i3], d3, d4, d5), a(this.d[i6], d3 - 1.0D, d4, d5)), 
/*  75 */           b(d6, a(this.d[i4], d3, d4 - 1.0D, d5), a(this.d[i7], d3 - 1.0D, d4 - 1.0D, d5))), 
/*     */         
/*  77 */         b(d7, 
/*     */           
/*  79 */           b(d6, a(this.d[i3 + 1], d3, d4, d5 - 1.0D), a(this.d[i6 + 1], d3 - 1.0D, d4, d5 - 1.0D)), 
/*  80 */           b(d6, a(this.d[i4 + 1], d3, d4 - 1.0D, d5 - 1.0D), a(this.d[i7 + 1], d3 - 1.0D, d4 - 1.0D, d5 - 1.0D))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final double b(double ☃, double d1, double d2) {
/*  86 */     return d1 + ☃ * (d2 - d1);
/*     */   }
/*     */   
/*  89 */   private static final double[] e = new double[] { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  90 */   private static final double[] f = new double[] { 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D };
/*  91 */   private static final double[] g = new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*  92 */   private static final double[] h = new double[] { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  93 */   private static final double[] i = new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*     */   
/*     */   public final double a(int ☃, double d1, double d2) {
/*  96 */     int i = ☃ & 0xF;
/*  97 */     return h[i] * d1 + i[i] * d2;
/*     */   }
/*     */   
/*     */   public final double a(int ☃, double d1, double d2, double d3) {
/* 101 */     int i = ☃ & 0xF;
/* 102 */     return e[i] * d1 + f[i] * d2 + g[i] * d3;
/*     */   }
/*     */ 
/*     */   
/*     */   public double a(double ☃, double d1) {
/* 107 */     return a(☃, d1, 0.0D);
/*     */   }
/*     */   
/*     */   public double c(double ☃, double d1, double d2) {
/* 111 */     return a(☃, d1, d2);
/*     */   }
/*     */   
/*     */   public void a(double[] ☃, double d1, double d2, double d3, int i, int j, int k, double d4, double d5, double d6, double d7) {
/* 115 */     if (j == 1) {
/* 116 */       int i8 = 0;
/* 117 */       int i9 = 0;
/* 118 */       int i10 = 0;
/* 119 */       int i11 = 0;
/* 120 */       double d13 = 0.0D;
/* 121 */       double d14 = 0.0D;
/* 122 */       int i12 = 0;
/* 123 */       double d15 = 1.0D / d7;
/* 124 */       for (int i13 = 0; i13 < i; i13++) {
/* 125 */         double d16 = d1 + i13 * d4 + this.a;
/* 126 */         int i14 = (int)d16;
/* 127 */         if (d16 < i14) {
/* 128 */           i14--;
/*     */         }
/* 130 */         int i15 = i14 & 0xFF;
/* 131 */         d16 -= i14;
/* 132 */         double d17 = d16 * d16 * d16 * (d16 * (d16 * 6.0D - 15.0D) + 10.0D);
/*     */         
/* 134 */         for (int i16 = 0; i16 < k; i16++) {
/* 135 */           double d18 = d3 + i16 * d6 + this.c;
/* 136 */           int i17 = (int)d18;
/* 137 */           if (d18 < i17) {
/* 138 */             i17--;
/*     */           }
/* 140 */           int i18 = i17 & 0xFF;
/* 141 */           d18 -= i17;
/* 142 */           double d19 = d18 * d18 * d18 * (d18 * (d18 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 144 */           i8 = this.d[i15] + 0;
/* 145 */           i9 = this.d[i8] + i18;
/* 146 */           i10 = this.d[i15 + 1] + 0;
/* 147 */           i11 = this.d[i10] + i18;
/* 148 */           d13 = b(d17, a(this.d[i9], d16, d18), a(this.d[i11], d16 - 1.0D, 0.0D, d18));
/* 149 */           d14 = b(d17, a(this.d[i9 + 1], d16, 0.0D, d18 - 1.0D), a(this.d[i11 + 1], d16 - 1.0D, 0.0D, d18 - 1.0D));
/*     */           
/* 151 */           double d20 = b(d19, d13, d14);
/*     */           
/* 153 */           ☃[i12++] = ☃[i12++] + d20 * d15;
/*     */         } 
/*     */       } 
/*     */       return;
/*     */     } 
/* 158 */     int m = 0;
/* 159 */     double d8 = 1.0D / d7;
/* 160 */     int n = -1;
/* 161 */     int i1 = 0;
/* 162 */     int i2 = 0;
/* 163 */     int i3 = 0;
/* 164 */     int i4 = 0;
/* 165 */     int i5 = 0;
/* 166 */     int i6 = 0;
/* 167 */     double d9 = 0.0D;
/* 168 */     double d10 = 0.0D;
/* 169 */     double d11 = 0.0D;
/* 170 */     double d12 = 0.0D;
/*     */     
/* 172 */     for (int i7 = 0; i7 < i; i7++) {
/* 173 */       double d13 = d1 + i7 * d4 + this.a;
/* 174 */       int i8 = (int)d13;
/* 175 */       if (d13 < i8) {
/* 176 */         i8--;
/*     */       }
/* 178 */       int i9 = i8 & 0xFF;
/* 179 */       d13 -= i8;
/* 180 */       double d14 = d13 * d13 * d13 * (d13 * (d13 * 6.0D - 15.0D) + 10.0D);
/*     */       
/* 182 */       for (int i10 = 0; i10 < k; i10++) {
/* 183 */         double d15 = d3 + i10 * d6 + this.c;
/* 184 */         int i11 = (int)d15;
/* 185 */         if (d15 < i11) {
/* 186 */           i11--;
/*     */         }
/* 188 */         int i12 = i11 & 0xFF;
/* 189 */         d15 -= i11;
/* 190 */         double d16 = d15 * d15 * d15 * (d15 * (d15 * 6.0D - 15.0D) + 10.0D);
/*     */         
/* 192 */         for (int i13 = 0; i13 < j; i13++) {
/* 193 */           double d17 = d2 + i13 * d5 + this.b;
/* 194 */           int i14 = (int)d17;
/* 195 */           if (d17 < i14) {
/* 196 */             i14--;
/*     */           }
/* 198 */           int i15 = i14 & 0xFF;
/* 199 */           d17 -= i14;
/* 200 */           double d18 = d17 * d17 * d17 * (d17 * (d17 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 202 */           if (i13 == 0 || i15 != n) {
/* 203 */             n = i15;
/* 204 */             i1 = this.d[i9] + i15;
/* 205 */             i2 = this.d[i1] + i12;
/* 206 */             i3 = this.d[i1 + 1] + i12;
/* 207 */             i4 = this.d[i9 + 1] + i15;
/* 208 */             i5 = this.d[i4] + i12;
/* 209 */             i6 = this.d[i4 + 1] + i12;
/* 210 */             d9 = b(d14, a(this.d[i2], d13, d17, d15), a(this.d[i5], d13 - 1.0D, d17, d15));
/* 211 */             d10 = b(d14, a(this.d[i3], d13, d17 - 1.0D, d15), a(this.d[i6], d13 - 1.0D, d17 - 1.0D, d15));
/* 212 */             d11 = b(d14, a(this.d[i2 + 1], d13, d17, d15 - 1.0D), a(this.d[i5 + 1], d13 - 1.0D, d17, d15 - 1.0D));
/* 213 */             d12 = b(d14, a(this.d[i3 + 1], d13, d17 - 1.0D, d15 - 1.0D), a(this.d[i6 + 1], d13 - 1.0D, d17 - 1.0D, d15 - 1.0D));
/*     */           } 
/*     */           
/* 216 */           double d19 = b(d18, d9, d10);
/* 217 */           double d20 = b(d18, d11, d12);
/* 218 */           double d21 = b(d16, d19, d20);
/*     */           
/* 220 */           ☃[m++] = ☃[m++] + d21 * d8;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\byi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */