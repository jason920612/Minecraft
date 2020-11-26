/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bra
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     int i = random.nextInt(3) + 4;
/* 21 */     if (random.nextInt(12) == 0) {
/* 22 */       i *= 2;
/*    */     }
/*    */     
/* 25 */     int j = el1.p();
/* 26 */     if (j < 1 || j + i + 1 >= 256) {
/* 27 */       return false;
/*    */     }
/*    */     
/* 30 */     bcs bcs = ☃.a_(el1.b()).c();
/* 31 */     if (!bcs.d(bcs) && bcs != bct.i && bcs != bct.dV) {
/* 32 */       return false;
/*    */     }
/*    */     
/* 35 */     el.a a = new el.a();
/* 36 */     for (int k = 0; k <= i; k++) {
/* 37 */       int i1 = 0;
/* 38 */       if (k < i && k >= i - 3) {
/* 39 */         i1 = 2;
/* 40 */       } else if (k == i) {
/* 41 */         i1 = 1;
/*    */       } 
/* 43 */       for (int i2 = -i1; i2 <= i1; i2++) {
/* 44 */         for (int i3 = -i1; i3 <= i1; i3++) {
/* 45 */           blc blc = ☃.a_(a.g(el1).d(i2, k, i3));
/* 46 */           if (!blc.f() && !blc.a(wv.A)) {
/* 47 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 53 */     blc blc1 = bct.dD.p().a(bfj.q, Boolean.valueOf(false));
/*    */ 
/*    */     
/* 56 */     for (int m = i - 3; m <= i; m++) {
/* 57 */       int i1 = (m < i) ? 2 : 1;
/* 58 */       int i2 = 0;
/*    */       
/* 60 */       for (int i3 = -i1; i3 <= i1; i3++) {
/* 61 */         for (int i4 = -i1; i4 <= i1; i4++) {
/* 62 */           boolean bool1 = (i3 == -i1);
/* 63 */           boolean bool2 = (i3 == i1);
/* 64 */           boolean bool3 = (i4 == -i1);
/* 65 */           boolean bool4 = (i4 == i1);
/*    */           
/* 67 */           boolean bool5 = (bool1 || bool2);
/* 68 */           boolean bool6 = (bool3 || bool4);
/*    */           
/* 70 */           if (m >= i || bool5 != bool6) {
/*    */ 
/*    */ 
/*    */             
/* 74 */             a.g(el1).d(i3, m, i4);
/* 75 */             if (!☃.a_(a).f(☃, a)) {
/* 76 */               a(☃, a, blc1
/* 77 */                   .a(bfj.p, Boolean.valueOf((m >= i - 1)))
/* 78 */                   .a(bfj.o, Boolean.valueOf((i3 < 0)))
/* 79 */                   .a(bfj.b, Boolean.valueOf((i3 > 0)))
/* 80 */                   .a(bfj.a, Boolean.valueOf((i4 < 0)))
/* 81 */                   .a(bfj.c, Boolean.valueOf((i4 > 0))));
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 89 */     blc blc2 = bct.dE.p().a(bfj.p, Boolean.valueOf(false)).a(bfj.q, Boolean.valueOf(false));
/* 90 */     for (int n = 0; n < i; n++) {
/* 91 */       a.g(el1).c(eq.b, n);
/* 92 */       if (!☃.a_(a).f(☃, a)) {
/* 93 */         a(☃, a, blc2);
/*    */       }
/*    */     } 
/* 96 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */