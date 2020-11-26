/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public abstract class bpa<T extends bqp>
/*     */   extends bqo<T>
/*     */ {
/*     */   public bpa(boolean ☃) {
/*  22 */     super(☃);
/*     */   }
/*     */   
/*     */   protected boolean a(bcs ☃) {
/*  26 */     blc blc = ☃.p();
/*  27 */     return (blc.f() || blc
/*  28 */       .a(wv.A) || ☃ == bct.i || 
/*     */       
/*  30 */       bcs.d(☃) || ☃
/*  31 */       .a(wv.n) || ☃
/*  32 */       .a(wv.m) || ☃ == bct.dM);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, el el1) {
/*  38 */     if (!bcs.d(☃.a_(el1).c())) {
/*  39 */       a(☃, el1, bct.j.p());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(axz ☃, el el1, blc blc1) {
/*  45 */     b(☃, el1, blc1);
/*     */   }
/*     */   
/*     */   protected final void a(Set<el> ☃, axz axz1, el el1, blc blc1) {
/*  49 */     b(axz1, el1, blc1);
/*  50 */     if (wv.n.a(blc1.c())) {
/*  51 */       ☃.add(el1.h());
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(axz ☃, el el1, blc blc1) {
/*  56 */     if (this.aG) {
/*  57 */       ☃.a(el1, blc1, 19);
/*     */     } else {
/*  59 */       ☃.a(el1, blc1, 18);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, T t) {
/*  65 */     Set<el> set = Sets.newHashSet();
/*  66 */     boolean bool = a(set, ☃, random, el1);
/*  67 */     List<Set<el>> list = Lists.newArrayList();
/*  68 */     int i = 6;
/*  69 */     for (int j = 0; j < 6; j++) {
/*  70 */       list.add(Sets.newHashSet());
/*     */     }
/*  72 */     try (el.b ☃ = el.b.r()) {
/*  73 */       if (bool && !set.isEmpty()) {
/*  74 */         for (el el2 : Lists.newArrayList(set)) {
/*  75 */           for (eq eq : eq.values()) {
/*  76 */             b.j(el2).d(eq);
/*  77 */             if (!set.contains(b)) {
/*  78 */               blc blc = ☃.a_(b);
/*  79 */               if (blc.b(bma.ab)) {
/*  80 */                 ((Set<el>)list.get(0)).add(b.h());
/*  81 */                 b(☃, b, blc.a(bma.ab, Integer.valueOf(1)));
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*  87 */       for (int k = 1; k < 6; k++) {
/*  88 */         Set<el> set1 = list.get(k - 1);
/*  89 */         Set<el> set2 = list.get(k);
/*  90 */         for (el el2 : set1) {
/*  91 */           for (eq eq : eq.values()) {
/*  92 */             b.j(el2).d(eq);
/*  93 */             if (!set1.contains(b) && !set2.contains(b)) {
/*     */ 
/*     */               
/*  96 */               blc blc = ☃.a_(b);
/*  97 */               if (blc.b(bma.ab)) {
/*     */ 
/*     */                 
/* 100 */                 int m = ((Integer)blc.c(bma.ab)).intValue();
/* 101 */                 if (m > k + 1)
/* 102 */                 { blc blc1 = blc.a(bma.ab, Integer.valueOf(k + 1));
/* 103 */                   b(☃, b, blc1);
/* 104 */                   set2.add(b.h()); } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 110 */     }  return bool;
/*     */   }
/*     */   
/*     */   protected abstract boolean a(Set<el> paramSet, axz paramaxz, Random paramRandom, el paramel);
/*     */ }


/* Location:              F:\dw\server.jar!\bpa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */