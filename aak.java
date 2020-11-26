/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.List;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntIterator;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.LongStream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aak
/*     */   extends DataFix
/*     */ {
/*  45 */   private static final int[][] a = new int[][] { { -1, 0, 0 }, { 1, 0, 0 }, { 0, -1, 0 }, { 0, 1, 0 }, { 0, 0, -1 }, { 0, 0, 1 } };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Object2IntMap<String> b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  58 */     b = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:acacia_leaves", 0);
/*     */           ☃.put("minecraft:birch_leaves", 1);
/*     */           ☃.put("minecraft:dark_oak_leaves", 2);
/*     */           ☃.put("minecraft:jungle_leaves", 3);
/*     */           ☃.put("minecraft:oak_leaves", 4);
/*     */           ☃.put("minecraft:spruce_leaves", 5);
/*     */         });
/*     */   }
/*  67 */   private static final Set<String> c = (Set<String>)ImmutableSet.of("minecraft:acacia_bark", "minecraft:birch_bark", "minecraft:dark_oak_bark", "minecraft:jungle_bark", "minecraft:oak_bark", "minecraft:spruce_bark", (Object[])new String[] { "minecraft:acacia_log", "minecraft:birch_log", "minecraft:dark_oak_log", "minecraft:jungle_log", "minecraft:oak_log", "minecraft:spruce_log", "minecraft:stripped_acacia_log", "minecraft:stripped_birch_log", "minecraft:stripped_dark_oak_log", "minecraft:stripped_jungle_log", "minecraft:stripped_oak_log", "minecraft:stripped_spruce_log" });
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
/*     */   public aak(Schema ☃, boolean bool) {
/*  89 */     super(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/*  94 */     Type<?> ☃ = getInputSchema().getType(aax.c);
/*     */     
/*  96 */     OpticFinder<?> opticFinder1 = ☃.findField("Level");
/*  97 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Sections");
/*  98 */     Type<?> type1 = opticFinder2.type();
/*  99 */     if (!(type1 instanceof List.ListType)) {
/* 100 */       throw new IllegalStateException("Expecting sections to be a list.");
/*     */     }
/* 102 */     Type<?> type2 = ((List.ListType)type1).getElement();
/* 103 */     OpticFinder<?> opticFinder3 = DSL.typeFinder(type2);
/*     */     
/* 105 */     return fixTypeEverywhereTyped("Leaves fix", ☃, typed -> typed.updateTyped(☃, ()));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class b
/*     */   {
/* 193 */     final Type<Pair<String, Dynamic<?>>> a = DSL.named(aax.l.typeName(), DSL.remainderType());
/* 194 */     protected final OpticFinder<List<Pair<String, Dynamic<?>>>> b = DSL.fieldFinder("Palette", (Type)DSL.list(this.a));
/*     */     
/*     */     protected final List<Dynamic<?>> c;
/*     */     protected final int d;
/*     */     @Nullable
/*     */     protected xd e;
/*     */     
/*     */     public b(Typed<?> ☃, Schema schema) {
/* 202 */       if (!Objects.equals(schema.getType(aax.l), this.a)) {
/* 203 */         throw new IllegalStateException("Block state type is not what was expected.");
/*     */       }
/*     */       
/* 206 */       Optional<List<Pair<String, Dynamic<?>>>> optional = ☃.getOptional(this.b);
/*     */       
/* 208 */       this.c = (List<Dynamic<?>>)optional.map(☃ -> (List)☃.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
/*     */       
/* 210 */       Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 211 */       this.d = dynamic.getInt("Y");
/*     */       
/* 213 */       a(dynamic);
/*     */     }
/*     */     
/*     */     protected void a(Dynamic<?> ☃) {
/* 217 */       if (a()) {
/* 218 */         this.e = null;
/*     */       } else {
/* 220 */         long[] arrayOfLong = ((LongStream)☃.get("BlockStates").flatMap(Dynamic::getLongStream).get()).toArray();
/* 221 */         int i = Math.max(4, DataFixUtils.ceillog2(this.c.size()));
/* 222 */         this.e = new xd(i, 4096, arrayOfLong);
/*     */       } 
/*     */     }
/*     */     
/*     */     public Typed<?> a(Typed<?> ☃) {
/* 227 */       if (b()) {
/* 228 */         return ☃;
/*     */       }
/* 230 */       return ☃
/* 231 */         .update(DSL.remainderFinder(), ☃ -> ☃.set("BlockStates", ☃.createLongList(Arrays.stream(this.e.a()))))
/* 232 */         .set(this.b, this.c.stream().map(☃ -> Pair.of(aax.l.typeName(), ☃)).collect(Collectors.toList()));
/*     */     }
/*     */     
/*     */     public boolean b() {
/* 236 */       return (this.e == null);
/*     */     }
/*     */     
/*     */     public int c(int ☃) {
/* 240 */       return this.e.a(☃);
/*     */     }
/*     */     
/*     */     protected int a(String ☃, boolean bool, int i) {
/* 244 */       return aak.a().get(☃).intValue() << 5 | (bool ? 16 : 0) | i;
/*     */     }
/*     */     
/*     */     int c() {
/* 248 */       return this.d;
/*     */     }
/*     */     
/*     */     protected abstract boolean a();
/*     */   }
/*     */   
/*     */   public static final class a
/*     */     extends b
/*     */   {
/*     */     @Nullable
/*     */     private IntSet f;
/*     */     @Nullable
/*     */     private IntSet g;
/*     */     @Nullable
/*     */     private Int2IntMap h;
/*     */     
/*     */     public a(Typed<?> ☃, Schema schema) {
/* 265 */       super(☃, schema);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a() {
/* 270 */       this.f = (IntSet)new IntOpenHashSet();
/* 271 */       this.g = (IntSet)new IntOpenHashSet();
/* 272 */       this.h = (Int2IntMap)new Int2IntOpenHashMap();
/*     */       
/* 274 */       for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/* 275 */         Dynamic<?> dynamic = this.c.get(☃);
/* 276 */         String str = dynamic.getString("Name");
/* 277 */         if (aak.a().containsKey(str)) {
/* 278 */           boolean bool = Objects.equals(dynamic.get("Properties").flatMap(☃ -> ☃.get("decayable")).flatMap(Dynamic::getStringValue).orElse(""), "false");
/* 279 */           this.f.add(☃);
/* 280 */           this.h.put(a(str, bool, 7), ☃);
/* 281 */           this.c.set(☃, a(dynamic, str, bool, 7));
/*     */         } 
/* 283 */         if (aak.b().contains(str)) {
/* 284 */           this.g.add(☃);
/*     */         }
/*     */       } 
/*     */       
/* 288 */       return (this.f.isEmpty() && this.g.isEmpty());
/*     */     }
/*     */     
/*     */     private Dynamic<?> a(Dynamic<?> ☃, String str, boolean bool, int i) {
/* 292 */       Dynamic<?> dynamic1 = ☃.emptyMap();
/* 293 */       dynamic1 = dynamic1.set("persistent", dynamic1.createString(bool ? "true" : "false"));
/* 294 */       dynamic1 = dynamic1.set("distance", dynamic1.createString(Integer.toString(i)));
/*     */       
/* 296 */       Dynamic<?> dynamic2 = ☃.emptyMap();
/* 297 */       dynamic2 = dynamic2.set("Properties", dynamic1);
/* 298 */       dynamic2 = dynamic2.set("Name", dynamic2.createString(str));
/* 299 */       return dynamic2;
/*     */     }
/*     */     
/*     */     public boolean a(int ☃) {
/* 303 */       return this.g.contains(☃);
/*     */     }
/*     */     
/*     */     public boolean b(int ☃) {
/* 307 */       return this.f.contains(☃);
/*     */     }
/*     */     
/*     */     private int d(int ☃) {
/* 311 */       if (a(☃)) {
/* 312 */         return 0;
/*     */       }
/* 314 */       return Integer.parseInt(((Dynamic)this.c.get(☃)).get("Properties").flatMap(☃ -> ☃.get("distance")).flatMap(Dynamic::getStringValue).orElse(""));
/*     */     }
/*     */     
/*     */     private void a(int ☃, int i, int j) {
/* 318 */       Dynamic<?> dynamic = this.c.get(i);
/* 319 */       String str = dynamic.getString("Name");
/* 320 */       boolean bool = Objects.equals(dynamic.get("Properties").flatMap(☃ -> ☃.get("persistent")).flatMap(Dynamic::getStringValue).orElse(""), "true");
/* 321 */       int k = a(str, bool, j);
/*     */       
/* 323 */       if (!this.h.containsKey(k)) {
/* 324 */         int n = this.c.size();
/* 325 */         this.f.add(n);
/* 326 */         this.h.put(k, n);
/* 327 */         this.c.add(a(dynamic, str, bool, j));
/*     */       } 
/*     */       
/* 330 */       int m = this.h.get(k);
/* 331 */       if (1 << this.e.c() <= m) {
/* 332 */         xd xd = new xd(this.e.c() + 1, 4096);
/* 333 */         for (int n = 0; n < 4096; n++) {
/* 334 */           xd.a(n, this.e.a(n));
/*     */         }
/* 336 */         this.e = xd;
/*     */       } 
/* 338 */       this.e.a(☃, m);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a(int ☃, int i, int j) {
/* 344 */     return i << 8 | j << 4 | ☃;
/*     */   }
/*     */   
/*     */   private int a(int ☃) {
/* 348 */     return ☃ & 0xF;
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 352 */     return ☃ >> 8 & 0xFF;
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/* 356 */     return ☃ >> 4 & 0xF;
/*     */   }
/*     */   
/*     */   public static int a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 360 */     int i = 0;
/* 361 */     if (bool2) {
/* 362 */       if (bool1) {
/* 363 */         i |= 0x2;
/* 364 */       } else if (☃) {
/* 365 */         i |= 0x80;
/*     */       } else {
/* 367 */         i |= 0x1;
/*     */       } 
/* 369 */     } else if (bool3) {
/* 370 */       if (☃) {
/* 371 */         i |= 0x20;
/* 372 */       } else if (bool1) {
/* 373 */         i |= 0x8;
/*     */       } else {
/* 375 */         i |= 0x10;
/*     */       } 
/* 377 */     } else if (bool1) {
/* 378 */       i |= 0x4;
/* 379 */     } else if (☃) {
/* 380 */       i |= 0x40;
/*     */     } 
/* 382 */     return i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */