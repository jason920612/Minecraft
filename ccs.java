/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Collection;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ccs
/*    */   extends ccp
/*    */ {
/*    */   protected final pc a;
/*    */   
/*    */   public ccs(pc ☃, int i, int j, cdk[] arrayOfCdk) {
/* 18 */     super(i, j, arrayOfCdk);
/* 19 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Collection<ate> ☃, Random random, ccr ccr1) {
/* 24 */     ccq ccq = ccr1.f().a(this.a);
/* 25 */     ☃.addAll(ccq.a(random, ccr1));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {
/* 30 */     ☃.addProperty("name", this.a.toString());
/*    */   }
/*    */   
/*    */   public static ccs a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, cdk[] arrayOfCdk) {
/* 34 */     pc pc1 = new pc(xj.h(☃, "name"));
/*    */     
/* 36 */     return new ccs(pc1, i, j, arrayOfCdk);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */