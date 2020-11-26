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
/*     */ public class bdc
/*     */   extends bcs
/*     */ {
/*  25 */   public static final bmj a = bma.X;
/*     */ 
/*     */   
/*  28 */   protected static final cew b = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
/*  29 */   protected static final cew c = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
/*     */   
/*     */   protected bdc(bcs.c ☃) {
/*  32 */     super(☃);
/*  33 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  38 */     if (!☃.a(axy1, el1)) {
/*  39 */       axy1.a(el1, true);
/*     */       
/*     */       return;
/*     */     } 
/*  43 */     el el2 = el1.a();
/*  44 */     if (!axy1.c(el2)) {
/*     */       return;
/*     */     }
/*     */     
/*  48 */     int i = 1;
/*  49 */     while (axy1.a_(el1.c(i)).c() == this) {
/*  50 */       i++;
/*     */     }
/*     */ 
/*     */     
/*  54 */     if (i >= 3) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     int j = ((Integer)☃.c(a)).intValue();
/*  59 */     if (j == 15) {
/*  60 */       axy1.a(el2, p());
/*  61 */       blc blc1 = ☃.a(a, Integer.valueOf(0));
/*  62 */       axy1.a(el1, blc1, 4);
/*  63 */       blc1.a(axy1, el2, this, el1);
/*     */     } else {
/*  65 */       axy1.a(el1, ☃.a(a, Integer.valueOf(j + 1)), 4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public cew f(blc ☃, axk axk1, el el1) {
/*  71 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  76 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(blc ☃) {
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  91 */     if (!☃.a(axz1, el1)) {
/*  92 */       axz1.J().a(el1, this, 1);
/*     */     }
/*     */     
/*  95 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 100 */     for (eq eq : eq.c.a) {
/* 101 */       blc blc1 = ayc1.a_(el1.a(eq));
/* 102 */       bza bza = blc1.d();
/*     */       
/* 104 */       if (bza.b() || ayc1.b(el1.a(eq)).a(ww.b)) {
/* 105 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 109 */     bcs bcs1 = ayc1.a_(el1.b()).c();
/* 110 */     return ((bcs1 == bct.cT || bcs1 == bct.D || bcs1 == bct.E) && !ayc1.a_(el1.a()).d().a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 115 */     aer1.a(aea.j, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 120 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 125 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 130 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 135 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */