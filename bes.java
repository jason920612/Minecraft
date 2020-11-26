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
/*     */ public class bes
/*     */   extends bfi
/*     */ {
/*  21 */   public static final bmb a = bma.r;
/*  22 */   public static final bmb b = bma.t;
/*  23 */   public static final bmb c = bma.n;
/*     */   
/*  25 */   protected static final cew o = bcs.a(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
/*  26 */   protected static final cew p = bcs.a(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
/*     */   
/*  28 */   protected static final cew q = bcs.a(0.0D, 0.0D, 6.0D, 16.0D, 13.0D, 10.0D);
/*  29 */   protected static final cew r = bcs.a(6.0D, 0.0D, 0.0D, 10.0D, 13.0D, 16.0D);
/*     */   
/*  31 */   protected static final cew s = bcs.a(0.0D, 0.0D, 6.0D, 16.0D, 24.0D, 10.0D);
/*  32 */   protected static final cew t = bcs.a(6.0D, 0.0D, 0.0D, 10.0D, 24.0D, 16.0D);
/*     */   
/*  34 */   protected static final cew u = cet.a(
/*  35 */       bcs.a(0.0D, 5.0D, 7.0D, 2.0D, 16.0D, 9.0D), 
/*  36 */       bcs.a(14.0D, 5.0D, 7.0D, 16.0D, 16.0D, 9.0D));
/*     */   
/*  38 */   protected static final cew v = cet.a(
/*  39 */       bcs.a(7.0D, 5.0D, 0.0D, 9.0D, 16.0D, 2.0D), 
/*  40 */       bcs.a(7.0D, 5.0D, 14.0D, 9.0D, 16.0D, 16.0D));
/*     */ 
/*     */   
/*  43 */   protected static final cew w = cet.a(
/*  44 */       bcs.a(0.0D, 2.0D, 7.0D, 2.0D, 13.0D, 9.0D), 
/*  45 */       bcs.a(14.0D, 2.0D, 7.0D, 16.0D, 13.0D, 9.0D));
/*     */   
/*  47 */   protected static final cew x = cet.a(
/*  48 */       bcs.a(7.0D, 2.0D, 0.0D, 9.0D, 13.0D, 2.0D), 
/*  49 */       bcs.a(7.0D, 2.0D, 14.0D, 9.0D, 13.0D, 16.0D));
/*     */ 
/*     */   
/*     */   public bes(bcs.c ☃) {
/*  53 */     super(☃);
/*     */     
/*  55 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  60 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  61 */       return (((eq)☃.c(D)).k() == eq.a.a) ? r : q;
/*     */     }
/*  63 */     return (((eq)☃.c(D)).k() == eq.a.a) ? p : o;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  68 */     eq.a a = eq1.k();
/*  69 */     if (((eq)☃.c(D)).e().k() == a) {
/*  70 */       boolean bool = (k(blc1) || k(axz1.a_(el1.a(eq1.d()))));
/*  71 */       return ☃.a(c, Boolean.valueOf(bool));
/*     */     } 
/*     */     
/*  74 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew f(blc ☃, axk axk1, el el1) {
/*  79 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  80 */       return cet.a();
/*     */     }
/*  82 */     return (((eq)☃.c(D)).k() == eq.a.c) ? s : t;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew g(blc ☃, axk axk1, el el1) {
/*  87 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  88 */       return (((eq)☃.c(D)).k() == eq.a.a) ? x : w;
/*     */     }
/*  90 */     return (((eq)☃.c(D)).k() == eq.a.a) ? v : u;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  95 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 100 */     switch (null.a[cbf1.ordinal()]) {
/*     */       case 1:
/* 102 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */       case 2:
/* 104 */         return false;
/*     */       case 3:
/* 106 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */     } 
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 114 */     axy axy = ☃.k();
/* 115 */     el el = ☃.a();
/*     */     
/* 117 */     boolean bool1 = axy.t(el);
/* 118 */     eq eq = ☃.f();
/*     */     
/* 120 */     eq.a a = eq.k();
/*     */     
/* 122 */     boolean bool2 = ((a == eq.a.c && (k(axy.a_(el.e())) || k(axy.a_(el.f())))) || (a == eq.a.a && (k(axy.a_(el.c())) || k(axy.a_(el.d())))));
/* 123 */     return p().a(D, eq).a(a, Boolean.valueOf(bool1)).a(b, Boolean.valueOf(bool1)).a(c, Boolean.valueOf(bool2));
/*     */   }
/*     */   
/*     */   private boolean k(blc ☃) {
/* 127 */     return (☃.c() == bct.ev || ☃.c() == bct.ew);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 132 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 133 */       ☃ = ☃.a(a, Boolean.valueOf(false));
/* 134 */       axy1.a(el1, ☃, 10);
/*     */     } else {
/*     */       
/* 137 */       eq eq2 = aog1.bA();
/* 138 */       if (☃.c(D) == eq2.d()) {
/* 139 */         ☃ = ☃.a(D, eq2);
/*     */       }
/* 141 */       ☃ = ☃.a(a, Boolean.valueOf(true));
/* 142 */       axy1.a(el1, ☃, 10);
/*     */     } 
/*     */     
/* 145 */     axy1.a(aog1, ((Boolean)☃.c(a)).booleanValue() ? 1008 : 1014, el1, 0);
/* 146 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 151 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 155 */     boolean bool = axy1.t(el1);
/* 156 */     if (((Boolean)☃.c(b)).booleanValue() != bool) {
/* 157 */       axy1.a(el1, ☃.a(b, Boolean.valueOf(bool)).a(a, Boolean.valueOf(bool)), 2);
/* 158 */       if (((Boolean)☃.c(a)).booleanValue() != bool) {
/* 159 */         axy1.a((aog)null, bool ? 1008 : 1014, el1, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 166 */     ☃.a((bmm<?>[])new bmm[] { D, a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 171 */     if (eq1 == eq.b || eq1 == eq.a) {
/* 172 */       return blb.i;
/*     */     }
/* 174 */     return (((eq)blc1.c(D)).k() == eq1.e().k()) ? blb.f : blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */