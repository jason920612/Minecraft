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
/*    */ public class dk
/*    */   implements ArgumentType<dl>
/*    */ {
/* 15 */   private static final Collection<String> a = Arrays.asList(new String[] { "stick", "minecraft:stick", "stick{foo=bar}" });
/*    */   
/*    */   public static dk a() {
/* 18 */     return new dk();
/*    */   }
/*    */ 
/*    */   
/*    */   public dl a(StringReader ☃) throws CommandSyntaxException {
/* 23 */     dm dm = (new dm(☃, false)).h();
/*    */     
/* 25 */     return new dl(dm.b(), dm.c());
/*    */   }
/*    */   
/*    */   public static <S> dl a(CommandContext<S> ☃, String str) {
/* 29 */     return (dl)☃.getArgument(str, dl.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 34 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/* 35 */     stringReader.setCursor(suggestionsBuilder.getStart());
/* 36 */     dm dm = new dm(stringReader, false);
/*    */     try {
/* 38 */       dm.h();
/* 39 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*    */     
/* 41 */     return dm.a(suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 46 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */