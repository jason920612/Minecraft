/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Map;
/*    */ import java.util.regex.Pattern;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gt
/*    */ {
/* 20 */   private static final Logger a = LogManager.getLogger();
/*    */   
/* 22 */   private static final Pattern b = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
/*    */   
/* 24 */   private static final gt c = new gt();
/*    */   
/* 26 */   private final Map<String, String> d = Maps.newHashMap();
/*    */   private long e;
/*    */   
/*    */   public gt() {
/*    */     try {
/* 31 */       InputStream ☃ = gt.class.getResourceAsStream("/assets/minecraft/lang/en_us.json");
/* 32 */       JsonElement jsonElement = (JsonElement)(new Gson()).fromJson(new InputStreamReader(☃, StandardCharsets.UTF_8), JsonElement.class);
/* 33 */       JsonObject jsonObject = xj.m(jsonElement, "strings");
/* 34 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 35 */         String str = b.matcher(xj.a(entry.getValue(), entry.getKey())).replaceAll("%$1s");
/* 36 */         this.d.put(entry.getKey(), str);
/*    */       } 
/* 38 */       this.e = k.b();
/* 39 */     } catch (JsonParseException ☃) {
/* 40 */       a.error("Couldn't read strings from /assets/minecraft/lang/en_us.json", (Throwable)☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static gt a() {
/* 45 */     return c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public synchronized String a(String ☃) {
/* 55 */     return c(☃);
/*    */   }
/*    */   
/*    */   private String c(String ☃) {
/* 59 */     String str = this.d.get(☃);
/* 60 */     return (str == null) ? ☃ : str;
/*    */   }
/*    */   
/*    */   public synchronized boolean b(String ☃) {
/* 64 */     return this.d.containsKey(☃);
/*    */   }
/*    */   
/*    */   public long b() {
/* 68 */     return this.e;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\gt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */