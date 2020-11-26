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
/*     */ public abstract class bco
/*     */   extends bcs
/*     */ {
/*  18 */   protected static final cew a = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*  19 */   protected static final cew b = bcs.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*     */   
/*     */   private final boolean c;
/*     */   
/*     */   public static boolean a(axy ☃, el el1) {
/*  24 */     return k(☃.a_(el1));
/*     */   }
/*     */   
/*     */   public static boolean k(blc ☃) {
/*  28 */     return ☃.a(wv.z);
/*     */   }
/*     */   
/*     */   protected bco(boolean ☃, bcs.c c1) {
/*  32 */     super(c1);
/*  33 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  37 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  42 */     bmn bmn = (☃.c() == this) ? (bmn)☃.c(e()) : null;
/*  43 */     if (bmn != null && bmn.c()) {
/*  44 */       return b;
/*     */     }
/*  46 */     return a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  52 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/*  62 */     return ayc1.a_(el1.b()).q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  67 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/*  70 */     if (!axy1.B) {
/*  71 */       ☃ = a(axy1, el1, ☃, true);
/*     */       
/*  73 */       if (this.c) {
/*  74 */         ☃.a(axy1, el1, this, el1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/*  81 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  85 */     bmn bmn = (bmn)☃.c(e());
/*  86 */     boolean bool = false;
/*     */     
/*  88 */     if (!axy1.a_(el1.b()).q()) {
/*  89 */       bool = true;
/*     */     }
/*  91 */     if (bmn == bmn.c && !axy1.a_(el1.f()).q()) {
/*  92 */       bool = true;
/*  93 */     } else if (bmn == bmn.d && !axy1.a_(el1.e()).q()) {
/*  94 */       bool = true;
/*  95 */     } else if (bmn == bmn.e && !axy1.a_(el1.c()).q()) {
/*  96 */       bool = true;
/*  97 */     } else if (bmn == bmn.f && !axy1.a_(el1.d()).q()) {
/*  98 */       bool = true;
/*     */     } 
/*     */     
/* 101 */     if (bool && !axy1.c(el1)) {
/* 102 */       ☃.a(axy1, el1, 1.0F, 0);
/* 103 */       axy1.g(el1);
/*     */     } else {
/* 105 */       a(☃, axy1, el1, bcs1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(blc ☃, axy axy1, el el1, bcs bcs1) {}
/*     */   
/*     */   protected blc a(axy ☃, el el1, blc blc1, boolean bool) {
/* 113 */     if (☃.B) {
/* 114 */       return blc1;
/*     */     }
/* 116 */     return (new bgs(☃, el1, blc1)).a(☃.t(el1), bool).c();
/*     */   }
/*     */ 
/*     */   
/*     */   public bzc j(blc ☃) {
/* 121 */     return bzc.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/* 126 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/* 131 */     if (bool) {
/*     */       return;
/*     */     }
/*     */     
/* 135 */     super.a(☃, axy1, el1, blc1, bool);
/*     */     
/* 137 */     if (((bmn)☃.c(e())).c()) {
/* 138 */       axy1.b(el1.a(), this);
/*     */     }
/*     */     
/* 141 */     if (this.c) {
/* 142 */       axy1.b(el1, this);
/* 143 */       axy1.b(el1.b(), this);
/*     */     } 
/*     */   }
/*     */   
/*     */   public abstract bmm<bmn> e();
/*     */ }


/* Location:              F:\dw\server.jar!\bco.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */