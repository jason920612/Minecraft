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
/*    */ public class bsq
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     int i = 0;
/*    */     
/* 22 */     for (int j = 0; j < 20; j++) {
/* 23 */       el el2 = el1.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
/*    */       
/* 25 */       if (☃.c(el2)) {
/* 26 */         el el3 = el2.b();
/*    */         
/* 28 */         if (☃.b(el3.e()).a(ww.a) || ☃.b(el3.f()).a(ww.a) || ☃.b(el3.c()).a(ww.a) || ☃.b(el3.d()).a(ww.a)) {
/* 29 */           int k = 2 + random.nextInt(random.nextInt(3) + 1);
/* 30 */           for (int m = 0; m < k; m++) {
/* 31 */             if (bct.cV.p().a(☃, el2)) {
/* 32 */               ☃.a(el2.b(m), bct.cV.p(), 2);
/* 33 */               i++;
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 40 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */