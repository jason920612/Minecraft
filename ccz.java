/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ccz
/*    */ {
/* 20 */   private static final Map<pc, ccy.a<?>> a = Maps.newHashMap();
/* 21 */   private static final Map<Class<? extends ccy>, ccy.a<?>> b = Maps.newHashMap();
/*    */   
/*    */   static {
/* 24 */     a(new cdc.a());
/* 25 */     a(new ccw.a());
/* 26 */     a(new ccv.a());
/* 27 */     a(new cdf.a());
/* 28 */     a(new cdg.a());
/* 29 */     a(new cda.a());
/* 30 */     a(new cdd.a());
/* 31 */     a(new cdb.b());
/* 32 */     a(new cde.a());
/* 33 */     a(new ccx.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends ccy> void a(ccy.a<? extends T> ☃) {
/* 38 */     pc pc = ☃.a();
/* 39 */     Class<T> clazz = (Class)☃.b();
/* 40 */     if (a.containsKey(pc)) {
/* 41 */       throw new IllegalArgumentException("Can't re-register item function name " + pc);
/*    */     }
/* 43 */     if (b.containsKey(clazz)) {
/* 44 */       throw new IllegalArgumentException("Can't re-register item function class " + clazz.getName());
/*    */     }
/* 46 */     a.put(pc, ☃);
/* 47 */     b.put(clazz, ☃);
/*    */   }
/*    */   
/*    */   public static ccy.a<?> a(pc ☃) {
/* 51 */     ccy.a<?> a = a.get(☃);
/* 52 */     if (a == null) {
/* 53 */       throw new IllegalArgumentException("Unknown loot item function '" + ☃ + "'");
/*    */     }
/* 55 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends ccy> ccy.a<T> a(T ☃) {
/* 60 */     ccy.a<T> a = (ccy.a<T>)b.get(☃.getClass());
/* 61 */     if (a == null) {
/* 62 */       throw new IllegalArgumentException("Unknown loot item function " + ☃);
/*    */     }
/* 64 */     return a;
/*    */   }
/*    */   
/*    */   public static class a implements JsonDeserializer<ccy>, JsonSerializer<ccy> {
/*    */     public ccy a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*    */       ccy.a<?> a1;
/* 70 */       JsonObject jsonObject = xj.m(☃, "function");
/* 71 */       pc pc = new pc(xj.h(jsonObject, "function"));
/*    */ 
/*    */       
/*    */       try {
/* 75 */         a1 = ccz.a(pc);
/* 76 */       } catch (IllegalArgumentException illegalArgumentException) {
/* 77 */         throw new JsonSyntaxException("Unknown function '" + pc + "'");
/*    */       } 
/* 79 */       return (ccy)a1.b(jsonObject, jsonDeserializationContext, xj.<cdk[]>a(jsonObject, "conditions", new cdk[0], jsonDeserializationContext, (Class)cdk[].class));
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a(ccy ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 84 */       ccy.a<ccy> a1 = ccz.a(☃);
/* 85 */       JsonObject jsonObject = new JsonObject();
/* 86 */       a1.a(jsonObject, ☃, jsonSerializationContext);
/* 87 */       jsonObject.addProperty("function", a1.a().toString());
/* 88 */       if (☃.b() != null && (☃.b()).length > 0) {
/* 89 */         jsonObject.add("conditions", jsonSerializationContext.serialize(☃.b()));
/*    */       }
/* 91 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */