/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adh
/*    */ {
/* 12 */   private static final Random a = new Random();
/*    */   
/*    */   public static void a(axy ☃, el el1, ade ade1) {
/* 15 */     a(☃, el1.o(), el1.p(), el1.q(), ade1);
/*    */   }
/*    */   
/*    */   public static void a(axy ☃, aer aer1, ade ade1) {
/* 19 */     a(☃, aer1.q, aer1.r, aer1.s, ade1);
/*    */   }
/*    */   
/*    */   private static void a(axy ☃, double d1, double d2, double d3, ade ade1) {
/* 23 */     for (int i = 0; i < ade1.T_(); i++) {
/* 24 */       ate ate = ade1.a(i);
/* 25 */       if (!ate.a())
/*    */       {
/*    */ 
/*    */         
/* 29 */         a(☃, d1, d2, d3, ate); } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(axy ☃, double d1, double d2, double d3, ate ate1) {
/* 34 */     float f1 = 0.75F;
/* 35 */     float f2 = 0.125F;
/* 36 */     float f3 = a.nextFloat() * 0.75F + 0.125F;
/* 37 */     float f4 = a.nextFloat() * 0.75F;
/* 38 */     float f5 = a.nextFloat() * 0.75F + 0.125F;
/*    */     
/* 40 */     while (!ate1.a()) {
/* 41 */       amm amm = new amm(☃, d1 + f3, d2 + f4, d3 + f5, ate1.a(a.nextInt(21) + 10));
/*    */       
/* 43 */       float f = 0.05F;
/* 44 */       amm.t = a.nextGaussian() * 0.05000000074505806D;
/* 45 */       amm.u = a.nextGaussian() * 0.05000000074505806D + 0.20000000298023224D;
/* 46 */       amm.v = a.nextGaussian() * 0.05000000074505806D;
/*    */       
/* 48 */       ☃.a(amm);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\adh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */