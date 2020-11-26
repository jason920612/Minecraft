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
/*    */ 
/*    */ 
/*    */ public class cda
/*    */   extends ccy
/*    */ {
/*    */   private final ccu a;
/*    */   private final int b;
/*    */   
/*    */   public cda(cdk[] ☃, ccu ccu1, int i) {
/* 23 */     super(☃);
/* 24 */     this.a = ccu1;
/* 25 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, Random random, ccr ccr1) {
/* 30 */     aer aer = ccr1.c();
/*    */     
/* 32 */     if (aer instanceof afa) {
/* 33 */       int i = awg.g((afa)aer);
/* 34 */       if (i == 0) {
/* 35 */         return ☃;
/*    */       }
/* 37 */       float f = i * this.a.b(random);
/* 38 */       ☃.f(Math.round(f));
/*    */       
/* 40 */       if (this.b != 0 && ☃.C() > this.b) {
/* 41 */         ☃.e(this.b);
/*    */       }
/*    */     } 
/*    */     
/* 45 */     return ☃;
/*    */   }
/*    */   
/*    */   public static class a extends ccy.a<cda> {
/*    */     protected a() {
/* 50 */       super(new pc("looting_enchant"), cda.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cda cda1, JsonSerializationContext jsonSerializationContext) {
/* 55 */       ☃.add("count", jsonSerializationContext.serialize(cda.a(cda1)));
/* 56 */       if (cda.b(cda1) > 0) {
/* 57 */         ☃.add("limit", jsonSerializationContext.serialize(Integer.valueOf(cda.b(cda1))));
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     public cda a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 63 */       int i = xj.a(☃, "limit", 0);
/* 64 */       return new cda(arrayOfCdk, xj.<ccu>a(☃, "count", jsonDeserializationContext, ccu.class), i);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cda.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */