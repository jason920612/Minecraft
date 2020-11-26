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
/*    */ public class bro
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 20 */     if (!☃.c(el1)) {
/* 21 */       return false;
/*    */     }
/* 23 */     if (☃.a_(el1.a()).c() != bct.de) {
/* 24 */       return false;
/*    */     }
/* 26 */     ☃.a(el1, bct.dg.p(), 2);
/*    */     
/* 28 */     for (int i = 0; i < 1500; i++) {
/* 29 */       el el2 = el1.a(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
/* 30 */       if (☃.a_(el2).f()) {
/*    */ 
/*    */ 
/*    */         
/* 34 */         int j = 0;
/* 35 */         for (eq eq : eq.values()) {
/* 36 */           if (☃.a_(el2.a(eq)).c() == bct.dg) {
/* 37 */             j++;
/*    */           }
/*    */           
/* 40 */           if (j > 1) {
/*    */             break;
/*    */           }
/*    */         } 
/*    */         
/* 45 */         if (j == 1) {
/* 46 */           ☃.a(el2, bct.dg.p(), 2);
/*    */         }
/*    */       } 
/*    */     } 
/* 50 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */