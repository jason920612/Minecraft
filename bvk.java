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
/*    */ public class bvk
/*    */   extends bvg<bvj>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bvj bvj1, bqo<C> bqo1, C c) {
/* 15 */     if (random.nextInt(bvj1.a / 10) == 0) {
/* 16 */       int i = random.nextInt(16);
/* 17 */       int j = random.nextInt(random.nextInt(bmy1.e() - 8) + 8);
/* 18 */       int k = random.nextInt(16);
/* 19 */       if (j < ☃.k() || random.nextInt(bvj1.a / 8) == 0) {
/* 20 */         bqo1.a(☃, bmy1, random, el1.a(i, j, k), c);
/*    */       }
/*    */     } 
/*    */     
/* 24 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */