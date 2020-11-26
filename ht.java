/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ public class ht
/*    */   extends MessageToByteEncoder<ByteBuf>
/*    */ {
/*    */   private final hr a;
/*    */   
/*    */   public ht(Cipher ☃) {
/* 13 */     this.a = new hr(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf1, ByteBuf byteBuf2) throws Exception {
/* 18 */     this.a.a(byteBuf1, byteBuf2);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */