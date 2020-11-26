/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.MarkerManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hz
/*    */   extends ByteToMessageDecoder
/*    */ {
/* 17 */   private static final Logger a = LogManager.getLogger();
/* 18 */   private static final Marker b = MarkerManager.getMarker("PACKET_RECEIVED", hw.b);
/*    */   
/*    */   private final iw c;
/*    */   
/*    */   public hz(iw ☃) {
/* 23 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void decode(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 28 */     if (byteBuf.readableBytes() == 0) {
/*    */       return;
/*    */     }
/*    */     
/* 32 */     hy hy = new hy(byteBuf);
/* 33 */     int i = hy.g();
/* 34 */     iv<?> iv = ((hx)☃.channel().attr(hw.c).get()).a(this.c, i);
/*    */     
/* 36 */     if (iv == null) {
/* 37 */       throw new IOException("Bad packet id " + i);
/*    */     }
/*    */     
/* 40 */     iv.a(hy);
/* 41 */     if (hy.readableBytes() > 0) {
/* 42 */       throw new IOException("Packet " + ((hx)☃.channel().attr(hw.c).get()).a() + "/" + i + " (" + iv.getClass().getSimpleName() + ") was larger than I expected, found " + hy.readableBytes() + " bytes extra whilst reading packet " + i);
/*    */     }
/* 44 */     list.add(iv);
/*    */ 
/*    */     
/* 47 */     if (a.isDebugEnabled())
/* 48 */       a.debug(b, " IN: [{}:{}] {}", ☃.channel().attr(hw.c).get(), Integer.valueOf(i), iv.getClass().getName()); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\hz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */