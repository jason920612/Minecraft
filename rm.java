/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rm
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 16 */     ☃.register(
/* 17 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("say")
/* 18 */         .requires(☃ -> ☃.c(2)))
/* 19 */         .then(
/* 20 */           bv.<T>a("message", cf.a())
/* 21 */           .executes(☃ -> {
/*    */               ij ij = cf.a(☃, "message");
/*    */               ((bu)☃.getSource()).j().ac().a(new ir("chat.type.announcement", new Object[] { ((bu)☃.getSource()).b(), ij }));
/*    */               return 1;
/*    */             })));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */