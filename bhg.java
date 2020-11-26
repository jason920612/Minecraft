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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bhg
/*     */   extends bda
/*     */   implements bcv, bfv
/*     */ {
/*  29 */   protected static final cew a = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
/*     */   
/*     */   protected bhg(bcs.c ☃) {
/*  32 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  37 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(blc ☃, axk axk1, el el1) {
/*  42 */     return (bcs.a(☃.h(axk1, el1), eq.b) && ☃.c() != bct.ik);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  48 */     byw byw = ☃.k().b(☃.a());
/*     */     
/*  50 */     if (byw.a(ww.a) && byw.g() == 8) {
/*  51 */       return super.a(☃);
/*     */     }
/*  53 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  58 */     blc blc2 = super.a(☃, eq1, blc1, axz1, el1, el2);
/*  59 */     if (!blc2.f()) {
/*  60 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*  62 */     return blc2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, aog aog1, el el1, blc blc1, @Nullable bji bji1, ate ate1) {
/*  67 */     if (!☃.B && ate1.b() == atf.bR) {
/*  68 */       aog1.b(ws.a.b(this));
/*  69 */       aog1.a(0.005F);
/*     */       
/*  71 */       a(☃, el1, new ate(this));
/*     */     } else {
/*  73 */       super.a(☃, aog1, el1, blc1, bji1, ate1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  79 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/*  84 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/*  89 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/*  94 */     return byy.c.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axy ☃, Random random, el el1, blc blc1) {
/*  99 */     blc blc2 = bct.aV.p();
/* 100 */     blc blc3 = blc2.a(bii.c, bmg.a);
/* 101 */     el el2 = el1.a();
/* 102 */     if (☃.a_(el2).c() == bct.A) {
/* 103 */       ☃.a(el1, blc2, 2);
/* 104 */       ☃.a(el2, blc3, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 110 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 115 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int j(blc ☃, axk axk1, el el1) {
/* 121 */     return bct.A.p().b(axk1, el1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */