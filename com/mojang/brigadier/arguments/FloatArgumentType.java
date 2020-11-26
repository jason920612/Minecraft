/*    */ package com.mojang.brigadier.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class FloatArgumentType
/*    */   implements ArgumentType<Float> {
/* 11 */   private static final Collection<String> EXAMPLES = Arrays.asList(new String[] { "0", "1.2", ".5", "-1", "-.5", "-1234.56" });
/*    */   
/*    */   private final float minimum;
/*    */   private final float maximum;
/*    */   
/*    */   private FloatArgumentType(float minimum, float maximum) {
/* 17 */     this.minimum = minimum;
/* 18 */     this.maximum = maximum;
/*    */   }
/*    */   
/*    */   public static FloatArgumentType floatArg() {
/* 22 */     return floatArg(-3.4028235E38F);
/*    */   }
/*    */   
/*    */   public static FloatArgumentType floatArg(float min) {
/* 26 */     return floatArg(min, Float.MAX_VALUE);
/*    */   }
/*    */   
/*    */   public static FloatArgumentType floatArg(float min, float max) {
/* 30 */     return new FloatArgumentType(min, max);
/*    */   }
/*    */   
/*    */   public static float getFloat(CommandContext<?> context, String name) {
/* 34 */     return ((Float)context.getArgument(name, Float.class)).floatValue();
/*    */   }
/*    */   
/*    */   public float getMinimum() {
/* 38 */     return this.minimum;
/*    */   }
/*    */   
/*    */   public float getMaximum() {
/* 42 */     return this.maximum;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> Float parse(StringReader reader) throws CommandSyntaxException {
/* 47 */     int start = reader.getCursor();
/* 48 */     float result = reader.readFloat();
/* 49 */     if (result < this.minimum) {
/* 50 */       reader.setCursor(start);
/* 51 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.floatTooLow().createWithContext(reader, Float.valueOf(result), Float.valueOf(this.minimum));
/*    */     } 
/* 53 */     if (result > this.maximum) {
/* 54 */       reader.setCursor(start);
/* 55 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.floatTooHigh().createWithContext(reader, Float.valueOf(result), Float.valueOf(this.maximum));
/*    */     } 
/* 57 */     return Float.valueOf(result);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 62 */     if (this == o) return true; 
/* 63 */     if (!(o instanceof FloatArgumentType)) return false;
/*    */     
/* 65 */     FloatArgumentType that = (FloatArgumentType)o;
/* 66 */     return (this.maximum == that.maximum && this.minimum == that.minimum);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 71 */     return (int)(31.0F * this.minimum + this.maximum);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     if (this.minimum == -3.4028235E38F && this.maximum == Float.MAX_VALUE)
/* 77 */       return "float()"; 
/* 78 */     if (this.maximum == Float.MAX_VALUE) {
/* 79 */       return "float(" + this.minimum + ")";
/*    */     }
/* 81 */     return "float(" + this.minimum + ", " + this.maximum + ")";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 87 */     return EXAMPLES;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\arguments\FloatArgumentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */