/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
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
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 44 */   a(0),
/* 45 */   b(1),
/* 46 */   c(2),
/* 47 */   d(3),
/* 48 */   e(4),
/* 49 */   f(5),
/* 50 */   g(6); private static final a[] h;
/*    */   static {
/* 52 */     h = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(a::a)).toArray(☃ -> new a[☃]);
/*    */   }
/*    */   private final int i;
/*    */   
/*    */   a(int ☃) {
/* 57 */     this.i = ☃;
/*    */   }
/*    */   
/*    */   public int a() {
/* 61 */     return this.i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aph$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */