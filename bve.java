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
/*    */ public class bve
/*    */   extends bvg<bry>
/*    */ {
/*    */   public <C extends bqp> boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bry bry1, bqo<C> bqo1, C c) {
/* 20 */     boolean bool = false;
/*    */     
/* 22 */     if (random.nextInt(700) == 0) {
/* 23 */       int i = random.nextInt(16);
/* 24 */       int j = random.nextInt(16);
/* 25 */       int k = ☃.a(bor.a.d, el1.a(i, 0, j)).p();
/* 26 */       if (k > 0) {
/* 27 */         int m = k + 3 + random.nextInt(7);
/* 28 */         el el2 = el1.a(i, m, j);
/* 29 */         bqo1.a(☃, bmy1, random, el2, c);
/*    */         
/* 31 */         bji bji = ☃.f(el1);
/* 32 */         if (bji instanceof bkg) {
/* 33 */           bkg bkg = (bkg)bji;
/* 34 */           bkg.b(((boy)bmy1).f());
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 39 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */