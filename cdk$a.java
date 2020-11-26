/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class a<T extends cdk>
/*    */ {
/*    */   private final pc a;
/*    */   private final Class<T> b;
/*    */   
/*    */   protected a(pc ☃, Class<T> clazz) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = clazz;
/*    */   }
/*    */   
/*    */   public pc a() {
/* 24 */     return this.a;
/*    */   }
/*    */   
/*    */   public Class<T> b() {
/* 28 */     return this.b;
/*    */   }
/*    */   
/*    */   public abstract void a(JsonObject paramJsonObject, T paramT, JsonSerializationContext paramJsonSerializationContext);
/*    */   
/*    */   public abstract T b(JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext);
/*    */ }


/* Location:              F:\dw\server.jar!\cdk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */