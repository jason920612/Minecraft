/*     */ import com.google.common.base.Joiner;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qp
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   private static final Dynamic2CommandExceptionType b;
/*     */   
/*     */   static {
/*  27 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.forceload.toobig", new Object[] { ☃, object1 }));
/*  28 */     b = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.forceload.query.failure", new Object[] { ☃, object1 }));
/*  29 */   } private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.forceload.added.failure", new Object[0]));
/*  30 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.forceload.removed.failure", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  33 */     ☃.register(
/*  34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("forceload")
/*  35 */         .requires(☃ -> ☃.c(4)))
/*  36 */         .then(
/*  37 */           bv.a("add")
/*  38 */           .then((
/*  39 */             (RequiredArgumentBuilder)bv.<T>a("from", cz.a())
/*  40 */             .executes(☃ -> a((bu)☃.getSource(), cz.a(☃, "from"), cz.a(☃, "from"), true)))
/*  41 */             .then(
/*  42 */               bv.<T>a("to", cz.a())
/*  43 */               .executes(☃ -> a((bu)☃.getSource(), cz.a(☃, "from"), cz.a(☃, "to"), true))))))
/*     */         
/*  45 */         .then((
/*  46 */           (LiteralArgumentBuilder)bv.a("remove")
/*  47 */           .then((
/*  48 */             (RequiredArgumentBuilder)bv.<T>a("from", cz.a())
/*  49 */             .executes(☃ -> a((bu)☃.getSource(), cz.a(☃, "from"), cz.a(☃, "from"), false)))
/*  50 */             .then(
/*  51 */               bv.<T>a("to", cz.a())
/*  52 */               .executes(☃ -> a((bu)☃.getSource(), cz.a(☃, "from"), cz.a(☃, "to"), false)))))
/*  53 */           .then(
/*  54 */             bv.a("all")
/*  55 */             .executes(☃ -> b((bu)☃.getSource())))))
/*     */ 
/*     */         
/*  58 */         .then((
/*  59 */           (LiteralArgumentBuilder)bv.a("query")
/*  60 */           .executes(☃ -> a((bu)☃.getSource())))
/*  61 */           .then(
/*  62 */             bv.<T>a("pos", cz.a())
/*  63 */             .executes(☃ -> a((bu)☃.getSource(), cz.a(☃, "pos"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, cz.a a1) throws CommandSyntaxException {
/*  70 */     axm axm = new axm(a1.a >> 4, a1.b >> 4);
/*  71 */     bod bod = ☃.e().o().q();
/*  72 */     boolean bool = ☃.j().a(bod).f(axm.a, axm.b);
/*     */     
/*  74 */     if (bool) {
/*  75 */       ☃.a(new ir("commands.forceload.query.success", new Object[] { axm, bod }), false);
/*  76 */       return 1;
/*     */     } 
/*  78 */     throw b.create(axm, bod);
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(bu ☃) {
/*  83 */     bod bod = ☃.e().o().q();
/*  84 */     LongSet longSet = ☃.j().a(bod).ag();
/*  85 */     int i = longSet.size();
/*     */     
/*  87 */     if (i > 0) {
/*  88 */       String str = Joiner.on(", ").join(longSet.stream().sorted().map(axm::new).map(axm::toString).iterator());
/*     */       
/*  90 */       if (i == 1) {
/*  91 */         ☃.a(new ir("commands.forceload.list.single", new Object[] { bod, str }), false);
/*     */       } else {
/*  93 */         ☃.a(new ir("commands.forceload.list.multiple", new Object[] { Integer.valueOf(i), bod, str }), false);
/*     */       } 
/*     */     } else {
/*  96 */       ☃.a(new ir("commands.forceload.added.none", new Object[] { bod }));
/*     */     } 
/*  98 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃) {
/* 102 */     bod bod = ☃.e().o().q();
/* 103 */     td td = ☃.j().a(bod);
/* 104 */     LongSet longSet = td.ag();
/* 105 */     longSet.forEach(l -> ☃.b(axm.a(l), axm.b(l), false));
/* 106 */     ☃.a(new ir("commands.forceload.removed.all", new Object[] { bod }), true);
/* 107 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cz.a a1, cz.a a2, boolean bool) throws CommandSyntaxException {
/* 111 */     int i = Math.min(a1.a, a2.a);
/* 112 */     int j = Math.min(a1.b, a2.b);
/* 113 */     int k = Math.max(a1.a, a2.a);
/* 114 */     int m = Math.max(a1.b, a2.b);
/*     */     
/* 116 */     if (i < -30000000 || j < -30000000 || k >= 30000000 || m >= 30000000)
/*     */     {
/*     */ 
/*     */       
/* 120 */       throw cy.b.create();
/*     */     }
/*     */     
/* 123 */     int n = i >> 4;
/* 124 */     int i1 = j >> 4;
/* 125 */     int i2 = k >> 4;
/* 126 */     int i3 = m >> 4;
/*     */     
/* 128 */     long l = ((i2 - n) + 1L) * ((i3 - i1) + 1L);
/*     */     
/* 130 */     if (l > 256L) {
/* 131 */       throw a.create(Integer.valueOf(256), Long.valueOf(l));
/*     */     }
/*     */     
/* 134 */     bod bod = ☃.e().o().q();
/* 135 */     td td = ☃.j().a(bod);
/*     */     
/* 137 */     axm axm = null;
/* 138 */     int i4 = 0;
/* 139 */     for (int i5 = n; i5 <= i2; i5++) {
/* 140 */       for (int i6 = i1; i6 <= i3; i6++) {
/* 141 */         boolean bool1 = td.b(i5, i6, bool);
/* 142 */         if (bool1) {
/* 143 */           i4++;
/* 144 */           if (axm == null) {
/* 145 */             axm = new axm(i5, i6);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 151 */     if (i4 == 0)
/* 152 */       throw (bool ? c : d).create(); 
/* 153 */     if (i4 == 1) {
/* 154 */       ☃.a(new ir("commands.forceload." + (bool ? "added" : "removed") + ".single", new Object[] { axm, bod }), true);
/*     */     } else {
/* 156 */       axm axm1 = new axm(n, i1);
/* 157 */       axm axm2 = new axm(i2, i3);
/* 158 */       ☃.a(new ir("commands.forceload." + (bool ? "added" : "removed") + ".multiple", new Object[] { Integer.valueOf(i4), bod, axm1, axm2 }), true);
/*     */     } 
/*     */     
/* 161 */     return i4;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */