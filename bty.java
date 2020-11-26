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
/*    */ public class bty
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     el el2 = el1;
/* 21 */     while (el2.p() > 0) {
/* 22 */       el el3 = el2.b();
/* 23 */       if (!☃.c(el3)) {
/*    */         break;
/*    */       }
/*    */       
/* 27 */       el2 = el3;
/*    */     } 
/*    */     
/* 30 */     for (int i = 0; i < 10; i++) {
/* 31 */       el el3 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 32 */       blc blc = bct.dW.p();
/* 33 */       if (☃.c(el3) && blc.a(☃, el3)) {
/* 34 */         ☃.a(el3, blc, 2);
/*    */       }
/*    */     } 
/*    */     
/* 38 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */