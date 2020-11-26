/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class df
/*    */   implements ArgumentType<da>
/*    */ {
/* 22 */   private static final Collection<String> c = Arrays.asList(new String[] { "0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5" });
/*    */   
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.pos3d.incomplete", new Object[0]));
/* 25 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("argument.pos.mixed", new Object[0]));
/*    */   
/*    */   private final boolean d;
/*    */   
/*    */   public df(boolean ☃) {
/* 30 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public static df a() {
/* 34 */     return new df(true);
/*    */   }
/*    */   
/*    */   public static df a(boolean ☃) {
/* 38 */     return new df(☃);
/*    */   }
/*    */   
/*    */   public static cee a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 42 */     return ((da)☃.getArgument(str, da.class)).a((bu)☃.getSource());
/*    */   }
/*    */   
/*    */   public static da b(CommandContext<bu> ☃, String str) {
/* 46 */     return (da)☃.getArgument(str, da.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public da a(StringReader ☃) throws CommandSyntaxException {
/* 51 */     if (☃.canRead() && ☃.peek() == '^') {
/* 52 */       return db.a(☃);
/*    */     }
/* 54 */     return dh.a(☃, this.d);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 60 */     if (☃.getSource() instanceof bw) {
/* 61 */       Collection<bw.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 65 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 66 */         collection = Collections.singleton(bw.a.a);
/*    */       } else {
/* 68 */         collection = ((bw)☃.getSource()).a(true);
/*    */       } 
/*    */       
/* 71 */       return bw.a(str, collection, suggestionsBuilder, bv.a(this::a));
/*    */     } 
/* 73 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 79 */     return c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\df.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */