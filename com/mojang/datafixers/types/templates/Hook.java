/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.functions.Functions;
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
/*     */ public final class Hook
/*     */   implements TypeTemplate
/*     */ {
/*     */   private final TypeTemplate element;
/*     */   private final HookFunction preRead;
/*     */   private final HookFunction postWrite;
/*     */   
/*     */   public Hook(TypeTemplate element, HookFunction preRead, HookFunction postWrite) {
/*  29 */     this.element = element;
/*  30 */     this.preRead = preRead;
/*  31 */     this.postWrite = postWrite;
/*     */   }
/*     */   
/*     */   public static interface HookFunction {
/*  35 */     public static final HookFunction IDENTITY = new HookFunction()
/*     */       {
/*     */         public <T> T apply(DynamicOps<T> ops, T value) {
/*  38 */           return value;
/*     */         }
/*     */       };
/*     */ 
/*     */     
/*     */     <T> T apply(DynamicOps<T> param1DynamicOps, T param1T);
/*     */   }
/*     */   
/*     */   public int size() {
/*  47 */     return this.element.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(TypeFamily family) {
/*  52 */     return index -> DSL.hook(this.element.apply(family).apply(index), this.preRead, this.postWrite);
/*     */   }
/*     */ 
/*     */   
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  57 */     return TypeFamily.familyOptic(i -> this.element.<A, B>applyO(input, aType, bType).apply(i));
/*     */   }
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  62 */     return this.element.findFieldOrType(index, name, type, resultType);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  67 */     return index -> {
/*     */         RewriteResult<?, ?> elementResult = this.element.hmap(family, function).apply(index);
/*     */         return cap(family, index, elementResult);
/*     */       };
/*     */   }
/*     */   
/*     */   private <A> RewriteResult<A, ?> cap(TypeFamily family, int index, RewriteResult<A, ?> elementResult) {
/*  74 */     return HookType.fix((HookType<A>)apply(family).apply(index), elementResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  79 */     if (this == obj) {
/*  80 */       return true;
/*     */     }
/*  82 */     if (!(obj instanceof Hook)) {
/*  83 */       return false;
/*     */     }
/*  85 */     Hook that = (Hook)obj;
/*  86 */     return (Objects.equals(this.element, that.element) && Objects.equals(this.preRead, that.preRead) && Objects.equals(this.postWrite, that.postWrite));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  91 */     return Objects.hash(new Object[] { this.element, this.preRead, this.postWrite });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  96 */     return "Hook[" + this.element + ", " + this.preRead + ", " + this.postWrite + "]";
/*     */   }
/*     */   
/*     */   public static final class HookType<A> extends Type<A> {
/*     */     private final Type<A> delegate;
/*     */     private final Hook.HookFunction preRead;
/*     */     private final Hook.HookFunction postWrite;
/*     */     
/*     */     public HookType(Type<A> delegate, Hook.HookFunction preRead, Hook.HookFunction postWrite) {
/* 105 */       this.delegate = delegate;
/* 106 */       this.preRead = preRead;
/* 107 */       this.postWrite = postWrite;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Pair<T, Optional<A>> read(DynamicOps<T> ops, T input) {
/* 112 */       return this.delegate.read(ops, this.preRead.apply(ops, input));
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T write(DynamicOps<T> ops, T rest, A value) {
/* 117 */       return this.postWrite.apply(ops, (T)this.delegate.write(ops, rest, value));
/*     */     }
/*     */ 
/*     */     
/*     */     public RewriteResult<A, ?> all(TypeRewriteRule rule, boolean recurse, boolean checkIndex) {
/* 122 */       return fix(this, this.delegate.rewriteOrNop(rule));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<RewriteResult<A, ?>> one(TypeRewriteRule rule) {
/* 127 */       return rule.rewrite(this.delegate).map(view -> fix(this, view));
/*     */     }
/*     */ 
/*     */     
/*     */     public Type<?> updateMu(RecursiveTypeFamily newFamily) {
/* 132 */       return new HookType(this.delegate.updateMu(newFamily), this.preRead, this.postWrite);
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 137 */       return DSL.hook(this.delegate.template(), this.preRead, this.postWrite);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String name, int index) {
/* 142 */       return this.delegate.findChoiceType(name, index);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findCheckedType(int index) {
/* 147 */       return this.delegate.findCheckedType(index);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<Type<?>> findFieldTypeOpt(String name) {
/* 152 */       return this.delegate.findFieldTypeOpt(name);
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<A> point(DynamicOps<?> ops) {
/* 157 */       return this.delegate.point(ops);
/*     */     }
/*     */ 
/*     */     
/*     */     public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> resultType, Type.TypeMatcher<FT, FR> matcher, boolean recurse) {
/* 162 */       return this.delegate.findType(type, resultType, matcher, recurse).mapLeft(optic -> wrapOptic(optic, this.preRead, this.postWrite));
/*     */     }
/*     */     
/*     */     public static <A, B> RewriteResult<A, ?> fix(HookType<A> type, RewriteResult<A, B> instance) {
/* 166 */       if (Objects.equals(instance.view().function(), Functions.id())) {
/* 167 */         return RewriteResult.nop(type);
/*     */       }
/* 169 */       return opticView(type, instance, wrapOptic(TypedOptic.adapter(instance.view().type(), instance.view().newType()), type.preRead, type.postWrite));
/*     */     }
/*     */     
/*     */     protected static <A, B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(TypedOptic<A, B, FT, FR> optic, Hook.HookFunction preRead, Hook.HookFunction postWrite) {
/* 173 */       return new TypedOptic(optic
/* 174 */           .bounds(), 
/* 175 */           DSL.hook(optic.sType(), preRead, postWrite), 
/* 176 */           DSL.hook(optic.tType(), preRead, postWrite), optic
/* 177 */           .aType(), optic
/* 178 */           .bType(), optic
/* 179 */           .optic());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 185 */       return "HookType[" + this.delegate + ", " + this.preRead + ", " + this.postWrite + "]";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 190 */       if (!(obj instanceof HookType)) {
/* 191 */         return false;
/*     */       }
/* 193 */       HookType<?> type = (HookType)obj;
/* 194 */       return (this.delegate.equals(type.delegate, ignoreRecursionPoints, checkIndex) && Objects.equals(this.preRead, type.preRead) && Objects.equals(this.postWrite, type.postWrite));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 199 */       return Objects.hash(new Object[] { this.delegate, this.preRead, this.postWrite });
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\Hook.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */