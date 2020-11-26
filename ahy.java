/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahy
/*    */   extends agt
/*    */ {
/*    */   private final ako a;
/*    */   private final double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   
/*    */   public ahy(ako ☃, double d) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = d;
/* 21 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 26 */     if (this.a.dJ() || !this.a.aX()) {
/* 27 */       return false;
/*    */     }
/* 29 */     cee ☃ = ajd.a(this.a, 5, 4);
/* 30 */     if (☃ == null) {
/* 31 */       return false;
/*    */     }
/* 33 */     this.c = ☃.b;
/* 34 */     this.d = ☃.c;
/* 35 */     this.e = ☃.d;
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 41 */     this.a.t().a(this.c, this.d, this.e, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 46 */     return (!this.a.dJ() && !this.a.t().p() && this.a.aX());
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 51 */     if (!this.a.dJ() && this.a.ce().nextInt(50) == 0) {
/* 52 */       aer ☃ = this.a.bP().get(0);
/* 53 */       if (☃ == null) {
/*    */         return;
/*    */       }
/*    */       
/* 57 */       if (☃ instanceof aog) {
/* 58 */         int i = this.a.dQ();
/* 59 */         int j = this.a.dW();
/* 60 */         if (j > 0 && this.a.ce().nextInt(j) < i) {
/* 61 */           this.a.h((aog)☃);
/*    */           return;
/*    */         } 
/* 64 */         this.a.r(5);
/*    */       } 
/*    */       
/* 67 */       this.a.aL();
/* 68 */       this.a.dZ();
/* 69 */       this.a.m.a(this.a, (byte)6);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */