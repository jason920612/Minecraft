/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cag
/*    */   implements cao, cat
/*    */ {
/* 12 */   a; private static final int f; private static final int e;
/*    */   static {
/* 14 */     b = fc.m.a(ayz.m);
/* 15 */     c = fc.m.a(ayz.n);
/* 16 */     d = fc.m.a(ayz.p);
/* 17 */     e = fc.m.a(ayz.q);
/* 18 */     f = fc.m.a(ayz.i);
/*    */   }
/*    */   private static final int d; private static final int c; private static final int b;
/*    */   public int a(bzl ☃, bzg bzg1, bzf bzf1, bzf bzf2, int i, int j) {
/* 22 */     int k = bzf1.a(i, j);
/* 23 */     int m = bzf2.a(i, j);
/*    */     
/* 25 */     if (bzy.a(k)) {
/* 26 */       return k;
/*    */     }
/* 28 */     if (m == f) {
/* 29 */       if (k == c) {
/* 30 */         return b;
/*    */       }
/* 32 */       if (k == d || k == e) {
/* 33 */         return e;
/*    */       }
/* 35 */       return m & 0xFF;
/*    */     } 
/* 37 */     return k;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */