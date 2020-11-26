/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsp
/*    */   extends bqo<bsl>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bsl bsl1) {
/* 13 */     for (int i = 0; i < bsl1.a.length; i++) {
/* 14 */       if (random.nextFloat() < bsl1.c[i]) {
/* 15 */         return a(bsl1.a[i], bsl1.b[i], ☃, bmy1, random, el1);
/*    */       }
/*    */     } 
/* 18 */     return a(bsl1.d, bsl1.f, ☃, bmy1, random, el1);
/*    */   }
/*    */ 
/*    */   
/*    */   <FC extends bqp> boolean a(bqo<FC> ☃, bqp bqp1, axz axz1, bmy<? extends bom> bmy1, Random random, el el1) {
/* 23 */     return ☃.a(axz1, bmy1, random, el1, (FC)bqp1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */