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
/*    */ public class qf
/*    */ {
/* 21 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.deop.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("deop")
/* 26 */         .requires(☃ -> ☃.c(3)))
/* 27 */         .then(
/* 28 */           bv.<T>a("targets", cd.a())
/* 29 */           .suggests((☃, suggestionsBuilder) -> bw.a(((bu)☃.getSource()).j().ac().n(), suggestionsBuilder))
/* 30 */           .executes(☃ -> a((bu)☃.getSource(), cd.a(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/* 36 */     vp vp = ☃.j().ac();
/* 37 */     int i = 0;
/*    */     
/* 39 */     for (GameProfile gameProfile : collection) {
/* 40 */       if (vp.h(gameProfile)) {
/* 41 */         vp.b(gameProfile);
/* 42 */         i++;
/* 43 */         ☃.a(new ir("commands.deop.success", new Object[] { ((GameProfile)collection.iterator().next()).getName() }), true);
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     if (i == 0) {
/* 48 */       throw a.create();
/*    */     }
/*    */     
/* 51 */     ☃.j().a(☃);
/* 52 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */