/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ea<T extends ArgumentType<?>>
/*    */   implements dy<T>
/*    */ {
/*    */   private final Supplier<T> a;
/*    */   
/*    */   public ea(Supplier<T> ☃) {
/* 13 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(T ☃, hy hy1) {}
/*    */ 
/*    */   
/*    */   public T b(hy ☃) {
/* 22 */     return this.a.get();
/*    */   }
/*    */   
/*    */   public void a(T ☃, JsonObject jsonObject) {}
/*    */ }


/* Location:              F:\dw\server.jar!\ea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */