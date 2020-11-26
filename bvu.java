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
/*    */ public class bvu
/*    */   extends bvg<bva>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bva bva1, bqo<C> bqo1, C c) {
/* 17 */     double d = ayu.aJ.a(el1.o() / bva1.b, el1.q() / bva1.b);
/* 18 */     int i = (int)Math.ceil(d * bva1.a);
/*    */     
/* 20 */     for (int j = 0; j < i; j++) {
/* 21 */       int k = random.nextInt(16);
/* 22 */       int m = random.nextInt(16);
/* 23 */       int n = ☃.a(bor.a.b, el1.o() + k, el1.q() + m);
/*    */       
/* 25 */       bqo1.a(☃, bmy1, random, new el(el1.o() + k, n, el1.q() + m), c);
/*    */     } 
/*    */     
/* 28 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bvu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */