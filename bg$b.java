/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
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
/*    */ public class b
/*    */   extends y
/*    */ {
/*    */   private final pc a;
/*    */   
/*    */   public b(pc ☃) {
/* 73 */     super(bg.b());
/* 74 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement b() {
/* 79 */     JsonObject ☃ = new JsonObject();
/* 80 */     ☃.addProperty("recipe", this.a.toString());
/* 81 */     return (JsonElement)☃;
/*    */   }
/*    */   
/*    */   public boolean a(avk ☃) {
/* 85 */     return this.a.equals(☃.b());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bg$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */