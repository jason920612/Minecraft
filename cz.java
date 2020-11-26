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
/*    */ public class cz
/*    */   implements ArgumentType<da>
/*    */ {
/* 22 */   private static final Collection<String> b = Arrays.asList(new String[] { "0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0" });
/* 23 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.pos2d.incomplete", new Object[0]));
/*    */   
/*    */   public static class a {
/*    */     public final int a;
/*    */     public final int b;
/*    */     
/*    */     public a(int ☃, int i) {
/* 30 */       this.a = ☃;
/* 31 */       this.b = i;
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 36 */       return "[" + this.a + ", " + this.b + "]";
/*    */     }
/*    */   }
/*    */   
/*    */   public static cz a() {
/* 41 */     return new cz();
/*    */   }
/*    */   
/*    */   public static a a(CommandContext<bu> ☃, String str) {
/* 45 */     el el = ((da)☃.getArgument(str, da.class)).c((bu)☃.getSource());
/* 46 */     return new a(el.o(), el.q());
/*    */   }
/*    */ 
/*    */   
/*    */   public da a(StringReader ☃) throws CommandSyntaxException {
/* 51 */     int i = ☃.getCursor();
/* 52 */     if (!☃.canRead()) {
/* 53 */       throw a.createWithContext(☃);
/*    */     }
/* 55 */     dg dg1 = dg.a(☃);
/* 56 */     if (!☃.canRead() || ☃.peek() != ' ') {
/* 57 */       ☃.setCursor(i);
/* 58 */       throw a.createWithContext(☃);
/*    */     } 
/* 60 */     ☃.skip();
/* 61 */     dg dg2 = dg.a(☃);
/* 62 */     return new dh(dg1, new dg(true, 0.0D), dg2);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 67 */     if (☃.getSource() instanceof bw) {
/* 68 */       Collection<bw.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 72 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 73 */         collection = Collections.singleton(bw.a.a);
/*    */       } else {
/* 75 */         collection = ((bw)☃.getSource()).a(false);
/*    */       } 
/*    */       
/* 78 */       return bw.b(str, collection, suggestionsBuilder, bv.a(this::a));
/*    */     } 
/* 80 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 86 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */