/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.buffer.Unpooled;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
/*    */ import io.netty.handler.codec.CorruptedFrameException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class id
/*    */   extends ByteToMessageDecoder
/*    */ {
/*    */   protected void decode(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 14 */     byteBuf.markReaderIndex();
/*    */     
/* 16 */     byte[] arrayOfByte = new byte[3];
/* 17 */     for (int i = 0; i < arrayOfByte.length; i++) {
/* 18 */       if (!byteBuf.isReadable()) {
/* 19 */         byteBuf.resetReaderIndex();
/*    */         
/*    */         return;
/*    */       } 
/* 23 */       arrayOfByte[i] = byteBuf.readByte();
/* 24 */       if (arrayOfByte[i] >= 0) {
/* 25 */         hy hy = new hy(Unpooled.wrappedBuffer(arrayOfByte));
/*    */         try {
/* 27 */           int j = hy.g();
/*    */           
/* 29 */           if (byteBuf.readableBytes() < j) {
/* 30 */             byteBuf.resetReaderIndex();
/*    */             return;
/*    */           } 
/* 33 */           list.add(byteBuf.readBytes(j));
/*    */           
/*    */           return;
/*    */         } finally {
/* 37 */           hy.release();
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 42 */     throw new CorruptedFrameException("length wider than 21-bit");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\id.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */