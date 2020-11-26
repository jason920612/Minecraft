/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.ResultConsumer;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BinaryOperator;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class bu
/*     */   implements bw
/*     */ {
/*  33 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("permissions.requires.player", new Object[0]));
/*  34 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("permissions.requires.entity", new Object[0]));
/*     */   
/*     */   private final bt c;
/*     */   private final cee d;
/*     */   private final td e;
/*     */   private final int f;
/*     */   private final String g;
/*     */   private final ij h;
/*     */   private final MinecraftServer i;
/*     */   private final boolean j;
/*     */   @Nullable
/*     */   private final aer k;
/*     */   private final ResultConsumer<bu> l;
/*     */   private final ca.a m;
/*     */   private final ced n;
/*     */   
/*     */   public bu(bt ☃, cee cee1, ced ced1, td td1, int i, String str, ij ij1, MinecraftServer minecraftServer, @Nullable aer aer1) {
/*  51 */     this(☃, cee1, ced1, td1, i, str, ij1, minecraftServer, aer1, false, (☃, bool, i) -> {  }ca.a.a);
/*     */   }
/*     */   
/*     */   protected bu(bt ☃, cee cee1, ced ced1, td td1, int i, String str, ij ij1, MinecraftServer minecraftServer, @Nullable aer aer1, boolean bool, ResultConsumer<bu> resultConsumer, ca.a a1) {
/*  55 */     this.c = ☃;
/*  56 */     this.d = cee1;
/*  57 */     this.e = td1;
/*  58 */     this.j = bool;
/*  59 */     this.k = aer1;
/*  60 */     this.f = i;
/*  61 */     this.g = str;
/*  62 */     this.h = ij1;
/*  63 */     this.i = minecraftServer;
/*  64 */     this.l = resultConsumer;
/*  65 */     this.m = a1;
/*  66 */     this.n = ced1;
/*     */   }
/*     */   
/*     */   public bu a(aer ☃) {
/*  70 */     if (this.k == ☃) {
/*  71 */       return this;
/*     */     }
/*  73 */     return new bu(this.c, this.d, this.n, this.e, this.f, ☃.N_().getString(), ☃.O(), this.i, ☃, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu a(cee ☃) {
/*  77 */     if (this.d.equals(☃)) {
/*  78 */       return this;
/*     */     }
/*  80 */     return new bu(this.c, ☃, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu a(ced ☃) {
/*  84 */     if (this.n.c(☃)) {
/*  85 */       return this;
/*     */     }
/*  87 */     return new bu(this.c, this.d, ☃, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu a(ResultConsumer<bu> ☃) {
/*  91 */     if (this.l.equals(☃)) {
/*  92 */       return this;
/*     */     }
/*  94 */     return new bu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, ☃, this.m);
/*     */   }
/*     */   
/*     */   public bu a(ResultConsumer<bu> ☃, BinaryOperator<ResultConsumer<bu>> binaryOperator) {
/*  98 */     ResultConsumer<bu> resultConsumer = binaryOperator.apply(this.l, ☃);
/*  99 */     return a(resultConsumer);
/*     */   }
/*     */   
/*     */   public bu a() {
/* 103 */     if (this.j) {
/* 104 */       return this;
/*     */     }
/* 106 */     return new bu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu a(int ☃) {
/* 110 */     if (☃ == this.f) {
/* 111 */       return this;
/*     */     }
/* 113 */     return new bu(this.c, this.d, this.n, this.e, ☃, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu b(int ☃) {
/* 117 */     if (☃ <= this.f) {
/* 118 */       return this;
/*     */     }
/* 120 */     return new bu(this.c, this.d, this.n, this.e, ☃, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu a(ca.a ☃) {
/* 124 */     if (☃ == this.m) {
/* 125 */       return this;
/*     */     }
/* 127 */     return new bu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, ☃);
/*     */   }
/*     */   
/*     */   public bu a(td ☃) {
/* 131 */     if (☃ == this.e) {
/* 132 */       return this;
/*     */     }
/* 134 */     return new bu(this.c, this.d, this.n, ☃, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public bu a(aer ☃, ca.a a1) throws CommandSyntaxException {
/* 138 */     return b(a1.a(☃));
/*     */   }
/*     */   
/*     */   public bu b(cee ☃) throws CommandSyntaxException {
/* 142 */     cee cee1 = this.m.a(this);
/* 143 */     double d1 = ☃.b - cee1.b;
/* 144 */     double d2 = ☃.c - cee1.c;
/* 145 */     double d3 = ☃.d - cee1.d;
/* 146 */     double d4 = xq.a(d1 * d1 + d3 * d3);
/*     */     
/* 148 */     float f1 = xq.g((float)-(xq.c(d2, d4) * 57.2957763671875D));
/* 149 */     float f2 = xq.g((float)(xq.c(d3, d1) * 57.2957763671875D) - 90.0F);
/* 150 */     return a(new ced(f1, f2));
/*     */   }
/*     */   
/*     */   public ij b() {
/* 154 */     return this.h;
/*     */   }
/*     */   
/*     */   public String c() {
/* 158 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃) {
/* 163 */     return (this.f >= ☃);
/*     */   }
/*     */   
/*     */   public cee d() {
/* 167 */     return this.d;
/*     */   }
/*     */   
/*     */   public td e() {
/* 171 */     return this.e;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer f() {
/* 176 */     return this.k;
/*     */   }
/*     */   
/*     */   public aer g() throws CommandSyntaxException {
/* 180 */     if (this.k == null) {
/* 181 */       throw b.create();
/*     */     }
/* 183 */     return this.k;
/*     */   }
/*     */   
/*     */   public tf h() throws CommandSyntaxException {
/* 187 */     if (!(this.k instanceof tf)) {
/* 188 */       throw a.create();
/*     */     }
/* 190 */     return (tf)this.k;
/*     */   }
/*     */   
/*     */   public ced i() {
/* 194 */     return this.n;
/*     */   }
/*     */   
/*     */   public MinecraftServer j() {
/* 198 */     return this.i;
/*     */   }
/*     */   
/*     */   public ca.a k() {
/* 202 */     return this.m;
/*     */   }
/*     */   
/*     */   public void a(ij ☃, boolean bool) {
/* 206 */     if (this.c.a() && !this.j) {
/* 207 */       this.c.a(☃);
/*     */     }
/* 209 */     if (bool && this.c.B_() && !this.j) {
/* 210 */       b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(ij ☃) {
/* 215 */     ij ij1 = (new ir("chat.type.admin", new Object[] { b(), ☃ })).a(new a[] { a.h, a.u });
/*     */     
/* 217 */     if (this.i.aO().b("sendCommandFeedback")) {
/* 218 */       for (tf tf : this.i.ac().v()) {
/* 219 */         if (tf != this.c && this.i.ac().h(tf.do())) {
/* 220 */           tf.a(ij1);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 225 */     if (this.c != this.i && this.i.aO().b("logAdminCommands")) {
/* 226 */       this.i.a(ij1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ij ☃) {
/* 231 */     if (this.c.b() && !this.j) {
/* 232 */       this.c.a((new iq("")).a(☃).a(a.m));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(CommandContext<bu> ☃, boolean bool, int i) {
/* 237 */     if (this.l != null) {
/* 238 */       this.l.onCommandComplete(☃, bool, i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> l() {
/* 244 */     return Lists.newArrayList((Object[])this.i.A());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> m() {
/* 249 */     return this.i.aM().f();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<pc> n() {
/* 254 */     return fc.v.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<pc> o() {
/* 259 */     return this.i.aK().c();
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Suggestions> a(CommandContext<bw> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 264 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<bw.a> a(boolean ☃) {
/* 269 */     return Collections.singleton(bw.a.b);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */