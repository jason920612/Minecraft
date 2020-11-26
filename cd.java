/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cd
/*     */   implements ArgumentType<cd.a>
/*     */ {
/*  26 */   private static final Collection<String> b = Arrays.asList(new String[] { "Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e" });
/*  27 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.player.unknown", new Object[0]));
/*     */   
/*     */   public static Collection<GameProfile> a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  30 */     return ((a)☃.getArgument(str, a.class)).getNames((bu)☃.getSource());
/*     */   }
/*     */   
/*     */   public static cd a() {
/*  34 */     return new cd();
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(StringReader ☃) throws CommandSyntaxException {
/*  39 */     if (☃.canRead() && ☃.peek() == '@') {
/*  40 */       ds ds = new ds(☃);
/*  41 */       dr dr = ds.s();
/*  42 */       if (dr.b()) {
/*  43 */         throw cb.c.create();
/*     */       }
/*  45 */       return new b(dr);
/*     */     } 
/*     */     
/*  48 */     int i = ☃.getCursor();
/*  49 */     while (☃.canRead() && ☃.peek() != ' ') {
/*  50 */       ☃.skip();
/*     */     }
/*  52 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*  53 */     return bu1 -> {
/*     */         GameProfile gameProfile = bu1.j().ar().a(☃);
/*     */         if (gameProfile == null) {
/*     */           throw a.create();
/*     */         }
/*     */         return Collections.singleton(gameProfile);
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class b
/*     */     implements a
/*     */   {
/*     */     private final dr a;
/*     */ 
/*     */     
/*     */     public b(dr ☃) {
/*  71 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<GameProfile> getNames(bu ☃) throws CommandSyntaxException {
/*  76 */       List<tf> list = this.a.d(☃);
/*  77 */       if (list.isEmpty()) {
/*  78 */         throw cb.e.create();
/*     */       }
/*  80 */       List<GameProfile> list1 = Lists.newArrayList();
/*  81 */       for (tf tf : list) {
/*  82 */         list1.add(tf.do());
/*     */       }
/*  84 */       return list1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  90 */     if (☃.getSource() instanceof bw) {
/*  91 */       StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*  92 */       stringReader.setCursor(suggestionsBuilder.getStart());
/*  93 */       ds ds = new ds(stringReader);
/*     */       try {
/*  95 */         ds.s();
/*  96 */       } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       
/*  98 */       return ds.a(suggestionsBuilder, suggestionsBuilder -> bw.b(((bw)☃.getSource()).l(), suggestionsBuilder));
/*     */     } 
/* 100 */     return Suggestions.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 106 */     return b;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     Collection<GameProfile> getNames(bu param1bu) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */