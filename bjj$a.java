/*     */ import com.mojang.datafixers.types.Type;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a<T extends bji>
/*     */ {
/*     */   private final Supplier<? extends T> a;
/*     */   
/*     */   private a(Supplier<? extends T> ☃) {
/*  95 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public static <T extends bji> a<T> a(Supplier<? extends T> ☃) {
/*  99 */     return new a<>(☃);
/*     */   }
/*     */   
/*     */   public bjj<T> a(Type<?> ☃) {
/* 103 */     return new bjj<>(this.a, ☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */