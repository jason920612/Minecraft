/*    */ package com.mojang.datafixers.kinds;
/*    */ 
/*    */ import java.util.Optional;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public final class OptionalBox<T> implements App<OptionalBox.Mu, T> {
/*    */   private final Optional<T> value;
/*    */   
/*    */   public static final class Mu implements K1 {}
/*    */   
/*    */   public static <T> Optional<T> unbox(App<Mu, T> box) {
/* 13 */     return ((OptionalBox)box).value;
/*    */   }
/*    */   
/*    */   public static <T> OptionalBox<T> create(Optional<T> value) {
/* 17 */     return new OptionalBox<>(value);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   OptionalBox(Optional<T> value) {
/* 23 */     this.value = value;
/*    */   }
/*    */   
/*    */   public enum Instance implements Applicative<Mu, Instance.Mu> {
/* 27 */     INSTANCE;
/*    */     
/*    */     public static final class Mu
/*    */       implements Applicative.Mu {}
/*    */     
/*    */     public <T, R> App<OptionalBox.Mu, R> map(Function<? super T, ? extends R> func, App<OptionalBox.Mu, T> ts) {
/* 33 */       return OptionalBox.create(OptionalBox.<T>unbox(ts).map(func));
/*    */     }
/*    */ 
/*    */     
/*    */     public <A> App<OptionalBox.Mu, A> point(A a) {
/* 38 */       return OptionalBox.create(Optional.of(a));
/*    */     }
/*    */ 
/*    */     
/*    */     public <A, R> Function<App<OptionalBox.Mu, A>, App<OptionalBox.Mu, R>> lift1(App<OptionalBox.Mu, Function<A, R>> function) {
/* 43 */       return a -> OptionalBox.create(OptionalBox.unbox(function).flatMap(()));
/*    */     }
/*    */ 
/*    */     
/*    */     public <A, B, R> BiFunction<App<OptionalBox.Mu, A>, App<OptionalBox.Mu, B>, App<OptionalBox.Mu, R>> lift2(App<OptionalBox.Mu, BiFunction<A, B, R>> function) {
/* 48 */       return (a, b) -> OptionalBox.create(OptionalBox.unbox(function).flatMap(()));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\kinds\OptionalBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */