/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumSet;
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
/*     */ 
/*     */ 
/*     */ public class cbj
/*     */   extends cbd
/*     */ {
/*     */   protected float j;
/*     */   
/*     */   public void a(axk ☃, afb afb1) {
/*  37 */     super.a(☃, afb1);
/*  38 */     this.j = afb1.a(cba.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  43 */     this.b.a(cba.g, this.j);
/*  44 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cbc b() {
/*     */     int ☃;
/*  51 */     if (e() && this.b.an()) {
/*  52 */       ☃ = (int)(this.b.bD()).b;
/*  53 */       el.a a = new el.a(xq.c(this.b.q), ☃, xq.c(this.b.s));
/*  54 */       bcs bcs = this.a.a_(a).c();
/*  55 */       while (bcs == bct.A) {
/*  56 */         ☃++;
/*  57 */         a.c(xq.c(this.b.q), ☃, xq.c(this.b.s));
/*  58 */         bcs = this.a.a_(a).c();
/*     */       } 
/*  60 */       ☃--;
/*     */     }
/*  62 */     else if (this.b.A) {
/*  63 */       ☃ = xq.c((this.b.bD()).b + 0.5D);
/*     */     } else {
/*  65 */       el el1 = new el(this.b);
/*  66 */       while ((this.a.a_(el1).f() || this.a.a_(el1).a(this.a, el1, cbf.a)) && el1.p() > 0) {
/*  67 */         el1 = el1.b();
/*     */       }
/*  69 */       ☃ = el1.a().p();
/*     */     } 
/*     */ 
/*     */     
/*  73 */     el el = new el(this.b);
/*  74 */     cba cba = a(this.b, el.o(), ☃, el.q());
/*     */     
/*  76 */     if (this.b.a(cba) < 0.0F) {
/*  77 */       Set<el> set = Sets.newHashSet();
/*  78 */       set.add(new el((this.b.bD()).a, ☃, (this.b.bD()).c));
/*  79 */       set.add(new el((this.b.bD()).a, ☃, (this.b.bD()).f));
/*  80 */       set.add(new el((this.b.bD()).d, ☃, (this.b.bD()).c));
/*  81 */       set.add(new el((this.b.bD()).d, ☃, (this.b.bD()).f));
/*     */       
/*  83 */       for (el el1 : set) {
/*  84 */         cba cba1 = a(this.b, el1);
/*  85 */         if (this.b.a(cba1) >= 0.0F) {
/*  86 */           return a(el1.o(), el1.p(), el1.q());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     return a(el.o(), ☃, el.q());
/*     */   }
/*     */ 
/*     */   
/*     */   public cbc a(double ☃, double d1, double d2) {
/*  96 */     return a(xq.c(☃), xq.c(d1), xq.c(d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cbc[] ☃, cbc cbc1, cbc cbc2, float f) {
/* 101 */     int i = 0;
/*     */     
/* 103 */     int j = 0;
/* 104 */     cba cba = a(this.b, cbc1.a, cbc1.b + 1, cbc1.c);
/* 105 */     if (this.b.a(cba) >= 0.0F) {
/* 106 */       j = xq.d(Math.max(1.0F, this.b.Q));
/*     */     }
/*     */     
/* 109 */     double d = a(this.a, new el(cbc1.a, cbc1.b, cbc1.c));
/*     */     
/* 111 */     cbc cbc3 = a(cbc1.a, cbc1.b, cbc1.c + 1, j, d, eq.d);
/* 112 */     cbc cbc4 = a(cbc1.a - 1, cbc1.b, cbc1.c, j, d, eq.e);
/* 113 */     cbc cbc5 = a(cbc1.a + 1, cbc1.b, cbc1.c, j, d, eq.f);
/* 114 */     cbc cbc6 = a(cbc1.a, cbc1.b, cbc1.c - 1, j, d, eq.c);
/*     */     
/* 116 */     if (cbc3 != null && !cbc3.i && cbc3.a(cbc2) < f) {
/* 117 */       ☃[i++] = cbc3;
/*     */     }
/* 119 */     if (cbc4 != null && !cbc4.i && cbc4.a(cbc2) < f) {
/* 120 */       ☃[i++] = cbc4;
/*     */     }
/* 122 */     if (cbc5 != null && !cbc5.i && cbc5.a(cbc2) < f) {
/* 123 */       ☃[i++] = cbc5;
/*     */     }
/* 125 */     if (cbc6 != null && !cbc6.i && cbc6.a(cbc2) < f) {
/* 126 */       ☃[i++] = cbc6;
/*     */     }
/*     */     
/* 129 */     boolean bool1 = (cbc6 == null || cbc6.m == cba.b || cbc6.l != 0.0F);
/* 130 */     boolean bool2 = (cbc3 == null || cbc3.m == cba.b || cbc3.l != 0.0F);
/* 131 */     boolean bool3 = (cbc5 == null || cbc5.m == cba.b || cbc5.l != 0.0F);
/* 132 */     boolean bool4 = (cbc4 == null || cbc4.m == cba.b || cbc4.l != 0.0F);
/*     */     
/* 134 */     if (bool1 && bool4) {
/* 135 */       cbc cbc7 = a(cbc1.a - 1, cbc1.b, cbc1.c - 1, j, d, eq.c);
/* 136 */       if (cbc7 != null && !cbc7.i && cbc7.a(cbc2) < f) {
/* 137 */         ☃[i++] = cbc7;
/*     */       }
/*     */     } 
/* 140 */     if (bool1 && bool3) {
/* 141 */       cbc cbc7 = a(cbc1.a + 1, cbc1.b, cbc1.c - 1, j, d, eq.c);
/* 142 */       if (cbc7 != null && !cbc7.i && cbc7.a(cbc2) < f) {
/* 143 */         ☃[i++] = cbc7;
/*     */       }
/*     */     } 
/* 146 */     if (bool2 && bool4) {
/* 147 */       cbc cbc7 = a(cbc1.a - 1, cbc1.b, cbc1.c + 1, j, d, eq.d);
/* 148 */       if (cbc7 != null && !cbc7.i && cbc7.a(cbc2) < f) {
/* 149 */         ☃[i++] = cbc7;
/*     */       }
/*     */     } 
/* 152 */     if (bool2 && bool3) {
/* 153 */       cbc cbc7 = a(cbc1.a + 1, cbc1.b, cbc1.c + 1, j, d, eq.d);
/* 154 */       if (cbc7 != null && !cbc7.i && cbc7.a(cbc2) < f) {
/* 155 */         ☃[i++] = cbc7;
/*     */       }
/*     */     } 
/*     */     
/* 159 */     return i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cbc a(int ☃, int i, int j, int k, double d, eq eq1) {
/* 164 */     cbc cbc = null;
/*     */     
/* 166 */     el el = new el(☃, i, j);
/* 167 */     double d1 = a(this.a, el);
/*     */ 
/*     */     
/* 170 */     if (d1 - d > 1.125D) {
/* 171 */       return null;
/*     */     }
/*     */     
/* 174 */     cba cba = a(this.b, ☃, i, j);
/*     */     
/* 176 */     float f = this.b.a(cba);
/* 177 */     double d2 = this.b.H / 2.0D;
/*     */     
/* 179 */     if (f >= 0.0F) {
/* 180 */       cbc = a(☃, i, j);
/* 181 */       cbc.m = cba;
/* 182 */       cbc.l = Math.max(cbc.l, f);
/*     */     } 
/*     */     
/* 185 */     if (cba == cba.c) {
/* 186 */       return cbc;
/*     */     }
/*     */     
/* 189 */     if (cbc == null && k > 0 && cba != cba.e && cba != cba.d) {
/* 190 */       cbc = a(☃, i + 1, j, k - 1, d, eq1);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 195 */       if (cbc != null && (cbc.m == cba.b || cbc.m == cba.c) && this.b.H < 1.0F) {
/* 196 */         double d3 = (☃ - eq1.g()) + 0.5D;
/* 197 */         double d4 = (j - eq1.i()) + 0.5D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 204 */         cea cea = new cea(d3 - d2, i + 0.001D, d4 - d2, d3 + d2, this.b.I + a(this.a, el.a()) - 0.002D, d4 + d2);
/*     */ 
/*     */         
/* 207 */         if (!this.b.m.c((aer)null, cea)) {
/* 208 */           cbc = null;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 213 */     if (cba == cba.g && !e()) {
/* 214 */       if (a(this.b, ☃, i - 1, j) != cba.g) {
/* 215 */         return cbc;
/*     */       }
/*     */ 
/*     */       
/* 219 */       while (i > 0) {
/* 220 */         i--;
/*     */         
/* 222 */         cba = a(this.b, ☃, i, j);
/*     */         
/* 224 */         if (cba == cba.g) {
/* 225 */           cbc = a(☃, i, j);
/* 226 */           cbc.m = cba;
/* 227 */           cbc.l = Math.max(cbc.l, this.b.a(cba)); continue;
/*     */         } 
/* 229 */         return cbc;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 234 */     if (cba == cba.b) {
/*     */       
/* 236 */       cea cea = new cea(☃ - d2 + 0.5D, i + 0.001D, j - d2 + 0.5D, ☃ + d2 + 0.5D, (i + this.b.I), j + d2 + 0.5D);
/* 237 */       if (!this.b.m.c((aer)null, cea)) {
/* 238 */         return null;
/*     */       }
/*     */ 
/*     */       
/* 242 */       if (this.b.H >= 1.0F) {
/* 243 */         cba cba1 = a(this.b, ☃, i - 1, j);
/* 244 */         if (cba1 == cba.a) {
/* 245 */           cbc = a(☃, i, j);
/* 246 */           cbc.m = cba.c;
/* 247 */           cbc.l = Math.max(cbc.l, f);
/* 248 */           return cbc;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 254 */       int m = 0;
/* 255 */       while (i > 0 && cba == cba.b) {
/* 256 */         i--;
/*     */         
/* 258 */         if (m++ >= this.b.bn()) {
/* 259 */           return null;
/*     */         }
/*     */         
/* 262 */         cba = a(this.b, ☃, i, j);
/* 263 */         f = this.b.a(cba);
/*     */         
/* 265 */         if (cba != cba.b && f >= 0.0F) {
/* 266 */           cbc = a(☃, i, j);
/* 267 */           cbc.m = cba;
/* 268 */           cbc.l = Math.max(cbc.l, f); break;
/*     */         } 
/* 270 */         if (f < 0.0F) {
/* 271 */           return null;
/*     */         }
/*     */       } 
/*     */     } 
/* 275 */     return cbc;
/*     */   }
/*     */   
/*     */   public static double a(axk ☃, el el1) {
/* 279 */     el el2 = el1.b();
/* 280 */     cew cew = ☃.a_(el2).h(☃, el2);
/* 281 */     return el2.p() + (cew.b() ? 0.0D : cew.c(eq.a.b));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k, afb afb1, int m, int n, int i1, boolean bool1, boolean bool2) {
/* 287 */     EnumSet<cba> enumSet = EnumSet.noneOf(cba.class);
/* 288 */     cba cba1 = cba.a;
/*     */     
/* 290 */     double d = afb1.H / 2.0D;
/* 291 */     el el = new el(afb1);
/*     */     
/* 293 */     cba1 = a(☃, i, j, k, m, n, i1, bool1, bool2, enumSet, cba1, el);
/*     */     
/* 295 */     if (enumSet.contains(cba.e)) {
/* 296 */       return cba.e;
/*     */     }
/*     */     
/* 299 */     cba cba2 = cba.a;
/* 300 */     for (cba cba : enumSet) {
/*     */       
/* 302 */       if (afb1.a(cba) < 0.0F) {
/* 303 */         return cba;
/*     */       }
/*     */ 
/*     */       
/* 307 */       if (afb1.a(cba) >= afb1.a(cba2)) {
/* 308 */         cba2 = cba;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 313 */     if (cba1 == cba.b && afb1.a(cba2) == 0.0F) {
/* 314 */       return cba.b;
/*     */     }
/*     */     
/* 317 */     return cba2;
/*     */   }
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2, EnumSet<cba> enumSet, cba cba1, el el1) {
/* 321 */     for (int i2 = 0; i2 < m; i2++) {
/* 322 */       for (int i3 = 0; i3 < n; i3++) {
/* 323 */         for (int i4 = 0; i4 < i1; i4++) {
/* 324 */           int i5 = i2 + i;
/* 325 */           int i6 = i3 + j;
/* 326 */           int i7 = i4 + k;
/*     */           
/* 328 */           cba cba2 = a(☃, i5, i6, i7);
/*     */           
/* 330 */           if (cba2 == cba.q && bool1 && bool2) {
/* 331 */             cba2 = cba.c;
/*     */           }
/* 333 */           if (cba2 == cba.p && !bool2) {
/* 334 */             cba2 = cba.a;
/*     */           }
/* 336 */           if (cba2 == cba.i && !(☃.a_(el1).c() instanceof bco) && !(☃.a_(el1.b()).c() instanceof bco)) {
/* 337 */             cba2 = cba.e;
/*     */           }
/*     */           
/* 340 */           if (i2 == 0 && i3 == 0 && i4 == 0) {
/* 341 */             cba1 = cba2;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 361 */           enumSet.add(cba2);
/*     */         } 
/*     */       } 
/*     */     } 
/* 365 */     return cba1;
/*     */   }
/*     */   
/*     */   private cba a(afb ☃, el el1) {
/* 369 */     return a(☃, el1.o(), el1.p(), el1.q());
/*     */   }
/*     */   
/*     */   private cba a(afb ☃, int i, int j, int k) {
/* 373 */     return a(this.a, i, j, k, ☃, this.d, this.e, this.f, d(), c());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k) {
/* 379 */     cba cba = b(☃, i, j, k);
/*     */     
/* 381 */     if (cba == cba.b && j >= 1) {
/* 382 */       bcs bcs = ☃.a_(new el(i, j - 1, k)).c();
/* 383 */       cba cba1 = b(☃, i, j - 1, k);
/* 384 */       cba = (cba1 == cba.c || cba1 == cba.b || cba1 == cba.g || cba1 == cba.f) ? cba.b : cba.c;
/*     */ 
/*     */       
/* 387 */       if (cba1 == cba.k || bcs == bct.ik) {
/* 388 */         cba = cba.k;
/*     */       }
/*     */       
/* 391 */       if (cba1 == cba.m) {
/* 392 */         cba = cba.m;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 397 */     cba = a(☃, i, j, k, cba);
/*     */     
/* 399 */     return cba;
/*     */   }
/*     */ 
/*     */   
/*     */   public cba a(axk ☃, int i, int j, int k, cba cba1) {
/* 404 */     if (cba1 == cba.c) {
/* 405 */       try (el.b ☃ = el.b.r()) {
/* 406 */         for (int m = -1; m <= 1; m++) {
/* 407 */           for (int n = -1; n <= 1; n++) {
/* 408 */             if (m != 0 || n != 0) {
/* 409 */               bcs bcs = ☃.a_(b.f(m + i, j, n + k)).c();
/*     */               
/* 411 */               if (bcs == bct.cT) {
/* 412 */                 cba1 = cba.l;
/* 413 */               } else if (bcs == bct.ch) {
/* 414 */                 cba1 = cba.j;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/* 421 */     return cba1;
/*     */   }
/*     */   
/*     */   protected cba b(axk ☃, int i, int j, int k) {
/* 425 */     el el = new el(i, j, k);
/* 426 */     blc blc = ☃.a_(el);
/* 427 */     bcs bcs = blc.c();
/* 428 */     bza bza = blc.d();
/*     */     
/* 430 */     if (blc.f()) {
/* 431 */       return cba.b;
/*     */     }
/*     */     
/* 434 */     if (bcs.a(wv.B) || bcs == bct.dW) {
/* 435 */       return cba.d;
/*     */     }
/*     */     
/* 438 */     if (bcs == bct.ch) {
/* 439 */       return cba.k;
/*     */     }
/*     */     
/* 442 */     if (bcs == bct.cT) {
/* 443 */       return cba.m;
/*     */     }
/*     */     
/* 446 */     if (bcs instanceof bed && bza == bza.w && !((Boolean)blc.c(bed.b)).booleanValue())
/* 447 */       return cba.q; 
/* 448 */     if (bcs instanceof bed && bza == bza.E && !((Boolean)blc.c(bed.b)).booleanValue())
/* 449 */       return cba.r; 
/* 450 */     if (bcs instanceof bed && ((Boolean)blc.c(bed.b)).booleanValue()) {
/* 451 */       return cba.p;
/*     */     }
/*     */     
/* 454 */     if (bcs instanceof bco) {
/* 455 */       return cba.i;
/*     */     }
/*     */     
/* 458 */     if (bcs instanceof ber || bcs instanceof bis || (bcs instanceof bes && !((Boolean)blc.c(bes.a)).booleanValue())) {
/* 459 */       return cba.e;
/*     */     }
/*     */     
/* 462 */     byw byw = ☃.b(el);
/* 463 */     if (byw.a(ww.a))
/* 464 */       return cba.g; 
/* 465 */     if (byw.a(ww.b)) {
/* 466 */       return cba.f;
/*     */     }
/*     */ 
/*     */     
/* 470 */     if (blc.a(☃, el, cbf.a)) {
/* 471 */       return cba.b;
/*     */     }
/*     */     
/* 474 */     return cba.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */