/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class om
/*     */ {
/*     */   private ij a;
/*     */   private a b;
/*     */   private c c;
/*     */   private String d;
/*     */   
/*     */   public ij a() {
/*  28 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(ij ☃) {
/*  32 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public a b() {
/*  36 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/*  40 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public c c() {
/*  44 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/*  48 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  52 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public String d() {
/*  56 */     return this.d;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final int a;
/*     */     private final int b;
/*     */     private GameProfile[] c;
/*     */     
/*     */     public a(int ☃, int i) {
/*  65 */       this.a = ☃;
/*  66 */       this.b = i;
/*     */     }
/*     */     
/*     */     public int a() {
/*  70 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/*  74 */       return this.b;
/*     */     }
/*     */     
/*     */     public GameProfile[] c() {
/*  78 */       return this.c;
/*     */     }
/*     */     
/*     */     public void a(GameProfile[] ☃) {
/*  82 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public static class a
/*     */       implements JsonDeserializer<a>, JsonSerializer<a> {
/*     */       public om.a a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  88 */         JsonObject jsonObject = xj.m(☃, "players");
/*  89 */         om.a a1 = new om.a(xj.n(jsonObject, "max"), xj.n(jsonObject, "online"));
/*     */         
/*  91 */         if (xj.d(jsonObject, "sample")) {
/*  92 */           JsonArray jsonArray = xj.u(jsonObject, "sample");
/*  93 */           if (jsonArray.size() > 0) {
/*  94 */             GameProfile[] arrayOfGameProfile = new GameProfile[jsonArray.size()];
/*  95 */             for (int i = 0; i < arrayOfGameProfile.length; i++) {
/*  96 */               JsonObject jsonObject1 = xj.m(jsonArray.get(i), "player[" + i + "]");
/*  97 */               String str = xj.h(jsonObject1, "id");
/*  98 */               arrayOfGameProfile[i] = new GameProfile(UUID.fromString(str), xj.h(jsonObject1, "name"));
/*     */             } 
/* 100 */             a1.a(arrayOfGameProfile);
/*     */           } 
/*     */         } 
/*     */         
/* 104 */         return a1;
/*     */       }
/*     */ 
/*     */       
/*     */       public JsonElement a(om.a ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 109 */         JsonObject jsonObject = new JsonObject();
/*     */         
/* 111 */         jsonObject.addProperty("max", Integer.valueOf(☃.a()));
/* 112 */         jsonObject.addProperty("online", Integer.valueOf(☃.b()));
/*     */         
/* 114 */         if (☃.c() != null && (☃.c()).length > 0) {
/* 115 */           JsonArray jsonArray = new JsonArray();
/*     */           
/* 117 */           for (int i = 0; i < (☃.c()).length; i++) {
/* 118 */             JsonObject jsonObject1 = new JsonObject();
/* 119 */             UUID uUID = ☃.c()[i].getId();
/* 120 */             jsonObject1.addProperty("id", (uUID == null) ? "" : uUID.toString());
/* 121 */             jsonObject1.addProperty("name", ☃.c()[i].getName());
/* 122 */             jsonArray.add((JsonElement)jsonObject1);
/*     */           } 
/*     */           
/* 125 */           jsonObject.add("sample", (JsonElement)jsonArray);
/*     */         } 
/*     */         
/* 128 */         return (JsonElement)jsonObject;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c {
/*     */     private final String a;
/*     */     private final int b;
/*     */     
/*     */     public c(String ☃, int i) {
/* 138 */       this.a = ☃;
/* 139 */       this.b = i;
/*     */     }
/*     */     
/*     */     public String a() {
/* 143 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 147 */       return this.b;
/*     */     }
/*     */     
/*     */     public static class a
/*     */       implements JsonDeserializer<c>, JsonSerializer<c> {
/*     */       public om.c a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 153 */         JsonObject jsonObject = xj.m(☃, "version");
/* 154 */         return new om.c(xj.h(jsonObject, "name"), xj.n(jsonObject, "protocol"));
/*     */       }
/*     */ 
/*     */       
/*     */       public JsonElement a(om.c ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 159 */         JsonObject jsonObject = new JsonObject();
/* 160 */         jsonObject.addProperty("name", ☃.a());
/* 161 */         jsonObject.addProperty("protocol", Integer.valueOf(☃.b()));
/* 162 */         return (JsonElement)jsonObject;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements JsonDeserializer<om>, JsonSerializer<om> {
/*     */     public om a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 170 */       JsonObject jsonObject = xj.m(☃, "status");
/* 171 */       om om = new om();
/*     */       
/* 173 */       if (jsonObject.has("description")) {
/* 174 */         om.a((ij)jsonDeserializationContext.deserialize(jsonObject.get("description"), ij.class));
/*     */       }
/*     */       
/* 177 */       if (jsonObject.has("players")) {
/* 178 */         om.a((om.a)jsonDeserializationContext.deserialize(jsonObject.get("players"), om.a.class));
/*     */       }
/*     */       
/* 181 */       if (jsonObject.has("version")) {
/* 182 */         om.a((om.c)jsonDeserializationContext.deserialize(jsonObject.get("version"), om.c.class));
/*     */       }
/*     */       
/* 185 */       if (jsonObject.has("favicon")) {
/* 186 */         om.a(xj.h(jsonObject, "favicon"));
/*     */       }
/*     */       
/* 189 */       return om;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(om ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 194 */       JsonObject jsonObject = new JsonObject();
/*     */       
/* 196 */       if (☃.a() != null) {
/* 197 */         jsonObject.add("description", jsonSerializationContext.serialize(☃.a()));
/*     */       }
/*     */       
/* 200 */       if (☃.b() != null) {
/* 201 */         jsonObject.add("players", jsonSerializationContext.serialize(☃.b()));
/*     */       }
/*     */       
/* 204 */       if (☃.c() != null) {
/* 205 */         jsonObject.add("version", jsonSerializationContext.serialize(☃.c()));
/*     */       }
/*     */       
/* 208 */       if (☃.d() != null) {
/* 209 */         jsonObject.addProperty("favicon", ☃.d());
/*     */       }
/*     */       
/* 212 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\om.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */