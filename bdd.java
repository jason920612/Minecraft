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
/*     */ public class bdd
/*     */   extends bcs
/*     */ {
/*  26 */   public static final bmj a = bma.Z;
/*     */ 
/*     */ 
/*     */   
/*  30 */   protected static final cew[] b = new cew[] {
/*  31 */       bcs.a(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  32 */       bcs.a(3.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  33 */       bcs.a(5.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  34 */       bcs.a(7.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  35 */       bcs.a(9.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  36 */       bcs.a(11.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  37 */       bcs.a(13.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D)
/*     */     };
/*     */   
/*     */   protected bdd(bcs.c ☃) {
/*  41 */     super(☃);
/*  42 */     v(((blc)this.m.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  47 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  57 */     if (axy1.B) {
/*  58 */       ate ate = aog1.b(adk1);
/*  59 */       return (a(axy1, el1, ☃, aog1) || ate.a());
/*     */     } 
/*     */     
/*  62 */     return a(axy1, el1, ☃, aog1);
/*     */   }
/*     */   
/*     */   private boolean a(axz ☃, el el1, blc blc1, aog aog1) {
/*  66 */     if (!aog1.q(false)) {
/*  67 */       return false;
/*     */     }
/*  69 */     aog1.a(ws.S);
/*     */     
/*  71 */     aog1.dw().a(2, 0.1F);
/*  72 */     int i = ((Integer)blc1.c(a)).intValue();
/*  73 */     if (i < 6) {
/*  74 */       ☃.a(el1, blc1.a(a, Integer.valueOf(i + 1)), 3);
/*     */     } else {
/*  76 */       ☃.g(el1);
/*     */     } 
/*     */     
/*  79 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  84 */     if (eq1 == eq.a && !☃.a(axz1, el1)) {
/*  85 */       return bct.a.p();
/*     */     }
/*     */     
/*  88 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  93 */     return ayc1.a_(el1.b()).d().b();
/*     */   }
/*     */ 
/*     */   
/*     */   public axx a(blc ☃, axy axy1, el el1, int i) {
/*  98 */     return atf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 103 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 108 */     return (7 - ((Integer)☃.c(a)).intValue()) * 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/* 118 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 123 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */