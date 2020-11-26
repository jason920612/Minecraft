/*    */ package com.mojang.brigadier.suggestion;
/*    */ 
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.mojang.brigadier.context.StringRange;
/*    */ import java.util.Collection;
/*    */ import java.util.HashSet;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ public class Suggestions
/*    */ {
/* 15 */   private static final Suggestions EMPTY = new Suggestions(StringRange.at(0), Lists.newArrayList());
/*    */   
/*    */   private final StringRange range;
/*    */   private final List<Suggestion> suggestions;
/*    */   
/*    */   public Suggestions(StringRange range, List<Suggestion> suggestions) {
/* 21 */     this.range = range;
/* 22 */     this.suggestions = suggestions;
/*    */   }
/*    */   
/*    */   public StringRange getRange() {
/* 26 */     return this.range;
/*    */   }
/*    */   
/*    */   public List<Suggestion> getList() {
/* 30 */     return this.suggestions;
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 34 */     return this.suggestions.isEmpty();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 39 */     if (this == o) {
/* 40 */       return true;
/*    */     }
/* 42 */     if (!(o instanceof Suggestions)) {
/* 43 */       return false;
/*    */     }
/* 45 */     Suggestions that = (Suggestions)o;
/* 46 */     return (Objects.equals(this.range, that.range) && 
/* 47 */       Objects.equals(this.suggestions, that.suggestions));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 52 */     return Objects.hash(new Object[] { this.range, this.suggestions });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 57 */     return "Suggestions{range=" + this.range + ", suggestions=" + this.suggestions + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static CompletableFuture<Suggestions> empty() {
/* 64 */     return CompletableFuture.completedFuture(EMPTY);
/*    */   }
/*    */   
/*    */   public static Suggestions merge(String command, Collection<Suggestions> input) {
/* 68 */     if (input.isEmpty())
/* 69 */       return EMPTY; 
/* 70 */     if (input.size() == 1) {
/* 71 */       return input.iterator().next();
/*    */     }
/*    */     
/* 74 */     Set<Suggestion> texts = new HashSet<>();
/* 75 */     for (Suggestions suggestions : input) {
/* 76 */       texts.addAll(suggestions.getList());
/*    */     }
/* 78 */     return create(command, texts);
/*    */   }
/*    */   
/*    */   public static Suggestions create(String command, Collection<Suggestion> suggestions) {
/* 82 */     if (suggestions.isEmpty()) {
/* 83 */       return EMPTY;
/*    */     }
/* 85 */     int start = Integer.MAX_VALUE;
/* 86 */     int end = Integer.MIN_VALUE;
/* 87 */     for (Suggestion suggestion : suggestions) {
/* 88 */       start = Math.min(suggestion.getRange().getStart(), start);
/* 89 */       end = Math.max(suggestion.getRange().getEnd(), end);
/*    */     } 
/* 91 */     StringRange range = new StringRange(start, end);
/* 92 */     Set<Suggestion> texts = Sets.newHashSet();
/* 93 */     for (Suggestion suggestion : suggestions) {
/* 94 */       texts.add(suggestion.expand(command, range));
/*    */     }
/* 96 */     List<Suggestion> sorted = Lists.newArrayList(texts);
/* 97 */     sorted.sort((a, b) -> a.compareToIgnoreCase(b));
/* 98 */     return new Suggestions(range, sorted);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\suggestion\Suggestions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */