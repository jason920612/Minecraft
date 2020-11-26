/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bju
/*     */   extends bjz
/*     */   implements adw, aqs, aqy, pt
/*     */ {
/*  49 */   private static final int[] a = new int[] { 0 };
/*     */ 
/*     */   
/*  52 */   private static final int[] e = new int[] { 2, 1 };
/*     */ 
/*     */   
/*  55 */   private static final int[] f = new int[] { 1 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   private ez<ate> g = ez.a(3, ate.a);
/*     */   
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   private ij l;
/*  75 */   private final Map<pc, Integer> m = Maps.newHashMap();
/*     */   
/*     */   private static void a(Map<ata, Integer> ☃, wz<ata> wz1, int i) {
/*  78 */     for (ata ata : wz1.a()) {
/*  79 */       ☃.put(ata, Integer.valueOf(i));
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(Map<ata, Integer> ☃, axx axx1, int i) {
/*  84 */     ☃.put(axx1.h(), Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   public static Map<ata, Integer> p() {
/*  88 */     Map<ata, Integer> ☃ = Maps.newLinkedHashMap();
/*     */     
/*  90 */     a(☃, atf.ay, 20000);
/*  91 */     a(☃, bct.go, 16000);
/*  92 */     a(☃, atf.cj, 2400);
/*  93 */     a(☃, atf.k, 1600);
/*  94 */     a(☃, atf.l, 1600);
/*  95 */     a(☃, wx.n, 300);
/*  96 */     a(☃, wx.b, 300);
/*  97 */     a(☃, wx.h, 300);
/*  98 */     a(☃, wx.i, 150);
/*  99 */     a(☃, wx.k, 300);
/* 100 */     a(☃, wx.j, 300);
/* 101 */     a(☃, bct.cX, 300);
/* 102 */     a(☃, bct.cZ, 300);
/* 103 */     a(☃, bct.cY, 300);
/* 104 */     a(☃, bct.da, 300);
/* 105 */     a(☃, bct.db, 300);
/* 106 */     a(☃, bct.dc, 300);
/* 107 */     a(☃, bct.dN, 300);
/* 108 */     a(☃, bct.dP, 300);
/* 109 */     a(☃, bct.dO, 300);
/* 110 */     a(☃, bct.dQ, 300);
/* 111 */     a(☃, bct.dR, 300);
/* 112 */     a(☃, bct.dS, 300);
/* 113 */     a(☃, bct.aw, 300);
/* 114 */     a(☃, bct.cc, 300);
/* 115 */     a(☃, bct.cW, 300);
/* 116 */     a(☃, bct.ck, 300);
/* 117 */     a(☃, bct.fq, 300);
/* 118 */     a(☃, bct.co, 300);
/* 119 */     a(☃, bct.fu, 300);
/* 120 */     a(☃, wx.u, 300);
/* 121 */     a(☃, atf.g, 300);
/* 122 */     a(☃, atf.aY, 300);
/* 123 */     a(☃, bct.cz, 300);
/* 124 */     a(☃, atf.av, 200);
/* 125 */     a(☃, atf.r, 200);
/* 126 */     a(☃, atf.q, 200);
/* 127 */     a(☃, atf.M, 200);
/* 128 */     a(☃, atf.t, 200);
/* 129 */     a(☃, atf.s, 200);
/* 130 */     a(☃, wx.g, 200);
/* 131 */     a(☃, wx.C, 200);
/* 132 */     a(☃, wx.a, 100);
/* 133 */     a(☃, wx.d, 100);
/* 134 */     a(☃, atf.C, 100);
/* 135 */     a(☃, wx.m, 100);
/* 136 */     a(☃, atf.D, 100);
/* 137 */     a(☃, wx.f, 67);
/* 138 */     a(☃, bct.jF, 4001);
/*     */     
/* 140 */     return ☃;
/*     */   }
/*     */   
/*     */   public bju() {
/* 144 */     super(bjj.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/* 149 */     return this.g.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/* 154 */     for (ate ☃ : this.g) {
/* 155 */       if (!☃.a()) {
/* 156 */         return false;
/*     */       }
/*     */     } 
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/* 164 */     return this.g.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/* 169 */     return adf.a(this.g, ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/* 174 */     return adf.a(this.g, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/* 179 */     ate ate2 = this.g.get(☃);
/* 180 */     boolean bool = (!ate1.a() && ate1.a(ate2) && ate.a(ate1, ate2));
/* 181 */     this.g.set(☃, ate1);
/* 182 */     if (ate1.C() > f()) {
/* 183 */       ate1.e(f());
/*     */     }
/*     */     
/* 186 */     if (☃ == 0 && !bool) {
/* 187 */       this.k = s();
/* 188 */       this.j = 0;
/* 189 */       g();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 195 */     if (this.l != null) {
/* 196 */       return this.l;
/*     */     }
/* 198 */     return new ir("container.furnace", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 203 */     return (this.l != null);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/* 209 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(@Nullable ij ☃) {
/* 213 */     this.l = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 218 */     super.b(☃);
/*     */     
/* 220 */     this.g = ez.a(T_(), ate.a);
/* 221 */     adf.b(☃, this.g);
/*     */     
/* 223 */     this.h = ☃.g("BurnTime");
/* 224 */     this.j = ☃.g("CookTime");
/* 225 */     this.k = ☃.g("CookTimeTotal");
/* 226 */     this.i = b(this.g.get(1));
/*     */     
/* 228 */     int i = ☃.g("RecipesUsedSize");
/* 229 */     for (int j = 0; j < i; j++) {
/* 230 */       pc pc = new pc(☃.l("RecipeLocation" + j));
/* 231 */       int k = ☃.h("RecipeAmount" + j);
/*     */       
/* 233 */       this.m.put(pc, Integer.valueOf(k));
/*     */     } 
/*     */     
/* 236 */     if (☃.c("CustomName", 8)) {
/* 237 */       this.l = ij.a.a(☃.l("CustomName"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/* 243 */     super.a(☃);
/* 244 */     ☃.a("BurnTime", (short)this.h);
/* 245 */     ☃.a("CookTime", (short)this.j);
/* 246 */     ☃.a("CookTimeTotal", (short)this.k);
/*     */     
/* 248 */     adf.a(☃, this.g);
/*     */     
/* 250 */     ☃.a("RecipesUsedSize", (short)this.m.size());
/*     */     
/* 252 */     int i = 0;
/* 253 */     for (Map.Entry<pc, Integer> entry : this.m.entrySet()) {
/* 254 */       ☃.a("RecipeLocation" + i, ((pc)entry.getKey()).toString());
/* 255 */       ☃.b("RecipeAmount" + i, ((Integer)entry.getValue()).intValue());
/* 256 */       i++;
/*     */     } 
/*     */     
/* 259 */     if (this.l != null) {
/* 260 */       ☃.a("CustomName", ij.a.a(this.l));
/*     */     }
/*     */     
/* 263 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 268 */     return 64;
/*     */   }
/*     */   
/*     */   private boolean r() {
/* 272 */     return (this.h > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 281 */     boolean ☃ = r();
/* 282 */     boolean bool1 = false;
/*     */     
/* 284 */     if (r())
/*     */     {
/* 286 */       this.h--;
/*     */     }
/*     */     
/* 289 */     if (!this.c_.B) {
/* 290 */       ate ate = this.g.get(1);
/* 291 */       if (r() || (!ate.a() && !((ate)this.g.get(0)).a())) {
/*     */ 
/*     */         
/* 294 */         avk avk = this.c_.E().b(this, this.c_);
/* 295 */         if (!r() && b(avk)) {
/*     */           
/* 297 */           this.h = b(ate);
/* 298 */           this.i = this.h;
/*     */           
/* 300 */           if (r()) {
/* 301 */             bool1 = true;
/*     */             
/* 303 */             if (!ate.a()) {
/* 304 */               ata ata = ate.b();
/* 305 */               ate.g(1);
/* 306 */               if (ate.a()) {
/* 307 */                 ata ata1 = ata.o();
/* 308 */                 this.g.set(1, (ata1 == null) ? ate.a : new ate(ata1));
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 314 */         if (r() && b(avk)) {
/* 315 */           this.j++;
/*     */           
/* 317 */           if (this.j == this.k) {
/* 318 */             this.j = 0;
/* 319 */             this.k = s();
/* 320 */             c(avk);
/* 321 */             bool1 = true;
/*     */           } 
/*     */         } else {
/* 324 */           this.j = 0;
/*     */         } 
/* 326 */       } else if (!r() && 
/* 327 */         this.j > 0) {
/* 328 */         this.j = xq.a(this.j - 2, 0, this.k);
/*     */       } 
/*     */ 
/*     */       
/* 332 */       if (☃ != r()) {
/* 333 */         bool1 = true;
/* 334 */         this.c_.a(this.d_, this.c_.a_(this.d_).a(bex.b, Boolean.valueOf(r())), 3);
/*     */       } 
/*     */     } 
/*     */     
/* 338 */     if (bool1) {
/* 339 */       g();
/*     */     }
/*     */   }
/*     */   
/*     */   private int s() {
/* 344 */     avt ☃ = (avt)this.c_.E().b(this, this.c_);
/* 345 */     if (☃ != null) {
/* 346 */       return ☃.h();
/*     */     }
/* 348 */     return 200;
/*     */   }
/*     */   
/*     */   private boolean b(@Nullable avk ☃) {
/* 352 */     if (((ate)this.g.get(0)).a() || ☃ == null) {
/* 353 */       return false;
/*     */     }
/* 355 */     ate ate1 = ☃.d();
/* 356 */     if (ate1.a()) {
/* 357 */       return false;
/*     */     }
/*     */     
/* 360 */     ate ate2 = this.g.get(2);
/* 361 */     if (ate2.a()) {
/* 362 */       return true;
/*     */     }
/* 364 */     if (!ate2.a(ate1)) {
/* 365 */       return false;
/*     */     }
/* 367 */     if (ate2.C() < f() && ate2.C() < ate2.c()) {
/* 368 */       return true;
/*     */     }
/* 370 */     if (ate2.C() < ate1.c()) {
/* 371 */       return true;
/*     */     }
/* 373 */     return false;
/*     */   }
/*     */   
/*     */   private void c(@Nullable avk ☃) {
/* 377 */     if (☃ == null || !b(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 381 */     ate ate1 = this.g.get(0);
/* 382 */     ate ate2 = ☃.d();
/* 383 */     ate ate3 = this.g.get(2);
/* 384 */     if (ate3.a()) {
/* 385 */       this.g.set(2, ate2.i());
/* 386 */     } else if (ate3.b() == ate2.b()) {
/* 387 */       ate3.f(1);
/*     */     } 
/*     */     
/* 390 */     if (!this.c_.B) {
/* 391 */       a(this.c_, (tf)null, ☃);
/*     */     }
/*     */     
/* 394 */     if (ate1.b() == bct.ao.h() && !((ate)this.g.get(1)).a() && ((ate)this.g.get(1)).b() == atf.aw) {
/* 395 */       this.g.set(1, new ate(atf.ax));
/*     */     }
/*     */     
/* 398 */     ate1.g(1);
/*     */   }
/*     */   
/*     */   private static int b(ate ☃) {
/* 402 */     if (☃.a()) {
/* 403 */       return 0;
/*     */     }
/*     */     
/* 406 */     ata ata = ☃.b();
/* 407 */     return ((Integer)p().getOrDefault(ata, Integer.valueOf(0))).intValue();
/*     */   }
/*     */   
/*     */   public static boolean a(ate ☃) {
/* 411 */     return p().containsKey(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 416 */     if (this.c_.f(this.d_) != this) {
/* 417 */       return false;
/*     */     }
/* 419 */     if (☃.d(this.d_.o() + 0.5D, this.d_.p() + 0.5D, this.d_.q() + 0.5D) > 64.0D) {
/* 420 */       return false;
/*     */     }
/* 422 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1) {
/* 435 */     if (☃ == 2) {
/* 436 */       return false;
/*     */     }
/* 438 */     if (☃ == 1) {
/* 439 */       ate ate2 = this.g.get(1);
/* 440 */       return (a(ate1) || (aqg.d_(ate1) && ate2.b() != atf.aw));
/*     */     } 
/* 442 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(eq ☃) {
/* 447 */     if (☃ == eq.a)
/* 448 */       return e; 
/* 449 */     if (☃ == eq.b) {
/* 450 */       return a;
/*     */     }
/* 452 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, ate ate1, @Nullable eq eq1) {
/* 458 */     return b(☃, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1, eq eq1) {
/* 463 */     if (eq1 == eq.a && ☃ == 1) {
/* 464 */       ata ata = ate1.b();
/* 465 */       if (ata != atf.ax && ata != atf.aw) {
/* 466 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 470 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 475 */     return "minecraft:furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 480 */     return new aqh(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 485 */     switch (☃) {
/*     */       case 0:
/* 487 */         return this.h;
/*     */       case 1:
/* 489 */         return this.i;
/*     */       case 2:
/* 491 */         return this.j;
/*     */       case 3:
/* 493 */         return this.k;
/*     */     } 
/* 495 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {
/* 500 */     switch (☃) {
/*     */       case 0:
/* 502 */         this.h = i;
/*     */         break;
/*     */       case 1:
/* 505 */         this.i = i;
/*     */         break;
/*     */       case 2:
/* 508 */         this.j = i;
/*     */         break;
/*     */       case 3:
/* 511 */         this.k = i;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 518 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 523 */     this.g.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aoi ☃) {
/* 528 */     for (ate ate : this.g) {
/* 529 */       ☃.b(ate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(avk ☃) {
/* 535 */     if (this.m.containsKey(☃.b())) {
/* 536 */       this.m.put(☃.b(), Integer.valueOf(((Integer)this.m.get(☃.b())).intValue() + 1));
/*     */     } else {
/* 538 */       this.m.put(☃.b(), Integer.valueOf(1));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public avk i() {
/* 545 */     return null;
/*     */   }
/*     */   
/*     */   public Map<pc, Integer> q() {
/* 549 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, tf tf1, @Nullable avk avk1) {
/* 554 */     if (avk1 != null) {
/* 555 */       a(avk1);
/* 556 */       return true;
/*     */     } 
/*     */     
/* 559 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 564 */     if (!this.c_.X().b("doLimitedCrafting")) {
/* 565 */       List<avk> list = Lists.newArrayList();
/* 566 */       for (pc pc : this.m.keySet()) {
/* 567 */         avk avk = ☃.m.E().a(pc);
/* 568 */         if (avk != null) {
/* 569 */           list.add(avk);
/*     */         }
/*     */       } 
/*     */       
/* 573 */       ☃.a(list);
/*     */     } 
/*     */     
/* 576 */     this.m.clear();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */