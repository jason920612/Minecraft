/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ry
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*  39 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.team.add.duplicate", new Object[0])); static {
/*  40 */     b = new DynamicCommandExceptionType(☃ -> new ir("commands.team.add.longName", new Object[] { ☃ }));
/*  41 */   } private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.team.empty.unchanged", new Object[0]));
/*  42 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.team.option.name.unchanged", new Object[0]));
/*  43 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("commands.team.option.color.unchanged", new Object[0]));
/*  44 */   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new ir("commands.team.option.friendlyfire.alreadyEnabled", new Object[0]));
/*  45 */   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new ir("commands.team.option.friendlyfire.alreadyDisabled", new Object[0]));
/*  46 */   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new ir("commands.team.option.seeFriendlyInvisibles.alreadyEnabled", new Object[0]));
/*  47 */   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(new ir("commands.team.option.seeFriendlyInvisibles.alreadyDisabled", new Object[0]));
/*  48 */   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(new ir("commands.team.option.nametagVisibility.unchanged", new Object[0]));
/*  49 */   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(new ir("commands.team.option.deathMessageVisibility.unchanged", new Object[0]));
/*  50 */   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(new ir("commands.team.option.collisionRule.unchanged", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  53 */     ☃.register(
/*  54 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("team")
/*  55 */         .requires(☃ -> ☃.c(2)))
/*  56 */         .then((
/*  57 */           (LiteralArgumentBuilder)bv.a("list")
/*  58 */           .executes(☃ -> a((bu)☃.getSource())))
/*  59 */           .then(
/*  60 */             bv.<T>a("team", cs.a())
/*  61 */             .executes(☃ -> c((bu)☃.getSource(), cs.a(☃, "team"))))))
/*     */ 
/*     */         
/*  64 */         .then(
/*  65 */           bv.a("add")
/*  66 */           .then((
/*  67 */             (RequiredArgumentBuilder)bv.<T>a("team", (ArgumentType<T>)StringArgumentType.word())
/*  68 */             .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "team"))))
/*  69 */             .then(
/*  70 */               bv.<T>a("displayName", by.a())
/*  71 */               .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "team"), by.a(☃, "displayName")))))))
/*     */ 
/*     */ 
/*     */         
/*  75 */         .then(
/*  76 */           bv.a("remove")
/*  77 */           .then(
/*  78 */             bv.<T>a("team", cs.a())
/*  79 */             .executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"))))))
/*     */ 
/*     */         
/*  82 */         .then(
/*  83 */           bv.a("empty")
/*  84 */           .then(
/*  85 */             bv.<T>a("team", cs.a())
/*  86 */             .executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"))))))
/*     */ 
/*     */         
/*  89 */         .then(
/*  90 */           bv.a("join")
/*  91 */           .then((
/*  92 */             (RequiredArgumentBuilder)bv.<T>a("team", cs.a())
/*  93 */             .executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), Collections.singleton(((bu)☃.getSource()).g().bv()))))
/*  94 */             .then(
/*  95 */               bv.<T>a("members", cp.b())
/*  96 */               .suggests(cp.a)
/*  97 */               .executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cp.c(☃, "members")))))))
/*     */ 
/*     */ 
/*     */         
/* 101 */         .then(
/* 102 */           bv.a("leave")
/* 103 */           .then(
/* 104 */             bv.<T>a("members", cp.b())
/* 105 */             .suggests(cp.a)
/* 106 */             .executes(☃ -> a((bu)☃.getSource(), cp.c(☃, "members"))))))
/*     */ 
/*     */         
/* 109 */         .then(
/* 110 */           bv.a("modify")
/* 111 */           .then((
/* 112 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("team", cs.a())
/* 113 */             .then(
/* 114 */               bv.a("displayName")
/* 115 */               .then(
/* 116 */                 bv.<T>a("displayName", by.a())
/* 117 */                 .executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), by.a(☃, "displayName"))))))
/*     */ 
/*     */             
/* 120 */             .then(
/* 121 */               bv.a("color")
/* 122 */               .then(
/* 123 */                 bv.<T>a("value", bx.a())
/* 124 */                 .executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), bx.a(☃, "value"))))))
/*     */ 
/*     */             
/* 127 */             .then(
/* 128 */               bv.a("friendlyFire")
/* 129 */               .then(
/* 130 */                 bv.<T>a("allowed", (ArgumentType<T>)BoolArgumentType.bool())
/* 131 */                 .executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"), BoolArgumentType.getBool(☃, "allowed"))))))
/*     */ 
/*     */             
/* 134 */             .then(
/* 135 */               bv.a("seeFriendlyInvisibles")
/* 136 */               .then(
/* 137 */                 bv.<T>a("allowed", (ArgumentType<T>)BoolArgumentType.bool())
/* 138 */                 .executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), BoolArgumentType.getBool(☃, "allowed"))))))
/*     */ 
/*     */             
/* 141 */             .then((
/* 142 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("nametagVisibility")
/* 143 */               .then(bv.a("never").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.b))))
/* 144 */               .then(bv.a("hideForOtherTeams").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.c))))
/* 145 */               .then(bv.a("hideForOwnTeam").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.d))))
/* 146 */               .then(bv.a("always").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.a)))))
/*     */             
/* 148 */             .then((
/* 149 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("deathMessageVisibility")
/* 150 */               .then(bv.a("never").executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.b))))
/* 151 */               .then(bv.a("hideForOtherTeams").executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.c))))
/* 152 */               .then(bv.a("hideForOwnTeam").executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.d))))
/* 153 */               .then(bv.a("always").executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"), cfe.b.a)))))
/*     */             
/* 155 */             .then((
/* 156 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("collisionRule")
/* 157 */               .then(bv.a("never").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.a.b))))
/* 158 */               .then(bv.a("pushOwnTeam").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.a.d))))
/* 159 */               .then(bv.a("pushOtherTeams").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.a.c))))
/* 160 */               .then(bv.a("always").executes(☃ -> a((bu)☃.getSource(), cs.a(☃, "team"), cfe.a.a)))))
/*     */             
/* 162 */             .then(
/* 163 */               bv.a("prefix")
/* 164 */               .then(
/* 165 */                 bv.<T>a("prefix", by.a())
/* 166 */                 .executes(☃ -> b((bu)☃.getSource(), cs.a(☃, "team"), by.a(☃, "prefix"))))))
/*     */ 
/*     */             
/* 169 */             .then(
/* 170 */               bv.a("suffix")
/* 171 */               .then(
/* 172 */                 bv.<T>a("suffix", by.a())
/* 173 */                 .executes(☃ -> c((bu)☃.getSource(), cs.a(☃, "team"), by.a(☃, "suffix"))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<String> collection) {
/* 182 */     cfc cfc = ☃.j().aM();
/*     */     
/* 184 */     for (String str : collection) {
/* 185 */       cfc.h(str);
/*     */     }
/*     */     
/* 188 */     if (collection.size() == 1) {
/* 189 */       ☃.a(new ir("commands.team.leave.success.single", new Object[] { collection.iterator().next() }), true);
/*     */     } else {
/* 191 */       ☃.a(new ir("commands.team.leave.success.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 194 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1, Collection<String> collection) {
/* 198 */     cfc cfc = ☃.j().aM();
/*     */     
/* 200 */     for (String str : collection) {
/* 201 */       cfc.a(str, cfa1);
/*     */     }
/*     */     
/* 204 */     if (collection.size() == 1) {
/* 205 */       ☃.a(new ir("commands.team.join.success.single", new Object[] { collection.iterator().next(), cfa1.d() }), true);
/*     */     } else {
/* 207 */       ☃.a(new ir("commands.team.join.success.multiple", new Object[] { Integer.valueOf(collection.size()), cfa1.d() }), true);
/*     */     } 
/*     */     
/* 210 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1, cfe.b b1) throws CommandSyntaxException {
/* 214 */     if (cfa1.j() == b1) {
/* 215 */       throw j.create();
/*     */     }
/* 217 */     cfa1.a(b1);
/* 218 */     ☃.a(new ir("commands.team.option.nametagVisibility.success", new Object[] { cfa1.d(), b1.b() }), true);
/* 219 */     return 0;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, cfa cfa1, cfe.b b1) throws CommandSyntaxException {
/* 223 */     if (cfa1.k() == b1) {
/* 224 */       throw k.create();
/*     */     }
/* 226 */     cfa1.b(b1);
/* 227 */     ☃.a(new ir("commands.team.option.deathMessageVisibility.success", new Object[] { cfa1.d(), b1.b() }), true);
/* 228 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1, cfe.a a1) throws CommandSyntaxException {
/* 232 */     if (cfa1.l() == a1) {
/* 233 */       throw l.create();
/*     */     }
/* 235 */     cfa1.a(a1);
/* 236 */     ☃.a(new ir("commands.team.option.collisionRule.success", new Object[] { cfa1.d(), a1.b() }), true);
/* 237 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1, boolean bool) throws CommandSyntaxException {
/* 241 */     if (cfa1.i() == bool) {
/* 242 */       if (bool) {
/* 243 */         throw h.create();
/*     */       }
/* 245 */       throw i.create();
/*     */     } 
/*     */ 
/*     */     
/* 249 */     cfa1.b(bool);
/* 250 */     ☃.a(new ir("commands.team.option.seeFriendlyInvisibles." + (bool ? "enabled" : "disabled"), new Object[] { cfa1.d() }), true);
/*     */     
/* 252 */     return 0;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, cfa cfa1, boolean bool) throws CommandSyntaxException {
/* 256 */     if (cfa1.h() == bool) {
/* 257 */       if (bool) {
/* 258 */         throw f.create();
/*     */       }
/* 260 */       throw g.create();
/*     */     } 
/*     */ 
/*     */     
/* 264 */     cfa1.a(bool);
/* 265 */     ☃.a(new ir("commands.team.option.friendlyfire." + (bool ? "enabled" : "disabled"), new Object[] { cfa1.d() }), true);
/*     */     
/* 267 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1, ij ij1) throws CommandSyntaxException {
/* 271 */     if (cfa1.c().equals(ij1)) {
/* 272 */       throw d.create();
/*     */     }
/*     */     
/* 275 */     cfa1.a(ij1);
/* 276 */     ☃.a(new ir("commands.team.option.name.success", new Object[] { cfa1.d() }), true);
/* 277 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1, a a1) throws CommandSyntaxException {
/* 281 */     if (cfa1.n() == a1) {
/* 282 */       throw e.create();
/*     */     }
/* 284 */     cfa1.a(a1);
/* 285 */     ☃.a(new ir("commands.team.option.color.success", new Object[] { cfa1.d(), a1.g() }), true);
/* 286 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, cfa cfa1) throws CommandSyntaxException {
/* 290 */     cfc cfc = ☃.j().aM();
/* 291 */     Collection<String> collection = Lists.newArrayList(cfa1.g());
/*     */     
/* 293 */     if (collection.isEmpty()) {
/* 294 */       throw c.create();
/*     */     }
/*     */     
/* 297 */     for (String str : collection) {
/* 298 */       cfc.b(str, cfa1);
/*     */     }
/*     */     
/* 301 */     ☃.a(new ir("commands.team.empty.success", new Object[] { Integer.valueOf(collection.size()), cfa1.d() }), true);
/*     */     
/* 303 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, cfa cfa1) {
/* 307 */     cfc cfc = ☃.j().aM();
/* 308 */     cfc.d(cfa1);
/* 309 */     ☃.a(new ir("commands.team.remove.success", new Object[] { cfa1.d() }), true);
/* 310 */     return cfc.g().size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, String str) throws CommandSyntaxException {
/* 314 */     return a(☃, str, new iq(str));
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, String str, ij ij1) throws CommandSyntaxException {
/* 318 */     cfc cfc = ☃.j().aM();
/* 319 */     if (cfc.f(str) != null) {
/* 320 */       throw a.create();
/*     */     }
/* 322 */     if (str.length() > 16) {
/* 323 */       throw b.create(Integer.valueOf(16));
/*     */     }
/*     */     
/* 326 */     cfa cfa = cfc.g(str);
/* 327 */     cfa.a(ij1);
/*     */     
/* 329 */     ☃.a(new ir("commands.team.add.success", new Object[] { cfa.d() }), true);
/*     */     
/* 331 */     return cfc.g().size();
/*     */   }
/*     */   
/*     */   private static int c(bu ☃, cfa cfa1) {
/* 335 */     Collection<String> collection = cfa1.g();
/* 336 */     if (collection.isEmpty()) {
/* 337 */       ☃.a(new ir("commands.team.list.members.empty", new Object[] { cfa1.d() }), false);
/*     */     } else {
/* 339 */       ☃.a(new ir("commands.team.list.members.success", new Object[] { cfa1.d(), Integer.valueOf(collection.size()), ik.a(collection) }), false);
/*     */     } 
/* 341 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃) {
/* 345 */     Collection<cfa> collection = ☃.j().aM().g();
/* 346 */     if (collection.isEmpty()) {
/* 347 */       ☃.a(new ir("commands.team.list.teams.empty", new Object[0]), false);
/*     */     } else {
/* 349 */       ☃.a(new ir("commands.team.list.teams.success", new Object[] { Integer.valueOf(collection.size()), ik.b(collection, cfa::d) }), false);
/*     */     } 
/* 351 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, cfa cfa1, ij ij1) {
/* 355 */     cfa1.b(ij1);
/* 356 */     ☃.a(new ir("commands.team.option.prefix.success", new Object[] { ij1 }), false);
/* 357 */     return 1;
/*     */   }
/*     */   
/*     */   private static int c(bu ☃, cfa cfa1, ij ij1) {
/* 361 */     cfa1.c(ij1);
/* 362 */     ☃.a(new ir("commands.team.option.suffix.success", new Object[] { ij1 }), false);
/* 363 */     return 1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */