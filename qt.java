/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qt
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 28 */     ☃.register(
/* 29 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("give")
/* 30 */         .requires(☃ -> ☃.c(2)))
/* 31 */         .then(
/* 32 */           bv.<T>a("targets", cb.d())
/* 33 */           .then((
/* 34 */             (RequiredArgumentBuilder)bv.<T>a("item", dk.a())
/* 35 */             .executes(☃ -> a((bu)☃.getSource(), dk.a(☃, "item"), cb.f((CommandContext)☃, "targets"), 1)))
/* 36 */             .then(
/* 37 */               bv.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(1))
/* 38 */               .executes(☃ -> a((bu)☃.getSource(), dk.a(☃, "item"), cb.f((CommandContext)☃, "targets"), IntegerArgumentType.getInteger(☃, "count")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, dl dl1, Collection<tf> collection, int i) throws CommandSyntaxException {
/* 46 */     for (tf tf : collection) {
/* 47 */       int j = i;
/* 48 */       while (j > 0) {
/* 49 */         int k = Math.min(dl1.a().i(), j);
/* 50 */         j -= k;
/*    */         
/* 52 */         ate ate = dl1.a(k, false);
/* 53 */         boolean bool = tf.bB.e(ate);
/*    */         
/* 55 */         if (!bool || !ate.a()) {
/* 56 */           amm amm1 = tf.a(ate, false);
/* 57 */           if (amm1 != null) {
/* 58 */             amm1.o();
/* 59 */             amm1.b(tf.bt());
/*    */           } 
/*    */           continue;
/*    */         } 
/* 63 */         ate.e(1);
/* 64 */         amm amm = tf.a(ate, false);
/* 65 */         if (amm != null) {
/* 66 */           amm.t();
/*    */         }
/* 68 */         tf.m.a((aog)null, tf.q, tf.r, tf.s, wj.eE, wk.h, 0.2F, ((tf.ce().nextFloat() - tf.ce().nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 69 */         tf.bD.b();
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 74 */     if (collection.size() == 1) {
/* 75 */       ☃.a(new ir("commands.give.success.single", new Object[] { Integer.valueOf(i), dl1.a(i, false).A(), ((tf)collection.iterator().next()).O() }), true);
/*    */     } else {
/* 77 */       ☃.a(new ir("commands.give.success.single", new Object[] { Integer.valueOf(i), dl1.a(i, false).A(), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 80 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */