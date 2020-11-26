/*    */ package com.mojang.brigadier;
/*    */ 
/*    */ public class LiteralMessage implements Message {
/*    */   private final String string;
/*    */   
/*    */   public LiteralMessage(String string) {
/*  7 */     this.string = string;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getString() {
/* 12 */     return this.string;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 17 */     return this.string;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\LiteralMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */