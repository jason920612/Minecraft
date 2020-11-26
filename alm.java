/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alm
/*    */   extends alf
/*    */ {
/*    */   private cee b;
/*    */   
/*    */   public alm(ald ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 21 */     cee ☃ = this.a.a(1.0F).a();
/* 22 */     ☃.b(-0.7853982F);
/*    */     
/* 24 */     double d1 = this.a.bD.q;
/* 25 */     double d2 = this.a.bD.r + (this.a.bD.I / 2.0F);
/* 26 */     double d3 = this.a.bD.s;
/* 27 */     for (int i = 0; i < 8; i++) {
/* 28 */       double d4 = d1 + this.a.ce().nextGaussian() / 2.0D;
/* 29 */       double d5 = d2 + this.a.ce().nextGaussian() / 2.0D;
/* 30 */       double d6 = d3 + this.a.ce().nextGaussian() / 2.0D;
/* 31 */       this.a.m.a(fm.j, d4, d5, d6, -☃.b * 0.07999999821186066D + this.a.t, -☃.c * 0.30000001192092896D + this.a.u, -☃.d * 0.07999999821186066D + this.a.v);
/* 32 */       ☃.b(0.19634955F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 38 */     if (this.b == null) {
/* 39 */       this.b = new cee(this.a.m.a(bor.a.e, bqn.a));
/*    */     }
/*    */     
/* 42 */     if (this.b.c(this.a.q, this.a.r, this.a.s) < 1.0D) {
/* 43 */       ((alp)this.a.dr().<alp>b(alt.f)).j();
/* 44 */       this.a.dr().a(alt.g);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 50 */     return 1.5F;
/*    */   }
/*    */ 
/*    */   
/*    */   public float h() {
/* 55 */     float ☃ = xq.a(this.a.t * this.a.t + this.a.v * this.a.v) + 1.0F;
/* 56 */     float f1 = Math.min(☃, 40.0F);
/*    */     
/* 58 */     return f1 / ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 63 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cee g() {
/* 69 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public alt<alm> i() {
/* 74 */     return alt.d;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\alm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */