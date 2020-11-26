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
/*    */ public abstract class bqs
/*    */   extends bqo<brz>
/*    */ {
/*    */   public abstract blc a(Random paramRandom, el paramel);
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     blc blc = a(random, el1);
/* 21 */     int i = 0;
/* 22 */     for (int j = 0; j < 64; j++) {
/* 23 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/*    */       
/* 25 */       if (☃.c(el2) && el2.p() < 255 && 
/* 26 */         blc.a(☃, el2)) {
/* 27 */         ☃.a(el2, blc, 2);
/* 28 */         i++;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 33 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */