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
/*     */ public class bse
/*     */   extends bqo<bsd>
/*     */ {
/*     */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bsd bsd1) {
/*  19 */     float f1 = random.nextFloat() * 3.1415927F;
/*     */     
/*  21 */     float f2 = bsd1.c / 8.0F;
/*  22 */     int i = xq.f((bsd1.c / 16.0F * 2.0F + 1.0F) / 2.0F);
/*  23 */     double d1 = (el1.o() + xq.a(f1) * f2);
/*  24 */     double d2 = (el1.o() - xq.a(f1) * f2);
/*  25 */     double d3 = (el1.q() + xq.b(f1) * f2);
/*  26 */     double d4 = (el1.q() - xq.b(f1) * f2);
/*     */     
/*  28 */     int j = 2;
/*  29 */     double d5 = (el1.p() + random.nextInt(3) - 2);
/*  30 */     double d6 = (el1.p() + random.nextInt(3) - 2);
/*     */     
/*  32 */     int k = el1.o() - xq.f(f2) - i;
/*  33 */     int m = el1.p() - 2 - i;
/*  34 */     int n = el1.q() - xq.f(f2) - i;
/*  35 */     int i1 = 2 * (xq.f(f2) + i);
/*  36 */     int i2 = 2 * (2 + i);
/*     */ 
/*     */     
/*  39 */     for (int i3 = k; i3 <= k + i1; i3++) {
/*  40 */       for (int i4 = n; i4 <= n + i1; i4++) {
/*  41 */         if (m <= ☃.a(bor.a.b, i3, i4)) {
/*  42 */           return a(☃, random, bsd1, d1, d2, d3, d4, d5, d6, k, m, n, i1, i2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  47 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, Random random, bsd bsd1, double d1, double d2, double d3, double d4, double d5, double d6, int i, int j, int k, int m, int n) {
/*  51 */     int i1 = 0;
/*     */     
/*  53 */     BitSet bitSet = new BitSet(m * n * m);
/*  54 */     el.a a = new el.a();
/*  55 */     double[] arrayOfDouble = new double[bsd1.c * 4];
/*     */     int i2;
/*  57 */     for (i2 = 0; i2 < bsd1.c; i2++) {
/*  58 */       float f = i2 / bsd1.c;
/*  59 */       double d7 = d1 + (d2 - d1) * f;
/*  60 */       double d8 = d5 + (d6 - d5) * f;
/*  61 */       double d9 = d3 + (d4 - d3) * f;
/*     */       
/*  63 */       double d10 = random.nextDouble() * bsd1.c / 16.0D;
/*  64 */       double d11 = ((xq.a(3.1415927F * f) + 1.0F) * d10 + 1.0D) / 2.0D;
/*     */       
/*  66 */       arrayOfDouble[i2 * 4 + 0] = d7;
/*  67 */       arrayOfDouble[i2 * 4 + 1] = d8;
/*  68 */       arrayOfDouble[i2 * 4 + 2] = d9;
/*  69 */       arrayOfDouble[i2 * 4 + 3] = d11;
/*     */     } 
/*     */     
/*  72 */     for (i2 = 0; i2 < bsd1.c - 1; i2++) {
/*  73 */       if (arrayOfDouble[i2 * 4 + 3] > 0.0D)
/*     */       {
/*     */ 
/*     */         
/*  77 */         for (int i3 = i2 + 1; i3 < bsd1.c; i3++) {
/*  78 */           if (arrayOfDouble[i3 * 4 + 3] > 0.0D) {
/*     */ 
/*     */ 
/*     */             
/*  82 */             double d7 = arrayOfDouble[i2 * 4 + 0] - arrayOfDouble[i3 * 4 + 0];
/*  83 */             double d8 = arrayOfDouble[i2 * 4 + 1] - arrayOfDouble[i3 * 4 + 1];
/*  84 */             double d9 = arrayOfDouble[i2 * 4 + 2] - arrayOfDouble[i3 * 4 + 2];
/*  85 */             double d10 = arrayOfDouble[i2 * 4 + 3] - arrayOfDouble[i3 * 4 + 3];
/*     */             
/*  87 */             if (d10 * d10 > d7 * d7 + d8 * d8 + d9 * d9)
/*  88 */               if (d10 > 0.0D) {
/*  89 */                 arrayOfDouble[i3 * 4 + 3] = -1.0D;
/*     */               } else {
/*  91 */                 arrayOfDouble[i2 * 4 + 3] = -1.0D;
/*     */               }  
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*  97 */     for (i2 = 0; i2 < bsd1.c; i2++) {
/*  98 */       double d = arrayOfDouble[i2 * 4 + 3];
/*  99 */       if (d >= 0.0D) {
/*     */ 
/*     */ 
/*     */         
/* 103 */         double d7 = arrayOfDouble[i2 * 4 + 0];
/* 104 */         double d8 = arrayOfDouble[i2 * 4 + 1];
/* 105 */         double d9 = arrayOfDouble[i2 * 4 + 2];
/*     */ 
/*     */         
/* 108 */         int i3 = Math.max(xq.c(d7 - d), i);
/* 109 */         int i4 = Math.max(xq.c(d8 - d), j);
/* 110 */         int i5 = Math.max(xq.c(d9 - d), k);
/*     */         
/* 112 */         int i6 = Math.max(xq.c(d7 + d), i3);
/* 113 */         int i7 = Math.max(xq.c(d8 + d), i4);
/* 114 */         int i8 = Math.max(xq.c(d9 + d), i5);
/*     */         
/* 116 */         for (int i9 = i3; i9 <= i6; i9++) {
/* 117 */           double d10 = (i9 + 0.5D - d7) / d;
/* 118 */           if (d10 * d10 < 1.0D)
/* 119 */             for (int i10 = i4; i10 <= i7; i10++) {
/* 120 */               double d11 = (i10 + 0.5D - d8) / d;
/* 121 */               if (d10 * d10 + d11 * d11 < 1.0D) {
/* 122 */                 for (int i11 = i5; i11 <= i8; i11++) {
/* 123 */                   double d12 = (i11 + 0.5D - d9) / d;
/* 124 */                   if (d10 * d10 + d11 * d11 + d12 * d12 < 1.0D) {
/* 125 */                     int i12 = i9 - i + (i10 - j) * m + (i11 - k) * m * n;
/* 126 */                     if (!bitSet.get(i12)) {
/*     */ 
/*     */                       
/* 129 */                       bitSet.set(i12);
/*     */                       
/* 131 */                       a.c(i9, i10, i11);
/* 132 */                       if (bsd1.b.test(☃.a_(a))) {
/* 133 */                         ☃.a(a, bsd1.d, 2);
/* 134 */                         i1++;
/*     */                       } 
/*     */                     } 
/*     */                   } 
/*     */                 } 
/*     */               }
/*     */             }  
/*     */         } 
/*     */       } 
/*     */     } 
/* 144 */     return (i1 > 0);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */