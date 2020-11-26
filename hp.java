/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.List;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hp
/*     */ {
/*  16 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.nbt.trailing", new Object[0]));
/*  17 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("argument.nbt.expected.key", new Object[0]));
/*  18 */   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("argument.nbt.expected.value", new Object[0])); static {
/*  19 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.nbt.list.mixed", new Object[] { ☃, object1 }));
/*  20 */     e = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.nbt.array.mixed", new Object[] { ☃, object1 }));
/*  21 */     f = new DynamicCommandExceptionType(☃ -> new ir("argument.nbt.array.invalid", new Object[] { ☃ }));
/*     */   }
/*     */ 
/*     */   
/*     */   public static final Dynamic2CommandExceptionType d;
/*     */   
/*     */   public static final Dynamic2CommandExceptionType e;
/*     */   
/*     */   public static final DynamicCommandExceptionType f;
/*  30 */   private static final Pattern g = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
/*  31 */   private static final Pattern h = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
/*  32 */   private static final Pattern i = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
/*  33 */   private static final Pattern j = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
/*  34 */   private static final Pattern k = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
/*  35 */   private static final Pattern l = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
/*  36 */   private static final Pattern m = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
/*     */   
/*     */   private final StringReader n;
/*     */   
/*     */   public static gy a(String ☃) throws CommandSyntaxException {
/*  41 */     return (new hp(new StringReader(☃))).a();
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   gy a() throws CommandSyntaxException {
/*  46 */     gy ☃ = f();
/*     */     
/*  48 */     this.n.skipWhitespace();
/*     */     
/*  50 */     if (this.n.canRead()) {
/*  51 */       throw a.createWithContext(this.n);
/*     */     }
/*  53 */     return ☃;
/*     */   }
/*     */   
/*     */   public hp(StringReader ☃) {
/*  57 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   protected String b() throws CommandSyntaxException {
/*  61 */     this.n.skipWhitespace();
/*     */     
/*  63 */     if (!this.n.canRead()) {
/*  64 */       throw b.createWithContext(this.n);
/*     */     }
/*     */     
/*  67 */     return this.n.readString();
/*     */   }
/*     */   
/*     */   protected ho c() throws CommandSyntaxException {
/*  71 */     this.n.skipWhitespace();
/*  72 */     int ☃ = this.n.getCursor();
/*     */     
/*  74 */     if (this.n.peek() == '"') {
/*  75 */       return new hn(this.n.readQuotedString());
/*     */     }
/*     */     
/*  78 */     String str = this.n.readUnquotedString();
/*  79 */     if (str.isEmpty()) {
/*  80 */       this.n.setCursor(☃);
/*  81 */       throw c.createWithContext(this.n);
/*     */     } 
/*  83 */     return b(str);
/*     */   }
/*     */   
/*     */   private ho b(String ☃) {
/*     */     try {
/*  88 */       if (i.matcher(☃).matches()) {
/*  89 */         return new hb(Float.parseFloat(☃.substring(0, ☃.length() - 1)));
/*     */       }
/*  91 */       if (j.matcher(☃).matches()) {
/*  92 */         return new gw(Byte.parseByte(☃.substring(0, ☃.length() - 1)));
/*     */       }
/*  94 */       if (k.matcher(☃).matches()) {
/*  95 */         return new hg(Long.parseLong(☃.substring(0, ☃.length() - 1)));
/*     */       }
/*  97 */       if (l.matcher(☃).matches()) {
/*  98 */         return new hm(Short.parseShort(☃.substring(0, ☃.length() - 1)));
/*     */       }
/* 100 */       if (m.matcher(☃).matches()) {
/* 101 */         return new hd(Integer.parseInt(☃));
/*     */       }
/* 103 */       if (h.matcher(☃).matches()) {
/* 104 */         return new gz(Double.parseDouble(☃.substring(0, ☃.length() - 1)));
/*     */       }
/* 106 */       if (g.matcher(☃).matches()) {
/* 107 */         return new gz(Double.parseDouble(☃));
/*     */       }
/* 109 */       if ("true".equalsIgnoreCase(☃)) {
/* 110 */         return new gw((byte)1);
/*     */       }
/* 112 */       if ("false".equalsIgnoreCase(☃)) {
/* 113 */         return new gw((byte)0);
/*     */       }
/* 115 */     } catch (NumberFormatException numberFormatException) {}
/*     */ 
/*     */     
/* 118 */     return new hn(☃);
/*     */   }
/*     */   
/*     */   protected ho d() throws CommandSyntaxException {
/* 122 */     this.n.skipWhitespace();
/*     */     
/* 124 */     if (!this.n.canRead()) {
/* 125 */       throw c.createWithContext(this.n);
/*     */     }
/*     */     
/* 128 */     char ☃ = this.n.peek();
/* 129 */     if (☃ == '{')
/* 130 */       return f(); 
/* 131 */     if (☃ == '[') {
/* 132 */       return e();
/*     */     }
/* 134 */     return c();
/*     */   }
/*     */   
/*     */   protected ho e() throws CommandSyntaxException {
/* 138 */     if (this.n.canRead(3) && 
/* 139 */       this.n.peek(1) != '"' && this.n.peek(2) == ';') {
/* 140 */       return h();
/*     */     }
/*     */     
/* 143 */     return g();
/*     */   }
/*     */   
/*     */   public gy f() throws CommandSyntaxException {
/* 147 */     a('{');
/*     */     
/* 149 */     gy ☃ = new gy();
/*     */     
/* 151 */     this.n.skipWhitespace();
/* 152 */     while (this.n.canRead() && this.n.peek() != '}') {
/* 153 */       int i = this.n.getCursor();
/* 154 */       String str = b();
/* 155 */       if (str.isEmpty()) {
/* 156 */         this.n.setCursor(i);
/* 157 */         throw b.createWithContext(this.n);
/*     */       } 
/*     */       
/* 160 */       a(':');
/*     */       
/* 162 */       ☃.a(str, d());
/*     */       
/* 164 */       if (!i())
/*     */         break; 
/* 166 */       if (!this.n.canRead()) {
/* 167 */         throw b.createWithContext(this.n);
/*     */       }
/*     */     } 
/* 170 */     a('}');
/*     */     
/* 172 */     return ☃;
/*     */   }
/*     */   
/*     */   private ho g() throws CommandSyntaxException {
/* 176 */     a('[');
/*     */     
/* 178 */     this.n.skipWhitespace();
/*     */     
/* 180 */     if (!this.n.canRead()) {
/* 181 */       throw c.createWithContext(this.n);
/*     */     }
/*     */     
/* 184 */     he ☃ = new he();
/*     */     
/* 186 */     int i = -1;
/* 187 */     while (this.n.peek() != ']') {
/* 188 */       int j = this.n.getCursor();
/* 189 */       ho ho = d();
/*     */       
/* 191 */       int k = ho.a();
/* 192 */       if (i < 0) {
/* 193 */         i = k;
/* 194 */       } else if (k != i) {
/* 195 */         this.n.setCursor(j);
/* 196 */         throw d.createWithContext(this.n, ho.n(k), ho.n(i));
/*     */       } 
/*     */       
/* 199 */       ☃.a(ho);
/*     */       
/* 201 */       if (!i())
/*     */         break; 
/* 203 */       if (!this.n.canRead()) {
/* 204 */         throw c.createWithContext(this.n);
/*     */       }
/*     */     } 
/* 207 */     a(']');
/*     */     
/* 209 */     return ☃;
/*     */   }
/*     */   
/*     */   private ho h() throws CommandSyntaxException {
/* 213 */     a('[');
/* 214 */     int ☃ = this.n.getCursor();
/* 215 */     char c = this.n.read();
/* 216 */     this.n.read();
/*     */     
/* 218 */     this.n.skipWhitespace();
/*     */     
/* 220 */     if (!this.n.canRead()) {
/* 221 */       throw c.createWithContext(this.n);
/*     */     }
/*     */     
/* 224 */     if (c == 'B')
/* 225 */       return new gv(a((byte)7, (byte)1)); 
/* 226 */     if (c == 'L')
/* 227 */       return new hf(a((byte)12, (byte)4)); 
/* 228 */     if (c == 'I') {
/* 229 */       return new hc(a((byte)11, (byte)3));
/*     */     }
/* 231 */     this.n.setCursor(☃);
/* 232 */     throw f.createWithContext(this.n, String.valueOf(c));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private <T extends Number> List<T> a(byte ☃, byte b1) throws CommandSyntaxException {
/* 238 */     List<T> list = Lists.newArrayList();
/*     */     
/* 240 */     while (this.n.peek() != ']') {
/* 241 */       int i = this.n.getCursor();
/* 242 */       ho ho = d();
/*     */       
/* 244 */       int j = ho.a();
/* 245 */       if (j != b1) {
/* 246 */         this.n.setCursor(i);
/* 247 */         throw e.createWithContext(this.n, ho.n(j), ho.n(☃));
/*     */       } 
/*     */       
/* 250 */       if (b1 == 1) {
/* 251 */         list.add((T)Byte.valueOf(((hl)ho).g()));
/* 252 */       } else if (b1 == 4) {
/* 253 */         list.add((T)Long.valueOf(((hl)ho).d()));
/*     */       } else {
/* 255 */         list.add((T)Integer.valueOf(((hl)ho).e()));
/*     */       } 
/*     */       
/* 258 */       if (!i())
/*     */         break; 
/* 260 */       if (!this.n.canRead()) {
/* 261 */         throw c.createWithContext(this.n);
/*     */       }
/*     */     } 
/* 264 */     a(']');
/*     */     
/* 266 */     return list;
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 270 */     this.n.skipWhitespace();
/* 271 */     if (this.n.canRead() && this.n.peek() == ',') {
/* 272 */       this.n.skip();
/* 273 */       this.n.skipWhitespace();
/* 274 */       return true;
/*     */     } 
/* 276 */     return false;
/*     */   }
/*     */   
/*     */   private void a(char ☃) throws CommandSyntaxException {
/* 280 */     this.n.skipWhitespace();
/*     */     
/* 282 */     this.n.expect(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */