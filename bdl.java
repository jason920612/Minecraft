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
/*     */ public class bdl
/*     */   extends bfi
/*     */   implements bcv
/*     */ {
/*  26 */   public static final bmj a = bma.T;
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
/*  38 */   protected static final cew[] b = new cew[] {
/*  39 */       bcs.a(11.0D, 7.0D, 6.0D, 15.0D, 12.0D, 10.0D), 
/*  40 */       bcs.a(9.0D, 5.0D, 5.0D, 15.0D, 12.0D, 11.0D), 
/*  41 */       bcs.a(7.0D, 3.0D, 4.0D, 15.0D, 12.0D, 12.0D)
/*     */     };
/*     */   
/*  44 */   protected static final cew[] c = new cew[] {
/*  45 */       bcs.a(1.0D, 7.0D, 6.0D, 5.0D, 12.0D, 10.0D), 
/*  46 */       bcs.a(1.0D, 5.0D, 5.0D, 7.0D, 12.0D, 11.0D), 
/*  47 */       bcs.a(1.0D, 3.0D, 4.0D, 9.0D, 12.0D, 12.0D)
/*     */     };
/*     */   
/*  50 */   protected static final cew[] o = new cew[] {
/*  51 */       bcs.a(6.0D, 7.0D, 1.0D, 10.0D, 12.0D, 5.0D), 
/*  52 */       bcs.a(5.0D, 5.0D, 1.0D, 11.0D, 12.0D, 7.0D), 
/*  53 */       bcs.a(4.0D, 3.0D, 1.0D, 12.0D, 12.0D, 9.0D)
/*     */     };
/*     */   
/*  56 */   protected static final cew[] p = new cew[] {
/*  57 */       bcs.a(6.0D, 7.0D, 11.0D, 10.0D, 12.0D, 15.0D), 
/*  58 */       bcs.a(5.0D, 5.0D, 9.0D, 11.0D, 12.0D, 15.0D), 
/*  59 */       bcs.a(4.0D, 3.0D, 7.0D, 12.0D, 12.0D, 15.0D)
/*     */     };
/*     */   
/*     */   public bdl(bcs.c ☃) {
/*  63 */     super(☃);
/*  64 */     v(((blc)this.m.b()).a(D, eq.c).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  69 */     if (axy1.s.nextInt(5) == 0) {
/*  70 */       int i = ((Integer)☃.c(a)).intValue();
/*  71 */       if (i < 2) {
/*  72 */         axy1.a(el1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  79 */     bcs bcs = ayc1.a_(el1.a((eq)☃.c(D))).c();
/*  80 */     return bcs.a(wv.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  90 */     int i = ((Integer)☃.c(a)).intValue();
/*  91 */     switch (null.a[((eq)☃.c(D)).ordinal()])
/*     */     { case 1:
/*  93 */         return p[i];
/*     */       
/*     */       default:
/*  96 */         return o[i];
/*     */       case 3:
/*  98 */         return c[i];
/*     */       case 4:
/* 100 */         break; }  return b[i];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/* 107 */     blc blc = p();
/*     */     
/* 109 */     ayc ayc = ☃.k();
/* 110 */     el el = ☃.a();
/*     */     
/* 112 */     for (eq eq : ☃.e()) {
/* 113 */       if (eq.k().c()) {
/* 114 */         blc = blc.a(D, eq);
/* 115 */         if (blc.a(ayc, el)) {
/* 116 */           return blc;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 121 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 126 */     if (eq1 == ☃.c(D) && !☃.a(axz1, el1)) {
/* 127 */       return bct.a.p();
/*     */     }
/*     */     
/* 130 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 135 */     int j = ((Integer)☃.c(a)).intValue();
/* 136 */     int k = 1;
/* 137 */     if (j >= 2) {
/* 138 */       k = 3;
/*     */     }
/* 140 */     for (int m = 0; m < k; m++) {
/* 141 */       a(axy1, el1, new ate(atf.bt));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 147 */     return new ate(atf.bt);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 152 */     return (((Integer)blc1.c(a)).intValue() < 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 162 */     ☃.a(el1, blc1.a(a, Integer.valueOf(((Integer)blc1.c(a)).intValue() + 1)), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 167 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 172 */     ☃.a((bmm<?>[])new bmm[] { D, a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 177 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */