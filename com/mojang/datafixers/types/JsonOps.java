/*     */ package com.mojang.datafixers.types;
/*     */ 
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ 
/*     */ 
/*     */ public class JsonOps
/*     */   implements DynamicOps<JsonElement>
/*     */ {
/*  22 */   public static final JsonOps INSTANCE = new JsonOps();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonElement empty() {
/*  29 */     return (JsonElement)JsonNull.INSTANCE;
/*     */   }
/*     */ 
/*     */   
/*     */   public Type<?> getType(JsonElement input) {
/*  34 */     if (input.isJsonObject()) {
/*  35 */       return (Type<?>)DSL.compoundList(DSL.remainderType(), DSL.remainderType());
/*     */     }
/*  37 */     if (input.isJsonArray()) {
/*  38 */       return (Type<?>)DSL.list(DSL.remainderType());
/*     */     }
/*  40 */     if (input.isJsonNull()) {
/*  41 */       return DSL.nilType();
/*     */     }
/*  43 */     JsonPrimitive primitive = input.getAsJsonPrimitive();
/*  44 */     if (primitive.isString()) {
/*  45 */       return DSL.string();
/*     */     }
/*  47 */     if (primitive.isBoolean()) {
/*  48 */       return DSL.bool();
/*     */     }
/*  50 */     BigDecimal value = primitive.getAsBigDecimal();
/*     */     try {
/*  52 */       long l = value.longValueExact();
/*  53 */       if ((byte)(int)l == l) {
/*  54 */         return DSL.byteType();
/*     */       }
/*  56 */       if ((short)(int)l == l) {
/*  57 */         return DSL.shortType();
/*     */       }
/*  59 */       if ((int)l == l) {
/*  60 */         return DSL.intType();
/*     */       }
/*  62 */       return DSL.longType();
/*  63 */     } catch (ArithmeticException e) {
/*  64 */       double d = value.doubleValue();
/*  65 */       if ((float)d == d) {
/*  66 */         return DSL.floatType();
/*     */       }
/*  68 */       return DSL.doubleType();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<Number> getNumberValue(JsonElement input) {
/*  74 */     if (input.isJsonPrimitive() && input.getAsJsonPrimitive().isNumber()) {
/*  75 */       return Optional.of(input.getAsNumber());
/*     */     }
/*  77 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement createNumeric(Number i) {
/*  82 */     return (JsonElement)new JsonPrimitive(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement createBoolean(boolean value) {
/*  87 */     return (JsonElement)new JsonPrimitive(Boolean.valueOf(value));
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<String> getStringValue(JsonElement input) {
/*  92 */     if (input.isJsonPrimitive() && input.getAsJsonPrimitive().isString()) {
/*  93 */       return Optional.of(input.getAsString());
/*     */     }
/*  95 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement createString(String value) {
/* 100 */     return (JsonElement)new JsonPrimitive(value);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement mergeInto(JsonElement input, JsonElement value) {
/*     */     JsonArray result;
/* 106 */     if (value.isJsonNull()) {
/* 107 */       return input;
/*     */     }
/* 109 */     if (input.isJsonObject()) {
/* 110 */       if (value.isJsonObject()) {
/* 111 */         JsonObject resultObject = new JsonObject();
/* 112 */         JsonObject first = input.getAsJsonObject();
/* 113 */         for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)first.entrySet()) {
/* 114 */           resultObject.add(entry.getKey(), entry.getValue());
/*     */         }
/* 116 */         JsonObject second = value.getAsJsonObject();
/* 117 */         for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)second.entrySet()) {
/* 118 */           resultObject.add(entry.getKey(), entry.getValue());
/*     */         }
/* 120 */         return (JsonElement)resultObject;
/*     */       } 
/* 122 */       return input;
/* 123 */     }  if (input.isJsonNull())
/* 124 */       throw new IllegalArgumentException("mergeInto called with null input."); 
/* 125 */     if (input.isJsonArray()) {
/* 126 */       result = new JsonArray();
/* 127 */       StreamSupport.stream(input.getAsJsonArray().spliterator(), false).forEach(result::add);
/*     */     } else {
/* 129 */       return input;
/*     */     } 
/* 131 */     result.add(value);
/* 132 */     return (JsonElement)result;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement mergeInto(JsonElement input, JsonElement key, JsonElement value) {
/*     */     JsonObject output;
/* 138 */     if (input.isJsonNull()) {
/* 139 */       output = new JsonObject();
/* 140 */     } else if (input.isJsonObject()) {
/* 141 */       output = new JsonObject();
/* 142 */       input.getAsJsonObject().entrySet().forEach(entry -> output.add((String)entry.getKey(), (JsonElement)entry.getValue()));
/*     */     } else {
/* 144 */       return input;
/*     */     } 
/* 146 */     output.add(key.getAsString(), value);
/* 147 */     return (JsonElement)output;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement merge(JsonElement first, JsonElement second) {
/* 152 */     if (first.isJsonNull()) {
/* 153 */       return second;
/*     */     }
/* 155 */     if (second.isJsonNull()) {
/* 156 */       return first;
/*     */     }
/* 158 */     if (first.isJsonObject() && second.isJsonObject()) {
/* 159 */       JsonObject result = new JsonObject();
/* 160 */       first.getAsJsonObject().entrySet().forEach(entry -> result.add((String)entry.getKey(), (JsonElement)entry.getValue()));
/* 161 */       second.getAsJsonObject().entrySet().forEach(entry -> result.add((String)entry.getKey(), (JsonElement)entry.getValue()));
/* 162 */       return (JsonElement)result;
/*     */     } 
/* 164 */     if (first.isJsonArray() && second.isJsonArray()) {
/* 165 */       JsonArray result = new JsonArray();
/* 166 */       first.getAsJsonArray().forEach(result::add);
/* 167 */       second.getAsJsonArray().forEach(result::add);
/* 168 */       return (JsonElement)result;
/*     */     } 
/* 170 */     throw new IllegalArgumentException("Could not merge " + first + " and " + second);
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<Map<JsonElement, JsonElement>> getMapValues(JsonElement input) {
/* 175 */     if (input.isJsonObject()) {
/* 176 */       return Optional.of((Map<JsonElement, JsonElement>)input.getAsJsonObject().entrySet().stream().map(entry -> Pair.of(new JsonPrimitive((String)entry.getKey()), entry.getValue())).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     }
/* 178 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement createMap(Map<JsonElement, JsonElement> map) {
/* 183 */     JsonObject result = new JsonObject();
/* 184 */     for (Map.Entry<JsonElement, JsonElement> entry : map.entrySet()) {
/* 185 */       result.add(((JsonElement)entry.getKey()).getAsString(), entry.getValue());
/*     */     }
/* 187 */     return (JsonElement)result;
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<Stream<JsonElement>> getStream(JsonElement input) {
/* 192 */     if (input.isJsonArray()) {
/* 193 */       return Optional.of(StreamSupport.stream(input.getAsJsonArray().spliterator(), false));
/*     */     }
/* 195 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement createList(Stream<JsonElement> input) {
/* 200 */     JsonArray result = new JsonArray();
/* 201 */     input.forEach(result::add);
/* 202 */     return (JsonElement)result;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement remove(JsonElement input, String key) {
/* 207 */     if (input.isJsonObject()) {
/* 208 */       JsonObject result = new JsonObject();
/* 209 */       input.getAsJsonObject().entrySet().stream().filter(entry -> !Objects.equals(entry.getKey(), key)).forEach(entry -> result.add((String)entry.getKey(), (JsonElement)entry.getValue()));
/* 210 */       return (JsonElement)result;
/*     */     } 
/* 212 */     return input;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 217 */     return "JSON";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\JsonOps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */