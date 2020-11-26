/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhm
/*    */   extends bff
/*    */ {
/*    */   public bhm(bcs.c ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public axl c() {
/* 18 */     return axl.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, aer aer1, float f) {
/* 23 */     if (aer1.aZ()) {
/* 24 */       super.a(☃, el1, aer1, f);
/*    */     } else {
/* 26 */       aer1.c(f, 0.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axk ☃, aer aer1) {
/* 32 */     if (aer1.aZ()) {
/* 33 */       super.a(☃, aer1);
/*    */     }
/* 35 */     else if (aer1.u < 0.0D) {
/* 36 */       aer1.u = -aer1.u;
/*    */ 
/*    */       
/* 39 */       if (!(aer1 instanceof afa)) {
/* 40 */         aer1.u *= 0.8D;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, aer aer1) {
/* 48 */     if (Math.abs(aer1.u) < 0.1D && !aer1.aZ()) {
/* 49 */       double d = 0.4D + Math.abs(aer1.u) * 0.2D;
/* 50 */       aer1.t *= d;
/* 51 */       aer1.v *= d;
/*    */     } 
/* 53 */     super.a(☃, el1, aer1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int j(blc ☃, axk axk1, el el1) {
/* 58 */     return 0;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bhm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */