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
/*    */ public class bun
/*    */   extends bvg<bvc>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bvc bvc1, bqo<C> bqo1, C c) {
/* 15 */     int i = bvc1.a;
/* 16 */     int j = bvc1.b;
/* 17 */     int k = bvc1.c;
/*    */     
/* 19 */     for (int m = 0; m < i; m++) {
/* 20 */       int n = random.nextInt(16);
/* 21 */       int i1 = random.nextInt(k) + random.nextInt(k) - k + j;
/* 22 */       int i2 = random.nextInt(16);
/* 23 */       el el2 = el1.a(n, i1, i2);
/* 24 */       bqo1.a(☃, bmy1, random, el2, c);
/*    */     } 
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */