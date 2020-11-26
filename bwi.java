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
/*     */ public class bwi
/*     */   extends bwe<bsh>
/*     */ {
/*     */   public boolean a(axk ☃, Random random, int i, int j, bsh bsh1) {
/*  20 */     return (random.nextFloat() <= bsh1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, int i, int j, int k, int m, BitSet bitSet, bsh bsh1) {
/*  25 */     int n = (a() * 2 - 1) * 16;
/*  26 */     int i1 = random.nextInt(random.nextInt(random.nextInt(15) + 1) + 1);
/*     */     
/*  28 */     for (int i2 = 0; i2 < i1; i2++) {
/*     */       
/*  30 */       double d1 = (i * 16 + random.nextInt(16));
/*  31 */       double d2 = random.nextInt(random.nextInt(120) + 8);
/*  32 */       double d3 = (j * 16 + random.nextInt(16));
/*     */       
/*  34 */       int i3 = 1;
/*  35 */       if (random.nextInt(4) == 0) {
/*     */         
/*  37 */         double d = 0.5D;
/*  38 */         float f = 1.0F + random.nextFloat() * 6.0F;
/*  39 */         a(☃, random.nextLong(), k, m, d1, d2, d3, f, 0.5D, bitSet);
/*  40 */         i3 += random.nextInt(4);
/*     */       } 
/*     */       
/*  43 */       for (int i4 = 0; i4 < i3; i4++) {
/*     */         
/*  45 */         float f1 = random.nextFloat() * 6.2831855F;
/*  46 */         float f2 = (random.nextFloat() - 0.5F) / 4.0F;
/*  47 */         double d = 1.0D;
/*  48 */         float f3 = random.nextFloat() * 2.0F + random.nextFloat();
/*  49 */         if (random.nextInt(10) == 0) {
/*  50 */           f3 *= random.nextFloat() * random.nextFloat() * 3.0F + 1.0F;
/*     */         }
/*  52 */         int i5 = n - random.nextInt(n / 4);
/*  53 */         int i6 = 0;
/*  54 */         a(☃, random.nextLong(), k, m, d1, d2, d3, f3, f1, f2, 0, i5, 1.0D, bitSet);
/*     */       } 
/*     */     } 
/*     */     
/*  58 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, long l, int i, int j, double d1, double d2, double d3, float f, double d4, BitSet bitSet) {
/*  62 */     double d5 = 1.5D + (xq.a(1.5707964F) * f);
/*  63 */     double d6 = d5 * d4;
/*     */     
/*  65 */     a(☃, l, i, j, d1 + 1.0D, d2, d3, d5, d6, bitSet);
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, long l, int i, int j, double d1, double d2, double d3, float f1, float f2, float f3, int k, int m, double d4, BitSet bitSet) {
/*  69 */     Random random = new Random(l);
/*     */     
/*  71 */     int n = random.nextInt(m / 2) + m / 4;
/*  72 */     boolean bool = (random.nextInt(6) == 0);
/*     */     
/*  74 */     float f4 = 0.0F;
/*  75 */     float f5 = 0.0F;
/*     */     
/*  77 */     for (int i1 = k; i1 < m; i1++) {
/*  78 */       double d5 = 1.5D + (xq.a(3.1415927F * i1 / m) * f1);
/*  79 */       double d6 = d5 * d4;
/*     */       
/*  81 */       float f = xq.b(f3);
/*  82 */       d1 += (xq.b(f2) * f);
/*  83 */       d2 += xq.a(f3);
/*  84 */       d3 += (xq.a(f2) * f);
/*     */       
/*  86 */       f3 *= bool ? 0.92F : 0.7F;
/*  87 */       f3 += f5 * 0.1F;
/*  88 */       f2 += f4 * 0.1F;
/*     */       
/*  90 */       f5 *= 0.9F;
/*  91 */       f4 *= 0.75F;
/*  92 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/*  93 */       f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*     */ 
/*     */       
/*  96 */       if (i1 == n && f1 > 1.0F) {
/*  97 */         a(☃, random.nextLong(), i, j, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 - 1.5707964F, f3 / 3.0F, i1, m, 1.0D, bitSet);
/*  98 */         a(☃, random.nextLong(), i, j, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 + 1.5707964F, f3 / 3.0F, i1, m, 1.0D, bitSet);
/*     */         
/*     */         return;
/*     */       } 
/* 102 */       if (random.nextInt(4) != 0) {
/*     */ 
/*     */ 
/*     */         
/* 106 */         if (!a(i, j, d1, d3, i1, m, f1)) {
/*     */           return;
/*     */         }
/* 109 */         a(☃, l, i, j, d1, d2, d3, d5, d6, bitSet);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, long l, int i, int j, double d1, double d2, double d3, double d4, double d5, BitSet bitSet) {
/* 115 */     double d6 = (i * 16 + 8);
/* 116 */     double d7 = (j * 16 + 8);
/*     */     
/* 118 */     if (d1 < d6 - 16.0D - d4 * 2.0D || d3 < d7 - 16.0D - d4 * 2.0D || d1 > d6 + 16.0D + d4 * 2.0D || d3 > d7 + 16.0D + d4 * 2.0D) {
/* 119 */       return false;
/*     */     }
/*     */     
/* 122 */     int k = Math.max(xq.c(d1 - d4) - i * 16 - 1, 0);
/* 123 */     int m = Math.min(xq.c(d1 + d4) - i * 16 + 1, 16);
/*     */     
/* 125 */     int n = Math.max(xq.c(d2 - d5) - 1, 1);
/* 126 */     int i1 = Math.min(xq.c(d2 + d5) + 1, 248);
/*     */     
/* 128 */     int i2 = Math.max(xq.c(d3 - d4) - j * 16 - 1, 0);
/* 129 */     int i3 = Math.min(xq.c(d3 + d4) - j * 16 + 1, 16);
/*     */     
/* 131 */     if (a(☃, i, j, k, m, n, i1, i2, i3)) {
/* 132 */       return false;
/*     */     }
/*     */     
/* 135 */     boolean bool = false;
/* 136 */     el.a a1 = new el.a();
/* 137 */     el.a a2 = new el.a();
/* 138 */     el.a a3 = new el.a();
/*     */     
/* 140 */     for (int i4 = k; i4 < m; i4++) {
/* 141 */       int i5 = i4 + i * 16;
/* 142 */       double d = (i5 + 0.5D - d1) / d4;
/* 143 */       for (int i6 = i2; i6 < i3; i6++) {
/* 144 */         int i7 = i6 + j * 16;
/* 145 */         double d8 = (i7 + 0.5D - d3) / d4;
/* 146 */         if (d * d + d8 * d8 < 1.0D) {
/*     */ 
/*     */ 
/*     */           
/* 150 */           boolean bool1 = false;
/*     */           
/* 152 */           for (int i8 = i1; i8 > n; i8--) {
/* 153 */             double d9 = (i8 - 0.5D - d2) / d5;
/* 154 */             if (d9 > -0.7D && d * d + d9 * d9 + d8 * d8 < 1.0D)
/*     */             
/*     */             { 
/*     */               
/* 158 */               int i9 = i4 | i6 << 4 | i8 << 8;
/* 159 */               if (!bitSet.get(i9))
/*     */               
/*     */               { 
/* 162 */                 bitSet.set(i9);
/*     */                 
/* 164 */                 a1.c(i5, i8, i7);
/*     */                 
/* 166 */                 blc blc1 = ☃.a_(a1);
/*     */                 
/* 168 */                 blc blc2 = ☃.a_(a2.g(a1).c(eq.b));
/* 169 */                 if (blc1.c() == bct.i || blc1.c() == bct.dV) {
/* 170 */                   bool1 = true;
/*     */                 }
/* 172 */                 if (a(blc1, blc2))
/*     */                 
/*     */                 { 
/*     */                   
/* 176 */                   if (i8 < 11) {
/* 177 */                     ☃.a(a1, d.i(), 2);
/*     */                   } else {
/* 179 */                     ☃.a(a1, b, 2);
/*     */ 
/*     */                     
/* 182 */                     if (bool1) {
/* 183 */                       a3.g(a1).c(eq.a);
/* 184 */                       if (☃.a_(a3).c() == bct.j) {
/* 185 */                         blc blc = ☃.d(a1).r().a();
/* 186 */                         ☃.a(a3, blc, 2);
/*     */                       } 
/*     */                     } 
/*     */                   } 
/* 190 */                   bool = true; }  }  } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 194 */     }  return bool;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */