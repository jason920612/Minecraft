/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends bxc
/*     */ {
/*     */   private boolean e;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/* 122 */     super(i, j, ayu1, boz1, ☃.r_());
/*     */     
/* 124 */     bhb bhb = bhb.values()[boz1.nextInt((bhb.values()).length)];
/*     */     
/* 126 */     int k = bqj.a(i, j, bmy1);
/*     */     
/* 128 */     if (k < 60) {
/* 129 */       this.e = false;
/*     */       
/*     */       return;
/*     */     } 
/* 133 */     el el = new el(i * 16 + 8, k, j * 16 + 8);
/* 134 */     bwl.a(☃.s_().h(), el, bhb, this.a, boz1);
/*     */     
/* 136 */     a(☃);
/*     */     
/* 138 */     this.e = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 143 */     return this.e;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bqj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */