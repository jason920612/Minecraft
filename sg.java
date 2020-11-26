/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
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
/*     */ public class sg
/*     */ {
/*  25 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.worldborder.center.failed", new Object[0]));
/*  26 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.worldborder.set.failed.nochange", new Object[0]));
/*  27 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.worldborder.set.failed.small.", new Object[0]));
/*  28 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.worldborder.set.failed.big.", new Object[0]));
/*  29 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("commands.worldborder.warning.time.failed", new Object[0]));
/*  30 */   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new ir("commands.worldborder.warning.distance.failed", new Object[0]));
/*  31 */   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new ir("commands.worldborder.damage.buffer.failed", new Object[0]));
/*  32 */   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new ir("commands.worldborder.damage.amount.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  35 */     ☃.register(
/*  36 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("worldborder")
/*  37 */         .requires(☃ -> ☃.c(2)))
/*  38 */         .then(
/*  39 */           bv.a("add")
/*  40 */           .then((
/*  41 */             (RequiredArgumentBuilder)bv.<T>a("distance", (ArgumentType<T>)FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
/*  42 */             .executes(☃ -> a((bu)☃.getSource(), ((bu)☃.getSource()).e().d().h() + FloatArgumentType.getFloat(☃, "distance"), 0L)))
/*  43 */             .then(
/*  44 */               bv.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  45 */               .executes(☃ -> a((bu)☃.getSource(), ((bu)☃.getSource()).e().d().h() + FloatArgumentType.getFloat(☃, "distance"), ((bu)☃.getSource()).e().d().i() + IntegerArgumentType.getInteger(☃, "time") * 1000L))))))
/*     */ 
/*     */ 
/*     */         
/*  49 */         .then(
/*  50 */           bv.a("set")
/*  51 */           .then((
/*  52 */             (RequiredArgumentBuilder)bv.<T>a("distance", (ArgumentType<T>)FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
/*  53 */             .executes(☃ -> a((bu)☃.getSource(), FloatArgumentType.getFloat(☃, "distance"), 0L)))
/*  54 */             .then(
/*  55 */               bv.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  56 */               .executes(☃ -> a((bu)☃.getSource(), FloatArgumentType.getFloat(☃, "distance"), IntegerArgumentType.getInteger(☃, "time") * 1000L))))))
/*     */ 
/*     */ 
/*     */         
/*  60 */         .then(
/*  61 */           bv.a("center")
/*  62 */           .then(
/*  63 */             bv.<T>a("pos", de.a())
/*  64 */             .executes(☃ -> a((bu)☃.getSource(), de.a(☃, "pos"))))))
/*     */ 
/*     */         
/*  67 */         .then((
/*  68 */           (LiteralArgumentBuilder)bv.a("damage")
/*  69 */           .then(
/*  70 */             bv.a("amount")
/*  71 */             .then(
/*  72 */               bv.<T>a("damagePerBlock", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  73 */               .executes(☃ -> b((bu)☃.getSource(), FloatArgumentType.getFloat(☃, "damagePerBlock"))))))
/*     */ 
/*     */           
/*  76 */           .then(
/*  77 */             bv.a("buffer")
/*  78 */             .then(
/*  79 */               bv.<T>a("distance", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  80 */               .executes(☃ -> a((bu)☃.getSource(), FloatArgumentType.getFloat(☃, "distance")))))))
/*     */ 
/*     */ 
/*     */         
/*  84 */         .then(
/*  85 */           bv.a("get")
/*  86 */           .executes(☃ -> a((bu)☃.getSource()))))
/*     */         
/*  88 */         .then((
/*  89 */           (LiteralArgumentBuilder)bv.a("warning")
/*  90 */           .then(
/*  91 */             bv.a("distance")
/*  92 */             .then(
/*  93 */               bv.<T>a("distance", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  94 */               .executes(☃ -> b((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "distance"))))))
/*     */ 
/*     */           
/*  97 */           .then(
/*  98 */             bv.a("time")
/*  99 */             .then(
/* 100 */               bv.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 101 */               .executes(☃ -> a((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "time")))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, float f) throws CommandSyntaxException {
/* 109 */     bmv bmv = ☃.e().d();
/* 110 */     if (bmv.m() == f) {
/* 111 */       throw g.create();
/*     */     }
/* 113 */     bmv.b(f);
/* 114 */     ☃.a(new ir("commands.worldborder.damage.buffer.success", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f) }) }), true);
/* 115 */     return (int)f;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, float f) throws CommandSyntaxException {
/* 119 */     bmv bmv = ☃.e().d();
/* 120 */     if (bmv.n() == f) {
/* 121 */       throw h.create();
/*     */     }
/* 123 */     bmv.c(f);
/* 124 */     ☃.a(new ir("commands.worldborder.damage.amount.success", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f) }) }), true);
/* 125 */     return (int)f;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, int i) throws CommandSyntaxException {
/* 129 */     bmv bmv = ☃.e().d();
/* 130 */     if (bmv.p() == i) {
/* 131 */       throw e.create();
/*     */     }
/* 133 */     bmv.b(i);
/* 134 */     ☃.a(new ir("commands.worldborder.warning.time.success", new Object[] { Integer.valueOf(i) }), true);
/* 135 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, int i) throws CommandSyntaxException {
/* 139 */     bmv bmv = ☃.e().d();
/* 140 */     if (bmv.q() == i) {
/* 141 */       throw f.create();
/*     */     }
/* 143 */     bmv.c(i);
/* 144 */     ☃.a(new ir("commands.worldborder.warning.distance.success", new Object[] { Integer.valueOf(i) }), true);
/* 145 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃) {
/* 149 */     double d = ☃.e().d().h();
/* 150 */     ☃.a(new ir("commands.worldborder.get", new Object[] { String.format(Locale.ROOT, "%.0f", new Object[] { Double.valueOf(d) }) }), false);
/* 151 */     return xq.c(d + 0.5D);
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, ced ced1) throws CommandSyntaxException {
/* 155 */     bmv bmv = ☃.e().d();
/* 156 */     if (bmv.f() == ced1.i && bmv.g() == ced1.j) {
/* 157 */       throw a.create();
/*     */     }
/*     */     
/* 160 */     bmv.c(ced1.i, ced1.j);
/* 161 */     ☃.a(new ir("commands.worldborder.center.success", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(ced1.i) }), String.format("%.2f", new Object[] { Float.valueOf(ced1.j) }) }), true);
/*     */     
/* 163 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, double d, long l) throws CommandSyntaxException {
/* 167 */     bmv bmv = ☃.e().d();
/* 168 */     double d1 = bmv.h();
/*     */     
/* 170 */     if (d1 == d) {
/* 171 */       throw b.create();
/*     */     }
/* 173 */     if (d < 1.0D) {
/* 174 */       throw c.create();
/*     */     }
/* 176 */     if (d > 6.0E7D) {
/* 177 */       throw d.create();
/*     */     }
/*     */     
/* 180 */     if (l > 0L) {
/* 181 */       bmv.a(d1, d, l);
/* 182 */       if (d > d1) {
/* 183 */         ☃.a(new ir("commands.worldborder.set.grow", new Object[] { String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d) }), Long.toString(l / 1000L) }), true);
/*     */       } else {
/* 185 */         ☃.a(new ir("commands.worldborder.set.shrink", new Object[] { String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d) }), Long.toString(l / 1000L) }), true);
/*     */       } 
/*     */     } else {
/* 188 */       bmv.a(d);
/* 189 */       ☃.a(new ir("commands.worldborder.set.immediate", new Object[] { String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d) }) }), true);
/*     */     } 
/*     */     
/* 192 */     return (int)(d - d1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */