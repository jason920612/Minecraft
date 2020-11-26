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
/*     */ public class bti
/*     */   extends bpa<brz>
/*     */ {
/*  15 */   private static final blc a = bct.K.p();
/*  16 */   private static final blc b = bct.ai.p();
/*     */   
/*     */   public bti(boolean ☃) {
/*  19 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  25 */     int i = random.nextInt(4) + 6;
/*  26 */     int j = 1 + random.nextInt(2);
/*  27 */     int k = i - j;
/*  28 */     int m = 2 + random.nextInt(2);
/*     */     
/*  30 */     boolean bool = true;
/*     */     
/*  32 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/*  33 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  37 */     for (int n = el1.p(); n <= el1.p() + 1 + i && bool; n++) {
/*     */       int i6;
/*  39 */       if (n - el1.p() < j) {
/*  40 */         i6 = 0;
/*     */       } else {
/*  42 */         i6 = m;
/*     */       } 
/*  44 */       el.a a = new el.a();
/*  45 */       for (int i7 = el1.o() - i6; i7 <= el1.o() + i6 && bool; i7++) {
/*  46 */         for (int i8 = el1.q() - i6; i8 <= el1.q() + i6 && bool; i8++) {
/*  47 */           if (n >= 0 && n < 256) {
/*  48 */             blc blc1 = axz1.a_(a.c(i7, n, i8));
/*  49 */             if (!blc1.f() && !blc1.a(wv.A)) {
/*  50 */               bool = false;
/*     */             }
/*     */           } else {
/*  53 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  59 */     if (!bool) {
/*  60 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  64 */     bcs bcs = axz1.a_(el1.b()).c();
/*  65 */     if ((bcs != bct.i && !bcs.d(bcs) && bcs != bct.cq) || el1.p() >= 256 - i - 1) {
/*  66 */       return false;
/*     */     }
/*     */     
/*  69 */     a(axz1, el1.b());
/*     */ 
/*     */     
/*  72 */     int i1 = random.nextInt(2);
/*  73 */     int i2 = 1;
/*  74 */     int i3 = 0; int i4;
/*  75 */     for (i4 = 0; i4 <= k; i4++) {
/*  76 */       int i6 = el1.p() + i - i4;
/*     */       
/*  78 */       for (int i7 = el1.o() - i1; i7 <= el1.o() + i1; i7++) {
/*  79 */         int i8 = i7 - el1.o();
/*  80 */         for (int i9 = el1.q() - i1; i9 <= el1.q() + i1; i9++) {
/*  81 */           int i10 = i9 - el1.q();
/*  82 */           if (Math.abs(i8) != i1 || Math.abs(i10) != i1 || i1 <= 0) {
/*     */ 
/*     */             
/*  85 */             el el2 = new el(i7, i6, i9);
/*  86 */             if (!axz1.a_(el2).f(axz1, el2)) {
/*  87 */               a(axz1, el2, b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*  92 */       if (i1 >= i2) {
/*  93 */         i1 = i3;
/*  94 */         i3 = 1;
/*  95 */         i2++;
/*  96 */         if (i2 > m) {
/*  97 */           i2 = m;
/*     */         }
/*     */       } else {
/* 100 */         i1++;
/*     */       } 
/*     */     } 
/* 103 */     i4 = random.nextInt(3);
/* 104 */     for (int i5 = 0; i5 < i - i4; i5++) {
/* 105 */       blc blc1 = axz1.a_(el1.b(i5));
/* 106 */       if (blc1.f() || blc1.a(wv.A)) {
/* 107 */         a(☃, axz1, el1.b(i5), a);
/*     */       }
/*     */     } 
/* 110 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bti.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */