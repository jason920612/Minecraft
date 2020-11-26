/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bxs
/*    */   implements byc<byd>
/*    */ {
/*    */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/* 15 */     a(☃, bmx1, ayu1, i, j, k, d, blc1, blc2, byd1.a(), byd1.b(), byd1.c(), m);
/*    */   }
/*    */   
/*    */   protected void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, blc blc3, blc blc4, blc blc5, int m) {
/* 19 */     blc blc6 = blc3;
/* 20 */     blc blc7 = blc4;
/* 21 */     el.a a = new el.a();
/*    */     
/* 23 */     int n = -1;
/* 24 */     int i1 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*    */     
/* 26 */     int i2 = i & 0xF;
/* 27 */     int i3 = j & 0xF;
/*    */     
/* 29 */     for (int i4 = k; i4 >= 0; i4--) {
/* 30 */       a.c(i2, i4, i3);
/* 31 */       blc blc8 = bmx1.a_(a);
/*    */       
/* 33 */       if (blc8.f()) {
/* 34 */         n = -1;
/*    */ 
/*    */       
/*    */       }
/* 38 */       else if (blc8.c() == blc1.c()) {
/*    */ 
/*    */ 
/*    */         
/* 42 */         if (n == -1) {
/* 43 */           if (i1 <= 0) {
/* 44 */             blc6 = bct.a.p();
/* 45 */             blc7 = blc1;
/* 46 */           } else if (i4 >= m - 4 && i4 <= m + 1) {
/* 47 */             blc6 = blc3;
/* 48 */             blc7 = blc4;
/*    */           } 
/*    */           
/* 51 */           if (i4 < m && (blc6 == null || blc6.f())) {
/* 52 */             if (ayu1.c(a.c(i, i4, j)) < 0.15F) {
/* 53 */               blc6 = bct.cR.p();
/*    */             } else {
/* 55 */               blc6 = blc2;
/*    */             } 
/* 57 */             a.c(i2, i4, i3);
/*    */           } 
/*    */           
/* 60 */           n = i1;
/* 61 */           if (i4 >= m - 1) {
/* 62 */             bmx1.a(a, blc6, false);
/* 63 */           } else if (i4 < m - 7 - i1) {
/* 64 */             blc6 = bct.a.p();
/* 65 */             blc7 = blc1;
/* 66 */             bmx1.a(a, blc5, false);
/*    */           } else {
/* 68 */             bmx1.a(a, blc7, false);
/*    */           } 
/* 70 */         } else if (n > 0) {
/* 71 */           n--;
/* 72 */           bmx1.a(a, blc7, false);
/*    */ 
/*    */           
/* 75 */           if (n == 0 && blc7.c() == bct.D && i1 > 1) {
/* 76 */             n = ☃.nextInt(4) + Math.max(0, i4 - 63);
/* 77 */             blc7 = (blc7.c() == bct.E) ? bct.hT.p() : bct.at.p();
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bxs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */