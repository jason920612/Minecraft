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
/*    */ public class ahl
/*    */   extends ahh
/*    */ {
/*    */   private final ajy f;
/*    */   
/*    */   public ahl(ajy ☃, double d) {
/* 18 */     super(☃, d, 8);
/* 19 */     this.f = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 24 */     return (this.f.dy() && !this.f.dA() && super.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 29 */     super.c();
/* 30 */     this.f.dC().a(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 35 */     super.d();
/* 36 */     this.f.u(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 41 */     super.e();
/*    */     
/* 43 */     this.f.dC().a(false);
/* 44 */     if (!k()) {
/* 45 */       this.f.u(false);
/* 46 */     } else if (!this.f.dA()) {
/* 47 */       this.f.u(true);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(ayc ☃, el el1) {
/* 53 */     if (!☃.c(el1.a())) {
/* 54 */       return false;
/*    */     }
/*    */     
/* 57 */     blc blc = ☃.a_(el1);
/* 58 */     bcs bcs = blc.c();
/*    */ 
/*    */     
/* 61 */     if (bcs == bct.ck)
/* 62 */       return (bjl.a(☃, el1) < 1); 
/* 63 */     if (bcs == bct.cr && ((Boolean)blc.c(bex.b)).booleanValue())
/* 64 */       return true; 
/* 65 */     if (bcs instanceof bcq && blc.c(bcq.a) != blz.a) {
/* 66 */       return true;
/*    */     }
/*    */     
/* 69 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */