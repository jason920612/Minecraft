/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class aof
/*     */   implements ade
/*     */ {
/*  36 */   public final ez<ate> a = ez.a(36, ate.a);
/*  37 */   public final ez<ate> b = ez.a(4, ate.a);
/*  38 */   public final ez<ate> c = ez.a(1, ate.a);
/*  39 */   private final List<ez<ate>> f = (List<ez<ate>>)ImmutableList.of(this.a, this.b, this.c);
/*     */   
/*     */   public int d;
/*     */   public aog e;
/*  43 */   private ate g = ate.a;
/*     */   
/*     */   private int h;
/*     */   
/*     */   public aof(aog ☃) {
/*  48 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ate i() {
/*  54 */     if (e(this.d)) {
/*  55 */       return this.a.get(this.d);
/*     */     }
/*  57 */     return ate.a;
/*     */   }
/*     */   
/*     */   public static int j() {
/*  61 */     return 9;
/*     */   }
/*     */   
/*     */   private boolean a(ate ☃, ate ate1) {
/*  65 */     return (!☃.a() && 
/*  66 */       b(☃, ate1) && ☃
/*  67 */       .d() && ☃
/*  68 */       .C() < ☃.c() && ☃
/*  69 */       .C() < f());
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean b(ate ☃, ate ate1) {
/*  74 */     return (☃.b() == ate1.b() && ate.a(☃, ate1));
/*     */   }
/*     */   
/*     */   public int k() {
/*  78 */     for (int ☃ = 0; ☃ < this.a.size(); ☃++) {
/*  79 */       if (((ate)this.a.get(☃)).a()) {
/*  80 */         return ☃;
/*     */       }
/*     */     } 
/*  83 */     return -1;
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
/*     */   public void d(int ☃) {
/* 111 */     this.d = l();
/*     */ 
/*     */     
/* 114 */     ate ate1 = this.a.get(this.d);
/* 115 */     this.a.set(this.d, this.a.get(☃));
/* 116 */     this.a.set(☃, ate1);
/*     */   }
/*     */   
/*     */   public static boolean e(int ☃) {
/* 120 */     return (☃ >= 0 && ☃ < 9);
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
/*     */   public int c(ate ☃) {
/* 133 */     for (int i = 0; i < this.a.size(); i++) {
/* 134 */       ate ate1 = this.a.get(i);
/* 135 */       if (!((ate)this.a.get(i)).a() && 
/* 136 */         b(☃, this.a.get(i)) && 
/* 137 */         !((ate)this.a.get(i)).f() && 
/* 138 */         !ate1.w() && 
/* 139 */         !ate1.s())
/*     */       {
/* 141 */         return i;
/*     */       }
/*     */     } 
/* 144 */     return -1;
/*     */   }
/*     */   
/*     */   public int l() {
/*     */     int ☃;
/* 149 */     for (☃ = 0; ☃ < 9; ☃++) {
/* 150 */       int i = (this.d + ☃) % 9;
/*     */       
/* 152 */       if (((ate)this.a.get(i)).a()) {
/* 153 */         return i;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 158 */     for (☃ = 0; ☃ < 9; ☃++) {
/* 159 */       int i = (this.d + ☃) % 9;
/*     */       
/* 161 */       if (!((ate)this.a.get(i)).w()) {
/* 162 */         return i;
/*     */       }
/*     */     } 
/*     */     
/* 166 */     return this.d;
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
/*     */   public int a(Predicate<ate> ☃, int i) {
/* 188 */     int j = 0;
/*     */     int k;
/* 190 */     for (k = 0; k < T_(); k++) {
/* 191 */       ate ate1 = a(k);
/* 192 */       if (!ate1.a() && ☃.test(ate1)) {
/*     */ 
/*     */ 
/*     */         
/* 196 */         int m = (i <= 0) ? ate1.C() : Math.min(i - j, ate1.C());
/* 197 */         j += m;
/* 198 */         if (i != 0) {
/* 199 */           ate1.g(m);
/*     */           
/* 201 */           if (ate1.a()) {
/* 202 */             a(k, ate.a);
/*     */           }
/* 204 */           if (i > 0 && j >= i) {
/* 205 */             return j;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 210 */     if (!this.g.a() && ☃.test(this.g)) {
/* 211 */       k = (i <= 0) ? this.g.C() : Math.min(i - j, this.g.C());
/* 212 */       j += k;
/* 213 */       if (i != 0) {
/* 214 */         this.g.g(k);
/* 215 */         if (this.g.a()) {
/* 216 */           this.g = ate.a;
/*     */         }
/* 218 */         if (i > 0 && j >= i) {
/* 219 */           return j;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 224 */     return j;
/*     */   }
/*     */   
/*     */   private int i(ate ☃) {
/* 228 */     int i = d(☃);
/* 229 */     if (i == -1) {
/* 230 */       i = k();
/*     */     }
/* 232 */     if (i == -1) {
/* 233 */       return ☃.C();
/*     */     }
/* 235 */     return d(i, ☃);
/*     */   }
/*     */   
/*     */   private int d(int ☃, ate ate1) {
/* 239 */     ata ata = ate1.b();
/* 240 */     int i = ate1.C();
/*     */     
/* 242 */     ate ate2 = a(☃);
/* 243 */     if (ate2.a()) {
/* 244 */       ate2 = new ate(ata, 0);
/* 245 */       if (ate1.m()) {
/* 246 */         ate2.c(ate1.n().f());
/*     */       }
/* 248 */       a(☃, ate2);
/*     */     } 
/*     */     
/* 251 */     int j = i;
/* 252 */     if (j > ate2.c() - ate2.C()) {
/* 253 */       j = ate2.c() - ate2.C();
/*     */     }
/* 255 */     if (j > f() - ate2.C()) {
/* 256 */       j = f() - ate2.C();
/*     */     }
/*     */     
/* 259 */     if (j == 0) {
/* 260 */       return i;
/*     */     }
/*     */     
/* 263 */     i -= j;
/* 264 */     ate2.f(j);
/* 265 */     ate2.d(5);
/*     */     
/* 267 */     return i;
/*     */   }
/*     */   
/*     */   public int d(ate ☃) {
/* 271 */     if (a(a(this.d), ☃)) {
/* 272 */       return this.d;
/*     */     }
/* 274 */     if (a(a(40), ☃)) {
/* 275 */       return 40;
/*     */     }
/* 277 */     for (int i = 0; i < this.a.size(); i++) {
/* 278 */       if (a(this.a.get(i), ☃)) {
/* 279 */         return i;
/*     */       }
/*     */     } 
/* 282 */     return -1;
/*     */   }
/*     */   
/*     */   public void p() {
/* 286 */     for (ez<ate> ☃ : this.f) {
/* 287 */       for (int i = 0; i < ☃.size(); i++) {
/* 288 */         if (!((ate)☃.get(i)).a()) {
/* 289 */           ((ate)☃.get(i)).a(this.e.m, this.e, i, (this.d == i));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e(ate ☃) {
/* 296 */     return c(-1, ☃);
/*     */   }
/*     */   
/*     */   public boolean c(int ☃, ate ate1) {
/* 300 */     if (ate1.a()) {
/* 301 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 305 */       if (!ate1.f()) {
/*     */         int i;
/*     */         do {
/* 308 */           i = ate1.C();
/* 309 */           if (☃ == -1) {
/* 310 */             ate1.e(i(ate1));
/*     */           } else {
/* 312 */             ate1.e(d(☃, ate1));
/*     */           } 
/* 314 */         } while (!ate1.a() && ate1.C() < i);
/* 315 */         if (ate1.C() == i && this.e.bV.d) {
/*     */           
/* 317 */           ate1.e(0);
/* 318 */           return true;
/*     */         } 
/* 320 */         return (ate1.C() < i);
/*     */       } 
/*     */       
/* 323 */       if (☃ == -1) {
/* 324 */         ☃ = k();
/*     */       }
/* 326 */       if (☃ >= 0) {
/* 327 */         this.a.set(☃, ate1.i());
/* 328 */         ((ate)this.a.get(☃)).d(5);
/* 329 */         ate1.e(0);
/* 330 */         return true;
/* 331 */       }  if (this.e.bV.d) {
/*     */         
/* 333 */         ate1.e(0);
/* 334 */         return true;
/*     */       } 
/* 336 */       return false;
/* 337 */     } catch (Throwable throwable) {
/* 338 */       b b = b.a(throwable, "Adding item to inventory");
/* 339 */       c c = b.a("Item being added");
/*     */       
/* 341 */       c.a("Item ID", Integer.valueOf(ata.a(ate1.b())));
/* 342 */       c.a("Item data", Integer.valueOf(ate1.g()));
/* 343 */       c.a("Item name", () -> ☃.q().getString());
/*     */       
/* 345 */       throw new h(b);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(axy ☃, ate ate1) {
/* 350 */     if (☃.B) {
/*     */       return;
/*     */     }
/*     */     
/* 354 */     while (!ate1.a()) {
/* 355 */       int i = d(ate1);
/* 356 */       if (i == -1) {
/* 357 */         i = k();
/*     */       }
/*     */       
/* 360 */       if (i == -1) {
/* 361 */         this.e.a(ate1, false);
/*     */         
/*     */         break;
/*     */       } 
/* 365 */       int j = ate1.c() - a(i).C();
/*     */       
/* 367 */       if (c(i, ate1.a(j))) {
/* 368 */         ((tf)this.e).a.a(new jw(-2, i, a(i)));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/* 375 */     List<ate> list = null;
/*     */     
/* 377 */     for (ez<ate> ez1 : this.f) {
/* 378 */       if (☃ < ez1.size()) {
/* 379 */         list = ez1;
/*     */         break;
/*     */       } 
/* 382 */       ☃ -= ez1.size();
/*     */     } 
/*     */ 
/*     */     
/* 386 */     if (list != null && !((ate)list.get(☃)).a()) {
/* 387 */       return adf.a(list, ☃, i);
/*     */     }
/* 389 */     return ate.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f(ate ☃) {
/* 398 */     for (ez<ate> ez1 : this.f) {
/* 399 */       for (int i = 0; i < ez1.size(); i++) {
/* 400 */         if (ez1.get(i) == ☃) {
/* 401 */           ez1.set(i, ate.a);
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/* 410 */     ez<ate> ez1 = null;
/*     */     
/* 412 */     for (ez<ate> ez2 : this.f) {
/* 413 */       if (☃ < ez2.size()) {
/* 414 */         ez1 = ez2;
/*     */         break;
/*     */       } 
/* 417 */       ☃ -= ez2.size();
/*     */     } 
/*     */     
/* 420 */     if (ez1 != null && !((ate)ez1.get(☃)).a()) {
/* 421 */       ate ate1 = ez1.get(☃);
/* 422 */       ez1.set(☃, ate.a);
/* 423 */       return ate1;
/*     */     } 
/* 425 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/* 430 */     ez<ate> ez1 = null;
/*     */     
/* 432 */     for (ez<ate> ez2 : this.f) {
/* 433 */       if (☃ < ez2.size()) {
/* 434 */         ez1 = ez2;
/*     */         break;
/*     */       } 
/* 437 */       ☃ -= ez2.size();
/*     */     } 
/*     */ 
/*     */     
/* 441 */     if (ez1 != null) {
/* 442 */       ez1.set(☃, ate1);
/*     */     }
/*     */   }
/*     */   
/*     */   public float a(blc ☃) {
/* 447 */     return ((ate)this.a.get(this.d)).a(☃);
/*     */   }
/*     */   
/*     */   public he a(he ☃) {
/*     */     int i;
/* 452 */     for (i = 0; i < this.a.size(); i++) {
/* 453 */       if (!((ate)this.a.get(i)).a()) {
/* 454 */         gy gy = new gy();
/* 455 */         gy.a("Slot", (byte)i);
/* 456 */         ((ate)this.a.get(i)).b(gy);
/* 457 */         ☃.a(gy);
/*     */       } 
/*     */     } 
/* 460 */     for (i = 0; i < this.b.size(); i++) {
/* 461 */       if (!((ate)this.b.get(i)).a()) {
/* 462 */         gy gy = new gy();
/* 463 */         gy.a("Slot", (byte)(i + 100));
/* 464 */         ((ate)this.b.get(i)).b(gy);
/* 465 */         ☃.a(gy);
/*     */       } 
/*     */     } 
/* 468 */     for (i = 0; i < this.c.size(); i++) {
/* 469 */       if (!((ate)this.c.get(i)).a()) {
/* 470 */         gy gy = new gy();
/* 471 */         gy.a("Slot", (byte)(i + 150));
/* 472 */         ((ate)this.c.get(i)).b(gy);
/* 473 */         ☃.a(gy);
/*     */       } 
/*     */     } 
/* 476 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(he ☃) {
/* 480 */     this.a.clear();
/* 481 */     this.b.clear();
/* 482 */     this.c.clear();
/* 483 */     for (int i = 0; i < ☃.size(); i++) {
/* 484 */       gy gy = ☃.e(i);
/* 485 */       int j = gy.f("Slot") & 0xFF;
/* 486 */       ate ate1 = ate.a(gy);
/* 487 */       if (!ate1.a()) {
/* 488 */         if (j >= 0 && j < this.a.size()) {
/* 489 */           this.a.set(j, ate1);
/* 490 */         } else if (j >= 100 && j < this.b.size() + 100) {
/* 491 */           this.b.set(j - 100, ate1);
/* 492 */         } else if (j >= 150 && j < this.c.size() + 150) {
/* 493 */           this.c.set(j - 150, ate1);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/* 501 */     return this.a.size() + this.b.size() + this.c.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/* 506 */     for (ate ☃ : this.a) {
/* 507 */       if (!☃.a()) {
/* 508 */         return false;
/*     */       }
/*     */     } 
/* 511 */     for (ate ☃ : this.b) {
/* 512 */       if (!☃.a()) {
/* 513 */         return false;
/*     */       }
/*     */     } 
/* 516 */     for (ate ☃ : this.c) {
/* 517 */       if (!☃.a()) {
/* 518 */         return false;
/*     */       }
/*     */     } 
/* 521 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/* 526 */     List<ate> list = null;
/*     */     
/* 528 */     for (ez<ate> ez1 : this.f) {
/* 529 */       if (☃ < ez1.size()) {
/* 530 */         list = ez1;
/*     */         break;
/*     */       } 
/* 533 */       ☃ -= ez1.size();
/*     */     } 
/*     */ 
/*     */     
/* 537 */     return (list == null) ? ate.a : list.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 542 */     return new ir("container.inventory", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/* 548 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 553 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 558 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean b(blc ☃) {
/* 562 */     return a(this.d).b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 570 */     if (☃ <= 0.0F) {
/*     */       return;
/*     */     }
/*     */     
/* 574 */     ☃ /= 4.0F;
/* 575 */     if (☃ < 1.0F) {
/* 576 */       ☃ = 1.0F;
/*     */     }
/* 578 */     for (int i = 0; i < this.b.size(); i++) {
/* 579 */       ate ate1 = this.b.get(i);
/* 580 */       if (ate1.b() instanceof arb) {
/* 581 */         ate1.a((int)☃, this.e);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void q() {
/* 587 */     for (List<ate> ☃ : this.f) {
/* 588 */       for (int i = 0; i < ☃.size(); i++) {
/* 589 */         ate ate1 = ☃.get(i);
/* 590 */         if (!ate1.a()) {
/* 591 */           this.e.a(ate1, true, false);
/* 592 */           ☃.set(i, ate.a);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/* 600 */     this.h++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(ate ☃) {
/* 608 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public ate s() {
/* 612 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 617 */     if (this.e.G) {
/* 618 */       return false;
/*     */     }
/* 620 */     if (☃.h(this.e) > 64.0D) {
/* 621 */       return false;
/*     */     }
/* 623 */     return true;
/*     */   }
/*     */   
/*     */   public boolean h(ate ☃) {
/* 627 */     for (List<ate> list : this.f) {
/* 628 */       for (ate ate1 : list) {
/* 629 */         if (!ate1.a() && ate1.a(☃)) {
/* 630 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 634 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1) {
/* 658 */     return true;
/*     */   }
/*     */   
/*     */   public void a(aof ☃) {
/* 662 */     for (int i = 0; i < T_(); i++) {
/* 663 */       a(i, ☃.a(i));
/*     */     }
/* 665 */     this.d = ☃.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 670 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 679 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 684 */     for (List<ate> ☃ : this.f) {
/* 685 */       ☃.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aoi ☃) {
/* 690 */     for (ate ate1 : this.a)
/* 691 */       ☃.a(ate1); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */