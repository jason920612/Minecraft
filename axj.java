/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axj
/*    */ {
/*    */   private final el a;
/*    */   private final bcs b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public axj(el ☃, bcs bcs1, int i, int j) {
/* 13 */     this.a = ☃;
/* 14 */     this.b = bcs1;
/* 15 */     this.c = i;
/* 16 */     this.d = j;
/*    */   }
/*    */   
/*    */   public el a() {
/* 20 */     return this.a;
/*    */   }
/*    */   
/*    */   public bcs b() {
/* 24 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 28 */     return this.c;
/*    */   }
/*    */   
/*    */   public int d() {
/* 32 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 37 */     if (☃ instanceof axj) {
/* 38 */       axj axj1 = (axj)☃;
/* 39 */       return (this.a.equals(axj1.a) && this.c == axj1.c && this.d == axj1.d && this.b == axj1.b);
/*    */     } 
/* 41 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\axj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */