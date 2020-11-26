/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
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
/*    */ public abstract class a<T extends cds>
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
/*    */   public abstract JsonElement a(T paramT, JsonSerializationContext paramJsonSerializationContext);
/*    */   
/*    */   public abstract T a(JsonElement paramJsonElement, JsonDeserializationContext paramJsonDeserializationContext);
/*    */ }


/* Location:              F:\dw\server.jar!\cds$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */