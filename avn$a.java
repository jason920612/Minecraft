/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Function;
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
/*    */ public final class a<T extends avk>
/*    */   implements avm<T>
/*    */ {
/*    */   private final String a;
/*    */   private final Function<pc, T> b;
/*    */   
/*    */   public a(String ☃, Function<pc, T> function) {
/* 75 */     this.a = ☃;
/* 76 */     this.b = function;
/*    */   }
/*    */ 
/*    */   
/*    */   public T a(pc ☃, JsonObject jsonObject) {
/* 81 */     return this.b.apply(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public T a(pc ☃, hy hy1) {
/* 86 */     return this.b.apply(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(hy ☃, T t) {}
/*    */ 
/*    */   
/*    */   public String a() {
/* 95 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */