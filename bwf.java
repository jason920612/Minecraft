/*     */ import com.google.common.base.MoreObjects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwf
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   
/*     */   public bwf() {}
/*     */   
/*     */   public bwf(int[] ☃) {
/*  23 */     if (☃.length == 6) {
/*  24 */       this.a = ☃[0];
/*  25 */       this.b = ☃[1];
/*  26 */       this.c = ☃[2];
/*  27 */       this.d = ☃[3];
/*  28 */       this.e = ☃[4];
/*  29 */       this.f = ☃[5];
/*     */     } 
/*     */   }
/*     */   
/*     */   public static bwf a() {
/*  34 */     return new bwf(2147483647, 2147483647, 2147483647, -2147483648, -2147483648, -2147483648);
/*     */   }
/*     */   
/*     */   public static bwf a(int ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3, eq eq1) {
/*  38 */     switch (null.a[eq1.ordinal()]) {
/*     */       default:
/*  40 */         return new bwf(☃ + k, i + m, j + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + i3 - 1 + n);
/*     */       
/*     */       case 1:
/*  43 */         return new bwf(☃ + k, i + m, j - i3 + 1 + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + n);
/*     */       
/*     */       case 2:
/*  46 */         return new bwf(☃ + k, i + m, j + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + i3 - 1 + n);
/*     */       
/*     */       case 3:
/*  49 */         return new bwf(☃ - i3 + 1 + n, i + m, j + k, ☃ + n, i + i2 - 1 + m, j + i1 - 1 + k);
/*     */       case 4:
/*     */         break;
/*  52 */     }  return new bwf(☃ + n, i + m, j + k, ☃ + i3 - 1 + n, i + i2 - 1 + m, j + i1 - 1 + k);
/*     */   }
/*     */ 
/*     */   
/*     */   public static bwf a(int ☃, int i, int j, int k, int m, int n) {
/*  57 */     return new bwf(Math.min(☃, k), Math.min(i, m), Math.min(j, n), Math.max(☃, k), Math.max(i, m), Math.max(j, n));
/*     */   }
/*     */   
/*     */   public bwf(bwf ☃) {
/*  61 */     this.a = ☃.a;
/*  62 */     this.b = ☃.b;
/*  63 */     this.c = ☃.c;
/*  64 */     this.d = ☃.d;
/*  65 */     this.e = ☃.e;
/*  66 */     this.f = ☃.f;
/*     */   }
/*     */   
/*     */   public bwf(int ☃, int i, int j, int k, int m, int n) {
/*  70 */     this.a = ☃;
/*  71 */     this.b = i;
/*  72 */     this.c = j;
/*  73 */     this.d = k;
/*  74 */     this.e = m;
/*  75 */     this.f = n;
/*     */   }
/*     */   
/*     */   public bwf(ff ☃, ff ff1) {
/*  79 */     this.a = Math.min(☃.o(), ff1.o());
/*  80 */     this.b = Math.min(☃.p(), ff1.p());
/*  81 */     this.c = Math.min(☃.q(), ff1.q());
/*  82 */     this.d = Math.max(☃.o(), ff1.o());
/*  83 */     this.e = Math.max(☃.p(), ff1.p());
/*  84 */     this.f = Math.max(☃.q(), ff1.q());
/*     */   }
/*     */   
/*     */   public bwf(int ☃, int i, int j, int k) {
/*  88 */     this.a = ☃;
/*  89 */     this.c = i;
/*  90 */     this.d = j;
/*  91 */     this.f = k;
/*     */ 
/*     */     
/*  94 */     this.b = 1;
/*  95 */     this.e = 512;
/*     */   }
/*     */   
/*     */   public boolean a(bwf ☃) {
/*  99 */     return (this.d >= ☃.a && this.a <= ☃.d && this.f >= ☃.c && this.c <= ☃.f && this.e >= ☃.b && this.b <= ☃.e);
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
/*     */   public boolean a(int ☃, int i, int j, int k) {
/* 111 */     return (this.d >= ☃ && this.a <= j && this.f >= i && this.c <= k);
/*     */   }
/*     */   
/*     */   public void b(bwf ☃) {
/* 115 */     this.a = Math.min(this.a, ☃.a);
/* 116 */     this.b = Math.min(this.b, ☃.b);
/* 117 */     this.c = Math.min(this.c, ☃.c);
/* 118 */     this.d = Math.max(this.d, ☃.d);
/* 119 */     this.e = Math.max(this.e, ☃.e);
/* 120 */     this.f = Math.max(this.f, ☃.f);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 140 */     this.a += ☃;
/* 141 */     this.b += i;
/* 142 */     this.c += j;
/* 143 */     this.d += ☃;
/* 144 */     this.e += i;
/* 145 */     this.f += j;
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
/*     */   
/*     */   public boolean b(ff ☃) {
/* 158 */     return (☃.o() >= this.a && ☃.o() <= this.d && ☃.q() >= this.c && ☃.q() <= this.f && ☃.p() >= this.b && ☃.p() <= this.e);
/*     */   }
/*     */   
/*     */   public ff b() {
/* 162 */     return new ff(this.d - this.a, this.e - this.b, this.f - this.c);
/*     */   }
/*     */   
/*     */   public int c() {
/* 166 */     return this.d - this.a + 1;
/*     */   }
/*     */   
/*     */   public int d() {
/* 170 */     return this.e - this.b + 1;
/*     */   }
/*     */   
/*     */   public int e() {
/* 174 */     return this.f - this.c + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 183 */     return MoreObjects.toStringHelper(this)
/* 184 */       .add("x0", this.a)
/* 185 */       .add("y0", this.b)
/* 186 */       .add("z0", this.c)
/* 187 */       .add("x1", this.d)
/* 188 */       .add("y1", this.e)
/* 189 */       .add("z1", this.f)
/* 190 */       .toString();
/*     */   }
/*     */   
/*     */   public hc g() {
/* 194 */     return new hc(new int[] { this.a, this.b, this.c, this.d, this.e, this.f });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */