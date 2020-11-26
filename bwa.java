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
/*    */ public class bwa
/*    */   extends bvg<bux>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bux bux1, bqo<C> bqo1, C c) {
/* 17 */     int i = ☃.k() / 2 + 1;
/*    */     
/* 19 */     for (int j = 0; j < bux1.a; j++) {
/* 20 */       int k = random.nextInt(16);
/* 21 */       int m = i - 5 + random.nextInt(10);
/* 22 */       int n = random.nextInt(16);
/* 23 */       bqo1.a(☃, bmy1, random, el1.a(k, m, n), c);
/*    */     } 
/*    */     
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bwa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */