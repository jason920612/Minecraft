/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface ayc
/*     */   extends axk
/*     */ {
/*     */   default boolean z(el ☃) {
/*  39 */     if (☃.p() >= k()) {
/*  40 */       return e(☃);
/*     */     }
/*  42 */     el el1 = new el(☃.o(), k(), ☃.q());
/*  43 */     if (!e(el1)) {
/*  44 */       return false;
/*     */     }
/*  46 */     el1 = el1.b();
/*  47 */     while (el1.p() > ☃.p()) {
/*  48 */       blc blc = a_(el1);
/*  49 */       if (blc.b(this, el1) > 0 && !blc.d().a()) {
/*  50 */         return false;
/*     */       }
/*  52 */       el1 = el1.b();
/*     */     } 
/*  54 */     return true;
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
/*     */   default el a(bor.a ☃, el el1) {
/*  66 */     return new el(el1.o(), a(☃, el1.o(), el1.q()), el1.q());
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
/*     */   default float A(el ☃) {
/*  80 */     return o().i()[C(☃)];
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default aog a(aer ☃, double d) {
/*  85 */     return a(☃.q, ☃.r, ☃.s, d, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default aog b(aer ☃, double d) {
/*  90 */     return a(☃.q, ☃.r, ☃.s, d, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default aog a(double ☃, double d1, double d2, double d3, boolean bool) {
/*  95 */     Predicate<aer> predicate = bool ? aeu.e : aeu.f;
/*  96 */     return a(☃, d1, d2, d3, predicate);
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
/*     */   default boolean a(blc ☃, el el1) {
/* 115 */     cew cew = ☃.h(this, el1);
/* 116 */     return (cew.b() || a((aer)null, cew.a(el1.o(), el1.p(), el1.q())));
/*     */   }
/*     */   
/*     */   default boolean a_(@Nullable aer ☃, cea cea1) {
/* 120 */     return a(☃, cet.a(cea1));
/*     */   }
/*     */ 
/*     */   
/*     */   default Stream<cew> a(cew ☃, cew cew1, boolean bool) {
/* 125 */     int i = xq.c(☃.b(eq.a.a)) - 1;
/* 126 */     int j = xq.f(☃.c(eq.a.a)) + 1;
/* 127 */     int k = xq.c(☃.b(eq.a.b)) - 1;
/* 128 */     int m = xq.f(☃.c(eq.a.b)) + 1;
/* 129 */     int n = xq.c(☃.b(eq.a.c)) - 1;
/* 130 */     int i1 = xq.f(☃.c(eq.a.c)) + 1;
/*     */     
/* 132 */     bmv bmv = d();
/*     */ 
/*     */ 
/*     */     
/* 136 */     boolean bool1 = (bmv.b() < i && j < bmv.d() && bmv.c() < n && i1 < bmv.e());
/*     */     
/* 138 */     cem cem = new ceh(j - i, m - k, i1 - n);
/*     */     
/* 140 */     Predicate<cew> predicate = cew1 -> (!cew1.b() && cet.c(☃, cew1, cei.AND));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 173 */     Stream<cew> stream = StreamSupport.stream(el.a.b(i, k, n, j - 1, m - 1, i1 - 1).spliterator(), false).map(a1 -> { cew cew2; int i1 = a1.o(); int i2 = a1.p(); int i3 = a1.q(); boolean bool3 = (i1 == ☃ || i1 == i - 1); boolean bool4 = (i2 == j || i2 == k - 1); boolean bool5 = (i3 == m || i3 == n - 1); if ((bool3 && bool4) || (bool4 && bool5) || (bool5 && bool3) || !D(a1)) return cet.a();  if (!bool1 || bool2 || bmv1.a(a1)) { cew2 = a_(a1).h(this, a1); } else { cew2 = cet.b(); }  cew cew3 = cew1.a(-i1, -i2, -i3); if (cet.c(cew3, cew2, cei.AND)) return cet.a();  if (cew2 == cet.b()) { cem1.a(i1 - ☃, i2 - j, i3 - m, true, true); return cet.a(); }  return cew2.a(i1, i2, i3); }).filter(predicate);
/*     */ 
/*     */ 
/*     */     
/* 177 */     return Stream.concat(stream, Stream.<cew>generate(() -> new cex(☃, i, j, k)).limit(1L).filter(predicate));
/*     */   }
/*     */   
/*     */   default Stream<cew> a(@Nullable aer ☃, cea cea1, double d1, double d2, double d3) {
/* 181 */     return a(☃, cea1, Collections.emptySet(), d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default Stream<cew> a(@Nullable aer ☃, cea cea1, Set<aer> set, double d1, double d2, double d3) {
/* 187 */     double d = 1.0E-7D;
/*     */     
/* 189 */     cew cew1 = cet.a(cea1);
/* 190 */     cew cew2 = cet.a(cea1.d((d1 > 0.0D) ? -1.0E-7D : 1.0E-7D, (d2 > 0.0D) ? -1.0E-7D : 1.0E-7D, (d3 > 0.0D) ? -1.0E-7D : 1.0E-7D));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     cew cew3 = cet.b(cet.a(cea1.b(d1, d2, d3).g(1.0E-7D)), cew2, cei.ONLY_FIRST);
/* 197 */     return a(☃, cew3, cew1, set);
/*     */   }
/*     */   
/*     */   default Stream<cew> b(@Nullable aer ☃, cea cea1) {
/* 201 */     return a(☃, cet.a(cea1), cet.a(), Collections.emptySet());
/*     */   }
/*     */   
/*     */   default Stream<cew> a(@Nullable aer ☃, cew cew1, cew cew2, Set<aer> set) {
/* 205 */     boolean bool1 = (☃ != null && ☃.bG());
/* 206 */     boolean bool2 = (☃ != null && i(☃));
/*     */ 
/*     */     
/* 209 */     if (☃ != null && bool1 == bool2) {
/* 210 */       ☃.n(!bool2);
/*     */     }
/*     */     
/* 213 */     return a(cew1, cew2, bool2);
/*     */   }
/*     */   
/*     */   default boolean i(aer ☃) {
/* 217 */     bmv bmv = d();
/* 218 */     double d1 = bmv.b();
/* 219 */     double d2 = bmv.c();
/* 220 */     double d3 = bmv.d();
/* 221 */     double d4 = bmv.e();
/*     */     
/* 223 */     if (☃.bG()) {
/* 224 */       d1++;
/* 225 */       d2++;
/* 226 */       d3--;
/* 227 */       d4--;
/*     */     } else {
/* 229 */       d1--;
/* 230 */       d2--;
/* 231 */       d3++;
/* 232 */       d4++;
/*     */     } 
/*     */     
/* 235 */     return (☃.q > d1 && ☃.q < d3 && ☃.s > d2 && ☃.s < d4);
/*     */   }
/*     */   
/*     */   default boolean a(@Nullable aer ☃, cea cea1, Set<aer> set) {
/* 239 */     return a(☃, cet.a(cea1), cet.a(), set).allMatch(cew::b);
/*     */   }
/*     */   
/*     */   default boolean c(@Nullable aer ☃, cea cea1) {
/* 243 */     return a(☃, cea1, Collections.emptySet());
/*     */   }
/*     */   
/*     */   default boolean B(el ☃) {
/* 247 */     return b(☃).a(ww.a);
/*     */   }
/*     */   
/*     */   default boolean c(cea ☃) {
/* 251 */     int i = xq.c(☃.a);
/* 252 */     int j = xq.f(☃.d);
/* 253 */     int k = xq.c(☃.b);
/* 254 */     int m = xq.f(☃.e);
/* 255 */     int n = xq.c(☃.c);
/* 256 */     int i1 = xq.f(☃.f);
/*     */     
/* 258 */     try (el.b ☃ = el.b.r()) {
/* 259 */       for (int i2 = i; i2 < j; i2++) {
/* 260 */         for (int i3 = k; i3 < m; i3++) {
/* 261 */           for (int i4 = n; i4 < i1; i4++) {
/* 262 */             blc blc = a_(b.f(i2, i3, i4));
/* 263 */             if (!blc.s().e()) {
/* 264 */               return true;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 270 */     return false;
/*     */   }
/*     */   
/*     */   default int C(el ☃) {
/* 274 */     return d(☃, c());
/*     */   }
/*     */   
/*     */   default int d(el ☃, int i) {
/* 278 */     if (☃.o() < -30000000 || ☃.q() < -30000000 || ☃.o() >= 30000000 || ☃.q() >= 30000000) {
/* 279 */       return 15;
/*     */     }
/*     */     
/* 282 */     if (a_(☃).c(this, ☃)) {
/* 283 */       int j = a(☃.a(), i);
/* 284 */       int k = a(☃.f(), i);
/* 285 */       int m = a(☃.e(), i);
/* 286 */       int n = a(☃.d(), i);
/* 287 */       int i1 = a(☃.c(), i);
/*     */       
/* 289 */       if (k > j) {
/* 290 */         j = k;
/*     */       }
/* 292 */       if (m > j) {
/* 293 */         j = m;
/*     */       }
/* 295 */       if (n > j) {
/* 296 */         j = n;
/*     */       }
/* 298 */       if (i1 > j) {
/* 299 */         j = i1;
/*     */       }
/* 301 */       return j;
/*     */     } 
/*     */     
/* 304 */     return a(☃, i);
/*     */   }
/*     */   
/*     */   default boolean D(el ☃) {
/* 308 */     return b(☃, true);
/*     */   }
/*     */   
/*     */   default boolean b(el ☃, boolean bool) {
/* 312 */     return a(☃.o() >> 4, ☃.q() >> 4, bool);
/*     */   }
/*     */   
/*     */   default boolean e(el ☃, int i) {
/* 316 */     return a(☃, i, true);
/*     */   }
/*     */   
/*     */   default boolean a(el ☃, int i, boolean bool) {
/* 320 */     return a(☃.o() - i, ☃.p() - i, ☃.q() - i, ☃.o() + i, ☃.p() + i, ☃.q() + i, bool);
/*     */   }
/*     */   
/*     */   default boolean b(el ☃, el el1) {
/* 324 */     return a(☃, el1, true);
/*     */   }
/*     */   
/*     */   default boolean a(el ☃, el el1, boolean bool) {
/* 328 */     return a(☃.o(), ☃.p(), ☃.q(), el1.o(), el1.p(), el1.q(), bool);
/*     */   }
/*     */   
/*     */   default boolean a(bwf ☃) {
/* 332 */     return a(☃, true);
/*     */   }
/*     */   
/*     */   default boolean a(bwf ☃, boolean bool) {
/* 336 */     return a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f, bool);
/*     */   }
/*     */   
/*     */   default boolean a(int ☃, int i, int j, int k, int m, int n, boolean bool) {
/* 340 */     if (m < 0 || i >= 256) {
/* 341 */       return false;
/*     */     }
/*     */     
/* 344 */     ☃ >>= 4;
/* 345 */     j >>= 4;
/* 346 */     k >>= 4;
/* 347 */     n >>= 4;
/*     */     
/* 349 */     for (int i1 = ☃; i1 <= k; i1++) {
/* 350 */       for (int i2 = j; i2 <= n; i2++) {
/* 351 */         if (!a(i1, i2, bool)) {
/* 352 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 357 */     return true;
/*     */   }
/*     */   
/*     */   boolean c(el paramel);
/*     */   
/*     */   ayu d(el paramel);
/*     */   
/*     */   int a(ayi paramayi, el paramel);
/*     */   
/*     */   int a(el paramel, int paramInt);
/*     */   
/*     */   boolean a(int paramInt1, int paramInt2, boolean paramBoolean);
/*     */   
/*     */   boolean e(el paramel);
/*     */   
/*     */   int a(bor.a parama, int paramInt1, int paramInt2);
/*     */   
/*     */   @Nullable
/*     */   aog a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, Predicate<aer> paramPredicate);
/*     */   
/*     */   int c();
/*     */   
/*     */   bmv d();
/*     */   
/*     */   boolean a(@Nullable aer paramaer, cew paramcew);
/*     */   
/*     */   int a(el paramel, eq parameq);
/*     */   
/*     */   boolean e();
/*     */   
/*     */   int k();
/*     */   
/*     */   boc o();
/*     */ }


/* Location:              F:\dw\server.jar!\ayc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */