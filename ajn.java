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
/*     */ public abstract class ajn
/*     */   extends akl
/*     */   implements aeq
/*     */ {
/*  34 */   private static final or<Boolean> a = ou.a((Class)ajn.class, ot.i);
/*     */   
/*     */   public ajn(aev<?> ☃, axy axy1) {
/*  37 */     super(☃, axy1);
/*     */     
/*  39 */     this.g = new a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/*  44 */     return this.I * 0.65F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  49 */     super.bZ();
/*     */     
/*  51 */     a(ank.a).a(3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dk() {
/*  56 */     return (dA() || super.dk());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/*  61 */     el el = new el(this);
/*     */     
/*  63 */     if (☃.a_(el).c() == bct.A && ☃.a_(el.a()).c() == bct.A) {
/*  64 */       return super.a(☃, bool);
/*     */     }
/*     */     
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean H() {
/*  72 */     return (!dA() && !O_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int dg() {
/*  78 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  83 */     super.x_();
/*     */     
/*  85 */     this.ab.a(a, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   private boolean dA() {
/*  89 */     return ((Boolean)this.ab.<Boolean>a(a)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  93 */     this.ab.b(a, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  98 */     super.b(☃);
/*     */     
/* 100 */     ☃.a("FromBucket", dA());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 105 */     super.a(☃);
/*     */     
/* 107 */     a(☃.q("FromBucket"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 112 */     super.n();
/*     */     
/* 114 */     this.by.a(0, new aho(this, 1.25D));
/* 115 */     this.by.a(2, new agd<>(this, aog.class, 8.0F, 1.6D, 1.4D, aeu.f));
/* 116 */     this.by.a(4, new b(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/* 121 */     return new aiz(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 126 */     if (cP() && an()) {
/* 127 */       a(☃, f1, f2, 0.01F);
/* 128 */       a(afe.a, this.t, this.u, this.v);
/*     */       
/* 130 */       this.t *= 0.8999999761581421D;
/* 131 */       this.u *= 0.8999999761581421D;
/* 132 */       this.v *= 0.8999999761581421D;
/* 133 */       if (v() == null) {
/* 134 */         this.u -= 0.005D;
/*     */       }
/*     */     } else {
/* 137 */       super.a(☃, f1, f2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 143 */     if (!an() && this.A && this.C) {
/* 144 */       this.u += 0.4000000059604645D;
/* 145 */       this.t += ((this.T.nextFloat() * 2.0F - 1.0F) * 0.05F);
/* 146 */       this.v += ((this.T.nextFloat() * 2.0F - 1.0F) * 0.05F);
/* 147 */       this.A = false;
/* 148 */       this.al = true;
/* 149 */       a(dz(), cD(), cE());
/*     */     } 
/*     */     
/* 152 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aog ☃, adk adk1) {
/* 157 */     ate ate = ☃.b(adk1);
/* 158 */     if (ate.b() == atf.ax && aF()) {
/* 159 */       a(wj.al, 1.0F, 1.0F);
/*     */       
/* 161 */       ate.g(1);
/* 162 */       ate ate1 = l();
/* 163 */       f(ate1);
/*     */       
/* 165 */       if (!this.m.B) {
/* 166 */         p.j.a((tf)☃, ate1);
/*     */       }
/*     */       
/* 169 */       if (ate.a()) {
/* 170 */         ☃.a(adk1, ate1);
/* 171 */       } else if (!☃.bB.e(ate1)) {
/* 172 */         ☃.a(ate1, false);
/*     */       } 
/*     */       
/* 175 */       V();
/*     */       
/* 177 */       return true;
/*     */     } 
/*     */     
/* 180 */     return super.a(☃, adk1);
/*     */   }
/*     */   
/*     */   protected void f(ate ☃) {
/* 184 */     if (O_())
/* 185 */       ☃.a(e()); 
/*     */   }
/*     */   
/*     */   protected abstract ate l();
/*     */   
/*     */   static class b
/*     */     extends ahs {
/*     */     private final ajn h;
/*     */     
/*     */     public b(ajn ☃) {
/* 195 */       super(☃, 1.0D, 40);
/* 196 */       this.h = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 201 */       return (this.h.dy() && super.a());
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean dy() {
/* 206 */     return true;
/*     */   }
/*     */   
/*     */   protected abstract wi dz();
/*     */   
/*     */   static class a extends agb {
/*     */     a(ajn ☃) {
/* 213 */       super(☃);
/* 214 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 219 */       if (this.i.a(ww.a)) {
/* 220 */         this.i.u += 0.005D;
/*     */       }
/*     */       
/* 223 */       if (this.h != agb.a.b || this.i.t().p()) {
/* 224 */         this.i.o(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 228 */       double ☃ = this.b - this.i.q;
/* 229 */       double d1 = this.c - this.i.r;
/* 230 */       double d2 = this.d - this.i.s;
/* 231 */       double d3 = xq.a(☃ * ☃ + d1 * d1 + d2 * d2);
/* 232 */       d1 /= d3;
/*     */       
/* 234 */       float f1 = (float)(xq.c(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 235 */       this.i.w = a(this.i.w, f1, 90.0F);
/* 236 */       this.i.aQ = this.i.w;
/*     */       
/* 238 */       float f2 = (float)(this.e * this.i.a(ank.d).e());
/* 239 */       this.i.o(this.i.cK() + (f2 - this.i.cK()) * 0.125F);
/*     */       
/* 241 */       this.i.u += this.i.cK() * d1 * 0.1D;
/*     */     }
/*     */ 
/*     */     
/*     */     private final ajn i;
/*     */   }
/*     */   
/*     */   protected wi ad() {
/* 249 */     return wj.cJ;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */