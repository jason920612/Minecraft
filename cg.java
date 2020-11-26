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
/*    */ public class cg
/*    */   implements ArgumentType<aej>
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/* 22 */   private static final Collection<String> b = Arrays.asList(new String[] { "spooky", "effect" });
/*    */   static {
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new ir("effect.effectNotFound", new Object[] { ☃ }));
/*    */   }
/*    */   public static cg a() {
/* 27 */     return new cg();
/*    */   }
/*    */   
/*    */   public static aej a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 31 */     return (aej)☃.getArgument(str, aej.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public aej a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     pc pc = pc.a(☃);
/* 37 */     aej aej = fc.t.b(pc);
/* 38 */     if (aej == null) {
/* 39 */       throw a.create(pc);
/*    */     }
/* 41 */     return aej;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 46 */     return bw.a(fc.t.c(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 51 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */