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
/*    */ 
/*    */ public class cdc
/*    */   extends ccy
/*    */ {
/*    */   private final ccu a;
/*    */   
/*    */   public cdc(cdk[] ☃, ccu ccu1) {
/* 19 */     super(☃);
/* 20 */     this.a = ccu1;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, Random random, ccr ccr1) {
/* 25 */     ☃.e(this.a.a(random));
/* 26 */     return ☃;
/*    */   }
/*    */   
/*    */   public static class a extends ccy.a<cdc> {
/*    */     protected a() {
/* 31 */       super(new pc("set_count"), cdc.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cdc cdc1, JsonSerializationContext jsonSerializationContext) {
/* 36 */       ☃.add("count", jsonSerializationContext.serialize(cdc.a(cdc1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public cdc a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 41 */       return new cdc(arrayOfCdk, xj.<ccu>a(☃, "count", jsonDeserializationContext, ccu.class));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */