/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqj
/*    */   extends apv
/*    */ {
/*    */   private final ade a;
/*    */   
/*    */   public aqj(aof ☃, ade ade1, aog aog1) {
/* 12 */     this.a = ade1;
/* 13 */     ade1.b(aog1);
/* 14 */     int i = 51;
/*    */     int j;
/* 16 */     for (j = 0; j < ade1.T_(); j++) {
/* 17 */       a(new aqx(ade1, j, 44 + j * 18, 20));
/*    */     }
/*    */     
/* 20 */     for (j = 0; j < 3; j++) {
/* 21 */       for (int k = 0; k < 9; k++) {
/* 22 */         a(new aqx(☃, k + j * 9 + 9, 8 + k * 18, j * 18 + 51));
/*    */       }
/*    */     } 
/* 25 */     for (j = 0; j < 9; j++) {
/* 26 */       a(new aqx(☃, j, 8 + j * 18, 109));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aog ☃) {
/* 32 */     return this.a.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate b(aog ☃, int i) {
/* 37 */     ate ate = ate.a;
/* 38 */     aqx aqx = this.c.get(i);
/* 39 */     if (aqx != null && aqx.e()) {
/* 40 */       ate ate1 = aqx.d();
/* 41 */       ate = ate1.i();
/*    */       
/* 43 */       if (i < this.a.T_()) {
/* 44 */         if (!a(ate1, this.a.T_(), this.c.size(), true)) {
/* 45 */           return ate.a;
/*    */         }
/*    */       }
/* 48 */       else if (!a(ate1, 0, this.a.T_(), false)) {
/* 49 */         return ate.a;
/*    */       } 
/*    */       
/* 52 */       if (ate1.a()) {
/* 53 */         aqx.d(ate.a);
/*    */       } else {
/* 55 */         aqx.f();
/*    */       } 
/*    */     } 
/* 58 */     return ate;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(aog ☃) {
/* 63 */     super.b(☃);
/* 64 */     this.a.c(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */