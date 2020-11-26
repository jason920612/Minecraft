/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.BitSet;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bxf
/*     */   extends bwh
/*     */ {
/*  19 */   private final float[] g = new float[1024];
/*     */   
/*     */   public bxf() {
/*  22 */     this.e = (Set<bcs>)ImmutableSet.of(bct.b, bct.c, bct.e, bct.g, bct.j, bct.k, (Object[])new bcs[] { bct.l, bct.i, bct.gn, bct.fE, bct.fF, bct.fG, bct.fH, bct.fI, bct.fJ, bct.fK, bct.fL, bct.fM, bct.fN, bct.fO, bct.fP, bct.fQ, bct.fR, bct.fS, bct.fT, bct.at, bct.hT, bct.dV, bct.cQ, bct.D, bct.F, bct.A, bct.C, bct.ce, bct.a, bct.jI });
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
/*     */   public boolean a(axk ☃, Random random, int i, int j, bsh bsh1) {
/*  64 */     return (random.nextFloat() <= bsh1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃, long l, int i, int j, double d1, double d2, double d3, double d4, double d5, BitSet bitSet) {
/*  69 */     Random random = new Random(l + i + j);
/*     */     
/*  71 */     double d6 = (i * 16 + 8);
/*  72 */     double d7 = (j * 16 + 8);
/*     */     
/*  74 */     if (d1 < d6 - 16.0D - d4 * 2.0D || d3 < d7 - 16.0D - d4 * 2.0D || d1 > d6 + 16.0D + d4 * 2.0D || d3 > d7 + 16.0D + d4 * 2.0D) {
/*  75 */       return false;
/*     */     }
/*     */     
/*  78 */     int k = Math.max(xq.c(d1 - d4) - i * 16 - 1, 0);
/*  79 */     int m = Math.min(xq.c(d1 + d4) - i * 16 + 1, 16);
/*     */     
/*  81 */     int n = Math.max(xq.c(d2 - d5) - 1, 1);
/*  82 */     int i1 = Math.min(xq.c(d2 + d5) + 1, 248);
/*     */     
/*  84 */     int i2 = Math.max(xq.c(d3 - d4) - j * 16 - 1, 0);
/*  85 */     int i3 = Math.min(xq.c(d3 + d4) - j * 16 + 1, 16);
/*     */     
/*  87 */     if (k > m || n > i1 || i2 > i3) {
/*  88 */       return false;
/*     */     }
/*     */     
/*  91 */     boolean bool = false;
/*  92 */     el.a a = new el.a();
/*     */     
/*  94 */     for (int i4 = k; i4 < m; i4++) {
/*  95 */       int i5 = i4 + i * 16;
/*  96 */       double d = (i5 + 0.5D - d1) / d4;
/*  97 */       for (int i6 = i2; i6 < i3; i6++) {
/*  98 */         int i7 = i6 + j * 16;
/*  99 */         double d8 = (i7 + 0.5D - d3) / d4;
/* 100 */         if (d * d + d8 * d8 < 1.0D)
/* 101 */           for (int i8 = i1; i8 > n; i8--) {
/* 102 */             double d9 = ((i8 - 1) + 0.5D - d2) / d5;
/* 103 */             if ((d * d + d8 * d8) * this.g[i8 - 1] + d9 * d9 / 6.0D < 1.0D && 
/* 104 */               i8 < ☃.k()) {
/*     */ 
/*     */ 
/*     */               
/* 108 */               int i9 = i4 | i6 << 4 | i8 << 8;
/* 109 */               if (!bitSet.get(i9)) {
/*     */ 
/*     */                 
/* 112 */                 bitSet.set(i9);
/*     */                 
/* 114 */                 a.c(i5, i8, i7);
/* 115 */                 blc blc = ☃.a_(a);
/* 116 */                 if (a(blc))
/*     */                 {
/*     */ 
/*     */                   
/* 120 */                   if (i8 == 10) {
/* 121 */                     float f = random.nextFloat();
/* 122 */                     if (f < 0.25D) {
/* 123 */                       ☃.a(a, bct.ik.p(), 2);
/* 124 */                       ☃.J().a(a, bct.ik, 0);
/* 125 */                       bool = true;
/*     */                     } else {
/* 127 */                       ☃.a(a, bct.ce.p(), 2);
/* 128 */                       bool = true;
/*     */                     
/*     */                     }
/*     */                   
/*     */                   }
/* 133 */                   else if (i8 < 10) {
/* 134 */                     ☃.a(a, bct.C.p(), 2);
/*     */                   }
/*     */                   else {
/*     */                     
/* 138 */                     boolean bool1 = false;
/* 139 */                     for (eq eq : eq.c.a) {
/* 140 */                       blc blc1 = ☃.a_(a.c(i5 + eq.g(), i8, i7 + eq.i()));
/* 141 */                       if (blc1.f()) {
/* 142 */                         ☃.a(a, c.i(), 2);
/* 143 */                         ☃.I().a(a, c.c(), 0);
/* 144 */                         bool = true;
/* 145 */                         bool1 = true;
/*     */                         
/*     */                         break;
/*     */                       } 
/*     */                     } 
/* 150 */                     a.c(i5, i8, i7);
/* 151 */                     if (!bool1) {
/* 152 */                       ☃.a(a, c.i(), 2);
/* 153 */                       bool = true;
/*     */                     } 
/*     */                   }  } 
/*     */               } 
/*     */             } 
/*     */           }  
/*     */       } 
/*     */     } 
/* 161 */     return bool;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */