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
/*    */ public class bvf
/*    */   extends bvg<bry>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bry bry1, bqo<C> bqo1, C c) {
/* 16 */     boolean bool = false;
/*    */     
/* 18 */     if (random.nextInt(14) == 0) {
/* 19 */       bool |= bqo1.a(☃, bmy1, random, el1.a(random.nextInt(16), 55 + random.nextInt(16), random.nextInt(16)), c);
/*    */       
/* 21 */       if (random.nextInt(4) == 0) {
/* 22 */         bool |= bqo1.a(☃, bmy1, random, el1.a(random.nextInt(16), 55 + random.nextInt(16), random.nextInt(16)), c);
/*    */       }
/*    */     } 
/*    */     
/* 26 */     return bool;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */