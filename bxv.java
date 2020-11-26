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
/*     */ public class bxv
/*     */   implements byc<byd>
/*     */ {
/*  16 */   protected static final blc a = bct.gp.p();
/*  17 */   protected static final blc b = bct.cS.p();
/*  18 */   private static final blc c = bct.a.p();
/*  19 */   private static final blc d = bct.F.p();
/*  20 */   private static final blc e = bct.cR.p();
/*     */   
/*     */   private byk f;
/*     */   
/*     */   private byk g;
/*     */   private long h;
/*     */   
/*     */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/*  28 */     double d1 = 0.0D;
/*  29 */     double d2 = 0.0D;
/*  30 */     el.a a = new el.a();
/*  31 */     float f = ayu1.c(a.c(i, 63, j));
/*     */     
/*  33 */     double d3 = Math.min(Math.abs(d), this.f.a(i * 0.1D, j * 0.1D));
/*     */     
/*  35 */     if (d3 > 1.8D) {
/*  36 */       double d4 = 0.09765625D;
/*  37 */       double d5 = Math.abs(this.g.a(i * 0.09765625D, j * 0.09765625D));
/*  38 */       d1 = d3 * d3 * 1.2D;
/*  39 */       double d6 = Math.ceil(d5 * 40.0D) + 14.0D;
/*  40 */       if (d1 > d6) {
/*  41 */         d1 = d6;
/*     */       }
/*     */       
/*  44 */       if (f > 0.1F) {
/*  45 */         d1 -= 2.0D;
/*     */       }
/*     */       
/*  48 */       if (d1 > 2.0D) {
/*  49 */         d2 = m - d1 - 7.0D;
/*  50 */         d1 += m;
/*     */       } else {
/*  52 */         d1 = 0.0D;
/*     */       } 
/*     */     } 
/*     */     
/*  56 */     int n = i & 0xF;
/*  57 */     int i1 = j & 0xF;
/*     */     
/*  59 */     blc blc3 = ayu1.r().b();
/*  60 */     blc blc4 = ayu1.r().a();
/*     */     
/*  62 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*  63 */     int i3 = -1;
/*  64 */     int i4 = 0;
/*  65 */     int i5 = 2 + ☃.nextInt(4);
/*  66 */     int i6 = m + 18 + ☃.nextInt(10);
/*     */     
/*  68 */     for (int i7 = Math.max(k, (int)d1 + 1); i7 >= 0; i7--) {
/*  69 */       a.c(n, i7, i1);
/*     */       
/*  71 */       if (bmx1.a_(a).f() && i7 < (int)d1 && ☃.nextDouble() > 0.01D) {
/*  72 */         bmx1.a(a, a, false);
/*  73 */       } else if (bmx1.a_(a).d() == bza.i && i7 > (int)d2 && i7 < m && d2 != 0.0D && ☃.nextDouble() > 0.15D) {
/*  74 */         bmx1.a(a, a, false);
/*     */       } 
/*     */       
/*  77 */       blc blc5 = bmx1.a_(a);
/*  78 */       if (blc5.f()) {
/*  79 */         i3 = -1;
/*     */ 
/*     */       
/*     */       }
/*  83 */       else if (blc5.c() == blc1.c()) {
/*  84 */         if (i3 == -1) {
/*  85 */           if (i2 <= 0) {
/*  86 */             blc4 = c;
/*  87 */             blc3 = blc1;
/*  88 */           } else if (i7 >= m - 4 && i7 <= m + 1) {
/*  89 */             blc4 = ayu1.r().a();
/*  90 */             blc3 = ayu1.r().b();
/*     */           } 
/*     */           
/*  93 */           if (i7 < m && (blc4 == null || blc4.f())) {
/*  94 */             if (ayu1.c(a.c(i, i7, j)) < 0.15F) {
/*  95 */               blc4 = e;
/*     */             } else {
/*  97 */               blc4 = blc2;
/*     */             } 
/*     */           }
/*     */           
/* 101 */           i3 = i2;
/* 102 */           if (i7 >= m - 1) {
/* 103 */             bmx1.a(a, blc4, false);
/* 104 */           } else if (i7 < m - 7 - i2) {
/* 105 */             blc4 = c;
/* 106 */             blc3 = blc1;
/* 107 */             bmx1.a(a, d, false);
/*     */           } else {
/* 109 */             bmx1.a(a, blc3, false);
/*     */           } 
/* 111 */         } else if (i3 > 0) {
/* 112 */           i3--;
/* 113 */           bmx1.a(a, blc3, false);
/* 114 */           if (i3 == 0 && blc3.c() == bct.D && i2 > 1) {
/* 115 */             i3 = ☃.nextInt(4) + Math.max(0, i7 - 63);
/* 116 */             blc3 = (blc3.c() == bct.E) ? bct.hT.p() : bct.at.p();
/*     */           } 
/*     */         } 
/* 119 */       } else if (blc5.c() == bct.gp && 
/* 120 */         i4 <= i5 && i7 > i6) {
/* 121 */         bmx1.a(a, b, false);
/* 122 */         i4++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 130 */     if (this.h != ☃ || this.f == null || this.g == null) {
/* 131 */       Random random = new boz(☃);
/* 132 */       this.f = new byk(random, 4);
/* 133 */       this.g = new byk(random, 1);
/*     */     } 
/* 135 */     this.h = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */