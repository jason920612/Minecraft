/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aik
/*    */   extends ais
/*    */ {
/*    */   private final ajw a;
/*    */   private afa b;
/*    */   
/*    */   public aik(ajw ☃) {
/* 13 */     super(☃, false, true);
/* 14 */     this.a = ☃;
/* 15 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 20 */     ajg ☃ = this.a.l();
/* 21 */     if (☃ == null) {
/* 22 */       return false;
/*    */     }
/* 24 */     this.b = ☃.b(this.a);
/* 25 */     if (this.b instanceof amt) {
/* 26 */       return false;
/*    */     }
/* 28 */     if (a(this.b, false)) {
/* 29 */       return true;
/*    */     }
/*    */     
/* 32 */     if (this.e.ce().nextInt(20) == 0) {
/* 33 */       this.b = ☃.c(this.a);
/* 34 */       return a(this.b, false);
/*    */     } 
/* 36 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 42 */     this.a.e(this.b);
/* 43 */     super.c();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */