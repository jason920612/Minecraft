/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ql
/*    */ {
/*    */   private static final DynamicCommandExceptionType a;
/*    */   private static final DynamicCommandExceptionType b;
/*    */   private static final DynamicCommandExceptionType c;
/*    */   private static final Dynamic2CommandExceptionType d;
/*    */   
/*    */   static {
/* 29 */     a = new DynamicCommandExceptionType(☃ -> new ir("commands.enchant.failed.entity", new Object[] { ☃ }));
/* 30 */     b = new DynamicCommandExceptionType(☃ -> new ir("commands.enchant.failed.itemless", new Object[] { ☃ }));
/* 31 */     c = new DynamicCommandExceptionType(☃ -> new ir("commands.enchant.failed.incompatible", new Object[] { ☃ }));
/* 32 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.enchant.failed.level", new Object[] { ☃, object1 }));
/* 33 */   } private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("commands.enchant.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 36 */     ☃.register(
/* 37 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("enchant")
/* 38 */         .requires(☃ -> ☃.c(2)))
/* 39 */         .then(
/* 40 */           bv.<T>a("targets", cb.b())
/* 41 */           .then((
/* 42 */             (RequiredArgumentBuilder)bv.<T>a("enchantment", ce.a())
/* 43 */             .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ce.a(☃, "enchantment"), 1)))
/* 44 */             .then(
/* 45 */               bv.<T>a("level", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 46 */               .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ce.a(☃, "enchantment"), IntegerArgumentType.getInteger(☃, "level")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<? extends aer> collection, awe awe1, int i) throws CommandSyntaxException {
/* 54 */     if (i > awe1.a()) {
/* 55 */       throw d.create(Integer.valueOf(i), Integer.valueOf(awe1.a()));
/*    */     }
/*    */     
/* 58 */     int j = 0;
/*    */     
/* 60 */     for (aer aer : collection) {
/* 61 */       if (aer instanceof afa) {
/* 62 */         afa afa = (afa)aer;
/*    */         
/* 64 */         ate ate = afa.cB();
/* 65 */         if (!ate.a()) {
/* 66 */           if (awe1.a(ate) && awg.a(awg.a(ate).keySet(), awe1)) {
/* 67 */             ate.a(awe1, i);
/* 68 */             j++; continue;
/* 69 */           }  if (collection.size() == 1)
/* 70 */             throw c.create(ate.b().i(ate).getString());  continue;
/*    */         } 
/* 72 */         if (collection.size() == 1)
/* 73 */           throw b.create(afa.N_().getString());  continue;
/*    */       } 
/* 75 */       if (collection.size() == 1) {
/* 76 */         throw a.create(aer.N_().getString());
/*    */       }
/*    */     } 
/*    */     
/* 80 */     if (j == 0)
/* 81 */       throw e.create(); 
/* 82 */     if (collection.size() == 1) {
/* 83 */       ☃.a(new ir("commands.enchant.success.single", new Object[] { awe1.d(i), ((aer)collection.iterator().next()).O() }), true);
/*    */     } else {
/* 85 */       ☃.a(new ir("commands.enchant.success.multiple", new Object[] { awe1.d(i), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 88 */     return j;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */