/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
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
/*     */ public class sf
/*     */ {
/*  24 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.whitelist.alreadyOn", new Object[0]));
/*  25 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.whitelist.alreadyOff", new Object[0]));
/*  26 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.whitelist.add.failed", new Object[0]));
/*  27 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.whitelist.remove.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  30 */     ☃.register(
/*  31 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("whitelist")
/*  32 */         .requires(☃ -> ☃.c(3)))
/*  33 */         .then(
/*  34 */           bv.a("on")
/*  35 */           .executes(☃ -> b((bu)☃.getSource()))))
/*     */         
/*  37 */         .then(
/*  38 */           bv.a("off")
/*  39 */           .executes(☃ -> c((bu)☃.getSource()))))
/*     */         
/*  41 */         .then(
/*  42 */           bv.a("list")
/*  43 */           .executes(☃ -> d((bu)☃.getSource()))))
/*     */         
/*  45 */         .then(
/*  46 */           bv.a("add")
/*  47 */           .then(
/*  48 */             bv.<T>a("targets", cd.a())
/*  49 */             .suggests((☃, suggestionsBuilder) -> {
/*     */                 vp vp = ((bu)☃.getSource()).j().ac();
/*     */                 
/*     */                 return bw.b(vp.v().stream().filter(()).map(()), suggestionsBuilder);
/*  53 */               }).executes(☃ -> a((bu)☃.getSource(), cd.a(☃, "targets"))))))
/*     */ 
/*     */         
/*  56 */         .then(
/*  57 */           bv.a("remove")
/*  58 */           .then(
/*  59 */             bv.<T>a("targets", cd.a())
/*  60 */             .suggests((☃, suggestionsBuilder) -> bw.a(((bu)☃.getSource()).j().ac().l(), suggestionsBuilder))
/*  61 */             .executes(☃ -> b((bu)☃.getSource(), cd.a(☃, "targets"))))))
/*     */ 
/*     */         
/*  64 */         .then(
/*  65 */           bv.a("reload")
/*  66 */           .executes(☃ -> a((bu)☃.getSource()))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃) {
/*  72 */     ☃.j().ac().a();
/*  73 */     ☃.a(new ir("commands.whitelist.reloaded", new Object[0]), true);
/*  74 */     ☃.j().a(☃);
/*  75 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/*  79 */     vw vw = ☃.j().ac().k();
/*  80 */     int i = 0;
/*     */     
/*  82 */     for (GameProfile gameProfile : collection) {
/*  83 */       if (!vw.a(gameProfile)) {
/*  84 */         vx vx = new vx(gameProfile);
/*  85 */         vw.a(vx);
/*  86 */         ☃.a(new ir("commands.whitelist.add.success", new Object[] { ik.a(gameProfile) }), true);
/*  87 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     if (i == 0) {
/*  92 */       throw c.create();
/*     */     }
/*     */     
/*  95 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/*  99 */     vw vw = ☃.j().ac().k();
/* 100 */     int i = 0;
/*     */     
/* 102 */     for (GameProfile gameProfile : collection) {
/* 103 */       if (vw.a(gameProfile)) {
/* 104 */         vx vx = new vx(gameProfile);
/* 105 */         vw.b(vx);
/* 106 */         ☃.a(new ir("commands.whitelist.remove.success", new Object[] { ik.a(gameProfile) }), true);
/* 107 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     if (i == 0) {
/* 112 */       throw d.create();
/*     */     }
/*     */     
/* 115 */     ☃.j().a(☃);
/* 116 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃) throws CommandSyntaxException {
/* 120 */     vp vp = ☃.j().ac();
/* 121 */     if (vp.r()) {
/* 122 */       throw a.create();
/*     */     }
/* 124 */     vp.a(true);
/* 125 */     ☃.a(new ir("commands.whitelist.enabled", new Object[0]), true);
/* 126 */     ☃.j().a(☃);
/* 127 */     return 1;
/*     */   }
/*     */   
/*     */   private static int c(bu ☃) throws CommandSyntaxException {
/* 131 */     vp vp = ☃.j().ac();
/* 132 */     if (!vp.r()) {
/* 133 */       throw b.create();
/*     */     }
/* 135 */     vp.a(false);
/* 136 */     ☃.a(new ir("commands.whitelist.disabled", new Object[0]), true);
/* 137 */     return 1;
/*     */   }
/*     */   
/*     */   private static int d(bu ☃) {
/* 141 */     String[] arrayOfString = ☃.j().ac().l();
/* 142 */     if (arrayOfString.length == 0) {
/* 143 */       ☃.a(new ir("commands.whitelist.none", new Object[0]), false);
/*     */     } else {
/* 145 */       ☃.a(new ir("commands.whitelist.list", new Object[] { Integer.valueOf(arrayOfString.length), String.join(", ", (CharSequence[])arrayOfString) }), false);
/*     */     } 
/* 147 */     return arrayOfString.length;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */