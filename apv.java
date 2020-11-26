/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ public abstract class apv
/*     */ {
/*  32 */   public ez<ate> b = ez.a();
/*  33 */   public List<aqx> c = Lists.newArrayList();
/*     */   
/*     */   public int d;
/*     */   
/*  37 */   private int f = -1;
/*     */   private int g;
/*  39 */   private final Set<aqx> h = Sets.newHashSet();
/*     */   
/*  41 */   protected List<aqb> e = Lists.newArrayList();
/*     */   
/*     */   protected aqx a(aqx ☃) {
/*  44 */     ☃.e = this.c.size();
/*  45 */     this.c.add(☃);
/*  46 */     this.b.add(ate.a);
/*  47 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(aqb ☃) {
/*  51 */     if (this.e.contains(☃)) {
/*  52 */       throw new IllegalArgumentException("Listener already listening");
/*     */     }
/*  54 */     this.e.add(☃);
/*     */     
/*  56 */     ☃.a(this, a());
/*  57 */     b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ez<ate> a() {
/*  65 */     ez<ate> ☃ = ez.a();
/*  66 */     for (int i = 0; i < this.c.size(); i++) {
/*  67 */       ☃.add(((aqx)this.c.get(i)).d());
/*     */     }
/*  69 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  79 */     for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/*  80 */       ate ate1 = ((aqx)this.c.get(☃)).d();
/*  81 */       ate ate2 = this.b.get(☃);
/*  82 */       if (!ate.b(ate2, ate1)) {
/*  83 */         ate2 = ate1.a() ? ate.a : ate1.i();
/*  84 */         this.b.set(☃, ate2);
/*  85 */         for (int i = 0; i < this.e.size(); i++) {
/*  86 */           ((aqb)this.e.get(i)).a(this, ☃, ate2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(aog ☃, int i) {
/*  93 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqx a(ade ☃, int i) {
/*  98 */     for (int j = 0; j < this.c.size(); j++) {
/*  99 */       aqx aqx = this.c.get(j);
/* 100 */       if (aqx.a(☃, i)) {
/* 101 */         return aqx;
/*     */       }
/*     */     } 
/* 104 */     return null;
/*     */   }
/*     */   
/*     */   public aqx a(int ☃) {
/* 108 */     return this.c.get(☃);
/*     */   }
/*     */   
/*     */   public ate b(aog ☃, int i) {
/* 112 */     aqx aqx = this.c.get(i);
/* 113 */     if (aqx != null) {
/* 114 */       return aqx.d();
/*     */     }
/* 116 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i, aqa aqa1, aog aog1) {
/* 121 */     ate ate = ate.a;
/* 122 */     aof aof = aog1.bB;
/*     */     
/* 124 */     if (aqa1 == aqa.f) {
/* 125 */       int j = this.g;
/* 126 */       this.g = c(i);
/*     */       
/* 128 */       if ((j != 1 || this.g != 2) && j != this.g) {
/* 129 */         c();
/* 130 */       } else if (aof.s().a()) {
/* 131 */         c();
/* 132 */       } else if (this.g == 0) {
/* 133 */         this.f = b(i);
/*     */         
/* 135 */         if (a(this.f, aog1)) {
/* 136 */           this.g = 1;
/* 137 */           this.h.clear();
/*     */         } else {
/* 139 */           c();
/*     */         } 
/* 141 */       } else if (this.g == 1) {
/* 142 */         aqx aqx = this.c.get(☃);
/*     */         
/* 144 */         ate ate1 = aof.s();
/* 145 */         if (aqx != null && a(aqx, ate1, true) && aqx.a(ate1) && (this.f == 2 || ate1.C() > this.h.size()) && b(aqx)) {
/* 146 */           this.h.add(aqx);
/*     */         }
/* 148 */       } else if (this.g == 2) {
/* 149 */         if (!this.h.isEmpty()) {
/* 150 */           ate ate1 = aof.s().i();
/* 151 */           int k = aof.s().C();
/*     */           
/* 153 */           for (aqx aqx : this.h) {
/* 154 */             ate ate2 = aof.s();
/* 155 */             if (aqx != null && a(aqx, ate2, true) && aqx.a(ate2) && (this.f == 2 || ate2.C() >= this.h.size()) && b(aqx)) {
/* 156 */               ate ate3 = ate1.i();
/* 157 */               int m = aqx.e() ? aqx.d().C() : 0;
/* 158 */               a(this.h, this.f, ate3, m);
/*     */               
/* 160 */               int n = Math.min(ate3.c(), aqx.b(ate3));
/* 161 */               if (ate3.C() > n) {
/* 162 */                 ate3.e(n);
/*     */               }
/*     */               
/* 165 */               k -= ate3.C() - m;
/* 166 */               aqx.d(ate3);
/*     */             } 
/*     */           } 
/*     */           
/* 170 */           ate1.e(k);
/* 171 */           aof.g(ate1);
/*     */         } 
/*     */         
/* 174 */         c();
/*     */       } else {
/* 176 */         c();
/*     */       } 
/* 178 */     } else if (this.g != 0) {
/* 179 */       c();
/* 180 */     } else if ((aqa1 == aqa.a || aqa1 == aqa.b) && (i == 0 || i == 1)) {
/* 181 */       if (☃ == -999) {
/* 182 */         if (!aof.s().a()) {
/* 183 */           if (i == 0) {
/* 184 */             aog1.a(aof.s(), true);
/* 185 */             aof.g(ate.a);
/*     */           } 
/* 187 */           if (i == 1) {
/* 188 */             aog1.a(aof.s().a(1), true);
/*     */           }
/*     */         } 
/* 191 */       } else if (aqa1 == aqa.b) {
/* 192 */         if (☃ < 0) {
/* 193 */           return ate.a;
/*     */         }
/* 195 */         aqx aqx = this.c.get(☃);
/* 196 */         if (aqx == null || !aqx.a(aog1)) {
/* 197 */           return ate.a;
/*     */         }
/*     */         
/* 200 */         ate ate1 = b(aog1, ☃);
/* 201 */         while (!ate1.a() && ate.c(aqx.d(), ate1)) {
/* 202 */           ate = ate1.i();
/* 203 */           ate1 = b(aog1, ☃);
/*     */         } 
/*     */       } else {
/* 206 */         if (☃ < 0) {
/* 207 */           return ate.a;
/*     */         }
/*     */         
/* 210 */         aqx aqx = this.c.get(☃);
/* 211 */         if (aqx != null) {
/* 212 */           ate ate1 = aqx.d();
/* 213 */           ate ate2 = aof.s();
/*     */           
/* 215 */           if (!ate1.a()) {
/* 216 */             ate = ate1.i();
/*     */           }
/*     */           
/* 219 */           if (ate1.a()) {
/* 220 */             if (!ate2.a() && aqx.a(ate2)) {
/* 221 */               int j = (i == 0) ? ate2.C() : 1;
/* 222 */               if (j > aqx.b(ate2)) {
/* 223 */                 j = aqx.b(ate2);
/*     */               }
/*     */               
/* 226 */               aqx.d(ate2.a(j));
/*     */             } 
/* 228 */           } else if (aqx.a(aog1)) {
/* 229 */             if (ate2.a()) {
/* 230 */               if (ate1.a()) {
/* 231 */                 aqx.d(ate.a);
/* 232 */                 aof.g(ate.a);
/*     */               } else {
/* 234 */                 int j = (i == 0) ? ate1.C() : ((ate1.C() + 1) / 2);
/*     */                 
/* 236 */                 aof.g(aqx.a(j));
/* 237 */                 if (ate1.a()) {
/* 238 */                   aqx.d(ate.a);
/*     */                 }
/* 240 */                 aqx.a(aog1, aof.s());
/*     */               } 
/* 242 */             } else if (aqx.a(ate2)) {
/*     */               
/* 244 */               if (a(ate1, ate2)) {
/*     */                 
/* 246 */                 int j = (i == 0) ? ate2.C() : 1;
/* 247 */                 if (j > aqx.b(ate2) - ate1.C()) {
/* 248 */                   j = aqx.b(ate2) - ate1.C();
/*     */                 }
/* 250 */                 if (j > ate2.c() - ate1.C()) {
/* 251 */                   j = ate2.c() - ate1.C();
/*     */                 }
/* 253 */                 ate2.g(j);
/* 254 */                 ate1.f(j);
/*     */               
/*     */               }
/* 257 */               else if (ate2.C() <= aqx.b(ate2)) {
/* 258 */                 aqx.d(ate2);
/* 259 */                 aof.g(ate1);
/*     */               }
/*     */             
/* 262 */             } else if (ate2.c() > 1 && a(ate1, ate2)) {
/*     */               
/* 264 */               if (!ate1.a()) {
/* 265 */                 int j = ate1.C();
/* 266 */                 if (j + ate2.C() <= ate2.c()) {
/* 267 */                   ate2.f(j);
/* 268 */                   ate1 = aqx.a(j);
/* 269 */                   if (ate1.a()) {
/* 270 */                     aqx.d(ate.a);
/*     */                   }
/* 272 */                   aqx.a(aog1, aof.s());
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/* 277 */           aqx.f();
/*     */         } 
/*     */       } 
/* 280 */     } else if (aqa1 == aqa.c && i >= 0 && i < 9) {
/* 281 */       aqx aqx = this.c.get(☃);
/* 282 */       ate ate1 = aof.a(i);
/*     */       
/* 284 */       ate ate2 = aqx.d();
/* 285 */       if (!ate1.a() || !ate2.a())
/*     */       {
/* 287 */         if (ate1.a()) {
/*     */           
/* 289 */           if (aqx.a(aog1)) {
/* 290 */             aof.a(i, ate2);
/* 291 */             aqx.b(ate2.C());
/* 292 */             aqx.d(ate.a);
/* 293 */             aqx.a(aog1, ate2);
/*     */           } 
/* 295 */         } else if (ate2.a()) {
/* 296 */           if (aqx.a(ate1)) {
/* 297 */             int j = aqx.b(ate1);
/* 298 */             if (ate1.C() > j) {
/*     */               
/* 300 */               aqx.d(ate1.a(j));
/*     */             } else {
/*     */               
/* 303 */               aqx.d(ate1);
/* 304 */               aof.a(i, ate.a);
/*     */             } 
/*     */           } 
/* 307 */         } else if (aqx.a(aog1) && aqx.a(ate1)) {
/*     */ 
/*     */           
/* 310 */           int j = aqx.b(ate1);
/* 311 */           if (ate1.C() > j) {
/* 312 */             aqx.d(ate1.a(j));
/* 313 */             aqx.a(aog1, ate2);
/* 314 */             if (!aof.e(ate2)) {
/* 315 */               aog1.a(ate2, true);
/*     */             }
/*     */           } else {
/* 318 */             aqx.d(ate1);
/* 319 */             aof.a(i, ate2);
/* 320 */             aqx.a(aog1, ate2);
/*     */           } 
/*     */         }  } 
/* 323 */     } else if (aqa1 == aqa.d && aog1.bV.d && aof.s().a() && ☃ >= 0) {
/* 324 */       aqx aqx = this.c.get(☃);
/* 325 */       if (aqx != null && aqx.e()) {
/* 326 */         ate ate1 = aqx.d().i();
/* 327 */         ate1.e(ate1.c());
/* 328 */         aof.g(ate1);
/*     */       } 
/* 330 */     } else if (aqa1 == aqa.e && aof.s().a() && ☃ >= 0) {
/* 331 */       aqx aqx = this.c.get(☃);
/* 332 */       if (aqx != null && aqx.e() && aqx.a(aog1)) {
/* 333 */         ate ate1 = aqx.a((i == 0) ? 1 : aqx.d().C());
/* 334 */         aqx.a(aog1, ate1);
/* 335 */         aog1.a(ate1, true);
/*     */       } 
/* 337 */     } else if (aqa1 == aqa.g && ☃ >= 0) {
/* 338 */       aqx aqx = this.c.get(☃);
/* 339 */       ate ate1 = aof.s();
/*     */       
/* 341 */       if (!ate1.a() && (aqx == null || !aqx.e() || !aqx.a(aog1))) {
/* 342 */         int j = (i == 0) ? 0 : (this.c.size() - 1);
/* 343 */         int k = (i == 0) ? 1 : -1;
/*     */         
/* 345 */         for (int m = 0; m < 2; m++) {
/*     */           int n;
/* 347 */           for (n = j; n >= 0 && n < this.c.size() && ate1.C() < ate1.c(); n += k) {
/* 348 */             aqx aqx1 = this.c.get(n);
/*     */             
/* 350 */             if (aqx1.e() && a(aqx1, ate1, true) && aqx1.a(aog1) && a(ate1, aqx1)) {
/* 351 */               ate ate2 = aqx1.d();
/* 352 */               if (m != 0 || ate2.C() != ate2.c()) {
/*     */ 
/*     */                 
/* 355 */                 int i1 = Math.min(ate1.c() - ate1.C(), ate2.C());
/* 356 */                 ate ate3 = aqx1.a(i1);
/* 357 */                 ate1.f(i1);
/*     */                 
/* 359 */                 if (ate3.a()) {
/* 360 */                   aqx1.d(ate.a);
/*     */                 }
/* 362 */                 aqx1.a(aog1, ate3);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 368 */       b();
/*     */     } 
/*     */     
/* 371 */     return ate;
/*     */   }
/*     */   
/*     */   public static boolean a(ate ☃, ate ate1) {
/* 375 */     return (☃.b() == ate1.b() && ate.a(☃, ate1));
/*     */   }
/*     */   
/*     */   public boolean a(ate ☃, aqx aqx1) {
/* 379 */     return true;
/*     */   }
/*     */   
/*     */   public void b(aog ☃) {
/* 383 */     aof aof = ☃.bB;
/* 384 */     if (!aof.s().a()) {
/* 385 */       ☃.a(aof.s(), false);
/* 386 */       aof.g(ate.a);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(aog ☃, axy axy1, ade ade1) {
/* 391 */     if (!☃.aF() || (☃ instanceof tf && ((tf)☃).o())) {
/* 392 */       for (int j = 0; j < ade1.T_(); j++) {
/* 393 */         ☃.a(ade1.b(j), false);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 398 */     for (int i = 0; i < ade1.T_(); i++) {
/* 399 */       ☃.bB.a(axy1, ade1.b(i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ade ☃) {
/* 404 */     b();
/*     */   }
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/* 408 */     a(☃).d(ate1);
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
/* 434 */   private final Set<aog> i = Sets.newHashSet();
/*     */   
/*     */   public boolean c(aog ☃) {
/* 437 */     return !this.i.contains(☃);
/*     */   }
/*     */   
/*     */   public void a(aog ☃, boolean bool) {
/* 441 */     if (bool) {
/* 442 */       this.i.remove(☃);
/*     */     } else {
/* 444 */       this.i.add(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public abstract boolean a(aog paramaog);
/*     */   
/*     */   protected boolean a(ate ☃, int i, int j, boolean bool) {
/* 451 */     boolean bool1 = false;
/*     */     
/* 453 */     int k = i;
/* 454 */     if (bool) {
/* 455 */       k = j - 1;
/*     */     }
/*     */ 
/*     */     
/* 459 */     if (☃.d()) {
/* 460 */       while (!☃.a() && (bool ? (k >= i) : (k < j))) {
/* 461 */         aqx aqx = this.c.get(k);
/* 462 */         ate ate1 = aqx.d();
/* 463 */         if (!ate1.a() && a(☃, ate1)) {
/* 464 */           int m = ate1.C() + ☃.C();
/* 465 */           if (m <= ☃.c()) {
/* 466 */             ☃.e(0);
/* 467 */             ate1.e(m);
/* 468 */             aqx.f();
/* 469 */             bool1 = true;
/* 470 */           } else if (ate1.C() < ☃.c()) {
/* 471 */             ☃.g(☃.c() - ate1.C());
/* 472 */             ate1.e(☃.c());
/* 473 */             aqx.f();
/* 474 */             bool1 = true;
/*     */           } 
/*     */         } 
/*     */         
/* 478 */         if (bool) {
/* 479 */           k--; continue;
/*     */         } 
/* 481 */         k++;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 487 */     if (!☃.a()) {
/* 488 */       if (bool) {
/* 489 */         k = j - 1;
/*     */       } else {
/* 491 */         k = i;
/*     */       } 
/* 493 */       while (bool ? (k >= i) : (k < j)) {
/* 494 */         aqx aqx = this.c.get(k);
/* 495 */         ate ate1 = aqx.d();
/*     */         
/* 497 */         if (ate1.a() && aqx.a(☃)) {
/* 498 */           if (☃.C() > aqx.a()) {
/* 499 */             aqx.d(☃.a(aqx.a()));
/*     */           } else {
/* 501 */             aqx.d(☃.a(☃.C()));
/*     */           } 
/* 503 */           aqx.f();
/* 504 */           bool1 = true;
/*     */           
/*     */           break;
/*     */         } 
/* 508 */         if (bool) {
/* 509 */           k--; continue;
/*     */         } 
/* 511 */         k++;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 516 */     return bool1;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/* 520 */     return ☃ >> 2 & 0x3;
/*     */   }
/*     */   
/*     */   public static int c(int ☃) {
/* 524 */     return ☃ & 0x3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(int ☃, aog aog1) {
/* 532 */     if (☃ == 0) {
/* 533 */       return true;
/*     */     }
/* 535 */     if (☃ == 1) {
/* 536 */       return true;
/*     */     }
/* 538 */     if (☃ == 2 && aog1.bV.d) {
/* 539 */       return true;
/*     */     }
/* 541 */     return false;
/*     */   }
/*     */   
/*     */   protected void c() {
/* 545 */     this.g = 0;
/* 546 */     this.h.clear();
/*     */   }
/*     */   
/*     */   public static boolean a(@Nullable aqx ☃, ate ate1, boolean bool) {
/* 550 */     boolean bool1 = (☃ == null || !☃.e());
/*     */     
/* 552 */     if (!bool1 && ate1.a(☃.d()) && ate.a(☃.d(), ate1)) {
/* 553 */       return (☃.d().C() + (bool ? 0 : ate1.C()) <= ate1.c());
/*     */     }
/*     */     
/* 556 */     return bool1;
/*     */   }
/*     */   
/*     */   public static void a(Set<aqx> ☃, int i, ate ate1, int j) {
/* 560 */     switch (i) {
/*     */       case 0:
/* 562 */         ate1.e(xq.d(ate1.C() / ☃.size()));
/*     */         break;
/*     */       case 1:
/* 565 */         ate1.e(1);
/*     */         break;
/*     */       case 2:
/* 568 */         ate1.e(ate1.b().i());
/*     */         break;
/*     */     } 
/*     */     
/* 572 */     ate1.f(j);
/*     */   }
/*     */   
/*     */   public boolean b(aqx ☃) {
/* 576 */     return true;
/*     */   }
/*     */   
/*     */   public static int a(@Nullable bji ☃) {
/* 580 */     if (☃ instanceof ade) {
/* 581 */       return b((ade)☃);
/*     */     }
/*     */     
/* 584 */     return 0;
/*     */   }
/*     */   
/*     */   public static int b(@Nullable ade ☃) {
/* 588 */     if (☃ == null) {
/* 589 */       return 0;
/*     */     }
/* 591 */     int i = 0;
/* 592 */     float f = 0.0F;
/*     */     
/* 594 */     for (int j = 0; j < ☃.T_(); j++) {
/* 595 */       ate ate = ☃.a(j);
/*     */       
/* 597 */       if (!ate.a()) {
/* 598 */         f += ate.C() / Math.min(☃.f(), ate.c());
/* 599 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 603 */     f /= ☃.T_();
/* 604 */     return xq.d(f * 14.0F) + ((i > 0) ? 1 : 0);
/*     */   }
/*     */   
/*     */   protected void a(axy ☃, aog aog1, ade ade1, aqt aqt1) {
/* 608 */     if (☃.B) {
/*     */       return;
/*     */     }
/*     */     
/* 612 */     tf tf = (tf)aog1;
/* 613 */     ate ate = ate.a;
/* 614 */     avk avk = ☃.z().aK().b(ade1, ☃);
/* 615 */     if (aqt1.a(☃, tf, avk) && avk != null) {
/* 616 */       ate = avk.a(ade1);
/*     */     }
/*     */     
/* 619 */     aqt1.a(0, ate);
/* 620 */     tf.a.a(new jw(this.d, 0, ate));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */