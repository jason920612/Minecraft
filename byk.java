/*    */ import java.util.Random;
/*    */ 
/*    */ public class byk
/*    */   extends bym
/*    */ {
/*    */   private final byl[] a;
/*    */   private final int b;
/*    */   
/*    */   public byk(Random ☃, int i) {
/* 10 */     this.b = i;
/* 11 */     this.a = new byl[i];
/* 12 */     for (int j = 0; j < i; j++) {
/* 13 */       this.a[j] = new byl(☃);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double ☃, double d1) {
/* 19 */     double d2 = 0.0D;
/* 20 */     double d3 = 1.0D;
/*    */     
/* 22 */     for (int i = 0; i < this.b; i++) {
/* 23 */       d2 += this.a[i].a(☃ * d3, d1 * d3) / d3;
/* 24 */       d3 /= 2.0D;
/*    */     } 
/*    */     
/* 27 */     return d2;
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
/*    */ 
/*    */   
/*    */   public double[] a(double ☃, double d1, int i, int j, double d2, double d3, double d4) {
/* 43 */     return a(☃, d1, i, j, d2, d3, d4, 0.5D);
/*    */   }
/*    */   
/*    */   public double[] a(double ☃, double d1, int i, int j, double d2, double d3, double d4, double d5) {
/* 47 */     double[] arrayOfDouble = new double[i * j];
/*    */     
/* 49 */     double d6 = 1.0D;
/* 50 */     double d7 = 1.0D;
/* 51 */     for (int k = 0; k < this.b; k++) {
/* 52 */       this.a[k].a(arrayOfDouble, ☃, d1, i, j, d2 * d7 * d6, d3 * d7 * d6, 0.55D / d6);
/* 53 */       d7 *= d4;
/* 54 */       d6 *= d5;
/*    */     } 
/*    */     
/* 57 */     return arrayOfDouble;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\byk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */