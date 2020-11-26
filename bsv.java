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
/*    */ public class bsv
/*    */   extends bqo<bpu>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<?> bmy1, Random random, el el1, bpu bpu1) {
/* 17 */     int i = 0;
/* 18 */     for (int j = 0; j < bpu1.a; j++) {
/* 19 */       int k = random.nextInt(8) - random.nextInt(8);
/* 20 */       int m = random.nextInt(8) - random.nextInt(8);
/* 21 */       int n = ☃.a(bor.a.f, el1.o() + k, el1.q() + m);
/* 22 */       el el2 = new el(el1.o() + k, n, el1.q() + m);
/*    */       
/* 24 */       blc blc = bct.kn.p().a(bhf.a, Integer.valueOf(random.nextInt(4) + 1));
/* 25 */       if (☃.a_(el2).c() == bct.A && blc.a(☃, el2)) {
/* 26 */         ☃.a(el2, blc, 2);
/* 27 */         i++;
/*    */       } 
/*    */     } 
/* 30 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */