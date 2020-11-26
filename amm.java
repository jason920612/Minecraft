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
/*     */ public class amm
/*     */   extends aer
/*     */ {
/*  32 */   private static final or<ate> b = ou.a((Class)amm.class, ot.g);
/*     */ 
/*     */ 
/*     */   
/*     */   private int c;
/*     */ 
/*     */ 
/*     */   
/*     */   private int d;
/*     */ 
/*     */   
/*  43 */   private int e = 5;
/*     */   private UUID f;
/*     */   private UUID g;
/*  46 */   public float a = (float)(Math.random() * Math.PI * 2.0D);
/*     */   
/*     */   public amm(axy ☃) {
/*  49 */     super(aev.G, ☃);
/*  50 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */   public amm(axy ☃, double d1, double d2, double d3) {
/*  54 */     this(☃);
/*  55 */     b(d1, d2, d3);
/*     */     
/*  57 */     this.w = (float)(Math.random() * 360.0D);
/*     */     
/*  59 */     this.t = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  60 */     this.u = 0.20000000298023224D;
/*  61 */     this.v = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*     */   }
/*     */   
/*     */   public amm(axy ☃, double d1, double d2, double d3, ate ate1) {
/*  65 */     this(☃, d1, d2, d3);
/*  66 */     b(ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean ak() {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  76 */     T().a(b, ate.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  81 */     if (i().a()) {
/*  82 */       V();
/*     */       return;
/*     */     } 
/*  85 */     super.R_();
/*  86 */     if (this.d > 0 && this.d != 32767) {
/*  87 */       this.d--;
/*     */     }
/*  89 */     this.n = this.q;
/*  90 */     this.o = this.r;
/*  91 */     this.p = this.s;
/*     */     
/*  93 */     double ☃ = this.t;
/*  94 */     double d1 = this.u;
/*  95 */     double d2 = this.v;
/*     */     
/*  97 */     if (a(ww.a)) {
/*  98 */       u();
/*  99 */     } else if (!aj()) {
/* 100 */       this.u -= 0.03999999910593033D;
/*     */     } 
/*     */     
/* 103 */     if (this.m.B) {
/* 104 */       this.R = false;
/*     */     } else {
/* 106 */       this.R = i(this.q, ((bD()).b + (bD()).e) / 2.0D, this.s);
/*     */     } 
/* 108 */     a(afe.a, this.t, this.u, this.v);
/*     */     
/* 110 */     boolean bool = ((int)this.n != (int)this.q || (int)this.o != (int)this.r || (int)this.p != (int)this.s);
/*     */     
/* 112 */     if (bool || this.U % 25 == 0) {
/* 113 */       if (this.m.b(new el(this)).a(ww.b)) {
/* 114 */         this.u = 0.20000000298023224D;
/* 115 */         this.t = ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/* 116 */         this.v = ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F);
/* 117 */         a(wj.cN, 0.4F, 2.0F + this.T.nextFloat() * 0.4F);
/*     */       } 
/*     */       
/* 120 */       if (!this.m.B) {
/* 121 */         v();
/*     */       }
/*     */     } 
/*     */     
/* 125 */     float f = 0.98F;
/* 126 */     if (this.A) {
/* 127 */       f = this.m.a_(new el(xq.c(this.q), xq.c((bD()).b) - 1, xq.c(this.s))).c().n() * 0.98F;
/*     */     }
/*     */     
/* 130 */     this.t *= f;
/* 131 */     this.u *= 0.9800000190734863D;
/* 132 */     this.v *= f;
/*     */     
/* 134 */     if (this.A) {
/* 135 */       this.u *= -0.5D;
/*     */     }
/*     */     
/* 138 */     if (this.c != -32768) {
/* 139 */       this.c++;
/*     */     }
/*     */ 
/*     */     
/* 143 */     this.al |= at();
/*     */     
/* 145 */     if (!this.m.B) {
/*     */ 
/*     */ 
/*     */       
/* 149 */       double d3 = this.t - ☃;
/* 150 */       double d4 = this.u - d1;
/* 151 */       double d5 = this.v - d2;
/* 152 */       double d6 = d3 * d3 + d4 * d4 + d5 * d5;
/* 153 */       if (d6 > 0.01D) {
/* 154 */         this.al = true;
/*     */       }
/*     */     } 
/*     */     
/* 158 */     if (!this.m.B && this.c >= 6000) {
/* 159 */       V();
/*     */     }
/*     */   }
/*     */   
/*     */   private void u() {
/* 164 */     if (this.u < 0.05999999865889549D) {
/* 165 */       this.u += 5.000000237487257E-4D;
/*     */     }
/*     */     
/* 168 */     this.t *= 0.9900000095367432D;
/* 169 */     this.v *= 0.9900000095367432D;
/*     */   }
/*     */   
/*     */   private void v() {
/* 173 */     for (amm ☃ : this.m.<amm>a(amm.class, bD().c(0.5D, 0.0D, 0.5D))) {
/* 174 */       a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(amm ☃) {
/* 179 */     if (☃ == this) {
/* 180 */       return false;
/*     */     }
/* 182 */     if (!☃.aF() || !aF()) {
/* 183 */       return false;
/*     */     }
/* 185 */     ate ate1 = i();
/* 186 */     ate ate2 = ☃.i().i();
/*     */     
/* 188 */     if (this.d == 32767 || ☃.d == 32767) {
/* 189 */       return false;
/*     */     }
/* 191 */     if (this.c == -32768 || ☃.c == -32768) {
/* 192 */       return false;
/*     */     }
/* 194 */     if (ate2.b() != ate1.b()) {
/* 195 */       return false;
/*     */     }
/* 197 */     if ((ate2.m() ^ ate1.m()) != 0) {
/* 198 */       return false;
/*     */     }
/* 200 */     if (ate2.m() && !ate2.n().equals(ate1.n())) {
/* 201 */       return false;
/*     */     }
/* 203 */     if (ate2.b() == null) {
/* 204 */       return false;
/*     */     }
/* 206 */     if (ate2.C() < ate1.C()) {
/* 207 */       return ☃.a(this);
/*     */     }
/* 209 */     if (ate2.C() + ate1.C() > ate2.c()) {
/* 210 */       return false;
/*     */     }
/*     */     
/* 213 */     ate2.f(ate1.C());
/* 214 */     ☃.d = Math.max(☃.d, this.d);
/* 215 */     ☃.c = Math.min(☃.c, this.c);
/* 216 */     ☃.b(ate2);
/* 217 */     V();
/*     */     
/* 219 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void f() {
/* 224 */     this.c = 4800;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void g(int ☃) {
/* 229 */     a(aea.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 234 */     if (b(☃)) {
/* 235 */       return false;
/*     */     }
/* 237 */     if (!i().a() && i().b() == atf.dP && ☃.d()) {
/* 238 */       return false;
/*     */     }
/* 240 */     aA();
/* 241 */     this.e = (int)(this.e - f);
/* 242 */     if (this.e <= 0) {
/* 243 */       V();
/*     */     }
/* 245 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 250 */     ☃.a("Health", (short)this.e);
/* 251 */     ☃.a("Age", (short)this.c);
/* 252 */     ☃.a("PickupDelay", (short)this.d);
/* 253 */     if (l() != null) {
/* 254 */       ☃.a("Thrower", hk.a(l()));
/*     */     }
/* 256 */     if (k() != null) {
/* 257 */       ☃.a("Owner", hk.a(k()));
/*     */     }
/* 259 */     if (!i().a()) {
/* 260 */       ☃.a("Item", i().b(new gy()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 266 */     this.e = ☃.g("Health");
/* 267 */     this.c = ☃.g("Age");
/* 268 */     if (☃.e("PickupDelay")) {
/* 269 */       this.d = ☃.g("PickupDelay");
/*     */     }
/* 271 */     if (☃.c("Owner", 10)) {
/* 272 */       this.g = hk.b(☃.p("Owner"));
/*     */     }
/* 274 */     if (☃.c("Thrower", 10)) {
/* 275 */       this.f = hk.b(☃.p("Thrower"));
/*     */     }
/* 277 */     gy gy1 = ☃.p("Item");
/* 278 */     b(ate.a(gy1));
/* 279 */     if (i().a()) {
/* 280 */       V();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aog ☃) {
/* 286 */     if (this.m.B) {
/*     */       return;
/*     */     }
/*     */     
/* 290 */     ate ate = i();
/* 291 */     ata ata = ate.b();
/* 292 */     int i = ate.C();
/* 293 */     if (this.d == 0 && (this.g == null || 6000 - this.c <= 200 || this.g.equals(☃.bt())) && ☃.bB.e(ate)) {
/* 294 */       ☃.a(this, i);
/* 295 */       if (ate.a()) {
/* 296 */         V();
/*     */ 
/*     */         
/* 299 */         ate.e(i);
/*     */       } 
/* 301 */       ☃.a(ws.e.b(ata), i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 307 */     ij ☃ = e();
/* 308 */     if (☃ != null) {
/* 309 */       return ☃;
/*     */     }
/*     */     
/* 312 */     return new ir(i().j(), new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bk() {
/* 317 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aer a(bod ☃) {
/* 323 */     aer aer1 = super.a(☃);
/*     */     
/* 325 */     if (!this.m.B && aer1 instanceof amm) {
/* 326 */       ((amm)aer1).v();
/*     */     }
/* 328 */     return aer1;
/*     */   }
/*     */   
/*     */   public ate i() {
/* 332 */     return T().<ate>a(b);
/*     */   }
/*     */   
/*     */   public void b(ate ☃) {
/* 336 */     T().b(b, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public UUID k() {
/* 341 */     return this.g;
/*     */   }
/*     */   
/*     */   public void b(@Nullable UUID ☃) {
/* 345 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public UUID l() {
/* 350 */     return this.f;
/*     */   }
/*     */   
/*     */   public void c(@Nullable UUID ☃) {
/* 354 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 363 */     this.d = 10;
/*     */   }
/*     */   
/*     */   public void o() {
/* 367 */     this.d = 0;
/*     */   }
/*     */   
/*     */   public void p() {
/* 371 */     this.d = 32767;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 375 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean q() {
/* 379 */     return (this.d > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void s() {
/* 387 */     this.c = -6000;
/*     */   }
/*     */   
/*     */   public void t() {
/* 391 */     p();
/* 392 */     this.c = 5999;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */