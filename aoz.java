/*     */ import java.util.List;
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
/*     */ public abstract class aoz
/*     */   extends aer
/*     */   implements aot
/*     */ {
/*  23 */   private int e = -1;
/*  24 */   private int f = -1;
/*  25 */   private int g = -1;
/*     */   protected boolean a;
/*     */   public int b;
/*     */   protected afa c;
/*     */   private UUID h;
/*     */   public aer d;
/*     */   private int aw;
/*     */   
/*     */   protected aoz(aev<?> ☃, axy axy1) {
/*  34 */     super(☃, axy1);
/*     */     
/*  36 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */   protected aoz(aev<?> ☃, double d1, double d2, double d3, axy axy1) {
/*  40 */     this(☃, axy1);
/*     */     
/*  42 */     b(d1, d2, d3);
/*     */   }
/*     */   
/*     */   protected aoz(aev<?> ☃, afa afa1, axy axy1) {
/*  46 */     this(☃, afa1.q, afa1.r + afa1.bF() - 0.10000000149011612D, afa1.s, axy1);
/*     */     
/*  48 */     this.c = afa1;
/*  49 */     this.h = afa1.bt();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void x_() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aer ☃, float f1, float f2, float f3, float f4, float f5) {
/*  68 */     float f6 = -xq.a(f2 * 0.017453292F) * xq.b(f1 * 0.017453292F);
/*  69 */     float f7 = -xq.a((f1 + f3) * 0.017453292F);
/*  70 */     float f8 = xq.b(f2 * 0.017453292F) * xq.b(f1 * 0.017453292F);
/*  71 */     c(f6, f7, f8, f4, f5);
/*     */     
/*  73 */     this.t += ☃.t;
/*  74 */     this.v += ☃.v;
/*  75 */     if (!☃.A) {
/*  76 */       this.u += ☃.u;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(double ☃, double d1, double d2, float f1, float f2) {
/*  82 */     float f3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/*     */     
/*  84 */     ☃ /= f3;
/*  85 */     d1 /= f3;
/*  86 */     d2 /= f3;
/*     */     
/*  88 */     ☃ += this.T.nextGaussian() * 0.007499999832361937D * f2;
/*  89 */     d1 += this.T.nextGaussian() * 0.007499999832361937D * f2;
/*  90 */     d2 += this.T.nextGaussian() * 0.007499999832361937D * f2;
/*     */     
/*  92 */     ☃ *= f1;
/*  93 */     d1 *= f1;
/*  94 */     d2 *= f1;
/*     */     
/*  96 */     this.t = ☃;
/*  97 */     this.u = d1;
/*  98 */     this.v = d2;
/*     */     
/* 100 */     float f4 = xq.a(☃ * ☃ + d2 * d2);
/*     */     
/* 102 */     this.w = (float)(xq.c(☃, d2) * 57.2957763671875D);
/* 103 */     this.x = (float)(xq.c(d1, f4) * 57.2957763671875D);
/* 104 */     this.y = this.w;
/* 105 */     this.z = this.x;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void R_() {
/* 125 */     this.N = this.q;
/* 126 */     this.O = this.r;
/* 127 */     this.P = this.s;
/* 128 */     super.R_();
/*     */     
/* 130 */     if (this.b > 0) {
/* 131 */       this.b--;
/*     */     }
/*     */     
/* 134 */     if (this.a) {
/* 135 */       this.a = false;
/*     */       
/* 137 */       this.t *= (this.T.nextFloat() * 0.2F);
/* 138 */       this.u *= (this.T.nextFloat() * 0.2F);
/* 139 */       this.v *= (this.T.nextFloat() * 0.2F);
/*     */     } 
/*     */     
/* 142 */     cee ☃ = new cee(this.q, this.r, this.s);
/* 143 */     cee cee1 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/* 144 */     ceb ceb = this.m.a(☃, cee1);
/*     */     
/* 146 */     ☃ = new cee(this.q, this.r, this.s);
/* 147 */     cee1 = new cee(this.q + this.t, this.r + this.u, this.s + this.v);
/* 148 */     if (ceb != null) {
/* 149 */       cee1 = new cee(ceb.c.b, ceb.c.c, ceb.c.d);
/*     */     }
/*     */     
/* 152 */     aer aer1 = null;
/* 153 */     List<aer> list = this.m.a(this, bD().b(this.t, this.u, this.v).g(1.0D));
/* 154 */     double d = 0.0D;
/* 155 */     boolean bool = false;
/* 156 */     for (int i = 0; i < list.size(); i++) {
/* 157 */       aer aer2 = list.get(i);
/* 158 */       if (aer2.aB())
/*     */       {
/* 160 */         if (aer2 == this.d) {
/* 161 */           bool = true;
/*     */         
/*     */         }
/* 164 */         else if (this.c != null && this.U < 2 && this.d == null) {
/* 165 */           this.d = aer2;
/* 166 */           bool = true;
/*     */         } else {
/*     */           
/* 169 */           bool = false;
/*     */           
/* 171 */           cea cea = aer2.bD().g(0.30000001192092896D);
/* 172 */           ceb ceb1 = cea.b(☃, cee1);
/* 173 */           if (ceb1 != null) {
/* 174 */             double d1 = ☃.g(ceb1.c);
/* 175 */             if (d1 < d || d == 0.0D) {
/* 176 */               aer1 = aer2;
/* 177 */               d = d1;
/*     */             } 
/*     */           } 
/*     */         }  } 
/*     */     } 
/* 182 */     if (this.d != null) {
/* 183 */       if (bool) {
/* 184 */         this.aw = 2;
/* 185 */       } else if (this.aw-- <= 0) {
/* 186 */         this.d = null;
/*     */       } 
/*     */     }
/*     */     
/* 190 */     if (aer1 != null) {
/* 191 */       ceb = new ceb(aer1);
/*     */     }
/*     */     
/* 194 */     if (ceb != null) {
/* 195 */       if (ceb.a == ceb.a.b && this.m.a_(ceb.a()).c() == bct.dh) {
/* 196 */         e(ceb.a());
/*     */       } else {
/* 198 */         a(ceb);
/*     */       } 
/*     */     }
/* 201 */     this.q += this.t;
/* 202 */     this.r += this.u;
/* 203 */     this.s += this.v;
/*     */     
/* 205 */     float f1 = xq.a(this.t * this.t + this.v * this.v);
/* 206 */     this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/* 207 */     this.x = (float)(xq.c(this.u, f1) * 57.2957763671875D);
/*     */     
/* 209 */     while (this.x - this.z < -180.0F) {
/* 210 */       this.z -= 360.0F;
/*     */     }
/* 212 */     while (this.x - this.z >= 180.0F) {
/* 213 */       this.z += 360.0F;
/*     */     }
/*     */     
/* 216 */     while (this.w - this.y < -180.0F) {
/* 217 */       this.y -= 360.0F;
/*     */     }
/* 219 */     while (this.w - this.y >= 180.0F) {
/* 220 */       this.y += 360.0F;
/*     */     }
/*     */     
/* 223 */     this.x = this.z + (this.x - this.z) * 0.2F;
/* 224 */     this.w = this.y + (this.w - this.y) * 0.2F;
/*     */     
/* 226 */     float f2 = 0.99F;
/* 227 */     float f3 = f();
/*     */     
/* 229 */     if (an()) {
/* 230 */       for (int j = 0; j < 4; j++) {
/* 231 */         float f = 0.25F;
/* 232 */         this.m.a(fm.e, this.q - this.t * 0.25D, this.r - this.u * 0.25D, this.s - this.v * 0.25D, this.t, this.u, this.v);
/*     */       } 
/* 234 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 237 */     this.t *= f2;
/* 238 */     this.u *= f2;
/* 239 */     this.v *= f2;
/* 240 */     if (!aj()) {
/* 241 */       this.u -= f3;
/*     */     }
/*     */     
/* 244 */     b(this.q, this.r, this.s);
/*     */   }
/*     */   
/*     */   protected float f() {
/* 248 */     return 0.03F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(ceb paramceb);
/*     */   
/*     */   public void b(gy ☃) {
/* 255 */     ☃.b("xTile", this.e);
/* 256 */     ☃.b("yTile", this.f);
/* 257 */     ☃.b("zTile", this.g);
/*     */     
/* 259 */     ☃.a("shake", (byte)this.b);
/* 260 */     ☃.a("inGround", (byte)(this.a ? 1 : 0));
/*     */     
/* 262 */     if (this.h != null) {
/* 263 */       ☃.a("owner", hk.a(this.h));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 269 */     this.e = ☃.h("xTile");
/* 270 */     this.f = ☃.h("yTile");
/* 271 */     this.g = ☃.h("zTile");
/* 272 */     this.b = ☃.f("shake") & 0xFF;
/* 273 */     this.a = (☃.f("inGround") == 1);
/* 274 */     this.c = null;
/* 275 */     if (☃.c("owner", 10)) {
/* 276 */       this.h = hk.b(☃.p("owner"));
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa i() {
/* 282 */     if (this.c == null && this.h != null && this.m instanceof td) {
/* 283 */       aer ☃ = ((td)this.m).a(this.h);
/* 284 */       if (☃ instanceof afa) {
/* 285 */         this.c = (afa)☃;
/*     */       } else {
/* 287 */         this.h = null;
/*     */       } 
/*     */     } 
/* 290 */     return this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aoz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */