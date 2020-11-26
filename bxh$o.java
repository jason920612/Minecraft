/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class o
/*     */   extends bxb
/*     */ {
/* 253 */   protected int f = -1;
/*     */   
/*     */   private int a;
/*     */   
/*     */   protected bxh.n g;
/*     */   protected boolean h;
/*     */   
/*     */   public o() {}
/*     */   
/*     */   protected o(bxh.k ☃, int i) {
/* 263 */     super(i);
/* 264 */     if (☃ != null) {
/* 265 */       this.g = ☃.g;
/* 266 */       this.h = ☃.h;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 272 */     ☃.b("HPos", this.f);
/* 273 */     ☃.b("VCount", this.a);
/* 274 */     ☃.a("Type", (byte)this.g.a());
/* 275 */     ☃.a("Zombie", this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/* 280 */     this.f = ☃.h("HPos");
/* 281 */     this.a = ☃.h("VCount");
/* 282 */     this.g = bxh.n.a(☃.f("Type"));
/* 283 */     if (☃.q("Desert")) {
/* 284 */       this.g = bxh.n.b;
/*     */     }
/* 286 */     this.h = ☃.q("Zombie");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb a(bxh.k ☃, List<bxb> list, Random random, int i, int j) {
/* 291 */     eq eq = f();
/* 292 */     if (eq != null) {
/* 293 */       switch (bxh.null.a[eq.ordinal()])
/*     */       
/*     */       { default:
/* 296 */           return bxh.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*     */         case 2:
/* 298 */           return bxh.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*     */         case 3:
/* 300 */           return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*     */         case 4:
/* 302 */           break; }  return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*     */     } 
/*     */     
/* 305 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb b(bxh.k ☃, List<bxb> list, Random random, int i, int j) {
/* 310 */     eq eq = f();
/* 311 */     if (eq != null) {
/* 312 */       switch (bxh.null.a[eq.ordinal()])
/*     */       
/*     */       { default:
/* 315 */           return bxh.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*     */         case 2:
/* 317 */           return bxh.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*     */         case 3:
/* 319 */           return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*     */         case 4:
/* 321 */           break; }  return bxh.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*     */     } 
/*     */     
/* 324 */     return null;
/*     */   }
/*     */   
/*     */   protected int a(axz ☃, bwf bwf1) {
/* 328 */     int i = 0;
/* 329 */     int j = 0;
/* 330 */     el.a a = new el.a();
/* 331 */     for (int k = this.n.c; k <= this.n.f; k++) {
/* 332 */       for (int m = this.n.a; m <= this.n.d; m++) {
/* 333 */         a.c(m, 64, k);
/* 334 */         if (bwf1.b(a)) {
/* 335 */           i += ☃.a(bor.a.e, a).p();
/* 336 */           j++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 341 */     if (j == 0) {
/* 342 */       return -1;
/*     */     }
/* 344 */     return i / j;
/*     */   }
/*     */   
/*     */   protected static boolean a(bwf ☃) {
/* 348 */     return (☃ != null && ☃.b > 10);
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
/*     */   protected void a(axz ☃, bwf bwf1, int i, int j, int k, int m) {
/* 363 */     if (this.a >= m) {
/*     */       return;
/*     */     }
/*     */     
/* 367 */     int i1 = this.a;
/* 368 */     int i2 = a(i + i1, k);
/* 369 */     int i3 = d(j);
/* 370 */     int i4 = b(i + i1, k);
/*     */     
/* 372 */     for (; i1 < m && bwf1.b(new el(i2, i3, i4)); i1++) {
/* 373 */       this.a++;
/*     */       
/* 375 */       if (this.h) {
/* 376 */         anx anx = new anx(☃.f());
/* 377 */         anx.b(i2 + 0.5D, i3, i4 + 0.5D, 0.0F, 0.0F);
/* 378 */         anx.a(☃.h(new el(anx)), (afj)null, (gy)null);
/* 379 */         anx.a(c(i1, 0));
/* 380 */         anx.di();
/* 381 */         ☃.a(anx);
/*     */       } else {
/* 383 */         aob aob = new aob(☃.f());
/* 384 */         aob.b(i2 + 0.5D, i3, i4 + 0.5D, 0.0F, 0.0F);
/* 385 */         aob.d(c(i1, ☃.m().nextInt(6)));
/* 386 */         aob.a(☃.h(new el(aob)), (afj)null, (gy)null, false);
/* 387 */         ☃.a(aob);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int c(int ☃, int i) {
/* 397 */     return i;
/*     */   }
/*     */   
/*     */   protected blc a(blc ☃) {
/* 401 */     bcs bcs = ☃.c();
/* 402 */     if (this.g == bxh.n.b) {
/* 403 */       if (bcs.a(wv.n) || bcs == bct.m)
/* 404 */         return bct.at.p(); 
/* 405 */       if (bcs.a(wv.b))
/* 406 */         return bct.av.p(); 
/* 407 */       if (bcs == bct.cj)
/* 408 */         return bct.ek.p().a(bhx.a, ☃.c(bhx.a)); 
/* 409 */       if (bcs == bct.cB)
/* 410 */         return bct.ek.p().a(bhx.a, ☃.c(bhx.a)); 
/* 411 */       if (bcs == bct.F)
/* 412 */         return bct.at.p(); 
/* 413 */       if (bcs == bct.cG) {
/* 414 */         return bct.cI.p();
/*     */       }
/* 416 */     } else if (this.g == bxh.n.d) {
/* 417 */       if (bcs.a(wv.n))
/* 418 */         return bct.K.p().a(bfw.a, ☃.c(bfw.a)); 
/* 419 */       if (bcs.a(wv.b))
/* 420 */         return bct.o.p(); 
/* 421 */       if (bcs == bct.cj)
/* 422 */         return bct.eq.p().a(bhx.a, ☃.c(bhx.a)); 
/* 423 */       if (bcs == bct.cX)
/* 424 */         return bct.cY.p(); 
/* 425 */       if (bcs == bct.cG) {
/* 426 */         return bct.cH.p();
/*     */       }
/* 428 */     } else if (this.g == bxh.n.c) {
/* 429 */       if (bcs.a(wv.n))
/* 430 */         return bct.N.p().a(bfw.a, ☃.c(bfw.a)); 
/* 431 */       if (bcs.a(wv.b))
/* 432 */         return bct.r.p(); 
/* 433 */       if (bcs == bct.cj)
/* 434 */         return bct.gr.p().a(bhx.a, ☃.c(bhx.a)); 
/* 435 */       if (bcs == bct.m)
/* 436 */         return bct.N.p().a(bfw.a, eq.a.b); 
/* 437 */       if (bcs == bct.cX)
/* 438 */         return bct.dc.p(); 
/* 439 */       if (bcs == bct.cG) {
/* 440 */         return bct.cK.p();
/*     */       }
/*     */     } 
/* 443 */     return ☃;
/*     */   }
/*     */   
/*     */   protected bed b() {
/* 447 */     if (this.g == bxh.n.c)
/* 448 */       return (bed)bct.cx; 
/* 449 */     if (this.g == bxh.n.d) {
/* 450 */       return (bed)bct.cu;
/*     */     }
/* 452 */     return (bed)bct.ct;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, bwf bwf1, Random random, int i, int j, int k, eq eq1) {
/* 457 */     if (!this.h) {
/* 458 */       a(☃, bwf1, random, i, j, k, eq.c, b());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, eq eq1, int i, int j, int k, bwf bwf1) {
/* 463 */     if (!this.h) {
/* 464 */       a(☃, bct.cg.p().a(biv.a, eq1), i, j, k, bwf1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(axz ☃, blc blc1, int i, int j, int k, bwf bwf1) {
/* 470 */     blc blc2 = a(blc1);
/* 471 */     super.b(☃, blc2, i, j, k, bwf1);
/*     */   }
/*     */   
/*     */   protected void a(bxh.n ☃) {
/* 475 */     this.g = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxh$o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */