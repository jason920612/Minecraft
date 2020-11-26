/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class th
/*     */ {
/*  76 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*     */   private final aer d;
/*     */   
/*     */   private final int e;
/*     */   
/*     */   private int f;
/*     */   
/*     */   private final int g;
/*     */   
/*     */   private long h;
/*     */   
/*     */   private long i;
/*     */   
/*     */   private long j;
/*     */   
/*     */   private int k;
/*     */   private int l;
/*     */   private int m;
/*     */   private double n;
/*     */   private double o;
/*     */   private double p;
/*     */   public int a;
/*     */   private double q;
/*     */   private double r;
/*     */   private double s;
/*     */   private boolean t;
/*     */   private final boolean u;
/*     */   private int v;
/* 105 */   private List<aer> w = Collections.emptyList();
/*     */   
/*     */   private boolean x;
/*     */   
/*     */   private boolean y;
/*     */   public boolean b;
/* 111 */   private final Set<tf> z = Sets.newHashSet();
/*     */   
/*     */   public th(aer ☃, int i, int j, int k, boolean bool) {
/* 114 */     this.d = ☃;
/* 115 */     this.e = i;
/* 116 */     this.f = j;
/* 117 */     this.g = k;
/* 118 */     this.u = bool;
/*     */ 
/*     */     
/* 121 */     this.h = sz.a(☃.q);
/* 122 */     this.i = sz.a(☃.r);
/* 123 */     this.j = sz.a(☃.s);
/*     */     
/* 125 */     this.k = xq.d(☃.w * 256.0F / 360.0F);
/* 126 */     this.l = xq.d(☃.x * 256.0F / 360.0F);
/*     */     
/* 128 */     this.m = xq.d(☃.bj() * 256.0F / 360.0F);
/* 129 */     this.y = ☃.A;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 134 */     if (☃ instanceof th) {
/* 135 */       return (((th)☃).d.Q() == this.d.Q());
/*     */     }
/*     */     
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 143 */     return this.d.Q();
/*     */   }
/*     */   
/*     */   public void a(List<aog> ☃) {
/* 147 */     this.b = false;
/* 148 */     if (!this.t || this.d.d(this.q, this.r, this.s) > 16.0D) {
/* 149 */       this.q = this.d.q;
/* 150 */       this.r = this.d.r;
/* 151 */       this.s = this.d.s;
/* 152 */       this.t = true;
/* 153 */       this.b = true;
/* 154 */       b(☃);
/*     */     } 
/*     */     
/* 157 */     List<aer> list = this.d.bP();
/* 158 */     if (!list.equals(this.w)) {
/* 159 */       this.w = list;
/* 160 */       a(new ln(this.d));
/*     */     } 
/*     */     
/* 163 */     if (this.d instanceof amb && this.a % 10 == 0) {
/* 164 */       amb amb = (amb)this.d;
/* 165 */       ate ate = amb.o();
/*     */       
/* 167 */       if (ate.b() instanceof atj) {
/* 168 */         cbs cbs = atj.a(ate, this.d.m);
/* 169 */         for (aog aog : ☃) {
/* 170 */           tf tf = (tf)aog;
/* 171 */           cbs.a(tf, ate);
/*     */           
/* 173 */           iv<?> iv = ((atj)ate.b()).a(ate, this.d.m, tf);
/* 174 */           if (iv != null) {
/* 175 */             tf.a.a(iv);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 180 */       d();
/*     */     } 
/*     */     
/* 183 */     if (this.a % this.g == 0 || this.d.al || this.d.T().a()) {
/* 184 */       if (this.d.aW()) {
/*     */         
/* 186 */         int j = xq.d(this.d.w * 256.0F / 360.0F);
/* 187 */         int k = xq.d(this.d.x * 256.0F / 360.0F);
/* 188 */         boolean bool = (Math.abs(j - this.k) >= 1 || Math.abs(k - this.l) >= 1);
/* 189 */         if (bool) {
/* 190 */           a(new kl.c(this.d.Q(), (byte)j, (byte)k, this.d.A));
/* 191 */           this.k = j;
/* 192 */           this.l = k;
/*     */         } 
/*     */ 
/*     */         
/* 196 */         this.h = sz.a(this.d.q);
/* 197 */         this.i = sz.a(this.d.r);
/* 198 */         this.j = sz.a(this.d.s);
/*     */         
/* 200 */         d();
/*     */         
/* 202 */         this.x = true;
/*     */       } else {
/* 204 */         this.v++;
/* 205 */         long l1 = sz.a(this.d.q);
/* 206 */         long l2 = sz.a(this.d.r);
/* 207 */         long l3 = sz.a(this.d.s);
/* 208 */         int j = xq.d(this.d.w * 256.0F / 360.0F);
/* 209 */         int k = xq.d(this.d.x * 256.0F / 360.0F);
/*     */         
/* 211 */         long l4 = l1 - this.h;
/* 212 */         long l5 = l2 - this.i;
/* 213 */         long l6 = l3 - this.j;
/*     */         
/* 215 */         iv<?> iv = null;
/*     */         
/* 217 */         boolean bool1 = (l4 * l4 + l5 * l5 + l6 * l6 >= 128L || this.a % 60 == 0);
/* 218 */         boolean bool2 = (Math.abs(j - this.k) >= 1 || Math.abs(k - this.l) >= 1);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 223 */         if (this.a > 0 || this.d instanceof aok) {
/* 224 */           if (l4 < -32768L || l4 >= 32768L || l5 < -32768L || l5 >= 32768L || l6 < -32768L || l6 >= 32768L || this.v > 400 || this.x || this.y != this.d.A) {
/* 225 */             this.y = this.d.A;
/* 226 */             this.v = 0;
/* 227 */             c();
/* 228 */             iv = new ly(this.d);
/*     */           }
/* 230 */           else if ((bool1 && bool2) || this.d instanceof aok) {
/* 231 */             iv = new kl.b(this.d.Q(), l4, l5, l6, (byte)j, (byte)k, this.d.A);
/* 232 */           } else if (bool1) {
/* 233 */             iv = new kl.a(this.d.Q(), l4, l5, l6, this.d.A);
/* 234 */           } else if (bool2) {
/* 235 */             iv = new kl.c(this.d.Q(), (byte)j, (byte)k, this.d.A);
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/* 240 */         boolean bool3 = (this.u || this.d.al);
/* 241 */         if (this.d instanceof afa && ((afa)this.d).dc()) {
/* 242 */           bool3 = true;
/*     */         }
/*     */         
/* 245 */         if (bool3 && this.a > 0) {
/* 246 */           double d1 = this.d.t - this.n;
/* 247 */           double d2 = this.d.u - this.o;
/* 248 */           double d3 = this.d.v - this.p;
/*     */           
/* 250 */           double d4 = 0.02D;
/*     */           
/* 252 */           double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */           
/* 254 */           if (d5 > 4.0E-4D || (d5 > 0.0D && this.d.t == 0.0D && this.d.u == 0.0D && this.d.v == 0.0D)) {
/* 255 */             this.n = this.d.t;
/* 256 */             this.o = this.d.u;
/* 257 */             this.p = this.d.v;
/* 258 */             a(new li(this.d.Q(), this.n, this.o, this.p));
/*     */           } 
/*     */         } 
/*     */         
/* 262 */         if (iv != null) {
/* 263 */           a(iv);
/*     */         }
/*     */         
/* 266 */         d();
/*     */         
/* 268 */         if (bool1) {
/* 269 */           this.h = l1;
/* 270 */           this.i = l2;
/* 271 */           this.j = l3;
/*     */         } 
/* 273 */         if (bool2) {
/* 274 */           this.k = j;
/* 275 */           this.l = k;
/*     */         } 
/*     */         
/* 278 */         this.x = false;
/*     */       } 
/*     */       
/* 281 */       int i = xq.d(this.d.bj() * 256.0F / 360.0F);
/* 282 */       if (Math.abs(i - this.m) >= 1) {
/* 283 */         a(new la(this.d, (byte)i));
/* 284 */         this.m = i;
/*     */       } 
/* 286 */       this.d.al = false;
/*     */     } 
/*     */     
/* 289 */     this.a++;
/*     */     
/* 291 */     if (this.d.E) {
/* 292 */       b(new li(this.d));
/* 293 */       this.d.E = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d() {
/* 298 */     ou ☃ = this.d.T();
/* 299 */     if (☃.a()) {
/* 300 */       b(new lg(this.d.Q(), ☃, false));
/*     */     }
/*     */     
/* 303 */     if (this.d instanceof afa) {
/* 304 */       afs afs = (afs)((afa)this.d).cz();
/* 305 */       Set<afn> set = afs.b();
/*     */       
/* 307 */       if (!set.isEmpty()) {
/* 308 */         b(new ma(this.d.Q(), set));
/*     */       }
/*     */       
/* 311 */       set.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(iv<?> ☃) {
/* 316 */     for (tf tf : this.z) {
/* 317 */       tf.a.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(iv<?> ☃) {
/* 322 */     a(☃);
/* 323 */     if (this.d instanceof tf) {
/* 324 */       ((tf)this.d).a.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 329 */     for (tf ☃ : this.z) {
/* 330 */       this.d.c(☃);
/* 331 */       ☃.c(this.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/* 336 */     if (this.z.contains(☃)) {
/* 337 */       this.d.c(☃);
/* 338 */       ☃.c(this.d);
/* 339 */       this.z.remove(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(tf ☃) {
/* 344 */     if (☃ == this.d) {
/*     */       return;
/*     */     }
/*     */     
/* 348 */     if (c(☃)) {
/* 349 */       if (!this.z.contains(☃) && (e(☃) || this.d.l)) {
/* 350 */         this.z.add(☃);
/* 351 */         iv<?> iv = e();
/* 352 */         ☃.a.a(iv);
/*     */         
/* 354 */         if (!this.d.T().d()) {
/* 355 */           ☃.a.a(new lg(this.d.Q(), this.d.T(), true));
/*     */         }
/*     */         
/* 358 */         boolean bool = this.u;
/* 359 */         if (this.d instanceof afa) {
/* 360 */           afs afs = (afs)((afa)this.d).cz();
/* 361 */           Collection<afn> collection = afs.c();
/*     */           
/* 363 */           if (!collection.isEmpty()) {
/* 364 */             ☃.a.a(new ma(this.d.Q(), collection));
/*     */           }
/* 366 */           if (((afa)this.d).dc()) {
/* 367 */             bool = true;
/*     */           }
/*     */         } 
/*     */         
/* 371 */         this.n = this.d.t;
/* 372 */         this.o = this.d.u;
/* 373 */         this.p = this.d.v;
/*     */         
/* 375 */         if (bool && !(iv instanceof jc)) {
/* 376 */           ☃.a.a(new li(this.d.Q(), this.d.t, this.d.u, this.d.v));
/*     */         }
/*     */         
/* 379 */         if (this.d instanceof afa) {
/* 380 */           for (aew aew : aew.values()) {
/* 381 */             ate ate = ((afa)this.d).b(aew);
/* 382 */             if (!ate.a()) {
/* 383 */               ☃.a.a(new lj(this.d.Q(), aew, ate));
/*     */             }
/*     */           } 
/*     */         }
/*     */         
/* 388 */         if (this.d instanceof aog) {
/* 389 */           aog aog = (aog)this.d;
/* 390 */           if (aog.cL()) {
/* 391 */             ☃.a.a(new ku(aog, new el(this.d)));
/*     */           }
/*     */         } 
/*     */         
/* 395 */         if (this.d instanceof afa) {
/* 396 */           afa afa = (afa)this.d;
/* 397 */           for (aek aek : afa.cn()) {
/* 398 */             ☃.a.a(new mb(this.d.Q(), aek));
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 404 */         if (!this.d.bP().isEmpty()) {
/* 405 */           ☃.a.a(new ln(this.d));
/*     */         }
/* 407 */         if (this.d.aW()) {
/* 408 */           ☃.a.a(new ln(this.d.bU()));
/*     */         }
/*     */         
/* 411 */         this.d.b(☃);
/* 412 */         ☃.d(this.d);
/*     */       }
/*     */     
/* 415 */     } else if (this.z.contains(☃)) {
/* 416 */       this.z.remove(☃);
/* 417 */       this.d.c(☃);
/* 418 */       ☃.c(this.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(tf ☃) {
/* 424 */     double d1 = ☃.q - this.h / 4096.0D;
/* 425 */     double d2 = ☃.s - this.j / 4096.0D;
/* 426 */     int i = Math.min(this.e, this.f);
/* 427 */     return (d1 >= -i && d1 <= i && d2 >= -i && d2 <= i && this.d.a(☃));
/*     */   }
/*     */   
/*     */   private boolean e(tf ☃) {
/* 431 */     return ☃.s().B().a(☃, this.d.ae, this.d.ag);
/*     */   }
/*     */   
/*     */   public void b(List<aog> ☃) {
/* 435 */     for (int i = 0; i < ☃.size(); i++) {
/* 436 */       b((tf)☃.get(i));
/*     */     }
/*     */   }
/*     */   
/*     */   private iv<?> e() {
/* 441 */     if (this.d.G) {
/* 442 */       c.warn("Fetching addPacket for removed entity");
/*     */     }
/*     */     
/* 445 */     if (this.d instanceof tf) {
/* 446 */       return new je((aog)this.d);
/*     */     }
/* 448 */     if (this.d instanceof aeq) {
/* 449 */       this.m = xq.d(this.d.bj() * 256.0F / 360.0F);
/* 450 */       return new jc((afa)this.d);
/*     */     } 
/* 452 */     if (this.d instanceof ame) {
/* 453 */       return new jd((ame)this.d);
/*     */     }
/* 455 */     if (this.d instanceof amm) {
/* 456 */       return new iz(this.d, 2, 1);
/*     */     }
/* 458 */     if (this.d instanceof aph) {
/* 459 */       aph ☃ = (aph)this.d;
/* 460 */       return new iz(this.d, 10, ☃.v().a());
/*     */     } 
/* 462 */     if (this.d instanceof apj) {
/* 463 */       return new iz(this.d, 1);
/*     */     }
/* 465 */     if (this.d instanceof aex) {
/* 466 */       return new ja((aex)this.d);
/*     */     }
/* 468 */     if (this.d instanceof amg) {
/* 469 */       aer ☃ = ((amg)this.d).i();
/* 470 */       return new iz(this.d, 90, (☃ == null) ? this.d.Q() : ☃.Q());
/*     */     } 
/* 472 */     if (this.d instanceof aoy) {
/* 473 */       aer ☃ = ((aoy)this.d).k();
/* 474 */       return new iz(this.d, 91, 1 + ((☃ == null) ? this.d.Q() : ☃.Q()));
/*     */     } 
/* 476 */     if (this.d instanceof aom) {
/* 477 */       aer ☃ = ((aok)this.d).k();
/* 478 */       return new iz(this.d, 60, 1 + ((☃ == null) ? this.d.Q() : ☃.Q()));
/*     */     } 
/* 480 */     if (this.d instanceof aox) {
/* 481 */       return new iz(this.d, 61);
/*     */     }
/* 483 */     if (this.d instanceof ape) {
/* 484 */       aer ☃ = ((aok)this.d).k();
/* 485 */       return new iz(this.d, 94, 1 + ((☃ == null) ? this.d.Q() : ☃.Q()));
/*     */     } 
/* 487 */     if (this.d instanceof aos) {
/* 488 */       return new iz(this.d, 68);
/*     */     }
/* 490 */     if (this.d instanceof apd) {
/* 491 */       return new iz(this.d, 73);
/*     */     }
/* 493 */     if (this.d instanceof apc) {
/* 494 */       return new iz(this.d, 75);
/*     */     }
/* 496 */     if (this.d instanceof apb) {
/* 497 */       return new iz(this.d, 65);
/*     */     }
/* 499 */     if (this.d instanceof aop) {
/* 500 */       return new iz(this.d, 72);
/*     */     }
/* 502 */     if (this.d instanceof aoq) {
/* 503 */       return new iz(this.d, 76);
/*     */     }
/* 505 */     if (this.d instanceof aol) {
/* 506 */       iz iz; aol ☃ = (aol)this.d;
/* 507 */       int i = 63;
/* 508 */       if (this.d instanceof aow) {
/* 509 */         i = 64;
/* 510 */       } else if (this.d instanceof aon) {
/* 511 */         i = 93;
/* 512 */       } else if (this.d instanceof apf) {
/* 513 */         i = 66;
/*     */       } 
/*     */       
/* 516 */       if (☃.a == null) {
/* 517 */         iz = new iz(this.d, i, 0);
/*     */       } else {
/* 519 */         iz = new iz(this.d, i, ((aol)this.d).a.Q());
/*     */       } 
/*     */       
/* 522 */       iz.a((int)(☃.b * 8000.0D));
/* 523 */       iz.b((int)(☃.c * 8000.0D));
/* 524 */       iz.c((int)(☃.d * 8000.0D));
/* 525 */       return iz;
/*     */     } 
/* 527 */     if (this.d instanceof aov) {
/* 528 */       iz ☃ = new iz(this.d, 67, 0);
/* 529 */       ☃.a((int)(this.d.t * 8000.0D));
/* 530 */       ☃.b((int)(this.d.u * 8000.0D));
/* 531 */       ☃.c((int)(this.d.v * 8000.0D));
/* 532 */       return ☃;
/*     */     } 
/* 534 */     if (this.d instanceof apa) {
/* 535 */       return new iz(this.d, 62);
/*     */     }
/* 537 */     if (this.d instanceof aoo) {
/* 538 */       return new iz(this.d, 79);
/*     */     }
/* 540 */     if (this.d instanceof amn) {
/* 541 */       return new iz(this.d, 50);
/*     */     }
/* 543 */     if (this.d instanceof alc) {
/* 544 */       return new iz(this.d, 51);
/*     */     }
/* 546 */     if (this.d instanceof aml) {
/* 547 */       aml ☃ = (aml)this.d;
/* 548 */       return new iz(this.d, 70, bcs.l(☃.k()));
/*     */     } 
/* 550 */     if (this.d instanceof alz) {
/* 551 */       return new iz(this.d, 78);
/*     */     }
/* 553 */     if (this.d instanceof amb) {
/* 554 */       amb ☃ = (amb)this.d;
/* 555 */       return new iz(this.d, 71, ☃.c.a(), ☃.n());
/*     */     } 
/* 557 */     if (this.d instanceof amc) {
/* 558 */       amc ☃ = (amc)this.d;
/* 559 */       return new iz(this.d, 77, 0, ☃.n());
/*     */     } 
/* 561 */     if (this.d instanceof aep) {
/* 562 */       return new iz(this.d, 3);
/*     */     }
/* 564 */     throw new IllegalArgumentException("Don't know how to add " + this.d.getClass() + "!");
/*     */   }
/*     */   
/*     */   public void d(tf ☃) {
/* 568 */     if (this.z.contains(☃)) {
/* 569 */       this.z.remove(☃);
/* 570 */       this.d.c(☃);
/* 571 */       ☃.c(this.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   public aer b() {
/* 576 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 580 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void c() {
/* 584 */     this.t = false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\th.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */