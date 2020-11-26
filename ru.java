/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ru
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 12 */     ☃.register(
/* 13 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("stop")
/* 14 */         .requires(☃ -> ☃.c(4)))
/* 15 */         .executes(☃ -> {
/*    */             ((bu)☃.getSource()).a(new ir("commands.stop.stopping", new Object[0]), true);
/*    */             ((bu)☃.getSource()).j().p();
/*    */             return 1;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ru.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */