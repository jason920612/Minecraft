/*    */ package com.mojang.authlib.yggdrasil;
/*    */ 
/*    */ public class ProfileIncompleteException
/*    */   extends RuntimeException {
/*    */   public ProfileIncompleteException() {}
/*    */   
/*    */   public ProfileIncompleteException(String message) {
/*  8 */     super(message);
/*    */   }
/*    */   
/*    */   public ProfileIncompleteException(String message, Throwable cause) {
/* 12 */     super(message, cause);
/*    */   }
/*    */   
/*    */   public ProfileIncompleteException(Throwable cause) {
/* 16 */     super(cause);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\yggdrasil\ProfileIncompleteException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */