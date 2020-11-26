/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cas
/*    */   extends can, cau
/*    */ {
/*    */   int a(bzl parambzl, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*    */   
/*    */   default int a(bzk<?> ☃, bzg bzg1, bzf bzf1, int i, int j) {
/* 13 */     return a(☃, bzf1
/*    */         
/* 15 */         .a(i + 1, j + 0), bzf1
/* 16 */         .a(i + 2, j + 1), bzf1
/* 17 */         .a(i + 1, j + 2), bzf1
/* 18 */         .a(i + 0, j + 1), bzf1
/* 19 */         .a(i + 1, j + 1));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */