/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
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
/*     */ public class px
/*     */ {
/*     */   private static final SuggestionProvider<bu> a;
/*     */   
/*     */   static {
/*  28 */     a = ((☃, suggestionsBuilder) -> {
/*     */         Collection<l> collection = ((bu)☃.getSource()).j().aA().b();
/*     */         return bw.a(collection.stream().map(l::h), suggestionsBuilder);
/*     */       });
/*     */   }
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  34 */     ☃.register(
/*  35 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("advancement")
/*  36 */         .requires(☃ -> ☃.c(2)))
/*  37 */         .then(
/*  38 */           bv.a("grant")
/*  39 */           .then((
/*  40 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/*  41 */             .then(
/*  42 */               bv.a("only")
/*  43 */               .then((
/*  44 */                 (RequiredArgumentBuilder)bv.<T>a("advancement", co.a())
/*  45 */                 .suggests(a)
/*  46 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.a, a(co.a(☃, "advancement"), b.a))))
/*  47 */                 .then(
/*  48 */                   bv.<T>a("criterion", (ArgumentType<T>)StringArgumentType.greedyString())
/*  49 */                   .suggests((☃, suggestionsBuilder) -> bw.b(co.a(☃, "advancement").f().keySet(), suggestionsBuilder))
/*  50 */                   .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.a, co.a(☃, "advancement"), StringArgumentType.getString(☃, "criterion")))))))
/*     */ 
/*     */ 
/*     */             
/*  54 */             .then(
/*  55 */               bv.a("from")
/*  56 */               .then(
/*  57 */                 bv.<T>a("advancement", co.a())
/*  58 */                 .suggests(a)
/*  59 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.a, a(co.a(☃, "advancement"), b.c))))))
/*     */ 
/*     */             
/*  62 */             .then(
/*  63 */               bv.a("until")
/*  64 */               .then(
/*  65 */                 bv.<T>a("advancement", co.a())
/*  66 */                 .suggests(a)
/*  67 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.a, a(co.a(☃, "advancement"), b.d))))))
/*     */ 
/*     */             
/*  70 */             .then(
/*  71 */               bv.a("through")
/*  72 */               .then(
/*  73 */                 bv.<T>a("advancement", co.a())
/*  74 */                 .suggests(a)
/*  75 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.a, a(co.a(☃, "advancement"), b.b))))))
/*     */ 
/*     */             
/*  78 */             .then(
/*  79 */               bv.a("everything")
/*  80 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.a, ((bu)☃.getSource()).j().aA().b()))))))
/*     */ 
/*     */ 
/*     */         
/*  84 */         .then(
/*  85 */           bv.a("revoke")
/*  86 */           .then((
/*  87 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/*  88 */             .then(
/*  89 */               bv.a("only")
/*  90 */               .then((
/*  91 */                 (RequiredArgumentBuilder)bv.<T>a("advancement", co.a())
/*  92 */                 .suggests(a)
/*  93 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.b, a(co.a(☃, "advancement"), b.a))))
/*  94 */                 .then(
/*  95 */                   bv.<T>a("criterion", (ArgumentType<T>)StringArgumentType.greedyString())
/*  96 */                   .suggests((☃, suggestionsBuilder) -> bw.b(co.a(☃, "advancement").f().keySet(), suggestionsBuilder))
/*  97 */                   .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.b, co.a(☃, "advancement"), StringArgumentType.getString(☃, "criterion")))))))
/*     */ 
/*     */ 
/*     */             
/* 101 */             .then(
/* 102 */               bv.a("from")
/* 103 */               .then(
/* 104 */                 bv.<T>a("advancement", co.a())
/* 105 */                 .suggests(a)
/* 106 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.b, a(co.a(☃, "advancement"), b.c))))))
/*     */ 
/*     */             
/* 109 */             .then(
/* 110 */               bv.a("until")
/* 111 */               .then(
/* 112 */                 bv.<T>a("advancement", co.a())
/* 113 */                 .suggests(a)
/* 114 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.b, a(co.a(☃, "advancement"), b.d))))))
/*     */ 
/*     */             
/* 117 */             .then(
/* 118 */               bv.a("through")
/* 119 */               .then(
/* 120 */                 bv.<T>a("advancement", co.a())
/* 121 */                 .suggests(a)
/* 122 */                 .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.b, a(co.a(☃, "advancement"), b.b))))))
/*     */ 
/*     */             
/* 125 */             .then(
/* 126 */               bv.a("everything")
/* 127 */               .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), a.b, ((bu)☃.getSource()).j().aA().b()))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection, a a1, Collection<l> collection1) {
/* 135 */     int i = 0;
/* 136 */     for (tf tf : collection) {
/* 137 */       i += a1.a(tf, collection1);
/*     */     }
/*     */     
/* 140 */     if (i == 0) {
/* 141 */       if (collection1.size() == 1) {
/* 142 */         if (collection.size() == 1) {
/* 143 */           throw new bs(new ir(a1.a() + ".one.to.one.failure", new Object[] { ((l)collection1.iterator().next()).j(), ((tf)collection.iterator().next()).O() }));
/*     */         }
/* 145 */         throw new bs(new ir(a1.a() + ".one.to.many.failure", new Object[] { ((l)collection1.iterator().next()).j(), Integer.valueOf(collection.size()) }));
/*     */       } 
/*     */       
/* 148 */       if (collection.size() == 1) {
/* 149 */         throw new bs(new ir(a1.a() + ".many.to.one.failure", new Object[] { Integer.valueOf(collection1.size()), ((tf)collection.iterator().next()).O() }));
/*     */       }
/* 151 */       throw new bs(new ir(a1.a() + ".many.to.many.failure", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 156 */     if (collection1.size() == 1) {
/* 157 */       if (collection.size() == 1) {
/* 158 */         ☃.a(new ir(a1.a() + ".one.to.one.success", new Object[] { ((l)collection1.iterator().next()).j(), ((tf)collection.iterator().next()).O() }), true);
/*     */       } else {
/* 160 */         ☃.a(new ir(a1.a() + ".one.to.many.success", new Object[] { ((l)collection1.iterator().next()).j(), Integer.valueOf(collection.size()) }), true);
/*     */       }
/*     */     
/* 163 */     } else if (collection.size() == 1) {
/* 164 */       ☃.a(new ir(a1.a() + ".many.to.one.success", new Object[] { Integer.valueOf(collection1.size()), ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 166 */       ☃.a(new ir(a1.a() + ".many.to.many.success", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */ 
/*     */     
/* 170 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<tf> collection, a a1, l l1, String str) {
/* 174 */     int i = 0;
/*     */     
/* 176 */     if (!l1.f().containsKey(str)) {
/* 177 */       throw new bs(new ir("commands.advancement.criterionNotFound", new Object[] { l1.j(), str }));
/*     */     }
/*     */     
/* 180 */     for (tf tf : collection) {
/* 181 */       if (a1.a(tf, l1, str)) {
/* 182 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 186 */     if (i == 0) {
/* 187 */       if (collection.size() == 1) {
/* 188 */         throw new bs(new ir(a1.a() + ".criterion.to.one.failure", new Object[] { str, l1.j(), ((tf)collection.iterator().next()).O() }));
/*     */       }
/* 190 */       throw new bs(new ir(a1.a() + ".criterion.to.many.failure", new Object[] { str, l1.j(), Integer.valueOf(collection.size()) }));
/*     */     } 
/*     */ 
/*     */     
/* 194 */     if (collection.size() == 1) {
/* 195 */       ☃.a(new ir(a1.a() + ".criterion.to.one.success", new Object[] { str, l1.j(), ((tf)collection.iterator().next()).O() }), true);
/*     */     } else {
/* 197 */       ☃.a(new ir(a1.a() + ".criterion.to.many.success", new Object[] { str, l1.j(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 200 */     return i;
/*     */   }
/*     */   
/*     */   private static List<l> a(l ☃, b b1) {
/* 204 */     List<l> list = Lists.newArrayList();
/* 205 */     if (b.a(b1)) {
/* 206 */       l l1 = ☃.b();
/* 207 */       while (l1 != null) {
/* 208 */         list.add(l1);
/* 209 */         l1 = l1.b();
/*     */       } 
/*     */     } 
/* 212 */     list.add(☃);
/* 213 */     if (b.b(b1)) {
/* 214 */       a(☃, list);
/*     */     }
/* 216 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(l ☃, List<l> list) {
/* 220 */     for (l l1 : ☃.e()) {
/* 221 */       list.add(l1);
/* 222 */       a(l1, list);
/*     */     } 
/*     */   }
/*     */   
/*     */   enum a {
/* 227 */     a("grant")
/*     */     {
/*     */       protected boolean a(tf ☃, l l1) {
/* 230 */         n n = ☃.L().b(l1);
/* 231 */         if (n.a()) {
/* 232 */           return false;
/*     */         }
/* 234 */         for (String str : n.e()) {
/* 235 */           ☃.L().a(l1, str);
/*     */         }
/* 237 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       protected boolean a(tf ☃, l l1, String str) {
/* 242 */         return ☃.L().a(l1, str);
/*     */       }
/*     */     },
/* 245 */     b("revoke")
/*     */     {
/*     */       protected boolean a(tf ☃, l l1) {
/* 248 */         n n = ☃.L().b(l1);
/* 249 */         if (!n.b()) {
/* 250 */           return false;
/*     */         }
/* 252 */         for (String str : n.f()) {
/* 253 */           ☃.L().b(l1, str);
/*     */         }
/* 255 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       protected boolean a(tf ☃, l l1, String str) {
/* 260 */         return ☃.L().b(l1, str);
/*     */       }
/*     */     };
/*     */ 
/*     */     
/*     */     private final String c;
/*     */     
/*     */     a(String ☃) {
/* 268 */       this.c = "commands.advancement." + ☃;
/*     */     }
/*     */     
/*     */     public int a(tf ☃, Iterable<l> iterable) {
/* 272 */       int i = 0;
/* 273 */       for (l l : iterable) {
/* 274 */         if (a(☃, l)) {
/* 275 */           i++;
/*     */         }
/*     */       } 
/* 278 */       return i;
/*     */     }
/*     */     
/*     */     protected abstract boolean a(tf param1tf, l param1l);
/*     */     
/*     */     protected abstract boolean a(tf param1tf, l param1l, String param1String);
/*     */     
/*     */     protected String a() {
/* 286 */       return this.c;
/*     */     }
/*     */   }
/*     */   
/*     */   enum b {
/* 291 */     a(false, false),
/* 292 */     b(true, true),
/* 293 */     c(false, true),
/* 294 */     d(true, false),
/* 295 */     e(true, true);
/*     */     
/*     */     private final boolean f;
/*     */     
/*     */     private final boolean g;
/*     */     
/*     */     b(boolean ☃, boolean bool1) {
/* 302 */       this.f = ☃;
/* 303 */       this.g = bool1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\px.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */