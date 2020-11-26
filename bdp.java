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
/*     */ 
/*     */ 
/*     */ public class bdp
/*     */   extends bcm
/*     */   implements bcz, bfv
/*     */ {
/*  30 */   public static final bmb a = bma.y;
/*     */   
/*  32 */   protected static final cew b = bcs.a(5.0D, 5.0D, 5.0D, 11.0D, 11.0D, 11.0D);
/*     */   
/*     */   public bdp(bcs.c ☃) {
/*  35 */     super(☃);
/*  36 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/*  41 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/*  46 */     return new bjo();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  56 */     return bgy.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/*  61 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  62 */       return byy.c.a(false);
/*     */     }
/*     */     
/*  65 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  70 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  71 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/*  74 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  79 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {
/*  84 */     if (ate1.s()) {
/*  85 */       bji bji = ☃.f(el1);
/*  86 */       if (bji instanceof bjg) {
/*  87 */         ((bjg)bji).a(ate1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  95 */     byw byw = ☃.k().b(☃.a());
/*  96 */     return p().a(a, Boolean.valueOf((byw.a(ww.a) && byw.g() == 8)));
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 101 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 106 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 116 */     if (((Boolean)blc1.c(a)).booleanValue()) {
/* 117 */       ☃.a(el1, blc1.a(a, Boolean.valueOf(false)), 3);
/* 118 */       return byy.c;
/*     */     } 
/* 120 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 125 */     return (!((Boolean)blc1.c(a)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 130 */     if (!((Boolean)blc1.c(a)).booleanValue() && byw1.c() == byy.c) {
/* 131 */       if (!☃.e()) {
/* 132 */         ☃.a(el1, blc1.a(a, Boolean.valueOf(true)), 3);
/* 133 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 135 */       return true;
/*     */     } 
/* 137 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */