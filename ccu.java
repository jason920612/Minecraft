/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ccu
/*    */ {
/*    */   private final float a;
/*    */   private final float b;
/*    */   
/*    */   public ccu(float ☃, float f1) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = f1;
/*    */   }
/*    */   
/*    */   public ccu(float ☃) {
/* 27 */     this.a = ☃;
/* 28 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public float a() {
/* 32 */     return this.a;
/*    */   }
/*    */   
/*    */   public float b() {
/* 36 */     return this.b;
/*    */   }
/*    */   
/*    */   public int a(Random ☃) {
/* 40 */     return xq.a(☃, xq.d(this.a), xq.d(this.b));
/*    */   }
/*    */   
/*    */   public float b(Random ☃) {
/* 44 */     return xq.a(☃, this.a, this.b);
/*    */   }
/*    */   
/*    */   public boolean a(int ☃) {
/* 48 */     return (☃ <= this.b && ☃ >= this.a);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements JsonDeserializer<ccu>, JsonSerializer<ccu> {
/*    */     public ccu a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 54 */       if (xj.b(☃)) {
/* 55 */         return new ccu(xj.e(☃, "value"));
/*    */       }
/* 57 */       JsonObject jsonObject = xj.m(☃, "value");
/* 58 */       float f1 = xj.l(jsonObject, "min");
/* 59 */       float f2 = xj.l(jsonObject, "max");
/* 60 */       return new ccu(f1, f2);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public JsonElement a(ccu ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 66 */       if (ccu.a(☃) == ccu.b(☃)) {
/* 67 */         return (JsonElement)new JsonPrimitive(Float.valueOf(ccu.a(☃)));
/*    */       }
/* 69 */       JsonObject jsonObject = new JsonObject();
/* 70 */       jsonObject.addProperty("min", Float.valueOf(ccu.a(☃)));
/* 71 */       jsonObject.addProperty("max", Float.valueOf(ccu.b(☃)));
/* 72 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */