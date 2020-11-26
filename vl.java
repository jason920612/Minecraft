/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.ProfileLookupCallback;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.lang.reflect.Type;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Deque;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vl
/*     */ {
/*  46 */   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*     */   private static boolean c;
/*  48 */   private final Map<String, a> d = Maps.newHashMap();
/*  49 */   private final Map<UUID, a> e = Maps.newHashMap();
/*  50 */   private final Deque<GameProfile> f = Lists.newLinkedList();
/*     */   private final GameProfileRepository g;
/*     */   protected final Gson b;
/*     */   private final File h;
/*     */   
/*     */   public vl(GameProfileRepository ☃, File file) {
/*  56 */     this.g = ☃;
/*  57 */     this.h = file;
/*     */     
/*  59 */     GsonBuilder gsonBuilder = new GsonBuilder();
/*  60 */     gsonBuilder.registerTypeHierarchyAdapter(a.class, new b());
/*  61 */     this.b = gsonBuilder.create();
/*     */     
/*  63 */     b();
/*     */   }
/*     */   
/*     */   private static GameProfile a(GameProfileRepository ☃, String str) {
/*  67 */     GameProfile[] arrayOfGameProfile = new GameProfile[1];
/*  68 */     ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(arrayOfGameProfile)
/*     */       {
/*     */         public void onProfileLookupSucceeded(GameProfile ☃) {
/*  71 */           this.a[0] = ☃;
/*     */         }
/*     */ 
/*     */         
/*     */         public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/*  76 */           this.a[0] = null;
/*     */         }
/*     */       };
/*     */     
/*  80 */     ☃.findProfilesByNames(new String[] { str }, Agent.MINECRAFT, profileLookupCallback);
/*  81 */     if (!d() && arrayOfGameProfile[0] == null) {
/*  82 */       UUID uUID = aog.a(new GameProfile(null, str));
/*  83 */       GameProfile gameProfile = new GameProfile(uUID, str);
/*  84 */       profileLookupCallback.onProfileLookupSucceeded(gameProfile);
/*     */     } 
/*  86 */     return arrayOfGameProfile[0];
/*     */   }
/*     */   
/*     */   public static void a(boolean ☃) {
/*  90 */     c = ☃;
/*     */   }
/*     */   
/*     */   private static boolean d() {
/*  94 */     return c;
/*     */   }
/*     */   
/*     */   public void a(GameProfile ☃) {
/*  98 */     a(☃, (Date)null);
/*     */   }
/*     */   
/*     */   private void a(GameProfile ☃, Date date) {
/* 102 */     UUID uUID = ☃.getId();
/* 103 */     if (date == null) {
/* 104 */       Calendar calendar = Calendar.getInstance();
/* 105 */       calendar.setTime(new Date());
/* 106 */       calendar.add(2, 1);
/* 107 */       date = calendar.getTime();
/*     */     } 
/* 109 */     a a = new a(☃, date);
/* 110 */     if (this.e.containsKey(uUID)) {
/* 111 */       a a1 = this.e.get(uUID);
/* 112 */       this.d.remove(a1.a().getName().toLowerCase(Locale.ROOT));
/* 113 */       this.f.remove(☃);
/*     */     } 
/* 115 */     this.d.put(☃.getName().toLowerCase(Locale.ROOT), a);
/* 116 */     this.e.put(uUID, a);
/* 117 */     this.f.addFirst(☃);
/* 118 */     c();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public GameProfile a(String ☃) {
/* 123 */     String str = ☃.toLowerCase(Locale.ROOT);
/* 124 */     a a = this.d.get(str);
/*     */ 
/*     */     
/* 127 */     if (a != null && (new Date()).getTime() >= a.a(a).getTime()) {
/* 128 */       this.e.remove(a.a().getId());
/* 129 */       this.d.remove(a.a().getName().toLowerCase(Locale.ROOT));
/* 130 */       this.f.remove(a.a());
/* 131 */       a = null;
/*     */     } 
/*     */     
/* 134 */     if (a != null) {
/*     */       
/* 136 */       GameProfile gameProfile = a.a();
/* 137 */       this.f.remove(gameProfile);
/* 138 */       this.f.addFirst(gameProfile);
/*     */     } else {
/* 140 */       GameProfile gameProfile = a(this.g, str);
/* 141 */       if (gameProfile != null) {
/* 142 */         a(gameProfile);
/* 143 */         a = this.d.get(str);
/*     */       } 
/*     */     } 
/* 146 */     c();
/* 147 */     return (a == null) ? null : a.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public GameProfile a(UUID ☃) {
/* 157 */     a a = this.e.get(☃);
/* 158 */     return (a == null) ? null : a.a();
/*     */   }
/*     */   
/*     */   private a b(UUID ☃) {
/* 162 */     a a = this.e.get(☃);
/* 163 */     if (a != null) {
/*     */       
/* 165 */       GameProfile gameProfile = a.a();
/* 166 */       this.f.remove(gameProfile);
/* 167 */       this.f.addFirst(gameProfile);
/*     */     } 
/* 169 */     return a;
/*     */   }
/*     */   
/*     */   public void b() {
/* 173 */     BufferedReader ☃ = null;
/*     */     
/* 175 */     try { ☃ = Files.newReader(this.h, StandardCharsets.UTF_8);
/* 176 */       List<a> list = xj.<List<a>>a(this.b, ☃, i);
/*     */       
/* 178 */       this.d.clear();
/* 179 */       this.e.clear();
/* 180 */       this.f.clear();
/*     */       
/* 182 */       if (list != null)
/*     */       {
/* 184 */         for (a a : Lists.reverse(list)) {
/* 185 */           if (a != null) {
/* 186 */             a(a.a(), a.b());
/*     */           }
/*     */         } 
/*     */       } }
/* 190 */     catch (FileNotFoundException fileNotFoundException) {  }
/* 191 */     catch (JsonParseException jsonParseException) {  }
/*     */     finally
/* 193 */     { IOUtils.closeQuietly(☃); }
/*     */   
/*     */   }
/*     */   
/*     */   public void c() {
/* 198 */     String ☃ = this.b.toJson(a(1000));
/* 199 */     BufferedWriter bufferedWriter = null;
/*     */     try {
/* 201 */       bufferedWriter = Files.newWriter(this.h, StandardCharsets.UTF_8);
/* 202 */       bufferedWriter.write(☃);
/* 203 */     } catch (FileNotFoundException fileNotFoundException) {
/*     */       return;
/* 205 */     } catch (IOException iOException) {
/*     */       return;
/*     */     } finally {
/* 208 */       IOUtils.closeQuietly(bufferedWriter);
/*     */     } 
/*     */   }
/*     */   
/*     */   private List<a> a(int ☃) {
/* 213 */     List<a> list = Lists.newArrayList();
/* 214 */     List<GameProfile> list1 = Lists.newArrayList(Iterators.limit(this.f.iterator(), ☃));
/* 215 */     for (GameProfile gameProfile : list1) {
/* 216 */       a a = b(gameProfile.getId());
/* 217 */       if (a == null) {
/*     */         continue;
/*     */       }
/* 220 */       list.add(a);
/*     */     } 
/* 222 */     return list;
/*     */   }
/*     */   
/*     */   class b implements JsonDeserializer<a>, JsonSerializer<a> { private b(vl this$0) {}
/*     */     
/*     */     public JsonElement a(vl.a ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 228 */       JsonObject jsonObject = new JsonObject();
/* 229 */       jsonObject.addProperty("name", ☃.a().getName());
/* 230 */       UUID uUID = ☃.a().getId();
/* 231 */       jsonObject.addProperty("uuid", (uUID == null) ? "" : uUID.toString());
/* 232 */       jsonObject.addProperty("expiresOn", vl.a.format(☃.b()));
/* 233 */       return (JsonElement)jsonObject;
/*     */     }
/*     */ 
/*     */     
/*     */     public vl.a a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 238 */       if (☃.isJsonObject()) {
/* 239 */         UUID uUID; JsonObject jsonObject = ☃.getAsJsonObject();
/* 240 */         JsonElement jsonElement1 = jsonObject.get("name");
/* 241 */         JsonElement jsonElement2 = jsonObject.get("uuid");
/* 242 */         JsonElement jsonElement3 = jsonObject.get("expiresOn");
/* 243 */         if (jsonElement1 == null || jsonElement2 == null) {
/* 244 */           return null;
/*     */         }
/* 246 */         String str1 = jsonElement2.getAsString();
/* 247 */         String str2 = jsonElement1.getAsString();
/* 248 */         Date date = null;
/* 249 */         if (jsonElement3 != null) {
/*     */           try {
/* 251 */             date = vl.a.parse(jsonElement3.getAsString());
/* 252 */           } catch (ParseException parseException) {
/* 253 */             date = null;
/*     */           } 
/*     */         }
/* 256 */         if (str2 == null || str1 == null) {
/* 257 */           return null;
/*     */         }
/*     */         
/*     */         try {
/* 261 */           uUID = UUID.fromString(str1);
/* 262 */         } catch (Throwable throwable) {
/* 263 */           return null;
/*     */         } 
/* 265 */         return new vl.a(new GameProfile(uUID, str2), date);
/*     */       } 
/* 267 */       return null;
/*     */     } }
/*     */ 
/*     */   
/*     */   class a {
/*     */     private final GameProfile b;
/*     */     private final Date c;
/*     */     
/*     */     private a(vl this$0, GameProfile ☃, Date date) {
/* 276 */       this.b = ☃;
/* 277 */       this.c = date;
/*     */     }
/*     */     
/*     */     public GameProfile a() {
/* 281 */       return this.b;
/*     */     }
/*     */     
/*     */     public Date b() {
/* 285 */       return this.c;
/*     */     }
/*     */   }
/*     */   
/* 289 */   private static final ParameterizedType i = new ParameterizedType()
/*     */     {
/*     */       public Type[] getActualTypeArguments() {
/* 292 */         return new Type[] { vl.a.class };
/*     */       }
/*     */ 
/*     */       
/*     */       public Type getRawType() {
/* 297 */         return List.class;
/*     */       }
/*     */ 
/*     */       
/*     */       public Type getOwnerType() {
/* 302 */         return null;
/*     */       }
/*     */     };
/*     */ }


/* Location:              F:\dw\server.jar!\vl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */