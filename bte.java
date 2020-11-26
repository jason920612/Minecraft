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
/*    */ 
/*    */ public class bte
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     el.a a1 = new el.a();
/* 21 */     el.a a2 = new el.a();
/*    */     
/* 23 */     for (int i = 0; i < 16; i++) {
/* 24 */       for (int j = 0; j < 16; j++) {
/* 25 */         int k = el1.o() + i;
/* 26 */         int m = el1.q() + j;
/* 27 */         int n = ☃.a(bor.a.d, k, m);
/*    */         
/* 29 */         a1.c(k, n, m);
/* 30 */         a2.g(a1).c(eq.a, 1);
/*    */         
/* 32 */         ayu ayu = ☃.d(a1);
/*    */         
/* 34 */         if (ayu.a(☃, a2, false)) {
/* 35 */           ☃.a(a2, bct.cR.p(), 2);
/*    */         }
/* 37 */         if (ayu.b(☃, a1)) {
/* 38 */           ☃.a(a1, bct.cQ.p(), 2);
/*    */           
/* 40 */           blc blc = ☃.a_(a2);
/* 41 */           if (blc.b(bhp.a)) {
/* 42 */             ☃.a(a2, blc.a(bhp.a, Boolean.valueOf(true)), 2);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 47 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bte.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */