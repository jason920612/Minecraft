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
/*     */ public class bfn
/*     */   extends bcm
/*     */ {
/*  23 */   public static final bmb a = bma.l;
/*     */   
/*     */   protected bfn(bcs.c ☃) {
/*  26 */     super(☃);
/*  27 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  32 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  33 */       a(axy1, el1);
/*     */       
/*  35 */       ☃ = ☃.a(a, Boolean.valueOf(false));
/*  36 */       axy1.a(el1, ☃, 2);
/*     */       
/*  38 */       return true;
/*     */     } 
/*     */     
/*  41 */     return false;
/*     */   }
/*     */   
/*     */   public void a(axz ☃, el el1, blc blc1, ate ate1) {
/*  45 */     bji bji = ☃.f(el1);
/*  46 */     if (!(bji instanceof bjx)) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     ((bjx)bji).a(ate1.i());
/*  51 */     ☃.a(el1, blc1.a(a, Boolean.valueOf(true)), 2);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1) {
/*  55 */     if (☃.B) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     bji bji = ☃.f(el1);
/*  60 */     if (!(bji instanceof bjx)) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     bjx bjx = (bjx)bji;
/*  65 */     ate ate1 = bjx.c();
/*  66 */     if (ate1.a()) {
/*     */       return;
/*     */     }
/*     */     
/*  70 */     ☃.b(1010, el1, 0);
/*  71 */     ☃.a(el1, (wi)null);
/*  72 */     bjx.a(ate.a);
/*     */     
/*  74 */     float f = 0.7F;
/*  75 */     double d1 = (☃.s.nextFloat() * 0.7F) + 0.15000000596046448D;
/*  76 */     double d2 = (☃.s.nextFloat() * 0.7F) + 0.06000000238418579D + 0.6D;
/*  77 */     double d3 = (☃.s.nextFloat() * 0.7F) + 0.15000000596046448D;
/*     */     
/*  79 */     ate ate2 = ate1.i();
/*     */     
/*  81 */     amm amm = new amm(☃, el1.o() + d1, el1.p() + d2, el1.q() + d3, ate2);
/*  82 */     amm.n();
/*  83 */     ☃.a(amm);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/*  88 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/*  91 */     a(axy1, el1);
/*  92 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/*  97 */     if (axy1.B) {
/*     */       return;
/*     */     }
/* 100 */     super.a(☃, axy1, el1, f, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 105 */     return new bjx();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 115 */     bji bji = axy1.f(el1);
/* 116 */     if (bji instanceof bjx) {
/* 117 */       ata ata = ((bjx)bji).c().b();
/* 118 */       if (ata instanceof atr) {
/* 119 */         return ((atr)ata).d();
/*     */       }
/*     */     } 
/*     */     
/* 123 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/* 128 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 133 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bfn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */