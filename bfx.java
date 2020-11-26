/*    */ import java.util.Random;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfx
/*    */   extends bcs
/*    */ {
/*    */   public bfx(bcs.c ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, aer aer1) {
/* 31 */     if (!aer1.am() && aer1 instanceof afa && !awg.i((afa)aer1)) {
/* 32 */       aer1.a(aea.e, 1.0F);
/*    */     }
/*    */     
/* 35 */     super.a(☃, el1, aer1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 45 */     bcy.a(axy1, el1.a(), true);
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 50 */     if (eq1 == eq.b && blc1.c() == bct.A) {
/* 51 */       axz1.J().a(el1, this, a(axz1));
/*    */     }
/*    */     
/* 54 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(blc ☃, axy axy1, el el1, Random random) {
/* 59 */     el el2 = el1.a();
/* 60 */     if (axy1.b(el1).a(ww.a)) {
/* 61 */       axy1.a((aog)null, el1, wj.cI, wk.e, 0.5F, 2.6F + (axy1.s.nextFloat() - axy1.s.nextFloat()) * 0.8F);
/* 62 */       if (axy1 instanceof td) {
/* 63 */         ((td)axy1).a(fm.F, el2.o() + 0.5D, el2.p() + 0.25D, el2.q() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(ayc ☃) {
/* 70 */     return 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 75 */     axy1.J().a(el1, this, a(axy1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, aer aer1) {
/* 80 */     return aer1.am();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean e(blc ☃, axk axk1, el el1) {
/* 85 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bfx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */