/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class xn<T>
/*    */ {
/*    */   private Supplier<T> a;
/*    */   private T b;
/*    */   
/*    */   public xn(Supplier<T> ☃) {
/* 10 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public T a() {
/* 14 */     Supplier<T> ☃ = this.a;
/* 15 */     if (☃ != null) {
/* 16 */       this.b = ☃.get();
/* 17 */       this.a = null;
/*    */     } 
/*    */     
/* 20 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */