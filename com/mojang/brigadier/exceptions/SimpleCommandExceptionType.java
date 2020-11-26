/*    */ package com.mojang.brigadier.exceptions;
/*    */ 
/*    */ import com.mojang.brigadier.ImmutableStringReader;
/*    */ import com.mojang.brigadier.Message;
/*    */ 
/*    */ public class SimpleCommandExceptionType implements CommandExceptionType {
/*    */   private final Message message;
/*    */   
/*    */   public SimpleCommandExceptionType(Message message) {
/* 10 */     this.message = message;
/*    */   }
/*    */   
/*    */   public CommandSyntaxException create() {
/* 14 */     return new CommandSyntaxException(this, this.message);
/*    */   }
/*    */   
/*    */   public CommandSyntaxException createWithContext(ImmutableStringReader reader) {
/* 18 */     return new CommandSyntaxException(this, this.message, reader.getString(), reader.getCursor());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 23 */     return this.message.getString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\SimpleCommandExceptionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */