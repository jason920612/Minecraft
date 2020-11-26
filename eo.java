/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eo
/*    */   implements es
/*    */ {
/*    */   public final ate dispense(em ☃, ate ate1) {
/* 12 */     ate ate2 = a(☃, ate1);
/*    */     
/* 14 */     a(☃);
/* 15 */     a(☃, (eq)☃.e().c(bec.a));
/*    */     
/* 17 */     return ate2;
/*    */   }
/*    */   
/*    */   protected ate a(em ☃, ate ate1) {
/* 21 */     eq eq = (eq)☃.e().c(bec.a);
/* 22 */     fa fa = bec.a(☃);
/*    */     
/* 24 */     ate ate2 = ate1.a(1);
/*    */     
/* 26 */     a(☃.h(), ate2, 6, eq, fa);
/*    */     
/* 28 */     return ate1;
/*    */   }
/*    */   
/*    */   public static void a(axy ☃, ate ate1, int i, eq eq1, fa fa1) {
/* 32 */     double d1 = fa1.a();
/* 33 */     double d2 = fa1.b();
/* 34 */     double d3 = fa1.c();
/*    */     
/* 36 */     if (eq1.k() == eq.a.b) {
/*    */       
/* 38 */       d2 -= 0.125D;
/*    */     } else {
/*    */       
/* 41 */       d2 -= 0.15625D;
/*    */     } 
/*    */     
/* 44 */     amm amm = new amm(☃, d1, d2, d3, ate1);
/*    */     
/* 46 */     double d4 = ☃.s.nextDouble() * 0.1D + 0.2D;
/* 47 */     amm.t = eq1.g() * d4;
/* 48 */     amm.u = 0.20000000298023224D;
/* 49 */     amm.v = eq1.i() * d4;
/*    */     
/* 51 */     amm.t += ☃.s.nextGaussian() * 0.007499999832361937D * i;
/* 52 */     amm.u += ☃.s.nextGaussian() * 0.007499999832361937D * i;
/* 53 */     amm.v += ☃.s.nextGaussian() * 0.007499999832361937D * i;
/*    */     
/* 55 */     ☃.a(amm);
/*    */   }
/*    */   
/*    */   protected void a(em ☃) {
/* 59 */     ☃.h().b(1000, ☃.d(), 0);
/*    */   }
/*    */   
/*    */   protected void a(em ☃, eq eq1) {
/* 63 */     ☃.h().b(2000, ☃.d(), eq1.a());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\eo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */