/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum adi
/*    */ {
/*    */   private static final adi[] e;
/* 11 */   a(0, "peaceful"),
/* 12 */   b(1, "easy"),
/* 13 */   c(2, "normal"),
/* 14 */   d(3, "hard");
/*    */   
/*    */   static {
/* 17 */     e = (adi[])Arrays.<adi>stream(values()).sorted(Comparator.comparingInt(adi::a)).toArray(☃ -> new adi[☃]);
/*    */   }
/*    */   
/*    */   private final int f;
/*    */   
/*    */   adi(int ☃, String str1) {
/* 23 */     this.f = ☃;
/* 24 */     this.g = str1;
/*    */   }
/*    */   private final String g;
/*    */   public int a() {
/* 28 */     return this.f;
/*    */   }
/*    */   
/*    */   public ij b() {
/* 32 */     return new ir("options.difficulty." + this.g, new Object[0]);
/*    */   }
/*    */   
/*    */   public static adi a(int ☃) {
/* 36 */     return e[☃ % e.length];
/*    */   }
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
/*    */   public String c() {
/* 50 */     return this.g;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\adi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */