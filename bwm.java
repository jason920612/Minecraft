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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwm
/*     */   extends bwi
/*     */ {
/*     */   public boolean a(axk ☃, Random random, int i, int j, bsh bsh1) {
/*  39 */     return (random.nextFloat() <= bsh1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, int i, int j, int k, int m, BitSet bitSet, bsh bsh1) {
/*  44 */     int n = (a() * 2 - 1) * 16;
/*     */     
/*  46 */     int i1 = random.nextInt(random.nextInt(random.nextInt(10) + 1) + 1);
/*  47 */     for (int i2 = 0; i2 < i1; i2++) {
/*  48 */       double d1 = (i * 16 + random.nextInt(16));
/*  49 */       double d2 = random.nextInt(128);
/*  50 */       double d3 = (j * 16 + random.nextInt(16));
/*     */       
/*  52 */       int i3 = 1;
/*  53 */       if (random.nextInt(4) == 0) {
/*  54 */         double d = 0.5D;
/*  55 */         float f = 1.0F + random.nextFloat() * 6.0F;
/*  56 */         a(☃, random.nextLong(), k, m, d1, d2, d3, f, 0.5D, bitSet);
/*  57 */         i3 += random.nextInt(4);
/*     */       } 
/*     */       
/*  60 */       for (int i4 = 0; i4 < i3; i4++) {
/*  61 */         float f1 = random.nextFloat() * 6.2831855F;
/*  62 */         float f2 = (random.nextFloat() - 0.5F) * 2.0F / 8.0F;
/*  63 */         double d = 5.0D;
/*  64 */         float f3 = (random.nextFloat() * 2.0F + random.nextFloat()) * 2.0F;
/*  65 */         int i5 = n - random.nextInt(n / 4);
/*  66 */         int i6 = 0;
/*  67 */         a(☃, random.nextLong(), k, m, d1, d2, d3, f3, f1, f2, 0, i5, 5.0D, bitSet);
/*     */       } 
/*     */     } 
/*     */     
/*  71 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃, long l, int i, int j, double d1, double d2, double d3, double d4, double d5, BitSet bitSet) {
/*  76 */     double d6 = (i * 16 + 8);
/*  77 */     double d7 = (j * 16 + 8);
/*     */     
/*  79 */     if (d1 < d6 - 16.0D - d4 * 2.0D || d3 < d7 - 16.0D - d4 * 2.0D || d1 > d6 + 16.0D + d4 * 2.0D || d3 > d7 + 16.0D + d4 * 2.0D) {
/*  80 */       return false;
/*     */     }
/*     */     
/*  83 */     int k = Math.max(xq.c(d1 - d4) - i * 16 - 1, 0);
/*  84 */     int m = Math.min(xq.c(d1 + d4) - i * 16 + 1, 16);
/*     */     
/*  86 */     int n = Math.max(xq.c(d2 - d5) - 1, 1);
/*  87 */     int i1 = Math.min(xq.c(d2 + d5) + 1, 120);
/*     */     
/*  89 */     int i2 = Math.max(xq.c(d3 - d4) - j * 16 - 1, 0);
/*  90 */     int i3 = Math.min(xq.c(d3 + d4) - j * 16 + 1, 16);
/*     */     
/*  92 */     if (a(☃, i, j, k, m, n, i1, i2, i3)) {
/*  93 */       return false;
/*     */     }
/*     */     
/*  96 */     if (k > m || n > i1 || i2 > i3) {
/*  97 */       return false;
/*     */     }
/*     */     
/* 100 */     boolean bool = false;
/* 101 */     for (int i4 = k; i4 < m; i4++) {
/* 102 */       int i5 = i4 + i * 16;
/* 103 */       double d = (i5 + 0.5D - d1) / d4;
/* 104 */       for (int i6 = i2; i6 < i3; i6++) {
/* 105 */         int i7 = i6 + j * 16;
/* 106 */         double d8 = (i7 + 0.5D - d3) / d4;
/* 107 */         for (int i8 = i1; i8 > n; i8--) {
/* 108 */           double d9 = ((i8 - 1) + 0.5D - d2) / d5;
/* 109 */           if (d9 > -0.7D && d * d + d9 * d9 + d8 * d8 < 1.0D) {
/* 110 */             int i9 = i4 | i6 << 4 | i8 << 8;
/* 111 */             if (!bitSet.get(i9)) {
/*     */ 
/*     */               
/* 114 */               bitSet.set(i9);
/*     */               
/* 116 */               if (a(☃.a_(new el(i5, i8, i7)))) {
/* 117 */                 if (i8 <= 31) {
/* 118 */                   ☃.a(new el(i5, i8, i7), d.i(), 2);
/*     */                 } else {
/* 120 */                   ☃.a(new el(i5, i8, i7), b, 2);
/*     */                 } 
/* 122 */                 bool = true;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 129 */     return bool;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */