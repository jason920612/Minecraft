/*    */ package io.netty.handler.codec.socks;
/*    */ 
/*    */ import io.netty.buffer.ByteBuf;
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
/*    */ public final class UnknownSocksRequest
/*    */   extends SocksRequest
/*    */ {
/*    */   public UnknownSocksRequest() {
/* 30 */     super(SocksRequestType.UNKNOWN);
/*    */   }
/*    */   
/*    */   public void encodeAsByteBuf(ByteBuf byteBuf) {}
/*    */ }


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\socks\UnknownSocksRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */