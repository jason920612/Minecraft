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
/*     */ public abstract class brr<T extends bqp>
/*     */   extends bpa<T>
/*     */ {
/*     */   protected final int a;
/*     */   protected final blc b;
/*     */   protected final blc c;
/*     */   protected int d;
/*     */   
/*     */   public brr(boolean ☃, int i, int j, blc blc1, blc blc2) {
/*  23 */     super(☃);
/*  24 */     this.a = i;
/*  25 */     this.d = j;
/*     */     
/*  27 */     this.b = blc1;
/*  28 */     this.c = blc2;
/*     */   }
/*     */   
/*     */   protected int a(Random ☃) {
/*  32 */     int i = ☃.nextInt(3) + this.a;
/*  33 */     if (this.d > 1) {
/*  34 */       i += ☃.nextInt(this.d);
/*     */     }
/*  36 */     return i;
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1, int i) {
/*  40 */     boolean bool = true;
/*     */     
/*  42 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/*  43 */       return false;
/*     */     }
/*     */     
/*  46 */     for (int j = 0; j <= 1 + i; j++) {
/*  47 */       int k = 2;
/*  48 */       if (j == 0) {
/*  49 */         k = 1;
/*  50 */       } else if (j >= 1 + i - 2) {
/*  51 */         k = 2;
/*     */       } 
/*     */       
/*  54 */       for (int m = -k; m <= k && bool; m++) {
/*  55 */         for (int n = -k; n <= k && bool; n++) {
/*  56 */           if (el1.p() + j < 0 || el1.p() + j >= 256 || 
/*  57 */             !a(☃.a_(el1.a(m, j, n)).c()))
/*     */           {
/*     */ 
/*     */             
/*  61 */             bool = false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*  66 */     return bool;
/*     */   }
/*     */   
/*     */   private boolean b(axz ☃, el el1) {
/*  70 */     el el2 = el1.b();
/*  71 */     bcs bcs = ☃.a_(el2).c();
/*  72 */     if ((bcs != bct.i && !bcs.d(bcs)) || el1.p() < 2) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     a(☃, el2);
/*  77 */     a(☃, el2.f());
/*  78 */     a(☃, el2.d());
/*  79 */     a(☃, el2.d().f());
/*     */     
/*  81 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(axz ☃, el el1, int i) {
/*  85 */     return (a(☃, el1, i) && b(☃, el1));
/*     */   }
/*     */   
/*     */   protected void b(axz ☃, el el1, int i) {
/*  89 */     int j = i * i;
/*     */     
/*  91 */     for (int k = -i; k <= i + 1; k++) {
/*  92 */       for (int m = -i; m <= i + 1; m++) {
/*  93 */         int n = Math.min(Math.abs(k), Math.abs(k - 1));
/*  94 */         int i1 = Math.min(Math.abs(m), Math.abs(m - 1));
/*  95 */         if (n + i1 < 7)
/*     */         {
/*     */           
/*  98 */           if (n * n + i1 * i1 <= j) {
/*     */ 
/*     */ 
/*     */             
/* 102 */             el el2 = el1.a(k, 0, m);
/* 103 */             blc blc1 = ☃.a_(el2);
/* 104 */             if (blc1.f() || blc1.a(wv.A))
/* 105 */               a(☃, el2, this.c); 
/*     */           }  } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void c(axz ☃, el el1, int i) {
/* 112 */     int j = i * i;
/*     */     
/* 114 */     for (int k = -i; k <= i; k++) {
/* 115 */       for (int m = -i; m <= i; m++) {
/* 116 */         if (k * k + m * m <= j) {
/*     */ 
/*     */ 
/*     */           
/* 120 */           el el2 = el1.a(k, 0, m);
/* 121 */           blc blc1 = ☃.a_(el2);
/* 122 */           if (blc1.f() || blc1.a(wv.A))
/* 123 */             a(☃, el2, this.c); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\brr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */