/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cb
/*     */   implements ArgumentType<dr>
/*     */ {
/*  29 */   private static final Collection<String> g = Arrays.asList(new String[] { "Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498" });
/*  30 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.entity.toomany", new Object[0]));
/*  31 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("argument.player.toomany", new Object[0]));
/*  32 */   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("argument.player.entities", new Object[0]));
/*  33 */   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("argument.entity.notfound.entity", new Object[0]));
/*  34 */   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("argument.entity.notfound.player", new Object[0]));
/*  35 */   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new ir("argument.entity.selector.not_allowed", new Object[0]));
/*     */ 
/*     */   
/*     */   private final boolean h;
/*     */   
/*     */   private final boolean i;
/*     */ 
/*     */   
/*     */   protected cb(boolean ☃, boolean bool1) {
/*  44 */     this.h = ☃;
/*  45 */     this.i = bool1;
/*     */   }
/*     */   
/*     */   public static cb a() {
/*  49 */     return new cb(true, false);
/*     */   }
/*     */   
/*     */   public static aer a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  53 */     return ((dr)☃.getArgument(str, dr.class)).a((bu)☃.getSource());
/*     */   }
/*     */   
/*     */   public static cb b() {
/*  57 */     return new cb(false, false);
/*     */   }
/*     */   
/*     */   public static Collection<? extends aer> b(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  61 */     Collection<? extends aer> collection = c(☃, str);
/*  62 */     if (collection.isEmpty()) {
/*  63 */       throw d.create();
/*     */     }
/*  65 */     return collection;
/*     */   }
/*     */   
/*     */   public static Collection<? extends aer> c(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  69 */     return ((dr)☃.getArgument(str, dr.class)).b((bu)☃.getSource());
/*     */   }
/*     */   
/*     */   public static Collection<tf> d(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  73 */     return ((dr)☃.getArgument(str, dr.class)).d((bu)☃.getSource());
/*     */   }
/*     */   
/*     */   public static cb c() {
/*  77 */     return new cb(true, true);
/*     */   }
/*     */   
/*     */   public static tf e(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  81 */     return ((dr)☃.getArgument(str, dr.class)).c((bu)☃.getSource());
/*     */   }
/*     */   
/*     */   public static cb d() {
/*  85 */     return new cb(false, true);
/*     */   }
/*     */   
/*     */   public static Collection<tf> f(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  89 */     List<tf> list = ((dr)☃.getArgument(str, dr.class)).d((bu)☃.getSource());
/*  90 */     if (list.isEmpty()) {
/*  91 */       throw e.create();
/*     */     }
/*  93 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public dr a(StringReader ☃) throws CommandSyntaxException {
/*  98 */     int i = 0;
/*  99 */     ds ds = new ds(☃);
/* 100 */     dr dr = ds.s();
/* 101 */     if (dr.a() > 1 && this.h) {
/* 102 */       if (this.i) {
/* 103 */         ☃.setCursor(0);
/* 104 */         throw b.createWithContext(☃);
/*     */       } 
/* 106 */       ☃.setCursor(0);
/* 107 */       throw a.createWithContext(☃);
/*     */     } 
/*     */     
/* 110 */     if (dr.b() && this.i && !dr.c()) {
/* 111 */       ☃.setCursor(0);
/* 112 */       throw c.createWithContext(☃);
/*     */     } 
/*     */     
/* 115 */     return dr;
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 120 */     if (☃.getSource() instanceof bw) {
/* 121 */       StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/* 122 */       stringReader.setCursor(suggestionsBuilder.getStart());
/* 123 */       bw bw = (bw)☃.getSource();
/* 124 */       ds ds = new ds(stringReader, bw.c(2));
/*     */       try {
/* 126 */         ds.s();
/* 127 */       } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       
/* 129 */       return ds.a(suggestionsBuilder, suggestionsBuilder -> {
/*     */             Collection<String> collection = ☃.l();
/*     */             Iterable<String> iterable = this.i ? collection : Iterables.concat(collection, ☃.p());
/*     */             bw.b(iterable, suggestionsBuilder);
/*     */           });
/*     */     } 
/* 135 */     return Suggestions.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 141 */     return g;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements dy<cb> {
/*     */     public void a(cb ☃, hy hy1) {
/* 147 */       byte b = 0;
/* 148 */       if (cb.a(☃)) {
/* 149 */         b = (byte)(b | 0x1);
/*     */       }
/* 151 */       if (cb.b(☃)) {
/* 152 */         b = (byte)(b | 0x2);
/*     */       }
/* 154 */       hy1.writeByte(b);
/*     */     }
/*     */ 
/*     */     
/*     */     public cb a(hy ☃) {
/* 159 */       byte b = ☃.readByte();
/* 160 */       return new cb(((b & 0x1) != 0), ((b & 0x2) != 0));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cb ☃, JsonObject jsonObject) {
/* 165 */       jsonObject.addProperty("amount", cb.a(☃) ? "single" : "multiple");
/* 166 */       jsonObject.addProperty("type", cb.b(☃) ? "players" : "entities");
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */