/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
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
/*     */ public class rx
/*     */ {
/*  25 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.tag.add.failed", new Object[0]));
/*  26 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.tag.remove.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  29 */     ☃.register(
/*  30 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("tag")
/*  31 */         .requires(☃ -> ☃.c(2)))
/*  32 */         .then((
/*  33 */           (RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("targets", cb.b())
/*  34 */           .then(
/*  35 */             bv.a("add")
/*  36 */             .then(
/*  37 */               bv.<T>a("name", (ArgumentType<T>)StringArgumentType.word())
/*  38 */               .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), StringArgumentType.getString(☃, "name"))))))
/*     */ 
/*     */           
/*  41 */           .then(
/*  42 */             bv.a("remove")
/*  43 */             .then(
/*  44 */               bv.<T>a("name", (ArgumentType<T>)StringArgumentType.word())
/*  45 */               .suggests((☃, suggestionsBuilder) -> bw.b(a(cb.b(☃, "targets")), suggestionsBuilder))
/*  46 */               .executes(☃ -> b((bu)☃.getSource(), cb.b(☃, "targets"), StringArgumentType.getString(☃, "name"))))))
/*     */ 
/*     */           
/*  49 */           .then(
/*  50 */             bv.a("list")
/*  51 */             .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Collection<String> a(Collection<? extends aer> ☃) {
/*  58 */     Set<String> set = Sets.newHashSet();
/*  59 */     for (aer aer : ☃) {
/*  60 */       set.addAll(aer.R());
/*     */     }
/*  62 */     return set;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection, String str) throws CommandSyntaxException {
/*  66 */     int i = 0;
/*     */     
/*  68 */     for (aer aer : collection) {
/*  69 */       if (aer.a(str)) {
/*  70 */         i++;
/*     */       }
/*     */     } 
/*     */     
/*  74 */     if (i == 0) {
/*  75 */       throw a.create();
/*     */     }
/*     */     
/*  78 */     if (collection.size() == 1) {
/*  79 */       ☃.a(new ir("commands.tag.add.success.single", new Object[] { str, ((aer)collection.iterator().next()).O() }), true);
/*     */     } else {
/*  81 */       ☃.a(new ir("commands.tag.add.success.multiple", new Object[] { str, Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/*  84 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<? extends aer> collection, String str) throws CommandSyntaxException {
/*  88 */     int i = 0;
/*     */     
/*  90 */     for (aer aer : collection) {
/*  91 */       if (aer.b(str)) {
/*  92 */         i++;
/*     */       }
/*     */     } 
/*     */     
/*  96 */     if (i == 0) {
/*  97 */       throw b.create();
/*     */     }
/*     */     
/* 100 */     if (collection.size() == 1) {
/* 101 */       ☃.a(new ir("commands.tag.remove.success.single", new Object[] { str, ((aer)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 103 */       ☃.a(new ir("commands.tag.remove.success.multiple", new Object[] { str, Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 106 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection) {
/* 110 */     Set<String> set = Sets.newHashSet();
/*     */     
/* 112 */     for (aer aer : collection) {
/* 113 */       set.addAll(aer.R());
/*     */     }
/*     */     
/* 116 */     if (collection.size() == 1) {
/* 117 */       aer aer = collection.iterator().next();
/*     */       
/* 119 */       if (set.isEmpty()) {
/* 120 */         ☃.a(new ir("commands.tag.list.single.empty", new Object[] { aer.O() }), false);
/*     */       } else {
/* 122 */         ☃.a(new ir("commands.tag.list.single.success", new Object[] { aer.O(), Integer.valueOf(set.size()), ik.a(set) }), false);
/*     */       }
/*     */     
/* 125 */     } else if (set.isEmpty()) {
/* 126 */       ☃.a(new ir("commands.tag.list.multiple.empty", new Object[] { Integer.valueOf(collection.size()) }), false);
/*     */     } else {
/* 128 */       ☃.a(new ir("commands.tag.list.multiple.success", new Object[] { Integer.valueOf(collection.size()), Integer.valueOf(set.size()), ik.a(set) }), false);
/*     */     } 
/*     */ 
/*     */     
/* 132 */     return set.size();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\rx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */