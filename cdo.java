/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdo
/*    */   implements cdk
/*    */ {
/*    */   private final float a;
/*    */   
/*    */   public cdo(float ☃) {
/* 16 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(Random ☃, ccr ccr1) {
/* 21 */     return (☃.nextFloat() < this.a);
/*    */   }
/*    */   
/*    */   public static class a extends cdk.a<cdo> {
/*    */     protected a() {
/* 26 */       super(new pc("random_chance"), cdo.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cdo cdo1, JsonSerializationContext jsonSerializationContext) {
/* 31 */       ☃.addProperty("chance", Float.valueOf(cdo.a(cdo1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public cdo a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 36 */       return new cdo(xj.l(☃, "chance"));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */