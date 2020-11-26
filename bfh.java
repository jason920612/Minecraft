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
/*     */ public class bfh
/*     */   extends bcm
/*     */ {
/*  32 */   public static final bme a = bma.I;
/*  33 */   public static final bmb b = bma.e;
/*     */   
/*  35 */   private static final cew c = bcs.a(0.0D, 10.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  36 */   private static final cew o = bcs.a(4.0D, 4.0D, 4.0D, 12.0D, 10.0D, 12.0D);
/*     */   
/*  38 */   private static final cew p = cet.a(o, c);
/*  39 */   private static final cew q = cet.a(p, bjv.a, cei.ONLY_FIRST);
/*     */   
/*  41 */   private static final cew r = cet.a(q, bcs.a(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D));
/*  42 */   private static final cew s = cet.a(q, bcs.a(12.0D, 4.0D, 6.0D, 16.0D, 8.0D, 10.0D));
/*  43 */   private static final cew t = cet.a(q, bcs.a(6.0D, 4.0D, 0.0D, 10.0D, 8.0D, 4.0D));
/*  44 */   private static final cew u = cet.a(q, bcs.a(6.0D, 4.0D, 12.0D, 10.0D, 8.0D, 16.0D));
/*  45 */   private static final cew v = cet.a(q, bcs.a(0.0D, 4.0D, 6.0D, 4.0D, 8.0D, 10.0D));
/*     */   
/*  47 */   private static final cew w = bjv.a;
/*  48 */   private static final cew x = cet.a(bjv.a, bcs.a(12.0D, 8.0D, 6.0D, 16.0D, 10.0D, 10.0D));
/*  49 */   private static final cew y = cet.a(bjv.a, bcs.a(6.0D, 8.0D, 0.0D, 10.0D, 10.0D, 4.0D));
/*  50 */   private static final cew z = cet.a(bjv.a, bcs.a(6.0D, 8.0D, 12.0D, 10.0D, 10.0D, 16.0D));
/*  51 */   private static final cew A = cet.a(bjv.a, bcs.a(0.0D, 8.0D, 6.0D, 4.0D, 10.0D, 10.0D));
/*     */   
/*     */   public bfh(bcs.c ☃) {
/*  54 */     super(☃);
/*  55 */     v(((blc)this.m.b()).a(a, eq.a).a(b, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  60 */     switch (null.a[((eq)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  62 */         return r;
/*     */       case 2:
/*  64 */         return t;
/*     */       case 3:
/*  66 */         return u;
/*     */       case 4:
/*  68 */         return v;
/*     */       case 5:
/*  70 */         return s;
/*     */     } 
/*  72 */     return q;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew h(blc ☃, axk axk1, el el1) {
/*  77 */     switch (null.a[((eq)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  79 */         return w;
/*     */       case 2:
/*  81 */         return y;
/*     */       case 3:
/*  83 */         return z;
/*     */       case 4:
/*  85 */         return A;
/*     */       case 5:
/*  87 */         return x;
/*     */     } 
/*  89 */     return bjv.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  94 */     eq eq = ☃.l().d();
/*  95 */     return p().a(a, (eq.k() == eq.a.b) ? eq.a : eq).a(b, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 100 */     return new bjw();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 105 */     if (ate1.s()) {
/* 106 */       bji bji = ☃.f(el1);
/* 107 */       if (bji instanceof bjw) {
/* 108 */         ((bjw)bji).a(ate1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(blc ☃) {
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 120 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/* 123 */     a(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 128 */     if (axy1.B) {
/* 129 */       return true;
/*     */     }
/*     */     
/* 132 */     bji bji = axy1.f(el1);
/* 133 */     if (bji instanceof bjw) {
/* 134 */       aog1.a((bjw)bji);
/* 135 */       aog1.a(ws.ab);
/*     */     } 
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 142 */     a(axy1, el1, ☃);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, blc blc1) {
/* 146 */     boolean bool = !☃.t(el1);
/* 147 */     if (bool != ((Boolean)blc1.c(b)).booleanValue()) {
/* 148 */       ☃.a(el1, blc1.a(b, Boolean.valueOf(bool)), 4);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 154 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 157 */     bji bji = axy1.f(el1);
/* 158 */     if (bji instanceof bjw) {
/* 159 */       adh.a(axy1, el1, (bjw)bji);
/*     */       
/* 161 */       axy1.c(el1, this);
/*     */     } 
/*     */     
/* 164 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 169 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 179 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 184 */     return apv.a(axy1.f(el1));
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 189 */     return axl.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 194 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 199 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 204 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 209 */     if (eq1 == eq.b) {
/* 210 */       return blb.b;
/*     */     }
/* 212 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 217 */     bji bji = axy1.f(el1);
/* 218 */     if (bji instanceof bjw) {
/* 219 */       ((bjw)bji).a(aer1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 225 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bfh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */