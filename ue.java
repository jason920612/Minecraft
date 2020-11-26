/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.math.BigInteger;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.security.PrivateKey;
/*     */ import java.util.Arrays;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.crypto.SecretKey;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public class ue
/*     */   implements od, pt
/*     */ {
/*  41 */   private static final AtomicInteger b = new AtomicInteger(0);
/*  42 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  44 */   private static final Random d = new Random();
/*     */   
/*  46 */   private final byte[] e = new byte[4];
/*     */   private final MinecraftServer f;
/*     */   public final hw a;
/*  49 */   private a g = a.a;
/*     */   private int h;
/*     */   private GameProfile i;
/*  52 */   private final String j = "";
/*     */   private SecretKey k;
/*     */   private tf l;
/*     */   
/*     */   public ue(MinecraftServer ☃, hw hw1) {
/*  57 */     this.f = ☃;
/*  58 */     this.a = hw1;
/*  59 */     d.nextBytes(this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  64 */     if (this.g == a.e) {
/*  65 */       b();
/*  66 */     } else if (this.g == a.f) {
/*  67 */       tf ☃ = this.f.ac().a(this.i.getId());
/*  68 */       if (☃ == null) {
/*  69 */         this.g = a.e;
/*  70 */         this.f.ac().a(this.a, this.l);
/*  71 */         this.l = null;
/*     */       } 
/*     */     } 
/*  74 */     if (this.h++ == 600) {
/*  75 */       b(new ir("multiplayer.disconnect.slow_login", new Object[0]));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ij ☃) {
/*     */     try {
/*  86 */       c.info("Disconnecting {}: {}", c(), ☃.getString());
/*  87 */       this.a.a(new oc(☃));
/*  88 */       this.a.a(☃);
/*  89 */     } catch (Exception exception) {
/*  90 */       c.error("Error whilst disconnecting player", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/*  95 */     if (!this.i.isComplete()) {
/*  96 */       this.i = a(this.i);
/*     */     }
/*     */     
/*  99 */     ij ☃ = this.f.ac().a(this.a.b(), this.i);
/* 100 */     if (☃ != null) {
/* 101 */       b(☃);
/*     */     } else {
/* 103 */       this.g = a.g;
/* 104 */       if (this.f.aw() >= 0 && !this.a.c()) {
/* 105 */         this.a.a(new ob(this.f.aw()), (GenericFutureListener<? extends Future<? super Void>>)(☃ -> this.a.a(this.f.aw())));
/*     */       }
/* 107 */       this.a.a(new nz(this.i));
/* 108 */       tf tf1 = this.f.ac().a(this.i.getId());
/* 109 */       if (tf1 != null) {
/* 110 */         this.g = a.f;
/* 111 */         this.l = this.f.ac().g(this.i);
/*     */       } else {
/* 113 */         this.f.ac().a(this.a, this.f.ac().g(this.i));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ij ☃) {
/* 120 */     c.info("{} lost connection: {}", c(), ☃.getString());
/*     */   }
/*     */   
/*     */   public String c() {
/* 124 */     if (this.i != null) {
/* 125 */       return this.i + " (" + this.a.b() + ")";
/*     */     }
/* 127 */     return String.valueOf(this.a.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(of ☃) {
/* 132 */     Validate.validState((this.g == a.a), "Unexpected hello packet", new Object[0]);
/* 133 */     this.i = ☃.b();
/*     */     
/* 135 */     if (this.f.R() && !this.a.c()) {
/* 136 */       this.g = a.b;
/* 137 */       this.a.a(new oa("", this.f.E().getPublic(), this.e));
/*     */     } else {
/* 139 */       this.g = a.e;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(og ☃) {
/* 145 */     Validate.validState((this.g == a.b), "Unexpected key packet", new Object[0]);
/* 146 */     PrivateKey privateKey = this.f.E().getPrivate();
/*     */     
/* 148 */     if (!Arrays.equals(this.e, ☃.b(privateKey))) {
/* 149 */       throw new IllegalStateException("Invalid nonce!");
/*     */     }
/*     */     
/* 152 */     this.k = ☃.a(privateKey);
/* 153 */     this.g = a.c;
/*     */     
/* 155 */     this.a.a(this.k);
/*     */     
/* 157 */     Thread thread = new Thread(this, "User Authenticator #" + b.incrementAndGet())
/*     */       {
/*     */         public void run() {
/* 160 */           GameProfile ☃ = ue.a(this.a);
/*     */           
/*     */           try {
/* 163 */             String str = (new BigInteger(xh.a("", ue.b(this.a).E().getPublic(), ue.c(this.a)))).toString(16);
/* 164 */             ue.a(this.a, ue.b(this.a).ap().hasJoinedServer(new GameProfile(null, ☃.getName()), str, a()));
/*     */             
/* 166 */             if (ue.a(this.a) != null) {
/* 167 */               ue.d().info("UUID of player {} is {}", ue.a(this.a).getName(), ue.a(this.a).getId());
/* 168 */               ue.a(this.a, ue.a.e);
/* 169 */             } else if (ue.b(this.a).H()) {
/* 170 */               ue.d().warn("Failed to verify username but will let them in anyway!");
/* 171 */               ue.a(this.a, this.a.a(☃));
/* 172 */               ue.a(this.a, ue.a.e);
/*     */             } else {
/* 174 */               this.a.b(new ir("multiplayer.disconnect.unverified_username", new Object[0]));
/* 175 */               ue.d().error("Username '{}' tried to join with an invalid session", ☃.getName());
/*     */             } 
/* 177 */           } catch (AuthenticationUnavailableException authenticationUnavailableException) {
/* 178 */             if (ue.b(this.a).H()) {
/* 179 */               ue.d().warn("Authentication servers are down but will let them in anyway!");
/* 180 */               ue.a(this.a, this.a.a(☃));
/* 181 */               ue.a(this.a, ue.a.e);
/*     */             } else {
/* 183 */               this.a.b(new ir("multiplayer.disconnect.authservers_down", new Object[0]));
/* 184 */               ue.d().error("Couldn't verify username because servers are unavailable");
/*     */             } 
/*     */           } 
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         private InetAddress a() {
/* 191 */           SocketAddress ☃ = this.a.a.b();
/* 192 */           return (ue.b(this.a).S() && ☃ instanceof InetSocketAddress) ? ((InetSocketAddress)☃).getAddress() : null;
/*     */         }
/*     */       };
/* 195 */     thread.setUncaughtExceptionHandler(new e(c));
/* 196 */     thread.start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(oe ☃) {
/* 201 */     b(new ir("multiplayer.disconnect.unexpected_query_response", new Object[0]));
/*     */   }
/*     */   
/*     */   protected GameProfile a(GameProfile ☃) {
/* 205 */     UUID uUID = aog.c(☃.getName());
/* 206 */     return new GameProfile(uUID, ☃.getName());
/*     */   }
/*     */   
/*     */   enum a {
/* 210 */     a, b, c, d, e, f, g;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar\\ue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */