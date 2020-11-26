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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private final boolean e;
/*     */   private final cea f;
/*     */   
/*     */   public a(int ☃, int i, int j, int k, boolean bool) {
/* 102 */     this.a = ☃;
/* 103 */     this.b = i;
/* 104 */     this.c = j;
/* 105 */     this.d = k;
/* 106 */     this.e = bool;
/*     */     
/* 108 */     this.f = new cea((☃ - j), 0.0D, (i - j), (☃ + j), 256.0D, (i + j));
/*     */   }
/*     */   
/*     */   public boolean a(el ☃) {
/* 112 */     int i = this.a - this.c;
/* 113 */     int j = this.b - this.c;
/* 114 */     return (☃.o() == (i & 0xFFFFFFF0) && ☃.q() == (j & 0xFFFFFFF0));
/*     */   }
/*     */   
/*     */   public int a() {
/* 118 */     return this.a;
/*     */   }
/*     */   
/*     */   public int b() {
/* 122 */     return this.b;
/*     */   }
/*     */   
/*     */   public int c() {
/* 126 */     return this.c;
/*     */   }
/*     */   
/*     */   public int d() {
/* 130 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 134 */     return this.e;
/*     */   }
/*     */   
/*     */   public cea f() {
/* 138 */     return this.f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */