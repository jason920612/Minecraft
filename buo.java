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
/*    */ public class buo
/*    */   extends bvg<bux>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bux bux1, bqo<C> bqo1, C c) {
/* 16 */     for (int i = 0; i < bux1.a; i++) {
/* 17 */       int j = random.nextInt(16);
/* 18 */       int k = random.nextInt(16);
/* 19 */       int m = ☃.a(bor.a.d, el1.a(j, 0, k)).p() * 2;
/*    */       
/* 21 */       if (m > 0) {
/*    */ 
/*    */ 
/*    */         
/* 25 */         int n = random.nextInt(m);
/* 26 */         bqo1.a(☃, bmy1, random, el1.a(j, n, k), c);
/*    */       } 
/*    */     } 
/* 29 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\buo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */