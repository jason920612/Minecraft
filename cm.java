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
/*    */ 
/*    */ public class cm
/*    */   implements ArgumentType<fk>
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/* 23 */   private static final Collection<String> b = Arrays.asList(new String[] { "foo", "foo:bar", "particle with options" }); static {
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new ir("particle.notFound", new Object[] { ☃ }));
/*    */   }
/*    */   public static cm a() {
/* 27 */     return new cm();
/*    */   }
/*    */   
/*    */   public static fk a(CommandContext<bu> ☃, String str) {
/* 31 */     return (fk)☃.getArgument(str, fk.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public fk a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     return b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 41 */     return b;
/*    */   }
/*    */   
/*    */   public static fk b(StringReader ☃) throws CommandSyntaxException {
/* 45 */     pc pc = pc.a(☃);
/* 46 */     fl<?> fl = fc.u.b(pc);
/* 47 */     if (fl == null) {
/* 48 */       throw a.create(pc);
/*    */     }
/* 50 */     return (fk)a(☃, fl);
/*    */   }
/*    */   
/*    */   private static <T extends fk> T a(StringReader ☃, fl<T> fl1) throws CommandSyntaxException {
/* 54 */     return fl1.f().b(fl1, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 59 */     return bw.a(fc.u.c(), suggestionsBuilder);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */