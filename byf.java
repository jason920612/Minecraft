/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class byf
/*    */   implements byc<byd>
/*    */ {
/*    */   public void a(Random ☃, bmx bmx1, ayu ayu1, int i, int j, int k, double d, blc blc1, blc blc2, int m, long l, byd byd1) {
/* 14 */     double d1 = ayu.aJ.a(i * 0.25D, j * 0.25D);
/* 15 */     if (d1 > 0.0D) {
/* 16 */       int n = i & 0xF;
/* 17 */       int i1 = j & 0xF;
/*    */       
/* 19 */       el.a a = new el.a();
/*    */       
/* 21 */       for (int i2 = k; i2 >= 0; i2--) {
/* 22 */         a.c(n, i2, i1);
/* 23 */         if (!bmx1.a_(a).f()) {
/* 24 */           if (i2 == 62 && bmx1.a_(a).c() != blc2.c()) {
/* 25 */             bmx1.a(a, blc2, false);
/* 26 */             if (d1 < 0.12D) {
/* 27 */               bmx1.a(a.d(0, 1, 0), bct.dW.p(), false);
/*    */             }
/*    */           } 
/*    */           
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     } 
/* 35 */     ayu.au.a(☃, bmx1, ayu1, i, j, k, d, blc1, blc2, m, l, byd1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\byf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */