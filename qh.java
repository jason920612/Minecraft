/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qh
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 16 */     LiteralArgumentBuilder<bu> literalArgumentBuilder = (LiteralArgumentBuilder<bu>)bv.a("defaultgamemode").requires(☃ -> ☃.c(2));
/*    */     
/* 18 */     for (axv axv : axv.values()) {
/* 19 */       if (axv != axv.a) {
/* 20 */         literalArgumentBuilder.then(bv.a(axv.b()).executes(commandContext -> a((bu)commandContext.getSource(), ☃)));
/*    */       }
/*    */     } 
/*    */     
/* 24 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static int a(bu ☃, axv axv1) {
/* 28 */     int i = 0;
/* 29 */     MinecraftServer minecraftServer = ☃.j();
/* 30 */     minecraftServer.a(axv1);
/*    */     
/* 32 */     if (minecraftServer.am()) {
/* 33 */       for (tf tf : minecraftServer.ac().v()) {
/* 34 */         if (tf.c.b() != axv1) {
/* 35 */           tf.a(axv1);
/* 36 */           i++;
/*    */         } 
/*    */       } 
/*    */     }
/*    */     
/* 41 */     ☃.a(new ir("commands.defaultgamemode.success", new Object[] { axv1.c() }), true);
/*    */     
/* 43 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */