/*     */ import java.util.Random;
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
/*     */ public class bcy
/*     */   extends bcs
/*     */   implements bcz
/*     */ {
/*  27 */   public static final bmb a = bma.d;
/*     */   
/*     */   public bcy(bcs.c ☃) {
/*  30 */     super(☃);
/*  31 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  36 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/*  41 */     blc blc1 = axy1.a_(el1.a());
/*  42 */     if (blc1.f()) {
/*  43 */       aer1.j(((Boolean)☃.c(a)).booleanValue());
/*     */       
/*  45 */       if (!axy1.B) {
/*  46 */         td td = (td)axy1;
/*  47 */         for (int i = 0; i < 2; i++) {
/*  48 */           td.a(fm.R, (el1.o() + axy1.s.nextFloat()), (el1.p() + 1), (el1.q() + axy1.s.nextFloat()), 1, 0.0D, 0.0D, 0.0D, 1.0D);
/*  49 */           td.a(fm.e, (el1.o() + axy1.s.nextFloat()), (el1.p() + 1), (el1.q() + axy1.s.nextFloat()), 1, 0.0D, 0.01D, 0.0D, 0.2D);
/*     */         } 
/*     */       } 
/*     */     } else {
/*  53 */       aer1.k(((Boolean)☃.c(a)).booleanValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  59 */     a(axy1, el1.a(), a(axy1, el1.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  64 */     a(axy1, el1.a(), a(axy1, el1));
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/*  69 */     return byy.c.a(false);
/*     */   }
/*     */   
/*     */   public static void a(axz ☃, el el1, boolean bool) {
/*  73 */     if (a(☃, el1)) {
/*  74 */       ☃.a(el1, bct.B.p().a(a, Boolean.valueOf(bool)), 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(axz ☃, el el1) {
/*  79 */     byw byw = ☃.b(el1);
/*  80 */     return (☃.a_(el1).c() == bct.A && byw.g() >= 8 && byw.d());
/*     */   }
/*     */   
/*     */   private static boolean a(axk ☃, el el1) {
/*  84 */     blc blc = ☃.a_(el1);
/*  85 */     bcs bcs1 = blc.c();
/*     */     
/*  87 */     if (bcs1 == bct.B) {
/*  88 */       return ((Boolean)blc.c(a)).booleanValue();
/*     */     }
/*     */     
/*  91 */     return (bcs1 != bct.df);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/*  96 */     return 5;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 121 */     if (!☃.a(axz1, el1)) {
/* 122 */       return bct.A.p();
/*     */     }
/*     */     
/* 125 */     if (eq1 == eq.a) {
/* 126 */       axz1.a(el1, bct.B.p().a(a, Boolean.valueOf(a(axz1, el2))), 2);
/* 127 */     } else if (eq1 == eq.b && blc1.c() != bct.B && a(axz1, el2)) {
/* 128 */       axz1.J().a(el1, this, a(axz1));
/*     */     } 
/*     */     
/* 131 */     axz1.I().a(el1, byy.c, byy.c.a(axz1));
/* 132 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 137 */     bcs bcs1 = ayc1.a_(el1.b()).c();
/*     */     
/* 139 */     return (bcs1 == bct.B || bcs1 == bct.ik || bcs1 == bct.df);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 144 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 149 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 154 */     return axl.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 159 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 164 */     return bgy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 169 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 174 */     ☃.a(el1, bct.a.p(), 11);
/* 175 */     return byy.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bcy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */