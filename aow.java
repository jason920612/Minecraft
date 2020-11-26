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
/*    */ public class aow
/*    */   extends aol
/*    */ {
/*    */   public aow(axy ☃) {
/* 17 */     super(aev.an, ☃, 0.3125F, 0.3125F);
/*    */   }
/*    */   
/*    */   public aow(axy ☃, afa afa1, double d1, double d2, double d3) {
/* 21 */     super(aev.an, afa1, d1, d2, d3, ☃, 0.3125F, 0.3125F);
/*    */   }
/*    */   
/*    */   public aow(axy ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 25 */     super(aev.an, d1, d2, d3, d4, d5, d6, ☃, 0.3125F, 0.3125F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ceb ☃) {
/* 30 */     if (!this.m.B) {
/* 31 */       if (☃.d != null) {
/* 32 */         if (!☃.d.am()) {
/* 33 */           ☃.d.f(5);
/* 34 */           boolean bool = ☃.d.a(aea.a(this, this.a), 5.0F);
/* 35 */           if (bool) {
/* 36 */             a(this.a, ☃.d);
/*    */           }
/*    */         } 
/*    */       } else {
/* 40 */         boolean bool = true;
/* 41 */         if (this.a != null && this.a instanceof afb) {
/* 42 */           bool = this.m.X().b("mobGriefing");
/*    */         }
/* 44 */         if (bool) {
/* 45 */           el el = ☃.a().a(☃.b);
/* 46 */           if (this.m.c(el)) {
/* 47 */             this.m.a(el, bct.ch.p());
/*    */           }
/*    */         } 
/*    */       } 
/* 51 */       V();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean aB() {
/* 57 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aea ☃, float f) {
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */