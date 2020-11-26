/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ public class e
/*    */   implements Thread.UncaughtExceptionHandler
/*    */ {
/*    */   private final Logger a;
/*    */   
/*    */   public e(Logger ☃) {
/*  9 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void uncaughtException(Thread ☃, Throwable throwable) {
/* 14 */     this.a.error("Caught previously unhandled exception :");
/* 15 */     this.a.error(throwable);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */