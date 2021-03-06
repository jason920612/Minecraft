/*    */ package com.mojang.brigadier.exceptions;
/*    */ 
/*    */ import com.mojang.brigadier.ImmutableStringReader;
/*    */ import com.mojang.brigadier.Message;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class DynamicCommandExceptionType
/*    */   implements CommandExceptionType {
/*    */   private final Function<Object, Message> function;
/*    */   
/*    */   public DynamicCommandExceptionType(Function<Object, Message> function) {
/* 12 */     this.function = function;
/*    */   }
/*    */   
/*    */   public CommandSyntaxException create(Object arg) {
/* 16 */     return new CommandSyntaxException(this, this.function.apply(arg));
/*    */   }
/*    */   
/*    */   public CommandSyntaxException createWithContext(ImmutableStringReader reader, Object arg) {
/* 20 */     return new CommandSyntaxException(this, this.function.apply(arg), reader.getString(), reader.getCursor());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\DynamicCommandExceptionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */