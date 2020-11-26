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
/*    */ public class aiy
/*    */   extends aiv
/*    */ {
/*    */   private el p;
/*    */   
/*    */   public aiy(afb ☃, axy axy1) {
/* 22 */     super(☃, axy1);
/*    */   }
/*    */ 
/*    */   
/*    */   public cbe b(el ☃) {
/* 27 */     this.p = ☃;
/* 28 */     return super.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cbe a(aer ☃) {
/* 33 */     this.p = new el(☃);
/* 34 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aer ☃, double d) {
/* 39 */     cbe cbe = a(☃);
/* 40 */     if (cbe != null) {
/* 41 */       return a(cbe, d);
/*    */     }
/* 43 */     this.p = new el(☃);
/* 44 */     this.d = d;
/* 45 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 51 */     if (p()) {
/* 52 */       if (this.p != null) {
/* 53 */         double ☃ = (this.a.H * this.a.H);
/*    */         
/* 55 */         if (this.a.d(this.p) < ☃ || (this.a.r > this.p.p() && this.a.d(new el(this.p.o(), xq.c(this.a.r), this.p.q())) < ☃)) {
/* 56 */           this.p = null;
/*    */         } else {
/* 58 */           this.a.r().a(this.p.o(), this.p.p(), this.p.q(), this.d);
/*    */         } 
/*    */       } 
/*    */       return;
/*    */     } 
/* 63 */     super.d();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aiy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */