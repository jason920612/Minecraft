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
/*     */ public class bga
/*     */   extends bda
/*     */   implements bcv
/*     */ {
/*  18 */   protected static final cew a = bcs.a(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
/*     */   
/*     */   public bga(bcs.c ☃) {
/*  21 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  26 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  31 */     if (random.nextInt(25) == 0) {
/*  32 */       int i = 5;
/*  33 */       int j = 4;
/*  34 */       for (el el3 : el.b(el1.a(-4, -1, -4), el1.a(4, 1, 4))) {
/*  35 */         if (axy1.a_(el3).c() == this && --i <= 0) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/*  41 */       el el2 = el1.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
/*  42 */       for (int k = 0; k < 4; k++) {
/*  43 */         if (axy1.c(el2) && ☃.a(axy1, el2)) {
/*  44 */           el1 = el2;
/*     */         }
/*  46 */         el2 = el1.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
/*     */       } 
/*     */       
/*  49 */       if (axy1.c(el2) && ☃.a(axy1, el2)) {
/*  50 */         axy1.a(el2, ☃, 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(blc ☃, axk axk1, el el1) {
/*  57 */     return ☃.f(axk1, el1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  62 */     el el2 = el1.b();
/*  63 */     blc blc1 = ayc1.a_(el2);
/*  64 */     bcs bcs = blc1.c();
/*  65 */     if (bcs == bct.dV || bcs == bct.l) {
/*  66 */       return true;
/*     */     }
/*     */     
/*  69 */     return (ayc1.a(el1, 0) < 13 && b(blc1, ayc1, el2));
/*     */   }
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, Random random) {
/*  73 */     ☃.g(el1);
/*     */     
/*  75 */     bqo<brz> bqo = null;
/*  76 */     if (this == bct.bz) {
/*  77 */       bqo = bqo.U;
/*  78 */     } else if (this == bct.bA) {
/*  79 */       bqo = bqo.T;
/*     */     } 
/*     */     
/*  82 */     if (bqo != null && bqo.a(☃, (bmy)☃.H().f(), random, el1, bqp.e)) {
/*  83 */       return true;
/*     */     }
/*     */     
/*  86 */     ☃.a(el1, blc1, 3);
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, boolean bool) {
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axy ☃, Random random, el el1, blc blc1) {
/*  97 */     return (random.nextFloat() < 0.4D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(axy ☃, Random random, el el1, blc blc1) {
/* 102 */     a(☃, el1, blc1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(blc ☃, axk axk1, el el1) {
/* 107 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */