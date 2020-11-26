/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Collection;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ccp
/*    */ {
/*    */   protected final int c;
/*    */   protected final int d;
/*    */   protected final cdk[] e;
/*    */   
/*    */   protected ccp(int ☃, int i, cdk[] arrayOfCdk) {
/* 26 */     this.c = ☃;
/* 27 */     this.d = i;
/* 28 */     this.e = arrayOfCdk;
/*    */   }
/*    */   public abstract void a(Collection<ate> paramCollection, Random paramRandom, ccr paramccr);
/*    */   public int a(float ☃) {
/* 32 */     return Math.max(xq.d(this.c + this.d * ☃), 0);
/*    */   }
/*    */   
/*    */   protected abstract void a(JsonObject paramJsonObject, JsonSerializationContext paramJsonSerializationContext);
/*    */   
/*    */   public static class a implements JsonDeserializer<ccp>, JsonSerializer<ccp> {
/*    */     public ccp a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*    */       cdk[] arrayOfCdk;
/* 40 */       JsonObject jsonObject = xj.m(☃, "loot item");
/* 41 */       String str = xj.h(jsonObject, "type");
/* 42 */       int i = xj.a(jsonObject, "weight", 1);
/* 43 */       int j = xj.a(jsonObject, "quality", 0);
/*    */ 
/*    */       
/* 46 */       if (jsonObject.has("conditions")) {
/* 47 */         arrayOfCdk = xj.<cdk[]>a(jsonObject, "conditions", jsonDeserializationContext, (Class)cdk[].class);
/*    */       } else {
/* 49 */         arrayOfCdk = new cdk[0];
/*    */       } 
/*    */       
/* 52 */       if ("item".equals(str))
/* 53 */         return ccn.a(jsonObject, jsonDeserializationContext, i, j, arrayOfCdk); 
/* 54 */       if ("loot_table".equals(str))
/* 55 */         return ccs.a(jsonObject, jsonDeserializationContext, i, j, arrayOfCdk); 
/* 56 */       if ("empty".equals(str)) {
/* 57 */         return ccm.a(jsonObject, jsonDeserializationContext, i, j, arrayOfCdk);
/*    */       }
/* 59 */       throw new JsonSyntaxException("Unknown loot entry type '" + str + "'");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public JsonElement a(ccp ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 65 */       JsonObject jsonObject = new JsonObject();
/*    */       
/* 67 */       jsonObject.addProperty("weight", Integer.valueOf(☃.c));
/* 68 */       jsonObject.addProperty("quality", Integer.valueOf(☃.d));
/*    */       
/* 70 */       if (☃.e.length > 0) {
/* 71 */         jsonObject.add("conditions", jsonSerializationContext.serialize(☃.e));
/*    */       }
/*    */       
/* 74 */       if (☃ instanceof ccn) {
/* 75 */         jsonObject.addProperty("type", "item");
/* 76 */       } else if (☃ instanceof ccs) {
/* 77 */         jsonObject.addProperty("type", "loot_table");
/* 78 */       } else if (☃ instanceof ccm) {
/* 79 */         jsonObject.addProperty("type", "empty");
/*    */       } else {
/* 81 */         throw new IllegalArgumentException("Don't know how to serialize " + ☃);
/*    */       } 
/* 83 */       ☃.a(jsonObject, jsonSerializationContext);
/*    */       
/* 85 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */