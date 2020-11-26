/*    */ package com.mojang.authlib.yggdrasil.request;
/*    */ 
/*    */ import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
/*    */ 
/*    */ public class InvalidateRequest {
/*    */   private String accessToken;
/*    */   private String clientToken;
/*    */   
/*    */   public InvalidateRequest(YggdrasilUserAuthentication authenticationService) {
/* 10 */     this.accessToken = authenticationService.getAuthenticatedToken();
/* 11 */     this.clientToken = authenticationService.getAuthenticationService().getClientToken();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\yggdrasil\request\InvalidateRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */