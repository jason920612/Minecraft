/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class rn
/*     */ {
/*  54 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.scoreboard.objectives.add.duplicate", new Object[0]));
/*  55 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.scoreboard.objectives.display.alreadyEmpty", new Object[0]));
/*  56 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.scoreboard.objectives.display.alreadySet", new Object[0]));
/*  57 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.scoreboard.players.enable.failed", new Object[0])); private static final Dynamic2CommandExceptionType f;
/*  58 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("commands.scoreboard.players.enable.invalid", new Object[0])); static {
/*  59 */     f = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.scoreboard.players.get.null", new Object[] { ☃, object1 }));
/*     */   }
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  62 */     ☃.register(
/*  63 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("scoreboard")
/*  64 */         .requires(☃ -> ☃.c(2)))
/*  65 */         .then((
/*  66 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("objectives")
/*  67 */           .then(
/*  68 */             bv.a("list")
/*  69 */             .executes(☃ -> b((bu)☃.getSource()))))
/*     */           
/*  71 */           .then(
/*  72 */             bv.a("add")
/*  73 */             .then(
/*  74 */               bv.<T>a("objective", (ArgumentType<T>)StringArgumentType.word())
/*  75 */               .then((
/*  76 */                 (RequiredArgumentBuilder)bv.<T>a("criteria", ck.a())
/*  77 */                 .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "objective"), ck.a(☃, "criteria"), new iq(StringArgumentType.getString(☃, "objective")))))
/*  78 */                 .then(
/*  79 */                   bv.<T>a("displayName", by.a())
/*  80 */                   .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "objective"), ck.a(☃, "criteria"), by.a(☃, "displayName"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  85 */           .then(
/*  86 */             bv.a("modify")
/*  87 */             .then((
/*  88 */               (RequiredArgumentBuilder)bv.<T>a("objective", cj.a())
/*  89 */               .then(
/*  90 */                 bv.a("displayname")
/*  91 */                 .then(
/*  92 */                   bv.<T>a("displayName", by.a())
/*  93 */                   .executes(☃ -> a((bu)☃.getSource(), cj.a(☃, "objective"), by.a(☃, "displayName"))))))
/*     */               
/*  95 */               .then((ArgumentBuilder)a()))))
/*     */ 
/*     */           
/*  98 */           .then(
/*  99 */             bv.a("remove")
/* 100 */             .then(
/* 101 */               bv.<T>a("objective", cj.a())
/* 102 */               .executes(☃ -> a((bu)☃.getSource(), cj.a(☃, "objective"))))))
/*     */ 
/*     */           
/* 105 */           .then(
/* 106 */             bv.a("setdisplay")
/* 107 */             .then((
/* 108 */               (RequiredArgumentBuilder)bv.<T>a("slot", cq.a())
/* 109 */               .executes(☃ -> a((bu)☃.getSource(), cq.a(☃, "slot"))))
/* 110 */               .then(
/* 111 */                 bv.<T>a("objective", cj.a())
/* 112 */                 .executes(☃ -> a((bu)☃.getSource(), cq.a(☃, "slot"), cj.a(☃, "objective"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 117 */         .then((
/* 118 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("players")
/* 119 */           .then((
/* 120 */             (LiteralArgumentBuilder)bv.a("list")
/* 121 */             .executes(☃ -> a((bu)☃.getSource())))
/* 122 */             .then(
/* 123 */               bv.<T>a("target", cp.a())
/* 124 */               .suggests(cp.a)
/* 125 */               .executes(☃ -> a((bu)☃.getSource(), cp.a(☃, "target"))))))
/*     */ 
/*     */           
/* 128 */           .then(
/* 129 */             bv.a("set")
/* 130 */             .then(
/* 131 */               bv.<T>a("targets", cp.b())
/* 132 */               .suggests(cp.a)
/* 133 */               .then(
/* 134 */                 bv.<T>a("objective", cj.a())
/* 135 */                 .then(
/* 136 */                   bv.<T>a("score", (ArgumentType<T>)IntegerArgumentType.integer())
/* 137 */                   .executes(☃ -> a((bu)☃.getSource(), cp.c(☃, "targets"), cj.b(☃, "objective"), IntegerArgumentType.getInteger(☃, "score"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 142 */           .then(
/* 143 */             bv.a("get")
/* 144 */             .then(
/* 145 */               bv.<T>a("target", cp.a())
/* 146 */               .suggests(cp.a)
/* 147 */               .then(
/* 148 */                 bv.<T>a("objective", cj.a())
/* 149 */                 .executes(☃ -> a((bu)☃.getSource(), cp.a(☃, "target"), cj.a(☃, "objective")))))))
/*     */ 
/*     */ 
/*     */           
/* 153 */           .then(
/* 154 */             bv.a("add")
/* 155 */             .then(
/* 156 */               bv.<T>a("targets", cp.b())
/* 157 */               .suggests(cp.a)
/* 158 */               .then(
/* 159 */                 bv.<T>a("objective", cj.a())
/* 160 */                 .then(
/* 161 */                   bv.<T>a("score", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 162 */                   .executes(☃ -> b((bu)☃.getSource(), cp.c(☃, "targets"), cj.b(☃, "objective"), IntegerArgumentType.getInteger(☃, "score"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 167 */           .then(
/* 168 */             bv.a("remove")
/* 169 */             .then(
/* 170 */               bv.<T>a("targets", cp.b())
/* 171 */               .suggests(cp.a)
/* 172 */               .then(
/* 173 */                 bv.<T>a("objective", cj.a())
/* 174 */                 .then(
/* 175 */                   bv.<T>a("score", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 176 */                   .executes(☃ -> c((bu)☃.getSource(), cp.c(☃, "targets"), cj.b(☃, "objective"), IntegerArgumentType.getInteger(☃, "score"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 181 */           .then(
/* 182 */             bv.a("reset")
/* 183 */             .then((
/* 184 */               (RequiredArgumentBuilder)bv.<T>a("targets", cp.b())
/* 185 */               .suggests(cp.a)
/* 186 */               .executes(☃ -> a((bu)☃.getSource(), cp.c(☃, "targets"))))
/* 187 */               .then(
/* 188 */                 bv.<T>a("objective", cj.a())
/* 189 */                 .executes(☃ -> b((bu)☃.getSource(), cp.c(☃, "targets"), cj.a(☃, "objective")))))))
/*     */ 
/*     */ 
/*     */           
/* 193 */           .then(
/* 194 */             bv.a("enable")
/* 195 */             .then(
/* 196 */               bv.<T>a("targets", cp.b())
/* 197 */               .suggests(cp.a)
/* 198 */               .then(
/* 199 */                 bv.<T>a("objective", cj.a())
/* 200 */                 .suggests((☃, suggestionsBuilder) -> a((bu)☃.getSource(), cp.c(☃, "targets"), suggestionsBuilder))
/* 201 */                 .executes(☃ -> a((bu)☃.getSource(), cp.c(☃, "targets"), cj.a(☃, "objective")))))))
/*     */ 
/*     */ 
/*     */           
/* 205 */           .then(
/* 206 */             bv.a("operation")
/* 207 */             .then(
/* 208 */               bv.<T>a("targets", cp.b())
/* 209 */               .suggests(cp.a)
/* 210 */               .then(
/* 211 */                 bv.<T>a("targetObjective", cj.a())
/* 212 */                 .then(
/* 213 */                   bv.<T>a("operation", cl.a())
/* 214 */                   .then(
/* 215 */                     bv.<T>a("source", cp.b())
/* 216 */                     .suggests(cp.a)
/* 217 */                     .then(
/* 218 */                       bv.<T>a("sourceObjective", cj.a())
/* 219 */                       .executes(☃ -> a((bu)☃.getSource(), cp.c(☃, "targets"), cj.b(☃, "targetObjective"), cl.a(☃, "operation"), cp.c(☃, "source"), cj.a(☃, "sourceObjective")))))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static LiteralArgumentBuilder<bu> a() {
/* 231 */     LiteralArgumentBuilder<bu> ☃ = bv.a("rendertype");
/*     */     
/* 233 */     for (cff.a a : cff.a.values()) {
/* 234 */       ☃.then(bv.a(a.a())
/* 235 */           .executes(commandContext -> a((bu)commandContext.getSource(), cj.a(commandContext, "objective"), ☃)));
/*     */     }
/*     */     
/* 238 */     return ☃;
/*     */   }
/*     */   
/*     */   private static CompletableFuture<Suggestions> a(bu ☃, Collection<String> collection, SuggestionsBuilder suggestionsBuilder) {
/* 242 */     List<String> list = Lists.newArrayList();
/* 243 */     cfc cfc = ☃.j().aM();
/*     */     
/* 245 */     for (cez cez : cfc.c()) {
/* 246 */       if (cez.c() == cff.c) {
/* 247 */         boolean bool = false;
/* 248 */         for (String str : collection) {
/* 249 */           if (!cfc.b(str, cez) || cfc.c(str, cez).g()) {
/* 250 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 254 */         if (bool) {
/* 255 */           list.add(cez.b());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 260 */     return bw.b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, String str, cez cez1) throws CommandSyntaxException {
/* 264 */     cfc cfc = ☃.j().aM();
/* 265 */     if (!cfc.b(str, cez1)) {
/* 266 */       throw f.create(cez1.b(), str);
/*     */     }
/*     */     
/* 269 */     cfb cfb = cfc.c(str, cez1);
/* 270 */     ☃.a(new ir("commands.scoreboard.players.get.success", new Object[] { str, Integer.valueOf(cfb.b()), cez1.e() }), false);
/*     */     
/* 272 */     return cfb.b();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<String> collection1, cez cez1, cl.a a1, Collection<String> collection2, cez cez2) throws CommandSyntaxException {
/* 276 */     cfc cfc = ☃.j().aM();
/* 277 */     int i = 0;
/*     */     
/* 279 */     for (String str : collection1) {
/* 280 */       cfb cfb = cfc.c(str, cez1);
/* 281 */       for (String str1 : collection2) {
/* 282 */         cfb cfb1 = cfc.c(str1, cez2);
/* 283 */         a1.apply(cfb, cfb1);
/*     */       } 
/* 285 */       i += cfb.b();
/*     */     } 
/*     */     
/* 288 */     if (collection1.size() == 1) {
/* 289 */       ☃.a(new ir("commands.scoreboard.players.operation.success.single", new Object[] { cez1.e(), collection1.iterator().next(), Integer.valueOf(i) }), true);
/*     */     } else {
/* 291 */       ☃.a(new ir("commands.scoreboard.players.operation.success.multiple", new Object[] { cez1.e(), Integer.valueOf(collection1.size()) }), true);
/*     */     } 
/*     */     
/* 294 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<String> collection, cez cez1) throws CommandSyntaxException {
/* 298 */     if (cez1.c() != cff.c) {
/* 299 */       throw e.create();
/*     */     }
/* 301 */     cfc cfc = ☃.j().aM();
/*     */     
/* 303 */     int i = 0;
/*     */     
/* 305 */     for (String str : collection) {
/* 306 */       cfb cfb = cfc.c(str, cez1);
/* 307 */       if (cfb.g()) {
/* 308 */         cfb.a(false);
/* 309 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 313 */     if (i == 0) {
/* 314 */       throw d.create();
/*     */     }
/*     */     
/* 317 */     if (collection.size() == 1) {
/* 318 */       ☃.a(new ir("commands.scoreboard.players.enable.success.single", new Object[] { cez1.e(), collection.iterator().next() }), true);
/*     */     } else {
/* 320 */       ☃.a(new ir("commands.scoreboard.players.enable.success.multiple", new Object[] { cez1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 323 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<String> collection) {
/* 327 */     cfc cfc = ☃.j().aM();
/*     */     
/* 329 */     for (String str : collection) {
/* 330 */       cfc.d(str, null);
/*     */     }
/*     */     
/* 333 */     if (collection.size() == 1) {
/* 334 */       ☃.a(new ir("commands.scoreboard.players.reset.all.single", new Object[] { collection.iterator().next() }), true);
/*     */     } else {
/* 336 */       ☃.a(new ir("commands.scoreboard.players.reset.all.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 339 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<String> collection, cez cez1) {
/* 343 */     cfc cfc = ☃.j().aM();
/*     */     
/* 345 */     for (String str : collection) {
/* 346 */       cfc.d(str, cez1);
/*     */     }
/*     */     
/* 349 */     if (collection.size() == 1) {
/* 350 */       ☃.a(new ir("commands.scoreboard.players.reset.specific.single", new Object[] { cez1.e(), collection.iterator().next() }), true);
/*     */     } else {
/* 352 */       ☃.a(new ir("commands.scoreboard.players.reset.specific.multiple", new Object[] { cez1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 355 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<String> collection, cez cez1, int i) {
/* 359 */     cfc cfc = ☃.j().aM();
/*     */     
/* 361 */     for (String str : collection) {
/* 362 */       cfb cfb = cfc.c(str, cez1);
/* 363 */       cfb.c(i);
/*     */     } 
/*     */     
/* 366 */     if (collection.size() == 1) {
/* 367 */       ☃.a(new ir("commands.scoreboard.players.set.success.single", new Object[] { cez1.e(), collection.iterator().next(), Integer.valueOf(i) }), true);
/*     */     } else {
/* 369 */       ☃.a(new ir("commands.scoreboard.players.set.success.multiple", new Object[] { cez1.e(), Integer.valueOf(collection.size()), Integer.valueOf(i) }), true);
/*     */     } 
/*     */     
/* 372 */     return i * collection.size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<String> collection, cez cez1, int i) {
/* 376 */     cfc cfc = ☃.j().aM();
/* 377 */     int j = 0;
/*     */     
/* 379 */     for (String str : collection) {
/* 380 */       cfb cfb = cfc.c(str, cez1);
/* 381 */       cfb.c(cfb.b() + i);
/* 382 */       j += cfb.b();
/*     */     } 
/*     */     
/* 385 */     if (collection.size() == 1) {
/* 386 */       ☃.a(new ir("commands.scoreboard.players.add.success.single", new Object[] { Integer.valueOf(i), cez1.e(), collection.iterator().next(), Integer.valueOf(j) }), true);
/*     */     } else {
/* 388 */       ☃.a(new ir("commands.scoreboard.players.add.success.multiple", new Object[] { Integer.valueOf(i), cez1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 391 */     return j;
/*     */   }
/*     */   
/*     */   private static int c(bu ☃, Collection<String> collection, cez cez1, int i) {
/* 395 */     cfc cfc = ☃.j().aM();
/* 396 */     int j = 0;
/*     */     
/* 398 */     for (String str : collection) {
/* 399 */       cfb cfb = cfc.c(str, cez1);
/* 400 */       cfb.c(cfb.b() - i);
/* 401 */       j += cfb.b();
/*     */     } 
/*     */     
/* 404 */     if (collection.size() == 1) {
/* 405 */       ☃.a(new ir("commands.scoreboard.players.remove.success.single", new Object[] { Integer.valueOf(i), cez1.e(), collection.iterator().next(), Integer.valueOf(j) }), true);
/*     */     } else {
/* 407 */       ☃.a(new ir("commands.scoreboard.players.remove.success.multiple", new Object[] { Integer.valueOf(i), cez1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 410 */     return j;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃) {
/* 414 */     Collection<String> collection = ☃.j().aM().e();
/*     */     
/* 416 */     if (collection.isEmpty()) {
/* 417 */       ☃.a(new ir("commands.scoreboard.players.list.empty", new Object[0]), false);
/*     */     } else {
/* 419 */       ☃.a(new ir("commands.scoreboard.players.list.success", new Object[] { Integer.valueOf(collection.size()), ik.a(collection) }), false);
/*     */     } 
/*     */     
/* 422 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, String str) {
/* 426 */     Map<cez, cfb> map = ☃.j().aM().e(str);
/*     */     
/* 428 */     if (map.isEmpty()) {
/* 429 */       ☃.a(new ir("commands.scoreboard.players.list.entity.empty", new Object[] { str }), false);
/*     */     } else {
/* 431 */       ☃.a(new ir("commands.scoreboard.players.list.entity.success", new Object[] { str, Integer.valueOf(map.size()) }), false);
/* 432 */       for (Map.Entry<cez, cfb> entry : map.entrySet()) {
/* 433 */         ☃.a(new ir("commands.scoreboard.players.list.entity.entry", new Object[] { ((cez)entry.getKey()).e(), Integer.valueOf(((cfb)entry.getValue()).b()) }), false);
/*     */       } 
/*     */     } 
/*     */     
/* 437 */     return map.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, int i) throws CommandSyntaxException {
/* 441 */     cfc cfc = ☃.j().aM();
/*     */     
/* 443 */     if (cfc.a(i) == null) {
/* 444 */       throw b.create();
/*     */     }
/*     */     
/* 447 */     cfc.a(i, (cez)null);
/* 448 */     ☃.a(new ir("commands.scoreboard.objectives.display.cleared", new Object[] { cfc.h()[i] }), true);
/*     */     
/* 450 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, int i, cez cez1) throws CommandSyntaxException {
/* 454 */     cfc cfc = ☃.j().aM();
/*     */     
/* 456 */     if (cfc.a(i) == cez1) {
/* 457 */       throw c.create();
/*     */     }
/*     */     
/* 460 */     cfc.a(i, cez1);
/* 461 */     ☃.a(new ir("commands.scoreboard.objectives.display.set", new Object[] { cfc.h()[i], cez1.d() }), true);
/*     */     
/* 463 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cez cez1, ij ij1) {
/* 467 */     if (!cez1.d().equals(ij1)) {
/* 468 */       cez1.a(ij1);
/* 469 */       ☃.a(new ir("commands.scoreboard.objectives.modify.displayname", new Object[] { cez1.b(), cez1.e() }), true);
/*     */     } 
/*     */     
/* 472 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cez cez1, cff.a a1) {
/* 476 */     if (cez1.f() != a1) {
/* 477 */       cez1.a(a1);
/* 478 */       ☃.a(new ir("commands.scoreboard.objectives.modify.rendertype", new Object[] { cez1.e() }), true);
/*     */     } 
/*     */     
/* 481 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cez cez1) {
/* 485 */     cfc cfc = ☃.j().aM();
/* 486 */     cfc.j(cez1);
/* 487 */     ☃.a(new ir("commands.scoreboard.objectives.remove.success", new Object[] { cez1.e() }), true);
/* 488 */     return cfc.c().size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, String str, cff cff1, ij ij1) throws CommandSyntaxException {
/* 492 */     cfc cfc = ☃.j().aM();
/*     */     
/* 494 */     if (cfc.d(str) != null) {
/* 495 */       throw a.create();
/*     */     }
/* 497 */     if (str.length() > 16) {
/* 498 */       throw cj.a.create(Integer.valueOf(16));
/*     */     }
/*     */     
/* 501 */     cfc.a(str, cff1, ij1, cff1.e());
/* 502 */     cez cez = cfc.d(str);
/*     */     
/* 504 */     ☃.a(new ir("commands.scoreboard.objectives.add.success", new Object[] { cez.e() }), true);
/*     */     
/* 506 */     return cfc.c().size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃) {
/* 510 */     Collection<cez> collection = ☃.j().aM().c();
/*     */     
/* 512 */     if (collection.isEmpty()) {
/* 513 */       ☃.a(new ir("commands.scoreboard.objectives.list.empty", new Object[0]), false);
/*     */     } else {
/* 515 */       ☃.a(new ir("commands.scoreboard.objectives.list.success", new Object[] { Integer.valueOf(collection.size()), ik.b(collection, cez::e) }), false);
/*     */     } 
/*     */     
/* 518 */     return collection.size();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\rn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */