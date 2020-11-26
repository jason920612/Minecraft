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
/*     */ public class anx
/*     */   extends anw
/*     */ {
/*  38 */   private static final or<Boolean> a = ou.a((Class)anx.class, ot.i);
/*  39 */   private static final or<Integer> b = ou.a((Class)anx.class, ot.b);
/*     */ 
/*     */   
/*     */   private int bC;
/*     */ 
/*     */   
/*     */   private UUID bD;
/*     */ 
/*     */ 
/*     */   
/*     */   public anx(axy ☃) {
/*  50 */     super(aev.aL, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  55 */     super.x_();
/*     */     
/*  57 */     this.ab.a(a, Boolean.valueOf(false));
/*  58 */     this.ab.a(b, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  62 */     this.ab.b(b, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int dF() {
/*  66 */     return Math.max(((Integer)this.ab.<Integer>a(b)).intValue() % 6, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  71 */     super.b(☃);
/*     */     
/*  73 */     ☃.b("Profession", dF());
/*     */     
/*  75 */     ☃.b("ConversionTime", dI() ? this.bC : -1);
/*     */     
/*  77 */     if (this.bD != null) {
/*  78 */       ☃.a("ConversionPlayer", this.bD);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  84 */     super.a(☃);
/*     */     
/*  86 */     a(☃.h("Profession"));
/*     */     
/*  88 */     if (☃.c("ConversionTime", 99) && ☃.h("ConversionTime") > -1) {
/*  89 */       a(☃.b("ConversionPlayer") ? ☃.a("ConversionPlayer") : null, ☃.h("ConversionTime"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*  96 */     a(this.m.s.nextInt(6));
/*     */     
/*  98 */     return super.a(☃, afj1, gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 103 */     if (!this.m.B && dI()) {
/* 104 */       int ☃ = dK();
/*     */       
/* 106 */       this.bC -= ☃;
/*     */       
/* 108 */       if (this.bC <= 0) {
/* 109 */         dJ();
/*     */       }
/*     */     } 
/*     */     
/* 113 */     super.R_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 118 */     ate ate = ☃.b(adk1);
/* 119 */     if (ate.b() == atf.at && a(aem.r)) {
/* 120 */       if (!☃.bV.d) {
/* 121 */         ate.g(1);
/*     */       }
/*     */       
/* 124 */       if (!this.m.B) {
/* 125 */         a(☃.bt(), this.T.nextInt(2401) + 3600);
/*     */       }
/*     */       
/* 128 */       return true;
/*     */     } 
/*     */     
/* 131 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dC() {
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean H() {
/* 141 */     return !dI();
/*     */   }
/*     */   
/*     */   public boolean dI() {
/* 145 */     return ((Boolean)T().<Boolean>a(a)).booleanValue();
/*     */   }
/*     */   
/*     */   protected void a(@Nullable UUID ☃, int i) {
/* 149 */     this.bD = ☃;
/* 150 */     this.bC = i;
/* 151 */     T().b(a, Boolean.valueOf(true));
/*     */     
/* 153 */     d(aem.r);
/* 154 */     c(new aek(aem.e, i, Math.min(this.m.aj().a() - 1, 0)));
/*     */     
/* 156 */     this.m.a(this, (byte)16);
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
/*     */   protected void dJ() {
/* 171 */     aob ☃ = new aob(this.m);
/* 172 */     ☃.u(this);
/* 173 */     ☃.d(dF());
/* 174 */     ☃.a(this.m.h(new el(☃)), (afj)null, (gy)null, false);
/* 175 */     ☃.dC();
/* 176 */     if (y_()) {
/* 177 */       ☃.b_(-24000);
/*     */     }
/* 179 */     this.m.e(this);
/* 180 */     ☃.q(do());
/* 181 */     if (O_()) {
/* 182 */       ☃.b(e());
/* 183 */       ☃.m(by());
/*     */     } 
/* 185 */     this.m.a(☃);
/*     */     
/* 187 */     if (this.bD != null) {
/* 188 */       aog aog = this.m.b(this.bD);
/* 189 */       if (aog instanceof tf) {
/* 190 */         p.r.a((tf)aog, this, ☃);
/*     */       }
/*     */     } 
/*     */     
/* 194 */     ☃.c(new aek(aem.i, 200, 0));
/* 195 */     this.m.a((aog)null, 1027, new el((int)this.q, (int)this.r, (int)this.s), 0);
/*     */   }
/*     */   
/*     */   protected int dK() {
/* 199 */     int ☃ = 1;
/*     */     
/* 201 */     if (this.T.nextFloat() < 0.01F) {
/* 202 */       int i = 0;
/*     */       
/* 204 */       el.a a = new el.a();
/*     */       
/* 206 */       for (int j = (int)this.q - 4; j < (int)this.q + 4 && i < 14; j++) {
/* 207 */         for (int k = (int)this.r - 4; k < (int)this.r + 4 && i < 14; k++) {
/* 208 */           for (int m = (int)this.s - 4; m < (int)this.s + 4 && i < 14; m++) {
/* 209 */             bcs bcs = this.m.a_(a.c(j, k, m)).c();
/* 210 */             if (bcs == bct.dF || bcs instanceof bcq) {
/* 211 */               if (this.T.nextFloat() < 0.3F) {
/* 212 */                 ☃++;
/*     */               }
/* 214 */               i++;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 220 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cE() {
/* 225 */     if (y_()) {
/* 226 */       return (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 2.0F;
/*     */     }
/* 228 */     return (this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public wi D() {
/* 233 */     return wj.lG;
/*     */   }
/*     */ 
/*     */   
/*     */   public wi d(aea ☃) {
/* 238 */     return wj.lK;
/*     */   }
/*     */ 
/*     */   
/*     */   public wi cs() {
/* 243 */     return wj.lJ;
/*     */   }
/*     */ 
/*     */   
/*     */   public wi dA() {
/* 248 */     return wj.lL;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 254 */     return ccl.az;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate dB() {
/* 259 */     return ate.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */