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
/*    */ public class bqz
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
/* 36 */     for (int k = 0; k <= 1 + i; k++) {
/* 37 */       int i2 = (k <= 3) ? 0 : 3;
/* 38 */       for (int i3 = -i2; i3 <= i2; i3++) {
/* 39 */         for (int i4 = -i2; i4 <= i2; i4++) {
/* 40 */           blc blc = ☃.a_(a.g(el1).d(i3, k, i4));
/* 41 */           if (!blc.f() && !blc.a(wv.A)) {
/* 42 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     blc blc1 = bct.dC.p().a(bfj.p, Boolean.valueOf(true)).a(bfj.q, Boolean.valueOf(false));
/*    */     
/* 53 */     int m = 3;
/* 54 */     for (int n = -3; n <= 3; n++) {
/* 55 */       for (int i2 = -3; i2 <= 3; i2++) {
/* 56 */         boolean bool1 = (n == -3);
/* 57 */         boolean bool2 = (n == 3);
/* 58 */         boolean bool3 = (i2 == -3);
/* 59 */         boolean bool4 = (i2 == 3);
/*    */         
/* 61 */         boolean bool5 = (bool1 || bool2);
/* 62 */         boolean bool6 = (bool3 || bool4);
/* 63 */         if (!bool5 || !bool6) {
/*    */ 
/*    */ 
/*    */           
/* 67 */           a.g(el1).d(n, i, i2);
/* 68 */           if (!☃.a_(a).f(☃, a)) {
/* 69 */             boolean bool7 = (bool1 || (bool6 && n == -2));
/* 70 */             boolean bool8 = (bool2 || (bool6 && n == 2));
/* 71 */             boolean bool9 = (bool3 || (bool5 && i2 == -2));
/* 72 */             boolean bool10 = (bool4 || (bool5 && i2 == 2));
/* 73 */             a(☃, a, blc1.a(bfj.o, Boolean.valueOf(bool7)).a(bfj.b, Boolean.valueOf(bool8)).a(bfj.a, Boolean.valueOf(bool9)).a(bfj.c, Boolean.valueOf(bool10)));
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 79 */     blc blc2 = bct.dE.p().a(bfj.p, Boolean.valueOf(false)).a(bfj.q, Boolean.valueOf(false));
/* 80 */     for (int i1 = 0; i1 < i; i1++) {
/* 81 */       a.g(el1).c(eq.b, i1);
/* 82 */       if (!☃.a_(a).f(☃, a)) {
/* 83 */         a(☃, a, blc2);
/*    */       }
/*    */     } 
/* 86 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */