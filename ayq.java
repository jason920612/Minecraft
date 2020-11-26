/*    */ 
/*    */ public enum ayq
/*    */ {
/*  4 */   a(-3),
/*  5 */   b(-2),
/*  6 */   c(-1),
/*  7 */   d(0),
/*  8 */   e(1),
/*  9 */   f(2),
/* 10 */   g(3);
/*    */   
/*    */   private final int h;
/*    */ 
/*    */   
/*    */   ayq(int ☃) {
/* 16 */     this.h = ☃;
/*    */   }
/*    */   
/*    */   public static ayq a(int ☃) {
/* 20 */     for (ayq ayq1 : values()) {
/* 21 */       if (ayq1.h == ☃) {
/* 22 */         return ayq1;
/*    */       }
/*    */     } 
/* 25 */     if (☃ < a.h) {
/* 26 */       return a;
/*    */     }
/* 28 */     return g;
/*    */   }
/*    */   
/*    */   public int a() {
/* 32 */     return this.h;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */