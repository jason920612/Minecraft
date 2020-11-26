/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class akm
/*     */   extends afl
/*     */ {
/*  61 */   private static final or<Float> bG = ou.a((Class)akm.class, ot.c);
/*  62 */   private static final or<Boolean> bH = ou.a((Class)akm.class, ot.i);
/*  63 */   private static final or<Integer> bI = ou.a((Class)akm.class, ot.b);
/*     */   
/*     */   private float bJ;
/*     */   
/*     */   private float bK;
/*     */   
/*     */   private boolean bL;
/*     */   
/*     */   private boolean bM;
/*     */   
/*     */   private float bN;
/*     */   private float bO;
/*     */   
/*     */   public akm(axy ☃) {
/*  77 */     super(aev.aI, ☃);
/*  78 */     a(0.6F, 0.85F);
/*     */     
/*  80 */     t(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  85 */     this.bE = new ahz(this);
/*     */     
/*  87 */     this.by.a(1, new agm(this));
/*  88 */     this.by.a(2, this.bE);
/*  89 */     this.by.a(3, new a<>(this, this, aks.class, 24.0F, 1.5D, 1.5D));
/*  90 */     this.by.a(4, new agz(this, 0.4F));
/*  91 */     this.by.a(5, new ahe(this, 1.0D, true));
/*  92 */     this.by.a(6, new agr(this, 1.0D, 10.0F, 2.0F));
/*  93 */     this.by.a(7, new agi(this, 1.0D));
/*  94 */     this.by.a(8, new aih(this, 1.0D));
/*  95 */     this.by.a(9, new age(this, 8.0F));
/*  96 */     this.by.a(10, new ahb(this, (Class)aog.class, 8.0F));
/*  97 */     this.by.a(10, new ahq(this));
/*     */     
/*  99 */     this.bz.a(1, new aiq(this));
/* 100 */     this.bz.a(2, new air(this));
/* 101 */     this.bz.a(3, new ail(this, true, new Class[0]));
/* 102 */     this.bz.a(4, new aip<>(this, ajq.class, false, ☃ -> (☃ instanceof akf || ☃ instanceof akd)));
/* 103 */     this.bz.a(4, new aip<>(this, (Class)akk.class, false, akk.bC));
/* 104 */     this.bz.a(5, new aio<>(this, amq.class, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 109 */     super.bZ();
/*     */     
/* 111 */     a(ank.d).a(0.30000001192092896D);
/*     */     
/* 113 */     if (dy()) {
/* 114 */       a(ank.a).a(20.0D);
/*     */     } else {
/* 116 */       a(ank.a).a(8.0D);
/*     */     } 
/*     */     
/* 119 */     cz().b(ank.f).a(2.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(@Nullable afa ☃) {
/* 124 */     super.e(☃);
/* 125 */     if (☃ == null) {
/* 126 */       v(false);
/* 127 */     } else if (!dy()) {
/* 128 */       v(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 134 */     this.ab.b(bG, Float.valueOf(cq()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 139 */     super.x_();
/* 140 */     this.ab.a(bG, Float.valueOf(cq()));
/* 141 */     this.ab.a(bH, Boolean.valueOf(false));
/* 142 */     this.ab.a(bI, Integer.valueOf(asc.o.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 147 */     a(wj.la, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 152 */     super.b(☃);
/*     */     
/* 154 */     ☃.a("Angry", dJ());
/* 155 */     ☃.a("CollarColor", (byte)dK().a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 160 */     super.a(☃);
/*     */     
/* 162 */     v(☃.q("Angry"));
/* 163 */     if (☃.c("CollarColor", 99)) {
/* 164 */       a(asc.a(☃.h("CollarColor")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 170 */     if (dJ()) {
/* 171 */       return wj.kV;
/*     */     }
/* 173 */     if (this.T.nextInt(3) == 0) {
/* 174 */       if (dy() && ((Float)this.ab.<Float>a(bG)).floatValue() < 10.0F) {
/* 175 */         return wj.lb;
/*     */       }
/* 177 */       return wj.kY;
/*     */     } 
/* 179 */     return wj.kT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 184 */     return wj.kX;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 189 */     return wj.kU;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/* 194 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 200 */     return ccl.U;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 205 */     super.k();
/*     */     
/* 207 */     if (!this.m.B && this.bL && !this.bM && !dr() && this.A) {
/* 208 */       this.bM = true;
/* 209 */       this.bN = 0.0F;
/* 210 */       this.bO = 0.0F;
/* 211 */       this.m.a(this, (byte)8);
/*     */     } 
/* 213 */     if (!this.m.B && v() == null && dJ()) {
/* 214 */       v(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 220 */     super.R_();
/*     */     
/* 222 */     this.bK = this.bJ;
/* 223 */     if (dL()) {
/* 224 */       this.bJ += (1.0F - this.bJ) * 0.4F;
/*     */     } else {
/* 226 */       this.bJ += (0.0F - this.bJ) * 0.4F;
/*     */     } 
/*     */     
/* 229 */     if (ap()) {
/* 230 */       this.bL = true;
/* 231 */       this.bM = false;
/* 232 */       this.bN = 0.0F;
/* 233 */       this.bO = 0.0F;
/* 234 */     } else if ((this.bL || this.bM) && 
/* 235 */       this.bM) {
/* 236 */       if (this.bN == 0.0F) {
/* 237 */         a(wj.kZ, cD(), (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F);
/*     */       }
/*     */       
/* 240 */       this.bO = this.bN;
/* 241 */       this.bN += 0.05F;
/*     */       
/* 243 */       if (this.bO >= 2.0F) {
/* 244 */         this.bL = false;
/* 245 */         this.bM = false;
/* 246 */         this.bO = 0.0F;
/* 247 */         this.bN = 0.0F;
/*     */       } 
/*     */       
/* 250 */       if (this.bN > 0.4F) {
/* 251 */         float ☃ = (float)(bD()).b;
/* 252 */         int i = (int)(xq.a((this.bN - 0.4F) * 3.1415927F) * 7.0F);
/* 253 */         for (int j = 0; j < i; j++) {
/* 254 */           float f1 = (this.T.nextFloat() * 2.0F - 1.0F) * this.H * 0.5F;
/* 255 */           float f2 = (this.T.nextFloat() * 2.0F - 1.0F) * this.H * 0.5F;
/* 256 */           this.m.a(fm.R, this.q + f1, (☃ + 0.8F), this.s + f2, this.t, this.u, this.v);
/*     */         } 
/*     */       } 
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
/*     */   public float bF() {
/* 287 */     return this.I * 0.8F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int K() {
/* 292 */     if (dA()) {
/* 293 */       return 20;
/*     */     }
/* 295 */     return super.K();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 300 */     if (b(☃)) {
/* 301 */       return false;
/*     */     }
/* 303 */     aer aer = ☃.k();
/*     */     
/* 305 */     if (this.bE != null) {
/* 306 */       this.bE.a(false);
/*     */     }
/*     */     
/* 309 */     if (aer != null && !(aer instanceof aog) && !(aer instanceof aok))
/*     */     {
/* 311 */       f = (f + 1.0F) / 2.0F;
/*     */     }
/* 313 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 318 */     boolean bool = ☃.a(aea.a(this), (int)a(ank.f).e());
/* 319 */     if (bool) {
/* 320 */       a(this, ☃);
/*     */     }
/* 322 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void t(boolean ☃) {
/* 327 */     super.t(☃);
/*     */     
/* 329 */     if (☃) {
/* 330 */       a(ank.a).a(20.0D);
/*     */     } else {
/* 332 */       a(ank.a).a(8.0D);
/*     */     } 
/*     */     
/* 335 */     a(ank.f).a(4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 340 */     ate ate = ☃.b(adk1);
/* 341 */     ata ata = ate.b();
/* 342 */     if (dy()) {
/* 343 */       if (!ate.a()) {
/* 344 */         if (ata instanceof asv) {
/* 345 */           asv asv = (asv)ata;
/*     */           
/* 347 */           if (asv.d() && ((Float)this.ab.<Float>a(bG)).floatValue() < 20.0F) {
/* 348 */             if (!☃.bV.d) {
/* 349 */               ate.g(1);
/*     */             }
/* 351 */             c(asv.e(ate));
/* 352 */             return true;
/*     */           } 
/* 354 */         } else if (ata instanceof asd) {
/* 355 */           asc asc = ((asd)ata).d();
/* 356 */           if (asc != dK()) {
/* 357 */             a(asc);
/*     */             
/* 359 */             if (!☃.bV.d) {
/* 360 */               ate.g(1);
/*     */             }
/*     */             
/* 363 */             return true;
/*     */           } 
/*     */         } 
/*     */       }
/* 367 */       if (f(☃) && 
/* 368 */         !this.m.B && !f(ate)) {
/* 369 */         this.bE.a(!dA());
/* 370 */         this.bg = false;
/* 371 */         this.bx.q();
/* 372 */         e((afa)null);
/*     */       }
/*     */     
/*     */     }
/* 376 */     else if (ata == atf.bx && !dJ()) {
/* 377 */       if (!☃.bV.d) {
/* 378 */         ate.g(1);
/*     */       }
/* 380 */       if (!this.m.B) {
/* 381 */         if (this.T.nextInt(3) == 0) {
/* 382 */           c(☃);
/* 383 */           this.bx.q();
/* 384 */           e((afa)null);
/* 385 */           this.bE.a(true);
/* 386 */           l(20.0F);
/* 387 */           s(true);
/* 388 */           this.m.a(this, (byte)7);
/*     */         } else {
/* 390 */           s(false);
/* 391 */           this.m.a(this, (byte)6);
/*     */         } 
/*     */       }
/*     */       
/* 395 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 399 */     return super.a(☃, adk1);
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
/*     */   public boolean f(ate ☃) {
/* 424 */     ata ata = ☃.b();
/* 425 */     return (ata instanceof asv && ((asv)ata).d());
/*     */   }
/*     */ 
/*     */   
/*     */   public int dg() {
/* 430 */     return 8;
/*     */   }
/*     */   
/*     */   public boolean dJ() {
/* 434 */     return ((((Byte)this.ab.<Byte>a(bC)).byteValue() & 0x2) != 0);
/*     */   }
/*     */   
/*     */   public void v(boolean ☃) {
/* 438 */     byte b = ((Byte)this.ab.<Byte>a(bC)).byteValue();
/* 439 */     if (☃) {
/* 440 */       this.ab.b(bC, Byte.valueOf((byte)(b | 0x2)));
/*     */     } else {
/* 442 */       this.ab.b(bC, Byte.valueOf((byte)(b & 0xFFFFFFFD)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public asc dK() {
/* 447 */     return asc.a(((Integer)this.ab.<Integer>a(bI)).intValue());
/*     */   }
/*     */   
/*     */   public void a(asc ☃) {
/* 451 */     this.ab.b(bI, Integer.valueOf(☃.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public akm b(aeo ☃) {
/* 456 */     akm akm1 = new akm(this.m);
/* 457 */     UUID uUID = C_();
/* 458 */     if (uUID != null) {
/* 459 */       akm1.b(uUID);
/* 460 */       akm1.t(true);
/*     */     } 
/* 462 */     return akm1;
/*     */   }
/*     */   
/*     */   public void w(boolean ☃) {
/* 466 */     this.ab.b(bH, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ajq ☃) {
/* 471 */     if (☃ == this) {
/* 472 */       return false;
/*     */     }
/* 474 */     if (!dy()) {
/* 475 */       return false;
/*     */     }
/* 477 */     if (!(☃ instanceof akm)) {
/* 478 */       return false;
/*     */     }
/*     */     
/* 481 */     akm akm1 = (akm)☃;
/* 482 */     if (!akm1.dy()) {
/* 483 */       return false;
/*     */     }
/* 485 */     if (akm1.dA()) {
/* 486 */       return false;
/*     */     }
/*     */     
/* 489 */     return (dF() && akm1.dF());
/*     */   }
/*     */   
/*     */   public boolean dL() {
/* 493 */     return ((Boolean)this.ab.<Boolean>a(bH)).booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(afa ☃, afa afa1) {
/* 499 */     if (☃ instanceof amt || ☃ instanceof ana) {
/* 500 */       return false;
/*     */     }
/*     */     
/* 503 */     if (☃ instanceof akm) {
/* 504 */       akm akm1 = (akm)☃;
/* 505 */       if (akm1.dy() && akm1.dB() == afa1) {
/* 506 */         return false;
/*     */       }
/*     */     } 
/* 509 */     if (☃ instanceof aog && afa1 instanceof aog && !((aog)afa1).a((aog)☃))
/*     */     {
/* 511 */       return false;
/*     */     }
/*     */     
/* 514 */     if (☃ instanceof ako && ((ako)☃).dJ()) {
/* 515 */       return false;
/*     */     }
/* 517 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 522 */     return (!dJ() && super.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   class a<T extends aer>
/*     */     extends agd<T>
/*     */   {
/*     */     private final akm d;
/*     */     
/*     */     public a(akm this$0, akm ☃, Class<T> clazz, float f, double d1, double d2) {
/* 532 */       super(☃, clazz, f, d1, d2);
/* 533 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 538 */       if (super.a() && 
/* 539 */         this.b instanceof aks) {
/* 540 */         return (!this.d.dy() && a((aks)this.b));
/*     */       }
/*     */ 
/*     */       
/* 544 */       return false;
/*     */     }
/*     */     
/*     */     private boolean a(aks ☃) {
/* 548 */       return (☃.eg() >= akm.a(this.c).nextInt(5));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 553 */       this.c.e((afa)null);
/* 554 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 559 */       this.c.e((afa)null);
/* 560 */       super.e();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */