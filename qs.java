/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qs
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 17 */     LiteralArgumentBuilder<bu> literalArgumentBuilder = (LiteralArgumentBuilder<bu>)bv.a("gamerule").requires(☃ -> ☃.c(2));
/*    */     
/* 19 */     for (Map.Entry<String, axu.b> entry : axu.b().entrySet()) {
/* 20 */       literalArgumentBuilder.then((
/* 21 */           (LiteralArgumentBuilder)bv.a(entry.getKey())
/* 22 */           .executes(commandContext -> a((bu)commandContext.getSource(), (String)☃.getKey())))
/* 23 */           .then(((axu.b)entry
/* 24 */             .getValue()).b().a("value")
/* 25 */             .executes(commandContext -> a((bu)commandContext.getSource(), (String)☃.getKey(), commandContext))));
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 30 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static int a(bu ☃, String str, CommandContext<bu> commandContext) {
/* 34 */     axu.a a = ☃.j().aO().f(str);
/* 35 */     a.e().a(commandContext, "value", a);
/* 36 */     ☃.a(new ir("commands.gamerule.set", new Object[] { str, a.a() }), true);
/* 37 */     return a.c();
/*    */   }
/*    */   
/*    */   private static int a(bu ☃, String str) {
/* 41 */     axu.a a = ☃.j().aO().f(str);
/* 42 */     ☃.a(new ir("commands.gamerule.query", new Object[] { str, a.a() }), false);
/* 43 */     return a.c();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */