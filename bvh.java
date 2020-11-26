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
/*    */ public class bvh
/*    */   extends bvg<bux>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bux bux1, bqo<C> bqo1, C c) {
/* 16 */     int i = random.nextInt(bux1.a);
/* 17 */     for (int j = 0; j < i; j++) {
/* 18 */       int k = random.nextInt(16);
/* 19 */       int m = random.nextInt(16);
/* 20 */       el el2 = ☃.a(bor.a.d, el1.a(k, 0, m));
/* 21 */       bqo1.a(☃, bmy1, random, el2, c);
/*    */     } 
/*    */     
/* 24 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */