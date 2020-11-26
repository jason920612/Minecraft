/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsk
/*    */   extends bqo<bsj>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bsj bsj1) {
/* 13 */     boolean bool = random.nextBoolean();
/* 14 */     if (bool) {
/* 15 */       return a(bsj1.a, bsj1.b, ☃, bmy1, random, el1);
/*    */     }
/* 17 */     return a(bsj1.c, bsj1.d, ☃, bmy1, random, el1);
/*    */   }
/*    */ 
/*    */   
/*    */   <FC extends bqp> boolean a(bqo<FC> ☃, bqp bqp1, axz axz1, bmy<? extends bom> bmy1, Random random, el el1) {
/* 22 */     return ☃.a(axz1, bmy1, random, el1, (FC)bqp1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */