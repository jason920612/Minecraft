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
/*    */ public class buq
/*    */   extends bvg<bux>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bux bux1, bqo<C> bqo1, C c) {
/* 18 */     for (int i = 0; i < bux1.a; i++) {
/* 19 */       int j = random.nextInt(16);
/* 20 */       int k = random.nextInt(16);
/* 21 */       int m = ☃.a(bor.a.d, el1.a(j, 0, k)).p() + 32;
/*    */       
/* 23 */       if (m > 0) {
/*    */ 
/*    */ 
/*    */         
/* 27 */         int n = random.nextInt(m);
/* 28 */         bqo1.a(☃, bmy1, random, el1.a(j, n, k), c);
/*    */       } 
/*    */     } 
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\buq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */