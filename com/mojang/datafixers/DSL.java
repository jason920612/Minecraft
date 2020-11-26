/*     */ package com.mojang.datafixers;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Func;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.constant.BoolType;
/*     */ import com.mojang.datafixers.types.constant.ByteType;
/*     */ import com.mojang.datafixers.types.constant.DoubleType;
/*     */ import com.mojang.datafixers.types.constant.FloatType;
/*     */ import com.mojang.datafixers.types.constant.IntType;
/*     */ import com.mojang.datafixers.types.constant.LongType;
/*     */ import com.mojang.datafixers.types.constant.NamespacedStringType;
/*     */ import com.mojang.datafixers.types.constant.NilDrop;
/*     */ import com.mojang.datafixers.types.constant.NilSave;
/*     */ import com.mojang.datafixers.types.constant.ShortType;
/*     */ import com.mojang.datafixers.types.constant.StringType;
/*     */ import com.mojang.datafixers.types.templates.Check;
/*     */ import com.mojang.datafixers.types.templates.CompoundList;
/*     */ import com.mojang.datafixers.types.templates.Const;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.List;
/*     */ import com.mojang.datafixers.types.templates.Named;
/*     */ import com.mojang.datafixers.types.templates.Product;
/*     */ import com.mojang.datafixers.types.templates.RecursivePoint;
/*     */ import com.mojang.datafixers.types.templates.Sum;
/*     */ import com.mojang.datafixers.types.templates.Tag;
/*     */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.datafixers.util.Unit;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.commons.lang3.tuple.Triple;
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface DSL
/*     */ {
/*     */   public static interface TypeReference
/*     */   {
/*     */     String typeName();
/*     */     
/*     */     default TypeTemplate in(Schema schema) {
/*  49 */       return schema.id(typeName());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static Type<Boolean> bool() {
/*  56 */     return Instances.BOOL_TYPE;
/*     */   }
/*     */   
/*     */   static Type<Integer> intType() {
/*  60 */     return Instances.INT_TYPE;
/*     */   }
/*     */   
/*     */   static Type<Long> longType() {
/*  64 */     return Instances.LONG_TYPE;
/*     */   }
/*     */   
/*     */   static Type<Byte> byteType() {
/*  68 */     return Instances.BYTE_TYPE;
/*     */   }
/*     */   
/*     */   static Type<Short> shortType() {
/*  72 */     return Instances.SHORT_TYPE;
/*     */   }
/*     */   
/*     */   static Type<Float> floatType() {
/*  76 */     return Instances.FLOAT_TYPE;
/*     */   }
/*     */   
/*     */   static Type<Double> doubleType() {
/*  80 */     return Instances.DOUBLE_TYPE;
/*     */   }
/*     */   
/*     */   static Type<String> string() {
/*  84 */     return Instances.STRING_TYPE;
/*     */   }
/*     */   
/*     */   static Type<String> namespacedString() {
/*  88 */     return Instances.NAMESPACED_STRING_TYPE;
/*     */   }
/*     */   
/*     */   static TypeTemplate nil() {
/*  92 */     return constType(Instances.NIL_DROP);
/*     */   }
/*     */   
/*     */   static Type<Unit> nilType() {
/*  96 */     return Instances.NIL_DROP;
/*     */   }
/*     */   
/*     */   static TypeTemplate remainder() {
/* 100 */     return constType(Instances.NIL_SAVE);
/*     */   }
/*     */   
/*     */   static Type<Dynamic<?>> remainderType() {
/* 104 */     return Instances.NIL_SAVE;
/*     */   }
/*     */   
/*     */   static TypeTemplate check(String name, int index, TypeTemplate element) {
/* 108 */     return (TypeTemplate)new Check(name, index, element);
/*     */   }
/*     */   
/*     */   static TypeTemplate compoundList(TypeTemplate element) {
/* 112 */     return compoundList(constType(string()), element);
/*     */   }
/*     */   
/*     */   static <V> CompoundList.CompoundListType<String, V> compoundList(Type<V> value) {
/* 116 */     return compoundList(string(), value);
/*     */   }
/*     */   
/*     */   static TypeTemplate compoundList(TypeTemplate key, TypeTemplate element) {
/* 120 */     return and((TypeTemplate)new CompoundList(key, element), remainder());
/*     */   }
/*     */   
/*     */   static <K, V> CompoundList.CompoundListType<K, V> compoundList(Type<K> key, Type<V> value) {
/* 124 */     return new CompoundList.CompoundListType(key, value);
/*     */   }
/*     */   
/*     */   static TypeTemplate constType(Type<?> type) {
/* 128 */     return (TypeTemplate)new Const(type);
/*     */   }
/*     */   
/*     */   static TypeTemplate hook(TypeTemplate template, Hook.HookFunction preRead, Hook.HookFunction postWrite) {
/* 132 */     return (TypeTemplate)new Hook(template, preRead, postWrite);
/*     */   }
/*     */   
/*     */   static <A> Type<A> hook(Type<A> type, Hook.HookFunction preRead, Hook.HookFunction postWrite) {
/* 136 */     return (Type<A>)new Hook.HookType(type, preRead, postWrite);
/*     */   }
/*     */   
/*     */   static TypeTemplate list(TypeTemplate element) {
/* 140 */     return (TypeTemplate)new List(element);
/*     */   }
/*     */   
/*     */   static <A> List.ListType<A> list(Type<A> first) {
/* 144 */     return new List.ListType(first);
/*     */   }
/*     */   
/*     */   static TypeTemplate named(String name, TypeTemplate element) {
/* 148 */     return (TypeTemplate)new Named(name, element);
/*     */   }
/*     */   
/*     */   static <A> Type<Pair<String, A>> named(String name, Type<A> element) {
/* 152 */     return (Type<Pair<String, A>>)new Named.NamedType(name, element);
/*     */   }
/*     */   
/*     */   static TypeTemplate and(TypeTemplate first, TypeTemplate second) {
/* 156 */     return (TypeTemplate)new Product(first, second);
/*     */   }
/*     */   
/*     */   static TypeTemplate and(TypeTemplate first, TypeTemplate... rest) {
/* 160 */     if (rest.length == 0) {
/* 161 */       return first;
/*     */     }
/* 163 */     TypeTemplate result = rest[rest.length - 1];
/* 164 */     for (int i = rest.length - 2; i >= 0; i--) {
/* 165 */       result = and(rest[i], result);
/*     */     }
/* 167 */     return and(first, result);
/*     */   }
/*     */   
/*     */   static TypeTemplate allWithRemainder(TypeTemplate first, TypeTemplate... rest) {
/* 171 */     return and(first, (TypeTemplate[])ArrayUtils.add((Object[])rest, remainder()));
/*     */   }
/*     */   
/*     */   static <F, G> Type<Pair<F, G>> and(Type<F> first, Type<G> second) {
/* 175 */     return (Type<Pair<F, G>>)new Product.ProductType(first, second);
/*     */   }
/*     */   
/*     */   static <F, G, H> Type<Pair<F, Pair<G, H>>> and(Type<F> first, Type<G> second, Type<H> third) {
/* 179 */     return and(first, and(second, third));
/*     */   }
/*     */   
/*     */   static <F, G, H, I> Type<Pair<F, Pair<G, Pair<H, I>>>> and(Type<F> first, Type<G> second, Type<H> third, Type<I> forth) {
/* 183 */     return and(first, and(second, and(third, forth)));
/*     */   }
/*     */   
/*     */   static TypeTemplate id(int index) {
/* 187 */     return (TypeTemplate)new RecursivePoint(index);
/*     */   }
/*     */   
/*     */   static TypeTemplate or(TypeTemplate left, TypeTemplate right) {
/* 191 */     return (TypeTemplate)new Sum(left, right);
/*     */   }
/*     */   
/*     */   static <F, G> Type<Either<F, G>> or(Type<F> first, Type<G> second) {
/* 195 */     return (Type<Either<F, G>>)new Sum.SumType(first, second);
/*     */   }
/*     */   
/*     */   static TypeTemplate field(String name, TypeTemplate element) {
/* 199 */     return (TypeTemplate)new Tag(name, element);
/*     */   }
/*     */   
/*     */   static <A> Tag.TagType<A> field(String name, Type<A> element) {
/* 203 */     return new Tag.TagType(name, element);
/*     */   }
/*     */   
/*     */   static <K> TaggedChoice<K> taggedChoice(String name, Type<K> keyType, Map<K, TypeTemplate> templates) {
/* 207 */     return new TaggedChoice(name, keyType, templates);
/*     */   }
/*     */   
/*     */   static <K> TaggedChoice<K> taggedChoiceLazy(String name, Type<K> keyType, Map<K, Supplier<TypeTemplate>> templates) {
/* 211 */     return taggedChoice(name, keyType, (Map<K, TypeTemplate>)templates.entrySet().stream().map(e -> Pair.of(e.getKey(), ((Supplier)e.getValue()).get())).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */   }
/*     */ 
/*     */   
/*     */   static <K> Type<Pair<K, ?>> taggedChoiceType(String name, Type<K> keyType, Map<K, Type<?>> types) {
/* 216 */     return (Type<Pair<K, ?>>)Instances.TAGGED_CHOICE_TYPE_CACHE.computeIfAbsent(Triple.of(name, keyType, types), k -> new TaggedChoice.TaggedChoiceType((String)k.getLeft(), (Type)k.getMiddle(), (Map)k.getRight()));
/*     */   }
/*     */   
/*     */   static <A, B> Type<Function<A, B>> func(Type<A> input, Type<B> output) {
/* 220 */     return (Type<Function<A, B>>)new Func(input, output);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static <A> Type<Either<A, Unit>> optional(Type<A> type) {
/* 226 */     return or(type, nilType());
/*     */   }
/*     */   
/*     */   static TypeTemplate optional(TypeTemplate value) {
/* 230 */     return or(value, nil());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate fields(String name1, TypeTemplate element1) {
/* 236 */     return allWithRemainder(
/* 237 */         field(name1, element1), new TypeTemplate[0]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate fields(String name1, TypeTemplate element1, String name2, TypeTemplate element2) {
/* 245 */     return allWithRemainder(
/* 246 */         field(name1, element1), new TypeTemplate[] {
/* 247 */           field(name2, element2)
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate fields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3) {
/* 256 */     return allWithRemainder(
/* 257 */         field(name1, element1), new TypeTemplate[] {
/* 258 */           field(name2, element2), 
/* 259 */           field(name3, element3)
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate fields(String name, TypeTemplate element, TypeTemplate rest) {
/* 267 */     return and(
/* 268 */         field(name, element), rest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate fields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, TypeTemplate rest) {
/* 278 */     return and(
/* 279 */         field(name1, element1), new TypeTemplate[] {
/* 280 */           field(name2, element2), rest
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate fields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3, TypeTemplate rest) {
/* 291 */     return and(
/* 292 */         field(name1, element1), new TypeTemplate[] {
/* 293 */           field(name2, element2), 
/* 294 */           field(name3, element3), rest
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name, TypeTemplate element) {
/* 300 */     return allWithRemainder(
/* 301 */         optional(field(name, element)), new TypeTemplate[0]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2) {
/* 309 */     return allWithRemainder(
/* 310 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 311 */           optional(field(name2, element2))
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3) {
/* 320 */     return allWithRemainder(
/* 321 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 322 */           optional(field(name2, element2)), 
/* 323 */           optional(field(name3, element3))
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3, String name4, TypeTemplate element4) {
/* 333 */     return allWithRemainder(
/* 334 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 335 */           optional(field(name2, element2)), 
/* 336 */           optional(field(name3, element3)), 
/* 337 */           optional(field(name4, element4))
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3, String name4, TypeTemplate element4, String name5, TypeTemplate element5) {
/* 348 */     return allWithRemainder(
/* 349 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 350 */           optional(field(name2, element2)), 
/* 351 */           optional(field(name3, element3)), 
/* 352 */           optional(field(name4, element4)), 
/* 353 */           optional(field(name5, element5))
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name, TypeTemplate element, TypeTemplate rest) {
/* 361 */     return and(
/* 362 */         optional(field(name, element)), rest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, TypeTemplate rest) {
/* 372 */     return and(
/* 373 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 374 */           optional(field(name2, element2)), rest
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3, TypeTemplate rest) {
/* 385 */     return and(
/* 386 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 387 */           optional(field(name2, element2)), 
/* 388 */           optional(field(name3, element3)), rest
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3, String name4, TypeTemplate element4, TypeTemplate rest) {
/* 400 */     return and(
/* 401 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 402 */           optional(field(name2, element2)), 
/* 403 */           optional(field(name3, element3)), 
/* 404 */           optional(field(name4, element4)), rest
/*     */         });
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
/*     */   static TypeTemplate optionalFields(String name1, TypeTemplate element1, String name2, TypeTemplate element2, String name3, TypeTemplate element3, String name4, TypeTemplate element4, String name5, TypeTemplate element5, TypeTemplate rest) {
/* 417 */     return and(
/* 418 */         optional(field(name1, element1)), new TypeTemplate[] {
/* 419 */           optional(field(name2, element2)), 
/* 420 */           optional(field(name3, element3)), 
/* 421 */           optional(field(name4, element4)), 
/* 422 */           optional(field(name5, element5)), rest
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static OpticFinder<Dynamic<?>> remainderFinder() {
/* 430 */     return Instances.REMAINDER_FINDER;
/*     */   }
/*     */   
/*     */   static <FT> OpticFinder<FT> typeFinder(Type<FT> type) {
/* 434 */     return new FieldFinder<>(null, type);
/*     */   }
/*     */   
/*     */   static <FT> OpticFinder<FT> fieldFinder(String name, Type<FT> type) {
/* 438 */     return new FieldFinder<>(name, type);
/*     */   }
/*     */   
/*     */   static <FT> OpticFinder<FT> namedChoice(String name, Type<FT> type) {
/* 442 */     return new NamedChoiceFinder<>(name, type);
/*     */   }
/*     */   
/*     */   static Unit unit() {
/* 446 */     return null;
/*     */   }
/*     */   
/*     */   public static final class Instances {
/* 450 */     private static final Type<Boolean> BOOL_TYPE = (Type<Boolean>)new BoolType();
/* 451 */     private static final Type<Integer> INT_TYPE = (Type<Integer>)new IntType();
/* 452 */     private static final Type<Long> LONG_TYPE = (Type<Long>)new LongType();
/* 453 */     private static final Type<Byte> BYTE_TYPE = (Type<Byte>)new ByteType();
/* 454 */     private static final Type<Short> SHORT_TYPE = (Type<Short>)new ShortType();
/* 455 */     private static final Type<Float> FLOAT_TYPE = (Type<Float>)new FloatType();
/* 456 */     private static final Type<Double> DOUBLE_TYPE = (Type<Double>)new DoubleType();
/* 457 */     private static final Type<String> STRING_TYPE = (Type<String>)new StringType();
/* 458 */     private static final Type<String> NAMESPACED_STRING_TYPE = (Type<String>)new NamespacedStringType();
/* 459 */     private static final Type<Unit> NIL_DROP = (Type<Unit>)new NilDrop();
/* 460 */     private static final Type<Dynamic<?>> NIL_SAVE = (Type<Dynamic<?>>)new NilSave();
/*     */     
/* 462 */     private static final OpticFinder<Dynamic<?>> REMAINDER_FINDER = DSL.remainderType().finder();
/*     */     
/* 464 */     private static final Map<Triple<String, Type<?>, Map<?, Type<?>>>, Type<? extends Pair<?, ?>>> TAGGED_CHOICE_TYPE_CACHE = Maps.newConcurrentMap();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\DSL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */