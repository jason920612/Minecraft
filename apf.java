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
/*     */ public class apf
/*     */   extends aol
/*     */ {
/*  24 */   private static final or<Boolean> e = ou.a((Class)apf.class, ot.i);
/*     */ 
/*     */ 
/*     */   
/*     */   public apf(axy ☃) {
/*  29 */     super(aev.aH, ☃, 0.3125F, 0.3125F);
/*     */   }
/*     */   
/*     */   public apf(axy ☃, afa afa1, double d1, double d2, double d3) {
/*  33 */     super(aev.aH, afa1, d1, d2, d3, ☃, 0.3125F, 0.3125F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float k() {
/*  42 */     return l() ? 0.73F : super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aV() {
/*  47 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(axr ☃, axk axk1, el el1, blc blc1, byw byw1, float f) {
/*  52 */     if (l() && alx.a(blc1.c())) {
/*  53 */       return Math.min(0.8F, f);
/*     */     }
/*     */     
/*  56 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ceb ☃) {
/*  61 */     if (!this.m.B) {
/*  62 */       if (☃.d != null) {
/*  63 */         if (this.a != null) {
/*  64 */           if (☃.d.a(aea.a(this.a), 8.0F)) {
/*  65 */             if (☃.d.aF()) {
/*  66 */               a(this.a, ☃.d);
/*     */             } else {
/*  68 */               this.a.c(5.0F);
/*     */             } 
/*     */           }
/*     */         } else {
/*  72 */           ☃.d.a(aea.o, 5.0F);
/*     */         } 
/*  74 */         if (☃.d instanceof afa) {
/*  75 */           int i = 0;
/*  76 */           if (this.m.aj() == adi.c) {
/*  77 */             i = 10;
/*  78 */           } else if (this.m.aj() == adi.d) {
/*  79 */             i = 40;
/*     */           } 
/*  81 */           if (i > 0) {
/*  82 */             ((afa)☃.d).c(new aek(aem.t, 20 * i, 1));
/*     */           }
/*     */         } 
/*     */       } 
/*  86 */       this.m.a(this, this.q, this.r, this.s, 1.0F, false, this.m.X().b("mobGriefing"));
/*  87 */       V();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB() {
/*  93 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/*  98 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 103 */     this.ab.a(e, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 107 */     return ((Boolean)this.ab.<Boolean>a(e)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 111 */     this.ab.b(e, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean f() {
/* 116 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */