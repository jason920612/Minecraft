/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface bw
/*     */ {
/*     */   public static class a
/*     */   {
/*  23 */     public static final a a = new a("^", "^", "^");
/*     */     
/*  25 */     public static final a b = new a("~", "~", "~");
/*     */     
/*     */     public final String c;
/*     */     
/*     */     public final String d;
/*     */     
/*     */     public final String e;
/*     */     
/*     */     public a(String ☃, String str1, String str2) {
/*  34 */       this.c = ☃;
/*  35 */       this.d = str1;
/*  36 */       this.e = str2;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default Collection<String> p() {
/*  43 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static <T> void a(Iterable<T> ☃, String str, Function<T, pc> function, Consumer<T> consumer) {
/*  59 */     boolean bool = (str.indexOf(':') > -1);
/*  60 */     for (T t : ☃) {
/*  61 */       pc pc = function.apply(t);
/*  62 */       if (bool) {
/*  63 */         String str1 = pc.toString();
/*  64 */         if (str1.startsWith(str))
/*  65 */           consumer.accept(t); 
/*     */         continue;
/*     */       } 
/*  68 */       if (pc.b().startsWith(str) || (pc.b().equals("minecraft") && pc.a().startsWith(str))) {
/*  69 */         consumer.accept(t);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static <T> void a(Iterable<T> ☃, String str1, String str2, Function<T, pc> function, Consumer<T> consumer) {
/*  76 */     if (str1.isEmpty()) {
/*  77 */       ☃.forEach(consumer);
/*     */     } else {
/*  79 */       String str = Strings.commonPrefix(str1, str2);
/*  80 */       if (!str.isEmpty()) {
/*  81 */         String str3 = str1.substring(str.length());
/*  82 */         a(☃, str3, function, consumer);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(Iterable<pc> ☃, SuggestionsBuilder suggestionsBuilder, String str) {
/*  88 */     String str1 = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/*  89 */     a(☃, str1, str, ☃ -> ☃, pc1 -> ☃.suggest(str + pc1));
/*  90 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(Iterable<pc> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  94 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/*  95 */     a(☃, str, ☃ -> ☃, pc1 -> ☃.suggest(pc1.toString()));
/*  96 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static <T> CompletableFuture<Suggestions> a(Iterable<T> ☃, SuggestionsBuilder suggestionsBuilder, Function<T, pc> function, Function<T, Message> function1) {
/* 100 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 101 */     a(☃, str, function, object -> ☃.suggest(((pc)function.apply(object)).toString(), function1.apply(object)));
/* 102 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(Stream<pc> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 106 */     return a(☃::iterator, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   static <T> CompletableFuture<Suggestions> a(Stream<T> ☃, SuggestionsBuilder suggestionsBuilder, Function<T, pc> function, Function<T, Message> function1) {
/* 110 */     return a(☃::iterator, suggestionsBuilder, function, function1);
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(String ☃, Collection<a> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
/* 114 */     List<String> list = Lists.newArrayList();
/*     */     
/* 116 */     if (Strings.isNullOrEmpty(☃)) {
/* 117 */       for (a a : collection) {
/* 118 */         String str = a.c + " " + a.d + " " + a.e;
/* 119 */         if (predicate.test(str)) {
/* 120 */           list.add(a.c);
/* 121 */           list.add(a.c + " " + a.d);
/* 122 */           list.add(str);
/*     */         } 
/*     */       } 
/*     */     } else {
/* 126 */       String[] arrayOfString = ☃.split(" ");
/*     */       
/* 128 */       if (arrayOfString.length == 1) {
/* 129 */         for (a a : collection) {
/* 130 */           String str = arrayOfString[0] + " " + a.d + " " + a.e;
/* 131 */           if (predicate.test(str)) {
/* 132 */             list.add(arrayOfString[0] + " " + a.d);
/* 133 */             list.add(str);
/*     */           } 
/*     */         } 
/* 136 */       } else if (arrayOfString.length == 2) {
/* 137 */         for (a a : collection) {
/* 138 */           String str = arrayOfString[0] + " " + arrayOfString[1] + " " + a.e;
/* 139 */           if (predicate.test(str)) {
/* 140 */             list.add(str);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 145 */     return b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> b(String ☃, Collection<a> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
/* 149 */     List<String> list = Lists.newArrayList();
/*     */     
/* 151 */     if (Strings.isNullOrEmpty(☃)) {
/* 152 */       for (a a : collection) {
/* 153 */         String str = a.c + " " + a.e;
/* 154 */         if (predicate.test(str)) {
/* 155 */           list.add(a.c);
/* 156 */           list.add(str);
/*     */         } 
/*     */       } 
/*     */     } else {
/* 160 */       String[] arrayOfString = ☃.split(" ");
/* 161 */       if (arrayOfString.length == 1) {
/* 162 */         for (a a : collection) {
/* 163 */           String str = arrayOfString[0] + " " + a.e;
/* 164 */           if (predicate.test(str)) {
/* 165 */             list.add(str);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 170 */     return b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> b(Iterable<String> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 174 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 175 */     for (String str1 : ☃) {
/* 176 */       if (str1.toLowerCase(Locale.ROOT).startsWith(str)) {
/* 177 */         suggestionsBuilder.suggest(str1);
/*     */       }
/*     */     } 
/* 180 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> b(Stream<String> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 184 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 185 */     ☃.filter(str1 -> str1.toLowerCase(Locale.ROOT).startsWith(☃)).forEach(suggestionsBuilder::suggest);
/* 186 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(String[] ☃, SuggestionsBuilder suggestionsBuilder) {
/* 190 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 191 */     for (String str1 : ☃) {
/* 192 */       if (str1.toLowerCase(Locale.ROOT).startsWith(str)) {
/* 193 */         suggestionsBuilder.suggest(str1);
/*     */       }
/*     */     } 
/* 196 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   Collection<String> l();
/*     */   
/*     */   Collection<String> m();
/*     */   
/*     */   Collection<pc> n();
/*     */   
/*     */   Collection<pc> o();
/*     */   
/*     */   CompletableFuture<Suggestions> a(CommandContext<bw> paramCommandContext, SuggestionsBuilder paramSuggestionsBuilder);
/*     */   
/*     */   Collection<a> a(boolean paramBoolean);
/*     */   
/*     */   boolean c(int paramInt);
/*     */ }


/* Location:              F:\dw\server.jar!\bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */