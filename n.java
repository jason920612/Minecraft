/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Arrays;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class n
/*     */   implements Comparable<n>
/*     */ {
/*  24 */   private final Map<String, r> a = Maps.newHashMap();
/*  25 */   private String[][] b = new String[0][];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Map<String, q> ☃, String[][] arrayOfString) {
/*  31 */     Set<String> set = ☃.keySet();
/*  32 */     this.a.entrySet().removeIf(entry -> !☃.contains(entry.getKey()));
/*  33 */     for (String str : set) {
/*  34 */       if (!this.a.containsKey(str)) {
/*  35 */         this.a.put(str, new r());
/*     */       }
/*     */     } 
/*  38 */     this.b = arrayOfString;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  42 */     if (this.b.length == 0) {
/*  43 */       return false;
/*     */     }
/*  45 */     for (String[] ☃ : this.b) {
/*  46 */       boolean bool = false;
/*  47 */       for (String str : ☃) {
/*  48 */         r r = c(str);
/*  49 */         if (r != null && r.a()) {
/*  50 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/*  54 */       if (!bool) {
/*  55 */         return false;
/*     */       }
/*     */     } 
/*  58 */     return true;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  62 */     for (r ☃ : this.a.values()) {
/*  63 */       if (☃.a()) {
/*  64 */         return true;
/*     */       }
/*     */     } 
/*  67 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(String ☃) {
/*  71 */     r r = this.a.get(☃);
/*  72 */     if (r != null && !r.a()) {
/*  73 */       r.b();
/*  74 */       return true;
/*     */     } 
/*  76 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/*  80 */     r r = this.a.get(☃);
/*  81 */     if (r != null && r.a()) {
/*  82 */       r.c();
/*  83 */       return true;
/*     */     } 
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  90 */     return "AdvancementProgress{criteria=" + this.a + ", requirements=" + 
/*     */       
/*  92 */       Arrays.deepToString((Object[])this.b) + '}';
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) {
/*  97 */     ☃.d(this.a.size());
/*  98 */     for (Map.Entry<String, r> entry : this.a.entrySet()) {
/*  99 */       ☃.a(entry.getKey());
/* 100 */       ((r)entry.getValue()).a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static n b(hy ☃) {
/* 105 */     n n1 = new n();
/* 106 */     int i = ☃.g();
/* 107 */     for (int j = 0; j < i; j++) {
/* 108 */       n1.a.put(☃.e(32767), r.b(☃));
/*     */     }
/* 110 */     return n1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public r c(String ☃) {
/* 115 */     return this.a.get(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterable<String> e() {
/* 161 */     List<String> ☃ = Lists.newArrayList();
/* 162 */     for (Map.Entry<String, r> entry : this.a.entrySet()) {
/* 163 */       if (!((r)entry.getValue()).a()) {
/* 164 */         ☃.add(entry.getKey());
/*     */       }
/*     */     } 
/* 167 */     return ☃;
/*     */   }
/*     */   
/*     */   public Iterable<String> f() {
/* 171 */     List<String> ☃ = Lists.newArrayList();
/* 172 */     for (Map.Entry<String, r> entry : this.a.entrySet()) {
/* 173 */       if (((r)entry.getValue()).a()) {
/* 174 */         ☃.add(entry.getKey());
/*     */       }
/*     */     } 
/* 177 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Date g() {
/* 182 */     Date ☃ = null;
/*     */     
/* 184 */     for (r r : this.a.values()) {
/* 185 */       if (r.a() && (☃ == null || r.d().before(☃))) {
/* 186 */         ☃ = r.d();
/*     */       }
/*     */     } 
/*     */     
/* 190 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(n ☃) {
/* 195 */     Date date1 = g();
/* 196 */     Date date2 = ☃.g();
/*     */     
/* 198 */     if (date1 == null && date2 != null) {
/* 199 */       return 1;
/*     */     }
/* 201 */     if (date1 != null && date2 == null) {
/* 202 */       return -1;
/*     */     }
/* 204 */     if (date1 == null && date2 == null) {
/* 205 */       return 0;
/*     */     }
/*     */     
/* 208 */     return date1.compareTo(date2);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<n>, JsonSerializer<n> {
/*     */     public JsonElement a(n ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 214 */       JsonObject jsonObject1 = new JsonObject();
/* 215 */       JsonObject jsonObject2 = new JsonObject();
/* 216 */       for (Map.Entry<String, r> entry : (Iterable<Map.Entry<String, r>>)n.b(☃).entrySet()) {
/* 217 */         r r = entry.getValue();
/* 218 */         if (r.a()) {
/* 219 */           jsonObject2.add(entry.getKey(), r.e());
/*     */         }
/*     */       } 
/* 222 */       if (!jsonObject2.entrySet().isEmpty()) {
/* 223 */         jsonObject1.add("criteria", (JsonElement)jsonObject2);
/*     */       }
/* 225 */       jsonObject1.addProperty("done", Boolean.valueOf(☃.a()));
/* 226 */       return (JsonElement)jsonObject1;
/*     */     }
/*     */ 
/*     */     
/*     */     public n a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 231 */       JsonObject jsonObject1 = xj.m(☃, "advancement");
/* 232 */       JsonObject jsonObject2 = xj.a(jsonObject1, "criteria", new JsonObject());
/* 233 */       n n = new n();
/*     */       
/* 235 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject2.entrySet()) {
/* 236 */         String str = entry.getKey();
/* 237 */         n.b(n).put(str, r.a(xj.a(entry.getValue(), str)));
/*     */       } 
/*     */       
/* 240 */       return n;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */