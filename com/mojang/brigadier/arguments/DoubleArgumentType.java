/*    */ package com.mojang.brigadier.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class DoubleArgumentType
/*    */   implements ArgumentType<Double> {
/* 11 */   private static final Collection<String> EXAMPLES = Arrays.asList(new String[] { "0", "1.2", ".5", "-1", "-.5", "-1234.56" });
/*    */   
/*    */   private final double minimum;
/*    */   private final double maximum;
/*    */   
/*    */   private DoubleArgumentType(double minimum, double maximum) {
/* 17 */     this.minimum = minimum;
/* 18 */     this.maximum = maximum;
/*    */   }
/*    */   
/*    */   public static DoubleArgumentType doubleArg() {
/* 22 */     return doubleArg(-1.7976931348623157E308D);
/*    */   }
/*    */   
/*    */   public static DoubleArgumentType doubleArg(double min) {
/* 26 */     return doubleArg(min, Double.MAX_VALUE);
/*    */   }
/*    */   
/*    */   public static DoubleArgumentType doubleArg(double min, double max) {
/* 30 */     return new DoubleArgumentType(min, max);
/*    */   }
/*    */   
/*    */   public static double getDouble(CommandContext<?> context, String name) {
/* 34 */     return ((Double)context.getArgument(name, Double.class)).doubleValue();
/*    */   }
/*    */   
/*    */   public double getMinimum() {
/* 38 */     return this.minimum;
/*    */   }
/*    */   
/*    */   public double getMaximum() {
/* 42 */     return this.maximum;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> Double parse(StringReader reader) throws CommandSyntaxException {
/* 47 */     int start = reader.getCursor();
/* 48 */     double result = reader.readDouble();
/* 49 */     if (result < this.minimum) {
/* 50 */       reader.setCursor(start);
/* 51 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.doubleTooLow().createWithContext(reader, Double.valueOf(result), Double.valueOf(this.minimum));
/*    */     } 
/* 53 */     if (result > this.maximum) {
/* 54 */       reader.setCursor(start);
/* 55 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.doubleTooHigh().createWithContext(reader, Double.valueOf(result), Double.valueOf(this.maximum));
/*    */     } 
/* 57 */     return Double.valueOf(result);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 62 */     if (this == o) return true; 
/* 63 */     if (!(o instanceof DoubleArgumentType)) return false;
/*    */     
/* 65 */     DoubleArgumentType that = (DoubleArgumentType)o;
/* 66 */     return (this.maximum == that.maximum && this.minimum == that.minimum);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 71 */     return (int)(31.0D * this.minimum + this.maximum);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     if (this.minimum == -1.7976931348623157E308D && this.maximum == Double.MAX_VALUE)
/* 77 */       return "double()"; 
/* 78 */     if (this.maximum == Double.MAX_VALUE) {
/* 79 */       return "double(" + this.minimum + ")";
/*    */     }
/* 81 */     return "double(" + this.minimum + ", " + this.maximum + ")";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 87 */     return EXAMPLES;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\arguments\DoubleArgumentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */