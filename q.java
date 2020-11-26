/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class q
/*    */ {
/*    */   private final t a;
/*    */   
/*    */   public q(t ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public q() {
/* 23 */     this.a = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) {}
/*    */   
/*    */   public static q a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 30 */     pc pc = new pc(xj.h(☃, "trigger"));
/* 31 */     s<?> s = p.a(pc);
/* 32 */     if (s == null) {
/* 33 */       throw new JsonSyntaxException("Invalid criterion trigger: " + pc);
/*    */     }
/* 35 */     t t1 = (t)s.a(xj.a(☃, "conditions", new JsonObject()), jsonDeserializationContext);
/* 36 */     return new q(t1);
/*    */   }
/*    */   
/*    */   public static q b(hy ☃) {
/* 40 */     return new q();
/*    */   }
/*    */   
/*    */   public static Map<String, q> b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 44 */     Map<String, q> map = Maps.newHashMap();
/* 45 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 46 */       map.put(entry.getKey(), a(xj.m(entry.getValue(), "criterion"), jsonDeserializationContext));
/*    */     }
/* 48 */     return map;
/*    */   }
/*    */   
/*    */   public static Map<String, q> c(hy ☃) {
/* 52 */     Map<String, q> map = Maps.newHashMap();
/* 53 */     int i = ☃.g();
/* 54 */     for (int j = 0; j < i; j++) {
/* 55 */       map.put(☃.e(32767), b(☃));
/*    */     }
/* 57 */     return map;
/*    */   }
/*    */   
/*    */   public static void a(Map<String, q> ☃, hy hy1) {
/* 61 */     hy1.d(☃.size());
/* 62 */     for (Map.Entry<String, q> entry : ☃.entrySet()) {
/* 63 */       hy1.a(entry.getKey());
/* 64 */       ((q)entry.getValue()).a(hy1);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public t a() {
/* 70 */     return this.a;
/*    */   }
/*    */   
/*    */   public JsonElement b() {
/* 74 */     JsonObject ☃ = new JsonObject();
/* 75 */     ☃.addProperty("trigger", this.a.a().toString());
/* 76 */     ☃.add("conditions", this.a.b());
/*    */     
/* 78 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */