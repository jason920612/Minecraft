/*    */ package io.netty.handler.codec;
/*    */ 
/*    */ import io.netty.util.Signal;
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
/*    */ public class DecoderResult
/*    */ {
/* 22 */   protected static final Signal SIGNAL_UNFINISHED = Signal.valueOf(DecoderResult.class, "UNFINISHED");
/* 23 */   protected static final Signal SIGNAL_SUCCESS = Signal.valueOf(DecoderResult.class, "SUCCESS");
/*    */   
/* 25 */   public static final DecoderResult UNFINISHED = new DecoderResult((Throwable)SIGNAL_UNFINISHED);
/* 26 */   public static final DecoderResult SUCCESS = new DecoderResult((Throwable)SIGNAL_SUCCESS);
/*    */   
/*    */   public static DecoderResult failure(Throwable cause) {
/* 29 */     if (cause == null) {
/* 30 */       throw new NullPointerException("cause");
/*    */     }
/* 32 */     return new DecoderResult(cause);
/*    */   }
/*    */   
/*    */   private final Throwable cause;
/*    */   
/*    */   protected DecoderResult(Throwable cause) {
/* 38 */     if (cause == null) {
/* 39 */       throw new NullPointerException("cause");
/*    */     }
/* 41 */     this.cause = cause;
/*    */   }
/*    */   
/*    */   public boolean isFinished() {
/* 45 */     return (this.cause != SIGNAL_UNFINISHED);
/*    */   }
/*    */   
/*    */   public boolean isSuccess() {
/* 49 */     return (this.cause == SIGNAL_SUCCESS);
/*    */   }
/*    */   
/*    */   public boolean isFailure() {
/* 53 */     return (this.cause != SIGNAL_SUCCESS && this.cause != SIGNAL_UNFINISHED);
/*    */   }
/*    */   
/*    */   public Throwable cause() {
/* 57 */     if (isFailure()) {
/* 58 */       return this.cause;
/*    */     }
/* 60 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     if (isFinished()) {
/* 67 */       if (isSuccess()) {
/* 68 */         return "success";
/*    */       }
/*    */       
/* 71 */       String cause = cause().toString();
/* 72 */       return (new StringBuilder(cause.length() + 17))
/* 73 */         .append("failure(")
/* 74 */         .append(cause)
/* 75 */         .append(')')
/* 76 */         .toString();
/*    */     } 
/* 78 */     return "unfinished";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\DecoderResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */