/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aok
/*     */   extends aer
/*     */   implements aot
/*     */ {
/*  47 */   private static final Predicate<aer> g = aeu.f.and(aeu.a.and(aer::aB));
/*     */   
/*     */   public enum a {
/*  50 */     a, b, c;
/*     */     
/*     */     public static a a(int ☃) {
/*  53 */       if (☃ < 0 || ☃ > (values()).length) {
/*  54 */         ☃ = 0;
/*     */       }
/*     */       
/*  57 */       return values()[☃];
/*     */     }
/*     */   }
/*     */   
/*  61 */   private static final or<Byte> h = ou.a((Class)aok.class, ot.a);
/*  62 */   protected static final or<Optional<UUID>> a = ou.a((Class)aok.class, ot.o);
/*     */ 
/*     */ 
/*     */   
/*  66 */   private int aw = -1;
/*  67 */   private int ax = -1;
/*  68 */   private int ay = -1;
/*     */   @Nullable
/*     */   private blc az;
/*     */   protected boolean b;
/*     */   protected int c;
/*  73 */   public a d = a.a;
/*     */   public int e;
/*     */   public UUID f;
/*     */   private int aA;
/*     */   private int aB;
/*  78 */   private double aC = 2.0D;
/*     */   
/*     */   private int aD;
/*     */   
/*     */   protected aok(aev<?> ☃, axy axy1) {
/*  83 */     super(☃, axy1);
/*     */     
/*  85 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   protected aok(aev<?> ☃, double d1, double d2, double d3, axy axy1) {
/*  89 */     this(☃, axy1);
/*     */     
/*  91 */     b(d1, d2, d3);
/*     */   }
/*     */   
/*     */   protected aok(aev<?> ☃, afa afa1, axy axy1) {
/*  95 */     this(☃, afa1.q, afa1.r + afa1.bF() - 0.10000000149011612D, afa1.s, axy1);
/*     */     
/*  97 */     a(afa1);
/*  98 */     if (afa1 instanceof aog) {
/*  99 */       this.d = a.b;
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
/*     */   protected void x_() {
/* 115 */     this.ab.a(h, Byte.valueOf((byte)0));
/* 116 */     this.ab.a(a, Optional.empty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aer ☃, float f1, float f2, float f3, float f4, float f5) {
/* 121 */     float f6 = -xq.a(f2 * 0.017453292F) * xq.b(f1 * 0.017453292F);
/* 122 */     float f7 = -xq.a(f1 * 0.017453292F);
/* 123 */     float f8 = xq.b(f2 * 0.017453292F) * xq.b(f1 * 0.017453292F);
/* 124 */     c(f6, f7, f8, f4, f5);
/*     */     
/* 126 */     this.t += ☃.t;
/* 127 */     this.v += ☃.v;
/* 128 */     if (!☃.A) {
/* 129 */       this.u += ☃.u;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(double ☃, double d1, double d2, float f1, float f2) {
/* 135 */     float f3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/*     */     
/* 137 */     ☃ /= f3;
/* 138 */     d1 /= f3;
/* 139 */     d2 /= f3;
/*     */     
/* 141 */     ☃ += this.T.nextGaussian() * 0.007499999832361937D * f2;
/* 142 */     d1 += this.T.nextGaussian() * 0.007499999832361937D * f2;
/* 143 */     d2 += this.T.nextGaussian() * 0.007499999832361937D * f2;
/*     */     
/* 145 */     ☃ *= f1;
/* 146 */     d1 *= f1;
/* 147 */     d2 *= f1;
/*     */     
/* 149 */     this.t = ☃;
/* 150 */     this.u = d1;
/* 151 */     this.v = d2;
/*     */     
/* 153 */     float f4 = xq.a(☃ * ☃ + d2 * d2);
/*     */     
/* 155 */     this.w = (float)(xq.c(☃, d2) * 57.2957763671875D);
/* 156 */     this.x = (float)(xq.c(d1, f4) * 57.2957763671875D);
/* 157 */     this.y = this.w;
/* 158 */     this.z = this.x;
/* 159 */     this.aA = 0;
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
/*     */   public void R_() {
/* 186 */     super.R_();
/*     */     
/* 188 */     boolean ☃ = q();
/*     */     
/* 190 */     if (this.z == 0.0F && this.y == 0.0F) {
/* 191 */       float f = xq.a(this.t * this.t + this.v * this.v);
/* 192 */       this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/* 193 */       this.x = (float)(xq.c(this.u, f) * 57.2957763671875D);
/* 194 */       this.y = this.w;
/* 195 */       this.z = this.x;
/*     */     } 
/*     */     
/* 198 */     el el = new el(this.aw, this.ax, this.ay);
/* 199 */     blc blc1 = this.m.a_(el);
/* 200 */     if (!blc1.f() && !☃) {
/* 201 */       cew cew = blc1.h(this.m, el);
/* 202 */       if (!cew.b()) {
/* 203 */         for (cea cea : cew.d()) {
/* 204 */           if (cea.a(el).b(new cee(this.q, this.r, this.s))) {
/* 205 */             this.b = true;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/* 212 */     if (this.e > 0) {
/* 213 */       this.e--;
/*     */     }
/*     */     
/* 216 */     if (ao()) {
/* 217 */       Z();
/*     */     }
/*     */     
/* 220 */     if (this.b && !☃) {
/* 221 */       if (this.az != blc1 && this.m.c((aer)null, bD().g(0.05D))) {
/* 222 */         this.b = false;
/*     */         
/* 224 */         this.t *= (this.T.nextFloat() * 0.2F);
/* 225 */         this.u *= (this.T.nextFloat() * 0.2F);
/* 226 */         this.v *= (this.T.nextFloat() * 0.2F);
/* 227 */         this.aA = 0;
/* 228 */         this.aB = 0;
/*     */       } else {
/* 230 */         f();
/*     */       } 
/*     */       
/* 233 */       this.c++;
/*     */       return;
/*     */     } 
/* 236 */     this.c = 0;
/* 237 */     this.aB++;
/*     */ 
/*     */     
/* 240 */     cee cee1 = new cee(this.q, this.r, this.s);
/* 241 */     cee cee2 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/* 242 */     ceb ceb = this.m.a(cee1, cee2, cec.a, true, false);
/*     */     
/* 244 */     cee1 = new cee(this.q, this.r, this.s);
/* 245 */     cee2 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/* 246 */     if (ceb != null) {
/* 247 */       cee2 = new cee(ceb.c.b, ceb.c.c, ceb.c.d);
/*     */     }
/* 249 */     aer aer1 = a(cee1, cee2);
/*     */     
/* 251 */     if (aer1 != null) {
/* 252 */       ceb = new ceb(aer1);
/*     */     }
/*     */     
/* 255 */     if (ceb != null && ceb.d instanceof aog) {
/* 256 */       aog aog = (aog)ceb.d;
/* 257 */       aer aer2 = k();
/* 258 */       if (aer2 instanceof aog && !((aog)aer2).a(aog)) {
/* 259 */         ceb = null;
/*     */       }
/*     */     } 
/*     */     
/* 263 */     if (ceb != null && !☃) {
/* 264 */       a(ceb);
/* 265 */       this.al = true;
/*     */     } 
/*     */     
/* 268 */     if (o()) {
/* 269 */       for (int i = 0; i < 4; i++) {
/* 270 */         this.m.a(fm.h, this.q + this.t * i / 4.0D, this.r + this.u * i / 4.0D, this.s + this.v * i / 4.0D, -this.t, -this.u + 0.2D, -this.v);
/*     */       }
/*     */     }
/*     */     
/* 274 */     this.q += this.t;
/* 275 */     this.r += this.u;
/* 276 */     this.s += this.v;
/*     */     
/* 278 */     float f1 = xq.a(this.t * this.t + this.v * this.v);
/* 279 */     if (☃) {
/* 280 */       this.w = (float)(xq.c(-this.t, -this.v) * 57.2957763671875D);
/*     */     } else {
/* 282 */       this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/*     */     } 
/* 284 */     this.x = (float)(xq.c(this.u, f1) * 57.2957763671875D);
/*     */     
/* 286 */     while (this.x - this.z < -180.0F) {
/* 287 */       this.z -= 360.0F;
/*     */     }
/* 289 */     while (this.x - this.z >= 180.0F) {
/* 290 */       this.z += 360.0F;
/*     */     }
/*     */     
/* 293 */     while (this.w - this.y < -180.0F) {
/* 294 */       this.y -= 360.0F;
/*     */     }
/* 296 */     while (this.w - this.y >= 180.0F) {
/* 297 */       this.y += 360.0F;
/*     */     }
/*     */     
/* 300 */     this.x = this.z + (this.x - this.z) * 0.2F;
/* 301 */     this.w = this.y + (this.w - this.y) * 0.2F;
/*     */     
/* 303 */     float f2 = 0.99F;
/* 304 */     float f3 = 0.05F;
/*     */     
/* 306 */     if (an()) {
/* 307 */       for (int i = 0; i < 4; i++) {
/* 308 */         float f = 0.25F;
/* 309 */         this.m.a(fm.e, this.q - this.t * 0.25D, this.r - this.u * 0.25D, this.s - this.v * 0.25D, this.t, this.u, this.v);
/*     */       } 
/* 311 */       f2 = p();
/*     */     } 
/*     */     
/* 314 */     this.t *= f2;
/* 315 */     this.u *= f2;
/* 316 */     this.v *= f2;
/* 317 */     if (!aj() && !☃) {
/* 318 */       this.u -= 0.05000000074505806D;
/*     */     }
/*     */     
/* 321 */     b(this.q, this.r, this.s);
/*     */     
/* 323 */     ag();
/*     */   }
/*     */   
/*     */   protected void f() {
/* 327 */     this.aA++;
/* 328 */     if (this.aA >= 1200) {
/* 329 */       V();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(ceb ☃) {
/* 334 */     if (☃.d != null) {
/* 335 */       b(☃);
/*     */     } else {
/* 337 */       el el = ☃.a();
/* 338 */       this.aw = el.o();
/* 339 */       this.ax = el.p();
/* 340 */       this.ay = el.q();
/* 341 */       blc blc1 = this.m.a_(el);
/* 342 */       this.az = blc1;
/* 343 */       this.t = (float)(☃.c.b - this.q);
/* 344 */       this.u = (float)(☃.c.c - this.r);
/* 345 */       this.v = (float)(☃.c.d - this.s);
/* 346 */       float f = xq.a(this.t * this.t + this.u * this.u + this.v * this.v) * 20.0F;
/* 347 */       this.q -= this.t / f;
/* 348 */       this.r -= this.u / f;
/* 349 */       this.s -= this.v / f;
/*     */       
/* 351 */       a(i(), 1.0F, 1.2F / (this.T.nextFloat() * 0.2F + 0.9F));
/* 352 */       this.b = true;
/* 353 */       this.e = 7;
/* 354 */       a(false);
/*     */       
/* 356 */       if (!blc1.f())
/* 357 */         this.az.a(this.m, el, this); 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(ceb ☃) {
/*     */     aea aea;
/* 363 */     aer aer1 = ☃.d;
/* 364 */     float f = xq.a(this.t * this.t + this.u * this.u + this.v * this.v);
/* 365 */     int i = xq.f(f * this.aC);
/*     */     
/* 367 */     if (o()) {
/* 368 */       i += this.T.nextInt(i / 2 + 2);
/*     */     }
/*     */ 
/*     */     
/* 372 */     aer aer2 = k();
/* 373 */     if (aer2 == null) {
/* 374 */       aea = aea.a(this, this);
/*     */     } else {
/* 376 */       aea = aea.a(this, aer2);
/*     */     } 
/*     */ 
/*     */     
/* 380 */     if (aV() && !(aer1 instanceof amw)) {
/* 381 */       aer1.f(5);
/*     */     }
/* 383 */     if (aer1.a(aea, i)) {
/* 384 */       if (aer1 instanceof afa) {
/* 385 */         afa afa = (afa)aer1;
/*     */         
/* 387 */         if (!this.m.B) {
/* 388 */           afa.n(afa.cx() + 1);
/*     */         }
/*     */         
/* 391 */         if (this.aD > 0) {
/* 392 */           float f1 = xq.a(this.t * this.t + this.v * this.v);
/* 393 */           if (f1 > 0.0F) {
/* 394 */             afa.f(this.t * this.aD * 0.6000000238418579D / f1, 0.1D, this.v * this.aD * 0.6000000238418579D / f1);
/*     */           }
/*     */         } 
/*     */         
/* 398 */         if (aer2 instanceof afa) {
/* 399 */           awg.a(afa, aer2);
/* 400 */           awg.b((afa)aer2, afa);
/*     */         } 
/*     */         
/* 403 */         a(afa);
/*     */         
/* 405 */         if (aer2 != null && afa != aer2 && afa instanceof aog && aer2 instanceof tf) {
/* 406 */           ((tf)aer2).a.a(new ke(6, 0.0F));
/*     */         }
/*     */       } 
/* 409 */       a(wj.B, 1.0F, 1.2F / (this.T.nextFloat() * 0.2F + 0.9F));
/* 410 */       if (!(aer1 instanceof amw)) {
/* 411 */         V();
/*     */       }
/*     */     } else {
/* 414 */       this.t *= -0.10000000149011612D;
/* 415 */       this.u *= -0.10000000149011612D;
/* 416 */       this.v *= -0.10000000149011612D;
/* 417 */       this.w += 180.0F;
/* 418 */       this.y += 180.0F;
/* 419 */       this.aB = 0;
/*     */       
/* 421 */       if (!this.m.B && this.t * this.t + this.u * this.u + this.v * this.v < 0.0010000000474974513D) {
/* 422 */         if (this.d == a.b) {
/* 423 */           a(l(), 0.1F);
/*     */         }
/* 425 */         V();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected wi i() {
/* 431 */     return wj.B;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afe ☃, double d1, double d2, double d3) {
/* 436 */     super.a(☃, d1, d2, d3);
/* 437 */     if (this.b) {
/* 438 */       this.aw = xq.c(this.q);
/* 439 */       this.ax = xq.c(this.r);
/* 440 */       this.ay = xq.c(this.s);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(afa ☃) {}
/*     */   
/*     */   @Nullable
/*     */   protected aer a(cee ☃, cee cee1) {
/* 449 */     aer aer1 = null;
/* 450 */     List<aer> list = this.m.a(this, bD().b(this.t, this.u, this.v).g(1.0D), g);
/* 451 */     double d = 0.0D;
/*     */     
/* 453 */     for (int i = 0; i < list.size(); i++) {
/* 454 */       aer aer2 = list.get(i);
/* 455 */       if (aer2 != k() || this.aB >= 5) {
/*     */ 
/*     */ 
/*     */         
/* 459 */         cea cea = aer2.bD().g(0.30000001192092896D);
/* 460 */         ceb ceb = cea.b(☃, cee1);
/* 461 */         if (ceb != null) {
/* 462 */           double d1 = ☃.g(ceb.c);
/* 463 */           if (d1 < d || d == 0.0D) {
/* 464 */             aer1 = aer2;
/* 465 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 470 */     return aer1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 475 */     ☃.b("xTile", this.aw);
/* 476 */     ☃.b("yTile", this.ax);
/* 477 */     ☃.b("zTile", this.ay);
/* 478 */     ☃.a("life", (short)this.aA);
/*     */     
/* 480 */     if (this.az != null) {
/* 481 */       ☃.a("inBlockState", hk.a(this.az));
/*     */     }
/*     */     
/* 484 */     ☃.a("shake", (byte)this.e);
/* 485 */     ☃.a("inGround", (byte)(this.b ? 1 : 0));
/* 486 */     ☃.a("pickup", (byte)this.d.ordinal());
/* 487 */     ☃.a("damage", this.aC);
/* 488 */     ☃.a("crit", o());
/* 489 */     if (this.f != null) {
/* 490 */       ☃.a("OwnerUUID", this.f);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 496 */     this.aw = ☃.h("xTile");
/* 497 */     this.ax = ☃.h("yTile");
/* 498 */     this.ay = ☃.h("zTile");
/* 499 */     this.aA = ☃.g("life");
/* 500 */     if (☃.c("inBlockState", 10)) {
/* 501 */       this.az = hk.d(☃.p("inBlockState"));
/*     */     }
/* 503 */     this.e = ☃.f("shake") & 0xFF;
/* 504 */     this.b = (☃.f("inGround") == 1);
/* 505 */     if (☃.c("damage", 99)) {
/* 506 */       this.aC = ☃.k("damage");
/*     */     }
/*     */     
/* 509 */     if (☃.c("pickup", 99)) {
/* 510 */       this.d = a.a(☃.f("pickup"));
/* 511 */     } else if (☃.c("player", 99)) {
/* 512 */       this.d = ☃.q("player") ? a.b : a.a;
/*     */     } 
/* 514 */     a(☃.q("crit"));
/*     */     
/* 516 */     if (☃.b("OwnerUUID")) {
/* 517 */       this.f = ☃.a("OwnerUUID");
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(@Nullable aer ☃) {
/* 522 */     this.f = (☃ == null) ? null : ☃.bt();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer k() {
/* 527 */     if (this.f != null && this.m instanceof td) {
/* 528 */       return ((td)this.m).a(this.f);
/*     */     }
/*     */     
/* 531 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 536 */     if (this.m.B || (!this.b && !q()) || this.e > 0) {
/*     */       return;
/*     */     }
/*     */     
/* 540 */     boolean bool = (this.d == a.b || (this.d == a.c && ☃.bV.d) || (q() && k().bt() == ☃.bt()));
/*     */     
/* 542 */     if (this.d == a.b && 
/* 543 */       !☃.bB.e(l())) {
/* 544 */       bool = false;
/*     */     }
/*     */ 
/*     */     
/* 548 */     if (bool) {
/* 549 */       ☃.a(this, 1);
/* 550 */       V();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract ate l();
/*     */   
/*     */   protected boolean ak() {
/* 558 */     return false;
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 562 */     this.aC = ☃;
/*     */   }
/*     */   
/*     */   public double m() {
/* 566 */     return this.aC;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 570 */     this.aD = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bk() {
/* 579 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 584 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 588 */     a(1, ☃);
/*     */   }
/*     */   
/*     */   private void a(int ☃, boolean bool) {
/* 592 */     byte b = ((Byte)this.ab.<Byte>a(h)).byteValue();
/* 593 */     if (bool) {
/* 594 */       this.ab.b(h, Byte.valueOf((byte)(b | ☃)));
/*     */     } else {
/* 596 */       this.ab.b(h, Byte.valueOf((byte)(b & (☃ ^ 0xFFFFFFFF))));
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 601 */     byte ☃ = ((Byte)this.ab.<Byte>a(h)).byteValue();
/* 602 */     return ((☃ & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 606 */     int i = awg.a(awi.w, ☃);
/* 607 */     int j = awg.a(awi.x, ☃);
/* 608 */     c((f * 2.0F) + this.T.nextGaussian() * 0.25D + (this.m.aj().a() * 0.11F));
/*     */     
/* 610 */     if (i > 0) {
/* 611 */       c(m() + i * 0.5D + 0.5D);
/*     */     }
/* 613 */     if (j > 0) {
/* 614 */       a(j);
/*     */     }
/* 616 */     if (awg.a(awi.y, ☃) > 0) {
/* 617 */       f(100);
/*     */     }
/*     */   }
/*     */   
/*     */   protected float p() {
/* 622 */     return 0.6F;
/*     */   }
/*     */   
/*     */   public void o(boolean ☃) {
/* 626 */     this.R = ☃;
/* 627 */     a(2, ☃);
/*     */   }
/*     */   
/*     */   public boolean q() {
/* 631 */     if (!this.m.B) {
/* 632 */       return this.R;
/*     */     }
/* 634 */     return ((((Byte)this.ab.<Byte>a(h)).byteValue() & 0x2) != 0);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */