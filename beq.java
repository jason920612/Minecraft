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
/*     */ 
/*     */ public class beq
/*     */   extends bcs
/*     */ {
/*  27 */   public static final bmj a = bma.ai;
/*  28 */   protected static final cew b = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
/*     */ 
/*     */ 
/*     */   
/*     */   protected beq(bcs.c ☃) {
/*  33 */     super(☃);
/*  34 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  39 */     if (eq1 == eq.b && !☃.a(axz1, el1)) {
/*  40 */       axz1.J().a(el1, this, 1);
/*     */     }
/*  42 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  47 */     blc blc1 = ayc1.a_(el1.a());
/*  48 */     return (!blc1.d().b() || blc1.c() instanceof bes);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  53 */     if (!p().a(☃.k(), ☃.a())) {
/*  54 */       return bct.j.p();
/*     */     }
/*  56 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(blc ☃, axk axk1, el el1) {
/*  61 */     return axk1.K();
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  66 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  76 */     if (!☃.a(axy1, el1)) {
/*  77 */       b(☃, axy1, el1);
/*     */       
/*     */       return;
/*     */     } 
/*  81 */     int i = ((Integer)☃.c(a)).intValue();
/*  82 */     if (a(axy1, el1) || axy1.w(el1.a())) {
/*  83 */       if (i < 7) {
/*  84 */         axy1.a(el1, ☃.a(a, Integer.valueOf(7)), 2);
/*     */       }
/*  86 */     } else if (i > 0) {
/*  87 */       axy1.a(el1, ☃.a(a, Integer.valueOf(i - 1)), 2);
/*  88 */     } else if (!a(axy1, el1)) {
/*  89 */       b(☃, axy1, el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, aer aer1, float f) {
/*  95 */     if (!☃.B && ☃.s.nextFloat() < f - 0.5F && aer1 instanceof afa && (
/*  96 */       aer1 instanceof aog || ☃.X().b("mobGriefing")))
/*     */     {
/*  98 */       if (aer1.H * aer1.H * aer1.I > 0.512F) {
/*  99 */         b(☃.a_(el1), ☃, el1);
/*     */       }
/*     */     }
/*     */     
/* 103 */     super.a(☃, el1, aer1, f);
/*     */   }
/*     */   
/*     */   public static void b(blc ☃, axy axy1, el el1) {
/* 107 */     axy1.a(el1, a(☃, bct.j.p(), axy1, el1));
/*     */   }
/*     */   
/*     */   private static boolean a(axk ☃, el el1) {
/* 111 */     bcs bcs1 = ☃.a_(el1.a()).c();
/* 112 */     return (bcs1 instanceof bdv || bcs1 instanceof bhz || bcs1 instanceof bcf);
/*     */   }
/*     */   
/*     */   private static boolean a(ayc ☃, el el1) {
/* 116 */     for (el.a a : el.b(el1.a(-4, 0, -4), el1.a(4, 1, 4))) {
/* 117 */       if (☃.b(a).a(ww.a)) {
/* 118 */         return true;
/*     */       }
/*     */     } 
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 126 */     return bct.j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 131 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 136 */     if (eq1 == eq.a) {
/* 137 */       return blb.a;
/*     */     }
/* 139 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 144 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\beq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */