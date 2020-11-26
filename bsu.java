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
/*     */ 
/*     */ public class bsu
/*     */   extends bpa<brz>
/*     */ {
/*  19 */   private static final blc a = bct.N.p();
/*  20 */   private static final blc b = bct.al.p();
/*     */   
/*     */   public bsu(boolean ☃) {
/*  23 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  28 */     int i = random.nextInt(3) + random.nextInt(3) + 5;
/*     */     
/*  30 */     boolean bool = true;
/*  31 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/*  32 */       return false;
/*     */     }
/*     */     
/*  35 */     for (int j = el1.p(); j <= el1.p() + 1 + i; j++) {
/*  36 */       int i5 = 1;
/*  37 */       if (j == el1.p()) {
/*  38 */         i5 = 0;
/*     */       }
/*  40 */       if (j >= el1.p() + 1 + i - 2) {
/*  41 */         i5 = 2;
/*     */       }
/*  43 */       el.a a = new el.a();
/*  44 */       for (int i6 = el1.o() - i5; i6 <= el1.o() + i5 && bool; i6++) {
/*  45 */         for (int i7 = el1.q() - i5; i7 <= el1.q() + i5 && bool; i7++) {
/*  46 */           if (j >= 0 && j < 256) {
/*  47 */             if (!a(axz1.a_(a.c(i6, j, i7)).c())) {
/*  48 */               bool = false;
/*     */             }
/*     */           } else {
/*  51 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  57 */     if (!bool) {
/*  58 */       return false;
/*     */     }
/*     */     
/*  61 */     bcs bcs = axz1.a_(el1.b()).c();
/*  62 */     if ((bcs != bct.i && !bcs.d(bcs)) || el1.p() >= 256 - i - 1) {
/*  63 */       return false;
/*     */     }
/*     */     
/*  66 */     a(axz1, el1.b());
/*     */     
/*  68 */     eq eq1 = eq.c.a.a(random);
/*  69 */     int k = i - random.nextInt(4) - 1;
/*  70 */     int m = 3 - random.nextInt(3);
/*     */     
/*  72 */     int n = el1.o();
/*  73 */     int i1 = el1.q();
/*  74 */     int i2 = 0;
/*  75 */     for (int i3 = 0; i3 < i; i3++) {
/*  76 */       int i5 = el1.p() + i3;
/*  77 */       if (i3 >= k && m > 0) {
/*  78 */         n += eq1.g();
/*  79 */         i1 += eq1.i();
/*  80 */         m--;
/*     */       } 
/*  82 */       el el3 = new el(n, i5, i1);
/*  83 */       blc blc1 = axz1.a_(el3);
/*  84 */       if (blc1.f() || blc1.a(wv.A)) {
/*  85 */         a(☃, axz1, el3);
/*  86 */         i2 = i5;
/*     */       } 
/*     */     } 
/*     */     
/*  90 */     el el2 = new el(n, i2, i1); int i4;
/*  91 */     for (i4 = -3; i4 <= 3; i4++) {
/*  92 */       for (int i5 = -3; i5 <= 3; i5++) {
/*  93 */         if (Math.abs(i4) != 3 || Math.abs(i5) != 3)
/*     */         {
/*     */           
/*  96 */           b(axz1, el2.a(i4, 0, i5));
/*     */         }
/*     */       } 
/*     */     } 
/* 100 */     el2 = el2.a();
/*     */     
/* 102 */     for (i4 = -1; i4 <= 1; i4++) {
/* 103 */       for (int i5 = -1; i5 <= 1; i5++) {
/* 104 */         b(axz1, el2.a(i4, 0, i5));
/*     */       }
/*     */     } 
/*     */     
/* 108 */     b(axz1, el2.g(2));
/* 109 */     b(axz1, el2.f(2));
/* 110 */     b(axz1, el2.e(2));
/* 111 */     b(axz1, el2.d(2));
/*     */ 
/*     */     
/* 114 */     n = el1.o();
/* 115 */     i1 = el1.q();
/* 116 */     eq eq2 = eq.c.a.a(random);
/* 117 */     if (eq2 != eq1) {
/* 118 */       i4 = k - random.nextInt(2) - 1;
/* 119 */       int i5 = 1 + random.nextInt(3);
/*     */       
/* 121 */       i2 = 0;
/* 122 */       for (int i6 = i4; i6 < i && i5 > 0; i6++, i5--) {
/* 123 */         if (i6 >= 1) {
/*     */ 
/*     */           
/* 126 */           int i7 = el1.p() + i6;
/* 127 */           n += eq2.g();
/* 128 */           i1 += eq2.i();
/* 129 */           el el3 = new el(n, i7, i1);
/* 130 */           blc blc1 = axz1.a_(el3);
/* 131 */           if (blc1.f() || blc1.a(wv.A)) {
/* 132 */             a(☃, axz1, el3);
/* 133 */             i2 = i7;
/*     */           } 
/*     */         } 
/* 136 */       }  if (i2 > 0) {
/* 137 */         el el3 = new el(n, i2, i1); int i7;
/* 138 */         for (i7 = -2; i7 <= 2; i7++) {
/* 139 */           for (int i8 = -2; i8 <= 2; i8++) {
/* 140 */             if (Math.abs(i7) != 2 || Math.abs(i8) != 2)
/*     */             {
/*     */               
/* 143 */               b(axz1, el3.a(i7, 0, i8)); } 
/*     */           } 
/*     */         } 
/* 146 */         el3 = el3.a();
/* 147 */         for (i7 = -1; i7 <= 1; i7++) {
/* 148 */           for (int i8 = -1; i8 <= 1; i8++) {
/* 149 */             b(axz1, el3.a(i7, 0, i8));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 155 */     return true;
/*     */   }
/*     */   
/*     */   private void a(Set<el> ☃, axz axz1, el el1) {
/* 159 */     a(☃, axz1, el1, a);
/*     */   }
/*     */   
/*     */   private void b(axz ☃, el el1) {
/* 163 */     blc blc1 = ☃.a_(el1);
/* 164 */     if (blc1.f() || blc1.a(wv.A))
/* 165 */       a(☃, el1, b); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bsu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */