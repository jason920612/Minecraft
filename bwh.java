/*     */ import java.util.BitSet;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwh
/*     */   extends bwe<bsh>
/*     */ {
/*  18 */   private final float[] g = new float[1024];
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, Random random, int i, int j, bsh bsh1) {
/*  22 */     return (random.nextFloat() <= bsh1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, int i, int j, int k, int m, BitSet bitSet, bsh bsh1) {
/*  27 */     int n = (a() * 2 - 1) * 16;
/*     */     
/*  29 */     double d1 = (i * 16 + random.nextInt(16));
/*  30 */     double d2 = (random.nextInt(random.nextInt(40) + 8) + 20);
/*  31 */     double d3 = (j * 16 + random.nextInt(16));
/*     */     
/*  33 */     float f1 = random.nextFloat() * 6.2831855F;
/*  34 */     float f2 = (random.nextFloat() - 0.5F) * 2.0F / 8.0F;
/*  35 */     double d4 = 3.0D;
/*  36 */     float f3 = (random.nextFloat() * 2.0F + random.nextFloat()) * 2.0F;
/*  37 */     int i1 = n - random.nextInt(n / 4);
/*  38 */     int i2 = 0;
/*  39 */     a(☃, random.nextLong(), k, m, d1, d2, d3, f3, f1, f2, 0, i1, 3.0D, bitSet);
/*     */     
/*  41 */     return true;
/*     */   }
/*     */   
/*     */   private void a(axz ☃, long l, int i, int j, double d1, double d2, double d3, float f1, float f2, float f3, int k, int m, double d4, BitSet bitSet) {
/*  45 */     Random random = new Random(l);
/*     */     
/*  47 */     float f4 = 1.0F;
/*  48 */     for (int n = 0; n < 256; n++) {
/*  49 */       if (n == 0 || random.nextInt(3) == 0) {
/*  50 */         f4 = 1.0F + random.nextFloat() * random.nextFloat();
/*     */       }
/*  52 */       this.g[n] = f4 * f4;
/*     */     } 
/*     */     
/*  55 */     float f5 = 0.0F;
/*  56 */     float f6 = 0.0F;
/*     */     
/*  58 */     for (int i1 = k; i1 < m; i1++) {
/*  59 */       double d5 = 1.5D + (xq.a(i1 * 3.1415927F / m) * f1);
/*  60 */       double d6 = d5 * d4;
/*     */       
/*  62 */       d5 *= random.nextFloat() * 0.25D + 0.75D;
/*  63 */       d6 *= random.nextFloat() * 0.25D + 0.75D;
/*     */       
/*  65 */       float f7 = xq.b(f3);
/*  66 */       float f8 = xq.a(f3);
/*  67 */       d1 += (xq.b(f2) * f7);
/*  68 */       d2 += f8;
/*  69 */       d3 += (xq.a(f2) * f7);
/*     */       
/*  71 */       f3 *= 0.7F;
/*     */       
/*  73 */       f3 += f6 * 0.05F;
/*  74 */       f2 += f5 * 0.05F;
/*     */       
/*  76 */       f6 *= 0.8F;
/*  77 */       f5 *= 0.5F;
/*  78 */       f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/*  79 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*     */       
/*  81 */       if (random.nextInt(4) != 0) {
/*     */ 
/*     */ 
/*     */         
/*  85 */         if (!a(i, j, d1, d3, i1, m, f1)) {
/*     */           return;
/*     */         }
/*     */         
/*  89 */         a(☃, l, i, j, d1, d2, d3, d5, d6, bitSet);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, long l, int i, int j, double d1, double d2, double d3, double d4, double d5, BitSet bitSet) {
/*  95 */     double d6 = (i * 16 + 8);
/*  96 */     double d7 = (j * 16 + 8);
/*     */     
/*  98 */     if (d1 < d6 - 16.0D - d4 * 2.0D || d3 < d7 - 16.0D - d4 * 2.0D || d1 > d6 + 16.0D + d4 * 2.0D || d3 > d7 + 16.0D + d4 * 2.0D) {
/*  99 */       return false;
/*     */     }
/*     */     
/* 102 */     int k = Math.max(xq.c(d1 - d4) - i * 16 - 1, 0);
/* 103 */     int m = Math.min(xq.c(d1 + d4) - i * 16 + 1, 16);
/*     */     
/* 105 */     int n = Math.max(xq.c(d2 - d5) - 1, 1);
/* 106 */     int i1 = Math.min(xq.c(d2 + d5) + 1, 248);
/*     */     
/* 108 */     int i2 = Math.max(xq.c(d3 - d4) - j * 16 - 1, 0);
/* 109 */     int i3 = Math.min(xq.c(d3 + d4) - j * 16 + 1, 16);
/*     */     
/* 111 */     if (a(☃, i, j, k, m, n, i1, i2, i3)) {
/* 112 */       return false;
/*     */     }
/*     */     
/* 115 */     if (k > m || n > i1 || i2 > i3) {
/* 116 */       return false;
/*     */     }
/*     */     
/* 119 */     boolean bool = false;
/* 120 */     el.a a1 = new el.a();
/* 121 */     el.a a2 = new el.a();
/* 122 */     el.a a3 = new el.a();
/*     */     
/* 124 */     for (int i4 = k; i4 < m; i4++) {
/* 125 */       int i5 = i4 + i * 16;
/* 126 */       double d = (i5 + 0.5D - d1) / d4;
/* 127 */       for (int i6 = i2; i6 < i3; i6++) {
/* 128 */         int i7 = i6 + j * 16;
/* 129 */         double d8 = (i7 + 0.5D - d3) / d4;
/* 130 */         if (d * d + d8 * d8 < 1.0D) {
/* 131 */           boolean bool1 = false;
/*     */           
/* 133 */           for (int i8 = i1; i8 > n; i8--) {
/* 134 */             double d9 = ((i8 - 1) + 0.5D - d2) / d5;
/* 135 */             if ((d * d + d8 * d8) * this.g[i8 - 1] + d9 * d9 / 6.0D < 1.0D) {
/* 136 */               int i9 = i4 | i6 << 4 | i8 << 8;
/* 137 */               if (!bitSet.get(i9)) {
/*     */ 
/*     */                 
/* 140 */                 bitSet.set(i9);
/*     */                 
/* 142 */                 a1.c(i5, i8, i7);
/* 143 */                 blc blc1 = ☃.a_(a1);
/*     */                 
/* 145 */                 a2.g(a1).c(eq.b);
/* 146 */                 a3.g(a1).c(eq.a);
/* 147 */                 blc blc2 = ☃.a_(a2);
/*     */                 
/* 149 */                 if (blc1.c() == bct.i || blc1.c() == bct.dV) {
/* 150 */                   bool1 = true;
/*     */                 }
/* 152 */                 if (a(blc1, blc2)) {
/*     */ 
/*     */ 
/*     */                   
/* 156 */                   if (i8 - 1 < 10) {
/* 157 */                     ☃.a(a1, d.i(), 2);
/*     */                   } else {
/* 159 */                     ☃.a(a1, b, 2);
/*     */                     
/* 161 */                     if (bool1 && ☃.a_(a3).c() == bct.j) {
/* 162 */                       ☃.a(a3, ☃.d(a1).r().a(), 2);
/*     */                     }
/*     */                   } 
/* 165 */                   bool = true;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 172 */     }  return bool;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */