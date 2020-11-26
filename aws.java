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
/*    */ public class aws
/*    */   extends awe
/*    */ {
/*    */   public aws(awe.a ☃, aew... arrayOfAew) {
/* 16 */     super(☃, awf.e, arrayOfAew);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 21 */     return 10 + 20 * (☃ - 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 26 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 31 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 36 */     if (☃.b() instanceof arb) {
/* 37 */       return true;
/*    */     }
/* 39 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(afa ☃, aer aer1, int i) {
/* 44 */     Random random = ☃.ce();
/* 45 */     ate ate = awg.b(awi.h, ☃);
/*    */     
/* 47 */     if (a(i, random)) {
/* 48 */       if (aer1 != null) {
/* 49 */         aer1.a(aea.a(☃), b(i, random));
/*    */       }
/*    */       
/* 52 */       if (!ate.a()) {
/* 53 */         ate.a(3, ☃);
/*    */       }
/*    */     }
/* 56 */     else if (!ate.a()) {
/* 57 */       ate.a(1, ☃);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean a(int ☃, Random random) {
/* 63 */     if (☃ <= 0) {
/* 64 */       return false;
/*    */     }
/* 66 */     return (random.nextFloat() < 0.15F * ☃);
/*    */   }
/*    */   
/*    */   public static int b(int ☃, Random random) {
/* 70 */     if (☃ > 10) {
/* 71 */       return ☃ - 10;
/*    */     }
/* 73 */     return 1 + random.nextInt(4);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */