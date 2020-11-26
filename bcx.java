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
/*     */ public class bcx
/*     */   extends bcm
/*     */ {
/*  30 */   public static final bmb[] a = new bmb[] { bma.i, bma.j, bma.k };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  36 */   protected static final cew b = cet.a(
/*  37 */       bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), 
/*  38 */       bcs.a(7.0D, 0.0D, 7.0D, 9.0D, 14.0D, 9.0D));
/*     */ 
/*     */   
/*     */   public bcx(bcs.c ☃) {
/*  42 */     super(☃);
/*  43 */     v(((blc)this.m.b()).a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  48 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/*  53 */     return new bjk();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  63 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  68 */     if (axy1.B) {
/*  69 */       return true;
/*     */     }
/*     */     
/*  72 */     bji bji = axy1.f(el1);
/*  73 */     if (bji instanceof bjk) {
/*  74 */       aog1.a((bjk)bji);
/*  75 */       aog1.a(ws.Y);
/*     */     } 
/*     */     
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, afa afa1, ate ate1) {
/*  83 */     if (ate1.s()) {
/*  84 */       bji bji = ☃.f(el1);
/*  85 */       if (bji instanceof bjk) {
/*  86 */         ((bjk)bji).a(ate1.q());
/*     */       }
/*     */     } 
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
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 102 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 105 */     bji bji = axy1.f(el1);
/* 106 */     if (bji instanceof bjk) {
/* 107 */       adh.a(axy1, el1, (bjk)bji);
/*     */     }
/* 109 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 119 */     return apv.a(axy1.f(el1));
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 124 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 129 */     ☃.a((bmm<?>[])new bmm[] { a[0], a[1], a[2] });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 134 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 139 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bcx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */