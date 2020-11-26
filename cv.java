/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cv
/*    */   implements ArgumentType<ct>
/*    */ {
/* 16 */   private static final Collection<String> a = Arrays.asList(new String[] { "stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}" });
/*    */   
/*    */   public static cv a() {
/* 19 */     return new cv();
/*    */   }
/*    */ 
/*    */   
/*    */   public ct a(StringReader ☃) throws CommandSyntaxException {
/* 24 */     cw cw = (new cw(☃, false)).a(true);
/* 25 */     return new ct(cw.b(), cw.a().keySet(), cw.c());
/*    */   }
/*    */   
/*    */   public static ct a(CommandContext<bu> ☃, String str) {
/* 29 */     return (ct)☃.getArgument(str, ct.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 34 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/* 35 */     stringReader.setCursor(suggestionsBuilder.getStart());
/* 36 */     cw cw = new cw(stringReader, false);
/*    */     try {
/* 38 */       cw.a(true);
/* 39 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*    */     
/* 41 */     return cw.a(suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 46 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */