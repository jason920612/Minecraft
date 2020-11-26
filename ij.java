/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface ij
/*     */   extends Message, Iterable<ij>
/*     */ {
/*     */   default ij a(String ☃) {
/*  38 */     return a(new iq(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default String getString() {
/*  47 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/*  49 */     c().forEach(ij1 -> ☃.append(ij1.d()));
/*     */ 
/*     */ 
/*     */     
/*  53 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   default String a(int ☃) {
/*  57 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/*  59 */     Iterator<ij> iterator = c().iterator();
/*  60 */     while (iterator.hasNext()) {
/*  61 */       int i = ☃ - stringBuilder.length();
/*  62 */       if (i <= 0) {
/*     */         break;
/*     */       }
/*  65 */       String str = ((ij)iterator.next()).d();
/*  66 */       stringBuilder.append((str.length() <= i) ? str : str.substring(0, i));
/*     */     } 
/*     */     
/*  69 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   default String e() {
/*  73 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/*  75 */     String str = "";
/*  76 */     Iterator<ij> iterator = c().iterator();
/*  77 */     while (iterator.hasNext()) {
/*  78 */       ij ij1 = iterator.next();
/*  79 */       String str1 = ij1.d();
/*  80 */       if (!str1.isEmpty()) {
/*  81 */         String str2 = ij1.b().k();
/*  82 */         if (!str2.equals(str)) {
/*  83 */           if (!str.isEmpty()) {
/*  84 */             ☃.append(a.v);
/*     */           }
/*  86 */           ☃.append(str2);
/*  87 */           str = str2;
/*     */         } 
/*  89 */         ☃.append(str1);
/*     */       } 
/*     */     } 
/*     */     
/*  93 */     if (!str.isEmpty()) {
/*  94 */       ☃.append(a.v);
/*     */     }
/*     */     
/*  97 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default Stream<ij> f() {
/* 105 */     return c().map(ij::b);
/*     */   }
/*     */ 
/*     */   
/*     */   default Iterator<ij> iterator() {
/* 110 */     return f().iterator();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default ij h() {
/* 116 */     ij ☃ = g();
/*     */     
/* 118 */     ☃.a(b().m());
/*     */     
/* 120 */     for (ij ij1 : a()) {
/* 121 */       ☃.a(ij1.h());
/*     */     }
/*     */     
/* 124 */     return ☃;
/*     */   }
/*     */   
/*     */   default ij a(Consumer<ip> ☃) {
/* 128 */     ☃.accept(b());
/* 129 */     return this;
/*     */   }
/*     */   
/*     */   ij a(a... ☃) {
/* 133 */     for (a a1 : ☃) {
/* 134 */       a(a1);
/*     */     }
/* 136 */     return this;
/*     */   }
/*     */   
/*     */   default ij a(a ☃) {
/* 140 */     ip ip = b();
/* 141 */     if (☃.d()) {
/* 142 */       ip.a(☃);
/*     */     }
/* 144 */     if (☃.c()) {
/* 145 */       switch (null.a[☃.ordinal()]) {
/*     */         case 1:
/* 147 */           ip.e(Boolean.valueOf(true));
/*     */           break;
/*     */         case 2:
/* 150 */           ip.a(Boolean.valueOf(true));
/*     */           break;
/*     */         case 3:
/* 153 */           ip.c(Boolean.valueOf(true));
/*     */           break;
/*     */         case 4:
/* 156 */           ip.d(Boolean.valueOf(true));
/*     */           break;
/*     */         case 5:
/* 159 */           ip.b(Boolean.valueOf(true));
/*     */           break;
/*     */       } 
/*     */ 
/*     */     
/*     */     }
/* 165 */     return this;
/*     */   }
/*     */   
/*     */   static ij b(ij ☃) {
/* 169 */     ij ij1 = ☃.g();
/* 170 */     ij1.a(☃.b().n());
/* 171 */     return ij1;
/*     */   } ij a(ip paramip); ip b(); ij a(ij paramij); String d(); List<ij> a(); Stream<ij> c(); ij g();
/*     */   public static class a implements JsonDeserializer<ij>, JsonSerializer<ij> { private static final Gson a;
/*     */     static {
/* 175 */       a = k.<Gson>a(() -> {
/*     */             GsonBuilder ☃ = new GsonBuilder();
/*     */             
/*     */             ☃.registerTypeHierarchyAdapter(ij.class, new a());
/*     */             ☃.registerTypeHierarchyAdapter(ip.class, new ip.a());
/*     */             ☃.registerTypeAdapterFactory(new xp());
/*     */             return ☃.create();
/*     */           });
/* 183 */       b = k.<Field>a(() -> {
/*     */             try {
/*     */               new JsonReader(new StringReader(""));
/*     */               Field ☃ = JsonReader.class.getDeclaredField("pos");
/*     */               ☃.setAccessible(true);
/*     */               return ☃;
/* 189 */             } catch (NoSuchFieldException ☃) {
/*     */               throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", ☃);
/*     */             } 
/*     */           });
/*     */       
/* 194 */       c = k.<Field>a(() -> {
/*     */             try {
/*     */               new JsonReader(new StringReader(""));
/*     */               Field ☃ = JsonReader.class.getDeclaredField("lineStart");
/*     */               ☃.setAccessible(true);
/*     */               return ☃;
/* 200 */             } catch (NoSuchFieldException ☃) {
/*     */               throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", ☃);
/*     */             } 
/*     */           });
/*     */     }
/*     */     private static final Field b; private static final Field c;
/*     */     public ij a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 207 */       if (☃.isJsonPrimitive())
/*     */       {
/* 209 */         return new iq(☃.getAsString()); } 
/* 210 */       if (☃.isJsonObject()) {
/* 211 */         ij ij; JsonObject jsonObject = ☃.getAsJsonObject();
/*     */ 
/*     */         
/* 214 */         if (jsonObject.has("text")) {
/* 215 */           ij = new iq(jsonObject.get("text").getAsString());
/* 216 */         } else if (jsonObject.has("translate")) {
/* 217 */           String str = jsonObject.get("translate").getAsString();
/*     */           
/* 219 */           if (jsonObject.has("with")) {
/* 220 */             JsonArray jsonArray = jsonObject.getAsJsonArray("with");
/* 221 */             Object[] arrayOfObject = new Object[jsonArray.size()];
/*     */             
/* 223 */             for (int i = 0; i < arrayOfObject.length; i++) {
/* 224 */               arrayOfObject[i] = a(jsonArray.get(i), type, jsonDeserializationContext);
/*     */               
/* 226 */               if (arrayOfObject[i] instanceof iq) {
/* 227 */                 iq iq = (iq)arrayOfObject[i];
/* 228 */                 if (iq.b().g() && iq.a().isEmpty()) {
/* 229 */                   arrayOfObject[i] = iq.i();
/*     */                 }
/*     */               } 
/*     */             } 
/*     */             
/* 234 */             ij = new ir(str, arrayOfObject);
/*     */           } else {
/* 236 */             ij = new ir(str, new Object[0]);
/*     */           } 
/* 238 */         } else if (jsonObject.has("score")) {
/* 239 */           JsonObject jsonObject1 = jsonObject.getAsJsonObject("score");
/* 240 */           if (jsonObject1.has("name") && jsonObject1.has("objective")) {
/* 241 */             ij = new in(xj.h(jsonObject1, "name"), xj.h(jsonObject1, "objective"));
/* 242 */             if (jsonObject1.has("value")) {
/* 243 */               ((in)ij).b(xj.h(jsonObject1, "value"));
/*     */             }
/*     */           } else {
/* 246 */             throw new JsonParseException("A score component needs a least a name and an objective");
/*     */           } 
/* 248 */         } else if (jsonObject.has("selector")) {
/* 249 */           ij = new io(xj.h(jsonObject, "selector"));
/* 250 */         } else if (jsonObject.has("keybind")) {
/* 251 */           ij = new im(xj.h(jsonObject, "keybind"));
/*     */         } else {
/* 253 */           throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*     */         } 
/*     */         
/* 256 */         if (jsonObject.has("extra")) {
/* 257 */           JsonArray jsonArray = jsonObject.getAsJsonArray("extra");
/*     */           
/* 259 */           if (jsonArray.size() > 0) {
/* 260 */             for (int i = 0; i < jsonArray.size(); i++) {
/* 261 */               ij.a(a(jsonArray.get(i), type, jsonDeserializationContext));
/*     */             }
/*     */           } else {
/* 264 */             throw new JsonParseException("Unexpected empty array of components");
/*     */           } 
/*     */         } 
/*     */         
/* 268 */         ij.a((ip)jsonDeserializationContext.deserialize(☃, ip.class));
/*     */         
/* 270 */         return ij;
/* 271 */       }  if (☃.isJsonArray()) {
/*     */         
/* 273 */         JsonArray jsonArray = ☃.getAsJsonArray();
/* 274 */         ij ij = null;
/*     */         
/* 276 */         for (JsonElement jsonElement : jsonArray) {
/* 277 */           ij ij1 = a(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
/* 278 */           if (ij == null) {
/* 279 */             ij = ij1; continue;
/*     */           } 
/* 281 */           ij.a(ij1);
/*     */         } 
/*     */ 
/*     */         
/* 285 */         return ij;
/*     */       } 
/* 287 */       throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(ip ☃, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
/* 292 */       JsonElement jsonElement = jsonSerializationContext.serialize(☃);
/*     */       
/* 294 */       if (jsonElement.isJsonObject()) {
/* 295 */         JsonObject jsonObject1 = (JsonObject)jsonElement;
/* 296 */         for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject1.entrySet()) {
/* 297 */           jsonObject.add(entry.getKey(), entry.getValue());
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(ij ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 304 */       JsonObject jsonObject = new JsonObject();
/*     */       
/* 306 */       if (!☃.b().g()) {
/* 307 */         a(☃.b(), jsonObject, jsonSerializationContext);
/*     */       }
/*     */       
/* 310 */       if (!☃.a().isEmpty()) {
/* 311 */         JsonArray jsonArray = new JsonArray();
/*     */         
/* 313 */         for (ij ij1 : ☃.a()) {
/* 314 */           jsonArray.add(a(ij1, ij1.getClass(), jsonSerializationContext));
/*     */         }
/*     */         
/* 317 */         jsonObject.add("extra", (JsonElement)jsonArray);
/*     */       } 
/*     */       
/* 320 */       if (☃ instanceof iq) {
/* 321 */         jsonObject.addProperty("text", ((iq)☃).i());
/* 322 */       } else if (☃ instanceof ir) {
/* 323 */         ir ir = (ir)☃;
/* 324 */         jsonObject.addProperty("translate", ir.k());
/*     */         
/* 326 */         if (ir.l() != null && (ir.l()).length > 0) {
/* 327 */           JsonArray jsonArray = new JsonArray();
/*     */           
/* 329 */           for (Object object : ir.l()) {
/* 330 */             if (object instanceof ij) {
/* 331 */               jsonArray.add(a((ij)object, object.getClass(), jsonSerializationContext));
/*     */             } else {
/* 333 */               jsonArray.add((JsonElement)new JsonPrimitive(String.valueOf(object)));
/*     */             } 
/*     */           } 
/*     */           
/* 337 */           jsonObject.add("with", (JsonElement)jsonArray);
/*     */         } 
/* 339 */       } else if (☃ instanceof in) {
/* 340 */         in in = (in)☃;
/* 341 */         JsonObject jsonObject1 = new JsonObject();
/* 342 */         jsonObject1.addProperty("name", in.i());
/* 343 */         jsonObject1.addProperty("objective", in.k());
/* 344 */         jsonObject1.addProperty("value", in.d());
/* 345 */         jsonObject.add("score", (JsonElement)jsonObject1);
/* 346 */       } else if (☃ instanceof io) {
/* 347 */         io io = (io)☃;
/* 348 */         jsonObject.addProperty("selector", io.i());
/* 349 */       } else if (☃ instanceof im) {
/* 350 */         im im = (im)☃;
/* 351 */         jsonObject.addProperty("keybind", im.j());
/*     */       } else {
/* 353 */         throw new IllegalArgumentException("Don't know how to serialize " + ☃ + " as a Component");
/*     */       } 
/*     */       
/* 356 */       return (JsonElement)jsonObject;
/*     */     }
/*     */     
/*     */     public static String a(ij ☃) {
/* 360 */       return a.toJson(☃);
/*     */     }
/*     */     
/*     */     public static JsonElement b(ij ☃) {
/* 364 */       return a.toJsonTree(☃);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static ij a(String ☃) {
/* 369 */       return xj.<ij>a(a, ☃, ij.class, false);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static ij a(JsonElement ☃) {
/* 374 */       return (ij)a.fromJson(☃, ij.class);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static ij b(String ☃) {
/* 379 */       return xj.<ij>a(a, ☃, ij.class, true);
/*     */     }
/*     */     
/*     */     public static ij a(StringReader ☃) {
/*     */       try {
/* 384 */         JsonReader jsonReader = new JsonReader(new StringReader(☃.getRemaining()));
/* 385 */         jsonReader.setLenient(false);
/* 386 */         ij ij = (ij)a.getAdapter(ij.class).read(jsonReader);
/* 387 */         ☃.setCursor(☃.getCursor() + a(jsonReader));
/* 388 */         return ij;
/* 389 */       } catch (IOException iOException) {
/* 390 */         throw new JsonParseException(iOException);
/*     */       } 
/*     */     }
/*     */     
/*     */     private static int a(JsonReader ☃) {
/*     */       try {
/* 396 */         return b.getInt(☃) - c.getInt(☃) + 1;
/* 397 */       } catch (IllegalAccessException illegalAccessException) {
/* 398 */         throw new IllegalStateException("Couldn't read position of JsonReader", illegalAccessException);
/*     */       } 
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\ij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */