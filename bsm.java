/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsm
/*    */   extends bqo<bsn>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bsn bsn1) {
/* 13 */     int i = random.nextInt(5) - 3 + bsn1.c;
/*    */     
/* 15 */     for (int j = 0; j < i; j++) {
/* 16 */       int k = random.nextInt(bsn1.a.length);
/*    */       
/* 18 */       a(bsn1.a[k], bsn1.b[k], ☃, bmy1, random, el1);
/*    */     } 
/*    */     
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   <FC extends bqp> boolean a(bqo<FC> ☃, bqp bqp1, axz axz1, bmy<? extends bom> bmy1, Random random, el el1) {
/* 26 */     return ☃.a(axz1, bmy1, random, el1, (FC)bqp1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */