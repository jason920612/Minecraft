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
/*     */ public class amn
/*     */   extends aer
/*     */ {
/*  18 */   private static final or<Integer> a = ou.a((Class)amn.class, ot.b);
/*     */   
/*     */   @Nullable
/*     */   private afa b;
/*     */   
/*  23 */   private int c = 80;
/*     */   
/*     */   public amn(axy ☃) {
/*  26 */     super(aev.ad, ☃);
/*  27 */     this.j = true;
/*  28 */     this.aa = true;
/*  29 */     a(0.98F, 0.98F);
/*     */   }
/*     */   
/*     */   public amn(axy ☃, double d1, double d2, double d3, @Nullable afa afa1) {
/*  33 */     this(☃);
/*     */     
/*  35 */     b(d1, d2, d3);
/*     */     
/*  37 */     float f = (float)(Math.random() * 6.2831854820251465D);
/*  38 */     this.t = (-((float)Math.sin(f)) * 0.02F);
/*  39 */     this.u = 0.20000000298023224D;
/*  40 */     this.v = (-((float)Math.cos(f)) * 0.02F);
/*     */     
/*  42 */     a(80);
/*     */     
/*  44 */     this.n = d1;
/*  45 */     this.o = d2;
/*  46 */     this.p = d3;
/*  47 */     this.b = afa1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  52 */     this.ab.a(a, Integer.valueOf(80));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/*  62 */     return !this.G;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  67 */     this.n = this.q;
/*  68 */     this.o = this.r;
/*  69 */     this.p = this.s;
/*     */     
/*  71 */     if (!aj()) {
/*  72 */       this.u -= 0.03999999910593033D;
/*     */     }
/*  74 */     a(afe.a, this.t, this.u, this.v);
/*  75 */     this.t *= 0.9800000190734863D;
/*  76 */     this.u *= 0.9800000190734863D;
/*  77 */     this.v *= 0.9800000190734863D;
/*     */     
/*  79 */     if (this.A) {
/*  80 */       this.t *= 0.699999988079071D;
/*  81 */       this.v *= 0.699999988079071D;
/*  82 */       this.u *= -0.5D;
/*     */     } 
/*     */     
/*  85 */     this.c--;
/*  86 */     if (this.c <= 0) {
/*  87 */       V();
/*  88 */       if (!this.m.B) {
/*  89 */         l();
/*     */       }
/*     */     } else {
/*  92 */       at();
/*  93 */       this.m.a(fm.M, this.q, this.r + 0.5D, this.s, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void l() {
/*  98 */     float ☃ = 4.0F;
/*  99 */     this.m.a(this, this.q, this.r + (this.I / 16.0F), this.s, 4.0F, true);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 104 */     ☃.a("Fuse", (short)k());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 109 */     a(☃.g("Fuse"));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa f() {
/* 114 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 119 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 123 */     this.ab.b(a, Integer.valueOf(☃));
/* 124 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 129 */     if (a.equals(☃)) {
/* 130 */       this.c = i();
/*     */     }
/*     */   }
/*     */   
/*     */   public int i() {
/* 135 */     return ((Integer)this.ab.<Integer>a(a)).intValue();
/*     */   }
/*     */   
/*     */   public int k() {
/* 139 */     return this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */