/*     */ package com.mojang.datafixers.types.templates;
/*     */ 
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.FamilyOptic;
/*     */ import com.mojang.datafixers.OpticParts;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.TypedOptic;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.optics.profunctors.AffineP;
/*     */ import com.mojang.datafixers.optics.profunctors.Profunctor;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.TypeFamily;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.function.IntFunction;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public final class Const
/*     */   implements TypeTemplate {
/*     */   private final Type<?> type;
/*     */   
/*     */   public Const(Type<?> type) {
/*  26 */     this.type = type;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  31 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeFamily apply(TypeFamily family) {
/*  36 */     return new TypeFamily()
/*     */       {
/*     */         public Type<?> apply(int index) {
/*  39 */           return Const.this.type;
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
/*     */   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> input, Type<A> aType, Type<B> bType) {
/*  51 */     if (Objects.equals(this.type, aType)) {
/*  52 */       return TypeFamily.familyOptic(i -> new OpticParts((Set)ImmutableSet.of(Profunctor.Mu.TYPE_TOKEN), (Optic)Optics.id()));
/*     */     }
/*  54 */     TypedOptic<?, ?, A, B> ignoreOptic = makeIgnoreOptic(this.type, aType, bType);
/*  55 */     return TypeFamily.familyOptic(i -> new OpticParts(ignoreOptic.bounds(), ignoreOptic.optic()));
/*     */   }
/*     */   
/*     */   private <T, A, B> TypedOptic<T, T, A, B> makeIgnoreOptic(Type<T> type, Type<A> aType, Type<B> bType) {
/*  59 */     return new TypedOptic(AffineP.Mu.TYPE_TOKEN, type, type, aType, bType, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  65 */         (Optic)Optics.affine(Either::left, (b, t) -> t));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int index, @Nullable String name, Type<FT> type, Type<FR> resultType) {
/*  71 */     return DSL.fieldFinder(name, type).findType(this.type, resultType, false).mapLeft(field -> new Const(field.tType()));
/*     */   }
/*     */ 
/*     */   
/*     */   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily family, IntFunction<RewriteResult<?, ?>> function) {
/*  76 */     return i -> RewriteResult.nop(this.type);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  81 */     return (obj instanceof Const && Objects.equals(this.type, ((Const)obj).type));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  86 */     return Objects.hash(new Object[] { this.type });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  91 */     return "Const[" + this.type + "]";
/*     */   }
/*     */   
/*     */   public Type<?> type() {
/*  95 */     return this.type;
/*     */   }
/*     */   
/*     */   public static abstract class ConstType<A>
/*     */     extends Type<A> {
/*     */     public boolean equals(Object o, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 101 */       return (this == o);
/*     */     }
/*     */ 
/*     */     
/*     */     public TypeTemplate buildTemplate() {
/* 106 */       return DSL.constType(this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\templates\Const.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */