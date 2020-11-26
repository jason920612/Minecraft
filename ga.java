/*    */ import com.mojang.authlib.GameProfileRepository;
/*    */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*    */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.net.Proxy;
/*    */ import java.util.UUID;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ga
/*    */   implements fq
/*    */ {
/*    */   private final fp b;
/*    */   
/*    */   public ga(fp ☃) {
/* 23 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 28 */     YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString());
/* 29 */     MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
/* 30 */     GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
/* 31 */     File file = new File(this.b.b().toFile(), "tmp");
/* 32 */     vl vl = new vl(gameProfileRepository, new File(file, MinecraftServer.a.getName()));
/* 33 */     MinecraftServer minecraftServer = new so(file, xz.a(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, vl);
/* 34 */     minecraftServer.aI().a(this.b.b().resolve("reports/commands.json").toFile());
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 39 */     return "Command Syntax";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */