/*     */ import java.util.Collections;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amg
/*     */   extends aer
/*     */ {
/*     */   enum a
/*     */   {
/*  42 */     a, b, c;
/*     */   }
/*  44 */   private static final or<Integer> b = ou.a((Class)amg.class, ot.b);
/*     */   
/*     */   private boolean c;
/*     */   
/*     */   private int d;
/*     */   
/*     */   private aog e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int aw;
/*     */   private float ax;
/*     */   public aer a;
/*  57 */   private a ay = a.a;
/*     */   
/*     */   private int az;
/*     */   private int aA;
/*     */   
/*     */   private amg(axy ☃) {
/*  63 */     super(aev.aP, ☃);
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
/*     */   public amg(axy ☃, aog aog1) {
/*  77 */     this(☃);
/*  78 */     a(aog1);
/*  79 */     k();
/*     */   }
/*     */   
/*     */   private void a(aog ☃) {
/*  83 */     a(0.25F, 0.25F);
/*  84 */     this.ak = true;
/*  85 */     this.e = ☃;
/*  86 */     this.e.cb = this;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  90 */     this.aA = ☃;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  94 */     this.az = ☃;
/*     */   }
/*     */   
/*     */   private void k() {
/*  98 */     float ☃ = this.e.x;
/*  99 */     float f1 = this.e.w;
/*     */     
/* 101 */     float f2 = xq.b(-f1 * 0.017453292F - 3.1415927F);
/* 102 */     float f3 = xq.a(-f1 * 0.017453292F - 3.1415927F);
/* 103 */     float f4 = -xq.b(-☃ * 0.017453292F);
/* 104 */     float f5 = xq.a(-☃ * 0.017453292F);
/*     */     
/* 106 */     double d1 = this.e.q - f3 * 0.3D;
/* 107 */     double d2 = this.e.r + this.e.bF();
/* 108 */     double d3 = this.e.s - f2 * 0.3D;
/*     */     
/* 110 */     b(d1, d2, d3, f1, ☃);
/*     */     
/* 112 */     this.t = -f3;
/* 113 */     this.u = xq.a(-(f5 / f4), -5.0F, 5.0F);
/* 114 */     this.v = -f2;
/*     */     
/* 116 */     float f6 = xq.a(this.t * this.t + this.u * this.u + this.v * this.v);
/*     */     
/* 118 */     this.t *= 0.6D / f6 + 0.5D + this.T.nextGaussian() * 0.0045D;
/* 119 */     this.u *= 0.6D / f6 + 0.5D + this.T.nextGaussian() * 0.0045D;
/* 120 */     this.v *= 0.6D / f6 + 0.5D + this.T.nextGaussian() * 0.0045D;
/*     */     
/* 122 */     float f7 = xq.a(this.t * this.t + this.v * this.v);
/*     */     
/* 124 */     this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/* 125 */     this.x = (float)(xq.c(this.u, f7) * 57.2957763671875D);
/* 126 */     this.y = this.w;
/* 127 */     this.z = this.x;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 132 */     T().a(b, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 137 */     if (b.equals(☃)) {
/* 138 */       int i = ((Integer)T().<Integer>a(b)).intValue();
/* 139 */       this.a = (i > 0) ? this.m.a(i - 1) : null;
/*     */     } 
/*     */     
/* 142 */     super.a(☃);
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
/*     */   public void R_() {
/* 158 */     super.R_();
/*     */     
/* 160 */     if (this.e == null) {
/* 161 */       V();
/*     */       return;
/*     */     } 
/* 164 */     if (!this.m.B && 
/* 165 */       l()) {
/*     */       return;
/*     */     }
/*     */     
/* 169 */     if (this.c) {
/* 170 */       this.d++;
/* 171 */       if (this.d >= 1200) {
/* 172 */         V();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 177 */     float ☃ = 0.0F;
/* 178 */     el el = new el(this);
/*     */     
/* 180 */     byw byw = this.m.b(el);
/* 181 */     if (byw.a(ww.a)) {
/* 182 */       ☃ = byw.f();
/*     */     }
/*     */     
/* 185 */     if (this.ay == a.a)
/* 186 */     { if (this.a != null) {
/* 187 */         this.t = 0.0D;
/* 188 */         this.u = 0.0D;
/* 189 */         this.v = 0.0D;
/*     */         
/* 191 */         this.ay = a.b;
/*     */         
/*     */         return;
/*     */       } 
/* 195 */       if (☃ > 0.0F) {
/* 196 */         this.t *= 0.3D;
/* 197 */         this.u *= 0.2D;
/* 198 */         this.v *= 0.3D;
/*     */         
/* 200 */         this.ay = a.c;
/*     */         
/*     */         return;
/*     */       } 
/* 204 */       if (!this.m.B) {
/* 205 */         n();
/*     */       }
/*     */       
/* 208 */       if (this.c || this.A || this.B) {
/* 209 */         this.f = 0;
/* 210 */         this.t = 0.0D;
/* 211 */         this.u = 0.0D;
/* 212 */         this.v = 0.0D;
/*     */       } else {
/* 214 */         this.f++;
/*     */       }  }
/* 216 */     else { if (this.ay == a.b) {
/* 217 */         if (this.a != null)
/* 218 */           if (this.a.G) {
/* 219 */             this.a = null;
/* 220 */             this.ay = a.a;
/*     */           } else {
/* 222 */             this.q = this.a.q;
/* 223 */             this.r = (this.a.bD()).b + this.a.I * 0.8D;
/* 224 */             this.s = this.a.s;
/*     */             
/* 226 */             b(this.q, this.r, this.s);
/*     */           }  
/*     */         return;
/*     */       } 
/* 230 */       if (this.ay == a.c) {
/* 231 */         this.t *= 0.9D;
/* 232 */         this.v *= 0.9D;
/*     */         
/* 234 */         double d1 = this.r + this.u - el.p() - ☃;
/* 235 */         if (Math.abs(d1) < 0.01D) {
/* 236 */           d1 += Math.signum(d1) * 0.1D;
/*     */         }
/*     */         
/* 239 */         this.u -= d1 * this.T.nextFloat() * 0.2D;
/*     */         
/* 241 */         if (!this.m.B && ☃ > 0.0F) {
/* 242 */           a(el);
/*     */         }
/*     */       }  }
/*     */     
/* 246 */     if (!byw.a(ww.a)) {
/* 247 */       this.u -= 0.03D;
/*     */     }
/*     */     
/* 250 */     a(afe.a, this.t, this.u, this.v);
/* 251 */     m();
/*     */     
/* 253 */     double d = 0.92D;
/* 254 */     this.t *= 0.92D;
/* 255 */     this.u *= 0.92D;
/* 256 */     this.v *= 0.92D;
/*     */     
/* 258 */     b(this.q, this.r, this.s);
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 262 */     ate ☃ = this.e.cB();
/* 263 */     ate ate1 = this.e.cC();
/* 264 */     boolean bool1 = (☃.b() == atf.aY);
/* 265 */     boolean bool2 = (ate1.b() == atf.aY);
/* 266 */     if (this.e.G || !this.e.aF() || (!bool1 && !bool2) || h(this.e) > 1024.0D) {
/* 267 */       V();
/* 268 */       return true;
/*     */     } 
/* 270 */     return false;
/*     */   }
/*     */   
/*     */   private void m() {
/* 274 */     float ☃ = xq.a(this.t * this.t + this.v * this.v);
/* 275 */     this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/* 276 */     this.x = (float)(xq.c(this.u, ☃) * 57.2957763671875D);
/*     */     
/* 278 */     while (this.x - this.z < -180.0F) {
/* 279 */       this.z -= 360.0F;
/*     */     }
/* 281 */     while (this.x - this.z >= 180.0F) {
/* 282 */       this.z += 360.0F;
/*     */     }
/*     */     
/* 285 */     while (this.w - this.y < -180.0F) {
/* 286 */       this.y -= 360.0F;
/*     */     }
/* 288 */     while (this.w - this.y >= 180.0F) {
/* 289 */       this.y += 360.0F;
/*     */     }
/*     */     
/* 292 */     this.x = this.z + (this.x - this.z) * 0.2F;
/* 293 */     this.w = this.y + (this.w - this.y) * 0.2F;
/*     */   }
/*     */   
/*     */   private void n() {
/* 297 */     cee ☃ = new cee(this.q, this.r, this.s);
/* 298 */     cee cee1 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/* 299 */     ceb ceb = this.m.a(☃, cee1, cec.a, true, false);
/*     */     
/* 301 */     ☃ = new cee(this.q, this.r, this.s);
/* 302 */     cee1 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/* 303 */     if (ceb != null) {
/* 304 */       cee1 = new cee(ceb.c.b, ceb.c.c, ceb.c.d);
/*     */     }
/*     */     
/* 307 */     aer aer1 = null;
/* 308 */     List<aer> list = this.m.a(this, bD().b(this.t, this.u, this.v).g(1.0D));
/* 309 */     double d = 0.0D;
/* 310 */     for (aer aer2 : list) {
/* 311 */       if (!a(aer2) || (aer2 == this.e && this.f < 5)) {
/*     */         continue;
/*     */       }
/*     */       
/* 315 */       cea cea = aer2.bD().g(0.30000001192092896D);
/* 316 */       ceb ceb1 = cea.b(☃, cee1);
/* 317 */       if (ceb1 != null) {
/* 318 */         double d1 = ☃.g(ceb1.c);
/* 319 */         if (d1 < d || d == 0.0D) {
/* 320 */           aer1 = aer2;
/* 321 */           d = d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 326 */     if (aer1 != null) {
/* 327 */       ceb = new ceb(aer1);
/*     */     }
/*     */     
/* 330 */     if (ceb != null && ceb.a != ceb.a.a) {
/* 331 */       if (ceb.a == ceb.a.c) {
/* 332 */         this.a = ceb.d;
/* 333 */         o();
/*     */       } else {
/* 335 */         this.c = true;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void o() {
/* 341 */     T().b(b, Integer.valueOf(this.a.Q() + 1));
/*     */   }
/*     */   
/*     */   private void a(el ☃) {
/* 345 */     td td = (td)this.m;
/*     */     
/* 347 */     int i = 1;
/* 348 */     el el1 = ☃.a();
/* 349 */     if (this.T.nextFloat() < 0.25F && this.m.w(el1)) {
/* 350 */       i++;
/*     */     }
/* 352 */     if (this.T.nextFloat() < 0.5F && !this.m.e(el1)) {
/* 353 */       i--;
/*     */     }
/*     */     
/* 356 */     if (this.g > 0) {
/* 357 */       this.g--;
/*     */       
/* 359 */       if (this.g <= 0) {
/* 360 */         this.h = 0;
/* 361 */         this.aw = 0;
/*     */       } else {
/* 363 */         this.u -= 0.2D * this.T.nextFloat() * this.T.nextFloat();
/*     */       } 
/* 365 */     } else if (this.aw > 0) {
/* 366 */       this.aw -= i;
/*     */       
/* 368 */       if (this.aw > 0) {
/* 369 */         this.ax = (float)(this.ax + this.T.nextGaussian() * 4.0D);
/*     */         
/* 371 */         float f1 = this.ax * 0.017453292F;
/* 372 */         float f2 = xq.a(f1);
/* 373 */         float f3 = xq.b(f1);
/* 374 */         double d1 = this.q + (f2 * this.aw * 0.1F);
/* 375 */         double d2 = (xq.c((bD()).b) + 1.0F);
/* 376 */         double d3 = this.s + (f3 * this.aw * 0.1F);
/*     */         
/* 378 */         bcs bcs = td.a_(new el(d1, d2 - 1.0D, d3)).c();
/* 379 */         if (bcs == bct.A) {
/* 380 */           if (this.T.nextFloat() < 0.15F) {
/* 381 */             td.a(fm.e, d1, d2 - 0.10000000149011612D, d3, 1, f2, 0.1D, f3, 0.0D);
/*     */           }
/*     */           
/* 384 */           float f4 = f2 * 0.04F;
/* 385 */           float f5 = f3 * 0.04F;
/*     */           
/* 387 */           td.a(fm.x, d1, d2, d3, 0, f5, 0.01D, -f4, 1.0D);
/* 388 */           td.a(fm.x, d1, d2, d3, 0, -f5, 0.01D, f4, 1.0D);
/*     */         } 
/*     */       } else {
/* 391 */         this.u = (-0.4F * xq.a(this.T, 0.6F, 1.0F));
/* 392 */         a(wj.W, 0.25F, 1.0F + (this.T.nextFloat() - this.T.nextFloat()) * 0.4F);
/* 393 */         double d = (bD()).b + 0.5D;
/* 394 */         td.a(fm.e, this.q, d, this.s, (int)(1.0F + this.H * 20.0F), this.H, 0.0D, this.H, 0.20000000298023224D);
/* 395 */         td.a(fm.x, this.q, d, this.s, (int)(1.0F + this.H * 20.0F), this.H, 0.0D, this.H, 0.20000000298023224D);
/*     */         
/* 397 */         this.g = xq.a(this.T, 20, 40);
/*     */       } 
/* 399 */     } else if (this.h > 0) {
/* 400 */       this.h -= i;
/*     */       
/* 402 */       float f = 0.15F;
/* 403 */       if (this.h < 20) {
/* 404 */         f = (float)(f + (20 - this.h) * 0.05D);
/* 405 */       } else if (this.h < 40) {
/* 406 */         f = (float)(f + (40 - this.h) * 0.02D);
/* 407 */       } else if (this.h < 60) {
/* 408 */         f = (float)(f + (60 - this.h) * 0.01D);
/*     */       } 
/*     */       
/* 411 */       if (this.T.nextFloat() < f) {
/* 412 */         float f1 = xq.a(this.T, 0.0F, 360.0F) * 0.017453292F;
/* 413 */         float f2 = xq.a(this.T, 25.0F, 60.0F);
/* 414 */         double d1 = this.q + (xq.a(f1) * f2 * 0.1F);
/* 415 */         double d2 = (xq.c((bD()).b) + 1.0F);
/* 416 */         double d3 = this.s + (xq.b(f1) * f2 * 0.1F);
/* 417 */         bcs bcs = td.a_(new el((int)d1, (int)d2 - 1, (int)d3)).c();
/* 418 */         if (bcs == bct.A) {
/* 419 */           td.a(fm.R, d1, d2, d3, 2 + this.T.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
/*     */         }
/*     */       } 
/*     */       
/* 423 */       if (this.h <= 0) {
/* 424 */         this.ax = xq.a(this.T, 0.0F, 360.0F);
/* 425 */         this.aw = xq.a(this.T, 20, 80);
/*     */       } 
/*     */     } else {
/* 428 */       this.h = xq.a(this.T, 100, 600);
/* 429 */       this.h -= this.aA * 20 * 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(aer ☃) {
/* 434 */     return (☃.aB() || ☃ instanceof amm);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {}
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {}
/*     */ 
/*     */   
/*     */   public int b(ate ☃) {
/* 446 */     if (this.m.B || this.e == null) {
/* 447 */       return 0;
/*     */     }
/*     */     
/* 450 */     int i = 0;
/* 451 */     if (this.a != null) {
/* 452 */       f();
/* 453 */       p.D.a((tf)this.e, ☃, this, Collections.emptyList());
/* 454 */       this.m.a(this, (byte)31);
/* 455 */       i = (this.a instanceof amm) ? 3 : 5;
/* 456 */     } else if (this.g > 0) {
/* 457 */       ccr.a a1 = (new ccr.a((td)this.m)).a(new el(this));
/* 458 */       a1.a(this.az + this.e.dJ());
/* 459 */       List<ate> list = this.m.z().aN().a(ccl.aO).a(this.T, a1.a());
/* 460 */       p.D.a((tf)this.e, ☃, this, list);
/* 461 */       for (ate ate1 : list) {
/* 462 */         amm amm = new amm(this.m, this.q, this.r, this.s, ate1);
/* 463 */         double d1 = this.e.q - this.q;
/* 464 */         double d2 = this.e.r - this.r;
/* 465 */         double d3 = this.e.s - this.s;
/*     */         
/* 467 */         double d4 = xq.a(d1 * d1 + d2 * d2 + d3 * d3);
/* 468 */         double d5 = 0.1D;
/* 469 */         amm.t = d1 * 0.1D;
/* 470 */         amm.u = d2 * 0.1D + xq.a(d4) * 0.08D;
/* 471 */         amm.v = d3 * 0.1D;
/* 472 */         this.m.a(amm);
/* 473 */         this.e.m.a(new aex(this.e.m, this.e.q, this.e.r + 0.5D, this.e.s + 0.5D, this.T.nextInt(6) + 1));
/*     */         
/* 475 */         if (ate1.b().a(wx.D)) {
/* 476 */           this.e.a(ws.P, 1);
/*     */         }
/*     */       } 
/* 479 */       i = 1;
/*     */     } 
/* 481 */     if (this.c) {
/* 482 */       i = 2;
/*     */     }
/*     */     
/* 485 */     V();
/* 486 */     return i;
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
/*     */   protected void f() {
/* 501 */     if (this.e == null) {
/*     */       return;
/*     */     }
/*     */     
/* 505 */     double ☃ = this.e.q - this.q;
/* 506 */     double d1 = this.e.r - this.r;
/* 507 */     double d2 = this.e.s - this.s;
/*     */     
/* 509 */     double d3 = 0.1D;
/* 510 */     this.a.t += ☃ * 0.1D;
/* 511 */     this.a.u += d1 * 0.1D;
/* 512 */     this.a.v += d2 * 0.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/* 517 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void V() {
/* 522 */     super.V();
/* 523 */     if (this.e != null) {
/* 524 */       this.e.cb = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public aog i() {
/* 529 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bm() {
/* 534 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */