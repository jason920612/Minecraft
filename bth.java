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
/*    */ public class bth
/*    */   extends bqo<btg>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, btg btg1) {
/* 15 */     if (!bcs.c(☃.a_(el1.a()).c())) {
/* 16 */       return false;
/*    */     }
/* 18 */     if (!bcs.c(☃.a_(el1.b()).c())) {
/* 19 */       return false;
/*    */     }
/*    */     
/* 22 */     blc blc = ☃.a_(el1);
/* 23 */     if (!blc.f() && !bcs.c(blc.c())) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     int i = 0;
/*    */     
/* 29 */     int j = 0;
/* 30 */     if (bcs.c(☃.a_(el1.e()).c())) {
/* 31 */       j++;
/*    */     }
/* 33 */     if (bcs.c(☃.a_(el1.f()).c())) {
/* 34 */       j++;
/*    */     }
/* 36 */     if (bcs.c(☃.a_(el1.c()).c())) {
/* 37 */       j++;
/*    */     }
/* 39 */     if (bcs.c(☃.a_(el1.d()).c())) {
/* 40 */       j++;
/*    */     }
/*    */     
/* 43 */     int k = 0;
/* 44 */     if (☃.c(el1.e())) {
/* 45 */       k++;
/*    */     }
/* 47 */     if (☃.c(el1.f())) {
/* 48 */       k++;
/*    */     }
/* 50 */     if (☃.c(el1.c())) {
/* 51 */       k++;
/*    */     }
/* 53 */     if (☃.c(el1.d())) {
/* 54 */       k++;
/*    */     }
/*    */     
/* 57 */     if (j == 3 && k == 1) {
/* 58 */       ☃.a(el1, btg1.a.i().i(), 2);
/* 59 */       ☃.I().a(el1, btg1.a, 0);
/* 60 */       i++;
/*    */     } 
/*    */     
/* 63 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */