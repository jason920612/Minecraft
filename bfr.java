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
/*     */ public class bfr
/*     */   extends bcs
/*     */ {
/*  31 */   public static final bmj a = bma.ab;
/*  32 */   public static final bmb b = bma.s;
/*     */ 
/*     */   
/*     */   protected static boolean c;
/*     */ 
/*     */   
/*     */   public bfr(bcs.c ☃) {
/*  39 */     super(☃);
/*  40 */     v(((blc)this.m.b()).a(a, Integer.valueOf(7)).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean s(blc ☃) {
/*  45 */     return (((Integer)☃.c(a)).intValue() == 7 && !((Boolean)☃.c(b)).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(blc ☃, axy axy1, el el1, Random random) {
/*  50 */     if (!((Boolean)☃.c(b)).booleanValue() && ((Integer)☃.c(a)).intValue() == 7) {
/*  51 */       ☃.a(axy1, el1, 0);
/*  52 */       axy1.g(el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  58 */     axy1.a(el1, a(☃, axy1, el1), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(blc ☃, axk axk1, el el1) {
/*  63 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  68 */     int i = w(blc1) + 1;
/*  69 */     if (i != 1 || ((Integer)☃.c(a)).intValue() != i) {
/*  70 */       axz1.J().a(el1, this, 1);
/*     */     }
/*  72 */     return ☃;
/*     */   }
/*     */   
/*     */   private static blc a(blc ☃, axz axz1, el el1) {
/*  76 */     int i = 7;
/*  77 */     try (el.b ☃ = el.b.r()) {
/*  78 */       for (eq eq : eq.values()) {
/*  79 */         b.j(el1).d(eq);
/*  80 */         i = Math.min(i, w(axz1.a_(b)) + 1);
/*  81 */         if (i == 1) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */     } 
/*  86 */     return ☃.a(a, Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   private static int w(blc ☃) {
/*  90 */     if (wv.n.a(☃.c())) {
/*  91 */       return 0;
/*     */     }
/*  93 */     if (☃.c() instanceof bfr) {
/*  94 */       return ((Integer)☃.c(a)).intValue();
/*     */     }
/*  96 */     return 7;
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
/*     */   public int a(blc ☃, Random random) {
/* 112 */     return (random.nextInt(20) == 0) ? 1 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 117 */     bcs bcs1 = ☃.c();
/*     */     
/* 119 */     if (bcs1 == bct.ah)
/* 120 */       return bct.t; 
/* 121 */     if (bcs1 == bct.ai)
/* 122 */       return bct.u; 
/* 123 */     if (bcs1 == bct.aj)
/* 124 */       return bct.v; 
/* 125 */     if (bcs1 == bct.ak)
/* 126 */       return bct.w; 
/* 127 */     if (bcs1 == bct.al)
/* 128 */       return bct.x; 
/* 129 */     if (bcs1 == bct.am) {
/* 130 */       return bct.y;
/*     */     }
/* 132 */     return bct.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 137 */     if (!axy1.B) {
/* 138 */       int j = k(☃);
/* 139 */       if (i > 0) {
/* 140 */         j -= 2 << i;
/* 141 */         if (j < 10) {
/* 142 */           j = 10;
/*     */         }
/*     */       } 
/* 145 */       if (axy1.s.nextInt(j) == 0) {
/* 146 */         a(axy1, el1, new ate(a(☃, axy1, el1, i)));
/*     */       }
/*     */       
/* 149 */       j = 200;
/* 150 */       if (i > 0) {
/* 151 */         j -= 10 << i;
/* 152 */         if (j < 40) {
/* 153 */           j = 40;
/*     */         }
/*     */       } 
/* 156 */       a(axy1, el1, ☃, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(axy ☃, el el1, blc blc1, int i) {
/* 162 */     if ((blc1.c() == bct.ah || blc1.c() == bct.am) && ☃.s.nextInt(i) == 0) {
/* 163 */       a(☃, el1, new ate(atf.f));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected int k(blc ☃) {
/* 169 */     if (☃.c() == bct.ak) {
/* 170 */       return 40;
/*     */     }
/*     */     
/* 173 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public axl c() {
/* 182 */     return c ? axl.b : axl.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean q(blc ☃) {
/* 187 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 192 */     if (!☃.B && ate1.b() == atf.bR) {
/* 193 */       aog1.b(ws.a.b(this));
/* 194 */       aog1.a(0.005F);
/*     */ 
/*     */       
/* 197 */       a(☃, el1, new ate(this));
/*     */       
/*     */       return;
/*     */     } 
/* 201 */     super.a(☃, aog1, el1, blc1, bji1, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 206 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 211 */     return a(p().a(b, Boolean.valueOf(true)), ☃.k(), ☃.a());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bfr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */