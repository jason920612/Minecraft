/*     */ package com.mojang.datafixers;
/*     */ 
/*     */ import com.google.common.reflect.TypeToken;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.App2;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.kinds.Functor;
/*     */ import com.mojang.datafixers.kinds.IdF;
/*     */ import com.mojang.datafixers.kinds.K1;
/*     */ import com.mojang.datafixers.kinds.K2;
/*     */ import com.mojang.datafixers.kinds.Representable;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.optics.Procompose;
/*     */ import com.mojang.datafixers.optics.Wander;
/*     */ import com.mojang.datafixers.optics.profunctors.Mapping;
/*     */ import com.mojang.datafixers.optics.profunctors.MonoidProfunctor;
/*     */ import com.mojang.datafixers.optics.profunctors.Monoidal;
/*     */ import com.mojang.datafixers.optics.profunctors.TraversalP;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nonnull;
/*     */ 
/*     */ public interface FunctionType<A, B>
/*     */   extends Function<A, B>, App2<FunctionType.Mu, A, B>, App<FunctionType.ReaderMu<A>, B> {
/*     */   public static final class Mu
/*     */     implements K2 {}
/*     */   
/*     */   public static final class ReaderMu<A>
/*     */     implements K1 {}
/*     */   
/*     */   static <A, B> FunctionType<A, B> create(Function<? super A, ? extends B> function) {
/*  34 */     return function::apply;
/*     */   }
/*     */   
/*     */   static <A, B> Function<A, B> unbox(App2<Mu, A, B> box) {
/*  38 */     return (FunctionType)box;
/*     */   }
/*     */   
/*     */   static <A, B> Function<A, B> unbox(App<ReaderMu<A>, B> box) {
/*  42 */     return (FunctionType)box;
/*     */   }
/*     */   
/*     */   @Nonnull
/*     */   B apply(@Nonnull A paramA);
/*     */   
/*     */   public static final class ReaderInstance<R>
/*     */     implements Representable<ReaderMu<R>, R, ReaderInstance.Mu<R>> {
/*     */     public static final class Mu<A>
/*     */       implements Representable.Mu {}
/*     */     
/*     */     public <T, R2> App<FunctionType.ReaderMu<R>, R2> map(Function<? super T, ? extends R2> func, App<FunctionType.ReaderMu<R>, T> ts) {
/*  54 */       return FunctionType.create(func.compose(FunctionType.unbox(ts)));
/*     */     }
/*     */ 
/*     */     
/*     */     public <B> App<FunctionType.ReaderMu<R>, B> to(App<FunctionType.ReaderMu<R>, B> input) {
/*  59 */       return input;
/*     */     }
/*     */ 
/*     */     
/*     */     public <B> App<FunctionType.ReaderMu<R>, B> from(App<FunctionType.ReaderMu<R>, B> input) {
/*  64 */       return input;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum Instance implements TraversalP<Mu, Instance.Mu>, MonoidProfunctor<Mu, Instance.Mu>, Mapping<Mu, Instance.Mu>, Monoidal<Mu, Instance.Mu>, App<Instance.Mu, Mu> {
/*  69 */     INSTANCE;
/*     */     
/*     */     public static final class Mu implements TraversalP.Mu, MonoidProfunctor.Mu, Mapping.Mu, Monoidal.Mu {
/*  72 */       public static final TypeToken<Mu> TYPE_TOKEN = new TypeToken<Mu>() {
/*     */         
/*     */         }; }
/*     */     
/*     */     public <A, B, C, D> FunctionType<App2<FunctionType.Mu, A, B>, App2<FunctionType.Mu, C, D>> dimap(Function<C, A> g, Function<B, D> h) {
/*  77 */       return f -> FunctionType.create(h.compose(Optics.getFunc(f)).compose(g));
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B, C> App2<FunctionType.Mu, Pair<A, C>, Pair<B, C>> first(App2<FunctionType.Mu, A, B> input) {
/*  82 */       return FunctionType.create(p -> Pair.of(Optics.getFunc(input).apply(p.getFirst()), p.getSecond()));
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B, C> App2<FunctionType.Mu, Pair<C, A>, Pair<C, B>> second(App2<FunctionType.Mu, A, B> input) {
/*  87 */       return FunctionType.create(p -> Pair.of(p.getFirst(), Optics.getFunc(input).apply(p.getSecond())));
/*     */     }
/*     */ 
/*     */     
/*     */     public <S, T, A, B> App2<FunctionType.Mu, S, T> wander(Wander<S, T, A, B> wander, App2<FunctionType.Mu, A, B> input) {
/*  92 */       return FunctionType.create(s -> IdF.get(wander.wander((Applicative)IdF.Instance.INSTANCE, ()).apply(s)));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <A, B, C> App2<FunctionType.Mu, Either<A, C>, Either<B, C>> left(App2<FunctionType.Mu, A, B> input) {
/* 100 */       return FunctionType.create(either -> either.mapLeft(Optics.getFunc(input)));
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B, C> App2<FunctionType.Mu, Either<C, A>, Either<C, B>> right(App2<FunctionType.Mu, A, B> input) {
/* 105 */       return FunctionType.create(either -> either.mapRight(Optics.getFunc(input)));
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B, C, D> App2<FunctionType.Mu, Pair<A, C>, Pair<B, D>> par(App2<FunctionType.Mu, A, B> first, Supplier<App2<FunctionType.Mu, C, D>> second) {
/* 110 */       return FunctionType.create(pair -> Pair.of(Optics.getFunc(first).apply(pair.getFirst()), Optics.getFunc(second.get()).apply(pair.getSecond())));
/*     */     }
/*     */ 
/*     */     
/*     */     public App2<FunctionType.Mu, Void, Void> empty() {
/* 115 */       return FunctionType.create((Function)Function.identity());
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B> App2<FunctionType.Mu, A, B> zero(App2<FunctionType.Mu, A, B> func) {
/* 120 */       return func;
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B> App2<FunctionType.Mu, A, B> plus(App2<Procompose.Mu<FunctionType.Mu, FunctionType.Mu>, A, B> input) {
/* 125 */       Procompose<FunctionType.Mu, FunctionType.Mu, A, B, ?> cmp = Procompose.unbox(input);
/* 126 */       return cap(cmp);
/*     */     }
/*     */     
/*     */     private <A, B, C> App2<FunctionType.Mu, A, B> cap(Procompose<FunctionType.Mu, FunctionType.Mu, A, B, C> cmp) {
/* 130 */       return FunctionType.create(Optics.getFunc(cmp.second()).compose(Optics.getFunc(cmp.first().get())));
/*     */     }
/*     */ 
/*     */     
/*     */     public <A, B, F extends K1> App2<FunctionType.Mu, App<F, A>, App<F, B>> mapping(Functor<F, ?> functor, App2<FunctionType.Mu, A, B> input) {
/* 135 */       return FunctionType.create(fa -> functor.map(Optics.getFunc(input), fa));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\FunctionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */