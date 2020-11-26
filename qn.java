/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.ToIntFunction;
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
/*     */ public class qn
/*     */ {
/*  30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.experience.set.points.invalid", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  33 */     LiteralCommandNode<bu> literalCommandNode = ☃.register(
/*  34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("experience")
/*  35 */         .requires(☃ -> ☃.c(2)))
/*  36 */         .then(
/*  37 */           bv.a("add")
/*  38 */           .then(
/*  39 */             bv.<T>a("targets", cb.d())
/*  40 */             .then((
/*  41 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("amount", (ArgumentType<T>)IntegerArgumentType.integer())
/*  42 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a)))
/*  43 */               .then(
/*  44 */                 bv.a("points")
/*  45 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a))))
/*     */               
/*  47 */               .then(
/*  48 */                 bv.a("levels")
/*  49 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.b)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  54 */         .then(
/*  55 */           bv.a("set")
/*  56 */           .then(
/*  57 */             bv.<T>a("targets", cb.d())
/*  58 */             .then((
/*  59 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("amount", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  60 */               .executes(☃ -> b((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a)))
/*  61 */               .then(
/*  62 */                 bv.a("points")
/*  63 */                 .executes(☃ -> b((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a))))
/*     */               
/*  65 */               .then(
/*  66 */                 bv.a("levels")
/*  67 */                 .executes(☃ -> b((bu)☃.getSource(), cb.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.b)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  72 */         .then(
/*  73 */           bv.a("query")
/*  74 */           .then((
/*  75 */             (RequiredArgumentBuilder)bv.<T>a("targets", cb.c())
/*  76 */             .then(
/*  77 */               bv.a("points")
/*  78 */               .executes(☃ -> a((bu)☃.getSource(), cb.e(☃, "targets"), a.a))))
/*     */             
/*  80 */             .then(
/*  81 */               bv.a("levels")
/*  82 */               .executes(☃ -> a((bu)☃.getSource(), cb.e(☃, "targets"), a.b))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     ☃.register(
/*  89 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("xp")
/*  90 */         .requires(☃ -> ☃.c(2)))
/*  91 */         .redirect((CommandNode)literalCommandNode));
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, tf tf1, a a1) {
/*  96 */     int i = a.a(a1).applyAsInt(tf1);
/*  97 */     ☃.a(new ir("commands.experience.query." + a1.e, new Object[] { tf1.O(), Integer.valueOf(i) }), false);
/*  98 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends tf> collection, int i, a a1) {
/* 102 */     for (tf tf : collection) {
/* 103 */       a1.c.accept(tf, Integer.valueOf(i));
/*     */     }
/*     */     
/* 106 */     if (collection.size() == 1) {
/* 107 */       ☃.a(new ir("commands.experience.add." + a1.e + ".success.single", new Object[] { Integer.valueOf(i), ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 109 */       ☃.a(new ir("commands.experience.add." + a1.e + ".success.multiple", new Object[] { Integer.valueOf(i), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 112 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<? extends tf> collection, int i, a a1) throws CommandSyntaxException {
/* 116 */     int j = 0;
/*     */     
/* 118 */     for (tf tf : collection) {
/* 119 */       if (a1.d.test(tf, Integer.valueOf(i))) {
/* 120 */         j++;
/*     */       }
/*     */     } 
/*     */     
/* 124 */     if (j == 0) {
/* 125 */       throw a.create();
/*     */     }
/*     */     
/* 128 */     if (collection.size() == 1) {
/* 129 */       ☃.a(new ir("commands.experience.set." + a1.e + ".success.single", new Object[] { Integer.valueOf(i), ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 131 */       ☃.a(new ir("commands.experience.set." + a1.e + ".success.multiple", new Object[] { Integer.valueOf(i), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 134 */     return collection.size();
/*     */   }
/*     */   enum a { a, b;
/*     */     static {
/* 138 */       a = new a("POINTS", 0, "points", aog::d, (☃, integer) -> {
/*     */             if (integer.intValue() >= ☃.dv()) {
/*     */               return false;
/*     */             }
/*     */             ☃.a(integer.intValue());
/*     */             return true;
/*     */           }☃ -> xq.d(☃.bY * ☃.dv()));
/* 145 */       b = new a("LEVELS", 1, "levels", tf::c, (☃, integer) -> {
/*     */             ☃.b(integer.intValue());
/*     */             return true;
/*     */           }☃ -> ☃.bW);
/*     */     }
/*     */     public final BiConsumer<tf, Integer> c;
/*     */     public final BiPredicate<tf, Integer> d;
/*     */     public final String e;
/*     */     private final ToIntFunction<tf> f;
/*     */     
/*     */     a(String ☃, BiConsumer<tf, Integer> biConsumer, BiPredicate<tf, Integer> biPredicate, ToIntFunction<tf> toIntFunction) {
/* 156 */       this.c = biConsumer;
/* 157 */       this.e = ☃;
/* 158 */       this.d = biPredicate;
/* 159 */       this.f = toIntFunction;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\qn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */