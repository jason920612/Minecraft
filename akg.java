/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class akg
/*    */   extends afl
/*    */ {
/*    */   private int bG;
/*    */   
/*    */   protected akg(aev<?> ☃, axy axy1) {
/* 14 */     super(☃, axy1);
/*    */   }
/*    */   
/*    */   public boolean g(aog ☃) {
/* 18 */     gy gy = new gy();
/* 19 */     gy.a("id", aE());
/* 20 */     e(gy);
/*    */     
/* 22 */     if (☃.g(gy)) {
/* 23 */       this.m.e(this);
/* 24 */       return true;
/*    */     } 
/*    */     
/* 27 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void R_() {
/* 32 */     this.bG++;
/* 33 */     super.R_();
/*    */   }
/*    */   
/*    */   public boolean dK() {
/* 37 */     return (this.bG > 100);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\akg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */