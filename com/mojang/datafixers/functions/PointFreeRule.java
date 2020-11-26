/*     */ package com.mojang.datafixers.functions;
/*     */ 
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.RewriteResult;
/*     */ import com.mojang.datafixers.View;
/*     */ import com.mojang.datafixers.optics.Optic;
/*     */ import com.mojang.datafixers.optics.Optics;
/*     */ import com.mojang.datafixers.types.Func;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.families.Algebra;
/*     */ import com.mojang.datafixers.types.families.ListAlgebra;
/*     */ import com.mojang.datafixers.types.families.RecursiveTypeFamily;
/*     */ import java.util.BitSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.commons.lang3.ObjectUtils;
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
/*     */ public interface PointFreeRule
/*     */ {
/*     */   default <A, B> Optional<View<A, B>> rewrite(View<A, B> view) {
/*  38 */     return rewrite(view.getFuncType(), view.function()).map(pf -> View.create(view.type(), view.newType(), pf));
/*     */   }
/*     */   
/*     */   default <A> PointFree<A> rewriteOrNop(Type<A> type, PointFree<A> expr) {
/*  42 */     return (PointFree<A>)DataFixUtils.orElse(rewrite(type, expr), expr);
/*     */   }
/*     */   
/*     */   default <A, B> View<A, B> rewriteOrNop(View<A, B> view) {
/*  46 */     return (View<A, B>)DataFixUtils.orElse(rewrite(view), view);
/*     */   }
/*     */   
/*     */   static PointFreeRule nop() {
/*  50 */     return Nop.INSTANCE;
/*     */   }
/*     */   
/*     */   public enum Nop implements PointFreeRule, Supplier<PointFreeRule> {
/*  54 */     INSTANCE;
/*     */ 
/*     */     
/*     */     public <A> Optional<PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/*  58 */       return Optional.of(expr);
/*     */     }
/*     */ 
/*     */     
/*     */     public PointFreeRule get() {
/*  63 */       return this;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum BangEta implements PointFreeRule {
/*  68 */     INSTANCE;
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/*  73 */       if (expr instanceof Bang) {
/*  74 */         return Optional.empty();
/*     */       }
/*  76 */       if (type instanceof Func) {
/*  77 */         Func<?, ?> func = (Func)type;
/*  78 */         if (func.second() instanceof com.mojang.datafixers.types.constant.NilDrop) {
/*  79 */           return Optional.of((PointFree)Functions.bang());
/*     */         }
/*     */       } 
/*  82 */       return Optional.empty();
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CompAssocLeft implements PointFreeRule {
/*  87 */     INSTANCE;
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/*  91 */       if (expr instanceof Comp) {
/*  92 */         Comp<?, ?, ?> comp2 = (Comp)expr;
/*  93 */         PointFree<? extends Function<?, ?>> second = comp2.second;
/*  94 */         if (second instanceof Comp) {
/*  95 */           Comp<?, ?, ?> comp1 = (Comp)second;
/*  96 */           return (Optional)swap(comp1, comp2);
/*     */         } 
/*     */       } 
/*  99 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private static <A, B, C, D, E> Optional<PointFree<E>> swap(Comp<A, B, C> comp1, Comp<?, ?, D> comp2raw) {
/* 104 */       Comp<?, ?, D> comp = comp2raw;
/* 105 */       return Optional.of((PointFree)new Comp<>(comp1.middleType, new Comp<>(comp.middleType, comp.first, comp1.first), comp1.second));
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CompAssocRight implements PointFreeRule {
/* 110 */     INSTANCE;
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 114 */       if (expr instanceof Comp) {
/* 115 */         Comp<?, ?, ?> comp1 = (Comp)expr;
/* 116 */         PointFree<? extends Function<?, ?>> first = comp1.first;
/* 117 */         if (first instanceof Comp) {
/* 118 */           Comp<?, ?, ?> comp2 = (Comp)first;
/* 119 */           return (Optional)swap(comp1, comp2);
/*     */         } 
/*     */       } 
/* 122 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private static <A, B, C, D, E> Optional<PointFree<E>> swap(Comp<A, B, D> comp1, Comp<?, C, ?> comp2raw) {
/* 127 */       Comp<?, C, ?> comp = comp2raw;
/* 128 */       return Optional.of((PointFree)new Comp<>(comp.middleType, comp.first, new Comp<>(comp1.middleType, (PointFree)comp.second, comp1.second)));
/*     */     }
/*     */   }
/*     */   
/*     */   public enum LensAppId implements PointFreeRule {
/* 133 */     INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 139 */       if (expr instanceof Apply) {
/* 140 */         Apply<?, A> apply = (Apply)expr;
/* 141 */         PointFree<? extends Function<?, A>> func = apply.func;
/* 142 */         if (func instanceof ProfunctorTransformer && Objects.equals(apply.arg, Functions.id())) {
/* 143 */           return Optional.of((PointFree)Functions.id());
/*     */         }
/*     */       } 
/* 146 */       return Optional.empty();
/*     */     }
/*     */   }
/*     */   
/*     */   public enum AppNest implements PointFreeRule {
/* 151 */     INSTANCE;
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 156 */       if (expr instanceof Apply) {
/* 157 */         Apply<?, ?> applyFirst = (Apply)expr;
/* 158 */         if (applyFirst.arg instanceof Apply) {
/* 159 */           Apply<?, ?> applySecond = (Apply)applyFirst.arg;
/* 160 */           return cap(applyFirst, applySecond);
/*     */         } 
/*     */       } 
/* 163 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private <A, B, C, D, E> Optional<? extends PointFree<A>> cap(Apply<D, E> applyFirst, Apply<B, C> applySecond) {
/* 168 */       PointFree<?> func = applySecond.func;
/* 169 */       return Optional.of(Functions.app(Functions.comp(applyFirst.argType, applyFirst.func, (PointFree)func), applySecond.arg, applySecond.argType));
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface CompRewrite
/*     */     extends PointFreeRule {
/*     */     default <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 176 */       if (expr instanceof Comp) {
/* 177 */         Comp<?, ?, ?> comp = (Comp)expr;
/* 178 */         PointFree<? extends Function<?, ?>> first = comp.first;
/* 179 */         PointFree<? extends Function<?, ?>> second = comp.second;
/* 180 */         if (first instanceof Comp) {
/* 181 */           Comp<?, ?, ?> firstComp = (Comp)first;
/* 182 */           return doRewrite(type, comp.middleType, firstComp.second, comp.second).map(result -> {
/*     */                 if (result instanceof Comp) {
/*     */                   Comp<?, ?, ?> resultComp = (Comp<?, ?, ?>)result;
/*     */                   return buildLeftNested(resultComp, firstComp);
/*     */                 } 
/*     */                 return buildRight(firstComp, result);
/*     */               });
/*     */         } 
/* 190 */         if (second instanceof Comp) {
/* 191 */           Comp<?, ?, ?> secondComp = (Comp)second;
/* 192 */           return doRewrite(type, comp.middleType, comp.first, secondComp.first).map(result -> {
/*     */                 if (result instanceof Comp) {
/*     */                   Comp<?, ?, ?> resultComp = (Comp<?, ?, ?>)result;
/*     */                   return buildRightNested(secondComp, resultComp);
/*     */                 } 
/*     */                 return buildLeft(result, secondComp);
/*     */               });
/*     */         } 
/* 200 */         return (Optional)doRewrite(type, comp.middleType, comp.first, comp.second);
/*     */       } 
/* 202 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     static <A, B, C, D> PointFree<D> buildLeft(PointFree<?> result, Comp<A, B, C> comp) {
/* 207 */       return (PointFree)new Comp<>(comp.middleType, (PointFree)result, comp.second);
/*     */     }
/*     */ 
/*     */     
/*     */     static <A, B, C, D> PointFree<D> buildRight(Comp<A, B, C> comp, PointFree<?> result) {
/* 212 */       return (PointFree)new Comp<>(comp.middleType, comp.first, (PointFree)result);
/*     */     }
/*     */ 
/*     */     
/*     */     static <A, B, C, D, E> PointFree<E> buildLeftNested(Comp<A, B, C> comp1, Comp<?, ?, D> comp2raw) {
/* 217 */       Comp<?, ?, D> comp = comp2raw;
/* 218 */       return (PointFree)new Comp<>(comp1.middleType, new Comp<>(comp.middleType, comp.first, comp1.first), comp1.second);
/*     */     }
/*     */ 
/*     */     
/*     */     static <A, B, C, D, E> PointFree<E> buildRightNested(Comp<A, B, D> comp1, Comp<?, C, ?> comp2raw) {
/* 223 */       Comp<?, C, ?> comp = comp2raw;
/* 224 */       return (PointFree)new Comp<>(comp.middleType, comp.first, new Comp<>(comp1.middleType, (PointFree)comp.second, comp1.second));
/*     */     }
/*     */     
/*     */     <A> Optional<? extends PointFree<?>> doRewrite(Type<A> param1Type, Type<?> param1Type1, PointFree<? extends Function<?, ?>> param1PointFree1, PointFree<? extends Function<?, ?>> param1PointFree2);
/*     */   }
/*     */   
/*     */   public enum SortProj implements CompRewrite {
/* 231 */     INSTANCE;
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<?>> doRewrite(Type<A> type, Type<?> middleType, PointFree<? extends Function<?, ?>> first, PointFree<? extends Function<?, ?>> second) {
/* 236 */       if (first instanceof Apply && second instanceof Apply) {
/* 237 */         Apply<?, ?> applyFirst = (Apply)first;
/* 238 */         Apply<?, ?> applySecond = (Apply)second;
/* 239 */         PointFree<? extends Function<?, ?>> firstFunc = applyFirst.func;
/* 240 */         PointFree<? extends Function<?, ?>> secondFunc = applySecond.func;
/* 241 */         if (firstFunc instanceof ProfunctorTransformer && secondFunc instanceof ProfunctorTransformer) {
/* 242 */           ProfunctorTransformer<?, ?, ?, ?> firstOptic = (ProfunctorTransformer)firstFunc;
/* 243 */           ProfunctorTransformer<?, ?, ?, ?> secondOptic = (ProfunctorTransformer)secondFunc;
/*     */           
/* 245 */           Optic<?, ?, ?, ?, ?> fo = firstOptic.optic;
/* 246 */           while (fo instanceof Optic.CompositionOptic) {
/* 247 */             fo = ((Optic.CompositionOptic)fo).outer();
/*     */           }
/*     */           
/* 250 */           Optic<?, ?, ?, ?, ?> so = secondOptic.optic;
/* 251 */           while (so instanceof Optic.CompositionOptic) {
/* 252 */             so = ((Optic.CompositionOptic)so).outer();
/*     */           }
/*     */           
/* 255 */           if (Objects.equals(fo, Optics.proj2()) && Objects.equals(so, Optics.proj1())) {
/* 256 */             Func<?, ?> firstArg = (Func)applyFirst.argType;
/* 257 */             Func<?, ?> secondArg = (Func)applySecond.argType;
/* 258 */             return Optional.of(cap(firstArg, secondArg, applyFirst, applySecond));
/*     */           } 
/*     */         } 
/*     */       } 
/* 262 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private <R, A, A2, B, B2> R cap(Func<B, B2> firstArg, Func<A, A2> secondArg, Apply<?, ?> first, Apply<?, ?> second) {
/* 267 */       return (R)Functions.comp(
/* 268 */           DSL.and(secondArg.first(), firstArg.second()), (PointFree)second, (PointFree)first);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public enum SortInj
/*     */     implements CompRewrite
/*     */   {
/* 276 */     INSTANCE;
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<?>> doRewrite(Type<A> type, Type<?> middleType, PointFree<? extends Function<?, ?>> first, PointFree<? extends Function<?, ?>> second) {
/* 281 */       if (first instanceof Apply && second instanceof Apply) {
/* 282 */         Apply<?, ?> applyFirst = (Apply)first;
/* 283 */         Apply<?, ?> applySecond = (Apply)second;
/* 284 */         PointFree<? extends Function<?, ?>> firstFunc = applyFirst.func;
/* 285 */         PointFree<? extends Function<?, ?>> secondFunc = applySecond.func;
/* 286 */         if (firstFunc instanceof ProfunctorTransformer && secondFunc instanceof ProfunctorTransformer) {
/* 287 */           ProfunctorTransformer<?, ?, ?, ?> firstOptic = (ProfunctorTransformer)firstFunc;
/* 288 */           ProfunctorTransformer<?, ?, ?, ?> secondOptic = (ProfunctorTransformer)secondFunc;
/*     */           
/* 290 */           Optic<?, ?, ?, ?, ?> fo = firstOptic.optic;
/* 291 */           while (fo instanceof Optic.CompositionOptic) {
/* 292 */             fo = ((Optic.CompositionOptic)fo).outer();
/*     */           }
/*     */           
/* 295 */           Optic<?, ?, ?, ?, ?> so = secondOptic.optic;
/* 296 */           while (so instanceof Optic.CompositionOptic) {
/* 297 */             so = ((Optic.CompositionOptic)so).outer();
/*     */           }
/*     */           
/* 300 */           if (Objects.equals(fo, Optics.inj2()) && Objects.equals(so, Optics.inj1())) {
/* 301 */             Func<?, ?> firstArg = (Func)applyFirst.argType;
/* 302 */             Func<?, ?> secondArg = (Func)applySecond.argType;
/* 303 */             return Optional.of(cap(firstArg, secondArg, applyFirst, applySecond));
/*     */           } 
/*     */         } 
/*     */       } 
/* 307 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private <R, A, A2, B, B2> R cap(Func<B, B2> firstArg, Func<A, A2> secondArg, Apply<?, ?> first, Apply<?, ?> second) {
/* 312 */       return (R)Functions.comp(
/* 313 */           DSL.or(secondArg.first(), firstArg.second()), (PointFree)second, (PointFree)first);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public enum LensCompFunc
/*     */     implements PointFreeRule
/*     */   {
/* 321 */     INSTANCE;
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 326 */       if (expr instanceof Comp) {
/* 327 */         Comp<?, ?, ?> comp = (Comp)expr;
/* 328 */         PointFree<? extends Function<?, ?>> first = comp.first;
/* 329 */         PointFree<? extends Function<?, ?>> second = comp.second;
/* 330 */         if (first instanceof ProfunctorTransformer && second instanceof ProfunctorTransformer) {
/* 331 */           ProfunctorTransformer<?, ?, ?, ?> firstOptic = (ProfunctorTransformer)first;
/* 332 */           ProfunctorTransformer<?, ?, ?, ?> secondOptic = (ProfunctorTransformer)second;
/* 333 */           return Optional.of(cap(firstOptic, secondOptic));
/*     */         } 
/*     */       } 
/* 336 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private <R, X, Y, S, T, A, B> R cap(ProfunctorTransformer<X, Y, ?, ?> first, ProfunctorTransformer<S, T, A, B> second) {
/* 341 */       ProfunctorTransformer<X, Y, ?, ?> profunctorTransformer = first;
/* 342 */       return (R)Functions.profunctorTransformer(profunctorTransformer.optic.compose(second.optic));
/*     */     }
/*     */   }
/*     */   
/*     */   public enum LensComp implements CompRewrite {
/* 347 */     INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<?>> doRewrite(Type<A> type, Type<?> middleType, PointFree<? extends Function<?, ?>> first, PointFree<? extends Function<?, ?>> second) {
/* 353 */       if (first instanceof Apply && second instanceof Apply) {
/* 354 */         Apply<?, ?> applyFirst = (Apply)first;
/* 355 */         Apply<?, ?> applySecond = (Apply)second;
/* 356 */         PointFree<? extends Function<?, ?>> firstFunc = applyFirst.func;
/* 357 */         PointFree<? extends Function<?, ?>> secondFunc = applySecond.func;
/* 358 */         if (firstFunc instanceof ProfunctorTransformer && secondFunc instanceof ProfunctorTransformer) {
/* 359 */           ProfunctorTransformer<?, ?, ?, ?> lensPFFirst = (ProfunctorTransformer)firstFunc;
/* 360 */           ProfunctorTransformer<?, ?, ?, ?> lensPFSecond = (ProfunctorTransformer)secondFunc;
/*     */           
/* 362 */           if (Objects.equals(lensPFFirst.optic, lensPFSecond.optic)) {
/* 363 */             Func<?, ?> firstFuncType = (Func)applyFirst.argType;
/* 364 */             Func<?, ?> secondFuncType = (Func)applySecond.argType;
/* 365 */             return cap(lensPFFirst, lensPFSecond, applyFirst.arg, applySecond.arg, firstFuncType, secondFuncType);
/*     */           } 
/*     */         } 
/*     */       } 
/* 369 */       return Optional.empty();
/*     */     }
/*     */     
/*     */     private <R, A, B, C, S, T, U> Optional<? extends PointFree<R>> cap(ProfunctorTransformer<S, T, A, B> l1, ProfunctorTransformer<?, U, ?, C> l2, PointFree<?> f1, PointFree<?> f2, Func<?, ?> firstType, Func<?, ?> secondType) {
/* 373 */       return cap2(l1, (ProfunctorTransformer)l2, (PointFree)f1, (PointFree)f2, (Func)firstType, (Func)secondType);
/*     */     }
/*     */     
/*     */     private <R, P extends com.mojang.datafixers.kinds.K2, Proof extends com.mojang.datafixers.kinds.K1, A, B, C, S, T, U> Optional<? extends PointFree<R>> cap2(ProfunctorTransformer<S, T, A, B> l1, ProfunctorTransformer<T, U, B, C> l2, PointFree<Function<B, C>> f1, PointFree<Function<A, B>> f2, Func<B, C> firstType, Func<A, B> secondType) {
/* 377 */       PointFree<Function<Function<A, C>, Function<S, U>>> lens = l1;
/* 378 */       PointFree<Function<A, C>> arg = Functions.comp(firstType.first(), f1, f2);
/* 379 */       return Optional.of(Functions.app((PointFree)lens, arg, DSL.func(secondType.first(), firstType.second())));
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CataFuseSame implements CompRewrite {
/* 384 */     INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<?>> doRewrite(Type<A> type, Type<?> middleType, PointFree<? extends Function<?, ?>> first, PointFree<? extends Function<?, ?>> second) {
/* 390 */       if (first instanceof Fold && second instanceof Fold) {
/*     */         
/* 392 */         Fold<?, ?> firstFold = (Fold)first;
/* 393 */         Fold<?, ?> secondFold = (Fold)second;
/* 394 */         RecursiveTypeFamily family = firstFold.aType.family();
/* 395 */         if (Objects.equals(family, secondFold.aType.family()) && firstFold.index == secondFold.index) {
/*     */           
/* 397 */           List<RewriteResult<?, ?>> newAlgebra = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */           
/* 401 */           boolean foundOne = false;
/* 402 */           for (int i = 0; i < family.size(); i++) {
/* 403 */             RewriteResult<?, ?> firstAlgFunc = firstFold.algebra.apply(i);
/* 404 */             RewriteResult<?, ?> secondAlgFunc = secondFold.algebra.apply(i);
/* 405 */             boolean firstId = Objects.equals(PointFreeRule.CompAssocRight.INSTANCE.<A, B>rewriteOrNop(firstAlgFunc.view()).function(), Functions.id());
/* 406 */             boolean secondId = Objects.equals(secondAlgFunc.view().function(), Functions.id());
/*     */             
/* 408 */             if (firstId && secondId) {
/* 409 */               newAlgebra.add(firstFold.algebra.apply(i));
/* 410 */             } else if (!foundOne && !firstId && !secondId) {
/* 411 */               newAlgebra.add(getCompose(firstAlgFunc, secondAlgFunc));
/* 412 */               foundOne = true;
/*     */             } else {
/* 414 */               return Optional.empty();
/*     */             } 
/*     */           } 
/* 417 */           ListAlgebra listAlgebra = new ListAlgebra("FusedSame", newAlgebra);
/* 418 */           return Optional.of(((RewriteResult)family.fold((Algebra)listAlgebra).apply(firstFold.index)).view().function());
/*     */         } 
/*     */       } 
/* 421 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     private <B> RewriteResult<?, ?> getCompose(RewriteResult<B, ?> firstAlgFunc, RewriteResult<?, ?> secondAlgFunc) {
/* 426 */       return firstAlgFunc.compose(secondAlgFunc);
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CataFuseDifferent implements CompRewrite {
/* 431 */     INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<?>> doRewrite(Type<A> type, Type<?> middleType, PointFree<? extends Function<?, ?>> first, PointFree<? extends Function<?, ?>> second) {
/* 437 */       if (first instanceof Fold && second instanceof Fold) {
/*     */         
/* 439 */         Fold<?, ?> firstFold = (Fold)first;
/* 440 */         Fold<?, ?> secondFold = (Fold)second;
/* 441 */         RecursiveTypeFamily family = firstFold.aType.family();
/* 442 */         if (Objects.equals(family, secondFold.aType.family()) && firstFold.index == secondFold.index) {
/*     */           
/* 444 */           List<RewriteResult<?, ?>> newAlgebra = Lists.newArrayList();
/*     */           
/* 446 */           BitSet firstModifies = new BitSet(family.size());
/* 447 */           BitSet secondModifies = new BitSet(family.size());
/*     */           
/* 449 */           for (int i = 0; i < family.size(); i++) {
/* 450 */             RewriteResult<?, ?> firstAlgFunc = firstFold.algebra.apply(i);
/* 451 */             RewriteResult<?, ?> secondAlgFunc = secondFold.algebra.apply(i);
/* 452 */             boolean firstId = Objects.equals(PointFreeRule.CompAssocRight.INSTANCE.<A, B>rewriteOrNop(firstAlgFunc.view()).function(), Functions.id());
/* 453 */             boolean secondId = Objects.equals(secondAlgFunc.view().function(), Functions.id());
/* 454 */             firstModifies.set(i, !firstId);
/* 455 */             secondModifies.set(i, !secondId);
/*     */           } 
/*     */           
/* 458 */           BitSet newSet = (BitSet)ObjectUtils.clone(firstModifies);
/* 459 */           newSet.or(secondModifies);
/*     */ 
/*     */ 
/*     */           
/* 463 */           for (int j = 0; j < family.size(); j++) {
/* 464 */             RewriteResult<?, ?> firstAlgFunc = firstFold.algebra.apply(j);
/* 465 */             RewriteResult<?, ?> secondAlgFunc = secondFold.algebra.apply(j);
/* 466 */             PointFree<?> firstF = PointFreeRule.CompAssocRight.INSTANCE.<A, B>rewriteOrNop(firstAlgFunc.view()).function();
/* 467 */             PointFree<?> secondF = PointFreeRule.CompAssocRight.INSTANCE.<A, B>rewriteOrNop(secondAlgFunc.view()).function();
/* 468 */             boolean firstId = Objects.equals(firstF, Functions.id());
/* 469 */             boolean secondId = Objects.equals(secondF, Functions.id());
/* 470 */             if (firstAlgFunc.recData().intersects(secondModifies) || secondAlgFunc.recData().intersects(firstModifies))
/*     */             {
/* 472 */               return Optional.empty();
/*     */             }
/* 474 */             if (firstId) {
/* 475 */               newAlgebra.add(secondAlgFunc);
/* 476 */             } else if (secondId) {
/* 477 */               newAlgebra.add(firstAlgFunc);
/*     */             } else {
/* 479 */               return Optional.empty();
/*     */             } 
/*     */           } 
/*     */ 
/*     */           
/* 484 */           ListAlgebra listAlgebra = new ListAlgebra("FusedDifferent", newAlgebra);
/* 485 */           return Optional.of(((RewriteResult)family.fold((Algebra)listAlgebra).apply(firstFold.index)).view().function());
/*     */         } 
/*     */       } 
/* 488 */       return Optional.empty();
/*     */     }
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
/*     */   static PointFreeRule seq(PointFreeRule first, Supplier<PointFreeRule> second) {
/* 509 */     return seq((List<Supplier<PointFreeRule>>)ImmutableList.of(() -> first, second));
/*     */   }
/*     */   
/*     */   static PointFreeRule seq(List<Supplier<PointFreeRule>> rules) {
/* 513 */     return new Seq(rules);
/*     */   }
/*     */   
/*     */   public static final class Seq implements PointFreeRule {
/*     */     private final List<Supplier<PointFreeRule>> rules;
/*     */     
/*     */     public Seq(List<Supplier<PointFreeRule>> rules) {
/* 520 */       this.rules = (List<Supplier<PointFreeRule>>)ImmutableList.copyOf(rules);
/*     */     }
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 525 */       Optional<? extends PointFree<A>> result = Optional.of(expr);
/* 526 */       for (Supplier<PointFreeRule> rule : this.rules) {
/* 527 */         result = result.flatMap(pf -> ((PointFreeRule)rule.get()).rewrite(type, pf));
/*     */       }
/* 529 */       return result;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/* 534 */       if (obj == this) {
/* 535 */         return true;
/*     */       }
/* 537 */       if (!(obj instanceof Seq)) {
/* 538 */         return false;
/*     */       }
/* 540 */       Seq that = (Seq)obj;
/* 541 */       return Objects.equals(this.rules, that.rules);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 546 */       return Objects.hash(new Object[] { this.rules });
/*     */     }
/*     */   }
/*     */   
/*     */   static PointFreeRule orElse(PointFreeRule first, PointFreeRule second) {
/* 551 */     return new OrElse(first, () -> second);
/*     */   }
/*     */   
/*     */   static PointFreeRule orElseStrict(PointFreeRule first, Supplier<PointFreeRule> second) {
/* 555 */     return new OrElse(first, second);
/*     */   }
/*     */   
/*     */   public static final class OrElse implements PointFreeRule {
/*     */     protected final PointFreeRule first;
/*     */     protected final Supplier<PointFreeRule> second;
/*     */     
/*     */     public OrElse(PointFreeRule first, Supplier<PointFreeRule> second) {
/* 563 */       this.first = first;
/* 564 */       this.second = second;
/*     */     }
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 569 */       Optional<? extends PointFree<A>> view = this.first.rewrite(type, expr);
/* 570 */       if (view.isPresent()) {
/* 571 */         return view;
/*     */       }
/* 573 */       return ((PointFreeRule)this.second.get()).rewrite(type, expr);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/* 578 */       if (obj == this) {
/* 579 */         return true;
/*     */       }
/* 581 */       if (!(obj instanceof OrElse)) {
/* 582 */         return false;
/*     */       }
/* 584 */       OrElse that = (OrElse)obj;
/* 585 */       return (Objects.equals(this.first, that.first) && Objects.equals(this.second, that.second));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 590 */       return Objects.hash(new Object[] { this.first, this.second });
/*     */     }
/*     */   }
/*     */   
/*     */   static PointFreeRule all(PointFreeRule rule) {
/* 595 */     return new All(rule);
/*     */   }
/*     */   
/*     */   static PointFreeRule one(PointFreeRule rule) {
/* 599 */     return new One(rule);
/*     */   }
/*     */   
/*     */   static PointFreeRule once(PointFreeRule rule) {
/* 603 */     return orElseStrict(rule, () -> one(once(rule)));
/*     */   }
/*     */   
/*     */   static PointFreeRule many(PointFreeRule rule) {
/* 607 */     return new Many(rule);
/*     */   }
/*     */   
/*     */   static PointFreeRule everywhere(PointFreeRule rule) {
/* 611 */     return seq(orElse(rule, Nop.INSTANCE), () -> all(everywhere(rule)));
/*     */   }
/*     */   
/*     */   <A> Optional<? extends PointFree<A>> rewrite(Type<A> paramType, PointFree<A> paramPointFree);
/*     */   
/*     */   public static final class All implements PointFreeRule {
/*     */     public All(PointFreeRule rule) {
/* 618 */       this.rule = rule;
/*     */     }
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 623 */       return expr.all(this.rule, type);
/*     */     }
/*     */     private final PointFreeRule rule;
/*     */     
/*     */     public boolean equals(Object obj) {
/* 628 */       if (obj == this) {
/* 629 */         return true;
/*     */       }
/* 631 */       if (!(obj instanceof All)) {
/* 632 */         return false;
/*     */       }
/* 634 */       All that = (All)obj;
/* 635 */       return Objects.equals(this.rule, that.rule);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 640 */       return this.rule.hashCode();
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class One implements PointFreeRule {
/*     */     private final PointFreeRule rule;
/*     */     
/*     */     public One(PointFreeRule rule) {
/* 648 */       this.rule = rule;
/*     */     }
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 653 */       return expr.one(this.rule, type);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/* 658 */       if (obj == this) {
/* 659 */         return true;
/*     */       }
/* 661 */       if (!(obj instanceof One)) {
/* 662 */         return false;
/*     */       }
/* 664 */       One that = (One)obj;
/* 665 */       return Objects.equals(this.rule, that.rule);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 670 */       return this.rule.hashCode();
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class Many implements PointFreeRule {
/*     */     private final PointFreeRule rule;
/*     */     
/*     */     public Many(PointFreeRule rule) {
/* 678 */       this.rule = rule;
/*     */     }
/*     */ 
/*     */     
/*     */     public <A> Optional<? extends PointFree<A>> rewrite(Type<A> type, PointFree<A> expr) {
/* 683 */       Optional<? extends PointFree<A>> result = Optional.of(expr);
/*     */       while (true) {
/* 685 */         Optional<? extends PointFree<A>> newResult = result.flatMap(e -> this.rule.rewrite(type, e).map(()));
/* 686 */         if (!newResult.isPresent()) {
/* 687 */           return result;
/*     */         }
/* 689 */         result = newResult;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 695 */       if (this == o) {
/* 696 */         return true;
/*     */       }
/* 698 */       if (o == null || getClass() != o.getClass()) {
/* 699 */         return false;
/*     */       }
/* 701 */       Many many = (Many)o;
/* 702 */       return Objects.equals(this.rule, many.rule);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 707 */       return Objects.hash(new Object[] { this.rule });
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\functions\PointFreeRule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */