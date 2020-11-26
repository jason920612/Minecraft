/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToMessageDecoder;
/*    */ import java.util.List;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ public class hs
/*    */   extends MessageToMessageDecoder<ByteBuf>
/*    */ {
/*    */   private final hr a;
/*    */   
/*    */   public hs(Cipher ☃) {
/* 14 */     this.a = new hr(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 19 */     list.add(this.a.a(☃, byteBuf));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\hs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */