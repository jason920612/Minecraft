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
/*     */ public class bdx
/*     */   extends bcm
/*     */ {
/*  23 */   public static final bmj a = bma.al;
/*  24 */   public static final bmb b = bma.m;
/*     */   
/*  26 */   protected static final cew c = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D);
/*     */   
/*     */   public bdx(bcs.c ☃) {
/*  29 */     super(☃);
/*     */     
/*  31 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  36 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/*  41 */     return ((Integer)☃.c(a)).intValue();
/*     */   }
/*     */   
/*     */   public static void b(blc ☃, axy axy1, el el1) {
/*  45 */     if (!axy1.t.g()) {
/*     */       return;
/*     */     }
/*     */     
/*  49 */     int i = axy1.a(ayi.a, el1) - axy1.c();
/*  50 */     float f = axy1.c(1.0F);
/*     */     
/*  52 */     boolean bool = ((Boolean)☃.c(b)).booleanValue();
/*  53 */     if (bool) {
/*  54 */       i = 15 - i;
/*  55 */     } else if (i > 0) {
/*     */       
/*  57 */       float f1 = (f < 3.1415927F) ? 0.0F : 6.2831855F;
/*  58 */       f += (f1 - f) * 0.2F;
/*     */       
/*  60 */       i = Math.round(i * xq.b(f));
/*     */     } 
/*  62 */     i = xq.a(i, 0, 15);
/*     */     
/*  64 */     if (((Integer)☃.c(a)).intValue() != i) {
/*  65 */       axy1.a(el1, ☃.a(a, Integer.valueOf(i)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  71 */     if (aog1.dy()) {
/*  72 */       if (axy1.B) {
/*  73 */         return true;
/*     */       }
/*     */       
/*  76 */       blc blc1 = ☃.a(b);
/*  77 */       axy1.a(el1, blc1, 4);
/*  78 */       b(blc1, axy1, el1);
/*     */       
/*  80 */       return true;
/*     */     } 
/*  82 */     return super.a(☃, axy1, el1, aog1, adk1, eq1, f1, f2, f3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public bgy c(blc ☃) {
/*  92 */     return bgy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/* 102 */     return new bjp();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 107 */     ☃.a((bmm<?>[])new bmm[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 112 */     if (eq1 == eq.a) {
/* 113 */       return blb.a;
/*     */     }
/* 115 */     return blb.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */