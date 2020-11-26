/*     */ import com.google.common.collect.Queues;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.ChannelFutureListener;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.channel.DefaultEventLoopGroup;
/*     */ import io.netty.channel.SimpleChannelInboundHandler;
/*     */ import io.netty.channel.epoll.EpollEventLoopGroup;
/*     */ import io.netty.channel.nio.NioEventLoopGroup;
/*     */ import io.netty.util.AttributeKey;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.Queue;
/*     */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.crypto.SecretKey;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import org.apache.logging.log4j.MarkerManager;
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
/*     */ public class hw
/*     */   extends SimpleChannelInboundHandler<iv<?>>
/*     */ {
/*  56 */   private static final Logger g = LogManager.getLogger();
/*  57 */   public static final Marker a = MarkerManager.getMarker("NETWORK");
/*     */   
/*  59 */   public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
/*  60 */   public static final AttributeKey<hx> c = AttributeKey.valueOf("protocol");
/*  61 */   public static final xn<NioEventLoopGroup> d = new xn<>(() -> new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*  64 */   public static final xn<EpollEventLoopGroup> e = new xn<>(() -> new EpollEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*  67 */   public static final xn<DefaultEventLoopGroup> f = new xn<>(() -> new DefaultEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Local Client IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*     */   private final iw h;
/*     */   
/*  72 */   private final Queue<a> i = Queues.newConcurrentLinkedQueue();
/*  73 */   private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
/*     */   private Channel k;
/*     */   private SocketAddress l;
/*     */   private ib m;
/*     */   private ij n;
/*     */   private boolean o;
/*     */   private boolean p;
/*     */   private int q;
/*     */   private int r;
/*     */   private float s;
/*     */   private float t;
/*     */   private int u;
/*     */   private boolean v;
/*     */   
/*     */   public hw(iw ☃) {
/*  88 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void channelActive(ChannelHandlerContext ☃) throws Exception {
/*  93 */     super.channelActive(☃);
/*  94 */     this.k = ☃.channel();
/*  95 */     this.l = this.k.remoteAddress();
/*     */     try {
/*  97 */       a(hx.a);
/*  98 */     } catch (Throwable throwable) {
/*  99 */       g.fatal(throwable);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(hx ☃) {
/* 104 */     this.k.attr(c).set(☃);
/* 105 */     this.k.config().setAutoRead(true);
/* 106 */     g.debug("Enabled auto read");
/*     */   }
/*     */ 
/*     */   
/*     */   public void channelInactive(ChannelHandlerContext ☃) throws Exception {
/* 111 */     a(new ir("disconnect.endOfStream", new Object[0]));
/*     */   }
/*     */ 
/*     */   
/*     */   public void exceptionCaught(ChannelHandlerContext ☃, Throwable throwable) {
/* 116 */     if (throwable instanceof ic) {
/* 117 */       g.debug("Skipping packet due to errors", throwable.getCause());
/*     */       
/*     */       return;
/*     */     } 
/* 121 */     boolean bool = !this.v;
/* 122 */     this.v = true;
/*     */     
/* 124 */     if (!this.k.isOpen()) {
/*     */       return;
/*     */     }
/*     */     
/* 128 */     if (throwable instanceof io.netty.handler.timeout.TimeoutException) {
/* 129 */       g.debug("Timeout", throwable);
/* 130 */       a(new ir("disconnect.timeout", new Object[0]));
/*     */     } else {
/* 132 */       ij ij1 = new ir("disconnect.genericReason", new Object[] { "Internal Exception: " + throwable });
/*     */       
/* 134 */       if (bool) {
/* 135 */         g.debug("Failed to sent packet", throwable);
/* 136 */         a(new ka(ij1), future -> a(☃));
/* 137 */         k();
/*     */       } else {
/* 139 */         g.debug("Double fault", throwable);
/* 140 */         a(ij1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ChannelHandlerContext ☃, iv<?> iv1) throws Exception {
/* 147 */     if (this.k.isOpen()) {
/*     */       try {
/* 149 */         a(iv1, this.m);
/* 150 */       } catch (pn pn) {}
/*     */       
/* 152 */       this.q++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends ib> void a(iv<T> ☃, ib ib1) {
/* 158 */     ☃.a((T)ib1);
/*     */   }
/*     */   
/*     */   public void a(ib ☃) {
/* 162 */     Validate.notNull(☃, "packetListener", new Object[0]);
/* 163 */     g.debug("Set listener of {} to {}", this, ☃);
/* 164 */     this.m = ☃;
/*     */   }
/*     */   
/*     */   public void a(iv<?> ☃) {
/* 168 */     a(☃, (GenericFutureListener<? extends Future<? super Void>>)null);
/*     */   }
/*     */   
/*     */   public void a(iv<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 172 */     if (g()) {
/* 173 */       o();
/* 174 */       b(☃, genericFutureListener);
/*     */     } else {
/* 176 */       this.j.writeLock().lock();
/*     */       try {
/* 178 */         this.i.add(new a(☃, genericFutureListener));
/*     */       } finally {
/* 180 */         this.j.writeLock().unlock();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(iv<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 186 */     hx hx1 = hx.a(☃);
/* 187 */     hx hx2 = (hx)this.k.attr(c).get();
/* 188 */     this.r++;
/*     */     
/* 190 */     if (hx2 != hx1) {
/* 191 */       g.debug("Disabled auto read");
/* 192 */       this.k.config().setAutoRead(false);
/*     */     } 
/*     */     
/* 195 */     if (this.k.eventLoop().inEventLoop()) {
/* 196 */       if (hx1 != hx2) {
/* 197 */         a(hx1);
/*     */       }
/* 199 */       ChannelFuture channelFuture = this.k.writeAndFlush(☃);
/* 200 */       if (genericFutureListener != null) {
/* 201 */         channelFuture.addListener(genericFutureListener);
/*     */       }
/* 203 */       channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/*     */     } else {
/* 205 */       this.k.eventLoop().execute(() -> {
/*     */             if (☃ != hx1) {
/*     */               a(☃);
/*     */             }
/*     */             ChannelFuture channelFuture = this.k.writeAndFlush(iv1);
/*     */             if (genericFutureListener != null) {
/*     */               channelFuture.addListener(genericFutureListener);
/*     */             }
/*     */             channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   private void o() {
/* 219 */     if (this.k == null || !this.k.isOpen()) {
/*     */       return;
/*     */     }
/*     */     
/* 223 */     this.j.readLock().lock();
/*     */     try {
/* 225 */       while (!this.i.isEmpty()) {
/* 226 */         a ☃ = this.i.poll();
/* 227 */         b(a.a(☃), a.b(☃));
/*     */       } 
/*     */     } finally {
/* 230 */       this.j.readLock().unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/* 235 */     o();
/*     */     
/* 237 */     if (this.m instanceof pt) {
/* 238 */       ((pt)this.m).Y_();
/*     */     }
/*     */     
/* 241 */     if (this.k != null) {
/* 242 */       this.k.flush();
/*     */     }
/*     */     
/* 245 */     if (this.u++ % 20 == 0) {
/* 246 */       this.t = this.t * 0.75F + this.r * 0.25F;
/* 247 */       this.s = this.s * 0.75F + this.q * 0.25F;
/* 248 */       this.r = 0;
/* 249 */       this.q = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public SocketAddress b() {
/* 254 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(ij ☃) {
/* 258 */     if (this.k.isOpen()) {
/* 259 */       this.k.close().awaitUninterruptibly();
/*     */       
/* 261 */       this.n = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 266 */     return (this.k instanceof io.netty.channel.local.LocalChannel || this.k instanceof io.netty.channel.local.LocalServerChannel);
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
/*     */   public void a(SecretKey ☃) {
/* 332 */     this.o = true;
/* 333 */     this.k.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new hs(xh.a(2, ☃)));
/* 334 */     this.k.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new ht(xh.a(1, ☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 342 */     return (this.k != null && this.k.isOpen());
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 346 */     return (this.k == null);
/*     */   }
/*     */   
/*     */   public ib i() {
/* 350 */     return this.m;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ij j() {
/* 355 */     return this.n;
/*     */   }
/*     */   
/*     */   public void k() {
/* 359 */     this.k.config().setAutoRead(false);
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 363 */     if (☃ >= 0) {
/* 364 */       if (this.k.pipeline().get("decompress") instanceof hu) {
/* 365 */         ((hu)this.k.pipeline().get("decompress")).a(☃);
/*     */       } else {
/* 367 */         this.k.pipeline().addBefore("decoder", "decompress", (ChannelHandler)new hu(☃));
/*     */       } 
/*     */       
/* 370 */       if (this.k.pipeline().get("compress") instanceof hv) {
/* 371 */         ((hv)this.k.pipeline().get("compress")).a(☃);
/*     */       } else {
/* 373 */         this.k.pipeline().addBefore("encoder", "compress", (ChannelHandler)new hv(☃));
/*     */       } 
/*     */     } else {
/* 376 */       if (this.k.pipeline().get("decompress") instanceof hu) {
/* 377 */         this.k.pipeline().remove("decompress");
/*     */       }
/*     */       
/* 380 */       if (this.k.pipeline().get("compress") instanceof hv) {
/* 381 */         this.k.pipeline().remove("compress");
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void l() {
/* 387 */     if (this.k == null || this.k.isOpen()) {
/*     */       return;
/*     */     }
/*     */     
/* 391 */     if (this.p) {
/* 392 */       g.warn("handleDisconnection() called twice");
/*     */     } else {
/* 394 */       this.p = true;
/* 395 */       if (j() != null) {
/* 396 */         i().a(j());
/* 397 */       } else if (i() != null) {
/* 398 */         i().a(new ir("multiplayer.disconnect.generic", new Object[0]));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final iv<?> a;
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     private final GenericFutureListener<? extends Future<? super Void>> b;
/*     */ 
/*     */ 
/*     */     
/*     */     public a(iv<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 417 */       this.a = ☃;
/* 418 */       this.b = genericFutureListener;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */