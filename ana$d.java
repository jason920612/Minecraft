/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class d
/*     */   extends agt
/*     */ {
/*     */   private final ana a;
/*     */   
/*     */   public d(ana ☃) {
/* 224 */     this.a = ☃;
/*     */     
/* 226 */     a(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 231 */     agb ☃ = this.a.r();
/* 232 */     if (!☃.b()) {
/* 233 */       return true;
/*     */     }
/*     */     
/* 236 */     double d1 = ☃.d() - this.a.q;
/* 237 */     double d2 = ☃.e() - this.a.r;
/* 238 */     double d3 = ☃.f() - this.a.s;
/*     */     
/* 240 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */     
/* 242 */     if (d4 < 1.0D || d4 > 3600.0D) {
/* 243 */       return true;
/*     */     }
/*     */     
/* 246 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 251 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 256 */     Random ☃ = this.a.ce();
/* 257 */     double d1 = this.a.q + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 258 */     double d2 = this.a.r + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 259 */     double d3 = this.a.s + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 260 */     this.a.r().a(d1, d2, d3, 1.0D);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ana$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */