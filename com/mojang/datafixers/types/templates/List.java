/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.reflect.TypeToken;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.optics.ListTraversal;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.optics.profunctors.TraversalP;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.IntFunction;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public final class List
/*     */   implements TypeTemplate {
/*     */   private final TypeTemplate element;
/*     */   
/*     */   public List(TypeTemplate element) {
/*  36 */     this.element = element;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  41 */     return this.element.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(final TypeFamily family) {
/*  46 */     return new TypeFamily()
/*     */       {
/*     */         public Type<?> apply(int index) {
/*  49 */           return DSL.list(List.this.element.apply(family).apply(index));
/*     */         }
/*     */       };
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
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  66 */     return TypeFamily.familyOptic(i -> {
/*     */           OpticParts<A, B> pair = this.element.<A, B>applyO(input, aType, bType).apply(i);
/*     */           Set<TypeToken<? extends K1>> bounds = Sets.newHashSet(pair.bounds());
/*     */           bounds.add(TraversalP.Mu.TYPE_TOKEN);
/*     */           return new OpticParts(bounds, cap(pair.optic()));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private <S, T, A, B> Optic<?, ?, ?, A, B> cap(Optic<?, S, T, A, B> concreteOptic) {
/*  77 */     return (new ListTraversal()).composeUnchecked(concreteOptic);
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  82 */     return this.element.<FT, FR>findFieldOrType(index, name, type, resultType).mapLeft(List::new);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  87 */     return i -> {
/*     */         RewriteResult<?, ?> view = this.element.hmap(family, function).apply(i);
/*     */         return cap(apply(family).apply(i), view);
/*     */       };
/*     */   }
/*     */   
/*     */   private <E> RewriteResult<?, ?> cap(Type<?> type, RewriteResult<E, ?> view) {
/*  94 */     return ((ListType)type).fix(view);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  99 */     return (obj instanceof List && Objects.equals(this.element, ((List)obj).element));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 104 */     return Objects.hash(new Object[] { this.element });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 109 */     return "List[" + this.element + "]";
/*     */   }
/*     */   
/*     */   public static final class ListType<A> extends Type<java.util.List<A>> {
/*     */     protected final Type<A> element;
/*     */     
/*     */     public ListType(Type<A> element) {
/* 116 */       this.element = element;
/*     */     }
/*     */ 
/*     */     
/*     */     public RewriteResult<java.util.List<A>, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 121 */       RewriteResult<A, ?> view = this.element.rewriteOrNop(rule);
/* 122 */       return fix(view);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<java.util.List<A>, ?>> one(TypeRewriteRule rule) {
/* 127 */       return rule.rewrite(this.element).map(this::fix);
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 132 */       return DSL.list(this.element.updateMu(newFamily));
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 137 */       return DSL.list(this.element.template());
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<java.util.List<A>> point(DynamicOps<?> ops) {
/* 142 */       return (Optional)Optional.of(ImmutableList.of());
/*     */     }
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<java.util.List<A>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 147 */       Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> firstFieldLens = this.element.findType(type, resultType, matcher, recurse);
/* 148 */       return firstFieldLens.mapLeft(this::capLeft);
/*     */     }
/*     */     
/*     */     private <FT, FR, B> TypedOptic<java.util.List<A>, ?, FT, FR> capLeft(TypedOptic<A, B, FT, FR> optic) {
/* 152 */       return TypedOptic.list(optic.sType(), optic.tType()).compose(optic);
/*     */     }
/*     */     
/*     */     public <B> RewriteResult<java.util.List<A>, ?> fix(RewriteResult<A, B> view) {
/* 156 */       return opticView(this, view, TypedOptic.list(this.element, view.view().newType()));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<java.util.List<A>>> read(DynamicOps<T> ops, T input) {
/* 162 */       return ops.getStream(input).map(stream -> {
/*     */             java.util.List<Optional<A>> list = (java.util.List<Optional<A>>)stream.map(()).collect(Collectors.toList());
/*     */ 
/*     */ 
/*     */             
/*     */             return list.stream().anyMatch(()) ? Pair.of(input, Optional.empty()) : Pair.of(ops.empty(), Optional.of(list.stream().map(Optional::get).collect(Collectors.toList())));
/* 168 */           }).orElseGet(() -> Pair.of(input, Optional.empty()));
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, java.util.List<A> value) {
/* 173 */       return (T)ops.merge(rest, ops.createList(value.stream().map(a -> this.element.write(ops, ops.empty(), a))));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 178 */       return "List[" + this.element + "]";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 183 */       return (obj instanceof ListType && this.element.equals(((ListType)obj).element, ignoreRecursionPoints, checkIndex));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 188 */       return this.element.hashCode();
/*     */     }
/*     */     
/*     */     public Type<A> getElement() {
/* 192 */       return this.element;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\List.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */