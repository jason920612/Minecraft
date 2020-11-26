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
/*     */ public class aka
/*     */   extends ajq
/*     */ {
/*  41 */   private static final or<Boolean> bC = ou.a((Class)aka.class, ot.i);
/*  42 */   private static final or<Integer> bD = ou.a((Class)aka.class, ot.b);
/*  43 */   private static final avh bE = avh.a(new axx[] { atf.dC, atf.dD, atf.eP });
/*     */   
/*     */   private boolean bG;
/*     */   
/*     */   private int bH;
/*     */   
/*     */   private int bI;
/*     */   
/*     */   public aka(axy ☃) {
/*  52 */     super(aev.Z, ☃);
/*  53 */     a(0.9F, 0.9F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  58 */     this.by.a(0, new agm(this));
/*  59 */     this.by.a(1, new aho(this, 1.25D));
/*  60 */     this.by.a(3, new agi(this, 1.0D));
/*  61 */     this.by.a(4, new aic(this, 1.2D, avh.a(new axx[] { atf.dO }, ), false));
/*  62 */     this.by.a(4, new aic(this, 1.2D, false, bE));
/*  63 */     this.by.a(5, new ags(this, 1.1D));
/*  64 */     this.by.a(6, new aih(this, 1.0D));
/*  65 */     this.by.a(7, new ahb(this, (Class)aog.class, 6.0F));
/*  66 */     this.by.a(8, new ahq(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  71 */     super.bZ();
/*     */     
/*  73 */     a(ank.a).a(10.0D);
/*  74 */     a(ank.d).a(0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aer bO() {
/*  80 */     if (bP().isEmpty()) {
/*  81 */       return null;
/*     */     }
/*  83 */     return bP().get(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dh() {
/*  88 */     aer ☃ = bO();
/*  89 */     if (!(☃ instanceof aog)) {
/*  90 */       return false;
/*     */     }
/*  92 */     aog aog = (aog)☃;
/*     */     
/*  94 */     if (aog.cB().b() == atf.dO || aog.cC().b() == atf.dO) {
/*  95 */       return true;
/*     */     }
/*     */     
/*  98 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(or<?> ☃) {
/* 103 */     if (bD.equals(☃) && this.m.B) {
/* 104 */       this.bG = true;
/* 105 */       this.bH = 0;
/* 106 */       this.bI = ((Integer)this.ab.<Integer>a(bD)).intValue();
/*     */     } 
/* 108 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 113 */     super.x_();
/* 114 */     this.ab.a(bC, Boolean.valueOf(false));
/* 115 */     this.ab.a(bD, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 120 */     super.b(☃);
/* 121 */     ☃.a("Saddle", dy());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 126 */     super.a(☃);
/* 127 */     s(☃.q("Saddle"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 132 */     return wj.gE;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 137 */     return wj.gG;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 142 */     return wj.gF;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 147 */     a(wj.gI, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 152 */     if (!super.a(☃, adk1)) {
/* 153 */       ate ate = ☃.b(adk1);
/* 154 */       if (ate.b() == atf.ed) {
/* 155 */         ate.a(☃, this, adk1);
/* 156 */         return true;
/*     */       } 
/*     */       
/* 159 */       if (dy() && !aX()) {
/* 160 */         if (!this.m.B) {
/* 161 */           ☃.m(this);
/*     */         }
/* 163 */         return true;
/*     */       } 
/*     */       
/* 166 */       if (ate.b() == atf.aA) {
/* 167 */         ate.a(☃, this, adk1);
/* 168 */         return true;
/*     */       } 
/* 170 */       return false;
/*     */     } 
/* 172 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 177 */     super.a(☃);
/*     */     
/* 179 */     if (this.m.B) {
/*     */       return;
/*     */     }
/*     */     
/* 183 */     if (dy()) {
/* 184 */       a(atf.aA);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 191 */     return ccl.L;
/*     */   }
/*     */   
/*     */   public boolean dy() {
/* 195 */     return ((Boolean)this.ab.<Boolean>a(bC)).booleanValue();
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {
/* 199 */     if (☃) {
/* 200 */       this.ab.b(bC, Boolean.valueOf(true));
/*     */     } else {
/* 202 */       this.ab.b(bC, Boolean.valueOf(false));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amj ☃) {
/* 208 */     if (this.m.B || this.G) {
/*     */       return;
/*     */     }
/*     */     
/* 212 */     ani ani = new ani(this.m);
/* 213 */     ani.a(aew.a, new ate(atf.F));
/* 214 */     ani.b(this.q, this.r, this.s, this.w, this.x);
/* 215 */     ani.q(do());
/* 216 */     if (O_()) {
/* 217 */       ani.b(e());
/* 218 */       ani.m(by());
/*     */     } 
/* 220 */     this.m.a(ani);
/* 221 */     V();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 228 */     aer aer = bP().isEmpty() ? null : bP().get(0);
/* 229 */     if (!aX() || !dh()) {
/* 230 */       this.Q = 0.5F;
/* 231 */       this.aU = 0.02F;
/* 232 */       super.a(☃, f1, f2);
/*     */       
/*     */       return;
/*     */     } 
/* 236 */     this.w = aer.w;
/* 237 */     this.y = this.w;
/* 238 */     this.x = aer.x * 0.5F;
/* 239 */     b(this.w, this.x);
/* 240 */     this.aQ = this.w;
/* 241 */     this.aS = this.w;
/*     */     
/* 243 */     this.Q = 1.0F;
/* 244 */     this.aU = cK() * 0.1F;
/*     */     
/* 246 */     if (this.bG && 
/* 247 */       this.bH++ > this.bI) {
/* 248 */       this.bG = false;
/*     */     }
/*     */ 
/*     */     
/* 252 */     if (bT()) {
/* 253 */       float f3 = (float)a(ank.d).e() * 0.225F;
/* 254 */       if (this.bG) {
/* 255 */         f3 += f3 * 1.15F * xq.a(this.bH / this.bI * 3.1415927F);
/*     */       }
/* 257 */       o(f3);
/* 258 */       super.a(0.0F, 0.0F, 1.0F);
/*     */     } else {
/* 260 */       this.t = 0.0D;
/* 261 */       this.u = 0.0D;
/* 262 */       this.v = 0.0D;
/*     */     } 
/*     */     
/* 265 */     this.aI = this.aJ;
/* 266 */     double d1 = this.q - this.n;
/* 267 */     double d2 = this.s - this.p;
/* 268 */     float f = xq.a(d1 * d1 + d2 * d2) * 4.0F;
/* 269 */     if (f > 1.0F) {
/* 270 */       f = 1.0F;
/*     */     }
/*     */     
/* 273 */     this.aJ += (f - this.aJ) * 0.4F;
/* 274 */     this.aK += this.aJ;
/*     */   }
/*     */   
/*     */   public boolean dz() {
/* 278 */     if (this.bG) {
/* 279 */       return false;
/*     */     }
/* 281 */     this.bG = true;
/* 282 */     this.bH = 0;
/* 283 */     this.bI = ce().nextInt(841) + 140;
/* 284 */     T().b(bD, Integer.valueOf(this.bI));
/* 285 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public aka b(aeo ☃) {
/* 290 */     return new aka(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(ate ☃) {
/* 295 */     return bE.a(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */