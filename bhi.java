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
/*     */ public class bhi
/*     */   extends bcm
/*     */ {
/*  42 */   public static final bmh<eq> a = beb.a;
/*     */   
/*     */   @Nullable
/*     */   private final asc b;
/*     */   
/*     */   public bhi(@Nullable asc ☃, bcs.c c1) {
/*  48 */     super(c1);
/*  49 */     this.b = ☃;
/*  50 */     v(((blc)this.m.b()).a(a, eq.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/*  55 */     return new bkb(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean q(blc ☃) {
/*  60 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  65 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  75 */     return bgy.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  80 */     if (axy1.B) {
/*  81 */       return true;
/*     */     }
/*     */     
/*  84 */     if (aog1.t()) {
/*  85 */       return true;
/*     */     }
/*     */     
/*  88 */     bji bji = axy1.f(el1);
/*  89 */     if (bji instanceof bkb) {
/*  90 */       boolean bool; eq eq2 = (eq)☃.c(a);
/*     */ 
/*     */       
/*  93 */       if (((bkb)bji).r() == bkb.a.a) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  98 */         cea cea = cet.b().a().b((0.5F * eq2.g()), (0.5F * eq2.h()), (0.5F * eq2.i())).a(eq2
/*  99 */             .g(), eq2
/* 100 */             .h(), eq2
/* 101 */             .i());
/*     */ 
/*     */         
/* 104 */         bool = axy1.c((aer)null, cea.a(el1.a(eq2)));
/*     */       } else {
/* 106 */         bool = true;
/*     */       } 
/*     */       
/* 109 */       if (bool) {
/* 110 */         aog1.a(ws.ao);
/* 111 */         aog1.a((ade)bji);
/*     */       } 
/* 113 */       return true;
/*     */     } 
/*     */     
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 121 */     return p().a(a, ☃.l());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 126 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/* 131 */     if (☃.f(el1) instanceof bkb) {
/* 132 */       bkb bkb = (bkb)☃.f(el1);
/* 133 */       bkb.a(aog1.bV.d);
/* 134 */       bkb.d(aog1);
/*     */     } 
/* 136 */     super.a(☃, el1, blc1, aog1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {}
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/* 145 */     if (ate1.s()) {
/* 146 */       bji bji = ☃.f(el1);
/* 147 */       if (bji instanceof bkb) {
/* 148 */         ((bkb)bji).a(ate1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 155 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 158 */     bji bji = axy1.f(el1);
/*     */     
/* 160 */     if (bji instanceof bkb) {
/* 161 */       bkb bkb = (bkb)bji;
/*     */       
/* 163 */       if (!bkb.s() && bkb.G()) {
/* 164 */         ate ate = new ate(this);
/*     */         
/* 166 */         ate.o().a("BlockEntityTag", ((bkb)bji).g(new gy()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 172 */         if (bkb.O_()) {
/* 173 */           ate.a(bkb.e());
/* 174 */           bkb.a((ij)null);
/*     */         } 
/*     */         
/* 177 */         a(axy1, el1, ate);
/*     */       } 
/*     */       
/* 180 */       axy1.c(el1, ☃.c());
/*     */     } 
/*     */     
/* 183 */     super.a(☃, axy1, el1, blc1, bool);
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
/*     */   public bzc j(blc ☃) {
/* 224 */     return bzc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/* 229 */     bji bji = axk1.f(el1);
/* 230 */     if (bji instanceof bkb) {
/* 231 */       return cet.a(((bkb)bji).a(☃));
/*     */     }
/* 233 */     return cet.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(blc ☃) {
/* 238 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 243 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 248 */     return apv.b((ade)axy1.f(el1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 255 */     ate ate = super.a(☃, el1, blc1);
/* 256 */     bkb bkb = (bkb)☃.f(el1);
/* 257 */     gy gy = bkb.g(new gy());
/* 258 */     if (!gy.isEmpty()) {
/* 259 */       ate.a("BlockEntityTag", gy);
/*     */     }
/* 261 */     return ate;
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
/*     */   
/*     */   public static bcs a(asc ☃) {
/* 277 */     if (☃ == null) {
/* 278 */       return bct.iq;
/*     */     }
/* 280 */     switch (null.a[☃.ordinal()])
/*     */     { case 1:
/* 282 */         return bct.ir;
/*     */       case 2:
/* 284 */         return bct.is;
/*     */       case 3:
/* 286 */         return bct.it;
/*     */       case 4:
/* 288 */         return bct.iu;
/*     */       case 5:
/* 290 */         return bct.iv;
/*     */       case 6:
/* 292 */         return bct.iw;
/*     */       case 7:
/* 294 */         return bct.ix;
/*     */       case 8:
/* 296 */         return bct.iy;
/*     */       case 9:
/* 298 */         return bct.iz;
/*     */       case 10:
/* 300 */         return bct.iA;
/*     */       
/*     */       default:
/* 303 */         return bct.iB;
/*     */       case 12:
/* 305 */         return bct.iC;
/*     */       case 13:
/* 307 */         return bct.iD;
/*     */       case 14:
/* 309 */         return bct.iE;
/*     */       case 15:
/* 311 */         return bct.iF;
/*     */       case 16:
/* 313 */         break; }  return bct.iG;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ate b(asc ☃) {
/* 322 */     return new ate(a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 327 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 332 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 337 */     eq eq2 = (eq)blc1.c(a);
/* 338 */     bkb.a a = ((bkb)☃.f(el1)).r();
/*     */     
/* 340 */     if (a == bkb.a.a || (a == bkb.a.c && (eq2 == eq1.d() || eq2 == eq1))) {
/* 341 */       return blb.a;
/*     */     }
/*     */     
/* 344 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */