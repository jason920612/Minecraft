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
/*     */ class a
/*     */   extends ahr
/*     */ {
/*     */   private eq h;
/*     */   private boolean i;
/*     */   
/*     */   public a(anm ☃) {
/* 218 */     super(☃, 1.0D, 10);
/*     */     
/* 220 */     a(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 225 */     if (this.a.v() != null) {
/* 226 */       return false;
/*     */     }
/* 228 */     if (!this.a.t().p()) {
/* 229 */       return false;
/*     */     }
/*     */     
/* 232 */     Random ☃ = this.a.ce();
/* 233 */     if (this.a.m.X().b("mobGriefing") && ☃.nextInt(10) == 0) {
/* 234 */       this.h = eq.a(☃);
/*     */       
/* 236 */       el el = (new el(this.a.q, this.a.r + 0.5D, this.a.s)).a(this.h);
/* 237 */       blc blc = this.a.m.a_(el);
/* 238 */       if (bfl.k(blc)) {
/* 239 */         this.i = true;
/* 240 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 244 */     this.i = false;
/* 245 */     return super.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 250 */     if (this.i) {
/* 251 */       return false;
/*     */     }
/* 253 */     return super.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 258 */     if (!this.i) {
/* 259 */       super.c();
/*     */       
/*     */       return;
/*     */     } 
/* 263 */     axz ☃ = this.a.m;
/* 264 */     el el = (new el(this.a.q, this.a.r + 0.5D, this.a.s)).a(this.h);
/* 265 */     blc blc = ☃.a_(el);
/*     */     
/* 267 */     if (bfl.k(blc)) {
/* 268 */       ☃.a(el, bfl.f(blc.c()), 3);
/* 269 */       this.a.B();
/* 270 */       this.a.V();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */