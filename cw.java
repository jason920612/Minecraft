/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cw
/*     */ {
/*     */   public static final DynamicCommandExceptionType b;
/*     */   public static final Dynamic2CommandExceptionType c;
/*     */   public static final Dynamic2CommandExceptionType d;
/*     */   public static final Dynamic3CommandExceptionType e;
/*     */   public static final Dynamic2CommandExceptionType f;
/*  33 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.block.tag.disallowed", new Object[0])); static {
/*  34 */     b = new DynamicCommandExceptionType(☃ -> new ir("argument.block.id.invalid", new Object[] { ☃ }));
/*  35 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.block.property.unknown", new Object[] { ☃, object1 }));
/*  36 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.block.property.duplicate", new Object[] { object1, ☃ }));
/*  37 */     e = new Dynamic3CommandExceptionType((☃, object1, object2) -> new ir("argument.block.property.invalid", new Object[] { ☃, object2, object1 }));
/*  38 */     f = new Dynamic2CommandExceptionType((☃, object1) -> new ir("argument.block.property.novalue", new Object[] { ☃, object1 }));
/*  39 */   } public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new ir("argument.block.property.unclosed", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> h = SuggestionsBuilder::buildFuture;
/*     */   
/*     */   private final StringReader i;
/*     */   private final boolean j;
/*  52 */   private final Map<bmm<?>, Comparable<?>> k = Maps.newHashMap();
/*  53 */   private final Map<String, String> l = Maps.newHashMap();
/*  54 */   private pc m = new pc("");
/*     */   private ble<bcs, blc> n;
/*     */   private blc o;
/*     */   @Nullable
/*     */   private gy p;
/*  59 */   private pc q = new pc("");
/*     */   private int r;
/*  61 */   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> s = h;
/*     */   
/*     */   public cw(StringReader ☃, boolean bool) {
/*  64 */     this.i = ☃;
/*  65 */     this.j = bool;
/*     */   }
/*     */   
/*     */   public Map<bmm<?>, Comparable<?>> a() {
/*  69 */     return this.k;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public blc b() {
/*  74 */     return this.o;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gy c() {
/*  79 */     return this.p;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public pc d() {
/*  84 */     return this.q;
/*     */   }
/*     */   
/*     */   public cw a(boolean ☃) throws CommandSyntaxException {
/*  88 */     this.s = this::l;
/*  89 */     if (this.i.canRead() && this.i.peek() == '#') {
/*  90 */       f();
/*  91 */       this.s = this::i;
/*  92 */       if (this.i.canRead() && this.i.peek() == '[') {
/*  93 */         h();
/*  94 */         this.s = this::f;
/*     */       } 
/*     */     } else {
/*  97 */       e();
/*  98 */       this.s = this::j;
/*  99 */       if (this.i.canRead() && this.i.peek() == '[') {
/* 100 */         g();
/* 101 */         this.s = this::f;
/*     */       } 
/*     */     } 
/* 104 */     if (☃ && this.i.canRead() && this.i.peek() == '{') {
/* 105 */       this.s = h;
/* 106 */       i();
/*     */     } 
/* 108 */     return this;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> b(SuggestionsBuilder ☃) {
/* 112 */     if (☃.getRemaining().isEmpty()) {
/* 113 */       ☃.suggest(String.valueOf(']'));
/*     */     }
/*     */     
/* 116 */     return d(☃);
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> c(SuggestionsBuilder ☃) {
/* 120 */     if (☃.getRemaining().isEmpty()) {
/* 121 */       ☃.suggest(String.valueOf(']'));
/*     */     }
/* 123 */     return e(☃);
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> d(SuggestionsBuilder ☃) {
/* 127 */     String str = ☃.getRemaining().toLowerCase(Locale.ROOT);
/* 128 */     for (bmm<?> bmm : this.o.a()) {
/* 129 */       if (!this.k.containsKey(bmm) && bmm.a().startsWith(str)) {
/* 130 */         ☃.suggest(bmm.a() + '=');
/*     */       }
/*     */     } 
/* 133 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> e(SuggestionsBuilder ☃) {
/* 137 */     String str = ☃.getRemaining().toLowerCase(Locale.ROOT);
/* 138 */     if (this.q != null && !this.q.a().isEmpty()) {
/* 139 */       wz<bcs> wz = wv.a().a(this.q);
/* 140 */       if (wz != null) {
/* 141 */         for (bcs bcs : wz.a()) {
/* 142 */           for (bmm<?> bmm : bcs.o().d()) {
/* 143 */             if (!this.l.containsKey(bmm.a()) && bmm.a().startsWith(str)) {
/* 144 */               ☃.suggest(bmm.a() + '=');
/*     */             }
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/* 150 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> f(SuggestionsBuilder ☃) {
/* 154 */     if (☃.getRemaining().isEmpty() && k()) {
/* 155 */       ☃.suggest(String.valueOf('{'));
/*     */     }
/* 157 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 161 */     if (this.o != null) {
/* 162 */       return this.o.c().i();
/*     */     }
/*     */     
/* 165 */     if (this.q != null) {
/* 166 */       wz<bcs> ☃ = wv.a().a(this.q);
/*     */       
/* 168 */       if (☃ != null) {
/* 169 */         for (bcs bcs : ☃.a()) {
/* 170 */           if (bcs.i()) {
/* 171 */             return true;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> g(SuggestionsBuilder ☃) {
/* 181 */     if (☃.getRemaining().isEmpty()) {
/* 182 */       ☃.suggest(String.valueOf('='));
/*     */     }
/* 184 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> h(SuggestionsBuilder ☃) {
/* 188 */     if (☃.getRemaining().isEmpty()) {
/* 189 */       ☃.suggest(String.valueOf(']'));
/*     */     }
/* 191 */     if (☃.getRemaining().isEmpty() && this.k.size() < this.o.a().size()) {
/* 192 */       ☃.suggest(String.valueOf(','));
/*     */     }
/* 194 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> SuggestionsBuilder a(SuggestionsBuilder ☃, bmm<T> bmm1) {
/* 198 */     for (Comparable comparable : bmm1.d()) {
/* 199 */       if (comparable instanceof Integer) {
/* 200 */         ☃.suggest(((Integer)comparable).intValue()); continue;
/*     */       } 
/* 202 */       ☃.suggest(bmm1.a((T)comparable));
/*     */     } 
/*     */     
/* 205 */     return ☃;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> a(SuggestionsBuilder ☃, String str) {
/* 209 */     boolean bool = false;
/* 210 */     if (this.q != null && !this.q.a().isEmpty()) {
/* 211 */       wz<bcs> wz = wv.a().a(this.q);
/* 212 */       if (wz != null) {
/* 213 */         for (bcs bcs : wz.a()) {
/* 214 */           bmm<?> bmm = bcs.o().a(str);
/* 215 */           if (bmm != null) {
/* 216 */             a(☃, bmm);
/*     */           }
/* 218 */           if (!bool) {
/* 219 */             for (bmm<?> bmm1 : bcs.o().d()) {
/* 220 */               if (!this.l.containsKey(bmm1.a())) {
/* 221 */                 bool = true;
/*     */               }
/*     */             } 
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 229 */     if (bool) {
/* 230 */       ☃.suggest(String.valueOf(','));
/*     */     }
/* 232 */     ☃.suggest(String.valueOf(']'));
/* 233 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> i(SuggestionsBuilder ☃) {
/* 237 */     if (☃.getRemaining().isEmpty()) {
/* 238 */       wz<bcs> wz = wv.a().a(this.q);
/* 239 */       if (wz != null) {
/* 240 */         int i; boolean bool1 = false;
/* 241 */         boolean bool2 = false;
/*     */         
/* 243 */         for (bcs bcs : wz.a()) {
/* 244 */           i = bool1 | (!bcs.o().d().isEmpty() ? 1 : 0);
/* 245 */           bool2 |= bcs.i();
/*     */           
/* 247 */           if (i != 0 && bool2) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */         
/* 252 */         if (i != 0) {
/* 253 */           ☃.suggest(String.valueOf('['));
/*     */         }
/*     */         
/* 256 */         if (bool2) {
/* 257 */           ☃.suggest(String.valueOf('{'));
/*     */         }
/*     */       } 
/*     */     } 
/* 261 */     return k(☃);
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> j(SuggestionsBuilder ☃) {
/* 265 */     if (☃.getRemaining().isEmpty()) {
/* 266 */       if (!this.o.c().o().d().isEmpty()) {
/* 267 */         ☃.suggest(String.valueOf('['));
/*     */       }
/* 269 */       if (this.o.c().i()) {
/* 270 */         ☃.suggest(String.valueOf('{'));
/*     */       }
/*     */     } 
/* 273 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> k(SuggestionsBuilder ☃) {
/* 277 */     return bw.a(wv.a().a(), ☃.createOffset(this.r).add(☃));
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> l(SuggestionsBuilder ☃) {
/* 281 */     if (this.j) {
/* 282 */       bw.a(wv.a().a(), ☃, String.valueOf('#'));
/*     */     }
/* 284 */     bw.a(fc.g.c(), ☃);
/* 285 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   public void e() throws CommandSyntaxException {
/* 289 */     int ☃ = this.i.getCursor();
/* 290 */     this.m = pc.a(this.i);
/*     */     
/* 292 */     if (fc.g.c(this.m)) {
/* 293 */       bcs bcs = fc.g.a(this.m);
/* 294 */       this.n = bcs.o();
/* 295 */       this.o = bcs.p();
/*     */     } else {
/* 297 */       this.i.setCursor(☃);
/* 298 */       throw b.createWithContext(this.i, this.m.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() throws CommandSyntaxException {
/* 303 */     if (!this.j) {
/* 304 */       throw a.create();
/*     */     }
/*     */     
/* 307 */     this.s = this::k;
/* 308 */     this.i.expect('#');
/* 309 */     this.r = this.i.getCursor();
/* 310 */     this.q = pc.a(this.i);
/*     */   }
/*     */   
/*     */   public void g() throws CommandSyntaxException {
/* 314 */     this.i.skip();
/* 315 */     this.s = this::b;
/*     */     
/* 317 */     this.i.skipWhitespace();
/* 318 */     while (this.i.canRead() && this.i.peek() != ']') {
/* 319 */       this.i.skipWhitespace();
/* 320 */       int ☃ = this.i.getCursor();
/* 321 */       String str = this.i.readString();
/* 322 */       bmm<?> bmm = this.n.a(str);
/* 323 */       if (bmm == null) {
/* 324 */         this.i.setCursor(☃);
/* 325 */         throw c.createWithContext(this.i, this.m.toString(), str);
/*     */       } 
/* 327 */       if (this.k.containsKey(bmm)) {
/* 328 */         this.i.setCursor(☃);
/* 329 */         throw d.createWithContext(this.i, this.m.toString(), str);
/*     */       } 
/*     */       
/* 332 */       this.i.skipWhitespace();
/* 333 */       this.s = this::g;
/* 334 */       if (!this.i.canRead() || this.i.peek() != '=') {
/* 335 */         throw f.createWithContext(this.i, this.m.toString(), str);
/*     */       }
/* 337 */       this.i.skip();
/* 338 */       this.i.skipWhitespace();
/*     */       
/* 340 */       this.s = (suggestionsBuilder -> a(suggestionsBuilder, ☃).buildFuture());
/* 341 */       int i = this.i.getCursor();
/* 342 */       a(bmm, this.i.readString(), i);
/*     */       
/* 344 */       this.s = this::h;
/* 345 */       this.i.skipWhitespace();
/* 346 */       if (this.i.canRead()) {
/* 347 */         if (this.i.peek() == ',') {
/* 348 */           this.i.skip();
/* 349 */           this.s = this::d; continue;
/* 350 */         }  if (this.i.peek() == ']') {
/*     */           break;
/*     */         }
/* 353 */         throw g.createWithContext(this.i);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 358 */     if (this.i.canRead()) {
/* 359 */       this.i.skip();
/*     */     } else {
/* 361 */       throw g.createWithContext(this.i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void h() throws CommandSyntaxException {
/* 366 */     this.i.skip();
/* 367 */     this.s = this::c;
/* 368 */     int ☃ = -1;
/*     */     
/* 370 */     this.i.skipWhitespace();
/* 371 */     while (this.i.canRead() && this.i.peek() != ']') {
/* 372 */       this.i.skipWhitespace();
/* 373 */       int i = this.i.getCursor();
/* 374 */       String str1 = this.i.readString();
/* 375 */       if (this.l.containsKey(str1)) {
/* 376 */         this.i.setCursor(i);
/* 377 */         throw d.createWithContext(this.i, this.m.toString(), str1);
/*     */       } 
/*     */       
/* 380 */       this.i.skipWhitespace();
/* 381 */       if (!this.i.canRead() || this.i.peek() != '=') {
/* 382 */         this.i.setCursor(i);
/* 383 */         throw f.createWithContext(this.i, this.m.toString(), str1);
/*     */       } 
/* 385 */       this.i.skip();
/*     */       
/* 387 */       this.i.skipWhitespace();
/* 388 */       this.s = (suggestionsBuilder -> a(suggestionsBuilder, ☃));
/* 389 */       ☃ = this.i.getCursor();
/* 390 */       String str2 = this.i.readString();
/* 391 */       this.l.put(str1, str2);
/*     */       
/* 393 */       this.i.skipWhitespace();
/* 394 */       if (this.i.canRead()) {
/* 395 */         ☃ = -1;
/* 396 */         if (this.i.peek() == ',') {
/* 397 */           this.i.skip();
/* 398 */           this.s = this::e; continue;
/* 399 */         }  if (this.i.peek() == ']') {
/*     */           break;
/*     */         }
/* 402 */         throw g.createWithContext(this.i);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 407 */     if (this.i.canRead()) {
/* 408 */       this.i.skip();
/*     */     } else {
/* 410 */       if (☃ >= 0) {
/* 411 */         this.i.setCursor(☃);
/*     */       }
/* 413 */       throw g.createWithContext(this.i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void i() throws CommandSyntaxException {
/* 418 */     this.p = (new hp(this.i)).f();
/*     */   }
/*     */   
/*     */   private <T extends Comparable<T>> void a(bmm<T> ☃, String str, int i) throws CommandSyntaxException {
/* 422 */     Optional<T> optional = ☃.b(str);
/* 423 */     if (optional.isPresent()) {
/* 424 */       this.o = this.o.a(☃, (Comparable)optional.get());
/* 425 */       this.k.put(☃, (Comparable<?>)optional.get());
/*     */     } else {
/* 427 */       this.i.setCursor(i);
/* 428 */       throw e.createWithContext(this.i, this.m.toString(), ☃.a(), str);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String a(blc ☃, @Nullable gy gy1) {
/* 433 */     StringBuilder stringBuilder = new StringBuilder(fc.g.b(☃.c()).toString());
/* 434 */     if (!☃.a().isEmpty()) {
/* 435 */       stringBuilder.append('[');
/* 436 */       boolean bool = false;
/* 437 */       for (UnmodifiableIterator<Map.Entry<bmm<?>, Comparable<?>>> unmodifiableIterator = ☃.b().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<bmm<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 438 */         if (bool) {
/* 439 */           stringBuilder.append(',');
/*     */         }
/*     */         
/* 442 */         a(stringBuilder, (bmm<Comparable>)entry.getKey(), entry.getValue());
/* 443 */         bool = true; }
/*     */       
/* 445 */       stringBuilder.append(']');
/*     */     } 
/* 447 */     if (gy1 != null) {
/* 448 */       stringBuilder.append(gy1);
/*     */     }
/* 450 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends Comparable<T>> void a(StringBuilder ☃, bmm<T> bmm1, Comparable<?> comparable) {
/* 455 */     ☃.append(bmm1.a());
/* 456 */     ☃.append('=');
/* 457 */     ☃.append(bmm1.a((T)comparable));
/*     */   }
/*     */   
/*     */   public CompletableFuture<Suggestions> a(SuggestionsBuilder ☃) {
/* 461 */     return this.s.apply(☃.createOffset(this.i.getCursor()));
/*     */   }
/*     */   
/*     */   public Map<String, String> j() {
/* 465 */     return this.l;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */