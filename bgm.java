/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bgm
/*    */   extends bdv
/*    */ {
/* 13 */   private static final cew[] a = new cew[] {
/* 14 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/* 15 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), 
/* 16 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/* 17 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), 
/* 18 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/* 19 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), 
/* 20 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/* 21 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)
/*    */     };
/*    */   
/*    */   public bgm(bcs.c ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected axx f() {
/* 30 */     return atf.dD;
/*    */   }
/*    */ 
/*    */   
/*    */   protected axx g() {
/* 35 */     return atf.dD;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 40 */     super.a(☃, axy1, el1, f, i);
/*    */     
/* 42 */     if (axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 46 */     if (w(☃) && axy1.s.nextInt(50) == 0) {
/* 47 */       a(axy1, el1, new ate(atf.dF));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public cew a(blc ☃, axk axk1, el el1) {
/* 53 */     return a[((Integer)☃.c(d())).intValue()];
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */