/*    */ package com.mojang.brigadier.builder;
/*    */ 
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*    */ 
/*    */ public class LiteralArgumentBuilder<S> extends ArgumentBuilder<S, LiteralArgumentBuilder<S>> {
/*    */   private final String literal;
/*    */   
/*    */   protected LiteralArgumentBuilder(String literal) {
/* 10 */     this.literal = literal;
/*    */   }
/*    */   
/*    */   public static <S> LiteralArgumentBuilder<S> literal(String name) {
/* 14 */     return new LiteralArgumentBuilder<>(name);
/*    */   }
/*    */ 
/*    */   
/*    */   protected LiteralArgumentBuilder<S> getThis() {
/* 19 */     return this;
/*    */   }
/*    */   
/*    */   public String getLiteral() {
/* 23 */     return this.literal;
/*    */   }
/*    */ 
/*    */   
/*    */   public LiteralCommandNode<S> build() {
/* 28 */     LiteralCommandNode<S> result = new LiteralCommandNode(getLiteral(), getCommand(), getRequirement(), getRedirect(), getRedirectModifier(), isFork());
/*    */     
/* 30 */     for (CommandNode<S> argument : getArguments()) {
/* 31 */       result.addChild(argument);
/*    */     }
/*    */     
/* 34 */     return result;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\builder\LiteralArgumentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */