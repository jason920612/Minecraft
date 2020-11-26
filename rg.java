/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
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
/*     */ public class rg
/*     */ {
/*  24 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.recipe.give.failed", new Object[0]));
/*  25 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.recipe.take.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  28 */     ☃.register(
/*  29 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("recipe")
/*  30 */         .requires(☃ -> ☃.c(2)))
/*  31 */         .then(
/*  32 */           bv.a("give")
/*  33 */           .then((
/*  34 */             (RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/*  35 */             .then(
/*  36 */               bv.<T>a("recipe", co.a())
/*  37 */               .suggests(eb.b)
/*  38 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), Collections.singleton(co.b(☃, "recipe"))))))
/*     */             
/*  40 */             .then(
/*  41 */               bv.a("*")
/*  42 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), ((bu)☃.getSource()).j().aK().b()))))))
/*     */ 
/*     */ 
/*     */         
/*  46 */         .then(
/*  47 */           bv.a("take")
/*  48 */           .then((
/*  49 */             (RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/*  50 */             .then(
/*  51 */               bv.<T>a("recipe", co.a())
/*  52 */               .suggests(eb.b)
/*  53 */               .executes(☃ -> b((bu)☃.getSource(), cb.f(☃, "targets"), Collections.singleton(co.b(☃, "recipe"))))))
/*     */             
/*  55 */             .then(
/*  56 */               bv.a("*")
/*  57 */               .executes(☃ -> b((bu)☃.getSource(), cb.f(☃, "targets"), ((bu)☃.getSource()).j().aK().b()))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection, Collection<avk> collection1) throws CommandSyntaxException {
/*  65 */     int i = 0;
/*     */     
/*  67 */     for (tf tf : collection) {
/*  68 */       i += tf.a(collection1);
/*     */     }
/*     */     
/*  71 */     if (i == 0) {
/*  72 */       throw a.create();
/*     */     }
/*     */     
/*  75 */     if (collection.size() == 1) {
/*  76 */       ☃.a(new ir("commands.recipe.give.success.single", new Object[] { Integer.valueOf(collection1.size()), ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/*  78 */       ☃.a(new ir("commands.recipe.give.success.multiple", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/*  81 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<tf> collection, Collection<avk> collection1) throws CommandSyntaxException {
/*  85 */     int i = 0;
/*     */     
/*  87 */     for (tf tf : collection) {
/*  88 */       i += tf.b(collection1);
/*     */     }
/*     */     
/*  91 */     if (i == 0) {
/*  92 */       throw b.create();
/*     */     }
/*     */     
/*  95 */     if (collection.size() == 1) {
/*  96 */       ☃.a(new ir("commands.recipe.take.success.single", new Object[] { Integer.valueOf(collection1.size()), ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/*  98 */       ☃.a(new ir("commands.recipe.take.success.multiple", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 101 */     return i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\rg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */