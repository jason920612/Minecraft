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
/*    */ public class cy
/*    */   implements ArgumentType<da>
/*    */ {
/* 22 */   private static final Collection<String> c = Arrays.asList(new String[] { "0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5" });
/*    */   
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.pos.unloaded", new Object[0]));
/* 25 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("argument.pos.outofworld", new Object[0]));
/*    */   
/*    */   public static cy a() {
/* 28 */     return new cy();
/*    */   }
/*    */   
/*    */   public static el a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 32 */     el el = ((da)☃.getArgument(str, da.class)).c((bu)☃.getSource());
/* 33 */     if (!((bu)☃.getSource()).e().D(el)) {
/* 34 */       throw a.create();
/*    */     }
/* 36 */     ((bu)☃.getSource()).e(); if (!td.j(el)) {
/* 37 */       throw b.create();
/*    */     }
/* 39 */     return el;
/*    */   }
/*    */   
/*    */   public static el b(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 43 */     return ((da)☃.getArgument(str, da.class)).c((bu)☃.getSource());
/*    */   }
/*    */ 
/*    */   
/*    */   public da a(StringReader ☃) throws CommandSyntaxException {
/* 48 */     if (☃.canRead() && ☃.peek() == '^') {
/* 49 */       return db.a(☃);
/*    */     }
/* 51 */     return dh.a(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 57 */     if (☃.getSource() instanceof bw) {
/* 58 */       Collection<bw.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 62 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 63 */         collection = Collections.singleton(bw.a.a);
/*    */       } else {
/* 65 */         collection = ((bw)☃.getSource()).a(false);
/*    */       } 
/*    */       
/* 68 */       return bw.a(str, collection, suggestionsBuilder, bv.a(this::a));
/*    */     } 
/* 70 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 76 */     return c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */