/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelException;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelInitializer;
/*     */ import io.netty.channel.ChannelOption;
/*     */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends ChannelInitializer<Channel>
/*     */ {
/*     */   null(ub ☃) {}
/*     */   
/*     */   protected void initChannel(Channel ☃) throws Exception {
/*     */     try {
/*  91 */       ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
/*  92 */     } catch (ChannelException channelException) {}
/*     */ 
/*     */     
/*  95 */     ☃.pipeline()
/*  96 */       .addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30))
/*  97 */       .addLast("legacy_query", (ChannelHandler)new tz(this.a))
/*     */       
/*  99 */       .addLast("splitter", (ChannelHandler)new id())
/* 100 */       .addLast("decoder", (ChannelHandler)new hz(iw.a))
/*     */       
/* 102 */       .addLast("prepender", (ChannelHandler)new ie())
/* 103 */       .addLast("encoder", (ChannelHandler)new ia(iw.b));
/*     */     
/* 105 */     hw hw = new hw(iw.a);
/* 106 */     ub.a(this.a).add(hw);
/* 107 */     ☃.pipeline().addLast("packet_handler", (ChannelHandler)hw);
/* 108 */     hw.a(new ud(ub.b(this.a), hw));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar\\ub$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */