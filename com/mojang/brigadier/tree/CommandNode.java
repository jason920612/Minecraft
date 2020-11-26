/*     */ package com.mojang.brigadier.tree;
/*     */ 
/*     */ import com.google.common.collect.ComparisonChain;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.brigadier.AmbiguityConsumer;
/*     */ import com.mojang.brigadier.Command;
/*     */ import com.mojang.brigadier.RedirectModifier;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.context.CommandContextBuilder;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ public abstract class CommandNode<S>
/*     */   implements Comparable<CommandNode<S>> {
/*  27 */   private Map<String, CommandNode<S>> children = Maps.newLinkedHashMap();
/*  28 */   private Map<String, LiteralCommandNode<S>> literals = Maps.newLinkedHashMap();
/*  29 */   private Map<String, ArgumentCommandNode<S, ?>> arguments = Maps.newLinkedHashMap();
/*     */   private final Predicate<S> requirement;
/*     */   private final CommandNode<S> redirect;
/*     */   private final RedirectModifier<S> modifier;
/*     */   private final boolean forks;
/*     */   private Command<S> command;
/*     */   
/*     */   protected CommandNode(Command<S> command, Predicate<S> requirement, CommandNode<S> redirect, RedirectModifier<S> modifier, boolean forks) {
/*  37 */     this.command = command;
/*  38 */     this.requirement = requirement;
/*  39 */     this.redirect = redirect;
/*  40 */     this.modifier = modifier;
/*  41 */     this.forks = forks;
/*     */   }
/*     */   
/*     */   public Command<S> getCommand() {
/*  45 */     return this.command;
/*     */   }
/*     */   
/*     */   public Collection<CommandNode<S>> getChildren() {
/*  49 */     return this.children.values();
/*     */   }
/*     */   
/*     */   public CommandNode<S> getChild(String name) {
/*  53 */     return this.children.get(name);
/*     */   }
/*     */   
/*     */   public CommandNode<S> getRedirect() {
/*  57 */     return this.redirect;
/*     */   }
/*     */   
/*     */   public RedirectModifier<S> getRedirectModifier() {
/*  61 */     return this.modifier;
/*     */   }
/*     */   
/*     */   public boolean canUse(S source) {
/*  65 */     return this.requirement.test(source);
/*     */   }
/*     */   
/*     */   public void addChild(CommandNode<S> node) {
/*  69 */     if (node instanceof RootCommandNode) {
/*  70 */       throw new UnsupportedOperationException("Cannot add a RootCommandNode as a child to any other CommandNode");
/*     */     }
/*     */     
/*  73 */     CommandNode<S> child = this.children.get(node.getName());
/*  74 */     if (child != null) {
/*     */       
/*  76 */       if (node.getCommand() != null) {
/*  77 */         child.command = node.getCommand();
/*     */       }
/*  79 */       for (CommandNode<S> grandchild : node.getChildren()) {
/*  80 */         child.addChild(grandchild);
/*     */       }
/*     */     } else {
/*  83 */       this.children.put(node.getName(), node);
/*  84 */       if (node instanceof LiteralCommandNode) {
/*  85 */         this.literals.put(node.getName(), (LiteralCommandNode<S>)node);
/*  86 */       } else if (node instanceof ArgumentCommandNode) {
/*  87 */         this.arguments.put(node.getName(), (ArgumentCommandNode)node);
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     this.children = (Map<String, CommandNode<S>>)this.children.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, java.util.LinkedHashMap::new));
/*     */   }
/*     */   
/*     */   public void findAmbiguities(AmbiguityConsumer<S> consumer) {
/*  95 */     Set<String> matches = Sets.newHashSet();
/*     */     
/*  97 */     for (CommandNode<S> child : this.children.values()) {
/*  98 */       for (CommandNode<S> sibling : this.children.values()) {
/*  99 */         if (child == sibling) {
/*     */           continue;
/*     */         }
/*     */         
/* 103 */         for (String input : child.getExamples()) {
/* 104 */           if (sibling.isValidInput(input)) {
/* 105 */             matches.add(input);
/*     */           }
/*     */         } 
/*     */         
/* 109 */         if (matches.size() > 0) {
/* 110 */           consumer.ambiguous(this, child, sibling, matches);
/* 111 */           matches = Sets.newHashSet();
/*     */         } 
/*     */       } 
/*     */       
/* 115 */       child.findAmbiguities(consumer);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 123 */     if (this == o) return true; 
/* 124 */     if (!(o instanceof CommandNode)) return false;
/*     */     
/* 126 */     CommandNode<S> that = (CommandNode<S>)o;
/*     */     
/* 128 */     if (!this.children.equals(that.children)) return false; 
/* 129 */     if ((this.command != null) ? !this.command.equals(that.command) : (that.command != null)) return false;
/*     */     
/* 131 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 136 */     return 31 * this.children.hashCode() + ((this.command != null) ? this.command.hashCode() : 0);
/*     */   }
/*     */   
/*     */   public Predicate<S> getRequirement() {
/* 140 */     return this.requirement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<? extends CommandNode<S>> getRelevantNodes(StringReader input) {
/* 156 */     if (this.literals.size() > 0) {
/* 157 */       int cursor = input.getCursor();
/* 158 */       while (input.canRead() && input.peek() != ' ') {
/* 159 */         input.skip();
/*     */       }
/* 161 */       String text = input.getString().substring(cursor, input.getCursor());
/* 162 */       input.setCursor(cursor);
/* 163 */       LiteralCommandNode<S> literal = this.literals.get(text);
/* 164 */       if (literal != null) {
/* 165 */         return Collections.singleton(literal);
/*     */       }
/* 167 */       return this.arguments.values();
/*     */     } 
/*     */     
/* 170 */     return this.arguments.values();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int compareTo(CommandNode<S> o) {
/* 176 */     return 
/* 177 */       ComparisonChain.start()
/* 178 */       .compareTrueFirst(this instanceof LiteralCommandNode, o instanceof LiteralCommandNode)
/* 179 */       .compare(getSortedKey(), o.getSortedKey())
/* 180 */       .result();
/*     */   }
/*     */   
/*     */   public boolean isFork() {
/* 184 */     return this.forks;
/*     */   }
/*     */   
/*     */   protected abstract boolean isValidInput(String paramString);
/*     */   
/*     */   public abstract String getName();
/*     */   
/*     */   public abstract String getUsageText();
/*     */   
/*     */   public abstract void parse(StringReader paramStringReader, CommandContextBuilder<S> paramCommandContextBuilder) throws CommandSyntaxException;
/*     */   
/*     */   public abstract CompletableFuture<Suggestions> listSuggestions(CommandContext<S> paramCommandContext, SuggestionsBuilder paramSuggestionsBuilder) throws CommandSyntaxException;
/*     */   
/*     */   public abstract ArgumentBuilder<S, ?> createBuilder();
/*     */   
/*     */   protected abstract String getSortedKey();
/*     */   
/*     */   public abstract Collection<String> getExamples();
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\tree\CommandNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */