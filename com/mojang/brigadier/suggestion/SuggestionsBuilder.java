/*    */ package com.mojang.brigadier.suggestion;
/*    */ 
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.context.StringRange;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ public class SuggestionsBuilder
/*    */ {
/*    */   private final String input;
/*    */   private final int start;
/*    */   private final String remaining;
/* 14 */   private final List<Suggestion> result = new ArrayList<>();
/*    */   
/*    */   public SuggestionsBuilder(String input, int start) {
/* 17 */     this.input = input;
/* 18 */     this.start = start;
/* 19 */     this.remaining = input.substring(start);
/*    */   }
/*    */   
/*    */   public String getInput() {
/* 23 */     return this.input;
/*    */   }
/*    */   
/*    */   public int getStart() {
/* 27 */     return this.start;
/*    */   }
/*    */   
/*    */   public String getRemaining() {
/* 31 */     return this.remaining;
/*    */   }
/*    */   
/*    */   public Suggestions build() {
/* 35 */     return Suggestions.create(this.input, this.result);
/*    */   }
/*    */   
/*    */   public CompletableFuture<Suggestions> buildFuture() {
/* 39 */     return CompletableFuture.completedFuture(build());
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder suggest(String text) {
/* 43 */     if (text.equals(this.remaining)) {
/* 44 */       return this;
/*    */     }
/* 46 */     this.result.add(new Suggestion(StringRange.between(this.start, this.input.length()), text));
/* 47 */     return this;
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder suggest(String text, Message tooltip) {
/* 51 */     if (text.equals(this.remaining)) {
/* 52 */       return this;
/*    */     }
/* 54 */     this.result.add(new Suggestion(StringRange.between(this.start, this.input.length()), text, tooltip));
/* 55 */     return this;
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder suggest(int value) {
/* 59 */     this.result.add(new IntegerSuggestion(StringRange.between(this.start, this.input.length()), value));
/* 60 */     return this;
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder suggest(int value, Message tooltip) {
/* 64 */     this.result.add(new IntegerSuggestion(StringRange.between(this.start, this.input.length()), value, tooltip));
/* 65 */     return this;
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder add(SuggestionsBuilder other) {
/* 69 */     this.result.addAll(other.result);
/* 70 */     return this;
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder createOffset(int start) {
/* 74 */     return new SuggestionsBuilder(this.input, start);
/*    */   }
/*    */   
/*    */   public SuggestionsBuilder restart() {
/* 78 */     return new SuggestionsBuilder(this.input, this.start);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\suggestion\SuggestionsBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */