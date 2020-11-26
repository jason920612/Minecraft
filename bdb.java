/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class bdb
/*     */   extends beo
/*     */ {
/*  29 */   public static final bmb a = bma.t;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   protected static final cew b = bcs.a(6.0D, 14.0D, 5.0D, 10.0D, 16.0D, 11.0D);
/*  38 */   protected static final cew c = bcs.a(5.0D, 14.0D, 6.0D, 11.0D, 16.0D, 10.0D);
/*  39 */   protected static final cew o = bcs.a(6.0D, 0.0D, 5.0D, 10.0D, 2.0D, 11.0D);
/*  40 */   protected static final cew p = bcs.a(5.0D, 0.0D, 6.0D, 11.0D, 2.0D, 10.0D);
/*  41 */   protected static final cew q = bcs.a(5.0D, 6.0D, 14.0D, 11.0D, 10.0D, 16.0D);
/*  42 */   protected static final cew r = bcs.a(5.0D, 6.0D, 0.0D, 11.0D, 10.0D, 2.0D);
/*  43 */   protected static final cew s = bcs.a(14.0D, 6.0D, 5.0D, 16.0D, 10.0D, 11.0D);
/*  44 */   protected static final cew t = bcs.a(0.0D, 6.0D, 5.0D, 2.0D, 10.0D, 11.0D);
/*     */   
/*  46 */   protected static final cew u = bcs.a(6.0D, 15.0D, 5.0D, 10.0D, 16.0D, 11.0D);
/*  47 */   protected static final cew v = bcs.a(5.0D, 15.0D, 6.0D, 11.0D, 16.0D, 10.0D);
/*  48 */   protected static final cew w = bcs.a(6.0D, 0.0D, 5.0D, 10.0D, 1.0D, 11.0D);
/*  49 */   protected static final cew x = bcs.a(5.0D, 0.0D, 6.0D, 11.0D, 1.0D, 10.0D);
/*  50 */   protected static final cew y = bcs.a(5.0D, 6.0D, 15.0D, 11.0D, 10.0D, 16.0D);
/*  51 */   protected static final cew z = bcs.a(5.0D, 6.0D, 0.0D, 11.0D, 10.0D, 1.0D);
/*  52 */   protected static final cew A = bcs.a(15.0D, 6.0D, 5.0D, 16.0D, 10.0D, 11.0D);
/*  53 */   protected static final cew B = bcs.a(0.0D, 6.0D, 5.0D, 1.0D, 10.0D, 11.0D);
/*     */   
/*     */   private final boolean E;
/*     */ 
/*     */   
/*     */   protected bdb(boolean ☃, bcs.c c1) {
/*  59 */     super(c1);
/*  60 */     v(((blc)this.m.b()).a(D, eq.c).a(a, Boolean.valueOf(false)).a(C, bly.b));
/*  61 */     this.E = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/*  66 */     return this.E ? 30 : 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  76 */     eq eq = (eq)☃.c(D);
/*  77 */     boolean bool = ((Boolean)☃.c(a)).booleanValue();
/*     */     
/*  79 */     switch (null.b[((bly)☃.c(C)).ordinal()]) {
/*     */       case 1:
/*  81 */         if (eq.k() == eq.a.a) {
/*  82 */           return bool ? w : o;
/*     */         }
/*  84 */         return bool ? x : p;
/*     */       
/*     */       case 2:
/*  87 */         switch (null.a[eq.ordinal()]) {
/*     */           case 1:
/*  89 */             return bool ? B : t;
/*     */           case 2:
/*  91 */             return bool ? A : s;
/*     */           case 3:
/*  93 */             return bool ? z : r;
/*     */         } 
/*     */         
/*  96 */         return bool ? y : q;
/*     */     } 
/*     */ 
/*     */     
/* 100 */     if (eq.k() == eq.a.a) {
/* 101 */       return bool ? u : b;
/*     */     }
/* 103 */     return bool ? v : c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 110 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 111 */       return true;
/*     */     }
/*     */     
/* 114 */     axy1.a(el1, ☃.a(a, Boolean.valueOf(true)), 3);
/*     */     
/* 116 */     a(aog1, axy1, el1, true);
/*     */     
/* 118 */     c(☃, axy1, el1);
/*     */     
/* 120 */     axy1.J().a(el1, this, a(axy1));
/*     */     
/* 122 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(@Nullable aog ☃, axz axz1, el el1, boolean bool) {
/* 126 */     axz1.a(bool ? ☃ : null, el1, a(bool), wk.e, 0.3F, bool ? 0.6F : 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract wi a(boolean paramBoolean);
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 133 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 136 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 137 */       c(☃, axy1, el1);
/*     */     }
/* 139 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/* 144 */     return ((Boolean)☃.c(a)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/* 149 */     if (((Boolean)☃.c(a)).booleanValue() && k(☃) == eq1) {
/* 150 */       return 15;
/*     */     }
/* 152 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 162 */     if (axy1.B || !((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 166 */     if (this.E) {
/* 167 */       b(☃, axy1, el1);
/*     */     } else {
/* 169 */       axy1.a(el1, ☃.a(a, Boolean.valueOf(false)), 3);
/*     */       
/* 171 */       c(☃, axy1, el1);
/*     */       
/* 173 */       a((aog)null, axy1, el1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 179 */     if (axy1.B || !this.E || ((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 183 */     b(☃, axy1, el1);
/*     */   }
/*     */   
/*     */   private void b(blc ☃, axy axy1, el el1) {
/* 187 */     List<? extends aer> list = axy1.a((Class)aok.class, ☃.g(axy1, el1).a().a(el1));
/* 188 */     boolean bool1 = !list.isEmpty();
/* 189 */     boolean bool2 = ((Boolean)☃.c(a)).booleanValue();
/*     */     
/* 191 */     if (bool1 != bool2) {
/* 192 */       axy1.a(el1, ☃.a(a, Boolean.valueOf(bool1)), 3);
/* 193 */       c(☃, axy1, el1);
/* 194 */       a((aog)null, axy1, el1, bool1);
/*     */     } 
/*     */     
/* 197 */     if (bool1) {
/* 198 */       axy1.J().a(new el(el1), this, a(axy1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(blc ☃, axy axy1, el el1) {
/* 204 */     axy1.b(el1, this);
/* 205 */     axy1.b(el1.a(k(☃).d()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 210 */     ☃.a((bmm<?>[])new bmm[] { D, a, C });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 215 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */