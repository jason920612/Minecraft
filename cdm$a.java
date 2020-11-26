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
/*    */ public class a
/*    */   extends cdk.a<cdm>
/*    */ {
/*    */   protected a() {
/* 43 */     super(new pc("entity_properties"), cdm.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdm cdm1, JsonSerializationContext jsonSerializationContext) {
/* 48 */     JsonObject jsonObject = new JsonObject();
/* 49 */     for (cds cds : cdm.a(cdm1)) {
/* 50 */       cds.a<cds> a1 = cdr.a(cds);
/* 51 */       jsonObject.add(a1.a().toString(), a1.a(cds, jsonSerializationContext));
/*    */     } 
/* 53 */     ☃.add("properties", (JsonElement)jsonObject);
/* 54 */     ☃.add("entity", jsonSerializationContext.serialize(cdm.b(cdm1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public cdm a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 59 */     Set<Map.Entry<String, JsonElement>> set = xj.t(☃, "properties").entrySet();
/* 60 */     cds[] arrayOfCds = new cds[set.size()];
/* 61 */     int i = 0;
/* 62 */     for (Map.Entry<String, JsonElement> entry : set) {
/* 63 */       arrayOfCds[i++] = (cds)cdr.a(new pc(entry.getKey())).a(entry.getValue(), jsonDeserializationContext);
/*    */     }
/* 65 */     return new cdm(arrayOfCds, xj.<ccr.b>a(☃, "entity", jsonDeserializationContext, ccr.b.class));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */