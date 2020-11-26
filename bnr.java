/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortArrayList;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*     */ import java.util.BitSet;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bnr
/*     */   implements bmx
/*     */ {
/*  40 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final axm b;
/*     */   private boolean c;
/*  44 */   private final AtomicInteger d = new AtomicInteger();
/*     */   
/*     */   private ayu[] e;
/*     */   
/*  48 */   private final Map<bor.a, bor> f = Maps.newEnumMap(bor.a.class);
/*     */   
/*  50 */   private volatile bnd g = bnd.a;
/*  51 */   private final Map<el, bji> h = Maps.newHashMap();
/*  52 */   private final Map<el, gy> i = Maps.newHashMap();
/*  53 */   private final bnk[] j = new bnk[16];
/*  54 */   private final List<gy> k = Lists.newArrayList();
/*     */   
/*  56 */   private final List<el> l = Lists.newArrayList();
/*  57 */   private final ShortList[] m = new ShortList[16];
/*     */   
/*  59 */   private final Map<String, bxc> n = Maps.newHashMap();
/*  60 */   private final Map<String, LongSet> o = Maps.newHashMap();
/*     */   
/*     */   private final bnt p;
/*     */   
/*     */   private final bns<bcs> q;
/*     */   private final bns<byv> r;
/*     */   private long s;
/*  67 */   private final Map<boq.a, BitSet> t = Maps.newHashMap();
/*     */   
/*     */   private boolean u;
/*     */   
/*     */   public bnr(int ☃, int i, bnt bnt1) {
/*  72 */     this(new axm(☃, i), bnt1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bnr(axm ☃, bnt bnt1) {
/*  80 */     this.b = ☃;
/*  81 */     this.p = bnt1;
/*  82 */     this.q = new bns<>(☃ -> (☃ == null || ☃.p().f()), fc.g::b, fc.g::a, ☃);
/*  83 */     this.r = new bns<>(☃ -> (☃ == null || ☃ == byy.a), fc.h::b, fc.h::a, ☃);
/*     */   }
/*     */   
/*     */   public static ShortList a(ShortList[] ☃, int i) {
/*  87 */     if (☃[i] == null) {
/*  88 */       ☃[i] = (ShortList)new ShortArrayList();
/*     */     }
/*  90 */     return ☃[i];
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a_(el ☃) {
/*  96 */     int i = ☃.o();
/*  97 */     int j = ☃.p();
/*  98 */     int k = ☃.q();
/*     */     
/* 100 */     if (j < 0 || j >= 256) {
/* 101 */       return bct.jH.p();
/*     */     }
/*     */     
/* 104 */     if (this.j[j >> 4] == bnj.a) {
/* 105 */       return bct.a.p();
/*     */     }
/*     */     
/* 108 */     return this.j[j >> 4].a(i & 0xF, j & 0xF, k & 0xF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byw b(el ☃) {
/* 113 */     int i = ☃.o();
/* 114 */     int j = ☃.p();
/* 115 */     int k = ☃.q();
/*     */     
/* 117 */     if (j < 0 || j >= 256 || this.j[j >> 4] == bnj.a) {
/* 118 */       return byy.a.i();
/*     */     }
/*     */     
/* 121 */     return this.j[j >> 4].b(i & 0xF, j & 0xF, k & 0xF);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<el> j() {
/* 126 */     return this.l;
/*     */   }
/*     */   
/*     */   public ShortList[] p() {
/* 130 */     ShortList[] ☃ = new ShortList[16];
/* 131 */     for (el el : this.l) {
/* 132 */       a(☃, el.p() >> 4).add(i(el));
/*     */     }
/* 134 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(short ☃, int i) {
/* 138 */     h(a(☃, i, this.b));
/*     */   }
/*     */   
/*     */   public void h(el ☃) {
/* 142 */     this.l.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(el ☃, blc blc1, boolean bool) {
/* 148 */     int i = ☃.o();
/* 149 */     int j = ☃.p();
/* 150 */     int k = ☃.q();
/*     */     
/* 152 */     if (j < 0 || j >= 256) {
/* 153 */       return bct.jH.p();
/*     */     }
/*     */     
/* 156 */     if (blc1.e() > 0) {
/* 157 */       this.l.add(new el((i & 0xF) + d().d(), j, (k & 0xF) + d().e()));
/*     */     }
/*     */     
/* 160 */     if (this.j[j >> 4] == bnj.a) {
/* 161 */       if (blc1.c() == bct.a) {
/* 162 */         return blc1;
/*     */       }
/* 164 */       this.j[j >> 4] = new bnk(j >> 4 << 4, x());
/*     */     } 
/*     */     
/* 167 */     blc blc2 = this.j[j >> 4].a(i & 0xF, j & 0xF, k & 0xF);
/* 168 */     this.j[j >> 4].a(i & 0xF, j & 0xF, k & 0xF, blc1);
/*     */     
/* 170 */     if (this.u) {
/* 171 */       c(bor.a.d).a(i & 0xF, j, k & 0xF, blc1);
/* 172 */       c(bor.a.e).a(i & 0xF, j, k & 0xF, blc1);
/* 173 */       c(bor.a.f).a(i & 0xF, j, k & 0xF, blc1);
/* 174 */       c(bor.a.g).a(i & 0xF, j, k & 0xF, blc1);
/*     */     } 
/* 176 */     return blc2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(el ☃, bji bji1) {
/* 181 */     bji1.a(☃);
/* 182 */     this.h.put(☃, bji1);
/*     */   }
/*     */   
/*     */   public Set<el> q() {
/* 186 */     Set<el> ☃ = Sets.newHashSet(this.i.keySet());
/* 187 */     ☃.addAll(this.h.keySet());
/* 188 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bji f(el ☃) {
/* 194 */     return this.h.get(☃);
/*     */   }
/*     */   
/*     */   public Map<el, bji> r() {
/* 198 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/* 202 */     this.k.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aer ☃) {
/* 207 */     gy gy = new gy();
/* 208 */     ☃.d(gy);
/* 209 */     b(gy);
/*     */   }
/*     */   
/*     */   public List<gy> s() {
/* 213 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ayu[] ☃) {
/* 218 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ayu[] g() {
/* 223 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 228 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 233 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public bnd i() {
/* 238 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bnd ☃) {
/* 243 */     this.g = ☃;
/* 244 */     a(true);
/*     */   }
/*     */   
/*     */   public void c(String ☃) {
/* 248 */     a(bnd.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public bnk[] c() {
/* 253 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayi ☃, el el1, boolean bool) {
/* 258 */     int i = el1.o() & 0xF;
/* 259 */     int j = el1.p();
/* 260 */     int k = el1.q() & 0xF;
/* 261 */     int m = j >> 4;
/*     */     
/* 263 */     if (m < 0 || m > this.j.length - 1) {
/* 264 */       return 0;
/*     */     }
/*     */     
/* 267 */     bnk bnk1 = this.j[m];
/*     */     
/* 269 */     if (bnk1 == bnj.a) {
/* 270 */       if (c(el1)) {
/* 271 */         return ☃.c;
/*     */       }
/* 273 */       return 0;
/*     */     } 
/*     */ 
/*     */     
/* 277 */     if (☃ == ayi.a) {
/* 278 */       if (!bool) {
/* 279 */         return 0;
/*     */       }
/* 281 */       return bnk1.c(i, j & 0xF, k);
/* 282 */     }  if (☃ == ayi.b) {
/* 283 */       return bnk1.d(i, j & 0xF, k);
/*     */     }
/* 285 */     return ☃.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(el ☃, int i, boolean bool) {
/* 291 */     int j = ☃.o() & 0xF;
/* 292 */     int k = ☃.p();
/* 293 */     int m = ☃.q() & 0xF;
/* 294 */     int n = k >> 4;
/*     */     
/* 296 */     if (n < 0 || n > this.j.length - 1) {
/* 297 */       return 0;
/*     */     }
/*     */     
/* 300 */     bnk bnk1 = this.j[n];
/*     */     
/* 302 */     if (bnk1 == bnj.a) {
/* 303 */       if (x() && i < ayi.a.c) {
/* 304 */         return ayi.a.c - i;
/*     */       }
/* 306 */       return 0;
/*     */     } 
/*     */     
/* 309 */     int i1 = bool ? bnk1.c(j, k & 0xF, m) : 0;
/* 310 */     i1 -= i;
/* 311 */     int i2 = bnk1.d(j, k & 0xF, m);
/* 312 */     if (i2 > i1) {
/* 313 */       i1 = i2;
/*     */     }
/*     */     
/* 316 */     return i1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(el ☃) {
/* 321 */     int i = ☃.o() & 0xF;
/* 322 */     int j = ☃.p();
/* 323 */     int k = ☃.q() & 0xF;
/* 324 */     return (j >= a(bor.a.d, i, k));
/*     */   }
/*     */   
/*     */   public void a(bnk[] ☃) {
/* 328 */     if (this.j.length != ☃.length) {
/* 329 */       a.warn("Could not set level chunk sections, array length is {} instead of {}", Integer.valueOf(☃.length), Integer.valueOf(this.j.length));
/*     */       
/*     */       return;
/*     */     } 
/* 333 */     System.arraycopy(☃, 0, this.j, 0, this.j.length);
/*     */   }
/*     */   
/*     */   public Set<bor.a> t() {
/* 337 */     return this.f.keySet();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bor b(bor.a ☃) {
/* 342 */     return this.f.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bor.a ☃, long[] arrayOfLong) {
/* 347 */     c(☃).a(arrayOfLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bor.a... ☃) {
/* 352 */     for (bor.a a1 : ☃) {
/* 353 */       c(a1);
/*     */     }
/*     */   }
/*     */   
/*     */   private bor c(bor.a ☃) {
/* 358 */     return this.f.computeIfAbsent(☃, ☃ -> {
/*     */           bor bor = new bor(this, ☃);
/*     */           bor.a();
/*     */           return bor;
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(bor.a ☃, int i, int j) {
/* 367 */     bor bor = this.f.get(☃);
/* 368 */     if (bor == null) {
/* 369 */       a(new bor.a[] { ☃ });
/* 370 */       bor = this.f.get(☃);
/*     */     } 
/* 372 */     return bor.a(i & 0xF, j & 0xF) - 1;
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
/*     */   public axm d() {
/* 393 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {}
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bxc a(String ☃) {
/* 403 */     return this.n.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, bxc bxc1) {
/* 408 */     this.n.put(☃, bxc1);
/* 409 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, bxc> e() {
/* 414 */     return Collections.unmodifiableMap(this.n);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Map<String, bxc> ☃) {
/* 419 */     this.n.clear();
/* 420 */     this.n.putAll(☃);
/* 421 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public LongSet b(String ☃) {
/* 427 */     return this.o.computeIfAbsent(☃, ☃ -> new LongOpenHashSet());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, long l) {
/* 432 */     ((LongSet)this.o.computeIfAbsent(☃, ☃ -> new LongOpenHashSet())).add(l);
/* 433 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, LongSet> f() {
/* 438 */     return Collections.unmodifiableMap(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(Map<String, LongSet> ☃) {
/* 443 */     this.o.clear();
/* 444 */     this.o.putAll(☃);
/* 445 */     this.c = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ayi ☃, boolean bool, el el1, int i) {
/* 452 */     int j = el1.o() & 0xF;
/* 453 */     int k = el1.p();
/* 454 */     int m = el1.q() & 0xF;
/*     */     
/* 456 */     int n = k >> 4;
/* 457 */     if (n >= 16 || n < 0) {
/*     */       return;
/*     */     }
/*     */     
/* 461 */     if (this.j[n] == bnj.a) {
/* 462 */       if (i == ☃.c) {
/*     */         return;
/*     */       }
/* 465 */       this.j[n] = new bnk(n << 4, x());
/*     */     } 
/*     */     
/* 468 */     if (☃ == ayi.a) {
/* 469 */       if (bool) {
/* 470 */         this.j[n].a(j, k & 0xF, m, i);
/*     */       }
/* 472 */     } else if (☃ == ayi.b) {
/* 473 */       this.j[n].b(j, k & 0xF, m, i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static short i(el ☃) {
/* 478 */     int i = ☃.o();
/* 479 */     int j = ☃.p();
/* 480 */     int k = ☃.q();
/* 481 */     int m = i & 0xF;
/* 482 */     int n = j & 0xF;
/* 483 */     int i1 = k & 0xF;
/* 484 */     return (short)(m | n << 4 | i1 << 8);
/*     */   }
/*     */   
/*     */   public static el a(short ☃, int i, axm axm1) {
/* 488 */     int j = (☃ & 0xF) + (axm1.a << 4);
/* 489 */     int k = (☃ >>> 4 & 0xF) + (i << 4);
/* 490 */     int m = (☃ >>> 8 & 0xF) + (axm1.b << 4);
/* 491 */     return new el(j, k, m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(el ☃) {
/* 496 */     if (!axy.k(☃)) {
/* 497 */       a(this.m, ☃.p() >> 4).add(i(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   public ShortList[] u() {
/* 502 */     return this.m;
/*     */   }
/*     */   
/*     */   public void b(short ☃, int i) {
/* 506 */     a(this.m, i).add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bns<bcs> n() {
/* 511 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public bns<byv> o() {
/* 516 */     return this.r;
/*     */   }
/*     */   
/*     */   private boolean x() {
/* 520 */     return true;
/*     */   }
/*     */   
/*     */   public bnt v() {
/* 524 */     return this.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(long ☃) {
/* 529 */     this.s = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public long m() {
/* 534 */     return this.s;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 539 */     this.i.put(new el(☃.h("x"), ☃.h("y"), ☃.h("z")), ☃);
/*     */   }
/*     */   
/*     */   public Map<el, gy> w() {
/* 543 */     return Collections.unmodifiableMap(this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public gy g(el ☃) {
/* 548 */     return this.i.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(el ☃) {
/* 553 */     this.h.remove(☃);
/* 554 */     this.i.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public BitSet a(boq.a ☃) {
/* 559 */     return this.t.computeIfAbsent(☃, ☃ -> new BitSet(65536));
/*     */   }
/*     */   
/*     */   public void a(boq.a ☃, BitSet bitSet) {
/* 563 */     this.t.put(☃, bitSet);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 568 */     this.d.addAndGet(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ab_() {
/* 573 */     return (this.d.get() > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 578 */     this.u = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */