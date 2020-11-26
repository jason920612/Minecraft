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
/*     */ 
/*     */ public class btn
/*     */   extends bpa<brz>
/*     */ {
/*  18 */   private static final blc a = bct.J.p();
/*  19 */   private static final blc b = bct.ah.p();
/*     */   
/*     */   public btn() {
/*  22 */     super(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  27 */     int i = random.nextInt(4) + 5;
/*  28 */     while (axz1.b(el1.b()).a(ww.a)) {
/*  29 */       el1 = el1.b();
/*     */     }
/*     */     
/*  32 */     boolean bool = true;
/*  33 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/*  34 */       return false;
/*     */     }
/*     */     
/*  37 */     for (int j = el1.p(); j <= el1.p() + 1 + i; j++) {
/*  38 */       int m = 1;
/*  39 */       if (j == el1.p()) {
/*  40 */         m = 0;
/*     */       }
/*  42 */       if (j >= el1.p() + 1 + i - 2) {
/*  43 */         m = 3;
/*     */       }
/*  45 */       el.a a = new el.a();
/*  46 */       for (int n = el1.o() - m; n <= el1.o() + m && bool; n++) {
/*  47 */         for (int i1 = el1.q() - m; i1 <= el1.q() + m && bool; i1++) {
/*  48 */           if (j >= 0 && j < 256) {
/*  49 */             blc blc1 = axz1.a_(a.c(n, j, i1));
/*  50 */             bcs bcs1 = blc1.c();
/*  51 */             if (!blc1.f() && !blc1.a(wv.A)) {
/*  52 */               if (bcs1 == bct.A) {
/*  53 */                 if (j > el1.p()) {
/*  54 */                   bool = false;
/*     */                 }
/*     */               } else {
/*  57 */                 bool = false;
/*     */               } 
/*     */             }
/*     */           } else {
/*  61 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     if (!bool) {
/*  68 */       return false;
/*     */     }
/*     */     
/*  71 */     bcs bcs = axz1.a_(el1.b()).c();
/*  72 */     if ((bcs != bct.i && !bcs.d(bcs)) || el1.p() >= 256 - i - 1) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     a(axz1, el1.b());
/*     */     int k;
/*  78 */     for (k = el1.p() - 3 + i; k <= el1.p() + i; k++) {
/*  79 */       int m = k - el1.p() + i;
/*  80 */       int n = 2 - m / 2;
/*  81 */       for (int i1 = el1.o() - n; i1 <= el1.o() + n; i1++) {
/*  82 */         int i2 = i1 - el1.o();
/*  83 */         for (int i3 = el1.q() - n; i3 <= el1.q() + n; i3++) {
/*  84 */           int i4 = i3 - el1.q();
/*  85 */           if (Math.abs(i2) != n || Math.abs(i4) != n || (random.nextInt(2) != 0 && m != 0)) {
/*     */ 
/*     */             
/*  88 */             el el2 = new el(i1, k, i3);
/*  89 */             if (!axz1.a_(el2).f(axz1, el2)) {
/*  90 */               a(axz1, el2, b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  96 */     for (k = 0; k < i; k++) {
/*  97 */       blc blc1 = axz1.a_(el1.b(k));
/*  98 */       bcs bcs1 = blc1.c();
/*  99 */       if (blc1.f() || blc1.a(wv.A) || bcs1 == bct.A) {
/* 100 */         a(☃, axz1, el1.b(k), a);
/*     */       }
/*     */     } 
/*     */     
/* 104 */     for (k = el1.p() - 3 + i; k <= el1.p() + i; k++) {
/* 105 */       int m = k - el1.p() + i;
/* 106 */       int n = 2 - m / 2;
/* 107 */       el.a a = new el.a();
/* 108 */       for (int i1 = el1.o() - n; i1 <= el1.o() + n; i1++) {
/* 109 */         for (int i2 = el1.q() - n; i2 <= el1.q() + n; i2++) {
/* 110 */           a.c(i1, k, i2);
/*     */           
/* 112 */           if (axz1.a_(a).a(wv.A)) {
/* 113 */             el el2 = a.e();
/* 114 */             el el3 = a.f();
/* 115 */             el el4 = a.c();
/* 116 */             el el5 = a.d();
/*     */             
/* 118 */             if (random.nextInt(4) == 0 && axz1.a_(el2).f()) {
/* 119 */               a(axz1, el2, biq.c);
/*     */             }
/* 121 */             if (random.nextInt(4) == 0 && axz1.a_(el3).f()) {
/* 122 */               a(axz1, el3, biq.p);
/*     */             }
/* 124 */             if (random.nextInt(4) == 0 && axz1.a_(el4).f()) {
/* 125 */               a(axz1, el4, biq.o);
/*     */             }
/* 127 */             if (random.nextInt(4) == 0 && axz1.a_(el5).f()) {
/* 128 */               a(axz1, el5, biq.b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 134 */     return true;
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1, bmb bmb1) {
/* 138 */     blc blc1 = bct.dM.p().a(bmb1, Boolean.valueOf(true));
/* 139 */     a(☃, el1, blc1);
/* 140 */     int i = 4;
/*     */     
/* 142 */     el1 = el1.b();
/* 143 */     while (☃.a_(el1).f() && i > 0) {
/* 144 */       a(☃, el1, blc1);
/* 145 */       el1 = el1.b();
/* 146 */       i--;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */