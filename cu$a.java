/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
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
/*     */ class a
/*     */   implements Predicate<blh>
/*     */ {
/*     */   private final blc a;
/*     */   private final Set<bmm<?>> b;
/*     */   @Nullable
/*     */   private final gy c;
/*     */   
/*     */   public a(blc ☃, Set<bmm<?>> set, @Nullable gy gy1) {
/*  90 */     this.a = ☃;
/*  91 */     this.b = set;
/*  92 */     this.c = gy1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blh ☃) {
/*  97 */     blc blc1 = ☃.a();
/*     */     
/*  99 */     if (blc1.c() != this.a.c()) {
/* 100 */       return false;
/*     */     }
/*     */     
/* 103 */     for (bmm<?> bmm : this.b) {
/* 104 */       if (blc1.c(bmm) != this.a.c(bmm)) {
/* 105 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 109 */     if (this.c != null) {
/* 110 */       bji bji = ☃.b();
/* 111 */       return (bji != null && hk.a(this.c, bji.a(new gy()), true));
/*     */     } 
/*     */     
/* 114 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */