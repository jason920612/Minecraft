/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bqv
/*    */   extends bpa<brz>
/*    */ {
/*    */   private final blc a;
/*    */   private final blc b;
/*    */   
/*    */   public bqv(blc ☃, blc blc1) {
/* 18 */     super(false);
/* 19 */     this.b = ☃;
/* 20 */     this.a = blc1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/* 25 */     blc blc1 = axz1.a_(el1);
/*    */     
/* 27 */     while ((blc1.f() || blc1.a(wv.A)) && el1.p() > 0) {
/* 28 */       el1 = el1.b();
/* 29 */       blc1 = axz1.a_(el1);
/*    */     } 
/*    */     
/* 32 */     bcs bcs = axz1.a_(el1).c();
/* 33 */     if (bcs.d(bcs) || bcs == bct.i) {
/* 34 */       el1 = el1.a();
/* 35 */       a(☃, axz1, el1, this.b);
/*    */       
/* 37 */       for (int i = el1.p(); i <= el1.p() + 2; i++) {
/* 38 */         int j = i - el1.p();
/* 39 */         int k = 2 - j;
/* 40 */         for (int m = el1.o() - k; m <= el1.o() + k; m++) {
/* 41 */           int n = m - el1.o();
/* 42 */           for (int i1 = el1.q() - k; i1 <= el1.q() + k; i1++) {
/* 43 */             int i2 = i1 - el1.q();
/* 44 */             if (Math.abs(n) != k || Math.abs(i2) != k || random.nextInt(2) != 0) {
/*    */ 
/*    */               
/* 47 */               el el2 = new el(m, i, i1);
/* 48 */               blc blc2 = axz1.a_(el2);
/* 49 */               if (blc2.f() || blc2.a(wv.A)) {
/* 50 */                 a(axz1, el2, this.a);
/*    */               }
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 57 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bqv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */