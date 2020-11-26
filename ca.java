/*    */ import com.google.common.collect.Maps;
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
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.function.BiFunction;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ca
/*    */   implements ArgumentType<ca.a>
/*    */ {
/* 26 */   private static final Collection<String> a = Arrays.asList(new String[] { "eyes", "feet" }); private static final DynamicCommandExceptionType b; static {
/* 27 */     b = new DynamicCommandExceptionType(☃ -> new ir("argument.anchor.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   public static a a(CommandContext<bu> ☃, String str) {
/* 30 */     return (a)☃.getArgument(str, a.class);
/*    */   }
/*    */   
/*    */   public static ca a() {
/* 34 */     return new ca();
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(StringReader ☃) throws CommandSyntaxException {
/* 39 */     int i = ☃.getCursor();
/* 40 */     String str = ☃.readUnquotedString();
/* 41 */     a a = a.a(str);
/* 42 */     if (a == null) {
/* 43 */       ☃.setCursor(i);
/* 44 */       throw b.createWithContext(☃, str);
/*    */     } 
/* 46 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 51 */     return bw.b(a.a().keySet(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 56 */     return a;
/*    */   }
/*    */   public enum a { a, b; private static final Map<String, a> c;
/*    */     static {
/* 60 */       a = new a("FEET", 0, "feet", (☃, aer1) -> ☃);
/* 61 */       b = new a("EYES", 1, "eyes", (☃, aer1) -> new cee(☃.b, ☃.c + aer1.bF(), ☃.d));
/*    */     } private final String d; private final BiFunction<cee, aer, cee> e;
/*    */     static {
/* 64 */       c = k.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*    */             for (a a1 : values()) {
/*    */               ☃.put(a1.d, a1);
/*    */             }
/*    */           });
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     a(String ☃, BiFunction<cee, aer, cee> biFunction) {
/* 74 */       this.d = ☃;
/* 75 */       this.e = biFunction;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public static a a(String ☃) {
/* 80 */       return c.get(☃);
/*    */     }
/*    */     
/*    */     public cee a(aer ☃) {
/* 84 */       return this.e.apply(new cee(☃.q, ☃.r, ☃.s), ☃);
/*    */     }
/*    */     
/*    */     public cee a(bu ☃) {
/* 88 */       aer aer = ☃.f();
/* 89 */       if (aer == null) {
/* 90 */         return ☃.d();
/*    */       }
/* 92 */       return this.e.apply(☃.d(), aer);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              F:\dw\server.jar!\ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */