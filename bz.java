/*    */ import com.google.common.collect.Streams;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class bz
/*    */   implements ArgumentType<bod>
/*    */ {
/*    */   private static final Collection<String> b;
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   static {
/* 23 */     b = (Collection<String>)Stream.<bod>of(new bod[] { bod.a, bod.b }).map(☃ -> bod.a(☃).toString()).collect(Collectors.toList());
/*    */     
/* 25 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.dimension.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public <S> bod a(StringReader ☃) throws CommandSyntaxException {
/* 29 */     pc pc = pc.a(☃);
/* 30 */     bod bod = bod.a(pc);
/* 31 */     if (bod == null) {
/* 32 */       throw a.create(pc);
/*    */     }
/* 34 */     return bod;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 39 */     return bw.a(Streams.stream(bod.b()).map(bod::a), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 44 */     return b;
/*    */   }
/*    */   
/*    */   public static bz a() {
/* 48 */     return new bz();
/*    */   }
/*    */   
/*    */   public static bod a(CommandContext<bu> ☃, String str) {
/* 52 */     return (bod)☃.getArgument(str, bod.class);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */