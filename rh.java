/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rh
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 12 */     ☃.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("reload")
/* 13 */         .requires(☃ -> ☃.c(3)))
/* 14 */         .executes(☃ -> {
/*    */             ((bu)☃.getSource()).a(new ir("commands.reload.success", new Object[0]), true);
/*    */             ((bu)☃.getSource()).j().aC();
/*    */             return 0;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */