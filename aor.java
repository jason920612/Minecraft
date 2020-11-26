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
/*    */ public class aor
/*    */   extends aol
/*    */ {
/* 15 */   public int e = 1;
/*    */   
/*    */   public aor(axy ☃) {
/* 18 */     super(aev.I, ☃, 1.0F, 1.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public aor(axy ☃, afa afa1, double d1, double d2, double d3) {
/* 26 */     super(aev.I, afa1, d1, d2, d3, ☃, 1.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ceb ☃) {
/* 31 */     if (!this.m.B) {
/* 32 */       if (☃.d != null) {
/* 33 */         ☃.d.a(aea.a(this, this.a), 6.0F);
/* 34 */         a(this.a, ☃.d);
/*    */       } 
/* 36 */       boolean bool = this.m.X().b("mobGriefing");
/* 37 */       this.m.a((aer)null, this.q, this.r, this.s, this.e, bool, bool);
/* 38 */       V();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(gy ☃) {
/* 44 */     super.b(☃);
/* 45 */     ☃.b("ExplosionPower", this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gy ☃) {
/* 50 */     super.a(☃);
/* 51 */     if (☃.c("ExplosionPower", 99))
/* 52 */       this.e = ☃.h("ExplosionPower"); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */