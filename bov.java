/*     */ import java.util.List;
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
/*     */ public class bov
/*     */   extends bmz<bou>
/*     */ {
/*  29 */   private static final Logger f = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private final byj g;
/*     */ 
/*     */   
/*     */   private final byj h;
/*     */ 
/*     */   
/*     */   private final byj i;
/*     */ 
/*     */   
/*     */   private final byk j;
/*     */   
/*     */   private final bou k;
/*     */   
/*     */   private final byj l;
/*     */   
/*     */   private final byj m;
/*     */   
/*     */   private final ayg n;
/*     */   
/*     */   private final float[] o;
/*     */   
/*  53 */   private final bow p = new bow();
/*     */   
/*     */   private final blc q;
/*     */   private final blc r;
/*     */   
/*     */   public bov(axz ☃, ayw ayw1, bou bou1) {
/*  59 */     super(☃, ayw1);
/*     */     
/*  61 */     this.n = ☃.g().t();
/*     */     
/*  63 */     boz boz = new boz(this.b);
/*  64 */     this.g = new byj(boz, 16);
/*  65 */     this.h = new byj(boz, 16);
/*  66 */     this.i = new byj(boz, 8);
/*  67 */     this.j = new byk(boz, 4);
/*     */     
/*  69 */     this.l = new byj(boz, 10);
/*  70 */     this.m = new byj(boz, 16);
/*     */     
/*  72 */     this.o = new float[25];
/*  73 */     for (int i = -2; i <= 2; i++) {
/*  74 */       for (int j = -2; j <= 2; j++) {
/*  75 */         float f = 10.0F / xq.c((i * i + j * j) + 0.2F);
/*  76 */         this.o[i + 2 + (j + 2) * 5] = f;
/*     */       } 
/*     */     } 
/*     */     
/*  80 */     this.k = bou1;
/*  81 */     this.q = this.k.r();
/*  82 */     this.r = this.k.s();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmx ☃) {
/*  87 */     axm axm = ☃.d();
/*  88 */     int i = axm.a;
/*  89 */     int j = axm.b;
/*     */     
/*  91 */     boz boz = new boz();
/*  92 */     boz.a(i, j);
/*     */ 
/*     */     
/*  95 */     ayu[] arrayOfAyu = this.c.b(i * 16, j * 16, 16, 16);
/*  96 */     ☃.a(arrayOfAyu);
/*     */ 
/*     */     
/*  99 */     a(i, j, ☃);
/*     */     
/* 101 */     ☃.a(new bor.a[] { bor.a.a, bor.a.b });
/* 102 */     a(☃, arrayOfAyu, boz, this.a.k());
/* 103 */     a(☃, boz);
/* 104 */     ☃.a(new bor.a[] { bor.a.a, bor.a.b });
/* 105 */     ☃.a(bnd.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ti ☃) {
/* 110 */     int i = ☃.a();
/* 111 */     int j = ☃.b();
/* 112 */     ayu ayu = ☃.b(i, j).g()[0];
/*     */     
/* 114 */     boz boz = new boz();
/* 115 */     boz.a(☃.r_(), i << 4, j << 4);
/* 116 */     ayj.a(☃, ayu, i, j, boz);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, bmx bmx1) {
/* 126 */     ayu[] arrayOfAyu = this.c.a((bmx1.d()).a * 4 - 2, (bmx1.d()).b * 4 - 2, 10, 10);
/*     */     
/* 128 */     double[] arrayOfDouble = new double[825];
/* 129 */     a(arrayOfAyu, (bmx1.d()).a * 4, 0, (bmx1.d()).b * 4, arrayOfDouble);
/* 130 */     el.a a = new el.a();
/*     */     
/* 132 */     for (int j = 0; j < 4; j++) {
/* 133 */       int k = j * 5;
/* 134 */       int m = (j + 1) * 5;
/* 135 */       for (int n = 0; n < 4; n++) {
/* 136 */         int i1 = (k + n) * 33;
/* 137 */         int i2 = (k + n + 1) * 33;
/* 138 */         int i3 = (m + n) * 33;
/* 139 */         int i4 = (m + n + 1) * 33;
/* 140 */         for (int i5 = 0; i5 < 32; i5++) {
/* 141 */           double d1 = 0.125D;
/* 142 */           double d2 = arrayOfDouble[i1 + i5];
/* 143 */           double d3 = arrayOfDouble[i2 + i5];
/* 144 */           double d4 = arrayOfDouble[i3 + i5];
/* 145 */           double d5 = arrayOfDouble[i4 + i5];
/*     */           
/* 147 */           double d6 = (arrayOfDouble[i1 + i5 + 1] - d2) * 0.125D;
/* 148 */           double d7 = (arrayOfDouble[i2 + i5 + 1] - d3) * 0.125D;
/* 149 */           double d8 = (arrayOfDouble[i3 + i5 + 1] - d4) * 0.125D;
/* 150 */           double d9 = (arrayOfDouble[i4 + i5 + 1] - d5) * 0.125D;
/*     */           
/* 152 */           for (int i6 = 0; i6 < 8; i6++) {
/* 153 */             double d10 = 0.25D;
/*     */             
/* 155 */             double d11 = d2;
/* 156 */             double d12 = d3;
/* 157 */             double d13 = (d4 - d2) * 0.25D;
/* 158 */             double d14 = (d5 - d3) * 0.25D;
/*     */             
/* 160 */             for (int i7 = 0; i7 < 4; i7++) {
/* 161 */               double d15 = 0.25D;
/*     */               
/* 163 */               double d16 = d11;
/* 164 */               double d17 = (d12 - d11) * 0.25D;
/* 165 */               d16 -= d17;
/* 166 */               for (int i8 = 0; i8 < 4; i8++) {
/* 167 */                 a.c(j * 4 + i7, i5 * 8 + i6, n * 4 + i8);
/* 168 */                 if ((d16 += d17) > 0.0D) {
/* 169 */                   bmx1.a(a, this.q, false);
/* 170 */                 } else if (i5 * 8 + i6 < this.k.w()) {
/* 171 */                   bmx1.a(a, this.r, false);
/*     */                 } 
/*     */               } 
/* 174 */               d11 += d13;
/* 175 */               d12 += d14;
/*     */             } 
/*     */             
/* 178 */             d2 += d6;
/* 179 */             d3 += d7;
/* 180 */             d4 += d8;
/* 181 */             d5 += d9;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(ayu[] ☃, int i, int j, int k, double[] arrayOfDouble) {
/* 189 */     double[] arrayOfDouble1 = this.m.a(i, k, 5, 5, this.k.x(), this.k.y(), this.k.z());
/*     */     
/* 191 */     float f1 = this.k.A();
/* 192 */     float f2 = this.k.B();
/* 193 */     double[] arrayOfDouble2 = this.i.a(i, j, k, 5, 33, 5, (f1 / this.k.C()), (f2 / this.k.D()), (f1 / this.k.E()));
/* 194 */     double[] arrayOfDouble3 = this.g.a(i, j, k, 5, 33, 5, f1, f2, f1);
/* 195 */     double[] arrayOfDouble4 = this.h.a(i, j, k, 5, 33, 5, f1, f2, f1);
/*     */     
/* 197 */     int m = 0;
/* 198 */     int n = 0;
/*     */     
/* 200 */     for (int i1 = 0; i1 < 5; i1++) {
/* 201 */       for (int i2 = 0; i2 < 5; i2++) {
/* 202 */         float f3 = 0.0F;
/* 203 */         float f4 = 0.0F;
/* 204 */         float f5 = 0.0F;
/*     */         
/* 206 */         int i3 = 2;
/*     */ 
/*     */ 
/*     */         
/* 210 */         ayu ayu1 = ☃[i1 + 2 + (i2 + 2) * 10];
/* 211 */         for (int i4 = -2; i4 <= 2; i4++) {
/* 212 */           for (int i6 = -2; i6 <= 2; i6++) {
/* 213 */             ayu ayu2 = ☃[i1 + i4 + 2 + (i2 + i6 + 2) * 10];
/* 214 */             float f6 = this.k.F() + ayu2.h() * this.k.G();
/* 215 */             float f7 = this.k.H() + ayu2.l() * this.k.I();
/* 216 */             if (this.n == ayg.e && f6 > 0.0F) {
/* 217 */               f6 = 1.0F + f6 * 2.0F;
/* 218 */               f7 = 1.0F + f7 * 4.0F;
/*     */             } 
/* 220 */             float f8 = this.o[i4 + 2 + (i6 + 2) * 5] / (f6 + 2.0F);
/* 221 */             if (ayu2.h() > ayu1.h()) {
/* 222 */               f8 /= 2.0F;
/*     */             }
/* 224 */             f3 += f7 * f8;
/* 225 */             f4 += f6 * f8;
/* 226 */             f5 += f8;
/*     */           } 
/*     */         } 
/* 229 */         f3 /= f5;
/* 230 */         f4 /= f5;
/*     */         
/* 232 */         f3 = f3 * 0.9F + 0.1F;
/* 233 */         f4 = (f4 * 4.0F - 1.0F) / 8.0F;
/*     */         
/* 235 */         double d1 = arrayOfDouble1[n] / 8000.0D;
/* 236 */         if (d1 < 0.0D) {
/* 237 */           d1 = -d1 * 0.3D;
/*     */         }
/* 239 */         d1 = d1 * 3.0D - 2.0D;
/*     */         
/* 241 */         if (d1 < 0.0D) {
/* 242 */           d1 /= 2.0D;
/* 243 */           if (d1 < -1.0D) {
/* 244 */             d1 = -1.0D;
/*     */           }
/* 246 */           d1 /= 1.4D;
/* 247 */           d1 /= 2.0D;
/*     */         } else {
/* 249 */           if (d1 > 1.0D) {
/* 250 */             d1 = 1.0D;
/*     */           }
/* 252 */           d1 /= 8.0D;
/*     */         } 
/*     */         
/* 255 */         n++;
/*     */         
/* 257 */         double d2 = f4;
/* 258 */         double d3 = f3;
/* 259 */         d2 += d1 * 0.2D;
/* 260 */         d2 = d2 * this.k.J() / 8.0D;
/*     */         
/* 262 */         double d4 = this.k.J() + d2 * 4.0D;
/*     */         
/* 264 */         for (int i5 = 0; i5 < 33; i5++) {
/* 265 */           double d5 = (i5 - d4) * this.k.K() * 128.0D / 256.0D / d3;
/*     */           
/* 267 */           if (d5 < 0.0D) {
/* 268 */             d5 *= 4.0D;
/*     */           }
/*     */           
/* 271 */           double d6 = arrayOfDouble3[m] / this.k.L();
/* 272 */           double d7 = arrayOfDouble4[m] / this.k.M();
/*     */           
/* 274 */           double d8 = (arrayOfDouble2[m] / 10.0D + 1.0D) / 2.0D;
/* 275 */           double d9 = xq.b(d6, d7, d8) - d5;
/*     */ 
/*     */ 
/*     */           
/* 279 */           if (i5 > 29) {
/* 280 */             double d = ((i5 - 29) / 3.0F);
/* 281 */             d9 = d9 * (1.0D - d) - 10.0D * d;
/*     */           } 
/*     */           
/* 284 */           arrayOfDouble[m] = d9;
/* 285 */           m++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ayu.e> a(afc ☃, el el1) {
/* 293 */     ayu ayu = this.a.d(el1);
/*     */ 
/*     */     
/* 296 */     if (☃ == afc.a && ((btp)bqo.l).d(this.a, el1))
/* 297 */       return bqo.l.d(); 
/* 298 */     if (☃ == afc.a && bqo.n.b(this.a, el1)) {
/* 299 */       return bqo.n.d();
/*     */     }
/*     */     
/* 302 */     return ayu.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 307 */     int i = 0;
/* 308 */     i += this.p.a(☃, bool1, bool2);
/* 309 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public bou f() {
/* 314 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public double[] a(int ☃, int i) {
/* 319 */     double d = 0.03125D;
/* 320 */     return this.j.a((☃ << 4), (i << 4), 16, 16, 0.0625D, 0.0625D, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 325 */     return this.a.k() + 1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */