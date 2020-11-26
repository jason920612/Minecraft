/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.StringReader;
/*     */ import java.lang.reflect.Type;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xj
/*     */ {
/*  28 */   private static final Gson a = (new GsonBuilder()).create();
/*     */   
/*     */   public static boolean a(JsonObject ☃, String str) {
/*  31 */     if (!f(☃, str)) {
/*  32 */       return false;
/*     */     }
/*  34 */     return ☃.getAsJsonPrimitive(str).isString();
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
/*     */   public static boolean b(JsonElement ☃) {
/*  52 */     if (!☃.isJsonPrimitive()) {
/*  53 */       return false;
/*     */     }
/*  55 */     return ☃.getAsJsonPrimitive().isNumber();
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
/*     */   public static boolean d(JsonObject ☃, String str) {
/*  73 */     if (!g(☃, str)) {
/*  74 */       return false;
/*     */     }
/*  76 */     return ☃.get(str).isJsonArray();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean f(JsonObject ☃, String str) {
/*  87 */     if (!g(☃, str)) {
/*  88 */       return false;
/*     */     }
/*  90 */     return ☃.get(str).isJsonPrimitive();
/*     */   }
/*     */   
/*     */   public static boolean g(JsonObject ☃, String str) {
/*  94 */     if (☃ == null) {
/*  95 */       return false;
/*     */     }
/*  97 */     return (☃.get(str) != null);
/*     */   }
/*     */   
/*     */   public static String a(JsonElement ☃, String str) {
/* 101 */     if (☃.isJsonPrimitive()) {
/* 102 */       return ☃.getAsString();
/*     */     }
/* 104 */     throw new JsonSyntaxException("Expected " + str + " to be a string, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static String h(JsonObject ☃, String str) {
/* 109 */     if (☃.has(str)) {
/* 110 */       return a(☃.get(str), str);
/*     */     }
/* 112 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a string");
/*     */   }
/*     */ 
/*     */   
/*     */   public static String a(JsonObject ☃, String str1, String str2) {
/* 117 */     if (☃.has(str1)) {
/* 118 */       return a(☃.get(str1), str1);
/*     */     }
/* 120 */     return str2;
/*     */   }
/*     */ 
/*     */   
/*     */   public static ata b(JsonElement ☃, String str) {
/* 125 */     if (☃.isJsonPrimitive()) {
/* 126 */       String str1 = ☃.getAsString();
/* 127 */       ata ata = fc.s.b(new pc(str1));
/* 128 */       if (ata == null) {
/* 129 */         throw new JsonSyntaxException("Expected " + str + " to be an item, was unknown string '" + str1 + "'");
/*     */       }
/* 131 */       return ata;
/*     */     } 
/*     */     
/* 134 */     throw new JsonSyntaxException("Expected " + str + " to be an item, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static ata i(JsonObject ☃, String str) {
/* 139 */     if (☃.has(str)) {
/* 140 */       return b(☃.get(str), str);
/*     */     }
/* 142 */     throw new JsonSyntaxException("Missing " + str + ", expected to find an item");
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
/*     */   public static boolean c(JsonElement ☃, String str) {
/* 155 */     if (☃.isJsonPrimitive()) {
/* 156 */       return ☃.getAsBoolean();
/*     */     }
/* 158 */     throw new JsonSyntaxException("Expected " + str + " to be a Boolean, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean j(JsonObject ☃, String str) {
/* 163 */     if (☃.has(str)) {
/* 164 */       return c(☃.get(str), str);
/*     */     }
/* 166 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Boolean");
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(JsonObject ☃, String str, boolean bool) {
/* 171 */     if (☃.has(str)) {
/* 172 */       return c(☃.get(str), str);
/*     */     }
/* 174 */     return bool;
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
/*     */   public static float e(JsonElement ☃, String str) {
/* 203 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 204 */       return ☃.getAsFloat();
/*     */     }
/* 206 */     throw new JsonSyntaxException("Expected " + str + " to be a Float, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static float l(JsonObject ☃, String str) {
/* 211 */     if (☃.has(str)) {
/* 212 */       return e(☃.get(str), str);
/*     */     }
/* 214 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Float");
/*     */   }
/*     */ 
/*     */   
/*     */   public static float a(JsonObject ☃, String str, float f) {
/* 219 */     if (☃.has(str)) {
/* 220 */       return e(☃.get(str), str);
/*     */     }
/* 222 */     return f;
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
/*     */   public static int g(JsonElement ☃, String str) {
/* 251 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 252 */       return ☃.getAsInt();
/*     */     }
/* 254 */     throw new JsonSyntaxException("Expected " + str + " to be a Int, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static int n(JsonObject ☃, String str) {
/* 259 */     if (☃.has(str)) {
/* 260 */       return g(☃.get(str), str);
/*     */     }
/* 262 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Int");
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a(JsonObject ☃, String str, int i) {
/* 267 */     if (☃.has(str)) {
/* 268 */       return g(☃.get(str), str);
/*     */     }
/* 270 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public static byte h(JsonElement ☃, String str) {
/* 275 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 276 */       return ☃.getAsByte();
/*     */     }
/* 278 */     throw new JsonSyntaxException("Expected " + str + " to be a Byte, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static byte o(JsonObject ☃, String str) {
/* 283 */     if (☃.has(str)) {
/* 284 */       return h(☃.get(str), str);
/*     */     }
/* 286 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Byte");
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
/*     */   public static JsonObject m(JsonElement ☃, String str) {
/* 395 */     if (☃.isJsonObject()) {
/* 396 */       return ☃.getAsJsonObject();
/*     */     }
/* 398 */     throw new JsonSyntaxException("Expected " + str + " to be a JsonObject, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonObject t(JsonObject ☃, String str) {
/* 403 */     if (☃.has(str)) {
/* 404 */       return m(☃.get(str), str);
/*     */     }
/* 406 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a JsonObject");
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonObject a(JsonObject ☃, String str, JsonObject jsonObject1) {
/* 411 */     if (☃.has(str)) {
/* 412 */       return m(☃.get(str), str);
/*     */     }
/* 414 */     return jsonObject1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonArray n(JsonElement ☃, String str) {
/* 419 */     if (☃.isJsonArray()) {
/* 420 */       return ☃.getAsJsonArray();
/*     */     }
/* 422 */     throw new JsonSyntaxException("Expected " + str + " to be a JsonArray, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonArray u(JsonObject ☃, String str) {
/* 427 */     if (☃.has(str)) {
/* 428 */       return n(☃.get(str), str);
/*     */     }
/* 430 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a JsonArray");
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonArray a(JsonObject ☃, String str, @Nullable JsonArray jsonArray) {
/* 435 */     if (☃.has(str)) {
/* 436 */       return n(☃.get(str), str);
/*     */     }
/* 438 */     return jsonArray;
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(@Nullable JsonElement ☃, String str, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
/* 443 */     if (☃ != null) {
/* 444 */       return (T)jsonDeserializationContext.deserialize(☃, clazz);
/*     */     }
/* 446 */     throw new JsonSyntaxException("Missing " + str);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(JsonObject ☃, String str, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
/* 451 */     if (☃.has(str)) {
/* 452 */       return a(☃.get(str), str, jsonDeserializationContext, clazz);
/*     */     }
/* 454 */     throw new JsonSyntaxException("Missing " + str);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(JsonObject ☃, String str, T t, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
/* 459 */     if (☃.has(str)) {
/* 460 */       return a(☃.get(str), str, jsonDeserializationContext, clazz);
/*     */     }
/* 462 */     return t;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String d(JsonElement ☃) {
/* 467 */     String str = StringUtils.abbreviateMiddle(String.valueOf(☃), "...", 10);
/* 468 */     if (☃ == null) {
/* 469 */       return "null (missing)";
/*     */     }
/* 471 */     if (☃.isJsonNull()) {
/* 472 */       return "null (json)";
/*     */     }
/* 474 */     if (☃.isJsonArray()) {
/* 475 */       return "an array (" + str + ")";
/*     */     }
/* 477 */     if (☃.isJsonObject()) {
/* 478 */       return "an object (" + str + ")";
/*     */     }
/* 480 */     if (☃.isJsonPrimitive()) {
/* 481 */       JsonPrimitive jsonPrimitive = ☃.getAsJsonPrimitive();
/* 482 */       if (jsonPrimitive.isNumber()) {
/* 483 */         return "a number (" + str + ")";
/*     */       }
/* 485 */       if (jsonPrimitive.isBoolean()) {
/* 486 */         return "a boolean (" + str + ")";
/*     */       }
/*     */     } 
/* 489 */     return str;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, Class<T> clazz, boolean bool) {
/*     */     try {
/* 495 */       JsonReader jsonReader = new JsonReader(reader);
/* 496 */       jsonReader.setLenient(bool);
/* 497 */       return (T)☃.getAdapter(clazz).read(jsonReader);
/* 498 */     } catch (IOException iOException) {
/* 499 */       throw new JsonParseException(iOException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, Type type, boolean bool) {
/*     */     try {
/* 507 */       JsonReader jsonReader = new JsonReader(reader);
/* 508 */       jsonReader.setLenient(bool);
/* 509 */       return (T)☃.getAdapter(TypeToken.get(type)).read(jsonReader);
/* 510 */     } catch (IOException iOException) {
/* 511 */       throw new JsonParseException(iOException);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, String str, Class<T> clazz, boolean bool) {
/* 522 */     return a(☃, new StringReader(str), clazz, bool);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, Type type) {
/* 527 */     return a(☃, reader, type, false);
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
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, String str, Class<T> clazz) {
/* 542 */     return a(☃, str, clazz, false);
/*     */   }
/*     */   
/*     */   public static JsonObject a(String ☃, boolean bool) {
/* 546 */     return a(new StringReader(☃), bool);
/*     */   }
/*     */   
/*     */   public static JsonObject a(Reader ☃, boolean bool) {
/* 550 */     return a(a, ☃, JsonObject.class, bool);
/*     */   }
/*     */   
/*     */   public static JsonObject a(String ☃) {
/* 554 */     return a(☃, false);
/*     */   }
/*     */   
/*     */   public static JsonObject a(Reader ☃) {
/* 558 */     return a(☃, false);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */