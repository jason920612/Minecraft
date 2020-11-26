/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cp
/*     */   implements ArgumentType<cp.a>
/*     */ {
/*     */   public static final SuggestionProvider<bu> a;
/*     */   
/*     */   static {
/*  27 */     a = ((☃, suggestionsBuilder) -> {
/*     */         StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*     */         stringReader.setCursor(suggestionsBuilder.getStart());
/*     */         ds ds = new ds(stringReader);
/*     */         try {
/*     */           ds.s();
/*  33 */         } catch (CommandSyntaxException commandSyntaxException) {}
/*     */         return ds.a(suggestionsBuilder, ());
/*     */       });
/*     */   }
/*     */   
/*  38 */   private static final Collection<String> b = Arrays.asList(new String[] { "Player", "0123", "*", "@e" });
/*  39 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("argument.scoreHolder.empty", new Object[0]));
/*     */ 
/*     */   
/*     */   private final boolean d;
/*     */ 
/*     */   
/*     */   public cp(boolean ☃) {
/*  46 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public static String a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  50 */     return b(☃, str).iterator().next();
/*     */   }
/*     */   
/*     */   public static Collection<String> b(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  54 */     return a(☃, str, Collections::emptyList);
/*     */   }
/*     */   
/*     */   public static Collection<String> c(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  58 */     return a(☃, str, ((bu)☃.getSource()).j().aM()::e);
/*     */   }
/*     */   
/*     */   public static Collection<String> a(CommandContext<bu> ☃, String str, Supplier<Collection<String>> supplier) throws CommandSyntaxException {
/*  62 */     Collection<String> collection = ((a)☃.getArgument(str, a.class)).getNames((bu)☃.getSource(), supplier);
/*  63 */     if (collection.isEmpty()) {
/*  64 */       throw cb.d.create();
/*     */     }
/*  66 */     return collection;
/*     */   }
/*     */   
/*     */   public static cp a() {
/*  70 */     return new cp(false);
/*     */   }
/*     */   
/*     */   public static cp b() {
/*  74 */     return new cp(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(StringReader ☃) throws CommandSyntaxException {
/*  79 */     if (☃.canRead() && ☃.peek() == '@') {
/*  80 */       ds ds = new ds(☃);
/*  81 */       dr dr = ds.s();
/*  82 */       if (!this.d && dr.a() > 1) {
/*  83 */         throw cb.a.create();
/*     */       }
/*  85 */       return new b(dr);
/*     */     } 
/*  87 */     int i = ☃.getCursor();
/*  88 */     while (☃.canRead() && ☃.peek() != ' ') {
/*  89 */       ☃.skip();
/*     */     }
/*  91 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*  92 */     if (str.equals("*")) {
/*  93 */       return (☃, supplier) -> {
/*     */           Collection<String> collection = supplier.get();
/*     */           if (collection.isEmpty()) {
/*     */             throw c.create();
/*     */           }
/*     */           return collection;
/*     */         };
/*     */     }
/* 101 */     Collection<String> collection = Collections.singleton(str);
/* 102 */     return (bu1, supplier) -> ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 107 */     return b;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     Collection<String> getNames(bu param1bu, Supplier<Collection<String>> param1Supplier) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   public static class b implements a {
/*     */     private final dr a;
/*     */     
/*     */     public b(dr ☃) {
/* 119 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<String> getNames(bu ☃, Supplier<Collection<String>> supplier) throws CommandSyntaxException {
/* 124 */       List<? extends aer> list = this.a.b(☃);
/* 125 */       if (list.isEmpty()) {
/* 126 */         throw cb.d.create();
/*     */       }
/* 128 */       List<String> list1 = Lists.newArrayList();
/* 129 */       for (aer aer : list) {
/* 130 */         list1.add(aer.bv());
/*     */       }
/* 132 */       return list1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c
/*     */     implements dy<cp> {
/*     */     public void a(cp ☃, hy hy1) {
/* 139 */       byte b = 0;
/* 140 */       if (cp.a(☃)) {
/* 141 */         b = (byte)(b | 0x1);
/*     */       }
/* 143 */       hy1.writeByte(b);
/*     */     }
/*     */ 
/*     */     
/*     */     public cp a(hy ☃) {
/* 148 */       byte b = ☃.readByte();
/* 149 */       boolean bool = ((b & 0x1) != 0);
/* 150 */       return new cp(bool);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cp ☃, JsonObject jsonObject) {
/* 155 */       jsonObject.addProperty("amount", cp.a(☃) ? "multiple" : "single");
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */