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
/*    */ public abstract class a<T extends ccy>
/*    */ {
/*    */   private final pc a;
/*    */   private final Class<T> b;
/*    */   
/*    */   protected a(pc ☃, Class<T> clazz) {
/* 31 */     this.a = ☃;
/* 32 */     this.b = clazz;
/*    */   }
/*    */   
/*    */   public pc a() {
/* 36 */     return this.a;
/*    */   }
/*    */   
/*    */   public Class<T> b() {
/* 40 */     return this.b;
/*    */   }
/*    */   
/*    */   public abstract void a(JsonObject paramJsonObject, T paramT, JsonSerializationContext paramJsonSerializationContext);
/*    */   
/*    */   public abstract T b(JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext, cdk[] paramArrayOfcdk);
/*    */ }


/* Location:              F:\dw\server.jar!\ccy$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */