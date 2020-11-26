/*    */ package com.mojang.brigadier.context;
/*    */ 
/*    */ import com.mojang.brigadier.ImmutableStringReader;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class StringRange
/*    */ {
/*    */   private final int start;
/*    */   private final int end;
/*    */   
/*    */   public StringRange(int start, int end) {
/* 12 */     this.start = start;
/* 13 */     this.end = end;
/*    */   }
/*    */   
/*    */   public static StringRange at(int pos) {
/* 17 */     return new StringRange(pos, pos);
/*    */   }
/*    */   
/*    */   public static StringRange between(int start, int end) {
/* 21 */     return new StringRange(start, end);
/*    */   }
/*    */   
/*    */   public static StringRange encompassing(StringRange a, StringRange b) {
/* 25 */     return new StringRange(Math.min(a.getStart(), b.getStart()), Math.max(a.getEnd(), b.getEnd()));
/*    */   }
/*    */   
/*    */   public int getStart() {
/* 29 */     return this.start;
/*    */   }
/*    */   
/*    */   public int getEnd() {
/* 33 */     return this.end;
/*    */   }
/*    */   
/*    */   public String get(ImmutableStringReader reader) {
/* 37 */     return reader.getString().substring(this.start, this.end);
/*    */   }
/*    */   
/*    */   public String get(String string) {
/* 41 */     return string.substring(this.start, this.end);
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 45 */     return (this.start == this.end);
/*    */   }
/*    */   
/*    */   public int getLength() {
/* 49 */     return this.end - this.start;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 54 */     if (this == o) {
/* 55 */       return true;
/*    */     }
/* 57 */     if (!(o instanceof StringRange)) {
/* 58 */       return false;
/*    */     }
/* 60 */     StringRange that = (StringRange)o;
/* 61 */     return (this.start == that.start && this.end == that.end);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 66 */     return Objects.hash(new Object[] { Integer.valueOf(this.start), Integer.valueOf(this.end) });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 71 */     return "StringRange{start=" + this.start + ", end=" + this.end + '}';
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\context\StringRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */