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
/*    */ public class beg
/*    */   extends bec
/*    */ {
/* 18 */   private static final es c = new eo();
/*    */   
/*    */   public beg(bcs.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected es a(ate ☃) {
/* 26 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public bji a(axk ☃) {
/* 31 */     return new bjr();
/*    */   }
/*    */   
/*    */   protected void a(axy ☃, el el1) {
/*    */     ate ate2;
/* 36 */     en en = new en(☃, el1);
/* 37 */     bjq bjq = en.<bjq>g();
/*    */     
/* 39 */     int i = bjq.p();
/* 40 */     if (i < 0) {
/* 41 */       ☃.b(1001, el1, 0);
/*    */       
/*    */       return;
/*    */     } 
/* 45 */     ate ate1 = bjq.a(i);
/* 46 */     if (ate1.a()) {
/*    */       return;
/*    */     }
/*    */     
/* 50 */     eq eq = (eq)☃.a_(el1).c(a);
/* 51 */     ade ade = bjw.a(☃, el1.a(eq));
/*    */ 
/*    */     
/* 54 */     if (ade == null) {
/* 55 */       ate2 = c.dispense(en, ate1);
/*    */     } else {
/* 57 */       ate2 = bjw.a(bjq, ade, ate1.i().a(1), eq.d());
/*    */       
/* 59 */       if (ate2.a()) {
/* 60 */         ate2 = ate1.i();
/* 61 */         ate2.g(1);
/*    */       } else {
/*    */         
/* 64 */         ate2 = ate1.i();
/*    */       } 
/*    */     } 
/*    */     
/* 68 */     bjq.a(i, ate2);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\beg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */