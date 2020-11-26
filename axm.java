/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class axm
/*     */ {
/*     */   public final int a;
/*     */   public final int b;
/*     */   
/*     */   public axm(int ☃, int i) {
/*  13 */     this.a = ☃;
/*  14 */     this.b = i;
/*     */   }
/*     */   
/*     */   public axm(el ☃) {
/*  18 */     this.a = ☃.o() >> 4;
/*  19 */     this.b = ☃.q() >> 4;
/*     */   }
/*     */   
/*     */   public axm(long ☃) {
/*  23 */     this.a = (int)☃;
/*  24 */     this.b = (int)(☃ >> 32L);
/*     */   }
/*     */   
/*     */   public long a() {
/*  28 */     return a(this.a, this.b);
/*     */   }
/*     */   
/*     */   public static long a(int ☃, int i) {
/*  32 */     return ☃ & 0xFFFFFFFFL | (i & 0xFFFFFFFFL) << 32L;
/*     */   }
/*     */   
/*     */   public static int a(long ☃) {
/*  36 */     return (int)(☃ & 0xFFFFFFFFL);
/*     */   }
/*     */   
/*     */   public static int b(long ☃) {
/*  40 */     return (int)(☃ >>> 32L & 0xFFFFFFFFL);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  49 */     int ☃ = 1664525 * this.a + 1013904223;
/*  50 */     int i = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
/*  51 */     return ☃ ^ i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  56 */     if (this == ☃) {
/*  57 */       return true;
/*     */     }
/*     */     
/*  60 */     if (☃ instanceof axm) {
/*  61 */       axm axm1 = (axm)☃;
/*     */       
/*  63 */       return (this.a == axm1.a && this.b == axm1.b);
/*     */     } 
/*     */     
/*  66 */     return false;
/*     */   }
/*     */   
/*     */   public double a(aer ☃) {
/*  70 */     double d1 = (this.a * 16 + 8);
/*  71 */     double d2 = (this.b * 16 + 8);
/*     */     
/*  73 */     double d3 = d1 - ☃.q;
/*  74 */     double d4 = d2 - ☃.s;
/*     */     
/*  76 */     return d3 * d3 + d4 * d4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/*  88 */     return this.a << 4;
/*     */   }
/*     */   
/*     */   public int e() {
/*  92 */     return this.b << 4;
/*     */   }
/*     */   
/*     */   public int f() {
/*  96 */     return (this.a << 4) + 15;
/*     */   }
/*     */   
/*     */   public int g() {
/* 100 */     return (this.b << 4) + 15;
/*     */   }
/*     */   
/*     */   public el a(int ☃, int i, int j) {
/* 104 */     return new el((this.a << 4) + ☃, i, (this.b << 4) + j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 113 */     return "[" + this.a + ", " + this.b + "]";
/*     */   }
/*     */   
/*     */   public el h() {
/* 117 */     return new el(this.a << 4, 0, this.b << 4);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\axm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */