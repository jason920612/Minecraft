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
/*    */ public class bep
/*    */   extends bcs
/*    */ {
/*    */   public static boolean b;
/*    */   
/*    */   public bep(bcs.c ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 25 */     axy1.J().a(el1, this, a(axy1));
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 30 */     axz1.J().a(el1, this, a(axz1));
/*    */     
/* 32 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 37 */     if (!axy1.B) {
/* 38 */       b(axy1, el1);
/*    */     }
/*    */   }
/*    */   
/*    */   private void b(axy ☃, el el1) {
/* 43 */     if (!k(☃.a_(el1.b())) || el1.p() < 0) {
/*    */       return;
/*    */     }
/*    */     
/* 47 */     int i = 32;
/* 48 */     if (b || !☃.b(el1.a(-32, -32, -32), el1.a(32, 32, 32))) {
/* 49 */       if (☃.a_(el1).c() == this) {
/* 50 */         ☃.g(el1);
/*    */       }
/*    */       
/* 53 */       el el2 = el1.b();
/* 54 */       while (k(☃.a_(el2)) && el2.p() > 0) {
/* 55 */         el2 = el2.b();
/*    */       }
/* 57 */       if (el2.p() > 0) {
/* 58 */         ☃.a(el2.a(), p());
/*    */       }
/* 60 */     } else if (!☃.B) {
/*    */       
/* 62 */       aml aml = new aml(☃, el1.o() + 0.5D, el1.p(), el1.q() + 0.5D, ☃.a_(el1));
/* 63 */       a(aml);
/* 64 */       ☃.a(aml);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aml ☃) {}
/*    */ 
/*    */   
/*    */   public int a(ayc ☃) {
/* 73 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean k(blc ☃) {
/* 78 */     bcs bcs1 = ☃.c();
/* 79 */     bza bza = ☃.d();
/* 80 */     return (☃.f() || bcs1 == bct.ch || bza.a() || bza.e());
/*    */   }
/*    */   
/*    */   public void a(axy ☃, el el1, blc blc1, blc blc2) {}
/*    */   
/*    */   public void a(axy ☃, el el1) {}
/*    */ }


/* Location:              F:\dw\server.jar!\bep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */