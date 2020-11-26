/*    */ public final class pn
/*    */   extends RuntimeException
/*    */ {
/*  4 */   public static final pn a = new pn();
/*    */   
/*    */   private pn() {
/*  7 */     setStackTrace(new StackTraceElement[0]);
/*    */   }
/*    */ 
/*    */   
/*    */   public synchronized Throwable fillInStackTrace() {
/* 12 */     setStackTrace(new StackTraceElement[0]);
/* 13 */     return this;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */