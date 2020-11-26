/*    */ package com.mojang.brigadier.suggestion;
/*    */ 
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.context.StringRange;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class Suggestion
/*    */   implements Comparable<Suggestion> {
/*    */   private final StringRange range;
/*    */   private final String text;
/*    */   private final Message tooltip;
/*    */   
/*    */   public Suggestion(StringRange range, String text) {
/* 14 */     this(range, text, null);
/*    */   }
/*    */   
/*    */   public Suggestion(StringRange range, String text, Message tooltip) {
/* 18 */     this.range = range;
/* 19 */     this.text = text;
/* 20 */     this.tooltip = tooltip;
/*    */   }
/*    */   
/*    */   public StringRange getRange() {
/* 24 */     return this.range;
/*    */   }
/*    */   
/*    */   public String getText() {
/* 28 */     return this.text;
/*    */   }
/*    */   
/*    */   public Message getTooltip() {
/* 32 */     return this.tooltip;
/*    */   }
/*    */   
/*    */   public String apply(String input) {
/* 36 */     if (this.range.getStart() == 0 && this.range.getEnd() == input.length()) {
/* 37 */       return this.text;
/*    */     }
/* 39 */     StringBuilder result = new StringBuilder();
/* 40 */     if (this.range.getStart() > 0) {
/* 41 */       result.append(input.substring(0, this.range.getStart()));
/*    */     }
/* 43 */     result.append(this.text);
/* 44 */     if (this.range.getEnd() < input.length()) {
/* 45 */       result.append(input.substring(this.range.getEnd()));
/*    */     }
/* 47 */     return result.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 52 */     if (this == o) {
/* 53 */       return true;
/*    */     }
/* 55 */     if (!(o instanceof Suggestion)) {
/* 56 */       return false;
/*    */     }
/* 58 */     Suggestion that = (Suggestion)o;
/* 59 */     return (Objects.equals(this.range, that.range) && Objects.equals(this.text, that.text) && Objects.equals(this.tooltip, that.tooltip));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 64 */     return Objects.hash(new Object[] { this.range, this.text, this.tooltip });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 69 */     return "Suggestion{range=" + this.range + ", text='" + this.text + '\'' + ", tooltip='" + this.tooltip + '\'' + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int compareTo(Suggestion o) {
/* 78 */     return this.text.compareTo(o.text);
/*    */   }
/*    */   
/*    */   public int compareToIgnoreCase(Suggestion b) {
/* 82 */     return this.text.compareToIgnoreCase(b.text);
/*    */   }
/*    */   
/*    */   public Suggestion expand(String command, StringRange range) {
/* 86 */     if (range.equals(this.range)) {
/* 87 */       return this;
/*    */     }
/* 89 */     StringBuilder result = new StringBuilder();
/* 90 */     if (range.getStart() < this.range.getStart()) {
/* 91 */       result.append(command.substring(range.getStart(), this.range.getStart()));
/*    */     }
/* 93 */     result.append(this.text);
/* 94 */     if (range.getEnd() > this.range.getEnd()) {
/* 95 */       result.append(command.substring(this.range.getEnd(), range.getEnd()));
/*    */     }
/* 97 */     return new Suggestion(range, result.toString(), this.tooltip);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\suggestion\Suggestion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */