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
/*    */ public class bqy
/*    */   extends bqo<bqx>
/*    */ {
/* 15 */   private static final blc a = bct.de.p();
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bqx bqx1) {
/* 19 */     if (☃.a_(el1.a()) != a) {
/* 20 */       return false;
/*    */     }
/* 22 */     if (!☃.a_(el1).f() && ☃.a_(el1) != a) {
/* 23 */       return false;
/*    */     }
/*    */     
/* 26 */     int i = 0;
/* 27 */     if (☃.a_(el1.e()) == a) {
/* 28 */       i++;
/*    */     }
/* 30 */     if (☃.a_(el1.f()) == a) {
/* 31 */       i++;
/*    */     }
/* 33 */     if (☃.a_(el1.c()) == a) {
/* 34 */       i++;
/*    */     }
/* 36 */     if (☃.a_(el1.d()) == a) {
/* 37 */       i++;
/*    */     }
/* 39 */     if (☃.a_(el1.b()) == a) {
/* 40 */       i++;
/*    */     }
/*    */     
/* 43 */     int j = 0;
/* 44 */     if (☃.c(el1.e())) {
/* 45 */       j++;
/*    */     }
/* 47 */     if (☃.c(el1.f())) {
/* 48 */       j++;
/*    */     }
/* 50 */     if (☃.c(el1.c())) {
/* 51 */       j++;
/*    */     }
/* 53 */     if (☃.c(el1.d())) {
/* 54 */       j++;
/*    */     }
/* 56 */     if (☃.c(el1.b())) {
/* 57 */       j++;
/*    */     }
/*    */     
/* 60 */     if ((!bqx1.a && i == 4 && j == 1) || i == 5) {
/* 61 */       ☃.a(el1, bct.C.p(), 2);
/* 62 */       ☃.I().a(el1, byy.e, 0);
/*    */     } 
/*    */     
/* 65 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */