/*    */ package org.apache.commons.lang3.concurrent;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CircuitBreakingException
/*    */   extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 1408176654686913340L;
/*    */   
/*    */   public CircuitBreakingException() {}
/*    */   
/*    */   public CircuitBreakingException(String message, Throwable cause) {
/* 46 */     super(message, cause);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CircuitBreakingException(String message) {
/* 55 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CircuitBreakingException(Throwable cause) {
/* 64 */     super(cause);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\org\apache\commons\lang3\concurrent\CircuitBreakingException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */