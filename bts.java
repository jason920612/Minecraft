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
/*    */ 
/*    */ 
/*    */ public class bts
/*    */   extends bqo<btr>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, btr btr1) {
/* 20 */     blc blc = ☃.a_(el1);
/*    */ 
/*    */     
/* 23 */     while ((blc.f() || blc.a(wv.A)) && el1.p() > 0) {
/* 24 */       el1 = el1.b();
/* 25 */       blc = ☃.a_(el1);
/*    */     } 
/*    */     
/* 28 */     int i = 0;
/*    */     
/* 30 */     for (int j = 0; j < 128; j++) {
/* 31 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 32 */       if (☃.c(el2) && 
/* 33 */         btr1.a.a(☃, el2)) {
/* 34 */         ☃.a(el2, btr1.a, 2);
/* 35 */         i++;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 40 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */