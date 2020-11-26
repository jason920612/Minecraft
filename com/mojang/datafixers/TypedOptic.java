/*     */ package com.mojang.datafixers;
/*     */ 
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.reflect.TypeToken;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.App2;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.optics.Inj1;
/*     */ import com.mojang.datafixers.optics.Inj2;
/*     */ import com.mojang.datafixers.optics.InjTagged;
/*     */ import com.mojang.datafixers.optics.ListTraversal;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.optics.Proj1;
/*     */ import com.mojang.datafixers.optics.Proj2;
/*     */ import com.mojang.datafixers.optics.profunctors.Cartesian;
/*     */ import com.mojang.datafixers.optics.profunctors.Cocartesian;
/*     */ import com.mojang.datafixers.optics.profunctors.Profunctor;
/*     */ import com.mojang.datafixers.optics.profunctors.TraversalP;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class TypedOptic<S, T, A, B>
/*     */ {
/*     */   protected final Set<TypeToken<? extends K1>> proofBounds;
/*     */   protected final Type<S> sType;
/*     */   protected final Type<T> tType;
/*     */   protected final Type<A> aType;
/*     */   protected final Type<B> bType;
/*     */   private final Optic<?, S, T, A, B> optic;
/*     */   
/*     */   public TypedOptic(TypeToken<? extends K1> proofBound, Type<S> sType, Type<T> tType, Type<A> aType, Type<B> bType, Optic<?, S, T, A, B> optic) {
/*  44 */     this((Set<TypeToken<? extends K1>>)ImmutableSet.of(proofBound), sType, tType, aType, bType, optic);
/*     */   }
/*     */   
/*     */   public TypedOptic(Set<TypeToken<? extends K1>> proofBounds, Type<S> sType, Type<T> tType, Type<A> aType, Type<B> bType, Optic<?, S, T, A, B> optic) {
/*  48 */     this.proofBounds = proofBounds;
/*  49 */     this.sType = sType;
/*  50 */     this.tType = tType;
/*  51 */     this.aType = aType;
/*  52 */     this.bType = bType;
/*  53 */     this.optic = optic;
/*     */   }
/*     */   
/*     */   public <P extends com.mojang.datafixers.kinds.K2, Proof2 extends K1> App2<P, S, T> apply(TypeToken<Proof2> token, App<Proof2, P> proof, App2<P, A, B> argument) {
/*  57 */     return ((Optic)upCast(token)
/*  58 */       .orElseThrow(() -> new IllegalArgumentException("Couldn't upcast")))
/*     */ 
/*     */       
/*  61 */       .eval(proof)
/*  62 */       .apply(argument);
/*     */   }
/*     */   
/*     */   public Optic<?, S, T, A, B> optic() {
/*  66 */     return this.optic;
/*     */   }
/*     */   
/*     */   public Set<TypeToken<? extends K1>> bounds() {
/*  70 */     return this.proofBounds;
/*     */   }
/*     */   
/*     */   public Type<S> sType() {
/*  74 */     return this.sType;
/*     */   }
/*     */   
/*     */   public Type<T> tType() {
/*  78 */     return this.tType;
/*     */   }
/*     */   
/*     */   public Type<A> aType() {
/*  82 */     return this.aType;
/*     */   }
/*     */   
/*     */   public Type<B> bType() {
/*  86 */     return this.bType;
/*     */   }
/*     */   
/*     */   public <A1, B1> TypedOptic<S, T, A1, B1> compose(TypedOptic<A, B, A1, B1> other) {
/*  90 */     ImmutableSet.Builder<TypeToken<? extends K1>> builder = ImmutableSet.builder();
/*  91 */     builder.addAll(this.proofBounds);
/*  92 */     builder.addAll(other.proofBounds);
/*  93 */     return new TypedOptic((Set<TypeToken<? extends K1>>)builder
/*  94 */         .build(), this.sType, this.tType, other.aType, other.bType, 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  99 */         optic().composeUnchecked(other.optic()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <Proof2 extends K1> Optional<Optic<? super Proof2, S, T, A, B>> upCast(TypeToken<Proof2> proof) {
/* 105 */     if (instanceOf(this.proofBounds, proof)) {
/* 106 */       return (Optional)Optional.of(this.optic);
/*     */     }
/* 108 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public static <Proof2 extends K1> boolean instanceOf(Collection<TypeToken<? extends K1>> bounds, TypeToken<Proof2> proof) {
/* 112 */     return bounds.stream().allMatch(bound -> bound.isSupertypeOf(proof));
/*     */   }
/*     */   
/*     */   public static <S, T> TypedOptic<S, T, S, T> adapter(Type<S> sType, Type<T> tType) {
/* 116 */     return new TypedOptic<>(Profunctor.Mu.TYPE_TOKEN, sType, tType, sType, tType, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 122 */         (Optic<?, S, T, S, T>)Optics.id());
/*     */   }
/*     */ 
/*     */   
/*     */   public static <F, G, F2> TypedOptic<Pair<F, G>, Pair<F2, G>, F, F2> proj1(Type<F> fType, Type<G> gType, Type<F2> newType) {
/* 127 */     return new TypedOptic<>(Cartesian.Mu.TYPE_TOKEN, 
/*     */         
/* 129 */         DSL.and(fType, gType), 
/* 130 */         DSL.and(newType, gType), fType, newType, (Optic<?, Pair<F, G>, Pair<F2, G>, F, F2>)new Proj1());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <F, G, G2> TypedOptic<Pair<F, G>, Pair<F, G2>, G, G2> proj2(Type<F> fType, Type<G> gType, Type<G2> newType) {
/* 138 */     return new TypedOptic<>(Cartesian.Mu.TYPE_TOKEN, 
/*     */         
/* 140 */         DSL.and(fType, gType), 
/* 141 */         DSL.and(fType, newType), gType, newType, (Optic<?, Pair<F, G>, Pair<F, G2>, G, G2>)new Proj2());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <F, G, F2> TypedOptic<Either<F, G>, Either<F2, G>, F, F2> inj1(Type<F> fType, Type<G> gType, Type<F2> newType) {
/* 149 */     return new TypedOptic<>(Cocartesian.Mu.TYPE_TOKEN, 
/*     */         
/* 151 */         DSL.or(fType, gType), 
/* 152 */         DSL.or(newType, gType), fType, newType, (Optic<?, Either<F, G>, Either<F2, G>, F, F2>)new Inj1());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <F, G, G2> TypedOptic<Either<F, G>, Either<F, G2>, G, G2> inj2(Type<F> fType, Type<G> gType, Type<G2> newType) {
/* 160 */     return new TypedOptic<>(Cocartesian.Mu.TYPE_TOKEN, 
/*     */         
/* 162 */         DSL.or(fType, gType), 
/* 163 */         DSL.or(fType, newType), gType, newType, (Optic<?, Either<F, G>, Either<F, G2>, G, G2>)new Inj2());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <K, V, K2> TypedOptic<List<Pair<K, V>>, List<Pair<K2, V>>, K, K2> compoundListKeys(Type<K> aType, Type<K2> bType, Type<V> valueType) {
/* 171 */     return new TypedOptic<>(TraversalP.Mu.TYPE_TOKEN, 
/*     */         
/* 173 */         (Type)DSL.compoundList(aType, valueType), 
/* 174 */         (Type)DSL.compoundList(bType, valueType), aType, bType, (new ListTraversal())
/*     */ 
/*     */         
/* 177 */         .compose((Optic)Optics.proj1()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static <K, V, V2> TypedOptic<List<Pair<K, V>>, List<Pair<K, V2>>, V, V2> compoundListElements(Type<K> keyType, Type<V> aType, Type<V2> bType) {
/* 182 */     return new TypedOptic<>(TraversalP.Mu.TYPE_TOKEN, 
/*     */         
/* 184 */         (Type)DSL.compoundList(keyType, aType), 
/* 185 */         (Type)DSL.compoundList(keyType, bType), aType, bType, (new ListTraversal())
/*     */ 
/*     */         
/* 188 */         .compose((Optic)Optics.proj2()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static <A, B> TypedOptic<List<A>, List<B>, A, B> list(Type<A> aType, Type<B> bType) {
/* 193 */     return new TypedOptic<>(TraversalP.Mu.TYPE_TOKEN, 
/*     */         
/* 195 */         (Type)DSL.list(aType), 
/* 196 */         (Type)DSL.list(bType), aType, bType, (Optic<?, List<A>, List<B>, A, B>)new ListTraversal());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <K, A, B> TypedOptic<Pair<K, ?>, Pair<K, ?>, A, B> tagged(TaggedChoice.TaggedChoiceType<K> sType, K key, Type<A> aType, Type<B> bType) {
/* 204 */     if (!Objects.equals(sType.types().get(key), aType)) {
/* 205 */       throw new IllegalArgumentException("Focused type doesn't match.");
/*     */     }
/* 207 */     Map<K, Type<?>> newTypes = Maps.newHashMap(sType.types());
/* 208 */     newTypes.put(key, bType);
/* 209 */     Type<Pair<K, ?>> pairType = DSL.taggedChoiceType(sType.getName(), sType.getKeyType(), newTypes);
/* 210 */     return new TypedOptic<>(Cocartesian.Mu.TYPE_TOKEN, (Type)sType, pairType, aType, bType, (Optic<?, Pair<K, ?>, Pair<K, ?>, A, B>)new InjTagged(key));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\TypedOptic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */