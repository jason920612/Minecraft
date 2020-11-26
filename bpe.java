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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpe
/*    */   extends bqo<bpd>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bpd bpd1) {
/* 19 */     while (el1.p() > 3) {
/* 20 */       if (!☃.c(el1.b())) {
/* 21 */         bcs bcs = ☃.a_(el1.b()).c();
/* 22 */         if (bcs == bct.i || bcs.d(bcs) || bcs.c(bcs)) {
/*    */           break;
/*    */         }
/*    */       } 
/* 26 */       el1 = el1.b();
/*    */     } 
/* 28 */     if (el1.p() <= 3) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     int i = bpd1.b;
/* 33 */     int j = 0;
/* 34 */     while (i >= 0 && j < 3) {
/* 35 */       int k = i + random.nextInt(2);
/* 36 */       int m = i + random.nextInt(2);
/* 37 */       int n = i + random.nextInt(2);
/* 38 */       float f = (k + m + n) * 0.333F + 0.5F;
/*    */       
/* 40 */       for (el el2 : el.a(el1.a(-k, -m, -n), el1.a(k, m, n))) {
/* 41 */         if (el2.n(el1) <= (f * f)) {
/* 42 */           ☃.a(el2, bpd1.a.p(), 4);
/*    */         }
/*    */       } 
/*    */       
/* 46 */       el1 = el1.a(-(i + 1) + random.nextInt(2 + i * 2), 0 - random.nextInt(2), -(i + 1) + random.nextInt(2 + i * 2));
/* 47 */       j++;
/*    */     } 
/*    */     
/* 50 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */