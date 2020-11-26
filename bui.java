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
/*    */ public class bui
/*    */   extends bvg<buw>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, buw buw1, bqo<C> bqo1, C c) {
/* 16 */     if (random.nextFloat() < 1.0F / buw1.a) {
/* 17 */       int i = random.nextInt(16);
/* 18 */       int j = random.nextInt(16);
/* 19 */       int k = ☃.a(bor.a.d, el1.a(i, 0, j)).p() * 2;
/*    */       
/* 21 */       if (k <= 0) {
/* 22 */         return false;
/*    */       }
/*    */       
/* 25 */       int m = random.nextInt(k);
/* 26 */       bqo1.a(☃, bmy1, random, el1.a(i, m, j), c);
/*    */     } 
/* 28 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */