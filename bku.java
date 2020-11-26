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
/*     */ public class bku
/*     */   extends bcm
/*     */ {
/*  31 */   public static final bme a = bkw.a;
/*  32 */   public static final bmh<bml> b = bkw.b;
/*     */   
/*     */   public bku(bcs.c ☃) {
/*  35 */     super(☃);
/*  36 */     v(((blc)this.m.b()).a(a, eq.c).a(b, bml.a));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bji a(axk ☃) {
/*  42 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static bji a(blc ☃, eq eq1, boolean bool1, boolean bool2) {
/*  47 */     return new bkx(☃, eq1, bool1, bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/*  52 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/*  55 */     bji bji = axy1.f(el1);
/*  56 */     if (bji instanceof bkx) {
/*  57 */       ((bkx)bji).j();
/*     */     } else {
/*  59 */       super.a(☃, axy1, el1, blc1, bool);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(axz ☃, el el1, blc blc1) {
/*  66 */     el el2 = el1.a(((eq)blc1.c(a)).d());
/*  67 */     blc blc2 = ☃.a_(el2);
/*  68 */     if (blc2.c() instanceof bkv && ((Boolean)blc2.c(bkv.b)).booleanValue()) {
/*  69 */       ☃.g(el2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(blc ☃) {
/*  75 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  86 */     if (!axy1.B && axy1.f(el1) == null) {
/*     */       
/*  88 */       axy1.g(el1);
/*  89 */       return true;
/*     */     } 
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  96 */     return atf.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, float f, int i) {
/* 102 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/* 106 */     bkx bkx = a(axy1, el1);
/* 107 */     if (bkx == null) {
/*     */       return;
/*     */     }
/*     */     
/* 111 */     bkx.i().a(axy1, el1, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/* 117 */     return cet.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public cew f(blc ☃, axk axk1, el el1) {
/* 122 */     bkx bkx = a(axk1, el1);
/* 123 */     if (bkx != null) {
/* 124 */       return bkx.a(axk1, el1);
/*     */     }
/* 126 */     return cet.a();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bkx a(axk ☃, el el1) {
/* 131 */     bji bji = ☃.f(el1);
/* 132 */     if (bji instanceof bkx) {
/* 133 */       return (bkx)bji;
/*     */     }
/* 135 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(axk ☃, el el1, blc blc1) {
/* 140 */     return ate.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 145 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 150 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 155 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 160 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 165 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */