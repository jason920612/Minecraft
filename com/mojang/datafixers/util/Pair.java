/*    */ package com.mojang.datafixers.util;
/*    */ 
/*    */ import com.google.common.base.Objects;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.kinds.CartesianLike;
/*    */ import com.mojang.datafixers.kinds.K1;
/*    */ import com.mojang.datafixers.kinds.Traversable;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class Pair<F, S>
/*    */   implements App<Pair.Mu<S>, F>
/*    */ {
/*    */   private final F first;
/*    */   
/*    */   public static <F, S> Pair<F, S> unbox(App<Mu<S>, F> box) {
/* 18 */     return (Pair)box;
/*    */   }
/*    */   private final S second;
/*    */   
/*    */   public static final class Mu<S> implements K1 {}
/*    */   
/*    */   public Pair(F first, S second) {
/* 25 */     this.first = first;
/* 26 */     this.second = second;
/*    */   }
/*    */   
/*    */   public F getFirst() {
/* 30 */     return this.first;
/*    */   }
/*    */   
/*    */   public S getSecond() {
/* 34 */     return this.second;
/*    */   }
/*    */   
/*    */   public Pair<S, F> swap() {
/* 38 */     return of(this.second, this.first);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return "(" + this.first + ", " + this.second + ")";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 48 */     if (!(obj instanceof Pair)) {
/* 49 */       return false;
/*    */     }
/* 51 */     Pair<?, ?> other = (Pair<?, ?>)obj;
/* 52 */     return (Objects.equals(this.first, other.first) && Objects.equals(this.second, other.second));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 57 */     return Objects.hashCode(new Object[] { this.first, this.second });
/*    */   }
/*    */   
/*    */   public <F2> Pair<F2, S> mapFirst(Function<? super F, ? extends F2> function) {
/* 61 */     return of(function.apply(this.first), this.second);
/*    */   }
/*    */   
/*    */   public <S2> Pair<F, S2> mapSecond(Function<? super S, ? extends S2> function) {
/* 65 */     return of(this.first, function.apply(this.second));
/*    */   }
/*    */   
/*    */   public static <F, S> Pair<F, S> of(F first, S second) {
/* 69 */     return new Pair<>(first, second);
/*    */   }
/*    */   
/*    */   public static final class Instance<S2>
/*    */     implements Traversable<Mu<S2>, Instance.Mu<S2>>, CartesianLike<Mu<S2>, S2, Instance.Mu<S2>> {
/*    */     public static final class Mu<S2> implements Traversable.Mu, CartesianLike.Mu {}
/*    */     
/*    */     public <T, R> App<Pair.Mu<S2>, R> map(Function<? super T, ? extends R> func, App<Pair.Mu<S2>, T> ts) {
/* 77 */       return Pair.<T, S2>unbox(ts).mapFirst(func);
/*    */     }
/*    */ 
/*    */     
/*    */     public <F extends K1, A, B> App<F, App<Pair.Mu<S2>, B>> traverse(Applicative<F, ?> applicative, Function<A, App<F, B>> function, App<Pair.Mu<S2>, A> input) {
/* 82 */       Pair<A, S2> pair = Pair.unbox(input);
/* 83 */       return applicative.ap(b -> Pair.of(b, pair.second), function.apply((A)pair.first));
/*    */     }
/*    */ 
/*    */     
/*    */     public <A> App<Pair.Mu<S2>, A> to(App<Pair.Mu<S2>, A> input) {
/* 88 */       return input;
/*    */     }
/*    */ 
/*    */     
/*    */     public <A> App<Pair.Mu<S2>, A> from(App<Pair.Mu<S2>, A> input) {
/* 93 */       return input;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixer\\util\Pair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */