/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class btt
/*     */   extends bpa<brz>
/*     */ {
/*  20 */   private static final blc b = bct.J.p();
/*  21 */   private static final blc c = bct.ah.p();
/*     */   
/*     */   protected final int a;
/*     */   private final boolean d;
/*     */   private final blc aH;
/*     */   private final blc aI;
/*     */   
/*     */   public btt(boolean ☃) {
/*  29 */     this(☃, 4, b, c, false);
/*     */   }
/*     */   
/*     */   public btt(boolean ☃, int i, blc blc1, blc blc2, boolean bool1) {
/*  33 */     super(☃);
/*  34 */     this.a = i;
/*  35 */     this.aH = blc1;
/*  36 */     this.aI = blc2;
/*  37 */     this.d = bool1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  42 */     int i = a(random);
/*     */     
/*  44 */     boolean bool = true;
/*  45 */     if (el1.p() < 1 || el1.p() + i + 1 > 256) {
/*  46 */       return false;
/*     */     }
/*     */     
/*  49 */     for (int j = el1.p(); j <= el1.p() + 1 + i; j++) {
/*  50 */       int i1 = 1;
/*  51 */       if (j == el1.p()) {
/*  52 */         i1 = 0;
/*     */       }
/*  54 */       if (j >= el1.p() + 1 + i - 2) {
/*  55 */         i1 = 2;
/*     */       }
/*  57 */       el.a a = new el.a();
/*  58 */       for (int i2 = el1.o() - i1; i2 <= el1.o() + i1 && bool; i2++) {
/*  59 */         for (int i3 = el1.q() - i1; i3 <= el1.q() + i1 && bool; i3++) {
/*  60 */           if (j >= 0 && j < 256) {
/*  61 */             if (!a(axz1.a_(a.c(i2, j, i3)).c())) {
/*  62 */               bool = false;
/*     */             }
/*     */           } else {
/*  65 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  71 */     if (!bool) {
/*  72 */       return false;
/*     */     }
/*     */     
/*  75 */     bcs bcs = axz1.a_(el1.b()).c();
/*  76 */     if ((bcs != bct.i && !bcs.d(bcs) && bcs != bct.cq) || el1.p() >= 256 - i - 1) {
/*  77 */       return false;
/*     */     }
/*     */     
/*  80 */     a(axz1, el1.b());
/*     */     
/*  82 */     int k = 3;
/*  83 */     int m = 0; int n;
/*  84 */     for (n = el1.p() - 3 + i; n <= el1.p() + i; n++) {
/*  85 */       int i1 = n - el1.p() + i;
/*  86 */       int i2 = 1 - i1 / 2;
/*  87 */       for (int i3 = el1.o() - i2; i3 <= el1.o() + i2; i3++) {
/*  88 */         int i4 = i3 - el1.o();
/*  89 */         for (int i5 = el1.q() - i2; i5 <= el1.q() + i2; i5++) {
/*  90 */           int i6 = i5 - el1.q();
/*  91 */           if (Math.abs(i4) != i2 || Math.abs(i6) != i2 || (random.nextInt(2) != 0 && i1 != 0)) {
/*     */ 
/*     */             
/*  94 */             el el2 = new el(i3, n, i5);
/*  95 */             blc blc1 = axz1.a_(el2);
/*  96 */             bza bza = blc1.d();
/*  97 */             if (blc1.f() || blc1.a(wv.A) || bza == bza.g)
/*  98 */               a(axz1, el2, this.aI); 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 103 */     for (n = 0; n < i; n++) {
/* 104 */       blc blc1 = axz1.a_(el1.b(n));
/* 105 */       bza bza = blc1.d();
/* 106 */       if (blc1.f() || blc1.a(wv.A) || bza == bza.g) {
/* 107 */         a(☃, axz1, el1.b(n), this.aH);
/* 108 */         if (this.d && n > 0) {
/* 109 */           if (random.nextInt(3) > 0 && axz1.c(el1.a(-1, n, 0))) {
/* 110 */             a(axz1, el1.a(-1, n, 0), biq.c);
/*     */           }
/* 112 */           if (random.nextInt(3) > 0 && axz1.c(el1.a(1, n, 0))) {
/* 113 */             a(axz1, el1.a(1, n, 0), biq.p);
/*     */           }
/* 115 */           if (random.nextInt(3) > 0 && axz1.c(el1.a(0, n, -1))) {
/* 116 */             a(axz1, el1.a(0, n, -1), biq.o);
/*     */           }
/* 118 */           if (random.nextInt(3) > 0 && axz1.c(el1.a(0, n, 1))) {
/* 119 */             a(axz1, el1.a(0, n, 1), biq.b);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 125 */     if (this.d) {
/* 126 */       for (n = el1.p() - 3 + i; n <= el1.p() + i; n++) {
/* 127 */         int i1 = n - el1.p() + i;
/* 128 */         int i2 = 2 - i1 / 2;
/* 129 */         el.a a = new el.a();
/* 130 */         for (int i3 = el1.o() - i2; i3 <= el1.o() + i2; i3++) {
/* 131 */           for (int i4 = el1.q() - i2; i4 <= el1.q() + i2; i4++) {
/* 132 */             a.c(i3, n, i4);
/*     */             
/* 134 */             if (axz1.a_(a).a(wv.A)) {
/* 135 */               el el2 = a.e();
/* 136 */               el el3 = a.f();
/* 137 */               el el4 = a.c();
/* 138 */               el el5 = a.d();
/*     */               
/* 140 */               if (random.nextInt(4) == 0 && axz1.a_(el2).f()) {
/* 141 */                 b(axz1, el2, biq.c);
/*     */               }
/* 143 */               if (random.nextInt(4) == 0 && axz1.a_(el3).f()) {
/* 144 */                 b(axz1, el3, biq.p);
/*     */               }
/* 146 */               if (random.nextInt(4) == 0 && axz1.a_(el4).f()) {
/* 147 */                 b(axz1, el4, biq.o);
/*     */               }
/* 149 */               if (random.nextInt(4) == 0 && axz1.a_(el5).f()) {
/* 150 */                 b(axz1, el5, biq.b);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 158 */       if (random.nextInt(5) == 0 && i > 5) {
/* 159 */         for (n = 0; n < 2; n++) {
/* 160 */           for (eq eq : eq.c.a) {
/* 161 */             if (random.nextInt(4 - n) == 0) {
/* 162 */               eq eq1 = eq.d();
/* 163 */               a(axz1, random.nextInt(3), el1.a(eq1.g(), i - 5 + n, eq1.i()), eq);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 170 */     return true;
/*     */   }
/*     */   
/*     */   protected int a(Random ☃) {
/* 174 */     return this.a + ☃.nextInt(3);
/*     */   }
/*     */   
/*     */   private void a(axz ☃, int i, el el1, eq eq1) {
/* 178 */     a(☃, el1, bct.ej.p().a(bdl.a, Integer.valueOf(i)).a(bdl.D, eq1));
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1, bmb bmb1) {
/* 182 */     a(☃, el1, bct.dM.p().a(bmb1, Boolean.valueOf(true)));
/*     */   }
/*     */   
/*     */   private void b(axz ☃, el el1, bmb bmb1) {
/* 186 */     a(☃, el1, bmb1);
/* 187 */     int i = 4;
/*     */     
/* 189 */     el1 = el1.b();
/* 190 */     while (☃.a_(el1).f() && i > 0) {
/* 191 */       a(☃, el1, bmb1);
/* 192 */       el1 = el1.b();
/* 193 */       i--;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */