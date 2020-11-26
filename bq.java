/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ 
/*     */ public class bq implements BuiltInExceptionProvider {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   private static final Dynamic2CommandExceptionType b;
/*     */   private static final Dynamic2CommandExceptionType c;
/*     */   
/*     */   static {
/*  10 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.double.low", new Object[] { object1, ☃ }));
/*  11 */     b = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.double.big", new Object[] { object1, ☃ }));
/*     */     
/*  13 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.float.low", new Object[] { object1, ☃ }));
/*  14 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.float.big", new Object[] { object1, ☃ }));
/*     */     
/*  16 */     e = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.integer.low", new Object[] { object1, ☃ }));
/*  17 */     f = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.integer.big", new Object[] { object1, ☃ }));
/*     */     
/*  19 */     g = new DynamicCommandExceptionType(☃ -> new ir("argument.literal.incorrect", new Object[] { ☃ }));
/*     */   }
/*  21 */   private static final Dynamic2CommandExceptionType d; private static final Dynamic2CommandExceptionType e; private static final Dynamic2CommandExceptionType f; private static final DynamicCommandExceptionType g; private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new ir("parsing.quote.expected.start", new Object[0]));
/*  22 */   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(new ir("parsing.quote.expected.end", new Object[0])); private static final DynamicCommandExceptionType j; private static final DynamicCommandExceptionType k; private static final DynamicCommandExceptionType l; static {
/*  23 */     j = new DynamicCommandExceptionType(☃ -> new ir("parsing.quote.escape", new Object[] { ☃ }));
/*  24 */     k = new DynamicCommandExceptionType(☃ -> new ir("parsing.bool.invalid", new Object[] { ☃ }));
/*  25 */     l = new DynamicCommandExceptionType(☃ -> new ir("parsing.int.invalid", new Object[] { ☃ }));
/*  26 */   } private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(new ir("parsing.int.expected", new Object[0])); private static final DynamicCommandExceptionType n; static {
/*  27 */     n = new DynamicCommandExceptionType(☃ -> new ir("parsing.double.invalid", new Object[] { ☃ }));
/*  28 */   } private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(new ir("parsing.double.expected", new Object[0])); private static final DynamicCommandExceptionType p; static {
/*  29 */     p = new DynamicCommandExceptionType(☃ -> new ir("parsing.float.invalid", new Object[] { ☃ }));
/*  30 */   } private static final SimpleCommandExceptionType q = new SimpleCommandExceptionType(new ir("parsing.float.expected", new Object[0]));
/*  31 */   private static final SimpleCommandExceptionType r = new SimpleCommandExceptionType(new ir("parsing.bool.expected", new Object[0])); private static final DynamicCommandExceptionType s; static {
/*  32 */     s = new DynamicCommandExceptionType(☃ -> new ir("parsing.expected", new Object[] { ☃ }));
/*     */   }
/*  34 */   private static final SimpleCommandExceptionType t = new SimpleCommandExceptionType(new ir("command.unknown.command", new Object[0]));
/*  35 */   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(new ir("command.unknown.argument", new Object[0]));
/*  36 */   private static final SimpleCommandExceptionType v = new SimpleCommandExceptionType(new ir("command.expected.separator", new Object[0])); private static final DynamicCommandExceptionType w; static {
/*  37 */     w = new DynamicCommandExceptionType(☃ -> new ir("command.exception", new Object[] { ☃ }));
/*     */   }
/*     */   
/*     */   public Dynamic2CommandExceptionType doubleTooLow() {
/*  41 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType doubleTooHigh() {
/*  46 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType floatTooLow() {
/*  51 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType floatTooHigh() {
/*  56 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType integerTooLow() {
/*  61 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType integerTooHigh() {
/*  66 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType literalIncorrect() {
/*  71 */     return g;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
/*  76 */     return h;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
/*  81 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidEscape() {
/*  86 */     return j;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidBool() {
/*  91 */     return k;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidInt() {
/*  96 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedInt() {
/* 101 */     return m;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidDouble() {
/* 106 */     return n;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedDouble() {
/* 111 */     return o;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidFloat() {
/* 116 */     return p;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedFloat() {
/* 121 */     return q;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedBool() {
/* 126 */     return r;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerExpectedSymbol() {
/* 131 */     return s;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherUnknownCommand() {
/* 136 */     return t;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherUnknownArgument() {
/* 141 */     return u;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
/* 146 */     return v;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType dispatcherParseException() {
/* 151 */     return w;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */