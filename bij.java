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
/*     */ public class bij
/*     */   extends bcs
/*     */ {
/*  26 */   public static final bmb a = bma.x;
/*     */   
/*     */   public bij(bcs.c ☃) {
/*  29 */     super(☃);
/*  30 */     v(p().a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  35 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/*  38 */     if (axy1.t(el1)) {
/*  39 */       a(axy1, el1);
/*  40 */       axy1.g(el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/*  46 */     if (axy1.t(el1)) {
/*  47 */       a(axy1, el1);
/*  48 */       axy1.g(el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/*  54 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     super.a(☃, axy1, el1, f, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, aog aog1) {
/*  63 */     if (!☃.e() && !aog1.u() && ((Boolean)blc1.c(a)).booleanValue()) {
/*  64 */       a(☃, el1);
/*     */     }
/*     */     
/*  67 */     super.a(☃, el1, blc1, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, axr axr1) {
/*  72 */     if (☃.B) {
/*     */       return;
/*     */     }
/*     */     
/*  76 */     amn amn = new amn(☃, (el1.o() + 0.5F), el1.p(), (el1.q() + 0.5F), axr1.d());
/*  77 */     amn.a((short)(☃.s.nextInt(amn.k() / 4) + amn.k() / 8));
/*  78 */     ☃.a(amn);
/*     */   }
/*     */   
/*     */   public void a(axy ☃, el el1) {
/*  82 */     a(☃, el1, (afa)null);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, @Nullable afa afa1) {
/*  86 */     if (☃.B) {
/*     */       return;
/*     */     }
/*  89 */     amn amn = new amn(☃, (el1.o() + 0.5F), el1.p(), (el1.q() + 0.5F), afa1);
/*  90 */     ☃.a(amn);
/*  91 */     ☃.a((aog)null, amn.q, amn.r, amn.s, wj.jF, wk.e, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  96 */     ate ate = aog1.b(adk1);
/*  97 */     ata ata = ate.b();
/*  98 */     if (ata == atf.e || ata == atf.dx) {
/*  99 */       a(axy1, el1, aog1);
/* 100 */       axy1.a(el1, bct.a.p(), 11);
/*     */       
/* 102 */       if (ata == atf.e) {
/* 103 */         ate.a(1, aog1);
/*     */       } else {
/* 105 */         ate.g(1);
/*     */       } 
/* 107 */       return true;
/*     */     } 
/* 109 */     return super.a(☃, axy1, el1, aog1, adk1, eq1, f1, f2, f3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/* 114 */     if (!axy1.B && aer1 instanceof aok) {
/* 115 */       aok aok = (aok)aer1;
/* 116 */       aer aer2 = aok.k();
/* 117 */       if (aok.aV()) {
/* 118 */         a(axy1, el1, (aer2 instanceof afa) ? (afa)aer2 : null);
/* 119 */         axy1.g(el1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axr ☃) {
/* 126 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 131 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */