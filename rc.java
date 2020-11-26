/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.regex.Matcher;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rc
/*    */ {
/* 20 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.pardonip.invalid", new Object[0]));
/* 21 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.pardonip.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("pardon-ip")
/* 26 */         .requires(☃ -> (☃.j().ac().i().b() && ☃.c(3))))
/* 27 */         .then(
/* 28 */           bv.<T>a("target", (ArgumentType<T>)StringArgumentType.word())
/* 29 */           .suggests((☃, suggestionsBuilder) -> bw.a(((bu)☃.getSource()).j().ac().i().a(), suggestionsBuilder))
/* 30 */           .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "target")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, String str) throws CommandSyntaxException {
/* 36 */     Matcher matcher = py.a.matcher(str);
/* 37 */     if (!matcher.matches()) {
/* 38 */       throw a.create();
/*    */     }
/*    */     
/* 41 */     vm vm = ☃.j().ac().i();
/* 42 */     if (!vm.a(str)) {
/* 43 */       throw b.create();
/*    */     }
/*    */     
/* 46 */     vm.c(str);
/* 47 */     ☃.a(new ir("commands.pardonip.success", new Object[] { str }), true);
/* 48 */     return 1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */