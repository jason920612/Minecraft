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
/*    */ public final class a
/*    */   implements Comparable<xr.a>
/*    */ {
/*    */   public double a;
/*    */   public double b;
/*    */   public String c;
/*    */   
/*    */   public a(String ☃, double d1, double d2) {
/* 46 */     this.c = ☃;
/* 47 */     this.a = d1;
/* 48 */     this.b = d2;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(a ☃) {
/* 53 */     if (☃.a < this.a) {
/* 54 */       return -1;
/*    */     }
/* 56 */     if (☃.a > this.a) {
/* 57 */       return 1;
/*    */     }
/* 59 */     return ☃.c.compareTo(this.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */