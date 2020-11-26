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
/*    */ public class bul
/*    */   extends bvg<bry>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bry bry1, bqo<C> bqo1, C c) {
/* 17 */     boolean bool = false;
/*    */     
/* 19 */     int i = random.nextInt(5);
/* 20 */     for (int j = 0; j < i; j++) {
/* 21 */       int k = random.nextInt(16);
/* 22 */       int m = random.nextInt(16);
/* 23 */       int n = ☃.a(bor.a.d, el1.a(k, 0, m)).p();
/* 24 */       if (n > 0) {
/* 25 */         int i1 = n - 1;
/* 26 */         bool |= bqo1.a(☃, bmy1, random, new el(el1.o() + k, i1, el1.q() + m), c);
/*    */       } 
/*    */     } 
/*    */     
/* 30 */     return bool;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */