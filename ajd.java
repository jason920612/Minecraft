/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class ajd
/*     */ {
/*     */   @Nullable
/*     */   public static cee a(afg ☃, int i, int j) {
/*  17 */     return c(☃, i, j, null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cee b(afg ☃, int i, int j) {
/*  22 */     return a(☃, i, j, null, false, 0.0D);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cee a(afg ☃, int i, int j, cee cee1) {
/*  27 */     cee cee2 = cee1.a(☃.q, ☃.r, ☃.s);
/*  28 */     return c(☃, i, j, cee2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cee a(afg ☃, int i, int j, cee cee1, double d) {
/*  33 */     cee cee2 = cee1.a(☃.q, ☃.r, ☃.s);
/*  34 */     return a(☃, i, j, cee2, true, d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static cee b(afg ☃, int i, int j, cee cee1) {
/*  44 */     cee cee2 = (new cee(☃.q, ☃.r, ☃.s)).d(cee1);
/*  45 */     return c(☃, i, j, cee2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static cee c(afg ☃, int i, int j, @Nullable cee cee1) {
/*  50 */     return a(☃, i, j, cee1, true, 1.5707963705062866D);
/*     */   }
/*     */   @Nullable
/*     */   private static cee a(afg ☃, int i, int j, @Nullable cee cee1, boolean bool, double d) {
/*     */     boolean bool1;
/*  55 */     aiw aiw = ☃.t();
/*  56 */     Random random = ☃.ce();
/*     */ 
/*     */     
/*  59 */     if (☃.dw()) {
/*  60 */       double d1 = ☃.dt().f(xq.c(☃.q), xq.c(☃.r), xq.c(☃.s)) + 4.0D;
/*  61 */       double d2 = (☃.du() + i);
/*  62 */       bool1 = (d1 < d2 * d2);
/*     */     } else {
/*  64 */       bool1 = false;
/*     */     } 
/*     */ 
/*     */     
/*  68 */     boolean bool2 = false;
/*  69 */     float f = -99999.0F;
/*  70 */     int k = 0;
/*  71 */     int m = 0;
/*  72 */     int n = 0;
/*     */     
/*  74 */     for (int i1 = 0; i1 < 10; i1++) {
/*  75 */       el el1 = a(random, i, j, cee1, d);
/*  76 */       if (el1 == null) {
/*     */         continue;
/*     */       }
/*     */       
/*  80 */       int i2 = el1.o();
/*  81 */       int i3 = el1.p();
/*  82 */       int i4 = el1.q();
/*     */       
/*  84 */       if (☃.dw() && i > 1) {
/*  85 */         el el = ☃.dt();
/*  86 */         if (☃.q > el.o()) {
/*  87 */           i2 -= random.nextInt(i / 2);
/*     */         } else {
/*  89 */           i2 += random.nextInt(i / 2);
/*     */         } 
/*  91 */         if (☃.s > el.q()) {
/*  92 */           i4 -= random.nextInt(i / 2);
/*     */         } else {
/*  94 */           i4 += random.nextInt(i / 2);
/*     */         } 
/*     */       } 
/*     */       
/*  98 */       el el2 = new el(i2 + ☃.q, i3 + ☃.r, i4 + ☃.s);
/*     */       
/* 100 */       if ((bool1 && !☃.f(el2)) || !aiw.a(el2)) {
/*     */         continue;
/*     */       }
/*     */       
/* 104 */       if (!bool) {
/* 105 */         el2 = a(el2, ☃);
/* 106 */         if (b(el2, ☃)) {
/*     */           continue;
/*     */         }
/*     */       } 
/*     */       
/* 111 */       float f1 = ☃.a(el2);
/* 112 */       if (f1 > f) {
/* 113 */         f = f1;
/* 114 */         k = i2;
/* 115 */         m = i3;
/* 116 */         n = i4;
/* 117 */         bool2 = true;
/*     */       }  continue;
/*     */     } 
/* 120 */     if (bool2) {
/* 121 */       return new cee(k + ☃.q, m + ☃.r, n + ☃.s);
/*     */     }
/*     */     
/* 124 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static el a(Random ☃, int i, int j, @Nullable cee cee1, double d) {
/* 129 */     if (cee1 == null || d >= Math.PI) {
/* 130 */       int m = ☃.nextInt(2 * i + 1) - i;
/* 131 */       int n = ☃.nextInt(2 * j + 1) - j;
/* 132 */       int i1 = ☃.nextInt(2 * i + 1) - i;
/* 133 */       return new el(m, n, i1);
/*     */     } 
/* 135 */     double d1 = xq.c(cee1.d, cee1.b) - 1.5707963705062866D;
/* 136 */     double d2 = d1 + (2.0F * ☃.nextFloat() - 1.0F) * d;
/* 137 */     double d3 = Math.sqrt(☃.nextDouble()) * xq.a * i;
/* 138 */     double d4 = -d3 * Math.sin(d2);
/* 139 */     double d5 = d3 * Math.cos(d2);
/*     */     
/* 141 */     if (Math.abs(d4) > i || Math.abs(d5) > i) {
/* 142 */       return null;
/*     */     }
/* 144 */     int k = ☃.nextInt(2 * j + 1) - j;
/* 145 */     return new el(d4, k, d5);
/*     */   }
/*     */   
/*     */   private static el a(el ☃, afg afg1) {
/* 149 */     if (afg1.m.a_(☃).d().b()) {
/* 150 */       el el1 = ☃.a();
/* 151 */       while (el1.p() < afg1.m.aa() && afg1.m.a_(el1).d().b()) {
/* 152 */         el1 = el1.a();
/*     */       }
/* 154 */       return el1;
/*     */     } 
/* 156 */     return ☃;
/*     */   }
/*     */   
/*     */   private static boolean b(el ☃, afg afg1) {
/* 160 */     return afg1.m.b(☃).a(ww.a);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */