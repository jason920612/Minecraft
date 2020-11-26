/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qb
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final DynamicCommandExceptionType c;
/*     */   
/*     */   static {
/*  39 */     b = new DynamicCommandExceptionType(☃ -> new ir("commands.bossbar.create.failed", new Object[] { ☃ }));
/*  40 */     c = new DynamicCommandExceptionType(☃ -> new ir("commands.bossbar.unknown", new Object[] { ☃ }));
/*  41 */   } private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.bossbar.set.players.unchanged", new Object[0]));
/*  42 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("commands.bossbar.set.name.unchanged", new Object[0]));
/*  43 */   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new ir("commands.bossbar.set.color.unchanged", new Object[0]));
/*  44 */   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new ir("commands.bossbar.set.style.unchanged", new Object[0]));
/*  45 */   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new ir("commands.bossbar.set.value.unchanged", new Object[0]));
/*  46 */   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(new ir("commands.bossbar.set.max.unchanged", new Object[0]));
/*  47 */   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(new ir("commands.bossbar.set.visibility.unchanged.hidden", new Object[0])); public static final SuggestionProvider<bu> a;
/*  48 */   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(new ir("commands.bossbar.set.visibility.unchanged.visible", new Object[0])); static {
/*  49 */     a = ((☃, suggestionsBuilder) -> bw.a(((bu)☃.getSource()).j().aP().a(), suggestionsBuilder));
/*     */   }
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  52 */     ☃.register(
/*  53 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("bossbar")
/*  54 */         .requires(☃ -> ☃.c(2)))
/*  55 */         .then(
/*  56 */           bv.a("add")
/*  57 */           .then(
/*  58 */             bv.<T>a("id", co.a())
/*  59 */             .then(
/*  60 */               bv.<T>a("name", by.a())
/*  61 */               .executes(☃ -> a((bu)☃.getSource(), co.c(☃, "id"), by.a(☃, "name")))))))
/*     */ 
/*     */ 
/*     */         
/*  65 */         .then(
/*  66 */           bv.a("remove")
/*  67 */           .then(
/*  68 */             bv.<T>a("id", co.a())
/*  69 */             .suggests(a)
/*  70 */             .executes(☃ -> e((bu)☃.getSource(), a(☃))))))
/*     */ 
/*     */         
/*  73 */         .then(
/*  74 */           bv.a("list")
/*  75 */           .executes(☃ -> a((bu)☃.getSource()))))
/*     */         
/*  77 */         .then(
/*  78 */           bv.a("set")
/*  79 */           .then((
/*  80 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("id", co.a())
/*  81 */             .suggests(a)
/*  82 */             .then(
/*  83 */               bv.a("name")
/*  84 */               .then(
/*  85 */                 bv.<T>a("name", by.a())
/*  86 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), by.a(☃, "name"))))))
/*     */ 
/*     */             
/*  89 */             .then((
/*  90 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("color")
/*  91 */               .then(
/*  92 */                 bv.a("pink")
/*  93 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.a))))
/*     */               
/*  95 */               .then(
/*  96 */                 bv.a("blue")
/*  97 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.b))))
/*     */               
/*  99 */               .then(
/* 100 */                 bv.a("red")
/* 101 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.c))))
/*     */               
/* 103 */               .then(
/* 104 */                 bv.a("green")
/* 105 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.d))))
/*     */               
/* 107 */               .then(
/* 108 */                 bv.a("yellow")
/* 109 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.e))))
/*     */               
/* 111 */               .then(
/* 112 */                 bv.a("purple")
/* 113 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.f))))
/*     */               
/* 115 */               .then(
/* 116 */                 bv.a("white")
/* 117 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.a.g)))))
/*     */ 
/*     */             
/* 120 */             .then((
/* 121 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("style")
/* 122 */               .then(
/* 123 */                 bv.a("progress")
/* 124 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.b.a))))
/*     */               
/* 126 */               .then(
/* 127 */                 bv.a("notched_6")
/* 128 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.b.b))))
/*     */               
/* 130 */               .then(
/* 131 */                 bv.a("notched_10")
/* 132 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.b.c))))
/*     */               
/* 134 */               .then(
/* 135 */                 bv.a("notched_12")
/* 136 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.b.d))))
/*     */               
/* 138 */               .then(
/* 139 */                 bv.a("notched_20")
/* 140 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), adc.b.e)))))
/*     */ 
/*     */             
/* 143 */             .then(
/* 144 */               bv.a("value")
/* 145 */               .then(
/* 146 */                 bv.<T>a("value", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 147 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), IntegerArgumentType.getInteger(☃, "value"))))))
/*     */ 
/*     */             
/* 150 */             .then(
/* 151 */               bv.a("max")
/* 152 */               .then(
/* 153 */                 bv.<T>a("max", (ArgumentType<T>)IntegerArgumentType.integer(1))
/* 154 */                 .executes(☃ -> b((bu)☃.getSource(), a(☃), IntegerArgumentType.getInteger(☃, "max"))))))
/*     */ 
/*     */             
/* 157 */             .then(
/* 158 */               bv.a("visible")
/* 159 */               .then(
/* 160 */                 bv.<T>a("visible", (ArgumentType<T>)BoolArgumentType.bool())
/* 161 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), BoolArgumentType.getBool(☃, "visible"))))))
/*     */ 
/*     */             
/* 164 */             .then((
/* 165 */               (LiteralArgumentBuilder)bv.a("players")
/* 166 */               .executes(☃ -> a((bu)☃.getSource(), a(☃), Collections.emptyList())))
/* 167 */               .then(
/* 168 */                 bv.<T>a("targets", cb.d())
/* 169 */                 .executes(☃ -> a((bu)☃.getSource(), a(☃), cb.d(☃, "targets"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 174 */         .then(
/* 175 */           bv.a("get")
/* 176 */           .then((
/* 177 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("id", co.a())
/* 178 */             .suggests(a)
/* 179 */             .then(
/* 180 */               bv.a("value")
/* 181 */               .executes(☃ -> a((bu)☃.getSource(), a(☃)))))
/*     */             
/* 183 */             .then(
/* 184 */               bv.a("max")
/* 185 */               .executes(☃ -> b((bu)☃.getSource(), a(☃)))))
/*     */             
/* 187 */             .then(
/* 188 */               bv.a("visible")
/* 189 */               .executes(☃ -> c((bu)☃.getSource(), a(☃)))))
/*     */             
/* 191 */             .then(
/* 192 */               bv.a("players")
/* 193 */               .executes(☃ -> d((bu)☃.getSource(), a(☃)))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, pu pu1) {
/* 201 */     ☃.a(new ir("commands.bossbar.get.value", new Object[] { pu1.e(), Integer.valueOf(pu1.c()) }), true);
/* 202 */     return pu1.c();
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, pu pu1) {
/* 206 */     ☃.a(new ir("commands.bossbar.get.max", new Object[] { pu1.e(), Integer.valueOf(pu1.d()) }), true);
/* 207 */     return pu1.d();
/*     */   }
/*     */   
/*     */   private static int c(bu ☃, pu pu1) {
/* 211 */     if (pu1.g()) {
/* 212 */       ☃.a(new ir("commands.bossbar.get.visible.visible", new Object[] { pu1.e() }), true);
/* 213 */       return 1;
/*     */     } 
/* 215 */     ☃.a(new ir("commands.bossbar.get.visible.hidden", new Object[] { pu1.e() }), true);
/* 216 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int d(bu ☃, pu pu1) {
/* 221 */     if (pu1.h().isEmpty()) {
/* 222 */       ☃.a(new ir("commands.bossbar.get.players.none", new Object[] { pu1.e() }), true);
/*     */     } else {
/* 224 */       ☃.a(new ir("commands.bossbar.get.players.some", new Object[] { pu1.e(), Integer.valueOf(pu1.h().size()), ik.b(pu1.h(), aog::O) }), true);
/*     */     } 
/* 226 */     return pu1.h().size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pu pu1, boolean bool) throws CommandSyntaxException {
/* 230 */     if (pu1.g() == bool) {
/* 231 */       if (bool) {
/* 232 */         throw k.create();
/*     */       }
/* 234 */       throw j.create();
/*     */     } 
/*     */     
/* 237 */     pu1.d(bool);
/* 238 */     if (bool) {
/* 239 */       ☃.a(new ir("commands.bossbar.set.visible.success.visible", new Object[] { pu1.e() }), true);
/*     */     } else {
/* 241 */       ☃.a(new ir("commands.bossbar.set.visible.success.hidden", new Object[] { pu1.e() }), true);
/*     */     } 
/* 243 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pu pu1, int i) throws CommandSyntaxException {
/* 247 */     if (pu1.c() == i) {
/* 248 */       throw h.create();
/*     */     }
/* 250 */     pu1.a(i);
/* 251 */     ☃.a(new ir("commands.bossbar.set.value.success", new Object[] { pu1.e(), Integer.valueOf(i) }), true);
/* 252 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃, pu pu1, int i) throws CommandSyntaxException {
/* 256 */     if (pu1.d() == i) {
/* 257 */       throw i.create();
/*     */     }
/* 259 */     pu1.b(i);
/* 260 */     ☃.a(new ir("commands.bossbar.set.max.success", new Object[] { pu1.e(), Integer.valueOf(i) }), true);
/* 261 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pu pu1, adc.a a1) throws CommandSyntaxException {
/* 265 */     if (pu1.l().equals(a1)) {
/* 266 */       throw f.create();
/*     */     }
/* 268 */     pu1.a(a1);
/* 269 */     ☃.a(new ir("commands.bossbar.set.color.success", new Object[] { pu1.e() }), true);
/* 270 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pu pu1, adc.b b1) throws CommandSyntaxException {
/* 274 */     if (pu1.m().equals(b1)) {
/* 275 */       throw g.create();
/*     */     }
/* 277 */     pu1.a(b1);
/* 278 */     ☃.a(new ir("commands.bossbar.set.style.success", new Object[] { pu1.e() }), true);
/* 279 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pu pu1, ij ij1) throws CommandSyntaxException {
/* 283 */     ij ij2 = ik.a(☃, ij1, null);
/* 284 */     if (pu1.j().equals(ij2)) {
/* 285 */       throw e.create();
/*     */     }
/* 287 */     pu1.a(ij2);
/* 288 */     ☃.a(new ir("commands.bossbar.set.name.success", new Object[] { pu1.e() }), true);
/* 289 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pu pu1, Collection<tf> collection) throws CommandSyntaxException {
/* 293 */     boolean bool = pu1.a(collection);
/* 294 */     if (!bool) {
/* 295 */       throw d.create();
/*     */     }
/* 297 */     if (pu1.h().isEmpty()) {
/* 298 */       ☃.a(new ir("commands.bossbar.set.players.success.none", new Object[] { pu1.e() }), true);
/*     */     } else {
/* 300 */       ☃.a(new ir("commands.bossbar.set.players.success.some", new Object[] { pu1.e(), Integer.valueOf(collection.size()), ik.b(collection, aog::O) }), true);
/*     */     } 
/* 302 */     return pu1.h().size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃) {
/* 306 */     Collection<pu> collection = ☃.j().aP().b();
/* 307 */     if (collection.isEmpty()) {
/* 308 */       ☃.a(new ir("commands.bossbar.list.bars.none", new Object[0]), false);
/*     */     } else {
/* 310 */       ☃.a(new ir("commands.bossbar.list.bars.some", new Object[] { Integer.valueOf(collection.size()), ik.b(collection, pu::e) }), false);
/*     */     } 
/* 312 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, pc pc1, ij ij1) throws CommandSyntaxException {
/* 316 */     pv pv = ☃.j().aP();
/* 317 */     if (pv.a(pc1) != null) {
/* 318 */       throw b.create(pc1.toString());
/*     */     }
/* 320 */     pu pu = pv.a(pc1, ik.a(☃, ij1, null));
/* 321 */     ☃.a(new ir("commands.bossbar.create.success", new Object[] { pu.e() }), true);
/* 322 */     return pv.b().size();
/*     */   }
/*     */   
/*     */   private static int e(bu ☃, pu pu1) {
/* 326 */     pv pv = ☃.j().aP();
/* 327 */     pu1.b();
/* 328 */     pv.a(pu1);
/* 329 */     ☃.a(new ir("commands.bossbar.remove.success", new Object[] { pu1.e() }), true);
/* 330 */     return pv.b().size();
/*     */   }
/*     */   
/*     */   public static pu a(CommandContext<bu> ☃) throws CommandSyntaxException {
/* 334 */     pc pc = co.c(☃, "id");
/* 335 */     pu pu = ((bu)☃.getSource()).j().aP().a(pc);
/* 336 */     if (pu == null) {
/* 337 */       throw c.create(pc.toString());
/*     */     }
/* 339 */     return pu;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */