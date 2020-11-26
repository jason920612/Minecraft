/*     */ import java.util.List;
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
/*     */ class c<T>
/*     */   implements blm<T>
/*     */ {
/*     */   private final List<? extends blm<? super T>> a;
/*     */   
/*     */   private c(List<? extends blm<? super T>> ☃) {
/*  93 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean test(@Nullable T ☃, axk axk1, el el1) {
/*  98 */     for (int i = 0; i < this.a.size(); i++) {
/*  99 */       if (((blm<T>)this.a.get(i)).test(☃, axk1, el1)) {
/* 100 */         return true;
/*     */       }
/*     */     } 
/* 103 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\blq$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */