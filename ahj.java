/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahj
/*    */   extends agt
/*    */ {
/*    */   private final afg a;
/*    */   private afa b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private final double f;
/*    */   private final float g;
/*    */   
/*    */   public ahj(afg ☃, double d, float f) {
/* 19 */     this.a = ☃;
/* 20 */     this.f = d;
/* 21 */     this.g = f;
/* 22 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     this.b = this.a.v();
/* 28 */     if (this.b == null) {
/* 29 */       return false;
/*    */     }
/* 31 */     if (this.b.h(this.a) > (this.g * this.g)) {
/* 32 */       return false;
/*    */     }
/* 34 */     cee ☃ = ajd.a(this.a, 16, 7, new cee(this.b.q, this.b.r, this.b.s));
/* 35 */     if (☃ == null) {
/* 36 */       return false;
/*    */     }
/* 38 */     this.c = ☃.b;
/* 39 */     this.d = ☃.c;
/* 40 */     this.e = ☃.d;
/* 41 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 46 */     return (!this.a.t().p() && this.b.aF() && this.b.h(this.a) < (this.g * this.g));
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 51 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 56 */     this.a.t().a(this.c, this.d, this.e, this.f);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */