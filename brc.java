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
/*     */ public class brc
/*     */   extends bqo<brz>
/*     */ {
/*     */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/*  20 */     while (☃.c(el1) && el1.p() > 2) {
/*  21 */       el1 = el1.b();
/*     */     }
/*     */     
/*  24 */     if (☃.a_(el1).c() != bct.cS) {
/*  25 */       return false;
/*     */     }
/*  27 */     el1 = el1.b(random.nextInt(4));
/*     */     
/*  29 */     int i = random.nextInt(4) + 7;
/*  30 */     int j = i / 4 + random.nextInt(2);
/*     */     
/*  32 */     if (j > 1 && random.nextInt(60) == 0) {
/*  33 */       el1 = el1.b(10 + random.nextInt(30));
/*     */     }
/*     */     int k;
/*  36 */     for (k = 0; k < i; k++) {
/*  37 */       float f = (1.0F - k / i) * j;
/*  38 */       int n = xq.f(f);
/*     */       
/*  40 */       for (int i1 = -n; i1 <= n; i1++) {
/*  41 */         float f1 = xq.a(i1) - 0.25F;
/*  42 */         for (int i2 = -n; i2 <= n; i2++) {
/*  43 */           float f2 = xq.a(i2) - 0.25F;
/*  44 */           if ((i1 == 0 && i2 == 0) || f1 * f1 + f2 * f2 <= f * f)
/*     */           {
/*     */             
/*  47 */             if ((i1 != -n && i1 != n && i2 != -n && i2 != n) || 
/*  48 */               random.nextFloat() <= 0.75F) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  53 */               blc blc = ☃.a_(el1.a(i1, k, i2));
/*  54 */               bcs bcs = blc.c();
/*     */               
/*  56 */               if (blc.f() || bcs.d(bcs) || bcs == bct.cS || bcs == bct.cR) {
/*  57 */                 a(☃, el1.a(i1, k, i2), bct.gp.p());
/*     */               }
/*     */               
/*  60 */               if (k != 0 && n > 1) {
/*  61 */                 blc = ☃.a_(el1.a(i1, -k, i2));
/*  62 */                 bcs = blc.c();
/*     */                 
/*  64 */                 if (blc.f() || bcs.d(bcs) || bcs == bct.cS || bcs == bct.cR)
/*  65 */                   a(☃, el1.a(i1, -k, i2), bct.gp.p()); 
/*     */               } 
/*     */             }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  71 */     k = j - 1;
/*  72 */     if (k < 0) {
/*  73 */       k = 0;
/*  74 */     } else if (k > 1) {
/*  75 */       k = 1;
/*     */     } 
/*  77 */     for (int m = -k; m <= k; m++) {
/*  78 */       for (int n = -k; n <= k; n++) {
/*  79 */         el el2 = el1.a(m, -1, n);
/*  80 */         int i1 = 50;
/*  81 */         if (Math.abs(m) == 1 && Math.abs(n) == 1) {
/*  82 */           i1 = random.nextInt(5);
/*     */         }
/*  84 */         while (el2.p() > 50) {
/*  85 */           blc blc = ☃.a_(el2);
/*  86 */           bcs bcs = blc.c();
/*     */           
/*  88 */           if (blc.f() || bcs.d(bcs) || bcs == bct.cS || bcs == bct.cR || bcs == bct.gp) {
/*  89 */             a(☃, el2, bct.gp.p());
/*     */ 
/*     */ 
/*     */             
/*  93 */             el2 = el2.b();
/*  94 */             i1--;
/*  95 */             if (i1 <= 0) {
/*  96 */               el2 = el2.c(random.nextInt(5) + 1);
/*  97 */               i1 = random.nextInt(5);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 103 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\brc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */