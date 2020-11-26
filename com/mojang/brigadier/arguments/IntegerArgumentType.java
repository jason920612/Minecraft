/*    */ package com.mojang.brigadier.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class IntegerArgumentType
/*    */   implements ArgumentType<Integer> {
/* 11 */   private static final Collection<String> EXAMPLES = Arrays.asList(new String[] { "0", "123", "-123" });
/*    */   
/*    */   private final int minimum;
/*    */   private final int maximum;
/*    */   
/*    */   private IntegerArgumentType(int minimum, int maximum) {
/* 17 */     this.minimum = minimum;
/* 18 */     this.maximum = maximum;
/*    */   }
/*    */   
/*    */   public static IntegerArgumentType integer() {
/* 22 */     return integer(-2147483648);
/*    */   }
/*    */   
/*    */   public static IntegerArgumentType integer(int min) {
/* 26 */     return integer(min, 2147483647);
/*    */   }
/*    */   
/*    */   public static IntegerArgumentType integer(int min, int max) {
/* 30 */     return new IntegerArgumentType(min, max);
/*    */   }
/*    */   
/*    */   public static int getInteger(CommandContext<?> context, String name) {
/* 34 */     return ((Integer)context.getArgument(name, int.class)).intValue();
/*    */   }
/*    */   
/*    */   public int getMinimum() {
/* 38 */     return this.minimum;
/*    */   }
/*    */   
/*    */   public int getMaximum() {
/* 42 */     return this.maximum;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> Integer parse(StringReader reader) throws CommandSyntaxException {
/* 47 */     int start = reader.getCursor();
/* 48 */     int result = reader.readInt();
/* 49 */     if (result < this.minimum) {
/* 50 */       reader.setCursor(start);
/* 51 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.integerTooLow().createWithContext(reader, Integer.valueOf(result), Integer.valueOf(this.minimum));
/*    */     } 
/* 53 */     if (result > this.maximum) {
/* 54 */       reader.setCursor(start);
/* 55 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.integerTooHigh().createWithContext(reader, Integer.valueOf(result), Integer.valueOf(this.maximum));
/*    */     } 
/* 57 */     return Integer.valueOf(result);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 62 */     if (this == o) return true; 
/* 63 */     if (!(o instanceof IntegerArgumentType)) return false;
/*    */     
/* 65 */     IntegerArgumentType that = (IntegerArgumentType)o;
/* 66 */     return (this.maximum == that.maximum && this.minimum == that.minimum);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 71 */     return 31 * this.minimum + this.maximum;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     if (this.minimum == Integer.MIN_VALUE && this.maximum == Integer.MAX_VALUE)
/* 77 */       return "integer()"; 
/* 78 */     if (this.maximum == Integer.MAX_VALUE) {
/* 79 */       return "integer(" + this.minimum + ")";
/*    */     }
/* 81 */     return "integer(" + this.minimum + ", " + this.maximum + ")";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\arguments\IntegerArgumentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */