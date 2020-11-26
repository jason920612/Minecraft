/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class byj
/*    */   extends bym
/*    */ {
/*    */   private final byi[] a;
/*    */   private final int b;
/*    */   
/*    */   public byj(Random ☃, int i) {
/* 12 */     this.b = i;
/* 13 */     this.a = new byi[i];
/* 14 */     for (int j = 0; j < i; j++) {
/* 15 */       this.a[j] = new byi(☃);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double a(double ☃, double d1, double d2) {
/* 33 */     double d3 = 0.0D;
/* 34 */     double d4 = 1.0D;
/*    */     
/* 36 */     for (int i = 0; i < this.b; i++) {
/* 37 */       d3 += this.a[i].c(☃ * d4, d1 * d4, d2 * d4) / d4;
/* 38 */       d4 /= 2.0D;
/*    */     } 
/*    */     
/* 41 */     return d3;
/*    */   }
/*    */   
/*    */   public double[] a(int ☃, int i, int j, int k, int m, int n, double d1, double d2, double d3) {
/* 45 */     double[] arrayOfDouble = new double[k * m * n];
/*    */     
/* 47 */     double d = 1.0D;
/*    */     
/* 49 */     for (int i1 = 0; i1 < this.b; i1++) {
/* 50 */       double d4 = ☃ * d * d1;
/* 51 */       double d5 = i * d * d2;
/* 52 */       double d6 = j * d * d3;
/* 53 */       long l1 = xq.d(d4);
/* 54 */       long l2 = xq.d(d6);
/* 55 */       d4 -= l1;
/* 56 */       d6 -= l2;
/* 57 */       l1 %= 16777216L;
/* 58 */       l2 %= 16777216L;
/* 59 */       d4 += l1;
/* 60 */       d6 += l2;
/* 61 */       this.a[i1].a(arrayOfDouble, d4, d5, d6, k, m, n, d1 * d, d2 * d, d3 * d, d);
/* 62 */       d /= 2.0D;
/*    */     } 
/*    */     
/* 65 */     return arrayOfDouble;
/*    */   }
/*    */   
/*    */   public double[] a(int ☃, int i, int j, int k, double d1, double d2, double d3) {
/* 69 */     return a(☃, 10, i, j, 1, k, d1, 1.0D, d2);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\byj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */