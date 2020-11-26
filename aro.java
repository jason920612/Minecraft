/*    */ import java.util.List;
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
/*    */ public class aro
/*    */   extends ata
/*    */ {
/*    */   public aro(ata.a ☃) {
/* 23 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 28 */     List<aep> list = ☃.a(aep.class, aog1.bD().g(2.0D), ☃ -> (☃ != null && ☃.aF() && ☃.t() instanceof ald));
/*    */     
/* 30 */     ate ate = aog1.b(adk1);
/*    */     
/* 32 */     if (!list.isEmpty()) {
/* 33 */       aep aep = list.get(0);
/* 34 */       aep.a(aep.f() - 0.5F);
/*    */       
/* 36 */       ☃.a((aog)null, aog1.q, aog1.r, aog1.s, wj.aa, wk.g, 1.0F, 1.0F);
/* 37 */       return new adn<>(adm.a, a(ate, aog1, new ate(atf.cr)));
/*    */     } 
/*    */     
/* 40 */     ceb ceb = a(☃, aog1, true);
/* 41 */     if (ceb == null) {
/* 42 */       return new adn<>(adm.b, ate);
/*    */     }
/*    */     
/* 45 */     if (ceb.a == ceb.a.b) {
/* 46 */       el el = ceb.a();
/*    */       
/* 48 */       if (!☃.a(aog1, el)) {
/* 49 */         return new adn<>(adm.b, ate);
/*    */       }
/* 51 */       if (☃.b(el).a(ww.a)) {
/* 52 */         ☃.a(aog1, aog1.q, aog1.r, aog1.s, wj.Z, wk.g, 1.0F, 1.0F);
/* 53 */         return new adn<>(adm.a, a(ate, aog1, auv.a(new ate(atf.cn), auw.b)));
/*    */       } 
/*    */     } 
/*    */     
/* 57 */     return new adn<>(adm.b, ate);
/*    */   }
/*    */   
/*    */   protected ate a(ate ☃, aog aog1, ate ate1) {
/* 61 */     ☃.g(1);
/* 62 */     aog1.b(ws.c.b(this));
/* 63 */     if (☃.a()) {
/* 64 */       return ate1;
/*    */     }
/* 66 */     if (!aog1.bB.e(ate1)) {
/* 67 */       aog1.a(ate1, false);
/*    */     }
/* 69 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */