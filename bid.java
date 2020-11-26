/*     */ import java.util.Random;
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
/*     */ public class bid
/*     */   extends bcm
/*     */ {
/*  24 */   public static final bmh<bmr> a = bma.aw;
/*     */   
/*     */   protected bid(bcs.c ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/*  32 */     return new bkf();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  37 */     bji bji = axy1.f(el1);
/*  38 */     if (bji instanceof bkf) {
/*  39 */       return ((bkf)bji).a(aog1);
/*     */     }
/*  41 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {
/*  46 */     if (☃.B) {
/*     */       return;
/*     */     }
/*  49 */     if (afa1 != null) {
/*  50 */       bji bji = ☃.f(el1);
/*  51 */       if (bji instanceof bkf) {
/*  52 */         ((bkf)bji).a(afa1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/*  59 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  64 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  69 */     return p().a(a, bmr.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/*  74 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/*  79 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  83 */     bji bji = axy1.f(el1);
/*  84 */     if (!(bji instanceof bkf)) {
/*     */       return;
/*     */     }
/*     */     
/*  88 */     bkf bkf = (bkf)bji;
/*     */     
/*  90 */     boolean bool1 = axy1.t(el1);
/*  91 */     boolean bool2 = bkf.E();
/*     */     
/*  93 */     if (bool1 && !bool2) {
/*  94 */       bkf.d(true);
/*  95 */       a(bkf);
/*  96 */     } else if (!bool1 && bool2) {
/*  97 */       bkf.d(false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bkf ☃) {
/* 102 */     switch (null.a[☃.k().ordinal()]) {
/*     */       case 1:
/* 104 */         ☃.b(false);
/*     */         break;
/*     */       case 2:
/* 107 */         ☃.c(false);
/*     */         break;
/*     */       case 3:
/* 110 */         ☃.s();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */