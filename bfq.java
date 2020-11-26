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
/*     */ public class bfq
/*     */   extends bcs
/*     */   implements bcz, bfv
/*     */ {
/*  24 */   public static final bme a = bfi.D;
/*  25 */   public static final bmb b = bma.y;
/*     */   
/*  27 */   protected static final cew c = bcs.a(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*  28 */   protected static final cew o = bcs.a(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  29 */   protected static final cew p = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
/*  30 */   protected static final cew q = bcs.a(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   protected bfq(bcs.c ☃) {
/*  33 */     super(☃);
/*  34 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  39 */     switch (null.a[((eq)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  41 */         return q;
/*     */       case 2:
/*  43 */         return p;
/*     */       case 3:
/*  45 */         return o;
/*     */     } 
/*     */     
/*  48 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  54 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1, eq eq1) {
/*  58 */     blc blc = ☃.a_(el1);
/*  59 */     boolean bool = b(blc.c());
/*  60 */     return (!bool && blc.c(☃, el1, eq1) == blb.a && !blc.m());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  65 */     eq eq = (eq)☃.c(a);
/*  66 */     return a(ayc1, el1.a(eq.d()), eq);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  71 */     if (eq1.d() == ☃.c(a) && !☃.a(axz1, el1)) {
/*  72 */       return bct.a.p();
/*     */     }
/*  74 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  75 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/*  78 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  85 */     if (!☃.c()) {
/*  86 */       blc blc1 = ☃.k().a_(☃.a().a(☃.l().d()));
/*  87 */       if (blc1.c() == this && blc1.c(a) == ☃.l()) {
/*  88 */         return null;
/*     */       }
/*     */     } 
/*     */     
/*  92 */     blc blc = p();
/*     */     
/*  94 */     ayc ayc = ☃.k();
/*  95 */     el el = ☃.a();
/*  96 */     byw byw = ☃.k().b(☃.a());
/*     */     
/*  98 */     for (eq eq : ☃.e()) {
/*  99 */       if (eq.k().c()) {
/* 100 */         blc = blc.a(a, eq.d());
/* 101 */         if (blc.a(ayc, el)) {
/* 102 */           return blc.a(b, Boolean.valueOf((byw.c() == byy.c)));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 107 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 112 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 117 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 122 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 127 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 132 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 137 */     if (((Boolean)blc1.c(b)).booleanValue()) {
/* 138 */       ☃.a(el1, blc1.a(b, Boolean.valueOf(false)), 3);
/* 139 */       return byy.c;
/*     */     } 
/* 141 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 146 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 147 */       return byy.c.a(false);
/*     */     }
/* 149 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 154 */     return (!((Boolean)blc1.c(b)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 159 */     if (!((Boolean)blc1.c(b)).booleanValue() && byw1.c() == byy.c) {
/* 160 */       if (!☃.e()) {
/* 161 */         ☃.a(el1, blc1.a(b, Boolean.valueOf(true)), 3);
/* 162 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 164 */       return true;
/*     */     } 
/* 166 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bfq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */