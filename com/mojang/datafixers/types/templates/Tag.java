/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.View;
/*     */ import com.mojang.datafixers.functions.Functions;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.IntFunction;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public final class Tag
/*     */   implements TypeTemplate
/*     */ {
/*     */   private final String name;
/*     */   private final TypeTemplate element;
/*     */   
/*     */   public Tag(String name, TypeTemplate element) {
/*  32 */     this.name = name;
/*  33 */     this.element = element;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  38 */     return this.element.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(final TypeFamily family) {
/*  43 */     return new TypeFamily()
/*     */       {
/*     */         public Type<?> apply(int index) {
/*  46 */           return DSL.field(Tag.this.name, Tag.this.element.apply(family).apply(index));
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
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  76 */     return TypeFamily.familyOptic(i -> this.element.<A, B>applyO(input, aType, bType).apply(i));
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  81 */     if (!Objects.equals(name, this.name)) {
/*  82 */       return Either.right(new Type.FieldNotFoundException("Names don't match"));
/*     */     }
/*  84 */     if (this.element instanceof Const) {
/*  85 */       Const c = (Const)this.element;
/*  86 */       if (Objects.equals(type, c.type())) {
/*  87 */         return Either.left(new Tag(name, new Const(resultType)));
/*     */       }
/*  89 */       return Either.right(new Type.FieldNotFoundException("don't match"));
/*     */     } 
/*     */     
/*  92 */     if (Objects.equals(type, resultType)) {
/*  93 */       return Either.left(this);
/*     */     }
/*  95 */     if (type instanceof RecursivePoint.RecursivePointType && this.element instanceof RecursivePoint && (
/*  96 */       (RecursivePoint)this.element).index() == ((RecursivePoint.RecursivePointType)type).index()) {
/*  97 */       if (resultType instanceof RecursivePoint.RecursivePointType) {
/*  98 */         if (((RecursivePoint.RecursivePointType)resultType).index() == ((RecursivePoint)this.element).index()) {
/*  99 */           return Either.left(this);
/*     */         }
/*     */       } else {
/* 102 */         return Either.left(DSL.constType(resultType));
/*     */       } 
/*     */     }
/*     */     
/* 106 */     return Either.right(new Type.FieldNotFoundException("Recursive field"));
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/* 111 */     return this.element.hmap(family, function);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 116 */     if (this == obj) {
/* 117 */       return true;
/*     */     }
/* 119 */     if (!(obj instanceof Tag)) {
/* 120 */       return false;
/*     */     }
/* 122 */     Tag that = (Tag)obj;
/* 123 */     return (Objects.equals(this.name, that.name) && Objects.equals(this.element, that.element));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 128 */     return Objects.hash(new Object[] { this.name, this.element });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 133 */     return "NameTag[" + this.name + ": " + this.element + "]";
/*     */   }
/*     */   
/*     */   public static final class TagType<A> extends Type<A> {
/*     */     protected final String name;
/*     */     protected final Type<A> element;
/*     */     
/*     */     public TagType(String name, Type<A> element) {
/* 141 */       this.name = name;
/* 142 */       this.element = element;
/*     */     }
/*     */ 
/*     */     
/*     */     public RewriteResult<A, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 147 */       RewriteResult<A, ?> elementView = this.element.rewriteOrNop(rule);
/* 148 */       return RewriteResult.create(cap(elementView.view()), elementView.recData());
/*     */     }
/*     */     
/*     */     private <B> View<A, ?> cap(View<A, B> instance) {
/* 152 */       if (Objects.equals(instance.function(), Functions.id())) {
/* 153 */         return View.nopView(this);
/*     */       }
/* 155 */       return View.create(this, DSL.field(this.name, instance.newType()), instance.function());
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<A, ?>> one(TypeRewriteRule rule) {
/* 160 */       Optional<RewriteResult<A, ?>> view = rule.rewrite(this.element);
/* 161 */       return view.map(instance -> RewriteResult.create(cap(instance.view()), instance.recData()));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 166 */       return DSL.field(this.name, this.element.updateMu(newFamily));
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 171 */       return DSL.field(this.name, this.element.template());
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<A>> read(DynamicOps<T> ops, T input) {
/* 176 */       Optional<Map<T, T>> map = ops.getMapValues(input);
/* 177 */       T nameObject = (T)ops.createString(this.name);
/*     */       T elementValue;
/* 179 */       if (map.isPresent() && (elementValue = (T)((Map)map.get()).get(nameObject)) != null) {
/* 180 */         Optional<A> value = (Optional<A>)this.element.read(ops, elementValue).getSecond();
/* 181 */         if (value.isPresent()) {
/* 182 */           return Pair.of(ops.createMap((Map)((Map)map.get()).entrySet().stream().filter(e -> !Objects.equals(e.getKey(), nameObject)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))), value);
/*     */         }
/*     */       } 
/* 185 */       return Pair.of(input, Optional.empty());
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, A value) {
/* 190 */       return (T)ops.mergeInto(rest, ops.createString(this.name), this.element.write(ops, ops.empty(), value));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 195 */       return "Tag[\"" + this.name + "\", " + this.element + "]";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 200 */       if (this == o) {
/* 201 */         return true;
/*     */       }
/* 203 */       if (o == null || getClass() != o.getClass()) {
/* 204 */         return false;
/*     */       }
/* 206 */       TagType<?> tagType = (TagType)o;
/* 207 */       return (Objects.equals(this.name, tagType.name) && this.element.equals(tagType.element, ignoreRecursionPoints, checkIndex));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 212 */       return Objects.hash(new Object[] { this.name, this.element });
/*     */     }
/*     */     
/*     */     public <A2> TagType<A2> map(Function<? super Type<A>, ? extends Type<A2>> function) {
/* 216 */       return new TagType(this.name, function.apply(this.element));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 221 */       if (Objects.equals(name, this.name)) {
/* 222 */         return Optional.of(this.element);
/*     */       }
/* 224 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<A> point(DynamicOps<?> ops) {
/* 229 */       return this.element.point(ops);
/*     */     }
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 234 */       return this.element.findType(type, resultType, matcher, recurse).mapLeft(this::wrapOptic);
/*     */     }
/*     */     
/*     */     private <B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(TypedOptic<A, B, FT, FR> optic) {
/* 238 */       return new TypedOptic(optic
/* 239 */           .bounds(), 
/* 240 */           DSL.field(this.name, optic.sType()), 
/* 241 */           DSL.field(this.name, optic.tType()), optic
/* 242 */           .aType(), optic
/* 243 */           .bType(), optic
/* 244 */           .optic());
/*     */     }
/*     */ 
/*     */     
/*     */     public String name() {
/* 249 */       return this.name;
/*     */     }
/*     */     
/*     */     public Type<A> element() {
/* 253 */       return this.element;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\Tag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */