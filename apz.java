/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apz
/*    */   extends apv
/*    */ {
/*    */   private final ade a;
/*    */   private final int f;
/*    */   
/*    */   public apz(ade ☃, ade ade1, aog aog1) {
/* 12 */     this.a = ade1;
/* 13 */     this.f = ade1.T_() / 9;
/* 14 */     ade1.b(aog1);
/*    */     
/* 16 */     int i = (this.f - 4) * 18;
/*    */     int j;
/* 18 */     for (j = 0; j < this.f; j++) {
/* 19 */       for (int k = 0; k < 9; k++) {
/* 20 */         a(new aqx(ade1, k + j * 9, 8 + k * 18, 18 + j * 18));
/*    */       }
/*    */     } 
/*    */     
/* 24 */     for (j = 0; j < 3; j++) {
/* 25 */       for (int k = 0; k < 9; k++) {
/* 26 */         a(new aqx(☃, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
/*    */       }
/*    */     } 
/* 29 */     for (j = 0; j < 9; j++) {
/* 30 */       a(new aqx(☃, j, 8 + j * 18, 161 + i));
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
/* 47 */       if (i < this.f * 9) {
/* 48 */         if (!a(ate1, this.f * 9, this.c.size(), true)) {
/* 49 */           return ate.a;
/*    */         }
/*    */       }
/* 52 */       else if (!a(ate1, 0, this.f * 9, false)) {
/* 53 */         return ate.a;
/*    */       } 
/*    */       
/* 56 */       if (ate1.a()) {
/* 57 */         aqx.d(ate.a);
/*    */       } else {
/* 59 */         aqx.f();
/*    */       } 
/*    */     } 
/* 62 */     return ate;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(aog ☃) {
/* 67 */     super.b(☃);
/* 68 */     this.a.c(☃);
/*    */   }
/*    */   
/*    */   public ade d() {
/* 72 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\apz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */