/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqv
/*    */   extends apv
/*    */ {
/*    */   private final ade a;
/*    */   
/*    */   public aqv(aof ☃, ade ade1, aog aog1) {
/* 13 */     this.a = ade1;
/* 14 */     ade1.b(aog1);
/*    */     
/* 16 */     int i = 3;
/* 17 */     int j = 9;
/*    */     int k;
/* 19 */     for (k = 0; k < 3; k++) {
/* 20 */       for (int m = 0; m < 9; m++) {
/* 21 */         a(new aqw(ade1, m + k * 9, 8 + m * 18, 18 + k * 18));
/*    */       }
/*    */     } 
/*    */     
/* 25 */     for (k = 0; k < 3; k++) {
/* 26 */       for (int m = 0; m < 9; m++) {
/* 27 */         a(new aqx(☃, m + k * 9 + 9, 8 + m * 18, 84 + k * 18));
/*    */       }
/*    */     } 
/* 30 */     for (k = 0; k < 9; k++) {
/* 31 */       a(new aqx(☃, k, 8 + k * 18, 142));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aog ☃) {
/* 37 */     return this.a.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate b(aog ☃, int i) {
/* 42 */     ate ate = ate.a;
/* 43 */     aqx aqx = this.c.get(i);
/* 44 */     if (aqx != null && aqx.e()) {
/* 45 */       ate ate1 = aqx.d();
/* 46 */       ate = ate1.i();
/*    */       
/* 48 */       if (i < this.a.T_()) {
/* 49 */         if (!a(ate1, this.a.T_(), this.c.size(), true)) {
/* 50 */           return ate.a;
/*    */         }
/*    */       }
/* 53 */       else if (!a(ate1, 0, this.a.T_(), false)) {
/* 54 */         return ate.a;
/*    */       } 
/*    */       
/* 57 */       if (ate1.a()) {
/* 58 */         aqx.d(ate.a);
/*    */       } else {
/* 60 */         aqx.f();
/*    */       } 
/*    */     } 
/* 63 */     return ate;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(aog ☃) {
/* 68 */     super.b(☃);
/* 69 */     this.a.c(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */