/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */   extends ccy.a<cdf>
/*    */ {
/*    */   public a() {
/* 34 */     super(new pc("set_nbt"), cdf.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, cdf cdf1, JsonSerializationContext jsonSerializationContext) {
/* 39 */     ☃.addProperty("tag", cdf.a(cdf1).toString());
/*    */   }
/*    */ 
/*    */   
/*    */   public cdf a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/*    */     try {
/* 45 */       gy gy = hp.a(xj.h(☃, "tag"));
/* 46 */       return new cdf(arrayOfCdk, gy);
/* 47 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 48 */       throw new JsonSyntaxException(commandSyntaxException.getMessage());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */