/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface car
/*    */   extends can, cau
/*    */ {
/*    */   int a(bzl parambzl, int paramInt);
/*    */   
/*    */   default int a(bzk<?> ☃, bzg bzg1, bzf bzf1, int i, int j) {
/* 13 */     int k = bzf1.a(i + 1, j + 1);
/* 14 */     return a(☃, k);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\car.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */