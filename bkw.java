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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bkw
/*     */   extends beb
/*     */ {
/*  30 */   public static final bmh<bml> b = bma.at;
/*  31 */   public static final bmb c = bma.u;
/*     */ 
/*     */ 
/*     */   
/*  35 */   protected static final cew o = bcs.a(12.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  36 */   protected static final cew p = bcs.a(0.0D, 0.0D, 0.0D, 4.0D, 16.0D, 16.0D);
/*  37 */   protected static final cew q = bcs.a(0.0D, 0.0D, 12.0D, 16.0D, 16.0D, 16.0D);
/*  38 */   protected static final cew r = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 4.0D);
/*  39 */   protected static final cew s = bcs.a(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  40 */   protected static final cew t = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   protected static final cew u = bcs.a(6.0D, -4.0D, 6.0D, 10.0D, 12.0D, 10.0D);
/*  47 */   protected static final cew v = bcs.a(6.0D, 4.0D, 6.0D, 10.0D, 20.0D, 10.0D);
/*  48 */   protected static final cew w = bcs.a(6.0D, 6.0D, -4.0D, 10.0D, 10.0D, 12.0D);
/*  49 */   protected static final cew x = bcs.a(6.0D, 6.0D, 4.0D, 10.0D, 10.0D, 20.0D);
/*  50 */   protected static final cew y = bcs.a(-4.0D, 6.0D, 6.0D, 12.0D, 10.0D, 10.0D);
/*  51 */   protected static final cew z = bcs.a(4.0D, 6.0D, 6.0D, 20.0D, 10.0D, 10.0D);
/*     */   
/*  53 */   protected static final cew A = bcs.a(6.0D, 0.0D, 6.0D, 10.0D, 12.0D, 10.0D);
/*  54 */   protected static final cew B = bcs.a(6.0D, 4.0D, 6.0D, 10.0D, 16.0D, 10.0D);
/*  55 */   protected static final cew C = bcs.a(6.0D, 6.0D, 0.0D, 10.0D, 10.0D, 12.0D);
/*  56 */   protected static final cew D = bcs.a(6.0D, 6.0D, 4.0D, 10.0D, 10.0D, 16.0D);
/*  57 */   protected static final cew E = bcs.a(0.0D, 6.0D, 6.0D, 12.0D, 10.0D, 10.0D);
/*  58 */   protected static final cew F = bcs.a(4.0D, 6.0D, 6.0D, 16.0D, 10.0D, 10.0D);
/*     */   
/*     */   public bkw(bcs.c ☃) {
/*  61 */     super(☃);
/*  62 */     v(((blc)this.m.b()).a(a, eq.c).a(b, bml.a).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */   
/*     */   private cew k(blc ☃) {
/*  66 */     switch (null.a[((eq)☃.c(a)).ordinal()])
/*     */     
/*     */     { default:
/*  69 */         return t;
/*     */       case 2:
/*  71 */         return s;
/*     */       case 3:
/*  73 */         return r;
/*     */       case 4:
/*  75 */         return q;
/*     */       case 5:
/*  77 */         return p;
/*     */       case 6:
/*  79 */         break; }  return o;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  85 */     return cet.a(k(☃), w(☃));
/*     */   }
/*     */   
/*     */   private cew w(blc ☃) {
/*  89 */     boolean bool = ((Boolean)☃.c(c)).booleanValue();
/*  90 */     switch (null.a[((eq)☃.c(a)).ordinal()])
/*     */     
/*     */     { default:
/*  93 */         return bool ? B : v;
/*     */       case 2:
/*  95 */         return bool ? A : u;
/*     */       case 3:
/*  97 */         return bool ? D : x;
/*     */       case 4:
/*  99 */         return bool ? C : w;
/*     */       case 5:
/* 101 */         return bool ? F : z;
/*     */       case 6:
/* 103 */         break; }  return bool ? E : y;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean r(blc ☃) {
/* 109 */     return (☃.c(a) == eq.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/* 114 */     if (!☃.B && aog1.bV.d) {
/* 115 */       el el2 = el1.a(((eq)blc1.c(a)).d());
/* 116 */       bcs bcs = ☃.a_(el2).c();
/* 117 */       if (bcs == bct.aW || bcs == bct.aP) {
/* 118 */         ☃.g(el2);
/*     */       }
/*     */     } 
/* 121 */     super.a(☃, el1, blc1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 126 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 129 */     super.a(☃, axy1, el1, blc1, bool);
/* 130 */     eq eq = ((eq)☃.c(a)).d();
/* 131 */     el1 = el1.a(eq);
/*     */     
/* 133 */     blc blc2 = axy1.a_(el1);
/* 134 */     if ((blc2.c() == bct.aW || blc2.c() == bct.aP) && (
/* 135 */       (Boolean)blc2.c(bkv.b)).booleanValue()) {
/* 136 */       blc2.a(axy1, el1, 0);
/* 137 */       axy1.g(el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 144 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 149 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 154 */     if (eq1.d() == ☃.c(a) && 
/* 155 */       !☃.a(axz1, el1)) {
/* 156 */       return bct.a.p();
/*     */     }
/*     */     
/* 159 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 164 */     bcs bcs = ayc1.a_(el1.a(((eq)☃.c(a)).d())).c();
/* 165 */     return (bcs == bct.aW || bcs == bct.aP || bcs == bct.bo);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 170 */     if (☃.a(axy1, el1)) {
/* 171 */       el el3 = el1.a(((eq)☃.c(a)).d());
/* 172 */       axy1.a_(el3).a(axy1, el3, bcs1, el2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 178 */     return new ate((blc1.c(b) == bml.b) ? bct.aP : bct.aW);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 183 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 188 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 193 */     ☃.a((bmm<?>[])new bmm[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 198 */     if (eq1 == blc1.c(a)) {
/* 199 */       return blb.a;
/*     */     }
/* 201 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 206 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */