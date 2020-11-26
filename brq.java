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
/*     */ public class brq
/*     */   extends brr<brz>
/*     */ {
/*  15 */   private static final blc aH = bct.K.p();
/*  16 */   private static final blc aI = bct.ai.p();
/*  17 */   private static final blc aJ = bct.l.p();
/*     */   
/*     */   private final boolean aK;
/*     */   
/*     */   public brq(boolean ☃, boolean bool1) {
/*  22 */     super(☃, 13, 15, aH, aI);
/*  23 */     this.aK = bool1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  28 */     int i = a(random);
/*  29 */     if (!a(axz1, el1, i)) {
/*  30 */       return false;
/*     */     }
/*     */     
/*  33 */     a(axz1, el1.o(), el1.q(), el1.p() + i, 0, random);
/*     */     
/*  35 */     for (int j = 0; j < i; j++) {
/*  36 */       blc blc1 = axz1.a_(el1.b(j));
/*  37 */       if (blc1.f() || blc1.a(wv.A)) {
/*  38 */         a(☃, axz1, el1.b(j), this.b);
/*     */       }
/*  40 */       if (j < i - 1) {
/*  41 */         blc1 = axz1.a_(el1.a(1, j, 0));
/*  42 */         if (blc1.f() || blc1.a(wv.A)) {
/*  43 */           a(☃, axz1, el1.a(1, j, 0), this.b);
/*     */         }
/*  45 */         blc1 = axz1.a_(el1.a(1, j, 1));
/*  46 */         if (blc1.f() || blc1.a(wv.A)) {
/*  47 */           a(☃, axz1, el1.a(1, j, 1), this.b);
/*     */         }
/*  49 */         blc1 = axz1.a_(el1.a(0, j, 1));
/*  50 */         if (blc1.f() || blc1.a(wv.A)) {
/*  51 */           a(☃, axz1, el1.a(0, j, 1), this.b);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  56 */     a(axz1, random, el1);
/*  57 */     return true;
/*     */   }
/*     */   
/*     */   private void a(axz ☃, int i, int j, int k, int m, Random random) {
/*  61 */     int n = random.nextInt(5) + (this.aK ? this.a : 3);
/*     */     
/*  63 */     int i1 = 0;
/*  64 */     for (int i2 = k - n; i2 <= k; i2++) {
/*  65 */       int i3 = k - i2;
/*  66 */       int i4 = m + xq.d(i3 / n * 3.5F);
/*  67 */       b(☃, new el(i, i2, j), i4 + ((i3 > 0 && i4 == i1 && (i2 & 0x1) == 0) ? 1 : 0));
/*  68 */       i1 = i4;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(axz ☃, Random random, el el1) {
/*  73 */     b(☃, el1.e().c());
/*  74 */     b(☃, el1.g(2).c());
/*  75 */     b(☃, el1.e().e(2));
/*  76 */     b(☃, el1.g(2).e(2));
/*     */     
/*  78 */     for (int i = 0; i < 5; i++) {
/*  79 */       int j = random.nextInt(64);
/*  80 */       int k = j % 8;
/*  81 */       int m = j / 8;
/*  82 */       if (k == 0 || k == 7 || m == 0 || m == 7) {
/*  83 */         b(☃, el1.a(-3 + k, 0, -3 + m));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(axz ☃, el el1) {
/*  89 */     for (int i = -2; i <= 2; i++) {
/*  90 */       for (int j = -2; j <= 2; j++) {
/*  91 */         if (Math.abs(i) != 2 || Math.abs(j) != 2) {
/*  92 */           c(☃, el1.a(i, 0, j));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(axz ☃, el el1) {
/*  99 */     for (int i = 2; i >= -3; i--) {
/* 100 */       el el2 = el1.b(i);
/* 101 */       blc blc1 = ☃.a_(el2);
/* 102 */       bcs bcs = blc1.c();
/* 103 */       if (bcs == bct.i || bcs.d(bcs)) {
/* 104 */         a(☃, el2, aJ); break;
/*     */       } 
/* 106 */       if (!blc1.f() && i < 0)
/*     */         break; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\brq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */