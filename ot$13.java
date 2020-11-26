/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   implements os<Optional<ij>>
/*     */ {
/*     */   public void a(hy ☃, Optional<ij> optional) {
/* 137 */     if (optional.isPresent()) {
/* 138 */       ☃.writeBoolean(true);
/* 139 */       ☃.a(optional.get());
/*     */     } else {
/* 141 */       ☃.writeBoolean(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<ij> b(hy ☃) {
/* 147 */     return ☃.readBoolean() ? Optional.<ij>of(☃.f()) : Optional.<ij>empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public or<Optional<ij>> a(int ☃) {
/* 152 */     return new or<>(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<ij> a(Optional<ij> ☃) {
/* 157 */     return ☃.isPresent() ? Optional.<ij>of(((ij)☃.get()).h()) : Optional.<ij>empty();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ot$13.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */