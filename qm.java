/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.ResultConsumer;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.BinaryOperator;
/*     */ import java.util.function.IntFunction;
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
/*     */ public class qm
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   
/*     */   static {
/*  88 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.execute.blocks.toobig", new Object[] { ☃, object1 }));
/*     */   }
/*  90 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.execute.conditional.fail", new Object[0])); private static final DynamicCommandExceptionType c; static {
/*  91 */     c = new DynamicCommandExceptionType(☃ -> new ir("commands.execute.conditional.fail_count", new Object[] { ☃ }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final BinaryOperator<ResultConsumer<bu>> d = (☃, resultConsumer1) -> ();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/* 104 */     LiteralCommandNode<bu> literalCommandNode = ☃.register((LiteralArgumentBuilder)bv.a("execute").requires(☃ -> ☃.c(2)));
/*     */     
/* 106 */     ☃.register(
/* 107 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("execute")
/* 108 */         .requires(☃ -> ☃.c(2)))
/* 109 */         .then(
/* 110 */           bv.a("run")
/* 111 */           .redirect((CommandNode)☃.getRoot())))
/*     */         
/* 113 */         .then(
/* 114 */           a((CommandNode<bu>)literalCommandNode, bv.a("if"), true)))
/*     */         
/* 116 */         .then(
/* 117 */           a((CommandNode<bu>)literalCommandNode, bv.a("unless"), false)))
/*     */         
/* 119 */         .then(
/* 120 */           bv.a("as")
/* 121 */           .then(
/* 122 */             bv.<T>a("targets", cb.b())
/* 123 */             .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                 List<bu> list = Lists.newArrayList();
/*     */ 
/*     */                 
/*     */                 for (aer aer : cb.c(☃, "targets")) {
/*     */                   list.add(((bu)☃.getSource()).a(aer));
/*     */                 }
/*     */                 
/*     */                 return list;
/* 132 */               })))).then(
/* 133 */           bv.a("at")
/* 134 */           .then(
/* 135 */             bv.<T>a("targets", cb.b())
/* 136 */             .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                 List<bu> list = Lists.newArrayList();
/*     */ 
/*     */                 
/*     */                 for (aer aer : cb.c(☃, "targets")) {
/*     */                   list.add(((bu)☃.getSource()).a((td)aer.m).a(aer.bI()).a(aer.aO()));
/*     */                 }
/*     */                 
/*     */                 return list;
/* 145 */               })))).then((
/* 146 */           (LiteralArgumentBuilder)bv.a("store")
/* 147 */           .then(a(literalCommandNode, bv.a("result"), true)))
/* 148 */           .then(a(literalCommandNode, bv.a("success"), false))))
/*     */         
/* 150 */         .then((
/* 151 */           (LiteralArgumentBuilder)bv.a("positioned")
/* 152 */           .then(
/* 153 */             bv.<T>a("pos", df.a())
/* 154 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((bu)☃.getSource()).a(df.a(☃, "pos")))))
/*     */           
/* 156 */           .then(
/* 157 */             bv.a("as")
/* 158 */             .then(
/* 159 */               bv.<T>a("targets", cb.b())
/* 160 */               .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                   List<bu> list = Lists.newArrayList();
/*     */ 
/*     */                   
/*     */                   for (aer aer : cb.c(☃, "targets")) {
/*     */                     list.add(((bu)☃.getSource()).a(aer.bI()));
/*     */                   }
/*     */ 
/*     */                   
/*     */                   return list;
/* 170 */                 }))))).then((
/* 171 */           (LiteralArgumentBuilder)bv.a("rotated")
/* 172 */           .then(
/* 173 */             bv.<T>a("rot", dc.a())
/* 174 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((bu)☃.getSource()).a(dc.a(☃, "rot").b((bu)☃.getSource())))))
/*     */           
/* 176 */           .then(
/* 177 */             bv.a("as")
/* 178 */             .then(
/* 179 */               bv.<T>a("targets", cb.b())
/* 180 */               .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                   List<bu> list = Lists.newArrayList();
/*     */ 
/*     */                   
/*     */                   for (aer aer : cb.c(☃, "targets")) {
/*     */                     list.add(((bu)☃.getSource()).a(aer.aO()));
/*     */                   }
/*     */ 
/*     */                   
/*     */                   return list;
/* 190 */                 }))))).then((
/* 191 */           (LiteralArgumentBuilder)bv.a("facing")
/* 192 */           .then(
/* 193 */             bv.a("entity")
/* 194 */             .then(
/* 195 */               bv.<T>a("targets", cb.b())
/* 196 */               .then(
/* 197 */                 bv.<T>a("anchor", ca.a())
/* 198 */                 .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                     List<bu> list = Lists.newArrayList();
/*     */ 
/*     */                     
/*     */                     ca.a a = ca.a(☃, "anchor");
/*     */                     
/*     */                     for (aer aer : cb.c(☃, "targets")) {
/*     */                       list.add(((bu)☃.getSource()).a(aer, a));
/*     */                     }
/*     */                     
/*     */                     return list;
/* 209 */                   }))))).then(
/* 210 */             bv.<T>a("pos", df.a())
/* 211 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((bu)☃.getSource()).b(df.a(☃, "pos"))))))
/*     */ 
/*     */         
/* 214 */         .then(
/* 215 */           bv.a("align")
/* 216 */           .then(
/* 217 */             bv.<T>a("axes", dd.a())
/* 218 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((bu)☃.getSource()).a(((bu)☃.getSource()).d().a(dd.a(☃, "axes")))))))
/*     */ 
/*     */         
/* 221 */         .then(
/* 222 */           bv.a("anchored")
/* 223 */           .then(
/* 224 */             bv.<T>a("anchor", ca.a())
/* 225 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((bu)☃.getSource()).a(ca.a(☃, "anchor"))))))
/*     */ 
/*     */         
/* 228 */         .then(
/* 229 */           bv.a("in")
/* 230 */           .then(
/* 231 */             bv.<T>a("dimension", bz.a())
/* 232 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((bu)☃.getSource()).a(((bu)☃.getSource()).j().a(bz.a(☃, "dimension")))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<bu, ?> a(LiteralCommandNode<bu> ☃, LiteralArgumentBuilder<bu> literalArgumentBuilder, boolean bool) {
/* 239 */     literalArgumentBuilder.then(
/* 240 */         bv.a("score")
/* 241 */         .then(
/* 242 */           bv.<T>a("targets", cp.b())
/* 243 */           .suggests(cp.a)
/* 244 */           .then(
/* 245 */             bv.<T>a("objective", cj.a())
/* 246 */             .redirect((CommandNode)☃, commandContext -> a((bu)commandContext.getSource(), cp.c(commandContext, "targets"), cj.a(commandContext, "objective"), ☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 251 */     literalArgumentBuilder.then(
/* 252 */         bv.a("bossbar")
/* 253 */         .then((
/* 254 */           (RequiredArgumentBuilder)bv.<T>a("id", co.a())
/* 255 */           .suggests(qb.a)
/* 256 */           .then(
/* 257 */             bv.a("value")
/* 258 */             .redirect((CommandNode)☃, commandContext -> a((bu)commandContext.getSource(), qb.a(commandContext), true, ☃))))
/*     */           
/* 260 */           .then(
/* 261 */             bv.a("max")
/* 262 */             .redirect((CommandNode)☃, commandContext -> a((bu)commandContext.getSource(), qb.a(commandContext), false, ☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     for (Iterator<sj.a> iterator = sj.a.iterator(); iterator.hasNext(); ) { sj.a a = iterator.next();
/* 268 */       a.a((ArgumentBuilder)literalArgumentBuilder, argumentBuilder -> argumentBuilder.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("path", ci.a()).then(bv.a("int").then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(bv.a("float").then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(bv.a("short").then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(bv.a("long").then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(bv.a("double").then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(bv.a("byte").then(bv.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ()))))); }
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
/* 322 */     return (ArgumentBuilder)literalArgumentBuilder;
/*     */   }
/*     */   
/*     */   private static bu a(bu ☃, Collection<String> collection, cez cez1, boolean bool) {
/* 326 */     cfc cfc = ☃.j().aM();
/*     */     
/* 328 */     return ☃.a((commandContext, bool2, i) -> { for (String str : ☃) { cfb cfb = cfc1.c(str, cez1); int j = bool1 ? i : (bool2 ? 1 : 0); cfb.c(j); }  }d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static bu a(bu ☃, pu pu1, boolean bool1, boolean bool2) {
/* 338 */     return ☃.a((commandContext, bool2, i) -> { int j = ☃ ? i : (bool2 ? 1 : 0); if (bool1) { pu1.a(j); } else { pu1.b(j); }  }d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static bu a(bu ☃, si si1, ci.c c1, IntFunction<ho> intFunction, boolean bool) {
/* 349 */     return ☃.a((commandContext, bool2, i) -> {
/*     */           try {
/*     */             gy gy = ☃.a();
/*     */             int j = bool1 ? i : (bool2 ? 1 : 0);
/*     */             c1.a(gy, intFunction.apply(j));
/*     */             ☃.a(gy);
/* 355 */           } catch (CommandSyntaxException commandSyntaxException) {}
/*     */         }d);
/*     */   }
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<bu, ?> a(CommandNode<bu> ☃, LiteralArgumentBuilder<bu> literalArgumentBuilder, boolean bool) {
/* 361 */     return ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder
/* 362 */       .then(
/* 363 */         bv.a("block")
/* 364 */         .then(
/* 365 */           bv.<T>a("pos", cy.a())
/* 366 */           .then(
/* 367 */             a(☃, (ArgumentBuilder<bu, ?>)bv.a("block", cu.a()), bool, ☃ -> cu.a(☃, "block").test(new blh(((bu)☃.getSource()).e(), cy.a(☃, "pos"), true)))))))
/*     */ 
/*     */ 
/*     */       
/* 371 */       .then(
/* 372 */         bv.a("score")
/* 373 */         .then(
/* 374 */           bv.<T>a("target", cp.a())
/* 375 */           .suggests(cp.a)
/* 376 */           .then((
/* 377 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("targetObjective", cj.a())
/* 378 */             .then(
/* 379 */               bv.a("=")
/* 380 */               .then(
/* 381 */                 bv.<T>a("source", cp.a())
/* 382 */                 .suggests(cp.a)
/* 383 */                 .then(
/* 384 */                   a(☃, (ArgumentBuilder<bu, ?>)bv.a("sourceObjective", cj.a()), bool, ☃ -> a(☃, Integer::equals))))))
/*     */ 
/*     */ 
/*     */             
/* 388 */             .then(
/* 389 */               bv.a("<")
/* 390 */               .then(
/* 391 */                 bv.<T>a("source", cp.a())
/* 392 */                 .suggests(cp.a)
/* 393 */                 .then(
/* 394 */                   a(☃, (ArgumentBuilder<bu, ?>)bv.a("sourceObjective", cj.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 398 */             .then(
/* 399 */               bv.a("<=")
/* 400 */               .then(
/* 401 */                 bv.<T>a("source", cp.a())
/* 402 */                 .suggests(cp.a)
/* 403 */                 .then(
/* 404 */                   a(☃, (ArgumentBuilder<bu, ?>)bv.a("sourceObjective", cj.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 408 */             .then(
/* 409 */               bv.a(">")
/* 410 */               .then(
/* 411 */                 bv.<T>a("source", cp.a())
/* 412 */                 .suggests(cp.a)
/* 413 */                 .then(
/* 414 */                   a(☃, (ArgumentBuilder<bu, ?>)bv.a("sourceObjective", cj.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 418 */             .then(
/* 419 */               bv.a(">=")
/* 420 */               .then(
/* 421 */                 bv.<T>a("source", cp.a())
/* 422 */                 .suggests(cp.a)
/* 423 */                 .then(
/* 424 */                   a(☃, (ArgumentBuilder<bu, ?>)bv.a("sourceObjective", cj.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 428 */             .then(
/* 429 */               bv.a("matches")
/* 430 */               .then(
/* 431 */                 a(☃, (ArgumentBuilder<bu, ?>)bv.a("range", cn.a()), bool, ☃ -> a(☃, cn.b.a(☃, "range")))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 437 */       .then(
/* 438 */         bv.a("blocks")
/* 439 */         .then(
/* 440 */           bv.<T>a("start", cy.a())
/* 441 */           .then(
/* 442 */             bv.<T>a("end", cy.a())
/* 443 */             .then((
/* 444 */               (RequiredArgumentBuilder)bv.<T>a("destination", cy.a())
/* 445 */               .then(
/* 446 */                 a(☃, (ArgumentBuilder)bv.a("all"), bool, false)))
/*     */               
/* 448 */               .then(
/* 449 */                 a(☃, (ArgumentBuilder)bv.a("masked"), bool, true)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 455 */       .then(
/* 456 */         bv.a("entity")
/* 457 */         .then((
/* 458 */           (RequiredArgumentBuilder)bv.<T>a("entities", cb.b())
/* 459 */           .fork(☃, commandContext -> a(commandContext, ☃, !cb.c(commandContext, "entities").isEmpty())))
/* 460 */           .executes(bool ? (☃ -> {
/*     */               int i = cb.c(☃, "entities").size();
/*     */               if (i > 0) {
/*     */                 ((bu)☃.getSource()).a(new ir("commands.execute.conditional.pass_count", new Object[] { Integer.valueOf(i) }), false);
/*     */                 return i;
/*     */               } 
/*     */               throw b.create();
/*     */             }) : (☃ -> {
/*     */               int i = cb.c(☃, "entities").size();
/*     */               if (i == 0) {
/*     */                 ((bu)☃.getSource()).a(new ir("commands.execute.conditional.pass", new Object[0]), false);
/*     */                 return 1;
/*     */               } 
/*     */               throw c.create(Integer.valueOf(i));
/*     */             }))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean a(CommandContext<bu> ☃, BiPredicate<Integer, Integer> biPredicate) throws CommandSyntaxException {
/* 485 */     String str1 = cp.a(☃, "target");
/* 486 */     cez cez1 = cj.a(☃, "targetObjective");
/* 487 */     String str2 = cp.a(☃, "source");
/* 488 */     cez cez2 = cj.a(☃, "sourceObjective");
/*     */     
/* 490 */     cfc cfc = ((bu)☃.getSource()).j().aM();
/*     */     
/* 492 */     if (!cfc.b(str1, cez1) || !cfc.b(str2, cez2)) {
/* 493 */       return false;
/*     */     }
/*     */     
/* 496 */     cfb cfb1 = cfc.c(str1, cez1);
/* 497 */     cfb cfb2 = cfc.c(str2, cez2);
/* 498 */     return biPredicate.test(Integer.valueOf(cfb1.b()), Integer.valueOf(cfb2.b()));
/*     */   }
/*     */   
/*     */   private static boolean a(CommandContext<bu> ☃, ba.d d1) throws CommandSyntaxException {
/* 502 */     String str = cp.a(☃, "target");
/* 503 */     cez cez = cj.a(☃, "targetObjective");
/*     */     
/* 505 */     cfc cfc = ((bu)☃.getSource()).j().aM();
/*     */     
/* 507 */     if (!cfc.b(str, cez)) {
/* 508 */       return false;
/*     */     }
/*     */     
/* 511 */     return d1.d(cfc.c(str, cez).b());
/*     */   }
/*     */   
/*     */   private static Collection<bu> a(CommandContext<bu> ☃, boolean bool1, boolean bool2) {
/* 515 */     if (bool2 == bool1) {
/* 516 */       return Collections.singleton(☃.getSource());
/*     */     }
/* 518 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<bu, ?> a(CommandNode<bu> ☃, ArgumentBuilder<bu, ?> argumentBuilder, boolean bool, a a1) {
/* 523 */     return argumentBuilder
/* 524 */       .fork(☃, commandContext -> a(commandContext, ☃, a1.test(commandContext)))
/* 525 */       .executes(commandContext -> {
/*     */           if (☃ == a1.test(commandContext)) {
/*     */             ((bu)commandContext.getSource()).a(new ir("commands.execute.conditional.pass", new Object[0]), false);
/*     */             return 1;
/*     */           } 
/*     */           throw b.create();
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<bu, ?> a(CommandNode<bu> ☃, ArgumentBuilder<bu, ?> argumentBuilder, boolean bool1, boolean bool2) {
/* 536 */     return argumentBuilder
/* 537 */       .fork(☃, commandContext -> a(commandContext, ☃, c(commandContext, bool1).isPresent()))
/* 538 */       .executes(bool1 ? (commandContext -> a(commandContext, ☃)) : (commandContext -> b(commandContext, ☃)));
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<bu> ☃, boolean bool) throws CommandSyntaxException {
/* 542 */     OptionalInt optionalInt = c(☃, bool);
/* 543 */     if (optionalInt.isPresent()) {
/* 544 */       ((bu)☃.getSource()).a(new ir("commands.execute.conditional.pass_count", new Object[] { Integer.valueOf(optionalInt.getAsInt()) }), false);
/* 545 */       return optionalInt.getAsInt();
/*     */     } 
/* 547 */     throw b.create();
/*     */   }
/*     */ 
/*     */   
/*     */   private static int b(CommandContext<bu> ☃, boolean bool) throws CommandSyntaxException {
/* 552 */     OptionalInt optionalInt = c(☃, bool);
/* 553 */     if (!optionalInt.isPresent()) {
/* 554 */       ((bu)☃.getSource()).a(new ir("commands.execute.conditional.pass", new Object[0]), false);
/* 555 */       return 1;
/*     */     } 
/* 557 */     throw c.create(Integer.valueOf(optionalInt.getAsInt()));
/*     */   }
/*     */ 
/*     */   
/*     */   private static OptionalInt c(CommandContext<bu> ☃, boolean bool) throws CommandSyntaxException {
/* 562 */     return a(((bu)☃.getSource()).e(), cy.a(☃, "start"), cy.a(☃, "end"), cy.a(☃, "destination"), bool);
/*     */   }
/*     */   
/*     */   private static OptionalInt a(td ☃, el el1, el el2, el el3, boolean bool) throws CommandSyntaxException {
/* 566 */     bwf bwf1 = new bwf(el1, el2);
/* 567 */     bwf bwf2 = new bwf(el3, el3.a(bwf1.b()));
/* 568 */     el el4 = new el(bwf2.a - bwf1.a, bwf2.b - bwf1.b, bwf2.c - bwf1.c);
/* 569 */     int i = bwf1.c() * bwf1.d() * bwf1.e();
/*     */     
/* 571 */     if (i > 32768) {
/* 572 */       throw a.create(Integer.valueOf(32768), Integer.valueOf(i));
/*     */     }
/*     */     
/* 575 */     int j = 0;
/* 576 */     for (int k = bwf1.c; k <= bwf1.f; k++) {
/* 577 */       for (int m = bwf1.b; m <= bwf1.e; m++) {
/* 578 */         for (int n = bwf1.a; n <= bwf1.d; n++) {
/* 579 */           el el5 = new el(n, m, k);
/* 580 */           el el6 = el5.a(el4);
/*     */           
/* 582 */           blc blc = ☃.a_(el5);
/* 583 */           if (!bool || blc.c() != bct.a) {
/*     */ 
/*     */ 
/*     */             
/* 587 */             if (blc != ☃.a_(el6)) {
/* 588 */               return OptionalInt.empty();
/*     */             }
/*     */             
/* 591 */             bji bji1 = ☃.f(el5);
/* 592 */             bji bji2 = ☃.f(el6);
/* 593 */             if (bji1 != null) {
/* 594 */               if (bji2 == null) {
/* 595 */                 return OptionalInt.empty();
/*     */               }
/* 597 */               gy gy1 = bji1.a(new gy());
/* 598 */               gy1.r("x");
/* 599 */               gy1.r("y");
/* 600 */               gy1.r("z");
/*     */               
/* 602 */               gy gy2 = bji2.a(new gy());
/* 603 */               gy2.r("x");
/* 604 */               gy2.r("y");
/* 605 */               gy2.r("z");
/*     */               
/* 607 */               if (!gy1.equals(gy2)) {
/* 608 */                 return OptionalInt.empty();
/*     */               }
/*     */             } 
/*     */             
/* 612 */             j++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 617 */     return OptionalInt.of(j);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface a {
/*     */     boolean test(CommandContext<bu> param1CommandContext) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */