/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahm
/*    */   extends agt
/*    */ {
/*    */   private final ajw a;
/*    */   private aob b;
/*    */   private int c;
/*    */   
/*    */   public ahm(ajw ☃) {
/* 15 */     this.a = ☃;
/* 16 */     a(3);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 21 */     if (!this.a.m.L()) {
/* 22 */       return false;
/*    */     }
/* 24 */     if (this.a.ce().nextInt(8000) != 0) {
/* 25 */       return false;
/*    */     }
/* 27 */     this.b = (aob)this.a.m.a(aob.class, this.a.bD().c(6.0D, 2.0D, 6.0D), this.a);
/* 28 */     return (this.b != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 33 */     return (this.c > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 38 */     this.c = 400;
/* 39 */     this.a.a(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 44 */     this.a.a(false);
/* 45 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 50 */     this.a.p().a(this.b, 30.0F, 30.0F);
/* 51 */     this.c--;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */