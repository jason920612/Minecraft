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
/*     */ public class bdv
/*     */   extends bda
/*     */   implements bcv
/*     */ {
/*  21 */   public static final bmj b = bma.W;
/*     */   
/*  23 */   private static final cew[] a = new cew[] {
/*  24 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/*  25 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/*  26 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/*  27 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/*  28 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), 
/*  29 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), 
/*  30 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), 
/*  31 */       bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
/*     */     };
/*     */   
/*     */   protected bdv(bcs.c ☃) {
/*  35 */     super(☃);
/*  36 */     v(((blc)this.m.b()).a(d(), Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  41 */     return a[((Integer)☃.c(d())).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(blc ☃, axk axk1, el el1) {
/*  46 */     return (☃.c() == bct.cq);
/*     */   }
/*     */   
/*     */   public bmj d() {
/*  50 */     return b;
/*     */   }
/*     */   
/*     */   public int e() {
/*  54 */     return 7;
/*     */   }
/*     */   
/*     */   protected int k(blc ☃) {
/*  58 */     return ((Integer)☃.c(d())).intValue();
/*     */   }
/*     */   
/*     */   public blc b(int ☃) {
/*  62 */     return p().a(d(), Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean w(blc ☃) {
/*  66 */     return (((Integer)☃.c(d())).intValue() >= e());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  71 */     super.a(☃, axy1, el1, random);
/*  72 */     if (axy1.a(el1.a(), 0) >= 9) {
/*  73 */       int i = k(☃);
/*  74 */       if (i < e()) {
/*  75 */         float f = a(this, axy1, el1);
/*     */         
/*  77 */         if (random.nextInt((int)(25.0F / f) + 1) == 0) {
/*  78 */           axy1.a(el1, b(i + 1), 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1) {
/*  85 */     int i = k(blc1) + a(☃);
/*  86 */     int j = e();
/*  87 */     if (i > j) {
/*  88 */       i = j;
/*     */     }
/*  90 */     ☃.a(el1, b(i), 2);
/*     */   }
/*     */   
/*     */   protected int a(axy ☃) {
/*  94 */     return xq.a(☃.s, 2, 5);
/*     */   }
/*     */   
/*     */   protected static float a(bcs ☃, axk axk1, el el1) {
/*  98 */     float f = 1.0F;
/*     */     
/* 100 */     el el2 = el1.b();
/* 101 */     for (int i = -1; i <= 1; i++) {
/* 102 */       for (int j = -1; j <= 1; j++) {
/* 103 */         float f1 = 0.0F;
/*     */         
/* 105 */         blc blc = axk1.a_(el2.a(i, 0, j));
/* 106 */         if (blc.c() == bct.cq) {
/* 107 */           f1 = 1.0F;
/* 108 */           if (((Integer)blc.c(beq.a)).intValue() > 0) {
/* 109 */             f1 = 3.0F;
/*     */           }
/*     */         } 
/*     */         
/* 113 */         if (i != 0 || j != 0) {
/* 114 */           f1 /= 4.0F;
/*     */         }
/*     */         
/* 117 */         f += f1;
/*     */       } 
/*     */     } 
/*     */     
/* 121 */     el el3 = el1.c();
/* 122 */     el el4 = el1.d();
/* 123 */     el el5 = el1.e();
/* 124 */     el el6 = el1.f();
/*     */     
/* 126 */     boolean bool1 = (☃ == axk1.a_(el5).c() || ☃ == axk1.a_(el6).c());
/* 127 */     boolean bool2 = (☃ == axk1.a_(el3).c() || ☃ == axk1.a_(el4).c());
/*     */     
/* 129 */     if (bool1 && bool2) {
/* 130 */       f /= 2.0F;
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 136 */       boolean bool = (☃ == axk1.a_(el5.c()).c() || ☃ == axk1.a_(el6.c()).c() || ☃ == axk1.a_(el6.d()).c() || ☃ == axk1.a_(el5.d()).c());
/*     */       
/* 138 */       if (bool) {
/* 139 */         f /= 2.0F;
/*     */       }
/*     */     } 
/*     */     
/* 143 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 148 */     return ((ayc1.a(el1, 0) >= 8 || ayc1.e(el1)) && super.a(☃, ayc1, el1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected axx f() {
/* 153 */     return atf.R;
/*     */   }
/*     */ 
/*     */   
/*     */   protected axx g() {
/* 158 */     return atf.S;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 163 */     super.a(☃, axy1, el1, f, 0);
/*     */     
/* 165 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 169 */     int j = k(☃);
/* 170 */     if (j >= e()) {
/*     */       
/* 172 */       int k = 3 + i;
/* 173 */       for (int m = 0; m < k; m++) {
/* 174 */         if (axy1.s.nextInt(2 * e()) <= j)
/*     */         {
/*     */           
/* 177 */           a(axy1, el1, new ate(f()));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 184 */     if (w(☃)) {
/* 185 */       return g();
/*     */     }
/*     */     
/* 188 */     return f();
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 193 */     return new ate(f());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 198 */     return !w(blc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 203 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 208 */     a(☃, el1, blc1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 213 */     ☃.a((bmm<?>[])new bmm[] { b });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */