/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bxw
/*     */   extends bxy
/*     */ {
/*  13 */   private static final blc f = bct.fE.p();
/*  14 */   private static final blc g = bct.fF.p();
/*  15 */   private static final blc h = bct.gn.p();
/*     */ 
/*     */   
/*     */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/*  19 */     double d1 = 0.0D;
/*     */     
/*  21 */     double d2 = Math.min(Math.abs(d), this.c.a(i * 0.25D, j * 0.25D));
/*  22 */     if (d2 > 0.0D) {
/*  23 */       double d3 = 0.001953125D;
/*  24 */       double d4 = Math.abs(this.d.a(i * 0.001953125D, j * 0.001953125D));
/*  25 */       d1 = d2 * d2 * 2.5D;
/*  26 */       double d5 = Math.ceil(d4 * 50.0D) + 14.0D;
/*  27 */       if (d1 > d5) {
/*  28 */         d1 = d5;
/*     */       }
/*  30 */       d1 += 64.0D;
/*     */     } 
/*     */     
/*  33 */     int n = i & 0xF;
/*  34 */     int i1 = j & 0xF;
/*     */     
/*  36 */     blc blc3 = f;
/*  37 */     blc blc4 = ayu1.r().b();
/*     */     
/*  39 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*  40 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/*  41 */     int i3 = -1;
/*  42 */     boolean bool2 = false;
/*     */     
/*  44 */     el.a a = new el.a();
/*     */     
/*  46 */     for (int i4 = Math.max(k, (int)d1 + 1); i4 >= 0; i4--) {
/*  47 */       a.c(n, i4, i1);
/*  48 */       if (bmx1.a_(a).f() && i4 < (int)d1) {
/*  49 */         bmx1.a(a, blc1, false);
/*     */       }
/*     */       
/*  52 */       blc blc5 = bmx1.a_(a);
/*     */       
/*  54 */       if (blc5.f()) {
/*  55 */         i3 = -1;
/*  56 */       } else if (blc5.c() == blc1.c()) {
/*  57 */         if (i3 == -1) {
/*  58 */           bool2 = false;
/*  59 */           if (i2 <= 0) {
/*  60 */             blc3 = bct.a.p();
/*  61 */             blc4 = blc1;
/*  62 */           } else if (i4 >= m - 4 && i4 <= m + 1) {
/*  63 */             blc3 = f;
/*  64 */             blc4 = ayu1.r().b();
/*     */           } 
/*     */           
/*  67 */           if (i4 < m && (blc3 == null || blc3.f())) {
/*  68 */             blc3 = blc2;
/*     */           }
/*     */           
/*  71 */           i3 = i2 + Math.max(0, i4 - m);
/*  72 */           if (i4 >= m - 1) {
/*  73 */             if (i4 > m + 3 + i2) {
/*     */               blc blc6;
/*  75 */               if (i4 < 64 || i4 > 127) {
/*  76 */                 blc6 = g;
/*  77 */               } else if (bool1) {
/*  78 */                 blc6 = h;
/*     */               } else {
/*  80 */                 blc6 = a(i, i4, j);
/*     */               } 
/*  82 */               bmx1.a(a, blc6, false);
/*     */             } else {
/*  84 */               bmx1.a(a, ayu1.r().a(), false);
/*  85 */               bool2 = true;
/*     */             } 
/*     */           } else {
/*  88 */             bmx1.a(a, blc4, false);
/*  89 */             bcs bcs = blc4.c();
/*  90 */             if (bcs == bct.fE || bcs == bct.fF || bcs == bct.fG || bcs == bct.fH || bcs == bct.fI || bcs == bct.fJ || bcs == bct.fK || bcs == bct.fL || bcs == bct.fM || bcs == bct.fN || bcs == bct.fO || bcs == bct.fP || bcs == bct.fQ || bcs == bct.fR || bcs == bct.fS || bcs == bct.fT)
/*     */             {
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
/* 107 */               bmx1.a(a, g, false);
/*     */             }
/*     */           } 
/* 110 */         } else if (i3 > 0) {
/* 111 */           i3--;
/*     */           
/* 113 */           if (bool2) {
/* 114 */             bmx1.a(a, g, false);
/*     */           } else {
/* 116 */             bmx1.a(a, a(i, i4, j), false);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */