/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avu
/*    */   extends avd
/*    */ {
/*    */   public avu(pc ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 18 */     if (☃.U_() != 3 || ☃.n() != 3) {
/* 19 */       return false;
/*    */     }
/*    */     
/* 22 */     for (int i = 0; i < ☃.U_(); i++) {
/* 23 */       for (int j = 0; j < ☃.n(); j++) {
/* 24 */         ate ate = ☃.a(i + j * ☃.U_());
/*    */         
/* 26 */         if (ate.a()) {
/* 27 */           return false;
/*    */         }
/*    */         
/* 30 */         ata ata = ate.b();
/* 31 */         if (i == 1 && j == 1) {
/* 32 */           if (ata != atf.cp) {
/* 33 */             return false;
/*    */           }
/* 35 */         } else if (ata != atf.h) {
/* 36 */           return false;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 41 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 46 */     ate ate1 = ☃.a(1 + ☃.U_());
/* 47 */     if (ate1.b() != atf.cp) {
/* 48 */       return ate.a;
/*    */     }
/*    */     
/* 51 */     ate ate2 = new ate(atf.j, 8);
/* 52 */     auv.a(ate2, auv.d(ate1));
/* 53 */     auv.a(ate2, auv.b(ate1));
/*    */     
/* 55 */     return ate2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 65 */     return avn.k;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */