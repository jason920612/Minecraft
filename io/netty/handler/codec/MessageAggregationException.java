/*    */ package io.netty.handler.codec;
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
/*    */ public class MessageAggregationException
/*    */   extends IllegalStateException
/*    */ {
/*    */   private static final long serialVersionUID = -1995826182950310255L;
/*    */   
/*    */   public MessageAggregationException() {}
/*    */   
/*    */   public MessageAggregationException(String s) {
/* 29 */     super(s);
/*    */   }
/*    */   
/*    */   public MessageAggregationException(String message, Throwable cause) {
/* 33 */     super(message, cause);
/*    */   }
/*    */   
/*    */   public MessageAggregationException(Throwable cause) {
/* 37 */     super(cause);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\MessageAggregationException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */