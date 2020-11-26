/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.bootstrap.ServerBootstrap;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelException;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelInitializer;
/*     */ import io.netty.channel.ChannelOption;
/*     */ import io.netty.channel.EventLoopGroup;
/*     */ import io.netty.channel.epoll.Epoll;
/*     */ import io.netty.channel.epoll.EpollEventLoopGroup;
/*     */ import io.netty.channel.epoll.EpollServerSocketChannel;
/*     */ import io.netty.channel.nio.NioEventLoopGroup;
/*     */ import io.netty.channel.socket.nio.NioServerSocketChannel;
/*     */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class ub
/*     */ {
/*  53 */   private static final Logger d = LogManager.getLogger();
/*  54 */   public static final xn<NioEventLoopGroup> a = new xn<>(() -> new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Server IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*  57 */   public static final xn<EpollEventLoopGroup> b = new xn<>(() -> new EpollEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build()));
/*     */   
/*     */   private final MinecraftServer e;
/*     */   
/*     */   public volatile boolean c;
/*     */   
/*  63 */   private final List<ChannelFuture> f = Collections.synchronizedList(Lists.newArrayList());
/*  64 */   private final List<hw> g = Collections.synchronizedList(Lists.newArrayList());
/*     */   
/*     */   public ub(MinecraftServer ☃) {
/*  67 */     this.e = ☃;
/*  68 */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(@Nullable InetAddress ☃, int i) throws IOException {
/*  72 */     synchronized (this.f) {
/*     */       Class<NioServerSocketChannel> clazz;
/*     */       xn<NioEventLoopGroup> xn1;
/*  75 */       if (Epoll.isAvailable() && this.e.V()) {
/*  76 */         Class<EpollServerSocketChannel> clazz1 = EpollServerSocketChannel.class;
/*  77 */         xn<EpollEventLoopGroup> xn2 = b;
/*  78 */         d.info("Using epoll channel type");
/*     */       } else {
/*  80 */         clazz = NioServerSocketChannel.class;
/*  81 */         xn1 = a;
/*  82 */         d.info("Using default channel type");
/*     */       } 
/*     */       
/*  85 */       this.f.add(((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap())
/*  86 */           .channel(clazz))
/*  87 */           .childHandler((ChannelHandler)new ChannelInitializer<Channel>(this)
/*     */             {
/*     */               protected void initChannel(Channel ☃) throws Exception {
/*     */                 try {
/*  91 */                   ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
/*  92 */                 } catch (ChannelException channelException) {}
/*     */ 
/*     */                 
/*  95 */                 ☃.pipeline()
/*  96 */                   .addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30))
/*  97 */                   .addLast("legacy_query", (ChannelHandler)new tz(this.a))
/*     */                   
/*  99 */                   .addLast("splitter", (ChannelHandler)new id())
/* 100 */                   .addLast("decoder", (ChannelHandler)new hz(iw.a))
/*     */                   
/* 102 */                   .addLast("prepender", (ChannelHandler)new ie())
/* 103 */                   .addLast("encoder", (ChannelHandler)new ia(iw.b));
/*     */                 
/* 105 */                 hw hw = new hw(iw.a);
/* 106 */                 ub.a(this.a).add(hw);
/* 107 */                 ☃.pipeline().addLast("packet_handler", (ChannelHandler)hw);
/* 108 */                 hw.a(new ud(ub.b(this.a), hw));
/*     */               }
/* 111 */             }).group((EventLoopGroup)xn1.a())
/* 112 */           .localAddress(☃, i))
/* 113 */           .bind()
/* 114 */           .syncUninterruptibly());
/*     */     } 
/*     */   }
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
/*     */   public void b() {
/* 148 */     this.c = false;
/*     */     
/* 150 */     for (ChannelFuture ☃ : this.f) {
/*     */       try {
/* 152 */         ☃.channel().close().sync();
/* 153 */       } catch (InterruptedException interruptedException) {
/* 154 */         d.error("Interrupted whilst closing channel");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c() {
/* 160 */     synchronized (this.g) {
/* 161 */       Iterator<hw> ☃ = this.g.iterator();
/*     */       
/* 163 */       while (☃.hasNext()) {
/* 164 */         hw hw = ☃.next();
/*     */         
/* 166 */         if (hw.h()) {
/*     */           continue;
/*     */         }
/* 169 */         if (hw.g()) {
/*     */           try {
/* 171 */             hw.a();
/* 172 */           } catch (Exception exception) {
/* 173 */             if (hw.c()) {
/* 174 */               b b = b.a(exception, "Ticking memory connection");
/* 175 */               c c = b.a("Ticking connection");
/*     */               
/* 177 */               c.a("Connection", hw::toString);
/*     */               
/* 179 */               throw new h(b);
/*     */             } 
/* 181 */             d.warn("Failed to handle packet for {}", hw.b(), exception);
/* 182 */             ij ij = new iq("Internal server error");
/* 183 */             hw.a(new ka(ij), future -> ☃.a(ij1));
/* 184 */             hw.k();
/*     */           } 
/*     */           continue;
/*     */         } 
/* 188 */         ☃.remove();
/* 189 */         hw.l();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public MinecraftServer d() {
/* 196 */     return this.e;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar\\ub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */