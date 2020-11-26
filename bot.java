/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bot
/*     */   extends bmz<bos>
/*     */ {
/*  27 */   protected static final blc f = bct.a.p();
/*  28 */   protected static final blc g = bct.de.p();
/*  29 */   protected static final blc h = bct.C.p();
/*     */   
/*     */   private final byj i;
/*     */   
/*     */   private final byj j;
/*     */   
/*     */   private final byj k;
/*     */   private final byj l;
/*     */   private final byj m;
/*     */   private final byj n;
/*     */   private final bos o;
/*     */   private final blc p;
/*     */   private final blc q;
/*     */   
/*     */   public bot(axy ☃, ayw ayw1, bos bos1) {
/*  44 */     super(☃, ayw1);
/*  45 */     this.o = bos1;
/*     */     
/*  47 */     this.p = this.o.r();
/*  48 */     this.q = this.o.s();
/*     */     
/*  50 */     boz boz = new boz(this.b);
/*     */     
/*  52 */     this.i = new byj(boz, 16);
/*  53 */     this.j = new byj(boz, 16);
/*  54 */     this.k = new byj(boz, 8);
/*  55 */     boz.a(1048);
/*  56 */     this.l = new byj(boz, 4);
/*     */     
/*  58 */     this.m = new byj(boz, 10);
/*  59 */     this.n = new byj(boz, 16);
/*     */     
/*  61 */     ☃.b(63);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, bmx bmx1) {
/*  66 */     int j = 4;
/*  67 */     int k = this.a.k() / 2 + 1;
/*     */     
/*  69 */     int m = 5;
/*  70 */     int n = 17;
/*  71 */     int i1 = 5;
/*  72 */     double[] arrayOfDouble = a(☃ * 4, 0, i * 4, 5, 17, 5);
/*  73 */     el.a a = new el.a();
/*     */     
/*  75 */     for (int i2 = 0; i2 < 4; i2++) {
/*  76 */       for (int i3 = 0; i3 < 4; i3++) {
/*  77 */         for (int i4 = 0; i4 < 16; i4++) {
/*  78 */           double d1 = 0.125D;
/*  79 */           double d2 = arrayOfDouble[((i2 + 0) * 5 + i3 + 0) * 17 + i4 + 0];
/*  80 */           double d3 = arrayOfDouble[((i2 + 0) * 5 + i3 + 1) * 17 + i4 + 0];
/*  81 */           double d4 = arrayOfDouble[((i2 + 1) * 5 + i3 + 0) * 17 + i4 + 0];
/*  82 */           double d5 = arrayOfDouble[((i2 + 1) * 5 + i3 + 1) * 17 + i4 + 0];
/*     */           
/*  84 */           double d6 = (arrayOfDouble[((i2 + 0) * 5 + i3 + 0) * 17 + i4 + 1] - d2) * 0.125D;
/*  85 */           double d7 = (arrayOfDouble[((i2 + 0) * 5 + i3 + 1) * 17 + i4 + 1] - d3) * 0.125D;
/*  86 */           double d8 = (arrayOfDouble[((i2 + 1) * 5 + i3 + 0) * 17 + i4 + 1] - d4) * 0.125D;
/*  87 */           double d9 = (arrayOfDouble[((i2 + 1) * 5 + i3 + 1) * 17 + i4 + 1] - d5) * 0.125D;
/*     */           
/*  89 */           for (int i5 = 0; i5 < 8; i5++) {
/*  90 */             double d10 = 0.25D;
/*     */             
/*  92 */             double d11 = d2;
/*  93 */             double d12 = d3;
/*  94 */             double d13 = (d4 - d2) * 0.25D;
/*  95 */             double d14 = (d5 - d3) * 0.25D;
/*     */             
/*  97 */             for (int i6 = 0; i6 < 4; i6++) {
/*  98 */               double d15 = 0.25D;
/*     */               
/* 100 */               double d16 = d11;
/* 101 */               double d17 = (d12 - d11) * 0.25D;
/* 102 */               for (int i7 = 0; i7 < 4; i7++) {
/* 103 */                 blc blc1 = f;
/* 104 */                 if (i4 * 8 + i5 < k) {
/* 105 */                   blc1 = this.q;
/*     */                 }
/* 107 */                 if (d16 > 0.0D) {
/* 108 */                   blc1 = this.p;
/*     */                 }
/*     */                 
/* 111 */                 int i8 = i6 + i2 * 4;
/* 112 */                 int i9 = i5 + i4 * 8;
/* 113 */                 int i10 = i7 + i3 * 4;
/* 114 */                 bmx1.a(a.c(i8, i9, i10), blc1, false);
/* 115 */                 d16 += d17;
/*     */               } 
/* 117 */               d11 += d13;
/* 118 */               d12 += d14;
/*     */             } 
/*     */             
/* 121 */             d2 += d6;
/* 122 */             d3 += d7;
/* 123 */             d4 += d8;
/* 124 */             d5 += d9;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bmx ☃, Random random) {
/* 133 */     el.a a = new el.a();
/* 134 */     int i = ☃.d().d();
/* 135 */     int j = ☃.d().e();
/*     */     
/* 137 */     for (el el : el.a(i, 0, j, i + 16, 0, j + 16)) {
/* 138 */       int k; for (k = 127; k > 122; k--) {
/* 139 */         if (k >= 127 - random.nextInt(5)) {
/* 140 */           ☃.a(a.c(el.o(), k, el.q()), bct.z.p(), false);
/*     */         }
/*     */       } 
/*     */       
/* 144 */       for (k = 4; k >= 0; k--) {
/* 145 */         if (k <= random.nextInt(5)) {
/* 146 */           ☃.a(a.c(el.o(), k, el.q()), bct.z.p(), false);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public double[] a(int ☃, int i) {
/* 154 */     double d = 0.03125D;
/* 155 */     return this.l.a(☃ << 4, i << 4, 0, 16, 16, 1, 0.0625D, 0.0625D, 0.0625D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmx ☃) {
/* 160 */     axm axm = ☃.d();
/* 161 */     int i = axm.a;
/* 162 */     int j = axm.b;
/* 163 */     boz boz = new boz();
/* 164 */     boz.a(i, j);
/*     */     
/* 166 */     ayu[] arrayOfAyu = this.c.b(i * 16, j * 16, 16, 16);
/* 167 */     ☃.a(arrayOfAyu);
/*     */     
/* 169 */     a(i, j, ☃);
/* 170 */     a(☃, arrayOfAyu, boz, this.a.k());
/* 171 */     a(☃, boz);
/*     */     
/* 173 */     ☃.a(new bor.a[] { bor.a.a, bor.a.b });
/* 174 */     ☃.a(bnd.b);
/*     */   }
/*     */   
/*     */   private double[] a(int ☃, int i, int j, int k, int m, int n) {
/* 178 */     double[] arrayOfDouble1 = new double[k * m * n];
/*     */     
/* 180 */     double d1 = 684.412D;
/* 181 */     double d2 = 2053.236D;
/*     */     
/* 183 */     double[] arrayOfDouble2 = this.m.a(☃, i, j, k, 1, n, 1.0D, 0.0D, 1.0D);
/* 184 */     double[] arrayOfDouble3 = this.n.a(☃, i, j, k, 1, n, 100.0D, 0.0D, 100.0D);
/*     */     
/* 186 */     double[] arrayOfDouble4 = this.k.a(☃, i, j, k, m, n, 8.555150000000001D, 34.2206D, 8.555150000000001D);
/* 187 */     double[] arrayOfDouble5 = this.i.a(☃, i, j, k, m, n, 684.412D, 2053.236D, 684.412D);
/* 188 */     double[] arrayOfDouble6 = this.j.a(☃, i, j, k, m, n, 684.412D, 2053.236D, 684.412D);
/*     */     
/* 190 */     double[] arrayOfDouble7 = new double[m]; int i1;
/* 191 */     for (i1 = 0; i1 < m; i1++) {
/* 192 */       arrayOfDouble7[i1] = Math.cos(i1 * Math.PI * 6.0D / m) * 2.0D;
/*     */       
/* 194 */       double d = i1;
/* 195 */       if (i1 > m / 2) {
/* 196 */         d = (m - 1 - i1);
/*     */       }
/* 198 */       if (d < 4.0D) {
/* 199 */         d = 4.0D - d;
/* 200 */         arrayOfDouble7[i1] = arrayOfDouble7[i1] - d * d * d * 10.0D;
/*     */       } 
/*     */     } 
/*     */     
/* 204 */     i1 = 0;
/* 205 */     for (int i2 = 0; i2 < k; i2++) {
/* 206 */       for (int i3 = 0; i3 < n; i3++) {
/* 207 */         double d = 0.0D;
/*     */         
/* 209 */         for (int i4 = 0; i4 < m; i4++) {
/* 210 */           double d7, d3 = arrayOfDouble7[i4];
/* 211 */           double d4 = arrayOfDouble5[i1] / 512.0D;
/* 212 */           double d5 = arrayOfDouble6[i1] / 512.0D;
/* 213 */           double d6 = (arrayOfDouble4[i1] / 10.0D + 1.0D) / 2.0D;
/*     */ 
/*     */           
/* 216 */           if (d6 < 0.0D) {
/* 217 */             d7 = d4;
/* 218 */           } else if (d6 > 1.0D) {
/* 219 */             d7 = d5;
/*     */           } else {
/* 221 */             d7 = d4 + (d5 - d4) * d6;
/*     */           } 
/*     */           
/* 224 */           d7 -= d3;
/*     */           
/* 226 */           if (i4 > m - 4) {
/* 227 */             double d8 = ((i4 - m - 4) / 3.0F);
/* 228 */             d7 = d7 * (1.0D - d8) - 10.0D * d8;
/*     */           } 
/*     */           
/* 231 */           if (i4 < 0.0D) {
/* 232 */             double d8 = (0.0D - i4) / 4.0D;
/* 233 */             d8 = xq.a(d8, 0.0D, 1.0D);
/* 234 */             d7 = d7 * (1.0D - d8) - 10.0D * d8;
/*     */           } 
/*     */           
/* 237 */           arrayOfDouble1[i1] = d7;
/* 238 */           i1++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 243 */     return arrayOfDouble1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ti ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ayu.e> a(afc ☃, el el1) {
/* 253 */     if (☃ == afc.a) {
/* 254 */       if (bqo.p.c(this.a, el1)) {
/* 255 */         return bqo.p.d();
/*     */       }
/* 257 */       if (bqo.p.b(this.a, el1) && this.a.a_(el1.b()).c() == bct.dX) {
/* 258 */         return bqo.p.d();
/*     */       }
/*     */     } 
/*     */     
/* 262 */     ayu ayu = this.a.d(el1);
/* 263 */     return ayu.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 268 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos f() {
/* 273 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 278 */     return this.a.k() + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/* 283 */     return 128;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */