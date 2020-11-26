/*     */ import java.util.List;
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
/*     */ public class aoq
/*     */   extends aer
/*     */ {
/*  30 */   private static final or<ate> a = ou.a((Class)aoq.class, ot.g);
/*  31 */   private static final or<Integer> b = ou.a((Class)aoq.class, ot.b);
/*     */   
/*     */   private int c;
/*     */   
/*     */   private int d;
/*     */   private afa e;
/*     */   
/*     */   public aoq(axy ☃) {
/*  39 */     super(aev.z, ☃);
/*  40 */     a(0.25F, 0.25F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  45 */     this.ab.a(a, ate.a);
/*  46 */     this.ab.a(b, Integer.valueOf(0));
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
/*     */   public aoq(axy ☃, double d1, double d2, double d3, ate ate1) {
/*  60 */     super(aev.z, ☃);
/*  61 */     this.c = 0;
/*     */     
/*  63 */     a(0.25F, 0.25F);
/*     */     
/*  65 */     b(d1, d2, d3);
/*     */     
/*  67 */     int i = 1;
/*  68 */     if (!ate1.a() && ate1.m()) {
/*  69 */       this.ab.b(a, ate1.i());
/*     */       
/*  71 */       i += ate1.a("Fireworks").f("Flight");
/*     */     } 
/*  73 */     this.t = this.T.nextGaussian() * 0.001D;
/*  74 */     this.v = this.T.nextGaussian() * 0.001D;
/*  75 */     this.u = 0.05D;
/*     */     
/*  77 */     this.d = 10 * i + this.T.nextInt(6) + this.T.nextInt(7);
/*     */   }
/*     */   
/*     */   public aoq(axy ☃, ate ate1, afa afa1) {
/*  81 */     this(☃, afa1.q, afa1.r, afa1.s, ate1);
/*  82 */     this.ab.b(b, Integer.valueOf(afa1.Q()));
/*  83 */     this.e = afa1;
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
/*     */   public void R_() {
/* 102 */     this.N = this.q;
/* 103 */     this.O = this.r;
/* 104 */     this.P = this.s;
/* 105 */     super.R_();
/*     */     
/* 107 */     if (f()) {
/* 108 */       if (this.e == null) {
/* 109 */         aer aer1 = this.m.a(((Integer)this.ab.<Integer>a(b)).intValue());
/* 110 */         if (aer1 instanceof afa) {
/* 111 */           this.e = (afa)aer1;
/*     */         }
/*     */       } 
/* 114 */       if (this.e != null) {
/* 115 */         if (this.e.dc()) {
/* 116 */           cee cee = this.e.aN();
/* 117 */           double d1 = 1.5D;
/* 118 */           double d2 = 0.1D;
/* 119 */           this.e.t += cee.b * 0.1D + (cee.b * 1.5D - this.e.t) * 0.5D;
/* 120 */           this.e.u += cee.c * 0.1D + (cee.c * 1.5D - this.e.u) * 0.5D;
/* 121 */           this.e.v += cee.d * 0.1D + (cee.d * 1.5D - this.e.v) * 0.5D;
/*     */         } 
/*     */         
/* 124 */         b(this.e.q, this.e.r, this.e.s);
/* 125 */         this.t = this.e.t;
/* 126 */         this.u = this.e.u;
/* 127 */         this.v = this.e.v;
/*     */       } 
/*     */     } else {
/* 130 */       this.t *= 1.15D;
/* 131 */       this.v *= 1.15D;
/* 132 */       this.u += 0.04D;
/* 133 */       a(afe.a, this.t, this.u, this.v);
/*     */     } 
/*     */     
/* 136 */     float ☃ = xq.a(this.t * this.t + this.v * this.v);
/* 137 */     this.w = (float)(xq.c(this.t, this.v) * 57.2957763671875D);
/* 138 */     this.x = (float)(xq.c(this.u, ☃) * 57.2957763671875D);
/*     */     
/* 140 */     while (this.x - this.z < -180.0F) {
/* 141 */       this.z -= 360.0F;
/*     */     }
/* 143 */     while (this.x - this.z >= 180.0F) {
/* 144 */       this.z += 360.0F;
/*     */     }
/*     */     
/* 147 */     while (this.w - this.y < -180.0F) {
/* 148 */       this.y -= 360.0F;
/*     */     }
/* 150 */     while (this.w - this.y >= 180.0F) {
/* 151 */       this.y += 360.0F;
/*     */     }
/*     */     
/* 154 */     this.x = this.z + (this.x - this.z) * 0.2F;
/* 155 */     this.w = this.y + (this.w - this.y) * 0.2F;
/*     */     
/* 157 */     if (this.c == 0 && !ai()) {
/* 158 */       this.m.a((aog)null, this.q, this.r, this.s, wj.cD, wk.i, 3.0F, 1.0F);
/*     */     }
/*     */     
/* 161 */     this.c++;
/* 162 */     if (this.m.B && this.c % 2 < 2) {
/* 163 */       this.m.a(fm.w, this.q, this.r - 0.3D, this.s, this.T.nextGaussian() * 0.05D, -this.u * 0.5D, this.T.nextGaussian() * 0.05D);
/*     */     }
/* 165 */     if (!this.m.B && this.c > this.d) {
/* 166 */       this.m.a(this, (byte)17);
/* 167 */       i();
/* 168 */       V();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void i() {
/* 174 */     float ☃ = 0.0F;
/* 175 */     ate ate = this.ab.<ate>a(a);
/* 176 */     gy gy = ate.a() ? null : ate.b("Fireworks");
/* 177 */     he he = (gy != null) ? gy.d("Explosions", 10) : null;
/* 178 */     if (he != null && !he.isEmpty()) {
/* 179 */       ☃ = (5 + he.size() * 2);
/*     */     }
/* 181 */     if (☃ > 0.0F) {
/* 182 */       if (this.e != null) {
/* 183 */         this.e.a(aea.t, (5 + he.size() * 2));
/*     */       }
/*     */       
/* 186 */       double d = 5.0D;
/* 187 */       cee cee = new cee(this.q, this.r, this.s);
/* 188 */       List<afa> list = this.m.a(afa.class, bD().g(5.0D));
/* 189 */       for (afa afa1 : list) {
/* 190 */         if (afa1 == this.e) {
/*     */           continue;
/*     */         }
/* 193 */         if (h(afa1) > 25.0D) {
/*     */           continue;
/*     */         }
/*     */         
/* 197 */         boolean bool = false;
/* 198 */         for (int i = 0; i < 2; i++) {
/* 199 */           ceb ceb = this.m.a(cee, new cee(afa1.q, afa1.r + afa1.I * 0.5D * i, afa1.s), cec.a, true, false);
/* 200 */           if (ceb == null || ceb.a == ceb.a.a) {
/* 201 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 205 */         if (bool) {
/* 206 */           float f = ☃ * (float)Math.sqrt((5.0D - g(afa1)) / 5.0D);
/* 207 */           afa1.a(aea.t, f);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 214 */     return (((Integer)this.ab.<Integer>a(b)).intValue() > 0);
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
/*     */   public void b(gy ☃) {
/* 229 */     ☃.b("Life", this.c);
/* 230 */     ☃.b("LifeTime", this.d);
/* 231 */     ate ate = this.ab.<ate>a(a);
/* 232 */     if (!ate.a()) {
/* 233 */       ☃.a("FireworksItem", ate.b(new gy()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 239 */     this.c = ☃.h("Life");
/* 240 */     this.d = ☃.h("LifeTime");
/*     */     
/* 242 */     ate ate = ate.a(☃.p("FireworksItem"));
/* 243 */     if (!ate.a()) {
/* 244 */       this.ab.b(a, ate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bk() {
/* 250 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aoq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */