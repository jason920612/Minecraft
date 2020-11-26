/*    */ package com.mojang.brigadier.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class StringArgumentType
/*    */   implements ArgumentType<String>
/*    */ {
/*    */   private final StringType type;
/*    */   
/*    */   private StringArgumentType(StringType type) {
/* 15 */     this.type = type;
/*    */   }
/*    */   
/*    */   public static StringArgumentType word() {
/* 19 */     return new StringArgumentType(StringType.SINGLE_WORD);
/*    */   }
/*    */   
/*    */   public static StringArgumentType string() {
/* 23 */     return new StringArgumentType(StringType.QUOTABLE_PHRASE);
/*    */   }
/*    */   
/*    */   public static StringArgumentType greedyString() {
/* 27 */     return new StringArgumentType(StringType.GREEDY_PHRASE);
/*    */   }
/*    */   
/*    */   public static String getString(CommandContext<?> context, String name) {
/* 31 */     return (String)context.getArgument(name, String.class);
/*    */   }
/*    */   
/*    */   public StringType getType() {
/* 35 */     return this.type;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> String parse(StringReader reader) throws CommandSyntaxException {
/* 40 */     if (this.type == StringType.GREEDY_PHRASE) {
/* 41 */       String text = reader.getRemaining();
/* 42 */       reader.setCursor(reader.getTotalLength());
/* 43 */       return text;
/* 44 */     }  if (this.type == StringType.SINGLE_WORD) {
/* 45 */       return reader.readUnquotedString();
/*    */     }
/* 47 */     return reader.readString();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return "string()";
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 58 */     return this.type.getExamples();
/*    */   }
/*    */   
/*    */   public static String escapeIfRequired(String input) {
/* 62 */     for (char c : input.toCharArray()) {
/* 63 */       if (!StringReader.isAllowedInUnquotedString(c)) {
/* 64 */         return escape(input);
/*    */       }
/*    */     } 
/* 67 */     return input;
/*    */   }
/*    */   
/*    */   private static String escape(String input) {
/* 71 */     StringBuilder result = new StringBuilder("\"");
/*    */     
/* 73 */     for (int i = 0; i < input.length(); i++) {
/* 74 */       char c = input.charAt(i);
/* 75 */       if (c == '\\' || c == '"') {
/* 76 */         result.append('\\');
/*    */       }
/* 78 */       result.append(c);
/*    */     } 
/*    */     
/* 81 */     result.append("\"");
/* 82 */     return result.toString();
/*    */   }
/*    */   
/*    */   public enum StringType {
/* 86 */     SINGLE_WORD((String)new String[] { "word", "words_with_underscores" }),
/* 87 */     QUOTABLE_PHRASE((String)new String[] { "\"quoted phrase\"", "word", "\"\"" }),
/* 88 */     GREEDY_PHRASE((String)new String[] { "word", "words with spaces", "\"and symbols\"" });
/*    */     
/*    */     private final Collection<String> examples;
/*    */     
/*    */     StringType(String... examples) {
/* 93 */       this.examples = Arrays.asList(examples);
/*    */     }
/*    */     
/*    */     public Collection<String> getExamples() {
/* 97 */       return this.examples;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\arguments\StringArgumentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */