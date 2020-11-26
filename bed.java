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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bed
/*     */   extends bcs
/*     */ {
/*  36 */   public static final bme a = bfi.D;
/*  37 */   public static final bmb b = bma.r;
/*  38 */   public static final bmh<bmf> c = bma.ar;
/*  39 */   public static final bmb o = bma.t;
/*  40 */   public static final bmh<bmg> p = bma.P;
/*     */ 
/*     */ 
/*     */   
/*  44 */   protected static final cew q = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
/*  45 */   protected static final cew r = bcs.a(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
/*  46 */   protected static final cew s = bcs.a(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  47 */   protected static final cew t = bcs.a(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*     */   
/*     */   protected bed(bcs.c ☃) {
/*  50 */     super(☃);
/*  51 */     v(((blc)this.m.b()).a(a, eq.c).a(b, Boolean.valueOf(false)).a(c, bmf.a).a(o, Boolean.valueOf(false)).a(p, bmg.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  56 */     eq eq = (eq)☃.c(a);
/*  57 */     boolean bool1 = !((Boolean)☃.c(b)).booleanValue();
/*  58 */     boolean bool2 = (☃.c(c) == bmf.b);
/*     */     
/*  60 */     switch (null.a[eq.ordinal()])
/*     */     
/*     */     { default:
/*  63 */         return bool1 ? t : (bool2 ? r : q);
/*     */       case 2:
/*  65 */         return bool1 ? q : (bool2 ? t : s);
/*     */       case 3:
/*  67 */         return bool1 ? s : (bool2 ? q : r);
/*     */       case 4:
/*  69 */         break; }  return bool1 ? r : (bool2 ? s : t);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  75 */     bmg bmg = (bmg)☃.c(p);
/*  76 */     if (eq1.k() == eq.a.b) if (((bmg == bmg.b) ? true : false) == ((eq1 == eq.b) ? true : false)) {
/*  77 */         if (blc1.c() == this && blc1.c(p) != bmg)
/*     */         {
/*  79 */           return ☃.a(a, blc1.c(a))
/*  80 */             .a(b, blc1.c(b))
/*  81 */             .a(c, blc1.c(c))
/*  82 */             .a(o, blc1.c(o));
/*     */         }
/*  84 */         return bct.a.p();
/*     */       } 
/*     */ 
/*     */     
/*  88 */     if (bmg == bmg.b && eq1 == eq.a && !☃.a(axz1, el1)) {
/*  89 */       return bct.a.p();
/*     */     }
/*     */     
/*  92 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/*  98 */     super.a(☃, aog1, el1, bct.a.p(), bji1, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/* 103 */     bmg bmg = (bmg)blc1.c(p);
/* 104 */     boolean bool = (bmg == bmg.b);
/*     */     
/* 106 */     el el2 = bool ? el1.a() : el1.b();
/* 107 */     blc blc2 = ☃.a_(el2);
/*     */     
/* 109 */     if (blc2.c() == this && blc2.c(p) != bmg) {
/*     */       
/* 111 */       ☃.a(el2, bct.a.p(), 35);
/* 112 */       ☃.a(aog1, 2001, el2, bcs.l(blc2));
/*     */ 
/*     */       
/* 115 */       if (!☃.B && !aog1.u()) {
/* 116 */         if (bool) {
/* 117 */           blc1.a(☃, el1, 0);
/*     */         } else {
/* 119 */           blc2.a(☃, el2, 0);
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 124 */     super.a(☃, el1, blc1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 129 */     switch (null.b[cbf1.ordinal()]) {
/*     */       case 1:
/* 131 */         return ((Boolean)☃.c(b)).booleanValue();
/*     */       case 2:
/* 133 */         return false;
/*     */       case 3:
/* 135 */         return ((Boolean)☃.c(b)).booleanValue();
/*     */     } 
/* 137 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 143 */     return false;
/*     */   }
/*     */   
/*     */   private int d() {
/* 147 */     return (this.k == bza.E) ? 1011 : 1012;
/*     */   }
/*     */   
/*     */   private int e() {
/* 151 */     return (this.k == bza.E) ? 1005 : 1006;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/* 157 */     el el = ☃.a();
/* 158 */     if (el.p() < 255 && ☃.k().a_(el.a()).a(☃)) {
/* 159 */       axy axy = ☃.k();
/* 160 */       boolean bool = (axy.t(el) || axy.t(el.a()));
/*     */       
/* 162 */       return p().a(a, ☃.f()).a(c, b(☃)).a(o, Boolean.valueOf(bool)).a(b, Boolean.valueOf(bool)).a(p, bmg.b);
/*     */     } 
/*     */     
/* 165 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 170 */     ☃.a(el1.a(), blc1.a(p, bmg.a), 3);
/*     */   }
/*     */   
/*     */   private bmf b(ark ☃) {
/* 174 */     axk axk = ☃.k();
/* 175 */     el el1 = ☃.a();
/* 176 */     eq eq1 = ☃.f();
/* 177 */     el el2 = el1.a();
/*     */     
/* 179 */     eq eq2 = eq1.f();
/* 180 */     blc blc1 = axk.a_(el1.a(eq2));
/* 181 */     blc blc2 = axk.a_(el2.a(eq2));
/*     */     
/* 183 */     eq eq3 = eq1.e();
/* 184 */     blc blc3 = axk.a_(el1.a(eq3));
/* 185 */     blc blc4 = axk.a_(el2.a(eq3));
/*     */     
/* 187 */     int i = (blc1.k() ? -1 : 0) + (blc2.k() ? -1 : 0) + (blc3.k() ? 1 : 0) + (blc4.k() ? 1 : 0);
/*     */     
/* 189 */     boolean bool1 = (blc1.c() == this && blc1.c(p) == bmg.b);
/* 190 */     boolean bool2 = (blc3.c() == this && blc3.c(p) == bmg.b);
/*     */     
/* 192 */     if ((bool1 && !bool2) || i > 0) {
/* 193 */       return bmf.b;
/*     */     }
/* 195 */     if ((bool2 && !bool1) || i < 0) {
/* 196 */       return bmf.a;
/*     */     }
/*     */     
/* 199 */     int j = eq1.g();
/* 200 */     int k = eq1.i();
/* 201 */     float f1 = ☃.m();
/* 202 */     float f2 = ☃.o();
/*     */     
/* 204 */     return ((j < 0 && f2 < 0.5F) || (j > 0 && f2 > 0.5F) || (k < 0 && f1 > 0.5F) || (k > 0 && f1 < 0.5F)) ? bmf.b : bmf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 209 */     if (this.k == bza.E) {
/* 210 */       return false;
/*     */     }
/*     */     
/* 213 */     ☃ = ☃.a(b);
/* 214 */     axy1.a(el1, ☃, 10);
/* 215 */     axy1.a(aog1, ((Boolean)☃.c(b)).booleanValue() ? e() : d(), el1, 0);
/* 216 */     return true;
/*     */   }
/*     */   
/*     */   public void a(axy ☃, el el1, boolean bool) {
/* 220 */     blc blc = ☃.a_(el1);
/* 221 */     if (blc.c() != this || ((Boolean)blc.c(b)).booleanValue() == bool) {
/*     */       return;
/*     */     }
/*     */     
/* 225 */     ☃.a(el1, blc.a(b, Boolean.valueOf(bool)), 10);
/* 226 */     b(☃, el1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 231 */     boolean bool = (axy1.t(el1) || axy1.t(el1.a((☃.c(p) == bmg.b) ? eq.b : eq.a)));
/* 232 */     if (bcs1 != this && bool != ((Boolean)☃.c(o)).booleanValue()) {
/* 233 */       if (bool != ((Boolean)☃.c(b)).booleanValue()) {
/* 234 */         b(axy1, el1, bool);
/*     */       }
/* 236 */       axy1.a(el1, ☃.a(o, Boolean.valueOf(bool)).a(b, Boolean.valueOf(bool)), 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 243 */     blc blc1 = ayc1.a_(el1.b());
/* 244 */     if (☃.c(p) == bmg.b) {
/* 245 */       return blc1.q();
/*     */     }
/* 247 */     return (blc1.c() == this);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(axy ☃, el el1, boolean bool) {
/* 252 */     ☃.a((aog)null, bool ? e() : d(), el1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 257 */     if (☃.c(p) == bmg.a) {
/* 258 */       return atf.a;
/*     */     }
/*     */     
/* 261 */     return super.a(☃, axy1, el1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzc j(blc ☃) {
/* 266 */     return bzc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 271 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 276 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 281 */     if (bfz1 == bfz.a) {
/* 282 */       return ☃;
/*     */     }
/* 284 */     return ☃.a(bfz1.a((eq)☃.c(a))).a(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 294 */     ☃.a((bmm<?>[])new bmm[] { p, a, b, c, o });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 299 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */