/*    */ import javax.annotation.Nullable;
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
/*    */ public class ajx
/*    */   extends ajt
/*    */ {
/*    */   public ajx(axy ☃) {
/* 21 */     super(aev.V, ☃);
/* 22 */     a(0.9F, 1.4F);
/* 23 */     this.bF = bct.dV;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aog ☃, adk adk1) {
/* 28 */     ate ate = ☃.b(adk1);
/* 29 */     if (ate.b() == atf.D && i() >= 0 && !☃.bV.d) {
/* 30 */       ate.g(1);
/* 31 */       if (ate.a()) {
/* 32 */         ☃.a(adk1, new ate(atf.E));
/* 33 */       } else if (!☃.bB.e(new ate(atf.E))) {
/* 34 */         ☃.a(new ate(atf.E), false);
/*    */       } 
/* 36 */       return true;
/*    */     } 
/* 38 */     if (ate.b() == atf.bR && i() >= 0) {
/* 39 */       this.m.a(fm.u, this.q, this.r + (this.I / 2.0F), this.s, 0.0D, 0.0D, 0.0D);
/* 40 */       if (!this.m.B) {
/* 41 */         V();
/* 42 */         ajt ajt1 = new ajt(this.m);
/* 43 */         ajt1.b(this.q, this.r, this.s, this.w, this.x);
/* 44 */         ajt1.l(cq());
/* 45 */         ajt1.aQ = this.aQ;
/* 46 */         if (O_()) {
/* 47 */           ajt1.b(e());
/*    */         }
/* 49 */         this.m.a(ajt1);
/* 50 */         for (int i = 0; i < 5; i++) {
/* 51 */           this.m.a(new amm(this.m, this.q, this.r + this.I, this.s, new ate(bct.bA)));
/*    */         }
/* 53 */         ate.a(1, ☃);
/* 54 */         a(wj.fp, 1.0F, 1.0F);
/*    */       } 
/* 56 */       return true;
/*    */     } 
/* 58 */     return super.a(☃, adk1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ajx c(aeo ☃) {
/* 63 */     return new ajx(this.m);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected pc G() {
/* 69 */     return ccl.T;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ajx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */