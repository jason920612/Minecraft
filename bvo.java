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
/*    */ 
/*    */ public class bvo
/*    */   extends bvg<bpz>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bpz bpz1, bqo<C> bqo1, C c) {
/* 18 */     double d = ayu.aJ.a(el1.o() / 200.0D, el1.q() / 200.0D);
/* 19 */     int i = (d < bpz1.a) ? bpz1.b : bpz1.c;
/*    */     
/* 21 */     for (int j = 0; j < i; j++) {
/* 22 */       int k = random.nextInt(16);
/* 23 */       int m = random.nextInt(16);
/* 24 */       int n = ☃.a(bor.a.d, el1.a(k, 0, m)).p() + 32;
/*    */       
/* 26 */       if (n > 0) {
/*    */ 
/*    */ 
/*    */         
/* 30 */         int i1 = random.nextInt(n);
/* 31 */         bqo1.a(☃, bmy1, random, el1.a(k, i1, m), c);
/*    */       } 
/*    */     } 
/* 34 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */