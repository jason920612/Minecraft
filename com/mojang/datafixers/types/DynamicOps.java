/*     */ package com.mojang.datafixers.types;
/*     */ 
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.LongStream;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface DynamicOps<T>
/*     */ {
/*     */   default T emptyMap() {
/*  22 */     return createMap((Map<T, T>)ImmutableMap.of());
/*     */   }
/*     */   
/*     */   default T emptyList() {
/*  26 */     return createList(Stream.empty());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default <R> Optional<R> cast(T input, Type<R> type) {
/*  32 */     if (type == getType(input)) {
/*  33 */       return Optional.of((R)((Typed)((Optional)type.<T>readTyped(new Dynamic(this, input)).getSecond()).orElseThrow(() -> new IllegalStateException("Parse error during dynamic cast"))).getValue());
/*     */     }
/*  35 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default Number getNumberValue(T input, Number defaultValue) {
/*  41 */     return getNumberValue(input).orElse(defaultValue);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default T createByte(byte value) {
/*  47 */     return createNumeric(Byte.valueOf(value));
/*     */   }
/*     */   
/*     */   default T createShort(short value) {
/*  51 */     return createNumeric(Short.valueOf(value));
/*     */   }
/*     */   
/*     */   default T createInt(int value) {
/*  55 */     return createNumeric(Integer.valueOf(value));
/*     */   }
/*     */   
/*     */   default T createLong(long value) {
/*  59 */     return createNumeric(Long.valueOf(value));
/*     */   }
/*     */   
/*     */   default T createFloat(float value) {
/*  63 */     return createNumeric(Float.valueOf(value));
/*     */   }
/*     */   
/*     */   default T createDouble(double value) {
/*  67 */     return createNumeric(Double.valueOf(value));
/*     */   }
/*     */   
/*     */   default T createBoolean(boolean value) {
/*  71 */     return createByte((byte)(value ? 1 : 0));
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
/*     */   default Optional<ByteBuffer> getByteBuffer(T input) {
/* 102 */     return getStream(input).flatMap(stream -> {
/*     */           List<T> list = (List<T>)stream.collect(Collectors.toList());
/*     */           if (list.stream().allMatch(())) {
/*     */             ByteBuffer buffer = ByteBuffer.wrap(new byte[list.size()]);
/*     */             for (int i = 0; i < list.size(); i++) {
/*     */               buffer.put(i, ((Number)getNumberValue(list.get(i)).get()).byteValue());
/*     */             }
/*     */             return Optional.of(buffer);
/*     */           } 
/*     */           return Optional.empty();
/*     */         });
/*     */   }
/*     */   
/*     */   default T createByteList(ByteBuffer input) {
/* 116 */     int[] i = { 0 };
/* 117 */     return createList(Stream.<T>generate(() -> { i[0] = i[0] + 1; return (Supplier)createByte(input.get(i[0])); }).limit(input.capacity()));
/*     */   }
/*     */   
/*     */   default Optional<IntStream> getIntStream(T input) {
/* 121 */     return getStream(input).flatMap(stream -> {
/*     */           List<T> list = (List<T>)stream.collect(Collectors.toList());
/*     */           return list.stream().allMatch(()) ? Optional.of(list.stream().mapToInt(())) : Optional.empty();
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default T createIntList(IntStream input) {
/* 131 */     return createList(input.mapToObj(this::createInt));
/*     */   }
/*     */   
/*     */   default Optional<LongStream> getLongStream(T input) {
/* 135 */     return getStream(input).flatMap(stream -> {
/*     */           List<T> list = (List<T>)stream.collect(Collectors.toList());
/*     */           return list.stream().allMatch(()) ? Optional.of(list.stream().mapToLong(())) : Optional.empty();
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default T createLongList(LongStream input) {
/* 145 */     return createList(input.mapToObj(this::createLong));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default Optional<T> get(T input, String key) {
/* 151 */     return getGeneric(input, createString(key));
/*     */   }
/*     */   
/*     */   default Optional<T> getGeneric(T input, T key) {
/* 155 */     return getMapValues(input).flatMap(map -> Optional.ofNullable(map.get(key)));
/*     */   }
/*     */   
/*     */   default T set(T input, String key, T value) {
/* 159 */     return mergeInto(input, createString(key), value);
/*     */   }
/*     */   
/*     */   default T update(T input, String key, Function<T, T> function) {
/* 163 */     return get(input, key).<T>map(value -> set((T)input, key, function.apply(value))).orElse(input);
/*     */   }
/*     */   
/*     */   default T updateGeneric(T input, T key, Function<T, T> function) {
/* 167 */     return getGeneric(input, key).<T>map(value -> mergeInto((T)input, (T)key, function.apply(value))).orElse(input);
/*     */   }
/*     */   
/*     */   T empty();
/*     */   
/*     */   Type<?> getType(T paramT);
/*     */   
/*     */   Optional<Number> getNumberValue(T paramT);
/*     */   
/*     */   T createNumeric(Number paramNumber);
/*     */   
/*     */   Optional<String> getStringValue(T paramT);
/*     */   
/*     */   T createString(String paramString);
/*     */   
/*     */   T mergeInto(T paramT1, T paramT2);
/*     */   
/*     */   T mergeInto(T paramT1, T paramT2, T paramT3);
/*     */   
/*     */   T merge(T paramT1, T paramT2);
/*     */   
/*     */   Optional<Map<T, T>> getMapValues(T paramT);
/*     */   
/*     */   T createMap(Map<T, T> paramMap);
/*     */   
/*     */   Optional<Stream<T>> getStream(T paramT);
/*     */   
/*     */   T createList(Stream<T> paramStream);
/*     */   
/*     */   T remove(T paramT, String paramString);
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\DynamicOps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */