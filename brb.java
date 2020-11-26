/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class brb
/*    */   extends bqo<bqq>
/*    */ {
/* 13 */   private final bcs a = bct.gp;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bqq bqq1) {
/* 20 */     while (☃.c(el1) && el1.p() > 2) {
/* 21 */       el1 = el1.b();
/*    */     }
/*    */     
/* 24 */     if (☃.a_(el1).c() != bct.cS) {
/* 25 */       return false;
/*    */     }
/* 27 */     int i = random.nextInt(bqq1.a) + 2;
/* 28 */     int j = 1;
/* 29 */     for (int k = el1.o() - i; k <= el1.o() + i; k++) {
/* 30 */       for (int m = el1.q() - i; m <= el1.q() + i; m++) {
/* 31 */         int n = k - el1.o();
/* 32 */         int i1 = m - el1.q();
/* 33 */         if (n * n + i1 * i1 <= i * i)
/*    */         {
/*    */           
/* 36 */           for (int i2 = el1.p() - 1; i2 <= el1.p() + 1; i2++) {
/* 37 */             el el2 = new el(k, i2, m);
/* 38 */             bcs bcs1 = ☃.a_(el2).c();
/*    */             
/* 40 */             if (bcs.d(bcs1) || bcs1 == bct.cS || bcs1 == bct.cR) {
/* 41 */               ☃.a(el2, this.a.p(), 2);
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/* 47 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\brb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */