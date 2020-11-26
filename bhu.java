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
/*    */ public abstract class bhu
/*    */   extends bhp
/*    */ {
/*    */   protected bhu(bcs.c ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */   
/*    */   private static boolean a(ayc ☃, el el1) {
/* 19 */     el el2 = el1.a();
/* 20 */     return (☃.C(el2) >= 4 || ☃.a_(el2).b(☃, el2) < ☃.K());
/*    */   }
/*    */   
/*    */   private static boolean b(ayc ☃, el el1) {
/* 24 */     el el2 = el1.a();
/* 25 */     return (☃.C(el2) >= 4 && ☃.a_(el2).b(☃, el2) < ☃.K() && !☃.b(el2).a(ww.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 30 */     if (axy1.B) {
/*    */       return;
/*    */     }
/*    */     
/* 34 */     if (!a(axy1, el1)) {
/* 35 */       axy1.a(el1, bct.j.p());
/*    */       
/*    */       return;
/*    */     } 
/* 39 */     if (axy1.C(el1.a()) >= 9)
/* 40 */       for (int i = 0; i < 4; i++) {
/* 41 */         el el2 = el1.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
/* 42 */         if (!axy1.p(el2)) {
/*    */           return;
/*    */         }
/* 45 */         if (axy1.a_(el2).c() == bct.j && b(axy1, el2))
/* 46 */           axy1.a(el2, p()); 
/*    */       }  
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bhu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */