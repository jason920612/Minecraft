/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rb
/*    */ {
/* 22 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.pardon.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 25 */     ☃.register(
/* 26 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("pardon")
/* 27 */         .requires(☃ -> (☃.j().ac().i().b() && ☃.c(3))))
/* 28 */         .then(
/* 29 */           bv.<T>a("targets", cd.a())
/* 30 */           .suggests((☃, suggestionsBuilder) -> bw.a(((bu)☃.getSource()).j().ac().h().a(), suggestionsBuilder))
/* 31 */           .executes(☃ -> a((bu)☃.getSource(), cd.a(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/* 37 */     vu vu = ☃.j().ac().h();
/* 38 */     int i = 0;
/*    */     
/* 40 */     for (GameProfile gameProfile : collection) {
/* 41 */       if (vu.a(gameProfile)) {
/* 42 */         vu.c(gameProfile);
/* 43 */         i++;
/* 44 */         ☃.a(new ir("commands.pardon.success", new Object[] { ik.a(gameProfile) }), true);
/*    */       } 
/*    */     } 
/*    */     
/* 48 */     if (i == 0) {
/* 49 */       throw a.create();
/*    */     }
/*    */     
/* 52 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */