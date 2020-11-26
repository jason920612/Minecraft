/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsf
/*    */   extends bpa<brz>
/*    */ {
/* 15 */   private static final blc a = bct.K.p();
/* 16 */   private static final blc b = bct.ai.p();
/*    */   
/*    */   public bsf() {
/* 19 */     super(false);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/* 25 */     int i = random.nextInt(5) + 7;
/* 26 */     int j = i - random.nextInt(2) - 3;
/* 27 */     int k = i - j;
/* 28 */     int m = 1 + random.nextInt(k + 1);
/*    */ 
/*    */     
/* 31 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/* 32 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 36 */     boolean bool = true;
/* 37 */     for (int n = el1.p(); n <= el1.p() + 1 + i && bool; n++) {
/* 38 */       int i3 = 1;
/* 39 */       if (n - el1.p() < j) {
/* 40 */         i3 = 0;
/*    */       } else {
/* 42 */         i3 = m;
/*    */       } 
/* 44 */       el.a a = new el.a();
/* 45 */       for (int i4 = el1.o() - i3; i4 <= el1.o() + i3 && bool; i4++) {
/* 46 */         for (int i5 = el1.q() - i3; i5 <= el1.q() + i3 && bool; i5++) {
/* 47 */           if (n >= 0 && n < 256) {
/* 48 */             if (!a(axz1.a_(a.c(i4, n, i5)).c())) {
/* 49 */               bool = false;
/*    */             }
/*    */           } else {
/* 52 */             bool = false;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     if (!bool) {
/* 59 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 63 */     bcs bcs = axz1.a_(el1.b()).c();
/* 64 */     if ((bcs != bct.i && !bcs.d(bcs)) || el1.p() >= 256 - i - 1) {
/* 65 */       return false;
/*    */     }
/*    */     
/* 68 */     a(axz1, el1.b());
/*    */ 
/*    */     
/* 71 */     int i1 = 0; int i2;
/* 72 */     for (i2 = el1.p() + i; i2 >= el1.p() + j; i2--) {
/* 73 */       for (int i3 = el1.o() - i1; i3 <= el1.o() + i1; i3++) {
/* 74 */         int i4 = i3 - el1.o();
/* 75 */         for (int i5 = el1.q() - i1; i5 <= el1.q() + i1; i5++) {
/* 76 */           int i6 = i5 - el1.q();
/* 77 */           if (Math.abs(i4) != i1 || Math.abs(i6) != i1 || i1 <= 0) {
/*    */ 
/*    */             
/* 80 */             el el2 = new el(i3, i2, i5);
/* 81 */             if (!axz1.a_(el2).f(axz1, el2)) {
/* 82 */               a(axz1, el2, b);
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/* 87 */       if (i1 >= 1 && i2 == el1.p() + j + 1) {
/* 88 */         i1--;
/* 89 */       } else if (i1 < m) {
/* 90 */         i1++;
/*    */       } 
/*    */     } 
/* 93 */     for (i2 = 0; i2 < i - 1; i2++) {
/* 94 */       blc blc1 = axz1.a_(el1.b(i2));
/* 95 */       if (blc1.f() || blc1.a(wv.A)) {
/* 96 */         a(☃, axz1, el1.b(i2), a);
/*    */       }
/*    */     } 
/* 99 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */