/*     */ import java.util.Map;
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
/*     */ public class bdw
/*     */   extends bcs
/*     */   implements bcz, bfv
/*     */ {
/*  21 */   public static final bmb a = bgj.a;
/*  22 */   public static final bmb b = bgj.b;
/*  23 */   public static final bmb c = bgj.c;
/*  24 */   public static final bmb o = bgj.o; protected static final Map<eq, bmb> q;
/*  25 */   public static final bmb p = bma.y; static {
/*  26 */     q = (Map<eq, bmb>)bgj.r.entrySet().stream().filter(☃ -> ((eq)☃.getKey()).k().c()).collect(k.a());
/*     */   }
/*     */   protected final cew[] r;
/*     */   protected final cew[] s;
/*     */   
/*     */   protected bdw(float ☃, float f1, float f2, float f3, float f4, bcs.c c1) {
/*  32 */     super(c1);
/*     */     
/*  34 */     this.r = a(☃, f1, f4, 0.0F, f4);
/*  35 */     this.s = a(☃, f1, f2, 0.0F, f3);
/*     */   }
/*     */   
/*     */   protected cew[] a(float ☃, float f1, float f2, float f3, float f4) {
/*  39 */     float f5 = 8.0F - ☃;
/*  40 */     float f6 = 8.0F + ☃;
/*     */     
/*  42 */     float f7 = 8.0F - f1;
/*  43 */     float f8 = 8.0F + f1;
/*     */     
/*  45 */     cew cew1 = bcs.a(f5, 0.0D, f5, f6, f2, f6);
/*  46 */     cew cew2 = bcs.a(f7, f3, 0.0D, f8, f4, f8);
/*  47 */     cew cew3 = bcs.a(f7, f3, f7, f8, f4, 16.0D);
/*  48 */     cew cew4 = bcs.a(0.0D, f3, f7, f8, f4, f8);
/*  49 */     cew cew5 = bcs.a(f7, f3, f7, 16.0D, f4, f8);
/*     */     
/*  51 */     cew cew6 = cet.a(cew2, cew5);
/*  52 */     cew cew7 = cet.a(cew3, cew4);
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
/*  70 */     cew[] arrayOfCew = { cet.a(), cew3, cew4, cew7, cew2, cet.a(cew3, cew2), cet.a(cew4, cew2), cet.a(cew7, cew2), cew5, cet.a(cew3, cew5), cet.a(cew4, cew5), cet.a(cew7, cew5), cew6, cet.a(cew3, cew6), cet.a(cew4, cew6), cet.a(cew7, cew6) };
/*     */     
/*  72 */     for (int i = 0; i < 16; i++) {
/*  73 */       arrayOfCew[i] = cet.a(cew1, arrayOfCew[i]);
/*     */     }
/*  75 */     return arrayOfCew;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  80 */     return this.s[k(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public cew f(blc ☃, axk axk1, el el1) {
/*  85 */     return this.r[k(☃)];
/*     */   }
/*     */   
/*     */   private static int a(eq ☃) {
/*  89 */     return 1 << ☃.b();
/*     */   }
/*     */   
/*     */   protected int k(blc ☃) {
/*  93 */     int i = 0;
/*  94 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  95 */       i |= a(eq.c);
/*     */     }
/*  97 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  98 */       i |= a(eq.f);
/*     */     }
/* 100 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 101 */       i |= a(eq.d);
/*     */     }
/* 103 */     if (((Boolean)☃.c(o)).booleanValue()) {
/* 104 */       i |= a(eq.e);
/*     */     }
/* 106 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 111 */     if (((Boolean)blc1.c(p)).booleanValue()) {
/* 112 */       ☃.a(el1, blc1.a(p, Boolean.valueOf(false)), 3);
/* 113 */       return byy.c;
/*     */     } 
/* 115 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 120 */     if (((Boolean)☃.c(p)).booleanValue()) {
/* 121 */       return byy.c.a(false);
/*     */     }
/* 123 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 128 */     return (!((Boolean)blc1.c(p)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 133 */     if (!((Boolean)blc1.c(p)).booleanValue() && byw1.c() == byy.c) {
/* 134 */       if (!☃.e()) {
/* 135 */         ☃.a(el1, blc1.a(p, Boolean.valueOf(true)), 3);
/* 136 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 138 */       return true;
/*     */     } 
/* 140 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 145 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 150 */     switch (null.a[bhb1.ordinal()]) {
/*     */       case 1:
/* 152 */         return ☃.a(a, ☃.c(c)).a(b, ☃.c(o)).a(c, ☃.c(a)).a(o, ☃.c(b));
/*     */       case 2:
/* 154 */         return ☃.a(a, ☃.c(b)).a(b, ☃.c(c)).a(c, ☃.c(o)).a(o, ☃.c(a));
/*     */       case 3:
/* 156 */         return ☃.a(a, ☃.c(o)).a(b, ☃.c(a)).a(c, ☃.c(b)).a(o, ☃.c(c));
/*     */     } 
/* 158 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 164 */     switch (null.b[bfz1.ordinal()]) {
/*     */       case 1:
/* 166 */         return ☃.a(a, ☃.c(c)).a(c, ☃.c(a));
/*     */       case 2:
/* 168 */         return ☃.a(b, ☃.c(o)).a(o, ☃.c(b));
/*     */     } 
/*     */ 
/*     */     
/* 172 */     return super.a(☃, bfz1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */