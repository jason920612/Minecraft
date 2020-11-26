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
/*    */ public class bpv
/*    */   extends bqo<brz>
/*    */ {
/* 16 */   private static final bdy a = (bdy)bct.aT;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 24 */     blc blc1 = ☃.a_(el1);
/* 25 */     while ((blc1.f() || blc1.a(wv.A)) && el1.p() > 0) {
/* 26 */       el1 = el1.b();
/* 27 */       blc1 = ☃.a_(el1);
/*    */     } 
/*    */     
/* 30 */     blc blc2 = a.p();
/*    */     
/* 32 */     for (int i = 0; i < 4; i++) {
/* 33 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 34 */       if (☃.c(el2) && blc2.a(☃, el2)) {
/* 35 */         ☃.a(el2, blc2, 2);
/*    */       }
/*    */     } 
/*    */     
/* 39 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */