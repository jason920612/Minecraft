/*    */ package com.mojang.datafixers.types;
/*    */ 
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public final class Func<A, B>
/*    */   extends Type<Function<A, B>>
/*    */ {
/*    */   protected final Type<A> first;
/*    */   protected final Type<B> second;
/*    */   
/*    */   public Func(Type<A> first, Type<B> second) {
/* 17 */     this.first = first;
/* 18 */     this.second = second;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeTemplate buildTemplate() {
/* 23 */     throw new UnsupportedOperationException("No template for function types.");
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> Pair<T, Optional<Function<A, B>>> read(DynamicOps<T> ops, T input) {
/* 28 */     return Pair.of(input, Optional.empty());
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Function<A, B> value) {
/* 33 */     return rest;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 38 */     return "(" + this.first + " -> " + this.second + ")";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 43 */     if (!(obj instanceof Func)) {
/* 44 */       return false;
/*    */     }
/* 46 */     Func<?, ?> that = (Func<?, ?>)obj;
/* 47 */     return (this.first.equals(that.first, ignoreRecursionPoints, checkIndex) && this.second.equals(that.second, ignoreRecursionPoints, checkIndex));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 52 */     return Objects.hash(new Object[] { this.first, this.second });
/*    */   }
/*    */   
/*    */   public Type<A> first() {
/* 56 */     return this.first;
/*    */   }
/*    */   
/*    */   public Type<B> second() {
/* 60 */     return this.second;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\Func.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */