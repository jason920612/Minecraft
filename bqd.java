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
/*    */ public class bqd
/*    */   extends bqo<brz>
/*    */ {
/* 16 */   private static final blp a = blp.a(bct.D);
/*    */   
/* 18 */   private final blc b = bct.bK.p();
/* 19 */   private final blc c = bct.at.p();
/* 20 */   private final blc d = bct.A.p();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 27 */     el1 = el1.a();
/*    */     
/* 29 */     while (☃.c(el1) && el1.p() > 2) {
/* 30 */       el1 = el1.b();
/*    */     }
/*    */     
/* 33 */     if (!a.a(☃.a_(el1))) {
/* 34 */       return false;
/*    */     }
/*    */     
/*    */     int i;
/*    */     
/* 39 */     for (i = -2; i <= 2; i++) {
/* 40 */       for (int j = -2; j <= 2; j++) {
/* 41 */         if (☃.c(el1.a(i, -1, j)) && ☃.c(el1.a(i, -2, j))) {
/* 42 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 48 */     for (i = -1; i <= 0; i++) {
/* 49 */       for (int j = -2; j <= 2; j++) {
/* 50 */         for (int k = -2; k <= 2; k++) {
/* 51 */           ☃.a(el1.a(j, i, k), this.c, 2);
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 57 */     ☃.a(el1, this.d, 2);
/* 58 */     for (eq eq : eq.c.a) {
/* 59 */       ☃.a(el1.a(eq), this.d, 2);
/*    */     }
/*    */ 
/*    */     
/* 63 */     for (i = -2; i <= 2; i++) {
/* 64 */       for (int j = -2; j <= 2; j++) {
/* 65 */         if (i == -2 || i == 2 || j == -2 || j == 2) {
/* 66 */           ☃.a(el1.a(i, 1, j), this.c, 2);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 71 */     ☃.a(el1.a(2, 1, 0), this.b, 2);
/* 72 */     ☃.a(el1.a(-2, 1, 0), this.b, 2);
/* 73 */     ☃.a(el1.a(0, 1, 2), this.b, 2);
/* 74 */     ☃.a(el1.a(0, 1, -2), this.b, 2);
/*    */ 
/*    */     
/* 77 */     for (i = -1; i <= 1; i++) {
/* 78 */       for (int j = -1; j <= 1; j++) {
/* 79 */         if (i == 0 && j == 0) {
/* 80 */           ☃.a(el1.a(i, 4, j), this.c, 2);
/*    */         } else {
/* 82 */           ☃.a(el1.a(i, 4, j), this.b, 2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 88 */     for (i = 1; i <= 3; i++) {
/* 89 */       ☃.a(el1.a(-1, i, -1), this.c, 2);
/* 90 */       ☃.a(el1.a(-1, i, 1), this.c, 2);
/* 91 */       ☃.a(el1.a(1, i, -1), this.c, 2);
/* 92 */       ☃.a(el1.a(1, i, 1), this.c, 2);
/*    */     } 
/*    */     
/* 95 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */