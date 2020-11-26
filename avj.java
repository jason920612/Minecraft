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
/*    */ public class avj
/*    */   extends avp
/*    */ {
/*    */   public avj(pc ☃) {
/* 15 */     super(☃, "", 3, 3, 
/* 16 */         ez.a(avh.a, new avh[] {
/* 17 */             avh.a(new axx[] { atf.aR }), avh.a(new axx[] { atf.aR }), avh.a(new axx[] { atf.aR
/* 18 */               }), avh.a(new axx[] { atf.aR }), avh.a(new axx[] { atf.bQ }), avh.a(new axx[] { atf.aR
/* 19 */               }), avh.a(new axx[] { atf.aR }), avh.a(new axx[] { atf.aR }), avh.a(new axx[] { atf.aR })
/*    */           }), new ate(atf.dG));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 27 */     if (!super.a(☃, axy1)) {
/* 28 */       return false;
/*    */     }
/* 30 */     ate ate = ate.a;
/*    */     
/* 32 */     for (int i = 0; i < ☃.T_() && ate.a(); i++) {
/* 33 */       ate ate1 = ☃.a(i);
/* 34 */       if (ate1.b() == atf.bQ) {
/* 35 */         ate = ate1;
/*    */       }
/*    */     } 
/*    */     
/* 39 */     if (ate.a()) {
/* 40 */       return false;
/*    */     }
/* 42 */     cbs cbs = atj.a(ate, axy1);
/* 43 */     if (cbs == null) {
/* 44 */       return false;
/*    */     }
/*    */     
/* 47 */     if (a(cbs)) {
/* 48 */       return false;
/*    */     }
/*    */     
/* 51 */     return (cbs.f < 4);
/*    */   }
/*    */   
/*    */   private boolean a(cbs ☃) {
/* 55 */     if (☃.i != null) {
/* 56 */       for (cbq cbq : ☃.i.values()) {
/* 57 */         if (cbq.b() == cbq.a.i || cbq.b() == cbq.a.j) {
/* 58 */           return true;
/*    */         }
/*    */       } 
/*    */     }
/* 62 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 67 */     ate ate = ate.a;
/*    */     
/* 69 */     for (int i = 0; i < ☃.T_() && ate.a(); i++) {
/* 70 */       ate ate1 = ☃.a(i);
/* 71 */       if (ate1.b() == atf.bQ) {
/* 72 */         ate = ate1;
/*    */       }
/*    */     } 
/*    */     
/* 76 */     ate = ate.i();
/* 77 */     ate.e(1);
/* 78 */     ate.o().b("map_scale_direction", 1);
/*    */     
/* 80 */     return ate;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 85 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 90 */     return avn.f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */