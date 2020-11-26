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
/*    */ public class bhd
/*    */   extends bda
/*    */   implements bcv
/*    */ {
/* 17 */   public static final bmj a = bma.am;
/*    */ 
/*    */   
/* 20 */   protected static final cew b = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
/*    */   
/*    */   private final bkl c;
/*    */   
/*    */   protected bhd(bkl ☃, bcs.c c1) {
/* 25 */     super(c1);
/* 26 */     this.c = ☃;
/* 27 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 32 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 37 */     super.a(☃, axy1, el1, random);
/*    */     
/* 39 */     if (axy1.C(el1.a()) >= 9 && 
/* 40 */       random.nextInt(7) == 0) {
/* 41 */       a(axy1, el1, ☃, random);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axz ☃, el el1, blc blc1, Random random) {
/* 47 */     if (((Integer)blc1.c(a)).intValue() == 0) {
/* 48 */       ☃.a(el1, blc1.a(a), 4);
/*    */     } else {
/* 50 */       this.c.a(☃, el1, blc1, random);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 56 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 61 */     return (☃.s.nextFloat() < 0.45D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 66 */     a(☃, el1, blc1, random);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 71 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bhd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */