/*     */ package com.mojang.brigadier.exceptions;public class BuiltInExceptions implements BuiltInExceptionProvider { private static final Dynamic2CommandExceptionType DOUBLE_TOO_SMALL;
/*     */   private static final Dynamic2CommandExceptionType DOUBLE_TOO_BIG;
/*     */   private static final Dynamic2CommandExceptionType FLOAT_TOO_SMALL;
/*     */   
/*     */   static {
/*   6 */     DOUBLE_TOO_SMALL = new Dynamic2CommandExceptionType((found, min) -> new LiteralMessage("Double must not be less than " + min + ", found " + found));
/*   7 */     DOUBLE_TOO_BIG = new Dynamic2CommandExceptionType((found, max) -> new LiteralMessage("Double must not be more than " + max + ", found " + found));
/*     */     
/*   9 */     FLOAT_TOO_SMALL = new Dynamic2CommandExceptionType((found, min) -> new LiteralMessage("Float must not be less than " + min + ", found " + found));
/*  10 */     FLOAT_TOO_BIG = new Dynamic2CommandExceptionType((found, max) -> new LiteralMessage("Float must not be more than " + max + ", found " + found));
/*     */     
/*  12 */     INTEGER_TOO_SMALL = new Dynamic2CommandExceptionType((found, min) -> new LiteralMessage("Integer must not be less than " + min + ", found " + found));
/*  13 */     INTEGER_TOO_BIG = new Dynamic2CommandExceptionType((found, max) -> new LiteralMessage("Integer must not be more than " + max + ", found " + found));
/*     */     
/*  15 */     LITERAL_INCORRECT = new DynamicCommandExceptionType(expected -> new LiteralMessage("Expected literal " + expected));
/*     */   }
/*  17 */   private static final Dynamic2CommandExceptionType FLOAT_TOO_BIG; private static final Dynamic2CommandExceptionType INTEGER_TOO_SMALL; private static final Dynamic2CommandExceptionType INTEGER_TOO_BIG; private static final DynamicCommandExceptionType LITERAL_INCORRECT; private static final SimpleCommandExceptionType READER_EXPECTED_START_OF_QUOTE = new SimpleCommandExceptionType((Message)new LiteralMessage("Expected quote to start a string"));
/*  18 */   private static final SimpleCommandExceptionType READER_EXPECTED_END_OF_QUOTE = new SimpleCommandExceptionType((Message)new LiteralMessage("Unclosed quoted string")); private static final DynamicCommandExceptionType READER_INVALID_ESCAPE; private static final DynamicCommandExceptionType READER_INVALID_BOOL; private static final DynamicCommandExceptionType READER_INVALID_INT; static {
/*  19 */     READER_INVALID_ESCAPE = new DynamicCommandExceptionType(character -> new LiteralMessage("Invalid escape sequence '" + character + "' in quoted string"));
/*  20 */     READER_INVALID_BOOL = new DynamicCommandExceptionType(value -> new LiteralMessage("Invalid bool, expected true or false but found '" + value + "'"));
/*  21 */     READER_INVALID_INT = new DynamicCommandExceptionType(value -> new LiteralMessage("Invalid integer '" + value + "'"));
/*  22 */   } private static final SimpleCommandExceptionType READER_EXPECTED_INT = new SimpleCommandExceptionType((Message)new LiteralMessage("Expected integer")); private static final DynamicCommandExceptionType READER_INVALID_DOUBLE; static {
/*  23 */     READER_INVALID_DOUBLE = new DynamicCommandExceptionType(value -> new LiteralMessage("Invalid double '" + value + "'"));
/*  24 */   } private static final SimpleCommandExceptionType READER_EXPECTED_DOUBLE = new SimpleCommandExceptionType((Message)new LiteralMessage("Expected double")); private static final DynamicCommandExceptionType READER_INVALID_FLOAT; static {
/*  25 */     READER_INVALID_FLOAT = new DynamicCommandExceptionType(value -> new LiteralMessage("Invalid float '" + value + "'"));
/*  26 */   } private static final SimpleCommandExceptionType READER_EXPECTED_FLOAT = new SimpleCommandExceptionType((Message)new LiteralMessage("Expected float"));
/*  27 */   private static final SimpleCommandExceptionType READER_EXPECTED_BOOL = new SimpleCommandExceptionType((Message)new LiteralMessage("Expected bool")); private static final DynamicCommandExceptionType READER_EXPECTED_SYMBOL; static {
/*  28 */     READER_EXPECTED_SYMBOL = new DynamicCommandExceptionType(symbol -> new LiteralMessage("Expected '" + symbol + "'"));
/*     */   }
/*  30 */   private static final SimpleCommandExceptionType DISPATCHER_UNKNOWN_COMMAND = new SimpleCommandExceptionType((Message)new LiteralMessage("Unknown command"));
/*  31 */   private static final SimpleCommandExceptionType DISPATCHER_UNKNOWN_ARGUMENT = new SimpleCommandExceptionType((Message)new LiteralMessage("Incorrect argument for command"));
/*  32 */   private static final SimpleCommandExceptionType DISPATCHER_EXPECTED_ARGUMENT_SEPARATOR = new SimpleCommandExceptionType((Message)new LiteralMessage("Expected whitespace to end one argument, but found trailing data")); private static final DynamicCommandExceptionType DISPATCHER_PARSE_EXCEPTION; static {
/*  33 */     DISPATCHER_PARSE_EXCEPTION = new DynamicCommandExceptionType(message -> new LiteralMessage("Could not parse command: " + message));
/*     */   }
/*     */   
/*     */   public Dynamic2CommandExceptionType doubleTooLow() {
/*  37 */     return DOUBLE_TOO_SMALL;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType doubleTooHigh() {
/*  42 */     return DOUBLE_TOO_BIG;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType floatTooLow() {
/*  47 */     return FLOAT_TOO_SMALL;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType floatTooHigh() {
/*  52 */     return FLOAT_TOO_BIG;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType integerTooLow() {
/*  57 */     return INTEGER_TOO_SMALL;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType integerTooHigh() {
/*  62 */     return INTEGER_TOO_BIG;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType literalIncorrect() {
/*  67 */     return LITERAL_INCORRECT;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
/*  72 */     return READER_EXPECTED_START_OF_QUOTE;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
/*  77 */     return READER_EXPECTED_END_OF_QUOTE;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidEscape() {
/*  82 */     return READER_INVALID_ESCAPE;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidBool() {
/*  87 */     return READER_INVALID_BOOL;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidInt() {
/*  92 */     return READER_INVALID_INT;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedInt() {
/*  97 */     return READER_EXPECTED_INT;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidDouble() {
/* 102 */     return READER_INVALID_DOUBLE;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedDouble() {
/* 107 */     return READER_EXPECTED_DOUBLE;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidFloat() {
/* 112 */     return READER_INVALID_FLOAT;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedFloat() {
/* 117 */     return READER_EXPECTED_FLOAT;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedBool() {
/* 122 */     return READER_EXPECTED_BOOL;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerExpectedSymbol() {
/* 127 */     return READER_EXPECTED_SYMBOL;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherUnknownCommand() {
/* 132 */     return DISPATCHER_UNKNOWN_COMMAND;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherUnknownArgument() {
/* 137 */     return DISPATCHER_UNKNOWN_ARGUMENT;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
/* 142 */     return DISPATCHER_EXPECTED_ARGUMENT_SEPARATOR;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType dispatcherParseException() {
/* 147 */     return DISPATCHER_PARSE_EXCEPTION;
/*     */   } }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\BuiltInExceptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */