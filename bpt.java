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
/*    */ public class bpt
/*    */   extends bvg<buy>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, buy buy1, bqo<C> bqo1, C c) {
/* 16 */     for (int i = 0; i < buy1.a; i++) {
/* 17 */       if (random.nextFloat() < buy1.b) {
/* 18 */         int j = random.nextInt(16);
/* 19 */         int k = random.nextInt(16);
/*    */         
/* 21 */         int m = ☃.a(bor.a.d, el1.a(j, 0, k)).p() * 2;
/*    */         
/* 23 */         if (m > 0) {
/*    */ 
/*    */ 
/*    */           
/* 27 */           int n = random.nextInt(m);
/* 28 */           bqo1.a(☃, bmy1, random, el1.a(j, n, k), c);
/*    */         } 
/*    */       } 
/* 31 */     }  return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */