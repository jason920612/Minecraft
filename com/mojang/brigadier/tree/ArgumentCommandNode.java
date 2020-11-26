/*     */ package com.mojang.brigadier.tree;
/*     */ 
/*     */ import com.mojang.brigadier.Command;
/*     */ import com.mojang.brigadier.RedirectModifier;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.context.CommandContextBuilder;
/*     */ import com.mojang.brigadier.context.ParsedArgument;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ public class ArgumentCommandNode<S, T>
/*     */   extends CommandNode<S> {
/*     */   private static final String USAGE_ARGUMENT_OPEN = "<";
/*     */   private static final String USAGE_ARGUMENT_CLOSE = ">";
/*     */   private final String name;
/*     */   private final ArgumentType<T> type;
/*     */   private final SuggestionProvider<S> customSuggestions;
/*     */   
/*     */   public ArgumentCommandNode(String name, ArgumentType<T> type, Command<S> command, Predicate<S> requirement, CommandNode<S> redirect, RedirectModifier<S> modifier, boolean forks, SuggestionProvider<S> customSuggestions) {
/*  29 */     super(command, requirement, redirect, modifier, forks);
/*  30 */     this.name = name;
/*  31 */     this.type = type;
/*  32 */     this.customSuggestions = customSuggestions;
/*     */   }
/*     */   
/*     */   public ArgumentType<T> getType() {
/*  36 */     return this.type;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/*  41 */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUsageText() {
/*  46 */     return "<" + this.name + ">";
/*     */   }
/*     */   
/*     */   public SuggestionProvider<S> getCustomSuggestions() {
/*  50 */     return this.customSuggestions;
/*     */   }
/*     */ 
/*     */   
/*     */   public void parse(StringReader reader, CommandContextBuilder<S> contextBuilder) throws CommandSyntaxException {
/*  55 */     int start = reader.getCursor();
/*  56 */     T result = (T)this.type.parse(reader);
/*  57 */     ParsedArgument<S, T> parsed = new ParsedArgument(start, reader.getCursor(), result);
/*     */     
/*  59 */     contextBuilder.withArgument(this.name, parsed);
/*  60 */     contextBuilder.withNode(this, parsed.getRange());
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) throws CommandSyntaxException {
/*  65 */     if (this.customSuggestions == null) {
/*  66 */       return this.type.listSuggestions(context, builder);
/*     */     }
/*  68 */     return this.customSuggestions.getSuggestions(context, builder);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public RequiredArgumentBuilder<S, T> createBuilder() {
/*  74 */     RequiredArgumentBuilder<S, T> builder = RequiredArgumentBuilder.argument(this.name, this.type);
/*  75 */     builder.requires(getRequirement());
/*  76 */     builder.forward(getRedirect(), getRedirectModifier(), isFork());
/*  77 */     builder.suggests(this.customSuggestions);
/*  78 */     if (getCommand() != null) {
/*  79 */       builder.executes(getCommand());
/*     */     }
/*  81 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isValidInput(String input) {
/*     */     try {
/*  87 */       StringReader reader = new StringReader(input);
/*  88 */       this.type.parse(reader);
/*  89 */       return (!reader.canRead() || reader.peek() == ' ');
/*  90 */     } catch (CommandSyntaxException ignored) {
/*  91 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  97 */     if (this == o) return true; 
/*  98 */     if (!(o instanceof ArgumentCommandNode)) return false;
/*     */     
/* 100 */     ArgumentCommandNode that = (ArgumentCommandNode)o;
/*     */     
/* 102 */     if (!this.name.equals(that.name)) return false; 
/* 103 */     if (!this.type.equals(that.type)) return false; 
/* 104 */     return super.equals(o);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 109 */     int result = this.name.hashCode();
/* 110 */     result = 31 * result + this.type.hashCode();
/* 111 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String getSortedKey() {
/* 116 */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 121 */     return this.type.getExamples();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 126 */     return "<argument " + this.name + ":" + this.type + ">";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\tree\ArgumentCommandNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */