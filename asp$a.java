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
/*    */ public enum a
/*    */ {
/*    */   private static final a[] f;
/* 40 */   a(0, "small_ball"),
/* 41 */   b(1, "large_ball"),
/* 42 */   c(2, "star"),
/* 43 */   d(3, "creeper"),
/* 44 */   e(4, "burst");
/*    */   
/*    */   static {
/* 47 */     f = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(☃ -> ☃.g)).toArray(☃ -> new a[☃]);
/*    */   }
/*    */   
/*    */   private final int g;
/*    */   
/*    */   a(int ☃, String str1) {
/* 53 */     this.g = ☃;
/* 54 */     this.h = str1;
/*    */   }
/*    */   private final String h;
/*    */   public int a() {
/* 58 */     return this.g;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\asp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */