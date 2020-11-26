/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahq
/*    */   extends agt
/*    */ {
/*    */   private final afb a;
/*    */   private double b;
/*    */   private double c;
/*    */   private int d;
/*    */   
/*    */   public ahq(afb ☃) {
/* 13 */     this.a = ☃;
/* 14 */     a(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 19 */     return (this.a.ce().nextFloat() < 0.02F);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 24 */     return (this.d >= 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 29 */     double ☃ = 6.283185307179586D * this.a.ce().nextDouble();
/* 30 */     this.b = Math.cos(☃);
/* 31 */     this.c = Math.sin(☃);
/* 32 */     this.d = 20 + this.a.ce().nextInt(20);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 37 */     this.d--;
/* 38 */     this.a.p().a(this.a.q + this.b, this.a.r + this.a.bF(), this.a.s + this.c, this.a.L(), this.a.K());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */