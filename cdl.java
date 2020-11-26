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
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdl
/*    */ {
/* 22 */   private static final Map<pc, cdk.a<?>> a = Maps.newHashMap();
/* 23 */   private static final Map<Class<? extends cdk>, cdk.a<?>> b = Maps.newHashMap();
/*    */   
/*    */   static {
/* 26 */     a(new cdo.a());
/* 27 */     a(new cdp.a());
/* 28 */     a(new cdm.a());
/* 29 */     a(new cdn.a());
/* 30 */     a(new cdj.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends cdk> void a(cdk.a<? extends T> ☃) {
/* 35 */     pc pc = ☃.a();
/* 36 */     Class<T> clazz = (Class)☃.b();
/* 37 */     if (a.containsKey(pc)) {
/* 38 */       throw new IllegalArgumentException("Can't re-register item condition name " + pc);
/*    */     }
/* 40 */     if (b.containsKey(clazz)) {
/* 41 */       throw new IllegalArgumentException("Can't re-register item condition class " + clazz.getName());
/*    */     }
/* 43 */     a.put(pc, ☃);
/* 44 */     b.put(clazz, ☃);
/*    */   }
/*    */   
/*    */   public static boolean a(@Nullable cdk[] ☃, Random random, ccr ccr1) {
/* 48 */     if (☃ == null) {
/* 49 */       return true;
/*    */     }
/* 51 */     for (cdk cdk1 : ☃) {
/* 52 */       if (!cdk1.a(random, ccr1)) {
/* 53 */         return false;
/*    */       }
/*    */     } 
/* 56 */     return true;
/*    */   }
/*    */   
/*    */   public static cdk.a<?> a(pc ☃) {
/* 60 */     cdk.a<?> a = a.get(☃);
/* 61 */     if (a == null) {
/* 62 */       throw new IllegalArgumentException("Unknown loot item condition '" + ☃ + "'");
/*    */     }
/* 64 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends cdk> cdk.a<T> a(T ☃) {
/* 69 */     cdk.a<T> a = (cdk.a<T>)b.get(☃.getClass());
/* 70 */     if (a == null) {
/* 71 */       throw new IllegalArgumentException("Unknown loot item condition " + ☃);
/*    */     }
/* 73 */     return a;
/*    */   }
/*    */   
/*    */   public static class a implements JsonDeserializer<cdk>, JsonSerializer<cdk> {
/*    */     public cdk a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*    */       cdk.a<?> a1;
/* 79 */       JsonObject jsonObject = xj.m(☃, "condition");
/* 80 */       pc pc = new pc(xj.h(jsonObject, "condition"));
/*    */ 
/*    */       
/*    */       try {
/* 84 */         a1 = cdl.a(pc);
/* 85 */       } catch (IllegalArgumentException illegalArgumentException) {
/* 86 */         throw new JsonSyntaxException("Unknown condition '" + pc + "'");
/*    */       } 
/* 88 */       return (cdk)a1.b(jsonObject, jsonDeserializationContext);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a(cdk ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 93 */       cdk.a<cdk> a1 = cdl.a(☃);
/* 94 */       JsonObject jsonObject = new JsonObject();
/* 95 */       a1.a(jsonObject, ☃, jsonSerializationContext);
/* 96 */       jsonObject.addProperty("condition", a1.a().toString());
/* 97 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */