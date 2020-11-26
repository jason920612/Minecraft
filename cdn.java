/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdn
/*    */   implements cdk
/*    */ {
/*    */   private final boolean a;
/*    */   
/*    */   public cdn(boolean ☃) {
/* 16 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(Random ☃, ccr ccr1) {
/* 21 */     boolean bool = (ccr1.b() != null);
/* 22 */     return (bool == (!this.a));
/*    */   }
/*    */   
/*    */   public static class a extends cdk.a<cdn> {
/*    */     protected a() {
/* 27 */       super(new pc("killed_by_player"), cdn.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cdn cdn1, JsonSerializationContext jsonSerializationContext) {
/* 32 */       ☃.addProperty("inverse", Boolean.valueOf(cdn.a(cdn1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public cdn a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 37 */       return new cdn(xj.a(☃, "inverse", false));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */