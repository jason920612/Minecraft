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
/*     */ public class bfo
/*     */   extends bcs
/*     */   implements bfv
/*     */ {
/*  26 */   public static final bmj a = bma.Y;
/*     */ 
/*     */   
/*  29 */   protected static final cew b = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);
/*     */   
/*     */   protected bfo(bcs.c ☃) {
/*  32 */     super(☃);
/*  33 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  43 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  49 */     byw byw = ☃.k().b(☃.a());
/*  50 */     if (byw.a(ww.a) && byw.g() == 8) {
/*  51 */       return a(☃.k());
/*     */     }
/*  53 */     return null;
/*     */   }
/*     */   
/*     */   public blc a(axz ☃) {
/*  57 */     return p().a(a, Integer.valueOf(☃.m().nextInt(25)));
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/*  62 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  67 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/*  72 */     return byy.c.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  77 */     if (!☃.a(axy1, el1)) {
/*  78 */       axy1.a(el1, true);
/*     */       
/*     */       return;
/*     */     } 
/*  82 */     el el2 = el1.a();
/*  83 */     blc blc1 = axy1.a_(el2);
/*  84 */     if (blc1.c() == bct.A && ((Integer)☃.c(a)).intValue() < 25 && random.nextDouble() < 0.14D) {
/*  85 */       axy1.a(el2, ☃.a(a));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  91 */     el el2 = el1.b();
/*  92 */     blc blc1 = ayc1.a_(el2);
/*  93 */     bcs bcs1 = blc1.c();
/*  94 */     if (bcs1 == bct.ik) {
/*  95 */       return false;
/*     */     }
/*     */     
/*  98 */     return (bcs1 == this || bcs1 == bct.jD || bcs.a(blc1.h(ayc1, el2), eq.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 103 */     if (!☃.a(axz1, el1)) {
/* 104 */       if (eq1 == eq.a) {
/* 105 */         return bct.a.p();
/*     */       }
/* 107 */       axz1.J().a(el1, this, 1);
/*     */     } 
/*     */     
/* 110 */     if (eq1 == eq.b && blc1.c() == this) {
/* 111 */       return bct.jD.p();
/*     */     }
/*     */     
/* 114 */     axz1.I().a(el1, byy.c, byy.c.a(axz1));
/* 115 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 120 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 125 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 130 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */