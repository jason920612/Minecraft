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
/*    */ public class bgd
/*    */   extends bda
/*    */ {
/* 19 */   public static final bmj a = bma.U;
/*    */   
/* 21 */   private static final cew[] b = new cew[] {
/* 22 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), 
/* 23 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/* 24 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D), 
/* 25 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D)
/*    */     };
/*    */   
/*    */   protected bgd(bcs.c ☃) {
/* 29 */     super(☃);
/* 30 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 35 */     return b[((Integer)☃.c(a)).intValue()];
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(blc ☃, axk axk1, el el1) {
/* 40 */     return (☃.c() == bct.df);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 45 */     int i = ((Integer)☃.c(a)).intValue();
/* 46 */     if (i < 3 && random.nextInt(10) == 0) {
/* 47 */       ☃ = ☃.a(a, Integer.valueOf(i + 1));
/* 48 */       axy1.a(el1, ☃, 2);
/*    */     } 
/*    */     
/* 51 */     super.a(☃, axy1, el1, random);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 57 */     if (axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 61 */     int j = 1;
/* 62 */     if (((Integer)☃.c(a)).intValue() >= 3) {
/* 63 */       j = 2 + axy1.s.nextInt(3);
/* 64 */       if (i > 0) {
/* 65 */         j += axy1.s.nextInt(i + 1);
/*    */       }
/*    */     } 
/*    */     
/* 69 */     for (int k = 0; k < j; k++) {
/* 70 */       a(axy1, el1, new ate(atf.cm));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 76 */     return atf.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(axk ☃, el el1, blc blc1) {
/* 81 */     return new ate(atf.cm);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 86 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */