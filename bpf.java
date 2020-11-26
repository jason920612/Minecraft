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
/*    */ public class bpf
/*    */   extends bqo<brz>
/*    */ {
/*    */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, brz brz1) {
/* 18 */     if (el1.p() > ☃.k() - 1) {
/* 19 */       return false;
/*    */     }
/* 21 */     if (☃.a_(el1).c() != bct.A && ☃.a_(el1.b()).c() != bct.A) {
/* 22 */       return false;
/*    */     }
/*    */     
/* 25 */     boolean bool = false;
/* 26 */     for (eq eq : eq.values()) {
/* 27 */       if (eq != eq.a)
/*    */       {
/*    */         
/* 30 */         if (☃.a_(el1.a(eq)).c() == bct.gp) {
/* 31 */           bool = true;
/*    */           break;
/*    */         }  } 
/*    */     } 
/* 35 */     if (!bool) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     ☃.a(el1, bct.gq.p(), 2);
/*    */     
/* 41 */     for (int i = 0; i < 200; i++) {
/* 42 */       int j = random.nextInt(5) - random.nextInt(6);
/* 43 */       int k = 3;
/* 44 */       if (j < 2) {
/* 45 */         k += j / 2;
/*    */       }
/* 47 */       if (k >= 1) {
/*    */ 
/*    */ 
/*    */         
/* 51 */         el el2 = el1.a(random.nextInt(k) - random.nextInt(k), j, random.nextInt(k) - random.nextInt(k));
/* 52 */         blc blc = ☃.a_(el2);
/* 53 */         bcs bcs = blc.c();
/* 54 */         if (blc.d() == bza.a || bcs == bct.A || bcs == bct.gp || bcs == bct.cR)
/*    */         {
/*    */ 
/*    */           
/* 58 */           for (eq eq : eq.values()) {
/* 59 */             bcs bcs1 = ☃.a_(el2.a(eq)).c();
/* 60 */             if (bcs1 == bct.gq) {
/* 61 */               ☃.a(el2, bct.gq.p(), 2);
/*    */               break;
/*    */             } 
/*    */           }  } 
/*    */       } 
/*    */     } 
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */