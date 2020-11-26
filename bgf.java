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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bgf
/*    */   extends bcs
/*    */ {
/* 22 */   public static final bmh<bmk> a = bma.as;
/* 23 */   public static final bmb b = bma.t;
/* 24 */   public static final bmj c = bma.aj;
/*    */   
/*    */   public bgf(bcs.c ☃) {
/* 27 */     super(☃);
/* 28 */     v(((blc)this.m.b()).a(a, bmk.a).a(c, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(ark ☃) {
/* 33 */     return p().a(a, bmk.a(☃.k().a_(☃.a().b())));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 38 */     if (eq1 == eq.a) {
/* 39 */       return ☃.a(a, bmk.a(blc1));
/*    */     }
/* 41 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 46 */     boolean bool = axy1.t(el1);
/*    */     
/* 48 */     if (bool != ((Boolean)☃.c(b)).booleanValue()) {
/* 49 */       if (bool) {
/* 50 */         a(axy1, el1);
/*    */       }
/* 52 */       axy1.a(el1, ☃.a(b, Boolean.valueOf(bool)), 3);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void a(axy ☃, el el1) {
/* 57 */     if (☃.a_(el1.a()).f()) {
/* 58 */       ☃.a(el1, this, 0, 0);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 64 */     if (axy1.B) {
/* 65 */       return true;
/*    */     }
/*    */     
/* 68 */     ☃ = ☃.a(c);
/* 69 */     axy1.a(el1, ☃, 3);
/* 70 */     a(axy1, el1);
/* 71 */     aog1.a(ws.ae);
/*    */     
/* 73 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, aog aog1) {
/* 78 */     if (axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 82 */     a(axy1, el1);
/* 83 */     aog1.a(ws.ad);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, int i, int j) {
/* 88 */     int k = ((Integer)☃.c(c)).intValue();
/* 89 */     float f = (float)Math.pow(2.0D, (k - 12) / 12.0D);
/*    */     
/* 91 */     axy1.a((aog)null, el1, ((bmk)☃.c(a)).a(), wk.c, 3.0F, f);
/* 92 */     axy1.a(fm.I, el1.o() + 0.5D, el1.p() + 1.2D, el1.q() + 0.5D, k / 24.0D, 0.0D, 0.0D);
/* 93 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 98 */     ☃.a((bmm<?>[])new bmm[] { a, b, c });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */