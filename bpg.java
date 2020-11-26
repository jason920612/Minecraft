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
/*    */ public class bpg
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 19 */     blc blc = ☃.a_(el1);
/* 20 */     while ((blc.f() || blc.a(wv.A)) && el1.p() > 1) {
/* 21 */       el1 = el1.b();
/* 22 */       blc = ☃.a_(el1);
/*    */     } 
/*    */     
/* 25 */     if (el1.p() < 1) {
/* 26 */       return false;
/*    */     }
/* 28 */     el1 = el1.a();
/*    */     
/* 30 */     for (int i = 0; i < 4; i++) {
/* 31 */       el el2 = el1.a(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
/*    */       
/* 33 */       if (☃.c(el2) && ☃.a_(el2.b()).q()) {
/* 34 */         ☃.a(el2, bct.ck.p(), 2);
/*    */         
/* 36 */         bka.a(☃, random, el2, ccl.b);
/*    */         
/* 38 */         el el3 = el2.f();
/* 39 */         el el4 = el2.e();
/* 40 */         el el5 = el2.c();
/* 41 */         el el6 = el2.d();
/* 42 */         if (☃.c(el4) && ☃.a_(el4.b()).q()) {
/* 43 */           ☃.a(el4, bct.cf.p(), 2);
/*    */         }
/* 45 */         if (☃.c(el3) && ☃.a_(el3.b()).q()) {
/* 46 */           ☃.a(el3, bct.cf.p(), 2);
/*    */         }
/* 48 */         if (☃.c(el5) && ☃.a_(el5.b()).q()) {
/* 49 */           ☃.a(el5, bct.cf.p(), 2);
/*    */         }
/* 51 */         if (☃.c(el6) && ☃.a_(el6.b()).q()) {
/* 52 */           ☃.a(el6, bct.cf.p(), 2);
/*    */         }
/* 54 */         return true;
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */