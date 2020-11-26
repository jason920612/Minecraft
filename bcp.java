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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcp
/*    */   extends bcm
/*    */ {
/*    */   public bcp(bcs.c ☃) {
/* 22 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bji a(axk ☃) {
/* 27 */     return new bjg();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 32 */     if (axy1.B) {
/* 33 */       return true;
/*    */     }
/*    */     
/* 36 */     bji bji = axy1.f(el1);
/* 37 */     if (bji instanceof bjg) {
/* 38 */       aog1.a((bjg)bji);
/* 39 */       aog1.a(ws.Z);
/*    */     } 
/*    */     
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃) {
/* 47 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public bgy c(blc ☃) {
/* 52 */     return bgy.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 57 */     if (ate1.s()) {
/* 58 */       bji bji = ☃.f(el1);
/* 59 */       if (bji instanceof bjg) {
/* 60 */         ((bjg)bji).a(ate1.q());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public axl c() {
/* 67 */     return axl.c;
/*    */   }
/*    */   
/*    */   public static void a(axy ☃, el el1) {
/* 71 */     xk.a.submit(() -> {
/*    */           bnj bnj = ☃.l(el1);
/*    */           int i = el1.p() - 1;
/*    */           while (i >= 0) {
/*    */             el el2 = new el(el1.o(), i, el1.q());
/*    */             if (bnj.c(el2)) {
/*    */               blc blc = ☃.a_(el2);
/*    */               if (blc.c() == bct.eu)
/*    */                 ((td)☃).a(()); 
/*    */               i--;
/*    */             } 
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */