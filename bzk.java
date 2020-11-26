/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bzk<R extends bzf>
/*    */   extends bzl
/*    */ {
/*    */   void a(long paramLong1, long paramLong2);
/*    */   
/*    */   R a(bzg parambzg, caw paramcaw);
/*    */   
/*    */   default R a(bzg ☃, caw caw1, R r) {
/* 13 */     return a(☃, caw1);
/*    */   }
/*    */   
/*    */   default R a(bzg ☃, caw caw1, R r1, R r2) {
/* 17 */     return a(☃, caw1);
/*    */   }
/*    */   
/*    */   int a(int... paramVarArgs);
/*    */ }


/* Location:              F:\dw\server.jar!\bzk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */