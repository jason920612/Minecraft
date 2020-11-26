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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bxg
/*     */   extends bwi
/*     */ {
/*     */   public boolean a(axk ☃, Random random, int i, int j, bsh bsh1) {
/*  63 */     return (random.nextFloat() <= bsh1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃, long l, int i, int j, double d1, double d2, double d3, double d4, double d5, BitSet bitSet) {
/*  68 */     Random random = new Random(l + i + j);
/*     */     
/*  70 */     double d6 = (i * 16 + 8);
/*  71 */     double d7 = (j * 16 + 8);
/*     */     
/*  73 */     if (d1 < d6 - 16.0D - d4 * 2.0D || d3 < d7 - 16.0D - d4 * 2.0D || d1 > d6 + 16.0D + d4 * 2.0D || d3 > d7 + 16.0D + d4 * 2.0D) {
/*  74 */       return false;
/*     */     }
/*     */     
/*  77 */     int k = Math.max(xq.c(d1 - d4) - i * 16 - 1, 0);
/*  78 */     int m = Math.min(xq.c(d1 + d4) - i * 16 + 1, 16);
/*     */     
/*  80 */     int n = Math.max(xq.c(d2 - d5) - 1, 1);
/*  81 */     int i1 = Math.min(xq.c(d2 + d5) + 1, 248);
/*     */     
/*  83 */     int i2 = Math.max(xq.c(d3 - d4) - j * 16 - 1, 0);
/*  84 */     int i3 = Math.min(xq.c(d3 + d4) - j * 16 + 1, 16);
/*     */     
/*  86 */     boolean bool = false;
/*  87 */     el.a a = new el.a();
/*     */     
/*  89 */     for (int i4 = k; i4 < m; i4++) {
/*  90 */       int i5 = i4 + i * 16;
/*  91 */       double d = (i5 + 0.5D - d1) / d4;
/*  92 */       for (int i6 = i2; i6 < i3; i6++) {
/*  93 */         int i7 = i6 + j * 16;
/*  94 */         double d8 = (i7 + 0.5D - d3) / d4;
/*  95 */         if (d * d + d8 * d8 < 1.0D)
/*     */         {
/*     */ 
/*     */           
/*  99 */           for (int i8 = i1; i8 > n; i8--) {
/* 100 */             double d9 = (i8 - 0.5D - d2) / d5;
/* 101 */             if (d9 > -0.7D && d * d + d9 * d9 + d8 * d8 < 1.0D)
/*     */             {
/*     */ 
/*     */               
/* 105 */               if (i8 < ☃.k()) {
/*     */ 
/*     */ 
/*     */                 
/* 109 */                 int i9 = i4 | i6 << 4 | i8 << 8;
/* 110 */                 if (!bitSet.get(i9)) {
/*     */ 
/*     */                   
/* 113 */                   bitSet.set(i9);
/*     */                   
/* 115 */                   a.c(i5, i8, i7);
/*     */                   
/* 117 */                   blc blc = ☃.a_(a);
/* 118 */                   if (a(blc))
/*     */                   {
/*     */ 
/*     */                     
/* 122 */                     if (i8 == 10)
/* 123 */                     { float f = random.nextFloat();
/* 124 */                       if (f < 0.25D) {
/* 125 */                         ☃.a(a, bct.ik.p(), 2);
/* 126 */                         ☃.J().a(a, bct.ik, 0);
/* 127 */                         bool = true;
/*     */                       } else {
/* 129 */                         ☃.a(a, bct.ce.p(), 2);
/* 130 */                         bool = true;
/*     */                       
/*     */                       }
/*     */                        }
/*     */                     
/* 135 */                     else if (i8 < 10)
/* 136 */                     { ☃.a(a, bct.C.p(), 2); }
/*     */                     
/*     */                     else
/*     */                     
/* 140 */                     { boolean bool1 = false;
/* 141 */                       for (eq eq : eq.c.a) {
/* 142 */                         blc blc1 = ☃.a_(a.c(i5 + eq.g(), i8, i7 + eq.i()));
/* 143 */                         if (blc1.f()) {
/* 144 */                           ☃.a(a, c.i(), 2);
/* 145 */                           ☃.I().a(a, c.c(), 0);
/* 146 */                           bool = true;
/* 147 */                           bool1 = true;
/*     */                           
/*     */                           break;
/*     */                         } 
/*     */                       } 
/* 152 */                       a.c(i5, i8, i7);
/* 153 */                       if (!bool1)
/* 154 */                       { ☃.a(a, c.i(), 2);
/* 155 */                         bool = true; }  }  } 
/*     */                 } 
/*     */               }  } 
/*     */           }  } 
/*     */       } 
/* 160 */     }  return bool;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */