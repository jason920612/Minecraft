/*    */ package com.mojang.brigadier.builder;
/*    */ 
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.tree.ArgumentCommandNode;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ 
/*    */ public class RequiredArgumentBuilder<S, T> extends ArgumentBuilder<S, RequiredArgumentBuilder<S, T>> {
/*    */   private final String name;
/*    */   private final ArgumentType<T> type;
/* 11 */   private SuggestionProvider<S> suggestionsProvider = null;
/*    */   
/*    */   private RequiredArgumentBuilder(String name, ArgumentType<T> type) {
/* 14 */     this.name = name;
/* 15 */     this.type = type;
/*    */   }
/*    */   
/*    */   public static <S, T> RequiredArgumentBuilder<S, T> argument(String name, ArgumentType<T> type) {
/* 19 */     return new RequiredArgumentBuilder<>(name, type);
/*    */   }
/*    */   
/*    */   public RequiredArgumentBuilder<S, T> suggests(SuggestionProvider<S> provider) {
/* 23 */     this.suggestionsProvider = provider;
/* 24 */     return getThis();
/*    */   }
/*    */   
/*    */   public SuggestionProvider<S> getSuggestionsProvider() {
/* 28 */     return this.suggestionsProvider;
/*    */   }
/*    */ 
/*    */   
/*    */   protected RequiredArgumentBuilder<S, T> getThis() {
/* 33 */     return this;
/*    */   }
/*    */   
/*    */   public ArgumentType<T> getType() {
/* 37 */     return this.type;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 41 */     return this.name;
/*    */   }
/*    */   
/*    */   public ArgumentCommandNode<S, T> build() {
/* 45 */     ArgumentCommandNode<S, T> result = new ArgumentCommandNode(getName(), getType(), getCommand(), getRequirement(), getRedirect(), getRedirectModifier(), isFork(), getSuggestionsProvider());
/*    */     
/* 47 */     for (CommandNode<S> argument : getArguments()) {
/* 48 */       result.addChild(argument);
/*    */     }
/*    */     
/* 51 */     return result;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\builder\RequiredArgumentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */