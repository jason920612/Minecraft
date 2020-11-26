/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.MarkerManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ia
/*    */   extends MessageToByteEncoder<iv<?>>
/*    */ {
/* 16 */   private static final Logger a = LogManager.getLogger();
/* 17 */   private static final Marker b = MarkerManager.getMarker("PACKET_SENT", hw.b);
/*    */   
/*    */   private final iw c;
/*    */   
/*    */   public ia(iw ☃) {
/* 22 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, iv<?> iv1, ByteBuf byteBuf) throws Exception {
/* 27 */     hx hx = (hx)☃.channel().attr(hw.c).get();
/* 28 */     if (hx == null) {
/* 29 */       throw new RuntimeException("ConnectionProtocol unknown: " + iv1);
/*    */     }
/* 31 */     Integer integer = hx.a(this.c, iv1);
/*    */ 
/*    */     
/* 34 */     if (a.isDebugEnabled()) {
/* 35 */       a.debug(b, "OUT: [{}:{}] {}", ☃.channel().attr(hw.c).get(), integer, iv1.getClass().getName());
/*    */     }
/*    */     
/* 38 */     if (integer == null) {
/* 39 */       throw new IOException("Can't serialize unregistered packet");
/*    */     }
/*    */     
/* 42 */     hy hy = new hy(byteBuf);
/* 43 */     hy.d(integer.intValue());
/*    */     
/*    */     try {
/* 46 */       iv1.b(hy);
/* 47 */     } catch (Throwable throwable) {
/* 48 */       a.error(throwable);
/* 49 */       if (iv1.a()) {
/* 50 */         throw new ic(throwable);
/*    */       }
/* 52 */       throw throwable;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */