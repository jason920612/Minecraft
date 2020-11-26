/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rf
/*    */ {
/*    */   private static final DynamicCommandExceptionType b;
/* 18 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.publish.failed", new Object[0])); static {
/* 19 */     b = new DynamicCommandExceptionType(☃ -> new ir("commands.publish.alreadyPublished", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 22 */     ☃.register(
/* 23 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("publish")
/* 24 */         .requires(☃ -> (☃.j().H() && ☃.c(4))))
/* 25 */         .executes(☃ -> a((bu)☃.getSource(), xk.a())))
/* 26 */         .then(
/* 27 */           bv.<T>a("port", (ArgumentType<T>)IntegerArgumentType.integer(0, 65535))
/* 28 */           .executes(☃ -> a((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "port")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, int i) throws CommandSyntaxException {
/* 34 */     if (☃.j().ad()) {
/* 35 */       throw b.create(Integer.valueOf(☃.j().F()));
/*    */     }
/* 37 */     if (!☃.j().a(☃.j().g(), false, i)) {
/* 38 */       throw a.create();
/*    */     }
/* 40 */     ☃.a(new ir("commands.publish.success", new Object[] { Integer.valueOf(i) }), true);
/* 41 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */