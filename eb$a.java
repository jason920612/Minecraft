/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements SuggestionProvider<bw>
/*    */ {
/*    */   private final SuggestionProvider<bw> a;
/*    */   private final pc b;
/*    */   
/*    */   public a(pc ☃, SuggestionProvider<bw> suggestionProvider) {
/* 63 */     this.a = suggestionProvider;
/* 64 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public CompletableFuture<Suggestions> getSuggestions(CommandContext<bw> ☃, SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
/* 69 */     return this.a.getSuggestions(☃, suggestionsBuilder);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\eb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */