/*     */ import com.google.common.base.Preconditions;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class blq
/*     */ {
/*     */   public static <T> blm<T> a(blm<T> ☃) {
/*  14 */     return new b<>(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> blm<T> b(blm<? super T>... ☃) {
/*  34 */     return new c<>(a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T> List<T> a(T... ☃) {
/*  47 */     return c(Arrays.asList(☃));
/*     */   }
/*     */   
/*     */   private static <T> List<T> c(Iterable<T> ☃) {
/*  51 */     List<T> list = Lists.newArrayList();
/*  52 */     for (T t : ☃) {
/*  53 */       list.add((T)Preconditions.checkNotNull(t));
/*     */     }
/*  55 */     return list;
/*     */   }
/*     */   
/*     */   static class b<T> implements blm<T> {
/*     */     private final blm<T> a;
/*     */     
/*     */     b(blm<T> ☃) {
/*  62 */       this.a = (blm<T>)Preconditions.checkNotNull(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean test(@Nullable T ☃, axk axk1, el el1) {
/*  67 */       return !this.a.test(☃, axk1, el1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class c<T>
/*     */     implements blm<T>
/*     */   {
/*     */     private final List<? extends blm<? super T>> a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private c(List<? extends blm<? super T>> ☃) {
/*  93 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean test(@Nullable T ☃, axk axk1, el el1) {
/*  98 */       for (int i = 0; i < this.a.size(); i++) {
/*  99 */         if (((blm<T>)this.a.get(i)).test(☃, axk1, el1)) {
/* 100 */           return true;
/*     */         }
/*     */       } 
/* 103 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\blq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */