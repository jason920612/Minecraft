/*     */ package com.mojang.brigadier.tree;
/*     */ 
/*     */ import com.mojang.brigadier.Command;
/*     */ import com.mojang.brigadier.RedirectModifier;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.context.CommandContextBuilder;
/*     */ import com.mojang.brigadier.context.StringRange;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ public class LiteralCommandNode<S> extends CommandNode<S> {
/*     */   private final String literal;
/*     */   
/*     */   public LiteralCommandNode(String literal, Command<S> command, Predicate<S> requirement, CommandNode<S> redirect, RedirectModifier<S> modifier, boolean forks) {
/*  23 */     super(command, requirement, redirect, modifier, forks);
/*  24 */     this.literal = literal;
/*     */   }
/*     */   
/*     */   public String getLiteral() {
/*  28 */     return this.literal;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/*  33 */     return this.literal;
/*     */   }
/*     */ 
/*     */   
/*     */   public void parse(StringReader reader, CommandContextBuilder<S> contextBuilder) throws CommandSyntaxException {
/*  38 */     int start = reader.getCursor();
/*  39 */     int end = parse(reader);
/*  40 */     if (end > -1) {
/*  41 */       contextBuilder.withNode(this, StringRange.between(start, end));
/*     */       
/*     */       return;
/*     */     } 
/*  45 */     throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect().createWithContext(reader, this.literal);
/*     */   }
/*     */   
/*     */   private int parse(StringReader reader) {
/*  49 */     int start = reader.getCursor();
/*  50 */     if (reader.canRead(this.literal.length())) {
/*  51 */       int end = start + this.literal.length();
/*  52 */       if (reader.getString().substring(start, end).equals(this.literal)) {
/*  53 */         reader.setCursor(end);
/*  54 */         if (!reader.canRead() || reader.peek() == ' ') {
/*  55 */           return end;
/*     */         }
/*  57 */         reader.setCursor(start);
/*     */       } 
/*     */     } 
/*     */     
/*  61 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
/*  66 */     if (this.literal.toLowerCase().startsWith(builder.getRemaining().toLowerCase())) {
/*  67 */       return builder.suggest(this.literal).buildFuture();
/*     */     }
/*  69 */     return Suggestions.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValidInput(String input) {
/*  75 */     return (parse(new StringReader(input)) > -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  80 */     if (this == o) return true; 
/*  81 */     if (!(o instanceof LiteralCommandNode)) return false;
/*     */     
/*  83 */     LiteralCommandNode that = (LiteralCommandNode)o;
/*     */     
/*  85 */     if (!this.literal.equals(that.literal)) return false; 
/*  86 */     return super.equals(o);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUsageText() {
/*  91 */     return this.literal;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  96 */     int result = this.literal.hashCode();
/*  97 */     result = 31 * result + super.hashCode();
/*  98 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   public LiteralArgumentBuilder<S> createBuilder() {
/* 103 */     LiteralArgumentBuilder<S> builder = LiteralArgumentBuilder.literal(this.literal);
/* 104 */     builder.requires(getRequirement());
/* 105 */     builder.forward(getRedirect(), getRedirectModifier(), isFork());
/* 106 */     if (getCommand() != null) {
/* 107 */       builder.executes(getCommand());
/*     */     }
/* 109 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String getSortedKey() {
/* 114 */     return this.literal;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 119 */     return Collections.singleton(this.literal);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 124 */     return "<literal " + this.literal + ">";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\tree\LiteralCommandNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */