/*    */ package com.mojang.brigadier.suggestion;
/*    */ 
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.context.StringRange;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class IntegerSuggestion
/*    */   extends Suggestion {
/*    */   private int value;
/*    */   
/*    */   public IntegerSuggestion(StringRange range, int value) {
/* 12 */     this(range, value, (Message)null);
/*    */   }
/*    */   
/*    */   public IntegerSuggestion(StringRange range, int value, Message tooltip) {
/* 16 */     super(range, Integer.toString(value), tooltip);
/* 17 */     this.value = value;
/*    */   }
/*    */   
/*    */   public int getValue() {
/* 21 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 26 */     if (this == o) {
/* 27 */       return true;
/*    */     }
/* 29 */     if (!(o instanceof IntegerSuggestion)) {
/* 30 */       return false;
/*    */     }
/* 32 */     IntegerSuggestion that = (IntegerSuggestion)o;
/* 33 */     return (this.value == that.value && super.equals(o));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 38 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.value) });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return "IntegerSuggestion{value=" + this.value + ", range=" + 
/*    */       
/* 45 */       getRange() + ", text='" + 
/* 46 */       getText() + '\'' + ", tooltip='" + 
/* 47 */       getTooltip() + '\'' + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int compareTo(Suggestion o) {
/* 53 */     if (o instanceof IntegerSuggestion) {
/* 54 */       return Integer.compare(this.value, ((IntegerSuggestion)o).value);
/*    */     }
/* 56 */     return super.compareTo(o);
/*    */   }
/*    */ 
/*    */   
/*    */   public int compareToIgnoreCase(Suggestion b) {
/* 61 */     return compareTo(b);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\suggestion\IntegerSuggestion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */