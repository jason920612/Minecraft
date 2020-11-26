/*     */ package com.mojang.datafixers.types;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.FieldFinder;
/*     */ import com.mojang.datafixers.FunctionType;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.View;
/*     */ import com.mojang.datafixers.functions.Functions;
/*     */ import com.mojang.datafixers.functions.PointFreeRule;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.atomic.AtomicReference;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.tuple.Triple;
/*     */ 
/*     */ public abstract class Type<A> implements App<Type.Mu, A> {
/*  36 */   private static final Map<Triple<Type<?>, TypeRewriteRule, PointFreeRule>, CompletableFuture<Optional<? extends RewriteResult<?, ?>>>> PENDING_REWRITE_CACHE = Maps.newConcurrentMap();
/*  37 */   private static final Map<Triple<Type<?>, TypeRewriteRule, PointFreeRule>, Optional<? extends RewriteResult<?, ?>>> REWRITE_CACHE = Maps.newConcurrentMap();
/*     */   @Nullable
/*     */   private TypeTemplate template;
/*     */   
/*     */   public static <A> Type<A> unbox(App<Mu, A> box) {
/*  42 */     return (Type)box;
/*     */   }
/*     */   
/*     */   public static class Mu
/*     */     implements K1 {}
/*     */   
/*     */   public RewriteResult<A, ?> rewriteOrNop(TypeRewriteRule rule) {
/*  49 */     return (RewriteResult<A, ?>)DataFixUtils.orElseGet(rule.rewrite(this), () -> RewriteResult.nop(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public static <S, T, A, B> RewriteResult<S, T> opticView(Type<S> type, RewriteResult<A, B> view, TypedOptic<S, T, A, B> optic) {
/*  54 */     if (Objects.equals(view.view().function(), Functions.id())) {
/*  55 */       return RewriteResult.nop(type);
/*     */     }
/*     */     
/*  58 */     return RewriteResult.create(View.create(optic
/*  59 */           .sType(), optic
/*  60 */           .tType(), 
/*  61 */           Functions.app(
/*  62 */             Functions.profunctorTransformer((Optic)optic.upCast(FunctionType.Instance.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)), view
/*  63 */             .view().function(), 
/*  64 */             DSL.func(optic.aType(), view.view().newType()))), view
/*  65 */         .recData());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RewriteResult<A, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/*  73 */     return RewriteResult.nop(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<RewriteResult<A, ?>> one(TypeRewriteRule rule) {
/*  80 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public Optional<RewriteResult<A, ?>> everywhere(TypeRewriteRule rule, PointFreeRule optimizationRule, boolean recurse, boolean checkIndex) {
/*  84 */     TypeRewriteRule rule2 = TypeRewriteRule.seq(TypeRewriteRule.orElse(rule, TypeRewriteRule::nop), TypeRewriteRule.all(TypeRewriteRule.everywhere(rule, optimizationRule, recurse, checkIndex), recurse, checkIndex));
/*  85 */     return rewrite(rule2, optimizationRule);
/*     */   }
/*     */   
/*     */   public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/*  89 */     return this;
/*     */   }
/*     */   
/*     */   public TypeTemplate template() {
/*  93 */     if (this.template == null) {
/*  94 */       this.template = buildTemplate();
/*     */     }
/*  96 */     return this.template;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String name, int index) {
/* 102 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public Optional<Type<?>> findCheckedType(int index) {
/* 106 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public final <T> Pair<Dynamic<T>, Optional<A>> read(Dynamic<T> input) {
/* 110 */     return read(input.getOps(), (T)input.getValue()).mapFirst(v -> new Dynamic(input.getOps(), v));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final <T> T write(DynamicOps<T> ops, A value) {
/* 118 */     return write(ops, ops.empty(), value);
/*     */   }
/*     */   
/*     */   public final <T> Dynamic<T> writeDynamic(DynamicOps<T> ops, T rest, A value) {
/* 122 */     return new Dynamic(ops, write(ops, rest, value));
/*     */   }
/*     */   
/*     */   public final <T> Dynamic<T> writeDynamic(DynamicOps<T> ops, A value) {
/* 126 */     return new Dynamic(ops, write(ops, value));
/*     */   }
/*     */   
/*     */   public <T> Pair<T, Optional<Typed<A>>> readTyped(Dynamic<T> input) {
/* 130 */     return readTyped(input.getOps(), (T)input.getValue());
/*     */   }
/*     */   
/*     */   public <T> Pair<T, Optional<Typed<A>>> readTyped(DynamicOps<T> ops, T input) {
/* 134 */     return read(ops, input).mapSecond(vo -> vo.map(()));
/*     */   }
/*     */   
/*     */   public <T> Pair<T, Optional<?>> read(DynamicOps<T> ops, TypeRewriteRule rule, PointFreeRule fRule, T input) {
/* 138 */     return read(ops, input).mapSecond(vo -> vo.map(()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> Optional<T> readAndWrite(DynamicOps<T> ops, Type<?> expectedType, TypeRewriteRule rule, PointFreeRule fRule, T input) {
/* 145 */     Pair<T, Optional<A>> po = read(ops, input);
/* 146 */     return ((Optional)po.getSecond()).flatMap(v -> rewrite(rule, fRule).map(()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T, B> T capWrite(DynamicOps<T> ops, Type<?> expectedType, T rest, A value, View<A, B> f) {
/* 154 */     if (!expectedType.equals(f.newType(), true, true)) {
/* 155 */       throw new IllegalStateException("Rewritten type doesn't match.");
/*     */     }
/* 157 */     return (T)f.newType().write(ops, rest, ((Function)f.function().evalCached().apply(ops)).apply(value));
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<RewriteResult<A, ?>> rewrite(TypeRewriteRule rule, PointFreeRule fRule) {
/* 162 */     Triple<Type<?>, TypeRewriteRule, PointFreeRule> key = Triple.of(this, rule, fRule);
/*     */ 
/*     */ 
/*     */     
/* 166 */     Optional<? extends RewriteResult<?, ?>> rewrite = REWRITE_CACHE.get(key);
/* 167 */     if (rewrite != null) {
/* 168 */       return (Optional)rewrite;
/*     */     }
/* 170 */     AtomicReference<CompletableFuture<Optional<? extends RewriteResult<?, ?>>>> ref = new AtomicReference<>();
/*     */     
/* 172 */     CompletableFuture<Optional<? extends RewriteResult<?, ?>>> pending = PENDING_REWRITE_CACHE.computeIfAbsent(key, k -> {
/*     */           CompletableFuture<Optional<? extends RewriteResult<?, ?>>> value = new CompletableFuture<>();
/*     */           
/*     */           ref.set(value);
/*     */           return value;
/*     */         });
/* 178 */     if (ref.get() != null) {
/* 179 */       Optional<RewriteResult<A, ?>> result = rule.rewrite(this).flatMap(r -> r.view().rewrite(fRule).map(()));
/* 180 */       REWRITE_CACHE.put(key, result);
/* 181 */       pending.complete(result);
/* 182 */       PENDING_REWRITE_CACHE.remove(key);
/* 183 */       return result;
/*     */     } 
/* 185 */     return (Optional<RewriteResult<A, ?>>)pending.join();
/*     */   }
/*     */   
/*     */   public <FT, FR> Type<?> getSetType(OpticFinder<FT> optic, Type<FR> newType) {
/* 189 */     return ((TypedOptic)optic.findType(this, newType, false).orThrow()).tType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 198 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public Type<?> findFieldType(String name) {
/* 202 */     return findFieldTypeOpt(name).<Throwable>orElseThrow(() -> new IllegalArgumentException("Field not found: " + name));
/*     */   }
/*     */   
/*     */   public OpticFinder<?> findField(String name) {
/* 206 */     return (OpticFinder<?>)new FieldFinder(name, findFieldType(name));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<A> point(DynamicOps<?> ops) {
/* 214 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public Optional<Typed<A>> pointTyped(DynamicOps<?> ops) {
/* 218 */     return point(ops).map(value -> new Typed(this, ops, value));
/*     */   }
/*     */   
/*     */   public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, FieldNotFoundException> findTypeCached(Type<FT> type, Type<FR> resultType, TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 222 */     return findType(type, resultType, matcher, recurse);
/*     */   }
/*     */   
/*     */   public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, FieldNotFoundException> findType(Type<FT> type, Type<FR> resultType, TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 226 */     return (Either<TypedOptic<A, ?, FT, FR>, FieldNotFoundException>)matcher.<S>match(this).map(Either::left, r -> (r instanceof Continue) ? findTypeInChildren(type, resultType, matcher, recurse) : Either.right(r));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 235 */     return Either.right(new FieldNotFoundException("No more children"));
/*     */   }
/*     */   
/*     */   public OpticFinder<A> finder() {
/* 239 */     return DSL.typeFinder(this);
/*     */   }
/*     */   public abstract TypeTemplate buildTemplate();
/*     */   public <B> Optional<A> ifSame(Typed<B> value) {
/* 243 */     return ifSame(value.getType(), value.getValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public <B> Optional<A> ifSame(Type<B> type, B value) {
/* 248 */     if (equals(type, true, true)) {
/* 249 */       return Optional.of((A)value);
/*     */     }
/* 251 */     return Optional.empty();
/*     */   }
/*     */   public abstract <T> Pair<T, Optional<A>> read(DynamicOps<T> paramDynamicOps, T paramT);
/*     */   
/*     */   public <B> Optional<RewriteResult<A, ?>> ifSame(Type<B> type, RewriteResult<B, ?> value) {
/* 256 */     if (equals(type, true, true)) {
/* 257 */       return Optional.of(value);
/*     */     }
/* 259 */     return Optional.empty();
/*     */   }
/*     */   public abstract <T> T write(DynamicOps<T> paramDynamicOps, T paramT, A paramA);
/*     */   
/*     */   public final boolean equals(Object o) {
/* 264 */     if (this == o) {
/* 265 */       return true;
/*     */     }
/* 267 */     return equals(o, false, true);
/*     */   }
/*     */   
/*     */   public abstract boolean equals(Object paramObject, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   public static interface TypeMatcher<FT, FR> {
/*     */     <S> Either<TypedOptic<S, ?, FT, FR>, Type.FieldNotFoundException> match(Type<S> param1Type); }
/*     */   
/*     */   public static abstract class TypeError { public TypeError(String message) {
/* 276 */       this.message = message;
/*     */     }
/*     */     private final String message;
/*     */     
/*     */     public String toString() {
/* 281 */       return this.message;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class FieldNotFoundException extends TypeError {
/*     */     public FieldNotFoundException(String message) {
/* 287 */       super(message);
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class Continue extends FieldNotFoundException {
/*     */     public Continue() {
/* 293 */       super("Continue");
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\Type.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */