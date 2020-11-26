/*     */ import java.util.List;
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
/*     */ public class amc
/*     */   extends ama
/*     */ {
/*     */   public amc(axy ☃) {
/*  22 */     super(aev.J, ☃);
/*     */   }
/*     */   
/*     */   public amc(axy ☃, el el1) {
/*  26 */     super(aev.J, ☃, el1);
/*     */     
/*  28 */     b(el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D);
/*  29 */     float f1 = 0.125F;
/*  30 */     float f2 = 0.1875F;
/*  31 */     float f3 = 0.25F;
/*  32 */     a(new cea(this.q - 0.1875D, this.r - 0.25D + 0.125D, this.s - 0.1875D, this.q + 0.1875D, this.r + 0.25D + 0.125D, this.s + 0.1875D));
/*  33 */     this.l = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(double ☃, double d1, double d2) {
/*  38 */     super.b(xq.c(☃) + 0.5D, xq.c(d1) + 0.5D, xq.c(d2) + 0.5D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void f() {
/*  43 */     this.q = this.b.o() + 0.5D;
/*  44 */     this.r = this.b.p() + 0.5D;
/*  45 */     this.s = this.b.q() + 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(eq ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int k() {
/*  55 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/*  60 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  65 */     return -0.0625F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable aer ☃) {
/*  75 */     a(wj.eN, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(aog ☃, adk adk1) {
/*  88 */     if (this.m.B) {
/*  89 */       return true;
/*     */     }
/*     */     
/*  92 */     boolean bool = false;
/*  93 */     double d = 7.0D;
/*  94 */     List<afb> list = this.m.a(afb.class, new cea(this.q - 7.0D, this.r - 7.0D, this.s - 7.0D, this.q + 7.0D, this.r + 7.0D, this.s + 7.0D));
/*  95 */     for (afb afb : list) {
/*  96 */       if (afb.dm() && afb.dn() == ☃) {
/*  97 */         afb.b(this, true);
/*  98 */         bool = true;
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     if (!bool) {
/* 103 */       V();
/* 104 */       if (☃.bV.d) {
/* 105 */         for (afb afb : list) {
/* 106 */           if (afb.dm() && afb.dn() == this) {
/* 107 */             afb.a(true, false);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 119 */     return this.m.a_(this.b).c() instanceof ber;
/*     */   }
/*     */   
/*     */   public static amc a(axy ☃, el el1) {
/* 123 */     amc amc1 = new amc(☃, el1);
/* 124 */     ☃.a(amc1);
/* 125 */     amc1.m();
/* 126 */     return amc1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static amc b(axy ☃, el el1) {
/* 131 */     int i = el1.o();
/* 132 */     int j = el1.p();
/* 133 */     int k = el1.q();
/*     */     
/* 135 */     List<amc> list = ☃.a(amc.class, new cea(i - 1.0D, j - 1.0D, k - 1.0D, i + 1.0D, j + 1.0D, k + 1.0D));
/* 136 */     for (amc amc1 : list) {
/* 137 */       if (amc1.n().equals(el1)) {
/* 138 */         return amc1;
/*     */       }
/*     */     } 
/* 141 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 146 */     a(wj.eO, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */