/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alx
/*     */   extends ang
/*     */   implements anj
/*     */ {
/*  58 */   private static final or<Integer> a = ou.a((Class)alx.class, ot.b);
/*  59 */   private static final or<Integer> b = ou.a((Class)alx.class, ot.b);
/*  60 */   private static final or<Integer> c = ou.a((Class)alx.class, ot.b);
/*  61 */   private static final List<or<Integer>> bC = (List<or<Integer>>)ImmutableList.of(a, b, c);
/*  62 */   private static final or<Integer> bD = ou.a((Class)alx.class, ot.b);
/*     */   
/*  64 */   private final float[] bE = new float[2];
/*  65 */   private final float[] bF = new float[2];
/*  66 */   private final float[] bG = new float[2];
/*  67 */   private final float[] bH = new float[2];
/*  68 */   private final int[] bI = new int[2];
/*  69 */   private final int[] bJ = new int[2]; private int bK;
/*     */   private static final Predicate<aer> bM;
/*  71 */   private final tb bL = (tb)(new tb(O(), adc.a.f, adc.b.a)).a(true);
/*     */   static {
/*  73 */     bM = (☃ -> (☃ instanceof afa && ((afa)☃).cA() != afd.b && ((afa)☃).df()));
/*     */   }
/*     */   public alx(axy ☃) {
/*  76 */     super(aev.aF, ☃);
/*     */     
/*  78 */     l(cw());
/*     */     
/*  80 */     a(0.9F, 3.5F);
/*     */     
/*  82 */     this.aa = true;
/*     */     
/*  84 */     ((aiv)t()).d(true);
/*     */     
/*  86 */     this.b_ = 50;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  91 */     this.by.a(0, new a(this));
/*  92 */     this.by.a(2, new aht(this, 1.0D, 40, 20.0F));
/*     */     
/*  94 */     this.by.a(5, new aih(this, 1.0D));
/*  95 */     this.by.a(6, new ahb(this, (Class)aog.class, 8.0F));
/*  96 */     this.by.a(7, new ahq(this));
/*     */     
/*  98 */     this.bz.a(1, new ail(this, false, new Class[0]));
/*  99 */     this.bz.a(2, new aio<>(this, (Class)afb.class, 0, false, false, bM));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 104 */     super.x_();
/*     */     
/* 106 */     this.ab.a(a, Integer.valueOf(0));
/* 107 */     this.ab.a(b, Integer.valueOf(0));
/* 108 */     this.ab.a(c, Integer.valueOf(0));
/* 109 */     this.ab.a(bD, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 114 */     super.b(☃);
/*     */     
/* 116 */     ☃.b("Invul", dz());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 121 */     super.a(☃);
/*     */     
/* 123 */     d(☃.h("Invul"));
/* 124 */     if (O_()) {
/* 125 */       this.bL.a(O());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(@Nullable ij ☃) {
/* 131 */     super.b(☃);
/* 132 */     this.bL.a(O());
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 137 */     return wj.kJ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 142 */     return wj.kM;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 147 */     return wj.kL;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 152 */     this.u *= 0.6000000238418579D;
/*     */     
/* 154 */     if (!this.m.B && p(0) > 0) {
/* 155 */       aer aer = this.m.a(p(0));
/* 156 */       if (aer != null) {
/* 157 */         if (this.r < aer.r || (!dA() && this.r < aer.r + 5.0D)) {
/* 158 */           if (this.u < 0.0D) {
/* 159 */             this.u = 0.0D;
/*     */           }
/* 161 */           this.u += (0.5D - this.u) * 0.6000000238418579D;
/*     */         } 
/*     */         
/* 164 */         double d1 = aer.q - this.q;
/* 165 */         double d2 = aer.s - this.s;
/* 166 */         double d3 = d1 * d1 + d2 * d2;
/* 167 */         if (d3 > 9.0D) {
/* 168 */           double d = xq.a(d3);
/* 169 */           this.t += (d1 / d * 0.5D - this.t) * 0.6000000238418579D;
/* 170 */           this.v += (d2 / d * 0.5D - this.v) * 0.6000000238418579D;
/*     */         } 
/*     */       } 
/*     */     } 
/* 174 */     if (this.t * this.t + this.v * this.v > 0.05000000074505806D) {
/* 175 */       this.w = (float)xq.c(this.v, this.t) * 57.295776F - 90.0F;
/*     */     }
/* 177 */     super.k();
/*     */     int i;
/* 179 */     for (i = 0; i < 2; i++) {
/* 180 */       this.bH[i] = this.bF[i];
/* 181 */       this.bG[i] = this.bE[i];
/*     */     } 
/*     */     
/* 184 */     for (i = 0; i < 2; i++) {
/* 185 */       int k = p(i + 1);
/* 186 */       aer aer = null;
/* 187 */       if (k > 0) {
/* 188 */         aer = this.m.a(k);
/*     */       }
/* 190 */       if (aer != null) {
/* 191 */         double d1 = q(i + 1);
/* 192 */         double d2 = r(i + 1);
/* 193 */         double d3 = s(i + 1);
/*     */         
/* 195 */         double d4 = aer.q - d1;
/* 196 */         double d5 = aer.r + aer.bF() - d2;
/* 197 */         double d6 = aer.s - d3;
/* 198 */         double d7 = xq.a(d4 * d4 + d6 * d6);
/*     */         
/* 200 */         float f1 = (float)(xq.c(d6, d4) * 57.2957763671875D) - 90.0F;
/* 201 */         float f2 = (float)-(xq.c(d5, d7) * 57.2957763671875D);
/* 202 */         this.bE[i] = c(this.bE[i], f2, 40.0F);
/* 203 */         this.bF[i] = c(this.bF[i], f1, 10.0F);
/*     */       } else {
/* 205 */         this.bF[i] = c(this.bF[i], this.aQ, 10.0F);
/*     */       } 
/*     */     } 
/* 208 */     boolean ☃ = dA(); int j;
/* 209 */     for (j = 0; j < 3; j++) {
/* 210 */       double d1 = q(j);
/* 211 */       double d2 = r(j);
/* 212 */       double d3 = s(j);
/*     */       
/* 214 */       this.m.a(fm.M, d1 + this.T.nextGaussian() * 0.30000001192092896D, d2 + this.T.nextGaussian() * 0.30000001192092896D, d3 + this.T.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
/* 215 */       if (☃ && this.m.s.nextInt(4) == 0) {
/* 216 */         this.m.a(fm.s, d1 + this.T.nextGaussian() * 0.30000001192092896D, d2 + this.T.nextGaussian() * 0.30000001192092896D, d3 + this.T.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
/*     */       }
/*     */     } 
/* 219 */     if (dz() > 0) {
/* 220 */       for (j = 0; j < 3; j++) {
/* 221 */         this.m.a(fm.s, this.q + this.T.nextGaussian(), this.r + (this.T.nextFloat() * 3.3F), this.s + this.T.nextGaussian(), 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 228 */     if (dz() > 0) {
/* 229 */       int i = dz() - 1;
/*     */       
/* 231 */       if (i <= 0) {
/* 232 */         this.m.a(this, this.q, this.r + bF(), this.s, 7.0F, false, this.m.X().b("mobGriefing"));
/* 233 */         this.m.a(1023, new el(this), 0);
/*     */       } 
/*     */       
/* 236 */       d(i);
/* 237 */       if (this.U % 10 == 0) {
/* 238 */         c(10.0F);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 244 */     super.J();
/*     */     int ☃;
/* 246 */     for (☃ = 1; ☃ < 3; ☃++) {
/* 247 */       if (this.U >= this.bI[☃ - 1]) {
/* 248 */         this.bI[☃ - 1] = this.U + 10 + this.T.nextInt(10);
/*     */         
/* 250 */         this.bJ[☃ - 1] = this.bJ[☃ - 1] + 1; if ((this.m.aj() == adi.c || this.m.aj() == adi.d) && this.bJ[☃ - 1] > 15) {
/* 251 */           float f1 = 10.0F;
/* 252 */           float f2 = 5.0F;
/* 253 */           double d1 = xq.a(this.T, this.q - 10.0D, this.q + 10.0D);
/* 254 */           double d2 = xq.a(this.T, this.r - 5.0D, this.r + 5.0D);
/* 255 */           double d3 = xq.a(this.T, this.s - 10.0D, this.s + 10.0D);
/* 256 */           a(☃ + 1, d1, d2, d3, true);
/* 257 */           this.bJ[☃ - 1] = 0;
/*     */         } 
/*     */         
/* 260 */         int i = p(☃);
/* 261 */         if (i > 0) {
/* 262 */           aer aer = this.m.a(i);
/* 263 */           if (aer == null || !aer.aF() || h(aer) > 900.0D || !D(aer)) {
/* 264 */             a(☃, 0);
/*     */           }
/* 266 */           else if (aer instanceof aog && ((aog)aer).bV.a) {
/* 267 */             a(☃, 0);
/*     */           } else {
/* 269 */             a(☃ + 1, (afa)aer);
/* 270 */             this.bI[☃ - 1] = this.U + 40 + this.T.nextInt(20);
/* 271 */             this.bJ[☃ - 1] = 0;
/*     */           } 
/*     */         } else {
/*     */           
/* 275 */           List<afa> list = this.m.a(afa.class, bD().c(20.0D, 8.0D, 20.0D), (Predicate)bM.and(aeu.f));
/*     */           
/* 277 */           for (int j = 0; j < 10 && !list.isEmpty(); j++) {
/* 278 */             afa afa = list.get(this.T.nextInt(list.size()));
/*     */             
/* 280 */             if (afa != this && afa.aF() && D(afa)) {
/* 281 */               if (afa instanceof aog) {
/* 282 */                 if (!((aog)afa).bV.a) {
/* 283 */                   a(☃, afa.Q());
/*     */                 }
/*     */                 break;
/*     */               } 
/* 287 */               a(☃, afa.Q());
/*     */               
/*     */               break;
/*     */             } 
/*     */             
/* 292 */             list.remove(afa);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 297 */     if (v() != null) {
/* 298 */       a(0, v().Q());
/*     */     } else {
/* 300 */       a(0, 0);
/*     */     } 
/*     */     
/* 303 */     if (this.bK > 0) {
/* 304 */       this.bK--;
/*     */       
/* 306 */       if (this.bK == 0 && this.m.X().b("mobGriefing")) {
/*     */ 
/*     */ 
/*     */         
/* 310 */         ☃ = xq.c(this.r);
/* 311 */         int i = xq.c(this.q);
/* 312 */         int j = xq.c(this.s);
/* 313 */         boolean bool = false;
/*     */         
/* 315 */         for (int k = -1; k <= 1; k++) {
/* 316 */           for (int m = -1; m <= 1; m++) {
/* 317 */             for (int n = 0; n <= 3; n++) {
/* 318 */               int i1 = i + k;
/* 319 */               int i2 = ☃ + n;
/* 320 */               int i3 = j + m;
/* 321 */               el el = new el(i1, i2, i3);
/* 322 */               blc blc = this.m.a_(el);
/* 323 */               bcs bcs = blc.c();
/* 324 */               if (!blc.f() && a(bcs)) {
/* 325 */                 bool = (this.m.a(el, true) || bool);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/* 330 */         if (bool) {
/* 331 */           this.m.a((aog)null, 1022, new el(this), 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 336 */     if (this.U % 20 == 0) {
/* 337 */       c(1.0F);
/*     */     }
/*     */     
/* 340 */     this.bL.a(cq() / cw());
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(bcs ☃) {
/* 345 */     return (☃ != bct.z && ☃ != bct.ee && ☃ != bct.ef && ☃ != bct.et && ☃ != bct.ih && ☃ != bct.ii && ☃ != bct.fU && ☃ != bct.kz && ☃ != bct.io && ☃ != bct.bo && ☃ != bct.ig);
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
/*     */   public void l() {
/* 360 */     d(220);
/* 361 */     l(cw() / 3.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void bh() {}
/*     */ 
/*     */   
/*     */   public void b(tf ☃) {
/* 370 */     super.b(☃);
/* 371 */     this.bL.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(tf ☃) {
/* 376 */     super.c(☃);
/* 377 */     this.bL.b(☃);
/*     */   }
/*     */   
/*     */   private double q(int ☃) {
/* 381 */     if (☃ <= 0) {
/* 382 */       return this.q;
/*     */     }
/* 384 */     float f1 = (this.aQ + (180 * (☃ - 1))) * 0.017453292F;
/* 385 */     float f2 = xq.b(f1);
/* 386 */     return this.q + f2 * 1.3D;
/*     */   }
/*     */   
/*     */   private double r(int ☃) {
/* 390 */     if (☃ <= 0) {
/* 391 */       return this.r + 3.0D;
/*     */     }
/* 393 */     return this.r + 2.2D;
/*     */   }
/*     */ 
/*     */   
/*     */   private double s(int ☃) {
/* 398 */     if (☃ <= 0) {
/* 399 */       return this.s;
/*     */     }
/* 401 */     float f1 = (this.aQ + (180 * (☃ - 1))) * 0.017453292F;
/* 402 */     float f2 = xq.a(f1);
/* 403 */     return this.s + f2 * 1.3D;
/*     */   }
/*     */   
/*     */   private float c(float ☃, float f1, float f2) {
/* 407 */     float f = xq.g(f1 - ☃);
/* 408 */     if (f > f2) {
/* 409 */       f = f2;
/*     */     }
/* 411 */     if (f < -f2) {
/* 412 */       f = -f2;
/*     */     }
/* 414 */     return ☃ + f;
/*     */   }
/*     */   
/*     */   private void a(int ☃, afa afa1) {
/* 418 */     a(☃, afa1.q, afa1.r + afa1.bF() * 0.5D, afa1.s, (☃ == 0 && this.T.nextFloat() < 0.001F));
/*     */   }
/*     */   
/*     */   private void a(int ☃, double d1, double d2, double d3, boolean bool) {
/* 422 */     this.m.a((aog)null, 1024, new el(this), 0);
/*     */     
/* 424 */     double d4 = q(☃);
/* 425 */     double d5 = r(☃);
/* 426 */     double d6 = s(☃);
/*     */     
/* 428 */     double d7 = d1 - d4;
/* 429 */     double d8 = d2 - d5;
/* 430 */     double d9 = d3 - d6;
/*     */     
/* 432 */     apf apf = new apf(this.m, this, d7, d8, d9);
/* 433 */     if (bool) {
/* 434 */       apf.a(true);
/*     */     }
/* 436 */     apf.r = d5;
/* 437 */     apf.q = d4;
/* 438 */     apf.s = d6;
/* 439 */     this.m.a(apf);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 444 */     a(0, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 449 */     if (b(☃)) {
/* 450 */       return false;
/*     */     }
/* 452 */     if (☃ == aea.h || ☃.k() instanceof alx) {
/* 453 */       return false;
/*     */     }
/* 455 */     if (dz() > 0 && ☃ != aea.m) {
/* 456 */       return false;
/*     */     }
/*     */     
/* 459 */     if (dA()) {
/* 460 */       aer aer1 = ☃.j();
/* 461 */       if (aer1 instanceof aok) {
/* 462 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 466 */     aer aer = ☃.k();
/* 467 */     if (aer != null && 
/* 468 */       !(aer instanceof aog) && 
/* 469 */       aer instanceof afa && ((afa)aer).cA() == cA())
/*     */     {
/* 471 */       return false;
/*     */     }
/*     */     
/* 474 */     if (this.bK <= 0) {
/* 475 */       this.bK = 20;
/*     */     }
/*     */     
/* 478 */     for (int i = 0; i < this.bJ.length; i++) {
/* 479 */       this.bJ[i] = this.bJ[i] + 3;
/*     */     }
/*     */     
/* 482 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(boolean ☃, int i) {
/* 487 */     amm amm = a(atf.dP);
/* 488 */     if (amm != null) {
/* 489 */       amm.s();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void I() {
/* 495 */     this.aY = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(aek ☃) {
/* 509 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 514 */     super.bZ();
/*     */     
/* 516 */     a(ank.a).a(300.0D);
/* 517 */     a(ank.d).a(0.6000000238418579D);
/* 518 */     a(ank.b).a(40.0D);
/* 519 */     a(ank.h).a(4.0D);
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
/*     */   public int dz() {
/* 531 */     return ((Integer)this.ab.<Integer>a(bD)).intValue();
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 535 */     this.ab.b(bD, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int p(int ☃) {
/* 539 */     return ((Integer)this.ab.<Integer>a(bC.get(☃))).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 543 */     this.ab.b(bC.get(☃), Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   public boolean dA() {
/* 547 */     return (cq() <= cw() / 2.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 552 */     return afd.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean n(aer ☃) {
/* 557 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bm() {
/* 562 */     return false;
/*     */   }
/*     */   
/*     */   class a extends agt {
/*     */     public a(alx this$0) {
/* 567 */       a(7);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 572 */       return (this.a.dz() > 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {}
/*     */ }


/* Location:              F:\dw\server.jar!\alx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */