/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.reflect.TypeToken;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.optics.ListTraversal;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.optics.profunctors.TraversalP;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.IntFunction;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ public final class CompoundList
/*     */   implements TypeTemplate
/*     */ {
/*     */   private final TypeTemplate key;
/*     */   private final TypeTemplate element;
/*     */   
/*     */   public CompoundList(TypeTemplate key, TypeTemplate element) {
/*  41 */     this.key = key;
/*  42 */     this.element = element;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  47 */     return Math.max(this.key.size(), this.element.size());
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(TypeFamily family) {
/*  52 */     return index -> DSL.compoundList(this.key.apply(family).apply(index), this.element.apply(family).apply(index));
/*     */   }
/*     */ 
/*     */   
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  57 */     return TypeFamily.familyOptic(i -> {
/*     */           OpticParts<A, B> optic = this.element.<A, B>applyO(input, aType, bType).apply(i);
/*     */           Set<TypeToken<? extends K1>> bounds = Sets.newHashSet(optic.bounds());
/*     */           bounds.add(TraversalP.Mu.TYPE_TOKEN);
/*     */           return new OpticParts(bounds, cap(optic.optic()));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private <S, T, A, B> Optic<?, ?, ?, A, B> cap(Optic<?, S, T, A, B> concreteOptic) {
/*  68 */     return (new ListTraversal()).compose((Optic)Optics.proj2()).composeUnchecked(concreteOptic);
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  73 */     return this.element.<FT, FR>findFieldOrType(index, name, type, resultType).mapLeft(element1 -> new CompoundList(this.key, element1));
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  78 */     return i -> {
/*     */         RewriteResult<?, ?> f1 = this.key.hmap(family, function).apply(i);
/*     */         RewriteResult<?, ?> f2 = this.element.hmap(family, function).apply(i);
/*     */         return cap(apply(family).apply(i), f1, f2);
/*     */       };
/*     */   }
/*     */   
/*     */   private <L, R> RewriteResult<?, ?> cap(Type<?> type, RewriteResult<L, ?> f1, RewriteResult<R, ?> f2) {
/*  86 */     return ((CompoundListType)type).mergeViews(f1, f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  91 */     return (obj instanceof CompoundList && Objects.equals(this.element, ((CompoundList)obj).element));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  96 */     return Objects.hash(new Object[] { this.element });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 101 */     return "CompoundList[" + this.element + "]";
/*     */   }
/*     */   
/*     */   public static final class CompoundListType<K, V> extends Type<List<Pair<K, V>>> {
/*     */     protected final Type<K> key;
/*     */     protected final Type<V> element;
/*     */     
/*     */     public CompoundListType(Type<K> key, Type<V> element) {
/* 109 */       this.key = key;
/* 110 */       this.element = element;
/*     */     }
/*     */ 
/*     */     
/*     */     public RewriteResult<List<Pair<K, V>>, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 115 */       return mergeViews(this.key.rewriteOrNop(rule), this.element.rewriteOrNop(rule));
/*     */     }
/*     */     
/*     */     public <K2, V2> RewriteResult<List<Pair<K, V>>, ?> mergeViews(RewriteResult<K, K2> leftView, RewriteResult<V, V2> rightView) {
/* 119 */       RewriteResult<List<Pair<K, V>>, List<Pair<K2, V>>> v1 = fixKeys(this, this.key, this.element, leftView);
/* 120 */       RewriteResult<List<Pair<K2, V>>, List<Pair<K2, V2>>> v2 = fixValues(v1.view().newType(), leftView.view().newType(), this.element, rightView);
/* 121 */       return v2.compose(v1);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<List<Pair<K, V>>, ?>> one(TypeRewriteRule rule) {
/* 126 */       return DataFixUtils.or(rule
/* 127 */           .rewrite(this.key).map(v -> fixKeys(this, this.key, this.element, v)), () -> rule.rewrite(this.element).map(()));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static <K, V, K2> RewriteResult<List<Pair<K, V>>, List<Pair<K2, V>>> fixKeys(Type<List<Pair<K, V>>> type, Type<K> first, Type<V> second, RewriteResult<K, K2> view) {
/* 133 */       return opticView(type, view, TypedOptic.compoundListKeys(first, view.view().newType(), second));
/*     */     }
/*     */     
/*     */     private static <K, V, V2> RewriteResult<List<Pair<K, V>>, List<Pair<K, V2>>> fixValues(Type<List<Pair<K, V>>> type, Type<K> first, Type<V> second, RewriteResult<V, V2> view) {
/* 137 */       return opticView(type, view, TypedOptic.compoundListElements(first, second, view.view().newType()));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 142 */       return DSL.compoundList(this.key.updateMu(newFamily), this.element.updateMu(newFamily));
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 147 */       return new CompoundList(this.key.template(), this.element.template());
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<List<Pair<K, V>>> point(DynamicOps<?> ops) {
/* 152 */       return (Optional)Optional.of(ImmutableList.of());
/*     */     }
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<List<Pair<K, V>>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 157 */       Either<TypedOptic<K, ?, FT, FR>, Type.FieldNotFoundException> firstFieldLens = this.key.findType(type, resultType, matcher, recurse);
/* 158 */       return (Either<TypedOptic<List<Pair<K, V>>, ?, FT, FR>, Type.FieldNotFoundException>)firstFieldLens.map(this::capLeft, r -> {
/*     */             Either<TypedOptic<V, ?, FT, FR>, Type.FieldNotFoundException> secondFieldLens = this.element.findType(type, resultType, matcher, recurse);
/*     */             return secondFieldLens.mapLeft(this::capRight);
/*     */           });
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private <FT, K2, FR> Either<TypedOptic<List<Pair<K, V>>, ?, FT, FR>, Type.FieldNotFoundException> capLeft(TypedOptic<K, K2, FT, FR> optic) {
/* 168 */       return Either.left(TypedOptic.compoundListKeys(optic.sType(), optic.tType(), this.element).compose(optic));
/*     */     }
/*     */     
/*     */     private <FT, V2, FR> TypedOptic<List<Pair<K, V>>, ?, FT, FR> capRight(TypedOptic<V, V2, FT, FR> optic) {
/* 172 */       return TypedOptic.compoundListElements(this.key, optic.sType(), optic.tType()).compose(optic);
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<List<Pair<K, V>>>> read(DynamicOps<T> ops, T input) {
/* 177 */       return ops.getMapValues(input).map(map -> {
/*     */             ImmutableList.Builder<Pair<K, V>> builder = ImmutableList.builder();
/*     */             ImmutableMap.Builder<T, T> restBuilder = ImmutableMap.builder();
/*     */             for (Map.Entry<T, T> entry : (Iterable<Map.Entry<T, T>>)map.entrySet()) {
/*     */               Pair<T, Optional<K>> keyValue = this.key.read(ops, entry.getKey());
/*     */               Pair<T, Optional<V>> elementValue = this.element.read(ops, entry.getValue());
/*     */               if (((Optional)keyValue.getSecond()).isPresent() && ((Optional)elementValue.getSecond()).isPresent()) {
/*     */                 builder.add(Pair.of(((Optional)keyValue.getSecond()).get(), ((Optional)elementValue.getSecond()).get()));
/*     */                 continue;
/*     */               } 
/*     */               restBuilder.put(entry);
/*     */             } 
/*     */             return Pair.of(ops.createMap((Map)restBuilder.build()), Optional.of(builder.build()));
/* 190 */           }).orElseGet(() -> Pair.of(input, Optional.empty()));
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, List<Pair<K, V>> value) {
/* 195 */       ImmutableMap.Builder<T, T> builder = ImmutableMap.builder();
/* 196 */       value.forEach(pair -> builder.put(this.key.write(ops, ops.empty(), pair.getFirst()), this.element.write(ops, ops.empty(), pair.getSecond())));
/* 197 */       return (T)ops.merge(rest, ops.createMap((Map)builder.build()));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 202 */       return "CompoundList[" + this.key + " -> " + this.element + "]";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 207 */       if (!(obj instanceof CompoundListType)) {
/* 208 */         return false;
/*     */       }
/* 210 */       CompoundListType<?, ?> that = (CompoundListType<?, ?>)obj;
/* 211 */       return (this.key.equals(that.key, ignoreRecursionPoints, checkIndex) && this.element.equals(that.element, ignoreRecursionPoints, checkIndex));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 216 */       return Objects.hash(new Object[] { this.key, this.element });
/*     */     }
/*     */     
/*     */     public Type<K> getKey() {
/* 220 */       return this.key;
/*     */     }
/*     */     
/*     */     public Type<V> getElement() {
/* 224 */       return this.element;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\CompoundList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */