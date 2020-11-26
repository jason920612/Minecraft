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
/*    */ public class bsw
/*    */   extends bqo<bsx>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bsx bsx1) {
/* 19 */     int i = 0;
/* 20 */     for (int j = 0; j < bsx1.a; j++) {
/* 21 */       int k = random.nextInt(8) - random.nextInt(8);
/* 22 */       int m = random.nextInt(8) - random.nextInt(8);
/* 23 */       int n = ☃.a(bor.a.f, el1.o() + k, el1.q() + m);
/* 24 */       el el2 = new el(el1.o() + k, n, el1.q() + m);
/*    */       
/* 26 */       if (☃.a_(el2).c() == bct.A) {
/* 27 */         boolean bool = (random.nextDouble() < bsx1.b);
/* 28 */         blc blc = bool ? bct.aV.p() : bct.aU.p();
/* 29 */         if (blc.a(☃, el2)) {
/* 30 */           if (bool) {
/* 31 */             blc blc1 = blc.a(bii.c, bmg.a);
/* 32 */             el el3 = el2.a();
/* 33 */             if (☃.a_(el3).c() == bct.A) {
/* 34 */               ☃.a(el2, blc, 2);
/* 35 */               ☃.a(el3, blc1, 2);
/*    */             } 
/*    */           } else {
/* 38 */             ☃.a(el2, blc, 2);
/*    */           } 
/* 40 */           i++;
/*    */         } 
/*    */       } 
/*    */     } 
/* 44 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bsw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */