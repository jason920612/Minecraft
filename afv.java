/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afv
/*    */ {
/*    */   private final afa a;
/*    */   private int b;
/*    */   private float c;
/*    */   
/*    */   public afv(afa ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a() {
/* 18 */     double ☃ = this.a.q - this.a.n;
/* 19 */     double d1 = this.a.s - this.a.p;
/*    */     
/* 21 */     if (☃ * ☃ + d1 * d1 > 2.500000277905201E-7D) {
/*    */       
/* 23 */       this.a.aQ = this.a.w;
/* 24 */       this.a.aS = a(this.a.aQ, this.a.aS, 75.0F);
/* 25 */       this.c = this.a.aS;
/* 26 */       this.b = 0;
/*    */       
/*    */       return;
/*    */     } 
/* 30 */     if (this.a.bP().isEmpty() || !(this.a.bP().get(0) instanceof afb)) {
/*    */       
/* 32 */       float f = 75.0F;
/* 33 */       if (Math.abs(this.a.aS - this.c) > 15.0F) {
/* 34 */         this.b = 0;
/* 35 */         this.c = this.a.aS;
/*    */       } else {
/* 37 */         this.b++;
/* 38 */         int i = 10;
/* 39 */         if (this.b > 10) {
/* 40 */           f = Math.max(1.0F - (this.b - 10) / 10.0F, 0.0F) * 75.0F;
/*    */         }
/*    */       } 
/* 43 */       this.a.aQ = a(this.a.aS, this.a.aQ, f);
/*    */     } 
/*    */   }
/*    */   
/*    */   private float a(float ☃, float f1, float f2) {
/* 48 */     float f = xq.g(☃ - f1);
/* 49 */     if (f < -f2) {
/* 50 */       f = -f2;
/*    */     }
/* 52 */     if (f >= f2) {
/* 53 */       f = f2;
/*    */     }
/* 55 */     return ☃ - f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */