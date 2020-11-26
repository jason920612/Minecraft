/*     */ import java.util.Random;
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
/*     */ public class brv
/*     */   extends bqo<brz>
/*     */ {
/*  24 */   private static final Logger a = LogManager.getLogger();
/*  25 */   private static final aev<?>[] b = new aev[] { aev.ak, aev.aJ, aev.aJ, aev.ar };
/*  26 */   private static final blc c = bct.jI.p();
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/*  30 */     int i = 3;
/*  31 */     int j = random.nextInt(2) + 2;
/*  32 */     int k = -j - 1;
/*  33 */     int m = j + 1;
/*     */     
/*  35 */     int n = -1;
/*  36 */     int i1 = 4;
/*     */     
/*  38 */     int i2 = random.nextInt(2) + 2;
/*  39 */     int i3 = -i2 - 1;
/*  40 */     int i4 = i2 + 1;
/*     */     
/*  42 */     int i5 = 0; int i6;
/*  43 */     for (i6 = k; i6 <= m; i6++) {
/*  44 */       for (int i7 = -1; i7 <= 4; i7++) {
/*  45 */         for (int i8 = i3; i8 <= i4; i8++) {
/*  46 */           el el2 = el1.a(i6, i7, i8);
/*  47 */           bza bza = ☃.a_(el2).d();
/*  48 */           boolean bool = bza.b();
/*     */           
/*  50 */           if (i7 == -1 && !bool) {
/*  51 */             return false;
/*     */           }
/*  53 */           if (i7 == 4 && !bool) {
/*  54 */             return false;
/*     */           }
/*     */           
/*  57 */           if ((i6 == k || i6 == m || i8 == i3 || i8 == i4) && 
/*  58 */             i7 == 0 && ☃.c(el2) && ☃.c(el2.a())) {
/*  59 */             i5++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  66 */     if (i5 < 1 || i5 > 5) {
/*  67 */       return false;
/*     */     }
/*     */     
/*  70 */     for (i6 = k; i6 <= m; i6++) {
/*  71 */       for (int i7 = 3; i7 >= -1; i7--) {
/*  72 */         for (int i8 = i3; i8 <= i4; i8++) {
/*  73 */           el el2 = el1.a(i6, i7, i8);
/*     */           
/*  75 */           if (i6 == k || i7 == -1 || i8 == i3 || i6 == m || i7 == 4 || i8 == i4) {
/*  76 */             if (el2.p() >= 0 && !☃.a_(el2.b()).d().b()) {
/*  77 */               ☃.a(el2, c, 2);
/*  78 */             } else if (☃.a_(el2).d().b() && 
/*  79 */               ☃.a_(el2).c() != bct.ck) {
/*  80 */               if (i7 == -1 && random.nextInt(4) != 0) {
/*  81 */                 ☃.a(el2, bct.cd.p(), 2);
/*     */               } else {
/*  83 */                 ☃.a(el2, bct.m.p(), 2);
/*     */               }
/*     */             
/*     */             }
/*     */           
/*  88 */           } else if (☃.a_(el2).c() != bct.ck) {
/*  89 */             ☃.a(el2, c, 2);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  96 */     for (i6 = 0; i6 < 2; i6++) {
/*  97 */       for (int i7 = 0; i7 < 3; i7++) {
/*  98 */         int i8 = el1.o() + random.nextInt(j * 2 + 1) - j;
/*  99 */         int i9 = el1.p();
/* 100 */         int i10 = el1.q() + random.nextInt(i2 * 2 + 1) - i2;
/* 101 */         el el2 = new el(i8, i9, i10);
/*     */         
/* 103 */         if (☃.c(el2)) {
/*     */ 
/*     */ 
/*     */           
/* 107 */           int i11 = 0;
/* 108 */           for (eq eq : eq.c.a) {
/* 109 */             if (☃.a_(el2.a(eq)).d().b()) {
/* 110 */               i11++;
/*     */             }
/*     */           } 
/*     */           
/* 114 */           if (i11 == 1) {
/*     */ 
/*     */ 
/*     */             
/* 118 */             ☃.a(el2, bxb.a(☃, el2, bct.ck.p()), 2);
/* 119 */             bka.a(☃, random, el2, ccl.d);
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 125 */     ☃.a(el1, bct.ci.p(), 2);
/* 126 */     bji bji = ☃.f(el1);
/*     */     
/* 128 */     if (bji instanceof bke) {
/* 129 */       ((bke)bji).c().a(a(random));
/*     */     } else {
/* 131 */       a.error("Failed to fetch mob spawner entity at ({}, {}, {})", Integer.valueOf(el1.o()), Integer.valueOf(el1.p()), Integer.valueOf(el1.q()));
/*     */     } 
/*     */     
/* 134 */     return true;
/*     */   }
/*     */   
/*     */   private aev<?> a(Random ☃) {
/* 138 */     return b[☃.nextInt(b.length)];
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\brv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */