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
/*    */ public class bcr
/*    */   extends bdv
/*    */ {
/* 18 */   public static final bmj a = bma.U;
/*    */   
/* 20 */   private static final cew[] c = new cew[] {
/* 21 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/* 22 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/* 23 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/* 24 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)
/*    */     };
/*    */   
/*    */   public bcr(bcs.c ☃) {
/* 28 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmj d() {
/* 33 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public int e() {
/* 38 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected axx f() {
/* 43 */     return atf.eO;
/*    */   }
/*    */ 
/*    */   
/*    */   protected axx g() {
/* 48 */     return atf.eP;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 54 */     if (random.nextInt(3) != 0) {
/* 55 */       super.a(☃, axy1, el1, random);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(axy ☃) {
/* 61 */     return super.a(☃) / 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 66 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 71 */     return c[((Integer)☃.c(d())).intValue()];
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */