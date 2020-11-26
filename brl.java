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
/*    */ public class brl
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 18 */     int i = 0;
/* 19 */     int j = ☃.a(bor.a.f, el1.o(), el1.q());
/* 20 */     el el2 = new el(el1.o(), j, el1.q());
/*    */     
/* 22 */     if (☃.a_(el2).c() == bct.A) {
/* 23 */       blc blc1 = bct.jE.p();
/* 24 */       blc blc2 = bct.jD.p();
/* 25 */       int k = 1 + random.nextInt(10);
/* 26 */       for (int m = 0; m <= k; m++) {
/* 27 */         if (☃.a_(el2).c() == bct.A && ☃.a_(el2.a()).c() == bct.A && blc2.a(☃, el2)) {
/* 28 */           if (m == k) {
/* 29 */             ☃.a(el2, blc1.a(bfo.a, Integer.valueOf(random.nextInt(23))), 2);
/* 30 */             i++;
/*    */           } else {
/* 32 */             ☃.a(el2, blc2, 2);
/*    */           } 
/* 34 */         } else if (m > 0) {
/* 35 */           el el3 = el2.b();
/* 36 */           if (blc1.a(☃, el3) && ☃.a_(el3.b()).c() != bct.jE) {
/* 37 */             ☃.a(el3, blc1.a(bfo.a, Integer.valueOf(random.nextInt(23))), 2);
/* 38 */             i++;
/*    */           } 
/*    */           
/*    */           break;
/*    */         } 
/* 43 */         el2 = el2.a();
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\brl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */