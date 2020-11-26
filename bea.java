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
/*     */ public abstract class bea
/*     */   extends bfi
/*     */ {
/*  23 */   protected static final cew b = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*     */   
/*  25 */   public static final bmb c = bma.t;
/*     */   
/*     */   protected bea(bcs.c ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  33 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  43 */     return ayc1.a_(el1.b()).q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  48 */     if (a(axy1, el1, ☃)) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     boolean bool1 = ((Boolean)☃.c(c)).booleanValue();
/*  53 */     boolean bool2 = a(axy1, el1, ☃);
/*  54 */     if (bool1 && !bool2) {
/*  55 */       axy1.a(el1, ☃.a(c, Boolean.valueOf(false)), 2);
/*  56 */     } else if (!bool1) {
/*     */ 
/*     */       
/*  59 */       axy1.a(el1, ☃.a(c, Boolean.valueOf(true)), 2);
/*  60 */       if (!bool2) {
/*  61 */         axy1.J().a(el1, this, k(☃), ayq.c);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/*  68 */     return ☃.a(axk1, el1, eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/*  73 */     if (!((Boolean)☃.c(c)).booleanValue()) {
/*  74 */       return 0;
/*     */     }
/*     */     
/*  77 */     if (☃.c(D) == eq1) {
/*  78 */       return b(axk1, el1, ☃);
/*     */     }
/*     */     
/*  81 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/*  86 */     if (☃.a(axy1, el1)) {
/*  87 */       c(axy1, el1, ☃);
/*     */       
/*     */       return;
/*     */     } 
/*  91 */     ☃.a(axy1, el1, 0);
/*  92 */     axy1.g(el1);
/*  93 */     for (eq eq : eq.values()) {
/*  94 */       axy1.b(el1.a(eq), this);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(axy ☃, el el1, blc blc1) {
/*  99 */     if (a(☃, el1, blc1)) {
/*     */       return;
/*     */     }
/*     */     
/* 103 */     boolean bool1 = ((Boolean)blc1.c(c)).booleanValue();
/* 104 */     boolean bool2 = a(☃, el1, blc1);
/* 105 */     if (bool1 != bool2 && !☃.J().b(el1, this)) {
/* 106 */       ayq ayq = ayq.c;
/*     */ 
/*     */       
/* 109 */       if (c(☃, el1, blc1)) {
/* 110 */         ayq = ayq.a;
/* 111 */       } else if (bool1) {
/* 112 */         ayq = ayq.b;
/*     */       } 
/*     */       
/* 115 */       ☃.J().a(el1, this, k(blc1), ayq);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(ayc ☃, el el1, blc blc1) {
/* 120 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(axy ☃, el el1, blc blc1) {
/* 124 */     return (b(☃, el1, blc1) > 0);
/*     */   }
/*     */   
/*     */   protected int b(axy ☃, el el1, blc blc1) {
/* 128 */     eq eq = (eq)blc1.c(D);
/*     */     
/* 130 */     el el2 = el1.a(eq);
/* 131 */     int i = ☃.c(el2, eq);
/* 132 */     if (i >= 15) {
/* 133 */       return i;
/*     */     }
/*     */     
/* 136 */     blc blc2 = ☃.a_(el2);
/* 137 */     return Math.max(i, (blc2.c() == bct.cl) ? ((Integer)blc2.c(bgu.p)).intValue() : 0);
/*     */   }
/*     */   
/*     */   protected int b(ayc ☃, el el1, blc blc1) {
/* 141 */     eq eq1 = (eq)blc1.c(D);
/* 142 */     eq eq2 = eq1.e();
/* 143 */     eq eq3 = eq1.f();
/* 144 */     return Math.max(a(☃, el1.a(eq2), eq2), a(☃, el1.a(eq3), eq3));
/*     */   }
/*     */   
/*     */   protected int a(ayc ☃, el el1, eq eq1) {
/* 148 */     blc blc = ☃.a_(el1);
/* 149 */     bcs bcs = blc.c();
/* 150 */     if (w(blc)) {
/* 151 */       if (bcs == bct.fv) {
/* 152 */         return 15;
/*     */       }
/* 154 */       if (bcs == bct.cl) {
/* 155 */         return ((Integer)blc.c(bgu.p)).intValue();
/*     */       }
/* 157 */       return ☃.a(el1, eq1);
/*     */     } 
/*     */     
/* 160 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 165 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 170 */     return p().a(D, ☃.f().d());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 175 */     if (a(☃, el1, blc1)) {
/* 176 */       ☃.J().a(el1, this, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 182 */     d(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 187 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/*     */     
/* 191 */     super.a(☃, axy1, el1, blc1, bool);
/* 192 */     a(axy1, el1);
/* 193 */     d(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(axy ☃, el el1) {}
/*     */   
/*     */   protected void d(axy ☃, el el1, blc blc1) {
/* 200 */     eq eq = (eq)blc1.c(D);
/* 201 */     el el2 = el1.a(eq.d());
/*     */     
/* 203 */     ☃.a(el2, this, el1);
/* 204 */     ☃.a(el2, this, eq);
/*     */   }
/*     */   
/*     */   protected boolean w(blc ☃) {
/* 208 */     return ☃.m();
/*     */   }
/*     */   
/*     */   protected int b(axk ☃, el el1, blc blc1) {
/* 212 */     return 15;
/*     */   }
/*     */   
/*     */   public static boolean x(blc ☃) {
/* 216 */     return ☃.c() instanceof bea;
/*     */   }
/*     */   
/*     */   public boolean c(axk ☃, el el1, blc blc1) {
/* 220 */     eq eq = ((eq)blc1.c(D)).d();
/* 221 */     blc blc2 = ☃.a_(el1.a(eq));
/*     */     
/* 223 */     return (x(blc2) && blc2.c(D) != eq);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract int k(blc paramblc);
/*     */   
/*     */   public axl c() {
/* 230 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(blc ☃) {
/* 235 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 240 */     if (eq1 == eq.a) {
/* 241 */       return blb.a;
/*     */     }
/* 243 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */