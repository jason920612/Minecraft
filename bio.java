/*     */ import com.google.common.base.MoreObjects;
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
/*     */ public class bio
/*     */   extends bcs
/*     */ {
/*  29 */   public static final bme a = bfi.D;
/*  30 */   public static final bmb b = bma.t;
/*  31 */   public static final bmb c = bma.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   protected static final cew o = bcs.a(5.0D, 0.0D, 10.0D, 11.0D, 10.0D, 16.0D);
/*  38 */   protected static final cew p = bcs.a(5.0D, 0.0D, 0.0D, 11.0D, 10.0D, 6.0D);
/*  39 */   protected static final cew q = bcs.a(10.0D, 0.0D, 5.0D, 16.0D, 10.0D, 11.0D);
/*  40 */   protected static final cew r = bcs.a(0.0D, 0.0D, 5.0D, 6.0D, 10.0D, 11.0D);
/*     */   
/*     */   public bio(bcs.c ☃) {
/*  43 */     super(☃);
/*  44 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  49 */     switch (null.a[((eq)☃.c(a)).ordinal()])
/*     */     
/*     */     { default:
/*  52 */         return r;
/*     */       case 2:
/*  54 */         return q;
/*     */       case 3:
/*  56 */         return p;
/*     */       case 4:
/*  58 */         break; }  return o;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  69 */     eq eq = (eq)☃.c(a);
/*  70 */     el el2 = el1.a(eq.d());
/*  71 */     blc blc1 = ayc1.a_(el2);
/*  72 */     boolean bool = b(blc1.c());
/*  73 */     return (!bool && eq.k().c() && blc1.c(ayc1, el2, eq) == blb.a && !blc1.m());
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  78 */     if (eq1.d() == ☃.c(a) && !☃.a(axz1, el1)) {
/*  79 */       return bct.a.p();
/*     */     }
/*  81 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  87 */     blc blc = p().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
/*     */     
/*  89 */     ayc ayc = ☃.k();
/*  90 */     el el = ☃.a();
/*     */     
/*  92 */     eq[] arrayOfEq = ☃.e();
/*  93 */     for (eq eq : arrayOfEq) {
/*  94 */       if (eq.k().c()) {
/*     */ 
/*     */ 
/*     */         
/*  98 */         eq eq1 = eq.d();
/*     */         
/* 100 */         blc = blc.a(a, eq1);
/* 101 */         if (blc.a(ayc, el)) {
/* 102 */           return blc;
/*     */         }
/*     */       } 
/*     */     } 
/* 106 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 111 */     a(☃, el1, blc1, false, false, -1, (blc)null);
/*     */   }
/*     */   public void a(axy ☃, el el1, blc blc1, boolean bool1, boolean bool2, int i, @Nullable blc blc2) {
/*     */     int m;
/* 115 */     eq eq = (eq)blc1.c(a);
/* 116 */     int j = ((Boolean)blc1.c(c)).booleanValue();
/* 117 */     boolean bool3 = ((Boolean)blc1.c(b)).booleanValue();
/*     */     
/* 119 */     boolean bool4 = !bool1;
/* 120 */     boolean bool5 = false;
/* 121 */     int n = 0;
/*     */     
/* 123 */     blc[] arrayOfBlc = new blc[42];
/* 124 */     for (int i1 = 1; i1 < 42; i1++) {
/* 125 */       el el2 = el1.a(eq, i1);
/* 126 */       blc blc4 = ☃.a_(el2);
/*     */       
/* 128 */       if (blc4.c() == bct.en) {
/* 129 */         if (blc4.c(a) == eq.d()) {
/* 130 */           n = i1;
/*     */         }
/*     */         break;
/*     */       } 
/* 134 */       if (blc4.c() == bct.eo || i1 == i) {
/* 135 */         if (i1 == i) {
/* 136 */           blc4 = (blc)MoreObjects.firstNonNull(blc2, blc4);
/*     */         }
/* 138 */         boolean bool6 = !((Boolean)blc4.c(bin.c)).booleanValue();
/* 139 */         boolean bool7 = ((Boolean)blc4.c(bin.a)).booleanValue();
/* 140 */         m = bool5 | ((bool6 && bool7) ? 1 : 0);
/*     */         
/* 142 */         arrayOfBlc[i1] = blc4;
/*     */         
/* 144 */         if (i1 == i) {
/* 145 */           ☃.J().a(el1, this, a(☃));
/* 146 */           bool4 &= bool6;
/*     */         } 
/*     */       } else {
/* 149 */         arrayOfBlc[i1] = null;
/* 150 */         bool4 = false;
/*     */       } 
/*     */     } 
/*     */     
/* 154 */     int k = bool4 & ((n > 1) ? 1 : 0);
/* 155 */     m &= k;
/* 156 */     blc blc3 = p().a(c, Boolean.valueOf(k)).a(b, Boolean.valueOf(m));
/*     */     
/* 158 */     if (n > 0) {
/* 159 */       el el2 = el1.a(eq, n);
/* 160 */       eq eq1 = eq.d();
/* 161 */       ☃.a(el2, blc3.a(a, eq1), 3);
/* 162 */       a(☃, el2, eq1);
/*     */       
/* 164 */       a(☃, el2, k, m, j, bool3);
/*     */     } 
/*     */     
/* 167 */     a(☃, el1, k, m, j, bool3);
/*     */     
/* 169 */     if (!bool1) {
/* 170 */       ☃.a(el1, blc3.a(a, eq), 3);
/* 171 */       if (bool2) {
/* 172 */         a(☃, el1, eq);
/*     */       }
/*     */     } 
/*     */     
/* 176 */     if (j != k) {
/* 177 */       for (int i2 = 1; i2 < n; i2++) {
/* 178 */         el el2 = el1.a(eq, i2);
/* 179 */         blc blc4 = arrayOfBlc[i2];
/* 180 */         if (blc4 != null) {
/*     */ 
/*     */ 
/*     */           
/* 184 */           ☃.a(el2, blc4.a(c, Boolean.valueOf(k)), 3);
/* 185 */           if (!☃.a_(el2).f());
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 193 */     a(axy1, el1, ☃, false, true, -1, (blc)null);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 197 */     if (bool2 && !bool4) {
/* 198 */       ☃.a((aog)null, el1, wj.jR, wk.e, 0.4F, 0.6F);
/* 199 */     } else if (!bool2 && bool4) {
/* 200 */       ☃.a((aog)null, el1, wj.jQ, wk.e, 0.4F, 0.5F);
/* 201 */     } else if (bool1 && !bool3) {
/* 202 */       ☃.a((aog)null, el1, wj.jP, wk.e, 0.4F, 0.7F);
/* 203 */     } else if (!bool1 && bool3) {
/* 204 */       ☃.a((aog)null, el1, wj.jS, wk.e, 0.4F, 1.2F / (☃.s.nextFloat() * 0.2F + 0.9F));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, eq eq1) {
/* 209 */     ☃.b(el1, this);
/* 210 */     ☃.b(el1.a(eq1.d()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 215 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 218 */     boolean bool1 = ((Boolean)☃.c(c)).booleanValue();
/* 219 */     boolean bool2 = ((Boolean)☃.c(b)).booleanValue();
/*     */     
/* 221 */     if (bool1 || bool2) {
/* 222 */       a(axy1, el1, ☃, true, false, -1, (blc)null);
/*     */     }
/*     */     
/* 225 */     if (bool2) {
/* 226 */       axy1.b(el1, this);
/* 227 */       axy1.b(el1.a(((eq)☃.c(a)).d()), this);
/*     */     } 
/*     */     
/* 230 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/* 235 */     return ((Boolean)☃.c(b)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/* 240 */     if (!((Boolean)☃.c(b)).booleanValue()) {
/* 241 */       return 0;
/*     */     }
/*     */     
/* 244 */     if (☃.c(a) == eq1) {
/* 245 */       return 15;
/*     */     }
/*     */     
/* 248 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 253 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 258 */     return axl.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 263 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 268 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 273 */     ☃.a((bmm<?>[])new bmm[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 278 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */