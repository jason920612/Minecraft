/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dt
/*     */ {
/*  47 */   private static final Map<String, b> i = Maps.newHashMap(); public static final DynamicCommandExceptionType a; public static final DynamicCommandExceptionType b;
/*     */   static {
/*  49 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.options.unknown", new Object[] { ☃ }));
/*  50 */     b = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.options.inapplicable", new Object[] { ☃ }));
/*  51 */   } public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("argument.entity.options.distance.negative", new Object[0]));
/*  52 */   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("argument.entity.options.level.negative", new Object[0]));
/*  53 */   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new ir("argument.entity.options.limit.toosmall", new Object[0])); public static final DynamicCommandExceptionType f; public static final DynamicCommandExceptionType g; public static final DynamicCommandExceptionType h; static {
/*  54 */     f = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.options.sort.irreversible", new Object[] { ☃ }));
/*  55 */     g = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.options.mode.invalid", new Object[] { ☃ }));
/*  56 */     h = new DynamicCommandExceptionType(☃ -> new ir("argument.entity.options.type.invalid", new Object[] { ☃ }));
/*     */   }
/*     */   private static void a(String ☃, a a1, Predicate<ds> predicate, ij ij1) {
/*  59 */     i.put(☃, new b(a1, predicate, ij1));
/*     */   }
/*     */   
/*     */   public static void a() {
/*  63 */     if (!i.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     a("name", ☃ -> { int i = ☃.f().getCursor(); boolean bool = ☃.e(); String str = ☃.f().readString(); if (☃.v() && !bool) { ☃.f().setCursor(i); throw b.createWithContext(☃.f(), "name"); }  if (bool) { ☃.d(true); } else { ☃.c(true); }  ☃.a(()); }☃ -> !☃.u(), new ir("argument.entity.options.name.description", new Object[0]));
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
/*  83 */     a("distance", ☃ -> { int i = ☃.f().getCursor(); ba.c c = ba.c.a(☃.f()); if ((c.a() != null && c.a().floatValue() < 0.0F) || (c.b() != null && c.b().floatValue() < 0.0F)) { ☃.f().setCursor(i); throw c.createWithContext(☃.f()); }  ☃.a(c); ☃.g(); }☃ -> ☃.h().c(), new ir("argument.entity.options.distance.description", new Object[0]));
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
/*  94 */     a("level", ☃ -> { int i = ☃.f().getCursor(); ba.d d = ba.d.a(☃.f()); if ((d.a() != null && d.a().intValue() < 0) || (d.b() != null && d.b().intValue() < 0)) { ☃.f().setCursor(i); throw d.createWithContext(☃.f()); }  ☃.a(d); ☃.a(false); }☃ -> ☃.i().c(), new ir("argument.entity.options.level.description", new Object[0]));
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
/* 105 */     a("x", ☃ -> { ☃.g(); ☃.a(☃.f().readDouble()); }☃ -> (☃.l() == null), new ir("argument.entity.options.x.description", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     a("y", ☃ -> { ☃.g(); ☃.b(☃.f().readDouble()); }☃ -> (☃.m() == null), new ir("argument.entity.options.y.description", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     a("z", ☃ -> { ☃.g(); ☃.c(☃.f().readDouble()); }☃ -> (☃.n() == null), new ir("argument.entity.options.z.description", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     a("dx", ☃ -> { ☃.g(); ☃.d(☃.f().readDouble()); }☃ -> (☃.o() == null), new ir("argument.entity.options.dx.description", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     a("dy", ☃ -> { ☃.g(); ☃.e(☃.f().readDouble()); }☃ -> (☃.p() == null), new ir("argument.entity.options.dy.description", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     a("dz", ☃ -> { ☃.g(); ☃.f(☃.f().readDouble()); }☃ -> (☃.q() == null), new ir("argument.entity.options.dz.description", new Object[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     a("x_rotation", ☃ -> ☃.a(bn.a(☃.f(), true, xq::g)), ☃ -> (☃.j() == bn.a), new ir("argument.entity.options.x_rotation.description", new Object[0]));
/*     */ 
/*     */ 
/*     */     
/* 139 */     a("y_rotation", ☃ -> ☃.b(bn.a(☃.f(), true, xq::g)), ☃ -> (☃.k() == bn.a), new ir("argument.entity.options.y_rotation.description", new Object[0]));
/*     */ 
/*     */ 
/*     */     
/* 143 */     a("limit", ☃ -> {
/*     */           int i = ☃.f().getCursor();
/*     */           int j = ☃.f().readInt();
/*     */           if (j < 1) {
/*     */             ☃.f().setCursor(i);
/*     */             throw e.createWithContext(☃.f());
/*     */           } 
/*     */           ☃.a(j);
/*     */           ☃.e(true);
/* 152 */         }☃ -> (!☃.t() && !☃.w()), new ir("argument.entity.options.limit.description", new Object[0]));
/*     */     
/* 154 */     a("sort", ☃ -> {
/*     */           BiConsumer<cee, List<? extends aer>> biConsumer;
/*     */           int i = ☃.f().getCursor();
/*     */           String str = ☃.f().readUnquotedString();
/*     */           ☃.a(());
/*     */           switch (str) {
/*     */             case "nearest":
/*     */               biConsumer = ds.h;
/*     */               break;
/*     */             case "furthest":
/*     */               biConsumer = ds.i;
/*     */               break;
/*     */             case "random":
/*     */               biConsumer = ds.j;
/*     */               break;
/*     */             case "arbitrary":
/*     */               biConsumer = ds.g;
/*     */               break;
/*     */             default:
/*     */               ☃.f().setCursor(i);
/*     */               throw f.createWithContext(☃.f(), str);
/*     */           } 
/*     */           ☃.a(biConsumer);
/*     */           ☃.f(true);
/* 178 */         }☃ -> (!☃.t() && !☃.x()), new ir("argument.entity.options.sort.description", new Object[0]));
/*     */     
/* 180 */     a("gamemode", ☃ -> { ☃.a(()); int i = ☃.f().getCursor(); boolean bool = ☃.e(); if (☃.z() && !bool) { ☃.f().setCursor(i); throw b.createWithContext(☃.f(), "gamemode"); }  String str = ☃.f().readUnquotedString(); axv axv = axv.a(str, axv.a); if (axv == axv.a) { ☃.f().setCursor(i); throw g.createWithContext(☃.f(), str); }  ☃.a(false); ☃.a(()); if (bool) { ☃.h(true); } else { ☃.g(true); }  }☃ -> !☃.y(), new ir("argument.entity.options.gamemode.description", new Object[0]));
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
/* 236 */     a("team", ☃ -> { boolean bool = ☃.e(); String str = ☃.f().readUnquotedString(); ☃.a(()); if (bool) { ☃.j(true); } else { ☃.i(true); }  }☃ -> !☃.A(), new ir("argument.entity.options.team.description", new Object[0]));
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
/* 255 */     a("type", ☃ -> { ☃.a(()); int i = ☃.f().getCursor(); boolean bool = ☃.e(); if (☃.F() && !bool) { ☃.f().setCursor(i); throw b.createWithContext(☃.f(), "type"); }  pc pc = pc.a(☃.f()); aev<? extends aer> aev = (aev<? extends aer>)fc.r.b(pc); if (aev == null) { ☃.f().setCursor(i); throw h.createWithContext(☃.f(), pc.toString()); }  if (Objects.equals(aev.aO, aev) && !bool) ☃.a(false);  ☃.a(()); if (bool) { ☃.C(); } else { ☃.a(aev.c()); }  }☃ -> !☃.E(), new ir("argument.entity.options.type.description", new Object[0]));
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
/* 288 */     a("tag", ☃ -> { boolean bool = ☃.e(); String str = ☃.f().readUnquotedString(); ☃.a(()); }☃ -> true, new ir("argument.entity.options.tag.description", new Object[0]));
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
/* 301 */     a("nbt", ☃ -> { boolean bool = ☃.e(); gy gy = (new hp(☃.f())).f(); ☃.a(()); }☃ -> true, new ir("argument.entity.options.nbt.description", new Object[0]));
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
/* 317 */     a("scores", ☃ -> { StringReader stringReader = ☃.f(); Map<String, ba.d> map = Maps.newHashMap(); stringReader.expect('{'); stringReader.skipWhitespace(); while (stringReader.canRead() && stringReader.peek() != '}') { stringReader.skipWhitespace(); String str = stringReader.readUnquotedString(); stringReader.skipWhitespace(); stringReader.expect('='); stringReader.skipWhitespace(); ba.d d = ba.d.a(stringReader); map.put(str, d); stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == ',') stringReader.skip();  }  stringReader.expect('}'); if (!map.isEmpty()) ☃.a(());  ☃.k(true); }☃ -> !☃.G(), new ir("argument.entity.options.scores.description", new Object[0]));
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
/*     */ 
/*     */ 
/*     */     
/* 363 */     a("advancements", ☃ -> { StringReader stringReader = ☃.f(); Map<pc, Predicate<n>> map = Maps.newHashMap(); stringReader.expect('{'); stringReader.skipWhitespace(); while (stringReader.canRead() && stringReader.peek() != '}') { stringReader.skipWhitespace(); pc pc = pc.a(stringReader); stringReader.skipWhitespace(); stringReader.expect('='); stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == '{') { Map<String, Predicate<r>> map1 = Maps.newHashMap(); stringReader.skipWhitespace(); stringReader.expect('{'); stringReader.skipWhitespace(); while (stringReader.canRead() && stringReader.peek() != '}') { stringReader.skipWhitespace(); String str = stringReader.readUnquotedString(); stringReader.skipWhitespace(); stringReader.expect('='); stringReader.skipWhitespace(); boolean bool = stringReader.readBoolean(); map1.put(str, ()); stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == ',') stringReader.skip();  }  stringReader.skipWhitespace(); stringReader.expect('}'); stringReader.skipWhitespace(); map.put(pc, ()); } else { boolean bool = stringReader.readBoolean(); map.put(pc, ()); }  stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == ',') stringReader.skip();  }  stringReader.expect('}'); if (!map.isEmpty()) { ☃.a(()); ☃.a(false); }  ☃.l(true); }☃ -> !☃.H(), new ir("argument.entity.options.advancements.description", new Object[0]));
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a(ds ☃, String str, int i) throws CommandSyntaxException {
/* 445 */     b b = i.get(str);
/* 446 */     if (b != null) {
/* 447 */       if (b.b.test(☃)) {
/* 448 */         return b.a;
/*     */       }
/* 450 */       throw b.createWithContext(☃.f(), str);
/*     */     } 
/*     */     
/* 453 */     ☃.f().setCursor(i);
/* 454 */     throw a.createWithContext(☃.f(), str);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(ds ☃, SuggestionsBuilder suggestionsBuilder) {
/* 459 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 460 */     for (Map.Entry<String, b> entry : i.entrySet()) {
/* 461 */       if (((b)entry.getValue()).b.test(☃) && ((String)entry.getKey()).toLowerCase(Locale.ROOT).startsWith(str)) {
/* 462 */         suggestionsBuilder.suggest((String)entry.getKey() + '=', ((b)entry.getValue()).c);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static class b
/*     */   {
/*     */     public final dt.a a;
/*     */     
/*     */     public final Predicate<ds> b;
/*     */     
/*     */     public final ij c;
/*     */     
/*     */     private b(dt.a ☃, Predicate<ds> predicate, ij ij1) {
/* 477 */       this.a = ☃;
/* 478 */       this.b = predicate;
/* 479 */       this.c = ij1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void handle(ds param1ds) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\dt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */