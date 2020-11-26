/*     */ package com.mojang.brigadier.context;
/*     */ 
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.primitives.Primitives;
/*     */ import com.mojang.brigadier.Command;
/*     */ import com.mojang.brigadier.RedirectModifier;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class CommandContext<S>
/*     */ {
/*     */   private final S source;
/*     */   private final String input;
/*     */   private final Command<S> command;
/*     */   private final Map<String, ParsedArgument<S, ?>> arguments;
/*     */   private final Map<CommandNode<S>, StringRange> nodes;
/*     */   private final StringRange range;
/*     */   private final CommandContext<S> child;
/*     */   private final RedirectModifier<S> modifier;
/*     */   private final boolean forks;
/*     */   
/*     */   public CommandContext(S source, String input, Map<String, ParsedArgument<S, ?>> arguments, Command<S> command, Map<CommandNode<S>, StringRange> nodes, StringRange range, CommandContext<S> child, RedirectModifier<S> modifier, boolean forks) {
/*  23 */     this.source = source;
/*  24 */     this.input = input;
/*  25 */     this.arguments = arguments;
/*  26 */     this.command = command;
/*  27 */     this.nodes = nodes;
/*  28 */     this.range = range;
/*  29 */     this.child = child;
/*  30 */     this.modifier = modifier;
/*  31 */     this.forks = forks;
/*     */   }
/*     */   
/*     */   public CommandContext<S> copyFor(S source) {
/*  35 */     if (this.source == source) {
/*  36 */       return this;
/*     */     }
/*  38 */     return new CommandContext(source, this.input, this.arguments, this.command, this.nodes, this.range, this.child, this.modifier, this.forks);
/*     */   }
/*     */   
/*     */   public CommandContext<S> getChild() {
/*  42 */     return this.child;
/*     */   }
/*     */   
/*     */   public CommandContext<S> getLastChild() {
/*  46 */     CommandContext<S> result = this;
/*  47 */     while (result.getChild() != null) {
/*  48 */       result = result.getChild();
/*     */     }
/*  50 */     return result;
/*     */   }
/*     */   
/*     */   public Command<S> getCommand() {
/*  54 */     return this.command;
/*     */   }
/*     */   
/*     */   public S getSource() {
/*  58 */     return this.source;
/*     */   }
/*     */ 
/*     */   
/*     */   public <V> V getArgument(String name, Class<V> clazz) {
/*  63 */     ParsedArgument<S, ?> argument = this.arguments.get(name);
/*     */     
/*  65 */     if (argument == null) {
/*  66 */       throw new IllegalArgumentException("No such argument '" + name + "' exists on this command");
/*     */     }
/*     */     
/*  69 */     Object result = argument.getResult();
/*  70 */     if (Primitives.wrap(clazz).isAssignableFrom(result.getClass())) {
/*  71 */       return (V)result;
/*     */     }
/*  73 */     throw new IllegalArgumentException("Argument '" + name + "' is defined as " + result.getClass().getSimpleName() + ", not " + clazz);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  79 */     if (this == o) return true; 
/*  80 */     if (!(o instanceof CommandContext)) return false;
/*     */     
/*  82 */     CommandContext that = (CommandContext)o;
/*     */     
/*  84 */     if (!this.arguments.equals(that.arguments)) return false; 
/*  85 */     if (!Iterables.elementsEqual(this.nodes.entrySet(), that.nodes.entrySet())) return false; 
/*  86 */     if ((this.command != null) ? !this.command.equals(that.command) : (that.command != null)) return false; 
/*  87 */     if (!this.source.equals(that.source)) return false; 
/*  88 */     if ((this.child != null) ? !this.child.equals(that.child) : (that.child != null)) return false;
/*     */     
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  95 */     int result = this.source.hashCode();
/*  96 */     result = 31 * result + this.arguments.hashCode();
/*  97 */     result = 31 * result + ((this.command != null) ? this.command.hashCode() : 0);
/*  98 */     result = 31 * result + this.nodes.hashCode();
/*  99 */     result = 31 * result + ((this.child != null) ? this.child.hashCode() : 0);
/* 100 */     return result;
/*     */   }
/*     */   
/*     */   public RedirectModifier<S> getRedirectModifier() {
/* 104 */     return this.modifier;
/*     */   }
/*     */   
/*     */   public StringRange getRange() {
/* 108 */     return this.range;
/*     */   }
/*     */   
/*     */   public String getInput() {
/* 112 */     return this.input;
/*     */   }
/*     */   
/*     */   public Map<CommandNode<S>, StringRange> getNodes() {
/* 116 */     return this.nodes;
/*     */   }
/*     */   
/*     */   public boolean isForked() {
/* 120 */     return this.forks;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\context\CommandContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */