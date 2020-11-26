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
/*     */ public class boy
/*     */   extends bmz<box>
/*     */ {
/*  27 */   protected static final blc f = bct.a.p();
/*     */   
/*     */   private final byj g;
/*     */   
/*     */   private final byj h;
/*     */   
/*     */   private final byj i;
/*     */   
/*     */   private final byj j;
/*     */   private final byj k;
/*     */   private final byk l;
/*     */   private final el m;
/*     */   private final box n;
/*     */   private final blc o;
/*     */   private final blc p;
/*     */   
/*     */   public boy(axz ☃, ayw ayw1, box box1) {
/*  44 */     super(☃, ayw1);
/*  45 */     this.n = box1;
/*  46 */     this.o = this.n.r();
/*  47 */     this.p = this.n.s();
/*     */     
/*  49 */     this.m = box1.t();
/*     */     
/*  51 */     boz boz = new boz(this.b);
/*  52 */     this.g = new byj(boz, 16);
/*  53 */     this.h = new byj(boz, 16);
/*  54 */     this.i = new byj(boz, 8);
/*     */     
/*  56 */     this.j = new byj(boz, 10);
/*  57 */     this.k = new byj(boz, 16);
/*     */ 
/*     */     
/*  60 */     boz.a(262);
/*     */ 
/*     */     
/*  63 */     this.l = new byk(new boz(this.b), 4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, bmx bmx1) {
/*  68 */     int j = 2;
/*     */     
/*  70 */     int k = 3;
/*  71 */     int m = 33;
/*  72 */     int n = 3;
/*  73 */     double[] arrayOfDouble = a(☃ * 2, 0, i * 2, 3, 33, 3);
/*  74 */     el.a a = new el.a();
/*     */     
/*  76 */     for (int i1 = 0; i1 < 2; i1++) {
/*  77 */       for (int i2 = 0; i2 < 2; i2++) {
/*  78 */         for (int i3 = 0; i3 < 32; i3++) {
/*  79 */           double d1 = 0.25D;
/*  80 */           double d2 = arrayOfDouble[((i1 + 0) * 3 + i2 + 0) * 33 + i3 + 0];
/*  81 */           double d3 = arrayOfDouble[((i1 + 0) * 3 + i2 + 1) * 33 + i3 + 0];
/*  82 */           double d4 = arrayOfDouble[((i1 + 1) * 3 + i2 + 0) * 33 + i3 + 0];
/*  83 */           double d5 = arrayOfDouble[((i1 + 1) * 3 + i2 + 1) * 33 + i3 + 0];
/*     */           
/*  85 */           double d6 = (arrayOfDouble[((i1 + 0) * 3 + i2 + 0) * 33 + i3 + 1] - d2) * 0.25D;
/*  86 */           double d7 = (arrayOfDouble[((i1 + 0) * 3 + i2 + 1) * 33 + i3 + 1] - d3) * 0.25D;
/*  87 */           double d8 = (arrayOfDouble[((i1 + 1) * 3 + i2 + 0) * 33 + i3 + 1] - d4) * 0.25D;
/*  88 */           double d9 = (arrayOfDouble[((i1 + 1) * 3 + i2 + 1) * 33 + i3 + 1] - d5) * 0.25D;
/*     */           
/*  90 */           for (int i4 = 0; i4 < 4; i4++) {
/*  91 */             double d10 = 0.125D;
/*     */             
/*  93 */             double d11 = d2;
/*  94 */             double d12 = d3;
/*  95 */             double d13 = (d4 - d2) * 0.125D;
/*  96 */             double d14 = (d5 - d3) * 0.125D;
/*     */             
/*  98 */             for (int i5 = 0; i5 < 8; i5++) {
/*  99 */               double d15 = 0.125D;
/*     */               
/* 101 */               double d16 = d11;
/* 102 */               double d17 = (d12 - d11) * 0.125D;
/* 103 */               for (int i6 = 0; i6 < 8; i6++) {
/* 104 */                 blc blc1 = f;
/* 105 */                 if (d16 > 0.0D) {
/* 106 */                   blc1 = this.o;
/*     */                 }
/*     */                 
/* 109 */                 int i7 = i5 + i1 * 8;
/* 110 */                 int i8 = i4 + i3 * 4;
/* 111 */                 int i9 = i6 + i2 * 8;
/* 112 */                 bmx1.a(a.c(i7, i8, i9), blc1, false);
/* 113 */                 d16 += d17;
/*     */               } 
/* 115 */               d11 += d13;
/* 116 */               d12 += d14;
/*     */             } 
/*     */             
/* 119 */             d2 += d6;
/* 120 */             d3 += d7;
/* 121 */             d4 += d8;
/* 122 */             d5 += d9;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmx ☃) {
/* 131 */     axm axm = ☃.d();
/* 132 */     int i = axm.a;
/* 133 */     int j = axm.b;
/*     */     
/* 135 */     boz boz = new boz();
/* 136 */     boz.a(i, j);
/*     */     
/* 138 */     ayu[] arrayOfAyu = this.c.b(i * 16, j * 16, 16, 16);
/* 139 */     ☃.a(arrayOfAyu);
/*     */     
/* 141 */     a(i, j, ☃);
/* 142 */     a(☃, arrayOfAyu, boz, 0);
/*     */     
/* 144 */     ☃.a(new bor.a[] { bor.a.a, bor.a.b });
/* 145 */     ☃.a(bnd.b);
/*     */   }
/*     */   
/*     */   private double[] a(int ☃, int i, int j, int k, int m, int n) {
/* 149 */     double[] arrayOfDouble1 = new double[k * m * n];
/*     */     
/* 151 */     double d1 = 684.412D;
/* 152 */     double d2 = 684.412D;
/* 153 */     d1 *= 2.0D;
/*     */     
/* 155 */     double[] arrayOfDouble2 = this.i.a(☃, i, j, k, m, n, d1 / 80.0D, 4.277575000000001D, d1 / 80.0D);
/* 156 */     double[] arrayOfDouble3 = this.g.a(☃, i, j, k, m, n, d1, 684.412D, d1);
/* 157 */     double[] arrayOfDouble4 = this.h.a(☃, i, j, k, m, n, d1, 684.412D, d1);
/*     */     
/* 159 */     int i1 = ☃ / 2;
/* 160 */     int i2 = j / 2;
/*     */     
/* 162 */     int i3 = 0;
/*     */     
/* 164 */     for (int i4 = 0; i4 < k; i4++) {
/* 165 */       for (int i5 = 0; i5 < n; i5++) {
/* 166 */         float f = this.c.c(i1, i2, i4, i5);
/*     */         
/* 168 */         for (int i6 = 0; i6 < m; i6++) {
/* 169 */           double d5, d3 = arrayOfDouble3[i3] / 512.0D;
/* 170 */           double d4 = arrayOfDouble4[i3] / 512.0D;
/*     */ 
/*     */           
/* 173 */           double d6 = (arrayOfDouble2[i3] / 10.0D + 1.0D) / 2.0D;
/* 174 */           if (d6 < 0.0D) {
/* 175 */             d5 = d3;
/* 176 */           } else if (d6 > 1.0D) {
/* 177 */             d5 = d4;
/*     */           } else {
/* 179 */             d5 = d3 + (d4 - d3) * d6;
/*     */           } 
/* 181 */           d5 -= 8.0D;
/*     */           
/* 183 */           d5 += f;
/*     */           
/* 185 */           int i7 = 2;
/* 186 */           if (i6 > m / 2 - i7) {
/* 187 */             double d = ((i6 - m / 2 - i7) / 64.0F);
/* 188 */             d = xq.a(d, 0.0D, 1.0D);
/* 189 */             d5 = d5 * (1.0D - d) - 3000.0D * d;
/*     */           } 
/* 191 */           i7 = 8;
/* 192 */           if (i6 < i7) {
/* 193 */             double d = ((i7 - i6) / (i7 - 1.0F));
/* 194 */             d5 = d5 * (1.0D - d) - 30.0D * d;
/*     */           } 
/*     */           
/* 197 */           arrayOfDouble1[i3] = d5;
/* 198 */           i3++;
/*     */         } 
/*     */       } 
/*     */     } 
/* 202 */     return arrayOfDouble1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ti ☃) {}
/*     */ 
/*     */   
/*     */   public List<ayu.e> a(afc ☃, el el1) {
/* 211 */     return this.a.d(el1).a(☃);
/*     */   }
/*     */   
/*     */   public el f() {
/* 215 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 220 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public box g() {
/* 225 */     return this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public double[] a(int ☃, int i) {
/* 230 */     double d = 0.03125D;
/* 231 */     return this.l.a((☃ << 4), (i << 4), 16, 16, 0.0625D, 0.0625D, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 236 */     return 50;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\boy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */