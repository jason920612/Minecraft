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
/*     */ public class ber
/*     */   extends bdw
/*     */ {
/*     */   private final cew[] t;
/*     */   
/*     */   public ber(bcs.c ☃) {
/*  26 */     super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, ☃);
/*  27 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)).a(p, Boolean.valueOf(false)));
/*     */     
/*  29 */     this.t = a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew g(blc ☃, axk axk1, el el1) {
/*  34 */     return this.t[k(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  39 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(blc ☃, blb blb1) {
/*  48 */     bcs bcs = ☃.c();
/*     */     
/*  50 */     boolean bool = (blb1 == blb.f && (☃.d() == this.k || bcs instanceof bes));
/*  51 */     return ((!f(bcs) && blb1 == blb.a) || bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean f(bcs ☃) {
/*  56 */     return (bcs.b(☃) || ☃ == bct.fU || ☃ == bct.dH || ☃ == bct.dd || ☃ == bct.di || ☃ == bct.dj || ☃ == bct.ij || ☃ == bct.cb);
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
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  68 */     if (axy1.B) {
/*  69 */       ate ate = aog1.b(adk1);
/*  70 */       return (ate.b() == atf.ec || ate.a());
/*     */     } 
/*     */     
/*  73 */     return ath.a(aog1, axy1, el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  78 */     axk axk = ☃.k();
/*  79 */     el el1 = ☃.a();
/*  80 */     byw byw = ☃.k().b(☃.a());
/*     */ 
/*     */     
/*  83 */     el el2 = el1.c();
/*  84 */     el el3 = el1.f();
/*  85 */     el el4 = el1.d();
/*  86 */     el el5 = el1.e();
/*     */     
/*  88 */     blc blc1 = axk.a_(el2);
/*  89 */     blc blc2 = axk.a_(el3);
/*  90 */     blc blc3 = axk.a_(el4);
/*  91 */     blc blc4 = axk.a_(el5);
/*     */     
/*  93 */     return super.a(☃)
/*  94 */       .a(a, Boolean.valueOf(a(blc1, blc1.c(axk, el2, eq.d))))
/*  95 */       .a(b, Boolean.valueOf(a(blc2, blc2.c(axk, el3, eq.e))))
/*  96 */       .a(c, Boolean.valueOf(a(blc3, blc3.c(axk, el4, eq.c))))
/*  97 */       .a(o, Boolean.valueOf(a(blc4, blc4.c(axk, el5, eq.f))))
/*  98 */       .a(p, Boolean.valueOf((byw.c() == byy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 103 */     if (((Boolean)☃.c(p)).booleanValue()) {
/* 104 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/* 106 */     if (eq1.k().d() == eq.c.a) {
/* 107 */       return ☃.a(q.get(eq1), Boolean.valueOf(a(blc1, blc1.c(axz1, el2, eq1.d()))));
/*     */     }
/* 109 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 114 */     ☃.a((bmm<?>[])new bmm[] { a, b, o, c, p });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 119 */     if (eq1 == eq.b || eq1 == eq.a) {
/* 120 */       return blb.e;
/*     */     }
/* 122 */     return blb.f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */