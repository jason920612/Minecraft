/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class agj
/*     */   extends agt
/*     */ {
/*     */   protected afb a;
/*  14 */   protected el b = el.a;
/*     */   protected boolean c;
/*     */   private boolean d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   public agj(afb ☃) {
/*  21 */     this.a = ☃;
/*  22 */     if (!(☃.t() instanceof aiv)) {
/*  23 */       throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean g() {
/*  28 */     if (!this.c) {
/*  29 */       return false;
/*     */     }
/*  31 */     blc ☃ = this.a.m.a_(this.b);
/*  32 */     if (!(☃.c() instanceof bed)) {
/*  33 */       this.c = false;
/*  34 */       return false;
/*     */     } 
/*  36 */     return ((Boolean)☃.c(bed.b)).booleanValue();
/*     */   }
/*     */   
/*     */   protected void a(boolean ☃) {
/*  40 */     if (this.c) {
/*  41 */       blc blc = this.a.m.a_(this.b);
/*  42 */       if (blc.c() instanceof bed) {
/*  43 */         ((bed)blc.c()).a(this.a.m, this.b, ☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  50 */     if (!this.a.B) {
/*  51 */       return false;
/*     */     }
/*  53 */     aiv ☃ = (aiv)this.a.t();
/*  54 */     cbe cbe = ☃.m();
/*  55 */     if (cbe == null || cbe.b() || !☃.g()) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     for (int i = 0; i < Math.min(cbe.e() + 2, cbe.d()); i++) {
/*  60 */       cbc cbc = cbe.a(i);
/*  61 */       this.b = new el(cbc.a, cbc.b + 1, cbc.c);
/*  62 */       if (this.a.d(this.b.o(), this.a.r, this.b.q()) <= 2.25D) {
/*     */ 
/*     */         
/*  65 */         this.c = a(this.b);
/*  66 */         if (this.c) {
/*  67 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*  71 */     this.b = (new el(this.a)).a();
/*  72 */     this.c = a(this.b);
/*  73 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  78 */     return !this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  83 */     this.d = false;
/*  84 */     this.e = (float)((this.b.o() + 0.5F) - this.a.q);
/*  85 */     this.f = (float)((this.b.q() + 0.5F) - this.a.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  90 */     float ☃ = (float)((this.b.o() + 0.5F) - this.a.q);
/*  91 */     float f1 = (float)((this.b.q() + 0.5F) - this.a.s);
/*  92 */     float f2 = this.e * ☃ + this.f * f1;
/*  93 */     if (f2 < 0.0F) {
/*  94 */       this.d = true;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(el ☃) {
/*  99 */     blc blc = this.a.m.a_(☃);
/* 100 */     return (blc.c() instanceof bed && blc.d() == bza.w);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */