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
/*     */ public class bhl
/*     */   extends bcs
/*     */   implements bcz, bfv
/*     */ {
/*  28 */   public static final bmh<bmp> a = bma.au;
/*  29 */   public static final bmb b = bma.y;
/*     */   
/*  31 */   protected static final cew c = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*  32 */   protected static final cew o = bcs.a(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   public bhl(bcs.c ☃) {
/*  35 */     super(☃);
/*     */     
/*  37 */     v(p().a(a, bmp.b).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(blc ☃, axk axk1, el el1) {
/*  42 */     return axk1.K();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/*  47 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean X_() {
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  57 */     bmp bmp = (bmp)☃.c(a);
/*  58 */     switch (null.a[bmp.ordinal()]) {
/*     */       case 1:
/*  60 */         return cet.b();
/*     */       case 2:
/*  62 */         return o;
/*     */     } 
/*  64 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean r(blc ☃) {
/*  70 */     return (☃.c(a) == bmp.c || ☃.c(a) == bmp.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  75 */     bmp bmp = (bmp)blc1.c(a);
/*  76 */     if (bmp == bmp.c)
/*  77 */       return blb.a; 
/*  78 */     if (eq1 == eq.b && bmp == bmp.a)
/*  79 */       return blb.a; 
/*  80 */     if (eq1 == eq.a && bmp == bmp.b) {
/*  81 */       return blb.a;
/*     */     }
/*  83 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  89 */     blc blc1 = ☃.k().a_(☃.a());
/*  90 */     if (blc1.c() == this) {
/*  91 */       return blc1.a(a, bmp.c).a(b, Boolean.valueOf(false));
/*     */     }
/*     */     
/*  94 */     byw byw = ☃.k().b(☃.a());
/*  95 */     blc blc2 = p().a(a, bmp.b).a(b, Boolean.valueOf((byw.c() == byy.c)));
/*     */     
/*  97 */     eq eq = ☃.l();
/*  98 */     if (eq == eq.a || (eq != eq.b && ☃.n() > 0.5D)) {
/*  99 */       return blc2.a(a, bmp.a);
/*     */     }
/* 101 */     return blc2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/* 106 */     if (☃.c(a) == bmp.c) {
/* 107 */       return 2;
/*     */     }
/* 109 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 114 */     return (☃.c(a) == bmp.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ark ark1) {
/* 119 */     ate ate = ark1.i();
/*     */     
/* 121 */     bmp bmp = (bmp)☃.c(a);
/* 122 */     if (bmp == bmp.c || ate.b() != h()) {
/* 123 */       return false;
/*     */     }
/*     */     
/* 126 */     if (ark1.c()) {
/* 127 */       boolean bool = (ark1.n() > 0.5D);
/* 128 */       eq eq = ark1.l();
/* 129 */       if (bmp == bmp.b) {
/* 130 */         return (eq == eq.b || (bool && eq.k().c()));
/*     */       }
/* 132 */       return (eq == eq.a || (!bool && eq.k().c()));
/*     */     } 
/*     */     
/* 135 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 140 */     if (((Boolean)blc1.c(b)).booleanValue()) {
/* 141 */       ☃.a(el1, blc1.a(b, Boolean.valueOf(false)), 3);
/* 142 */       return byy.c;
/*     */     } 
/* 144 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 149 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 150 */       return byy.c.a(false);
/*     */     }
/* 152 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 157 */     return (blc1.c(a) != bmp.c && !((Boolean)blc1.c(b)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 162 */     if (blc1.c(a) != bmp.c && !((Boolean)blc1.c(b)).booleanValue() && byw1.c() == byy.c) {
/* 163 */       if (!☃.e()) {
/* 164 */         ☃.a(el1, blc1.a(b, Boolean.valueOf(true)), 3);
/* 165 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 167 */       return true;
/*     */     } 
/* 169 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 174 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 175 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/* 177 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 182 */     switch (null.b[cbf1.ordinal()]) {
/*     */       case 1:
/* 184 */         return (☃.c(a) == bmp.b);
/*     */       case 2:
/* 186 */         return axk1.b(el1).a(ww.a);
/*     */       case 3:
/* 188 */         return false;
/*     */     } 
/* 190 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */