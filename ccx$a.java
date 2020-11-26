/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Locale;
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
/*    */   extends ccy.a<ccx>
/*    */ {
/*    */   protected a() {
/* 70 */     super(new pc("exploration_map"), ccx.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, ccx ccx1, JsonSerializationContext jsonSerializationContext) {
/* 75 */     ☃.add("destination", jsonSerializationContext.serialize(ccx.a(ccx1)));
/* 76 */     ☃.add("decoration", jsonSerializationContext.serialize(ccx.b(ccx1).toString().toLowerCase(Locale.ROOT)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ccx a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 81 */     String str1 = ☃.has("destination") ? xj.h(☃, "destination") : "Buried_Treasure";
/* 82 */     str1 = bqo.aF.containsKey(str1.toLowerCase(Locale.ROOT)) ? str1 : "Buried_Treasure";
/*    */     
/* 84 */     String str2 = ☃.has("decoration") ? xj.h(☃, "decoration") : "mansion";
/* 85 */     cbq.a a1 = cbq.a.i;
/*    */     try {
/* 87 */       a1 = cbq.a.valueOf(str2.toUpperCase(Locale.ROOT));
/* 88 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 89 */       ccx.a().error("Error while parsing loot table decoration entry. Found {}. Defaulting to MANSION", str2);
/*    */     } 
/*    */     
/* 92 */     byte b = ☃.has("zoom") ? xj.o(☃, "zoom") : 2;
/*    */     
/* 94 */     int i = ☃.has("search_radius") ? xj.n(☃, "search_radius") : 50;
/*    */     
/* 96 */     boolean bool = ☃.has("skip_existing_chunks") ? xj.j(☃, "skip_existing_chunks") : true;
/*    */     
/* 98 */     return new ccx(arrayOfCdk, str1, a1, b, i, bool);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */