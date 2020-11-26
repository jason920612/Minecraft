/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdh
/*     */   extends bcm
/*     */   implements bcz, bfv
/*     */ {
/*  44 */   public static final bme a = bfi.D;
/*  45 */   public static final bmh<bmc> b = bma.ap;
/*  46 */   public static final bmb c = bma.y;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   protected static final cew o = bcs.a(1.0D, 0.0D, 0.0D, 15.0D, 14.0D, 15.0D);
/*  52 */   protected static final cew p = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 16.0D);
/*  53 */   protected static final cew q = bcs.a(0.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
/*  54 */   protected static final cew r = bcs.a(1.0D, 0.0D, 1.0D, 16.0D, 14.0D, 15.0D);
/*  55 */   protected static final cew s = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
/*     */   
/*     */   protected bdh(bcs.c ☃) {
/*  58 */     super(☃);
/*  59 */     v(((blc)this.m.b()).a(a, eq.c).a(b, bmc.a).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  74 */     return bgy.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  79 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  80 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*  82 */     if (blc1.c() == this && eq1.k().c()) {
/*  83 */       bmc bmc = (bmc)blc1.c(b);
/*  84 */       if (☃.c(b) == bmc.a && bmc != bmc.a && 
/*  85 */         ☃.c(a) == blc1.c(a) && k(blc1) == eq1.d()) {
/*  86 */         return ☃.a(b, bmc.a());
/*     */       }
/*     */     }
/*  89 */     else if (k(☃) == eq1) {
/*  90 */       return ☃.a(b, bmc.a);
/*     */     } 
/*  92 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  97 */     if (☃.c(b) == bmc.a) {
/*  98 */       return s;
/*     */     }
/*     */     
/* 101 */     switch (null.a[k(☃).ordinal()])
/*     */     
/*     */     { default:
/* 104 */         return o;
/*     */       case 2:
/* 106 */         return p;
/*     */       case 3:
/* 108 */         return q;
/*     */       case 4:
/* 110 */         break; }  return r;
/*     */   }
/*     */ 
/*     */   
/*     */   public static eq k(blc ☃) {
/* 115 */     eq eq = (eq)☃.c(a);
/* 116 */     return (☃.c(b) == bmc.b) ? eq.e() : eq.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 121 */     bmc bmc = bmc.a;
/* 122 */     eq eq1 = ☃.f().d();
/* 123 */     byw byw = ☃.k().b(☃.a());
/*     */     
/* 125 */     boolean bool = ☃.g();
/* 126 */     eq eq2 = ☃.l();
/*     */     
/* 128 */     if (eq2.k().c() && bool) {
/* 129 */       eq eq = a(☃, eq2.d());
/* 130 */       if (eq != null && eq.k() != eq2.k()) {
/* 131 */         eq1 = eq;
/* 132 */         bmc = (eq1.f() == eq2.d()) ? bmc.c : bmc.b;
/*     */       } 
/*     */     } 
/* 135 */     if (bmc == bmc.a && !bool) {
/* 136 */       if (eq1 == a(☃, eq1.e())) {
/* 137 */         bmc = bmc.b;
/* 138 */       } else if (eq1 == a(☃, eq1.f())) {
/* 139 */         bmc = bmc.c;
/*     */       } 
/*     */     }
/*     */     
/* 143 */     return p().a(a, eq1).a(b, bmc).a(c, Boolean.valueOf((byw.c() == byy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 148 */     if (((Boolean)blc1.c(c)).booleanValue()) {
/* 149 */       ☃.a(el1, blc1.a(c, Boolean.valueOf(false)), 3);
/* 150 */       return byy.c;
/*     */     } 
/* 152 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 157 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 158 */       return byy.c.a(false);
/*     */     }
/* 160 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 165 */     return (!((Boolean)blc1.c(c)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 170 */     if (!((Boolean)blc1.c(c)).booleanValue() && byw1.c() == byy.c) {
/* 171 */       if (!☃.e()) {
/* 172 */         ☃.a(el1, blc1.a(c, Boolean.valueOf(true)), 3);
/* 173 */         ☃.I().a(el1, byy.c, byy.c.a(☃));
/*     */       } 
/* 175 */       return true;
/*     */     } 
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private eq a(ark ☃, eq eq1) {
/* 182 */     blc blc = ☃.k().a_(☃.a().a(eq1));
/*     */     
/* 184 */     return (blc.c() == this && blc.c(b) == bmc.a) ? (eq)blc.c(a) : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 189 */     if (ate1.s()) {
/* 190 */       bji bji = ☃.f(el1);
/* 191 */       if (bji instanceof bjl) {
/* 192 */         ((bjl)bji).a(ate1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 199 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 202 */     bji bji = axy1.f(el1);
/* 203 */     if (bji instanceof ade) {
/* 204 */       adh.a(axy1, el1, (ade)bji);
/*     */       
/* 206 */       axy1.c(el1, this);
/*     */     } 
/* 208 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 213 */     if (axy1.B) {
/* 214 */       return true;
/*     */     }
/* 216 */     adq adq = a(☃, axy1, el1, false);
/*     */     
/* 218 */     if (adq != null) {
/* 219 */       aog1.a(adq);
/*     */       
/* 221 */       aog1.b(d());
/*     */     } 
/*     */     
/* 224 */     return true;
/*     */   }
/*     */   
/*     */   protected wp<pc> d() {
/* 228 */     return ws.i.b(ws.am);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public adq a(blc ☃, axy axy1, el el1, boolean bool) {
/* 233 */     bji bji = axy1.f(el1);
/* 234 */     if (!(bji instanceof bjl)) {
/* 235 */       return null;
/*     */     }
/*     */     
/* 238 */     if (!bool && a(axy1, el1)) {
/* 239 */       return null;
/*     */     }
/*     */     
/* 242 */     adq adq = (bjl)bji;
/* 243 */     bmc bmc = (bmc)☃.c(b);
/* 244 */     if (bmc == bmc.a) {
/* 245 */       return adq;
/*     */     }
/*     */     
/* 248 */     el el2 = el1.a(k(☃));
/* 249 */     blc blc1 = axy1.a_(el2);
/* 250 */     if (blc1.c() == this) {
/* 251 */       bmc bmc1 = (bmc)blc1.c(b);
/* 252 */       if (bmc1 != bmc.a && bmc != bmc1 && blc1.c(a) == ☃.c(a)) {
/* 253 */         if (!bool && a(axy1, el2)) {
/* 254 */           return null;
/*     */         }
/*     */         
/* 257 */         bji bji1 = axy1.f(el2);
/* 258 */         if (bji1 instanceof bjl) {
/* 259 */           adq adq1 = (bmc == bmc.c) ? adq : (adq)bji1;
/* 260 */           adq adq2 = (bmc == bmc.c) ? (adq)bji1 : adq;
/*     */           
/* 262 */           adq = new add(new ir("container.chestDouble", new Object[0]), adq1, adq2);
/*     */         } 
/*     */       } 
/*     */     } 
/* 266 */     return adq;
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 271 */     return new bjl();
/*     */   }
/*     */   
/*     */   private boolean a(axy ☃, el el1) {
/* 275 */     return (a(☃, el1) || b(☃, el1));
/*     */   }
/*     */   
/*     */   private boolean a(axk ☃, el el1) {
/* 279 */     return ☃.a_(el1.a()).l();
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean b(axy ☃, el el1) {
/* 284 */     List<ajy> list = ☃.a(ajy.class, new cea(el1.o(), (el1.p() + 1), el1.q(), (el1.o() + 1), (el1.p() + 2), (el1.q() + 1)));
/* 285 */     if (!list.isEmpty()) {
/* 286 */       for (ajy ajy : list) {
/* 287 */         if (ajy.dA()) {
/* 288 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/* 292 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 297 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 302 */     return apv.b(a(☃, axy1, el1, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 307 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 312 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 317 */     ☃.a((bmm<?>[])new bmm[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 322 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 327 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */