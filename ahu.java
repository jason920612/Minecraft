/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ahu<T extends ang & anj>
/*     */   extends agt
/*     */ {
/*     */   private final T a;
/*     */   private final double b;
/*     */   private int c;
/*     */   private final float d;
/*  17 */   private int e = -1;
/*     */   private int f;
/*     */   private boolean g;
/*     */   private boolean h;
/*  21 */   private int i = -1;
/*     */   
/*     */   public ahu(T ☃, double d, int i, float f) {
/*  24 */     this.a = ☃;
/*  25 */     this.b = d;
/*  26 */     this.c = i;
/*  27 */     this.d = f * f;
/*  28 */     a(3);
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  32 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  37 */     if (this.a.v() == null) {
/*  38 */       return false;
/*     */     }
/*  40 */     return g();
/*     */   }
/*     */   
/*     */   protected boolean g() {
/*  44 */     return (!this.a.cB().a() && this.a.cB().b() == atf.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  49 */     return ((a() || !this.a.t().p()) && g());
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  54 */     super.c();
/*     */     
/*  56 */     ((anj)this.a).s(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  61 */     super.d();
/*     */     
/*  63 */     ((anj)this.a).s(false);
/*  64 */     this.f = 0;
/*  65 */     this.e = -1;
/*  66 */     this.a.da();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  71 */     afa ☃ = this.a.v();
/*  72 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*  75 */     double d = this.a.d(☃.q, (☃.bD()).b, ☃.s);
/*  76 */     boolean bool1 = this.a.u().a(☃);
/*  77 */     boolean bool2 = (this.f > 0);
/*     */     
/*  79 */     if (bool1 != bool2) {
/*  80 */       this.f = 0;
/*     */     }
/*     */     
/*  83 */     if (bool1) {
/*  84 */       this.f++;
/*     */     } else {
/*  86 */       this.f--;
/*     */     } 
/*     */     
/*  89 */     if (d > this.d || this.f < 20) {
/*  90 */       this.a.t().a(☃, this.b);
/*  91 */       this.i = -1;
/*     */     } else {
/*  93 */       this.a.t().q();
/*  94 */       this.i++;
/*     */     } 
/*     */     
/*  97 */     if (this.i >= 20) {
/*  98 */       if (this.a.ce().nextFloat() < 0.3D) {
/*  99 */         this.g = !this.g;
/*     */       }
/* 101 */       if (this.a.ce().nextFloat() < 0.3D) {
/* 102 */         this.h = !this.h;
/*     */       }
/* 104 */       this.i = 0;
/*     */     } 
/*     */     
/* 107 */     if (this.i > -1) {
/* 108 */       if (d > (this.d * 0.75F)) {
/* 109 */         this.h = false;
/* 110 */       } else if (d < (this.d * 0.25F)) {
/* 111 */         this.h = true;
/*     */       } 
/* 113 */       this.a.r().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
/* 114 */       this.a.a(☃, 30.0F, 30.0F);
/*     */     } else {
/* 116 */       this.a.p().a(☃, 30.0F, 30.0F);
/*     */     } 
/*     */     
/* 119 */     if (this.a.cT()) {
/* 120 */       if (!bool1 && this.f < -60) {
/* 121 */         this.a.da();
/* 122 */       } else if (bool1) {
/* 123 */         int i = this.a.cY();
/*     */         
/* 125 */         if (i >= 20) {
/* 126 */           this.a.da();
/* 127 */           ((anj)this.a).a(☃, arp.a(i));
/* 128 */           this.e = this.c;
/*     */         } 
/*     */       } 
/* 131 */     } else if (--this.e <= 0 && this.f >= -60) {
/* 132 */       this.a.c(adk.a);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ahu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */