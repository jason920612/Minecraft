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
/*     */ class b
/*     */   implements bmv.a
/*     */ {
/*     */   private final double b;
/*     */   private final double c;
/*     */   private final long d;
/*     */   private final long e;
/*     */   private final double f;
/*     */   
/*     */   private b(bmv parambmv, double ☃, double d1, long l) {
/*  50 */     this.b = ☃;
/*  51 */     this.c = d1;
/*     */     
/*  53 */     this.f = l;
/*  54 */     this.e = k.b();
/*  55 */     this.d = this.e + l;
/*     */   }
/*     */ 
/*     */   
/*     */   public double a() {
/*  60 */     return Math.max(this.a.f() - e() / 2.0D, -bmv.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double c() {
/*  65 */     return Math.max(this.a.g() - e() / 2.0D, -bmv.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double b() {
/*  70 */     return Math.min(this.a.f() + e() / 2.0D, bmv.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double d() {
/*  75 */     return Math.min(this.a.g() + e() / 2.0D, bmv.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double e() {
/*  80 */     double ☃ = (k.b() - this.e) / this.f;
/*  81 */     return (☃ < 1.0D) ? (this.b + (this.c - this.b) * ☃) : this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long g() {
/*  91 */     return this.d - k.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  96 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bmv.a l() {
/* 114 */     if (g() <= 0L) {
/* 115 */       return new bmv.c(this.a, this.c);
/*     */     }
/*     */     
/* 118 */     return this;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bmv$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */