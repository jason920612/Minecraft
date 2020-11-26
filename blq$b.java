/*    */ import com.google.common.base.Preconditions;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class b<T>
/*    */   implements blm<T>
/*    */ {
/*    */   private final blm<T> a;
/*    */   
/*    */   b(blm<T> ☃) {
/* 62 */     this.a = (blm<T>)Preconditions.checkNotNull(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean test(@Nullable T ☃, axk axk1, el el1) {
/* 67 */     return !this.a.test(☃, axk1, el1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\blq$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */