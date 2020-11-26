/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class c
/*     */   extends agt
/*     */ {
/*     */   protected int b;
/*     */   protected int c;
/*     */   
/*     */   protected c(anp ☃) {}
/*     */   
/*     */   public boolean a() {
/* 147 */     if (this.d.v() == null) {
/* 148 */       return false;
/*     */     }
/* 150 */     if (this.d.dA())
/*     */     {
/* 152 */       return false;
/*     */     }
/* 154 */     if (this.d.U < this.c) {
/* 155 */       return false;
/*     */     }
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 162 */     return (this.d.v() != null && this.b > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 167 */     this.b = m();
/* 168 */     this.d.b = g();
/* 169 */     this.c = this.d.U + i();
/* 170 */     wi ☃ = k();
/* 171 */     if (☃ != null) {
/* 172 */       this.d.a(☃, 1.0F, 1.0F);
/*     */     }
/* 174 */     this.d.a(l());
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 179 */     this.b--;
/* 180 */     if (this.b == 0) {
/* 181 */       j();
/* 182 */       this.d.a(this.d.dz(), 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract void j();
/*     */   
/*     */   protected int m() {
/* 189 */     return 20;
/*     */   }
/*     */   
/*     */   protected abstract int g();
/*     */   
/*     */   protected abstract int i();
/*     */   
/*     */   @Nullable
/*     */   protected abstract wi k();
/*     */   
/*     */   protected abstract anp.a l();
/*     */ }


/* Location:              F:\dw\server.jar!\anp$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */