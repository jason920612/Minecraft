/*    */ package com.mojang.brigadier.context;
/*    */ 
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class ParsedArgument<S, T> {
/*    */   private final StringRange range;
/*    */   private final T result;
/*    */   
/*    */   public ParsedArgument(int start, int end, T result) {
/* 10 */     this.range = StringRange.between(start, end);
/* 11 */     this.result = result;
/*    */   }
/*    */   
/*    */   public StringRange getRange() {
/* 15 */     return this.range;
/*    */   }
/*    */   
/*    */   public T getResult() {
/* 19 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 24 */     if (this == o) {
/* 25 */       return true;
/*    */     }
/* 27 */     if (!(o instanceof ParsedArgument)) {
/* 28 */       return false;
/*    */     }
/* 30 */     ParsedArgument<?, ?> that = (ParsedArgument<?, ?>)o;
/* 31 */     return (Objects.equals(this.range, that.range) && Objects.equals(this.result, that.result));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     return Objects.hash(new Object[] { this.range, this.result });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\context\ParsedArgument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */