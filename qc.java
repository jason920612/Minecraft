/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qc
/*    */ {
/*    */   private static final DynamicCommandExceptionType a;
/*    */   private static final DynamicCommandExceptionType b;
/*    */   
/*    */   static {
/* 26 */     a = new DynamicCommandExceptionType(☃ -> new ir("clear.failed.single", new Object[] { ☃ }));
/* 27 */     b = new DynamicCommandExceptionType(☃ -> new ir("clear.failed.multiple", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 30 */     ☃.register(
/* 31 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("clear")
/* 32 */         .requires(☃ -> ☃.c(2)))
/* 33 */         .executes(☃ -> a((bu)☃.getSource(), Collections.singleton(((bu)☃.getSource()).h()), (), -1)))
/* 34 */         .then((
/* 35 */           (RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/* 36 */           .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), (), -1)))
/* 37 */           .then((
/* 38 */             (RequiredArgumentBuilder)bv.<T>a("item", dn.a())
/* 39 */             .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), dn.a(☃, "item"), -1)))
/* 40 */             .then(
/* 41 */               bv.<T>a("maxCount", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 42 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), dn.a(☃, "item"), IntegerArgumentType.getInteger(☃, "maxCount")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<tf> collection, Predicate<ate> predicate, int i) throws CommandSyntaxException {
/* 50 */     int j = 0;
/*    */     
/* 52 */     for (tf tf : collection) {
/* 53 */       j += tf.bB.a(predicate, i);
/*    */     }
/*    */     
/* 56 */     if (j == 0) {
/* 57 */       if (collection.size() == 1) {
/* 58 */         throw a.create(((tf)collection.iterator().next()).N_().e());
/*    */       }
/* 60 */       throw b.create(Integer.valueOf(collection.size()));
/*    */     } 
/*    */ 
/*    */     
/* 64 */     if (i == 0) {
/* 65 */       if (collection.size() == 1) {
/* 66 */         ☃.a(new ir("commands.clear.test.single", new Object[] { Integer.valueOf(j), ((tf)collection.iterator().next()).O() }), true);
/*    */       } else {
/* 68 */         ☃.a(new ir("commands.clear.test.multiple", new Object[] { Integer.valueOf(j), Integer.valueOf(collection.size()) }), true);
/*    */       }
/*    */     
/* 71 */     } else if (collection.size() == 1) {
/* 72 */       ☃.a(new ir("commands.clear.success.single", new Object[] { Integer.valueOf(j), ((tf)collection.iterator().next()).O() }), true);
/*    */     } else {
/* 74 */       ☃.a(new ir("commands.clear.success.multiple", new Object[] { Integer.valueOf(j), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */ 
/*    */     
/* 78 */     return j;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */