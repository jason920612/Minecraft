/*    */ package com.mojang.brigadier.arguments;
/*    */ 
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ public class BoolArgumentType
/*    */   implements ArgumentType<Boolean>
/*    */ {
/* 15 */   private static final Collection<String> EXAMPLES = Arrays.asList(new String[] { "true", "false" });
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static BoolArgumentType bool() {
/* 21 */     return new BoolArgumentType();
/*    */   }
/*    */   
/*    */   public static boolean getBool(CommandContext<?> context, String name) {
/* 25 */     return ((Boolean)context.getArgument(name, Boolean.class)).booleanValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> Boolean parse(StringReader reader) throws CommandSyntaxException {
/* 30 */     return Boolean.valueOf(reader.readBoolean());
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
/* 35 */     if ("true".startsWith(builder.getRemaining().toLowerCase())) {
/* 36 */       builder.suggest("true");
/*    */     }
/* 38 */     if ("false".startsWith(builder.getRemaining().toLowerCase())) {
/* 39 */       builder.suggest("false");
/*    */     }
/* 41 */     return builder.buildFuture();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 46 */     return EXAMPLES;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\arguments\BoolArgumentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */