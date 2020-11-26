/*     */ import com.google.common.cache.LoadingCache;
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
/*     */ public class bgc
/*     */   extends bcs
/*     */ {
/*  30 */   public static final bmh<eq.a> a = bma.z;
/*     */ 
/*     */   
/*  33 */   protected static final cew b = bcs.a(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
/*  34 */   protected static final cew c = bcs.a(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bgc(bcs.c ☃) {
/*  43 */     super(☃);
/*  44 */     v(((blc)this.m.b()).a(a, eq.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  49 */     switch (null.a[((eq.a)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  51 */         return c;
/*     */     } 
/*     */     
/*  54 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  60 */     if (axy1.t.o() && axy1.X().b("doMobSpawning") && random.nextInt(2000) < axy1.aj().a()) {
/*     */       
/*  62 */       int i = el1.p();
/*  63 */       el el2 = el1;
/*  64 */       while (!axy1.a_(el2).q() && el2.p() > 0) {
/*  65 */         el2 = el2.b();
/*     */       }
/*  67 */       if (i > 0 && !axy1.a_(el2.a()).l()) {
/*  68 */         aer aer = aev.ab.a(axy1, null, null, null, el2.a(), false, false);
/*  69 */         if (aer != null) {
/*  70 */           aer.am = aer.aQ();
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  78 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(axz ☃, el el1) {
/*  82 */     a a = b(☃, el1);
/*  83 */     if (a != null) {
/*  84 */       a.e();
/*  85 */       return true;
/*     */     } 
/*     */     
/*  88 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public a b(axz ☃, el el1) {
/*  93 */     a a1 = new a(☃, el1, eq.a.a);
/*  94 */     if (a1.d() && a.a(a1) == 0) {
/*  95 */       return a1;
/*     */     }
/*     */     
/*  98 */     a a2 = new a(☃, el1, eq.a.c);
/*  99 */     if (a2.d() && a.a(a2) == 0) {
/* 100 */       return a2;
/*     */     }
/*     */     
/* 103 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 108 */     eq.a a1 = eq1.k();
/* 109 */     eq.a a2 = (eq.a)☃.c(a);
/*     */     
/* 111 */     boolean bool = (a2 != a1 && a1.c());
/* 112 */     if (bool || blc1.c() == this || (new a(axz1, el1, a2)).f()) {
/* 113 */       return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */     }
/*     */     
/* 116 */     return bct.a.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 121 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 126 */     return axl.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 131 */     if (!aer1.aW() && !aer1.aX() && aer1.bm()) {
/* 132 */       aer1.e(el1);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 165 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 170 */     switch (null.b[bhb1.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 173 */         switch (null.a[((eq.a)☃.c(a)).ordinal()]) {
/*     */           case 2:
/* 175 */             return ☃.a(a, eq.a.c);
/*     */           case 1:
/* 177 */             return ☃.a(a, eq.a.a);
/*     */         } 
/* 179 */         return ☃;
/*     */     } 
/*     */     
/* 182 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 188 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */   
/*     */   public bli.b c(axz ☃, el el1) {
/* 192 */     eq.a a = eq.a.c;
/* 193 */     a a1 = new a(☃, el1, eq.a.a);
/* 194 */     LoadingCache<el, blh> loadingCache = bli.a(☃, true);
/*     */     
/* 196 */     if (!a1.d()) {
/* 197 */       a = eq.a.a;
/* 198 */       a1 = new a(☃, el1, eq.a.c);
/*     */     } 
/* 200 */     if (!a1.d()) {
/* 201 */       return new bli.b(el1, eq.c, eq.b, loadingCache, 1, 1, 1);
/*     */     }
/*     */     
/* 204 */     int[] arrayOfInt = new int[(eq.b.values()).length];
/* 205 */     eq eq = a.b(a1).f();
/* 206 */     el el2 = a.c(a1).b(a1.a() - 1);
/*     */     
/* 208 */     for (eq.b b1 : eq.b.values()) {
/* 209 */       bli.b b2 = new bli.b((eq.c() == b1) ? el2 : el2.a(a.b(a1), a1.b() - 1), eq.a(b1, a), eq.b, loadingCache, a1.b(), a1.a(), 1);
/*     */       
/* 211 */       for (int i = 0; i < a1.b(); i++) {
/* 212 */         for (int j = 0; j < a1.a(); j++) {
/* 213 */           blh blh = b2.a(i, j, 1);
/* 214 */           if (!blh.a().f()) {
/* 215 */             arrayOfInt[b1.ordinal()] = arrayOfInt[b1.ordinal()] + 1;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 221 */     eq.b b = eq.b.a;
/* 222 */     for (eq.b b1 : eq.b.values()) {
/* 223 */       if (arrayOfInt[b1.ordinal()] < arrayOfInt[b.ordinal()]) {
/* 224 */         b = b1;
/*     */       }
/*     */     } 
/*     */     
/* 228 */     return new bli.b((eq.c() == b) ? el2 : el2.a(a.b(a1), a1.b() - 1), eq.a(b, a), eq.b, loadingCache, a1.b(), a1.a(), 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 233 */     return blb.i;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final axz a;
/*     */     private final eq.a b;
/*     */     private final eq c;
/*     */     private final eq d;
/*     */     private int e;
/*     */     private el f;
/*     */     private int g;
/*     */     private int h;
/*     */     
/*     */     public a(axz ☃, el el1, eq.a a1) {
/* 247 */       this.a = ☃;
/* 248 */       this.b = a1;
/* 249 */       if (a1 == eq.a.a) {
/* 250 */         this.d = eq.f;
/* 251 */         this.c = eq.e;
/*     */       } else {
/* 253 */         this.d = eq.c;
/* 254 */         this.c = eq.d;
/*     */       } 
/*     */       
/* 257 */       el el2 = el1;
/* 258 */       while (el1.p() > el2.p() - 21 && el1.p() > 0 && a(☃.a_(el1.b()))) {
/* 259 */         el1 = el1.b();
/*     */       }
/*     */       
/* 262 */       int i = a(el1, this.d) - 1;
/*     */       
/* 264 */       if (i >= 0) {
/* 265 */         this.f = el1.a(this.d, i);
/*     */         
/* 267 */         this.h = a(this.f, this.c);
/*     */         
/* 269 */         if (this.h < 2 || this.h > 21) {
/* 270 */           this.f = null;
/* 271 */           this.h = 0;
/*     */         } 
/*     */       } 
/*     */       
/* 275 */       if (this.f != null) {
/* 276 */         this.g = c();
/*     */       }
/*     */     }
/*     */     
/*     */     protected int a(el ☃, eq eq1) {
/*     */       int i;
/* 282 */       for (i = 0; i < 22; i++) {
/* 283 */         el el1 = ☃.a(eq1, i);
/* 284 */         if (!a(this.a.a_(el1))) {
/*     */           break;
/*     */         }
/*     */         
/* 288 */         if (this.a.a_(el1.b()).c() != bct.ce) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */       
/* 293 */       bcs bcs = this.a.a_(☃.a(eq1, i)).c();
/* 294 */       if (bcs == bct.ce) {
/* 295 */         return i;
/*     */       }
/*     */       
/* 298 */       return 0;
/*     */     }
/*     */     
/*     */     public int a() {
/* 302 */       return this.g;
/*     */     }
/*     */     
/*     */     public int b() {
/* 306 */       return this.h;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int c() {
/* 311 */       label39: for (this.g = 0; this.g < 21; this.g++) {
/* 312 */         for (int i = 0; i < this.h; i++) {
/* 313 */           el el1 = this.f.a(this.c, i).b(this.g);
/*     */           
/* 315 */           blc blc = this.a.a_(el1);
/* 316 */           if (!a(blc)) {
/*     */             break label39;
/*     */           }
/*     */           
/* 320 */           bcs bcs = blc.c();
/* 321 */           if (bcs == bct.dh) {
/* 322 */             this.e++;
/*     */           }
/*     */           
/* 325 */           if (i == 0) {
/* 326 */             bcs = this.a.a_(el1.a(this.d)).c();
/* 327 */             if (bcs != bct.ce) {
/*     */               break label39;
/*     */             }
/* 330 */           } else if (i == this.h - 1) {
/* 331 */             bcs = this.a.a_(el1.a(this.c)).c();
/* 332 */             if (bcs != bct.ce) {
/*     */               break label39;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 339 */       for (int ☃ = 0; ☃ < this.h; ☃++) {
/* 340 */         if (this.a.a_(this.f.a(this.c, ☃).b(this.g)).c() != bct.ce) {
/* 341 */           this.g = 0;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 346 */       if (this.g > 21 || this.g < 3) {
/* 347 */         this.f = null;
/* 348 */         this.h = 0;
/* 349 */         this.g = 0;
/* 350 */         return 0;
/*     */       } 
/* 352 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(blc ☃) {
/* 357 */       bcs bcs = ☃.c();
/* 358 */       return (☃.f() || bcs == bct.ch || bcs == bct.dh);
/*     */     }
/*     */     
/*     */     public boolean d() {
/* 362 */       return (this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21);
/*     */     }
/*     */     
/*     */     public void e() {
/* 366 */       for (int ☃ = 0; ☃ < this.h; ☃++) {
/* 367 */         el el1 = this.f.a(this.c, ☃);
/* 368 */         for (int i = 0; i < this.g; i++) {
/* 369 */           this.a.a(el1.b(i), bct.dh.p().a(bgc.a, this.b), 18);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean g() {
/* 375 */       return (this.e >= this.h * this.g);
/*     */     }
/*     */     
/*     */     public boolean f() {
/* 379 */       return (d() && g());
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */