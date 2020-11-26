/*    */ package com.mojang.authlib.legacy;
/*    */ 
/*    */ import com.mojang.authlib.AuthenticationService;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.HttpAuthenticationService;
/*    */ import com.mojang.authlib.exceptions.AuthenticationException;
/*    */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*    */ import com.mojang.authlib.minecraft.HttpMinecraftSessionService;
/*    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.URL;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class LegacyMinecraftSessionService
/*    */   extends HttpMinecraftSessionService
/*    */ {
/*    */   private static final String BASE_URL = "http://session.minecraft.net/game/";
/* 21 */   private static final URL JOIN_URL = HttpAuthenticationService.constantURL("http://session.minecraft.net/game/joinserver.jsp");
/* 22 */   private static final URL CHECK_URL = HttpAuthenticationService.constantURL("http://session.minecraft.net/game/checkserver.jsp");
/*    */   
/*    */   protected LegacyMinecraftSessionService(LegacyAuthenticationService authenticationService) {
/* 25 */     super(authenticationService);
/*    */   }
/*    */ 
/*    */   
/*    */   public void joinServer(GameProfile profile, String authenticationToken, String serverId) throws AuthenticationException {
/* 30 */     Map<String, Object> arguments = new HashMap<>();
/*    */     
/* 32 */     arguments.put("user", profile.getName());
/* 33 */     arguments.put("sessionId", authenticationToken);
/* 34 */     arguments.put("serverId", serverId);
/*    */     
/* 36 */     URL url = HttpAuthenticationService.concatenateURL(JOIN_URL, HttpAuthenticationService.buildQuery(arguments));
/*    */     
/*    */     try {
/* 39 */       String response = getAuthenticationService().performGetRequest(url);
/*    */       
/* 41 */       if (!"OK".equals(response)) {
/* 42 */         throw new AuthenticationException(response);
/*    */       }
/* 44 */     } catch (IOException e) {
/* 45 */       throw new AuthenticationUnavailableException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public GameProfile hasJoinedServer(GameProfile user, String serverId, InetAddress address) throws AuthenticationUnavailableException {
/* 51 */     Map<String, Object> arguments = new HashMap<>();
/*    */     
/* 53 */     arguments.put("user", user.getName());
/* 54 */     arguments.put("serverId", serverId);
/*    */     
/* 56 */     URL url = HttpAuthenticationService.concatenateURL(CHECK_URL, HttpAuthenticationService.buildQuery(arguments));
/*    */     
/*    */     try {
/* 59 */       String response = getAuthenticationService().performGetRequest(url);
/*    */       
/* 61 */       return "YES".equals(response) ? user : null;
/* 62 */     } catch (IOException e) {
/* 63 */       throw new AuthenticationUnavailableException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> getTextures(GameProfile profile, boolean requireSecure) {
/* 69 */     return new HashMap<>();
/*    */   }
/*    */ 
/*    */   
/*    */   public GameProfile fillProfileProperties(GameProfile profile, boolean requireSecure) {
/* 74 */     return profile;
/*    */   }
/*    */ 
/*    */   
/*    */   public LegacyAuthenticationService getAuthenticationService() {
/* 79 */     return (LegacyAuthenticationService)super.getAuthenticationService();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\legacy\LegacyMinecraftSessionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */