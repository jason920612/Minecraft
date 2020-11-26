/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cdk
/*    */ {
/*    */   boolean a(Random paramRandom, ccr paramccr);
/*    */   
/*    */   public static abstract class a<T extends cdk>
/*    */   {
/*    */     private final pc a;
/*    */     private final Class<T> b;
/*    */     
/*    */     protected a(pc ☃, Class<T> clazz) {
/* 19 */       this.a = ☃;
/* 20 */       this.b = clazz;
/*    */     }
/*    */     
/*    */     public pc a() {
/* 24 */       return this.a;
/*    */     }
/*    */     
/*    */     public Class<T> b() {
/* 28 */       return this.b;
/*    */     }
/*    */     
/*    */     public abstract void a(JsonObject param1JsonObject, T param1T, JsonSerializationContext param1JsonSerializationContext);
/*    */     
/*    */     public abstract T b(JsonObject param1JsonObject, JsonDeserializationContext param1JsonDeserializationContext);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */