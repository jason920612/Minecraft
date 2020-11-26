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
/*    */ public class bsi
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     int i = 0;
/* 21 */     blc blc = bct.dd.p();
/*    */     
/* 23 */     for (int j = 0; j < 64; j++) {
/* 24 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/*    */       
/* 26 */       if (☃.c(el2) && ☃.a_(el2.b()).c() == bct.i) {
/* 27 */         ☃.a(el2, blc, 2);
/* 28 */         i++;
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */