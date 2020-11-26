/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import java.math.BigInteger;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.SocketAddress;
/*     */ import javax.annotation.Nullable;
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
/*     */   extends Thread
/*     */ {
/*     */   null(ue ☃, String str) {
/* 157 */     super(str);
/*     */   }
/*     */   public void run() {
/* 160 */     GameProfile ☃ = ue.a(this.a);
/*     */     
/*     */     try {
/* 163 */       String str = (new BigInteger(xh.a("", ue.b(this.a).E().getPublic(), ue.c(this.a)))).toString(16);
/* 164 */       ue.a(this.a, ue.b(this.a).ap().hasJoinedServer(new GameProfile(null, ☃.getName()), str, a()));
/*     */       
/* 166 */       if (ue.a(this.a) != null) {
/* 167 */         ue.d().info("UUID of player {} is {}", ue.a(this.a).getName(), ue.a(this.a).getId());
/* 168 */         ue.a(this.a, ue.a.e);
/* 169 */       } else if (ue.b(this.a).H()) {
/* 170 */         ue.d().warn("Failed to verify username but will let them in anyway!");
/* 171 */         ue.a(this.a, this.a.a(☃));
/* 172 */         ue.a(this.a, ue.a.e);
/*     */       } else {
/* 174 */         this.a.b(new ir("multiplayer.disconnect.unverified_username", new Object[0]));
/* 175 */         ue.d().error("Username '{}' tried to join with an invalid session", ☃.getName());
/*     */       } 
/* 177 */     } catch (AuthenticationUnavailableException authenticationUnavailableException) {
/* 178 */       if (ue.b(this.a).H()) {
/* 179 */         ue.d().warn("Authentication servers are down but will let them in anyway!");
/* 180 */         ue.a(this.a, this.a.a(☃));
/* 181 */         ue.a(this.a, ue.a.e);
/*     */       } else {
/* 183 */         this.a.b(new ir("multiplayer.disconnect.authservers_down", new Object[0]));
/* 184 */         ue.d().error("Couldn't verify username because servers are unavailable");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private InetAddress a() {
/* 191 */     SocketAddress ☃ = this.a.a.b();
/* 192 */     return (ue.b(this.a).S() && ☃ instanceof InetSocketAddress) ? ((InetSocketAddress)☃).getAddress() : null;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar\\ue$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */