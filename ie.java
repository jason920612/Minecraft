/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandler.Sharable;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Sharable
/*    */ public class ie
/*    */   extends MessageToByteEncoder<ByteBuf>
/*    */ {
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf1, ByteBuf byteBuf2) throws Exception {
/* 14 */     int i = byteBuf1.readableBytes();
/* 15 */     int j = hy.a(i);
/*    */     
/* 17 */     if (j > 3) {
/* 18 */       throw new IllegalArgumentException("unable to fit " + i + " into " + '\003');
/*    */     }
/*    */     
/* 21 */     hy hy = new hy(byteBuf2);
/*    */     
/* 23 */     hy.ensureWritable(j + i);
/*    */     
/* 25 */     hy.d(i);
/* 26 */     hy.writeBytes(byteBuf1, byteBuf1.readerIndex(), i);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */