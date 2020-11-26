/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.ToIntFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum a
/*     */ {
/*     */   a, b;
/*     */   public final BiConsumer<tf, Integer> c;
/*     */   public final BiPredicate<tf, Integer> d;
/*     */   public final String e;
/*     */   private final ToIntFunction<tf> f;
/*     */   
/*     */   static {
/* 138 */     a = new a("POINTS", 0, "points", aog::d, (☃, integer) -> {
/*     */           if (integer.intValue() >= ☃.dv()) {
/*     */             return false;
/*     */           }
/*     */           ☃.a(integer.intValue());
/*     */           return true;
/*     */         }☃ -> xq.d(☃.bY * ☃.dv()));
/* 145 */     b = new a("LEVELS", 1, "levels", tf::c, (☃, integer) -> {
/*     */           ☃.b(integer.intValue());
/*     */           return true;
/*     */         }☃ -> ☃.bW);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(String ☃, BiConsumer<tf, Integer> biConsumer, BiPredicate<tf, Integer> biPredicate, ToIntFunction<tf> toIntFunction) {
/* 156 */     this.c = biConsumer;
/* 157 */     this.e = ☃;
/* 158 */     this.d = biPredicate;
/* 159 */     this.f = toIntFunction;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */