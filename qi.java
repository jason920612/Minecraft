/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qi
/*    */ {
/*    */   private static final DynamicCommandExceptionType a;
/*    */   
/*    */   static {
/* 17 */     a = new DynamicCommandExceptionType(☃ -> new ir("commands.difficulty.failure", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 20 */     LiteralArgumentBuilder<bu> literalArgumentBuilder = bv.a("difficulty");
/*    */     
/* 22 */     for (adi adi : adi.values()) {
/* 23 */       literalArgumentBuilder.then(bv.a(adi.c()).executes(commandContext -> a((bu)commandContext.getSource(), ☃)));
/*    */     }
/*    */     
/* 26 */     ☃.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder
/*    */         
/* 28 */         .requires(☃ -> ☃.c(2)))
/* 29 */         .executes(☃ -> {
/*    */             adi adi = ((bu)☃.getSource()).e().aj();
/*    */             ((bu)☃.getSource()).a(new ir("commands.difficulty.query", new Object[] { adi.b() }), false);
/*    */             return adi.a();
/*    */           }));
/*    */   }
/*    */ 
/*    */   
/*    */   public static int a(bu ☃, adi adi1) throws CommandSyntaxException {
/* 38 */     MinecraftServer minecraftServer = ☃.j();
/* 39 */     if (minecraftServer.a(bod.a).aj() == adi1) {
/* 40 */       throw a.create(adi1.c());
/*    */     }
/*    */     
/* 43 */     minecraftServer.a(adi1);
/* 44 */     ☃.a(new ir("commands.difficulty.success", new Object[] { adi1.b() }), true);
/*    */     
/* 46 */     return 0;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */