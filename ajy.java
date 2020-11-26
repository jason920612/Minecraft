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
/*     */ public class ajy
/*     */   extends afl
/*     */ {
/*  58 */   private static final avh bG = avh.a(new axx[] { atf.bb, atf.bc, atf.bd, atf.be });
/*     */   
/*  60 */   private static final or<Integer> bH = ou.a((Class)ajy.class, ot.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  67 */   private static final pc bI = new pc("cat");
/*     */   
/*     */   private agd<aog> bJ;
/*     */   
/*     */   private aic bK;
/*     */   
/*     */   public ajy(axy ☃) {
/*  74 */     super(aev.W, ☃);
/*  75 */     a(0.6F, 0.7F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  80 */     this.bE = new ahz(this);
/*  81 */     this.bK = new aic(this, 0.6D, bG, true);
/*     */     
/*  83 */     this.by.a(1, new agm(this));
/*  84 */     this.by.a(2, this.bE);
/*  85 */     this.by.a(3, this.bK);
/*  86 */     this.by.a(5, new agr(this, 1.0D, 10.0F, 5.0F));
/*  87 */     this.by.a(6, new ahl(this, 0.8D));
/*  88 */     this.by.a(7, new agz(this, 0.3F));
/*  89 */     this.by.a(8, new ahk(this));
/*  90 */     this.by.a(9, new agi(this, 0.8D));
/*  91 */     this.by.a(10, new aih(this, 0.8D, 1.0000001E-5F));
/*  92 */     this.by.a(11, new ahb(this, (Class)aog.class, 10.0F));
/*     */     
/*  94 */     this.bz.a(1, new aip<>(this, ajr.class, false, null));
/*  95 */     this.bz.a(1, new aip<>(this, (Class)akk.class, false, akk.bC));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 100 */     super.x_();
/*     */     
/* 102 */     this.ab.a(bH, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void J() {
/* 107 */     if (r().b()) {
/* 108 */       double ☃ = r().c();
/* 109 */       if (☃ == 0.6D) {
/* 110 */         e(true);
/* 111 */         f(false);
/* 112 */       } else if (☃ == 1.33D) {
/* 113 */         e(false);
/* 114 */         f(true);
/*     */       } else {
/* 116 */         e(false);
/* 117 */         f(false);
/*     */       } 
/*     */     } else {
/* 120 */       e(false);
/* 121 */       f(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean H() {
/* 127 */     return (!dy() && this.U > 2400);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 132 */     super.bZ();
/*     */     
/* 134 */     a(ank.a).a(10.0D);
/* 135 */     a(ank.d).a(0.30000001192092896D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 145 */     super.b(☃);
/* 146 */     ☃.b("CatType", dH());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 151 */     super.a(☃);
/* 152 */     p(☃.h("CatType"));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi D() {
/* 158 */     if (dy()) {
/* 159 */       if (dF()) {
/* 160 */         return wj.ar;
/*     */       }
/* 162 */       if (this.T.nextInt(4) == 0) {
/* 163 */         return wj.as;
/*     */       }
/* 165 */       return wj.an;
/*     */     } 
/*     */     
/* 168 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 173 */     return wj.aq;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 178 */     return wj.ao;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/* 183 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aer ☃) {
/* 188 */     return ☃.a(aea.a(this), 3.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 193 */     if (b(☃)) {
/* 194 */       return false;
/*     */     }
/*     */     
/* 197 */     if (this.bE != null) {
/* 198 */       this.bE.a(false);
/*     */     }
/*     */     
/* 201 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 207 */     return ccl.V;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 212 */     ate ate = ☃.b(adk1);
/* 213 */     if (dy()) {
/* 214 */       if (f(☃) && 
/* 215 */         !this.m.B && !f(ate)) {
/* 216 */         this.bE.a(!dA());
/*     */       
/*     */       }
/*     */     }
/* 220 */     else if ((this.bK == null || this.bK.g()) && bG.a(ate) && ☃.h(this) < 9.0D) {
/* 221 */       if (!☃.bV.d) {
/* 222 */         ate.g(1);
/*     */       }
/*     */       
/* 225 */       if (!this.m.B) {
/* 226 */         if (this.T.nextInt(3) == 0) {
/* 227 */           c(☃);
/* 228 */           p(1 + this.m.s.nextInt(3));
/* 229 */           s(true);
/* 230 */           this.bE.a(true);
/* 231 */           this.m.a(this, (byte)7);
/*     */         } else {
/* 233 */           s(false);
/* 234 */           this.m.a(this, (byte)6);
/*     */         } 
/*     */       }
/* 237 */       return true;
/*     */     } 
/*     */     
/* 240 */     return super.a(☃, adk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ajy b(aeo ☃) {
/* 245 */     ajy ajy1 = new ajy(this.m);
/* 246 */     if (dy()) {
/* 247 */       ajy1.b(C_());
/* 248 */       ajy1.t(true);
/* 249 */       ajy1.p(dH());
/*     */     } 
/* 251 */     return ajy1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/* 256 */     return bG.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ajq ☃) {
/* 261 */     if (☃ == this) {
/* 262 */       return false;
/*     */     }
/* 264 */     if (!dy()) {
/* 265 */       return false;
/*     */     }
/* 267 */     if (!(☃ instanceof ajy)) {
/* 268 */       return false;
/*     */     }
/*     */     
/* 271 */     ajy ajy1 = (ajy)☃;
/* 272 */     if (!ajy1.dy()) {
/* 273 */       return false;
/*     */     }
/*     */     
/* 276 */     return (dF() && ajy1.dF());
/*     */   }
/*     */   
/*     */   public int dH() {
/* 280 */     return ((Integer)this.ab.<Integer>a(bH)).intValue();
/*     */   }
/*     */   
/*     */   public void p(int ☃) {
/* 284 */     this.ab.b(bH, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 290 */     if (this.T.nextInt(3) == 0) {
/* 291 */       return false;
/*     */     }
/*     */     
/* 294 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ayc ☃) {
/* 299 */     if (☃.a_(this, bD()) && ☃.c(this, bD()) && !☃.c(bD())) {
/* 300 */       el el = new el(this.q, (bD()).b, this.s);
/* 301 */       if (el.p() < ☃.k()) {
/* 302 */         return false;
/*     */       }
/*     */       
/* 305 */       blc blc = ☃.a_(el.b());
/* 306 */       bcs bcs = blc.c();
/* 307 */       if (bcs == bct.i || blc.a(wv.A)) {
/* 308 */         return true;
/*     */       }
/*     */     } 
/* 311 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 316 */     ij ☃ = e();
/* 317 */     if (☃ != null) {
/* 318 */       return ☃;
/*     */     }
/* 320 */     if (dy()) {
/* 321 */       return new ir(k.a("entity", bI), new Object[0]);
/*     */     }
/* 323 */     return super.N_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dz() {
/* 328 */     if (this.bJ == null) {
/* 329 */       this.bJ = new agd<>(this, aog.class, 16.0F, 0.8D, 1.33D);
/*     */     }
/*     */     
/* 332 */     this.by.a(this.bJ);
/*     */     
/* 334 */     if (!dy()) {
/* 335 */       this.by.a(4, this.bJ);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 342 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/* 344 */     if (dH() == 0 && this.m.s.nextInt(7) == 0) {
/* 345 */       for (int i = 0; i < 2; i++) {
/* 346 */         ajy ajy1 = new ajy(this.m);
/* 347 */         ajy1.b(this.q, this.r, this.s, this.w, 0.0F);
/* 348 */         ajy1.b_(-24000);
/* 349 */         this.m.a(ajy1);
/*     */       } 
/*     */     }
/* 352 */     return afj1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */