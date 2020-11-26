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
/*     */ public class bxd
/*     */   extends bwv
/*     */ {
/*     */   private boolean e;
/*     */   
/*     */   public static void b() {
/*  21 */     bwy.a((Class)bxd.class, "TeSH");
/*     */   }
/*     */ 
/*     */   
/*     */   public bxd() {}
/*     */ 
/*     */   
/*     */   public bxd(Random ☃, int i, int j) {
/*  29 */     super(☃, i, 64, j, 7, 7, 9);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  34 */     super.a(☃);
/*  35 */     ☃.a("Witch", this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/*  40 */     super.a(☃, bxm1);
/*  41 */     this.e = ☃.q("Witch");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  46 */     if (!a(☃, bwf1, 0)) {
/*  47 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  51 */     a(☃, bwf1, 1, 1, 1, 5, 1, 7, bct.o.p(), bct.o.p(), false);
/*  52 */     a(☃, bwf1, 1, 4, 2, 5, 4, 7, bct.o.p(), bct.o.p(), false);
/*  53 */     a(☃, bwf1, 2, 1, 0, 4, 1, 0, bct.o.p(), bct.o.p(), false);
/*     */ 
/*     */     
/*  56 */     a(☃, bwf1, 2, 2, 2, 3, 3, 2, bct.o.p(), bct.o.p(), false);
/*  57 */     a(☃, bwf1, 1, 2, 3, 1, 3, 6, bct.o.p(), bct.o.p(), false);
/*  58 */     a(☃, bwf1, 5, 2, 3, 5, 3, 6, bct.o.p(), bct.o.p(), false);
/*  59 */     a(☃, bwf1, 2, 2, 7, 4, 3, 7, bct.o.p(), bct.o.p(), false);
/*     */ 
/*     */     
/*  62 */     a(☃, bwf1, 1, 0, 2, 1, 3, 2, bct.J.p(), bct.J.p(), false);
/*  63 */     a(☃, bwf1, 5, 0, 2, 5, 3, 2, bct.J.p(), bct.J.p(), false);
/*  64 */     a(☃, bwf1, 1, 0, 7, 1, 3, 7, bct.J.p(), bct.J.p(), false);
/*  65 */     a(☃, bwf1, 5, 0, 7, 5, 3, 7, bct.J.p(), bct.J.p(), false);
/*     */ 
/*     */     
/*  68 */     a(☃, bct.cX.p(), 2, 3, 2, bwf1);
/*  69 */     a(☃, bct.cX.p(), 3, 3, 7, bwf1);
/*  70 */     a(☃, bct.a.p(), 1, 3, 4, bwf1);
/*  71 */     a(☃, bct.a.p(), 5, 3, 4, bwf1);
/*  72 */     a(☃, bct.a.p(), 5, 3, 5, bwf1);
/*  73 */     a(☃, bct.eO.p(), 1, 3, 5, bwf1);
/*     */ 
/*     */     
/*  76 */     a(☃, bct.co.p(), 3, 2, 6, bwf1);
/*  77 */     a(☃, bct.ed.p(), 4, 2, 6, bwf1);
/*     */ 
/*     */     
/*  80 */     a(☃, bct.cX.p(), 1, 2, 1, bwf1);
/*  81 */     a(☃, bct.cX.p(), 5, 2, 1, bwf1);
/*     */ 
/*     */     
/*  84 */     blc blc1 = bct.eq.p().a(bhx.a, eq.c);
/*  85 */     blc blc2 = bct.eq.p().a(bhx.a, eq.f);
/*  86 */     blc blc3 = bct.eq.p().a(bhx.a, eq.e);
/*  87 */     blc blc4 = bct.eq.p().a(bhx.a, eq.d);
/*     */     
/*  89 */     a(☃, bwf1, 0, 4, 1, 6, 4, 1, blc1, blc1, false);
/*  90 */     a(☃, bwf1, 0, 4, 2, 0, 4, 7, blc2, blc2, false);
/*  91 */     a(☃, bwf1, 6, 4, 2, 6, 4, 7, blc3, blc3, false);
/*  92 */     a(☃, bwf1, 0, 4, 8, 6, 4, 8, blc4, blc4, false);
/*  93 */     a(☃, blc1.a(bhx.c, bmq.e), 0, 4, 1, bwf1);
/*  94 */     a(☃, blc1.a(bhx.c, bmq.d), 6, 4, 1, bwf1);
/*  95 */     a(☃, blc4.a(bhx.c, bmq.d), 0, 4, 8, bwf1);
/*  96 */     a(☃, blc4.a(bhx.c, bmq.e), 6, 4, 8, bwf1);
/*     */     
/*     */     int i;
/*  99 */     for (i = 2; i <= 7; i += 5) {
/* 100 */       for (int m = 1; m <= 5; m += 4) {
/* 101 */         b(☃, bct.J.p(), m, -1, i, bwf1);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 106 */     i = a(2, 5);
/* 107 */     int j = d(2);
/* 108 */     int k = b(2, 5);
/*     */     
/* 110 */     if (!this.e && bwf1.b(new el(i, j, k))) {
/* 111 */       this.e = true;
/*     */       
/* 113 */       anu anu = new anu(☃.f());
/* 114 */       anu.di();
/* 115 */       anu.b(i + 0.5D, j, k + 0.5D, 0.0F, 0.0F);
/* 116 */       anu.a(☃.h(new el(i, j, k)), (afj)null, (gy)null);
/* 117 */       ☃.a(anu);
/*     */     } 
/*     */ 
/*     */     
/* 121 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */