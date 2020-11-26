/*    */ 
/*    */ 
/*    */ 
/*    */ public class afx
/*    */   extends aga
/*    */ {
/*    */   private final int h;
/*    */   
/*    */   public afx(afb ☃, int i) {
/* 10 */     super(☃);
/* 11 */     this.h = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 16 */     if (this.d) {
/* 17 */       this.d = false;
/*    */       
/* 19 */       double d1 = this.e - this.a.q;
/* 20 */       double d2 = this.f - this.a.r + this.a.bF();
/* 21 */       double d3 = this.g - this.a.s;
/* 22 */       double d4 = xq.a(d1 * d1 + d3 * d3);
/*    */       
/* 24 */       float f1 = (float)(xq.c(d3, d1) * 57.2957763671875D) - 90.0F + 20.0F;
/* 25 */       float f2 = (float)-(xq.c(d2, d4) * 57.2957763671875D) + 10.0F;
/* 26 */       this.a.x = a(this.a.x, f2, this.c);
/*    */       
/* 28 */       this.a.aS = a(this.a.aS, f1, this.b);
/*    */     } else {
/* 30 */       if (this.a.t().p()) {
/* 31 */         this.a.x = a(this.a.x, 0.0F, 5.0F);
/*    */       }
/* 33 */       this.a.aS = a(this.a.aS, this.a.aQ, this.b);
/*    */     } 
/*    */     
/* 36 */     float ☃ = xq.g(this.a.aS - this.a.aQ);
/*    */ 
/*    */     
/* 39 */     if (☃ < -this.h) {
/* 40 */       this.a.aQ -= 4.0F;
/* 41 */     } else if (☃ > this.h) {
/* 42 */       this.a.aQ += 4.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */