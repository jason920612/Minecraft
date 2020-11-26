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
/*     */ public class bft
/*     */   extends beo
/*     */ {
/*  25 */   public static final bmb a = bma.t;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  31 */   protected static final cew b = bcs.a(5.0D, 4.0D, 10.0D, 11.0D, 12.0D, 16.0D);
/*  32 */   protected static final cew c = bcs.a(5.0D, 4.0D, 0.0D, 11.0D, 12.0D, 6.0D);
/*  33 */   protected static final cew o = bcs.a(10.0D, 4.0D, 5.0D, 16.0D, 12.0D, 11.0D);
/*  34 */   protected static final cew p = bcs.a(0.0D, 4.0D, 5.0D, 6.0D, 12.0D, 11.0D);
/*     */   
/*  36 */   protected static final cew q = bcs.a(5.0D, 0.0D, 4.0D, 11.0D, 6.0D, 12.0D);
/*  37 */   protected static final cew r = bcs.a(4.0D, 0.0D, 5.0D, 12.0D, 6.0D, 11.0D);
/*     */   
/*  39 */   protected static final cew s = bcs.a(5.0D, 10.0D, 4.0D, 11.0D, 16.0D, 12.0D);
/*  40 */   protected static final cew t = bcs.a(4.0D, 10.0D, 5.0D, 12.0D, 16.0D, 11.0D);
/*     */   
/*     */   protected bft(bcs.c ☃) {
/*  43 */     super(☃);
/*  44 */     v(((blc)this.m.b()).a(D, eq.c).a(a, Boolean.valueOf(false)).a(C, bly.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  54 */     switch (null.c[((bly)☃.c(C)).ordinal()]) {
/*     */       case 1:
/*  56 */         switch (null.a[((eq)☃.c(D)).k().ordinal()]) {
/*     */           case 1:
/*  58 */             return r;
/*     */         } 
/*     */         
/*  61 */         return q;
/*     */       
/*     */       case 2:
/*  64 */         switch (null.b[((eq)☃.c(D)).ordinal()]) {
/*     */           case 1:
/*  66 */             return p;
/*     */           case 2:
/*  68 */             return o;
/*     */           case 3:
/*  70 */             return c;
/*     */         } 
/*     */         
/*  73 */         return b;
/*     */     } 
/*     */ 
/*     */     
/*  77 */     switch (null.a[((eq)☃.c(D)).k().ordinal()]) {
/*     */       case 1:
/*  79 */         return t;
/*     */     } 
/*     */     
/*  82 */     return s;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  89 */     ☃ = ☃.a(a);
/*  90 */     boolean bool = ((Boolean)☃.c(a)).booleanValue();
/*     */     
/*  92 */     if (axy1.B) {
/*  93 */       if (bool) {
/*  94 */         a(☃, axy1, el1, 1.0F);
/*     */       }
/*     */       
/*  97 */       return true;
/*     */     } 
/*     */     
/* 100 */     axy1.a(el1, ☃, 3);
/*     */     
/* 102 */     float f = bool ? 0.6F : 0.5F;
/* 103 */     axy1.a((aog)null, el1, wj.eP, wk.e, 0.3F, f);
/*     */     
/* 105 */     b(☃, axy1, el1);
/*     */     
/* 107 */     return true;
/*     */   }
/*     */   
/*     */   private static void a(blc ☃, axz axz1, el el1, float f) {
/* 111 */     eq eq1 = ((eq)☃.c(D)).d();
/* 112 */     eq eq2 = k(☃).d();
/* 113 */     double d1 = el1.o() + 0.5D + 0.1D * eq1.g() + 0.2D * eq2.g();
/* 114 */     double d2 = el1.p() + 0.5D + 0.1D * eq1.h() + 0.2D * eq2.h();
/* 115 */     double d3 = el1.q() + 0.5D + 0.1D * eq1.i() + 0.2D * eq2.i();
/*     */     
/* 117 */     axz1.a(new fi(1.0F, 0.0F, 0.0F, f), d1, d2, d3, 0.0D, 0.0D, 0.0D);
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
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 129 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 132 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 133 */       b(☃, axy1, el1);
/*     */     }
/* 135 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/* 140 */     return ((Boolean)☃.c(a)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/* 145 */     if (((Boolean)☃.c(a)).booleanValue() && k(☃) == eq1) {
/* 146 */       return 15;
/*     */     }
/* 148 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 153 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(blc ☃, axy axy1, el el1) {
/* 158 */     axy1.b(el1, this);
/* 159 */     axy1.b(el1.a(k(☃).d()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 164 */     ☃.a((bmm<?>[])new bmm[] { C, D, a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 169 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */