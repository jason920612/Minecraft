/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vs<T>
/*    */ {
/*    */   @Nullable
/*    */   private final T a;
/*    */   
/*    */   public vs(T ☃) {
/* 12 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   protected vs(@Nullable T ☃, JsonObject jsonObject) {
/* 16 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   T g() {
/* 21 */     return this.a;
/*    */   }
/*    */   
/*    */   boolean f() {
/* 25 */     return false;
/*    */   }
/*    */   
/*    */   protected void a(JsonObject ☃) {}
/*    */ }


/* Location:              F:\dw\server.jar!\vs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */