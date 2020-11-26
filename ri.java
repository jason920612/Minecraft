/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
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
/*     */ public class ri
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final Dynamic2CommandExceptionType c;
/*  36 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.replaceitem.block.failed", new Object[0])); static {
/*  37 */     b = new DynamicCommandExceptionType(☃ -> new ir("commands.replaceitem.slot.inapplicable", new Object[] { ☃ }));
/*  38 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.replaceitem.entity.failed", new Object[] { ☃, object1 }));
/*     */   }
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  41 */     ☃.register(
/*  42 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("replaceitem")
/*  43 */         .requires(☃ -> ☃.c(2)))
/*  44 */         .then(
/*  45 */           bv.a("block")
/*  46 */           .then(
/*  47 */             bv.<T>a("pos", cy.a())
/*  48 */             .then(
/*  49 */               bv.<T>a("slot", cr.a())
/*  50 */               .then((
/*  51 */                 (RequiredArgumentBuilder)bv.<T>a("item", dk.a())
/*  52 */                 .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "pos"), cr.a(☃, "slot"), dk.<bu>a(☃, "item").a(1, false))))
/*  53 */                 .then(
/*  54 */                   bv.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(1, 64))
/*  55 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "pos"), cr.a(☃, "slot"), dk.<bu>a(☃, "item").a(IntegerArgumentType.getInteger(☃, "count"), true)))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  61 */         .then(
/*  62 */           bv.a("entity")
/*  63 */           .then(
/*  64 */             bv.<T>a("targets", cb.b())
/*  65 */             .then(
/*  66 */               bv.<T>a("slot", cr.a())
/*  67 */               .then((
/*  68 */                 (RequiredArgumentBuilder)bv.<T>a("item", dk.a())
/*  69 */                 .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cr.a(☃, "slot"), dk.<bu>a(☃, "item").a(1, false))))
/*  70 */                 .then(
/*  71 */                   bv.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(1, 64))
/*  72 */                   .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cr.a(☃, "slot"), dk.<bu>a(☃, "item").a(IntegerArgumentType.getInteger(☃, "count"), true)))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, el el1, int i, ate ate1) throws CommandSyntaxException {
/*  82 */     bji bji = ☃.e().f(el1);
/*  83 */     if (!(bji instanceof ade)) {
/*  84 */       throw a.create();
/*     */     }
/*  86 */     ade ade = (ade)bji;
/*  87 */     if (i < 0 || i >= ade.T_()) {
/*  88 */       throw b.create(Integer.valueOf(i));
/*     */     }
/*     */     
/*  91 */     ade.a(i, ate1);
/*  92 */     ☃.a(new ir("commands.replaceitem.block.success", new Object[] { Integer.valueOf(el1.o()), Integer.valueOf(el1.p()), Integer.valueOf(el1.q()), ate1.A() }), true);
/*  93 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection, int i, ate ate1) throws CommandSyntaxException {
/*  97 */     List<aer> list = Lists.newArrayListWithCapacity(collection.size());
/*     */     
/*  99 */     for (aer aer : collection) {
/* 100 */       if (aer instanceof tf) {
/* 101 */         ((tf)aer).bD.b();
/*     */       }
/* 103 */       if (aer.c(i, ate1.i())) {
/* 104 */         list.add(aer);
/* 105 */         if (aer instanceof tf) {
/* 106 */           ((tf)aer).bD.b();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     if (list.isEmpty()) {
/* 112 */       throw c.create(ate1.A(), Integer.valueOf(i));
/*     */     }
/*     */     
/* 115 */     if (list.size() == 1) {
/* 116 */       ☃.a(new ir("commands.replaceitem.entity.success.single", new Object[] { ((aer)list.iterator().next()).O(), ate1.A() }), true);
/*     */     } else {
/* 118 */       ☃.a(new ir("commands.replaceitem.entity.success.multiple", new Object[] { Integer.valueOf(list.size()), ate1.A() }), true);
/*     */     } 
/*     */     
/* 121 */     return list.size();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ri.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */