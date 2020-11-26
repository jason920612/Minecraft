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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpc
/*    */   extends bpa<brz>
/*    */ {
/* 18 */   private static final blc a = bct.L.p();
/* 19 */   private static final blc b = bct.aj.p();
/*    */   
/*    */   private final boolean c;
/*    */   
/*    */   public bpc(boolean ☃, boolean bool1) {
/* 24 */     super(☃);
/* 25 */     this.c = bool1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/* 30 */     int i = random.nextInt(3) + 5;
/* 31 */     if (this.c) {
/* 32 */       i += random.nextInt(7);
/*    */     }
/*    */     
/* 35 */     boolean bool = true;
/* 36 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/* 37 */       return false;
/*    */     }
/*    */     
/* 40 */     for (int j = el1.p(); j <= el1.p() + 1 + i; j++) {
/* 41 */       int m = 1;
/* 42 */       if (j == el1.p()) {
/* 43 */         m = 0;
/*    */       }
/* 45 */       if (j >= el1.p() + 1 + i - 2) {
/* 46 */         m = 2;
/*    */       }
/* 48 */       el.a a = new el.a();
/* 49 */       for (int n = el1.o() - m; n <= el1.o() + m && bool; n++) {
/* 50 */         for (int i1 = el1.q() - m; i1 <= el1.q() + m && bool; i1++) {
/* 51 */           if (j >= 0 && j < 256) {
/* 52 */             if (!a(axz1.a_(a.c(n, j, i1)).c())) {
/* 53 */               bool = false;
/*    */             }
/*    */           } else {
/* 56 */             bool = false;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 62 */     if (!bool) {
/* 63 */       return false;
/*    */     }
/*    */     
/* 66 */     bcs bcs = axz1.a_(el1.b()).c();
/* 67 */     if ((bcs != bct.i && !bcs.d(bcs) && bcs != bct.cq) || el1.p() >= 256 - i - 1) {
/* 68 */       return false;
/*    */     }
/*    */     
/* 71 */     a(axz1, el1.b());
/*    */     int k;
/* 73 */     for (k = el1.p() - 3 + i; k <= el1.p() + i; k++) {
/* 74 */       int m = k - el1.p() + i;
/* 75 */       int n = 1 - m / 2;
/* 76 */       for (int i1 = el1.o() - n; i1 <= el1.o() + n; i1++) {
/* 77 */         int i2 = i1 - el1.o();
/* 78 */         for (int i3 = el1.q() - n; i3 <= el1.q() + n; i3++) {
/* 79 */           int i4 = i3 - el1.q();
/* 80 */           if (Math.abs(i2) != n || Math.abs(i4) != n || (random.nextInt(2) != 0 && m != 0)) {
/*    */ 
/*    */             
/* 83 */             el el2 = new el(i1, k, i3);
/* 84 */             blc blc1 = axz1.a_(el2);
/* 85 */             if (blc1.f() || blc1.a(wv.A))
/* 86 */               a(axz1, el2, b); 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 91 */     for (k = 0; k < i; k++) {
/* 92 */       blc blc1 = axz1.a_(el1.b(k));
/* 93 */       if (blc1.f() || blc1.a(wv.A)) {
/* 94 */         a(☃, axz1, el1.b(k), a);
/*    */       }
/*    */     } 
/*    */     
/* 98 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bpc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */