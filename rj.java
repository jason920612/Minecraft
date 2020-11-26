/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rj
/*    */ {
/* 16 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.save.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 19 */     ☃.register(
/* 20 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("save-all")
/* 21 */         .requires(☃ -> ☃.c(4)))
/* 22 */         .executes(☃ -> a((bu)☃.getSource(), false)))
/* 23 */         .then(
/* 24 */           bv.a("flush")
/* 25 */           .executes(☃ -> a((bu)☃.getSource(), true))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, boolean bool) throws CommandSyntaxException {
/* 31 */     ☃.a(new ir("commands.save.saving", new Object[0]), false);
/*    */     
/* 33 */     MinecraftServer minecraftServer = ☃.j();
/* 34 */     boolean bool1 = false;
/* 35 */     minecraftServer.ac().j();
/*    */     
/* 37 */     for (td td : minecraftServer.w()) {
/* 38 */       if (td != null && 
/* 39 */         a(td, bool)) {
/* 40 */         bool1 = true;
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 45 */     if (!bool1) {
/* 46 */       throw a.create();
/*    */     }
/*    */     
/* 49 */     ☃.a(new ir("commands.save.success", new Object[0]), true);
/*    */     
/* 51 */     return 1;
/*    */   }
/*    */   
/*    */   private static boolean a(td ☃, boolean bool) {
/* 55 */     boolean bool1 = ☃.b;
/* 56 */     ☃.b = false;
/*    */     try {
/* 58 */       ☃.a(true, (xs)null);
/* 59 */       if (bool) {
/* 60 */         ☃.u();
/*    */       }
/* 62 */     } catch (aya aya) {
/* 63 */       return false;
/*    */     } finally {
/* 65 */       ☃.b = bool1;
/*    */     } 
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */