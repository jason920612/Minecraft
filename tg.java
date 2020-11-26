/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class tg
/*     */ {
/*     */   public axy a;
/*     */   public tf b;
/*  30 */   private axv c = axv.a;
/*     */   
/*     */   private boolean d;
/*     */   private int e;
/*  34 */   private el f = el.a;
/*     */   
/*     */   private int g;
/*     */   private boolean h;
/*  38 */   private el i = el.a;
/*     */   private int j;
/*  40 */   private int k = -1;
/*     */   
/*     */   public tg(axy ☃) {
/*  43 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(axv ☃) {
/*  47 */     this.c = ☃;
/*     */     
/*  49 */     ☃.a(this.b.bV);
/*     */     
/*  51 */     this.b.r();
/*  52 */     this.b.b.ac().a(new kr(kr.a.b, new tf[] { this.b }));
/*  53 */     this.a.k_();
/*     */   }
/*     */   
/*     */   public axv b() {
/*  57 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  61 */     return this.c.f();
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  65 */     return this.c.e();
/*     */   }
/*     */   
/*     */   public void b(axv ☃) {
/*  69 */     if (this.c == axv.a) {
/*  70 */       this.c = ☃;
/*     */     }
/*  72 */     a(this.c);
/*     */   }
/*     */   
/*     */   public void a() {
/*  76 */     this.g++;
/*     */     
/*  78 */     if (this.h) {
/*  79 */       int ☃ = this.g - this.j;
/*  80 */       blc blc = this.a.a_(this.i);
/*  81 */       if (blc.f()) {
/*  82 */         this.h = false;
/*     */       } else {
/*  84 */         float f = blc.a(this.b, this.b.m, this.i) * (☃ + 1);
/*  85 */         int i = (int)(f * 10.0F);
/*     */         
/*  87 */         if (i != this.k) {
/*  88 */           this.a.c(this.b.Q(), this.i, i);
/*  89 */           this.k = i;
/*     */         } 
/*     */         
/*  92 */         if (f >= 1.0F) {
/*  93 */           this.h = false;
/*  94 */           b(this.i);
/*     */         } 
/*     */       } 
/*  97 */     } else if (this.d) {
/*  98 */       blc ☃ = this.a.a_(this.f);
/*     */       
/* 100 */       if (☃.f()) {
/* 101 */         this.a.c(this.b.Q(), this.f, -1);
/* 102 */         this.k = -1;
/* 103 */         this.d = false;
/*     */       } else {
/* 105 */         int i = this.g - this.e;
/* 106 */         float f = ☃.a(this.b, this.b.m, this.i) * (i + 1);
/* 107 */         int j = (int)(f * 10.0F);
/*     */         
/* 109 */         if (j != this.k) {
/* 110 */           this.a.c(this.b.Q(), this.f, j);
/* 111 */           this.k = j;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(el ☃, eq eq1) {
/* 118 */     if (d()) {
/* 119 */       if (!this.a.a((aog)null, ☃, eq1)) {
/* 120 */         b(☃);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 125 */     if (this.c.d()) {
/* 126 */       if (this.c == axv.e) {
/*     */         return;
/*     */       }
/* 129 */       if (!this.b.dy()) {
/* 130 */         ate ate = this.b.cB();
/* 131 */         if (ate.a()) {
/*     */           return;
/*     */         }
/* 134 */         blh blh = new blh(this.a, ☃, false);
/* 135 */         if (!ate.a(this.a.F(), blh)) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 141 */     this.a.a((aog)null, ☃, eq1);
/* 142 */     this.e = this.g;
/* 143 */     float f = 1.0F;
/* 144 */     blc blc = this.a.a_(☃);
/* 145 */     if (!blc.f()) {
/* 146 */       blc.a(this.a, ☃, this.b);
/* 147 */       f = blc.a(this.b, this.b.m, ☃);
/*     */     } 
/*     */     
/* 150 */     if (!blc.f() && f >= 1.0F) {
/* 151 */       b(☃);
/*     */     } else {
/* 153 */       this.d = true;
/* 154 */       this.f = ☃;
/*     */       
/* 156 */       int i = (int)(f * 10.0F);
/* 157 */       this.a.c(this.b.Q(), ☃, i);
/* 158 */       this.b.a.a(new jk(this.a, ☃));
/*     */       
/* 160 */       this.k = i;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(el ☃) {
/* 165 */     if (☃.equals(this.f)) {
/* 166 */       int i = this.g - this.e;
/*     */       
/* 168 */       blc blc = this.a.a_(☃);
/* 169 */       if (!blc.f()) {
/* 170 */         float f = blc.a(this.b, this.b.m, ☃) * (i + 1);
/* 171 */         if (f >= 0.7F) {
/* 172 */           this.d = false;
/* 173 */           this.a.c(this.b.Q(), ☃, -1);
/* 174 */           b(☃);
/* 175 */         } else if (!this.h) {
/* 176 */           this.d = false;
/* 177 */           this.h = true;
/* 178 */           this.i = ☃;
/* 179 */           this.j = this.e;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void e() {
/* 186 */     this.d = false;
/*     */     
/* 188 */     this.a.c(this.b.Q(), this.f, -1);
/*     */   }
/*     */   
/*     */   private boolean c(el ☃) {
/* 192 */     blc blc = this.a.a_(☃);
/*     */     
/* 194 */     blc.c().a(this.a, ☃, blc, this.b);
/*     */     
/* 196 */     boolean bool = this.a.g(☃);
/* 197 */     if (bool) {
/* 198 */       blc.c().b(this.a, ☃, blc);
/*     */     }
/* 200 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean b(el ☃) {
/* 204 */     blc blc = this.a.a_(☃);
/* 205 */     if (!this.b.cB().b().a(blc, this.a, ☃, this.b)) {
/* 206 */       return false;
/*     */     }
/*     */     
/* 209 */     bji bji = this.a.f(☃);
/* 210 */     bcs bcs = blc.c();
/*     */     
/* 212 */     if ((bcs instanceof bdm || bcs instanceof bid) && !this.b.dK()) {
/* 213 */       this.a.a(☃, blc, blc, 3);
/* 214 */       return false;
/*     */     } 
/*     */     
/* 217 */     if (this.c.d()) {
/* 218 */       if (this.c == axv.e) {
/* 219 */         return false;
/*     */       }
/* 221 */       if (!this.b.dy()) {
/* 222 */         ate ate = this.b.cB();
/* 223 */         if (ate.a()) {
/* 224 */           return false;
/*     */         }
/* 226 */         blh blh = new blh(this.a, ☃, false);
/* 227 */         if (!ate.a(this.a.F(), blh)) {
/* 228 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 233 */     boolean bool = c(☃);
/*     */     
/* 235 */     if (!d()) {
/* 236 */       ate ate = this.b.cB();
/* 237 */       boolean bool1 = this.b.c(blc);
/* 238 */       ate.a(this.a, blc, ☃, this.b);
/* 239 */       if (bool && bool1) {
/* 240 */         ate ate1 = ate.a() ? ate.a : ate.i();
/* 241 */         blc.c().a(this.a, this.b, ☃, blc, bji, ate1);
/*     */       } 
/*     */     } 
/* 244 */     return bool;
/*     */   }
/*     */   
/*     */   public adm a(aog ☃, axy axy1, ate ate1, adk adk1) {
/* 248 */     if (this.c == axv.e) {
/* 249 */       return adm.b;
/*     */     }
/* 251 */     if (☃.dI().a(ate1.b())) {
/* 252 */       return adm.b;
/*     */     }
/*     */     
/* 255 */     int i = ate1.C();
/* 256 */     int j = ate1.g();
/* 257 */     adn<ate> adn = ate1.a(axy1, ☃, adk1);
/*     */     
/* 259 */     ate ate2 = adn.b();
/* 260 */     if (ate2 == ate1 && ate2.C() == i && ate2.k() <= 0 && ate2.g() == j) {
/* 261 */       return adn.a();
/*     */     }
/*     */     
/* 264 */     if (adn.a() == adm.c && ate2.k() > 0 && !☃.cT()) {
/* 265 */       return adn.a();
/*     */     }
/*     */     
/* 268 */     ☃.a(adk1, ate2);
/* 269 */     if (d()) {
/* 270 */       ate2.e(i);
/* 271 */       if (ate2.e()) {
/* 272 */         ate2.b(j);
/*     */       }
/*     */     } 
/* 275 */     if (ate2.a()) {
/* 276 */       ☃.a(adk1, ate.a);
/*     */     }
/* 278 */     if (!☃.cT()) {
/* 279 */       ((tf)☃).a(☃.bD);
/*     */     }
/* 281 */     return adn.a();
/*     */   }
/*     */   
/*     */   public adm a(aog ☃, axy axy1, ate ate1, adk adk1, el el1, eq eq1, float f1, float f2, float f3) {
/* 285 */     blc blc = axy1.a_(el1);
/* 286 */     if (this.c == axv.e) {
/* 287 */       bji bji = axy1.f(el1);
/* 288 */       if (bji instanceof adq) {
/* 289 */         bcs bcs = blc.c();
/* 290 */         adq adq = (adq)bji;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 295 */         if (adq instanceof bjl && bcs instanceof bdh) {
/* 296 */           adq = ((bdh)bcs).a(blc, axy1, el1, false);
/*     */         }
/*     */         
/* 299 */         if (adq != null) {
/* 300 */           ☃.a(adq);
/* 301 */           return adm.a;
/*     */         } 
/* 303 */       } else if (bji instanceof ade) {
/* 304 */         ☃.a((ade)bji);
/* 305 */         return adm.a;
/*     */       } 
/* 307 */       return adm.b;
/*     */     } 
/*     */     
/* 310 */     boolean bool1 = (!☃.cB().a() || !☃.cC().a());
/* 311 */     boolean bool2 = (☃.aZ() && bool1);
/*     */     
/* 313 */     if (!bool2 && blc.a(axy1, el1, ☃, adk1, eq1, f1, f2, f3))
/*     */     {
/* 315 */       return adm.a;
/*     */     }
/*     */     
/* 318 */     if (ate1.a() || ☃.dI().a(ate1.b())) {
/* 319 */       return adm.b;
/*     */     }
/*     */     
/* 322 */     aup aup = new aup(☃, ☃.b(adk1), el1, eq1, f1, f2, f3);
/* 323 */     if (d()) {
/*     */       
/* 325 */       int i = ate1.C();
/* 326 */       adm adm = ate1.a(aup);
/* 327 */       ate1.e(i);
/* 328 */       return adm;
/*     */     } 
/* 330 */     return ate1.a(aup);
/*     */   }
/*     */   
/*     */   public void a(td ☃) {
/* 334 */     this.a = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\tg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */