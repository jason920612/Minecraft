/*     */ import com.google.common.primitives.Doubles;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.ToDoubleFunction;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ds
/*     */ {
/*  47 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.entity.invalid", new Object[0])); public static final DynamicCommandExceptionType b; static {
/*  48 */     b = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.selector.unknown", new Object[] { ☃ }));
/*  49 */   } public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("argument.entity.selector.not_allowed", new Object[0]));
/*  50 */   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("argument.entity.selector.missing", new Object[0]));
/*  51 */   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("argument.entity.options.unterminated", new Object[0])); public static final DynamicCommandExceptionType f;
/*  52 */   static { f = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.options.valueless", new Object[] { ☃ })); } public static final BiConsumer<cee, List<? extends aer>> g = (☃, list) -> {
/*     */     
/*     */     }; public static final BiConsumer<cee, List<? extends aer>> h; static {
/*  55 */     h = ((☃, list) -> list.sort(()));
/*  56 */     i = ((☃, list) -> list.sort(()));
/*  57 */     j = ((☃, list) -> Collections.shuffle(list));
/*     */     
/*  59 */     k = ((☃, consumer) -> ☃.buildFuture());
/*     */   }
/*     */   public static final BiConsumer<cee, List<? extends aer>> i; public static final BiConsumer<cee, List<? extends aer>> j; public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> k; private final StringReader l;
/*     */   private final boolean m;
/*     */   private int n;
/*     */   private boolean o;
/*     */   private boolean p;
/*  66 */   private ba.c q = ba.c.e;
/*  67 */   private ba.d r = ba.d.e;
/*     */   @Nullable
/*     */   private Double s;
/*     */   @Nullable
/*     */   private Double t;
/*     */   @Nullable
/*     */   private Double u;
/*     */   @Nullable
/*     */   private Double v;
/*     */   @Nullable
/*     */   private Double w;
/*     */   @Nullable
/*     */   private Double x;
/*  80 */   private bn y = bn.a;
/*  81 */   private bn z = bn.a;
/*     */   private Predicate<aer> A = ☃ -> true;
/*  83 */   private BiConsumer<cee, List<? extends aer>> B = g;
/*     */   private boolean C;
/*     */   @Nullable
/*     */   private String D;
/*     */   private int E;
/*     */   @Nullable
/*     */   private UUID F;
/*  90 */   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> G = k;
/*     */   private boolean H;
/*     */   private boolean I;
/*     */   private boolean J;
/*     */   private boolean K;
/*     */   private boolean L;
/*     */   private boolean M;
/*     */   private boolean N;
/*     */   private boolean O;
/*     */   private Class<? extends aer> P;
/*     */   private boolean Q;
/*     */   private boolean R;
/*     */   private boolean S;
/*     */   private boolean T;
/*     */   
/*     */   public ds(StringReader ☃) {
/* 106 */     this(☃, true);
/*     */   }
/*     */   
/*     */   public ds(StringReader ☃, boolean bool) {
/* 110 */     this.l = ☃;
/* 111 */     this.m = bool;
/*     */   }
/*     */   public dr a() {
/*     */     cea ☃;
/*     */     Function<cee, cee> function;
/* 116 */     if (this.v != null || this.w != null || this.x != null) {
/* 117 */       ☃ = a((this.v == null) ? 0.0D : this.v.doubleValue(), (this.w == null) ? 0.0D : this.w.doubleValue(), (this.x == null) ? 0.0D : this.x.doubleValue());
/* 118 */     } else if (this.q.b() != null) {
/* 119 */       float f = this.q.b().floatValue();
/* 120 */       ☃ = new cea(-f, -f, -f, (f + 1.0F), (f + 1.0F), (f + 1.0F));
/*     */     } else {
/* 122 */       ☃ = null;
/*     */     } 
/*     */     
/* 125 */     if (this.s == null && this.t == null && this.u == null) {
/* 126 */       function = (☃ -> ☃);
/*     */     } else {
/* 128 */       function = (☃ -> new cee((this.s == null) ? ☃.b : this.s.doubleValue(), (this.t == null) ? ☃.c : this.t.doubleValue(), (this.u == null) ? ☃.d : this.u.doubleValue()));
/*     */     } 
/* 130 */     return new dr(this.n, this.o, this.p, this.A, this.q, function, ☃, this.B, this.C, this.D, this.F, (this.P == null) ? aer.class : this.P, this.T);
/*     */   }
/*     */   
/*     */   private cea a(double ☃, double d1, double d2) {
/* 134 */     boolean bool1 = (☃ < 0.0D);
/* 135 */     boolean bool2 = (d1 < 0.0D);
/* 136 */     boolean bool3 = (d2 < 0.0D);
/* 137 */     double d3 = bool1 ? ☃ : 0.0D;
/* 138 */     double d4 = bool2 ? d1 : 0.0D;
/* 139 */     double d5 = bool3 ? d2 : 0.0D;
/* 140 */     double d6 = (bool1 ? 0.0D : ☃) + 1.0D;
/* 141 */     double d7 = (bool2 ? 0.0D : d1) + 1.0D;
/* 142 */     double d8 = (bool3 ? 0.0D : d2) + 1.0D;
/* 143 */     return new cea(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   private void I() {
/* 147 */     if (this.y != bn.a) {
/* 148 */       this.A = this.A.and(a(this.y, ☃ -> ☃.x));
/*     */     }
/* 150 */     if (this.z != bn.a) {
/* 151 */       this.A = this.A.and(a(this.z, ☃ -> ☃.w));
/*     */     }
/* 153 */     if (!this.r.c()) {
/* 154 */       this.A = this.A.and(☃ -> !(☃ instanceof tf) ? false : this.r.d(((tf)☃).bW));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Predicate<aer> a(bn ☃, ToDoubleFunction<aer> toDoubleFunction) {
/* 164 */     double d1 = xq.g((☃.a() == null) ? 0.0F : ☃.a().floatValue());
/* 165 */     double d2 = xq.g((☃.b() == null) ? 359.0F : ☃.b().floatValue());
/* 166 */     return aer1 -> {
/*     */         double d3 = xq.g(☃.applyAsDouble(aer1));
/*     */         
/* 169 */         return (d1 > d2) ? ((d3 >= d1 || d3 <= d2)) : (
/*     */           
/* 171 */           (d3 >= d1 && d3 <= d2));
/*     */       };
/*     */   }
/*     */   
/*     */   protected void b() throws CommandSyntaxException {
/* 176 */     this.T = true;
/* 177 */     this.G = this::d;
/* 178 */     if (!this.l.canRead()) {
/* 179 */       throw d.createWithContext(this.l);
/*     */     }
/* 181 */     int ☃ = this.l.getCursor();
/* 182 */     char c1 = this.l.read();
/* 183 */     if (c1 == 'p') {
/* 184 */       this.n = 1;
/* 185 */       this.o = false;
/* 186 */       this.B = h;
/* 187 */       a((Class)tf.class);
/* 188 */     } else if (c1 == 'a') {
/* 189 */       this.n = Integer.MAX_VALUE;
/* 190 */       this.o = false;
/* 191 */       this.B = g;
/* 192 */       a((Class)tf.class);
/* 193 */     } else if (c1 == 'r') {
/* 194 */       this.n = 1;
/* 195 */       this.o = false;
/* 196 */       this.B = j;
/* 197 */       a((Class)tf.class);
/* 198 */     } else if (c1 == 's') {
/* 199 */       this.n = 1;
/* 200 */       this.o = true;
/* 201 */       this.C = true;
/* 202 */     } else if (c1 == 'e') {
/* 203 */       this.n = Integer.MAX_VALUE;
/* 204 */       this.o = true;
/* 205 */       this.B = g;
/* 206 */       this.A = aer::aF;
/*     */     } else {
/* 208 */       this.l.setCursor(☃);
/* 209 */       throw b.createWithContext(this.l, '@' + String.valueOf(c1));
/*     */     } 
/*     */     
/* 212 */     this.G = this::e;
/* 213 */     if (this.l.canRead() && this.l.peek() == '[') {
/* 214 */       this.l.skip();
/* 215 */       this.G = this::f;
/* 216 */       d();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void c() throws CommandSyntaxException {
/* 221 */     if (this.l.canRead()) {
/* 222 */       this.G = this::c;
/*     */     }
/* 224 */     int ☃ = this.l.getCursor();
/* 225 */     String str = this.l.readString();
/*     */     
/*     */     try {
/* 228 */       this.F = UUID.fromString(str);
/* 229 */       this.o = true;
/* 230 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 231 */       if (str.isEmpty() || str.length() > 16) {
/* 232 */         this.l.setCursor(☃);
/* 233 */         throw a.createWithContext(this.l);
/*     */       } 
/* 235 */       this.o = false;
/* 236 */       this.D = str;
/*     */     } 
/*     */     
/* 239 */     this.n = 1;
/*     */   }
/*     */   
/*     */   protected void d() throws CommandSyntaxException {
/* 243 */     this.G = this::g;
/* 244 */     this.l.skipWhitespace();
/* 245 */     while (this.l.canRead() && this.l.peek() != ']') {
/* 246 */       this.l.skipWhitespace();
/* 247 */       int ☃ = this.l.getCursor();
/* 248 */       String str = this.l.readString();
/* 249 */       dt.a a = dt.a(this, str, ☃);
/* 250 */       this.l.skipWhitespace();
/* 251 */       if (!this.l.canRead() || this.l.peek() != '=') {
/* 252 */         this.l.setCursor(☃);
/* 253 */         throw f.createWithContext(this.l, str);
/*     */       } 
/* 255 */       this.l.skip();
/* 256 */       this.l.skipWhitespace();
/*     */       
/* 258 */       this.G = k;
/* 259 */       a.handle(this);
/* 260 */       this.l.skipWhitespace();
/*     */       
/* 262 */       this.G = this::h;
/* 263 */       if (this.l.canRead()) {
/* 264 */         if (this.l.peek() == ',') {
/* 265 */           this.l.skip();
/* 266 */           this.G = this::g; continue;
/* 267 */         }  if (this.l.peek() == ']') {
/*     */           break;
/*     */         }
/* 270 */         throw e.createWithContext(this.l);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 275 */     if (this.l.canRead()) {
/* 276 */       this.l.skip();
/* 277 */       this.G = k;
/*     */     } else {
/* 279 */       throw e.createWithContext(this.l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 284 */     this.l.skipWhitespace();
/* 285 */     if (this.l.canRead() && this.l.peek() == '!') {
/* 286 */       this.l.skip();
/* 287 */       this.l.skipWhitespace();
/* 288 */       return true;
/*     */     } 
/* 290 */     return false;
/*     */   }
/*     */   
/*     */   public StringReader f() {
/* 294 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(Predicate<aer> ☃) {
/* 298 */     this.A = this.A.and(☃);
/*     */   }
/*     */   
/*     */   public void g() {
/* 302 */     this.p = true;
/*     */   }
/*     */   
/*     */   public ba.c h() {
/* 306 */     return this.q;
/*     */   }
/*     */   
/*     */   public void a(ba.c ☃) {
/* 310 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   public ba.d i() {
/* 314 */     return this.r;
/*     */   }
/*     */   
/*     */   public void a(ba.d ☃) {
/* 318 */     this.r = ☃;
/*     */   }
/*     */   
/*     */   public bn j() {
/* 322 */     return this.y;
/*     */   }
/*     */   
/*     */   public void a(bn ☃) {
/* 326 */     this.y = ☃;
/*     */   }
/*     */   
/*     */   public bn k() {
/* 330 */     return this.z;
/*     */   }
/*     */   
/*     */   public void b(bn ☃) {
/* 334 */     this.z = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double l() {
/* 339 */     return this.s;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double m() {
/* 344 */     return this.t;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double n() {
/* 349 */     return this.u;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 353 */     this.s = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 357 */     this.t = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 361 */     this.u = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void d(double ☃) {
/* 365 */     this.v = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void e(double ☃) {
/* 369 */     this.w = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void f(double ☃) {
/* 373 */     this.x = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double o() {
/* 378 */     return this.v;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double p() {
/* 383 */     return this.w;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double q() {
/* 388 */     return this.x;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 392 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 396 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(BiConsumer<cee, List<? extends aer>> ☃) {
/* 404 */     this.B = ☃;
/*     */   }
/*     */   
/*     */   public dr s() throws CommandSyntaxException {
/* 408 */     this.E = this.l.getCursor();
/* 409 */     this.G = this::b;
/* 410 */     if (this.l.canRead() && this.l.peek() == '@') {
/* 411 */       if (!this.m) {
/* 412 */         throw c.createWithContext(this.l);
/*     */       }
/* 414 */       this.l.skip();
/* 415 */       b();
/*     */     } else {
/* 417 */       c();
/*     */     } 
/* 419 */     I();
/* 420 */     return a();
/*     */   }
/*     */   
/*     */   private static void a(SuggestionsBuilder ☃) {
/* 424 */     ☃.suggest("@p", new ir("argument.entity.selector.nearestPlayer", new Object[0]));
/* 425 */     ☃.suggest("@a", new ir("argument.entity.selector.allPlayers", new Object[0]));
/* 426 */     ☃.suggest("@r", new ir("argument.entity.selector.randomPlayer", new Object[0]));
/* 427 */     ☃.suggest("@s", new ir("argument.entity.selector.self", new Object[0]));
/* 428 */     ☃.suggest("@e", new ir("argument.entity.selector.allEntities", new Object[0]));
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> b(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 432 */     consumer.accept(☃);
/* 433 */     if (this.m) {
/* 434 */       a(☃);
/*     */     }
/* 436 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> c(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 440 */     SuggestionsBuilder suggestionsBuilder = ☃.createOffset(this.E);
/* 441 */     consumer.accept(suggestionsBuilder);
/* 442 */     return ☃.add(suggestionsBuilder).buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> d(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 446 */     SuggestionsBuilder suggestionsBuilder = ☃.createOffset(☃.getStart() - 1);
/* 447 */     a(suggestionsBuilder);
/* 448 */     ☃.add(suggestionsBuilder);
/* 449 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> e(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 453 */     ☃.suggest(String.valueOf('['));
/* 454 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> f(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 458 */     ☃.suggest(String.valueOf(']'));
/* 459 */     dt.a(this, ☃);
/* 460 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> g(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 464 */     dt.a(this, ☃);
/* 465 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> h(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 469 */     ☃.suggest(String.valueOf(','));
/* 470 */     ☃.suggest(String.valueOf(']'));
/* 471 */     return ☃.buildFuture();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 480 */     return this.C;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> ☃) {
/* 488 */     this.G = ☃;
/*     */   }
/*     */   
/*     */   public CompletableFuture<Suggestions> a(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 492 */     return this.G.apply(☃.createOffset(this.l.getCursor()), consumer);
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 496 */     return this.H;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 500 */     this.H = ☃;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 504 */     return this.I;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 508 */     this.I = ☃;
/*     */   }
/*     */   
/*     */   public boolean w() {
/* 512 */     return this.J;
/*     */   }
/*     */   
/*     */   public void e(boolean ☃) {
/* 516 */     this.J = ☃;
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 520 */     return this.K;
/*     */   }
/*     */   
/*     */   public void f(boolean ☃) {
/* 524 */     this.K = ☃;
/*     */   }
/*     */   
/*     */   public boolean y() {
/* 528 */     return this.L;
/*     */   }
/*     */   
/*     */   public void g(boolean ☃) {
/* 532 */     this.L = ☃;
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 536 */     return this.M;
/*     */   }
/*     */   
/*     */   public void h(boolean ☃) {
/* 540 */     this.M = ☃;
/*     */   }
/*     */   
/*     */   public boolean A() {
/* 544 */     return this.N;
/*     */   }
/*     */   
/*     */   public void i(boolean ☃) {
/* 548 */     this.N = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j(boolean ☃) {
/* 556 */     this.O = ☃;
/*     */   }
/*     */   
/*     */   public void a(Class<? extends aer> ☃) {
/* 560 */     this.P = ☃;
/*     */   }
/*     */   
/*     */   public void C() {
/* 564 */     this.Q = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean E() {
/* 573 */     return (this.P != null);
/*     */   }
/*     */   
/*     */   public boolean F() {
/* 577 */     return this.Q;
/*     */   }
/*     */   
/*     */   public boolean G() {
/* 581 */     return this.R;
/*     */   }
/*     */   
/*     */   public void k(boolean ☃) {
/* 585 */     this.R = ☃;
/*     */   }
/*     */   
/*     */   public boolean H() {
/* 589 */     return this.S;
/*     */   }
/*     */   
/*     */   public void l(boolean ☃) {
/* 593 */     this.S = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */