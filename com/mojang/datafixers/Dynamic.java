/*     */ package com.mojang.datafixers;
/*     */ 
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.LongStream;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Dynamic<T>
/*     */ {
/*     */   private final DynamicOps<T> ops;
/*     */   private final T value;
/*     */   
/*     */   public Dynamic(DynamicOps<T> ops) {
/*  27 */     this(ops, (T)ops.empty());
/*     */   }
/*     */   
/*     */   public Dynamic(DynamicOps<T> ops, @Nullable T value) {
/*  31 */     this.ops = ops;
/*  32 */     this.value = (value == null) ? (T)ops.empty() : value;
/*     */   }
/*     */   
/*     */   public DynamicOps<T> getOps() {
/*  36 */     return this.ops;
/*     */   }
/*     */   
/*     */   public T getValue() {
/*  40 */     return this.value;
/*     */   }
/*     */   
/*     */   public Dynamic<T> map(Function<? super T, ? extends T> function) {
/*  44 */     return new Dynamic(this.ops, function.apply(this.value));
/*     */   }
/*     */   
/*     */   public Optional<Number> getNumberValue() {
/*  48 */     return this.ops.getNumberValue(this.value);
/*     */   }
/*     */   
/*     */   public Number getNumberValue(Number defaultValue) {
/*  52 */     return getNumberValue().orElse(defaultValue);
/*     */   }
/*     */   
/*     */   public Optional<String> getStringValue() {
/*  56 */     return this.ops.getStringValue(this.value);
/*     */   }
/*     */ 
/*     */   
/*     */   public <U> Dynamic<U> castTyped(DynamicOps<U> ops) {
/*  61 */     if (!Objects.equals(this.ops, ops)) {
/*  62 */       throw new IllegalStateException("Dynamic type doesn't match");
/*     */     }
/*  64 */     return this;
/*     */   }
/*     */   
/*     */   public <U> U cast(DynamicOps<U> ops) {
/*  68 */     return castTyped(ops).getValue();
/*     */   }
/*     */   
/*     */   public Dynamic<T> merge(Dynamic<?> value) {
/*  72 */     return map(v -> this.ops.mergeInto(v, value.cast(this.ops)));
/*     */   }
/*     */   
/*     */   public Dynamic<T> merge(Dynamic<?> key, Dynamic<?> value) {
/*  76 */     return map(v -> this.ops.mergeInto(v, key.cast(this.ops), value.cast(this.ops)));
/*     */   }
/*     */   
/*     */   public Optional<Map<Dynamic<T>, Dynamic<T>>> getMapValues() {
/*  80 */     return this.ops.getMapValues(this.value).map(map -> {
/*     */           ImmutableMap.Builder<Dynamic<T>, Dynamic<T>> builder = ImmutableMap.builder();
/*     */           for (Map.Entry<T, T> entry : (Iterable<Map.Entry<T, T>>)map.entrySet()) {
/*     */             builder.put(new Dynamic(this.ops, entry.getKey()), new Dynamic(this.ops, entry.getValue()));
/*     */           }
/*     */           return (Map)builder.build();
/*     */         });
/*     */   }
/*     */   
/*     */   public Dynamic<T> createMap(Map<? extends Dynamic<?>, ? extends Dynamic<?>> map) {
/*  90 */     ImmutableMap.Builder<T, T> builder = ImmutableMap.builder();
/*  91 */     for (Map.Entry<? extends Dynamic<?>, ? extends Dynamic<?>> entry : map.entrySet()) {
/*  92 */       builder.put(((Dynamic)entry.getKey()).cast(this.ops), ((Dynamic)entry.getValue()).cast(this.ops));
/*     */     }
/*  94 */     return new Dynamic(this.ops, (T)this.ops.createMap((Map)builder.build()));
/*     */   }
/*     */   
/*     */   public Dynamic<T> updateMapValues(Function<Pair<Dynamic<?>, Dynamic<?>>, Pair<Dynamic<?>, Dynamic<?>>> updater) {
/*  98 */     return DataFixUtils.<Dynamic<T>>orElse(getMapValues().map(map -> (Map)map.entrySet().stream().map(()).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))
/*     */ 
/*     */         
/* 101 */         .map(this::createMap), this);
/*     */   }
/*     */   
/*     */   public Optional<Stream<Dynamic<T>>> getStream() {
/* 105 */     return this.ops.getStream(this.value).map(s -> s.map(()));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createList(Stream<? extends Dynamic<?>> input) {
/* 109 */     return new Dynamic(this.ops, (T)this.ops.createList(input.map(element -> element.cast(this.ops))));
/*     */   }
/*     */   
/*     */   public Optional<ByteBuffer> getByteBuffer() {
/* 113 */     return this.ops.getByteBuffer(this.value);
/*     */   }
/*     */   
/*     */   public Dynamic<?> createByteList(ByteBuffer input) {
/* 117 */     return new Dynamic(this.ops, (T)this.ops.createByteList(input));
/*     */   }
/*     */   
/*     */   public Optional<IntStream> getIntStream() {
/* 121 */     return this.ops.getIntStream(this.value);
/*     */   }
/*     */   
/*     */   public Dynamic<?> createIntList(IntStream input) {
/* 125 */     return new Dynamic(this.ops, (T)this.ops.createIntList(input));
/*     */   }
/*     */   
/*     */   public Optional<LongStream> getLongStream() {
/* 129 */     return this.ops.getLongStream(this.value);
/*     */   }
/*     */   
/*     */   public Dynamic<?> createLongList(LongStream input) {
/* 133 */     return new Dynamic(this.ops, (T)this.ops.createLongList(input));
/*     */   }
/*     */   
/*     */   public Dynamic<T> remove(String key) {
/* 137 */     return map(v -> this.ops.remove(v, key));
/*     */   }
/*     */   
/*     */   public Optional<Dynamic<T>> get(String key) {
/* 141 */     return this.ops.get(this.value, key).map(v -> new Dynamic(this.ops, (T)v));
/*     */   }
/*     */   
/*     */   public Optional<T> getGeneric(T key) {
/* 145 */     return this.ops.getGeneric(this.value, key);
/*     */   }
/*     */   
/*     */   public Dynamic<T> set(String key, Dynamic<?> value) {
/* 149 */     return map(v -> this.ops.set(v, key, value.cast(this.ops)));
/*     */   }
/*     */   
/*     */   public Dynamic<T> update(String key, Function<Dynamic<?>, Dynamic<?>> function) {
/* 153 */     return map(v -> this.ops.update(v, key, ()));
/*     */   }
/*     */   
/*     */   public Dynamic<T> updateGeneric(T key, Function<T, T> function) {
/* 157 */     return map(v -> this.ops.updateGeneric(v, key, function));
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic<T> createNumeric(Number i) {
/* 162 */     return new Dynamic(this.ops, (T)this.ops.createNumeric(i));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createByte(byte value) {
/* 166 */     return new Dynamic(this.ops, (T)this.ops.createByte(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createShort(short value) {
/* 170 */     return new Dynamic(this.ops, (T)this.ops.createShort(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createInt(int value) {
/* 174 */     return new Dynamic(this.ops, (T)this.ops.createInt(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createLong(long value) {
/* 178 */     return new Dynamic(this.ops, (T)this.ops.createLong(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createFloat(float value) {
/* 182 */     return new Dynamic(this.ops, (T)this.ops.createFloat(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createDouble(double value) {
/* 186 */     return new Dynamic(this.ops, (T)this.ops.createDouble(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createBoolean(boolean value) {
/* 190 */     return new Dynamic(this.ops, (T)this.ops.createBoolean(value));
/*     */   }
/*     */   
/*     */   public Dynamic<T> createString(String value) {
/* 194 */     return new Dynamic(this.ops, (T)this.ops.createString(value));
/*     */   }
/*     */   
/*     */   public int getInt(String key) {
/* 198 */     return getNumber(key, Integer.valueOf(0)).intValue();
/*     */   }
/*     */   
/*     */   public long getLong(String key) {
/* 202 */     return getNumber(key, Integer.valueOf(0)).longValue();
/*     */   }
/*     */   
/*     */   public float getFloat(String key) {
/* 206 */     return getNumber(key, Integer.valueOf(0)).floatValue();
/*     */   }
/*     */   
/*     */   public double getDouble(String key) {
/* 210 */     return getNumber(key, Integer.valueOf(0)).doubleValue();
/*     */   }
/*     */   
/*     */   public byte getByte(String key) {
/* 214 */     return getNumber(key, Integer.valueOf(0)).byteValue();
/*     */   }
/*     */   
/*     */   public short getShort(String key) {
/* 218 */     return getNumber(key, Integer.valueOf(0)).shortValue();
/*     */   }
/*     */   
/*     */   public boolean getBoolean(String key) {
/* 222 */     return (getNumber(key, Integer.valueOf(0)).intValue() != 0);
/*     */   }
/*     */   
/*     */   public String getString(String key) {
/* 226 */     return getElement(key).<String>flatMap(this.ops::getStringValue).orElse("");
/*     */   }
/*     */   
/*     */   public int getInt(String key, int defaultValue) {
/* 230 */     return getNumber(key, Integer.valueOf(defaultValue)).intValue();
/*     */   }
/*     */   
/*     */   public long getLong(String key, long defaultValue) {
/* 234 */     return getNumber(key, Long.valueOf(defaultValue)).longValue();
/*     */   }
/*     */   
/*     */   public float getFloat(String key, float defaultValue) {
/* 238 */     return getNumber(key, Float.valueOf(defaultValue)).floatValue();
/*     */   }
/*     */   
/*     */   public double getDouble(String key, double defaultValue) {
/* 242 */     return getNumber(key, Double.valueOf(defaultValue)).doubleValue();
/*     */   }
/*     */   
/*     */   public byte getByte(String key, byte defaultValue) {
/* 246 */     return getNumber(key, Byte.valueOf(defaultValue)).byteValue();
/*     */   }
/*     */   
/*     */   public short getShort(String key, short defaultValue) {
/* 250 */     return getNumber(key, Short.valueOf(defaultValue)).shortValue();
/*     */   }
/*     */   
/*     */   public boolean getBoolean(String key, boolean defaultValue) {
/* 254 */     return (getNumber(key, Integer.valueOf(defaultValue ? 1 : 0)).intValue() != 0);
/*     */   }
/*     */   
/*     */   public String getString(String key, String defaultValue) {
/* 258 */     return getElement(key).<String>flatMap(this.ops::getStringValue).orElse(defaultValue);
/*     */   }
/*     */   
/*     */   public Number getNumber(String key, Number defaultValue) {
/* 262 */     return getNumber(key).orElse(defaultValue);
/*     */   }
/*     */   
/*     */   public Optional<Number> getNumber(String key) {
/* 266 */     return getElement(key).flatMap(this.ops::getNumberValue);
/*     */   }
/*     */   
/*     */   public T getElement(String key, T defaultValue) {
/* 270 */     return getElement(key).orElse(defaultValue);
/*     */   }
/*     */   
/*     */   public Optional<T> getElement(String key) {
/* 274 */     return getElementGeneric((T)this.ops.createString(key));
/*     */   }
/*     */   
/*     */   public T getElementGeneric(T key, T defaultValue) {
/* 278 */     return getElementGeneric(key).orElse(defaultValue);
/*     */   }
/*     */   
/*     */   public Optional<T> getElementGeneric(T key) {
/* 282 */     return this.ops.getMapValues(this.value).flatMap(m -> Optional.ofNullable(m.get(key)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 287 */     if (this == o) {
/* 288 */       return true;
/*     */     }
/* 290 */     if (o == null || getClass() != o.getClass()) {
/* 291 */       return false;
/*     */     }
/* 293 */     Dynamic<?> dynamic = (Dynamic)o;
/* 294 */     return (Objects.equals(this.ops, dynamic.ops) && Objects.equals(this.value, dynamic.value));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 299 */     return Objects.hash(new Object[] { this.ops, this.value });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 304 */     return String.format("%s[%s]", new Object[] { this.ops, this.value });
/*     */   }
/*     */   
/*     */   public <R> Dynamic<R> convert(DynamicOps<R> outOps) {
/* 308 */     return new Dynamic(outOps, convert(this.ops, outOps, this.value));
/*     */   }
/*     */ 
/*     */   
/*     */   public static <S, T> T convert(DynamicOps<S> inOps, DynamicOps<T> outOps, S input) {
/* 313 */     if (Objects.equals(inOps, outOps)) {
/* 314 */       return (T)input;
/*     */     }
/* 316 */     Type<?> type = inOps.getType(input);
/* 317 */     if (Objects.equals(type, DSL.nilType())) {
/* 318 */       return (T)outOps.empty();
/*     */     }
/* 320 */     if (Objects.equals(type, DSL.byteType())) {
/* 321 */       return (T)outOps.createByte(inOps.getNumberValue(input, Integer.valueOf(0)).byteValue());
/*     */     }
/* 323 */     if (Objects.equals(type, DSL.shortType())) {
/* 324 */       return (T)outOps.createShort(inOps.getNumberValue(input, Integer.valueOf(0)).shortValue());
/*     */     }
/* 326 */     if (Objects.equals(type, DSL.intType())) {
/* 327 */       return (T)outOps.createInt(inOps.getNumberValue(input, Integer.valueOf(0)).intValue());
/*     */     }
/* 329 */     if (Objects.equals(type, DSL.longType())) {
/* 330 */       return (T)outOps.createLong(inOps.getNumberValue(input, Integer.valueOf(0)).longValue());
/*     */     }
/* 332 */     if (Objects.equals(type, DSL.floatType())) {
/* 333 */       return (T)outOps.createFloat(inOps.getNumberValue(input, Integer.valueOf(0)).floatValue());
/*     */     }
/* 335 */     if (Objects.equals(type, DSL.doubleType())) {
/* 336 */       return (T)outOps.createDouble(inOps.getNumberValue(input, Integer.valueOf(0)).doubleValue());
/*     */     }
/* 338 */     if (Objects.equals(type, DSL.bool())) {
/* 339 */       return (T)outOps.createBoolean((inOps.getNumberValue(input, Integer.valueOf(0)).byteValue() != 0));
/*     */     }
/* 341 */     if (Objects.equals(type, DSL.string())) {
/* 342 */       return (T)outOps.createString(inOps.getStringValue(input).orElse(""));
/*     */     }
/* 344 */     if (Objects.equals(type, DSL.list(DSL.byteType()))) {
/* 345 */       return (T)outOps.createByteList(inOps.getByteBuffer(input).orElse(ByteBuffer.wrap(new byte[0])));
/*     */     }
/* 347 */     if (Objects.equals(type, DSL.list(DSL.intType()))) {
/* 348 */       return (T)outOps.createIntList(inOps.getIntStream(input).orElse(IntStream.empty()));
/*     */     }
/* 350 */     if (Objects.equals(type, DSL.list(DSL.longType()))) {
/* 351 */       return (T)outOps.createLongList(inOps.getLongStream(input).orElse(LongStream.empty()));
/*     */     }
/* 353 */     if (Objects.equals(type, DSL.list(DSL.remainderType()))) {
/* 354 */       return (T)outOps.createList(((Stream)inOps.getStream(input).orElse(Stream.empty())).map(e -> convert(inOps, outOps, e)));
/*     */     }
/* 356 */     if (Objects.equals(type, DSL.compoundList(DSL.remainderType(), DSL.remainderType()))) {
/* 357 */       return (T)outOps.createMap((Map)((Map)inOps.getMapValues(input).orElse(ImmutableMap.of())).entrySet().stream().map(e -> Pair.of(convert(inOps, outOps, e.getKey()), convert(inOps, outOps, e.getValue())))
/*     */           
/* 359 */           .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     }
/* 361 */     throw new IllegalStateException("Could not convert value of type " + type);
/*     */   }
/*     */   
/*     */   public Dynamic<T> emptyList() {
/* 365 */     return new Dynamic(this.ops, (T)this.ops.emptyList());
/*     */   }
/*     */   
/*     */   public Dynamic<T> emptyMap() {
/* 369 */     return new Dynamic(this.ops, (T)this.ops.emptyMap());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\Dynamic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */