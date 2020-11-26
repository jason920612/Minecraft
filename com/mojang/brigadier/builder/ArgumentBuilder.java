/*    */ package com.mojang.brigadier.builder;
/*    */ import com.mojang.brigadier.Command;
/*    */ import com.mojang.brigadier.RedirectModifier;
/*    */ import com.mojang.brigadier.SingleRedirectModifier;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import com.mojang.brigadier.tree.RootCommandNode;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ public abstract class ArgumentBuilder<S, T extends ArgumentBuilder<S, T>> {
/* 14 */   private final RootCommandNode<S> arguments = new RootCommandNode();
/*    */   private Command<S> command;
/*    */   private Predicate<S> requirement = s -> true;
/*    */   private CommandNode<S> target;
/* 18 */   private RedirectModifier<S> modifier = null;
/*    */   
/*    */   private boolean forks;
/*    */ 
/*    */   
/*    */   public T then(ArgumentBuilder<S, ?> argument) {
/* 24 */     if (this.target != null) {
/* 25 */       throw new IllegalStateException("Cannot add children to a redirected node");
/*    */     }
/* 27 */     this.arguments.addChild(argument.build());
/* 28 */     return getThis();
/*    */   }
/*    */   
/*    */   public T then(CommandNode<S> argument) {
/* 32 */     if (this.target != null) {
/* 33 */       throw new IllegalStateException("Cannot add children to a redirected node");
/*    */     }
/* 35 */     this.arguments.addChild(argument);
/* 36 */     return getThis();
/*    */   }
/*    */   
/*    */   public Collection<CommandNode<S>> getArguments() {
/* 40 */     return this.arguments.getChildren();
/*    */   }
/*    */   
/*    */   public T executes(Command<S> command) {
/* 44 */     this.command = command;
/* 45 */     return getThis();
/*    */   }
/*    */   
/*    */   public Command<S> getCommand() {
/* 49 */     return this.command;
/*    */   }
/*    */   
/*    */   public T requires(Predicate<S> requirement) {
/* 53 */     this.requirement = requirement;
/* 54 */     return getThis();
/*    */   }
/*    */   
/*    */   public Predicate<S> getRequirement() {
/* 58 */     return this.requirement;
/*    */   }
/*    */   
/*    */   public T redirect(CommandNode<S> target) {
/* 62 */     return forward(target, null, false);
/*    */   }
/*    */   
/*    */   public T redirect(CommandNode<S> target, SingleRedirectModifier<S> modifier) {
/* 66 */     return forward(target, (modifier == null) ? null : (o -> Collections.singleton(modifier.apply(o))), false);
/*    */   }
/*    */   
/*    */   public T fork(CommandNode<S> target, RedirectModifier<S> modifier) {
/* 70 */     return forward(target, modifier, true);
/*    */   }
/*    */   
/*    */   public T forward(CommandNode<S> target, RedirectModifier<S> modifier, boolean fork) {
/* 74 */     if (!this.arguments.getChildren().isEmpty()) {
/* 75 */       throw new IllegalStateException("Cannot forward a node with children");
/*    */     }
/* 77 */     this.target = target;
/* 78 */     this.modifier = modifier;
/* 79 */     this.forks = fork;
/* 80 */     return getThis();
/*    */   }
/*    */   
/*    */   public CommandNode<S> getRedirect() {
/* 84 */     return this.target;
/*    */   }
/*    */   
/*    */   public RedirectModifier<S> getRedirectModifier() {
/* 88 */     return this.modifier;
/*    */   }
/*    */   
/*    */   public boolean isFork() {
/* 92 */     return this.forks;
/*    */   }
/*    */   
/*    */   protected abstract T getThis();
/*    */   
/*    */   public abstract CommandNode<S> build();
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\builder\ArgumentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */