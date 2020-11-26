/*    */ package com.mojang.brigadier;
/*    */ 
/*    */ import com.mojang.brigadier.context.CommandContextBuilder;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class ParseResults<S>
/*    */ {
/*    */   private final CommandContextBuilder<S> context;
/*    */   private final Map<CommandNode<S>, CommandSyntaxException> exceptions;
/*    */   private final int startIndex;
/*    */   private final ImmutableStringReader reader;
/*    */   
/*    */   public ParseResults(CommandContextBuilder<S> context, int startIndex, ImmutableStringReader reader, Map<CommandNode<S>, CommandSyntaxException> exceptions) {
/* 17 */     this.context = context;
/* 18 */     this.startIndex = startIndex;
/* 19 */     this.reader = reader;
/* 20 */     this.exceptions = exceptions;
/*    */   }
/*    */   
/*    */   public ParseResults(CommandContextBuilder<S> context) {
/* 24 */     this(context, 0, new StringReader(""), Collections.emptyMap());
/*    */   }
/*    */   
/*    */   public int getStartIndex() {
/* 28 */     return this.startIndex;
/*    */   }
/*    */   
/*    */   public CommandContextBuilder<S> getContext() {
/* 32 */     return this.context;
/*    */   }
/*    */   
/*    */   public ImmutableStringReader getReader() {
/* 36 */     return this.reader;
/*    */   }
/*    */   
/*    */   public Map<CommandNode<S>, CommandSyntaxException> getExceptions() {
/* 40 */     return this.exceptions;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\ParseResults.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */