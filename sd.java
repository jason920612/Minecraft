/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
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
/*     */ public class sd
/*     */ {
/*  30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.trigger.failed.unprimed", new Object[0]));
/*  31 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.trigger.failed.invalid", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  34 */     ☃.register(
/*  35 */         (LiteralArgumentBuilder)bv.a("trigger")
/*  36 */         .then((
/*  37 */           (RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("objective", cj.a())
/*  38 */           .suggests((☃, suggestionsBuilder) -> a((bu)☃.getSource(), suggestionsBuilder))
/*  39 */           .executes(☃ -> a((bu)☃.getSource(), a(((bu)☃.getSource()).h(), cj.a(☃, "objective")))))
/*  40 */           .then(
/*  41 */             bv.a("add")
/*  42 */             .then(
/*  43 */               bv.<T>a("value", (ArgumentType<T>)IntegerArgumentType.integer())
/*  44 */               .executes(☃ -> a((bu)☃.getSource(), a(((bu)☃.getSource()).h(), cj.a(☃, "objective")), IntegerArgumentType.getInteger(☃, "value"))))))
/*     */ 
/*     */           
/*  47 */           .then(
/*  48 */             bv.a("set")
/*  49 */             .then(
/*  50 */               bv.<T>a("value", (ArgumentType<T>)IntegerArgumentType.integer())
/*  51 */               .executes(☃ -> b((bu)☃.getSource(), a(((bu)☃.getSource()).h(), cj.a(☃, "objective")), IntegerArgumentType.getInteger(☃, "value")))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CompletableFuture<Suggestions> a(bu ☃, SuggestionsBuilder suggestionsBuilder) {
/*  59 */     aer aer = ☃.f();
/*  60 */     List<String> list = Lists.newArrayList();
/*     */     
/*  62 */     if (aer != null) {
/*  63 */       cfc cfc = ☃.j().aM();
/*  64 */       String str = aer.bv();
/*     */       
/*  66 */       for (cez cez : cfc.c()) {
/*  67 */         if (cez.c() == cff.c && cfc.b(str, cez)) {
/*  68 */           cfb cfb = cfc.c(str, cez);
/*  69 */           if (!cfb.g()) {
/*  70 */             list.add(cez.b());
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  76 */     return bw.b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfb cfb1, int i) {
/*  80 */     cfb1.a(i);
/*  81 */     ☃.a(new ir("commands.trigger.add.success", new Object[] { cfb1.d().e(), Integer.valueOf(i) }), true);
/*  82 */     return cfb1.b();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, cfb cfb1, int i) {
/*  86 */     cfb1.c(i);
/*  87 */     ☃.a(new ir("commands.trigger.set.success", new Object[] { cfb1.d().e(), Integer.valueOf(i) }), true);
/*  88 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfb cfb1) {
/*  92 */     cfb1.a(1);
/*  93 */     ☃.a(new ir("commands.trigger.simple.success", new Object[] { cfb1.d().e() }), true);
/*  94 */     return cfb1.b();
/*     */   }
/*     */   
/*     */   private static cfb a(tf ☃, cez cez1) throws CommandSyntaxException {
/*  98 */     if (cez1.c() != cff.c) {
/*  99 */       throw b.create();
/*     */     }
/* 101 */     cfc cfc = ☃.dB();
/* 102 */     String str = ☃.bv();
/* 103 */     if (!cfc.b(str, cez1)) {
/* 104 */       throw a.create();
/*     */     }
/* 106 */     cfb cfb = cfc.c(str, cez1);
/* 107 */     if (cfb.g()) {
/* 108 */       throw a.create();
/*     */     }
/* 110 */     cfb.a(true);
/* 111 */     return cfb;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */