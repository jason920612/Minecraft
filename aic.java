/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aic
/*     */   extends agt
/*     */ {
/*     */   private final afg a;
/*     */   private final double b;
/*     */   private double c;
/*     */   private double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private double g;
/*     */   private aog h;
/*     */   private int i;
/*     */   private boolean j;
/*     */   private final avh k;
/*     */   private final boolean l;
/*     */   
/*     */   public aic(afg ☃, double d, avh avh1, boolean bool) {
/*  25 */     this(☃, d, bool, avh1);
/*     */   }
/*     */   
/*     */   public aic(afg ☃, double d, boolean bool, avh avh1) {
/*  29 */     this.a = ☃;
/*  30 */     this.b = d;
/*  31 */     this.k = avh1;
/*  32 */     this.l = bool;
/*  33 */     a(3);
/*  34 */     if (!(☃.t() instanceof aiv)) {
/*  35 */       throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  41 */     if (this.i > 0) {
/*  42 */       this.i--;
/*  43 */       return false;
/*     */     } 
/*  45 */     this.h = this.a.m.a(this.a, 10.0D);
/*  46 */     if (this.h == null) {
/*  47 */       return false;
/*     */     }
/*  49 */     return (a(this.h.cB()) || a(this.h.cC()));
/*     */   }
/*     */   
/*     */   protected boolean a(ate ☃) {
/*  53 */     return this.k.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  58 */     if (this.l) {
/*  59 */       if (this.a.h(this.h) < 36.0D) {
/*  60 */         if (this.h.d(this.c, this.d, this.e) > 0.010000000000000002D) {
/*  61 */           return false;
/*     */         }
/*  63 */         if (Math.abs(this.h.x - this.f) > 5.0D || Math.abs(this.h.w - this.g) > 5.0D) {
/*  64 */           return false;
/*     */         }
/*     */       } else {
/*  67 */         this.c = this.h.q;
/*  68 */         this.d = this.h.r;
/*  69 */         this.e = this.h.s;
/*     */       } 
/*  71 */       this.f = this.h.x;
/*  72 */       this.g = this.h.w;
/*     */     } 
/*  74 */     return a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  79 */     this.c = this.h.q;
/*  80 */     this.d = this.h.r;
/*  81 */     this.e = this.h.s;
/*  82 */     this.j = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  87 */     this.h = null;
/*  88 */     this.a.t().q();
/*  89 */     this.i = 100;
/*  90 */     this.j = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  95 */     this.a.p().a(this.h, (this.a.L() + 20), this.a.K());
/*  96 */     if (this.a.h(this.h) < 6.25D) {
/*  97 */       this.a.t().q();
/*     */     } else {
/*  99 */       this.a.t().a(this.h, this.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 104 */     return this.j;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */