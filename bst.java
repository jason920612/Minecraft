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
/*     */ public class bst
/*     */   extends bpa<brz>
/*     */ {
/*  20 */   private static final blc a = bct.O.p();
/*  21 */   private static final blc b = bct.am.p();
/*     */   
/*     */   public bst(boolean ☃) {
/*  24 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Set<el> ☃, axz axz1, Random random, el el1) {
/*  29 */     int i = random.nextInt(3) + random.nextInt(2) + 6;
/*     */     
/*  31 */     int j = el1.o();
/*  32 */     int k = el1.p();
/*  33 */     int m = el1.q();
/*     */     
/*  35 */     if (k < 1 || k + i + 1 >= 256) {
/*  36 */       return false;
/*     */     }
/*     */     
/*  39 */     el el2 = el1.b();
/*  40 */     bcs bcs = axz1.a_(el2).c();
/*  41 */     if (bcs != bct.i && !bcs.d(bcs)) {
/*  42 */       return false;
/*     */     }
/*     */     
/*  45 */     if (!a(axz1, el1, i)) {
/*  46 */       return false;
/*     */     }
/*     */     
/*  49 */     a(axz1, el2);
/*  50 */     a(axz1, el2.f());
/*  51 */     a(axz1, el2.d());
/*  52 */     a(axz1, el2.d().f());
/*     */     
/*  54 */     eq eq = eq.c.a.a(random);
/*  55 */     int n = i - random.nextInt(4);
/*  56 */     int i1 = 2 - random.nextInt(3);
/*     */     
/*  58 */     int i2 = j;
/*  59 */     int i3 = m;
/*  60 */     int i4 = k + i - 1;
/*     */     
/*     */     int i5;
/*  63 */     for (i5 = 0; i5 < i; i5++) {
/*  64 */       if (i5 >= n && i1 > 0) {
/*  65 */         i2 += eq.g();
/*  66 */         i3 += eq.i();
/*  67 */         i1--;
/*     */       } 
/*     */       
/*  70 */       int i6 = k + i5;
/*  71 */       el el3 = new el(i2, i6, i3);
/*  72 */       blc blc1 = axz1.a_(el3);
/*  73 */       if (blc1.f() || blc1.a(wv.A)) {
/*  74 */         a(☃, axz1, el3);
/*  75 */         a(☃, axz1, el3.f());
/*  76 */         a(☃, axz1, el3.d());
/*  77 */         a(☃, axz1, el3.f().d());
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  82 */     for (i5 = -2; i5 <= 0; i5++) {
/*  83 */       for (int i6 = -2; i6 <= 0; i6++) {
/*  84 */         int i7 = -1;
/*  85 */         a(axz1, i2 + i5, i4 + i7, i3 + i6);
/*  86 */         a(axz1, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  87 */         a(axz1, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  88 */         a(axz1, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*  89 */         if ((i5 > -2 || i6 > -1) && (i5 != -1 || i6 != -2)) {
/*     */ 
/*     */           
/*  92 */           i7 = 1;
/*  93 */           a(axz1, i2 + i5, i4 + i7, i3 + i6);
/*  94 */           a(axz1, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  95 */           a(axz1, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  96 */           a(axz1, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*     */         } 
/*     */       } 
/*  99 */     }  if (random.nextBoolean()) {
/* 100 */       a(axz1, i2, i4 + 2, i3);
/* 101 */       a(axz1, i2 + 1, i4 + 2, i3);
/* 102 */       a(axz1, i2 + 1, i4 + 2, i3 + 1);
/* 103 */       a(axz1, i2, i4 + 2, i3 + 1);
/*     */     } 
/* 105 */     for (i5 = -3; i5 <= 4; i5++) {
/* 106 */       for (int i6 = -3; i6 <= 4; i6++) {
/* 107 */         if ((i5 != -3 || i6 != -3) && (i5 != -3 || i6 != 4) && (i5 != 4 || i6 != -3) && (i5 != 4 || i6 != 4))
/*     */         {
/*     */           
/* 110 */           if (Math.abs(i5) < 3 || Math.abs(i6) < 3)
/*     */           {
/*     */             
/* 113 */             a(axz1, i2 + i5, i4, i3 + i6);
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/* 118 */     for (i5 = -1; i5 <= 2; i5++) {
/* 119 */       for (int i6 = -1; i6 <= 2; i6++) {
/* 120 */         if (i5 < 0 || i5 > 1 || i6 < 0 || i6 > 1)
/*     */         {
/*     */           
/* 123 */           if (random.nextInt(3) <= 0) {
/*     */ 
/*     */             
/* 126 */             int i7 = random.nextInt(3) + 2; int i8;
/* 127 */             for (i8 = 0; i8 < i7; i8++) {
/* 128 */               a(☃, axz1, new el(j + i5, i4 - i8 - 1, m + i6));
/*     */             }
/* 130 */             for (i8 = -1; i8 <= 1; i8++) {
/* 131 */               for (int i9 = -1; i9 <= 1; i9++) {
/* 132 */                 a(axz1, i2 + i5 + i8, i4, i3 + i6 + i9);
/*     */               }
/*     */             } 
/* 135 */             for (i8 = -2; i8 <= 2; i8++) {
/* 136 */               for (int i9 = -2; i9 <= 2; i9++) {
/* 137 */                 if (Math.abs(i8) != 2 || Math.abs(i9) != 2)
/*     */                 {
/*     */                   
/* 140 */                   a(axz1, i2 + i5 + i8, i4 - 1, i3 + i6 + i9); } 
/*     */               } 
/*     */             } 
/*     */           }  } 
/*     */       } 
/*     */     } 
/* 146 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1, int i) {
/* 150 */     int j = el1.o();
/* 151 */     int k = el1.p();
/* 152 */     int m = el1.q();
/*     */     
/* 154 */     el.a a = new el.a();
/* 155 */     for (int n = 0; n <= i + 1; n++) {
/* 156 */       int i1 = 1;
/* 157 */       if (n == 0) {
/* 158 */         i1 = 0;
/*     */       }
/* 160 */       if (n >= i - 1) {
/* 161 */         i1 = 2;
/*     */       }
/*     */       
/* 164 */       for (int i2 = -i1; i2 <= i1; i2++) {
/* 165 */         for (int i3 = -i1; i3 <= i1; i3++) {
/* 166 */           if (!a(☃.a_(a.c(j + i2, k + n, m + i3)).c())) {
/* 167 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 172 */     return true;
/*     */   }
/*     */   
/*     */   private void a(Set<el> ☃, axz axz1, el el1) {
/* 176 */     if (a(axz1.a_(el1).c())) {
/* 177 */       a(☃, axz1, el1, a);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(axz ☃, int i, int j, int k) {
/* 182 */     el el = new el(i, j, k);
/*     */     
/* 184 */     if (☃.a_(el).f())
/* 185 */       a(☃, el, b); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bst.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */