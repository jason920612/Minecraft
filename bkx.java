/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bkx
/*     */   extends bji
/*     */   implements pt
/*     */ {
/*     */   private blc a;
/*     */   private eq e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   
/*  35 */   private static final ThreadLocal<eq> h = new ThreadLocal<eq>()
/*     */     {
/*     */       protected eq a() {
/*  38 */         return null;
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   private float i;
/*     */   private float j;
/*     */   private long k;
/*     */   
/*     */   public bkx() {
/*  48 */     super(bjj.j);
/*     */   }
/*     */   
/*     */   public bkx(blc ☃, eq eq1, boolean bool1, boolean bool2) {
/*  52 */     this();
/*  53 */     this.a = ☃;
/*  54 */     this.e = eq1;
/*  55 */     this.f = bool1;
/*  56 */     this.g = bool2;
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/*  61 */     return a(new gy());
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  65 */     return this.f;
/*     */   }
/*     */   
/*     */   public eq d() {
/*  69 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  73 */     return this.g;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/*  77 */     if (☃ > 1.0F) {
/*  78 */       ☃ = 1.0F;
/*     */     }
/*  80 */     return this.j + (this.i - this.j) * ☃;
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
/*     */   private float e(float ☃) {
/*  96 */     return this.f ? (☃ - 1.0F) : (1.0F - ☃);
/*     */   }
/*     */   
/*     */   private blc l() {
/* 100 */     if (!c() && f()) {
/* 101 */       return bct.aX.p()
/* 102 */         .a(bkw.b, (this.a.c() == bct.aP) ? bml.b : bml.a)
/* 103 */         .a(bkw.a, this.a.c(bkv.a));
/*     */     }
/* 105 */     return this.a;
/*     */   }
/*     */   
/*     */   private void f(float ☃) {
/* 109 */     eq eq1 = h();
/*     */     
/* 111 */     double d = (☃ - this.i);
/*     */     
/* 113 */     cew cew = l().h(this.c_, v());
/* 114 */     if (cew.b()) {
/*     */       return;
/*     */     }
/*     */     
/* 118 */     List<cea> list = cew.d();
/* 119 */     cea cea = a(a(list));
/* 120 */     List<aer> list1 = this.c_.a((aer)null, a(cea, eq1, d).b(cea));
/* 121 */     if (list1.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 125 */     boolean bool = (this.a.c() == bct.gt);
/* 126 */     for (int i = 0; i < list1.size(); i++) {
/* 127 */       aer aer = list1.get(i);
/* 128 */       if (aer.A_() != bzc.d) {
/*     */ 
/*     */ 
/*     */         
/* 132 */         if (bool) {
/* 133 */           switch (null.a[eq1.k().ordinal()]) {
/*     */             case 1:
/* 135 */               aer.t = eq1.g();
/*     */               break;
/*     */             case 2:
/* 138 */               aer.u = eq1.h();
/*     */               break;
/*     */             case 3:
/* 141 */               aer.v = eq1.i();
/*     */               break;
/*     */           } 
/*     */         
/*     */         }
/* 146 */         double d1 = 0.0D;
/* 147 */         for (int j = 0; j < list.size(); j++) {
/* 148 */           cea cea1 = a(a(list.get(j)), eq1, d);
/*     */           
/* 150 */           cea cea2 = aer.bD();
/* 151 */           if (cea1.c(cea2)) {
/*     */ 
/*     */ 
/*     */             
/* 155 */             d1 = Math.max(d1, a(cea1, eq1, cea2));
/*     */ 
/*     */             
/* 158 */             if (d1 >= d) {
/*     */               break;
/*     */             }
/*     */           } 
/*     */         } 
/* 163 */         if (d1 > 0.0D) {
/*     */ 
/*     */ 
/*     */           
/* 167 */           d1 = Math.min(d1, d) + 0.01D;
/*     */ 
/*     */           
/* 170 */           h.set(eq1);
/* 171 */           aer.a(afe.c, d1 * eq1.g(), d1 * eq1.h(), d1 * eq1.i());
/* 172 */           h.set(null);
/*     */           
/* 174 */           if (!this.f && this.g)
/* 175 */             a(aer, eq1, d); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public eq h() {
/* 181 */     return this.f ? this.e : this.e.d();
/*     */   }
/*     */ 
/*     */   
/*     */   private cea a(List<cea> ☃) {
/* 186 */     double d1 = 0.0D;
/* 187 */     double d2 = 0.0D;
/* 188 */     double d3 = 0.0D;
/* 189 */     double d4 = 1.0D;
/* 190 */     double d5 = 1.0D;
/* 191 */     double d6 = 1.0D;
/*     */     
/* 193 */     for (cea cea : ☃) {
/* 194 */       d1 = Math.min(cea.a, d1);
/* 195 */       d2 = Math.min(cea.b, d2);
/* 196 */       d3 = Math.min(cea.c, d3);
/* 197 */       d4 = Math.max(cea.d, d4);
/* 198 */       d5 = Math.max(cea.e, d5);
/* 199 */       d6 = Math.max(cea.f, d6);
/*     */     } 
/*     */     
/* 202 */     return new cea(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   private double a(cea ☃, eq eq1, cea cea1) {
/* 206 */     switch (null.a[eq1.k().ordinal()])
/*     */     { case 1:
/* 208 */         return b(☃, eq1, cea1);
/*     */       
/*     */       default:
/* 211 */         return c(☃, eq1, cea1);
/*     */       case 3:
/* 213 */         break; }  return d(☃, eq1, cea1);
/*     */   }
/*     */ 
/*     */   
/*     */   private cea a(cea ☃) {
/* 218 */     double d = e(this.i);
/* 219 */     return ☃.d(this.d_
/* 220 */         .o() + d * this.e.g(), this.d_
/* 221 */         .p() + d * this.e.h(), this.d_
/* 222 */         .q() + d * this.e.i());
/*     */   }
/*     */ 
/*     */   
/*     */   private cea a(cea ☃, eq eq1, double d) {
/* 227 */     double d1 = d * eq1.c().a();
/* 228 */     double d2 = Math.min(d1, 0.0D);
/* 229 */     double d3 = Math.max(d1, 0.0D);
/* 230 */     switch (null.b[eq1.ordinal()])
/*     */     { case 1:
/* 232 */         return new cea(☃.a + d2, ☃.b, ☃.c, ☃.a + d3, ☃.e, ☃.f);
/*     */       case 2:
/* 234 */         return new cea(☃.d + d2, ☃.b, ☃.c, ☃.d + d3, ☃.e, ☃.f);
/*     */       case 3:
/* 236 */         return new cea(☃.a, ☃.b + d2, ☃.c, ☃.d, ☃.b + d3, ☃.f);
/*     */       
/*     */       default:
/* 239 */         return new cea(☃.a, ☃.e + d2, ☃.c, ☃.d, ☃.e + d3, ☃.f);
/*     */       case 5:
/* 241 */         return new cea(☃.a, ☃.b, ☃.c + d2, ☃.d, ☃.e, ☃.c + d3);
/*     */       case 6:
/* 243 */         break; }  return new cea(☃.a, ☃.b, ☃.f + d2, ☃.d, ☃.e, ☃.f + d3);
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(aer ☃, eq eq1, double d) {
/* 248 */     cea cea1 = ☃.bD();
/* 249 */     cea cea2 = cet.b().a().a(this.d_);
/* 250 */     if (cea1.c(cea2)) {
/* 251 */       eq eq2 = eq1.d();
/*     */ 
/*     */       
/* 254 */       double d1 = a(cea2, eq2, cea1) + 0.01D;
/* 255 */       double d2 = a(cea2, eq2, cea1.a(cea2)) + 0.01D;
/*     */       
/* 257 */       if (Math.abs(d1 - d2) < 0.01D) {
/* 258 */         d1 = Math.min(d1, d) + 0.01D;
/* 259 */         h.set(eq1);
/* 260 */         ☃.a(afe.c, d1 * eq2.g(), d1 * eq2.h(), d1 * eq2.i());
/* 261 */         h.set(null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static double b(cea ☃, eq eq1, cea cea1) {
/* 267 */     if (eq1.c() == eq.b.a) {
/* 268 */       return ☃.d - cea1.a;
/*     */     }
/* 270 */     return cea1.d - ☃.a;
/*     */   }
/*     */ 
/*     */   
/*     */   private static double c(cea ☃, eq eq1, cea cea1) {
/* 275 */     if (eq1.c() == eq.b.a) {
/* 276 */       return ☃.e - cea1.b;
/*     */     }
/* 278 */     return cea1.e - ☃.b;
/*     */   }
/*     */ 
/*     */   
/*     */   private static double d(cea ☃, eq eq1, cea cea1) {
/* 283 */     if (eq1.c() == eq.b.a) {
/* 284 */       return ☃.f - cea1.c;
/*     */     }
/* 286 */     return cea1.f - ☃.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc i() {
/* 291 */     return this.a;
/*     */   }
/*     */   
/*     */   public void j() {
/* 295 */     if (this.j < 1.0F && this.c_ != null) {
/* 296 */       this.i = 1.0F;
/* 297 */       this.j = this.i;
/* 298 */       this.c_.n(this.d_);
/* 299 */       y();
/* 300 */       if (this.c_.a_(this.d_).c() == bct.bo) {
/*     */         blc ☃;
/* 302 */         if (this.g) {
/* 303 */           ☃ = bct.a.p();
/*     */         } else {
/* 305 */           ☃ = bcs.b(this.a, this.c_, this.d_);
/*     */         } 
/* 307 */         this.c_.a(this.d_, ☃, 3);
/* 308 */         this.c_.a(this.d_, ☃.c(), this.d_);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 315 */     this.k = this.c_.V();
/* 316 */     this.j = this.i;
/*     */     
/* 318 */     if (this.j >= 1.0F) {
/* 319 */       this.c_.n(this.d_);
/* 320 */       y();
/* 321 */       if (this.a != null && this.c_.a_(this.d_).c() == bct.bo) {
/* 322 */         blc blc1 = bcs.b(this.a, this.c_, this.d_);
/* 323 */         if (blc1.f()) {
/* 324 */           this.c_.a(this.d_, this.a, 84);
/* 325 */           bcs.a(this.a, blc1, this.c_, this.d_, 3);
/*     */         } else {
/* 327 */           if (blc1.b(bma.y) && ((Boolean)blc1.c(bma.y)).booleanValue()) {
/* 328 */             blc1 = blc1.a(bma.y, Boolean.valueOf(false));
/*     */           }
/* 330 */           this.c_.a(this.d_, blc1, 67);
/* 331 */           this.c_.a(this.d_, blc1.c(), this.d_);
/*     */         } 
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 337 */     float ☃ = this.i + 0.5F;
/* 338 */     f(☃);
/* 339 */     this.i = ☃;
/* 340 */     if (this.i >= 1.0F) {
/* 341 */       this.i = 1.0F;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 347 */     super.b(☃);
/*     */     
/* 349 */     this.a = hk.d(☃.p("blockState"));
/* 350 */     this.e = eq.a(☃.h("facing"));
/* 351 */     this.i = ☃.j("progress");
/* 352 */     this.j = this.i;
/* 353 */     this.f = ☃.q("extending");
/* 354 */     this.g = ☃.q("source");
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/* 359 */     super.a(☃);
/*     */     
/* 361 */     ☃.a("blockState", hk.a(this.a));
/* 362 */     ☃.b("facing", this.e.a());
/* 363 */     ☃.a("progress", this.j);
/* 364 */     ☃.a("extending", this.f);
/* 365 */     ☃.a("source", this.g);
/*     */     
/* 367 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(axk ☃, el el1) {
/*     */     cew cew;
/*     */     blc blc1;
/* 374 */     if (!this.f && this.g) {
/* 375 */       cew = this.a.a(bkv.b, Boolean.valueOf(true)).h(☃, el1);
/*     */     } else {
/* 377 */       cew = cet.a();
/*     */     } 
/*     */     
/* 380 */     eq eq1 = h.get();
/* 381 */     if (this.i < 1.0D && eq1 == h()) {
/* 382 */       return cew;
/*     */     }
/*     */ 
/*     */     
/* 386 */     if (f()) {
/* 387 */       blc1 = bct.aX.p().a(bkw.a, this.e).a(bkw.c, Boolean.valueOf((this.f != ((1.0F - this.i < 4.0F)))));
/*     */     } else {
/* 389 */       blc1 = this.a;
/*     */     } 
/* 391 */     float f = e(this.i);
/* 392 */     double d1 = (this.e.g() * f);
/* 393 */     double d2 = (this.e.h() * f);
/* 394 */     double d3 = (this.e.i() * f);
/* 395 */     return cet.a(cew, blc1.h(☃, el1).a(d1, d2, d3));
/*     */   }
/*     */   
/*     */   public long k() {
/* 399 */     return this.k;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */