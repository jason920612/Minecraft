/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.functions.Functions;
/*     */ import com.mojang.datafixers.functions.PointFreeRule;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.IntFunction;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public final class Check
/*     */   implements TypeTemplate
/*     */ {
/*     */   private final String name;
/*     */   private final int index;
/*     */   private final TypeTemplate element;
/*     */   
/*     */   public Check(String name, int index, TypeTemplate element) {
/*  30 */     this.name = name;
/*  31 */     this.index = index;
/*  32 */     this.element = element;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  37 */     return Math.max(this.index + 1, this.element.size());
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(final TypeFamily family) {
/*  42 */     return new TypeFamily()
/*     */       {
/*     */         public Type<?> apply(int index) {
/*  45 */           if (index < 0) {
/*  46 */             throw new IndexOutOfBoundsException();
/*     */           }
/*  48 */           return new Check.CheckType(Check.this.name, index, Check.this.index, Check.this.element.apply(family).apply(index));
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
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  63 */     return TypeFamily.familyOptic(i -> this.element.<A, B>applyO(input, aType, bType).apply(i));
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  68 */     if (index == this.index) {
/*  69 */       return this.element.findFieldOrType(index, name, type, resultType);
/*     */     }
/*  71 */     return Either.right(new Type.FieldNotFoundException("Not a matching index"));
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  76 */     return index -> {
/*     */         RewriteResult<?, ?> elementResult = this.element.hmap(family, function).apply(index);
/*     */         return cap(family, index, elementResult);
/*     */       };
/*     */   }
/*     */   
/*     */   private <A> RewriteResult<?, ?> cap(TypeFamily family, int index, RewriteResult<A, ?> elementResult) {
/*  83 */     return CheckType.fix((CheckType)apply(family).apply(index), elementResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  88 */     if (this == obj) {
/*  89 */       return true;
/*     */     }
/*  91 */     if (!(obj instanceof Check)) {
/*  92 */       return false;
/*     */     }
/*  94 */     Check that = (Check)obj;
/*  95 */     return (Objects.equals(this.name, that.name) && this.index == that.index && Objects.equals(this.element, that.element));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 100 */     return Objects.hash(new Object[] { this.name, Integer.valueOf(this.index), this.element });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 105 */     return "Tag[" + this.name + ", " + this.index + ": " + this.element + "]";
/*     */   }
/*     */   
/*     */   public static final class CheckType<A> extends Type<A> {
/*     */     private final String name;
/*     */     private final int index;
/*     */     private final int expectedIndex;
/*     */     private final Type<A> delegate;
/*     */     
/*     */     public CheckType(String name, int index, int expectedIndex, Type<A> delegate) {
/* 115 */       this.name = name;
/* 116 */       this.index = index;
/* 117 */       this.expectedIndex = expectedIndex;
/* 118 */       this.delegate = delegate;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<A>> read(DynamicOps<T> ops, T input) {
/* 123 */       if (this.index != this.expectedIndex) {
/* 124 */         return Pair.of(input, Optional.empty());
/*     */       }
/* 126 */       return this.delegate.read(ops, input);
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, A value) {
/* 131 */       return (T)this.delegate.write(ops, rest, value);
/*     */     }
/*     */     
/*     */     public static <A, B> RewriteResult<A, ?> fix(CheckType<A> type, RewriteResult<A, B> instance) {
/* 135 */       if (Objects.equals(instance.view().function(), Functions.id())) {
/* 136 */         return RewriteResult.nop(type);
/*     */       }
/* 138 */       return opticView(type, instance, wrapOptic(type, TypedOptic.adapter(instance.view().type(), instance.view().newType())));
/*     */     }
/*     */ 
/*     */     
/*     */     public RewriteResult<A, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 143 */       if (checkIndex && this.index != this.expectedIndex) {
/* 144 */         return RewriteResult.nop(this);
/*     */       }
/* 146 */       return fix(this, this.delegate.rewriteOrNop(rule));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<A, ?>> everywhere(TypeRewriteRule rule, PointFreeRule optimizationRule, boolean recurse, boolean checkIndex) {
/* 151 */       if (checkIndex && this.index != this.expectedIndex) {
/* 152 */         return Optional.empty();
/*     */       }
/* 154 */       return super.everywhere(rule, optimizationRule, recurse, checkIndex);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<A, ?>> one(TypeRewriteRule rule) {
/* 159 */       return rule.rewrite(this.delegate).map(view -> fix(this, view));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 164 */       return new CheckType(this.name, this.index, this.expectedIndex, this.delegate.updateMu(newFamily));
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 169 */       return DSL.check(this.name, this.expectedIndex, this.delegate.template());
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String name, int index) {
/* 174 */       if (index == this.expectedIndex) {
/* 175 */         return this.delegate.findChoiceType(name, index);
/*     */       }
/* 177 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findCheckedType(int index) {
/* 182 */       if (index == this.expectedIndex) {
/* 183 */         return Optional.of(this.delegate);
/*     */       }
/* 185 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 190 */       if (this.index == this.expectedIndex) {
/* 191 */         return this.delegate.findFieldTypeOpt(name);
/*     */       }
/* 193 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<A> point(DynamicOps<?> ops) {
/* 198 */       if (this.index == this.expectedIndex) {
/* 199 */         return this.delegate.point(ops);
/*     */       }
/* 201 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 206 */       if (this.index != this.expectedIndex) {
/* 207 */         return Either.right(new Type.FieldNotFoundException("Incorrect index in CheckType"));
/*     */       }
/* 209 */       return this.delegate.findType(type, resultType, matcher, recurse).mapLeft(optic -> wrapOptic(this, optic));
/*     */     }
/*     */     
/*     */     protected static <A, B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(CheckType<A> type, TypedOptic<A, B, FT, FR> optic) {
/* 213 */       return new TypedOptic(optic
/* 214 */           .bounds(), type, new CheckType(type.name, type.index, type.expectedIndex, optic
/*     */             
/* 216 */             .tType()), optic
/* 217 */           .aType(), optic
/* 218 */           .bType(), optic
/* 219 */           .optic());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 225 */       return "TypeTag[" + this.index + "~" + this.expectedIndex + "][" + this.name + ": " + this.delegate + "]";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 230 */       if (!(obj instanceof CheckType)) {
/* 231 */         return false;
/*     */       }
/* 233 */       CheckType<?> type = (CheckType)obj;
/* 234 */       if (this.index == type.index && this.expectedIndex == type.expectedIndex) {
/* 235 */         if (!checkIndex) {
/* 236 */           return true;
/*     */         }
/* 238 */         if (this.delegate.equals(type.delegate, ignoreRecursionPoints, checkIndex)) {
/* 239 */           return true;
/*     */         }
/*     */       } 
/* 242 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 247 */       return Objects.hash(new Object[] { Integer.valueOf(this.index), Integer.valueOf(this.expectedIndex), this.delegate });
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\Check.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */