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
/*     */ 
/*     */ public class bil
/*     */   extends bfi
/*     */   implements bcz, bfv
/*     */ {
/*  29 */   public static final bmb a = bma.r;
/*  30 */   public static final bmh<bmi> b = bma.Q;
/*  31 */   public static final bmb c = bma.t;
/*  32 */   public static final bmb o = bma.y;
/*     */ 
/*     */   
/*  35 */   protected static final cew p = bcs.a(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*  36 */   protected static final cew q = bcs.a(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  37 */   protected static final cew r = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
/*  38 */   protected static final cew s = bcs.a(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
/*  39 */   protected static final cew t = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
/*  40 */   protected static final cew u = bcs.a(0.0D, 13.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   protected bil(bcs.c ☃) {
/*  43 */     super(☃);
/*  44 */     v(((blc)this.m.b()).a(D, eq.c).a(a, Boolean.valueOf(false)).a(b, bmi.b).a(c, Boolean.valueOf(false)).a(o, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  49 */     if (!((Boolean)☃.c(a)).booleanValue()) {
/*  50 */       return (☃.c(b) == bmi.a) ? u : t;
/*     */     }
/*     */     
/*  53 */     switch (null.a[((eq)☃.c(D)).ordinal()])
/*     */     
/*     */     { default:
/*  56 */         return s;
/*     */       case 2:
/*  58 */         return r;
/*     */       case 3:
/*  60 */         return q;
/*     */       case 4:
/*  62 */         break; }  return p;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/*  73 */     switch (null.b[cbf1.ordinal()]) {
/*     */       case 1:
/*  75 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */       case 2:
/*  77 */         return ((Boolean)☃.c(o)).booleanValue();
/*     */       case 3:
/*  79 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */     } 
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  87 */     if (this.k == bza.E) {
/*  88 */       return false;
/*     */     }
/*     */     
/*  91 */     ☃ = ☃.a(a);
/*  92 */     axy1.a(el1, ☃, 2);
/*     */     
/*  94 */     if (((Boolean)☃.c(o)).booleanValue()) {
/*  95 */       axy1.I().a(el1, byy.c, byy.c.a(axy1));
/*     */     }
/*     */     
/*  98 */     a(aog1, axy1, el1, ((Boolean)☃.c(a)).booleanValue());
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(@Nullable aog ☃, axy axy1, el el1, boolean bool) {
/* 103 */     if (bool) {
/* 104 */       int i = (this.k == bza.E) ? 1037 : 1007;
/* 105 */       axy1.a(☃, i, el1, 0);
/*     */     } else {
/* 107 */       int i = (this.k == bza.E) ? 1036 : 1013;
/* 108 */       axy1.a(☃, i, el1, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 114 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 118 */     boolean bool = axy1.t(el1);
/* 119 */     if (bool != ((Boolean)☃.c(c)).booleanValue()) {
/* 120 */       if (((Boolean)☃.c(a)).booleanValue() != bool) {
/* 121 */         ☃ = ☃.a(a, Boolean.valueOf(bool));
/* 122 */         a((aog)null, axy1, el1, bool);
/*     */       } 
/* 124 */       axy1.a(el1, ☃.a(c, Boolean.valueOf(bool)), 2);
/*     */       
/* 126 */       if (((Boolean)☃.c(o)).booleanValue()) {
/* 127 */         axy1.I().a(el1, byy.c, byy.c.a(axy1));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 134 */     blc blc = p();
/* 135 */     byw byw = ☃.k().b(☃.a());
/*     */     
/* 137 */     eq eq = ☃.l();
/* 138 */     if (☃.c() || !eq.k().c()) {
/* 139 */       blc = blc.a(D, ☃.f().d()).a(b, (eq == eq.b) ? bmi.b : bmi.a);
/*     */     } else {
/* 141 */       blc = blc.a(D, eq).a(b, (☃.n() > 0.5F) ? bmi.a : bmi.b);
/*     */     } 
/* 143 */     if (☃.k().t(☃.a())) {
/* 144 */       blc = blc.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
/*     */     }
/* 146 */     return blc.a(o, Boolean.valueOf((byw.c() == byy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 151 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 156 */     ☃.a((bmm<?>[])new bmm[] { D, a, b, c, o });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 161 */     if (((eq1 == eq.b && blc1.c(b) == bmi.a) || (eq1 == eq.a && blc1.c(b) == bmi.b)) && !((Boolean)blc1.c(a)).booleanValue()) {
/* 162 */       return blb.a;
/*     */     }
/* 164 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 169 */     if (((Boolean)blc1.c(o)).booleanValue()) {
/* 170 */       ☃.a(el1, blc1.a(o, Boolean.valueOf(false)), 3);
/* 171 */       return byy.c;
/*     */     } 
/* 173 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 178 */     if (((Boolean)☃.c(o)).booleanValue()) {
/* 179 */       return byy.c.a(false);
/*     */     }
/* 181 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 186 */     return (!((Boolean)blc1.c(o)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 191 */     if (!((Boolean)blc1.c(o)).booleanValue() && byw1.c() == byy.c) {
/* 192 */       if (!☃.e()) {
/* 193 */         ☃.a(el1, blc1.a(o, Boolean.valueOf(true)), 3);
/* 194 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 196 */       return true;
/*     */     } 
/* 198 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 203 */     if (((Boolean)☃.c(o)).booleanValue()) {
/* 204 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/* 207 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */