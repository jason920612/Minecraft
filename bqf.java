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
/*    */ public class bqf
/*    */   extends bqo<bqe>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bqe bqe1) {
/* 18 */     if (!☃.b(el1).a(ww.a)) {
/* 19 */       return false;
/*    */     }
/*    */     
/* 22 */     int i = 0;
/*    */     
/* 24 */     int j = random.nextInt(bqe1.b - 2) + 2;
/* 25 */     for (int k = el1.o() - j; k <= el1.o() + j; k++) {
/* 26 */       for (int m = el1.q() - j; m <= el1.q() + j; m++) {
/* 27 */         int n = k - el1.o();
/* 28 */         int i1 = m - el1.q();
/* 29 */         if (n * n + i1 * i1 <= j * j)
/*    */         {
/*    */           
/* 32 */           for (int i2 = el1.p() - bqe1.c; i2 <= el1.p() + bqe1.c; i2++) {
/* 33 */             el el2 = new el(k, i2, m);
/* 34 */             bcs bcs = ☃.a_(el2).c();
/* 35 */             if (bqe1.d.contains(bcs)) {
/* 36 */               ☃.a(el2, bqe1.a.p(), 2);
/* 37 */               i++;
/*    */             } 
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/* 43 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */