/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.reflect.TypeToken;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.functions.Functions;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.optics.profunctors.Cartesian;
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
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public final class Named
/*     */   implements TypeTemplate {
/*     */   private final String name;
/*     */   private final TypeTemplate element;
/*     */   
/*     */   public Named(String name, TypeTemplate element) {
/*  34 */     this.name = name;
/*  35 */     this.element = element;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  40 */     return this.element.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(TypeFamily family) {
/*  45 */     return index -> DSL.named(this.name, this.element.apply(family).apply(index));
/*     */   }
/*     */ 
/*     */   
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  50 */     return TypeFamily.familyOptic(i -> this.element.<A, B>applyO(input, aType, bType).apply(i));
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  55 */     return this.element.findFieldOrType(index, name, type, resultType);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  60 */     return index -> {
/*     */         RewriteResult<?, ?> elementResult = this.element.hmap(family, function).apply(index);
/*     */         return cap(family, index, elementResult);
/*     */       };
/*     */   }
/*     */   
/*     */   private <A> RewriteResult<Pair<String, A>, ?> cap(TypeFamily family, int index, RewriteResult<A, ?> elementResult) {
/*  67 */     return NamedType.fix((NamedType<A>)apply(family).apply(index), elementResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  72 */     if (this == obj) {
/*  73 */       return true;
/*     */     }
/*  75 */     if (!(obj instanceof Named)) {
/*  76 */       return false;
/*     */     }
/*  78 */     Named that = (Named)obj;
/*  79 */     return (Objects.equals(this.name, that.name) && Objects.equals(this.element, that.element));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  84 */     return Objects.hash(new Object[] { this.name, this.element });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  89 */     return "NamedTypeTag[" + this.name + ": " + this.element + "]";
/*     */   }
/*     */   
/*     */   public static final class NamedType<A> extends Type<Pair<String, A>> {
/*     */     protected final String name;
/*     */     protected final Type<A> element;
/*     */     
/*     */     public NamedType(String name, Type<A> element) {
/*  97 */       this.name = name;
/*  98 */       this.element = element;
/*     */     }
/*     */     
/*     */     public static <A, B> RewriteResult<Pair<String, A>, ?> fix(NamedType<A> type, RewriteResult<A, B> instance) {
/* 102 */       if (Objects.equals(instance.view().function(), Functions.id())) {
/* 103 */         return RewriteResult.nop(type);
/*     */       }
/* 105 */       return opticView(type, instance, wrapOptic(type.name, TypedOptic.adapter(instance.view().type(), instance.view().newType())));
/*     */     }
/*     */ 
/*     */     
/*     */     public RewriteResult<Pair<String, A>, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 110 */       RewriteResult<A, ?> elementView = this.element.rewriteOrNop(rule);
/* 111 */       return fix(this, elementView);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<Pair<String, A>, ?>> one(TypeRewriteRule rule) {
/* 116 */       Optional<RewriteResult<A, ?>> view = rule.rewrite(this.element);
/* 117 */       return view.map(instance -> fix(this, instance));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 122 */       return DSL.named(this.name, this.element.updateMu(newFamily));
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 127 */       return DSL.named(this.name, this.element.template());
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String name, int index) {
/* 132 */       return this.element.findChoiceType(name, index);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findCheckedType(int index) {
/* 137 */       return this.element.findCheckedType(index);
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<Pair<String, A>>> read(DynamicOps<T> ops, T input) {
/* 142 */       return this.element.read(ops, input).mapSecond(vo -> vo.map(()));
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, Pair<String, A> value) {
/* 147 */       if (!Objects.equals(value.getFirst(), this.name)) {
/* 148 */         throw new IllegalStateException("Named type name doesn't match: expected: " + this.name + ", got: " + (String)value.getFirst());
/*     */       }
/* 150 */       return (T)this.element.write(ops, rest, value.getSecond());
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 155 */       return "NamedType[\"" + this.name + "\", " + this.element + "]";
/*     */     }
/*     */     
/*     */     public String name() {
/* 159 */       return this.name;
/*     */     }
/*     */     
/*     */     public Type<A> element() {
/* 163 */       return this.element;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 168 */       if (this == obj) {
/* 169 */         return true;
/*     */       }
/* 171 */       if (!(obj instanceof NamedType)) {
/* 172 */         return false;
/*     */       }
/* 174 */       NamedType<?> other = (NamedType)obj;
/* 175 */       return (Objects.equals(this.name, other.name) && this.element.equals(other.element, ignoreRecursionPoints, checkIndex));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 180 */       return Objects.hash(new Object[] { this.name, this.element });
/*     */     }
/*     */     
/*     */     public <A2> NamedType<A2> map(Function<? super Type<A>, ? extends Type<A2>> function) {
/* 184 */       return new NamedType(this.name, function.apply(this.element));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 189 */       return this.element.findFieldTypeOpt(name);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Pair<String, A>> point(DynamicOps<?> ops) {
/* 194 */       return this.element.point(ops).map(value -> Pair.of(this.name, value));
/*     */     }
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<Pair<String, A>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 199 */       return this.element.findType(type, resultType, matcher, recurse).mapLeft(o -> wrapOptic(this.name, o));
/*     */     }
/*     */     
/*     */     protected static <A, B, FT, FR> TypedOptic<Pair<String, A>, Pair<String, B>, FT, FR> wrapOptic(String name, TypedOptic<A, B, FT, FR> optic) {
/* 203 */       ImmutableSet.Builder<TypeToken<? extends K1>> builder = ImmutableSet.builder();
/* 204 */       builder.addAll(optic.bounds());
/* 205 */       builder.add(Cartesian.Mu.TYPE_TOKEN);
/* 206 */       return new TypedOptic((Set)builder
/* 207 */           .build(), 
/* 208 */           DSL.named(name, optic.sType()), 
/* 209 */           DSL.named(name, optic.tType()), optic
/* 210 */           .aType(), optic
/* 211 */           .bType(), 
/* 212 */           Optics.proj2().composeUnchecked(optic.optic()));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\Named.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */