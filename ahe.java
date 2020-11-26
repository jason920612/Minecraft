/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ahe
/*     */   extends agt
/*     */ {
/*     */   protected afg a;
/*     */   protected int b;
/*     */   private final double d;
/*     */   private final boolean e;
/*     */   private cbe f;
/*     */   private int g;
/*     */   private double h;
/*     */   private double i;
/*     */   private double j;
/*  21 */   protected final int c = 20;
/*     */   
/*     */   public ahe(afg ☃, double d, boolean bool) {
/*  24 */     this.a = ☃;
/*  25 */     this.d = d;
/*  26 */     this.e = bool;
/*  27 */     a(3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  32 */     afa ☃ = this.a.v();
/*  33 */     if (☃ == null) {
/*  34 */       return false;
/*     */     }
/*  36 */     if (!☃.aF()) {
/*  37 */       return false;
/*     */     }
/*  39 */     this.f = this.a.t().a(☃);
/*  40 */     if (this.f != null) {
/*  41 */       return true;
/*     */     }
/*  43 */     if (a(☃) >= this.a.d(☃.q, (☃.bD()).b, ☃.s)) {
/*  44 */       return true;
/*     */     }
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  51 */     afa ☃ = this.a.v();
/*  52 */     if (☃ == null) {
/*  53 */       return false;
/*     */     }
/*  55 */     if (!☃.aF()) {
/*  56 */       return false;
/*     */     }
/*  58 */     if (!this.e) {
/*  59 */       return !this.a.t().p();
/*     */     }
/*  61 */     if (!this.a.f(new el(☃))) {
/*  62 */       return false;
/*     */     }
/*     */     
/*  65 */     if (☃ instanceof aog && (((aog)☃).t() || ((aog)☃).u())) {
/*  66 */       return false;
/*     */     }
/*     */     
/*  69 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  74 */     this.a.t().a(this.f, this.d);
/*  75 */     this.g = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  80 */     afa ☃ = this.a.v();
/*  81 */     if (☃ instanceof aog && (((aog)☃).t() || ((aog)☃).u())) {
/*  82 */       this.a.e((afa)null);
/*     */     }
/*  84 */     this.a.t().q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  89 */     afa ☃ = this.a.v();
/*  90 */     this.a.p().a(☃, 30.0F, 30.0F);
/*  91 */     double d = this.a.d(☃.q, (☃.bD()).b, ☃.s);
/*  92 */     this.g--;
/*     */     
/*  94 */     if ((this.e || this.a.u().a(☃)) && 
/*  95 */       this.g <= 0 && ((
/*  96 */       this.h == 0.0D && this.i == 0.0D && this.j == 0.0D) || ☃.d(this.h, this.i, this.j) >= 1.0D || this.a.ce().nextFloat() < 0.05F)) {
/*  97 */       this.h = ☃.q;
/*  98 */       this.i = (☃.bD()).b;
/*  99 */       this.j = ☃.s;
/* 100 */       this.g = 4 + this.a.ce().nextInt(7);
/*     */       
/* 102 */       if (d > 1024.0D) {
/* 103 */         this.g += 10;
/* 104 */       } else if (d > 256.0D) {
/* 105 */         this.g += 5;
/*     */       } 
/*     */       
/* 108 */       if (!this.a.t().a(☃, this.d)) {
/* 109 */         this.g += 15;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 115 */     this.b = Math.max(this.b - 1, 0);
/* 116 */     a(☃, d);
/*     */   }
/*     */   
/*     */   protected void a(afa ☃, double d) {
/* 120 */     double d1 = a(☃);
/* 121 */     if (d <= d1 && this.b <= 0) {
/* 122 */       this.b = 20;
/* 123 */       this.a.a(adk.a);
/* 124 */       this.a.B(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected double a(afa ☃) {
/* 129 */     return (this.a.H * 2.0F * this.a.H * 2.0F + ☃.H);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ahe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */