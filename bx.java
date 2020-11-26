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
/*    */ public class bx
/*    */   implements ArgumentType<a>
/*    */ {
/* 20 */   private static final Collection<String> b = Arrays.asList(new String[] { "red", "green" }); static {
/* 21 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.color.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static bx a() {
/* 27 */     return new bx();
/*    */   }
/*    */   
/*    */   public static a a(CommandContext<bu> ☃, String str) {
/* 31 */     return (a)☃.getArgument(str, a.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     String str = ☃.readUnquotedString();
/* 37 */     a a = a.c(str);
/* 38 */     if (a == null || a.c()) {
/* 39 */       throw a.create(str);
/*    */     }
/* 41 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 46 */     return bw.b(a.a(true, false), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 51 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */