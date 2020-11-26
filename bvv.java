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
/*    */ public class bvv
/*    */   extends bvg<bvb>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bvb bvb1, bqo<C> bqo1, C c) {
/* 16 */     int i = random.nextInt(bvb1.b - bvb1.a) + bvb1.a;
/* 17 */     for (int j = 0; j < i; j++) {
/* 18 */       int k = random.nextInt(16);
/* 19 */       int m = random.nextInt(16);
/* 20 */       int n = ☃.a(bor.a.b, el1.o() + k, el1.q() + m);
/* 21 */       bqo1.a(☃, bmy1, random, new el(el1.o() + k, n, el1.q() + m), c);
/*    */     } 
/* 23 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */