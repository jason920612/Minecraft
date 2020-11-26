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
/*     */ public abstract class bcn
/*     */   extends bcs
/*     */ {
/*  21 */   protected static final cew a = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 0.5D, 15.0D);
/*  22 */   protected static final cew b = bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
/*  23 */   protected static final cea c = new cea(0.125D, 0.0D, 0.125D, 0.875D, 0.25D, 0.875D);
/*     */   
/*     */   protected bcn(bcs.c ☃) {
/*  26 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  31 */     return (k(☃) > 0) ? a : b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/*  36 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  41 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  51 */     if (eq1 == eq.a && !☃.a(axz1, el1)) {
/*  52 */       return bct.a.p();
/*     */     }
/*  54 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  59 */     blc blc1 = ayc1.a_(el1.b());
/*  60 */     return (blc1.q() || blc1.c() instanceof ber);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  65 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  69 */     int i = k(☃);
/*  70 */     if (i > 0) {
/*  71 */       a(axy1, el1, ☃, i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/*  77 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  81 */     int i = k(☃);
/*  82 */     if (i == 0) {
/*  83 */       a(axy1, el1, ☃, i);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(axy ☃, el el1, blc blc1, int i) {
/*  88 */     int j = b(☃, el1);
/*  89 */     boolean bool1 = (i > 0);
/*  90 */     boolean bool2 = (j > 0);
/*     */     
/*  92 */     if (i != j) {
/*  93 */       blc1 = a(blc1, j);
/*  94 */       ☃.a(el1, blc1, 2);
/*  95 */       a(☃, el1);
/*  96 */       ☃.a(el1, el1);
/*     */     } 
/*     */     
/*  99 */     if (!bool2 && bool1) {
/* 100 */       b(☃, el1);
/* 101 */     } else if (bool2 && !bool1) {
/* 102 */       a(☃, el1);
/*     */     } 
/*     */     
/* 105 */     if (bool2) {
/* 106 */       ☃.J().a(new el(el1), this, a(☃));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(axz paramaxz, el paramel);
/*     */   
/*     */   protected abstract void b(axz paramaxz, el paramel);
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 116 */     if (bool || ☃.c() == blc1.c()) {
/*     */       return;
/*     */     }
/* 119 */     if (k(☃) > 0) {
/* 120 */       a(axy1, el1);
/*     */     }
/*     */     
/* 123 */     super.a(☃, axy1, el1, blc1, bool);
/*     */   }
/*     */   
/*     */   protected void a(axy ☃, el el1) {
/* 127 */     ☃.b(el1, this);
/* 128 */     ☃.b(el1.b(), this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/* 133 */     return k(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/* 138 */     if (eq1 == eq.b) {
/* 139 */       return k(☃);
/*     */     }
/*     */     
/* 142 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzc j(blc ☃) {
/* 152 */     return bzc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract int b(axy paramaxy, el paramel);
/*     */   
/*     */   protected abstract int k(blc paramblc);
/*     */   
/*     */   protected abstract blc a(blc paramblc, int paramInt);
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 163 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bcn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */