/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qq
/*    */ {
/*    */   public static final SuggestionProvider<bu> a;
/*    */   
/*    */   static {
/* 20 */     a = ((☃, suggestionsBuilder) -> {
/*    */         pp pp = ((bu)☃.getSource()).j().aB();
/*    */         bw.a(pp.g().a(), suggestionsBuilder, "#");
/*    */         return bw.a(pp.c().keySet(), suggestionsBuilder);
/*    */       });
/*    */   }
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 27 */     ☃.register(
/* 28 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("function")
/* 29 */         .requires(☃ -> ☃.c(2)))
/* 30 */         .then(
/* 31 */           bv.<T>a("name", dj.a())
/* 32 */           .suggests(a)
/* 33 */           .executes(☃ -> a((bu)☃.getSource(), dj.a(☃, "name")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<br> collection) {
/* 39 */     int i = 0;
/*    */     
/* 41 */     for (br br : collection) {
/* 42 */       i += ☃.j().aB().a(br, ☃.a().b(2));
/*    */     }
/*    */     
/* 45 */     if (collection.size() == 1) {
/* 46 */       ☃.a(new ir("commands.function.success.single", new Object[] { Integer.valueOf(i), ((br)collection.iterator().next()).a() }), true);
/*    */     } else {
/* 48 */       ☃.a(new ir("commands.function.success.multiple", new Object[] { Integer.valueOf(i), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 51 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */