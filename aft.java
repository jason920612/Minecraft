/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aft
/*    */   extends afp
/*    */ {
/*    */   private final double a;
/*    */   private final double b;
/*    */   private String c;
/*    */   
/*    */   public aft(@Nullable afm ☃, String str, double d1, double d2, double d3) {
/* 13 */     super(☃, str, d1);
/* 14 */     this.a = d2;
/* 15 */     this.b = d3;
/*    */     
/* 17 */     if (d2 > d3) {
/* 18 */       throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
/*    */     }
/* 20 */     if (d1 < d2) {
/* 21 */       throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
/*    */     }
/* 23 */     if (d1 > d3) {
/* 24 */       throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
/*    */     }
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
/*    */   public aft a(String ☃) {
/* 37 */     this.c = ☃;
/* 38 */     return this;
/*    */   }
/*    */   
/*    */   public String g() {
/* 42 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double ☃) {
/* 47 */     ☃ = xq.a(☃, this.a, this.b);
/*    */     
/* 49 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */