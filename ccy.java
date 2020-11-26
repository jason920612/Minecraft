/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ccy
/*    */ {
/*    */   private final cdk[] a;
/*    */   
/*    */   protected ccy(cdk[] ☃) {
/* 17 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public abstract ate a(ate paramate, Random paramRandom, ccr paramccr);
/*    */   
/*    */   public cdk[] b() {
/* 23 */     return this.a;
/*    */   }
/*    */   
/*    */   public static abstract class a<T extends ccy> {
/*    */     private final pc a;
/*    */     private final Class<T> b;
/*    */     
/*    */     protected a(pc ☃, Class<T> clazz) {
/* 31 */       this.a = ☃;
/* 32 */       this.b = clazz;
/*    */     }
/*    */     
/*    */     public pc a() {
/* 36 */       return this.a;
/*    */     }
/*    */     
/*    */     public Class<T> b() {
/* 40 */       return this.b;
/*    */     }
/*    */     
/*    */     public abstract void a(JsonObject param1JsonObject, T param1T, JsonSerializationContext param1JsonSerializationContext);
/*    */     
/*    */     public abstract T b(JsonObject param1JsonObject, JsonDeserializationContext param1JsonDeserializationContext, cdk[] param1ArrayOfcdk);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */