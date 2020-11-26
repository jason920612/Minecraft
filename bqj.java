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
/*     */ public class bqj
/*     */   extends btl<bqi>
/*     */ {
/*     */   protected axm a(bmy<?> ☃, Random random, int i, int j, int k, int m) {
/*  24 */     int n = ☃.a().n();
/*  25 */     int i1 = ☃.a().o();
/*     */     
/*  27 */     int i2 = i + n * k;
/*  28 */     int i3 = j + n * m;
/*     */     
/*  30 */     int i4 = (i2 < 0) ? (i2 - n + 1) : i2;
/*  31 */     int i5 = (i3 < 0) ? (i3 - n + 1) : i3;
/*     */     
/*  33 */     int i6 = i4 / n;
/*  34 */     int i7 = i5 / n;
/*     */     
/*  36 */     ((boz)random).a(☃.c(), i6, i7, 10387313);
/*     */     
/*  38 */     i6 *= n;
/*  39 */     i7 *= n;
/*  40 */     i6 += (random.nextInt(n - i1) + random.nextInt(n - i1)) / 2;
/*  41 */     i7 += (random.nextInt(n - i1) + random.nextInt(n - i1)) / 2;
/*     */     
/*  43 */     return new axm(i6, i7);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bmy<?> ☃, Random random, int i, int j) {
/*  48 */     axm axm = a(☃, random, i, j, 0, 0);
/*     */     
/*  50 */     if (i == axm.a && j == axm.b) {
/*  51 */       ayu ayu = ☃.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  52 */       if (!☃.a(ayu, (btl)bqo.q)) {
/*  53 */         return false;
/*     */       }
/*     */       
/*  56 */       int k = b(i, j, ☃);
/*     */       
/*  58 */       if (k < 60) {
/*  59 */         return false;
/*     */       }
/*     */       
/*  62 */       return true;
/*     */     } 
/*     */     
/*  65 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(axz ☃) {
/*  70 */     return ☃.g().r();
/*     */   }
/*     */ 
/*     */   
/*     */   protected bxc a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j) {
/*  75 */     ayu ayu = bmy1.b().a(new el((i << 4) + 9, 0, (j << 4) + 9), ayz.b);
/*  76 */     return new a(☃, bmy1, boz1, i, j, ayu);
/*     */   }
/*     */ 
/*     */   
/*     */   protected String a() {
/*  81 */     return "EndCity";
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  86 */     return 9;
/*     */   }
/*     */   
/*     */   private static int b(int ☃, int i, bmy<?> bmy1) {
/*  90 */     Random random = new Random((☃ + i * 10387313));
/*  91 */     bhb bhb = bhb.values()[random.nextInt((bhb.values()).length)];
/*  92 */     bnr bnr = new bnr(new axm(☃, i), bnt.a);
/*  93 */     bmy1.a(bnr);
/*     */     
/*  95 */     int j = 5;
/*  96 */     int k = 5;
/*  97 */     if (bhb == bhb.b) {
/*  98 */       j = -5;
/*  99 */     } else if (bhb == bhb.c) {
/* 100 */       j = -5;
/* 101 */       k = -5;
/* 102 */     } else if (bhb == bhb.d) {
/* 103 */       k = -5;
/*     */     } 
/*     */     
/* 106 */     int m = bnr.a(bor.a.d, 7, 7);
/* 107 */     int n = bnr.a(bor.a.d, 7, 7 + k);
/* 108 */     int i1 = bnr.a(bor.a.d, 7 + j, 7);
/* 109 */     int i2 = bnr.a(bor.a.d, 7 + j, 7 + k);
/*     */     
/* 111 */     return Math.min(Math.min(m, n), Math.min(i1, i2));
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends bxc
/*     */   {
/*     */     private boolean e;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 122 */       super(i, j, ayu1, boz1, ☃.r_());
/*     */       
/* 124 */       bhb bhb = bhb.values()[boz1.nextInt((bhb.values()).length)];
/*     */       
/* 126 */       int k = bqj.a(i, j, bmy1);
/*     */       
/* 128 */       if (k < 60) {
/* 129 */         this.e = false;
/*     */         
/*     */         return;
/*     */       } 
/* 133 */       el el = new el(i * 16 + 8, k, j * 16 + 8);
/* 134 */       bwl.a(☃.s_().h(), el, bhb, this.a, boz1);
/*     */       
/* 136 */       a(☃);
/*     */       
/* 138 */       this.e = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 143 */       return this.e;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */