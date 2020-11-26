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
/*     */ public class agr
/*     */   extends agt
/*     */ {
/*     */   private final afl b;
/*     */   private afa c;
/*     */   protected final ayc a;
/*     */   private final double d;
/*     */   private final aiw e;
/*     */   private int f;
/*     */   private final float g;
/*     */   private final float h;
/*     */   private float i;
/*     */   
/*     */   public agr(afl ☃, double d, float f1, float f2) {
/*  32 */     this.b = ☃;
/*  33 */     this.a = ☃.m;
/*  34 */     this.d = d;
/*  35 */     this.e = ☃.t();
/*  36 */     this.h = f1;
/*  37 */     this.g = f2;
/*  38 */     a(3);
/*     */     
/*  40 */     if (!(☃.t() instanceof aiv) && !(☃.t() instanceof aiu)) {
/*  41 */       throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  47 */     afa ☃ = this.b.dB();
/*  48 */     if (☃ == null) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (☃ instanceof aog && ((aog)☃).t()) {
/*  52 */       return false;
/*     */     }
/*  54 */     if (this.b.dA()) {
/*  55 */       return false;
/*     */     }
/*  57 */     if (this.b.h(☃) < (this.h * this.h)) {
/*  58 */       return false;
/*     */     }
/*  60 */     this.c = ☃;
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  66 */     return (!this.e.p() && this.b.h(this.c) > (this.g * this.g) && !this.b.dA());
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  71 */     this.f = 0;
/*  72 */     this.i = this.b.a(cba.g);
/*  73 */     this.b.a(cba.g, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  78 */     this.c = null;
/*  79 */     this.e.q();
/*  80 */     this.b.a(cba.g, this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  85 */     this.b.p().a(this.c, 10.0F, this.b.K());
/*  86 */     if (this.b.dA()) {
/*     */       return;
/*     */     }
/*     */     
/*  90 */     if (--this.f > 0) {
/*     */       return;
/*     */     }
/*  93 */     this.f = 10;
/*     */     
/*  95 */     if (this.e.a(this.c, this.d)) {
/*     */       return;
/*     */     }
/*  98 */     if (this.b.dm() || this.b.aW()) {
/*     */       return;
/*     */     }
/* 101 */     if (this.b.h(this.c) < 144.0D) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 106 */     int ☃ = xq.c(this.c.q) - 2;
/* 107 */     int i = xq.c(this.c.s) - 2;
/* 108 */     int j = xq.c((this.c.bD()).b);
/* 109 */     for (int k = 0; k <= 4; k++) {
/* 110 */       for (int m = 0; m <= 4; m++) {
/* 111 */         if (k < 1 || m < 1 || k > 3 || m > 3)
/*     */         {
/*     */           
/* 114 */           if (a(☃, i, j, k, m)) {
/* 115 */             this.b.b(((☃ + k) + 0.5F), j, ((i + m) + 0.5F), this.b.w, this.b.x);
/* 116 */             this.e.q();
/*     */             return;
/*     */           }  } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k, int m) {
/* 124 */     el el = new el(☃ + k, j - 1, i + m);
/* 125 */     blc blc = this.a.a_(el);
/* 126 */     return (blc.c(this.a, el, eq.a) == blb.a && blc.a(this.b) && this.a.c(el.a()) && this.a.c(el.b(2)));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */