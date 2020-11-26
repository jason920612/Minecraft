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
/*    */ public class bqm
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 15 */     float f = (random.nextInt(3) + 4);
/* 16 */     int i = 0;
/* 17 */     while (f > 0.5F) {
/* 18 */       for (int j = xq.d(-f); j <= xq.f(f); j++) {
/* 19 */         for (int k = xq.d(-f); k <= xq.f(f); k++) {
/* 20 */           if ((j * j + k * k) <= (f + 1.0F) * (f + 1.0F)) {
/* 21 */             a(☃, el1.a(j, i, k), bct.eg.p());
/*    */           }
/*    */         } 
/*    */       } 
/* 25 */       f = (float)(f - random.nextInt(2) + 0.5D);
/* 26 */       i--;
/*    */     } 
/*    */     
/* 29 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */