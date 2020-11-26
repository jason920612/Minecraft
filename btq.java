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
/*    */ public class btq
/*    */   extends bqo<brz>
/*    */ {
/*    */   public blc a(Random ☃) {
/* 16 */     return (☃.nextInt(5) > 0) ? bct.aS.p() : bct.aR.p();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 25 */     blc blc1 = a(random);
/* 26 */     blc blc2 = ☃.a_(el1);
/*    */ 
/*    */     
/* 29 */     while ((blc2.f() || blc2.a(wv.A)) && el1.p() > 0) {
/* 30 */       el1 = el1.b();
/* 31 */       blc2 = ☃.a_(el1);
/*    */     } 
/*    */     
/* 34 */     int i = 0;
/*    */     
/* 36 */     for (int j = 0; j < 128; j++) {
/* 37 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 38 */       if (☃.c(el2) && 
/* 39 */         blc1.a(☃, el2)) {
/* 40 */         ☃.a(el2, blc1, 2);
/* 41 */         i++;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 46 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\btq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */