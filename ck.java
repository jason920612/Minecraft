/*    */ import com.google.common.collect.Lists;
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
/*    */ import java.util.List;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ck
/*    */   implements ArgumentType<cff>
/*    */ {
/* 25 */   private static final Collection<String> b = Arrays.asList(new String[] { "foo", "foo.bar.baz", "minecraft:foo" }); static {
/* 26 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.criteria.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static ck a() {
/* 32 */     return new ck();
/*    */   }
/*    */   
/*    */   public static cff a(CommandContext<bu> ☃, String str) {
/* 36 */     return (cff)☃.getArgument(str, cff.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public cff a(StringReader ☃) throws CommandSyntaxException {
/* 41 */     int i = ☃.getCursor();
/* 42 */     while (☃.canRead() && ☃.peek() != ' ') {
/* 43 */       ☃.skip();
/*    */     }
/* 45 */     String str = ☃.getString().substring(i, ☃.getCursor());
/* 46 */     cff cff = cff.a(str);
/* 47 */     if (cff == null) {
/* 48 */       ☃.setCursor(i);
/* 49 */       throw a.create(str);
/*    */     } 
/* 51 */     return cff;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 56 */     List<String> list = Lists.newArrayList(cff.a.keySet());
/* 57 */     for (wr<?> wr : fc.w) {
/* 58 */       for (Object object : wr.a()) {
/* 59 */         String str = a(wr, object);
/* 60 */         list.add(str);
/*    */       } 
/*    */     } 
/* 63 */     return bw.b(list, suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> String a(wr<T> ☃, Object object) {
/* 68 */     return wp.a(☃, (T)object);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 73 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */