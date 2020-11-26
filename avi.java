/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avi
/*    */   extends avd
/*    */ {
/*    */   public avi(pc ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 17 */     if (!(☃ instanceof aqc)) {
/* 18 */       return false;
/*    */     }
/*    */     
/* 21 */     int i = 0;
/* 22 */     ate ate = ate.a;
/*    */     
/* 24 */     for (int j = 0; j < ☃.T_(); j++) {
/* 25 */       ate ate1 = ☃.a(j);
/* 26 */       if (!ate1.a())
/*    */       {
/*    */ 
/*    */         
/* 30 */         if (ate1.b() == atf.bQ) {
/* 31 */           if (!ate.a()) {
/* 32 */             return false;
/*    */           }
/* 34 */           ate = ate1;
/* 35 */         } else if (ate1.b() == atf.dG) {
/* 36 */           i++;
/*    */         } else {
/* 38 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 42 */     return (!ate.a() && i > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 47 */     int i = 0;
/* 48 */     ate ate1 = ate.a;
/*    */     
/* 50 */     for (int j = 0; j < ☃.T_(); j++) {
/* 51 */       ate ate = ☃.a(j);
/* 52 */       if (!ate.a())
/*    */       {
/*    */ 
/*    */         
/* 56 */         if (ate.b() == atf.bQ) {
/* 57 */           if (!ate1.a()) {
/* 58 */             return ate.a;
/*    */           }
/* 60 */           ate1 = ate;
/* 61 */         } else if (ate.b() == atf.dG) {
/* 62 */           i++;
/*    */         } else {
/* 64 */           return ate.a;
/*    */         } 
/*    */       }
/*    */     } 
/* 68 */     if (ate1.a() || i < 1) {
/* 69 */       return ate.a;
/*    */     }
/*    */     
/* 72 */     ate ate2 = ate1.i();
/* 73 */     ate2.e(i + 1);
/*    */     
/* 75 */     return ate2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 85 */     return avn.e;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */