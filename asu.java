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
/*    */ public class asu
/*    */   extends ata
/*    */ {
/*    */   public asu(ata.a ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 26 */     aog aog = ☃.j();
/* 27 */     axz axz = ☃.k();
/* 28 */     el el = ☃.a().a(☃.l());
/*    */     
/* 30 */     if (a(axz, el)) {
/* 31 */       axz.a(aog, el, wj.cK, wk.e, 1.0F, i.nextFloat() * 0.4F + 0.8F);
/* 32 */       blc blc = ((bet)bct.ch).a(axz, el);
/* 33 */       axz.a(el, blc, 11);
/*    */       
/* 35 */       ate ate = ☃.i();
/* 36 */       if (aog instanceof tf) {
/* 37 */         p.y.a((tf)aog, el, ate);
/*    */       }
/*    */       
/* 40 */       if (aog != null) {
/* 41 */         ate.a(1, aog);
/*    */       }
/*    */       
/* 44 */       return adm.a;
/*    */     } 
/*    */     
/* 47 */     return adm.c;
/*    */   }
/*    */   
/*    */   public static boolean a(axz ☃, el el1) {
/* 51 */     blc blc = ((bet)bct.ch).a(☃, el1);
/*    */     
/* 53 */     boolean bool = false;
/* 54 */     for (eq eq : eq.c.a) {
/* 55 */       if (☃.a_(el1.a(eq)).c() == bct.ce && ((bgc)bct.dh).b(☃, el1) != null) {
/* 56 */         bool = true;
/*    */       }
/*    */     } 
/*    */     
/* 60 */     return (☃.c(el1) && (blc.a(☃, el1) || bool));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\asu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */