/*     */ package com.mojang.brigadier;
/*     */ 
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ 
/*     */ public class StringReader
/*     */   implements ImmutableStringReader {
/*     */   private static final char SYNTAX_ESCAPE = '\\';
/*     */   private static final char SYNTAX_QUOTE = '"';
/*     */   private final String string;
/*     */   private int cursor;
/*     */   
/*     */   public StringReader(StringReader other) {
/*  13 */     this.string = other.string;
/*  14 */     this.cursor = other.cursor;
/*     */   }
/*     */   
/*     */   public StringReader(String string) {
/*  18 */     this.string = string;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getString() {
/*  23 */     return this.string;
/*     */   }
/*     */   
/*     */   public void setCursor(int cursor) {
/*  27 */     this.cursor = cursor;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getRemainingLength() {
/*  32 */     return this.string.length() - this.cursor;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTotalLength() {
/*  37 */     return this.string.length();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCursor() {
/*  42 */     return this.cursor;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRead() {
/*  47 */     return this.string.substring(0, this.cursor);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRemaining() {
/*  52 */     return this.string.substring(this.cursor);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRead(int length) {
/*  57 */     return (this.cursor + length <= this.string.length());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRead() {
/*  62 */     return canRead(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public char peek() {
/*  67 */     return this.string.charAt(this.cursor);
/*     */   }
/*     */ 
/*     */   
/*     */   public char peek(int offset) {
/*  72 */     return this.string.charAt(this.cursor + offset);
/*     */   }
/*     */   
/*     */   public char read() {
/*  76 */     return this.string.charAt(this.cursor++);
/*     */   }
/*     */   
/*     */   public void skip() {
/*  80 */     this.cursor++;
/*     */   }
/*     */   
/*     */   public static boolean isAllowedNumber(char c) {
/*  84 */     return ((c >= '0' && c <= '9') || c == '.' || c == '-');
/*     */   }
/*     */   
/*     */   public void skipWhitespace() {
/*  88 */     while (canRead() && Character.isWhitespace(peek())) {
/*  89 */       skip();
/*     */     }
/*     */   }
/*     */   
/*     */   public int readInt() throws CommandSyntaxException {
/*  94 */     int start = this.cursor;
/*  95 */     while (canRead() && isAllowedNumber(peek())) {
/*  96 */       skip();
/*     */     }
/*  98 */     String number = this.string.substring(start, this.cursor);
/*  99 */     if (number.isEmpty()) {
/* 100 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedInt().createWithContext(this);
/*     */     }
/*     */     try {
/* 103 */       return Integer.parseInt(number);
/* 104 */     } catch (NumberFormatException ex) {
/* 105 */       this.cursor = start;
/* 106 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext(this, number);
/*     */     } 
/*     */   }
/*     */   
/*     */   public double readDouble() throws CommandSyntaxException {
/* 111 */     int start = this.cursor;
/* 112 */     while (canRead() && isAllowedNumber(peek())) {
/* 113 */       skip();
/*     */     }
/* 115 */     String number = this.string.substring(start, this.cursor);
/* 116 */     if (number.isEmpty()) {
/* 117 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedDouble().createWithContext(this);
/*     */     }
/*     */     try {
/* 120 */       return Double.parseDouble(number);
/* 121 */     } catch (NumberFormatException ex) {
/* 122 */       this.cursor = start;
/* 123 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext(this, number);
/*     */     } 
/*     */   }
/*     */   
/*     */   public float readFloat() throws CommandSyntaxException {
/* 128 */     int start = this.cursor;
/* 129 */     while (canRead() && isAllowedNumber(peek())) {
/* 130 */       skip();
/*     */     }
/* 132 */     String number = this.string.substring(start, this.cursor);
/* 133 */     if (number.isEmpty()) {
/* 134 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedFloat().createWithContext(this);
/*     */     }
/*     */     try {
/* 137 */       return Float.parseFloat(number);
/* 138 */     } catch (NumberFormatException ex) {
/* 139 */       this.cursor = start;
/* 140 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidFloat().createWithContext(this, number);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean isAllowedInUnquotedString(char c) {
/* 145 */     return ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == '_' || c == '-' || c == '.' || c == '+');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String readUnquotedString() {
/* 153 */     int start = this.cursor;
/* 154 */     while (canRead() && isAllowedInUnquotedString(peek())) {
/* 155 */       skip();
/*     */     }
/* 157 */     return this.string.substring(start, this.cursor);
/*     */   }
/*     */   
/*     */   public String readQuotedString() throws CommandSyntaxException {
/* 161 */     if (!canRead())
/* 162 */       return ""; 
/* 163 */     if (peek() != '"') {
/* 164 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedStartOfQuote().createWithContext(this);
/*     */     }
/* 166 */     skip();
/* 167 */     StringBuilder result = new StringBuilder();
/* 168 */     boolean escaped = false;
/* 169 */     while (canRead()) {
/* 170 */       char c = read();
/* 171 */       if (escaped) {
/* 172 */         if (c == '"' || c == '\\') {
/* 173 */           result.append(c);
/* 174 */           escaped = false; continue;
/*     */         } 
/* 176 */         setCursor(getCursor() - 1);
/* 177 */         throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidEscape().createWithContext(this, String.valueOf(c));
/*     */       } 
/* 179 */       if (c == '\\') {
/* 180 */         escaped = true; continue;
/* 181 */       }  if (c == '"') {
/* 182 */         return result.toString();
/*     */       }
/* 184 */       result.append(c);
/*     */     } 
/*     */ 
/*     */     
/* 188 */     throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedEndOfQuote().createWithContext(this);
/*     */   }
/*     */   
/*     */   public String readString() throws CommandSyntaxException {
/* 192 */     if (canRead() && peek() == '"') {
/* 193 */       return readQuotedString();
/*     */     }
/* 195 */     return readUnquotedString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean readBoolean() throws CommandSyntaxException {
/* 200 */     int start = this.cursor;
/* 201 */     String value = readString();
/* 202 */     if (value.isEmpty()) {
/* 203 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedBool().createWithContext(this);
/*     */     }
/*     */     
/* 206 */     if (value.equals("true"))
/* 207 */       return true; 
/* 208 */     if (value.equals("false")) {
/* 209 */       return false;
/*     */     }
/* 211 */     this.cursor = start;
/* 212 */     throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidBool().createWithContext(this, value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void expect(char c) throws CommandSyntaxException {
/* 217 */     if (!canRead() || peek() != c) {
/* 218 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedSymbol().createWithContext(this, String.valueOf(c));
/*     */     }
/* 220 */     skip();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\StringReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */