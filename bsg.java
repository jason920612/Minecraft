/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsg
/*    */   extends bqs
/*    */ {
/*    */   public blc a(Random ☃, el el1) {
/* 13 */     double d = ayu.aJ.a(el1.o() / 200.0D, el1.q() / 200.0D);
/* 14 */     if (d < -0.8D) {
/* 15 */       int i = ☃.nextInt(4);
/* 16 */       switch (i) {
/*    */         case 0:
/* 18 */           return bct.bv.p();
/*    */         case 1:
/* 20 */           return bct.bu.p();
/*    */         case 2:
/* 22 */           return bct.bx.p();
/*    */       } 
/*    */       
/* 25 */       return bct.bw.p();
/*    */     } 
/*    */     
/* 28 */     if (☃.nextInt(3) > 0) {
/* 29 */       int i = ☃.nextInt(3);
/* 30 */       if (i == 0)
/* 31 */         return bct.bq.p(); 
/* 32 */       if (i == 1) {
/* 33 */         return bct.bt.p();
/*    */       }
/* 35 */       return bct.by.p();
/*    */     } 
/*    */     
/* 38 */     return bct.bp.p();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */