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
/*     */ public class bre
/*     */   extends bqo<brd>
/*     */ {
/*     */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brd brd1) {
/*  19 */     el1 = new el(el1.o(), ☃.k(), el1.q());
/*  20 */     boolean bool1 = (random.nextDouble() > 0.7D);
/*  21 */     blc blc = brd1.a;
/*     */ 
/*     */     
/*  24 */     double d = random.nextDouble() * 2.0D * Math.PI;
/*  25 */     int i = 11 - random.nextInt(5);
/*  26 */     int j = 3 + random.nextInt(3);
/*  27 */     boolean bool2 = (random.nextDouble() > 0.7D);
/*     */     
/*  29 */     int k = 11;
/*  30 */     int m = bool2 ? (random.nextInt(6) + 6) : (random.nextInt(15) + 3);
/*  31 */     if (!bool2 && random.nextDouble() > 0.9D) {
/*  32 */       m += random.nextInt(19) + 7;
/*     */     }
/*     */     
/*  35 */     int n = Math.min(m + random.nextInt(11), 18);
/*  36 */     int i1 = Math.min(m + random.nextInt(7) - random.nextInt(5), 11);
/*  37 */     int i2 = bool2 ? i : 11;
/*     */     
/*     */     int i3;
/*  40 */     for (i3 = -i2; i3 < i2; i3++) {
/*  41 */       for (int i4 = -i2; i4 < i2; i4++) {
/*  42 */         for (int i5 = 0; i5 < m; i5++) {
/*  43 */           int i6 = bool2 ? b(i5, m, i1) : a(random, i5, m, i1);
/*  44 */           if (bool2 || i3 < i6)
/*     */           {
/*     */             
/*  47 */             a(☃, random, el1, m, i3, i5, i4, i6, i2, bool2, j, d, bool1, blc);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  53 */     a(☃, el1, i1, m, bool2, i);
/*     */ 
/*     */     
/*  56 */     for (i3 = -i2; i3 < i2; i3++) {
/*  57 */       for (int i4 = -i2; i4 < i2; i4++) {
/*  58 */         for (int i5 = -1; i5 > -n; i5--) {
/*  59 */           int i6 = bool2 ? xq.f(i2 * (1.0F - (float)Math.pow(i5, 2.0D) / n * 8.0F)) : i2;
/*  60 */           int i7 = b(random, -i5, n, i1);
/*  61 */           if (i3 < i7)
/*     */           {
/*     */             
/*  64 */             a(☃, random, el1, n, i3, i5, i4, i7, i6, bool2, j, d, bool1, blc);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  70 */     boolean bool3 = bool2 ? ((random.nextDouble() > 0.1D)) : ((random.nextDouble() > 0.7D));
/*  71 */     if (bool3) {
/*  72 */       a(random, ☃, i1, m, el1, bool2, i, d, j);
/*     */     }
/*     */     
/*  75 */     return true;
/*     */   }
/*     */   
/*     */   private void a(Random ☃, axz axz1, int i, int j, el el1, boolean bool, int k, double d, int m) {
/*  79 */     int n = ☃.nextBoolean() ? -1 : 1;
/*  80 */     int i1 = ☃.nextBoolean() ? -1 : 1;
/*     */     
/*  82 */     int i2 = ☃.nextInt(Math.max(i / 2 - 2, 1));
/*  83 */     if (☃.nextBoolean()) {
/*  84 */       i2 = i / 2 + 1 - ☃.nextInt(Math.max(i - i / 2 - 1, 1));
/*     */     }
/*  86 */     int i3 = ☃.nextInt(Math.max(i / 2 - 2, 1));
/*  87 */     if (☃.nextBoolean()) {
/*  88 */       i3 = i / 2 + 1 - ☃.nextInt(Math.max(i - i / 2 - 1, 1));
/*     */     }
/*     */     
/*  91 */     if (bool) {
/*  92 */       i2 = i3 = ☃.nextInt(Math.max(k - 5, 1));
/*     */     }
/*     */     
/*  95 */     el el2 = (new el(0, 0, 0)).a(n * i2, 0, i1 * i3);
/*  96 */     double d1 = bool ? (d + 1.5707963267948966D) : (☃.nextDouble() * 2.0D * Math.PI);
/*     */     int i4;
/*  98 */     for (i4 = 0; i4 < j - 3; i4++) {
/*  99 */       int i5 = a(☃, i4, j, i);
/* 100 */       a(i5, i4, el1, axz1, false, d1, el2, k, m);
/*     */     } 
/*     */     
/* 103 */     for (i4 = -1; i4 > -j + ☃.nextInt(5); i4--) {
/* 104 */       int i5 = b(☃, -i4, j, i);
/* 105 */       a(i5, i4, el1, axz1, true, d1, el2, k, m);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, el el1, axz axz1, boolean bool, double d, el el2, int j, int k) {
/* 110 */     int m = ☃ + 1 + j / 3;
/* 111 */     int n = Math.min(☃ - 3, 3) + k / 2 - 1;
/*     */     
/* 113 */     for (int i1 = -m; i1 < m; i1++) {
/* 114 */       for (int i2 = -m; i2 < m; i2++) {
/* 115 */         double d1 = a(i1, i2, el2, m, n, d);
/* 116 */         if (d1 < 0.0D) {
/* 117 */           el el3 = el1.a(i1, i, i2);
/* 118 */           bcs bcs = axz1.a_(el3).c();
/* 119 */           if (a(bcs) || bcs == bct.cS) {
/* 120 */             if (bool) {
/* 121 */               a(axz1, el3, bct.A.p());
/*     */             } else {
/* 123 */               a(axz1, el3, bct.a.p());
/* 124 */               a(axz1, el3);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1) {
/* 133 */     if (☃.a_(el1.a()).c() == bct.cQ) {
/* 134 */       a(☃, el1.a(), bct.a.p());
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(axz ☃, Random random, el el1, int i, int j, int k, int m, int n, int i1, boolean bool1, int i2, double d, boolean bool2, blc blc1) {
/* 139 */     el el2 = new el(0, 0, 0);
/* 140 */     double d1 = bool1 ? a(j, m, el2, i1, a(k, i, i2), d) : a(j, m, el2, n, random);
/* 141 */     if (d1 < 0.0D) {
/* 142 */       el el3 = el1.a(j, k, m);
/* 143 */       double d2 = bool1 ? -0.5D : (-6 - random.nextInt(3));
/* 144 */       if (d1 > d2 && random.nextDouble() > 0.9D) {
/*     */         return;
/*     */       }
/* 147 */       a(el3, ☃, random, i - k, i, bool1, bool2, blc1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(el ☃, axz axz1, Random random, int i, int j, boolean bool1, boolean bool2, blc blc1) {
/* 152 */     blc blc2 = axz1.a_(☃);
/* 153 */     bcs bcs = blc2.c();
/* 154 */     if (blc2.d() == bza.a || bcs == bct.cS || bcs == bct.cR || bcs == bct.A) {
/* 155 */       boolean bool = (!bool1 || random.nextDouble() > 0.05D);
/* 156 */       int k = bool1 ? 3 : 2;
/* 157 */       if (bool2 && bcs != bct.A && i <= random.nextInt(Math.max(1, j / k)) + j * 0.6D && bool) {
/* 158 */         a(axz1, ☃, bct.cS.p());
/*     */       } else {
/* 160 */         a(axz1, ☃, blc1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, int j) {
/* 166 */     int k = j;
/* 167 */     if (☃ > 0 && i - ☃ <= 3) {
/* 168 */       k -= 4 - i - ☃;
/*     */     }
/*     */     
/* 171 */     return k;
/*     */   }
/*     */   
/*     */   private double a(int ☃, int i, el el1, int j, Random random) {
/* 175 */     float f = 10.0F * xq.a(random.nextFloat(), 0.2F, 0.8F) / j;
/* 176 */     return f + Math.pow((☃ - el1.o()), 2.0D) + Math.pow((i - el1.q()), 2.0D) - Math.pow(j, 2.0D);
/*     */   }
/*     */   
/*     */   private double a(int ☃, int i, el el1, int j, int k, double d) {
/* 180 */     return Math.pow(((☃ - el1.o()) * Math.cos(d) - (i - el1.q()) * Math.sin(d)) / j, 2.0D) + Math.pow(((☃ - el1.o()) * Math.sin(d) + (i - el1.q()) * Math.cos(d)) / k, 2.0D) - 1.0D;
/*     */   }
/*     */   
/*     */   private int a(Random ☃, int i, int j, int k) {
/* 184 */     float f1 = 3.5F - ☃.nextFloat();
/* 185 */     float f2 = (1.0F - (float)Math.pow(i, 2.0D) / j * f1) * k;
/*     */     
/* 187 */     if (j > 15 + ☃.nextInt(5)) {
/* 188 */       int m = (i < 3 + ☃.nextInt(6)) ? (i / 2) : i;
/* 189 */       f2 = (1.0F - m / j * f1 * 0.4F) * k;
/*     */     } 
/*     */     
/* 192 */     return xq.f(f2 / 2.0F);
/*     */   }
/*     */   
/*     */   private int b(int ☃, int i, int j) {
/* 196 */     float f1 = 1.0F;
/* 197 */     float f2 = (1.0F - (float)Math.pow(☃, 2.0D) / i * 1.0F) * j;
/* 198 */     return xq.f(f2 / 2.0F);
/*     */   }
/*     */   
/*     */   private int b(Random ☃, int i, int j, int k) {
/* 202 */     float f1 = 1.0F + ☃.nextFloat() / 2.0F;
/* 203 */     float f2 = (1.0F - i / j * f1) * k;
/* 204 */     return xq.f(f2 / 2.0F);
/*     */   }
/*     */   
/*     */   private boolean a(bcs ☃) {
/* 208 */     return (☃ == bct.gp || ☃ == bct.cS || ☃ == bct.gq);
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1) {
/* 212 */     return (☃.a_(el1.b()).d() == bza.a);
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1, int i, int j, boolean bool, int k) {
/* 216 */     int m = bool ? k : (i / 2);
/*     */     
/* 218 */     for (int n = -m; n <= m; n++) {
/* 219 */       for (int i1 = -m; i1 <= m; i1++) {
/* 220 */         for (int i2 = 0; i2 <= j; i2++) {
/* 221 */           el el2 = el1.a(n, i2, i1);
/* 222 */           bcs bcs = ☃.a_(el2).c();
/*     */ 
/*     */           
/* 225 */           if (a(bcs) || bcs == bct.cQ)
/* 226 */             if (a(☃, el2)) {
/* 227 */               a(☃, el2, bct.a.p());
/* 228 */               a(☃, el2.a(), bct.a.p());
/*     */ 
/*     */             
/*     */             }
/* 232 */             else if (a(bcs)) {
/*     */               
/* 234 */               bcs[] arrayOfBcs = { ☃.a_(el2.e()).c(), ☃.a_(el2.f()).c(), ☃.a_(el2.c()).c(), ☃.a_(el2.d()).c() };
/* 235 */               int i3 = 0;
/* 236 */               for (bcs bcs1 : arrayOfBcs) {
/* 237 */                 if (!a(bcs1)) {
/* 238 */                   i3++;
/*     */                 }
/*     */               } 
/* 241 */               if (i3 >= 3)
/* 242 */                 a(☃, el2, bct.a.p()); 
/*     */             }  
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bre.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */