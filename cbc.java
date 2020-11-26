/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cbc
/*     */ {
/*     */   public final int a;
/*     */   public final int b;
/*     */   public final int c;
/*     */   private final int n;
/*  13 */   public int d = -1;
/*     */   
/*     */   public float e;
/*     */   public float f;
/*     */   public float g;
/*     */   public cbc h;
/*     */   public boolean i;
/*     */   public float j;
/*     */   public float k;
/*     */   public float l;
/*  23 */   public cba m = cba.a;
/*     */   
/*     */   public cbc(int ☃, int i, int j) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = i;
/*  28 */     this.c = j;
/*     */     
/*  30 */     this.n = b(☃, i, j);
/*     */   }
/*     */   
/*     */   public cbc a(int ☃, int i, int j) {
/*  34 */     cbc cbc1 = new cbc(☃, i, j);
/*  35 */     cbc1.d = this.d;
/*  36 */     cbc1.e = this.e;
/*  37 */     cbc1.f = this.f;
/*  38 */     cbc1.g = this.g;
/*  39 */     cbc1.h = this.h;
/*  40 */     cbc1.i = this.i;
/*  41 */     cbc1.j = this.j;
/*  42 */     cbc1.k = this.k;
/*  43 */     cbc1.l = this.l;
/*  44 */     cbc1.m = this.m;
/*  45 */     return cbc1;
/*     */   }
/*     */   
/*     */   public static int b(int ☃, int i, int j) {
/*  49 */     return i & 0xFF | (☃ & 0x7FFF) << 8 | (j & 0x7FFF) << 24 | ((☃ < 0) ? Integer.MIN_VALUE : 0) | ((j < 0) ? 32768 : 0);
/*     */   }
/*     */   
/*     */   public float a(cbc ☃) {
/*  53 */     float f1 = (☃.a - this.a);
/*  54 */     float f2 = (☃.b - this.b);
/*  55 */     float f3 = (☃.c - this.c);
/*  56 */     return xq.c(f1 * f1 + f2 * f2 + f3 * f3);
/*     */   }
/*     */   
/*     */   public float b(cbc ☃) {
/*  60 */     float f1 = (☃.a - this.a);
/*  61 */     float f2 = (☃.b - this.b);
/*  62 */     float f3 = (☃.c - this.c);
/*  63 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*     */   }
/*     */   
/*     */   public float c(cbc ☃) {
/*  67 */     float f1 = Math.abs(☃.a - this.a);
/*  68 */     float f2 = Math.abs(☃.b - this.b);
/*  69 */     float f3 = Math.abs(☃.c - this.c);
/*  70 */     return f1 + f2 + f3;
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
/*     */   public boolean equals(Object ☃) {
/*  82 */     if (☃ instanceof cbc) {
/*  83 */       cbc cbc1 = (cbc)☃;
/*  84 */       return (this.n == cbc1.n && this.a == cbc1.a && this.b == cbc1.b && this.c == cbc1.c);
/*     */     } 
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  91 */     return this.n;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  95 */     return (this.d >= 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 100 */     return this.a + ", " + this.b + ", " + this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */