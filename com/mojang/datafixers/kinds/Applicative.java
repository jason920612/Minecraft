/*    */ package com.mojang.datafixers.kinds;
/*    */ 
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public interface Applicative<F extends K1, Mu extends Applicative.Mu>
/*    */   extends Functor<F, Mu>
/*    */ {
/*    */   static <F extends K1, Mu extends Mu> Applicative<F, Mu> unbox(App<Mu, F> proofBox) {
/* 10 */     return (Applicative<F, Mu>)proofBox;
/*    */   }
/*    */ 
/*    */   
/*    */   <A> App<F, A> point(A paramA);
/*    */ 
/*    */   
/*    */   <A, R> Function<App<F, A>, App<F, R>> lift1(App<F, Function<A, R>> paramApp);
/*    */   
/*    */   <A, B, R> BiFunction<App<F, A>, App<F, B>, App<F, R>> lift2(App<F, BiFunction<A, B, R>> paramApp);
/*    */   
/*    */   default <A, R> App<F, R> ap(App<F, Function<A, R>> func, App<F, A> arg) {
/* 22 */     return lift1(func).apply(arg);
/*    */   }
/*    */   
/*    */   default <A, R> App<F, R> ap(Function<A, R> func, App<F, A> arg) {
/* 26 */     return lift1(point(func)).apply(arg);
/*    */   }
/*    */   
/*    */   default <A, B, R> App<F, R> ap2(App<F, BiFunction<A, B, R>> func, App<F, A> a, App<F, B> b) {
/* 30 */     return lift2(func).apply(a, b);
/*    */   }
/*    */   
/*    */   default <A, B, R> App<F, R> ap2(BiFunction<A, B, R> func, App<F, A> a, App<F, B> b) {
/* 34 */     return lift2(point(func)).apply(a, b);
/*    */   }
/*    */   
/*    */   public static interface Mu extends Functor.Mu {}
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\kinds\Applicative.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */