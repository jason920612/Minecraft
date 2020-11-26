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
/*    */ public class ra
/*    */ {
/* 21 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.op.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("op")
/* 26 */         .requires(☃ -> ☃.c(3)))
/* 27 */         .then(
/* 28 */           bv.<T>a("targets", cd.a())
/* 29 */           .suggests((☃, suggestionsBuilder) -> {
/*    */               vp vp = ((bu)☃.getSource()).j().ac();
/*    */               
/*    */               return bw.b(vp.v().stream().filter(()).map(()), suggestionsBuilder);
/* 33 */             }).executes(☃ -> a((bu)☃.getSource(), cd.a(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/* 39 */     vp vp = ☃.j().ac();
/* 40 */     int i = 0;
/*    */     
/* 42 */     for (GameProfile gameProfile : collection) {
/* 43 */       if (!vp.h(gameProfile)) {
/* 44 */         vp.a(gameProfile);
/* 45 */         i++;
/* 46 */         ☃.a(new ir("commands.op.success", new Object[] { ((GameProfile)collection.iterator().next()).getName() }), true);
/*    */       } 
/*    */     } 
/*    */     
/* 50 */     if (i == 0) {
/* 51 */       throw a.create();
/*    */     }
/*    */     
/* 54 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */