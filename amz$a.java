/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends anp.c
/*     */ {
/*     */   private a(amz paramamz) {
/* 171 */     super(paramamz);
/*     */   }
/*     */   protected int g() {
/* 174 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int i() {
/* 179 */     return 100;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void j() {
/* 185 */     afa ☃ = this.a.v();
/* 186 */     double d1 = Math.min(☃.r, this.a.r);
/* 187 */     double d2 = Math.max(☃.r, this.a.r) + 1.0D;
/* 188 */     float f = (float)xq.c(☃.s - this.a.s, ☃.q - this.a.q);
/* 189 */     if (this.a.h(☃) < 9.0D) {
/*     */       int i;
/* 191 */       for (i = 0; i < 5; i++) {
/* 192 */         float f1 = f + i * 3.1415927F * 0.4F;
/* 193 */         a(this.a.q + xq.b(f1) * 1.5D, this.a.s + xq.a(f1) * 1.5D, d1, d2, f1, 0);
/*     */       } 
/*     */       
/* 196 */       for (i = 0; i < 8; i++) {
/* 197 */         float f1 = f + i * 3.1415927F * 2.0F / 8.0F + 1.2566371F;
/* 198 */         a(this.a.q + xq.b(f1) * 2.5D, this.a.s + xq.a(f1) * 2.5D, d1, d2, f1, 3);
/*     */       } 
/*     */     } else {
/*     */       
/* 202 */       for (int i = 0; i < 16; i++) {
/* 203 */         double d = 1.25D * (i + 1);
/* 204 */         int j = 1 * i;
/* 205 */         a(this.a.q + xq.b(f) * d, this.a.s + xq.a(f) * d, d1, d2, f, j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(double ☃, double d1, double d2, double d3, float f, int i) {
/* 212 */     el el = new el(☃, d3, d1);
/* 213 */     boolean bool = false;
/* 214 */     double d = 0.0D;
/*     */     do {
/* 216 */       if (!this.a.m.q(el) && this.a.m.q(el.b())) {
/* 217 */         if (!this.a.m.c(el)) {
/* 218 */           blc blc = this.a.m.a_(el);
/* 219 */           cew cew = blc.h(this.a.m, el);
/* 220 */           if (!cew.b()) {
/* 221 */             d = cew.c(eq.a.b);
/*     */           }
/*     */         } 
/* 224 */         bool = true;
/*     */         break;
/*     */       } 
/* 227 */       el = el.b();
/* 228 */     } while (el.p() >= xq.c(d2) - 1);
/* 229 */     if (bool) {
/* 230 */       aoo aoo = new aoo(this.a.m, ☃, el.p() + d, d1, f, i, this.a);
/* 231 */       this.a.m.a(aoo);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi k() {
/* 237 */     return wj.cr;
/*     */   }
/*     */ 
/*     */   
/*     */   protected anp.a l() {
/* 242 */     return anp.a.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */