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
/*    */ public class bql
/*    */   extends bqo<bqk>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, bqk bqk1) {
/* 18 */     for (el.a a : el.b(el1.a(-1, -2, -1), el1.a(1, 2, 1))) {
/* 19 */       boolean bool1 = (a.o() == el1.o());
/* 20 */       boolean bool2 = (a.p() == el1.p());
/* 21 */       boolean bool3 = (a.q() == el1.q());
/* 22 */       boolean bool4 = (Math.abs(a.p() - el1.p()) == 2);
/*    */       
/* 24 */       if (bool1 && bool2 && bool3) {
/* 25 */         el el2 = a.h();
/* 26 */         a(☃, el2, bct.ig.p());
/* 27 */         if (bqk1.a()) {
/* 28 */           bji bji = ☃.f(el2);
/* 29 */           if (bji instanceof bkg) {
/* 30 */             bkg bkg = (bkg)bji;
/* 31 */             bkg.b(boi.g);
/*    */           } 
/*    */         }  continue;
/* 34 */       }  if (bool2) {
/* 35 */         a(☃, a, bct.a.p()); continue;
/* 36 */       }  if (bool4 && bool1 && bool3) {
/* 37 */         a(☃, a, bct.z.p()); continue;
/* 38 */       }  if ((!bool1 && !bool3) || bool4) {
/* 39 */         a(☃, a, bct.a.p()); continue;
/*    */       } 
/* 41 */       a(☃, a, bct.z.p());
/*    */     } 
/*    */ 
/*    */     
/* 45 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */