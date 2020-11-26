/*    */ package com.mojang.brigadier.exceptions;
/*    */ 
/*    */ import com.mojang.brigadier.Message;
/*    */ 
/*    */ public class CommandSyntaxException extends Exception {
/*    */   public static final int CONTEXT_AMOUNT = 10;
/*    */   public static boolean ENABLE_COMMAND_STACK_TRACES = true;
/*  8 */   public static BuiltInExceptionProvider BUILT_IN_EXCEPTIONS = new BuiltInExceptions();
/*    */   
/*    */   private final CommandExceptionType type;
/*    */   private final Message message;
/*    */   private final String input;
/*    */   private final int cursor;
/*    */   
/*    */   public CommandSyntaxException(CommandExceptionType type, Message message) {
/* 16 */     super(message.getString(), null, ENABLE_COMMAND_STACK_TRACES, ENABLE_COMMAND_STACK_TRACES);
/* 17 */     this.type = type;
/* 18 */     this.message = message;
/* 19 */     this.input = null;
/* 20 */     this.cursor = -1;
/*    */   }
/*    */   
/*    */   public CommandSyntaxException(CommandExceptionType type, Message message, String input, int cursor) {
/* 24 */     super(message.getString(), null, ENABLE_COMMAND_STACK_TRACES, ENABLE_COMMAND_STACK_TRACES);
/* 25 */     this.type = type;
/* 26 */     this.message = message;
/* 27 */     this.input = input;
/* 28 */     this.cursor = cursor;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMessage() {
/* 33 */     String message = this.message.getString();
/* 34 */     String context = getContext();
/* 35 */     if (context != null) {
/* 36 */       message = message + " at position " + this.cursor + ": " + context;
/*    */     }
/* 38 */     return message;
/*    */   }
/*    */   
/*    */   public Message getRawMessage() {
/* 42 */     return this.message;
/*    */   }
/*    */   
/*    */   public String getContext() {
/* 46 */     if (this.input == null || this.cursor < 0) {
/* 47 */       return null;
/*    */     }
/* 49 */     StringBuilder builder = new StringBuilder();
/* 50 */     int cursor = Math.min(this.input.length(), this.cursor);
/*    */     
/* 52 */     if (cursor > 10) {
/* 53 */       builder.append("...");
/*    */     }
/*    */     
/* 56 */     builder.append(this.input.substring(Math.max(0, cursor - 10), cursor));
/* 57 */     builder.append("<--[HERE]");
/*    */     
/* 59 */     return builder.toString();
/*    */   }
/*    */   
/*    */   public CommandExceptionType getType() {
/* 63 */     return this.type;
/*    */   }
/*    */   
/*    */   public String getInput() {
/* 67 */     return this.input;
/*    */   }
/*    */   
/*    */   public int getCursor() {
/* 71 */     return this.cursor;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\CommandSyntaxException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */