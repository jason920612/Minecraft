/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdd
/*    */   extends ccy
/*    */ {
/* 19 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final ccu b;
/*    */   
/*    */   public cdd(cdk[] ☃, ccu ccu1) {
/* 24 */     super(☃);
/* 25 */     this.b = ccu1;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, Random random, ccr ccr1) {
/* 30 */     if (☃.e()) {
/* 31 */       float f = 1.0F - this.b.b(random);
/* 32 */       ☃.b(xq.d(f * ☃.h()));
/*    */     } else {
/* 34 */       a.warn("Couldn't set damage of loot item {}", ☃);
/*    */     } 
/* 36 */     return ☃;
/*    */   }
/*    */   
/*    */   public static class a extends ccy.a<cdd> {
/*    */     protected a() {
/* 41 */       super(new pc("set_damage"), cdd.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cdd cdd1, JsonSerializationContext jsonSerializationContext) {
/* 46 */       ☃.add("damage", jsonSerializationContext.serialize(cdd.a(cdd1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public cdd a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 51 */       return new cdd(arrayOfCdk, xj.<ccu>a(☃, "damage", jsonDeserializationContext, ccu.class));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */