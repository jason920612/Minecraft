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
/*    */ public class bew
/*    */   extends bfk
/*    */ {
/* 18 */   public static final bmj a = bma.U;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bew(bcs.c ☃) {
/* 24 */     super(☃);
/* 25 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 30 */     if ((random.nextInt(3) == 0 || a(axy1, el1, 4)) && axy1.C(el1) > 11 - ((Integer)☃.c(a)).intValue() - ☃.b(axy1, el1) && 
/* 31 */       c(☃, axy1, el1)) {
/* 32 */       try (el.b ☃ = el.b.r()) {
/* 33 */         for (eq eq : eq.values()) {
/* 34 */           b.j(el1).d(eq);
/* 35 */           blc blc1 = axy1.a_(b);
/* 36 */           if (blc1.c() == this && !c(blc1, axy1, b)) {
/* 37 */             axy1.J().a(b, this, xq.a(random, 20, 40));
/*    */           }
/*    */         } 
/*    */       } 
/*    */       
/*    */       return;
/*    */     } 
/* 44 */     axy1.J().a(el1, this, xq.a(random, 20, 40));
/*    */   }
/*    */   
/*    */   private boolean c(blc ☃, axy axy1, el el1) {
/* 48 */     int i = ((Integer)☃.c(a)).intValue();
/* 49 */     if (i < 3) {
/* 50 */       axy1.a(el1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/* 51 */       return false;
/*    */     } 
/* 53 */     b(☃, axy1, el1);
/* 54 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 60 */     if (bcs1 == this && 
/* 61 */       a(axy1, el1, 2)) {
/* 62 */       b(☃, axy1, el1);
/*    */     }
/*    */ 
/*    */     
/* 66 */     super.a(☃, axy1, el1, bcs1, el2);
/*    */   }
/*    */   
/*    */   private boolean a(axk ☃, el el1, int i) {
/* 70 */     int j = 0;
/* 71 */     try (el.b ☃ = el.b.r()) {
/* 72 */       for (eq eq : eq.values()) {
/* 73 */         b.j(el1).d(eq);
/*    */         
/* 75 */         j++;
/* 76 */         if (☃.a_(b).c() == this && j >= i) {
/* 77 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 82 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 87 */     ☃.a((bmm<?>[])new bmm[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(axk ☃, el el1, blc blc1) {
/* 92 */     return ate.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */