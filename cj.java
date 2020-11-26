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
/*    */ public class cj
/*    */   implements ArgumentType<String>
/*    */ {
/*    */   private static final DynamicCommandExceptionType c;
/*    */   private static final DynamicCommandExceptionType d;
/*    */   public static final DynamicCommandExceptionType a;
/* 21 */   private static final Collection<String> b = Arrays.asList(new String[] { "foo", "*", "012" }); static {
/* 22 */     c = new DynamicCommandExceptionType(☃ -> new ir("arguments.objective.notFound", new Object[] { ☃ }));
/* 23 */     d = new DynamicCommandExceptionType(☃ -> new ir("arguments.objective.readonly", new Object[] { ☃ }));
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new ir("commands.scoreboard.objectives.add.longName", new Object[] { ☃ }));
/*    */   }
/*    */   public static cj a() {
/* 27 */     return new cj();
/*    */   }
/*    */   
/*    */   public static cez a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 31 */     String str1 = (String)☃.getArgument(str, String.class);
/* 32 */     cfc cfc = ((bu)☃.getSource()).j().aM();
/* 33 */     cez cez = cfc.d(str1);
/* 34 */     if (cez == null) {
/* 35 */       throw c.create(str1);
/*    */     }
/* 37 */     return cez;
/*    */   }
/*    */   
/*    */   public static cez b(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 41 */     cez cez = a(☃, str);
/* 42 */     if (cez.c().d()) {
/* 43 */       throw d.create(cez.b());
/*    */     }
/* 45 */     return cez;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(StringReader ☃) throws CommandSyntaxException {
/* 50 */     String str = ☃.readUnquotedString();
/* 51 */     if (str.length() > 16) {
/* 52 */       throw a.create(Integer.valueOf(16));
/*    */     }
/* 54 */     return str;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 60 */     if (☃.getSource() instanceof bu)
/* 61 */       return bw.b(((bu)☃.getSource()).j().aM().d(), suggestionsBuilder); 
/* 62 */     if (☃.getSource() instanceof bw) {
/* 63 */       bw bw = (bw)☃.getSource();
/* 64 */       return bw.a((CommandContext)☃, suggestionsBuilder);
/*    */     } 
/* 66 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 72 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */