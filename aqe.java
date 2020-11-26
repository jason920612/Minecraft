/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqe
/*    */   extends apv
/*    */ {
/*    */   private final ade a;
/*    */   
/*    */   public aqe(ade ☃, ade ade1) {
/* 16 */     this.a = ade1;
/*    */     int i;
/* 18 */     for (i = 0; i < 3; i++) {
/* 19 */       for (int j = 0; j < 3; j++) {
/* 20 */         a(new aqx(ade1, j + i * 3, 62 + j * 18, 17 + i * 18));
/*    */       }
/*    */     } 
/*    */     
/* 24 */     for (i = 0; i < 3; i++) {
/* 25 */       for (int j = 0; j < 9; j++) {
/* 26 */         a(new aqx(☃, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*    */       }
/*    */     } 
/* 29 */     for (i = 0; i < 9; i++) {
/* 30 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aog ☃) {
/* 36 */     return this.a.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate b(aog ☃, int i) {
/* 41 */     ate ate = ate.a;
/* 42 */     aqx aqx = this.c.get(i);
/* 43 */     if (aqx != null && aqx.e()) {
/* 44 */       ate ate1 = aqx.d();
/* 45 */       ate = ate1.i();
/*    */       
/* 47 */       if (i < 9) {
/* 48 */         if (!a(ate1, 9, 45, true)) {
/* 49 */           return ate.a;
/*    */         }
/*    */       }
/* 52 */       else if (!a(ate1, 0, 9, false)) {
/* 53 */         return ate.a;
/*    */       } 
/*    */       
/* 56 */       if (ate1.a()) {
/* 57 */         aqx.d(ate.a);
/*    */       } else {
/* 59 */         aqx.f();
/*    */       } 
/* 61 */       if (ate1.C() == ate.C())
/*    */       {
/* 63 */         return ate.a;
/*    */       }
/* 65 */       aqx.a(☃, ate1);
/*    */     } 
/*    */     
/* 68 */     return ate;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */