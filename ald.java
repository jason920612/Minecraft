/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class ald
/*     */   extends afb
/*     */   implements ala, amy
/*     */ {
/*  58 */   private static final Logger bQ = LogManager.getLogger();
/*     */   
/*  60 */   public static final or<Integer> a = ou.a((Class)ald.class, ot.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public double[][] b = new double[64][3];
/*  67 */   public int c = -1;
/*     */   
/*     */   public alb[] bC;
/*     */   
/*     */   public alb bD;
/*     */   
/*     */   public alb bE;
/*     */   public alb bF;
/*     */   public alb bG;
/*     */   public alb bH;
/*     */   public alb bI;
/*     */   public alb bJ;
/*     */   public alb bK;
/*     */   public float bL;
/*     */   public float bM;
/*     */   public boolean bN;
/*     */   public int bO;
/*     */   public alc bP;
/*     */   private final boh bR;
/*     */   private final alu bS;
/*  87 */   private int bT = 100;
/*     */   private int bU;
/*  89 */   private final cbc[] bV = new cbc[24];
/*  90 */   private final int[] bW = new int[24];
/*  91 */   private final caz bX = new caz();
/*     */   
/*     */   public ald(axy ☃) {
/*  94 */     super(aev.r, ☃);
/*     */     
/*  96 */     this.bD = new alb(this, "head", 6.0F, 6.0F);
/*  97 */     this.bE = new alb(this, "neck", 6.0F, 6.0F);
/*  98 */     this.bF = new alb(this, "body", 8.0F, 8.0F);
/*  99 */     this.bG = new alb(this, "tail", 4.0F, 4.0F);
/* 100 */     this.bH = new alb(this, "tail", 4.0F, 4.0F);
/* 101 */     this.bI = new alb(this, "tail", 4.0F, 4.0F);
/* 102 */     this.bJ = new alb(this, "wing", 4.0F, 4.0F);
/* 103 */     this.bK = new alb(this, "wing", 4.0F, 4.0F);
/*     */     
/* 105 */     this.bC = new alb[] { this.bD, this.bE, this.bF, this.bG, this.bH, this.bI, this.bJ, this.bK };
/*     */     
/* 107 */     l(cw());
/*     */     
/* 109 */     a(16.0F, 8.0F);
/*     */     
/* 111 */     this.R = true;
/* 112 */     this.aa = true;
/*     */     
/* 114 */     this.ak = true;
/*     */     
/* 116 */     if (!☃.B && ☃.t instanceof boi) {
/* 117 */       this.bR = ((boi)☃.t).r();
/*     */     } else {
/* 119 */       this.bR = null;
/*     */     } 
/*     */     
/* 122 */     this.bS = new alu(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 127 */     super.bZ();
/*     */     
/* 129 */     a(ank.a).a(200.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 134 */     super.x_();
/* 135 */     T().a(a, Integer.valueOf(alt.k.b()));
/*     */   }
/*     */   
/*     */   public double[] a(int ☃, float f) {
/* 139 */     if (cq() <= 0.0F) {
/* 140 */       f = 0.0F;
/*     */     }
/*     */     
/* 143 */     f = 1.0F - f;
/*     */     
/* 145 */     int i = this.c - ☃ & 0x3F;
/* 146 */     int j = this.c - ☃ - 1 & 0x3F;
/* 147 */     double[] arrayOfDouble = new double[3];
/* 148 */     double d1 = this.b[i][0];
/* 149 */     double d2 = xq.g(this.b[j][0] - d1);
/* 150 */     arrayOfDouble[0] = d1 + d2 * f;
/*     */     
/* 152 */     d1 = this.b[i][1];
/* 153 */     d2 = this.b[j][1] - d1;
/*     */     
/* 155 */     arrayOfDouble[1] = d1 + d2 * f;
/* 156 */     arrayOfDouble[2] = this.b[i][2] + (this.b[j][2] - this.b[i][2]) * f;
/* 157 */     return arrayOfDouble;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 162 */     if (this.m.B) {
/* 163 */       l(cq());
/*     */       
/* 165 */       if (!ai()) {
/* 166 */         float f10 = xq.b(this.bM * 6.2831855F);
/* 167 */         float f11 = xq.b(this.bL * 6.2831855F);
/*     */         
/* 169 */         if (f11 <= -0.3F && f10 >= -0.3F) {
/* 170 */           this.m.a(this.q, this.r, this.s, wj.bS, bV(), 5.0F, 0.8F + this.T.nextFloat() * 0.3F, false);
/*     */         }
/*     */         
/* 173 */         if (!this.bS.a().a() && --this.bT < 0) {
/* 174 */           this.m.a(this.q, this.r, this.s, wj.bT, bV(), 2.5F, 0.8F + this.T.nextFloat() * 0.3F, false);
/* 175 */           this.bT = 200 + this.T.nextInt(200);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 180 */     this.bL = this.bM;
/*     */     
/* 182 */     if (cq() <= 0.0F) {
/* 183 */       float f10 = (this.T.nextFloat() - 0.5F) * 8.0F;
/* 184 */       float f11 = (this.T.nextFloat() - 0.5F) * 4.0F;
/* 185 */       float f12 = (this.T.nextFloat() - 0.5F) * 8.0F;
/* 186 */       this.m.a(fm.u, this.q + f10, this.r + 2.0D + f11, this.s + f12, 0.0D, 0.0D, 0.0D);
/*     */       
/*     */       return;
/*     */     } 
/* 190 */     dt();
/*     */     
/* 192 */     float ☃ = 0.2F / (xq.a(this.t * this.t + this.v * this.v) * 10.0F + 1.0F);
/* 193 */     ☃ *= (float)Math.pow(2.0D, this.u);
/* 194 */     if (this.bS.a().a()) {
/* 195 */       this.bM += 0.1F;
/* 196 */     } else if (this.bN) {
/* 197 */       this.bM += ☃ * 0.5F;
/*     */     } else {
/* 199 */       this.bM += ☃;
/*     */     } 
/*     */     
/* 202 */     this.w = xq.g(this.w);
/*     */     
/* 204 */     if (do()) {
/* 205 */       this.bM = 0.5F;
/*     */       
/*     */       return;
/*     */     } 
/* 209 */     if (this.c < 0) {
/* 210 */       for (int k = 0; k < this.b.length; k++) {
/* 211 */         this.b[k][0] = this.w;
/* 212 */         this.b[k][1] = this.r;
/*     */       } 
/*     */     }
/*     */     
/* 216 */     if (++this.c == this.b.length) {
/* 217 */       this.c = 0;
/*     */     }
/* 219 */     this.b[this.c][0] = this.w;
/* 220 */     this.b[this.c][1] = this.r;
/*     */     
/* 222 */     if (this.m.B) {
/* 223 */       if (this.bl > 0) {
/* 224 */         double d1 = this.q + (this.bm - this.q) / this.bl;
/* 225 */         double d2 = this.r + (this.bn - this.r) / this.bl;
/* 226 */         double d3 = this.s + (this.bo - this.s) / this.bl;
/*     */         
/* 228 */         double d4 = xq.g(this.bp - this.w);
/*     */         
/* 230 */         this.w = (float)(this.w + d4 / this.bl);
/* 231 */         this.x = (float)(this.x + (this.bq - this.x) / this.bl);
/*     */         
/* 233 */         this.bl--;
/* 234 */         b(d1, d2, d3);
/* 235 */         b(this.w, this.x);
/*     */       } 
/*     */       
/* 238 */       this.bS.a().b();
/*     */     } else {
/* 240 */       aln aln = this.bS.a();
/* 241 */       aln.c();
/*     */       
/* 243 */       if (this.bS.a() != aln) {
/* 244 */         aln = this.bS.a();
/* 245 */         aln.c();
/*     */       } 
/*     */       
/* 248 */       cee cee = aln.g();
/*     */       
/* 250 */       if (cee != null) {
/* 251 */         double d1 = cee.b - this.q;
/* 252 */         double d2 = cee.c - this.r;
/* 253 */         double d3 = cee.d - this.s;
/*     */         
/* 255 */         double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 256 */         float f10 = aln.f();
/* 257 */         d2 = xq.a(d2 / xq.a(d1 * d1 + d3 * d3), -f10, f10);
/* 258 */         this.u += d2 * 0.10000000149011612D;
/* 259 */         this.w = xq.g(this.w);
/*     */         
/* 261 */         double d5 = xq.a(xq.g(180.0D - xq.c(d1, d3) * 57.2957763671875D - this.w), -50.0D, 50.0D);
/* 262 */         cee cee1 = (new cee(cee.b - this.q, cee.c - this.r, cee.d - this.s)).a();
/* 263 */         cee cee2 = (new cee(xq.a(this.w * 0.017453292F), this.u, -xq.b(this.w * 0.017453292F))).a();
/* 264 */         float f11 = Math.max(((float)cee2.b(cee1) + 0.5F) / 1.5F, 0.0F);
/*     */         
/* 266 */         this.bk *= 0.8F;
/* 267 */         this.bk = (float)(this.bk + d5 * aln.h());
/* 268 */         this.w += this.bk * 0.1F;
/*     */         
/* 270 */         float f12 = (float)(2.0D / (d4 + 1.0D));
/* 271 */         float f13 = 0.06F;
/* 272 */         a(0.0F, 0.0F, -1.0F, 0.06F * (f11 * f12 + 1.0F - f12));
/* 273 */         if (this.bN) {
/* 274 */           a(afe.a, this.t * 0.800000011920929D, this.u * 0.800000011920929D, this.v * 0.800000011920929D);
/*     */         } else {
/* 276 */           a(afe.a, this.t, this.u, this.v);
/*     */         } 
/*     */         
/* 279 */         cee cee3 = (new cee(this.t, this.u, this.v)).a();
/* 280 */         float f14 = ((float)cee3.b(cee2) + 1.0F) / 2.0F;
/* 281 */         f14 = 0.8F + 0.15F * f14;
/*     */         
/* 283 */         this.t *= f14;
/* 284 */         this.v *= f14;
/* 285 */         this.u *= 0.9100000262260437D;
/*     */       } 
/*     */     } 
/*     */     
/* 289 */     this.aQ = this.w;
/*     */     
/* 291 */     this.bD.H = 1.0F;
/* 292 */     this.bD.I = 1.0F;
/* 293 */     this.bE.H = 3.0F;
/* 294 */     this.bE.I = 3.0F;
/* 295 */     this.bG.H = 2.0F;
/* 296 */     this.bG.I = 2.0F;
/* 297 */     this.bH.H = 2.0F;
/* 298 */     this.bH.I = 2.0F;
/* 299 */     this.bI.H = 2.0F;
/* 300 */     this.bI.I = 2.0F;
/* 301 */     this.bF.I = 3.0F;
/* 302 */     this.bF.H = 5.0F;
/* 303 */     this.bJ.I = 2.0F;
/* 304 */     this.bJ.H = 4.0F;
/* 305 */     this.bK.I = 3.0F;
/* 306 */     this.bK.H = 4.0F;
/*     */     
/* 308 */     cee[] arrayOfCee = new cee[this.bC.length];
/* 309 */     for (int i = 0; i < this.bC.length; i++) {
/* 310 */       arrayOfCee[i] = new cee((this.bC[i]).q, (this.bC[i]).r, (this.bC[i]).s);
/*     */     }
/*     */     
/* 313 */     float f1 = (float)(a(5, 1.0F)[1] - a(10, 1.0F)[1]) * 10.0F * 0.017453292F;
/* 314 */     float f2 = xq.b(f1);
/* 315 */     float f3 = xq.a(f1);
/*     */     
/* 317 */     float f4 = this.w * 0.017453292F;
/* 318 */     float f5 = xq.a(f4);
/* 319 */     float f6 = xq.b(f4);
/*     */     
/* 321 */     this.bF.R_();
/* 322 */     this.bF.b(this.q + (f5 * 0.5F), this.r, this.s - (f6 * 0.5F), 0.0F, 0.0F);
/* 323 */     this.bJ.R_();
/* 324 */     this.bJ.b(this.q + (f6 * 4.5F), this.r + 2.0D, this.s + (f5 * 4.5F), 0.0F, 0.0F);
/* 325 */     this.bK.R_();
/* 326 */     this.bK.b(this.q - (f6 * 4.5F), this.r + 2.0D, this.s - (f5 * 4.5F), 0.0F, 0.0F);
/*     */     
/* 328 */     if (!this.m.B && this.aB == 0) {
/* 329 */       a(this.m.a(this, this.bJ.bD().c(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
/* 330 */       a(this.m.a(this, this.bK.bD().c(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
/* 331 */       b(this.m.a(this, this.bD.bD().g(1.0D)));
/* 332 */       b(this.m.a(this, this.bE.bD().g(1.0D)));
/*     */     } 
/*     */     
/* 335 */     double[] arrayOfDouble = a(5, 1.0F);
/*     */     
/* 337 */     float f7 = xq.a(this.w * 0.017453292F - this.bk * 0.01F);
/* 338 */     float f8 = xq.b(this.w * 0.017453292F - this.bk * 0.01F);
/* 339 */     this.bD.R_();
/* 340 */     this.bE.R_();
/* 341 */     float f9 = u(1.0F);
/* 342 */     this.bD.b(this.q + (f7 * 6.5F * f2), this.r + f9 + (f3 * 6.5F), this.s - (f8 * 6.5F * f2), 0.0F, 0.0F);
/* 343 */     this.bE.b(this.q + (f7 * 5.5F * f2), this.r + f9 + (f3 * 5.5F), this.s - (f8 * 5.5F * f2), 0.0F, 0.0F);
/*     */     
/*     */     int j;
/*     */     
/* 347 */     for (j = 0; j < 3; j++) {
/* 348 */       alb alb1 = null;
/*     */       
/* 350 */       if (j == 0) {
/* 351 */         alb1 = this.bG;
/*     */       }
/* 353 */       if (j == 1) {
/* 354 */         alb1 = this.bH;
/*     */       }
/* 356 */       if (j == 2) {
/* 357 */         alb1 = this.bI;
/*     */       }
/*     */       
/* 360 */       double[] arrayOfDouble1 = a(12 + j * 2, 1.0F);
/*     */       
/* 362 */       float f10 = this.w * 0.017453292F + c(arrayOfDouble1[0] - arrayOfDouble[0]) * 0.017453292F;
/* 363 */       float f11 = xq.a(f10);
/* 364 */       float f12 = xq.b(f10);
/*     */       
/* 366 */       float f13 = 1.5F;
/* 367 */       float f14 = (j + 1) * 2.0F;
/* 368 */       alb1.R_();
/* 369 */       alb1.b(this.q - ((f5 * 1.5F + f11 * f14) * f2), this.r + arrayOfDouble1[1] - arrayOfDouble[1] - ((f14 + 1.5F) * f3) + 1.5D, this.s + ((f6 * 1.5F + f12 * f14) * f2), 0.0F, 0.0F);
/*     */     } 
/*     */     
/* 372 */     if (!this.m.B) {
/*     */       
/* 374 */       this.bN = b(this.bD.bD()) | b(this.bE.bD()) | b(this.bF.bD());
/*     */       
/* 376 */       if (this.bR != null) {
/* 377 */         this.bR.b(this);
/*     */       }
/*     */     } 
/* 380 */     for (j = 0; j < this.bC.length; j++) {
/* 381 */       (this.bC[j]).n = (arrayOfCee[j]).b;
/* 382 */       (this.bC[j]).o = (arrayOfCee[j]).c;
/* 383 */       (this.bC[j]).p = (arrayOfCee[j]).d;
/*     */     } 
/*     */   }
/*     */   
/*     */   private float u(float ☃) {
/*     */     double d;
/* 389 */     if (this.bS.a().a()) {
/* 390 */       d = -1.0D;
/*     */     } else {
/* 392 */       double[] arrayOfDouble1 = a(5, 1.0F);
/* 393 */       double[] arrayOfDouble2 = a(0, 1.0F);
/* 394 */       d = arrayOfDouble1[1] - arrayOfDouble2[1];
/*     */     } 
/*     */     
/* 397 */     return (float)d;
/*     */   }
/*     */   
/*     */   private void dt() {
/* 401 */     if (this.bP != null) {
/* 402 */       if (this.bP.G) {
/* 403 */         this.bP = null;
/* 404 */       } else if (this.U % 10 == 0 && 
/* 405 */         cq() < cw()) {
/* 406 */         l(cq() + 1.0F);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 411 */     if (this.T.nextInt(10) == 0) {
/* 412 */       List<alc> ☃ = this.m.a(alc.class, bD().g(32.0D));
/*     */       
/* 414 */       alc alc1 = null;
/* 415 */       double d = Double.MAX_VALUE;
/* 416 */       for (alc alc2 : ☃) {
/* 417 */         double d1 = alc2.h(this);
/* 418 */         if (d1 < d) {
/* 419 */           d = d1;
/* 420 */           alc1 = alc2;
/*     */         } 
/*     */       } 
/*     */       
/* 424 */       this.bP = alc1;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<aer> ☃) {
/* 429 */     double d1 = ((this.bF.bD()).a + (this.bF.bD()).d) / 2.0D;
/* 430 */     double d2 = ((this.bF.bD()).c + (this.bF.bD()).f) / 2.0D;
/*     */     
/* 432 */     for (aer aer : ☃) {
/* 433 */       if (aer instanceof afa) {
/* 434 */         double d3 = aer.q - d1;
/* 435 */         double d4 = aer.s - d2;
/* 436 */         double d5 = d3 * d3 + d4 * d4;
/* 437 */         aer.f(d3 / d5 * 4.0D, 0.20000000298023224D, d4 / d5 * 4.0D);
/* 438 */         if (!this.bS.a().a() && ((afa)aer).cg() < aer.U - 2) {
/* 439 */           aer.a(aea.a(this), 5.0F);
/* 440 */           a(this, aer);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(List<aer> ☃) {
/* 447 */     for (int i = 0; i < ☃.size(); i++) {
/* 448 */       aer aer = ☃.get(i);
/* 449 */       if (aer instanceof afa) {
/* 450 */         aer.a(aea.a(this), 10.0F);
/* 451 */         a(this, aer);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private float c(double ☃) {
/* 457 */     return (float)xq.g(☃);
/*     */   }
/*     */   
/*     */   private boolean b(cea ☃) {
/* 461 */     int i = xq.c(☃.a);
/* 462 */     int j = xq.c(☃.b);
/* 463 */     int k = xq.c(☃.c);
/* 464 */     int m = xq.c(☃.d);
/* 465 */     int n = xq.c(☃.e);
/* 466 */     int i1 = xq.c(☃.f);
/* 467 */     boolean bool1 = false;
/* 468 */     boolean bool2 = false;
/* 469 */     for (int i2 = i; i2 <= m; i2++) {
/* 470 */       for (int i3 = j; i3 <= n; i3++) {
/* 471 */         for (int i4 = k; i4 <= i1; i4++) {
/* 472 */           el el = new el(i2, i3, i4);
/* 473 */           blc blc = this.m.a_(el);
/* 474 */           bcs bcs = blc.c();
/* 475 */           if (!blc.f() && blc.d() != bza.m)
/*     */           {
/* 477 */             if (!this.m.X().b("mobGriefing")) {
/* 478 */               bool1 = true;
/* 479 */             } else if (bcs == bct.fU || bcs == bct.ce || bcs == bct.eg || bcs == bct.z || bcs == bct.ee || bcs == bct.ef) {
/* 480 */               bool1 = true;
/* 481 */             } else if (bcs == bct.et || bcs == bct.ih || bcs == bct.ii || bcs == bct.dF || bcs == bct.ig) {
/* 482 */               bool1 = true;
/*     */             } else {
/* 484 */               bool2 = (this.m.g(el) || bool2);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 490 */     if (bool2) {
/* 491 */       double d1 = ☃.a + (☃.d - ☃.a) * this.T.nextFloat();
/* 492 */       double d2 = ☃.b + (☃.e - ☃.b) * this.T.nextFloat();
/* 493 */       double d3 = ☃.c + (☃.f - ☃.c) * this.T.nextFloat();
/* 494 */       this.m.a(fm.u, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 497 */     return bool1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(alb ☃, aea aea1, float f) {
/* 502 */     f = this.bS.a().a(☃, aea1, f);
/*     */     
/* 504 */     if (☃ != this.bD) {
/* 505 */       f = f / 4.0F + Math.min(f, 1.0F);
/*     */     }
/*     */     
/* 508 */     if (f < 0.01F) {
/* 509 */       return false;
/*     */     }
/*     */     
/* 512 */     if (aea1.k() instanceof aog || aea1.d()) {
/* 513 */       float f1 = cq();
/* 514 */       e(aea1, f);
/*     */       
/* 516 */       if (cq() <= 0.0F && !this.bS.a().a()) {
/* 517 */         l(1.0F);
/* 518 */         this.bS.a(alt.j);
/*     */       } 
/*     */       
/* 521 */       if (this.bS.a().a()) {
/* 522 */         this.bU = (int)(this.bU + f1 - cq());
/*     */         
/* 524 */         if (this.bU > 0.25F * cw()) {
/* 525 */           this.bU = 0;
/* 526 */           this.bS.a(alt.e);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 531 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 536 */     if (☃ instanceof aeb && ((aeb)☃).y()) {
/* 537 */       a(this.bF, ☃, f);
/*     */     }
/* 539 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean e(aea ☃, float f) {
/* 543 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void S() {
/* 548 */     V();
/*     */     
/* 550 */     if (this.bR != null) {
/* 551 */       this.bR.b(this);
/* 552 */       this.bR.a(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void cb() {
/* 558 */     if (this.bR != null) {
/* 559 */       this.bR.b(this);
/*     */     }
/*     */     
/* 562 */     this.bO++;
/* 563 */     if (this.bO >= 180 && this.bO <= 200) {
/* 564 */       float f1 = (this.T.nextFloat() - 0.5F) * 8.0F;
/* 565 */       float f2 = (this.T.nextFloat() - 0.5F) * 4.0F;
/* 566 */       float f3 = (this.T.nextFloat() - 0.5F) * 8.0F;
/* 567 */       this.m.a(fm.t, this.q + f1, this.r + 2.0D + f2, this.s + f3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 570 */     boolean ☃ = this.m.X().b("doMobLoot");
/* 571 */     int i = 500;
/* 572 */     if (this.bR != null && !this.bR.d()) {
/* 573 */       i = 12000;
/*     */     }
/*     */     
/* 576 */     if (!this.m.B) {
/* 577 */       if (this.bO > 150 && this.bO % 5 == 0 && ☃) {
/* 578 */         a(xq.d(i * 0.08F));
/*     */       }
/* 580 */       if (this.bO == 1) {
/* 581 */         this.m.a(1028, new el(this), 0);
/*     */       }
/*     */     } 
/* 584 */     a(afe.a, 0.0D, 0.10000000149011612D, 0.0D);
/* 585 */     this.w += 20.0F;
/* 586 */     this.aQ = this.w;
/*     */     
/* 588 */     if (this.bO == 200 && !this.m.B) {
/* 589 */       if (☃) {
/* 590 */         a(xq.d(i * 0.2F));
/*     */       }
/* 592 */       if (this.bR != null) {
/* 593 */         this.bR.a(this);
/*     */       }
/* 595 */       V();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 600 */     while (☃ > 0) {
/* 601 */       int i = aex.a(☃);
/* 602 */       ☃ -= i;
/* 603 */       this.m.a(new aex(this.m, this.q, this.r, this.s, i));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/* 609 */     if (this.bV[0] == null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 615 */       for (int ☃ = 0; ☃ < 24; ☃++) {
/* 616 */         int k, m, i = 5;
/* 617 */         int j = ☃;
/*     */ 
/*     */ 
/*     */         
/* 621 */         if (☃ < 12) {
/* 622 */           k = (int)(60.0F * xq.b(2.0F * (-3.1415927F + 0.2617994F * j)));
/* 623 */           m = (int)(60.0F * xq.a(2.0F * (-3.1415927F + 0.2617994F * j)));
/* 624 */         } else if (☃ < 20) {
/* 625 */           j -= 12;
/* 626 */           k = (int)(40.0F * xq.b(2.0F * (-3.1415927F + 0.3926991F * j)));
/* 627 */           m = (int)(40.0F * xq.a(2.0F * (-3.1415927F + 0.3926991F * j)));
/* 628 */           i += 10;
/*     */         } else {
/* 630 */           j -= 20;
/* 631 */           k = (int)(20.0F * xq.b(2.0F * (-3.1415927F + 0.7853982F * j)));
/* 632 */           m = (int)(20.0F * xq.a(2.0F * (-3.1415927F + 0.7853982F * j)));
/*     */         } 
/*     */ 
/*     */         
/* 636 */         int n = Math.max(this.m.k() + 10, this.m.a(bor.a.e, new el(k, 0, m)).p() + i);
/*     */         
/* 638 */         this.bV[☃] = new cbc(k, n, m);
/*     */       } 
/*     */       
/* 641 */       this.bW[0] = 6146;
/* 642 */       this.bW[1] = 8197;
/* 643 */       this.bW[2] = 8202;
/* 644 */       this.bW[3] = 16404;
/* 645 */       this.bW[4] = 32808;
/* 646 */       this.bW[5] = 32848;
/* 647 */       this.bW[6] = 65696;
/* 648 */       this.bW[7] = 131392;
/* 649 */       this.bW[8] = 131712;
/* 650 */       this.bW[9] = 263424;
/* 651 */       this.bW[10] = 526848;
/* 652 */       this.bW[11] = 525313;
/*     */       
/* 654 */       this.bW[12] = 1581057;
/* 655 */       this.bW[13] = 3166214;
/* 656 */       this.bW[14] = 2138120;
/* 657 */       this.bW[15] = 6373424;
/* 658 */       this.bW[16] = 4358208;
/* 659 */       this.bW[17] = 12910976;
/* 660 */       this.bW[18] = 9044480;
/* 661 */       this.bW[19] = 9706496;
/*     */       
/* 663 */       this.bW[20] = 15216640;
/* 664 */       this.bW[21] = 13688832;
/* 665 */       this.bW[22] = 11763712;
/* 666 */       this.bW[23] = 8257536;
/*     */     } 
/*     */     
/* 669 */     return k(this.q, this.r, this.s);
/*     */   }
/*     */   
/*     */   public int k(double ☃, double d1, double d2) {
/* 673 */     float f = 10000.0F;
/* 674 */     int i = 0;
/* 675 */     cbc cbc1 = new cbc(xq.c(☃), xq.c(d1), xq.c(d2));
/* 676 */     int j = 0;
/*     */     
/* 678 */     if (this.bR == null || this.bR.c() == 0)
/*     */     {
/* 680 */       j = 12;
/*     */     }
/*     */     
/* 683 */     for (int k = j; k < 24; k++) {
/* 684 */       if (this.bV[k] != null) {
/* 685 */         float f1 = this.bV[k].b(cbc1);
/* 686 */         if (f1 < f) {
/* 687 */           f = f1;
/* 688 */           i = k;
/*     */         } 
/*     */       } 
/*     */     } 
/* 692 */     return i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cbe a(int ☃, int i, @Nullable cbc cbc1) {
/* 697 */     for (int j = 0; j < 24; j++) {
/* 698 */       cbc cbc5 = this.bV[j];
/* 699 */       cbc5.i = false;
/* 700 */       cbc5.g = 0.0F;
/* 701 */       cbc5.e = 0.0F;
/* 702 */       cbc5.f = 0.0F;
/* 703 */       cbc5.h = null;
/* 704 */       cbc5.d = -1;
/*     */     } 
/*     */     
/* 707 */     cbc cbc2 = this.bV[☃];
/* 708 */     cbc cbc3 = this.bV[i];
/*     */     
/* 710 */     cbc2.e = 0.0F;
/* 711 */     cbc2.f = cbc2.a(cbc3);
/* 712 */     cbc2.g = cbc2.f;
/*     */     
/* 714 */     this.bX.a();
/* 715 */     this.bX.a(cbc2);
/*     */     
/* 717 */     cbc cbc4 = cbc2;
/*     */     
/* 719 */     int k = 0;
/* 720 */     if (this.bR == null || this.bR.c() == 0)
/*     */     {
/* 722 */       k = 12;
/*     */     }
/*     */     
/* 725 */     while (!this.bX.e()) {
/* 726 */       cbc cbc5 = this.bX.c();
/*     */       
/* 728 */       if (cbc5.equals(cbc3)) {
/* 729 */         if (cbc1 != null) {
/* 730 */           cbc1.h = cbc3;
/* 731 */           cbc3 = cbc1;
/*     */         } 
/* 733 */         return a(cbc2, cbc3);
/*     */       } 
/*     */       
/* 736 */       if (cbc5.a(cbc3) < cbc4.a(cbc3)) {
/* 737 */         cbc4 = cbc5;
/*     */       }
/* 739 */       cbc5.i = true;
/*     */       
/* 741 */       int m = 0; int n;
/* 742 */       for (n = 0; n < 24; n++) {
/* 743 */         if (this.bV[n] == cbc5) {
/* 744 */           m = n;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 749 */       for (n = k; n < 24; n++) {
/* 750 */         if ((this.bW[m] & 1 << n) > 0) {
/* 751 */           cbc cbc6 = this.bV[n];
/*     */           
/* 753 */           if (!cbc6.i) {
/*     */ 
/*     */ 
/*     */             
/* 757 */             float f = cbc5.e + cbc5.a(cbc6);
/* 758 */             if (!cbc6.a() || f < cbc6.e) {
/* 759 */               cbc6.h = cbc5;
/* 760 */               cbc6.e = f;
/* 761 */               cbc6.f = cbc6.a(cbc3);
/* 762 */               if (cbc6.a()) {
/* 763 */                 this.bX.a(cbc6, cbc6.e + cbc6.f);
/*     */               } else {
/* 765 */                 cbc6.g = cbc6.e + cbc6.f;
/* 766 */                 this.bX.a(cbc6);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 773 */     if (cbc4 == cbc2) {
/* 774 */       return null;
/*     */     }
/* 776 */     bQ.debug("Failed to find path from {} to {}", Integer.valueOf(☃), Integer.valueOf(i));
/* 777 */     if (cbc1 != null) {
/* 778 */       cbc1.h = cbc4;
/* 779 */       cbc4 = cbc1;
/*     */     } 
/* 781 */     return a(cbc2, cbc4);
/*     */   }
/*     */   
/*     */   private cbe a(cbc ☃, cbc cbc1) {
/* 785 */     int i = 1;
/* 786 */     cbc cbc2 = cbc1;
/* 787 */     while (cbc2.h != null) {
/* 788 */       i++;
/* 789 */       cbc2 = cbc2.h;
/*     */     } 
/*     */     
/* 792 */     cbc[] arrayOfCbc = new cbc[i];
/* 793 */     cbc2 = cbc1;
/* 794 */     arrayOfCbc[--i] = cbc2;
/* 795 */     while (cbc2.h != null) {
/* 796 */       cbc2 = cbc2.h;
/* 797 */       arrayOfCbc[--i] = cbc2;
/*     */     } 
/* 799 */     return new cbe(arrayOfCbc);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 804 */     super.b(☃);
/* 805 */     ☃.b("DragonPhase", this.bS.a().i().b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 810 */     super.a(☃);
/* 811 */     if (☃.e("DragonPhase")) {
/* 812 */       this.bS.a(alt.a(☃.h("DragonPhase")));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void I() {}
/*     */ 
/*     */   
/*     */   public aer[] bi() {
/* 822 */     return (aer[])this.bC;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/* 827 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public axy J_() {
/* 832 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/* 837 */     return wk.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 842 */     return wj.bP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 847 */     return wj.bU;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/* 852 */     return 5.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 858 */     return ccl.aH;
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
/*     */   public cee a(float ☃) {
/*     */     cee cee;
/* 884 */     aln aln = this.bS.a();
/* 885 */     alt<? extends aln> alt = aln.i();
/*     */ 
/*     */     
/* 888 */     if (alt == alt.d || alt == alt.e) {
/* 889 */       el el = this.m.a(bor.a.e, bqn.a);
/* 890 */       float f1 = Math.max(xq.a(d(el)) / 4.0F, 1.0F);
/* 891 */       float f2 = 6.0F / f1;
/*     */       
/* 893 */       float f3 = this.x;
/* 894 */       float f4 = 1.5F;
/* 895 */       this.x = -f2 * 1.5F * 5.0F;
/*     */       
/* 897 */       cee = f(☃);
/* 898 */       this.x = f3;
/* 899 */     } else if (aln.a()) {
/* 900 */       float f1 = this.x;
/* 901 */       float f2 = 1.5F;
/* 902 */       this.x = -45.0F;
/*     */       
/* 904 */       cee = f(☃);
/* 905 */       this.x = f1;
/*     */     } else {
/* 907 */       cee = f(☃);
/*     */     } 
/*     */     
/* 910 */     return cee;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(alc ☃, el el1, aea aea1) {
/*     */     aog aog;
/* 916 */     if (aea1.k() instanceof aog) {
/* 917 */       aog = (aog)aea1.k();
/*     */     } else {
/* 919 */       aog = this.m.a(el1, 64.0D, 64.0D);
/*     */     } 
/*     */     
/* 922 */     if (☃ == this.bP) {
/* 923 */       a(this.bD, aea.b(aog), 10.0F);
/*     */     }
/*     */     
/* 926 */     this.bS.a().a(☃, el1, aea1, aog);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 931 */     if (a.equals(☃) && this.m.B) {
/* 932 */       this.bS.a(alt.a(((Integer)T().<Integer>a(a)).intValue()));
/*     */     }
/*     */     
/* 935 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public alu dr() {
/* 939 */     return this.bS;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public boh ds() {
/* 944 */     return this.bR;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(aek ☃) {
/* 949 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean n(aer ☃) {
/* 954 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bm() {
/* 959 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ald.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */