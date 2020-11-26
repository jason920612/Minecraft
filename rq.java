/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rq
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 15 */     ☃.register(
/* 16 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("setidletimeout")
/* 17 */         .requires(☃ -> ☃.c(3)))
/* 18 */         .then(
/* 19 */           bv.<T>a("minutes", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 20 */           .executes(☃ -> a((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "minutes")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, int i) {
/* 26 */     ☃.j().c(i);
/* 27 */     ☃.a(new ir("commands.setidletimeout.success", new Object[] { Integer.valueOf(i) }), true);
/* 28 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */