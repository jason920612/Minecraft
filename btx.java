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
/*    */ public class btx
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 16 */     el el2 = ☃.n();
/*    */     
/* 18 */     int i = 16;
/*    */     
/* 20 */     double d = el2.n(el1.a(8, el2.p(), 8));
/* 21 */     if (d > 1024.0D) {
/* 22 */       return true;
/*    */     }
/*    */     
/* 25 */     el el3 = new el(el2.o() - 16, Math.max(el2.p(), 4) - 1, el2.q() - 16);
/* 26 */     el el4 = new el(el2.o() + 16, Math.max(el2.p(), 4) - 1, el2.q() + 16);
/* 27 */     el.a a = new el.a(el3);
/* 28 */     for (int j = el1.q(); j < el1.q() + 16; j++) {
/* 29 */       for (int k = el1.o(); k < el1.o() + 16; k++) {
/* 30 */         if (j >= el3.q() && j <= el4.q() && k >= el3.o() && k <= el4.o()) {
/*    */ 
/*    */           
/* 33 */           a.c(k, a.p(), j);
/* 34 */           if (el2.o() == k && el2.q() == j) {
/* 35 */             ☃.a(a, bct.m.p(), 2);
/*    */           } else {
/* 37 */             ☃.a(a, bct.b.p(), 2);
/*    */           } 
/*    */         } 
/*    */       } 
/* 41 */     }  return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\btx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */