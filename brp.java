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
/*     */ public class brp
/*     */   extends brr<brz>
/*     */ {
/*     */   public brp(boolean ☃, int i, int j, blc blc1, blc blc2) {
/*  16 */     super(☃, i, j, blc1, blc2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  21 */     int i = a(random);
/*  22 */     if (!a(axz1, el1, i)) {
/*  23 */       return false;
/*     */     }
/*     */     
/*  26 */     d(axz1, el1.b(i), 2);
/*     */     
/*  28 */     int j = el1.p() + i - 2 - random.nextInt(4);
/*     */ 
/*     */     
/*  31 */     while (j > el1.p() + i / 2) {
/*  32 */       float f = random.nextFloat() * 6.2831855F;
/*  33 */       int m = el1.o() + (int)(0.5F + xq.b(f) * 4.0F);
/*  34 */       int n = el1.q() + (int)(0.5F + xq.a(f) * 4.0F);
/*     */       int i1;
/*  36 */       for (i1 = 0; i1 < 5; i1++) {
/*  37 */         m = el1.o() + (int)(1.5F + xq.b(f) * i1);
/*  38 */         n = el1.q() + (int)(1.5F + xq.a(f) * i1);
/*  39 */         a(☃, axz1, new el(m, j - 3 + i1 / 2, n), this.b);
/*     */       } 
/*  41 */       i1 = 1 + random.nextInt(2);
/*  42 */       int i2 = j;
/*  43 */       for (int i3 = i2 - i1; i3 <= i2; i3++) {
/*  44 */         int i4 = i3 - i2;
/*  45 */         c(axz1, new el(m, i3, n), 1 - i4);
/*     */       } 
/*     */       
/*  48 */       j -= 2 + random.nextInt(4);
/*     */     } 
/*     */     
/*  51 */     for (int k = 0; k < i; k++) {
/*  52 */       el el2 = el1.b(k);
/*  53 */       if (a(axz1.a_(el2).c())) {
/*  54 */         a(☃, axz1, el2, this.b);
/*  55 */         if (k > 0) {
/*  56 */           a(axz1, random, el2.e(), biq.c);
/*  57 */           a(axz1, random, el2.c(), biq.o);
/*     */         } 
/*     */       } 
/*     */       
/*  61 */       if (k < i - 1) {
/*  62 */         el el3 = el2.f();
/*  63 */         if (a(axz1.a_(el3).c())) {
/*  64 */           a(☃, axz1, el3, this.b);
/*  65 */           if (k > 0) {
/*  66 */             a(axz1, random, el3.f(), biq.p);
/*  67 */             a(axz1, random, el3.c(), biq.o);
/*     */           } 
/*     */         } 
/*     */         
/*  71 */         el el4 = el2.d().f();
/*  72 */         if (a(axz1.a_(el4).c())) {
/*  73 */           a(☃, axz1, el4, this.b);
/*  74 */           if (k > 0) {
/*  75 */             a(axz1, random, el4.f(), biq.p);
/*  76 */             a(axz1, random, el4.d(), biq.b);
/*     */           } 
/*     */         } 
/*     */         
/*  80 */         el el5 = el2.d();
/*  81 */         if (a(axz1.a_(el5).c())) {
/*  82 */           a(☃, axz1, el5, this.b);
/*  83 */           if (k > 0) {
/*  84 */             a(axz1, random, el5.e(), biq.c);
/*  85 */             a(axz1, random, el5.d(), biq.b);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     return true;
/*     */   }
/*     */   
/*     */   private void a(axz ☃, Random random, el el1, bmb bmb1) {
/*  95 */     if (random.nextInt(3) > 0 && ☃.c(el1)) {
/*  96 */       a(☃, el1, bct.dM.p().a(bmb1, Boolean.valueOf(true)));
/*     */     }
/*     */   }
/*     */   
/*     */   private void d(axz ☃, el el1, int i) {
/* 101 */     int j = 2;
/* 102 */     for (int k = -2; k <= 0; k++)
/* 103 */       b(☃, el1.b(k), i + 1 - k); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\brp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */