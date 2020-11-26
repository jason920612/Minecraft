/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class c
/*     */   implements Predicate<blh>
/*     */ {
/*     */   private final wz<bcs> a;
/*     */   @Nullable
/*     */   private final gy b;
/*     */   private final Map<String, String> c;
/*     */   
/*     */   private c(wz<bcs> ☃, Map<String, String> map, @Nullable gy gy1) {
/* 125 */     this.a = ☃;
/* 126 */     this.c = map;
/* 127 */     this.b = gy1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blh ☃) {
/* 132 */     blc blc = ☃.a();
/*     */     
/* 134 */     if (!blc.a(this.a)) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     for (Map.Entry<String, String> entry : this.c.entrySet()) {
/* 139 */       bmm<?> bmm = blc.c().o().a(entry.getKey());
/* 140 */       if (bmm == null) {
/* 141 */         return false;
/*     */       }
/* 143 */       Comparable<?> comparable = bmm.b(entry.getValue()).orElse(null);
/* 144 */       if (comparable == null) {
/* 145 */         return false;
/*     */       }
/* 147 */       if (blc.c(bmm) != comparable) {
/* 148 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 152 */     if (this.b != null) {
/* 153 */       bji bji = ☃.b();
/* 154 */       return (bji != null && hk.a(this.b, bji.a(new gy()), true));
/*     */     } 
/*     */     
/* 157 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cu$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */