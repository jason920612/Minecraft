/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cs
/*    */   implements ArgumentType<String>
/*    */ {
/* 21 */   private static final Collection<String> a = Arrays.asList(new String[] { "foo", "123" }); static {
/* 22 */     b = new DynamicCommandExceptionType(☃ -> new ir("team.notFound", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   private static final DynamicCommandExceptionType b;
/*    */   
/*    */   public static cs a() {
/* 28 */     return new cs();
/*    */   }
/*    */   
/*    */   public static cfa a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 32 */     String str1 = (String)☃.getArgument(str, String.class);
/* 33 */     cfc cfc = ((bu)☃.getSource()).j().aM();
/* 34 */     cfa cfa = cfc.f(str1);
/* 35 */     if (cfa == null) {
/* 36 */       throw b.create(str1);
/*    */     }
/* 38 */     return cfa;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(StringReader ☃) throws CommandSyntaxException {
/* 43 */     return ☃.readUnquotedString();
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 48 */     if (☃.getSource() instanceof bw) {
/* 49 */       return bw.b(((bw)☃.getSource()).m(), suggestionsBuilder);
/*    */     }
/* 51 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 56 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */