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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bho
/*     */   extends bcs
/*     */ {
/*  35 */   public static final bmj a = bma.ae;
/*     */   
/*  37 */   protected static final cew[] b = new cew[] {
/*  38 */       cet.a(), 
/*  39 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/*  40 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/*  41 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/*  42 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/*  43 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), 
/*  44 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), 
/*  45 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), 
/*  46 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   protected bho(bcs.c ☃) {
/*  52 */     super(☃);
/*  53 */     v(((blc)this.m.b()).a(a, Integer.valueOf(1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/*  58 */     switch (null.a[cbf1.ordinal()]) {
/*     */       case 1:
/*  60 */         return (((Integer)☃.c(a)).intValue() < 5);
/*     */       case 2:
/*  62 */         return false;
/*     */       case 3:
/*  64 */         return false;
/*     */     } 
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  72 */     return (((Integer)☃.c(a)).intValue() == 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  77 */     if (eq1 == eq.a) {
/*  78 */       return blb.a;
/*     */     }
/*  80 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  85 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   public cew f(blc ☃, axk axk1, el el1) {
/*  90 */     return b[((Integer)☃.c(a)).intValue() - 1];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  95 */     blc blc1 = ayc1.a_(el1.b());
/*  96 */     bcs bcs1 = blc1.c();
/*     */     
/*  98 */     if (bcs1 == bct.cR || bcs1 == bct.gp || bcs1 == bct.fU) {
/*  99 */       return false;
/*     */     }
/*     */     
/* 102 */     blb blb = blc1.c(ayc1, el1.b(), eq.b);
/* 103 */     return (blb == blb.a || blc1.a(wv.A) || (bcs1 == this && ((Integer)blc1.c(a)).intValue() == 8));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 108 */     if (!☃.a(axz1, el1)) {
/* 109 */       return bct.a.p();
/*     */     }
/* 111 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 116 */     Integer integer = (Integer)blc1.c(a);
/* 117 */     if (X_() && awg.a(awi.t, ate1) > 0) {
/* 118 */       if (integer.intValue() == 8) {
/* 119 */         a(☃, el1, new ate(bct.cS));
/*     */       } else {
/* 121 */         for (int i = 0; i < integer.intValue(); i++) {
/* 122 */           a(☃, el1, t(blc1));
/*     */         }
/*     */       } 
/*     */     } else {
/* 126 */       a(☃, el1, new ate(atf.aC, integer.intValue()));
/*     */     } 
/*     */     
/* 129 */     ☃.g(el1);
/*     */     
/* 131 */     aog1.b(ws.a.b(this));
/* 132 */     aog1.a(0.005F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 138 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 143 */     if (axy1.a(ayi.b, el1) > 11) {
/* 144 */       ☃.a(axy1, el1, 0);
/* 145 */       axy1.g(el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ark ark1) {
/* 151 */     int i = ((Integer)☃.c(a)).intValue();
/*     */     
/* 153 */     if (ark1.i().b() == h() && i < 8) {
/* 154 */       if (ark1.c()) {
/* 155 */         return (ark1.l() == eq.b);
/*     */       }
/* 157 */       return true;
/*     */     } 
/*     */     
/* 160 */     return (i == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/* 166 */     blc blc = ☃.k().a_(☃.a());
/* 167 */     if (blc.c() == this) {
/* 168 */       int i = ((Integer)blc.c(a)).intValue();
/* 169 */       return blc.a(a, Integer.valueOf(Math.min(8, i + 1)));
/*     */     } 
/*     */     
/* 172 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 177 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean X_() {
/* 182 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */