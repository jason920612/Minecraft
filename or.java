/*    */ 
/*    */ public class or<T>
/*    */ {
/*    */   private final int a;
/*    */   private final os<T> b;
/*    */   
/*    */   public or(int ☃, os<T> os1) {
/*  8 */     this.a = ☃;
/*  9 */     this.b = os1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 13 */     return this.a;
/*    */   }
/*    */   
/*    */   public os<T> b() {
/* 17 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 22 */     if (this == ☃) {
/* 23 */       return true;
/*    */     }
/* 25 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 26 */       return false;
/*    */     }
/*    */     
/* 29 */     or<?> or1 = (or)☃;
/*    */     
/* 31 */     return (this.a == or1.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\or.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */