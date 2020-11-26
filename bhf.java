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
/*     */ public class bhf
/*     */   extends bda
/*     */   implements bcv, bcz, bfv
/*     */ {
/*  27 */   public static final bmj a = bma.ak;
/*  28 */   public static final bmb b = bma.y;
/*     */   
/*  30 */   protected static final cew c = bcs.a(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
/*  31 */   protected static final cew o = bcs.a(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);
/*  32 */   protected static final cew p = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D);
/*  33 */   protected static final cew q = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D);
/*     */   
/*     */   protected bhf(bcs.c ☃) {
/*  36 */     super(☃);
/*  37 */     v(((blc)this.m.b()).a(a, Integer.valueOf(1)).a(b, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m(blc ☃) {
/*  42 */     return k(☃) ? 0 : (super.m(☃) + 3 * ((Integer)☃.c(a)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  48 */     blc blc = ☃.k().a_(☃.a());
/*  49 */     if (blc.c() == this) {
/*  50 */       return blc.a(a, Integer.valueOf(Math.min(4, ((Integer)blc.c(a)).intValue() + 1)));
/*     */     }
/*     */     
/*  53 */     byw byw = ☃.k().b(☃.a());
/*  54 */     boolean bool = (byw.a(ww.a) && byw.g() == 8);
/*  55 */     return super.a(☃).a(b, Boolean.valueOf(bool));
/*     */   }
/*     */   
/*     */   private boolean k(blc ☃) {
/*  59 */     return !((Boolean)☃.c(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(blc ☃, axk axk1, el el1) {
/*  64 */     return !☃.h(axk1, el1).a(eq.b).b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  69 */     el el2 = el1.b();
/*  70 */     return b(ayc1.a_(el2), ayc1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  75 */     if (!☃.a(axz1, el1)) {
/*  76 */       return bct.a.p();
/*     */     }
/*     */     
/*  79 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  80 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/*  83 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ark ark1) {
/*  88 */     if (ark1.i().b() == h() && ((Integer)☃.c(a)).intValue() < 4) {
/*  89 */       return true;
/*     */     }
/*  91 */     return super.a(☃, ark1);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  96 */     switch (((Integer)☃.c(a)).intValue())
/*     */     
/*     */     { default:
/*  99 */         return c;
/*     */       case 2:
/* 101 */         return o;
/*     */       case 3:
/* 103 */         return p;
/*     */       case 4:
/* 105 */         break; }  return q;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 111 */     if (((Boolean)blc1.c(b)).booleanValue()) {
/* 112 */       ☃.a(el1, blc1.a(b, Boolean.valueOf(false)), 3);
/* 113 */       return byy.c;
/*     */     } 
/* 115 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 120 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 121 */       return byy.c.a(false);
/*     */     }
/*     */     
/* 124 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 129 */     return (!((Boolean)blc1.c(b)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 134 */     if (!((Boolean)blc1.c(b)).booleanValue() && byw1.c() == byy.c) {
/* 135 */       if (!☃.e()) {
/* 136 */         ☃.a(el1, blc1.a(b, Boolean.valueOf(true)), 3);
/* 137 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 139 */       return true;
/*     */     } 
/* 141 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 146 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 151 */     return ((Integer)☃.c(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/* 161 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 166 */     if (!k(blc1) && ☃.a_(el1.b()).a(wv.I)) {
/* 167 */       int i = 5;
/* 168 */       int j = 1;
/* 169 */       int k = 2;
/* 170 */       int m = 0;
/*     */       
/* 172 */       int n = el1.o() - 2;
/* 173 */       int i1 = 0;
/*     */       
/* 175 */       for (int i2 = 0; i2 < 5; i2++) {
/* 176 */         for (int i3 = 0; i3 < j; i3++) {
/* 177 */           int i4 = 2 + el1.p() - 1;
/* 178 */           for (int i5 = i4 - 2; i5 < i4; i5++) {
/* 179 */             el el2 = new el(n + i2, i5, el1.q() - i1 + i3);
/* 180 */             if (el2 != el1)
/*     */             {
/*     */ 
/*     */               
/* 184 */               if (random.nextInt(6) == 0 && ☃.a_(el2).c() == bct.A) {
/* 185 */                 blc blc2 = ☃.a_(el2.b());
/* 186 */                 if (blc2.a(wv.I)) {
/* 187 */                   ☃.a(el2, bct.kn.p().a(a, Integer.valueOf(random.nextInt(4) + 1)), 3);
/*     */                 }
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/* 193 */         if (m < 2) {
/* 194 */           j += 2;
/* 195 */           i1++;
/*     */         } else {
/* 197 */           j -= 2;
/* 198 */           i1--;
/*     */         } 
/* 200 */         m++;
/*     */       } 
/*     */       
/* 203 */       ☃.a(el1, blc1.a(a, Integer.valueOf(4)), 2);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */