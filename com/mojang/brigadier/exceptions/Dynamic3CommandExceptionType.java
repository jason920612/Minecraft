/*    */ package com.mojang.brigadier.exceptions;
/*    */ 
/*    */ import com.mojang.brigadier.ImmutableStringReader;
/*    */ import com.mojang.brigadier.Message;
/*    */ 
/*    */ public class Dynamic3CommandExceptionType implements CommandExceptionType {
/*    */   private final Function function;
/*    */   
/*    */   public Dynamic3CommandExceptionType(Function function) {
/* 10 */     this.function = function;
/*    */   }
/*    */   
/*    */   public CommandSyntaxException create(Object a, Object b, Object c) {
/* 14 */     return new CommandSyntaxException(this, this.function.apply(a, b, c));
/*    */   }
/*    */   
/*    */   public CommandSyntaxException createWithContext(ImmutableStringReader reader, Object a, Object b, Object c) {
/* 18 */     return new CommandSyntaxException(this, this.function.apply(a, b, c), reader.getString(), reader.getCursor());
/*    */   }
/*    */   
/*    */   public static interface Function {
/*    */     Message apply(Object param1Object1, Object param1Object2, Object param1Object3);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\Dynamic3CommandExceptionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */