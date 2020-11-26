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
/*    */ public class bhq
/*    */   extends bcs
/*    */ {
/* 15 */   protected static final cew a = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);
/*    */   
/*    */   public bhq(bcs.c ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cew f(blc ☃, axk axk1, el el1) {
/* 23 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 28 */     aer1.t *= 0.4D;
/* 29 */     aer1.v *= 0.4D;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 34 */     bcy.a(axy1, el1.a(), false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 39 */     axy1.J().a(el1, this, a(axy1));
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(ayc ☃) {
/* 44 */     return 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 49 */     axy1.J().a(el1, this, a(axy1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 54 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bhq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */