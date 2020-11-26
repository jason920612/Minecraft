/*    */ 
/*    */ 
/*    */ public enum bmn
/*    */   implements xv
/*    */ {
/*  6 */   a(0, "north_south"),
/*  7 */   b(1, "east_west"),
/*  8 */   c(2, "ascending_east"),
/*  9 */   d(3, "ascending_west"),
/* 10 */   e(4, "ascending_north"),
/* 11 */   f(5, "ascending_south"),
/* 12 */   g(6, "south_east"),
/* 13 */   h(7, "south_west"),
/* 14 */   i(8, "north_west"),
/* 15 */   j(9, "north_east");
/*    */   
/*    */   private final int k;
/*    */   
/*    */   private final String l;
/*    */   
/*    */   bmn(int ☃, String str1) {
/* 22 */     this.k = ☃;
/* 23 */     this.l = str1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 27 */     return this.k;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 36 */     return this.l;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 40 */     return (this == e || this == c || this == f || this == d);
/*    */   }
/*    */ 
/*    */   
/*    */   public String m() {
/* 45 */     return this.l;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bmn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */