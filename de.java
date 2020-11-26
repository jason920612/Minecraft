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
/*    */ 
/*    */ public class de
/*    */   implements ArgumentType<da>
/*    */ {
/* 23 */   private static final Collection<String> b = Arrays.asList(new String[] { "0 0", "~ ~", "0.1 -0.5", "~1 ~-2" });
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.pos2d.incomplete", new Object[0]));
/*    */   
/*    */   private final boolean c;
/*    */   
/*    */   public de(boolean ☃) {
/* 29 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public static de a() {
/* 33 */     return new de(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ced a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 42 */     cee cee = ((da)☃.getArgument(str, da.class)).a((bu)☃.getSource());
/* 43 */     return new ced((float)cee.b, (float)cee.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public da a(StringReader ☃) throws CommandSyntaxException {
/* 48 */     int i = ☃.getCursor();
/* 49 */     if (!☃.canRead()) {
/* 50 */       throw a.createWithContext(☃);
/*    */     }
/* 52 */     dg dg1 = dg.a(☃, this.c);
/* 53 */     if (!☃.canRead() || ☃.peek() != ' ') {
/* 54 */       ☃.setCursor(i);
/* 55 */       throw a.createWithContext(☃);
/*    */     } 
/* 57 */     ☃.skip();
/* 58 */     dg dg2 = dg.a(☃, this.c);
/* 59 */     return new dh(dg1, new dg(true, 0.0D), dg2);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 64 */     if (☃.getSource() instanceof bw) {
/* 65 */       Collection<bw.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 69 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 70 */         collection = Collections.singleton(bw.a.a);
/*    */       } else {
/* 72 */         collection = ((bw)☃.getSource()).a(true);
/*    */       } 
/*    */       
/* 75 */       return bw.b(str, collection, suggestionsBuilder, bv.a(this::a));
/*    */     } 
/* 77 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 83 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */