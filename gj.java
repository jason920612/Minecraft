/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gj
/*    */ {
/*    */   private final avn.a<?> a;
/*    */   
/*    */   public gj(avn.a<?> ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public static gj a(avn.a<?> ☃) {
/* 18 */     return new gj(☃);
/*    */   }
/*    */   
/*    */   public void a(Consumer<ge> ☃, String str) {
/* 22 */     ☃.accept(new ge(this, str)
/*    */         {
/*    */           public JsonObject a() {
/* 25 */             JsonObject ☃ = new JsonObject();
/* 26 */             ☃.addProperty("type", gj.a(this.b).a());
/* 27 */             return ☃;
/*    */           }
/*    */ 
/*    */           
/*    */           public pc b() {
/* 32 */             return new pc(this.a);
/*    */           }
/*    */ 
/*    */           
/*    */           @Nullable
/*    */           public JsonObject c() {
/* 38 */             return null;
/*    */           }
/*    */ 
/*    */           
/*    */           @Nullable
/*    */           public pc d() {
/* 44 */             return new pc("");
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\gj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */