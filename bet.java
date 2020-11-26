/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class bet
/*     */   extends bcs
/*     */ {
/*  35 */   public static final bmj a = bma.X;
/*  36 */   public static final bmb b = bgj.a;
/*  37 */   public static final bmb c = bgj.b;
/*  38 */   public static final bmb o = bgj.c;
/*  39 */   public static final bmb p = bgj.o;
/*  40 */   public static final bmb q = bgj.p;
/*     */   static {
/*  42 */     r = (Map<eq, bmb>)bgj.r.entrySet().stream().filter(☃ -> (☃.getKey() != eq.a)).collect(k.a());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Map<eq, bmb> r;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   private final Object2IntMap<bcs> s = (Object2IntMap<bcs>)new Object2IntOpenHashMap();
/*  55 */   private final Object2IntMap<bcs> t = (Object2IntMap<bcs>)new Object2IntOpenHashMap();
/*     */   
/*     */   protected bet(bcs.c ☃) {
/*  58 */     super(☃);
/*  59 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)).a(p, Boolean.valueOf(false)).a(q, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  65 */     return cet.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  70 */     if (a(☃, axz1, el1)) {
/*  71 */       return a(axz1, el1).a(a, ☃.c(a));
/*     */     }
/*     */     
/*  74 */     return bct.a.p();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  80 */     return a(☃.k(), ☃.a());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(axk ☃, el el1) {
/*  86 */     blc blc1 = ☃.a_(el1.b());
/*  87 */     if (blc1.q() || k(blc1)) {
/*  88 */       return p();
/*     */     }
/*     */     
/*  91 */     blc blc2 = p();
/*  92 */     for (eq eq : eq.values()) {
/*  93 */       bmb bmb1 = r.get(eq);
/*  94 */       if (bmb1 != null) {
/*  95 */         blc2 = blc2.a(bmb1, Boolean.valueOf(k(☃.a_(el1.a(eq)))));
/*     */       }
/*     */     } 
/*     */     
/*  99 */     return blc2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 104 */     return (ayc1.a_(el1.b()).q() || d(ayc1, el1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 109 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 114 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/* 119 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 124 */     if (!axy1.X().b("doFireTick")) {
/*     */       return;
/*     */     }
/*     */     
/* 128 */     if (!☃.a(axy1, el1)) {
/* 129 */       axy1.g(el1);
/*     */     }
/*     */     
/* 132 */     bcs bcs1 = axy1.a_(el1.b()).c();
/* 133 */     boolean bool1 = ((axy1.t instanceof boi && bcs1 == bct.z) || bcs1 == bct.de || bcs1 == bct.ik);
/*     */ 
/*     */ 
/*     */     
/* 137 */     int i = ((Integer)☃.c(a)).intValue();
/* 138 */     if (!bool1 && axy1.Z() && a(axy1, el1) && random.nextFloat() < 0.2F + i * 0.03F) {
/* 139 */       axy1.g(el1);
/*     */       
/*     */       return;
/*     */     } 
/* 143 */     int j = Math.min(15, i + random.nextInt(3) / 2);
/* 144 */     if (i != j) {
/* 145 */       ☃ = ☃.a(a, Integer.valueOf(j));
/* 146 */       axy1.a(el1, ☃, 4);
/*     */     } 
/*     */     
/* 149 */     if (!bool1) {
/*     */       
/* 151 */       axy1.J().a(el1, this, a(axy1) + random.nextInt(10));
/*     */       
/* 153 */       if (!d(axy1, el1)) {
/* 154 */         if (!axy1.a_(el1.b()).q() || i > 3) {
/* 155 */           axy1.g(el1);
/*     */         }
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 161 */       if (i == 15 && random.nextInt(4) == 0 && !k(axy1.a_(el1.b()))) {
/* 162 */         axy1.g(el1);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 167 */     boolean bool2 = axy1.x(el1);
/* 168 */     int k = bool2 ? -50 : 0;
/*     */     
/* 170 */     a(axy1, el1.f(), 300 + k, random, i);
/* 171 */     a(axy1, el1.e(), 300 + k, random, i);
/* 172 */     a(axy1, el1.b(), 250 + k, random, i);
/* 173 */     a(axy1, el1.a(), 250 + k, random, i);
/* 174 */     a(axy1, el1.c(), 300 + k, random, i);
/* 175 */     a(axy1, el1.d(), 300 + k, random, i);
/*     */     
/* 177 */     el.a a = new el.a();
/* 178 */     for (int m = -1; m <= 1; m++) {
/* 179 */       for (int n = -1; n <= 1; n++) {
/* 180 */         for (int i1 = -1; i1 <= 4; i1++) {
/* 181 */           if (m != 0 || i1 != 0 || n != 0) {
/*     */ 
/*     */ 
/*     */             
/* 185 */             int i2 = 100;
/* 186 */             if (i1 > 1) {
/* 187 */               i2 += (i1 - 1) * 100;
/*     */             }
/*     */             
/* 190 */             a.g(el1).d(m, i1, n);
/* 191 */             int i3 = a(axy1, a);
/* 192 */             if (i3 > 0) {
/*     */ 
/*     */ 
/*     */               
/* 196 */               int i4 = (i3 + 40 + axy1.aj().a() * 7) / (i + 30);
/* 197 */               if (bool2) {
/* 198 */                 i4 /= 2;
/*     */               }
/* 200 */               if (i4 > 0 && random.nextInt(i2) <= i4 && (
/* 201 */                 !axy1.Z() || !a(axy1, a))) {
/*     */ 
/*     */ 
/*     */                 
/* 205 */                 int i5 = Math.min(15, i + random.nextInt(5) / 4);
/* 206 */                 axy1.a(a, a(axy1, a).a(a, Integer.valueOf(i5)), 3);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } protected boolean a(axy ☃, el el1) {
/* 214 */     return (☃.w(el1) || ☃.w(el1.e()) || ☃.w(el1.f()) || ☃.w(el1.c()) || ☃.w(el1.d()));
/*     */   }
/*     */   
/*     */   private int f(bcs ☃) {
/* 218 */     return this.t.getInt(☃);
/*     */   }
/*     */   
/*     */   private int g(bcs ☃) {
/* 222 */     return this.s.getInt(☃);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, int i, Random random, int j) {
/* 226 */     int k = f(☃.a_(el1).c());
/* 227 */     if (random.nextInt(i) < k) {
/* 228 */       blc blc = ☃.a_(el1);
/*     */       
/* 230 */       if (random.nextInt(j + 10) < 5 && !☃.w(el1)) {
/* 231 */         int m = Math.min(j + random.nextInt(5) / 4, 15);
/* 232 */         ☃.a(el1, a(☃, el1).a(a, Integer.valueOf(m)), 3);
/*     */       } else {
/* 234 */         ☃.g(el1);
/*     */       } 
/*     */       
/* 237 */       bcs bcs1 = blc.c();
/* 238 */       if (bcs1 instanceof bij) {
/* 239 */         ((bij)bcs1).a(☃, el1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean d(axk ☃, el el1) {
/* 245 */     for (eq eq : eq.values()) {
/* 246 */       if (k(☃.a_(el1.a(eq)))) {
/* 247 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 251 */     return false;
/*     */   }
/*     */   
/*     */   private int a(ayc ☃, el el1) {
/* 255 */     if (!☃.c(el1)) {
/* 256 */       return 0;
/*     */     }
/*     */     
/* 259 */     int i = 0;
/* 260 */     for (eq eq : eq.values()) {
/* 261 */       i = Math.max(g(☃.a_(el1.a(eq)).c()), i);
/*     */     }
/*     */     
/* 264 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 269 */     return false;
/*     */   }
/*     */   
/*     */   public boolean k(blc ☃) {
/* 273 */     return (g(☃.c()) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 278 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/* 281 */     if ((axy1.t.q() == bod.a || axy1.t.q() == bod.b) && (
/* 282 */       (bgc)bct.dh).a(axy1, el1)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 287 */     if (!☃.a(axy1, el1)) {
/* 288 */       axy1.g(el1);
/*     */       
/*     */       return;
/*     */     } 
/* 292 */     axy1.J().a(el1, this, a(axy1) + axy1.s.nextInt(10));
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
/*     */   public axl c() {
/* 354 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 359 */     ☃.a((bmm<?>[])new bmm[] { a, b, c, o, p, q });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 364 */     return blb.i;
/*     */   }
/*     */   
/*     */   public void a(bcs ☃, int i, int j) {
/* 368 */     this.s.put(☃, i);
/* 369 */     this.t.put(☃, j);
/*     */   }
/*     */   
/*     */   public static void d() {
/* 373 */     bet ☃ = (bet)bct.ch;
/* 374 */     ☃.a(bct.n, 5, 20);
/* 375 */     ☃.a(bct.o, 5, 20);
/* 376 */     ☃.a(bct.p, 5, 20);
/* 377 */     ☃.a(bct.q, 5, 20);
/* 378 */     ☃.a(bct.r, 5, 20);
/* 379 */     ☃.a(bct.s, 5, 20);
/* 380 */     ☃.a(bct.bD, 5, 20);
/* 381 */     ☃.a(bct.bE, 5, 20);
/* 382 */     ☃.a(bct.bF, 5, 20);
/* 383 */     ☃.a(bct.bG, 5, 20);
/* 384 */     ☃.a(bct.bH, 5, 20);
/* 385 */     ☃.a(bct.bI, 5, 20);
/* 386 */     ☃.a(bct.dN, 5, 20);
/* 387 */     ☃.a(bct.dO, 5, 20);
/* 388 */     ☃.a(bct.dP, 5, 20);
/* 389 */     ☃.a(bct.dQ, 5, 20);
/* 390 */     ☃.a(bct.dR, 5, 20);
/* 391 */     ☃.a(bct.dS, 5, 20);
/* 392 */     ☃.a(bct.cX, 5, 20);
/* 393 */     ☃.a(bct.cY, 5, 20);
/* 394 */     ☃.a(bct.cZ, 5, 20);
/* 395 */     ☃.a(bct.da, 5, 20);
/* 396 */     ☃.a(bct.db, 5, 20);
/* 397 */     ☃.a(bct.dc, 5, 20);
/* 398 */     ☃.a(bct.cj, 5, 20);
/* 399 */     ☃.a(bct.er, 5, 20);
/* 400 */     ☃.a(bct.eq, 5, 20);
/* 401 */     ☃.a(bct.es, 5, 20);
/* 402 */     ☃.a(bct.gr, 5, 20);
/* 403 */     ☃.a(bct.gs, 5, 20);
/* 404 */     ☃.a(bct.J, 5, 5);
/* 405 */     ☃.a(bct.K, 5, 5);
/* 406 */     ☃.a(bct.L, 5, 5);
/* 407 */     ☃.a(bct.M, 5, 5);
/* 408 */     ☃.a(bct.N, 5, 5);
/* 409 */     ☃.a(bct.O, 5, 5);
/* 410 */     ☃.a(bct.P, 5, 5);
/* 411 */     ☃.a(bct.Q, 5, 5);
/* 412 */     ☃.a(bct.R, 5, 5);
/* 413 */     ☃.a(bct.S, 5, 5);
/* 414 */     ☃.a(bct.T, 5, 5);
/* 415 */     ☃.a(bct.U, 5, 5);
/* 416 */     ☃.a(bct.ab, 5, 5);
/* 417 */     ☃.a(bct.ac, 5, 5);
/* 418 */     ☃.a(bct.ad, 5, 5);
/* 419 */     ☃.a(bct.ae, 5, 5);
/* 420 */     ☃.a(bct.af, 5, 5);
/* 421 */     ☃.a(bct.ag, 5, 5);
/* 422 */     ☃.a(bct.V, 5, 5);
/* 423 */     ☃.a(bct.W, 5, 5);
/* 424 */     ☃.a(bct.X, 5, 5);
/* 425 */     ☃.a(bct.Y, 5, 5);
/* 426 */     ☃.a(bct.Z, 5, 5);
/* 427 */     ☃.a(bct.aa, 5, 5);
/* 428 */     ☃.a(bct.ah, 30, 60);
/* 429 */     ☃.a(bct.ai, 30, 60);
/* 430 */     ☃.a(bct.aj, 30, 60);
/* 431 */     ☃.a(bct.ak, 30, 60);
/* 432 */     ☃.a(bct.al, 30, 60);
/* 433 */     ☃.a(bct.am, 30, 60);
/* 434 */     ☃.a(bct.cc, 30, 20);
/* 435 */     ☃.a(bct.cb, 15, 100);
/* 436 */     ☃.a(bct.aR, 60, 100);
/* 437 */     ☃.a(bct.aS, 60, 100);
/* 438 */     ☃.a(bct.aT, 60, 100);
/* 439 */     ☃.a(bct.gu, 60, 100);
/* 440 */     ☃.a(bct.gv, 60, 100);
/* 441 */     ☃.a(bct.gw, 60, 100);
/* 442 */     ☃.a(bct.gx, 60, 100);
/* 443 */     ☃.a(bct.gy, 60, 100);
/* 444 */     ☃.a(bct.gz, 60, 100);
/* 445 */     ☃.a(bct.bp, 60, 100);
/* 446 */     ☃.a(bct.bq, 60, 100);
/* 447 */     ☃.a(bct.br, 60, 100);
/* 448 */     ☃.a(bct.bs, 60, 100);
/* 449 */     ☃.a(bct.bt, 60, 100);
/* 450 */     ☃.a(bct.bu, 60, 100);
/* 451 */     ☃.a(bct.bv, 60, 100);
/* 452 */     ☃.a(bct.bw, 60, 100);
/* 453 */     ☃.a(bct.bx, 60, 100);
/* 454 */     ☃.a(bct.by, 60, 100);
/* 455 */     ☃.a(bct.aY, 30, 60);
/* 456 */     ☃.a(bct.aZ, 30, 60);
/* 457 */     ☃.a(bct.ba, 30, 60);
/* 458 */     ☃.a(bct.bb, 30, 60);
/* 459 */     ☃.a(bct.bc, 30, 60);
/* 460 */     ☃.a(bct.bd, 30, 60);
/* 461 */     ☃.a(bct.be, 30, 60);
/* 462 */     ☃.a(bct.bf, 30, 60);
/* 463 */     ☃.a(bct.bg, 30, 60);
/* 464 */     ☃.a(bct.bh, 30, 60);
/* 465 */     ☃.a(bct.bi, 30, 60);
/* 466 */     ☃.a(bct.bj, 30, 60);
/* 467 */     ☃.a(bct.bk, 30, 60);
/* 468 */     ☃.a(bct.bl, 30, 60);
/* 469 */     ☃.a(bct.bm, 30, 60);
/* 470 */     ☃.a(bct.bn, 30, 60);
/* 471 */     ☃.a(bct.dM, 15, 100);
/* 472 */     ☃.a(bct.go, 5, 5);
/* 473 */     ☃.a(bct.fW, 60, 20);
/* 474 */     ☃.a(bct.fX, 60, 20);
/* 475 */     ☃.a(bct.fY, 60, 20);
/* 476 */     ☃.a(bct.fZ, 60, 20);
/* 477 */     ☃.a(bct.ga, 60, 20);
/* 478 */     ☃.a(bct.gb, 60, 20);
/* 479 */     ☃.a(bct.gc, 60, 20);
/* 480 */     ☃.a(bct.gd, 60, 20);
/* 481 */     ☃.a(bct.ge, 60, 20);
/* 482 */     ☃.a(bct.gf, 60, 20);
/* 483 */     ☃.a(bct.gg, 60, 20);
/* 484 */     ☃.a(bct.gh, 60, 20);
/* 485 */     ☃.a(bct.gi, 60, 20);
/* 486 */     ☃.a(bct.gj, 60, 20);
/* 487 */     ☃.a(bct.gk, 60, 20);
/* 488 */     ☃.a(bct.gl, 60, 20);
/* 489 */     ☃.a(bct.gm, 60, 20);
/* 490 */     ☃.a(bct.jF, 30, 60);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */