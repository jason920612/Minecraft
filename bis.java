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
/*     */ public class bis
/*     */   extends bdw
/*     */ {
/*  20 */   public static final bmb t = bma.B;
/*     */   
/*     */   private final cew[] u;
/*     */   private final cew[] v;
/*     */   
/*     */   public bis(bcs.c ☃) {
/*  26 */     super(0.0F, 3.0F, 0.0F, 14.0F, 24.0F, ☃);
/*  27 */     v(((blc)this.m.b()).a(t, Boolean.valueOf(true)).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)).a(p, Boolean.valueOf(false)));
/*     */     
/*  29 */     this.u = a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F);
/*  30 */     this.v = a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  35 */     if (((Boolean)☃.c(t)).booleanValue()) {
/*  36 */       return this.u[k(☃)];
/*     */     }
/*  38 */     return super.a(☃, axk1, el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew f(blc ☃, axk axk1, el el1) {
/*  43 */     if (((Boolean)☃.c(t)).booleanValue()) {
/*  44 */       return this.v[k(☃)];
/*     */     }
/*  46 */     return super.f(☃, axk1, el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/*  56 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(blc ☃, blb blb1) {
/*  60 */     bcs bcs = ☃.c();
/*     */     
/*  62 */     boolean bool = (blb1 == blb.h || (blb1 == blb.f && bcs instanceof bes));
/*  63 */     return ((!f(bcs) && blb1 == blb.a) || bool);
/*     */   }
/*     */   
/*     */   public static boolean f(bcs ☃) {
/*  67 */     return (bcs.b(☃) || ☃ == bct.fU || ☃ == bct.dH || ☃ == bct.dd || ☃ == bct.di || ☃ == bct.dj || ☃ == bct.ij || ☃ == bct.cb);
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
/*     */   public blc a(ark ☃) {
/*  79 */     ayc ayc = ☃.k();
/*  80 */     el el1 = ☃.a();
/*  81 */     byw byw = ☃.k().b(☃.a());
/*     */     
/*  83 */     el el2 = el1.c();
/*  84 */     el el3 = el1.f();
/*  85 */     el el4 = el1.d();
/*  86 */     el el5 = el1.e();
/*     */     
/*  88 */     blc blc1 = ayc.a_(el2);
/*  89 */     blc blc2 = ayc.a_(el3);
/*  90 */     blc blc3 = ayc.a_(el4);
/*  91 */     blc blc4 = ayc.a_(el5);
/*     */     
/*  93 */     boolean bool1 = a(blc1, blc1.c(ayc, el2, eq.d));
/*  94 */     boolean bool2 = a(blc2, blc2.c(ayc, el3, eq.e));
/*  95 */     boolean bool3 = a(blc3, blc3.c(ayc, el4, eq.c));
/*  96 */     boolean bool4 = a(blc4, blc4.c(ayc, el5, eq.f));
/*     */     
/*  98 */     boolean bool5 = ((!bool1 || bool2 || !bool3 || bool4) && (bool1 || !bool2 || bool3 || !bool4));
/*     */     
/* 100 */     return p()
/* 101 */       .a(t, Boolean.valueOf((bool5 || !ayc.c(el1.a()))))
/* 102 */       .a(a, Boolean.valueOf(bool1))
/* 103 */       .a(b, Boolean.valueOf(bool2))
/* 104 */       .a(c, Boolean.valueOf(bool3))
/* 105 */       .a(o, Boolean.valueOf(bool4))
/* 106 */       .a(p, Boolean.valueOf((byw.c() == byy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 111 */     if (((Boolean)☃.c(p)).booleanValue()) {
/* 112 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/* 115 */     if (eq1 == eq.a) {
/* 116 */       return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */     }
/*     */     
/* 119 */     boolean bool1 = (eq1 == eq.c) ? a(blc1, blc1.c(axz1, el2, eq1.d())) : ((Boolean)☃.c(a)).booleanValue();
/* 120 */     boolean bool2 = (eq1 == eq.f) ? a(blc1, blc1.c(axz1, el2, eq1.d())) : ((Boolean)☃.c(b)).booleanValue();
/* 121 */     boolean bool3 = (eq1 == eq.d) ? a(blc1, blc1.c(axz1, el2, eq1.d())) : ((Boolean)☃.c(c)).booleanValue();
/* 122 */     boolean bool4 = (eq1 == eq.e) ? a(blc1, blc1.c(axz1, el2, eq1.d())) : ((Boolean)☃.c(o)).booleanValue();
/* 123 */     boolean bool5 = ((!bool1 || bool2 || !bool3 || bool4) && (bool1 || !bool2 || bool3 || !bool4));
/*     */     
/* 125 */     return ☃.a(t, Boolean.valueOf((bool5 || !axz1.c(el1.a())))).a(a, Boolean.valueOf(bool1)).a(b, Boolean.valueOf(bool2)).a(c, Boolean.valueOf(bool3)).a(o, Boolean.valueOf(bool4));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 130 */     ☃.a((bmm<?>[])new bmm[] { t, a, b, o, c, p });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 135 */     if (eq1 == eq.b || eq1 == eq.a) {
/* 136 */       return blb.g;
/*     */     }
/* 138 */     return blb.h;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bis.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */