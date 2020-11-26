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
/*     */ public class bdi
/*     */   extends bcs
/*     */ {
/*  26 */   public static final bmj a = bma.V;
/*     */   
/*     */   private final bdj b;
/*     */   
/*     */   protected bdi(bdj ☃, bcs.c c1) {
/*  31 */     super(c1);
/*  32 */     this.b = ☃;
/*  33 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  38 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  43 */     if (!☃.a(axy1, el1)) {
/*  44 */       axy1.a(el1, true);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  49 */     el el2 = el1.a();
/*  50 */     if (!axy1.c(el2) || el2.p() >= 256) {
/*     */       return;
/*     */     }
/*     */     
/*  54 */     int i = ((Integer)☃.c(a)).intValue();
/*  55 */     if (i >= 5) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     boolean bool1 = false;
/*  60 */     boolean bool2 = false;
/*     */     
/*  62 */     blc blc1 = axy1.a_(el1.b());
/*  63 */     bcs bcs1 = blc1.c();
/*  64 */     if (bcs1 == bct.eg) {
/*  65 */       bool1 = true;
/*  66 */     } else if (bcs1 == this.b) {
/*  67 */       int j = 1;
/*  68 */       for (int k = 0; k < 4; k++) {
/*  69 */         bcs bcs2 = axy1.a_(el1.c(j + 1)).c();
/*  70 */         if (bcs2 == this.b) {
/*  71 */           j++;
/*     */         } else {
/*  73 */           if (bcs2 == bct.eg) {
/*  74 */             bool2 = true;
/*     */           }
/*     */           break;
/*     */         } 
/*     */       } 
/*  79 */       if (j < 2 || j <= random.nextInt(bool2 ? 5 : 4)) {
/*  80 */         bool1 = true;
/*     */       }
/*  82 */     } else if (blc1.f()) {
/*  83 */       bool1 = true;
/*     */     } 
/*     */     
/*  86 */     if (bool1 && a(axy1, el2, (eq)null) && axy1.c(el1.b(2))) {
/*  87 */       axy1.a(el1, this.b.a(axy1, el1), 2);
/*  88 */       b(axy1, el2, i);
/*  89 */     } else if (i < 4) {
/*  90 */       int j = random.nextInt(4);
/*  91 */       if (bool2) {
/*  92 */         j++;
/*     */       }
/*     */       
/*  95 */       boolean bool = false;
/*  96 */       for (int k = 0; k < j; k++) {
/*  97 */         eq eq = eq.c.a.a(random);
/*  98 */         el el3 = el1.a(eq);
/*  99 */         if (axy1.c(el3) && axy1.c(el3.b()) && a(axy1, el3, eq.d())) {
/* 100 */           b(axy1, el3, i + 1);
/* 101 */           bool = true;
/*     */         } 
/*     */       } 
/*     */       
/* 105 */       if (bool) {
/* 106 */         axy1.a(el1, this.b.a(axy1, el1), 2);
/*     */       } else {
/* 108 */         a(axy1, el1);
/*     */       } 
/*     */     } else {
/* 111 */       a(axy1, el1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(axy ☃, el el1, int i) {
/* 116 */     ☃.a(el1, p().a(a, Integer.valueOf(i)), 2);
/* 117 */     ☃.b(1033, el1, 0);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1) {
/* 121 */     ☃.a(el1, p().a(a, Integer.valueOf(5)), 2);
/* 122 */     ☃.b(1034, el1, 0);
/*     */   }
/*     */   
/*     */   private static boolean a(ayc ☃, el el1, @Nullable eq eq1) {
/* 126 */     for (eq eq2 : eq.c.a) {
/* 127 */       if (eq2 != eq1 && !☃.c(el1.a(eq2))) {
/* 128 */         return false;
/*     */       }
/*     */     } 
/* 131 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 141 */     if (eq1 != eq.b && !☃.a(axz1, el1)) {
/* 142 */       axz1.J().a(el1, this, 1);
/*     */     }
/*     */     
/* 145 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 150 */     blc blc1 = ayc1.a_(el1.b());
/* 151 */     bcs bcs1 = blc1.c();
/* 152 */     if (bcs1 == this.b || bcs1 == bct.eg) {
/* 153 */       return true;
/*     */     }
/* 155 */     if (!blc1.f()) {
/* 156 */       return false;
/*     */     }
/*     */     
/* 159 */     boolean bool = false;
/* 160 */     for (eq eq : eq.c.a) {
/* 161 */       blc blc2 = ayc1.a_(el1.a(eq));
/* 162 */       if (blc2.c() == this.b) {
/* 163 */         if (bool) {
/* 164 */           return false;
/*     */         }
/* 166 */         bool = true; continue;
/* 167 */       }  if (!blc2.f()) {
/* 168 */         return false;
/*     */       }
/*     */     } 
/* 171 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/* 176 */     super.a(☃, aog1, el1, blc1, bji1, ate1);
/*     */     
/* 178 */     a(☃, el1, new ate(this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ate t(blc ☃) {
/* 187 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 192 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 197 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */   
/*     */   public static void a(axz ☃, el el1, Random random, int i) {
/* 201 */     ☃.a(el1, ((bdj)bct.hY).a(☃, el1), 2);
/* 202 */     a(☃, el1, random, el1, i, 0);
/*     */   }
/*     */   
/*     */   private static void a(axz ☃, el el1, Random random, el el2, int i, int j) {
/* 206 */     bdj bdj1 = (bdj)bct.hY;
/*     */     
/* 208 */     int k = random.nextInt(4) + 1;
/* 209 */     if (j == 0) {
/* 210 */       k++;
/*     */     }
/*     */     
/* 213 */     for (int m = 0; m < k; m++) {
/* 214 */       el el3 = el1.b(m + 1);
/* 215 */       if (!a(☃, el3, (eq)null)) {
/*     */         return;
/*     */       }
/*     */       
/* 219 */       ☃.a(el3, bdj1.a(☃, el3), 2);
/* 220 */       ☃.a(el3.b(), bdj1.a(☃, el3.b()), 2);
/*     */     } 
/*     */     
/* 223 */     boolean bool = false;
/* 224 */     if (j < 4) {
/* 225 */       int n = random.nextInt(4);
/* 226 */       if (j == 0) {
/* 227 */         n++;
/*     */       }
/* 229 */       for (int i1 = 0; i1 < n; i1++) {
/* 230 */         eq eq = eq.c.a.a(random);
/* 231 */         el el3 = el1.b(k).a(eq);
/* 232 */         if (Math.abs(el3.o() - el2.o()) < i && Math.abs(el3.q() - el2.q()) < i)
/*     */         {
/*     */           
/* 235 */           if (☃.c(el3) && ☃.c(el3.b()) && a(☃, el3, eq.d())) {
/* 236 */             bool = true;
/* 237 */             ☃.a(el3, bdj1.a(☃, el3), 2);
/* 238 */             ☃.a(el3.a(eq.d()), bdj1.a(☃, el3.a(eq.d())), 2);
/* 239 */             a(☃, el3, random, el2, i, j + 1);
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/* 244 */     if (!bool) {
/* 245 */       ☃.a(el1.b(k), bct.hZ.p().a(a, Integer.valueOf(5)), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 251 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */