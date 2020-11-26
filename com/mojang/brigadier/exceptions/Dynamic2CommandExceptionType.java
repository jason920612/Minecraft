/*    */ package com.mojang.brigadier.exceptions;
/*    */ 
/*    */ import com.mojang.brigadier.ImmutableStringReader;
/*    */ import com.mojang.brigadier.Message;
/*    */ 
/*    */ public class Dynamic2CommandExceptionType implements CommandExceptionType {
/*    */   private final Function function;
/*    */   
/*    */   public Dynamic2CommandExceptionType(Function function) {
/* 10 */     this.function = function;
/*    */   }
/*    */   
/*    */   public CommandSyntaxException create(Object a, Object b) {
/* 14 */     return new CommandSyntaxException(this, this.function.apply(a, b));
/*    */   }
/*    */   
/*    */   public CommandSyntaxException createWithContext(ImmutableStringReader reader, Object a, Object b) {
/* 18 */     return new CommandSyntaxException(this, this.function.apply(a, b), reader.getString(), reader.getCursor());
/*    */   }
/*    */   
/*    */   public static interface Function {
/*    */     Message apply(Object param1Object1, Object param1Object2);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\Dynamic2CommandExceptionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */