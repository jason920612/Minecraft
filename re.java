/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class re
/*     */ {
/*  32 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.playsound.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  35 */     RequiredArgumentBuilder<bu, pc> requiredArgumentBuilder = bv.<T>a("sound", co.a()).suggests(eb.c);
/*     */     
/*  37 */     for (wk wk : wk.values()) {
/*  38 */       requiredArgumentBuilder.then((ArgumentBuilder)a(wk));
/*     */     }
/*     */     
/*  41 */     ☃.register(
/*  42 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("playsound")
/*  43 */         .requires(☃ -> ☃.c(2)))
/*  44 */         .then((ArgumentBuilder)requiredArgumentBuilder));
/*     */   }
/*     */ 
/*     */   
/*     */   private static LiteralArgumentBuilder<bu> a(wk ☃) {
/*  49 */     return (LiteralArgumentBuilder<bu>)bv.a(☃.a())
/*  50 */       .then((
/*  51 */         (RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/*  52 */         .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), co.c(commandContext, "sound"), ☃, ((bu)commandContext.getSource()).d(), 1.0F, 1.0F, 0.0F)))
/*  53 */         .then((
/*  54 */           (RequiredArgumentBuilder)bv.<T>a("pos", df.a())
/*  55 */           .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), co.c(commandContext, "sound"), ☃, df.a(commandContext, "pos"), 1.0F, 1.0F, 0.0F)))
/*  56 */           .then((
/*  57 */             (RequiredArgumentBuilder)bv.<T>a("volume", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  58 */             .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), co.c(commandContext, "sound"), ☃, df.a(commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), 1.0F, 0.0F)))
/*  59 */             .then((
/*  60 */               (RequiredArgumentBuilder)bv.<T>a("pitch", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F, 2.0F))
/*  61 */               .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), co.c(commandContext, "sound"), ☃, df.a(commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), 0.0F)))
/*  62 */               .then(
/*  63 */                 bv.<T>a("minVolume", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F, 1.0F))
/*  64 */                 .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), co.c(commandContext, "sound"), ☃, df.a(commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), ((Float)commandContext.getArgument("minVolume", Float.class)).floatValue())))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection, pc pc1, wk wk1, cee cee1, float f1, float f2, float f3) throws CommandSyntaxException {
/*  73 */     double d = Math.pow((f1 > 1.0F) ? (f1 * 16.0F) : 16.0D, 2.0D);
/*  74 */     int i = 0;
/*     */     
/*  76 */     for (tf tf : collection) {
/*  77 */       double d1 = cee1.b - tf.q;
/*  78 */       double d2 = cee1.c - tf.r;
/*  79 */       double d3 = cee1.d - tf.s;
/*  80 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  81 */       cee cee2 = cee1;
/*  82 */       float f = f1;
/*     */       
/*  84 */       if (d4 > d) {
/*  85 */         if (f3 <= 0.0F) {
/*     */           continue;
/*     */         }
/*     */         
/*  89 */         double d5 = xq.a(d4);
/*  90 */         cee2 = new cee(tf.q + d1 / d5 * 2.0D, tf.r + d2 / d5 * 2.0D, tf.s + d3 / d5 * 2.0D);
/*  91 */         f = f3;
/*     */       } 
/*     */       
/*  94 */       tf.a.a(new jz(pc1, wk1, cee2, f, f2));
/*  95 */       i++;
/*     */     } 
/*     */     
/*  98 */     if (i == 0) {
/*  99 */       throw a.create();
/*     */     }
/*     */     
/* 102 */     if (collection.size() == 1) {
/* 103 */       ☃.a(new ir("commands.playsound.success.single", new Object[] { pc1, ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 105 */       ☃.a(new ir("commands.playsound.success.single", new Object[] { pc1, ((tf)collection.iterator().next()).O() }), true);
/*     */     } 
/*     */     
/* 108 */     return i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\re.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */