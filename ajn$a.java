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
/*     */ class a
/*     */   extends agb
/*     */ {
/*     */   private final ajn i;
/*     */   
/*     */   a(ajn ☃) {
/* 213 */     super(☃);
/* 214 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 219 */     if (this.i.a(ww.a)) {
/* 220 */       this.i.u += 0.005D;
/*     */     }
/*     */     
/* 223 */     if (this.h != agb.a.b || this.i.t().p()) {
/* 224 */       this.i.o(0.0F);
/*     */       
/*     */       return;
/*     */     } 
/* 228 */     double ☃ = this.b - this.i.q;
/* 229 */     double d1 = this.c - this.i.r;
/* 230 */     double d2 = this.d - this.i.s;
/* 231 */     double d3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/* 232 */     d1 /= d3;
/*     */     
/* 234 */     float f1 = (float)(xq.c(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 235 */     this.i.w = a(this.i.w, f1, 90.0F);
/* 236 */     this.i.aQ = this.i.w;
/*     */     
/* 238 */     float f2 = (float)(this.e * this.i.a(ank.d).e());
/* 239 */     this.i.o(this.i.cK() + (f2 - this.i.cK()) * 0.125F);
/*     */     
/* 241 */     this.i.u += this.i.cK() * d1 * 0.1D;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */