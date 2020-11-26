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
/*    */ public class ce
/*    */   implements ArgumentType<awe>
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/* 22 */   private static final Collection<String> b = Arrays.asList(new String[] { "unbreaking", "silk_touch" });
/*    */   static {
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new ir("enchantment.unknown", new Object[] { ☃ }));
/*    */   }
/*    */   public static ce a() {
/* 27 */     return new ce();
/*    */   }
/*    */   
/*    */   public static awe a(CommandContext<bu> ☃, String str) {
/* 31 */     return (awe)☃.getArgument(str, awe.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public awe a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     pc pc = pc.a(☃);
/* 37 */     awe awe = fc.q.b(pc);
/* 38 */     if (awe == null) {
/* 39 */       throw a.create(pc);
/*    */     }
/* 41 */     return awe;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 46 */     return bw.a(fc.q.c(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 51 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */