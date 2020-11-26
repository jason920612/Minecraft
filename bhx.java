/*     */ import java.util.Random;
/*     */ import java.util.stream.IntStream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bhx
/*     */   extends bcs
/*     */   implements bcz, bfv
/*     */ {
/*  36 */   public static final bme a = bfi.D;
/*  37 */   public static final bmh<bmi> b = bma.Q;
/*  38 */   public static final bmh<bmq> c = bma.av;
/*  39 */   public static final bmb o = bma.y;
/*     */   
/*  41 */   protected static final cew p = bhl.o;
/*  42 */   protected static final cew q = bhl.c;
/*     */   
/*  44 */   protected static final cew r = bcs.a(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);
/*  45 */   protected static final cew s = bcs.a(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);
/*  46 */   protected static final cew t = bcs.a(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 8.0D);
/*  47 */   protected static final cew u = bcs.a(0.0D, 8.0D, 8.0D, 8.0D, 16.0D, 16.0D);
/*  48 */   protected static final cew v = bcs.a(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
/*  49 */   protected static final cew w = bcs.a(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
/*  50 */   protected static final cew x = bcs.a(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
/*  51 */   protected static final cew y = bcs.a(8.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*  53 */   protected static final cew[] z = a(p, r, v, s, w);
/*  54 */   protected static final cew[] A = a(q, t, x, u, y);
/*     */   
/*     */   private static cew[] a(cew ☃, cew cew1, cew cew2, cew cew3, cew cew4) {
/*  57 */     return (cew[])IntStream.range(0, 16).mapToObj(i -> a(i, ☃, cew1, cew2, cew3, cew4)).toArray(☃ -> new cew[☃]);
/*     */   }
/*     */   
/*     */   private static cew a(int ☃, cew cew1, cew cew2, cew cew3, cew cew4, cew cew5) {
/*  61 */     cew cew6 = cew1;
/*  62 */     if ((☃ & 0x1) != 0) {
/*  63 */       cew6 = cet.a(cew6, cew2);
/*     */     }
/*  65 */     if ((☃ & 0x2) != 0) {
/*  66 */       cew6 = cet.a(cew6, cew3);
/*     */     }
/*  68 */     if ((☃ & 0x4) != 0) {
/*  69 */       cew6 = cet.a(cew6, cew4);
/*     */     }
/*  71 */     if ((☃ & 0x8) != 0) {
/*  72 */       cew6 = cet.a(cew6, cew5);
/*     */     }
/*  74 */     return cew6;
/*     */   }
/*     */   
/*  77 */   private static final int[] B = new int[] { 12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8 };
/*     */ 
/*     */ 
/*     */   
/*     */   private final bcs C;
/*     */ 
/*     */   
/*     */   private final blc D;
/*     */ 
/*     */ 
/*     */   
/*     */   protected bhx(blc ☃, bcs.c c1) {
/*  89 */     super(c1);
/*  90 */     v(((blc)this.m.b()).a(a, eq.c).a(b, bmi.b).a(c, bmq.a).a(o, Boolean.valueOf(false)));
/*  91 */     this.C = ☃.c();
/*  92 */     this.D = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(blc ☃, axk axk1, el el1) {
/*  97 */     return axk1.K();
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/* 102 */     return ((☃.c(b) == bmi.a) ? z : A)[B[w(☃)]];
/*     */   }
/*     */   
/*     */   private int w(blc ☃) {
/* 106 */     return ((bmq)☃.c(c)).ordinal() * 4 + ((eq)☃.c(a)).b();
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 111 */     if (eq1.k() == eq.a.b) {
/* 112 */       return (((eq1 == eq.b) ? true : false) == ((blc1.c(b) == bmi.a) ? true : false)) ? blb.a : blb.i;
/*     */     }
/*     */     
/* 115 */     bmq bmq = (bmq)blc1.c(c);
/* 116 */     if (bmq == bmq.d || bmq == bmq.e) {
/* 117 */       return blb.i;
/*     */     }
/*     */     
/* 120 */     eq eq2 = (eq)blc1.c(a);
/* 121 */     switch (null.a[bmq.ordinal()]) {
/*     */       case 1:
/* 123 */         return (eq2 == eq1) ? blb.a : blb.i;
/*     */       case 2:
/* 125 */         return (eq2 == eq1 || eq2 == eq1.e()) ? blb.a : blb.i;
/*     */       case 3:
/* 127 */         return (eq2 == eq1 || eq2 == eq1.f()) ? blb.a : blb.i;
/*     */     } 
/*     */     
/* 130 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 135 */     return false;
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
/*     */   public void a(blc ☃, axy axy1, el el1, aog aog1) {
/* 150 */     this.D.a(axy1, el1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axz ☃, el el1, blc blc1) {
/* 155 */     this.C.b(☃, el1, blc1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float k() {
/* 165 */     return this.C.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 170 */     return this.C.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/* 175 */     return this.C.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 180 */     return this.C.j();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(blc ☃) {
/* 185 */     return this.C.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 190 */     if (☃.c() == ☃.c()) {
/*     */       return;
/*     */     }
/* 193 */     this.D.a(axy1, el1, bct.a, el1);
/* 194 */     this.C.a(this.D, axy1, el1, blc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 199 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 202 */     this.D.a(axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, aer aer1) {
/* 212 */     this.C.a(☃, el1, aer1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/* 217 */     this.C.a(☃, axy1, el1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 222 */     return this.D.a(axy1, el1, aog1, adk1, eq.a, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, axr axr1) {
/* 227 */     this.C.a(☃, el1, axr1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(blc ☃) {
/* 232 */     return (☃.c(b) == bmi.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 237 */     eq eq = ☃.l();
/* 238 */     byw byw = ☃.k().b(☃.a());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     blc blc1 = p().a(a, ☃.f()).a(b, (eq == eq.a || (eq != eq.b && ☃.n() > 0.5D)) ? bmi.a : bmi.b).a(o, Boolean.valueOf((byw.c() == byy.c)));
/*     */     
/* 245 */     return blc1.a(c, m(blc1, ☃.k(), ☃.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 250 */     if (((Boolean)☃.c(o)).booleanValue()) {
/* 251 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/* 253 */     if (eq1.k().c()) {
/* 254 */       return ☃.a(c, m(☃, axz1, el1));
/*     */     }
/* 256 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */   
/*     */   private static bmq m(blc ☃, axk axk1, el el1) {
/* 260 */     eq eq = (eq)☃.c(a);
/* 261 */     blc blc1 = axk1.a_(el1.a(eq));
/* 262 */     if (k(blc1) && ☃.c(b) == blc1.c(b)) {
/* 263 */       eq eq1 = (eq)blc1.c(a);
/* 264 */       if (eq1.k() != ((eq)☃.c(a)).k() && d(☃, axk1, el1, eq1.d())) {
/* 265 */         if (eq1 == eq.f()) {
/* 266 */           return bmq.d;
/*     */         }
/* 268 */         return bmq.e;
/*     */       } 
/*     */     } 
/*     */     
/* 272 */     blc blc2 = axk1.a_(el1.a(eq.d()));
/* 273 */     if (k(blc2) && ☃.c(b) == blc2.c(b)) {
/* 274 */       eq eq1 = (eq)blc2.c(a);
/* 275 */       if (eq1.k() != ((eq)☃.c(a)).k() && d(☃, axk1, el1, eq1)) {
/* 276 */         if (eq1 == eq.f()) {
/* 277 */           return bmq.b;
/*     */         }
/* 279 */         return bmq.c;
/*     */       } 
/*     */     } 
/*     */     
/* 283 */     return bmq.a;
/*     */   }
/*     */   
/*     */   private static boolean d(blc ☃, axk axk1, el el1, eq eq1) {
/* 287 */     blc blc1 = axk1.a_(el1.a(eq1));
/* 288 */     return (!k(blc1) || blc1.c(a) != ☃.c(a) || blc1.c(b) != ☃.c(b));
/*     */   }
/*     */   
/*     */   public static boolean k(blc ☃) {
/* 292 */     return ☃.c() instanceof bhx;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 297 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 302 */     eq eq = (eq)☃.c(a);
/* 303 */     bmq bmq = (bmq)☃.c(c);
/* 304 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 306 */         if (eq.k() == eq.a.c) {
/* 307 */           switch (null.a[bmq.ordinal()]) {
/*     */             case 2:
/* 309 */               return ☃.a(bhb.c).a(c, bmq.c);
/*     */             case 3:
/* 311 */               return ☃.a(bhb.c).a(c, bmq.b);
/*     */             case 4:
/* 313 */               return ☃.a(bhb.c).a(c, bmq.e);
/*     */             case 5:
/* 315 */               return ☃.a(bhb.c).a(c, bmq.d);
/*     */           } 
/* 317 */           return ☃.a(bhb.c);
/*     */         } 
/*     */         break;
/*     */       
/*     */       case 2:
/* 322 */         if (eq.k() == eq.a.a) {
/* 323 */           switch (null.a[bmq.ordinal()]) {
/*     */             case 2:
/* 325 */               return ☃.a(bhb.c).a(c, bmq.b);
/*     */             case 3:
/* 327 */               return ☃.a(bhb.c).a(c, bmq.c);
/*     */             case 4:
/* 329 */               return ☃.a(bhb.c).a(c, bmq.e);
/*     */             case 5:
/* 331 */               return ☃.a(bhb.c).a(c, bmq.d);
/*     */             case 1:
/* 333 */               return ☃.a(bhb.c);
/*     */           } 
/*     */         
/*     */         }
/*     */         break;
/*     */     } 
/*     */     
/* 340 */     return super.a(☃, bfz1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 345 */     ☃.a((bmm<?>[])new bmm[] { a, b, c, o });
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 350 */     if (((Boolean)blc1.c(o)).booleanValue()) {
/* 351 */       ☃.a(el1, blc1.a(o, Boolean.valueOf(false)), 3);
/* 352 */       return byy.c;
/*     */     } 
/* 354 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 359 */     if (((Boolean)☃.c(o)).booleanValue()) {
/* 360 */       return byy.c.a(false);
/*     */     }
/* 362 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 367 */     return (!((Boolean)blc1.c(o)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 372 */     if (!((Boolean)blc1.c(o)).booleanValue() && byw1.c() == byy.c) {
/* 373 */       if (!☃.e()) {
/* 374 */         ☃.a(el1, blc1.a(o, Boolean.valueOf(true)), 3);
/* 375 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 377 */       return true;
/*     */     } 
/* 379 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 384 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */