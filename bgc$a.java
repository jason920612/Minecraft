/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final axz a;
/*     */   private final eq.a b;
/*     */   private final eq c;
/*     */   private final eq d;
/*     */   private int e;
/*     */   private el f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public a(axz ☃, el el1, eq.a a1) {
/* 247 */     this.a = ☃;
/* 248 */     this.b = a1;
/* 249 */     if (a1 == eq.a.a) {
/* 250 */       this.d = eq.f;
/* 251 */       this.c = eq.e;
/*     */     } else {
/* 253 */       this.d = eq.c;
/* 254 */       this.c = eq.d;
/*     */     } 
/*     */     
/* 257 */     el el2 = el1;
/* 258 */     while (el1.p() > el2.p() - 21 && el1.p() > 0 && a(☃.a_(el1.b()))) {
/* 259 */       el1 = el1.b();
/*     */     }
/*     */     
/* 262 */     int i = a(el1, this.d) - 1;
/*     */     
/* 264 */     if (i >= 0) {
/* 265 */       this.f = el1.a(this.d, i);
/*     */       
/* 267 */       this.h = a(this.f, this.c);
/*     */       
/* 269 */       if (this.h < 2 || this.h > 21) {
/* 270 */         this.f = null;
/* 271 */         this.h = 0;
/*     */       } 
/*     */     } 
/*     */     
/* 275 */     if (this.f != null) {
/* 276 */       this.g = c();
/*     */     }
/*     */   }
/*     */   
/*     */   protected int a(el ☃, eq eq1) {
/*     */     int i;
/* 282 */     for (i = 0; i < 22; i++) {
/* 283 */       el el1 = ☃.a(eq1, i);
/* 284 */       if (!a(this.a.a_(el1))) {
/*     */         break;
/*     */       }
/*     */       
/* 288 */       if (this.a.a_(el1.b()).c() != bct.ce) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/* 293 */     bcs bcs = this.a.a_(☃.a(eq1, i)).c();
/* 294 */     if (bcs == bct.ce) {
/* 295 */       return i;
/*     */     }
/*     */     
/* 298 */     return 0;
/*     */   }
/*     */   
/*     */   public int a() {
/* 302 */     return this.g;
/*     */   }
/*     */   
/*     */   public int b() {
/* 306 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int c() {
/* 311 */     label39: for (this.g = 0; this.g < 21; this.g++) {
/* 312 */       for (int i = 0; i < this.h; i++) {
/* 313 */         el el1 = this.f.a(this.c, i).b(this.g);
/*     */         
/* 315 */         blc blc = this.a.a_(el1);
/* 316 */         if (!a(blc)) {
/*     */           break label39;
/*     */         }
/*     */         
/* 320 */         bcs bcs = blc.c();
/* 321 */         if (bcs == bct.dh) {
/* 322 */           this.e++;
/*     */         }
/*     */         
/* 325 */         if (i == 0) {
/* 326 */           bcs = this.a.a_(el1.a(this.d)).c();
/* 327 */           if (bcs != bct.ce) {
/*     */             break label39;
/*     */           }
/* 330 */         } else if (i == this.h - 1) {
/* 331 */           bcs = this.a.a_(el1.a(this.c)).c();
/* 332 */           if (bcs != bct.ce) {
/*     */             break label39;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 339 */     for (int ☃ = 0; ☃ < this.h; ☃++) {
/* 340 */       if (this.a.a_(this.f.a(this.c, ☃).b(this.g)).c() != bct.ce) {
/* 341 */         this.g = 0;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 346 */     if (this.g > 21 || this.g < 3) {
/* 347 */       this.f = null;
/* 348 */       this.h = 0;
/* 349 */       this.g = 0;
/* 350 */       return 0;
/*     */     } 
/* 352 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(blc ☃) {
/* 357 */     bcs bcs = ☃.c();
/* 358 */     return (☃.f() || bcs == bct.ch || bcs == bct.dh);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 362 */     return (this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21);
/*     */   }
/*     */   
/*     */   public void e() {
/* 366 */     for (int ☃ = 0; ☃ < this.h; ☃++) {
/* 367 */       el el1 = this.f.a(this.c, ☃);
/* 368 */       for (int i = 0; i < this.g; i++) {
/* 369 */         this.a.a(el1.b(i), bct.dh.p().a(bgc.a, this.b), 18);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g() {
/* 375 */     return (this.e >= this.h * this.g);
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 379 */     return (d() && g());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */