/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class bgu
/*     */   extends bcs
/*     */ {
/*  35 */   public static final bmh<bmo> a = bma.M;
/*  36 */   public static final bmh<bmo> b = bma.L;
/*  37 */   public static final bmh<bmo> c = bma.N;
/*  38 */   public static final bmh<bmo> o = bma.O;
/*  39 */   public static final bmj p = bma.al;
/*     */   
/*  41 */   public static final Map<eq, bmh<bmo>> q = Maps.newEnumMap((Map)ImmutableMap.of(eq.c, a, eq.f, b, eq.d, c, eq.e, o));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  55 */   protected static final cew[] r = new cew[] { 
/*  56 */       bcs.a(3.0D, 0.0D, 3.0D, 13.0D, 1.0D, 13.0D), 
/*  57 */       bcs.a(3.0D, 0.0D, 3.0D, 13.0D, 1.0D, 16.0D), 
/*  58 */       bcs.a(0.0D, 0.0D, 3.0D, 13.0D, 1.0D, 13.0D), 
/*  59 */       bcs.a(0.0D, 0.0D, 3.0D, 13.0D, 1.0D, 16.0D), 
/*  60 */       bcs.a(3.0D, 0.0D, 0.0D, 13.0D, 1.0D, 13.0D), 
/*  61 */       bcs.a(3.0D, 0.0D, 0.0D, 13.0D, 1.0D, 16.0D), 
/*  62 */       bcs.a(0.0D, 0.0D, 0.0D, 13.0D, 1.0D, 13.0D), 
/*  63 */       bcs.a(0.0D, 0.0D, 0.0D, 13.0D, 1.0D, 16.0D), 
/*  64 */       bcs.a(3.0D, 0.0D, 3.0D, 16.0D, 1.0D, 13.0D), 
/*  65 */       bcs.a(3.0D, 0.0D, 3.0D, 16.0D, 1.0D, 16.0D), 
/*  66 */       bcs.a(0.0D, 0.0D, 3.0D, 16.0D, 1.0D, 13.0D), 
/*  67 */       bcs.a(0.0D, 0.0D, 3.0D, 16.0D, 1.0D, 16.0D), 
/*  68 */       bcs.a(3.0D, 0.0D, 0.0D, 16.0D, 1.0D, 13.0D), 
/*  69 */       bcs.a(3.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D), 
/*  70 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 13.0D), 
/*  71 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D) };
/*     */   
/*     */   private boolean s = true;
/*     */   
/*  75 */   private final Set<el> t = Sets.newHashSet();
/*     */   
/*     */   public bgu(bcs.c ☃) {
/*  78 */     super(☃);
/*  79 */     v(((blc)this.m.b()).a(a, bmo.c).a(b, bmo.c).a(c, bmo.c).a(o, bmo.c).a(p, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  84 */     return r[w(☃)];
/*     */   }
/*     */   
/*     */   private static int w(blc ☃) {
/*  88 */     int i = 0;
/*  89 */     boolean bool1 = (☃.c(a) != bmo.c);
/*  90 */     boolean bool2 = (☃.c(b) != bmo.c);
/*  91 */     boolean bool3 = (☃.c(c) != bmo.c);
/*  92 */     boolean bool4 = (☃.c(o) != bmo.c);
/*     */     
/*  94 */     if (bool1 || (bool3 && !bool1 && !bool2 && !bool4)) {
/*  95 */       i |= 1 << eq.c.b();
/*     */     }
/*  97 */     if (bool2 || (bool4 && !bool1 && !bool2 && !bool3)) {
/*  98 */       i |= 1 << eq.f.b();
/*     */     }
/* 100 */     if (bool3 || (bool1 && !bool2 && !bool3 && !bool4)) {
/* 101 */       i |= 1 << eq.d.b();
/*     */     }
/* 103 */     if (bool4 || (bool2 && !bool1 && !bool3 && !bool4)) {
/* 104 */       i |= 1 << eq.e.b();
/*     */     }
/* 106 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 111 */     axk axk = ☃.k();
/* 112 */     el el = ☃.a();
/*     */     
/* 114 */     return p()
/* 115 */       .a(o, a(axk, el, eq.e))
/* 116 */       .a(b, a(axk, el, eq.f))
/* 117 */       .a(a, a(axk, el, eq.c))
/* 118 */       .a(c, a(axk, el, eq.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 123 */     if (eq1 == eq.a) {
/* 124 */       return ☃;
/*     */     }
/* 126 */     if (eq1 == eq.b) {
/* 127 */       return ☃
/* 128 */         .a(o, a(axz1, el1, eq.e))
/* 129 */         .a(b, a(axz1, el1, eq.f))
/* 130 */         .a(a, a(axz1, el1, eq.c))
/* 131 */         .a(c, a(axz1, el1, eq.d));
/*     */     }
/*     */     
/* 134 */     return ☃.a(q.get(eq1), a(axz1, el1, eq1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(blc ☃, axz axz1, el el1, int i) {
/* 139 */     try (el.b ☃ = el.b.r()) {
/* 140 */       for (eq eq : eq.c.a) {
/* 141 */         bmo bmo = (bmo)☃.c(q.get(eq));
/* 142 */         if (bmo != bmo.c && axz1.a_(b.j(el1).d(eq)).c() != this) {
/* 143 */           b.d(eq.a);
/* 144 */           blc blc1 = axz1.a_(b);
/* 145 */           if (blc1.c() != bct.ip) {
/* 146 */             el el2 = b.a(eq.d());
/* 147 */             blc blc3 = blc1.a(eq.d(), axz1.a_(el2), axz1, b, el2);
/* 148 */             a(blc1, blc3, axz1, b, i);
/*     */           } 
/*     */           
/* 151 */           b.j(el1).d(eq).d(eq.b);
/* 152 */           blc blc2 = axz1.a_(b);
/* 153 */           if (blc2.c() != bct.ip) {
/* 154 */             el el2 = b.a(eq.d());
/* 155 */             blc blc3 = blc2.a(eq.d(), axz1.a_(el2), axz1, b, el2);
/* 156 */             a(blc2, blc3, axz1, b, i);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private bmo a(axk ☃, el el1, eq eq1) {
/* 164 */     el el2 = el1.a(eq1);
/* 165 */     blc blc1 = ☃.a_(el1.a(eq1));
/*     */     
/* 167 */     blc blc2 = ☃.a_(el1.a());
/* 168 */     if (!blc2.l()) {
/* 169 */       boolean bool = (☃.a_(el2).q() || ☃.a_(el2).c() == bct.dg);
/* 170 */       if (bool && k(☃.a_(el2.a()))) {
/*     */ 
/*     */         
/* 173 */         if (blc1.k()) {
/* 174 */           return bmo.a;
/*     */         }
/* 176 */         return bmo.b;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 181 */     if (a(☃.a_(el2), eq1) || (!blc1.l() && k(☃.a_(el2.b())))) {
/* 182 */       return bmo.b;
/*     */     }
/*     */     
/* 185 */     return bmo.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 190 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 195 */     blc blc1 = ayc1.a_(el1.b());
/* 196 */     return (blc1.q() || blc1.c() == bct.dg);
/*     */   }
/*     */   
/*     */   private blc a(axy ☃, el el1, blc blc1) {
/* 200 */     blc1 = b(☃, el1, blc1);
/*     */     
/* 202 */     List<el> list = Lists.newArrayList(this.t);
/* 203 */     this.t.clear();
/* 204 */     for (el el2 : list) {
/* 205 */       ☃.b(el2, this);
/*     */     }
/*     */     
/* 208 */     return blc1;
/*     */   }
/*     */   
/*     */   private blc b(axy ☃, el el1, blc blc1) {
/* 212 */     blc blc2 = blc1;
/* 213 */     int i = ((Integer)blc2.c(p)).intValue();
/* 214 */     int j = 0;
/*     */     
/* 216 */     j = a(j, blc2);
/*     */     
/* 218 */     this.s = false;
/* 219 */     int k = ☃.u(el1);
/* 220 */     this.s = true;
/*     */     
/* 222 */     if (k > 0 && k > j - 1) {
/* 223 */       j = k;
/*     */     }
/*     */     
/* 226 */     int m = 0;
/* 227 */     for (eq eq : eq.c.a) {
/* 228 */       el el2 = el1.a(eq);
/* 229 */       boolean bool = (el2.o() != el1.o() || el2.q() != el1.q());
/*     */       
/* 231 */       blc blc3 = ☃.a_(el2);
/* 232 */       if (bool) {
/* 233 */         m = a(m, blc3);
/*     */       }
/* 235 */       if (blc3.l() && !☃.a_(el1.a()).l()) {
/* 236 */         if (bool && el1.p() >= el1.p())
/* 237 */           m = a(m, ☃.a_(el2.a()));  continue;
/*     */       } 
/* 239 */       if (!blc3.l() && 
/* 240 */         bool && el1.p() <= el1.p()) {
/* 241 */         m = a(m, ☃.a_(el2.b()));
/*     */       }
/*     */     } 
/*     */     
/* 245 */     if (m > j) {
/* 246 */       j = m - 1;
/* 247 */     } else if (j > 0) {
/* 248 */       j--;
/*     */     } else {
/* 250 */       j = 0;
/*     */     } 
/*     */     
/* 253 */     if (k > j - 1) {
/* 254 */       j = k;
/*     */     }
/*     */     
/* 257 */     if (i != j) {
/* 258 */       blc1 = blc1.a(p, Integer.valueOf(j));
/*     */       
/* 260 */       if (☃.a_(el1) == blc2) {
/* 261 */         ☃.a(el1, blc1, 2);
/*     */       }
/*     */       
/* 264 */       this.t.add(el1);
/* 265 */       for (eq eq : eq.values()) {
/* 266 */         this.t.add(el1.a(eq));
/*     */       }
/*     */     } 
/*     */     
/* 270 */     return blc1;
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1) {
/* 274 */     if (☃.a_(el1).c() != this) {
/*     */       return;
/*     */     }
/*     */     
/* 278 */     ☃.b(el1, this);
/* 279 */     for (eq eq : eq.values()) {
/* 280 */       ☃.b(el1.a(eq), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 286 */     if (blc1.c() == ☃.c() || axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 290 */     a(axy1, el1, ☃);
/*     */     
/* 292 */     for (eq eq : eq.c.b) {
/* 293 */       axy1.b(el1.a(eq), this);
/*     */     }
/*     */     
/* 296 */     for (eq eq : eq.c.a) {
/* 297 */       a(axy1, el1.a(eq));
/*     */     }
/*     */     
/* 300 */     for (eq eq : eq.c.a) {
/* 301 */       el el2 = el1.a(eq);
/*     */       
/* 303 */       if (axy1.a_(el2).l()) {
/* 304 */         a(axy1, el2.a()); continue;
/*     */       } 
/* 306 */       a(axy1, el2.b());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 313 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 316 */     super.a(☃, axy1, el1, blc1, bool);
/* 317 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 321 */     for (eq eq : eq.values()) {
/* 322 */       axy1.b(el1.a(eq), this);
/*     */     }
/* 324 */     a(axy1, el1, ☃);
/*     */     
/* 326 */     for (eq eq : eq.c.a) {
/* 327 */       a(axy1, el1.a(eq));
/*     */     }
/*     */     
/* 330 */     for (eq eq : eq.c.a) {
/* 331 */       el el2 = el1.a(eq);
/*     */       
/* 333 */       if (axy1.a_(el2).l()) {
/* 334 */         a(axy1, el2.a()); continue;
/*     */       } 
/* 336 */       a(axy1, el2.b());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(int ☃, blc blc1) {
/* 342 */     if (blc1.c() != this) {
/* 343 */       return ☃;
/*     */     }
/* 345 */     int i = ((Integer)blc1.c(p)).intValue();
/* 346 */     if (i > ☃) {
/* 347 */       return i;
/*     */     }
/* 349 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 354 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 358 */     if (☃.a(axy1, el1)) {
/* 359 */       a(axy1, el1, ☃);
/*     */     } else {
/* 361 */       ☃.a(axy1, el1, 0);
/* 362 */       axy1.g(el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/* 368 */     if (!this.s) {
/* 369 */       return 0;
/*     */     }
/* 371 */     return ☃.a(axk1, el1, eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/* 376 */     if (!this.s) {
/* 377 */       return 0;
/*     */     }
/*     */     
/* 380 */     int i = ((Integer)☃.c(p)).intValue();
/* 381 */     if (i == 0) {
/* 382 */       return 0;
/*     */     }
/*     */     
/* 385 */     if (eq1 == eq.b) {
/* 386 */       return i;
/*     */     }
/*     */     
/* 389 */     EnumSet<eq> enumSet = EnumSet.noneOf(eq.class);
/* 390 */     for (eq eq2 : eq.c.a) {
/* 391 */       if (b(axk1, el1, eq2)) {
/* 392 */         enumSet.add(eq2);
/*     */       }
/*     */     } 
/*     */     
/* 396 */     if (eq1.k().c() && enumSet.isEmpty()) {
/* 397 */       return i;
/*     */     }
/*     */     
/* 400 */     if (enumSet.contains(eq1) && !enumSet.contains(eq1.f()) && !enumSet.contains(eq1.e())) {
/* 401 */       return i;
/*     */     }
/*     */     
/* 404 */     return 0;
/*     */   }
/*     */   
/*     */   private boolean b(axk ☃, el el1, eq eq1) {
/* 408 */     el el2 = el1.a(eq1);
/* 409 */     blc blc = ☃.a_(el2);
/* 410 */     boolean bool1 = blc.l();
/*     */     
/* 412 */     boolean bool2 = ☃.a_(el1.a()).l();
/* 413 */     if (!bool2 && bool1 && a(☃, el2.a())) {
/* 414 */       return true;
/*     */     }
/* 416 */     if (a(blc, eq1)) {
/* 417 */       return true;
/*     */     }
/* 419 */     if (blc.c() == bct.dl && ((Boolean)blc.c(bea.c)).booleanValue() && blc.c(bea.D) == eq1) {
/* 420 */       return true;
/*     */     }
/* 422 */     if (!bool1 && a(☃, el2.b())) {
/* 423 */       return true;
/*     */     }
/*     */     
/* 426 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean a(axk ☃, el el1) {
/* 430 */     return k(☃.a_(el1));
/*     */   }
/*     */   
/*     */   protected static boolean k(blc ☃) {
/* 434 */     return a(☃, (eq)null);
/*     */   }
/*     */   
/*     */   protected static boolean a(blc ☃, @Nullable eq eq1) {
/* 438 */     bcs bcs1 = ☃.c();
/* 439 */     if (bcs1 == bct.cl) {
/* 440 */       return true;
/*     */     }
/*     */     
/* 443 */     if (☃.c() == bct.dl) {
/* 444 */       eq eq2 = (eq)☃.c(bgz.D);
/* 445 */       return (eq2 == eq1 || eq2.d() == eq1);
/*     */     } 
/*     */     
/* 448 */     if (bct.ip == ☃.c()) {
/* 449 */       return (eq1 == ☃.c(bgg.a));
/*     */     }
/*     */     
/* 452 */     return (☃.m() && eq1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 457 */     return this.s;
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
/*     */   public axl c() {
/* 504 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 509 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 1:
/* 511 */         return ☃.a(a, ☃.c(c)).a(b, ☃.c(o)).a(c, ☃.c(a)).a(o, ☃.c(b));
/*     */       case 2:
/* 513 */         return ☃.a(a, ☃.c(b)).a(b, ☃.c(c)).a(c, ☃.c(o)).a(o, ☃.c(a));
/*     */       case 3:
/* 515 */         return ☃.a(a, ☃.c(o)).a(b, ☃.c(a)).a(c, ☃.c(b)).a(o, ☃.c(c));
/*     */     } 
/* 517 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 523 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 525 */         return ☃.a(a, ☃.c(c)).a(c, ☃.c(a));
/*     */       case 2:
/* 527 */         return ☃.a(b, ☃.c(o)).a(o, ☃.c(b));
/*     */     } 
/*     */ 
/*     */     
/* 531 */     return super.a(☃, bfz1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 536 */     ☃.a((bmm<?>[])new bmm[] { a, b, c, o, p });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 541 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */