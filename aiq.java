/*    */ 
/*    */ 
/*    */ 
/*    */ public class aiq
/*    */   extends ais
/*    */ {
/*    */   private final afl a;
/*    */   private afa b;
/*    */   private int c;
/*    */   
/*    */   public aiq(afl ☃) {
/* 12 */     super(☃, false);
/* 13 */     this.a = ☃;
/* 14 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 19 */     if (!this.a.dy()) {
/* 20 */       return false;
/*    */     }
/* 22 */     afa ☃ = this.a.dB();
/* 23 */     if (☃ == null) {
/* 24 */       return false;
/*    */     }
/* 26 */     this.b = ☃.cf();
/* 27 */     int i = ☃.cg();
/* 28 */     return (i != this.c && a(this.b, false) && this.a.a(this.b, ☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 33 */     this.e.e(this.b);
/*    */     
/* 35 */     afa ☃ = this.a.dB();
/* 36 */     if (☃ != null) {
/* 37 */       this.c = ☃.cg();
/*    */     }
/*    */     
/* 40 */     super.c();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aiq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */