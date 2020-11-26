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
/*     */ import com.mojang.datafixers.functions.PointFreeRule;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.BitSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.IntFunction;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ObjectUtils;
/*     */ 
/*     */ public final class RecursivePoint
/*     */   implements TypeTemplate
/*     */ {
/*     */   private final int index;
/*     */   
/*     */   public RecursivePoint(int index) {
/*  32 */     this.index = index;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  37 */     return this.index + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(TypeFamily family) {
/*  42 */     final Type<?> result = family.apply(this.index);
/*  43 */     return new TypeFamily()
/*     */       {
/*     */         public Type<?> apply(int index) {
/*  46 */           return result;
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
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  59 */     return TypeFamily.familyOptic(i -> input.apply(this.index));
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  64 */     return Either.right(new Type.FieldNotFoundException("Recursion point"));
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  69 */     return i -> {
/*     */         RewriteResult<?, ?> result = function.apply(this.index);
/*     */         return cap(family, result);
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public <S, T> RewriteResult<S, T> cap(TypeFamily family, RewriteResult<S, T> result) {
/*  77 */     Type<?> sourceType = family.apply(this.index);
/*  78 */     if (!(sourceType instanceof RecursivePointType)) {
/*  79 */       throw new IllegalArgumentException("Type error: Recursive point template template got a non-recursice type as an input.");
/*     */     }
/*  81 */     if (!Objects.equals(result.view().type(), ((RecursivePointType)sourceType).unfold())) {
/*  82 */       throw new IllegalArgumentException("Type error: hmap function input type");
/*     */     }
/*  84 */     RecursivePointType<S> sType = (RecursivePointType)sourceType;
/*  85 */     RecursivePointType<T> tType = sType.family().buildMuType(result.view().newType(), null);
/*  86 */     BitSet bitSet = (BitSet)ObjectUtils.clone(result.recData());
/*  87 */     bitSet.set(this.index);
/*  88 */     return RewriteResult.create(View.create(sType, tType, result.view().function()), bitSet);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  93 */     return (obj instanceof RecursivePoint && this.index == ((RecursivePoint)obj).index);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  98 */     return Objects.hash(new Object[] { Integer.valueOf(this.index) });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     return "Id[" + this.index + "]";
/*     */   }
/*     */   
/*     */   public int index() {
/* 107 */     return this.index;
/*     */   }
/*     */   
/*     */   public static final class RecursivePointType<A> extends Type<A> {
/*     */     private final RecursiveTypeFamily family;
/*     */     private final int index;
/*     */     private final Supplier<Type<A>> delegate;
/*     */     @Nullable
/*     */     private volatile Type<A> type;
/*     */     
/*     */     public RecursivePointType(RecursiveTypeFamily family, int index, Supplier<Type<A>> delegate) {
/* 118 */       this.family = family;
/* 119 */       this.index = index;
/* 120 */       this.delegate = delegate;
/*     */     }
/*     */     
/*     */     public RecursiveTypeFamily family() {
/* 124 */       return this.family;
/*     */     }
/*     */     
/*     */     public int index() {
/* 128 */       return this.index;
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<A> unfold() {
/* 133 */       if (this.type == null) {
/* 134 */         this.type = this.delegate.get();
/*     */       }
/* 136 */       return this.type;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<A>> read(DynamicOps<T> ops, T input) {
/* 141 */       return unfold().read(ops, input);
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, A value) {
/* 146 */       return (T)unfold().write(ops, rest, value);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public RewriteResult<A, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 152 */       return unfold().all(rule, recurse, checkIndex);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<A, ?>> one(TypeRewriteRule rule) {
/* 157 */       return unfold().one(rule);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<A, ?>> everywhere(TypeRewriteRule rule, PointFreeRule optimizationRule, boolean recurse, boolean checkIndex) {
/* 162 */       if (recurse) {
/* 163 */         return this.family.everywhere(this.index, rule, optimizationRule).map(view -> view);
/*     */       }
/* 165 */       return Optional.of(RewriteResult.nop(this));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 170 */       return newFamily.apply(this.index);
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 175 */       return DSL.id(this.index);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String name, int index) {
/* 180 */       return unfold().findChoiceType(name, this.index);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findCheckedType(int index) {
/* 185 */       return unfold().findCheckedType(this.index);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 190 */       return unfold().findFieldTypeOpt(name);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<A> point(DynamicOps<?> ops) {
/* 195 */       return unfold().point(ops);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 205 */       return this.family.findType(this.index, type, resultType, matcher, recurse).mapLeft(o -> {
/*     */             if (!Objects.equals(this, o.sType())) {
/*     */               throw new IllegalStateException(":/");
/*     */             }
/*     */             return o;
/*     */           });
/*     */     }
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
/*     */     private <B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(TypedOptic<A, B, FT, FR> optic) {
/* 223 */       return new TypedOptic(optic
/* 224 */           .bounds(), this, optic
/*     */           
/* 226 */           .tType(), optic
/* 227 */           .aType(), optic
/* 228 */           .bType(), optic
/* 229 */           .optic());
/*     */     }
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
/*     */     public String toString() {
/* 256 */       return "MuType[" + this.family.name() + "_" + this.index + "]";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 261 */       if (!(obj instanceof RecursivePointType)) {
/* 262 */         return false;
/*     */       }
/* 264 */       RecursivePointType<?> type = (RecursivePointType)obj;
/* 265 */       return ((ignoreRecursionPoints || Objects.equals(this.family, type.family)) && this.index == type.index);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 270 */       return Objects.hash(new Object[] { this.family, Integer.valueOf(this.index) });
/*     */     }
/*     */     
/*     */     public View<A, A> in() {
/* 274 */       return View.create(unfold(), this, Functions.in(this));
/*     */     }
/*     */     
/*     */     public View<A, A> out() {
/* 278 */       return View.create(this, unfold(), Functions.out(this));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\RecursivePoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */