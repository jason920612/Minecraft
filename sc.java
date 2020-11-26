/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.Locale;
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
/*     */ public class sc
/*     */ {
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  27 */     ☃.register(
/*  28 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("title")
/*  29 */         .requires(☃ -> ☃.c(2)))
/*  30 */         .then((
/*  31 */           (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/*  32 */           .then(
/*  33 */             bv.a("clear")
/*  34 */             .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets")))))
/*     */           
/*  36 */           .then(
/*  37 */             bv.a("reset")
/*  38 */             .executes(☃ -> b((bu)☃.getSource(), cb.f(☃, "targets")))))
/*     */           
/*  40 */           .then(
/*  41 */             bv.a("title")
/*  42 */             .then(
/*  43 */               bv.<T>a("title", by.a())
/*  44 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), by.a(☃, "title"), ls.a.a)))))
/*     */ 
/*     */           
/*  47 */           .then(
/*  48 */             bv.a("subtitle")
/*  49 */             .then(
/*  50 */               bv.<T>a("title", by.a())
/*  51 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), by.a(☃, "title"), ls.a.b)))))
/*     */ 
/*     */           
/*  54 */           .then(
/*  55 */             bv.a("actionbar")
/*  56 */             .then(
/*  57 */               bv.<T>a("title", by.a())
/*  58 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), by.a(☃, "title"), ls.a.c)))))
/*     */ 
/*     */           
/*  61 */           .then(
/*  62 */             bv.a("times")
/*  63 */             .then(
/*  64 */               bv.<T>a("fadeIn", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  65 */               .then(
/*  66 */                 bv.<T>a("stay", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  67 */                 .then(
/*  68 */                   bv.<T>a("fadeOut", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  69 */                   .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "fadeIn"), IntegerArgumentType.getInteger(☃, "stay"), IntegerArgumentType.getInteger(☃, "fadeOut")))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection) {
/*  79 */     ls ls = new ls(ls.a.e, null);
/*  80 */     for (tf tf : collection) {
/*  81 */       tf.a.a(ls);
/*     */     }
/*     */     
/*  84 */     if (collection.size() == 1) {
/*  85 */       ☃.a(new ir("commands.title.cleared.single", new Object[] { ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/*  87 */       ☃.a(new ir("commands.title.cleared.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/*  90 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<tf> collection) {
/*  94 */     ls ls = new ls(ls.a.f, null);
/*  95 */     for (tf tf : collection) {
/*  96 */       tf.a.a(ls);
/*     */     }
/*     */     
/*  99 */     if (collection.size() == 1) {
/* 100 */       ☃.a(new ir("commands.title.reset.single", new Object[] { ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 102 */       ☃.a(new ir("commands.title.reset.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 105 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection, ij ij1, ls.a a1) throws CommandSyntaxException {
/* 109 */     for (tf tf : collection) {
/* 110 */       tf.a.a(new ls(a1, ik.a(☃, ij1, tf)));
/*     */     }
/*     */     
/* 113 */     if (collection.size() == 1) {
/* 114 */       ☃.a(new ir("commands.title.show." + a1.name().toLowerCase(Locale.ROOT) + ".single", new Object[] { ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 116 */       ☃.a(new ir("commands.title.show." + a1.name().toLowerCase(Locale.ROOT) + ".multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 119 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection, int i, int j, int k) {
/* 123 */     ls ls = new ls(i, j, k);
/* 124 */     for (tf tf : collection) {
/* 125 */       tf.a.a(ls);
/*     */     }
/*     */     
/* 128 */     if (collection.size() == 1) {
/* 129 */       ☃.a(new ir("commands.title.times.single", new Object[] { ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 131 */       ☃.a(new ir("commands.title.times.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 134 */     return collection.size();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */