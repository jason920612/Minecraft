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
/*     */ public class aki
/*     */   extends akl
/*     */ {
/*     */   public float a;
/*     */   public float b;
/*     */   public float c;
/*     */   public float bC;
/*     */   public float bD;
/*     */   public float bE;
/*     */   public float bF;
/*     */   public float bG;
/*     */   private float bH;
/*     */   private float bI;
/*     */   private float bJ;
/*     */   private float bK;
/*     */   private float bL;
/*     */   private float bM;
/*     */   
/*     */   public aki(axy ☃) {
/*  49 */     super(aev.as, ☃);
/*  50 */     a(0.8F, 0.8F);
/*  51 */     this.T.setSeed((1 + Q()));
/*  52 */     this.bI = 1.0F / (this.T.nextFloat() + 1.0F) * 0.2F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  57 */     this.by.a(0, new b(this, this));
/*  58 */     this.by.a(1, new a());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  63 */     super.bZ();
/*     */     
/*  65 */     a(ank.a).a(10.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  70 */     return this.I * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  75 */     return wj.jn;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  80 */     return wj.jp;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  85 */     return wj.jo;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float cD() {
/*  90 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  95 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 101 */     return ccl.ar;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 106 */     super.k();
/*     */     
/* 108 */     this.b = this.a;
/* 109 */     this.bC = this.c;
/*     */     
/* 111 */     this.bE = this.bD;
/* 112 */     this.bG = this.bF;
/*     */     
/* 114 */     this.bD += this.bI;
/* 115 */     if (this.bD > 6.283185307179586D) {
/* 116 */       if (this.m.B) {
/* 117 */         this.bD = 6.2831855F;
/*     */       } else {
/* 119 */         this.bD = (float)(this.bD - 6.283185307179586D);
/* 120 */         if (this.T.nextInt(10) == 0) {
/* 121 */           this.bI = 1.0F / (this.T.nextFloat() + 1.0F) * 0.2F;
/*     */         }
/* 123 */         this.m.a(this, (byte)19);
/*     */       } 
/*     */     }
/*     */     
/* 127 */     if (aq()) {
/* 128 */       if (this.bD < 3.1415927F) {
/* 129 */         float f = this.bD / 3.1415927F;
/* 130 */         this.bF = xq.a(f * f * 3.1415927F) * 3.1415927F * 0.25F;
/*     */         
/* 132 */         if (f > 0.75D) {
/* 133 */           this.bH = 1.0F;
/* 134 */           this.bJ = 1.0F;
/*     */         } else {
/* 136 */           this.bJ *= 0.8F;
/*     */         } 
/*     */       } else {
/* 139 */         this.bF = 0.0F;
/* 140 */         this.bH *= 0.9F;
/* 141 */         this.bJ *= 0.99F;
/*     */       } 
/*     */       
/* 144 */       if (!this.m.B) {
/* 145 */         this.t = (this.bK * this.bH);
/* 146 */         this.u = (this.bL * this.bH);
/* 147 */         this.v = (this.bM * this.bH);
/*     */       } 
/*     */       
/* 150 */       float ☃ = xq.a(this.t * this.t + this.v * this.v);
/*     */       
/* 152 */       this.aQ += (-((float)xq.c(this.t, this.v)) * 57.295776F - this.aQ) * 0.1F;
/* 153 */       this.w = this.aQ;
/* 154 */       this.c = (float)(this.c + Math.PI * this.bJ * 1.5D);
/* 155 */       this.a += (-((float)xq.c(☃, this.u)) * 57.295776F - this.a) * 0.1F;
/*     */     } else {
/* 157 */       this.bF = xq.e(xq.a(this.bD)) * 3.1415927F * 0.25F;
/*     */       
/* 159 */       if (!this.m.B) {
/*     */         
/* 161 */         this.t = 0.0D;
/* 162 */         this.v = 0.0D;
/*     */         
/* 164 */         if (a(aem.y)) {
/* 165 */           this.u += 0.05D * (b(aem.y).c() + 1) - this.u;
/*     */         }
/* 167 */         else if (!aj()) {
/* 168 */           this.u -= 0.08D;
/*     */         } 
/*     */         
/* 171 */         this.u *= 0.9800000190734863D;
/*     */       } 
/*     */ 
/*     */       
/* 175 */       this.a = (float)(this.a + (-90.0F - this.a) * 0.02D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 181 */     if (super.a(☃, f) && cf() != null) {
/* 182 */       dy();
/* 183 */       return true;
/*     */     } 
/*     */     
/* 186 */     return false;
/*     */   }
/*     */   
/*     */   private cee b(cee ☃) {
/* 190 */     cee cee1 = ☃.a(this.b * 0.017453292F);
/* 191 */     cee1 = cee1.b(-this.aR * 0.017453292F);
/* 192 */     return cee1;
/*     */   }
/*     */   
/*     */   private void dy() {
/* 196 */     a(wj.jq, cD(), cE());
/* 197 */     cee ☃ = b(new cee(0.0D, -1.0D, 0.0D)).b(this.q, this.r, this.s);
/* 198 */     for (int i = 0; i < 30; i++) {
/* 199 */       cee cee1 = b(new cee(this.T.nextFloat() * 0.6D - 0.3D, -1.0D, this.T.nextFloat() * 0.6D - 0.3D));
/* 200 */       cee cee2 = cee1.a(0.3D + (this.T.nextFloat() * 2.0F));
/* 201 */       ((td)this.m).a(fm.V, ☃.b, ☃.c + 0.5D, ☃.d, 0, cee2.b, cee2.c, cee2.d, 0.10000000149011612D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 207 */     a(afe.a, this.t, this.u, this.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 212 */     return (this.r > 45.0D && this.r < ☃.k());
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
/*     */   public void c(float ☃, float f1, float f2) {
/* 225 */     this.bK = ☃;
/* 226 */     this.bL = f1;
/* 227 */     this.bM = f2;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 231 */     return (this.bK != 0.0F || this.bL != 0.0F || this.bM != 0.0F);
/*     */   }
/*     */   
/*     */   class b extends agt {
/*     */     private final aki b;
/*     */     
/*     */     public b(aki this$0, aki ☃) {
/* 238 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 243 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 248 */       int ☃ = this.b.cj();
/*     */       
/* 250 */       if (☃ > 100) {
/* 251 */         this.b.c(0.0F, 0.0F, 0.0F);
/* 252 */       } else if (this.b.ce().nextInt(50) == 0 || !aki.a(this.b) || !this.b.l()) {
/* 253 */         float f1 = this.b.ce().nextFloat() * 6.2831855F;
/* 254 */         float f2 = xq.b(f1) * 0.2F;
/* 255 */         float f3 = -0.1F + this.b.ce().nextFloat() * 0.2F;
/* 256 */         float f4 = xq.a(f1) * 0.2F;
/* 257 */         this.b.c(f2, f3, f4);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   class a
/*     */     extends agt
/*     */   {
/*     */     private int b;
/*     */     
/*     */     private a(aki this$0) {}
/*     */     
/*     */     public boolean a() {
/* 271 */       afa ☃ = this.a.cf();
/* 272 */       if (this.a.an() && ☃ != null) {
/* 273 */         return (this.a.h(☃) < 100.0D);
/*     */       }
/*     */       
/* 276 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 281 */       this.b = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 286 */       this.b++;
/*     */       
/* 288 */       afa ☃ = this.a.cf();
/* 289 */       if (☃ == null) {
/*     */         return;
/*     */       }
/*     */       
/* 293 */       cee cee = new cee(this.a.q - ☃.q, this.a.r - ☃.r, this.a.s - ☃.s);
/*     */       
/* 295 */       blc blc = this.a.m.a_(new el(this.a.q + cee.b, this.a.r + cee.c, this.a.s + cee.d));
/* 296 */       byw byw = this.a.m.b(new el(this.a.q + cee.b, this.a.r + cee.c, this.a.s + cee.d));
/* 297 */       if (byw.a(ww.a) || blc.f()) {
/* 298 */         double d = cee.b();
/* 299 */         if (d > 0.0D) {
/* 300 */           cee.a();
/*     */           
/* 302 */           float f = 3.0F;
/* 303 */           if (d > 5.0D) {
/* 304 */             f = (float)(f - (d - 5.0D) / 5.0D);
/*     */           }
/*     */           
/* 307 */           if (f > 0.0F) {
/* 308 */             cee = cee.a(f);
/*     */           }
/*     */         } 
/*     */         
/* 312 */         if (blc.f()) {
/* 313 */           cee = cee.a(0.0D, cee.c, 0.0D);
/*     */         }
/*     */         
/* 316 */         this.a.c((float)cee.b / 20.0F, (float)cee.c / 20.0F, (float)cee.d / 20.0F);
/*     */       } 
/*     */       
/* 319 */       if (this.b % 10 == 5)
/* 320 */         this.a.m.a(fm.e, this.a.q, this.a.r, this.a.s, 0.0D, 0.0D, 0.0D); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */