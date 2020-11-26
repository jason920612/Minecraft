/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdj
/*    */   implements cdk
/*    */ {
/*    */   private final Map<String, ccu> a;
/*    */   private final ccr.b b;
/*    */   
/*    */   public cdj(Map<String, ccu> ☃, ccr.b b1) {
/* 25 */     this.a = ☃;
/* 26 */     this.b = b1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(Random ☃, ccr ccr1) {
/* 31 */     aer aer = ccr1.a(this.b);
/* 32 */     if (aer == null) {
/* 33 */       return false;
/*    */     }
/* 35 */     cfc cfc = aer.m.G();
/* 36 */     for (Map.Entry<String, ccu> entry : this.a.entrySet()) {
/* 37 */       if (!a(aer, cfc, entry.getKey(), entry.getValue())) {
/* 38 */         return false;
/*    */       }
/*    */     } 
/* 41 */     return true;
/*    */   }
/*    */   
/*    */   protected boolean a(aer ☃, cfc cfc1, String str, ccu ccu1) {
/* 45 */     cez cez = cfc1.d(str);
/* 46 */     if (cez == null) {
/* 47 */       return false;
/*    */     }
/* 49 */     String str1 = ☃.bv();
/* 50 */     if (!cfc1.b(str1, cez)) {
/* 51 */       return false;
/*    */     }
/* 53 */     return ccu1.a(cfc1.c(str1, cez).b());
/*    */   }
/*    */   
/*    */   public static class a extends cdk.a<cdj> {
/*    */     protected a() {
/* 58 */       super(new pc("entity_scores"), cdj.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cdj cdj1, JsonSerializationContext jsonSerializationContext) {
/* 63 */       JsonObject jsonObject = new JsonObject();
/* 64 */       for (Map.Entry<String, ccu> entry : (Iterable<Map.Entry<String, ccu>>)cdj.a(cdj1).entrySet()) {
/* 65 */         jsonObject.add(entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
/*    */       }
/* 67 */       ☃.add("scores", (JsonElement)jsonObject);
/* 68 */       ☃.add("entity", jsonSerializationContext.serialize(cdj.b(cdj1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public cdj a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 73 */       Set<Map.Entry<String, JsonElement>> set = xj.t(☃, "scores").entrySet();
/* 74 */       Map<String, ccu> map = Maps.newLinkedHashMap();
/* 75 */       for (Map.Entry<String, JsonElement> entry : set) {
/* 76 */         map.put(entry.getKey(), xj.a(entry.getValue(), "score", jsonDeserializationContext, ccu.class));
/*    */       }
/* 78 */       return new cdj(map, xj.<ccr.b>a(☃, "entity", jsonDeserializationContext, ccr.b.class));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */