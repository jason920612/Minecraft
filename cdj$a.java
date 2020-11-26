/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends cdk.a<cdj>
/*    */ {
/*    */   protected a() {
/* 58 */     super(new pc("entity_scores"), cdj.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdj cdj1, JsonSerializationContext jsonSerializationContext) {
/* 63 */     JsonObject jsonObject = new JsonObject();
/* 64 */     for (Map.Entry<String, ccu> entry : (Iterable<Map.Entry<String, ccu>>)cdj.a(cdj1).entrySet()) {
/* 65 */       jsonObject.add(entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
/*    */     }
/* 67 */     ☃.add("scores", (JsonElement)jsonObject);
/* 68 */     ☃.add("entity", jsonSerializationContext.serialize(cdj.b(cdj1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cdj a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 73 */     Set<Map.Entry<String, JsonElement>> set = xj.t(☃, "scores").entrySet();
/* 74 */     Map<String, ccu> map = Maps.newLinkedHashMap();
/* 75 */     for (Map.Entry<String, JsonElement> entry : set) {
/* 76 */       map.put(entry.getKey(), xj.a(entry.getValue(), "score", jsonDeserializationContext, ccu.class));
/*    */     }
/* 78 */     return new cdj(map, xj.<ccr.b>a(☃, "entity", jsonDeserializationContext, ccr.b.class));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */