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
/*    */ public class bgh
/*    */   extends bcs
/*    */ {
/*    */   public bgh(bcs.c ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 21 */     if (this == bct.I) {
/* 22 */       return atf.k;
/*    */     }
/* 24 */     if (this == bct.cm) {
/* 25 */       return atf.m;
/*    */     }
/* 27 */     if (this == bct.aq) {
/* 28 */       return atf.bs;
/*    */     }
/* 30 */     if (this == bct.el) {
/* 31 */       return atf.dA;
/*    */     }
/* 33 */     if (this == bct.fw) {
/* 34 */       return atf.dV;
/*    */     }
/* 36 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(blc ☃, Random random) {
/* 41 */     if (this == bct.aq) {
/* 42 */       return 4 + random.nextInt(5);
/*    */     }
/* 44 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(blc ☃, int i, axy axy1, el el1, Random random) {
/* 49 */     if (i > 0 && this != a((blc)o().a().iterator().next(), axy1, el1, i)) {
/* 50 */       int j = random.nextInt(i + 2) - 1;
/* 51 */       if (j < 0) {
/* 52 */         j = 0;
/*    */       }
/* 54 */       return a(☃, random) * (j + 1);
/*    */     } 
/* 56 */     return a(☃, random);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 61 */     super.a(☃, axy1, el1, f, i);
/*    */ 
/*    */     
/* 64 */     if (a(☃, axy1, el1, i) != this) {
/* 65 */       int j = 0;
/* 66 */       if (this == bct.I) {
/* 67 */         j = xq.a(axy1.s, 0, 2);
/* 68 */       } else if (this == bct.cm) {
/* 69 */         j = xq.a(axy1.s, 3, 7);
/* 70 */       } else if (this == bct.el) {
/* 71 */         j = xq.a(axy1.s, 3, 7);
/* 72 */       } else if (this == bct.aq) {
/* 73 */         j = xq.a(axy1.s, 2, 5);
/* 74 */       } else if (this == bct.fw) {
/* 75 */         j = xq.a(axy1.s, 2, 5);
/*    */       } 
/* 77 */       a(axy1, el1, j);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(axk ☃, el el1, blc blc1) {
/* 83 */     return new ate(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */