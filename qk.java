/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qk
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 14 */     ☃.register(
/* 15 */         (LiteralArgumentBuilder)bv.a("me")
/* 16 */         .then(
/* 17 */           bv.<T>a("action", (ArgumentType<T>)StringArgumentType.greedyString()).executes(☃ -> {
/*    */               ((bu)☃.getSource()).j().ac().a(new ir("chat.type.emote", new Object[] { ((bu)☃.getSource()).b(), StringArgumentType.getString(☃, "action") }));
/*    */               return 1;
/*    */             })));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */