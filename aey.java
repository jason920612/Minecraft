/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class aey
/*    */   extends afb
/*    */ {
/*    */   protected aey(aev<?> ☃, axy axy1) {
/* 10 */     super(☃, axy1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void c(float ☃, float f1) {}
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(double ☃, boolean bool, blc blc1, el el1) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(float ☃, float f1, float f2) {
/* 25 */     if (an()) {
/* 26 */       a(☃, f1, f2, 0.02F);
/* 27 */       a(afe.a, this.t, this.u, this.v);
/*    */       
/* 29 */       this.t *= 0.800000011920929D;
/* 30 */       this.u *= 0.800000011920929D;
/* 31 */       this.v *= 0.800000011920929D;
/* 32 */     } else if (ax()) {
/* 33 */       a(☃, f1, f2, 0.02F);
/* 34 */       a(afe.a, this.t, this.u, this.v);
/* 35 */       this.t *= 0.5D;
/* 36 */       this.u *= 0.5D;
/* 37 */       this.v *= 0.5D;
/*    */     } else {
/* 39 */       float f3 = 0.91F;
/* 40 */       if (this.A) {
/* 41 */         f3 = this.m.a_(new el(xq.c(this.q), xq.c((bD()).b) - 1, xq.c(this.s))).c().n() * 0.91F;
/*    */       }
/*    */       
/* 44 */       float f4 = 0.16277137F / f3 * f3 * f3;
/* 45 */       a(☃, f1, f2, this.A ? (0.1F * f4) : 0.02F);
/*    */       
/* 47 */       f3 = 0.91F;
/* 48 */       if (this.A) {
/* 49 */         f3 = this.m.a_(new el(xq.c(this.q), xq.c((bD()).b) - 1, xq.c(this.s))).c().n() * 0.91F;
/*    */       }
/*    */       
/* 52 */       a(afe.a, this.t, this.u, this.v);
/*    */       
/* 54 */       this.t *= f3;
/* 55 */       this.u *= f3;
/* 56 */       this.v *= f3;
/*    */     } 
/* 58 */     this.aI = this.aJ;
/* 59 */     double d1 = this.q - this.n;
/* 60 */     double d2 = this.s - this.p;
/* 61 */     float f = xq.a(d1 * d1 + d2 * d2) * 4.0F;
/* 62 */     if (f > 1.0F) {
/* 63 */       f = 1.0F;
/*    */     }
/* 65 */     this.aJ += (f - this.aJ) * 0.4F;
/* 66 */     this.aK += this.aJ;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean z_() {
/* 71 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */