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
/*    */ public class bpl
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 19 */     for (int i = 0; i < 10; i++) {
/* 20 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/*    */       
/* 22 */       if (☃.c(el2)) {
/* 23 */         int j = 1 + random.nextInt(random.nextInt(3) + 1);
/* 24 */         for (int k = 0; k < j; k++) {
/* 25 */           if (bct.cT.p().a(☃, el2)) {
/* 26 */             ☃.a(el2.b(k), bct.cT.p(), 2);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */