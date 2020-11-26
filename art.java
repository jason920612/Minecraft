/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class art
/*    */   extends asv
/*    */ {
/*    */   public art(int ☃, float f, ata.a a1) {
/* 13 */     super(☃, f, false, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, axy axy1, afa afa1) {
/* 18 */     ate ate1 = super.a(☃, axy1, afa1);
/*    */     
/* 20 */     if (!axy1.B) {
/* 21 */       double d1 = afa1.q;
/* 22 */       double d2 = afa1.r;
/* 23 */       double d3 = afa1.s;
/*    */       
/* 25 */       for (int i = 0; i < 16; i++) {
/* 26 */         double d4 = afa1.q + (afa1.ce().nextDouble() - 0.5D) * 16.0D;
/* 27 */         double d5 = xq.a(afa1.r + (afa1.ce().nextInt(16) - 8), 0.0D, (axy1.ab() - 1));
/* 28 */         double d6 = afa1.s + (afa1.ce().nextDouble() - 0.5D) * 16.0D;
/* 29 */         if (afa1.aW()) {
/* 30 */           afa1.S_();
/*    */         }
/* 32 */         if (afa1.j(d4, d5, d6)) {
/* 33 */           axy1.a((aog)null, d1, d2, d3, wj.aD, wk.h, 1.0F, 1.0F);
/* 34 */           afa1.a(wj.aD, 1.0F, 1.0F);
/*    */           
/*    */           break;
/*    */         } 
/*    */       } 
/*    */       
/* 40 */       if (afa1 instanceof aog) {
/* 41 */         ((aog)afa1).dI().a(this, 20);
/*    */       }
/*    */     } 
/*    */     
/* 45 */     return ate1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\art.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */