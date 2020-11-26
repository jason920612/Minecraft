/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ajq
/*     */   extends aeo
/*     */   implements aeq
/*     */ {
/*  28 */   protected bcs bF = bct.i;
/*     */   private int bC;
/*     */   private UUID bD;
/*     */   
/*     */   protected ajq(aev<?> ☃, axy axy1) {
/*  33 */     super(☃, axy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/*  38 */     if (i() != 0) {
/*  39 */       this.bC = 0;
/*     */     }
/*  41 */     super.J();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  46 */     super.k();
/*     */     
/*  48 */     if (i() != 0) {
/*  49 */       this.bC = 0;
/*     */     }
/*     */     
/*  52 */     if (this.bC > 0) {
/*  53 */       this.bC--;
/*  54 */       if (this.bC % 10 == 0) {
/*  55 */         double ☃ = this.T.nextGaussian() * 0.02D;
/*  56 */         double d1 = this.T.nextGaussian() * 0.02D;
/*  57 */         double d2 = this.T.nextGaussian() * 0.02D;
/*  58 */         this.m.a(fm.A, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H, this.r + 0.5D + (this.T.nextFloat() * this.I), this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H, ☃, d1, d2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/*  65 */     if (b(☃)) {
/*  66 */       return false;
/*     */     }
/*  68 */     this.bC = 0;
/*  69 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(el ☃, ayc ayc1) {
/*  74 */     if (ayc1.a_(☃.b()).c() == this.bF) {
/*  75 */       return 10.0F;
/*     */     }
/*  77 */     return ayc1.A(☃) - 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  82 */     super.b(☃);
/*  83 */     ☃.b("InLove", this.bC);
/*  84 */     if (this.bD != null) {
/*  85 */       ☃.a("LoveCause", this.bD);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public double aI() {
/*  91 */     return 0.14D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  96 */     super.a(☃);
/*  97 */     this.bC = ☃.h("InLove");
/*  98 */     this.bD = ☃.b("LoveCause") ? ☃.a("LoveCause") : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 103 */     int i = xq.c(this.q);
/* 104 */     int j = xq.c((bD()).b);
/* 105 */     int k = xq.c(this.s);
/* 106 */     el el = new el(i, j, k);
/* 107 */     return (☃.a_(el.b()).c() == this.bF && ☃.a(el, 0) > 8 && super.a(☃, bool));
/*     */   }
/*     */ 
/*     */   
/*     */   public int z() {
/* 112 */     return 120;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean H() {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(aog ☃) {
/* 122 */     return 1 + this.m.s.nextInt(3);
/*     */   }
/*     */   
/*     */   public boolean f(ate ☃) {
/* 126 */     return (☃.b() == atf.S);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 131 */     ate ate = ☃.b(adk1);
/* 132 */     if (f(ate)) {
/* 133 */       if (i() == 0 && dD()) {
/* 134 */         a(☃, ate);
/* 135 */         f(☃);
/* 136 */         return true;
/* 137 */       }  if (y_()) {
/* 138 */         a(☃, ate);
/* 139 */         a((int)((-i() / 20) * 0.1F), true);
/* 140 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     return super.a(☃, adk1);
/*     */   }
/*     */   
/*     */   protected void a(aog ☃, ate ate1) {
/* 148 */     if (!☃.bV.d) {
/* 149 */       ate1.g(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean dD() {
/* 154 */     return (this.bC <= 0);
/*     */   }
/*     */   
/*     */   public void f(@Nullable aog ☃) {
/* 158 */     this.bC = 600;
/*     */     
/* 160 */     if (☃ != null) {
/* 161 */       this.bD = ☃.bt();
/*     */     }
/*     */     
/* 164 */     this.m.a(this, (byte)18);
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 168 */     this.bC = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public tf dE() {
/* 173 */     if (this.bD == null) {
/* 174 */       return null;
/*     */     }
/* 176 */     aog ☃ = this.m.b(this.bD);
/* 177 */     if (☃ instanceof tf) {
/* 178 */       return (tf)☃;
/*     */     }
/* 180 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dF() {
/* 185 */     return (this.bC > 0);
/*     */   }
/*     */   
/*     */   public void dG() {
/* 189 */     this.bC = 0;
/*     */   }
/*     */   
/*     */   public boolean a(ajq ☃) {
/* 193 */     if (☃ == this) {
/* 194 */       return false;
/*     */     }
/* 196 */     if (☃.getClass() != getClass()) {
/* 197 */       return false;
/*     */     }
/* 199 */     return (dF() && ☃.dF());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */