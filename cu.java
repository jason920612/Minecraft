/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cu
/*     */   implements ArgumentType<cu.b>
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*  32 */   private static final Collection<String> a = Arrays.asList(new String[] { "stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}" }); static {
/*  33 */     b = new DynamicCommandExceptionType(☃ -> new ir("arguments.block.tag.unknown", new Object[] { ☃ }));
/*     */   }
/*     */   public static cu a() {
/*  36 */     return new cu();
/*     */   }
/*     */ 
/*     */   
/*     */   public b a(StringReader ☃) throws CommandSyntaxException {
/*  41 */     cw cw = (new cw(☃, true)).a(true);
/*     */     
/*  43 */     if (cw.b() != null) {
/*  44 */       a a = new a(cw.b(), cw.a().keySet(), cw.c());
/*  45 */       return xb1 -> ☃;
/*     */     } 
/*  47 */     pc pc = cw.d();
/*  48 */     return xb1 -> {
/*     */         wz<bcs> wz = xb1.a().a(☃);
/*     */         if (wz == null) {
/*     */           throw b.create(☃.toString());
/*     */         }
/*     */         return new c(wz, cw1.j(), cw1.c());
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public static Predicate<blh> a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  59 */     return ((b)☃.getArgument(str, b.class)).create(((bu)☃.getSource()).j().aL());
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  64 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*  65 */     stringReader.setCursor(suggestionsBuilder.getStart());
/*  66 */     cw cw = new cw(stringReader, true);
/*     */     try {
/*  68 */       cw.a(true);
/*  69 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*     */     
/*  71 */     return cw.a(suggestionsBuilder);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  76 */     return a;
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     Predicate<blh> create(xb param1xb) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   static class a implements Predicate<blh> {
/*     */     private final blc a;
/*     */     private final Set<bmm<?>> b;
/*     */     @Nullable
/*     */     private final gy c;
/*     */     
/*     */     public a(blc ☃, Set<bmm<?>> set, @Nullable gy gy1) {
/*  90 */       this.a = ☃;
/*  91 */       this.b = set;
/*  92 */       this.c = gy1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(blh ☃) {
/*  97 */       blc blc1 = ☃.a();
/*     */       
/*  99 */       if (blc1.c() != this.a.c()) {
/* 100 */         return false;
/*     */       }
/*     */       
/* 103 */       for (bmm<?> bmm : this.b) {
/* 104 */         if (blc1.c(bmm) != this.a.c(bmm)) {
/* 105 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 109 */       if (this.c != null) {
/* 110 */         bji bji = ☃.b();
/* 111 */         return (bji != null && hk.a(this.c, bji.a(new gy()), true));
/*     */       } 
/*     */       
/* 114 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class c implements Predicate<blh> {
/*     */     private final wz<bcs> a;
/*     */     @Nullable
/*     */     private final gy b;
/*     */     private final Map<String, String> c;
/*     */     
/*     */     private c(wz<bcs> ☃, Map<String, String> map, @Nullable gy gy1) {
/* 125 */       this.a = ☃;
/* 126 */       this.c = map;
/* 127 */       this.b = gy1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(blh ☃) {
/* 132 */       blc blc = ☃.a();
/*     */       
/* 134 */       if (!blc.a(this.a)) {
/* 135 */         return false;
/*     */       }
/*     */       
/* 138 */       for (Map.Entry<String, String> entry : this.c.entrySet()) {
/* 139 */         bmm<?> bmm = blc.c().o().a(entry.getKey());
/* 140 */         if (bmm == null) {
/* 141 */           return false;
/*     */         }
/* 143 */         Comparable<?> comparable = bmm.b(entry.getValue()).orElse(null);
/* 144 */         if (comparable == null) {
/* 145 */           return false;
/*     */         }
/* 147 */         if (blc.c(bmm) != comparable) {
/* 148 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 152 */       if (this.b != null) {
/* 153 */         bji bji = ☃.b();
/* 154 */         return (bji != null && hk.a(this.b, bji.a(new gy()), true));
/*     */       } 
/*     */       
/* 157 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */