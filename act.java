/*    */ import java.util.concurrent.ThreadFactory;
/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public class act
/*    */   implements ThreadFactory
/*    */ {
/* 10 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final ThreadGroup b;
/* 13 */   private final AtomicInteger c = new AtomicInteger(1);
/*    */   private final String d;
/*    */   
/*    */   public act(String ☃) {
/* 17 */     SecurityManager securityManager = System.getSecurityManager();
/* 18 */     this.b = (securityManager != null) ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
/* 19 */     this.d = ☃ + "-";
/*    */   }
/*    */ 
/*    */   
/*    */   public Thread newThread(Runnable ☃) {
/* 24 */     Thread thread = new Thread(this.b, ☃, this.d + this.c.getAndIncrement(), 0L);
/* 25 */     thread.setUncaughtExceptionHandler((thread, throwable) -> {
/*    */           a.error("Caught exception in thread {} from {}", thread, ☃);
/*    */           a.error("", throwable);
/*    */         });
/* 29 */     if (thread.getPriority() != 5) {
/* 30 */       thread.setPriority(5);
/*    */     }
/* 32 */     return thread;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\act.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */