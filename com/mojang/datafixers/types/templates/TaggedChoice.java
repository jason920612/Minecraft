/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.google.common.base.Joiner;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.reflect.TypeToken;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixerUpper;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.FunctionType;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.View;
/*     */ import com.mojang.datafixers.functions.Functions;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.optics.Affine;
/*     */ import com.mojang.datafixers.optics.Lens;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.optics.Traversal;
/*     */ import com.mojang.datafixers.optics.profunctors.AffineP;
/*     */ import com.mojang.datafixers.optics.profunctors.Cartesian;
/*     */ import com.mojang.datafixers.optics.profunctors.TraversalP;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Arrays;
/*     */ import java.util.BitSet;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.IntFunction;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public final class TaggedChoice<K>
/*     */   implements TypeTemplate
/*     */ {
/*  51 */   private static final Logger LOGGER = LogManager.getLogger();
/*     */   
/*     */   private final String name;
/*     */   private final Type<K> keyType;
/*     */   private final Map<K, TypeTemplate> templates;
/*  56 */   private final Map<Pair<TypeFamily, Integer>, Type<?>> types = Maps.newConcurrentMap();
/*     */   private final int size;
/*     */   
/*     */   public TaggedChoice(String name, Type<K> keyType, Map<K, TypeTemplate> templates) {
/*  60 */     this.name = name;
/*  61 */     this.keyType = keyType;
/*  62 */     this.templates = templates;
/*  63 */     this.size = templates.values().stream().mapToInt(TypeTemplate::size).max().orElse(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  68 */     return this.size;
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(TypeFamily family) {
/*  73 */     return index -> (Type)this.types.computeIfAbsent(Pair.of(family, Integer.valueOf(index)), ());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  80 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public <A, B> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<A> type, Type<B> resultType) {
/*  85 */     return Either.right(new Type.FieldNotFoundException("Not implemented"));
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  90 */     return index -> {
/*     */         RewriteResult<Pair<K, ?>, Pair<K, ?>> result = RewriteResult.nop(apply(family).apply(index));
/*     */         for (Map.Entry<K, TypeTemplate> entry : this.templates.entrySet()) {
/*     */           RewriteResult<?, ?> elementResult = ((TypeTemplate)entry.getValue()).hmap(family, function).apply(index);
/*     */           result = TaggedChoiceType.elementResult(entry.getKey(), (TaggedChoiceType<K>)result.view().newType(), elementResult).compose(result);
/*     */         } 
/*     */         return result;
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 102 */     if (this == obj) {
/* 103 */       return true;
/*     */     }
/* 105 */     if (!(obj instanceof TaggedChoice)) {
/* 106 */       return false;
/*     */     }
/* 108 */     TaggedChoice<?> other = (TaggedChoice)obj;
/* 109 */     return (Objects.equals(this.name, other.name) && Objects.equals(this.keyType, other.keyType) && Objects.equals(this.templates, other.templates));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 114 */     return Objects.hash(new Object[] { this.name, this.keyType, this.templates });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 119 */     return "TaggedChoice[" + this.name + ", " + Joiner.on(", ").withKeyValueSeparator(" -> ").join(this.templates) + "]";
/*     */   }
/*     */   
/*     */   public static final class TaggedChoiceType<K> extends Type<Pair<K, ?>> {
/*     */     private final String name;
/*     */     private final Type<K> keyType;
/*     */     protected final Map<K, Type<?>> types;
/*     */     private final int hashCode;
/*     */     
/*     */     public TaggedChoiceType(String name, Type<K> keyType, Map<K, Type<?>> types) {
/* 129 */       this.name = name;
/* 130 */       this.keyType = keyType;
/* 131 */       this.types = types;
/* 132 */       this.hashCode = Objects.hash(new Object[] { name, keyType, types });
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public RewriteResult<Pair<K, ?>, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 143 */       Map<K, ? extends RewriteResult<?, ?>> results = (Map<K, ? extends RewriteResult<?, ?>>)this.types.entrySet().stream().map(e -> rule.rewrite((Type)e.getValue()).map(())).filter(e -> (e.isPresent() && !Objects.equals(((RewriteResult)((Pair)e.get()).getSecond()).view().function(), Functions.id()))).map(Optional::get).collect(
/* 144 */           Collectors.toMap(Pair::getFirst, Pair::getSecond));
/*     */       
/* 146 */       if (results.isEmpty())
/* 147 */         return RewriteResult.nop(this); 
/* 148 */       if (results.size() == 1) {
/* 149 */         Map.Entry<K, ? extends RewriteResult<?, ?>> entry = results.entrySet().iterator().next();
/* 150 */         return elementResult(entry.getKey(), this, entry.getValue());
/*     */       } 
/* 152 */       Map<K, Type<?>> newTypes = Maps.newHashMap(this.types);
/* 153 */       BitSet recData = new BitSet();
/* 154 */       for (Map.Entry<K, ? extends RewriteResult<?, ?>> entry : results.entrySet()) {
/* 155 */         newTypes.put(entry.getKey(), ((RewriteResult)entry.getValue()).view().newType());
/* 156 */         recData.or(((RewriteResult)entry.getValue()).recData());
/*     */       } 
/* 158 */       return RewriteResult.create(View.create(this, DSL.taggedChoiceType(this.name, this.keyType, newTypes), Functions.fun("TaggedChoiceTypeRewriteResult " + results.size(), new RewriteFunc<>(results))), recData);
/*     */     }
/*     */     
/*     */     public static <K, FT, FR> RewriteResult<Pair<K, ?>, Pair<K, ?>> elementResult(K key, TaggedChoiceType<K> type, RewriteResult<FT, FR> result) {
/* 162 */       return opticView(type, result, TypedOptic.tagged(type, key, result.view().type(), result.view().newType()));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<Pair<K, ?>, ?>> one(TypeRewriteRule rule) {
/* 167 */       for (Map.Entry<K, Type<?>> entry : this.types.entrySet()) {
/* 168 */         Optional<? extends RewriteResult<?, ?>> elementResult = rule.rewrite(entry.getValue());
/* 169 */         if (elementResult.isPresent()) {
/* 170 */           return Optional.of(elementResult(entry.getKey(), this, elementResult.get()));
/*     */         }
/*     */       } 
/* 173 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 178 */       return DSL.taggedChoiceType(this.name, this.keyType, (Map)this.types.entrySet().stream().map(e -> Pair.of(e.getKey(), ((Type)e.getValue()).updateMu(newFamily))).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 183 */       return DSL.taggedChoice(this.name, this.keyType, (Map)this.types.entrySet().stream().map(e -> Pair.of(e.getKey(), ((Type)e.getValue()).template())).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<Pair<K, ?>>> read(DynamicOps<T> ops, T input) {
/* 188 */       Optional<Map<T, T>> values = ops.getMapValues(input);
/* 189 */       if (values.isPresent()) {
/* 190 */         Map<T, T> map = values.get();
/* 191 */         T nameObject = (T)ops.createString(this.name);
/* 192 */         T mapValue = map.get(nameObject);
/* 193 */         if (mapValue != null) {
/* 194 */           Optional<K> key = (Optional<K>)this.keyType.read(ops, mapValue).getSecond();
/*     */           
/* 196 */           T t = key.isPresent() ? (T)key.get() : null;
/* 197 */           Type<?> type = (t != null) ? this.types.get(t) : null;
/* 198 */           if (type == null) {
/* 199 */             if (DataFixerUpper.ERRORS_ARE_FATAL) {
/* 200 */               throw new IllegalArgumentException("Unsupported key: " + t + " in " + this);
/*     */             }
/* 202 */             TaggedChoice.LOGGER.warn("Unsupported key: {} in {}", t, this);
/* 203 */             return Pair.of(input, Optional.empty());
/*     */           } 
/*     */ 
/*     */           
/* 207 */           return type.read(ops, input).mapSecond(vo -> vo.map(()));
/*     */         } 
/*     */       } 
/* 210 */       return Pair.of(input, Optional.empty());
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, Pair<K, ?> value) {
/* 215 */       Type<?> type = this.types.get(value.getFirst());
/* 216 */       if (type == null)
/*     */       {
/*     */         
/* 219 */         throw new IllegalArgumentException("Unsupported key: " + value.getFirst() + " in " + this);
/*     */       }
/* 221 */       return capWrite(ops, type, (K)value.getFirst(), value.getSecond(), rest);
/*     */     }
/*     */ 
/*     */     
/*     */     private <T, A> T capWrite(DynamicOps<T> ops, Type<A> type, K key, Object value, T rest) {
/* 226 */       return (T)ops.mergeInto(type.write(ops, rest, value), ops.createString(this.name), this.keyType.write(ops, ops.empty(), key));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 231 */       return this.types.values().stream().map(t -> t.findFieldTypeOpt(name)).filter(Optional::isPresent).findFirst().flatMap(Function.identity());
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Pair<K, ?>> point(DynamicOps<?> ops) {
/* 236 */       return this.types.entrySet().stream().map(e -> ((Type)e.getValue()).point(ops).map(())).filter(Optional::isPresent).findFirst().flatMap(Function.identity()).map(p -> p);
/*     */     }
/*     */     
/*     */     public Optional<Typed<Pair<K, ?>>> point(DynamicOps<?> ops, K key, Object value) {
/* 240 */       if (!this.types.containsKey(key)) {
/* 241 */         return Optional.empty();
/*     */       }
/* 243 */       return Optional.of(new Typed(this, ops, Pair.of(key, value)));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<Pair<K, ?>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/*     */       Traversal<Pair<K, ?>, Pair<K, ?>, FT, FR> traversal;
/*     */       TypeToken<? extends K1> bound;
/* 254 */       final Map<K, ? extends TypedOptic<?, ?, FT, FR>> optics = (Map<K, ? extends TypedOptic<?, ?, FT, FR>>)this.types.entrySet().stream().map(e -> Pair.of(e.getKey(), ((Type)e.getValue()).findType(type, resultType, matcher, recurse))).filter(e -> ((Either)e.getSecond()).left().isPresent()).map(e -> e.mapSecond(())).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
/*     */       
/* 256 */       if (optics.isEmpty())
/* 257 */         return Either.right(new Type.FieldNotFoundException("Not found in any choices")); 
/* 258 */       if (optics.size() == 1) {
/* 259 */         Map.Entry<K, ? extends TypedOptic<?, ?, FT, FR>> entry = optics.entrySet().iterator().next();
/* 260 */         return Either.left(cap(this, entry.getKey(), entry.getValue()));
/*     */       } 
/* 262 */       Set<TypeToken<? extends K1>> bounds = Sets.newHashSet();
/* 263 */       optics.values().forEach(o -> bounds.addAll(o.bounds()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 270 */       if (TypedOptic.instanceOf(bounds, Cartesian.Mu.TYPE_TOKEN) && optics.size() == this.types.size()) {
/* 271 */         bound = Cartesian.Mu.TYPE_TOKEN;
/*     */         
/* 273 */         Lens<Pair<K, ?>, Pair<K, ?>, FT, FR> lens = new Lens<Pair<K, ?>, Pair<K, ?>, FT, FR>()
/*     */           {
/*     */             public FT view(Pair<K, ?> s) {
/* 276 */               TypedOptic<?, ?, FT, FR> optic = (TypedOptic<?, ?, FT, FR>)optics.get(s.getFirst());
/* 277 */               return (FT)capView(s, optic);
/*     */             }
/*     */ 
/*     */             
/*     */             private <S, T> FT capView(Pair<K, ?> s, TypedOptic<S, T, FT, FR> optic) {
/* 282 */               return (FT)Optics.toLens((Optic)optic.upCast(Cartesian.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).view(s.getSecond());
/*     */             }
/*     */ 
/*     */             
/*     */             public Pair<K, ?> update(FR b, Pair<K, ?> s) {
/* 287 */               TypedOptic<?, ?, FT, FR> optic = (TypedOptic<?, ?, FT, FR>)optics.get(s.getFirst());
/* 288 */               return capUpdate(b, s, optic);
/*     */             }
/*     */ 
/*     */             
/*     */             private <S, T> Pair<K, ?> capUpdate(FR b, Pair<K, ?> s, TypedOptic<S, T, FT, FR> optic) {
/* 293 */               return Pair.of(s.getFirst(), Optics.toLens((Optic)optic.upCast(Cartesian.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).update(b, s.getSecond()));
/*     */             }
/*     */           };
/* 296 */       } else if (TypedOptic.instanceOf(bounds, AffineP.Mu.TYPE_TOKEN)) {
/* 297 */         bound = AffineP.Mu.TYPE_TOKEN;
/*     */         
/* 299 */         Affine<Pair<K, ?>, Pair<K, ?>, FT, FR> affine = new Affine<Pair<K, ?>, Pair<K, ?>, FT, FR>()
/*     */           {
/*     */             public Either<Pair<K, ?>, FT> preview(Pair<K, ?> s) {
/* 302 */               if (!optics.containsKey(s.getFirst())) {
/* 303 */                 return Either.left(s);
/*     */               }
/* 305 */               TypedOptic<?, ?, FT, FR> optic = (TypedOptic<?, ?, FT, FR>)optics.get(s.getFirst());
/* 306 */               return capPreview(s, optic);
/*     */             }
/*     */ 
/*     */             
/*     */             private <S, T> Either<Pair<K, ?>, FT> capPreview(Pair<K, ?> s, TypedOptic<S, T, FT, FR> optic) {
/* 311 */               return Optics.toAffine((Optic)optic.upCast(AffineP.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).preview(s.getSecond()).mapLeft(t -> Pair.of(s.getFirst(), t));
/*     */             }
/*     */ 
/*     */             
/*     */             public Pair<K, ?> set(FR b, Pair<K, ?> s) {
/* 316 */               if (!optics.containsKey(s.getFirst())) {
/* 317 */                 return s;
/*     */               }
/* 319 */               TypedOptic<?, ?, FT, FR> optic = (TypedOptic<?, ?, FT, FR>)optics.get(s.getFirst());
/* 320 */               return capSet(b, s, optic);
/*     */             }
/*     */ 
/*     */             
/*     */             private <S, T> Pair<K, ?> capSet(FR b, Pair<K, ?> s, TypedOptic<S, T, FT, FR> optic) {
/* 325 */               return Pair.of(s.getFirst(), Optics.toAffine((Optic)optic.upCast(AffineP.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).set(b, s.getSecond()));
/*     */             }
/*     */           };
/* 328 */       } else if (TypedOptic.instanceOf(bounds, TraversalP.Mu.TYPE_TOKEN)) {
/* 329 */         bound = TraversalP.Mu.TYPE_TOKEN;
/*     */         
/* 331 */         traversal = new Traversal<Pair<K, ?>, Pair<K, ?>, FT, FR>()
/*     */           {
/*     */             public <F extends K1> FunctionType<Pair<K, ?>, App<F, Pair<K, ?>>> wander(Applicative<F, ?> applicative, FunctionType<FT, App<F, FR>> input) {
/* 334 */               return pair -> {
/*     */                   if (!optics.containsKey(pair.getFirst())) {
/*     */                     return applicative.point(pair);
/*     */                   }
/*     */                   TypedOptic<?, ?, FT, FR> optic = (TypedOptic<?, ?, FT, FR>)optics.get(pair.getFirst());
/*     */                   return capTraversal(applicative, input, pair, optic);
/*     */                 };
/*     */             }
/*     */ 
/*     */             
/*     */             private <S, T, F extends K1> App<F, Pair<K, ?>> capTraversal(Applicative<F, ?> applicative, FunctionType<FT, App<F, FR>> input, Pair<K, ?> pair, TypedOptic<S, T, FT, FR> optic) {
/* 345 */               Traversal<S, T, FT, FR> traversal = Optics.toTraversal((Optic)optic.upCast(TraversalP.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new));
/* 346 */               return applicative.ap(value -> Pair.of(pair.getFirst(), value), (App)traversal.wander(applicative, input).apply(pair.getSecond()));
/*     */             }
/*     */           };
/*     */       } else {
/* 350 */         throw new IllegalStateException("Could not merge TaggedChoiceType optics, unknown bound: " + Arrays.toString(bounds.toArray()));
/*     */       } 
/*     */       
/* 353 */       Map<K, Type<?>> newTypes = (Map<K, Type<?>>)this.types.entrySet().stream().map(e -> Pair.of(e.getKey(), optics.containsKey(e.getKey()) ? ((TypedOptic)optics.get(e.getKey())).tType() : e.getValue())).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
/*     */       
/* 355 */       return Either.left(new TypedOptic(bound, this, 
/*     */ 
/*     */             
/* 358 */             DSL.taggedChoiceType(this.name, this.keyType, newTypes), type, resultType, (Optic)traversal));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private <S, T, FT, FR> TypedOptic<Pair<K, ?>, Pair<K, ?>, FT, FR> cap(TaggedChoiceType<K> choiceType, K key, TypedOptic<S, T, FT, FR> optic) {
/* 367 */       return TypedOptic.tagged(choiceType, key, optic.sType(), optic.tType()).compose(optic);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<TaggedChoiceType<?>> findChoiceType(String name, int index) {
/* 372 */       if (Objects.equals(name, this.name)) {
/* 373 */         return Optional.of(this);
/*     */       }
/* 375 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findCheckedType(int index) {
/* 380 */       return this.types.values().stream().map(type -> type.findCheckedType(index)).filter(Optional::isPresent).findFirst().flatMap(Function.identity());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 385 */       if (this == obj) {
/* 386 */         return true;
/*     */       }
/* 388 */       if (!(obj instanceof TaggedChoiceType)) {
/* 389 */         return false;
/*     */       }
/* 391 */       TaggedChoiceType<?> other = (TaggedChoiceType)obj;
/* 392 */       if (!Objects.equals(this.name, other.name)) {
/* 393 */         return false;
/*     */       }
/* 395 */       if (!this.keyType.equals(other.keyType, ignoreRecursionPoints, checkIndex)) {
/* 396 */         return false;
/*     */       }
/* 398 */       if (this.types.size() != other.types.size()) {
/* 399 */         return false;
/*     */       }
/* 401 */       for (Map.Entry<K, Type<?>> entry : this.types.entrySet()) {
/* 402 */         if (!((Type)entry.getValue()).equals(other.types.get(entry.getKey()), ignoreRecursionPoints, checkIndex)) {
/* 403 */           return false;
/*     */         }
/*     */       } 
/* 406 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 411 */       return this.hashCode;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 416 */       return "TaggedChoiceType[" + this.name + ", " + Joiner.on(", \n").withKeyValueSeparator(" -> ").join(this.types) + "]\n";
/*     */     }
/*     */     
/*     */     public String getName() {
/* 420 */       return this.name;
/*     */     }
/*     */     
/*     */     public Type<K> getKeyType() {
/* 424 */       return this.keyType;
/*     */     }
/*     */     
/*     */     public boolean hasType(K key) {
/* 428 */       return this.types.containsKey(key);
/*     */     }
/*     */     
/*     */     public Map<K, Type<?>> types() {
/* 432 */       return this.types;
/*     */     }
/*     */     
/*     */     private static final class RewriteFunc<K> implements Function<DynamicOps<?>, Function<Pair<K, ?>, Pair<K, ?>>> {
/*     */       private final Map<K, ? extends RewriteResult<?, ?>> results;
/*     */       
/*     */       public RewriteFunc(Map<K, ? extends RewriteResult<?, ?>> results) {
/* 439 */         this.results = results;
/*     */       }
/*     */ 
/*     */       
/*     */       public FunctionType<Pair<K, ?>, Pair<K, ?>> apply(DynamicOps<?> ops) {
/* 444 */         return input -> {
/*     */             RewriteResult<?, ?> result = this.results.get(input.getFirst());
/*     */             return (result == null) ? input : capRuleApply(ops, input, result);
/*     */           };
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private <A, B> Pair<K, B> capRuleApply(DynamicOps<?> ops, Pair<K, ?> input, RewriteResult<A, B> result) {
/* 455 */         return input.mapSecond(v -> ((Function)result.view().function().evalCached().apply(ops)).apply(v));
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean equals(Object o) {
/* 460 */         if (this == o) {
/* 461 */           return true;
/*     */         }
/* 463 */         if (o == null || getClass() != o.getClass()) {
/* 464 */           return false;
/*     */         }
/* 466 */         RewriteFunc<?> that = (RewriteFunc)o;
/* 467 */         return Objects.equals(this.results, that.results);
/*     */       }
/*     */ 
/*     */       
/*     */       public int hashCode() {
/* 472 */         return Objects.hash(new Object[] { this.results });
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\TaggedChoice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */