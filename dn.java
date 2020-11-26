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
/*     */ public class dn
/*     */   implements ArgumentType<dn.b>
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*  26 */   private static final Collection<String> a = Arrays.asList(new String[] { "stick", "minecraft:stick", "#stick", "#stick{foo=bar}" }); static {
/*  27 */     b = new DynamicCommandExceptionType(☃ -> new ir("arguments.item.tag.unknown", new Object[] { ☃ }));
/*     */   }
/*     */   public static dn a() {
/*  30 */     return new dn();
/*     */   }
/*     */ 
/*     */   
/*     */   public b a(StringReader ☃) throws CommandSyntaxException {
/*  35 */     dm dm = (new dm(☃, true)).h();
/*     */     
/*  37 */     if (dm.b() != null) {
/*  38 */       a a = new a(dm.b(), dm.c());
/*  39 */       return commandContext -> ☃;
/*     */     } 
/*  41 */     pc pc = dm.d();
/*  42 */     return commandContext -> {
/*     */         wz<ata> wz = ((bu)commandContext.getSource()).j().aL().b().a(☃);
/*     */         if (wz == null) {
/*     */           throw b.create(☃.toString());
/*     */         }
/*     */         return new c(wz, dm1.c());
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public static Predicate<ate> a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/*  53 */     return ((b)☃.getArgument(str, b.class)).create(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  58 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*  59 */     stringReader.setCursor(suggestionsBuilder.getStart());
/*  60 */     dm dm = new dm(stringReader, true);
/*     */     try {
/*  62 */       dm.h();
/*  63 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*     */     
/*  65 */     return dm.a(suggestionsBuilder);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  70 */     return a;
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     Predicate<ate> create(CommandContext<bu> param1CommandContext) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   static class a implements Predicate<ate> {
/*     */     private final ata a;
/*     */     @Nullable
/*     */     private final gy b;
/*     */     
/*     */     public a(ata ☃, @Nullable gy gy1) {
/*  83 */       this.a = ☃;
/*  84 */       this.b = gy1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ate ☃) {
/*  89 */       return (☃.b() == this.a && hk.a(this.b, ☃.n(), true));
/*     */     }
/*     */   }
/*     */   
/*     */   static class c implements Predicate<ate> {
/*     */     private final wz<ata> a;
/*     */     @Nullable
/*     */     private final gy b;
/*     */     
/*     */     public c(wz<ata> ☃, @Nullable gy gy1) {
/*  99 */       this.a = ☃;
/* 100 */       this.b = gy1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ate ☃) {
/* 105 */       return (this.a.a(☃.b()) && hk.a(this.b, ☃.n(), true));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\dn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */