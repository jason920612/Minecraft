/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Map;
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
/*    */ public class eb
/*    */ {
/* 21 */   private static final Map<pc, SuggestionProvider<bw>> e = Maps.newHashMap();
/* 22 */   private static final pc f = new pc("minecraft:ask_server"); public static final SuggestionProvider<bw> a; public static final SuggestionProvider<bu> b;
/*    */   static {
/* 24 */     a = a(f, (☃, suggestionsBuilder) -> ((bw)☃.getSource()).a(☃, suggestionsBuilder));
/* 25 */     b = a(new pc("minecraft:all_recipes"), (☃, suggestionsBuilder) -> bw.a(((bw)☃.getSource()).o(), suggestionsBuilder));
/* 26 */     c = a(new pc("minecraft:available_sounds"), (☃, suggestionsBuilder) -> bw.a(((bw)☃.getSource()).n(), suggestionsBuilder));
/* 27 */     d = a(new pc("minecraft:summonable_entities"), (☃, suggestionsBuilder) -> bw.a(fc.r.f().filter(aev::b), suggestionsBuilder, aev::a, ()));
/*    */   }
/*    */   public static final SuggestionProvider<bu> c; public static final SuggestionProvider<bu> d;
/*    */   public static <S extends bw> SuggestionProvider<S> a(pc ☃, SuggestionProvider<bw> suggestionProvider) {
/* 31 */     if (e.containsKey(☃)) {
/* 32 */       throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + ☃);
/*    */     }
/* 34 */     e.put(☃, suggestionProvider);
/* 35 */     return new a(☃, suggestionProvider);
/*    */   }
/*    */   
/*    */   public static SuggestionProvider<bw> a(pc ☃) {
/* 39 */     return e.getOrDefault(☃, a);
/*    */   }
/*    */   
/*    */   public static pc a(SuggestionProvider<bw> ☃) {
/* 43 */     if (☃ instanceof a) {
/* 44 */       return a.a((a)☃);
/*    */     }
/* 46 */     return f;
/*    */   }
/*    */ 
/*    */   
/*    */   public static SuggestionProvider<bw> b(SuggestionProvider<bw> ☃) {
/* 51 */     if (☃ instanceof a) {
/* 52 */       return ☃;
/*    */     }
/* 54 */     return a;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements SuggestionProvider<bw> {
/*    */     private final SuggestionProvider<bw> a;
/*    */     private final pc b;
/*    */     
/*    */     public a(pc ☃, SuggestionProvider<bw> suggestionProvider) {
/* 63 */       this.a = suggestionProvider;
/* 64 */       this.b = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public CompletableFuture<Suggestions> getSuggestions(CommandContext<bw> ☃, SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
/* 69 */       return this.a.getSuggestions(☃, suggestionsBuilder);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\eb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */