/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class e
/*     */   extends anh.h
/*     */ {
/*     */   private float c;
/*     */   private float d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   private e(anh paramanh) {
/* 328 */     super(paramanh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 336 */     return (this.a.v() == null || anh.b(this.a) == anh.a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 341 */     this.d = 5.0F + anh.c(this.a).nextFloat() * 10.0F;
/* 342 */     this.e = -4.0F + anh.d(this.a).nextFloat() * 9.0F;
/* 343 */     this.f = anh.e(this.a).nextBoolean() ? 1.0F : -1.0F;
/* 344 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 349 */     if (anh.f(this.a).nextInt(350) == 0) {
/* 350 */       this.e = -4.0F + anh.g(this.a).nextFloat() * 9.0F;
/*     */     }
/* 352 */     if (anh.h(this.a).nextInt(250) == 0) {
/* 353 */       this.d++;
/* 354 */       if (this.d > 15.0F) {
/* 355 */         this.d = 5.0F;
/* 356 */         this.f = -this.f;
/*     */       } 
/*     */     } 
/* 359 */     if (anh.i(this.a).nextInt(450) == 0) {
/* 360 */       this.c = anh.j(this.a).nextFloat() * 2.0F * 3.1415927F;
/* 361 */       i();
/*     */     } 
/* 363 */     if (g()) {
/* 364 */       i();
/*     */     }
/*     */     
/* 367 */     if ((anh.a(this.a)).c < this.a.r && !this.a.m.c((new el(this.a)).c(1))) {
/* 368 */       this.e = Math.max(1.0F, this.e);
/* 369 */       i();
/*     */     } 
/*     */     
/* 372 */     if ((anh.a(this.a)).c > this.a.r && !this.a.m.c((new el(this.a)).b(1))) {
/* 373 */       this.e = Math.min(-1.0F, this.e);
/* 374 */       i();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void i() {
/* 379 */     if (el.a.equals(anh.k(this.a))) {
/* 380 */       anh.a(this.a, new el(this.a));
/*     */     }
/* 382 */     this.c += this.f * 15.0F * 0.017453292F;
/* 383 */     anh.a(this.a, (new cee(anh.k(this.a))).b((this.d * xq.b(this.c)), (-4.0F + this.e), (this.d * xq.a(this.c))));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anh$e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */