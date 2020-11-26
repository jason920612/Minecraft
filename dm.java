/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dm
/*     */ {
/*  26 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.item.tag.disallowed", new Object[0])); static {
/*  27 */     b = new DynamicCommandExceptionType(☃ -> new ir("argument.item.id.invalid", new Object[] { ☃ }));
/*     */   }
/*     */ 
/*     */   
/*     */   public static final DynamicCommandExceptionType b;
/*  32 */   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> c = SuggestionsBuilder::buildFuture;
/*     */   
/*     */   private final StringReader d;
/*     */   private final boolean e;
/*  36 */   private final Map<bmm<?>, Comparable<?>> f = Maps.newHashMap();
/*     */   private ata g;
/*     */   @Nullable
/*     */   private gy h;
/*  40 */   private pc i = new pc("");
/*     */   private int j;
/*  42 */   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> k = c;
/*     */   
/*     */   public dm(StringReader ☃, boolean bool) {
/*  45 */     this.d = ☃;
/*  46 */     this.e = bool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ata b() {
/*  54 */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gy c() {
/*  59 */     return this.h;
/*     */   }
/*     */   
/*     */   public pc d() {
/*  63 */     return this.i;
/*     */   }
/*     */   
/*     */   public void e() throws CommandSyntaxException {
/*  67 */     int ☃ = this.d.getCursor();
/*  68 */     pc pc1 = pc.a(this.d);
/*     */     
/*  70 */     if (fc.s.c(pc1)) {
/*  71 */       this.g = fc.s.b(pc1);
/*     */     } else {
/*  73 */       this.d.setCursor(☃);
/*  74 */       throw b.createWithContext(this.d, pc1.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() throws CommandSyntaxException {
/*  79 */     if (!this.e) {
/*  80 */       throw a.create();
/*     */     }
/*     */     
/*  83 */     this.k = this::c;
/*  84 */     this.d.expect('#');
/*  85 */     this.j = this.d.getCursor();
/*  86 */     this.i = pc.a(this.d);
/*     */   }
/*     */   
/*     */   public void g() throws CommandSyntaxException {
/*  90 */     this.h = (new hp(this.d)).f();
/*     */   }
/*     */   
/*     */   public dm h() throws CommandSyntaxException {
/*  94 */     this.k = this::d;
/*  95 */     if (this.d.canRead() && this.d.peek() == '#') {
/*  96 */       f();
/*     */     } else {
/*  98 */       e();
/*  99 */       this.k = this::b;
/*     */     } 
/* 101 */     if (this.d.canRead() && this.d.peek() == '{') {
/* 102 */       this.k = c;
/* 103 */       g();
/*     */     } 
/* 105 */     return this;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> b(SuggestionsBuilder ☃) {
/* 109 */     if (☃.getRemaining().isEmpty()) {
/* 110 */       ☃.suggest(String.valueOf('{'));
/*     */     }
/* 112 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> c(SuggestionsBuilder ☃) {
/* 116 */     return bw.a(wx.a().a(), ☃.createOffset(this.j));
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> d(SuggestionsBuilder ☃) {
/* 120 */     if (this.e) {
/* 121 */       bw.a(wx.a().a(), ☃, String.valueOf('#'));
/*     */     }
/* 123 */     return bw.a(fc.s.c(), ☃);
/*     */   }
/*     */   
/*     */   public CompletableFuture<Suggestions> a(SuggestionsBuilder ☃) {
/* 127 */     return this.k.apply(☃.createOffset(this.d.getCursor()));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */