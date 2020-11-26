/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qj
/*     */ {
/*  30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.effect.give.failed", new Object[0]));
/*  31 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.effect.clear.everything.failed", new Object[0]));
/*  32 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.effect.clear.specific.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  35 */     ☃.register(
/*  36 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("effect")
/*  37 */         .requires(☃ -> ☃.c(2)))
/*  38 */         .then(
/*  39 */           bv.a("clear")
/*  40 */           .then((
/*  41 */             (RequiredArgumentBuilder)bv.<T>a("targets", cb.b())
/*  42 */             .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"))))
/*  43 */             .then(
/*  44 */               bv.<T>a("effect", cg.a())
/*  45 */               .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cg.a(☃, "effect")))))))
/*     */ 
/*     */ 
/*     */         
/*  49 */         .then(
/*  50 */           bv.a("give")
/*  51 */           .then(
/*  52 */             bv.<T>a("targets", cb.b())
/*  53 */             .then((
/*  54 */               (RequiredArgumentBuilder)bv.<T>a("effect", cg.a())
/*  55 */               .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cg.a(☃, "effect"), null, 0, true)))
/*  56 */               .then((
/*  57 */                 (RequiredArgumentBuilder)bv.<T>a("seconds", (ArgumentType<T>)IntegerArgumentType.integer(1, 1000000))
/*  58 */                 .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cg.a(☃, "effect"), Integer.valueOf(IntegerArgumentType.getInteger(☃, "seconds")), 0, true)))
/*  59 */                 .then((
/*  60 */                   (RequiredArgumentBuilder)bv.<T>a("amplifier", (ArgumentType<T>)IntegerArgumentType.integer(0, 255))
/*  61 */                   .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cg.a(☃, "effect"), Integer.valueOf(IntegerArgumentType.getInteger(☃, "seconds")), IntegerArgumentType.getInteger(☃, "amplifier"), true)))
/*  62 */                   .then(
/*  63 */                     bv.<T>a("hideParticles", (ArgumentType<T>)BoolArgumentType.bool())
/*  64 */                     .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cg.a(☃, "effect"), Integer.valueOf(IntegerArgumentType.getInteger(☃, "seconds")), IntegerArgumentType.getInteger(☃, "amplifier"), !BoolArgumentType.getBool(☃, "hideParticles"))))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection, aej aej1, @Nullable Integer integer, int i, boolean bool) throws CommandSyntaxException {
/*  75 */     int k, j = 0;
/*     */ 
/*     */     
/*  78 */     if (integer != null) {
/*  79 */       if (aej1.a()) {
/*  80 */         k = integer.intValue();
/*     */       } else {
/*  82 */         k = integer.intValue() * 20;
/*     */       }
/*     */     
/*  85 */     } else if (aej1.a()) {
/*  86 */       k = 1;
/*     */     } else {
/*  88 */       k = 600;
/*     */     } 
/*     */ 
/*     */     
/*  92 */     for (aer aer : collection) {
/*  93 */       if (aer instanceof afa) {
/*  94 */         aek aek = new aek(aej1, k, i, false, bool);
/*  95 */         if (((afa)aer).c(aek)) {
/*  96 */           j++;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 101 */     if (j == 0) {
/* 102 */       throw a.create();
/*     */     }
/*     */     
/* 105 */     if (collection.size() == 1) {
/* 106 */       ☃.a(new ir("commands.effect.give.success.single", new Object[] { aej1.d(), ((aer)collection.iterator().next()).O(), Integer.valueOf(k / 20) }), true);
/*     */     } else {
/* 108 */       ☃.a(new ir("commands.effect.give.success.multiple", new Object[] { aej1.d(), Integer.valueOf(collection.size()), Integer.valueOf(k / 20) }), true);
/*     */     } 
/*     */     
/* 111 */     return j;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection) throws CommandSyntaxException {
/* 115 */     int i = 0;
/*     */     
/* 117 */     for (aer aer : collection) {
/* 118 */       if (aer instanceof afa && (
/* 119 */         (afa)aer).cm()) {
/* 120 */         i++;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 125 */     if (i == 0) {
/* 126 */       throw b.create();
/*     */     }
/*     */     
/* 129 */     if (collection.size() == 1) {
/* 130 */       ☃.a(new ir("commands.effect.clear.everything.success.single", new Object[] { ((aer)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 132 */       ☃.a(new ir("commands.effect.clear.everything.success.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 135 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection, aej aej1) throws CommandSyntaxException {
/* 139 */     int i = 0;
/*     */     
/* 141 */     for (aer aer : collection) {
/* 142 */       if (aer instanceof afa && (
/* 143 */         (afa)aer).d(aej1)) {
/* 144 */         i++;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 149 */     if (i == 0) {
/* 150 */       throw c.create();
/*     */     }
/*     */     
/* 153 */     if (collection.size() == 1) {
/* 154 */       ☃.a(new ir("commands.effect.clear.specific.success.single", new Object[] { aej1.d(), ((aer)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 156 */       ☃.a(new ir("commands.effect.clear.specific.success.multiple", new Object[] { aej1.d(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 159 */     return i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */