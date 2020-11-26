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
/*     */ public abstract class bhj
/*     */   extends bcm
/*     */   implements bcz, bfv
/*     */ {
/*  22 */   public static final bmb a = bma.y;
/*     */   
/*  24 */   protected static final cew b = bcs.a(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
/*     */   
/*     */   protected bhj(bcs.c ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  32 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  33 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/*  36 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  41 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  56 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bji a(axk ☃) {
/*  61 */     return new bkc();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  66 */     if (axy1.B) {
/*  67 */       return true;
/*     */     }
/*     */     
/*  70 */     bji bji = axy1.f(el1);
/*  71 */     return (bji instanceof bkc && ((bkc)bji).b(aog1));
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  76 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/*  81 */     if (((Boolean)blc1.c(a)).booleanValue()) {
/*  82 */       ☃.a(el1, blc1.a(a, Boolean.valueOf(false)), 3);
/*  83 */       return byy.c;
/*     */     } 
/*  85 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/*  90 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  91 */       return byy.c.a(false);
/*     */     }
/*  93 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/*  98 */     return (!((Boolean)blc1.c(a)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 103 */     if (!((Boolean)blc1.c(a)).booleanValue() && byw1.c() == byy.c) {
/* 104 */       if (!☃.e()) {
/* 105 */         ☃.a(el1, blc1.a(a, Boolean.valueOf(true)), 3);
/* 106 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 108 */       return true;
/*     */     } 
/* 110 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bhj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */