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
/*     */ public abstract class aiw
/*     */ {
/*     */   protected afb a;
/*     */   protected axy b;
/*     */   @Nullable
/*     */   protected cbe c;
/*     */   protected double d;
/*     */   private final afn p;
/*     */   protected int e;
/*     */   protected int f;
/*  44 */   protected cee g = cee.a;
/*  45 */   protected cee h = cee.a;
/*     */   protected long i;
/*     */   protected long j;
/*     */   protected double k;
/*  49 */   protected float l = 0.5F;
/*     */   
/*     */   protected boolean m;
/*     */   
/*     */   protected long n;
/*     */   
/*     */   protected cbd o;
/*     */   private el q;
/*     */   private cbg r;
/*     */   
/*     */   public aiw(afb ☃, axy axy1) {
/*  60 */     this.a = ☃;
/*  61 */     this.b = axy1;
/*  62 */     this.p = ☃.a(ank.b);
/*  63 */     this.r = a();
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
/*     */   public el i() {
/*  75 */     return this.q;
/*     */   }
/*     */   
/*     */   protected abstract cbg a();
/*     */   
/*     */   public void a(double ☃) {
/*  81 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public float j() {
/*  85 */     return (float)this.p.e();
/*     */   }
/*     */   
/*     */   public boolean k() {
/*  89 */     return this.m;
/*     */   }
/*     */   
/*     */   public void l() {
/*  93 */     if (this.b.V() - this.n > 20L) {
/*  94 */       if (this.q != null) {
/*  95 */         this.c = null;
/*  96 */         this.c = b(this.q);
/*  97 */         this.n = this.b.V();
/*  98 */         this.m = false;
/*     */       } 
/*     */     } else {
/* 101 */       this.m = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final cbe a(double ☃, double d1, double d2) {
/* 107 */     return b(new el(☃, d1, d2));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cbe b(el ☃) {
/* 112 */     if (!b()) {
/* 113 */       return null;
/*     */     }
/*     */     
/* 116 */     if (this.c != null && !this.c.b() && ☃.equals(this.q)) {
/* 117 */       return this.c;
/*     */     }
/*     */     
/* 120 */     this.q = ☃;
/*     */     
/* 122 */     float f = j();
/* 123 */     this.b.A.a("pathfind");
/* 124 */     el el1 = new el(this.a);
/* 125 */     int i = (int)(f + 8.0F);
/*     */     
/* 127 */     axk axk = new ayl(this.b, el1.a(-i, -i, -i), el1.a(i, i, i), 0);
/* 128 */     cbe cbe1 = this.r.a(axk, this.a, this.q, f);
/* 129 */     this.b.A.e();
/* 130 */     return cbe1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cbe a(aer ☃) {
/* 135 */     if (!b()) {
/* 136 */       return null;
/*     */     }
/*     */     
/* 139 */     el el1 = new el(☃);
/* 140 */     if (this.c != null && !this.c.b() && el1.equals(this.q)) {
/* 141 */       return this.c;
/*     */     }
/* 143 */     this.q = el1;
/*     */     
/* 145 */     float f = j();
/* 146 */     this.b.A.a("pathfind");
/* 147 */     el el2 = (new el(this.a)).a();
/* 148 */     int i = (int)(f + 16.0F);
/*     */     
/* 150 */     axk axk = new ayl(this.b, el2.a(-i, -i, -i), el2.a(i, i, i), 0);
/* 151 */     cbe cbe1 = this.r.a(axk, this.a, ☃, f);
/* 152 */     this.b.A.e();
/* 153 */     return cbe1;
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2, double d3) {
/* 157 */     return a(a(☃, d1, d2), d3);
/*     */   }
/*     */   
/*     */   public boolean a(aer ☃, double d) {
/* 161 */     cbe cbe1 = a(☃);
/* 162 */     return (cbe1 != null && a(cbe1, d));
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable cbe ☃, double d) {
/* 166 */     if (☃ == null) {
/* 167 */       this.c = null;
/* 168 */       return false;
/*     */     } 
/* 170 */     if (!☃.a(this.c)) {
/* 171 */       this.c = ☃;
/*     */     }
/* 173 */     E_();
/* 174 */     if (this.c.d() <= 0) {
/* 175 */       return false;
/*     */     }
/*     */     
/* 178 */     this.d = d;
/* 179 */     cee cee1 = c();
/* 180 */     this.f = this.e;
/* 181 */     this.g = cee1;
/* 182 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cbe m() {
/* 187 */     return this.c;
/*     */   }
/*     */   
/*     */   public void d() {
/* 191 */     this.e++;
/*     */     
/* 193 */     if (this.m) {
/* 194 */       l();
/*     */     }
/*     */     
/* 197 */     if (p()) {
/*     */       return;
/*     */     }
/*     */     
/* 201 */     if (b()) {
/* 202 */       o();
/* 203 */     } else if (this.c != null && this.c.e() < this.c.d()) {
/* 204 */       cee cee1 = c();
/* 205 */       cee cee2 = this.c.a(this.a, this.c.e());
/* 206 */       if (cee1.c > cee2.c && !this.a.A && xq.c(cee1.b) == xq.c(cee2.b) && xq.c(cee1.d) == xq.c(cee2.d)) {
/* 207 */         this.c.c(this.c.e() + 1);
/*     */       }
/*     */     } 
/*     */     
/* 211 */     n();
/*     */     
/* 213 */     if (p()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 218 */     cee ☃ = this.c.a(this.a);
/* 219 */     el el1 = new el(☃);
/*     */     
/* 221 */     this.a.r().a(☃.b, this.b.a_(el1.b()).f() ? ☃.c : cbj.a(this.b, el1), ☃.d, this.d);
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
/*     */   protected void n() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void o() {
/* 243 */     cee ☃ = c();
/*     */ 
/*     */     
/* 246 */     int i = this.c.d();
/* 247 */     for (int j = this.c.e(); j < this.c.d(); j++) {
/* 248 */       if ((this.c.a(j)).b != Math.floor(☃.c)) {
/* 249 */         i = j;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     
/* 255 */     this.l = (this.a.H > 0.75F) ? (this.a.H / 2.0F) : (0.75F - this.a.H / 2.0F);
/* 256 */     cee cee1 = this.c.f();
/* 257 */     if (xq.e((float)(this.a.q - cee1.b + 0.5D)) < this.l && xq.e((float)(this.a.s - cee1.d + 0.5D)) < this.l && Math.abs(this.a.r - cee1.c) < 1.0D) {
/* 258 */       this.c.c(this.c.e() + 1);
/*     */     }
/*     */ 
/*     */     
/* 262 */     int k = xq.f(this.a.H);
/* 263 */     int m = xq.f(this.a.I);
/* 264 */     int n = k;
/* 265 */     for (int i1 = i - 1; i1 >= this.c.e(); i1--) {
/* 266 */       if (a(☃, this.c.a(this.a, i1), k, m, n)) {
/* 267 */         this.c.c(i1);
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 272 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cee ☃) {
/* 277 */     if (this.e - this.f > 100) {
/* 278 */       if (☃.g(this.g) < 2.25D) {
/* 279 */         q();
/*     */       }
/* 281 */       this.f = this.e;
/* 282 */       this.g = ☃;
/*     */     } 
/*     */     
/* 285 */     if (this.c != null && !this.c.b()) {
/* 286 */       cee cee1 = this.c.f();
/*     */       
/* 288 */       if (cee1.equals(this.h)) {
/* 289 */         this.i += k.b() - this.j;
/*     */       } else {
/* 291 */         this.h = cee1;
/* 292 */         double d = ☃.f(this.h);
/* 293 */         this.k = (this.a.cK() > 0.0F) ? (d / this.a.cK() * 1000.0D) : 0.0D;
/*     */       } 
/*     */       
/* 296 */       if (this.k > 0.0D && this.i > this.k * 3.0D) {
/* 297 */         this.h = cee.a;
/* 298 */         this.i = 0L;
/* 299 */         this.k = 0.0D;
/* 300 */         q();
/*     */       } 
/* 302 */       this.j = k.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 307 */     return (this.c == null || this.c.b());
/*     */   }
/*     */   
/*     */   public void q() {
/* 311 */     this.c = null;
/*     */   }
/*     */   
/*     */   protected abstract cee c();
/*     */   
/*     */   protected abstract boolean b();
/*     */   
/*     */   protected boolean r() {
/* 319 */     return (this.a.aq() || this.a.ax());
/*     */   }
/*     */   
/*     */   protected void E_() {
/* 323 */     if (this.c == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 328 */     for (int ☃ = 0; ☃ < this.c.d(); ☃++) {
/* 329 */       cbc cbc1 = this.c.a(☃);
/* 330 */       cbc cbc2 = (☃ + 1 < this.c.d()) ? this.c.a(☃ + 1) : null;
/*     */       
/* 332 */       blc blc = this.b.a_(new el(cbc1.a, cbc1.b, cbc1.c));
/* 333 */       bcs bcs = blc.c();
/*     */       
/* 335 */       if (bcs == bct.ed) {
/* 336 */         this.c.a(☃, cbc1.a(cbc1.a, cbc1.b + 1, cbc1.c));
/* 337 */         if (cbc2 != null && cbc1.b >= cbc2.b) {
/* 338 */           this.c.a(☃ + 1, cbc2.a(cbc2.a, cbc1.b + 1, cbc2.c));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract boolean a(cee paramcee1, cee paramcee2, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public boolean a(el ☃) {
/* 347 */     el el1 = ☃.b();
/* 348 */     return this.b.a_(el1).f(this.b, el1);
/*     */   }
/*     */   
/*     */   public cbd s() {
/* 352 */     return this.o;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 356 */     this.o.c(☃);
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 360 */     return this.o.e();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aiw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */