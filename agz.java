/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agz
/*    */   extends agt
/*    */ {
/*    */   private final afb a;
/*    */   private afa b;
/*    */   private final float c;
/*    */   
/*    */   public agz(afb ☃, float f) {
/* 14 */     this.a = ☃;
/* 15 */     this.c = f;
/* 16 */     a(5);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 21 */     this.b = this.a.v();
/* 22 */     if (this.b == null) {
/* 23 */       return false;
/*    */     }
/* 25 */     double ☃ = this.a.h(this.b);
/* 26 */     if (☃ < 4.0D || ☃ > 16.0D) {
/* 27 */       return false;
/*    */     }
/* 29 */     if (!this.a.A) {
/* 30 */       return false;
/*    */     }
/* 32 */     if (this.a.ce().nextInt(5) != 0) {
/* 33 */       return false;
/*    */     }
/* 35 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 40 */     return !this.a.A;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 46 */     double ☃ = this.b.q - this.a.q;
/* 47 */     double d1 = this.b.s - this.a.s;
/* 48 */     float f = xq.a(☃ * ☃ + d1 * d1);
/* 49 */     if (f >= 1.0E-4D) {
/* 50 */       this.a.t += ☃ / f * 0.5D * 0.800000011920929D + this.a.t * 0.20000000298023224D;
/* 51 */       this.a.v += d1 / f * 0.5D * 0.800000011920929D + this.a.v * 0.20000000298023224D;
/*    */     } 
/* 53 */     this.a.u = this.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\agz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */