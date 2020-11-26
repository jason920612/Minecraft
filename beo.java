/*    */ import javax.annotation.Nullable;
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
/*    */ public class beo
/*    */   extends bfi
/*    */ {
/* 17 */   public static final bmh<bly> C = bma.K;
/*    */   
/*    */   protected beo(bcs.c ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 25 */     eq eq = k(☃).d();
/* 26 */     el el2 = el1.a(eq);
/* 27 */     blc blc1 = ayc1.a_(el2);
/*    */     
/* 29 */     bcs bcs = blc1.c();
/* 30 */     if (a(bcs)) {
/* 31 */       return false;
/*    */     }
/*    */     
/* 34 */     boolean bool = (blc1.c(ayc1, el2, eq.d()) == blb.a);
/*    */     
/* 36 */     if (eq == eq.b) {
/* 37 */       return (bcs == bct.fx || bool);
/*    */     }
/*    */     
/* 40 */     return (!b(bcs) && bool);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public blc a(ark ☃) {
/* 46 */     for (eq eq : ☃.e()) {
/*    */       blc blc;
/* 48 */       if (eq.k() == eq.a.b) {
/* 49 */         blc = p().a(C, (eq == eq.b) ? bly.c : bly.a).a(D, ☃.f());
/*    */       } else {
/* 51 */         blc = p().a(C, bly.b).a(D, eq.d());
/*    */       } 
/*    */       
/* 54 */       if (blc.a(☃.k(), ☃.a())) {
/* 55 */         return blc;
/*    */       }
/*    */     } 
/*    */     
/* 59 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 64 */     if (k(☃).d() == eq1 && !☃.a(axz1, el1)) {
/* 65 */       return bct.a.p();
/*    */     }
/* 67 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */   
/*    */   protected static eq k(blc ☃) {
/* 71 */     switch (null.a[((bly)☃.c(C)).ordinal()]) {
/*    */       case 1:
/* 73 */         return eq.a;
/*    */       case 2:
/* 75 */         return eq.b;
/*    */     } 
/* 77 */     return (eq)☃.c(D);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\beo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */