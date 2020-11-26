/*     */ package com.mojang.brigadier.context;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.Command;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.RedirectModifier;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class CommandContextBuilder<S>
/*     */ {
/*  12 */   private final Map<String, ParsedArgument<S, ?>> arguments = Maps.newLinkedHashMap();
/*  13 */   private final Map<CommandNode<S>, StringRange> nodes = Maps.newLinkedHashMap();
/*     */   private final CommandDispatcher<S> dispatcher;
/*     */   private S source;
/*     */   private Command<S> command;
/*     */   private CommandContextBuilder<S> child;
/*     */   private StringRange range;
/*  19 */   private RedirectModifier<S> modifier = null;
/*     */   private boolean forks;
/*     */   
/*     */   public CommandContextBuilder(CommandDispatcher<S> dispatcher, S source, int start) {
/*  23 */     this.dispatcher = dispatcher;
/*  24 */     this.source = source;
/*  25 */     this.range = StringRange.at(start);
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> withSource(S source) {
/*  29 */     this.source = source;
/*  30 */     return this;
/*     */   }
/*     */   
/*     */   public S getSource() {
/*  34 */     return this.source;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> withArgument(String name, ParsedArgument<S, ?> argument) {
/*  38 */     this.arguments.put(name, argument);
/*  39 */     return this;
/*     */   }
/*     */   
/*     */   public Map<String, ParsedArgument<S, ?>> getArguments() {
/*  43 */     return this.arguments;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> withCommand(Command<S> command) {
/*  47 */     this.command = command;
/*  48 */     return this;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> withNode(CommandNode<S> node, StringRange range) {
/*  52 */     this.nodes.put(node, range);
/*  53 */     this.range = StringRange.encompassing(this.range, range);
/*  54 */     this.modifier = node.getRedirectModifier();
/*  55 */     this.forks = node.isFork();
/*  56 */     return this;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> copy() {
/*  60 */     CommandContextBuilder<S> copy = new CommandContextBuilder(this.dispatcher, this.source, this.range.getStart());
/*  61 */     copy.command = this.command;
/*  62 */     copy.arguments.putAll(this.arguments);
/*  63 */     copy.nodes.putAll(this.nodes);
/*  64 */     copy.child = this.child;
/*  65 */     copy.range = this.range;
/*  66 */     copy.forks = this.forks;
/*  67 */     return copy;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> withChild(CommandContextBuilder<S> child) {
/*  71 */     this.child = child;
/*  72 */     return this;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> getChild() {
/*  76 */     return this.child;
/*     */   }
/*     */   
/*     */   public CommandContextBuilder<S> getLastChild() {
/*  80 */     CommandContextBuilder<S> result = this;
/*  81 */     while (result.getChild() != null) {
/*  82 */       result = result.getChild();
/*     */     }
/*  84 */     return result;
/*     */   }
/*     */   
/*     */   public Command<S> getCommand() {
/*  88 */     return this.command;
/*     */   }
/*     */   
/*     */   public Map<CommandNode<S>, StringRange> getNodes() {
/*  92 */     return this.nodes;
/*     */   }
/*     */   
/*     */   public CommandContext<S> build(String input) {
/*  96 */     return new CommandContext<>(this.source, input, this.arguments, this.command, this.nodes, this.range, (this.child == null) ? null : this.child.build(input), this.modifier, this.forks);
/*     */   }
/*     */   
/*     */   public CommandDispatcher<S> getDispatcher() {
/* 100 */     return this.dispatcher;
/*     */   }
/*     */   
/*     */   public StringRange getRange() {
/* 104 */     return this.range;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\context\CommandContextBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */