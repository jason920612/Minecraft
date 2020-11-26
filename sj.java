/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
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
/*     */ public class sj
/*     */ {
/*     */   private static final DynamicCommandExceptionType c;
/*     */   private static final DynamicCommandExceptionType d;
/*  35 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.data.merge.failed", new Object[0])); static {
/*  36 */     c = new DynamicCommandExceptionType(☃ -> new ir("commands.data.get.invalid", new Object[] { ☃ }));
/*  37 */     d = new DynamicCommandExceptionType(☃ -> new ir("commands.data.get.unknown", new Object[] { ☃ }));
/*  38 */   } public static final List<a> a = Lists.newArrayList((Object[])new a[] { sk.a, sh.a });
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  41 */     LiteralArgumentBuilder<bu> literalArgumentBuilder = (LiteralArgumentBuilder<bu>)bv.a("data").requires(☃ -> ☃.c(2));
/*     */     
/*  43 */     for (a a : a) {
/*  44 */       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder
/*  45 */         .then(a
/*  46 */           .a((ArgumentBuilder)bv.a("merge"), argumentBuilder -> argumentBuilder.then(bv.<T>a("nbt", ch.a()).executes(())))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  53 */         .then(a
/*  54 */           .a((ArgumentBuilder)bv.a("get"), argumentBuilder -> argumentBuilder.executes(()).then(((RequiredArgumentBuilder)bv.<T>a("path", ci.a()).executes(())).then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).executes(()))))))
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
/*  66 */         .then(a
/*  67 */           .a((ArgumentBuilder)bv.a("remove"), argumentBuilder -> argumentBuilder.then(bv.<T>a("path", ci.a()).executes(()))));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  76 */     ☃.register(literalArgumentBuilder);
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, si si1, ci.c c1) throws CommandSyntaxException {
/*  80 */     gy gy1 = si1.a();
/*  81 */     gy gy2 = gy1.f();
/*     */     
/*  83 */     c1.b(gy1);
/*     */     
/*  85 */     if (gy2.equals(gy1)) {
/*  86 */       throw b.create();
/*     */     }
/*     */     
/*  89 */     si1.a(gy1);
/*  90 */     ☃.a(si1.b(), true);
/*  91 */     return 1;
/*     */   }
/*     */   private static int b(bu ☃, si si1, ci.c c1) throws CommandSyntaxException {
/*     */     int i;
/*  95 */     ho ho = c1.a(si1.a());
/*     */     
/*  97 */     if (ho instanceof hl) {
/*  98 */       i = xq.c(((hl)ho).h());
/*  99 */     } else if (ho instanceof gx) {
/* 100 */       i = ((gx)ho).size();
/* 101 */     } else if (ho instanceof gy) {
/* 102 */       i = ((gy)ho).d();
/* 103 */     } else if (ho instanceof hn) {
/* 104 */       i = ((hn)ho).b_().length();
/*     */     } else {
/* 106 */       throw d.create(c1.toString());
/*     */     } 
/* 108 */     ☃.a(si1.a(ho), false);
/* 109 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, si si1, ci.c c1, double d) throws CommandSyntaxException {
/* 113 */     ho ho = c1.a(si1.a());
/* 114 */     if (!(ho instanceof hl)) {
/* 115 */       throw c.create(c1.toString());
/*     */     }
/* 117 */     int i = xq.c(((hl)ho).h() * d);
/* 118 */     ☃.a(si1.a(c1, d, i), false);
/* 119 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, si si1) throws CommandSyntaxException {
/* 123 */     ☃.a(si1.a(si1.a()), false);
/* 124 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, si si1, gy gy1) throws CommandSyntaxException {
/* 128 */     gy gy2 = si1.a();
/* 129 */     gy gy3 = gy2.f().a(gy1);
/*     */     
/* 131 */     if (gy2.equals(gy3)) {
/* 132 */       throw b.create();
/*     */     }
/*     */     
/* 135 */     si1.a(gy3);
/*     */     
/* 137 */     ☃.a(si1.b(), true);
/* 138 */     return 1;
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     si a(CommandContext<bu> param1CommandContext) throws CommandSyntaxException;
/*     */     
/*     */     ArgumentBuilder<bu, ?> a(ArgumentBuilder<bu, ?> param1ArgumentBuilder, Function<ArgumentBuilder<bu, ?>, ArgumentBuilder<bu, ?>> param1Function);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */