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
/*    */ 
/*    */ public class bpk
/*    */   extends bqo<bpj>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bpj bpj1) {
/* 21 */     int i = 0;
/*    */     
/* 23 */     blc blc = bpj1.a.p();
/* 24 */     for (int j = 0; j < 64; j++) {
/* 25 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/*    */       
/* 27 */       if (☃.c(el2) && (!☃.o().h() || el2.p() < 255) && 
/* 28 */         blc.a(☃, el2)) {
/* 29 */         ☃.a(el2, blc, 2);
/* 30 */         i++;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 35 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */