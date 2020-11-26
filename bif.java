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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bif
/*     */   extends bcs
/*     */ {
/*  22 */   public static final bmj a = bma.X;
/*     */ 
/*     */   
/*  25 */   protected static final cew b = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
/*     */   
/*     */   protected bif(bcs.c ☃) {
/*  28 */     super(☃);
/*  29 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  34 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  39 */     if (☃.a(axy1, el1) && axy1.c(el1.a())) {
/*  40 */       int i = 1;
/*  41 */       while (axy1.a_(el1.c(i)).c() == this) {
/*  42 */         i++;
/*     */       }
/*  44 */       if (i < 3) {
/*  45 */         int j = ((Integer)☃.c(a)).intValue();
/*  46 */         if (j == 15) {
/*  47 */           axy1.a(el1.a(), p());
/*  48 */           axy1.a(el1, ☃.a(a, Integer.valueOf(0)), 4);
/*     */         } else {
/*  50 */           axy1.a(el1, ☃.a(a, Integer.valueOf(j + 1)), 4);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  58 */     if (!☃.a(axz1, el1)) {
/*  59 */       return bct.a.p();
/*     */     }
/*     */     
/*  62 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  67 */     bcs bcs1 = ayc1.a_(el1.b()).c();
/*  68 */     if (bcs1 == this) {
/*  69 */       return true;
/*     */     }
/*     */     
/*  72 */     if (bcs1 == bct.i || bcs1 == bct.j || bcs1 == bct.k || bcs1 == bct.l || bcs1 == bct.D || bcs1 == bct.E) {
/*  73 */       el el2 = el1.b();
/*  74 */       for (eq eq : eq.c.a) {
/*  75 */         blc blc1 = ayc1.a_(el2.a(eq));
/*  76 */         byw byw = ayc1.b(el2.a(eq));
/*  77 */         if (byw.a(ww.a) || blc1.c() == bct.ij) {
/*  78 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  83 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  88 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/*  93 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/*  98 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 103 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */