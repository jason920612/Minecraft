/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class add
/*     */   implements adq
/*     */ {
/*     */   private final ij a;
/*     */   private final adq b;
/*     */   private final adq c;
/*     */   
/*     */   public add(ij ☃, adq adq1, adq adq2) {
/*  18 */     this.a = ☃;
/*  19 */     if (adq1 == null) {
/*  20 */       adq1 = adq2;
/*     */     }
/*  22 */     if (adq2 == null) {
/*  23 */       adq2 = adq1;
/*     */     }
/*  25 */     this.b = adq1;
/*  26 */     this.c = adq2;
/*     */     
/*  28 */     if (adq1.V_()) {
/*  29 */       adq2.a(adq1.j());
/*  30 */     } else if (adq2.V_()) {
/*  31 */       adq1.a(adq2.j());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  37 */     return this.b.T_() + this.c.T_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  42 */     return (this.b.P_() && this.c.P_());
/*     */   }
/*     */   
/*     */   public boolean a(ade ☃) {
/*  46 */     return (this.b == ☃ || this.c == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/*  51 */     if (this.b.O_()) {
/*  52 */       return this.b.N_();
/*     */     }
/*  54 */     if (this.c.O_()) {
/*  55 */       return this.c.N_();
/*     */     }
/*  57 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/*  62 */     return (this.b.O_() || this.c.O_());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/*  68 */     return this.b.O_() ? this.b.e() : this.c.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/*  73 */     if (☃ >= this.b.T_()) {
/*  74 */       return this.c.a(☃ - this.b.T_());
/*     */     }
/*  76 */     return this.b.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/*  82 */     if (☃ >= this.b.T_()) {
/*  83 */       return this.c.a(☃ - this.b.T_(), i);
/*     */     }
/*  85 */     return this.b.a(☃, i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/*  91 */     if (☃ >= this.b.T_()) {
/*  92 */       return this.c.b(☃ - this.b.T_());
/*     */     }
/*  94 */     return this.b.b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/* 100 */     if (☃ >= this.b.T_()) {
/* 101 */       this.c.a(☃ - this.b.T_(), ate1);
/*     */     } else {
/* 103 */       this.b.a(☃, ate1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 109 */     return this.b.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/* 114 */     this.b.g();
/* 115 */     this.c.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 120 */     return (this.b.a(☃) && this.c.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/* 125 */     this.b.b(☃);
/* 126 */     this.c.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {
/* 131 */     this.b.c(☃);
/* 132 */     this.c.c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1) {
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 142 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 151 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean V_() {
/* 156 */     return (this.b.V_() || this.c.V_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adp ☃) {
/* 161 */     this.b.a(☃);
/* 162 */     this.c.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public adp j() {
/* 167 */     return this.b.j();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String l() {
/* 178 */     return this.b.l();
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 183 */     return new apz(☃, this, aog1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 188 */     this.b.m();
/* 189 */     this.c.m();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\add.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */