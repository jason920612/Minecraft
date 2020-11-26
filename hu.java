/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.buffer.Unpooled;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
/*    */ import io.netty.handler.codec.DecoderException;
/*    */ import java.util.List;
/*    */ import java.util.zip.Inflater;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hu
/*    */   extends ByteToMessageDecoder
/*    */ {
/*    */   private final Inflater a;
/*    */   private int b;
/*    */   
/*    */   public hu(int ☃) {
/* 19 */     this.b = ☃;
/* 20 */     this.a = new Inflater();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void decode(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 25 */     if (byteBuf.readableBytes() == 0) {
/*    */       return;
/*    */     }
/*    */     
/* 29 */     hy hy = new hy(byteBuf);
/* 30 */     int i = hy.g();
/*    */     
/* 32 */     if (i == 0)
/* 33 */     { list.add(hy.readBytes(hy.readableBytes())); }
/* 34 */     else { if (i < this.b)
/* 35 */         throw new DecoderException("Badly compressed packet - size of " + i + " is below server threshold of " + this.b); 
/* 36 */       if (i > 2097152) {
/* 37 */         throw new DecoderException("Badly compressed packet - size of " + i + " is larger than protocol maximum of " + 2097152);
/*    */       }
/* 39 */       byte[] arrayOfByte1 = new byte[hy.readableBytes()];
/* 40 */       hy.readBytes(arrayOfByte1);
/* 41 */       this.a.setInput(arrayOfByte1);
/*    */       
/* 43 */       byte[] arrayOfByte2 = new byte[i];
/* 44 */       this.a.inflate(arrayOfByte2);
/* 45 */       list.add(Unpooled.wrappedBuffer(arrayOfByte2));
/*    */       
/* 47 */       this.a.reset(); }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(int ☃) {
/* 56 */     this.b = ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\hu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */