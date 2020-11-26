/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bjw
/*     */   extends bka
/*     */   implements bjv, pt
/*     */ {
/*  41 */   private ez<ate> e = ez.a(5, ate.a);
/*  42 */   private int f = -1;
/*     */   private long j;
/*     */   
/*     */   public bjw() {
/*  46 */     super(bjj.q);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  51 */     super.b(☃);
/*     */     
/*  53 */     this.e = ez.a(T_(), ate.a);
/*  54 */     if (!d(☃)) {
/*  55 */       adf.b(☃, this.e);
/*     */     }
/*     */     
/*  58 */     if (☃.c("CustomName", 8)) {
/*  59 */       a(ij.a.a(☃.l("CustomName")));
/*     */     }
/*  61 */     this.f = ☃.h("TransferCooldown");
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  66 */     super.a(☃);
/*     */     
/*  68 */     if (!e(☃)) {
/*  69 */       adf.a(☃, this.e);
/*     */     }
/*     */     
/*  72 */     ☃.b("TransferCooldown", this.f);
/*     */     
/*  74 */     ij ij = e();
/*  75 */     if (ij != null) {
/*  76 */       ☃.a("CustomName", ij.a.a(ij));
/*     */     }
/*     */     
/*  79 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  84 */     return this.e.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/*  89 */     d((aog)null);
/*     */ 
/*     */     
/*  92 */     return adf.a(q(), ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/*  97 */     d((aog)null);
/*  98 */     q().set(☃, ate1);
/*  99 */     if (ate1.C() > f()) {
/* 100 */       ate1.e(f());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 107 */     if (this.i != null) {
/* 108 */       return this.i;
/*     */     }
/* 110 */     return new ir("container.hopper", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 115 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 120 */     if (this.c_ == null || this.c_.B) {
/*     */       return;
/*     */     }
/*     */     
/* 124 */     this.f--;
/* 125 */     this.j = this.c_.V();
/*     */     
/* 127 */     if (!E()) {
/* 128 */       d(0);
/* 129 */       a(() -> Boolean.valueOf(a(this)));
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(Supplier<Boolean> ☃) {
/* 134 */     if (this.c_ == null || this.c_.B) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     if (!E() && ((Boolean)w().c(bfh.b)).booleanValue()) {
/* 139 */       boolean bool = false;
/*     */       
/* 141 */       if (!p()) {
/* 142 */         bool = s();
/*     */       }
/* 144 */       if (!r()) {
/* 145 */         bool |= ((Boolean)☃.get()).booleanValue();
/*     */       }
/*     */       
/* 148 */       if (bool) {
/* 149 */         d(8);
/* 150 */         g();
/* 151 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 155 */     return false;
/*     */   }
/*     */   
/*     */   private boolean p() {
/* 159 */     for (ate ☃ : this.e) {
/* 160 */       if (!☃.a()) {
/* 161 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 165 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/* 170 */     return p();
/*     */   }
/*     */   
/*     */   private boolean r() {
/* 174 */     for (ate ☃ : this.e) {
/* 175 */       if (☃.a() || ☃.C() != ☃.c()) {
/* 176 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 180 */     return true;
/*     */   }
/*     */   
/*     */   private boolean s() {
/* 184 */     ade ☃ = D();
/* 185 */     if (☃ == null) {
/* 186 */       return false;
/*     */     }
/*     */     
/* 189 */     eq eq = ((eq)w().c(bfh.a)).d();
/* 190 */     if (a(☃, eq)) {
/* 191 */       return false;
/*     */     }
/*     */     
/* 194 */     for (int i = 0; i < T_(); i++) {
/* 195 */       if (!a(i).a()) {
/*     */ 
/*     */ 
/*     */         
/* 199 */         ate ate1 = a(i).i();
/* 200 */         ate ate2 = a(this, ☃, a(i, 1), eq);
/*     */         
/* 202 */         if (ate2.a()) {
/* 203 */           ☃.g();
/* 204 */           return true;
/*     */         } 
/* 206 */         a(i, ate1);
/*     */       } 
/*     */     } 
/*     */     
/* 210 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(ade ☃, eq eq1) {
/* 214 */     if (☃ instanceof adw) {
/* 215 */       adw adw = (adw)☃;
/* 216 */       int[] arrayOfInt = adw.a(eq1);
/*     */       
/* 218 */       for (int i : arrayOfInt) {
/* 219 */         ate ate = adw.a(i);
/* 220 */         if (ate.a() || ate.C() != ate.c()) {
/* 221 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 225 */       int i = ☃.T_();
/* 226 */       for (int j = 0; j < i; j++) {
/* 227 */         ate ate = ☃.a(j);
/* 228 */         if (ate.a() || ate.C() != ate.c()) {
/* 229 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 234 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(ade ☃, eq eq1) {
/* 238 */     if (☃ instanceof adw) {
/* 239 */       adw adw = (adw)☃;
/* 240 */       int[] arrayOfInt = adw.a(eq1);
/*     */       
/* 242 */       for (int i : arrayOfInt) {
/* 243 */         if (!adw.a(i).a()) {
/* 244 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 248 */       int i = ☃.T_();
/* 249 */       for (int j = 0; j < i; j++) {
/* 250 */         if (!☃.a(j).a()) {
/* 251 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 255 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean a(bjv ☃) {
/* 259 */     ade ade = b(☃);
/*     */     
/* 261 */     if (ade != null) {
/* 262 */       eq eq = eq.a;
/* 263 */       if (b(ade, eq)) {
/* 264 */         return false;
/*     */       }
/*     */       
/* 267 */       if (ade instanceof adw) {
/* 268 */         adw adw = (adw)ade;
/* 269 */         int[] arrayOfInt = adw.a(eq);
/*     */         
/* 271 */         for (int i : arrayOfInt) {
/* 272 */           if (a(☃, ade, i, eq)) {
/* 273 */             return true;
/*     */           }
/*     */         } 
/*     */       } else {
/* 277 */         int i = ade.T_();
/* 278 */         for (int j = 0; j < i; j++) {
/* 279 */           if (a(☃, ade, j, eq)) {
/* 280 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } else {
/* 285 */       for (amm amm : c(☃)) {
/* 286 */         if (a(☃, amm)) {
/* 287 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 292 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean a(bjv ☃, ade ade1, int i, eq eq1) {
/* 296 */     ate ate = ade1.a(i);
/*     */     
/* 298 */     if (!ate.a() && b(ade1, ate, i, eq1)) {
/* 299 */       ate ate1 = ate.i();
/* 300 */       ate ate2 = a(ade1, ☃, ade1.a(i, 1), (eq)null);
/*     */       
/* 302 */       if (ate2.a()) {
/* 303 */         ade1.g();
/* 304 */         return true;
/*     */       } 
/* 306 */       ade1.a(i, ate1);
/*     */     } 
/*     */ 
/*     */     
/* 310 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(ade ☃, amm amm1) {
/* 314 */     boolean bool = false;
/*     */     
/* 316 */     ate ate1 = amm1.i().i();
/* 317 */     ate ate2 = a((ade)null, ☃, ate1, (eq)null);
/*     */     
/* 319 */     if (ate2.a()) {
/* 320 */       bool = true;
/*     */       
/* 322 */       amm1.V();
/*     */     } else {
/* 324 */       amm1.b(ate2);
/*     */     } 
/*     */     
/* 327 */     return bool;
/*     */   }
/*     */   
/*     */   public static ate a(@Nullable ade ☃, ade ade1, ate ate1, @Nullable eq eq1) {
/* 331 */     if (ade1 instanceof adw && eq1 != null) {
/* 332 */       adw adw = (adw)ade1;
/* 333 */       int[] arrayOfInt = adw.a(eq1);
/*     */       
/* 335 */       for (int i = 0; i < arrayOfInt.length && !ate1.a(); i++) {
/* 336 */         ate1 = a(☃, ade1, ate1, arrayOfInt[i], eq1);
/*     */       }
/*     */     } else {
/* 339 */       int i = ade1.T_();
/* 340 */       for (int j = 0; j < i && !ate1.a(); j++) {
/* 341 */         ate1 = a(☃, ade1, ate1, j, eq1);
/*     */       }
/*     */     } 
/*     */     
/* 345 */     return ate1;
/*     */   }
/*     */   
/*     */   private static boolean a(ade ☃, ate ate1, int i, @Nullable eq eq1) {
/* 349 */     if (!☃.b(i, ate1)) {
/* 350 */       return false;
/*     */     }
/* 352 */     if (☃ instanceof adw && !((adw)☃).a(i, ate1, eq1)) {
/* 353 */       return false;
/*     */     }
/* 355 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(ade ☃, ate ate1, int i, eq eq1) {
/* 359 */     if (☃ instanceof adw && !((adw)☃).b(i, ate1, eq1)) {
/* 360 */       return false;
/*     */     }
/* 362 */     return true;
/*     */   }
/*     */   
/*     */   private static ate a(@Nullable ade ☃, ade ade1, ate ate1, int i, @Nullable eq eq1) {
/* 366 */     ate ate2 = ade1.a(i);
/*     */     
/* 368 */     if (a(ade1, ate1, i, eq1)) {
/* 369 */       boolean bool1 = false;
/* 370 */       boolean bool2 = ade1.P_();
/* 371 */       if (ate2.a()) {
/* 372 */         ade1.a(i, ate1);
/* 373 */         ate1 = ate.a;
/* 374 */         bool1 = true;
/* 375 */       } else if (a(ate2, ate1)) {
/* 376 */         int j = ate1.c() - ate2.C();
/* 377 */         int k = Math.min(ate1.C(), j);
/*     */         
/* 379 */         ate1.g(k);
/* 380 */         ate2.f(k);
/* 381 */         bool1 = (k > 0);
/*     */       } 
/* 383 */       if (bool1) {
/* 384 */         if (bool2 && ade1 instanceof bjw) {
/* 385 */           bjw bjw1 = (bjw)ade1;
/* 386 */           if (!bjw1.J()) {
/* 387 */             int j = 0;
/* 388 */             if (☃ instanceof bjw) {
/* 389 */               bjw bjw2 = (bjw)☃;
/* 390 */               if (bjw1.j >= bjw2.j)
/*     */               {
/* 392 */                 j = 1;
/*     */               }
/*     */             } 
/* 395 */             bjw1.d(8 - j);
/*     */           } 
/*     */         } 
/* 398 */         ade1.g();
/*     */       } 
/*     */     } 
/* 401 */     return ate1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ade D() {
/* 406 */     eq ☃ = (eq)w().c(bfh.a);
/* 407 */     return a(F(), this.d_.a(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ade b(bjv ☃) {
/* 412 */     return a(☃.F(), ☃.G(), ☃.H() + 1.0D, ☃.I());
/*     */   }
/*     */   
/*     */   public static List<amm> c(bjv ☃) {
/* 416 */     return (List<amm>)☃.i().d().stream().flatMap(cea1 -> ☃.F().<aer>a((Class)amm.class, cea1.d(☃.G() - 0.5D, ☃.H() - 0.5D, ☃.I() - 0.5D), aeu.a).stream()).collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ade a(axy ☃, el el1) {
/* 421 */     return a(☃, el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ade a(axy ☃, double d1, double d2, double d3) {
/* 426 */     ade ade = null;
/* 427 */     el el = new el(d1, d2, d3);
/*     */     
/* 429 */     blc blc = ☃.a_(el);
/* 430 */     bcs bcs = blc.c();
/* 431 */     if (bcs.i()) {
/* 432 */       bji bji = ☃.f(el);
/*     */       
/* 434 */       if (bji instanceof ade) {
/* 435 */         ade = (ade)bji;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 440 */         if (ade instanceof bjl && 
/* 441 */           bcs instanceof bdh) {
/* 442 */           ade = ((bdh)bcs).a(blc, ☃, el, true);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 448 */     if (ade == null) {
/* 449 */       List<aer> list = ☃.a((aer)null, new cea(d1 - 0.5D, d2 - 0.5D, d3 - 0.5D, d1 + 0.5D, d2 + 0.5D, d3 + 0.5D), aeu.d);
/*     */       
/* 451 */       if (!list.isEmpty()) {
/* 452 */         ade = (ade)list.get(☃.s.nextInt(list.size()));
/*     */       }
/*     */     } 
/*     */     
/* 456 */     return ade;
/*     */   }
/*     */   
/*     */   private static boolean a(ate ☃, ate ate1) {
/* 460 */     if (☃.b() != ate1.b()) {
/* 461 */       return false;
/*     */     }
/* 463 */     if (☃.g() != ate1.g()) {
/* 464 */       return false;
/*     */     }
/* 466 */     if (☃.C() > ☃.c()) {
/* 467 */       return false;
/*     */     }
/* 469 */     if (!ate.a(☃, ate1)) {
/* 470 */       return false;
/*     */     }
/* 472 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public double G() {
/* 477 */     return this.d_.o() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double H() {
/* 482 */     return this.d_.p() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double I() {
/* 487 */     return this.d_.q() + 0.5D;
/*     */   }
/*     */   
/*     */   private void d(int ☃) {
/* 491 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   private boolean E() {
/* 495 */     return (this.f > 0);
/*     */   }
/*     */   
/*     */   private boolean J() {
/* 499 */     return (this.f > 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 504 */     return "minecraft:hopper";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 509 */     d(aog1);
/* 510 */     return new aqj(☃, this, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ez<ate> q() {
/* 515 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ez<ate> ☃) {
/* 520 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void a(aer ☃) {
/* 524 */     if (☃ instanceof amm) {
/* 525 */       el el = v();
/* 526 */       if (cet.c(cet.a(☃.bD().d(-el.o(), -el.p(), -el.q())), i(), cei.AND))
/* 527 */         a(() -> Boolean.valueOf(a(this, (amm)☃))); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */