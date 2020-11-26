/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahk
/*    */   extends agt
/*    */ {
/*    */   private final axk a;
/*    */   private final afb b;
/*    */   private afa c;
/*    */   private int d;
/*    */   
/*    */   public ahk(afb ☃) {
/* 16 */     this.b = ☃;
/* 17 */     this.a = ☃.m;
/* 18 */     a(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 23 */     afa ☃ = this.b.v();
/* 24 */     if (☃ == null) {
/* 25 */       return false;
/*    */     }
/* 27 */     this.c = ☃;
/* 28 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 33 */     if (!this.c.aF()) {
/* 34 */       return false;
/*    */     }
/* 36 */     if (this.b.h(this.c) > 225.0D) {
/* 37 */       return false;
/*    */     }
/* 39 */     return (!this.b.t().p() || a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 44 */     this.c = null;
/* 45 */     this.b.t().q();
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 50 */     this.b.p().a(this.c, 30.0F, 30.0F);
/*    */     
/* 52 */     double ☃ = (this.b.H * 2.0F * this.b.H * 2.0F);
/* 53 */     double d1 = this.b.d(this.c.q, (this.c.bD()).b, this.c.s);
/*    */     
/* 55 */     double d2 = 0.8D;
/* 56 */     if (d1 > ☃ && d1 < 16.0D) {
/* 57 */       d2 = 1.33D;
/* 58 */     } else if (d1 < 225.0D) {
/* 59 */       d2 = 0.6D;
/*    */     } 
/*    */     
/* 62 */     this.b.t().a(this.c, d2);
/*    */     
/* 64 */     this.d = Math.max(this.d - 1, 0);
/*    */     
/* 66 */     if (d1 > ☃) {
/*    */       return;
/*    */     }
/* 69 */     if (this.d > 0) {
/*    */       return;
/*    */     }
/* 72 */     this.d = 20;
/* 73 */     this.b.B(this.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */