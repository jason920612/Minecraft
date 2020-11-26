/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awc
/*    */   extends awe
/*    */ {
/*    */   protected awc(awe.a ☃, aew... arrayOfAew) {
/* 11 */     super(☃, awf.k, arrayOfAew);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 16 */     return 5 + (☃ - 1) * 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 21 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 26 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 31 */     if (☃.e()) {
/* 32 */       return true;
/*    */     }
/* 34 */     return super.a(☃);
/*    */   }
/*    */   
/*    */   public static boolean a(ate ☃, int i, Random random) {
/* 38 */     if (☃.b() instanceof arb && random.nextFloat() < 0.6F) {
/* 39 */       return false;
/*    */     }
/* 41 */     return (random.nextInt(i + 1) > 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\awc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */