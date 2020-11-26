/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ public abstract class bcm
/*    */   extends bcs
/*    */   implements ben
/*    */ {
/* 22 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   protected bcm(bcs.c ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bgy c(blc ☃) {
/* 30 */     return bgy.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 35 */     if (☃.c() == blc1.c()) {
/*    */       return;
/*    */     }
/* 38 */     super.a(☃, axy1, el1, blc1, bool);
/* 39 */     axy1.n(el1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 44 */     if (bji1 instanceof adr && ((adr)bji1).O_()) {
/* 45 */       aog1.b(ws.a.b(this));
/* 46 */       aog1.a(0.005F);
/* 47 */       if (☃.B) {
/* 48 */         a.debug("Never going to hit this!");
/*    */         
/*    */         return;
/*    */       } 
/* 52 */       int i = awg.a(awi.v, ate1);
/* 53 */       ata ata = a(blc1, ☃, el1, i).h();
/* 54 */       if (ata == atf.a) {
/*    */         return;
/*    */       }
/*    */       
/* 58 */       ate ate2 = new ate(ata, a(blc1, ☃.s));
/* 59 */       ate2.a(((adr)bji1).e());
/* 60 */       a(☃, el1, ate2);
/*    */     } else {
/* 62 */       super.a(☃, aog1, el1, blc1, (bji)null, ate1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, int i, int j) {
/* 68 */     super.a(☃, axy1, el1, i, j);
/*    */     
/* 70 */     bji bji = axy1.f(el1);
/* 71 */     if (bji == null) {
/* 72 */       return false;
/*    */     }
/* 74 */     return bji.c(i, j);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bcm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */