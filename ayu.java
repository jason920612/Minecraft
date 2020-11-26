/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ayu
/*     */ {
/* 148 */   public static final Logger a = LogManager.getLogger();
/*     */   
/* 150 */   public static final bwe<bsh> b = new bwi();
/* 151 */   public static final bwe<bsh> c = new bwm();
/* 152 */   public static final bwe<bsh> d = new bwh();
/* 153 */   public static final bwe<bsh> e = new bxf();
/* 154 */   public static final bwe<bsh> f = new bxg();
/*     */   
/* 156 */   public static final bvg<bux> g = new bur();
/* 157 */   public static final bvg<bux> h = new bus();
/* 158 */   public static final bvg<bux> i = new buq();
/* 159 */   public static final bvg<bux> j = new buo();
/* 160 */   public static final bvg<bux> k = new bup();
/* 161 */   public static final bvg<bpz> l = new bvo();
/* 162 */   public static final bvg<bpz> m = new bvp();
/* 163 */   public static final bvg<bry> n = new bvq();
/* 164 */   public static final bvg<buw> o = new buh();
/* 165 */   public static final bvg<buw> p = new bui();
/* 166 */   public static final bvg<buw> q = new buj();
/* 167 */   public static final bvg<buw> r = new buk();
/* 168 */   public static final bvg<buz> s = new buu();
/* 169 */   public static final bvg<bpy> t = new bvx();
/* 170 */   public static final bvg<bpy> u = new bum();
/* 171 */   public static final bvg<bpy> v = new but();
/* 172 */   public static final bvg<bpy> w = new bwb();
/* 173 */   public static final bvg<bpw> x = new bvw();
/* 174 */   public static final bvg<buy> y = new bps();
/* 175 */   public static final bvg<buy> z = new bpt();
/* 176 */   public static final bvg<bvc> A = new bun();
/* 177 */   public static final bvg<bry> B = new bvt();
/* 178 */   public static final bvg<bvb> C = new bvv();
/* 179 */   public static final bvg<bva> D = new bvu();
/* 180 */   public static final bvg<buv> E = new bug();
/*     */   
/* 182 */   public static final bvg<bux> F = new bvh();
/* 183 */   public static final bvg<bux> G = new bvy();
/* 184 */   public static final bvg<bux> H = new bwa();
/* 185 */   public static final bvg<bry> I = new bvd();
/* 186 */   public static final bvg<bvj> J = new bvk();
/* 187 */   public static final bvg<bvj> K = new bvl();
/* 188 */   public static final bvg<bvm> L = new bvn();
/* 189 */   public static final bvg<bry> M = new bvr();
/* 190 */   public static final bvg<buw> N = new bvi();
/* 191 */   public static final bvg<bux> O = new bvz();
/* 192 */   public static final bvg<bry> P = new bvs();
/* 193 */   public static final bvg<bry> Q = new bvf();
/* 194 */   public static final bvg<bry> R = new bul();
/* 195 */   public static final bvg<bry> S = new bve();
/*     */   
/* 197 */   protected static final blc T = bct.a.p();
/* 198 */   protected static final blc U = bct.j.p();
/* 199 */   protected static final blc V = bct.i.p();
/* 200 */   protected static final blc W = bct.l.p();
/* 201 */   protected static final blc X = bct.F.p();
/* 202 */   protected static final blc Y = bct.b.p();
/* 203 */   protected static final blc Z = bct.k.p();
/* 204 */   protected static final blc aa = bct.D.p();
/* 205 */   protected static final blc ab = bct.E.p();
/* 206 */   protected static final blc ac = bct.fE.p();
/* 207 */   protected static final blc ad = bct.dV.p();
/* 208 */   protected static final blc ae = bct.de.p();
/* 209 */   protected static final blc af = bct.eg.p();
/*     */   
/* 211 */   public static final byd ag = new byd(T, T, T);
/* 212 */   public static final byd ah = new byd(U, U, X);
/* 213 */   public static final byd ai = new byd(V, U, X);
/* 214 */   public static final byd aj = new byd(Y, Y, X);
/* 215 */   public static final byd ak = new byd(X, X, X);
/* 216 */   public static final byd al = new byd(Z, U, X);
/* 217 */   public static final byd am = new byd(W, U, X);
/* 218 */   public static final byd an = new byd(aa, aa, aa);
/* 219 */   public static final byd ao = new byd(V, U, aa);
/* 220 */   public static final byd ap = new byd(aa, aa, X);
/* 221 */   public static final byd aq = new byd(ab, ac, X);
/* 222 */   public static final byd ar = new byd(ad, U, X);
/* 223 */   public static final byd as = new byd(ae, ae, ae);
/* 224 */   public static final byd at = new byd(af, af, af);
/*     */   
/* 226 */   public static final byc<byd> au = new bxs();
/* 227 */   public static final byc<byd> av = new bxu();
/* 228 */   public static final byc<byd> aw = new byb();
/* 229 */   public static final byc<byd> ax = new bxt();
/* 230 */   public static final byc<byd> ay = new byg();
/* 231 */   public static final byc<byd> az = new byf();
/* 232 */   public static final byc<byd> aA = new bxy();
/* 233 */   public static final byc<byd> aB = new bxx();
/* 234 */   public static final byc<byd> aC = new bxw();
/* 235 */   public static final byc<byd> aD = new bxv();
/* 236 */   public static final byc<byd> aE = new bxz();
/* 237 */   public static final byc<byd> aF = new bya();
/*     */   
/* 239 */   public static final Set<ayu> aG = Sets.newHashSet();
/* 240 */   public static final eu<ayu> aH = new eu<>();
/* 241 */   protected static final byk aI = new byk(new Random(1234L), 1);
/* 242 */   public static final byk aJ = new byk(new Random(2345L), 1); @Nullable
/*     */   protected String aK; protected final float aL; protected final float aM; protected final float aN; protected final float aO;
/*     */   @Nullable
/*     */   public static ayu a(ayu ☃) {
/* 246 */     return aH.a(fc.m.a(☃));
/*     */   } protected final int aP; protected final int aQ; @Nullable
/*     */   protected final String aR; protected final bxr<?> aS; protected final b aT; protected final d aU;
/*     */   public static <C extends bqp> bwj<C> a(bxj<C> ☃, C c) {
/* 250 */     return new bwj<>(☃, c);
/*     */   }
/*     */   
/*     */   public static <F extends bqp, D extends bpx> bpn<F, D> a(bqo<F> ☃, F f, bvg<D> bvg1, D d1) {
/* 254 */     return new bpn<>(☃, f, bvg1, d1);
/*     */   }
/*     */   
/*     */   public static <D extends bpx> bqr<D> a(bqs ☃, bvg<D> bvg1, D d1) {
/* 258 */     return new bqr<>(☃, bvg1, d1);
/*     */   }
/*     */   
/*     */   public enum c {
/* 262 */     a,
/* 263 */     b,
/* 264 */     c,
/* 265 */     d;
/*     */   }
/*     */   
/*     */   public enum b {
/* 269 */     a,
/* 270 */     b,
/* 271 */     c,
/* 272 */     d,
/* 273 */     e,
/* 274 */     f,
/* 275 */     g,
/* 276 */     h,
/* 277 */     i,
/* 278 */     j,
/* 279 */     k,
/* 280 */     l,
/* 281 */     m,
/* 282 */     n,
/* 283 */     o,
/* 284 */     p,
/* 285 */     q;
/*     */   }
/*     */   
/*     */   public enum d {
/* 289 */     a,
/* 290 */     b,
/* 291 */     c;
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
/* 309 */   protected final Map<boq.a, List<bwj<?>>> aV = Maps.newHashMap();
/* 310 */   protected final Map<boq.b, List<bpn<?, ?>>> aW = Maps.newHashMap();
/* 311 */   protected final List<bqr<?>> aX = Lists.newArrayList();
/* 312 */   protected final Map<btl<?>, bqp> aY = Maps.newHashMap();
/* 313 */   private final Map<afc, List<e>> aZ = Maps.newHashMap();
/*     */   
/*     */   protected ayu(a ☃) {
/* 316 */     if (a.a(☃) == null || 
/* 317 */       a.b(☃) == null || 
/* 318 */       a.c(☃) == null || 
/* 319 */       a.d(☃) == null || 
/* 320 */       a.e(☃) == null || 
/* 321 */       a.f(☃) == null || 
/* 322 */       a.g(☃) == null || 
/* 323 */       a.h(☃) == null || 
/* 324 */       a.i(☃) == null)
/*     */     {
/* 326 */       throw new IllegalStateException("You are missing parameters to build a proper biome for " + getClass().getSimpleName() + "\n" + ☃);
/*     */     }
/*     */     
/* 329 */     this.aS = a.a(☃);
/* 330 */     this.aU = a.b(☃);
/* 331 */     this.aT = a.c(☃);
/* 332 */     this.aL = a.d(☃).floatValue();
/* 333 */     this.aM = a.e(☃).floatValue();
/* 334 */     this.aN = a.f(☃).floatValue();
/* 335 */     this.aO = a.g(☃).floatValue();
/* 336 */     this.aP = a.h(☃).intValue();
/* 337 */     this.aQ = a.i(☃).intValue();
/* 338 */     this.aR = a.j(☃);
/*     */     
/* 340 */     for (boq.b b1 : boq.b.values()) {
/* 341 */       this.aW.put(b1, Lists.newArrayList());
/*     */     }
/*     */     
/* 344 */     for (afc afc : afc.values()) {
/* 345 */       this.aZ.put(afc, Lists.newArrayList());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a() {
/* 350 */     a(boq.b.c, a(bqo.f, new brt(0.004000000189989805D, bru.b.a), n, bpx.e));
/* 351 */     a(boq.b.d, a(bqo.e, new btu(0, bxh.n.a), n, bpx.e));
/* 352 */     a(boq.b.c, a(bqo.m, new btj(), n, bpx.e));
/* 353 */     a(boq.b.d, a(bqo.l, new bto(), n, bpx.e));
/* 354 */     a(boq.b.d, a(bqo.i, new bqb(), n, bpx.e));
/* 355 */     a(boq.b.d, a(bqo.h, new bri(), n, bpx.e));
/* 356 */     a(boq.b.d, a(bqo.j, new brf(), n, bpx.e));
/* 357 */     a(boq.b.d, a(bqo.k, new bsy(false), n, bpx.e));
/* 358 */     a(boq.b.d, a(bqo.n, new bsa(), n, bpx.e));
/* 359 */     a(boq.b.d, a(bqo.g, new btz(), n, bpx.e));
/* 360 */     a(boq.b.d, a(bqo.o, new bsc(bwt.b.b, 0.3F, 0.9F), n, bpx.e));
/* 361 */     a(boq.b.c, a(bqo.r, new bph(0.01F), n, bpx.e));
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 365 */     return (this.aR != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(afc ☃, e e1) {
/* 375 */     ((List<e>)this.aZ.get(☃)).add(e1);
/*     */   }
/*     */   
/*     */   public List<e> a(afc ☃) {
/* 379 */     return this.aZ.get(☃);
/*     */   }
/*     */   
/*     */   public static class e extends xy.a {
/*     */     public aev<? extends afb> b;
/*     */     public int c;
/*     */     public int d;
/*     */     
/*     */     public e(aev<? extends afb> ☃, int i, int j, int k) {
/* 388 */       super(i);
/* 389 */       this.b = ☃;
/* 390 */       this.c = j;
/* 391 */       this.d = k;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 396 */       return aev.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   public d c() {
/* 401 */     return this.aU;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 405 */     return (i() > 0.85F);
/*     */   }
/*     */   
/*     */   public float e() {
/* 409 */     return 0.1F;
/*     */   }
/*     */   
/*     */   public float c(el ☃) {
/* 413 */     if (☃.p() > 64) {
/* 414 */       float f = (float)(aI.a((☃.o() / 8.0F), (☃.q() / 8.0F)) * 4.0D);
/* 415 */       return m() - (f + ☃.p() - 64.0F) * 0.05F / 30.0F;
/*     */     } 
/* 417 */     return m();
/*     */   }
/*     */   
/*     */   public boolean a(ayc ☃, el el1) {
/* 421 */     return a(☃, el1, true);
/*     */   }
/*     */   
/*     */   public boolean a(ayc ☃, el el1, boolean bool) {
/* 425 */     if (c(el1) >= 0.15F) {
/* 426 */       return false;
/*     */     }
/*     */     
/* 429 */     if (el1.p() >= 0 && el1.p() < 256 && ☃.a(ayi.b, el1) < 10) {
/* 430 */       blc blc1 = ☃.a_(el1);
/* 431 */       byw byw = ☃.b(el1);
/* 432 */       if (byw.c() == byy.c && blc1.c() instanceof bfu) {
/* 433 */         if (!bool) {
/* 434 */           return true;
/*     */         }
/*     */         
/* 437 */         boolean bool1 = (☃.B(el1.e()) && ☃.B(el1.f()) && ☃.B(el1.c()) && ☃.B(el1.d()));
/* 438 */         if (!bool1) {
/* 439 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 443 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ayc ☃, el el1) {
/* 447 */     if (c(el1) >= 0.15F) {
/* 448 */       return false;
/*     */     }
/*     */     
/* 451 */     if (el1.p() >= 0 && el1.p() < 256 && ☃.a(ayi.b, el1) < 10) {
/* 452 */       blc blc1 = ☃.a_(el1);
/*     */ 
/*     */       
/* 455 */       if (blc1.f() && bct.cQ.p().a(☃, el1)) {
/* 456 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 460 */     return false;
/*     */   }
/*     */   
/*     */   public void a(boq.b ☃, bpn<?, ?> bpn1) {
/* 464 */     if (bpn1 instanceof bqr) {
/* 465 */       this.aX.add((bqr)bpn1);
/*     */     }
/*     */     
/* 468 */     ((List<bpn<?, ?>>)this.aW.get(☃)).add(bpn1);
/*     */   }
/*     */   
/*     */   public <C extends bqp> void a(boq.a ☃, bwj<C> bwj1) {
/* 472 */     ((List<bwj<C>>)this.aV.computeIfAbsent(☃, ☃ -> Lists.newArrayList())).add(bwj1);
/*     */   }
/*     */   
/*     */   public List<bwj<?>> a(boq.a ☃) {
/* 476 */     return this.aV.computeIfAbsent(☃, ☃ -> Lists.newArrayList());
/*     */   }
/*     */   
/*     */   public <C extends bqp> void a(btl<C> ☃, C c) {
/* 480 */     this.aY.put(☃, (bqp)c);
/*     */   }
/*     */   
/*     */   public <C extends bqp> boolean a(btl<C> ☃) {
/* 484 */     return this.aY.containsKey(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public <C extends bqp> bqp b(btl<C> ☃) {
/* 489 */     return this.aY.get(☃);
/*     */   }
/*     */   
/*     */   public List<bqr<?>> f() {
/* 493 */     return this.aX;
/*     */   }
/*     */   
/*     */   public List<bpn<?, ?>> a(boq.b ☃) {
/* 497 */     return this.aW.get(☃);
/*     */   }
/*     */   
/*     */   public void a(boq.b ☃, bmy<? extends bom> bmy1, axz axz1, long l, boz boz1, el el1) {
/* 501 */     int i = 0;
/* 502 */     for (bpn<?, ?> bpn : this.aW.get(☃)) {
/* 503 */       boz1.b(l, i, ☃.ordinal());
/* 504 */       bpn.a(axz1, bmy1, boz1, el1, bqp.e);
/* 505 */       i++;
/*     */     } 
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
/*     */   public void a(Random ☃, bmx bmx1, int i, int j, int k, double d1, blc blc1, blc blc2, int m, long l) {
/* 525 */     this.aS.a(l);
/* 526 */     this.aS.a(☃, bmx1, this, i, j, k, d1, blc1, blc2, m, l, ag);
/*     */   }
/*     */   
/*     */   public c g() {
/* 530 */     if (this.aT == b.l) {
/* 531 */       return c.a;
/*     */     }
/*     */     
/* 534 */     if (m() < 0.2D) {
/* 535 */       return c.b;
/*     */     }
/* 537 */     if (m() < 1.0D) {
/* 538 */       return c.c;
/*     */     }
/* 540 */     return c.d;
/*     */   }
/*     */   
/*     */   public static ayu a(int ☃, ayu ayu1) {
/* 544 */     ayu ayu2 = fc.m.a(☃);
/* 545 */     return (ayu2 == null) ? ayu1 : ayu2;
/*     */   }
/*     */   
/*     */   public final float h() {
/* 549 */     return this.aL;
/*     */   }
/*     */   
/*     */   public final float i() {
/* 553 */     return this.aO;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String k() {
/* 561 */     if (this.aK == null) {
/* 562 */       this.aK = k.a("biome", fc.m.b(this));
/*     */     }
/* 564 */     return this.aK;
/*     */   }
/*     */   
/*     */   public final float l() {
/* 568 */     return this.aM;
/*     */   }
/*     */   
/*     */   public final float m() {
/* 572 */     return this.aN;
/*     */   }
/*     */   
/*     */   public final int n() {
/* 576 */     return this.aP;
/*     */   }
/*     */   
/*     */   public final int o() {
/* 580 */     return this.aQ;
/*     */   }
/*     */   
/*     */   public final b p() {
/* 584 */     return this.aT;
/*     */   }
/*     */   
/*     */   public bxr<?> q() {
/* 588 */     return this.aS;
/*     */   }
/*     */   
/*     */   public bye r() {
/* 592 */     return (bye)this.aS.a();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String s() {
/* 597 */     return this.aR;
/*     */   }
/*     */   
/*     */   public static void t() {
/* 601 */     a(0, "ocean", new bat());
/* 602 */     a(1, "plains", new baw());
/* 603 */     a(2, "desert", new azm());
/* 604 */     a(3, "mountains", new bao());
/* 605 */     a(4, "forest", new azv());
/* 606 */     a(5, "taiga", new bbn());
/* 607 */     a(6, "swamp", new bbl());
/* 608 */     a(7, "river", new bax());
/* 609 */     a(8, "nether", new bas());
/* 610 */     a(9, "the_end", new bbs());
/* 611 */     a(10, "frozen_ocean", new azx());
/* 612 */     a(11, "frozen_river", new azy());
/* 613 */     a(12, "snowy_tundra", new bbi());
/* 614 */     a(13, "snowy_mountains", new bbe());
/* 615 */     a(14, "mushroom_fields", new baq());
/* 616 */     a(15, "mushroom_field_shore", new bar());
/* 617 */     a(16, "beach", new ayt());
/* 618 */     a(17, "desert_hills", new azn());
/* 619 */     a(18, "wooded_hills", new bby());
/* 620 */     a(19, "taiga_hills", new bbo());
/* 621 */     a(20, "mountain_edge", new bap());
/* 622 */     a(21, "jungle", new baf());
/* 623 */     a(22, "jungle_hills", new bah());
/* 624 */     a(23, "jungle_edge", new bag());
/* 625 */     a(24, "deep_ocean", new azk());
/* 626 */     a(25, "stone_shore", new bbj());
/* 627 */     a(26, "snowy_beach", new bbd());
/* 628 */     a(27, "birch_forest", new aza());
/* 629 */     a(28, "birch_forest_hills", new azb());
/* 630 */     a(29, "dark_forest", new azf());
/* 631 */     a(30, "snowy_taiga", new bbf());
/* 632 */     a(31, "snowy_taiga_hills", new bbg());
/* 633 */     a(32, "giant_tree_taiga", new bab());
/* 634 */     a(33, "giant_tree_taiga_hills", new bac());
/* 635 */     a(34, "wooded_mountains", new bbz());
/* 636 */     a(35, "savanna", new bay());
/* 637 */     a(36, "savanna_plateau", new baz());
/* 638 */     a(37, "badlands", new ayr());
/* 639 */     a(38, "wooded_badlands_plateau", new bbx());
/* 640 */     a(39, "badlands_plateau", new ays());
/* 641 */     a(40, "small_end_islands", new bbc());
/* 642 */     a(41, "end_midlands", new azr());
/* 643 */     a(42, "end_highlands", new azq());
/* 644 */     a(43, "end_barrens", new azp());
/* 645 */     a(44, "warm_ocean", new bbw());
/* 646 */     a(45, "lukewarm_ocean", new bai());
/* 647 */     a(46, "cold_ocean", new aze());
/* 648 */     a(47, "deep_warm_ocean", new azl());
/* 649 */     a(48, "deep_lukewarm_ocean", new azj());
/* 650 */     a(49, "deep_cold_ocean", new azh());
/* 651 */     a(50, "deep_frozen_ocean", new azi());
/*     */     
/* 653 */     a(127, "the_void", new bbv());
/*     */     
/* 655 */     a(129, "sunflower_plains", new bbk());
/* 656 */     a(130, "desert_lakes", new azo());
/* 657 */     a(131, "gravelly_mountains", new bad());
/* 658 */     a(132, "flower_forest", new azw());
/* 659 */     a(133, "taiga_mountains", new bbp());
/* 660 */     a(134, "swamp_hills", new bbm());
/* 661 */     a(140, "ice_spikes", new bae());
/* 662 */     a(149, "modified_jungle", new bal());
/* 663 */     a(151, "modified_jungle_edge", new bam());
/*     */     
/* 665 */     a(155, "tall_birch_forest", new bbq());
/* 666 */     a(156, "tall_birch_hills", new bbr());
/* 667 */     a(157, "dark_forest_hills", new azg());
/* 668 */     a(158, "snowy_taiga_mountains", new bbh());
/* 669 */     a(160, "giant_spruce_taiga", new azz());
/* 670 */     a(161, "giant_spruce_taiga_hills", new baa());
/* 671 */     a(162, "modified_gravelly_mountains", new bak());
/* 672 */     a(163, "shattered_savanna", new bba());
/* 673 */     a(164, "shattered_savanna_plateau", new bbb());
/* 674 */     a(165, "eroded_badlands", new azs());
/* 675 */     a(166, "modified_wooded_badlands_plateau", new ban());
/* 676 */     a(167, "modified_badlands_plateau", new baj());
/*     */     
/* 678 */     Collections.addAll(aG, new ayu[] { ayz.a, ayz.c, ayz.d, ayz.e, ayz.f, ayz.g, ayz.h, ayz.i, ayz.m, ayz.n, ayz.o, ayz.p, ayz.q, ayz.r, ayz.s, ayz.t, ayz.u, ayz.w, ayz.x, ayz.y, ayz.z, ayz.A, ayz.B, ayz.C, ayz.D, ayz.E, ayz.F, ayz.G, ayz.H, ayz.I, ayz.J, ayz.K, ayz.L, ayz.M, ayz.N, ayz.O });
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
/*     */   private static void a(int ☃, String str, ayu ayu1) {
/* 719 */     fc.m.a(☃, new pc(str), ayu1);
/* 720 */     if (ayu1.b())
/* 721 */       aH.a(ayu1, fc.m.a(fc.m.b(new pc(ayu1.aR)))); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */   {
/*     */     @Nullable
/*     */     private bxr<?> a;
/*     */     @Nullable
/*     */     private ayu.d b;
/*     */     @Nullable
/*     */     private ayu.b c;
/*     */     @Nullable
/*     */     private Float d;
/*     */     @Nullable
/*     */     private Float e;
/*     */     @Nullable
/*     */     private Float f;
/*     */     @Nullable
/*     */     private Float g;
/*     */     @Nullable
/*     */     private Integer h;
/*     */     @Nullable
/*     */     private Integer i;
/*     */     @Nullable
/*     */     private String j;
/*     */     
/*     */     public a a(bxr<?> ☃) {
/* 748 */       this.a = ☃;
/* 749 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ayu.d ☃) {
/* 753 */       this.b = ☃;
/* 754 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ayu.b ☃) {
/* 758 */       this.c = ☃;
/* 759 */       return this;
/*     */     }
/*     */     
/*     */     public a a(float ☃) {
/* 763 */       this.d = Float.valueOf(☃);
/* 764 */       return this;
/*     */     }
/*     */     
/*     */     public a b(float ☃) {
/* 768 */       this.e = Float.valueOf(☃);
/* 769 */       return this;
/*     */     }
/*     */     
/*     */     public a c(float ☃) {
/* 773 */       this.f = Float.valueOf(☃);
/* 774 */       return this;
/*     */     }
/*     */     
/*     */     public a d(float ☃) {
/* 778 */       this.g = Float.valueOf(☃);
/* 779 */       return this;
/*     */     }
/*     */     
/*     */     public a a(int ☃) {
/* 783 */       this.h = Integer.valueOf(☃);
/* 784 */       return this;
/*     */     }
/*     */     
/*     */     public a b(int ☃) {
/* 788 */       this.i = Integer.valueOf(☃);
/* 789 */       return this;
/*     */     }
/*     */     
/*     */     public a a(@Nullable String ☃) {
/* 793 */       this.j = ☃;
/* 794 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 799 */       return "BiomeBuilder{\nsurfaceBuilder=" + this.a + ",\nprecipitation=" + this.b + ",\nbiomeCategory=" + this.c + ",\ndepth=" + this.d + ",\nscale=" + this.e + ",\ntemperature=" + this.f + ",\ndownfall=" + this.g + ",\nwaterColor=" + this.h + ",\nwaterFogColor=" + this.i + ",\nparent='" + this.j + '\'' + "\n" + '}';
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ayu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */