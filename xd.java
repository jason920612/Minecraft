/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xd
/*    */ {
/*    */   private final long[] a;
/*    */   private final int b;
/*    */   private final long c;
/*    */   private final int d;
/*    */   
/*    */   public xd(int ☃, int i) {
/* 15 */     this(☃, i, new long[xq.c(i * ☃, 64) / 64]);
/*    */   }
/*    */   
/*    */   public xd(int ☃, int i, long[] arrayOfLong) {
/* 19 */     Validate.inclusiveBetween(1L, 32L, ☃);
/*    */     
/* 21 */     this.d = i;
/* 22 */     this.b = ☃;
/* 23 */     this.a = arrayOfLong;
/* 24 */     this.c = (1L << ☃) - 1L;
/*    */     
/* 26 */     int j = xq.c(i * ☃, 64) / 64;
/* 27 */     if (arrayOfLong.length != j) {
/* 28 */       throw new RuntimeException("Invalid length given for storage, got: " + arrayOfLong.length + " but expected: " + j);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 33 */     Validate.inclusiveBetween(0L, (this.d - 1), ☃);
/* 34 */     Validate.inclusiveBetween(0L, this.c, i);
/*    */     
/* 36 */     int j = ☃ * this.b;
/* 37 */     int k = j / 64;
/* 38 */     int m = ((☃ + 1) * this.b - 1) / 64;
/* 39 */     int n = j % 64;
/*    */     
/* 41 */     this.a[k] = this.a[k] & (this.c << n ^ 0xFFFFFFFFFFFFFFFFL) | (i & this.c) << n;
/* 42 */     if (k != m) {
/* 43 */       int i1 = 64 - n;
/* 44 */       int i2 = this.b - i1;
/* 45 */       this.a[m] = this.a[m] >>> i2 << i2 | (i & this.c) >> i1;
/*    */     } 
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 50 */     Validate.inclusiveBetween(0L, (this.d - 1), ☃);
/*    */     
/* 52 */     int i = ☃ * this.b;
/* 53 */     int j = i / 64;
/* 54 */     int k = ((☃ + 1) * this.b - 1) / 64;
/* 55 */     int m = i % 64;
/*    */     
/* 57 */     if (j == k) {
/* 58 */       return (int)(this.a[j] >>> m & this.c);
/*    */     }
/* 60 */     int n = 64 - m;
/* 61 */     return (int)((this.a[j] >>> m | this.a[k] << n) & this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public long[] a() {
/* 66 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 70 */     return this.d;
/*    */   }
/*    */   
/*    */   public int c() {
/* 74 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */