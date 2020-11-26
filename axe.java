/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class axe
/*     */ {
/*  12 */   private ate a = ate.a;
/*  13 */   private ate b = ate.a;
/*  14 */   private ate c = ate.a;
/*     */   private int d;
/*     */   private int e;
/*     */   private boolean f;
/*     */   
/*     */   public axe(gy ☃) {
/*  20 */     a(☃);
/*     */   }
/*     */   
/*     */   public axe(ate ☃, ate ate1, ate ate2) {
/*  24 */     this(☃, ate1, ate2, 0, 7);
/*     */   }
/*     */   
/*     */   public axe(ate ☃, ate ate1, ate ate2, int i, int j) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = ate1;
/*  30 */     this.c = ate2;
/*  31 */     this.d = i;
/*  32 */     this.e = j;
/*  33 */     this.f = true;
/*     */   }
/*     */   
/*     */   public axe(ate ☃, ate ate1) {
/*  37 */     this(☃, ate.a, ate1);
/*     */   }
/*     */   
/*     */   public axe(ate ☃, ata ata1) {
/*  41 */     this(☃, new ate(ata1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a() {
/*  49 */     return this.a;
/*     */   }
/*     */   
/*     */   public ate b() {
/*  53 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  57 */     return !this.b.a();
/*     */   }
/*     */   
/*     */   public ate d() {
/*  61 */     return this.c;
/*     */   }
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
/*     */   public int e() {
/*  78 */     return this.d;
/*     */   }
/*     */   
/*     */   public int f() {
/*  82 */     return this.e;
/*     */   }
/*     */   
/*     */   public void g() {
/*  86 */     this.d++;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  90 */     this.e += ☃;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  94 */     return (this.d >= this.e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 102 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/* 106 */     gy gy1 = ☃.p("buy");
/* 107 */     this.a = ate.a(gy1);
/* 108 */     gy gy2 = ☃.p("sell");
/* 109 */     this.c = ate.a(gy2);
/* 110 */     if (☃.c("buyB", 10)) {
/* 111 */       this.b = ate.a(☃.p("buyB"));
/*     */     }
/* 113 */     if (☃.c("uses", 99)) {
/* 114 */       this.d = ☃.h("uses");
/*     */     }
/* 116 */     if (☃.c("maxUses", 99)) {
/* 117 */       this.e = ☃.h("maxUses");
/*     */     } else {
/* 119 */       this.e = 7;
/*     */     } 
/* 121 */     if (☃.c("rewardExp", 1)) {
/* 122 */       this.f = ☃.q("rewardExp");
/*     */     } else {
/* 124 */       this.f = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public gy k() {
/* 129 */     gy ☃ = new gy();
/* 130 */     ☃.a("buy", this.a.b(new gy()));
/* 131 */     ☃.a("sell", this.c.b(new gy()));
/* 132 */     if (!this.b.a()) {
/* 133 */       ☃.a("buyB", this.b.b(new gy()));
/*     */     }
/* 135 */     ☃.b("uses", this.d);
/* 136 */     ☃.b("maxUses", this.e);
/* 137 */     ☃.a("rewardExp", this.f);
/* 138 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\axe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */