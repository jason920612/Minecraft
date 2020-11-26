/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bxx
/*    */   extends bxy
/*    */ {
/* 12 */   private static final blc f = bct.fE.p();
/* 13 */   private static final blc g = bct.fF.p();
/* 14 */   private static final blc h = bct.gn.p();
/*    */ 
/*    */   
/*    */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/* 18 */     int n = i & 0xF;
/* 19 */     int i1 = j & 0xF;
/*    */     
/* 21 */     blc blc3 = f;
/* 22 */     blc blc4 = ayu1.r().b();
/*    */     
/* 24 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/* 25 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/* 26 */     int i3 = -1;
/* 27 */     boolean bool2 = false;
/* 28 */     int i4 = 0;
/*    */     
/* 30 */     el.a a = new el.a();
/*    */     
/* 32 */     for (int i5 = k; i5 >= 0; i5--) {
/* 33 */       if (i4 < 15) {
/* 34 */         a.c(n, i5, i1);
/* 35 */         blc blc5 = bmx1.a_(a);
/*    */         
/* 37 */         if (blc5.f()) {
/* 38 */           i3 = -1;
/* 39 */         } else if (blc5.c() == blc1.c()) {
/* 40 */           if (i3 == -1) {
/* 41 */             bool2 = false;
/* 42 */             if (i2 <= 0) {
/* 43 */               blc3 = bct.a.p();
/* 44 */               blc4 = blc1;
/* 45 */             } else if (i5 >= m - 4 && i5 <= m + 1) {
/* 46 */               blc3 = f;
/* 47 */               blc4 = ayu1.r().b();
/*    */             } 
/*    */             
/* 50 */             if (i5 < m && (blc3 == null || blc3.f())) {
/* 51 */               blc3 = blc2;
/*    */             }
/*    */             
/* 54 */             i3 = i2 + Math.max(0, i5 - m);
/* 55 */             if (i5 >= m - 1) {
/* 56 */               if (i5 > 86 + i2 * 2) {
/* 57 */                 if (bool1) {
/* 58 */                   bmx1.a(a, bct.k.p(), false);
/*    */                 } else {
/* 60 */                   bmx1.a(a, bct.i.p(), false);
/*    */                 } 
/* 62 */               } else if (i5 > m + 3 + i2) {
/*    */                 blc blc6;
/* 64 */                 if (i5 < 64 || i5 > 127) {
/* 65 */                   blc6 = g;
/* 66 */                 } else if (bool1) {
/* 67 */                   blc6 = h;
/*    */                 } else {
/* 69 */                   blc6 = a(i, i5, j);
/*    */                 } 
/* 71 */                 bmx1.a(a, blc6, false);
/*    */               } else {
/* 73 */                 bmx1.a(a, ayu1.r().a(), false);
/* 74 */                 bool2 = true;
/*    */               } 
/*    */             } else {
/* 77 */               bmx1.a(a, blc4, false);
/* 78 */               if (blc4.c() == f) {
/* 79 */                 bmx1.a(a, g, false);
/*    */               }
/*    */             } 
/* 82 */           } else if (i3 > 0) {
/* 83 */             i3--;
/*    */             
/* 85 */             if (bool2) {
/* 86 */               bmx1.a(a, g, false);
/*    */             } else {
/* 88 */               bmx1.a(a, a(i, i5, j), false);
/*    */             } 
/*    */           } 
/* 91 */           i4++;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bxx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */