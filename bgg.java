/*     */ import java.util.Random;
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
/*     */ public class bgg
/*     */   extends beb
/*     */ {
/*  18 */   public static final bmb b = bma.t;
/*     */   
/*     */   public bgg(bcs.c ☃) {
/*  21 */     super(☃);
/*     */     
/*  23 */     v(((blc)this.m.b()).a(a, eq.d).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/*  28 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/*  33 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/*  38 */     return ☃.a(bfz1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  43 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  44 */       axy1.a(el1, ☃.a(b, Boolean.valueOf(false)), 2);
/*     */     } else {
/*  46 */       axy1.a(el1, ☃.a(b, Boolean.valueOf(true)), 2);
/*  47 */       axy1.J().a(el1, this, 2);
/*     */     } 
/*  49 */     a(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  54 */     if (☃.c(a) == eq1 && !((Boolean)☃.c(b)).booleanValue()) {
/*  55 */       a(axz1, el1);
/*     */     }
/*     */     
/*  58 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */   
/*     */   private void a(axz ☃, el el1) {
/*  62 */     if (!☃.e() && !☃.J().a(el1, this)) {
/*  63 */       ☃.J().a(el1, this, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(axy ☃, el el1, blc blc1) {
/*  68 */     eq eq = (eq)blc1.c(a);
/*  69 */     el el2 = el1.a(eq.d());
/*     */     
/*  71 */     ☃.a(el2, this, el1);
/*  72 */     ☃.a(el2, this, eq);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/*  77 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/*  82 */     return ☃.a(axk1, el1, eq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/*  87 */     if (((Boolean)☃.c(b)).booleanValue() && ☃.c(a) == eq1) {
/*  88 */       return 15;
/*     */     }
/*  90 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  95 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/*     */     
/*  99 */     if (!axy1.e() && ((Boolean)☃.c(b)).booleanValue() && !axy1.J().a(el1, this)) {
/* 100 */       blc blc2 = ☃.a(b, Boolean.valueOf(false));
/*     */       
/* 102 */       axy1.a(el1, blc2, 18);
/* 103 */       a(axy1, el1, blc2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 109 */     if (☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 112 */     if (!axy1.B && ((Boolean)☃.c(b)).booleanValue() && axy1.J().a(el1, this))
/*     */     {
/* 114 */       a(axy1, el1, ☃.a(b, Boolean.valueOf(false)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 120 */     return p().a(a, ☃.d().d().d());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */