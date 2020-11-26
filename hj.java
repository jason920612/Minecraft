/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.PeekingIterator;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.LongStream;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ public class hj
/*     */   implements DynamicOps<ho>
/*     */ {
/*  24 */   public static final hj a = new hj();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ho a() {
/*  31 */     return new ha();
/*     */   }
/*     */ 
/*     */   
/*     */   public Type<?> a(ho ☃) {
/*  36 */     switch (☃.a()) {
/*     */       case 0:
/*  38 */         return DSL.nilType();
/*     */       case 1:
/*  40 */         return DSL.byteType();
/*     */       case 2:
/*  42 */         return DSL.shortType();
/*     */       case 3:
/*  44 */         return DSL.intType();
/*     */       case 4:
/*  46 */         return DSL.longType();
/*     */       case 5:
/*  48 */         return DSL.floatType();
/*     */       case 6:
/*  50 */         return DSL.doubleType();
/*     */       case 7:
/*  52 */         return (Type<?>)DSL.list(DSL.byteType());
/*     */       case 8:
/*  54 */         return DSL.string();
/*     */       case 9:
/*  56 */         return (Type<?>)DSL.list(DSL.remainderType());
/*     */       case 10:
/*  58 */         return (Type<?>)DSL.compoundList(DSL.remainderType(), DSL.remainderType());
/*     */       case 11:
/*  60 */         return (Type<?>)DSL.list(DSL.intType());
/*     */       case 12:
/*  62 */         return (Type<?>)DSL.list(DSL.longType());
/*     */     } 
/*  64 */     return DSL.remainderType();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<Number> b(ho ☃) {
/*  70 */     if (☃ instanceof hl) {
/*  71 */       return Optional.of(((hl)☃).j());
/*     */     }
/*  73 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(Number ☃) {
/*  78 */     return new gz(☃.doubleValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(byte ☃) {
/*  83 */     return new gw(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(short ☃) {
/*  88 */     return new hm(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(int ☃) {
/*  93 */     return new hd(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(long ☃) {
/*  98 */     return new hg(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(float ☃) {
/* 103 */     return new hb(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(double ☃) {
/* 108 */     return new gz(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<String> c(ho ☃) {
/* 113 */     if (☃ instanceof hn) {
/* 114 */       return Optional.of(☃.b_());
/*     */     }
/* 116 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(String ☃) {
/* 121 */     return new hn(☃);
/*     */   }
/*     */   
/*     */   public ho a(ho ☃, ho ho1) {
/*     */     gx<ho> gx;
/* 126 */     if (ho1 instanceof ha) {
/* 127 */       return ☃;
/*     */     }
/*     */     
/* 130 */     if (☃ instanceof gy) {
/* 131 */       if (ho1 instanceof gy) {
/* 132 */         gy gy1 = new gy();
/* 133 */         gy gy2 = (gy)☃;
/* 134 */         for (String str : gy2.c()) {
/* 135 */           gy1.a(str, gy2.c(str));
/*     */         }
/* 137 */         gy gy3 = (gy)ho1;
/* 138 */         for (String str : gy3.c()) {
/* 139 */           gy1.a(str, gy3.c(str));
/*     */         }
/* 141 */         return gy1;
/*     */       } 
/* 143 */       return ☃;
/* 144 */     }  if (☃ instanceof ha)
/* 145 */       throw new IllegalArgumentException("mergeInto called with a null input."); 
/* 146 */     if (☃ instanceof gx) {
/* 147 */       gx = new he();
/* 148 */       gx<?> gx1 = (gx)☃;
/* 149 */       gx.addAll(gx1);
/*     */     } else {
/* 151 */       return ☃;
/*     */     } 
/* 153 */     gx.add(ho1);
/* 154 */     return gx;
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ho ☃, ho ho1, ho ho2) {
/*     */     gy gy;
/* 160 */     if (☃ instanceof ha) {
/* 161 */       gy = new gy();
/* 162 */     } else if (☃ instanceof gy) {
/* 163 */       gy gy1 = (gy)☃;
/* 164 */       gy = new gy();
/* 165 */       gy1.c().forEach(str -> ☃.a(str, gy1.c(str)));
/*     */     } else {
/* 167 */       return ☃;
/*     */     } 
/* 169 */     gy.a(ho1.b_(), ho2);
/* 170 */     return gy;
/*     */   }
/*     */ 
/*     */   
/*     */   public ho b(ho ☃, ho ho1) {
/* 175 */     if (☃ instanceof ha) {
/* 176 */       return ho1;
/*     */     }
/* 178 */     if (ho1 instanceof ha) {
/* 179 */       return ☃;
/*     */     }
/* 181 */     if (☃ instanceof gy && ho1 instanceof gy) {
/* 182 */       gy gy1 = (gy)☃;
/* 183 */       gy gy2 = (gy)ho1;
/* 184 */       gy gy3 = new gy();
/* 185 */       gy1.c().forEach(str -> ☃.a(str, gy1.c(str)));
/* 186 */       gy2.c().forEach(str -> ☃.a(str, gy1.c(str)));
/*     */     } 
/* 188 */     if (☃ instanceof gx && ho1 instanceof gx) {
/*     */       
/* 190 */       he he = new he();
/* 191 */       he.addAll((gx)☃);
/* 192 */       he.addAll((gx)ho1);
/* 193 */       return he;
/*     */     } 
/* 195 */     throw new IllegalArgumentException("Could not merge " + ☃ + " and " + ho1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<Map<ho, ho>> d(ho ☃) {
/* 200 */     if (☃ instanceof gy) {
/* 201 */       gy gy = (gy)☃;
/* 202 */       return Optional.of((Map<ho, ho>)gy.c().stream().map(str -> Pair.of(a(str), ☃.c(str))).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     } 
/* 204 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(Map<ho, ho> ☃) {
/* 209 */     gy gy = new gy();
/* 210 */     for (Map.Entry<ho, ho> entry : ☃.entrySet()) {
/* 211 */       gy.a(((ho)entry.getKey()).b_(), entry.getValue());
/*     */     }
/* 213 */     return gy;
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<Stream<ho>> e(ho ☃) {
/* 218 */     if (☃ instanceof gx) {
/* 219 */       return Optional.of(((gx)☃).stream().map(☃ -> ☃));
/*     */     }
/* 221 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<ByteBuffer> f(ho ☃) {
/* 226 */     if (☃ instanceof gv) {
/* 227 */       return Optional.of(ByteBuffer.wrap(((gv)☃).c()));
/*     */     }
/* 229 */     return super.getByteBuffer(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ByteBuffer ☃) {
/* 234 */     return new gv(DataFixUtils.toArray(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<IntStream> g(ho ☃) {
/* 239 */     if (☃ instanceof hc) {
/* 240 */       return Optional.of(Arrays.stream(((hc)☃).d()));
/*     */     }
/* 242 */     return super.getIntStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(IntStream ☃) {
/* 247 */     return new hc(☃.toArray());
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<LongStream> h(ho ☃) {
/* 252 */     if (☃ instanceof hf) {
/* 253 */       return Optional.of(Arrays.stream(((hf)☃).d()));
/*     */     }
/* 255 */     return super.getLongStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(LongStream ☃) {
/* 260 */     return new hf(☃.toArray());
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(Stream<ho> ☃) {
/* 265 */     PeekingIterator<ho> peekingIterator = Iterators.peekingIterator(☃.iterator());
/* 266 */     if (!peekingIterator.hasNext()) {
/* 267 */       return new he();
/*     */     }
/* 269 */     ho ho = (ho)peekingIterator.peek();
/* 270 */     if (ho instanceof gw) {
/* 271 */       ArrayList<Byte> arrayList = Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, ☃ -> Byte.valueOf(((gw)☃).g())));
/* 272 */       return new gv(arrayList);
/*     */     } 
/* 274 */     if (ho instanceof hd) {
/* 275 */       ArrayList<Integer> arrayList = Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, ☃ -> Integer.valueOf(((hd)☃).e())));
/* 276 */       return new hc(arrayList);
/*     */     } 
/* 278 */     if (ho instanceof hg) {
/* 279 */       ArrayList<Long> arrayList = Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, ☃ -> Long.valueOf(((hg)☃).d())));
/* 280 */       return new hf(arrayList);
/*     */     } 
/* 282 */     he he = new he();
/* 283 */     while (peekingIterator.hasNext()) {
/* 284 */       ho ho1 = (ho)peekingIterator.next();
/* 285 */       if (ho1 instanceof ha) {
/*     */         continue;
/*     */       }
/* 288 */       he.a(ho1);
/*     */     } 
/* 290 */     return he;
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(ho ☃, String str) {
/* 295 */     if (☃ instanceof gy) {
/* 296 */       gy gy1 = (gy)☃;
/* 297 */       gy gy2 = new gy();
/* 298 */       gy1.c().stream().filter(str1 -> !Objects.equals(str1, ☃)).forEach(str -> ☃.a(str, gy1.c(str)));
/* 299 */       return gy2;
/*     */     } 
/* 301 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 306 */     return "NBT";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */