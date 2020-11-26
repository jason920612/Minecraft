/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qe
/*     */ {
/*     */   private static final DynamicCommandExceptionType a;
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final DynamicCommandExceptionType c;
/*     */   private static final SuggestionProvider<bu> d;
/*     */   private static final SuggestionProvider<bu> e;
/*     */   
/*     */   static {
/*  28 */     a = new DynamicCommandExceptionType(☃ -> new ir("commands.datapack.unknown", new Object[] { ☃ }));
/*  29 */     b = new DynamicCommandExceptionType(☃ -> new ir("commands.datapack.enable.failed", new Object[] { ☃ }));
/*  30 */     c = new DynamicCommandExceptionType(☃ -> new ir("commands.datapack.disable.failed", new Object[] { ☃ }));
/*     */     
/*  32 */     d = ((☃, suggestionsBuilder) -> bw.b(((bu)☃.getSource()).j().aE().d().stream().map(va::e).map(StringArgumentType::escapeIfRequired), suggestionsBuilder));
/*  33 */     e = ((☃, suggestionsBuilder) -> bw.b(((bu)☃.getSource()).j().aE().c().stream().map(va::e).map(StringArgumentType::escapeIfRequired), suggestionsBuilder));
/*     */   }
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  36 */     ☃.register(
/*  37 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("datapack")
/*  38 */         .requires(☃ -> ☃.c(2)))
/*  39 */         .then(
/*  40 */           bv.a("enable")
/*  41 */           .then((
/*  42 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("name", (ArgumentType<T>)StringArgumentType.string())
/*  43 */             .suggests(e)
/*  44 */             .executes(☃ -> a((bu)☃.getSource(), a(☃, "name", true), ())))
/*  45 */             .then(
/*  46 */               bv.a("after")
/*  47 */               .then(
/*  48 */                 bv.<T>a("existing", (ArgumentType<T>)StringArgumentType.string())
/*  49 */                 .suggests(d)
/*  50 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃, "name", true), ())))))
/*     */ 
/*     */             
/*  53 */             .then(
/*  54 */               bv.a("before")
/*  55 */               .then(
/*  56 */                 bv.<T>a("existing", (ArgumentType<T>)StringArgumentType.string())
/*  57 */                 .suggests(d)
/*  58 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃, "name", true), ())))))
/*     */ 
/*     */             
/*  61 */             .then(
/*  62 */               bv.a("last")
/*  63 */               .executes(☃ -> a((bu)☃.getSource(), a(☃, "name", true), List::add))))
/*     */             
/*  65 */             .then(
/*  66 */               bv.a("first")
/*  67 */               .executes(☃ -> a((bu)☃.getSource(), a(☃, "name", true), ()))))))
/*     */ 
/*     */ 
/*     */         
/*  71 */         .then(
/*  72 */           bv.a("disable")
/*  73 */           .then(
/*  74 */             bv.<T>a("name", (ArgumentType<T>)StringArgumentType.string())
/*  75 */             .suggests(d)
/*  76 */             .executes(☃ -> a((bu)☃.getSource(), a(☃, "name", false))))))
/*     */ 
/*     */         
/*  79 */         .then((
/*  80 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("list")
/*  81 */           .executes(☃ -> a((bu)☃.getSource())))
/*  82 */           .then(
/*  83 */             bv.a("available")
/*  84 */             .executes(☃ -> b((bu)☃.getSource()))))
/*     */           
/*  86 */           .then(
/*  87 */             bv.a("enabled")
/*  88 */             .executes(☃ -> c((bu)☃.getSource())))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, va va1, a a1) throws CommandSyntaxException {
/*  95 */     ux<va> ux = ☃.j().aE();
/*     */     
/*  97 */     List<va> list = Lists.newArrayList(ux.d());
/*  98 */     a1.apply(list, va1);
/*  99 */     ux.a(list);
/*     */     
/* 101 */     ccb ccb = ☃.j().a(bod.a).g();
/* 102 */     ccb.O().clear();
/* 103 */     ux.d().forEach(va1 -> ☃.O().add(va1.e()));
/* 104 */     ccb.N().remove(va1.e());
/*     */     
/* 106 */     ☃.a(new ir("commands.datapack.enable.success", new Object[] { va1.a(true) }), true);
/* 107 */     ☃.j().aC();
/*     */     
/* 109 */     return ux.d().size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, va va1) {
/* 113 */     ux<va> ux = ☃.j().aE();
/*     */     
/* 115 */     List<va> list = Lists.newArrayList(ux.d());
/* 116 */     list.remove(va1);
/* 117 */     ux.a(list);
/*     */     
/* 119 */     ccb ccb = ☃.j().a(bod.a).g();
/* 120 */     ccb.O().clear();
/* 121 */     ux.d().forEach(va1 -> ☃.O().add(va1.e()));
/* 122 */     ccb.N().add(va1.e());
/*     */     
/* 124 */     ☃.a(new ir("commands.datapack.disable.success", new Object[] { va1.a(true) }), true);
/* 125 */     ☃.j().aC();
/*     */     
/* 127 */     return ux.d().size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃) {
/* 131 */     return c(☃) + b(☃);
/*     */   }
/*     */   
/*     */   private static int b(bu ☃) {
/* 135 */     ux<va> ux = ☃.j().aE();
/*     */     
/* 137 */     if (ux.c().isEmpty()) {
/* 138 */       ☃.a(new ir("commands.datapack.list.available.none", new Object[0]), false);
/*     */     } else {
/* 140 */       ☃.a(new ir("commands.datapack.list.available.success", new Object[] { Integer.valueOf(ux.c().size()), ik.b(ux.c(), ☃ -> ☃.a(false)) }), false);
/*     */     } 
/*     */     
/* 143 */     return ux.c().size();
/*     */   }
/*     */   
/*     */   private static int c(bu ☃) {
/* 147 */     ux<va> ux = ☃.j().aE();
/*     */     
/* 149 */     if (ux.d().isEmpty()) {
/* 150 */       ☃.a(new ir("commands.datapack.list.enabled.none", new Object[0]), false);
/*     */     } else {
/* 152 */       ☃.a(new ir("commands.datapack.list.enabled.success", new Object[] { Integer.valueOf(ux.d().size()), ik.b(ux.d(), ☃ -> ☃.a(true)) }), false);
/*     */     } 
/*     */     
/* 155 */     return ux.d().size();
/*     */   }
/*     */   
/*     */   private static va a(CommandContext<bu> ☃, String str, boolean bool) throws CommandSyntaxException {
/* 159 */     String str1 = StringArgumentType.getString(☃, str);
/* 160 */     ux<va> ux = ((bu)☃.getSource()).j().aE();
/* 161 */     va va = ux.a(str1);
/* 162 */     if (va == null) {
/* 163 */       throw a.create(str1);
/*     */     }
/* 165 */     boolean bool1 = ux.d().contains(va);
/* 166 */     if (bool && bool1) {
/* 167 */       throw b.create(str1);
/*     */     }
/* 169 */     if (!bool && !bool1) {
/* 170 */       throw c.create(str1);
/*     */     }
/* 172 */     return va;
/*     */   }
/*     */   
/*     */   static interface a {
/*     */     void apply(List<va> param1List, va param1va) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */