/*     */ import java.util.Arrays;
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
/*     */ public class bxy
/*     */   implements byc<byd>
/*     */ {
/*  18 */   private static final blc f = bct.fE.p();
/*  19 */   private static final blc g = bct.fF.p();
/*  20 */   private static final blc h = bct.gn.p();
/*  21 */   private static final blc i = bct.fI.p();
/*  22 */   private static final blc j = bct.fQ.p();
/*  23 */   private static final blc k = bct.fS.p();
/*  24 */   private static final blc l = bct.fM.p();
/*     */   
/*     */   protected blc[] a;
/*     */   
/*     */   protected long b;
/*     */   protected byk c;
/*     */   protected byk d;
/*     */   protected byk e;
/*     */   
/*     */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/*  34 */     int n = i & 0xF;
/*  35 */     int i1 = j & 0xF;
/*     */     
/*  37 */     blc blc3 = f;
/*  38 */     blc blc4 = ayu1.r().b();
/*     */     
/*  40 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*  41 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/*  42 */     int i3 = -1;
/*  43 */     boolean bool2 = false;
/*  44 */     int i4 = 0;
/*     */     
/*  46 */     el.a a = new el.a();
/*     */     
/*  48 */     for (int i5 = k; i5 >= 0; i5--) {
/*  49 */       if (i4 < 15) {
/*  50 */         a.c(n, i5, i1);
/*  51 */         blc blc5 = bmx1.a_(a);
/*     */         
/*  53 */         if (blc5.f()) {
/*  54 */           i3 = -1;
/*  55 */         } else if (blc5.c() == blc1.c()) {
/*  56 */           if (i3 == -1) {
/*  57 */             bool2 = false;
/*  58 */             if (i2 <= 0) {
/*  59 */               blc3 = bct.a.p();
/*  60 */               blc4 = blc1;
/*  61 */             } else if (i5 >= m - 4 && i5 <= m + 1) {
/*  62 */               blc3 = f;
/*  63 */               blc4 = ayu1.r().b();
/*     */             } 
/*     */             
/*  66 */             if (i5 < m && (blc3 == null || blc3.f())) {
/*  67 */               blc3 = blc2;
/*     */             }
/*     */             
/*  70 */             i3 = i2 + Math.max(0, i5 - m);
/*  71 */             if (i5 >= m - 1) {
/*  72 */               if (i5 > m + 3 + i2) {
/*     */                 blc blc6;
/*  74 */                 if (i5 < 64 || i5 > 127) {
/*  75 */                   blc6 = g;
/*  76 */                 } else if (bool1) {
/*  77 */                   blc6 = h;
/*     */                 } else {
/*  79 */                   blc6 = a(i, i5, j);
/*     */                 } 
/*  81 */                 bmx1.a(a, blc6, false);
/*     */               } else {
/*  83 */                 bmx1.a(a, ayu1.r().a(), false);
/*  84 */                 bool2 = true;
/*     */               } 
/*     */             } else {
/*  87 */               bmx1.a(a, blc4, false);
/*  88 */               bcs bcs = blc4.c();
/*  89 */               if (bcs == bct.fE || bcs == bct.fF || bcs == bct.fG || bcs == bct.fH || bcs == bct.fI || bcs == bct.fJ || bcs == bct.fK || bcs == bct.fL || bcs == bct.fM || bcs == bct.fN || bcs == bct.fO || bcs == bct.fP || bcs == bct.fQ || bcs == bct.fR || bcs == bct.fS || bcs == bct.fT)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 106 */                 bmx1.a(a, g, false);
/*     */               }
/*     */             } 
/* 109 */           } else if (i3 > 0) {
/* 110 */             i3--;
/*     */             
/* 112 */             if (bool2) {
/* 113 */               bmx1.a(a, g, false);
/*     */             } else {
/* 115 */               bmx1.a(a, a(i, i5, j), false);
/*     */             } 
/*     */           } 
/* 118 */           i4++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 127 */     if (this.b != ☃ || this.a == null) {
/* 128 */       b(☃);
/*     */     }
/* 130 */     if (this.b != ☃ || this.c == null || this.d == null) {
/* 131 */       Random random = new boz(☃);
/* 132 */       this.c = new byk(random, 4);
/* 133 */       this.d = new byk(random, 1);
/*     */     } 
/* 135 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(long ☃) {
/* 140 */     this.a = new blc[64];
/* 141 */     Arrays.fill((Object[])this.a, h);
/*     */     
/* 143 */     Random random = new boz(☃);
/* 144 */     this.e = new byk(random, 1);
/*     */     int i;
/* 146 */     for (i = 0; i < 64; i++) {
/* 147 */       i += random.nextInt(5) + 1;
/* 148 */       if (i < 64) {
/* 149 */         this.a[i] = g;
/*     */       }
/*     */     } 
/*     */     
/* 153 */     i = random.nextInt(4) + 2; int j;
/* 154 */     for (j = 0; j < i; j++) {
/* 155 */       int i2 = random.nextInt(3) + 1;
/* 156 */       int i3 = random.nextInt(64);
/*     */       
/* 158 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 159 */         this.a[i3 + i4] = i;
/*     */       }
/*     */     } 
/* 162 */     j = random.nextInt(4) + 2; int k;
/* 163 */     for (k = 0; k < j; k++) {
/* 164 */       int i2 = random.nextInt(3) + 2;
/* 165 */       int i3 = random.nextInt(64);
/*     */       
/* 167 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 168 */         this.a[i3 + i4] = j;
/*     */       }
/*     */     } 
/* 171 */     k = random.nextInt(4) + 2; int m;
/* 172 */     for (m = 0; m < k; m++) {
/* 173 */       int i2 = random.nextInt(3) + 1;
/* 174 */       int i3 = random.nextInt(64);
/*     */       
/* 176 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 177 */         this.a[i3 + i4] = k;
/*     */       }
/*     */     } 
/* 180 */     m = random.nextInt(3) + 3;
/* 181 */     int n = 0;
/* 182 */     for (int i1 = 0; i1 < m; i1++) {
/* 183 */       int i2 = 1;
/* 184 */       n += random.nextInt(16) + 4;
/*     */       
/* 186 */       for (int i3 = 0; n + i3 < 64 && i3 < 1; i3++) {
/* 187 */         this.a[n + i3] = f;
/* 188 */         if (n + i3 > 1 && random.nextBoolean()) {
/* 189 */           this.a[n + i3 - 1] = l;
/*     */         }
/* 191 */         if (n + i3 < 63 && random.nextBoolean()) {
/* 192 */           this.a[n + i3 + 1] = l;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected blc a(int ☃, int i, int j) {
/* 199 */     int k = (int)Math.round(this.e.a(☃ / 512.0D, j / 512.0D) * 2.0D);
/* 200 */     return this.a[(i + k + 64) % 64];
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */