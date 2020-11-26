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
/*    */ 
/*    */ public class ccw
/*    */   extends ccy
/*    */ {
/*    */   private final ccu a;
/*    */   private final boolean b;
/*    */   
/*    */   public ccw(cdk[] ☃, ccu ccu1, boolean bool) {
/* 21 */     super(☃);
/* 22 */     this.a = ccu1;
/* 23 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, Random random, ccr ccr1) {
/* 28 */     return awg.a(random, ☃, this.a.a(random), this.b);
/*    */   }
/*    */   
/*    */   public static class a extends ccy.a<ccw> {
/*    */     public a() {
/* 33 */       super(new pc("enchant_with_levels"), ccw.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, ccw ccw1, JsonSerializationContext jsonSerializationContext) {
/* 38 */       ☃.add("levels", jsonSerializationContext.serialize(ccw.a(ccw1)));
/* 39 */       ☃.addProperty("treasure", Boolean.valueOf(ccw.b(ccw1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public ccw a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 44 */       ccu ccu = xj.<ccu>a(☃, "levels", jsonDeserializationContext, ccu.class);
/* 45 */       boolean bool = xj.a(☃, "treasure", false);
/* 46 */       return new ccw(arrayOfCdk, ccu, bool);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */