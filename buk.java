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
/*    */ public class buk
/*    */   extends bvg<buw>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, buw buw1, bqo<C> bqo1, C c) {
/* 16 */     if (random.nextFloat() < 1.0F / buw1.a) {
/* 17 */       int i = random.nextInt(16);
/* 18 */       int j = random.nextInt(16);
/* 19 */       int k = ☃.a(bor.a.b, el1.o() + i, el1.q() + j);
/* 20 */       bqo1.a(☃, bmy1, random, new el(el1.o() + i, k, el1.q() + j), c);
/*    */     } 
/*    */     
/* 23 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\buk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */