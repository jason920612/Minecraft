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
/*     */ public abstract class ahh
/*     */   extends agt
/*     */ {
/*     */   private final afg f;
/*     */   public double a;
/*     */   protected int b;
/*     */   protected int c;
/*     */   private int g;
/*  19 */   protected el d = el.a;
/*     */   
/*     */   private boolean h;
/*     */   private final int i;
/*     */   private final int j;
/*     */   public int e;
/*     */   
/*     */   public ahh(afg ☃, double d, int i) {
/*  27 */     this(☃, d, i, 1);
/*     */   }
/*     */   
/*     */   public ahh(afg ☃, double d, int i, int j) {
/*  31 */     this.f = ☃;
/*  32 */     this.a = d;
/*  33 */     this.i = i;
/*  34 */     this.e = 0;
/*  35 */     this.j = j;
/*  36 */     a(5);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  41 */     if (this.b > 0) {
/*  42 */       this.b--;
/*  43 */       return false;
/*     */     } 
/*  45 */     this.b = a(this.f);
/*  46 */     return l();
/*     */   }
/*     */   
/*     */   protected int a(afg ☃) {
/*  50 */     return 200 + ☃.ce().nextInt(200);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  55 */     return (this.c >= -this.g && this.c <= 1200 && a(this.f.m, this.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  60 */     this.f.t().a(this.d.o() + 0.5D, (this.d.p() + 1), this.d.q() + 0.5D, this.a);
/*  61 */     this.c = 0;
/*  62 */     this.g = this.f.ce().nextInt(this.f.ce().nextInt(1200) + 1200) + 1200;
/*     */   }
/*     */   
/*     */   public double g() {
/*  66 */     return 1.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  71 */     if (this.f.d(this.d.a()) > g()) {
/*  72 */       this.h = false;
/*  73 */       this.c++;
/*  74 */       if (i()) {
/*  75 */         this.f.t().a(this.d.o() + 0.5D, (this.d.p() + j()), this.d.q() + 0.5D, this.a);
/*     */       }
/*     */     } else {
/*  78 */       this.h = true;
/*  79 */       this.c--;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean i() {
/*  84 */     return (this.c % 40 == 0);
/*     */   }
/*     */   
/*     */   public int j() {
/*  88 */     return 1;
/*     */   }
/*     */   
/*     */   protected boolean k() {
/*  92 */     return this.h;
/*     */   }
/*     */   
/*     */   private boolean l() {
/*  96 */     int ☃ = this.i;
/*  97 */     int i = this.j;
/*  98 */     el el1 = new el(this.f);
/*     */     
/* 100 */     el.a a = new el.a(); int j;
/* 101 */     for (j = this.e; j <= i; j = (j > 0) ? -j : (1 - j)) {
/* 102 */       for (int k = 0; k < ☃; k++) {
/* 103 */         int m; for (m = 0; m <= k; m = (m > 0) ? -m : (1 - m)) {
/*     */           
/* 105 */           int n = (m < k && m > -k) ? k : 0;
/* 106 */           for (; n <= k; n = (n > 0) ? -n : (1 - n)) {
/* 107 */             a.g(el1).d(m, j - 1, n);
/* 108 */             if (this.f.f(a) && a(this.f.m, a)) {
/* 109 */               this.d = a;
/* 110 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 117 */     return false;
/*     */   }
/*     */   
/*     */   protected abstract boolean a(ayc paramayc, el paramel);
/*     */ }


/* Location:              F:\dw\server.jar!\ahh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */